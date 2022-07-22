package lesson.day10;

import java.util.Collection;

public class Student  {
    private int sno;
    private String email;
    private int kor;

    private int english;
    private int math;
    private int science;
    private int history;
    private int total;
    private String dam;
    private String achieve;
    private String local;

    // 생성자
    public Student(int sno,String email,int kor,int english,
                   int math, int science, int history, int total,
                   String dam, String achieve, String local){
        this.sno = sno;
        this.email = email;
        this.kor = kor;
        this.english = english;
        this.math = math;
        this.science = science;
        this.history = history;
        this.total = total;
        this.dam = dam;
        this.achieve = achieve;
        this.local = local;
    }

    public int getSno(){
        return this.sno;
    }
    public String getEmail() {
        return email;
    }
    public int getMath() {
        return math;
    }
    public int getKor() {
        return kor;
    }
    public int getEnglish() {
        return english;
    }
    public int getScience() {
        return science;
    }
    public int getHistory() {
        return history;
    }
    public int getTotal() {
        return total;
    }
    public String getDam() {
        return dam;
    }
    public String getAchieve() {
        return achieve;
    }
    public String getLocal() {
        return local;
    }

    public void StudentInfo (){
        System.out.println(this.sno+" "+this.email+" "+this.kor+" "+
                this.english+" "+this.math+" "+this.science+" "+this.history+
                " "+this.total+" "+this.dam+" "+this.achieve+" "+this.local);
    }

}
