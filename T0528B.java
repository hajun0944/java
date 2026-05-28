package jump2java;
abstract class Appliance {
	void info() {
		System.out.println("가전제품");
	}
	abstract void powerOn();
}

class TV extends Appliance {
	void powerOn() {
		System.out.println("TV 전원 켜짐");
	}
}

class WashingMachin extends Appliance {
	void powerOn() {
		System.out.println("세탁기 전원 켜짐");
	}
}

public class T0528B {
	public static void main(String[] args) {
		Appliance[] ap = new Appliance[2];
		ap[0] = new TV();
		ap[1] = new WashingMachin();
		
		for(int i = 0; i < ap.length; i++) {
			ap[i].info();
			ap[i].powerOn();
		}
	}
}