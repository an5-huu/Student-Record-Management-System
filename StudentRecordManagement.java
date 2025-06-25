package com.studentrecordmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentRecordManagement {
    private List<Student> lists= new ArrayList<>();  // we use private access modifier because the lists variable can be accessed inside this class only

    public void addStudent(Student student){  // to add a new student in our list we created a method name addStudent and takes one parameter student which is an object of the Student class
        lists.add(student);
    }

    public void viewStudent() {  // to view all the student
        if (lists.isEmpty()) {
            System.out.println("No students found.");
        } else {
            // lists.forEach(System.out::println);  // prints every student in the list
            for (Student s : lists) {
                System.out.println(s);
            }
        }
    }

        public boolean updateStudent (int id, String newName , double newMarks ) {  // Update student's name and marks by their ID
            for (Student s : lists) {
                if (s.getId() == id) {  // it checks the one that I want to update and the current student's ID
                    s.setName(newName);
                    s.setMarks(newMarks);
                    return true;  // return true if the student is found and updated
                }
            }
            return false;  // and if no student found with that ID exists
        }


    public boolean deleteStudent(int id){  // delete the student from the list from their given ID
    return lists.removeIf(s -> s.getId() == id); // lists.removeIf() means it removes the student from the list if the lambda returns true
    }
}