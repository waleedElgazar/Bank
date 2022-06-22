package Models;

import Services.Notification;

public class Alahly implements Notification {
    @Override
    public void SendNotify() {
        System.out.println("Mail sent");
    }
}
