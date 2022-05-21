package com.hansol.CRUDtesk.persistence;

import com.hansol.CRUDtesk.domain.BoardVO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;

@Mapper
@Repository
public interface BoardMapper {
    @Insert({"<script>",
            "INSERT INTO board(title, content)",
            "VALUES(#{title}, #{content})",
            "</script>"
            })
    int insertBoard(BoardVO boardVO);

    @Select({"<script>",
            "SELECT * from board",
            "order by id desc",
            "</script>"
            })
    List<BoardVO> findBoard();

    @Select({"<script>",
            "SELECT * from board",
            "where id = #{id}",
            "</script>"})
    BoardVO findOneBoard(int id);

    @Update({"<script>",
            "UPDATE board",
            "<trim prefix='set' suffixOverrides=','>",
            "<if test='title != null'>title = #{title},</if>",
            "<if test='content != null'>content = #{content},</if>",
            "</trim>",
            "WHERE id = #{id}",
            "</script>"})
    int updateBoard(BoardVO boardVO);

    @Delete({"<script>",
            "DELETE FROM board",
            "WHERE id=#{id}",
            "</script>"})
    int deleteBoard(int id);

}
