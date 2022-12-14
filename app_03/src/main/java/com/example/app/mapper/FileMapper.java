package com.example.app.mapper;

import com.example.app.domain.vo.FileVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileMapper {
// 추가
    public int insert(FileVO fileVO);
// 게시글 번호로 전체 조회
    public List<FileVO> selectAll(Long boardNumber);
// 삭제
    public int delete(Long boardNumber);
}
