package com.studentrecordmanagement;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();
        Scanner sc=new Scanner(System.in);


        while(true){
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Students");
            System.out.println("4. Delete Student");
            System.out.println("5. Quit");
            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                // For adding the student
                    System.out.println("Enter ID: ");
                    int id= sc.nextInt();
                    sc.nextLine(); // will take new line
                    System.out.println("Enter name: ");
                    String name=sc.nextLine();
                    System.out.println("Enter marks: ");
                    double marks=sc.nextDouble();
                    srm.addStudent( new Student(id, name, marks));
                    System.out.println("Successfully !");
                    break;

                case 2:
                    // for viewing the students
                    srm.viewStudent();
                    break;

                case 3:
                    // Update Student
                    System.out.println("Enter the student's ID to update: ");
                    int updateId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new name: ");
                    String newName= sc.nextLine();
                    System.out.println("Enter new marks: ");
                    double newMarks=sc.nextDouble();
                    if(srm.updateStudent(updateId, newName, newMarks)) {
                        System.out.println("Updated Successfully !");
                    }
                    else {
                    System.out.println("Student not found");
                }
                    break;

                 case 4:
                    // Delete Student
                     System.out.println("Enter the ID of the student to delete: ");
                     int deleteId=sc.nextInt();
                     if(srm.deleteStudent(deleteId)){
                         System.out.println("Deleted Successfully !");
                     }
                     else {
                         System.out.println("Student not found.");
                     }
                     break;

                 case 5:
                     System.out.println("Quitting the program.");
                     return;
                default:
                    System.out.println("Invalid choice, Please try again after sometime>");
            }
        }
    }
}
