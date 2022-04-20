package com.company;

public class Test {
    public static void main(String[] args) {
        Family manageFamily = new Family();
        manageFamily.setAddress("Hai Phong");
        manageFamily.addMember(new Person("Dương", "interpreters", 1));
        manageFamily.addMember(new Person("Chi", "Sale", 2));
        Family manageFamily1 = new Family();
        manageFamily1.setAddress("Sai Gon");
        manageFamily1.addMember(new Person("Linh", "doctor", 1));
        manageFamily1.addMember(new Person("Phương Anh", "nurse", 2));
        manageFamily.display();

        System.out.println("After deleting");
        manageFamily.delete("Mina");
        manageFamily.display();

        manageFamily.edit("Jisoo", new Person("Rose", "Idol", 5));
        manageFamily.display();

        Family manageFamily4 = new Family();
        manageFamily4.setAddress("NA");
        manageFamily4.addMember(new Person("hi", "teacher", 1));
        manageFamily4.addMember(new Person("hh", "engineer", 2));

        Family manageFamily6 = new Family();
        manageFamily6.setAddress("VN");
        manageFamily6.addMember(new Person("thu", "singer", 1));
        manageFamily6.addMember(new Person("Hoa", "musician", 2));
        Town sc = new Town();
        sc.addFamily(manageFamily6);
        sc.addFamily(manageFamily4);
        sc.display();
        Family manageFamily5 = new Family();
        manageFamily5.setAddress("HT");
        manageFamily5.addMember(new Person("nhuAnh", "sv", 1));
        manageFamily5.addMember(new Person("hoang", "sv", 2));
        System.out.println("After fixing");
        sc.edit("NA", manageFamily5);
        sc.display();
        System.out.println("After deleting");
        sc.delete("VN");
        sc.display();

    }
}
