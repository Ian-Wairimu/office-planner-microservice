package com.wairimuianmoon.bookingservice.entity.embeds;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserName {
    @Column(name = "firstname")
    private String fName;
    @Column(name = "lastName")
    private String lName;
}
