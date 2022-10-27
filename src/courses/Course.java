package courses;

public abstract class Course {
    private String courseName;
    private int cost;
    private int courseDuration;
    private String format;
    private int daysInAWeek;

    public Course() {
    }

    public Course(String courseName, int cost, int courseDuration, String format, int daysInAWeek) {
        this.courseName = courseName;
        this.cost = cost;
        this.courseDuration = courseDuration;
        this.format = format;
        this.daysInAWeek = daysInAWeek;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getDaysInAWeek() {
        return daysInAWeek;
    }

    public void setDaysInAWeek(int daysInAWeek) {
        this.daysInAWeek = daysInAWeek;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Название курса: " + getCourseName() + "\n" +
                "Стоимость: " + getCost() + " сом" + "\n" +
                "Продолжительность: " + getCourseDuration() + " месяца(-ев)" + "\n" +
                "Формат: " + getFormat() + "\n" +
                "Количество занятий в неделю: " + getDaysInAWeek();
    }
    abstract void mentor();
}