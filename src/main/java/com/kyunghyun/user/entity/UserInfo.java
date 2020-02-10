package com.kyunghyun.user.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seq;

    @Column(length = 100, nullable = false)
    private String id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 1, nullable = false)
    private String status;

    @Column(nullable = false)
    private Date create_date;

    @Column(nullable = false)
    private Date update_date;

    @Builder
    public UserInfo(Long seq, String id, String name, String status, Date create_date , Date update_date) {
        this.seq = seq;
        this.id = id;
        this.name = name;
        this.status = status;
        this.create_date = create_date;
        this.update_date = update_date;
    }
}


