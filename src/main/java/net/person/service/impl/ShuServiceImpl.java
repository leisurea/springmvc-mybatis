package net.person.service.impl;

import net.person.dao.ShuDao;
import net.person.model.ShuModel;
import net.person.service.ShuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2018/1/31.
 */
@Service
@Transactional
public class ShuServiceImpl implements ShuService {

    public ShuDao shuDao;

    @Autowired
    public void setTestDao(ShuDao shuDao) {
        this.shuDao = shuDao;
    }

    public List<ShuModel> getShus() {
        return shuDao.getShus();
    }

    public ShuModel getShu(long id) {
        return shuDao.getShu(id);
    }

    public int addBook(ShuModel shuModel) {
        return shuDao.addBook(shuModel);
    }

    public int updateBook(ShuModel shuModel) {
        return shuDao.updateBook(shuModel);
    }

    public int deteleBook(long id) {
        return shuDao.deleteBook(id);
    }
}