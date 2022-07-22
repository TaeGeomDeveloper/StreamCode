package lesson.day10;
import java.io.IOException;
import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        StudentMain sm = new StudentMain();
        sm.StratSolvingQuiz();
    }
    public void StratSolvingQuiz(){
        StreamCode sc = new StreamCode();
        try {
            sc.readFile();
        } catch (IOException ie){
            System.out.println("파일을 읽는데 문제가 발생했습니다.");
        }
    }
}
