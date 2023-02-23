import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getSurname().length() - o1.getSurname().length();
            }
        };
        Comparator<Person> comparator1 = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int comp1 = o2.getSurname().length()-o1.getSurname().length();
                if( comp1 ==0) {
                    return o2.getAge() - o1.getAge();
                }
                return comp1;
            }
        };
        List<Person> people = new ArrayList<>();
        people.add(new Person("Anna", "iva", 51));
        people.add(new Person("Oleg", "Sidorov", 45));
        people.add(new Person("Andrey", "Stepano", 55));
        Collections.sort(people,comparator1);
        System.out.println(people);
    }

}
