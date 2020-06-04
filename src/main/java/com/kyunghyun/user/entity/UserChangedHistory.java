package com.kyunghyun.user.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
@Entity
@Table(name = "user_changed_history")
public class UserChangedHistory {

    @Id
    @Column(name="user_no", nullable = false)
    private Long userNo;

    @Column(name="user_id", nullable = false)
    private String userId;

    @Column(name="user_name", nullable = false)
    private String userName;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="cellphone")
    private String cellphone;

    @Column(name="email")
    private String email;

    @Column(name="ci")
    private String ci;

    @Column(name="di")
    private String di;

    @Column(name="date_created", nullable = false)
    private Date dateCreated;

    @Column(name="create_ip", nullable = false)
    private String createIp;

    @Column(name="date_Updated", nullable = false)
    private Date dateUpdated;

    @Column(name="update_ip", nullable = false)
    private String updateIp;

    @Column(name="date_password_changed", nullable = false)
    private Date datePasswordChanged;

    @Column(name="use_yn", nullable = false)
    @ColumnDefault("Y")
    private String useYn;

}


