package com.portfolio.boardserver.service;

import com.portfolio.boardserver.controller.PostSearchController;
import com.portfolio.boardserver.dto.PostDTO;
import com.portfolio.boardserver.dto.request.PostSearchRequest;

import java.util.List;

public interface PostSearchService {
    List<PostDTO> getPosts(PostSearchRequest postSearchRequest);
}
