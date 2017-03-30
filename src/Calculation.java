/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class calculates with two numbers
 *
 * @author ylhaart
 */
public class Calculation {

    int numberA;
    int numberB;
    String mark;
    int result;

    /**
     * Create new Calculation class with two numbers and a punctuation mark
     * between them
     *
     * @param numberA
     * @param numberB
     * @param mark
     */
    public Calculation(int numberA, int numberB, String mark) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.mark = mark;
    }

    /**
     * Create new Calculation class with two numbers
     *
     * @param numberA
     * @param numberB
     */
    public Calculation(int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    /**
     * A getter for 1st number
     *
     * @return
     */
    public int getNumberA() {
        return numberA;
    }

    /**
     *
     * A setter for 1st number
     *
     * @param numberA
     */
    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    /**
     * A getter for 2nd number
     *
     * @return
     */
    public int getNumberB() {
        return numberB;
    }

    /**
     * A setter for 2nd number
     *
     * @param numberB
     */
    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    /**
     * Adds the two numbers
     */
    public void addition() {
        this.result = this.numberA + this.numberB;
    }

    /**
     * Substracts one number from another
     */
    public void subtraction() {
        this.result = this.numberA - this.numberB;
    }

    /**
     * ToString method that generates the clean output
     *
     * @return this.numberA + this.mark + this.numberB + "=" + this.result
     */
    @Override
    public String toString() {
        return this.numberA + this.mark + this.numberB + "=" + this.result;
    }

}
