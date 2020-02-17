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
    private Long id;

    @Column(name="username", length = 15, nullable = false)
    private String username;

    @Column(name="password", length = 255, nullable = false)
    private String password;

    @Column(name="password_expired", length = 1, nullable = false )
    @ColumnDefault("0")
    private int passwordExpired;

    @Column(name="create_ip", length = 255, nullable = false)
    private String createIp;

    @Column(name="date_created", length = 255, nullable = false)
    private Date dateCreated;

    @Column(name="last_password_changed", nullable = false)
    private Date lastPasswordChanged;

    @Column(name="last_update_ip", length = 255, nullable = false)
    private String lastUpdateIp;

    @Column(name="lastUpdated",nullable = false)
    private String lastUpdated;

}


