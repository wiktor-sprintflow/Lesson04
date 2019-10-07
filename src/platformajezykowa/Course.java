package platformajezykowa;

public class Course {
    String course;
    int courseLength;
    String courseCategory;
    String courseCategoryDescription;
    double price;

    public Course(String course, int courseLength, String courseCategory, String courseCategoryDescription, double price) {
        this.course = course;
        this.courseLength = courseLength;
        this.courseCategory = courseCategory;
        this.courseCategoryDescription = courseCategoryDescription;
        this.price = price;
    }

    public void displayCourseDetails() {
        System.out.println(course + ", category: " + courseCategory + ", length: " + courseLength + "min, " + courseCategoryDescription + ", price: " + price);
    }

    public int getCourseHours() {
        return (this.courseLength / 60);
    }

    public int getCourseRemainingMinutes() {
        return (this.courseLength % 60);
    }

    public void showCourseDuration() {
        System.out.println("You will need: " + getCourseHours() + "h " + getCourseRemainingMinutes() + "min to finish all courses.");
    }
}