package au.com.riosoftware.lms.repository;

import au.com.riosoftware.lms.model.Course;
import com.datastax.oss.driver.api.core.PagingIterable;
import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Select;
import com.datastax.oss.driver.api.mapper.annotations.Update;

@Dao
public interface CourseDao {

    @Update
    void update(Course course);

    @Select
    PagingIterable<Course> findAll();

}
