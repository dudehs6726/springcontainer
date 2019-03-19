package com.douzone.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	
	//와이어링1
	//@Autowired
	private CompactDisc cd;
	
	//와이어링2 생성자
	//@Autowired 
	private CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	private CDPlayer() {
	}
	
	//와이어링3 메소드
	//@Autowired 
	public void setCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	//와이어링4 메소드 명칭 상관없음
	@Autowired 
	public void insertCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
}
