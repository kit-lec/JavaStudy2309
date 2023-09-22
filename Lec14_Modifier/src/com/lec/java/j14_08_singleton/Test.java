package com.lec.java.j14_08_singleton;

public class Test {
    private int num;

    // singleton 디자인
    private Test(){  // 생성자는 private
        num = 100;
    }

    private static Test instance = null;  // 생성된 instance 참조

    // 인스턴스 생성
    public static Test getInstance(){
        if(instance == null) {    // 기존에 생성된 인스턴스가 없었다면
            instance = new Test(); // 생성한다!
        }

        return instance;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
