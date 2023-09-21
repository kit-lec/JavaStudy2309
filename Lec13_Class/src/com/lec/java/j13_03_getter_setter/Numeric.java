package com.lec.java.j13_03_getter_setter;

public class Numeric {
    private char ch;  // getCh, setCh
    private byte operator;  // getOperator
    private int operand1;  // getOperand1
    private int operand2;

    private boolean checked;

    // IntelliJ 의  generator 를 사용하면 손쉽게 자동 코드 생성
    // ALT + INSERT : 생성자, getter, setter 등..

    public Numeric() {
    }

    public Numeric(char ch, byte operator, int operand1, int operand2) {
        this.ch = ch;
        this.operator = operator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public byte getOperator() {
        return operator;
    }

    public void setOperator(byte operator) {
        this.operator = operator;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
}






