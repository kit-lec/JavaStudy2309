package com.J04.stream연습;

import common.TravelCustomer;

import java.util.ArrayList;
import java.util.List;

/* 스트림 연습] 스트림을 활용하여 패키지 여행 비용 계산하기
여행사에 패키지 여행 상품이 있습니다. 여행 비용은 15세 이상은 100만원, 그 미만은 50만원 입니다.
고객 세 명이 패키지 여행을 떠난다고 했을 때 비용 계산과 고객 명단 검색등에 대한 연산을 스트림을 활용하여 구현해 봅니다.
고객에 대한 클래스를 만들고 ArrayList로 고객을 관리 합니다.

고객 정보는 다음과 같습니다.

CustomerLee
이름 : 이순신
나이 : 40
비용 : 100

CustomerKim
이름 : 김유신
나이 : 20
비용 : 100

CustomerHong
이름 : 홍길동
나이 :13
비용 : 50

 */
public class Stream04Main {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("== 고객 '이름'을 추가된 순서대로 출력 ==");
        // TODO

        System.out.println("== 총 여행비용 출력 ==");
        // TODO

        System.out.println("== 20세 이상 고객 '이름'을 정렬하여 출력 ==");
        // TODO

        System.out.println("\n프로그램 종료");
    } // end main()
} // end class
