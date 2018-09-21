package com.bdm.bpmshore.bdm.controller;


import com.bdm.bpmshore.bdm.domain.Document;
import com.bdm.bpmshore.bdm.service.SplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/bpmshore/spl")
public class controller {

    @Autowired
    private SplService splService;

    @GetMapping("/all")
    public ArrayList<Document> getAll(){
        return new ArrayList<Document>();
    }

    @PostMapping("add")
    public  String addSPl(@RequestBody String jsonStrong){
        return jsonStrong;
    }
}
