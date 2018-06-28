package net.person.service.impl;

import net.person.dao.PersonDao;
import net.person.model.PersonModel;
import net.person.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2018/1/31.
 */
@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    public PersonDao testDao;
    @Autowired
    public void setTestDao(PersonDao testDao) {
        this.testDao = testDao;
    }
    public List<PersonModel> getAllPerson() {
        return testDao.getAllPerson();
    }
}