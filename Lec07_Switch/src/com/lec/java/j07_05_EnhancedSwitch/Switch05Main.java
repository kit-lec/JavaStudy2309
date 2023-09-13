package com.lec.java.j07_05_EnhancedSwitch;

/**
 *  Enhanced Switch, Switch Expressions
 *      Java12에 preview 등장 ~ 2020년 Java14 에서 확정
 *      기존 switch 문의 번잡함, break 누락에 따른 오류 가능성개선.
 *      화살표 case 라벨, 다중 case 라벨, switch 연산식, yield 예약어 등의 기능이 추가
 */

public class Switch05Main {

    public static void main(String[] args) {
        System.out.println("Enhanced Switch 문 ");

        Day day = Day.TUESDAY;

        // day의 길이를 출력하는 기존 switch 문 방식
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                System.out.println(6);
                break;
            case TUESDAY:
                System.out.println(7);
                break;
            case THURSDAY:
            case SATURDAY:
                System.out.println(8);
                break;
            case WEDNESDAY:
                System.out.println(9);
                break;
        } // end switch

        System.out.println("-".repeat(20));

        // 화살표 case 라벨과 다중 케이스 라벨
        // TODO

        System.out.println("\n프로그램 종료");
    } // end main()
} // end class
























