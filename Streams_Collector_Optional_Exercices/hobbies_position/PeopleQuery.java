import java.util.*;
import java.util.stream.*;

public class PeopleQuery {

    public static Map<String, TreeSet<String>> getHobbiesByPosition(List<Person> people) {

        Map<String, TreeSet<String>> temp = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getPosition,
                        Collectors.flatMapping(
                                p -> p.getHobbies().stream(),
                                Collectors.toCollection(TreeSet::new)
                        )
                ));

        LinkedHashMap<String, TreeSet<String>> result = new LinkedHashMap<>();

        if (temp.containsKey("Product Owner"))
            result.put("Product Owner", temp.get("Product Owner"));

        if (temp.containsKey("Analyst QA"))
            result.put("Analyst QA", temp.get("Analyst QA"));

        if (temp.containsKey("Developer"))
            result.put("Developer", temp.get("Developer"));

        return result;
    }
}
