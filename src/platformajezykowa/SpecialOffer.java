package platformajezykowa;

public class SpecialOffer {
    public double getDiscountPrice(Course course1, Course course2, Course course3) {
        return (getTotalPrice(course1, course2, course3) * 0.9);
    }

    public double getTotalPrice(Course course1, Course course2, Course course3) {
        return (course1.price + course2.price + course3.price);
    }

    public void showSpecialOfferDetails(Course course1, Course course2, Course course3){
        System.out.println();
        System.out.println("Special offer! Buy 3 courses and save 10%");
        System.out.printf("Price after discount: %.2fzl (before: %.2fzl)", getDiscountPrice(course1, course2, course3), getTotalPrice(course1, course2, course3));
        System.out.println("\n");
    }
}
