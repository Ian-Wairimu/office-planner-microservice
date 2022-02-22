package com.wairimuianmoon.departmentservice.entity.embeds;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDetails {
    @Column(name = "department_location")
    private String depLocation;
    @Column(name = "department_address")
    private String depAddress;
    @Column(name = "department_website")
    private String depWeb;
}
