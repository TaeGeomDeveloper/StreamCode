package lesson.day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.io.*;

public class QuizSolution {
    // 문제 풀기위한 준비작업과 문제푸는 작업
    private ArrayList<Student> testData = new ArrayList<Student>();

    public void readyTestData(String line) {
        String temp[] = line.split(",");
        testData.add(new Student(Integer.parseInt(temp[0]),temp[1],Integer.parseInt(temp[2].trim()),
                Integer.parseInt(temp[3].trim()),Integer.parseInt(temp[4].trim()),
                Integer.parseInt(temp[5].trim()), Integer.parseInt(temp[6].trim()),
                Integer.parseInt(temp[7].trim()),temp[8],temp[9],temp[10]));
    }
    public void solveQuiz1() throws IOException {
        ArrayList<Student> Quiz1 = new ArrayList<Student>();
        for(Student temp : testData){
            if(temp.getLocal().equals("B")){
                Quiz1.add(temp);
            }
        }
        Collections.sort(Quiz1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getKor()+o1.getEnglish() > o2.getKor()+o2.getEnglish()){
                    return 1;
                } else if (o1.getKor()+o1.getEnglish() < o2.getKor()+o2.getEnglish()) {
                    return -1;
                }
                return 0;
            }
        }.reversed());
        this.writeAnswer(1,String.valueOf(Quiz1.get(4).getSno()));
    }

    public void solveQuiz2() throws IOException {
        ArrayList<Student> Quiz2 = new ArrayList<Student>();
        for(Student temp : testData){
            if(temp.getLocal().equals("B")){
                Quiz2.add(temp);
            }
        }
        Collections.sort(Quiz2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getKor()+o1.getEnglish() > o2.getKor()+o2.getEnglish()){
                    return 1;
                } else if (o1.getKor()+o1.getEnglish() < o2.getKor()+o2.getEnglish()) {
                    return -1;
                }
                return 0;
            }
        });
        // 가장 점수 높은사람.
        int max = Quiz2.get(Quiz2.size()-1).getKor()+Quiz2.get(Quiz2.size()-1).getEnglish();
        //Quiz2.get(Quiz2.size()-1).StudentInfo();
        this.writeAnswer(2,String.valueOf(max));
    }
    public void solveQuiz3() throws IOException {
        int total = 0;
        ArrayList<Student> Quiz3 = new ArrayList<Student>();
        for(Student temp : testData){
            if(temp.getEnglish()+temp.getMath() > 120){
                Quiz3.add(temp);
            }
        }
        int Num[] = new int[Quiz3.size()];
        int i = 0;
        for(Student temp : Quiz3){
            if(temp.getAchieve().equals("A")){
                Num[i++] = temp.getEnglish()+temp.getMath()+5;
            }
            if(temp.getAchieve().equals("B")){
                Num[i++] = temp.getEnglish()+temp.getMath()+15;
            }
            if(temp.getAchieve().equals("C")){
                Num[i++] = temp.getEnglish()+temp.getMath()+20;
            }
        }
        for(int j = 0; j < Num.length; j++){
            total += Num[j];
        }
        this.writeAnswer(3,String.valueOf(total));
    }
    public void solveQuiz4() throws IOException {
        int count = 0;
        ArrayList<Student> Quiz4 = new ArrayList<Student>();
        for(Student temp : testData){
            if(temp.getAchieve().equals("A") || temp.getAchieve().equals("B")){
                Quiz4.add(temp);
            }
        }
        for(Student temp : Quiz4){
            if(temp.getLocal().equals("A")) {
                if(temp.getKor()+5 >= 50){
                    count++;
                }
            }
            if(temp.getLocal().equals("B")) {
                if(temp.getKor()+10 >= 50){
                    count++;
                }
            }
            if(temp.getLocal().equals("C")) {
                if(temp.getKor()+15 >= 50){
                    count++;
                }
            }
        }

        this.writeAnswer(4,String.valueOf(count));
    }
    private void writeAnswer(int quizNumber, String answer) throws IOException{
        File file = new File("Ans"+quizNumber+".txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(answer);
        pw.close();
        fw.close();
        System.out.println(quizNumber+"번 문제 해답이 저장되었습니다.");
    }
}

