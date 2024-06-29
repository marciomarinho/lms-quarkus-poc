package au.com.riosoftware.lms.service;

import au.com.riosoftware.lms.model.Course;
import au.com.riosoftware.lms.repository.CourseDao;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class CourseService {

    private CourseDao dao;

    @Inject
    public CourseService(CourseDao courseDao) {
        this.dao = courseDao;
    }

    public void save(Course course) {
        dao.update(course);
    }

    public List<Course> getAll() {
        return dao.findAll().all();
    }

}
