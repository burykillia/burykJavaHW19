public class MainProgram {
    public static void main(String[] args) {

        Android android = new Android();

        android.call();

        android.sms();

        android.internet();

        android.source();
        System.out.println();
        iPhone iPhone = new iPhone();

        iPhone.call();

        iPhone.sms();

        iPhone.internet();

        iPhone.source();
    }
}
