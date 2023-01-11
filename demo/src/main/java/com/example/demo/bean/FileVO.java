package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileVO {
  
  private int f_no; //파일번호
  private int b_no; //게시판 번호와 동기화
  private String filename;  //저장할 때
  private String fileoriginname;  //받아올 때 파일 이름
  private String fileurl;   //저장 및 불러올 경로
}