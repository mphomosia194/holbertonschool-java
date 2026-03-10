import java.util.Objects;

public class Phone {

    private String areaCode;
    private String number;

    public Phone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    @Override
    public String toString() {
        return "(" + areaCode + ") " + number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Phone)) return false;
        Phone phone = (Phone) obj;
        return areaCode.equals(phone.areaCode) && number.equals(phone.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }
}
