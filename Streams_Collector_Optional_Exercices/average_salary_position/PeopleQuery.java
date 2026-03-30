import java.util.*;
import java.util.stream.*;

public class PeopleQuery {

    public static Map<String, Double> getAverageSalaryByPosition(List<Person> people) {

        Map<String, Double> temp = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getPosition,
                        Collectors.averagingDouble(Person::getSalary)
                ));

        LinkedHashMap<String, Double> result = new LinkedHashMap<>();

        if (temp.containsKey("Product Owner"))
            result.put("Product Owner", temp.get("Product Owner"));

        if (temp.containsKey("Analyst QA"))
            result.put("Analyst QA", temp.get("Analyst QA"));

        if (temp.containsKey("Developer"))
            result.put("Developer", temp.get("Developer"));

        return result;
    }
}
