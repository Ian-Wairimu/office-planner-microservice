package com.wairimuianmoon.userservice.entity.embeds;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserPassword {
    @Column(name = "user_password", nullable = false)
    private String userPassword;
    @Transient
    private String userConfirmationPassword;
}
