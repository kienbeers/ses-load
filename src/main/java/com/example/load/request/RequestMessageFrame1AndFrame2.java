package com.example.load.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestMessageFrame1AndFrame2 {
    private S3MDataLoadFrame1Request frame1Request;
    private S3MDataLoadFrame2Request frame2Request;
}
