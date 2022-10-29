public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
    public void setAge(int age) {
        if(age<0||age>100) {
            this.age=0;
        }else {
            this.age=age;
        }
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public boolean isTeen() {
        if(this.age<=12||this.age>=20) {
            return false;
        }else {
            return true;
        }
    }
    public String getFullName() {
        if(this.firstName.isEmpty()&&this.lastName.isEmpty()) {
            return "";
        }else if(this.firstName.isEmpty()) {
            return this.lastName;
        }else if(this.lastName.isEmpty()) {
            return this.firstName;
        }else {
            String fullName=this.firstName+" "+this.lastName;
            return fullName;
        }
    }
}
