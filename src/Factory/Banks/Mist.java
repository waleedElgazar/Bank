package Factory.Banks;

import Factory.inter.Notification;

public class Mist implements Notification {
    @Override
    public void SendNotify() {
        System.out.println("Sms sent");
    }
}
