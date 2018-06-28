package net.person.service;

import net.person.model.PersonModel;

import java.util.List;

/**
 * Created by admin on 2018/1/31.
 */
public interface PersonService {
    //获取test表所有数据
    public List<PersonModel> getAllPerson();
}
