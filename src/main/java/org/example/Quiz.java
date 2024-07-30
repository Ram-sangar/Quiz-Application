package org.example;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Quiz {
    Scanner sc = new Scanner(System.in);
    int correctans=0;
    int wrongans=0;
    public void logic() {
        Question q1 = new Question("1,Number of primitive data types in Java are?\n", "A. 6", "B. 7", "C. 8", "D. 9");
        Question q2 = new Question("2,Array in java are\n ", "A. Object references", "B. Objects", "C. Primitive data type", "D. None");
        Question q3 = new Question("3,Identify the correct restriction on static methods.\n" +
                "\n" +
                "They must access only static data\n" +
                "They can only call other static methods.\n" +
                "They cannot refer to this or super.\n", "A. I and II", "B. II and III", "C. only III", "D. I,II and III");


        Question q4 = new Question("4,Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class.\n", "A. final", "B. static", "C. volatile", "D. abstract");
        Question q5 = new Question("5,In which of the following is toString() method defined?\n", "A. java.lang.Object", "B. java.lang.String", "C. java.lang.util", "D. None");
        Question q6 = new Question("6,compareTo() returns\n", "A. True", "B. False", "C. An int value", "D. None");
        Question q7 = new Question("7,Total constructor string class have\n", "A. 3", "B. 7", "C. 13", "D. 20");
        Question q8 = new Question("8,Identify the return type of a method that does not return any value.\n", "A. int", "B. void", "C. double", "D. None");
        Question q9 = new Question("9,Where does the system stores parameters and local variables whenever a method is invoked?\n", "A. Heap", "B. Stack", "C. Array", "D. Tree");
        Question q10 = new Question("10,What is the implicit return type of constructor?\n", "A. No return type", "B. A class object in which it is defined", "C. void", "D. None");

        Map<Question, Character> hmap = new LinkedHashMap<>();
        hmap.put(q1, q1.getOption3().charAt(0));
        hmap.put(q2, q2.getOption2().charAt(0));
        hmap.put(q3, q3.getOption4().charAt(0));
        hmap.put(q4, q4.getOption1().charAt(0));
        hmap.put(q5, q5.getOption3().charAt(0));
        hmap.put(q6, q6.getOption3().charAt(0));
        hmap.put(q7, q7.getOption2().charAt(0));
        hmap.put(q8, q8.getOption2().charAt(0));
        hmap.put(q9, q9.getOption2().charAt(0));
        hmap.put(q10,q10.getOption2().charAt(0));

        System.out.println("Enter the name : ");
        String name=sc.next();

        System.out.println("Enter the course : ");
        String course=sc.next();


        for (Map.Entry<Question, Character> map : hmap.entrySet()) {
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());
            System.out.println();
            System.out.println();

            System.out.println("Enter the choice : ");
            Character ans = sc.next().charAt(0);
            Character upp = Character.toUpperCase(ans);

            if(upp== map.getValue()){
                correctans+=1;
            }
            else{
                wrongans+=1;
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("Name  : "+name);
        System.out.println("Course : "+course);
        System.out.println("Quiz Correct Answer Result is : "+correctans);
        System.out.println("Quiz Wrong Answer Result is : "+wrongans);
        int percentage=(correctans*100)/ hmap.size();
        System.out.println("Percentage : "+ percentage );
        if(percentage>95){
            System.out.println("performance : Excellent");
        } else if (percentage<95 && percentage>80) {
            System.out.println("performance : Very Good");
        }
        else if (percentage<80 && percentage>60) {
            System.out.println("performance : Good");
        }
        else if (percentage<60 && percentage>45) {
            System.out.println("performance : Learn More");
        }
        else {
            System.out.println("performance : fail");
        }

        System.out.println("---------------------------------------------");
    }
}
