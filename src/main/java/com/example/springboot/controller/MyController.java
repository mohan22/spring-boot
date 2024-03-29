package com.example.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MyController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/data")
    public List<Map<String, Object>> getData() {
        List<Map<String, Object>> data = jdbcTemplate.queryForList("select * from playground.student");
        return data;
    }
}
