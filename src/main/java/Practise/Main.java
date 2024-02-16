package Practise;

import org.springframework.data.util.Predicates;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<List> evenList= s-> s.size()>=5;

        Consumer<String> str = instance -> System.out.println(instance.toLowerCase());
//        str.accept("Umer");

//        doSomething(evenList);
        runThread();
        DatabaseConnection connection = DatabaseConnection.getInstance();
        System.out.println(connection);
    }

    private static void runThread() {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }

    public static void doSomething(Predicate<List> stringPredicate){
        System.out.println(stringPredicate.test(List.of(1,2,3,4,5)));
    }
}
