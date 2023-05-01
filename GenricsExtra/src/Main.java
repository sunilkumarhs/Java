import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students =new ArrayList<>();
        for (int i=0;i<=10;i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
        printList(students);

        List<LPAStudent> LpaStudents =new ArrayList<>();
        for (int i=0;i<=10;i++) {
            LpaStudents.add(new LPAStudent());
        }
        printList(LpaStudents);

        ItemList(new ArrayList<String>(List.of("sunil","charan","seena")));
        ItemList(new ArrayList<Integer>(List.of(1,2,3)));

        var queryList = new QueryList<>(LpaStudents);
        var matches= queryList.getMatches("course","Java");
        printList(matches);

        var students2021 = queryList.getMatches(students,"courseYear","2021");
        printList(students2021);
    }

    public static void printList(List<? extends Student> students) {
        for(var student : students) {
//            System.out.println(student.getCourseYear()+" : "+student);
            System.out.println(student);
        }
        System.out.println();
    }
    public static void ItemList(List<?> list) {
        for(var element : list) {
            if(element instanceof String) {
                System.out.println("String : "+element);
            } else if (element instanceof Integer) {
                System.out.println("Integer : "+element);
            }
        }
    }
}
