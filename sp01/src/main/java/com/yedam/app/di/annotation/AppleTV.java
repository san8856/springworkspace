package com.yedam.app.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import lombok.RequiredArgsConstructor;
import lombok.ToString;

//LomBok 사용하는 방식

@Component
//@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor //final이 들어오면 필드를 가져올수가 없음
//@RequiredArgsConstructor  //필드 중 final로 선언된 필드만 따로 가져와서 생성자 구성.
//@AllArgsConstructor 얘는 있는데 그냥 사용하지마

// 생성자 주입

public class AppleTV {
	@Setter(onMethod_ = {@Autowired})
	private MarshallSpeaker speaker;
	//private final MarshallSpeaker speaker;
	
	public void powerOn() {
		System.out.println("스피커 온");
	};
	
	public void powerOff() {
		System.out.println("스피커 오프");
	};
}
