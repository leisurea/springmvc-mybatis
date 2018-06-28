package net.person.controller;

import com.google.gson.Gson;

import net.person.model.PersonModel;
import net.person.model.TestModel;
import net.person.service.PersonService;
import net.person.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@RequestMapping("/home")
public class TestController {

    @Autowired
    public TestService testServiceImpl;
    @Autowired
    public PersonService personServiceImpl;

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

    /**
     * 返回json
     *
     * @return
     */
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public @ResponseBody
    String getAllLists() {
        List<TestModel> itemsList = testServiceImpl.getAllTest();
        return new Gson().toJson(itemsList);
    }

    /**
     * 返回json
     *
     * @return
     */
    @RequestMapping(value = "/getPersons", method = RequestMethod.GET)
    public @ResponseBody
    String getPersons() {
        List<PersonModel> itemsList = personServiceImpl.getAllPerson();
        return new Gson().toJson(itemsList);
    }
}
