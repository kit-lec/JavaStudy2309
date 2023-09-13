package com.lec.java.j07_06_SwitchExpressions;

import com.lec.java.j07_05_EnhancedSwitch.Day;

/**
 * Switch Expressions
 *
 * ※참고
 *   식(expression) 과 문(statement) 의 차이!
 *   '식'은 결괏값(리턴값)이 있다
 *   '문'은 컴파일러가 '실행'하는 모든 구문들.  (여기에는 expression 도 포함된다)
 */

public class Switch06Main {
    public static void main(String[] args) {
        Day day = Day.THURSDAY;  // 외부 클래스니까 import 필요

        // 기본 switch 문 방식으로 day 의 길이를 변수에 저장
        {
            int numLetters;
            switch (day) {
                case MONDAY:
                case FRIDAY:
                case SUNDAY:
                    numLetters = 6;
                    break;
                case TUESDAY:
                    numLetters = 7;
                    break;
                case THURSDAY:
                case SATURDAY:
                    numLetters = 8;
                    break;
                case WEDNESDAY:
                    numLetters = 9;
                    break;
                default:
                    numLetters = -1;
            } // end switch

            System.out.println("numLetters: " + numLetters);
        }

        System.out.println("-".repeat(20));

        // switch expressions(식) 사용
        {
            int numLetters = 0;

            // TODO

            System.out.println("numLetters: " + numLetters);
        }

        System.out.println("-".repeat(20));

        // yield 키워드 사용
        // switch 연산식에서 길이를 return하기 전에 특정 메시지를 출력하고 싶으면 yield 사용
        {
            day = Day.MONDAY;
            int numLetters = 0;

            // TODO

            System.out.println("numLetters: " + numLetters);
        }

        System.out.println("-".repeat(20));

        // switch 식에선 enum타입(열거타입)을 사용하는 이유
        {
            String s = "MONDAY";           // string 의 경우
            int numLetters = 0;

            // TODO

            System.out.println("numLetters: " + numLetters);
        }

    } // end main()
} // end class




























