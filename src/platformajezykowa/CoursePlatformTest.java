package platformajezykowa;

public class CoursePlatformTest {
    public static void main(String[] args) {
        Course course1 = new Course("Java", 5415, "Programming", "Best programming tutorials online", 199);
        Course course2 = new Course("Android", 3600, "Programming", "Best programming tutorials online", 149);
        Course course3 = new Course("Fast Reading", 2200, "Self Development", "Learn How to become the best version of Yourself Today", 139);

        SpecialOffer specialOffer = new SpecialOffer();

        System.out.println("There are 3 courses in our database:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();

        specialOffer.showSpecialOfferDetails(course1,course2,course3);

        course1.showCourseDuration();
    }
}
