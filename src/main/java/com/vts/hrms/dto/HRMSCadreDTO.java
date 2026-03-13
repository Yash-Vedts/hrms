package com.vts.hrms.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class HRMSCadreDTO implements Serializable {

    private String category;
    private Long trainedCount;
    private Long nonTrainedCount;

}
