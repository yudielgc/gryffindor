package com.salesforce.gryffindor;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person("Justin", "Timberlake");
       
        System.out.println(person);

        Person person2 = new Person("Justin", "Timberlake");

        //reference equality
        System.out.println(person == person2); //false

        //object equality
        System.out.println(person.equals(person2)); //true

        Person person3 = new Person("Justin", "Bieber");
       
        System.out.println(person2.equals(person3)); //true

        String st = "Star Trek";
        String st2 = "Star Trek";

        System.out.println(st == st2); //true
        System.out.println(st.equals(st2)); //true

        String st3 = new String("Star Trek");
        System.out.println(st == st3); //false
        System.out.println(st.equals(st3)); //true

        String st4 = st.substring(0, 3);
        System.out.println(st); //Star Trek
        System.out.println(st4); //Sta

        st = st.substring(0, 3);
        System.out.println(st); //Sta

        System.out.println(st2 == "Star Trek");
        System.out.println(st == st4); //false
        String i = st4.intern();
        System.out.println("Sta" == i); //true

        Person person4 = new Person("Justin", "Timberlake");

        Person person5 = person4;

        //person5.getLastName() ="Time";

        System.out.println(person4.toString());

        //NullPointerException
        //Person person6 = null;
        //System.out.println(person6.firstName.substring(0,2));
    }
}
