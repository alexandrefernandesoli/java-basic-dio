package edu.alexandre.firstweek;

public class StudentGrades {
    public static void main(String[] args) {
        // Get random from 1 to 10
        int finalGrade = (int) (Math.random() * 10) + 1;
        System.out.println("Your final grade is: " + finalGrade);

        if(finalGrade < 6) {
            System.out.println("You failed the course!");
        } else if(finalGrade == 6) {
            System.out.println("OH YES! You got a 6!");
        } else {
            System.out.println("You passed the course!");
        }
    }
}
