package com.example.demo.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FileBoardService;

@RestController
@RequestMapping("/fileBoard")
public class FileBoardRestController {

    @Autowired
    FileBoardService fileBoardService;

    private String fileUrl = "C:/Users/smhrd/Desktop/기업랩 과제/FileStorage/";

    @RequestMapping("/deleteFileJ/{b_no}")
    private void delFileJ(@PathVariable int b_no)
    {

        String filename = fileBoardService.fileDetail(b_no).getFilename();

        File deletedFile = new File(fileUrl+filename);
        if(deletedFile.exists())
        {
            if(deletedFile.delete())
            {
                System.out.println("로컬파일 삭제 성공");
            }
            else
            {
                System.out.println("로컬파일 삭제 실패");
            }
        }

        int row = fileBoardService.fileDelete(b_no);

        if(row > 0)
            System.out.println("file 삭제 성공");
    }
    
}
