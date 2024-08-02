package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name=sc.nextLine();

        System.out.println("Enter the course : ");
        String course=sc.nextLine();
        if(course.equalsIgnoreCase("JAVA")) {
            Quiz_Abstract q = new Quiz_java();
            q.logic(name, course);
        } else if (course.equalsIgnoreCase("PYTHON")) {
            Quiz_Abstract q = new Quiz_python();
            q.logic(name, course);
        }
    }

}
