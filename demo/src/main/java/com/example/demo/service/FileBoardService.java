package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.FileBoardVO;
import com.example.demo.bean.FileVO;

public interface FileBoardService {

    List<FileBoardVO> getFileBoardList();
    FileBoardVO fileBoardDetail(int b_no);
    int fileBoardInsert(FileBoardVO fileBoard);
    int fileBoardUpdate(FileBoardVO fileBoard);
    int fileBoardDelete(int bno);
    //파일 업로드 메서드 추가
    int fileInsert(FileVO file);
    //파일 다운로드 메서드 추가
    FileVO fileDetail(int b_no);
    int fileDelete(int b_no);
    int fileUpdate(FileVO file);
}
