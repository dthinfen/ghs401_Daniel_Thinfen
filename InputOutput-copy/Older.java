import java.lang.Math; 
public class Older
{
    public static void main()
    {
        Student[] femaleStudents = new Student[7];
        Student[] maleStudents = new Student[7];
        String[] olderName = new String[7];
        Student f1 = new Student("f1", 8);
        Student f2 = new Student("f2", 12);
        Student f3 = new Student("f3", 10);
        Student f4 = new Student("f4", 11);
        Student f5 = new Student("f5", 12);
        Student f6 = null;
        Student f7 = null;
        Student m1 = new Student("m1", 5);
        Student m2 = new Student("m2", 12);
        Student m3 = new Student("m3", 7);
        Student m4 = new Student("m4", 11);
        Student m5 = null;
        Student m6 = new Student("m6", 10);
        Student m7 = null;
        femaleStudents [0] = f1;
        femaleStudents [1] = f2;
        femaleStudents [2] = f3;
        femaleStudents [3] = f4;
        femaleStudents [4] = f5;
        femaleStudents [5] = f6;
        femaleStudents [6] = f7;
        maleStudents [0] = m1;
        maleStudents [1] = m2;
        maleStudents [2] = m3;
        maleStudents [3] = m4;
        maleStudents [4] = m5;
        maleStudents [5] = m6;
        maleStudents [6] = m7;
        
        for (int i = 0; i < olderName.length; i++){
            
            if(maleStudents[i] == null && femaleStudents[i] == null){
                olderName [i] = "Space to rent";
            }else if(maleStudents[i] == null){
                olderName [i] = femaleStudents[i].getName();
            }else if(femaleStudents[i] == null){
                olderName [i] = maleStudents[i].getName();
            }
            else if (femaleStudents[i].getGrade() > maleStudents[i].getGrade()){
                olderName [i] = femaleStudents[i].getName();
            }else if(maleStudents[i].getGrade() > femaleStudents[i].getGrade()){
                olderName [i] = maleStudents[i].getName();
            }else{
                double count = Math.random();
                if (count < 0.5){
                    olderName [i] = femaleStudents[i].getName();
                }
                else{
                    olderName [i] = maleStudents[i].getName();
                }
            }
            
        } 
        System.out.println("Female Name\tGrade\t\tMale Name\tGrade\t\t Older Student");
        for (int i = 0; i < olderName.length; i++){
            if(femaleStudents[i] == null && maleStudents[i] == null){
                System.out.println(null + "\t\t" + null + "\t\t" + null + "\t\t" + null + "\t\t" + olderName[i]);
            }
            else if(femaleStudents[i] == null){
                System.out.println(null + "\t\t" + null + "\t\t" + maleStudents[i].getName() + "\t\t" + maleStudents[i].getGrade() + "\t\t" + olderName[i]);
            }
            else if(maleStudents[i] == null){
                System.out.println(femaleStudents[i].getName() + "\t\t" + femaleStudents[i].getGrade() + "\t\t" + null + "\t\t" + null + "\t\t" + olderName[i]);
            }
            else{                
            System.out.println(femaleStudents[i].getName() + "\t\t" + femaleStudents[i].getGrade() + "\t\t" + maleStudents[i].getName() + "\t\t" + maleStudents[i].getGrade() + "\t\t" + olderName[i]);
        }
        }
        
    }

}
