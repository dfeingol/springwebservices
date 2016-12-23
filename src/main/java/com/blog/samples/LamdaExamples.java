package com.blog.samples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by dfeingol on 11/16/2016.
 */
public class LamdaExamples {

    /*
     * Use of new loops
     */
    private void newLoop(){
        String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

// Old looping
        for (String player : players) {
            System.out.print(player + "; ");
        }

// Using lambda expression and functional operations
        players.forEach((player) -> System.out.print(player + "; "));

// Using double colon operator in Java 8
        players.forEach(System.out::println);
    }

    private void testSnonymous(){
        // Using anonymous innerclass
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        }).start();

// Using lambda expression
        new Thread(() -> System.out.println("Hello world !")).start();

// Using anonymous innerclass
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };
// Using lambda expression
        Runnable race2 = () -> System.out.println("Hello world !");

        race1.run();
        race2.run();
    }
    /*
     * Use a comparator
     */
    private void writeAComparator(){
        String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

        Comparator comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(players,comparator);
        players.forEach((player) -> System.out.print(player + "; "));
    }
    public static void main(String args[]){

      LamdaExamples lamdaExamples = new LamdaExamples();
        lamdaExamples.writeAComparator();
    }
}
