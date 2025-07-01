package com.yedam.app.di;

public class SamsungTV {
	private SonySpeaker speaker;
	
//	public SamsungTV(SonySpeaker speaker) {
//		this.speaker = speaker;
//	}
	//생성자를 기반으로 필드값을 줌
	public SamsungTV(SonySpeaker speaker){
		this.speaker = speaker;
	}
	//
	//setter를 기반으로 필드값을 줌.
	public SamsungTV() {};
	
	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOn() {
		speaker.on();
	}
	
	public void powerOff() {
		speaker.off();
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
}
