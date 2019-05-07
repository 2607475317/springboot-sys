package com.w.springboot_sys.service.impl;

import com.w.springboot_sys.dao.TxPersonMapper;
import com.w.springboot_sys.model.TxPerson;
import com.w.springboot_sys.service.TxPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TxPersonServcieImpl implements TxPersonService {
    @Autowired
    private TxPersonMapper txPersonMapper;
    @Override

    @Cacheable(cacheNames = "1")
    public List<TxPerson> selectPersons() {
        return txPersonMapper.selectPersons();
    }
    @Override
    @Cacheable(cacheNames = "text")
    public TxPerson getPersonById(int pid) {
        return txPersonMapper.getPersonById(pid);
    }

    @Override
    public void updatePerson(TxPerson p) {
     txPersonMapper.updatePerosn(p);
    }

    @Override
    public void insert(TxPerson p) {
   txPersonMapper.insert(p);
    }

    @Override
    public void delete(int pid) {
   txPersonMapper.delete(pid);
    }

    @Override
    public TxPerson getPersonByUserPass(TxPerson person) {
        return txPersonMapper.getPersonByUserPass(person);
    }


}
