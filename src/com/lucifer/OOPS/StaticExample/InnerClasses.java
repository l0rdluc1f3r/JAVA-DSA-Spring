package com.lucifer.OOPS.StaticExample;

public class InnerClasses {
    static class Test {
        String name;

        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("mohit");
        Test b = new Test("jack");
    }
}
