package com.example.myprog.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bd_sttn", schema = "public")
@Getter
@Setter
@ToString
public class Product {
    @Column(name = "f_guid")
    private String f_guid;
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "f_id")
    private Long f_id;
    @Column(name = "f_tm")
    private String f_tm;
    @Column(name = "f_del")
    private int f_del;
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sysn")
    private Long sysn;
    @Column(name = "kmc")
    private Long kmc;
    @Column(name = "nmc")
    private String nmc;
    @Column(name = "kt")
    private Long kt;
    @Column(name = "nmt")
    private String nmt;
    @Column(name = "emk")
    private Double emk;
    @Column(name = "ed")
    private String ed;
    @Column(name = "kolm")
    private Integer kolm;
    @Column(name = "kole")
    private Double kole;
    @Column(name = "vb")
    private Double vb;
    @Column(name = "cena")
    private Double cena;
    @Column(name = "snds")
    private Integer snds;
    @Column(name = "sump")
    private Double sump;
    @Column(name = "sumnds")
    private Double sumnds;
    @Column(name = "sumit")
    private Double sumit;
    @Column(name = "pam")
    private Double pam;
    @Column(name = "sumam")
    private Double sumam;
    @Column(name = "dtv")
    private Date dtv;
    @Column(name = "vrv")
    private Integer vrv;
    @Column(name = "srr")
    private Integer srr;
    @Column(name = "sert")
    private String sert;
    @Column(name = "prc")
    private String prc;
    @Column(name = "kvc")
    private Integer kvc;
    @Column(name = "pav")
    private Integer pav;
    @Column(name = "pnc")
    private Double pnc;
    @Column(name = "sumnc")
    private Double sumnc;
    @Column(name = "cent")
    private String cent;
    @Column(name = "kpl")
    private String kpl;
    @Column(name = "nuk")
    private String nuk;
    @Column(name = "vcena")
    private String vcena;
    @Column(name = "vsump")
    private String vsump;
    @Column(name = "vsumnds")
    private String vsumnds;

}
