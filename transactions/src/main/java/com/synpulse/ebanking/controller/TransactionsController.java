package com.synpulse.ebanking.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/transactions")
public class TransactionsController {


    @GetMapping("/list")
    @PreAuthorize("query")
    public Object rs(HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
        map.put("测试","执行成功");
        return map;
    }
}
