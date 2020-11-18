package com.gdyakj.bdtg.controller;

import com.gdyakj.bdtg.bean.InfoMessage;
import com.gdyakj.bdtg.bean.PageResult;
import com.gdyakj.bdtg.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DataController {

    @Autowired
    private DataService dataService;

    @ResponseBody
    @PostMapping("/save")
    public boolean saveData(@RequestBody InfoMessage infoMessage) {
        try {
            dataService.saveData(infoMessage);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    @ResponseBody
    @GetMapping("/pageInfo")
    public PageResult pageInfo(@RequestParam(defaultValue = "15") int pageSize, @RequestParam(defaultValue = "1") int page) {
        return dataService.pageInfo(pageSize, page);
    }


    @GetMapping("/zhixianyun")
    public String toRegister() {
        return "1";
    }

    @GetMapping("/weibao")
    public String toIndex() {
        return "2";
    }

    @GetMapping("/mzhixianyun")
    public String toTest() {
        return "3";
    }

    @GetMapping("/mweibao")
    public String toAddSuccess() {
        return "4";
    }


    @GetMapping("/orderInfo")
    public String orderInfo() {
        return "table";
    }

}
