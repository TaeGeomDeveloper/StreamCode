package lesson.day10;

import java.io.*;
import java.util.ArrayList;

public class StreamCode {
    //private Object DateTimeService;

    public void readFile() throws IOException {
        // Abc.1115.csv 파일 내용을 읽고 출력하기
        //Reader reader = new FileReader();
        // 파일 읽어오기
        File file = new File("./Abc1115.csv");
        FileReader fr = new FileReader(file);
        // 한줄씩 읽기
        BufferedReader br = new BufferedReader(fr);
        // 퀴즈 솔루션
        QuizSolution qs = new QuizSolution();

        String line = null;
        while((line = br.readLine())!=null){    //null은 파일의 끝을 가리킴
            qs.readyTestData(line);
        }
        qs.solveQuiz1();
        qs.solveQuiz2();
        qs.solveQuiz3();
        qs.solveQuiz4();

        br.close();
        fr.close();
    }

    /*
    public void writeFile() throws IOException {
        // 해당파일이 없으면 만들어서 실행된다.
        File file = new File("./test,txt");

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.close();
        fw.close();
    }

    public void readAndWriteFile() throws IOException {
        //Abc1115.csv 파일을 Abc1115_copy.csv파일로 복사하는 코드 작성하시오.

        // 파일 읽어오기
        File file = new File("./Abc1115.csv");
        FileReader fr = new FileReader(file);
        // 한줄씩 읽기
        BufferedReader br = new BufferedReader(fr);

        // 파일 쓰기
        File Cfile = new File("./Abc115_copy.csv");
        FileWriter fw = new FileWriter(Cfile);
        PrintWriter pw = new PrintWriter(fw);

        String line = null;
        while((line = br.readLine())!=null) {    //null은 파일의 끝을 가리킴
            pw.println(line);
        }

        br.close();
        fr.close();
        pw.close();
        fw.close();
    }
    */
}
