package com.example.load.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "s3m_data_load_frame_1_2023")
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
//@IdClass(PKS3MDataLoadFrameIdClass.class)
public class S3MDataLoadFrame1 implements Serializable {
    private static final long serialVersionUID = -5419345600310440297L;
    @EmbeddedId
    private PKS3DataLoadFrame1 id;

    @Column(name = "device_id")
    private Long deviceId;

    @Column(name = "uab")
    private Double uab;

    @Column(name = "ubc")
    private Double ubc;

    @Column(name = "uca")
    private Double uca;

    @Column(name = "ull")
    private Double ull;

    @Column(name = "uan")
    private Double uan;

    @Column(name = "ubn")
    private Double ubn;

    @Column(name = "ucn")
    private Double ucn;

    @Column(name = "uln")
    private Double uln;

    @Column(name = "ia")
    private Double ia;

    @Column(name = "ib")
    private Double ib;

    @Column(name = "ic")
    private Double ic;

    @Column(name = "i_n")
    private Double in;

    @Column(name = "ig")
    private Double ig;

    @Column(name = "iavg")
    private Double iavg;

    @Column(name = "pa")
    private Double pa;

    @Column(name = "pb")
    private Double pb;

    @Column(name = "pc")
    private Double pc;

    @Column(name = "p_total")
    private Double pTotal;

    @Column(name = "qa")
    private Double qa;

    @Column(name = "qb")
    private Double qb;

    @Column(name = "qc")
    private Double qc;

    @Column(name = "q_total")
    private Double qTotal;

    @Column(name = "sa")
    private Double sa;

    @Column(name = "sb")
    private Double sb;

    @Column(name = "sc")
    private Double sc;

    @Column(name = "s_total")
    private Double sTotal;

    @Column(name = "pfa")
    private Double pfa;

    @Column(name = "pfb")
    private Double pfb;

    @Column(name = "pfc")
    private Double pfc;

    @Column(name = "pfavg")
    private Double pfavg;

    @Column(name = "f")
    private Double f;

    @Column(name = "ep")
    private Integer ep;

    @Column(name = "ep_r")
    private Integer epR;

    @Column(name = "ep_dr")
    private Integer epDr;

    @Column(name = "ep_drr")
    private Integer epDrr;

    @Column(name = "eq")
    private Integer eq;

    @Column(name = "eq_r")
    private Integer eqR;

    @Column(name = "eq_dr")
    private Integer eqDr;

    @Column(name = "eq_drr")
    private Integer eqDrr;

    @Column(name = "es")
    private Integer es;

    @Column(name = "es_r")
    private Integer esR;

    @Column(name = "es_dr")
    private Integer esDr;

    @Column(name = "es_drr")
    private Integer esDrr;

    @Column(name = "t1")
    private Double t1;

    @Column(name = "t2")
    private Double t2;

    @Column(name = "t3")
    private Double t3;

    @Column(name = "command_data1")
    private Integer commandData1;

    @Column(name = "command_data2")
    private Integer commandData2;

    @Column(name = "command_data3")
    private Integer commandData3;

    @Column(name = "command_data4")
    private Integer commandData4;

    @Column(name = "command_data5")
    private Integer commandData5;

    @Column(name = "command_data6")
    private Integer commandData6;

    @Column(name = "thd_ia")
    private Double thdIa;

    @Column(name = "thd_ib")
    private Double thdIb;

    @Column(name = "thd_ic")
    private Double thdIc;

    @Column(name = "thd_in")
    private Double thdIn;

    @Column(name = "thd_ig")
    private Double thdIg;

    @Column(name = "thd_vab")
    private Double thdVab;

    @Column(name = "thd_vbc")
    private Double thdVbc;

    @Column(name = "thd_vca")
    private Double thdVca;

    @Column(name = "thd_vll")
    private Double thdVll;

    @Column(name = "thd_van")
    private Double thdVan;

    @Column(name = "thd_vbn")
    private Double thdVbn;

    @Column(name = "thd_vcn")
    private Double thdVcn;

    @Column(name = "thd_vln")
    private Double thdVln;

    @Column(name = "sent_date")
    private Timestamp sentDate;


}
