package com.kyunghyun.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import java.util.Date;

//@Data  //끝판왕 @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
//@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자
//@RequiredArgsConstructor //final이나 @NonNull인 필드 값만 파라미터로 받는 생성자
@NoArgsConstructor //파라미터가 없는 기본 생성자를 생성
@Getter
@Setter
@ToString
public class UserDto {
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
