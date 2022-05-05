package equalsHashCode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Exam, String> exams = new HashMap<>();
        Exam exam1 = new Exam(1, "04.07.2021", 10);
        Exam exam2 = new Exam(1, "04.07.2021", 10);
        Exam exam3 = new Exam(3, "04.07.2021", 9);
        exams.put(null, "Zero");
        exams.put(exam1, "One");
        exams.put(exam2, "Two");
        exams.put(exam3, "Three");
        exams.forEach((k, v) -> {
            System.out.println("key: " + k + " = " + "value: " + v);
        });
        System.out.println(exams.get(exam1));
        System.out.println(exams.get(exam2));



    }


}
