package com.lec.java.j306_formatted;
/* 서식화된 문자열 (formatted string)
 *  ● 화면에 출력할때는 -> printf()
 *
 *    printf("서식문자열", 값1, 값2....)
 *
 *  ● 문자열(String)으로 만들때는 -> String.format()
 *
 *    String.format("서식문자열", 값1, 값2....)
 *
 *  ● format specifier (서식 지정자)
 *  	%d  :  십진수 정수로 출력
 *  	%f  :  실수로 출력
 *  	%s  :  문자열 출력
 *  	%c  :  '문자하나' 출력
 *  	%x  :  16진수 정수로 출력
 *  	%%  :  % 출력
 */
public class PrintFormatMain {

    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println(pi);

        // printf : print with format
        // printf("서식문자열", 값1, 값2....)
        // 서식문자열 안에 %로 시작하는 서식문자들..

        System.out.printf("원주율 %f\n", pi);  // %f : 기본 실수 출력 (소숫점 6자리까지)
        System.out.printf("원주율 %.2f\n", pi);  // %.2f : 기본 실수 출력 (소숫점 2자리까지)

        int age = 10;
        short grade = 3;

        System.out.printf("나이는 %d 살, 학년은 %d 학년\n", age, grade);

        System.out.printf("%d, %x, %c\n", 65, 65, 65);

        // 출력폭 지정, 좌우 정렬
        System.out.printf("|%d|%d|%d|\n",100,200,300);
        System.out.printf("|%5d|%5d|%5d|\n",100,200,300);  // 폭5칸, 우측정렬
        System.out.printf("|%-5d|%-5d|%-5d|\n",100,200,300);  // 좌측정렬

        System.out.printf("|%8.2f|\n", 182.3);  // 총 8자리, 소숫점 이하 2자리


        // format 문자열을 따로 설정해서 사용
        String fmt = "주소: %s, 우편번호[%05d]";

        System.out.printf(fmt + "\n", "서울", 12345);
        System.out.printf(fmt + "\n", "광주", 44);
        System.out.printf(fmt + "\n", "대구", 776);

        System.out.println();

        // String.format()
        // 기본적으로 printf() 와 사용법은 동일함
        // 단, 화면에 출력하는게 아니라, 결과를 문자열(String) 으로 만들어서 리턴

        String result = String.format("합격률은 %.1f %%입니다.", 34.78);
        System.out.println(result);

        // Text Block 으로 포맷팅
        String textBlock = """
                {
                    "title": %s,
                    "author": %s,
                    "id": %d
                }
                """.formatted("hi", "김자까", 2);

        System.out.println(textBlock);

    }
}























