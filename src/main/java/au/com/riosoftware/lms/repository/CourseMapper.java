package au.com.riosoftware.lms.repository;

import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

@Mapper
public interface CourseMapper {
    @DaoFactory
    CourseDao courseDao();
}
