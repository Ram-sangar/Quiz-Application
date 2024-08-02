package org.example;

import java.util.*;

public class Quiz_python extends Quiz_Abstract{
    Scanner sc = new Scanner(System.in);
    int correctans=0;
    int wrongans=0;
    List<String> list= new ArrayList<>();
    public void logic(String name,String course) {
        Question q1 = new Question("1,What is the maximum possible length of an identifier?\n", "A. 16", "B. 32", "C. 64", "D. None of the above","1, Explanation : There are 8 types of primitive data types- int, char, boolean, byte, long, float, short, double.");
        Question q2 = new Question("2,In which year was the Python language developed?\n ", "A. 1995", "B. 1972", "C. 1981", "D. 1989","2, Explanation : Python language was developed by Guido van Rossum in 1989.");
        Question q3 = new Question("3, Which of the following statements is correct regarding the object-oriented programming concept in Python?\n","A. Classes are real-world entities while objects are not real","B. Objects are real-world entities while classes are not real","C. Both objects and classes are real-world entities","D. All of the above","3,Explanation Objects are real-world entities while classes are not real");

        Question q4 = new Question("4,What is the method inside the class in python language?\n", "A. Object", "B. Function", "C. Attribute", "D. Argument","4, Explanation : Function is also known as the method.");
        Question q5 = new Question("5,Which of the following declarations is incorrect?\n", "A. _x = 2", "B. __x = 3", "C. __xyz__ = 5", "D. None of these","5, Explanation : All declarations will execute successfully but at the expense of low readability.");
        Question q6 = new Question("6,Why does the name of local variables start with an underscore discouraged?\n", "A. To identify the variable", "B. It confuses the interpreter", "C. It indicates a private variable of a class", "D. None of these","6, Explanation : Since there is no concept of private variables in Python language, the major underscore is used to denote variables that cannot be accessed from outside the class.");
        Question q7 = new Question("7,Which of the following is not a keyword in Python language?\n", "A. val", "B. raise", "C. try", "D. with","7, Explanation : \"val\" is not a keyword in python language.");
        Question q8 = new Question("8,Which of the following declarations is incorrect in python language?.\n", "A. xyzp = 5,000,000", "B. x y z p = 5000 6000 7000 8000", "C. x,y,z,p = 5000, 6000, 7000, 8000", "D. x_y_z_p = 5,000,000","8, Explanation : Spaces are not allowed in variable names.");
        Question q9 = new Question("9,Which of the following precedence order is correct in Python?\n", "A. Parentheses, Exponential, Multiplication, Division, Addition, Subtraction", "B. Multiplication, Division, Addition, Subtraction, Parentheses, Exponential", "C. Division, Multiplication, Addition, Subtraction, Parentheses, Exponential", "D. Exponential, Parentheses, Multiplication, Division, Addition, Subtraction","9, Explanation :  PEMDAS (similar to BODMAS).");
        Question q10 = new Question("10,Which one of the following has the highest precedence in the expression?\n", "A. Division", "B. Subtraction", "C. Power", "D. Parentheses","10, Explanation : PEMDAS (similar to BODMAS).");

        Map<Question, Character> hmap = new LinkedHashMap<>();
        hmap.put(q1, q1.getOption4().charAt(0));
        hmap.put(q2, q2.getOption4().charAt(0));
        hmap.put(q3, q3.getOption2().charAt(0));
        hmap.put(q4, q4.getOption2().charAt(0));
        hmap.put(q5, q5.getOption4().charAt(0));
        hmap.put(q6, q6.getOption3().charAt(0));
        hmap.put(q7, q7.getOption1().charAt(0));
        hmap.put(q8, q8.getOption2().charAt(0));
        hmap.put(q9, q9.getOption1().charAt(0));
        hmap.put(q10,q10.getOption4().charAt(0));




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
