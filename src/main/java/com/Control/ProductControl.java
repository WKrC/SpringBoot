package com.Control;

import com.bean.ProductKey;
import com.service.ServiceImpl.ProductServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/product")
public class ProductControl {
    private static final Logger = LoggerFactory.
    @Autowired
    private ProductServiceImpl productServiceImpl;
    @ResponseBody
    @RequestMapping(value = "/select", produces = {"application/json;charset=UTF-8"})
    public String findAllUser(){
        String one = productServiceImpl.findOne(3).toString();
        return one;
    }
    @ResponseBody
    @RequestMapping(value = "/one", produces = {"application/json;charset=UTF-8"})
    public Object one(){
        return "Hello World!";
    }
}
