package com.kita.second.level1.practice;

public class Tv {
	// 필드
	// 전원(isPowerOn) 채널(channel) 볼륨(volume)
	boolean isPowerOn;
	int channel;
	int volume;
	
	// 생성자
	// 기본값 전원 false, 채널 1, 볼륨 0
	public Tv() {
		isPowerOn = false;
		channel = 1;
		volume = 0;
				
	}
	
	// 메소드
	// 전원켜기(powerOn), 전원끄기(powerOff)
	// 채널올리기(channelUp), 채널내리기(channelDown)
	// 볼륨높이기(volumnUp), 볼륨낮추기(volumnDown)
	void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	

}
