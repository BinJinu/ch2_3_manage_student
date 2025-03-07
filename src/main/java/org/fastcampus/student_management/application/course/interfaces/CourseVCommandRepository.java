package org.fastcampus.student_management.application.course.interfaces;

import org.fastcampus.student_management.domain.Course;
import org.fastcampus.student_management.domain.DayOfWeek;

import java.util.List;

public interface CourseVCommandRepository {
    void save(Course course);
}
