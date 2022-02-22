package com.wairimuianmoon.bookingservice.entity.embeds;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserPassword {
    @Column(name = "user_password")
    private String userPassword;
    @Transient
    private String confirmationPassword;
}
