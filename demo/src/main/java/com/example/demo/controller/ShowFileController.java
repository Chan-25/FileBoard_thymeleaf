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

    @RequestMapping("/deleteFileJ/{b_no}")
    private void delFileJ(@PathVariable int b_no)
    {
        int row = fileBoardService.fileDelete(b_no);

        if(row > 0)
            System.out.println("file 삭제 성공");
    }
    
}
