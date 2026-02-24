public class inheritance {
    public static void main(String[] args){
        Person a = new Person();

        System.out.println(a.getFirstName());

        a.setFirstName("Me");
        System.out.println(a.getFirstName());

        a.setLastName("You");
        System.out.println(a.toString());
    }
}

class Person{
    private String firstName;
    private String lastName;
    private String gender;

    public Person(){

    }

    public Person(String name, String surname, String gender){
        this.firstName = name;
        this.lastName = surname;
        this.gender = gender;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }
    public void setLastName(String surname){
        this.lastName = surname;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    public Boolean equals(Person p){
        return (firstName.equals(p.firstName) && lastName.equals(p.lastName));
    }
}

class Teacher extends Person{
    private String department;
    private String[] courses;

    public Teacher(){

    }

    public Teacher(String department, String[] courses){
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment(){
        return department;
    }

    public String[] getCourses(){
        return courses;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setCourses(String[] courses){
        this.courses = courses;
    }

    public String toString(){
        return getFirstName() + " " + getLastName() + " " + department;
    }

    public Boolean equals(Teacher t){
        return (getFirstName().equals(t.getFirstName()) && getLastName().equals(t.getLastName()) && department.equals(t.department));
    }
}