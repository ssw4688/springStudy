package com.example.app.service;

import com.example.app.domain.dao.BoardDAO;
import com.example.app.domain.dao.FileDAO;
import com.example.app.domain.vo.FileVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FileService {
    private final FileDAO fileDAO;

    //    추가
    public void register(FileVO fileVO){
        fileDAO.save(fileVO);
    }
    //    게시글 번호로 전체 조회
    public List<FileVO> showAll(Long boardNumber){
        return fileDAO.findByBoardNumber(boardNumber);
    }
    //    삭제
    public void remove(Long boardNumber){
        fileDAO.deleteByBoardNumber(boardNumber);
    }
}