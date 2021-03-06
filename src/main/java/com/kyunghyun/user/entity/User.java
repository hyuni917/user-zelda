package com.kyunghyun.user.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name="date_created", columnDefinition = "datetime default CURRENT_TIMESTAMP", nullable = false, insertable=false, updatable=false)
    private Date dateCreated;

    @Column(name="create_ip", nullable = false)
    private String createIp;

    @Column(name="date_Updated", columnDefinition = "datetime default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP", nullable = false, insertable=false, updatable=false)
    private Date dateUpdated;

    @Column(name="update_ip", nullable = false)
    private String updateIp;

    @Column(name="date_password_changed", nullable = false, insertable=false)
    private Date datePasswordChanged;

    @Column(name="use_yn", nullable = false, insertable=false)
    @ColumnDefault("Y")
    private String useYn;

}


