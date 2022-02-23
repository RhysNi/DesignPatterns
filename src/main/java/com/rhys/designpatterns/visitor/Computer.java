package com.rhys.designpatterns.visitor;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/21 11:27 下午
 */
public class Computer {
    ComputerPart cpu = new CPU();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();

    public void accept(Visitor visitor) {
        this.cpu.accept(visitor);
        this.memory.accept(visitor);
        this.board.accept(visitor);
    }

    public static void main(String[] args) {
        PersonalVisitor pv = new PersonalVisitor();
        new Computer().accept(pv);
        System.out.println(pv.totalPrice);

        CorpVisitor cv = new CorpVisitor();
        new Computer().accept(cv);
        System.out.println(cv.totalPrice);
    }
}


abstract class ComputerPart {
    abstract void accept(Visitor visitor);

    abstract double getPrice();
}


class CPU extends ComputerPart {
    @Override
    void accept(Visitor visitor) {
        visitor.visitCpu(this);
    }

    @Override
    double getPrice() {
        return 2500;
    }
}

class Memory extends ComputerPart {

    @Override
    void accept(Visitor visitor) {
        visitor.visitMemory(this);
    }

    @Override
    double getPrice() {
        return 500;
    }
}

class Board extends ComputerPart {

    @Override
    void accept(Visitor visitor) {
        visitor.vistBoard(this);
    }

    @Override
    double getPrice() {
        return 1000;
    }
}

interface Visitor {
    void visitCpu(CPU cpu);

    void visitMemory(Memory memory);

    void vistBoard(Board board);
}

class PersonalVisitor implements Visitor {
    double totalPrice = 0.0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.9;
    }

    @Override
    public void vistBoard(Board board) {
        totalPrice += board.getPrice() * 0.9;
    }
}

class CorpVisitor implements Visitor {
    double totalPrice = 0.0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.8;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.8;
    }

    @Override
    public void vistBoard(Board board) {
        totalPrice += board.getPrice() * 0.8;
    }
}