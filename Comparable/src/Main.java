import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer five =5;
        Integer[] others = {0,5,10,-50,50};

        for(Integer i :others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d : compareTo=%d %n",five,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"),i,val);
        }

        String name = "Sunil";
        String[] names = {"Charan","Ganesh","seena","plates","Sunil"};

        for(String i : names) {
            int val = name.compareTo(i);
            System.out.printf("%s %s %s : compareTo=%s %n",name,(val == 0 ? "==" : (val <0) ? "<" : ">"),i,val);
        }

        System.out.println("A:"+(int)'A'+" "+"a:"+(int)'a');

        Student sunil = new Student("Sunil");
        Student[] students = {new Student("Sunil"),new Student("Charan"),new Student("seena"),new Student("Ganesh")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        int result= sunil.compareTo(new Student("Ganesh"));
        System.out.println("compare Result : "+result);
    }
}
class Student implements Comparable<Student>{
    private String name;
    private static int LAST_ID = 1000;
    private static Random random = new Random();
    private int id;
    protected double gpa;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0,4);
    }

    @Override
    public String toString() {

        return "%d - %s (%.2f)".formatted(id,name,gpa);
    }

//    @Override
//    public int compareTo(Object o) {
//        Student others = (Student) o;
//        return name.compareTo(others.name);
//    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}
