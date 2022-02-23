package com.rhys.designpatterns.prototype.v1;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/23 10:13 下午
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();
        System.out.println(person2.age + "--" + person2.score);
        System.out.println(person2.location);

        System.out.println(person1.location == person2.location);
        person1.location.street = "金丰路";
        System.out.println(person2.location);
    }
}

class Person implements Cloneable {
    int age = 8;
    int score = 100;
    Location location = new Location("上丰路", 3082);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Location {
    String street;
    int rootNo;

    public Location(String street, int rootNo) {
        this.street = street;
        this.rootNo = rootNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", rootNo=" + rootNo +
                '}';
    }
}
