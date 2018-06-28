package net.person.controller;

import com.google.gson.Gson;

import net.person.model.ShuModel;
import net.person.service.ShuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShuController {

    @Autowired
    public ShuService shuServiceImpl;

    @RequestMapping(value = "/getShu", method = RequestMethod.GET)
    public @ResponseBody
    String getShu(long id) {
        ShuModel shuModel = shuServiceImpl.getShu(id);
        return new Gson().toJson(shuModel);
    }

    /**
     * 返回json
     *
     * @return
     */
    @RequestMapping(value = "/getShus", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public @ResponseBody
    String getShus() {
        List<ShuModel> itemsList = shuServiceImpl.getShus();
        return new Gson().toJson(itemsList);
    }

    /**
     * 添加书
     *
     * @param name
     * @param number
     * @return
     */
    @RequestMapping(value = "/addShu", method = RequestMethod.GET)
    public @ResponseBody
    String addBook(String name, int number) {
        ShuModel shuModel = new ShuModel();
        shuModel.setName(name);
        shuModel.setNumber(number);
        int gg = shuServiceImpl.addBook(shuModel);
        return "success:" + gg;
    }

    /**
     * 添加书
     *
     * @param name
     * @param number
     * @return
     */
    @RequestMapping(value = "/updateShu", method = RequestMethod.GET)
    public @ResponseBody
    String updateBook(String name, int number, Long id) {
        ShuModel shuModel = new ShuModel();
        shuModel.setBookId(id);
        shuModel.setName(name);
        shuModel.setNumber(number);
        int gg = shuServiceImpl.updateBook(shuModel);
        return "success:" + gg;
    }

    @RequestMapping(value = "/deleteShu", method = RequestMethod.GET)
    public @ResponseBody
    String deleteBook(long id) {
        int gg = shuServiceImpl.deteleBook(id);
        return "success:" + gg;
    }

}
