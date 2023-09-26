package com.타입파라미터제한;

//      와일드 카드 <?>
//		upper-bounded <? extends Number>
//		lower-bounded <? super Integer>
//		generic 사용 <? extends T>

public class Generic04Main {
    public static void main(String[] args) {
        System.out.println("\n타입 파라미터 제한");

        // -----------------------------
        // 제네릭은 공변성(covariance) 이 없다
        // 공변성?
        // TODO

        System.out.println("\n프로그램 종료");
    } // end main()

} // end class


class A {}
class B extends A{}
class C extends B{}
class D extends C{}

class Box<T>{
}
