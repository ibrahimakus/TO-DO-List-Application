package com.huawei.servertodo.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="user_work")
public class UserWork implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "work_id")
    private Long work_id;

    @Column(name="startDate")
    private Date startDate;

    @Column(name="endDate")
    private Date endDate;

}
