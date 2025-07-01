package com.yedam.app.di;

// 기존 자바 방식

//public class DefaultMain {
//	public static void main(String[] args) {
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//	}
//}
//생성자를 기반으로 스피커를 받을때는 생성자에서 호출 해야함.
public class DefaultMain {
	public static void main(String[] args) {
		SonySpeaker speaker = new SonySpeaker();
		// 생성자를 기반으로 필드값 세팅
//		SamsungTV tv = new SamsungTV(speaker);
		//setter를 기반으로 필드값 세팅
		// 유연하게 필드값을 제어 할때 사용.
		SamsungTV tv = new SamsungTV();
		tv.setSpeaker(speaker);
		tv.powerOn();
	}
}