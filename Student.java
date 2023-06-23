public class Student{
    private String name;
    private int age;
    private char grade;

    Student(String name, int age, char grade){
        setName(name);
        setAge(age);
        setGrade(grade);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGrade(char grade){
        this.grade = grade;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGrade(){
        return grade;
    }

    public String getInfo(){
        this.age = (this.age < 5 || this.age > 18)? 0 : age;
        this.grade = (this.grade < 'A' || this.grade > 'F')? 0 : grade;
        return String.format("name : [%s]%n age : [%d]%n grade : [%s]%n",name , age, grade );
    }
}