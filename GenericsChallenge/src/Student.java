import java.util.Random;

public class Student implements QueryItem,Comparable<Student>{
    private static int LAST_INDEX = 1000;
    private int student_Id;
    private String name;
    private String course;
    private int courseYear;

    private static Random random = new Random();

    private static String[] firstName = {"sunil","charan","ganesh","ajay","vijay"};
    private static String[] courses = {"C","C++","Java","Python","ReactJs"};

    public Student() {
        int lastNameIndex = random.nextInt(65,91);
        student_Id = LAST_INDEX++;
        name = firstName[random.nextInt(5)]+" "+(char) lastNameIndex;
        course = courses[random.nextInt(5)];
        courseYear = random.nextInt(2018,2023);
    }

    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(student_Id,name,course,courseYear);
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

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(student_Id).compareTo(o.student_Id);
    }
}
