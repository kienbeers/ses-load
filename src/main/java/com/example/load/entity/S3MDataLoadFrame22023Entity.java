package com.example.load.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "s3m_data_load_frame_2_2023", schema = "ses", catalog = "")
@Data
@NoArgsConstructor
public class S3MDataLoadFrame22023Entity implements Serializable {
    private static final long serialVersionUID = -5419345600310440297L;
    @EmbeddedId
    private S3MDataLoadFrame22023EntityPK id;
    @Basic
    @Column(name = "IA_H1", nullable = true, precision = 0)
    private Double iaH1;
    @Basic
    @Column(name = "IA_H2", nullable = true, precision = 0)
    private Double iaH2;
    @Basic
    @Column(name = "IA_H3", nullable = true, precision = 0)
    private Double iaH3;
    @Basic
    @Column(name = "IA_H4", nullable = true, precision = 0)
    private Double iaH4;
    @Basic
    @Column(name = "IA_H5", nullable = true, precision = 0)
    private Double iaH5;
    @Basic
    @Column(name = "IA_H6", nullable = true, precision = 0)
    private Double iaH6;
    @Basic
    @Column(name = "IA_H7", nullable = true, precision = 0)
    private Double iaH7;
    @Basic
    @Column(name = "IA_H8", nullable = true, precision = 0)
    private Double iaH8;
    @Basic
    @Column(name = "IA_H9", nullable = true, precision = 0)
    private Double iaH9;
    @Basic
    @Column(name = "IA_H10", nullable = true, precision = 0)
    private Double iaH10;
    @Basic
    @Column(name = "IA_H11", nullable = true, precision = 0)
    private Double iaH11;
    @Basic
    @Column(name = "IA_H12", nullable = true, precision = 0)
    private Double iaH12;
    @Basic
    @Column(name = "IA_H13", nullable = true, precision = 0)
    private Double iaH13;
    @Basic
    @Column(name = "IA_H14", nullable = true, precision = 0)
    private Double iaH14;
    @Basic
    @Column(name = "IA_H15", nullable = true, precision = 0)
    private Double iaH15;
    @Basic
    @Column(name = "IA_H16", nullable = true, precision = 0)
    private Double iaH16;
    @Basic
    @Column(name = "IA_H17", nullable = true, precision = 0)
    private Double iaH17;
    @Basic
    @Column(name = "IA_H18", nullable = true, precision = 0)
    private Double iaH18;
    @Basic
    @Column(name = "IA_H19", nullable = true, precision = 0)
    private Double iaH19;
    @Basic
    @Column(name = "IA_H20", nullable = true, precision = 0)
    private Double iaH20;
    @Basic
    @Column(name = "IA_H21", nullable = true, precision = 0)
    private Double iaH21;
    @Basic
    @Column(name = "IA_H22", nullable = true, precision = 0)
    private Double iaH22;
    @Basic
    @Column(name = "IA_H23", nullable = true, precision = 0)
    private Double iaH23;
    @Basic
    @Column(name = "IA_H24", nullable = true, precision = 0)
    private Double iaH24;
    @Basic
    @Column(name = "IA_H25", nullable = true, precision = 0)
    private Double iaH25;
    @Basic
    @Column(name = "IA_H26", nullable = true, precision = 0)
    private Double iaH26;
    @Basic
    @Column(name = "IA_H27", nullable = true, precision = 0)
    private Double iaH27;
    @Basic
    @Column(name = "IA_H28", nullable = true, precision = 0)
    private Double iaH28;
    @Basic
    @Column(name = "IA_H29", nullable = true, precision = 0)
    private Double iaH29;
    @Basic
    @Column(name = "IA_H30", nullable = true, precision = 0)
    private Double iaH30;
    @Basic
    @Column(name = "IA_H31", nullable = true, precision = 0)
    private Double iaH31;
    @Basic
    @Column(name = "IB_H1", nullable = true, precision = 0)
    private Double ibH1;
    @Basic
    @Column(name = "IB_H2", nullable = true, precision = 0)
    private Double ibH2;
    @Basic
    @Column(name = "IB_H3", nullable = true, precision = 0)
    private Double ibH3;
    @Basic
    @Column(name = "IB_H4", nullable = true, precision = 0)
    private Double ibH4;
    @Basic
    @Column(name = "IB_H5", nullable = true, precision = 0)
    private Double ibH5;
    @Basic
    @Column(name = "IB_H6", nullable = true, precision = 0)
    private Double ibH6;
    @Basic
    @Column(name = "IB_H7", nullable = true, precision = 0)
    private Double ibH7;
    @Basic
    @Column(name = "IB_H8", nullable = true, precision = 0)
    private Double ibH8;
    @Basic
    @Column(name = "IB_H9", nullable = true, precision = 0)
    private Double ibH9;
    @Basic
    @Column(name = "IB_H10", nullable = true, precision = 0)
    private Double ibH10;
    @Basic
    @Column(name = "IB_H11", nullable = true, precision = 0)
    private Double ibH11;
    @Basic
    @Column(name = "IB_H12", nullable = true, precision = 0)
    private Double ibH12;
    @Basic
    @Column(name = "IB_H13", nullable = true, precision = 0)
    private Double ibH13;
    @Basic
    @Column(name = "IB_H14", nullable = true, precision = 0)
    private Double ibH14;
    @Basic
    @Column(name = "IB_H15", nullable = true, precision = 0)
    private Double ibH15;
    @Basic
    @Column(name = "IB_H16", nullable = true, precision = 0)
    private Double ibH16;
    @Basic
    @Column(name = "IB_H17", nullable = true, precision = 0)
    private Double ibH17;
    @Basic
    @Column(name = "IB_H18", nullable = true, precision = 0)
    private Double ibH18;
    @Basic
    @Column(name = "IB_H19", nullable = true, precision = 0)
    private Double ibH19;
    @Basic
    @Column(name = "IB_H20", nullable = true, precision = 0)
    private Double ibH20;
    @Basic
    @Column(name = "IB_H21", nullable = true, precision = 0)
    private Double ibH21;
    @Basic
    @Column(name = "IB_H22", nullable = true, precision = 0)
    private Double ibH22;
    @Basic
    @Column(name = "IB_H23", nullable = true, precision = 0)
    private Double ibH23;
    @Basic
    @Column(name = "IB_H24", nullable = true, precision = 0)
    private Double ibH24;
    @Basic
    @Column(name = "IB_H25", nullable = true, precision = 0)
    private Double ibH25;
    @Basic
    @Column(name = "IB_H26", nullable = true, precision = 0)
    private Double ibH26;
    @Basic
    @Column(name = "IB_H27", nullable = true, precision = 0)
    private Double ibH27;
    @Basic
    @Column(name = "IB_H28", nullable = true, precision = 0)
    private Double ibH28;
    @Basic
    @Column(name = "IB_H29", nullable = true, precision = 0)
    private Double ibH29;
    @Basic
    @Column(name = "IB_H30", nullable = true, precision = 0)
    private Double ibH30;
    @Basic
    @Column(name = "IB_H31", nullable = true, precision = 0)
    private Double ibH31;
    @Basic
    @Column(name = "IC_H1", nullable = true, precision = 0)
    private Double icH1;
    @Basic
    @Column(name = "IC_H2", nullable = true, precision = 0)
    private Double icH2;
    @Basic
    @Column(name = "IC_H3", nullable = true, precision = 0)
    private Double icH3;
    @Basic
    @Column(name = "IC_H4", nullable = true, precision = 0)
    private Double icH4;
    @Basic
    @Column(name = "IC_H5", nullable = true, precision = 0)
    private Double icH5;
    @Basic
    @Column(name = "IC_H6", nullable = true, precision = 0)
    private Double icH6;
    @Basic
    @Column(name = "IC_H7", nullable = true, precision = 0)
    private Double icH7;
    @Basic
    @Column(name = "IC_H8", nullable = true, precision = 0)
    private Double icH8;
    @Basic
    @Column(name = "IC_H9", nullable = true, precision = 0)
    private Double icH9;
    @Basic
    @Column(name = "IC_H10", nullable = true, precision = 0)
    private Double icH10;
    @Basic
    @Column(name = "IC_H11", nullable = true, precision = 0)
    private Double icH11;
    @Basic
    @Column(name = "IC_H12", nullable = true, precision = 0)
    private Double icH12;
    @Basic
    @Column(name = "IC_H13", nullable = true, precision = 0)
    private Double icH13;
    @Basic
    @Column(name = "IC_H14", nullable = true, precision = 0)
    private Double icH14;
    @Basic
    @Column(name = "IC_H15", nullable = true, precision = 0)
    private Double icH15;
    @Basic
    @Column(name = "IC_H16", nullable = true, precision = 0)
    private Double icH16;
    @Basic
    @Column(name = "IC_H17", nullable = true, precision = 0)
    private Double icH17;
    @Basic
    @Column(name = "IC_H18", nullable = true, precision = 0)
    private Double icH18;
    @Basic
    @Column(name = "IC_H19", nullable = true, precision = 0)
    private Double icH19;
    @Basic
    @Column(name = "IC_H20", nullable = true, precision = 0)
    private Double icH20;
    @Basic
    @Column(name = "IC_H21", nullable = true, precision = 0)
    private Double icH21;
    @Basic
    @Column(name = "IC_H22", nullable = true, precision = 0)
    private Double icH22;
    @Basic
    @Column(name = "IC_H23", nullable = true, precision = 0)
    private Double icH23;
    @Basic
    @Column(name = "IC_H24", nullable = true, precision = 0)
    private Double icH24;
    @Basic
    @Column(name = "IC_H25", nullable = true, precision = 0)
    private Double icH25;
    @Basic
    @Column(name = "IC_H26", nullable = true, precision = 0)
    private Double icH26;
    @Basic
    @Column(name = "IC_H27", nullable = true, precision = 0)
    private Double icH27;
    @Basic
    @Column(name = "IC_H28", nullable = true, precision = 0)
    private Double icH28;
    @Basic
    @Column(name = "IC_H29", nullable = true, precision = 0)
    private Double icH29;
    @Basic
    @Column(name = "IC_H30", nullable = true, precision = 0)
    private Double icH30;
    @Basic
    @Column(name = "IC_H31", nullable = true, precision = 0)
    private Double icH31;
    @Basic
    @Column(name = "VAB_H1", nullable = true, precision = 0)
    private Double vabH1;
    @Basic
    @Column(name = "VAB_H2", nullable = true, precision = 0)
    private Double vabH2;
    @Basic
    @Column(name = "VAB_H3", nullable = true, precision = 0)
    private Double vabH3;
    @Basic
    @Column(name = "VAB_H4", nullable = true, precision = 0)
    private Double vabH4;
    @Basic
    @Column(name = "VAB_H5", nullable = true, precision = 0)
    private Double vabH5;
    @Basic
    @Column(name = "VAB_H6", nullable = true, precision = 0)
    private Double vabH6;
    @Basic
    @Column(name = "VAB_H7", nullable = true, precision = 0)
    private Double vabH7;
    @Basic
    @Column(name = "VAB_H8", nullable = true, precision = 0)
    private Double vabH8;
    @Basic
    @Column(name = "VAB_H9", nullable = true, precision = 0)
    private Double vabH9;
    @Basic
    @Column(name = "VAB_H10", nullable = true, precision = 0)
    private Double vabH10;
    @Basic
    @Column(name = "VAB_H11", nullable = true, precision = 0)
    private Double vabH11;
    @Basic
    @Column(name = "VAB_H12", nullable = true, precision = 0)
    private Double vabH12;
    @Basic
    @Column(name = "VAB_H13", nullable = true, precision = 0)
    private Double vabH13;
    @Basic
    @Column(name = "VAB_H14", nullable = true, precision = 0)
    private Double vabH14;
    @Basic
    @Column(name = "VAB_H15", nullable = true, precision = 0)
    private Double vabH15;
    @Basic
    @Column(name = "VAB_H16", nullable = true, precision = 0)
    private Double vabH16;
    @Basic
    @Column(name = "VAB_H17", nullable = true, precision = 0)
    private Double vabH17;
    @Basic
    @Column(name = "VAB_H18", nullable = true, precision = 0)
    private Double vabH18;
    @Basic
    @Column(name = "VAB_H19", nullable = true, precision = 0)
    private Double vabH19;
    @Basic
    @Column(name = "VAB_H20", nullable = true, precision = 0)
    private Double vabH20;
    @Basic
    @Column(name = "VAB_H21", nullable = true, precision = 0)
    private Double vabH21;
    @Basic
    @Column(name = "VAB_H22", nullable = true, precision = 0)
    private Double vabH22;
    @Basic
    @Column(name = "VAB_H23", nullable = true, precision = 0)
    private Double vabH23;
    @Basic
    @Column(name = "VAB_H24", nullable = true, precision = 0)
    private Double vabH24;
    @Basic
    @Column(name = "VAB_H25", nullable = true, precision = 0)
    private Double vabH25;
    @Basic
    @Column(name = "VAB_H26", nullable = true, precision = 0)
    private Double vabH26;
    @Basic
    @Column(name = "VAB_H27", nullable = true, precision = 0)
    private Double vabH27;
    @Basic
    @Column(name = "VAB_H28", nullable = true, precision = 0)
    private Double vabH28;
    @Basic
    @Column(name = "VAB_H29", nullable = true, precision = 0)
    private Double vabH29;
    @Basic
    @Column(name = "VAB_H30", nullable = true, precision = 0)
    private Double vabH30;
    @Basic
    @Column(name = "VAB_H31", nullable = true, precision = 0)
    private Double vabH31;
    @Basic
    @Column(name = "VBC_H1", nullable = true, precision = 0)
    private Double vbcH1;
    @Basic
    @Column(name = "VBC_H2", nullable = true, precision = 0)
    private Double vbcH2;
    @Basic
    @Column(name = "VBC_H3", nullable = true, precision = 0)
    private Double vbcH3;
    @Basic
    @Column(name = "VBC_H4", nullable = true, precision = 0)
    private Double vbcH4;
    @Basic
    @Column(name = "VBC_H5", nullable = true, precision = 0)
    private Double vbcH5;
    @Basic
    @Column(name = "VBC_H6", nullable = true, precision = 0)
    private Double vbcH6;
    @Basic
    @Column(name = "VBC_H7", nullable = true, precision = 0)
    private Double vbcH7;
    @Basic
    @Column(name = "VBC_H8", nullable = true, precision = 0)
    private Double vbcH8;
    @Basic
    @Column(name = "VBC_H9", nullable = true, precision = 0)
    private Double vbcH9;
    @Basic
    @Column(name = "VBC_H10", nullable = true, precision = 0)
    private Double vbcH10;
    @Basic
    @Column(name = "VBC_H11", nullable = true, precision = 0)
    private Double vbcH11;
    @Basic
    @Column(name = "VBC_H12", nullable = true, precision = 0)
    private Double vbcH12;
    @Basic
    @Column(name = "VBC_H13", nullable = true, precision = 0)
    private Double vbcH13;
    @Basic
    @Column(name = "VBC_H14", nullable = true, precision = 0)
    private Double vbcH14;
    @Basic
    @Column(name = "VBC_H15", nullable = true, precision = 0)
    private Double vbcH15;
    @Basic
    @Column(name = "VBC_H16", nullable = true, precision = 0)
    private Double vbcH16;
    @Basic
    @Column(name = "VBC_H17", nullable = true, precision = 0)
    private Double vbcH17;
    @Basic
    @Column(name = "VBC_H18", nullable = true, precision = 0)
    private Double vbcH18;
    @Basic
    @Column(name = "VBC_H19", nullable = true, precision = 0)
    private Double vbcH19;
    @Basic
    @Column(name = "VBC_H20", nullable = true, precision = 0)
    private Double vbcH20;
    @Basic
    @Column(name = "VBC_H21", nullable = true, precision = 0)
    private Double vbcH21;
    @Basic
    @Column(name = "VBC_H22", nullable = true, precision = 0)
    private Double vbcH22;
    @Basic
    @Column(name = "VBC_H23", nullable = true, precision = 0)
    private Double vbcH23;
    @Basic
    @Column(name = "VBC_H24", nullable = true, precision = 0)
    private Double vbcH24;
    @Basic
    @Column(name = "VBC_H25", nullable = true, precision = 0)
    private Double vbcH25;
    @Basic
    @Column(name = "VBC_H26", nullable = true, precision = 0)
    private Double vbcH26;
    @Basic
    @Column(name = "VBC_H27", nullable = true, precision = 0)
    private Double vbcH27;
    @Basic
    @Column(name = "VBC_H28", nullable = true, precision = 0)
    private Double vbcH28;
    @Basic
    @Column(name = "VBC_H29", nullable = true, precision = 0)
    private Double vbcH29;
    @Basic
    @Column(name = "VBC_H30", nullable = true, precision = 0)
    private Double vbcH30;
    @Basic
    @Column(name = "VBC_H31", nullable = true, precision = 0)
    private Double vbcH31;
    @Basic
    @Column(name = "VCA_H1", nullable = true, precision = 0)
    private Double vcaH1;
    @Basic
    @Column(name = "VCA_H2", nullable = true, precision = 0)
    private Double vcaH2;
    @Basic
    @Column(name = "VCA_H3", nullable = true, precision = 0)
    private Double vcaH3;
    @Basic
    @Column(name = "VCA_H4", nullable = true, precision = 0)
    private Double vcaH4;
    @Basic
    @Column(name = "VCA_H5", nullable = true, precision = 0)
    private Double vcaH5;
    @Basic
    @Column(name = "VCA_H6", nullable = true, precision = 0)
    private Double vcaH6;
    @Basic
    @Column(name = "VCA_H7", nullable = true, precision = 0)
    private Double vcaH7;
    @Basic
    @Column(name = "VCA_H8", nullable = true, precision = 0)
    private Double vcaH8;
    @Basic
    @Column(name = "VCA_H9", nullable = true, precision = 0)
    private Double vcaH9;
    @Basic
    @Column(name = "VCA_H10", nullable = true, precision = 0)
    private Double vcaH10;
    @Basic
    @Column(name = "VCA_H11", nullable = true, precision = 0)
    private Double vcaH11;
    @Basic
    @Column(name = "VCA_H12", nullable = true, precision = 0)
    private Double vcaH12;
    @Basic
    @Column(name = "VCA_H13", nullable = true, precision = 0)
    private Double vcaH13;
    @Basic
    @Column(name = "VCA_H14", nullable = true, precision = 0)
    private Double vcaH14;
    @Basic
    @Column(name = "VCA_H15", nullable = true, precision = 0)
    private Double vcaH15;
    @Basic
    @Column(name = "VCA_H16", nullable = true, precision = 0)
    private Double vcaH16;
    @Basic
    @Column(name = "VCA_H17", nullable = true, precision = 0)
    private Double vcaH17;
    @Basic
    @Column(name = "VCA_H18", nullable = true, precision = 0)
    private Double vcaH18;
    @Basic
    @Column(name = "VCA_H19", nullable = true, precision = 0)
    private Double vcaH19;
    @Basic
    @Column(name = "VCA_H20", nullable = true, precision = 0)
    private Double vcaH20;
    @Basic
    @Column(name = "VCA_H21", nullable = true, precision = 0)
    private Double vcaH21;
    @Basic
    @Column(name = "VCA_H22", nullable = true, precision = 0)
    private Double vcaH22;
    @Basic
    @Column(name = "VCA_H23", nullable = true, precision = 0)
    private Double vcaH23;
    @Basic
    @Column(name = "VCA_H24", nullable = true, precision = 0)
    private Double vcaH24;
    @Basic
    @Column(name = "VCA_H25", nullable = true, precision = 0)
    private Double vcaH25;
    @Basic
    @Column(name = "VCA_H26", nullable = true, precision = 0)
    private Double vcaH26;
    @Basic
    @Column(name = "VCA_H27", nullable = true, precision = 0)
    private Double vcaH27;
    @Basic
    @Column(name = "VCA_H28", nullable = true, precision = 0)
    private Double vcaH28;
    @Basic
    @Column(name = "VCA_H29", nullable = true, precision = 0)
    private Double vcaH29;
    @Basic
    @Column(name = "VCA_H30", nullable = true, precision = 0)
    private Double vcaH30;
    @Basic
    @Column(name = "VCA_H31", nullable = true, precision = 0)
    private Double vcaH31;
    @Basic
    @Column(name = "VAN_H1", nullable = true, precision = 0)
    private Double vanH1;
    @Basic
    @Column(name = "VAN_H2", nullable = true, precision = 0)
    private Double vanH2;
    @Basic
    @Column(name = "VAN_H3", nullable = true, precision = 0)
    private Double vanH3;
    @Basic
    @Column(name = "VAN_H4", nullable = true, precision = 0)
    private Double vanH4;
    @Basic
    @Column(name = "VAN_H5", nullable = true, precision = 0)
    private Double vanH5;
    @Basic
    @Column(name = "VAN_H6", nullable = true, precision = 0)
    private Double vanH6;
    @Basic
    @Column(name = "VAN_H7", nullable = true, precision = 0)
    private Double vanH7;
    @Basic
    @Column(name = "VAN_H8", nullable = true, precision = 0)
    private Double vanH8;
    @Basic
    @Column(name = "VAN_H9", nullable = true, precision = 0)
    private Double vanH9;
    @Basic
    @Column(name = "VAN_H10", nullable = true, precision = 0)
    private Double vanH10;
    @Basic
    @Column(name = "VAN_H11", nullable = true, precision = 0)
    private Double vanH11;
    @Basic
    @Column(name = "VAN_H12", nullable = true, precision = 0)
    private Double vanH12;
    @Basic
    @Column(name = "VAN_H13", nullable = true, precision = 0)
    private Double vanH13;
    @Basic
    @Column(name = "VAN_H14", nullable = true, precision = 0)
    private Double vanH14;
    @Basic
    @Column(name = "VAN_H15", nullable = true, precision = 0)
    private Double vanH15;
    @Basic
    @Column(name = "VAN_H16", nullable = true, precision = 0)
    private Double vanH16;
    @Basic
    @Column(name = "VAN_H17", nullable = true, precision = 0)
    private Double vanH17;
    @Basic
    @Column(name = "VAN_H18", nullable = true, precision = 0)
    private Double vanH18;
    @Basic
    @Column(name = "VAN_H19", nullable = true, precision = 0)
    private Double vanH19;
    @Basic
    @Column(name = "VAN_H20", nullable = true, precision = 0)
    private Double vanH20;
    @Basic
    @Column(name = "VAN_H21", nullable = true, precision = 0)
    private Double vanH21;
    @Basic
    @Column(name = "VAN_H22", nullable = true, precision = 0)
    private Double vanH22;
    @Basic
    @Column(name = "VAN_H23", nullable = true, precision = 0)
    private Double vanH23;
    @Basic
    @Column(name = "VAN_H24", nullable = true, precision = 0)
    private Double vanH24;
    @Basic
    @Column(name = "VAN_H25", nullable = true, precision = 0)
    private Double vanH25;
    @Basic
    @Column(name = "VAN_H26", nullable = true, precision = 0)
    private Double vanH26;
    @Basic
    @Column(name = "VAN_H27", nullable = true, precision = 0)
    private Double vanH27;
    @Basic
    @Column(name = "VAN_H28", nullable = true, precision = 0)
    private Double vanH28;
    @Basic
    @Column(name = "VAN_H29", nullable = true, precision = 0)
    private Double vanH29;
    @Basic
    @Column(name = "VAN_H30", nullable = true, precision = 0)
    private Double vanH30;
    @Basic
    @Column(name = "VAN_H31", nullable = true, precision = 0)
    private Double vanH31;
    @Basic
    @Column(name = "VBN_H1", nullable = true, precision = 0)
    private Double vbnH1;
    @Basic
    @Column(name = "VBN_H2", nullable = true, precision = 0)
    private Double vbnH2;
    @Basic
    @Column(name = "VBN_H3", nullable = true, precision = 0)
    private Double vbnH3;
    @Basic
    @Column(name = "VBN_H4", nullable = true, precision = 0)
    private Double vbnH4;
    @Basic
    @Column(name = "VBN_H5", nullable = true, precision = 0)
    private Double vbnH5;
    @Basic
    @Column(name = "VBN_H6", nullable = true, precision = 0)
    private Double vbnH6;
    @Basic
    @Column(name = "VBN_H7", nullable = true, precision = 0)
    private Double vbnH7;
    @Basic
    @Column(name = "VBN_H8", nullable = true, precision = 0)
    private Double vbnH8;
    @Basic
    @Column(name = "VBN_H9", nullable = true, precision = 0)
    private Double vbnH9;
    @Basic
    @Column(name = "VBN_H10", nullable = true, precision = 0)
    private Double vbnH10;
    @Basic
    @Column(name = "VBN_H11", nullable = true, precision = 0)
    private Double vbnH11;
    @Basic
    @Column(name = "VBN_H12", nullable = true, precision = 0)
    private Double vbnH12;
    @Basic
    @Column(name = "VBN_H13", nullable = true, precision = 0)
    private Double vbnH13;
    @Basic
    @Column(name = "VBN_H14", nullable = true, precision = 0)
    private Double vbnH14;
    @Basic
    @Column(name = "VBN_H15", nullable = true, precision = 0)
    private Double vbnH15;
    @Basic
    @Column(name = "VBN_H16", nullable = true, precision = 0)
    private Double vbnH16;
    @Basic
    @Column(name = "VBN_H17", nullable = true, precision = 0)
    private Double vbnH17;
    @Basic
    @Column(name = "VBN_H18", nullable = true, precision = 0)
    private Double vbnH18;
    @Basic
    @Column(name = "VBN_H19", nullable = true, precision = 0)
    private Double vbnH19;
    @Basic
    @Column(name = "VBN_H20", nullable = true, precision = 0)
    private Double vbnH20;
    @Basic
    @Column(name = "VBN_H21", nullable = true, precision = 0)
    private Double vbnH21;
    @Basic
    @Column(name = "VBN_H22", nullable = true, precision = 0)
    private Double vbnH22;
    @Basic
    @Column(name = "VBN_H23", nullable = true, precision = 0)
    private Double vbnH23;
    @Basic
    @Column(name = "VBN_H24", nullable = true, precision = 0)
    private Double vbnH24;
    @Basic
    @Column(name = "VBN_H25", nullable = true, precision = 0)
    private Double vbnH25;
    @Basic
    @Column(name = "VBN_H26", nullable = true, precision = 0)
    private Double vbnH26;
    @Basic
    @Column(name = "VBN_H27", nullable = true, precision = 0)
    private Double vbnH27;
    @Basic
    @Column(name = "VBN_H28", nullable = true, precision = 0)
    private Double vbnH28;
    @Basic
    @Column(name = "VBN_H29", nullable = true, precision = 0)
    private Double vbnH29;
    @Basic
    @Column(name = "VBN_H30", nullable = true, precision = 0)
    private Double vbnH30;
    @Basic
    @Column(name = "VBN_H31", nullable = true, precision = 0)
    private Double vbnH31;
    @Basic
    @Column(name = "VCN_H1", nullable = true, precision = 0)
    private Double vcnH1;
    @Basic
    @Column(name = "VCN_H2", nullable = true, precision = 0)
    private Double vcnH2;
    @Basic
    @Column(name = "VCN_H3", nullable = true, precision = 0)
    private Double vcnH3;
    @Basic
    @Column(name = "VCN_H4", nullable = true, precision = 0)
    private Double vcnH4;
    @Basic
    @Column(name = "VCN_H5", nullable = true, precision = 0)
    private Double vcnH5;
    @Basic
    @Column(name = "VCN_H6", nullable = true, precision = 0)
    private Double vcnH6;
    @Basic
    @Column(name = "VCN_H7", nullable = true, precision = 0)
    private Double vcnH7;
    @Basic
    @Column(name = "VCN_H8", nullable = true, precision = 0)
    private Double vcnH8;
    @Basic
    @Column(name = "VCN_H9", nullable = true, precision = 0)
    private Double vcnH9;
    @Basic
    @Column(name = "VCN_H10", nullable = true, precision = 0)
    private Double vcnH10;
    @Basic
    @Column(name = "VCN_H11", nullable = true, precision = 0)
    private Double vcnH11;
    @Basic
    @Column(name = "VCN_H12", nullable = true, precision = 0)
    private Double vcnH12;
    @Basic
    @Column(name = "VCN_H13", nullable = true, precision = 0)
    private Double vcnH13;
    @Basic
    @Column(name = "VCN_H14", nullable = true, precision = 0)
    private Double vcnH14;
    @Basic
    @Column(name = "VCN_H15", nullable = true, precision = 0)
    private Double vcnH15;
    @Basic
    @Column(name = "VCN_H16", nullable = true, precision = 0)
    private Double vcnH16;
    @Basic
    @Column(name = "VCN_H17", nullable = true, precision = 0)
    private Double vcnH17;
    @Basic
    @Column(name = "VCN_H18", nullable = true, precision = 0)
    private Double vcnH18;
    @Basic
    @Column(name = "VCN_H19", nullable = true, precision = 0)
    private Double vcnH19;
    @Basic
    @Column(name = "VCN_H20", nullable = true, precision = 0)
    private Double vcnH20;
    @Basic
    @Column(name = "VCN_H21", nullable = true, precision = 0)
    private Double vcnH21;
    @Basic
    @Column(name = "VCN_H22", nullable = true, precision = 0)
    private Double vcnH22;
    @Basic
    @Column(name = "VCN_H23", nullable = true, precision = 0)
    private Double vcnH23;
    @Basic
    @Column(name = "VCN_H24", nullable = true, precision = 0)
    private Double vcnH24;
    @Basic
    @Column(name = "VCN_H25", nullable = true, precision = 0)
    private Double vcnH25;
    @Basic
    @Column(name = "VCN_H26", nullable = true, precision = 0)
    private Double vcnH26;
    @Basic
    @Column(name = "VCN_H27", nullable = true, precision = 0)
    private Double vcnH27;
    @Basic
    @Column(name = "VCN_H28", nullable = true, precision = 0)
    private Double vcnH28;
    @Basic
    @Column(name = "VCN_H29", nullable = true, precision = 0)
    private Double vcnH29;
    @Basic
    @Column(name = "VCN_H30", nullable = true, precision = 0)
    private Double vcnH30;
    @Basic
    @Column(name = "VCN_H31", nullable = true, precision = 0)
    private Double vcnH31;
    @Basic
    @Column(name = "sent_date", nullable = true)
    private Timestamp sentDate;

    @Column(name = "device_id", nullable = true)
    private Integer deviceId;
}
