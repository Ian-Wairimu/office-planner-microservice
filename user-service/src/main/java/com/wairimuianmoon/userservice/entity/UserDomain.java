package com.wairimuianmoon.userservice.entity;

import com.wairimuianmoon.userservice.entity.embeds.UserGender;
import com.wairimuianmoon.userservice.entity.embeds.UserName;
import com.wairimuianmoon.userservice.entity.embeds.UserPassword;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_service")
public class UserDomain extends RepresentationModel<UserDomain> {
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence"
    )
    @Column(name = "user_id")
    private @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence") Long userId;
    @Embedded
    private UserName userName;
    @Enumerated
    private UserGender userGender;
    @Column(name = "user_email")
    private String userEmail;
    @Embedded
    private UserPassword userPassword;
}
