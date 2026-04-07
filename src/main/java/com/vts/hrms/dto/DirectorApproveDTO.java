package com.vts.hrms.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DirectorApproveDTO implements Serializable {

    private List<Long> requisitionIds;
    private Long actionBy;

}
