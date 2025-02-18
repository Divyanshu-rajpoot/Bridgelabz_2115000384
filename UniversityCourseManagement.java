import java.util.ArrayList;
import java.util.List;

// Abstract class representing different course types
abstract class CourseType {
    private String courseName;
    private int courseCode;

    public CourseType(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() { return courseName; }
    public int getCourseCode() { return courseCode; }

    @Override
    public String toString() {
        return courseName + " (Code: " + courseCode + ")";
    }
}

// Specific course types
class ExamCourse extends CourseType {
    public ExamCourse(String courseName, int courseCode) {
        super(courseName, courseCode);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, int courseCode) {
        super(courseName, courseCode);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, int courseCode) {
        super(courseName, courseCode);
    }
}

// Generic Course Management Class
class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    // Wildcard method to display any type of course
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}

// Main class for testing
public class UniversityCourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics", 50011));
        examCourses.addCourse(new ExamCourse("chemistry", 50012));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Algorithm 101", 10235));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("A.I And Its Benifits ", 11012));
        researchCourses.addCourse(new ResearchCourse("Quantum Physics",109302));

        System.out.println("Exam-Based Courses:");
        Course.displayCourses(examCourses.getCourses());

        System.out.println("Assignment-Based Courses:");
        Course.displayCourses(assignmentCourses.getCourses());

        System.out.println("Research-Based Courses:");
        Course.displayCourses(researchCourses.getCourses());
    }
}
