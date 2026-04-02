package jump2java;

	class Updater {
	    void update(Counter counter) {
	        counter.count++;
	    }
	}

	class Counter1 {
	    int count = 0;  // 객체변수
	}

	public class jun02 {
	    public static void main(String[] args) {
	        Counter1 myCounter = new Counter1();
	        System.out.println("before update:"+myCounter.count);
	        Updater myUpdater = new Updater();
	        myUpdater.update(myCounter);
	        System.out.println("after update:"+myCounter.count);
	    }
	}

