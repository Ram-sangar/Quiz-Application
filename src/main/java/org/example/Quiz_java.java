package org.example;

import java.util.*;

public class Quiz_java extends Quiz_Abstract{
    Scanner sc = new Scanner(System.in);
    int correctans=0;
    int wrongans=0;
    List<String> list= new ArrayList<>();
    public void logic(String name,String course) {
        Question q1 = new Question("1,Number of primitive data types in Java are?\n", "A. 6", "B. 7", "C. 8", "D. 9","1, Explanation : There are 8 types of primitive data types- int, char, boolean, byte, long, float, short, double.");
        Question q2 = new Question("2,Array in java are\n ", "A. Object references", "B. Objects", "C. Primitive data type", "D. None","2, Explanation : Arrays are objects in java. It is a container that holds a fixed number of items of a single type.");
        Question q3 = new Question("3,Identify the correct restriction on static methods.\n" +
                "\n" +
                "They must access only static data\n" +
                "They can only call other static methods.\n" +
                "They cannot refer to this or super.\n", "A. I and II", "B. II and III", "C. only III", "D. I,II and III","3, Explanation : Static methods must only access static data and can call other static methods. Moreover they cannot refer this or super.");


        Question q4 = new Question("4,Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class.\n", "A. final", "B. static", "C. volatile", "D. abstract","4, Explanation : Static keyword makes a variable belong to a class,rather than being defined for each instance of the class.");
        Question q5 = new Question("5,In which of the following is toString() method defined?\n", "A. java.lang.Object", "B. java.lang.String", "C. java.lang.util", "D. None","5, Explanation : toString() is defined in java.lang.Object.");
        Question q6 = new Question("6,compareTo() returns\n", "A. True", "B. False", "C. An int value", "D. None","6, Explanation : compareTo() returns an int value");
        Question q7 = new Question("7,Total constructor string class have\n", "A. 3", "B. 7", "C. 13", "D. 20","7, Explanation : String class has 13 constructors.");
        Question q8 = new Question("8,Identify the return type of a method that does not return any value.\n", "A. int", "B. void", "C. double", "D. None","8, Explanation : void does not return any value.");
        Question q9 = new Question("9,Where does the system stores parameters and local variables whenever a method is invoked?\n", "A. Heap", "B. Stack", "C. Array", "D. Tree","9, Explanation : The system stores parameters and local variables in a stack.");
        Question q10 = new Question("10,What is the implicit return type of constructor?\n", "A. No return type", "B. A class object in which it is defined", "C. void", "D. None","10, Explanation : Implicit return type of constructor is the class object in which it is defined.");

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
                list.add(map.getKey().getExplaination());
            }
        }

        //Display
        System.out.println("---------------------------------------------");
        System.out.println("Name  : "+name);
        System.out.println("Course : "+course);
        System.out.println("Quiz Correct Answer Result is : "+correctans);
        System.out.println("Quiz Wrong Answer Result is : "+wrongans);
        for(String a:list){
            System.out.println(a);
        }
        int percentage=(correctans*100)/ hmap.size();
        System.out.println("Percentage : "+ percentage );
        if(percentage>95){
            System.out.println("performance : Excellent");
        } else if (percentage<95 && percentage>80) {
            System.out.println("performance : Very Good");
        }
        else if (percentage<80 && percentage>=60) {
            System.out.println("performance : Good");
        }
        else if (percentage<60 && percentage>=45) {
            System.out.println("performance : Learn More");
        }
        else {
            System.out.println("performance : fail");
        }

        System.out.println("---------------------------------------------");
    }
}
