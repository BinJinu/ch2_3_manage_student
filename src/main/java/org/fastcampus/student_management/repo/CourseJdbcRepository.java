package org.fastcampus.student_management.repo;

import org.fastcampus.student_management.application.course.interfaces.CourseQueryRepository;
import org.fastcampus.student_management.domain.Course;
import org.fastcampus.student_management.domain.DayOfWeek;

import java.util.ArrayList;
import java.util.List;

public class CourseJdbcRepository implements CourseQueryRepository {

    @Override
    public List<Course> getCourseDayOfWeek(DayOfWeek dayOfWeek) {
        return List.of();
    }

    @Override
    public List<Course> getCourseListByStudent(String studentName) {
        return List.of();
    }
}
