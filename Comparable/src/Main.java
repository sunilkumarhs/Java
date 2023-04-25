import java.util.Arrays;

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
        Student[] students = {new Student("Sunil"),new Student("Charan"),new Student("sunil"),new Student("Ganesh")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
class Student implements Comparable{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        Student others = (Student) o;
        return name.compareTo(others.name);
    }
}
