package com.example.app.service;

import com.example.app.domain.vo.FileVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class FileServiceTest {
    @Autowired
    private FileService fileService;

    @Test
    public void saveTest(){
        FileVO fileVO = new FileVO();
        fileVO.setFileName("day01.txt");
        fileVO.setFileSize(30L);
        fileVO.setFileUploadPath("test");
        fileVO.setFileUuid("abc111");
        fileVO.setBoardNumber(227L);

        fileService.register(fileVO);
    }

    @Test
    public void findByBoardNumberTest(){
        fileService.showAll(227L).stream().map(FileVO::toString).forEach(log::info);
    }

    @Test
    public void deleteByBoardNumberTest(){
        fileService.remove(51L);
    }
}