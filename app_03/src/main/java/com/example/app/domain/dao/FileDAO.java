package com.example.app.domain.dao;

import com.example.app.domain.vo.FileVO;
import com.example.app.mapper.FileMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FileDAO {
    private final FileMapper fileMapper;

    //    추가
    public void save(FileVO fileVO){
        fileMapper.insert(fileVO);
    }
    //    게시글 번호로 조회
    public List<FileVO> findByBoardNumber(Long boardNumber){
        return fileMapper.selectAll(boardNumber);
    }
    //    삭제
    public void deleteByBoardNumber(Long boardNumber){
        fileMapper.delete(boardNumber);
    }
}