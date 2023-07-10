import InterfacePhHelper.Smartphone;
import InterfacePhHelper.iOS;
public class iPhone implements Smartphone, iOS{
    @Override
    public void call() {

        System.out.println("Calling from iPhone...");

    }
    @Override
    public void sms() {

        System.out.println("Sending SMS from iPhone...");

    }
    @Override
    public void internet() {

        System.out.println("Browsing internet from iPhone...");

    }

    @Override
    public void source() {

        System.out.println("iPhone is based on iOS...");

    }

}
