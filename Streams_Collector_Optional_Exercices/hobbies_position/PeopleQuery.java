import java.util.*;
import java.util.stream.*;

public class PeopleQuery {

    private static final List<String> ORDER = List.of(
        "listening to music",
        "playing soccer",
        "walking",
        "watching series",
        "watching soccer",
        "watching movies"
    );

    public static Map<String, TreeSet<String>> getHobbiesByPosition(List<Person> people) {

        Map<String, Set<String>> temp = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getPosition,
                        Collectors.flatMapping(
                                p -> p.getHobbies().stream(),
                                Collectors.toSet()
                        )
                ));

        LinkedHashMap<String, TreeSet<String>> result = new LinkedHashMap<>();

        for (String position : List.of("Product Owner", "Analyst QA", "Developer")) {
            if (temp.containsKey(position)) {

                TreeSet<String> ordered = new TreeSet<>(Comparator.comparingInt(ORDER::indexOf));
                ordered.addAll(temp.get(position));

                result.put(position, ordered);
            }
        }

        return result;
    }
}
