import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneList {

    private HashMap<String, HashSet<Phone>> phones;

    public PhoneList() {
        phones = new HashMap<>();
    }

    public HashSet<Phone> addPhone(String name, Phone phone) {

        if (!phones.containsKey(name)) {
            phones.put(name, new HashSet<Phone>());
        }

        HashSet<Phone> personPhones = phones.get(name);

        if (personPhones.contains(phone)) {
            throw new IllegalArgumentException("Phone already exists for this person");
        }

        for (Map.Entry<String, HashSet<Phone>> entry : phones.entrySet()) {
            if (!entry.getKey().equals(name) && entry.getValue().contains(phone)) {
                throw new IllegalArgumentException("Phone already belongs to another person");
            }
        }

        personPhones.add(phone);
        return personPhones;
    }

    public HashSet<Phone> isFind(String name) {
        if (phones.containsKey(name)) {
            return phones.get(name);
        }
        return null;
    }
}
