/*
 * @(#) Main.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

/**
 * Main class is to execute this project
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public class Main {

    /**
     * The main method is init the execution of a project.
     * @param args is the data of parameter for default of a project.
     *
     */
    public static void main(String args[]) {

        RomanNumber romanNumber = new RomanNumber();
        System.out.println(romanNumber.convertToDecimal("xi"));
        System.out.println(romanNumber.convertToDecimal("XI"));
        System.out.println(romanNumber.convertToDecimal(""));
        System.out.println(romanNumber.convertToDecimal("  "));
        System.out.println(romanNumber.convertToDecimal("mcmxiv"));
        System.out.println(romanNumber.convertToDecimal("MMXIX"));
        System.out.println(romanNumber.convertToDecimal("IW"));

    }
}
