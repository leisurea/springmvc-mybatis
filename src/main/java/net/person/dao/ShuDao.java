package net.person.dao;

/**
 * Created by admin on 2018/1/31.
 */

import net.person.model.ShuModel;

import java.util.List;

public interface ShuDao {
    //获取test表所有数据
    public List<ShuModel> getShus();

    public ShuModel getShu(long id);

    public int addBook(ShuModel shuModel);

    public int updateBook(ShuModel shuModel);

    public int deleteBook(long id);
}