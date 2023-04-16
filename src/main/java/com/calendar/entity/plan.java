package com.calendar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Getter
@Setter
public class plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "planCd")
    private int plan_code;

    @Column(name = "groupCd")
    private int group_code;

    @Column(name = "memberCd")
    private int member_code;

    @Column
    private String title;

    @Column
    private String memo;
    @Column(name = "startDt")
    private Date start_date;

    @Column(name = "endDt")
    private Date end_date;

    @Column(name = "alarmYn")
    private String alarm_use;

    @Column(name = "planTp")
    private String plan_type;

    @Column(name = "planPrt")
    private String plan_priority;

    @Column(name = "planState")
    private String plan_state;
}
