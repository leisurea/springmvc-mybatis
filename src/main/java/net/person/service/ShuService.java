package net.person.service;

import net.person.model.ShuModel;

import java.util.List;

/**
 * Created by admin on 2018/1/31.
 */
public interface ShuService {
    //获取test表所有数据
    public List<ShuModel> getShus();

    public ShuModel getShu(long id);

    public int addBook(ShuModel shuModel);

    public int updateBook(ShuModel shuModel);

    public int deteleBook(long id);
}
