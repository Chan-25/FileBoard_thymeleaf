package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FileBoardService;

@RestController
@RequestMapping("/fileBoard")
public class ShowFileController {

    @Autowired
    FileBoardService fileBoardService;

    @RequestMapping("/showFileName/{b_no}")
    private String showFileName(@PathVariable int b_no)
    {
        if(fileBoardService.confirmFile(b_no) != null)
        {
            return fileBoardService.fileDetail(b_no).getFilename();
        }
        return null;
    }
    
}
