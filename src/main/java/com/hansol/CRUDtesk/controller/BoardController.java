package com.hansol.CRUDtesk.controller;

import com.hansol.CRUDtesk.domain.BoardVO;
import com.hansol.CRUDtesk.domain.ResultVO;
import com.hansol.CRUDtesk.persistence.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class BoardController {
    private final BoardMapper boardMapper;
    @PostMapping("/board")
    public ResultVO addBoard(@RequestBody BoardVO boardVO){
        int result = boardMapper.insertBoard(boardVO);
        if(result>0){
            return new ResultVO(0, "success");
        }else{
            return new ResultVO(100, "fail");
        }
    }
    @GetMapping("/board/{id}")
    public BoardVO findOne(@PathVariable int id){
        return boardMapper.findOneBoard(id);
    }
    @GetMapping("/boards")
    public List<BoardVO> findAllBoard(){
        return boardMapper.findBoard();
    }
    @PutMapping("/board")
    public ResultVO modifiyBoard(@RequestBody BoardVO boardVO){
        int result = boardMapper.updateBoard(boardVO);
        if(result > 0){
            return new ResultVO(0,"success");
        }else{
            return new ResultVO(100, "fail");
        }
    }
    @DeleteMapping("/board")
    public ResultVO removeBoard(@RequestParam int id){
        int result=boardMapper.deleteBoard(id);
        if(result > 0){
            return new ResultVO(0, "success");
        }else{
            return new ResultVO(100, "fail");
        }
    }

}
