public class RestPOJO {
    private String url;
    private String services;
    private String expertise;
    private CoursesJSON courses;
    private String instructor;
    private String linkedIn;

    public CoursesJSON getCourses() {
        return courses;
    }

    public String getExpertise() {
        return expertise;
    }

    public String getInstructor() {
        return instructor;
    }
    public String getLinkedIn() {
        return linkedIn;
    }

    public String getServices() {
        return services;
    }

    public String getUrl() {
        return url;
    }

    public void setCourses(CoursesJSON courses) {
        this.courses = courses;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setServices(String services) {
        this.services = services;
    }

    //#_________________________________#//

    public void coursesToGet(){
    }
}
