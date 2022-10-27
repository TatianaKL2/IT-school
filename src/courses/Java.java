package courses;

public class Java extends Course {
    public Java() {
    }

    public Java(String courseName, int cost, int courseDuration, String format, int daysInAWeek) {
        super(courseName, cost, courseDuration, format, daysInAWeek);
    }

    @Override
    public void mentor() {
        System.out.println("\nМентор: Искандар");
    }

}
