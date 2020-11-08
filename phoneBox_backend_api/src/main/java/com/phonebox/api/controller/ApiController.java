package com.phonebox.api.controller;

import com.phonebox.api.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.annotation.Resource;
import java.time.LocalDate;


@RestController
@RequestMapping("/api")
public class ApiController {

    @Resource
    private ApiService apiService ;

    @PostMapping("/test")
    public String test(@RequestParam String name) {
        return apiService.test(name);
    }


    @GetMapping("/test1")
    @ResponseBody
    public String test1(
            @RequestParam String name,
            @RequestParam(required=false) Boolean showVersion,
            @RequestParam(required=false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date,
            @RequestParam(required=false) Boolean regen
    ) {
        return apiService.test(name);
    }
}
