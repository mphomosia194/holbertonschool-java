public class Phone {

    private String areaCode;
    private String number;

    public Phone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String toString() {
        return "(" + areaCode + ") " + number;
    }
}
