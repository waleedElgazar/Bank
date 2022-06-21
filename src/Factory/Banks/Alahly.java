package Factory.Banks;

import Factory.inter.Notification;

public class Alahly implements Notification {
    @Override
    public void SendNotify() {
        System.out.println("Mail sent");
    }
}
