import java.util.*;
import java.util.stream.*;

public class PeopleQuery {

    public static TreeMap<String, TreeSet<Person>> getPeopleGroupedByPositionInReverseOrder(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(
                        Person::getPosition,
                        () -> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.toCollection(TreeSet::new)
                ));
    }
}
