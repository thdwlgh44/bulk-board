package com.portfolio.boardserver.service;

import com.portfolio.boardserver.dto.UserDTO;

public interface UserService {

    //회원가입
    void register(UserDTO userProfile);

    //로그인
    UserDTO login(String id, String password);

    //id 중복체크
    boolean isDuplicatedId(String id);

    //유저 정보 조회
    UserDTO getUserInfo(String userId);

    //비밀번호 수정
    void updatePassword(String id, String beforePassword, String afterPassword);

    //아이디 삭제
    void deleteId(String id, String password);
}
