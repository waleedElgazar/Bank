package Models;

public class Bank {
    int BankId;
    String Name;
    int Code;

    public Bank(int BankId, String name, int code) {
        BankId = BankId;
        Name = name;
        Code = code;
    }

    public int getBankId() {
        return BankId;
    }

    public void setId(int id) {
        BankId = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "Id=" + BankId +
                ", Name='" + Name + '\'' +
                ", Code=" + Code +
                '}';
    }
}
