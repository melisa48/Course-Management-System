public class Course {
    private String courseId;
    private String courseName;
    private String courseSchedule;
    private String courseObjectives;
    private String instructorId;

    // Constructor
    public Course(String courseId, String courseName, String courseSchedule, String courseObjectives, String instructorId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseSchedule = courseSchedule;
        this.courseObjectives = courseObjectives;
        this.instructorId = instructorId;
    }

    // Getters and Setters
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(String courseSchedule) {
        this.courseSchedule = courseSchedule;
    }

    public String getCourseObjectives() {
        return courseObjectives;
    }

    public void setCourseObjectives(String courseObjectives) {
        this.courseObjectives = courseObjectives;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseSchedule='" + courseSchedule + '\'' +
                ", courseObjectives='" + courseObjectives + '\'' +
                ", instructorId='" + instructorId + '\'' +
                '}';
    }
}

