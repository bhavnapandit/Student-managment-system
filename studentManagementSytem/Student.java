package studentManagementSytem;

public class Student {
    private int Id;
    private String name;
    private int age;
    private String grade;
    subject[] marks = new subject[5];
    
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public Student(int id, String name, int age, String grade) {
        Id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "student [Id=" + Id + ", name=" + name + ", age=" + age + ", grade=" + grade + "]";
    }
    public subject[] getMarks() {
        return marks;
    }
    public void setMarks(subject[] marks) {
        this.marks = marks;
    }
    
}
