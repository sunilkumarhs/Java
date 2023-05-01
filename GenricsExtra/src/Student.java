import java.util.Random;

public class Student implements QueryItem {
    private String name;
    private String course;
    private int courseYear;

    private static Random random = new Random();

    private static String[] firstName = {"sunil","charan","ganesh","ajay","vijay"};
    private static String[] courses = {"C","C++","Java","Python","ReactJs"};

    public Student() {
        int lastNameIndex = random.nextInt(65,91);
        name = firstName[random.nextInt(5)]+" "+(char) lastNameIndex;
        course = courses[random.nextInt(5)];
        courseYear = random.nextInt(2018,2023);
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name,course,courseYear);
    }

    public int getCourseYear() {
        return courseYear;
    }

    @Override
    public boolean checkItem(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "COURSEYEAR" -> courseYear == (Integer.parseInt(value));
            default -> false;
        };
    }
}
