package com.lec.java.j18_07_CustomException;

// 우리가 만드는 예외 클래스
// Exception 또는 RuntimeException 클래스를 상속 받아서 만듬

// TODO : Exception 을 상속받아 예외 클래스 정의하기
public class ScoreException extends Exception  {

	// 생성자
	public ScoreException(){
        super("점수 입력 오류");
    }

    public ScoreException(String msg){
        super(msg);
    }
	
	
} // end class ScoreException




