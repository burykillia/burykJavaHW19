import InterfacePhHelper.LinuxOS;
import InterfacePhHelper.Smartphone;

public class Android implements Smartphone, LinuxOS {
    @Override
    public void call() {

        System.out.println("Calling from Android...");

    }
    @Override
    public void sms() {

        System.out.println("Sending SMS from Android...");

    }
    @Override
    public void internet() {

        System.out.println("Browsing internet from Android...");

    }

    @Override
    public void source() {

        System.out.println("Android is based on LinuxOS...");

    }
}
