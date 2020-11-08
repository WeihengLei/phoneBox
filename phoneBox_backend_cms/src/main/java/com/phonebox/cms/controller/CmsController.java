package com.phonebox.cms.controller;

import com.phonebox.cms.service.CmsService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDate;


@RestController
@RequestMapping("/cms")
public class CmsController {

    @Resource
    private CmsService cmsService ;

    @PostMapping("/test")
    public String test(@RequestParam String name) {
        return cmsService.test(name);
    }


    @GetMapping("/test1")
    @ResponseBody
    public String test1(
            @RequestParam String name,
            @RequestParam(required=false) Boolean showVersion,
            @RequestParam(required=false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date,
            @RequestParam(required=false) Boolean regen
    ) {
        return cmsService.test(name);
    }
}
