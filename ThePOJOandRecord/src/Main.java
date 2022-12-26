public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            StudentRecord s = new StudentRecord("2021220"+i,
                    switch(i){
                        case 1 -> "Sunil Kumar HS";
                        case 2 -> "Charan R";
                        case 3 -> "Srinivas N";
                        case 4 -> "Sunil Kumar KV";
                        case 5 -> "Arvind Gowda";
                        default -> "Anonymous";
                    },
                    switch (i) {
                        case 1 -> "01-04-2000";
                        case 2 -> "04=06-1999";
                        case 3 -> "24-08-2000";
                        case 4 -> "17-11-2000";
                        case 5 -> "26-12-2002";
                        default -> "Anonymous";
                    },
            "MCA");
            System.out.println(s);
        }
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("");

        Student s1 = new Student("171820","Sunil","23-08-2004","MBA");
        StudentRecord sr1 = new StudentRecord("01234","Ajay", "30-12-2005", "MCA");

        System.out.println(s1);
        System.out.println(sr1);
        System.out.println("");
        s1.setCourse(s1.getCourse()+"-(Master of Business Application)");
        System.out.println(s1.getName()+" is an "+ s1.getCourse()+" student");
        System.out.println(sr1.name()+" is an "+sr1.course()+" student");
    }
}
