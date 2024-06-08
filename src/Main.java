import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Course> courses = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();
    private static List<Instructor> instructors = new ArrayList<>();
    private static List<Enrollment> enrollments = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Course Management System");
            System.out.println("1. Create Course");
            System.out.println("2. Enroll Student");
            System.out.println("3. Assign Grade");
            System.out.println("4. Track Attendance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createCourse();
                    displayCourses();
                    break;
                case 2:
                    enrollStudent();
                    displayEnrollments();
                    break;
                case 3:
                    assignGrade();
                    displayEnrollments();
                    break;
                case 4:
                    trackAttendance();
                    displayEnrollments();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createCourse() {
        System.out.print("Enter Course ID: ");
        String courseId = scanner.nextLine();
        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter Course Schedule: ");
        String courseSchedule = scanner.nextLine();
        System.out.print("Enter Course Objectives: ");
        String courseObjectives = scanner.nextLine();
        System.out.print("Enter Instructor ID: ");
        String instructorId = scanner.nextLine();

        Course course = new Course(courseId, courseName, courseSchedule, courseObjectives, instructorId);
        courses.add(course);

        System.out.println("Course created successfully!");
    }

    private static void enrollStudent() {
        System.out.print("Enter Enrollment ID: ");
        String enrollmentId = scanner.nextLine();
        System.out.print("Enter Course ID: ");
        String courseId = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        Enrollment enrollment = new Enrollment(enrollmentId, courseId, studentId, null, false);
        enrollments.add(enrollment);

        System.out.println("Student enrolled successfully!");
    }

    private static void assignGrade() {
        System.out.print("Enter Enrollment ID: ");
        String enrollmentId = scanner.nextLine();
        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();

        for (Enrollment enrollment : enrollments) {
            if (enrollment.getEnrollmentId().equals(enrollmentId)) {
                enrollment.setGrade(grade);
                System.out.println("Grade assigned successfully!");
                return;
            }
        }
        System.out.println("Enrollment ID not found.");
    }

    private static void trackAttendance() {
        System.out.print("Enter Enrollment ID: ");
        String enrollmentId = scanner.nextLine();
        System.out.print("Enter Attendance (true/false): ");
        boolean isAttended = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline

        for (Enrollment enrollment : enrollments) {
            if (enrollment.getEnrollmentId().equals(enrollmentId)) {
                enrollment.setAttended(isAttended);
                System.out.println("Attendance tracked successfully!");
                return;
            }
        }
        System.out.println("Enrollment ID not found.");
    }

    private static void displayCourses() {
        System.out.println("Courses:");
        for (Course course : courses) {
            System.out.println(course);
        }
        System.out.println();
    }

    private static void displayEnrollments() {
        System.out.println("Enrollments:");
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }
        System.out.println();
    }
}
