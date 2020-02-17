package com.kyunghyun.user.dto;

import lombok.Data;
import java.util.Date;

@Data
public class UserResDto {
    private Long id;
    private String username;
    private String password;
    private int passwordExpired;
    private String createIp;
    private Date dateCreated;
    private Date lastPasswordChanged;
    private String lastUpdateIp;
    private String lastUpdated;
}
