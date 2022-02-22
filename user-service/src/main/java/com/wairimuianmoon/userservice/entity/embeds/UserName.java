package com.wairimuianmoon.userservice.entity.embeds;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserName {
    @Column(name = "firstname", nullable = false)
    private String fName;
    @Column(name = "lastname", nullable = false)
    private String lName;
}
