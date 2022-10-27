package courses;

public class JavaScript extends Course {
    public JavaScript() {
    }

    public JavaScript(String courseName, int cost, int courseDuration, String format, int daysInAWeek) {
        super(courseName, cost, courseDuration, format, daysInAWeek);
    }

    @Override
    public void mentor() {
        System.out.println("Ментор: Улан");
    }
}

