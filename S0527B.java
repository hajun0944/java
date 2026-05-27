package jump2java;

interface Remote {
	void powerOn();
	void poweroff();
}

class TV implements Remote {
	public void powerOn() {
		System.out.println("TV 켜짐");
	}
}

class Aircon implements Remote {
	public void powerOn() {
		System.out.println("에어컨 켜짐");
	}
}

public class S0527B {
	public static void main(String[] args) {
		TV tv = new TV();
		Aircon aircon = new Aircon();
		tv.powerOn();
		aircon.powerOn();
		
		Remote tv2 = new TV();
		Remote aircon2 = new Aircon();
		tv2.powerOn();
		aircon2.powerOn();
	}
}
