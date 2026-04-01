package jump2java;

	class Calculator1 {
	    static int result = 0;

	    static int add(int num) {
	        result += num;
	        return result;
	    }
	}

	class Calculator2 {
	    static int result = 0;

	    static int add(int num) {
	        result += num;
	        return result;
	    }
	}


	public class jun02 {
	    public static void main(String[] args) {
	        System.out.println(Calculator1.add(3));
	        System.out.println(Calculator1.add(4));

	        System.out.println(Calculator2.add(3));
	        System.out.println(Calculator2.add(7));
	    }
	}

