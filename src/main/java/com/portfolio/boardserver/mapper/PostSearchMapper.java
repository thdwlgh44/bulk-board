package com.portfolio.boardserver.mapper;

import com.portfolio.boardserver.dto.PostDTO;
import com.portfolio.boardserver.dto.request.PostSearchRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostSearchMapper {
    public List<PostDTO> selectPosts(PostSearchRequest postSearchRequest);
}
