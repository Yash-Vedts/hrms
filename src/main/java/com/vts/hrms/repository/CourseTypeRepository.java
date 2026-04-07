package com.vts.hrms.repository;

import com.vts.hrms.entity.CourseType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseTypeRepository extends JpaRepository<CourseType, Long> {

    List<CourseType> findAllByIsActive(int isActive);
}
