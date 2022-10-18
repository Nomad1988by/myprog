package com.example.myprog.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bdzttn", schema = "public")
@Getter
@Setter
@ToString
public class Invoice {
    @Column(name = "f_guid")
    private String f_guid;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NonNull
    private Long id;
    @Column(name = "f_tm")
    private String f_tm;
    @Column(name = "f_del")
    private String f_del;

    @Column(name = "sysn")
    @NonNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long sysn;
    @Column(name = "td")
    private Float td;
    @Column(name = "nd")
    private Float nd;
    @Column(name = "dt")
    private Date dt;
    @Column(name = "kpl")
    private String kpl;
    @Column(name = "kpp")
    private String kpp;
    @Column(name = "pd")
    private Float pd;
    @Column(name = "okpo")
    private Integer okpo;
    @Column(name = "unn")
    private Integer unn;
    @Column(name = "atp")
    private String atp;
    @Column(name = "avt")
    private String avt;
    @Column(name = "vod")
    private String vod;
    @Column(name = "keks")
    private Integer keks;
    @Column(name = "eks")
    private String eks;
    @Column(name = "sump")
    private Float sump;
    @Column(name = "sumt")
    private Float sumt;
    @Column(name = "sumd")
    private Float sumd;
    @Column(name = "sumam")
    private Float sumam;
    @Column(name = "nsv")
    private Integer nsv;
    @Column(name = "ksmen")
    private Integer ksmen;
    @Column(name = "ndov")
    private Integer ndov;
    @Column(name = "dtdov")
    private Date dtdov;
    @Column(name = "fiodov")
    private String fiodov;
    @Column(name = "nr")
    private Integer nr;
    @Column(name = "katp")
    private Integer katp;
    @Column(name = "tabn")
    private Integer tabn;
    @Column(name = "ksk")
    private Integer ksk;
    @Column(name = "kavt")
    private String kavt;
    @Column(name = "npr")
    private String npr;
    @Column(name = "sumnds")
    private Float sumnds;
    @Column(name = "sumop")
    private Float sumop;
    @Column(name = "kolm")
    private Integer kolm;
    @Column(name = "vb")
    private Float vb;
    @Column(name = "sumnc")
    private Float sumnc;
    @Column(name = "pcs")
    private String pcs;
    @Column(name = "sum10")
    private Float sum10;
    @Column(name = "sum20")
    private Float sum20;
    @Column(name = "nds10")
    private Float nds10;
    @Column(name = "nds20")
    private Float nds20;
    @Column(name = "numpl")
    private Integer numpl;
    @Column(name = "kdetd")
    private Integer kdetd;
    @Column(name = "sumst")
    private Float sumst;
    @Column(name = "vr")
    private String vr;
    @Column(name = "ps")
    private String ps;
    @Column(name = "dtv")
    private Date dtv;
    @Column(name = "srop")
    private Integer srop;
    @Column(name = "kv")
    private Integer kv;
    @Column(name = "kurs")
    private Integer kurs;
    @Column(name = "cpt")
    private Integer cpt;
    @Column(name = "vsump")
    private Integer vsump;
    @Column(name = "vsumt")
    private Integer vsumt;
    @Column(name = "vsumd")
    private Integer vsumd;
    @Column(name = "v_sumnds")
    private Integer v_sumnds;
    @Column(name = "v_sum10")
    private Float v_sum10;
    @Column(name = "v_sum20")
    private Float v_sum20;
    @Column(name = "v_nds10")
    private Float v_nds10;
    @Column(name = "v_nds20")
    private Float v_nds20;
    @Column(name = "snscp")
    private Float snscp;
    @Column(name = "vsumop")
    private Float vsumop;
    @Column(name = "time")
    private String time;
    @Column(name = "cr_kpl")
    private String cr_kpl;
    @Column(name = "cr_kpp")
    private String cr_kpp;
    @Column(name = "cr_user")
    private String cr_user;
}
