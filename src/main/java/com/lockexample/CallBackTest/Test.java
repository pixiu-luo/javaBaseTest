package com.lockexample.CallBackTest;

public class Test {
    public static void main(String[] args) {
        Student student = new Ricky();

        Teacher teacher = new Teacher(student);

        teacher.askQuestion();
    }
}
