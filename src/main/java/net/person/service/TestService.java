package net.person.service;

import net.person.model.TestModel;
import java.util.List;

/**
 * 现在跟Dao内容一样，但可以用来反转控制之类的
 * Created by admin on 2018/1/31.
 */
public interface TestService {
    //获取test表所有数据
    public List<TestModel> getAllTest();
}
