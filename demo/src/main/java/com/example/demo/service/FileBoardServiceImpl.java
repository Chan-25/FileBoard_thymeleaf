package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.FileBoardVO;
import com.example.demo.bean.FileVO;
import com.example.demo.mapper.FileBoardMapper;

@Service
public class FileBoardServiceImpl implements FileBoardService {

    @Autowired
    FileBoardMapper fileboardmapper;
    
    @Override
    public List<FileBoardVO> getFileBoardList() {
        return fileboardmapper.getFileBoardList();
    }

    @Override
    public FileBoardVO fileBoardDetail(int b_no) {
        return fileboardmapper.fileBoardDetail(b_no);
    }

    @Override
    public int fileBoardInsert(FileBoardVO fileBoard) {
        return fileboardmapper.fileBoardInsert(fileBoard);
    }

    @Override
    public int fileBoardUpdate(FileBoardVO fileBoard) {
        return fileboardmapper.fileBoardUpdate(fileBoard);
    }

    @Override
    public int fileBoardDelete(int bno) {
        return fileboardmapper.fileBoardDelete(bno);
    }

    //파일 업로드 추가
    @Override
    public int fileInsert(FileVO file) {
        return fileboardmapper.fileInsert(file);
    }

    //파일 다운로드 추가
    @Override
    public FileVO fileDetail(int b_no) {
        return fileboardmapper.fileDetail(b_no);
    }

    @Override
    public int fileDelete(int b_no) {
        return fileboardmapper.fileDelete(b_no);
    }

    @Override
    public int fileUpdate(FileVO file) {
        return fileboardmapper.fileUpdate(file);
    }

    @Override
    public FileVO confirmFile(int b_no) {
        return fileboardmapper.confirmFile(b_no);
    }
    
}
