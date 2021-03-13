package com.kita.second.level2;

public class Viewer {
	Netflix nf1;
	Netflix nf2;
	Netflix nf3;
	
	
	public Viewer() {
		this.nf1 = new Netflix(2);
		this.nf2 = new Netflix(3);
		this.nf3 = new Netflix(4);
	}
	
	int watchNetflix() {
		boolean result1 = nf1.watch();
		if(false == result1) {
			stopWatching();
			return 1;
		}
		if(false == nf2.watch()) {
			stopWatching();
			return 2;
			
		}
		if(false == nf3.watch()) {
			stopWatching();
			return 3;
		}
		}
	void stopWatching() {
		System.out.println("시청을 그만둔다.");
	}
}
