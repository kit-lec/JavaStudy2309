package com.lec.java.j13_07_Lombok;


import lombok.*;

/**
 * Lombok 의 주요 어노테이션 (annotation 들)
 *     https://projectlombok.org/features/
 *
 * @Getter → getter 생성
 * @Setter → setter 생성
 * @ToString → toString() 생성
 * @ToString.Exclude  → toString() 에서 제외
 * @Data → getter, setter, toString, equals, hashCode 생성 ★
 * @NoArgsConstructor  → 기본생성자 ★
 * @AllArgsConstructor  → 모든 필드에 대한 매개변수 갖는 생성자
 * @RequiredArgsConstructor → @NonNull 이 붙은 필드의 생성자
 * @Builder   →   builder pattern 제공
 * @Builder.Default   → 빌드 과정에서 생략되면 기본값 (0/null/false)로 초기화
 *
 * @NonNull → 필드나 변수선언시 앞에 사용.  Null 이 되면 예외를 발생시켜준다.
 */


//@Getter // getter
//@Setter // setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Model {
	@NonNull
	private String title;
	@NonNull
	private int old;
	private boolean isAdult;
	private char gender;
	private short size;

	private short years;
}











