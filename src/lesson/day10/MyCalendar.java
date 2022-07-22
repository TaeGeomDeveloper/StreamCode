package lesson.day10;

import java.util.Calendar;
import java.util.Random;

public class MyCalendar {
    // data     --> 변수 (필드, 속성)
    
    // process  --> 메소드
    public void viewMonth(int setYear,int setMonth) {
        // 만년 달력 생성
        // 주어진 월에 해당하는 첫날 정보와 마지막 날 정보를 어떻게 얻을 것인가?
//        int starts[] = {6,2,2,5,0,3,5,1,4,6,2,4};
//        int lastDays[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        // 2022년의 달력 생성 / 필요한 날짜 API 로 부터 가져요기
        Calendar cal = Calendar.getInstance();
        Random r = new Random();

        System.out.println("현재 시간 : " + cal.get(Calendar.HOUR) + " 시 " + cal.get((Calendar.MINUTE)) + " 분");

        // 년 월(+1) 일 설정.
        cal.set(setYear, setMonth - 1, 1);
        // 년 월
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);

        // 시작 요일
        int startDay = cal.get(Calendar.DAY_OF_WEEK);
        // 마지막 일
        int lastDay = cal.getActualMaximum(Calendar.DATE);

        System.out.println(setYear + "년 " + setMonth + "월 ");
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        for (int j = 1; j < startDay; j++) {
            System.out.print("\t");
        }
        for (int i = 0; i < lastDay; i++) {
            System.out.print((i + 1) + "\t");
            if ((startDay + i) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // 기본 메소드 생성.
        // 선택할 월 month 활당.
        // 시작 요일, 마지막일, 값 초기화
        // for 구문으로 시작 요일 만큼 공백 추가
        // for 구문으로 마지막 요일 까지 반복, 공백일 + 요일이 일요일이면 한칸씩 뛰어줌.

    }
}
