package Models;

import Services.Notification;

public class Misr implements Notification {
    @Override
    public void SendNotify() {
        System.out.println("Sms sent");
    }
}
