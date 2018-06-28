package net.person.dao;

/**
 * Created by admin on 2018/1/31.
 */

import net.person.model.PersonModel;

import java.util.List;

public interface PersonDao {
    //获取test表所有数据
    public List<PersonModel> getAllPerson();
}