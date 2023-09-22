package practice.parttimer;
/*

'매 직원(PartTimer)'에 공통적으로 적용되는 자료
 - 시급 : 9860
 - 전체 직원수        각 직원별 객체 생성시 직원별로 '별칭'과 '근무지' '급여총액' 초기화 (속성)'근무지' 생략시 '113동' 으로 지정
  직원별로 '급여총액'  0으로 초기화

  직원의 급여 계산하기(동작)
    '몇시간 근무',  '+상여금'  에 따른 직원급여 계산
    '상여금' 은 지정안하면 0 으로 처리


    예]
    park = PartTimer('라이언')   // park 은 ‘라이언’ 이라는 닉네임의 직원으로 등록

    park 이 4시간 일한 급여 총액은?  → 39440
    park 이 2시간 일한 급여 총액은? → 19720
    park 이 3시간 일한 급여 + 상여급 15000 총액은? → 44580

*/

public class PartTimerMain {

    // ★ 아래 main() 코드는 손대지 마세요 ★
    public static void main(String[] args) {


/* 주석해제하세요
        System.out.println(PartTimer.TOTAL_PART_TIMERS);  // 0

        PartTimer park = new PartTimer("라이언");

        System.out.println(PartTimer.TOTAL_PART_TIMERS);  // 1
        PartTimer lee = new PartTimer("네오", "127-1동");

        System.out.println(PartTimer.TOTAL_PART_TIMERS); // 2

        System.out.println(park.getTotalWage());  // 0
        System.out.println(park.getNickName());  // 라이언
        System.out.println(park.getWorkPlace());  // 113동

        System.out.println(lee.getTotalWage());  // 0
        System.out.println(lee.getNickName());  // 네오
        System.out.println(lee.getWorkPlace());  // 127-1동

        System.out.println(park.calcTotalWage(4)); // 39440
        System.out.println(park.calcTotalWage(2)); // 19720

        System.out.println(park.getTotalWage()); // 19720

        System.out.println(park.calcTotalWage(3, 15000)); // 44580

        System.out.println(park.getTotalWage());  // 44580

*/

    } // end main()
} // end class
