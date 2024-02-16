package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Answer {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Amine", "Ousmane", "Computer Science", Map.of("Algorithms", 90, "Data Structures", 80, "Calculus", 85)),
                new Student("Lily-Ann", "Smith", "Mathematics", Map.of("Algorithms", 80, "Data Structures", 75, "Calculus", 88)),
                new Student("Li", "Wei", "Computer Science", Map.of("Algorithms", 92, "Data Structures", 89, "Calculus", 88)),
                new Student("Jessica", "Rodriguez", "Mathematics", Map.of("Algorithms", 85, "Data Structures", 80, "Calculus", 89)));
        String major = "Computer Science";
        Answer.findAnswer(students, major);
    }
    static void findAnswer(List<Student> students, String major) {

        List<Integer> str = students.stream()
                .filter(s->s.getMajor().equals(major))
                .flatMap(s->s.getGrades().values().stream()).collect(Collectors.toList());

        System.out.println(str);

//        return students.stream()
//                .filter(s->s.getMajor().equals(major))
//                .flatMap(s->s.getGrades().values().stream())
//                .max(Integer::compareTo).orElseGet(()->0);
    }
}
