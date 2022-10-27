package courses;

public class Flutter extends Course {
    public Flutter() {
    }

    public Flutter(String courseName, int cost, int courseDuration, String format, int daysInAWeek) {
        super(courseName, cost, courseDuration, format, daysInAWeek);
    }

    @Override
    public void mentor() {
        System.out.println("Ментор: Эмиль");
    }
}
