package com.kyunghyun.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserChangedHistoryDto {
    private Long userNo;
    private String userId;
    private String userName;
    @JsonIgnore
    private String password;
    private String cellphone;
    private String email;
    @JsonIgnore
    private String ci;
    @JsonIgnore
    private String di;
    private Date dateCreated;
    @JsonIgnore
    private String createIp;
    private Date dateUpdated;
    @JsonIgnore
    private String updateIp;
    private Date datePasswordChanged;
    @JsonIgnore
    private String useYn;
}
