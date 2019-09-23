
public class Student
{
    private int grade;
    private String name;
    public Student()
    {
        this.grade = 0;
        this.name = null;
    }

    public Student(String myName, int myGrade){
        this.grade = myGrade;
        this.name = myName;
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    public void setName(String myName){
        this.name = myName;
    }

    public void setGrade(int myGrade){
        this.grade = myGrade;
    }
    public String toString(){
        return name + "\t\t" + grade;
    }
}
