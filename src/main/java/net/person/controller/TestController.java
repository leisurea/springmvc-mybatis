package net.person.controller;

import net.person.model.TestModel;
import net.person.service.TestService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 测试springMVC映射
 * Created by admin on 2018/1/31.
 */
@Controller
//@RequestMapping("/home")
public class TestController {
    //添加一个日志器
    public TestService testServiceImpl;

    @Autowired
    public void setTestService(TestService testServiceImpl) {
        this.testServiceImpl = testServiceImpl;
    }

    // 首页
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        System.out.println("index");
        return "index";
    }

    //映射一个action
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String editItemsQuery(Model model, String username, String password) throws Exception {
        List<TestModel> itemsList = testServiceImpl.getAllTest();
        System.out.println(itemsList.size() + " username:" + username + " password:" + password);
        model.addAttribute("username", username);
        return "test";
    }
}
