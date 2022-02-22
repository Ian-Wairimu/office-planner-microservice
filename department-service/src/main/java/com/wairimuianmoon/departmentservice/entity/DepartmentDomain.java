package com.wairimuianmoon.departmentservice.entity;

import com.wairimuianmoon.departmentservice.entity.embeds.DepartmentDetails;
import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "department_service")
public class DepartmentDomain {
    @SequenceGenerator(
            name = "department_sequence",
            sequenceName = "department_sequence"
    )
    @Column(name = "department_id")
    private @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_sequence") Long depId;
    @Column(name = "department_name")
    private String depName;
    @Embedded
    private DepartmentDetails departmentDetails;
}
