package au.com.riosoftware.lms.resource;

public class CourseDto {

    private String id;
    private String title;
    private String description;

    public CourseDto() {}

    public CourseDto(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


}
