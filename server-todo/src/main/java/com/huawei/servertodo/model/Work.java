package com.huawei.servertodo.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="work")
public class Work implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="deadline")
    private Date deadline;

    @Column(name="status")
    private boolean status;

    @Column(name="masterId")
    private long masterId;

    @Column(name="createDate")
    private Date createDate;

    @Column(name="isDeleted")
    private boolean isDeleted;
}
