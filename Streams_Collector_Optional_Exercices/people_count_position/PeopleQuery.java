import java.util.*;
import java.util.stream.*;

public class PeopleQuery {

    public static Map<String, Long> getPeopleCountByPosition(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(
                        Person::getPosition,
                        Collectors.counting()
                ));
    }
}
