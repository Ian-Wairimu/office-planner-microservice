package com.wairimuianmoon.bookingservice.entity;

import com.wairimuianmoon.bookingservice.entity.embeds.UserGender;
import com.wairimuianmoon.bookingservice.entity.embeds.UserName;
import com.wairimuianmoon.bookingservice.entity.embeds.UserPassword;

import javax.persistence.*;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence")
    @Column(name = "user_id")
    private Long userId;
    @Embedded
    private UserName userName;
    @Enumerated
    private UserGender gender;
    @Column(name = "user_email")
    private String userEmail;
    @Embedded
    private UserPassword userPassword;
}
