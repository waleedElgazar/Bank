package Factory;

import Factory.Banks.Alahly;
import Factory.Banks.Mist;
import Factory.inter.Notification;

public class NotifyController {
    public Notification Notifer(int code){
        if (code==1){
            return new Alahly();
        }else{
            return new Mist();
        }
    }
}
