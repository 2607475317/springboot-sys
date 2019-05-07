package com.w.springboot_sys.dao;

import com.w.springboot_sys.model.TxPerson;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;


public interface TxPersonMapper {
    //查询所有
    @Select("select * from tx_person")
    public List<TxPerson> selectPersons();

    @Select("select * from tx_person where pid = #{pid}")
    public TxPerson getPersonById(int pid);

    //增加
    @Options(useGeneratedKeys = true, keyProperty = "pid")//设置主键自增
    @Insert("insert into tx_person(pid, username ,password,pname, pAddr, gender, birth)" +
            "values(#{pid},#{username},#{password},#{pname},#{pAddr},#{gender},#{birth})")
    public void insert(TxPerson p);

    //修改
    @Update("update  tx_person set  username = #{username} " +
            ",password = #{password}" +
            ",pname = #{pname}, " +
            "pAddr = #{pAddr}, " +
            "gender = #{gender}, " +
            "birth = #{birth}" +
            "where pid = #{pid}")
    public void updatePerosn(TxPerson p);
    //删除
    @Delete("delete from tx_person where pid = #{pid}")
    public void delete(int pid);
   //登录
    @Select("select * from tx_person where username=#{username} and password=#{password}")
    public TxPerson getPersonByUserPass(TxPerson person);


}
