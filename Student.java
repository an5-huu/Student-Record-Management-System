package com.studentrecordmanagement;

class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks){
        this.id= id;
        this.name=name;
        this.marks=marks;
    }


    // we'll use getter and setter method for accessing and modifying the private data members
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

   @Override  // we override because it tells to Java that we're providing our own version of toString()
    public String toString(){  // and we use toString() method because it converts an object into human-readable
        return  "ID: "+ id + ", Name: " +  name + ", Marks: " + marks;
   }

}
