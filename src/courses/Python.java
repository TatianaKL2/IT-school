package courses;

public class Python extends Course {
    public Python() {
    }

    public Python(String courseName, int cost, int courseDuration, String format, int daysInAWeek) {
        super(courseName, cost, courseDuration, format, daysInAWeek);
    }

    @Override
    public void mentor() {
        System.out.println("Ментор: Кайрат");
    }
}

