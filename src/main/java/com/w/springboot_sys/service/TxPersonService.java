package com.w.springboot_sys.service;

import com.w.springboot_sys.model.TxPerson;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional//事物注解
public interface TxPersonService {

    public List<TxPerson> selectPersons();
    public TxPerson getPersonById(int pid);
    //修改
    public void updatePerson(TxPerson p);
    //添加
    public void insert(TxPerson p);

    //删除
    public void delete(int pid);
    //登录
    public TxPerson getPersonByUserPass(TxPerson person);


}
