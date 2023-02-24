import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Anna", "iva", 51));
        people.add(new Person("Oleg", "Sidorov", 45));
        people.add(new Person("Andrey", "Stepano", 55));
        people.add(new Person("Sasha", "Sudokova", 10));
        people.add(new Person("Maris", "Vasina", 11));
        people.removeIf(person -> person.getAge()<18);
        System.out.println(people);
    }

}
