package com.example.load.request;

import com.example.load.entity.PKS3DataLoadFrame1;
import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString
public class S3MDataLoadFrame1Request {

    @NotNull
    private PKS3DataLoadFrame1 id;
    @NotNull
    private Long deviceId;
    @Min(value = 0)
    @Max(value = 45000)
    private Double uab;
    @Min(value = 0)
    @Max(value = 45000)
    private Double ubc;
    @Min(value = 0)
    @Max(value = 45000)
    private Double uca;
    @Min(value = 0)
    @Max(value = 45000)
    private Double ull;
    @Min(value = 0)
    @Max(value = 45000)
    private Double uan;
    @Min(value = 0)
    @Max(value = 45000)
    private Double ubn;
    @Min(value = 0)
    @Max(value = 45000)
    private Double ucn;
    @Min(value = 0)
    @Max(value = 45000)
    private Double uln;
    @Min(value = 0)
    @Max(value = 10000)
    private Double ia;
    @Min(value = 0)
    @Max(value = 10000)
    private Double ib;
    @Min(value = 0)
    @Max(value = 10000)
    private Double ic;
    @Min(value = 0)
    @Max(value = 10000)
    private Double in;
    @Min(value = 0)
    @Max(value = 10000)
    private Double ig;
    @Min(value = 0)
    @Max(value = 10000)
    private Double iavg;
    @Min(value = -2000000)
    @Max(value = 2000000)
    private Double pa;
    @Min(value = -2000000)
    @Max(value = 2000000)
    private Double pb;
    @Min(value = -2000000)
    @Max(value = 2000000)
    private Double pc;
    @Min(value = -6000000)
    @Max(value = 6000000)
    private Double pTotal;
    @Min(value = -2000000)
    @Max(value = 2000000)
    private Double qa;
    @Min(value = -2000000)
    @Max(value = 2000000)
    private Double qb;
    @Min(value = -2000000)
    @Max(value = 2000000)
    private Double qc;
    @Min(value = -6000000)
    @Max(value = 6000000)
    private Double qTotal;
    @Min(value = 0)
    @Max(value = 2000000)
    private Double sa;
    @Min(value = 0)
    @Max(value = 2000000)
    private Double sb;
    @Min(value = 0)
    @Max(value = 2000000)
    private Double sc;
    @Min(value = 0)
    @Max(value = 6000000)
    private Double sTotal;
    @Min(-1)
    @Max(1)
    private Double pfa;
    @Min(-1)
    @Max(1)
    private Double pfb;
    @Min(-1)
    @Max(1)
    private Double pfc;
    @Min(-1)
    @Max(1)
    private Double pfavg;
    @Min(value = 45)
    @Max(value = 65)
    private Double f;
    
    private Integer ep;
    
    private Integer epR;
    
    private Integer epDr;
    
    private Integer epDrr;
    
    private Integer eq;
    
    private Integer eqR;
    
    private Integer eqDr;
    
    private Integer eqDrr;
    
    private Integer es;
    
    private Integer esR;
    
    private Integer esDr;
    
    private Integer esDrr;
    @Min(value = -100)
    @Max(value = 100)
    private Double t1;
    @Min(value = -100)
    @Max(value = 100)
    private Double t2;
    @Min(value = -100)
    @Max(value = 100)
    private Double t3;
    @Min(value = -1000)
    @Max(1000)
    private Integer commandData1;
    @Min(value = -1000)
    @Max(1000)
    private Integer commandData2;
    @Min(value = -1000)
    @Max(1000)
    private Integer commandData3;
    @Min(value = -1000)
    @Max(1000)
    private Integer commandData4;
    @Min(value = -1000)
    @Max(1000)
    private Integer commandData5;
    @Min(value = -1000)
    @Max(1000)
    private Integer commandData6;
    @Min(0)
    @Max(100)
    private Double thdIa;
    @Min(0)
    @Max(100)
    private Double thdIb;
    @Min(0)
    @Max(100)
    private Double thdIc;
    @Min(0)
    @Max(100)
    private Double thdIn;
    @Min(0)
    @Max(100)
    private Double thdIg;
    @Min(0)
    @Max(100)
    private Double thdVab;
    @Min(0)
    @Max(100)
    private Double thdVbc;
    @Min(0)
    @Max(100)
    private Double thdVca;
    @Min(0)
    @Max(100)
    private Double thdVll;
    @Min(0)
    @Max(100)
    private Double thdVan;
    @Min(0)
    @Max(100)
    private Double thdVbn;
    @Min(0)
    @Max(100)
    private Double thdVcn;
    @Min(0)
    @Max(100)
    private Double thdVln;

    @NotNull
    private Timestamp sentDate;

}
