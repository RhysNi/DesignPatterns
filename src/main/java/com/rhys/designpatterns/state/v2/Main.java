package com.rhys.designpatterns.state.v2;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/24 12:19 上午
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person(new PersonHappyState());
        // Person person = new Person(new PersonNervousState());
        // Person person = new Person(new PersonSadState());
        person.smile();
        person.cry();
        person.say();
    }
}

class Person {
    PersonState state;

    public Person(PersonState state) {
        this.state = state;
    }

    public void smile() {
        state.smile();
    }

    public void cry() {
        state.cry();
    }

    public void say() {
        state.say();
    }
}

abstract class PersonState {
    abstract void smile();

    abstract void cry();

    abstract void say();
}

class PersonSadState extends PersonState {
    @Override
    void smile() {
        System.out.println("Sad Smile");
    }

    @Override
    void cry() {
        System.out.println("Sad Cry");
    }

    @Override
    void say() {
        System.out.println("Sad Say");
    }
}

class PersonHappyState extends PersonState {
    @Override
    void smile() {
        System.out.println("Happy Smile");
    }

    @Override
    void cry() {
        System.out.println("Happy Cry");
    }

    @Override
    void say() {
        System.out.println("Happy Say");
    }
}


class PersonNervousState extends PersonState {
    @Override
    void smile() {
        System.out.println("Nervous Smile");
    }

    @Override
    void cry() {
        System.out.println("Nervous Cry");
    }

    @Override
    void say() {
        System.out.println("Nervous Say");
    }
}