/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studlist;

/**
 *
 * @author rc
 */
import java.util.Scanner;

public class StudList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < students.length; i ++){
            System.out.println("Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].setName(input.nextLine());
        }
        
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].getName());
        }
    }
    
}
