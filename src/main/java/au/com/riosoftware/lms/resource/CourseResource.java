package au.com.riosoftware.lms.resource;

import au.com.riosoftware.lms.model.Course;
import au.com.riosoftware.lms.service.CourseService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.stream.Collectors;

@Path("/courses")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourseResource {

    private CourseService courseService;

    @Inject
    public CourseResource(CourseService courseService) {
        this.courseService = courseService;
    }

    @GET
    public List<CourseDto> getAll() {
        return courseService.getAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @POST
    public void add(CourseDto course) {
        courseService.save(convertFromDto(course));
    }

    private CourseDto convertToDto(Course course) {
        return new CourseDto(course.getId(), course.getTitle(), course.getDescription());
    }

    private Course convertFromDto(CourseDto courseDto) {
        return new Course(courseDto.getId(), courseDto.getTitle(), courseDto.getDescription());
    }
}
