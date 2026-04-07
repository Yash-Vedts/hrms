package com.vts.hrms.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseTypeDTO implements Serializable {

    private Long courseTypeId;
    private String courseType;

}
