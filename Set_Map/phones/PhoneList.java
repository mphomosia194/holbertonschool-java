import java.util.ArrayList;
import java.util.HashMap;

public class PhoneList {

    private HashMap<String, ArrayList<Phone>> phones;

    public PhoneList() {
        phones = new HashMap<>();
    }

    public void addPhone(String name, Phone phone) {
        if (!phones.containsKey(name)) {
            phones.put(name, new ArrayList<Phone>());
        }
        phones.get(name).add(phone);
    }

    public ArrayList<Phone> isFind(String name) {
        if (phones.containsKey(name)) {
            return phones.get(name);
        }
        return null;
    }
}
