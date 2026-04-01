package jump2java;

public class jun08 {
    void sayNick(String nick) {
        if ("야호".equals(nick)) {
            return;
        }
        System.out.println("김하준은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
    	jun08 sample = new jun08();
        sample.sayNick("야호");
        sample.sayNick("퉁퉁이");
    }
}
