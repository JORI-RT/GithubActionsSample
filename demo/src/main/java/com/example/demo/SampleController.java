package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1")
@RestController
@RequiredArgsConstructor
public class SampleController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/hello")
    public String hello() {
        String sql = "select * from hello where word='hello'";
        return (String) jdbcTemplate.queryForList(sql).get(0).get("word");
    }

}
