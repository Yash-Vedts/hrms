package com.vts.hrms.repository;

import com.vts.hrms.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findAllByIsActive(int isActive);

    List<Course> findAllByOrganizerIdAndIsActive(Long orgId, int isActive);
}
