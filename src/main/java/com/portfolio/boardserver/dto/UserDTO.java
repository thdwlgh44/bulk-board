package com.portfolio.boardserver.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class UserDTO {

    public static boolean hasNullDataBeforeRegister(UserDTO userDTO) {
        return userDTO.getUserID() == null || userDTO.getPassword() == null || userDTO.getNickName() == null;
    }

    public enum Status {
        DEFAULT, ADMIN, DELETED
    }

    private int id;
    private String userID;
    private String password;
    private String nickName;
    private boolean isAdmin; //관리자 식별
    private Date createTime;
    private boolean isWithDraw; //탈퇴여부
    private Status status; //회원
    private Date updateTime;
}
