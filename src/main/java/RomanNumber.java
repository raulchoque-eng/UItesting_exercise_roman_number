/*
 * @(#) RomanNumber.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * RomanNumber class is to manage a Roman number.
 * This class only verify if a Roman number is valid.
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public class RomanNumber {
    private Map<String, Integer> numbers = new HashMap<>() ;

    /**
     * The RomanNumber method is the constructor of RomanNumber class,
     * it is for build an instance of itself class.
     *
     */
    public RomanNumber(){
        initData();
    }

    /**
     * The initData method is to upload data for the class.
     *
     */
    private void initData(){
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);
    }

    /**
     * The convertToDecimal method is to convert a Roman number in decimal number.
     * @param romanNumber is the data of Roman number.
     * @return a decimal number.
     *
     */
    public int convertToDecimal(String romanNumber){
        int result = 0;

        if (validateRomanNumber(romanNumber.toUpperCase())) {
            result = getValueDecimal(romanNumber.toUpperCase());
        } else {
            System.out.println("this number: " + romanNumber + " is invalid!!");
        }
        return result;
    }

    /**
     * The validateRomanNumber method is to validate if a Roman number is valid.
     * @param number is the data of Roman number.
     * @return true if the number is Roman number otherwise false.
     *
     */
    private boolean validateRomanNumber(String number) {
        boolean res = true;
        for (int i = 0; i < number.length(); i++) {
            char letter = number.charAt(i);
            String romanNumber = Character.toString(letter);
            if (!numbers.containsKey(romanNumber)) {
                res = false;
                break;
            }
        }
        return res;
    }

    /**
     * The getValueDecimal method is to get value in decimal of a Roman number.
     * @param romanNumber is the data of Roman number.
     * @return decimal number.
     *
     */
    private int getValueDecimal(String romanNumber){
        int posSecondLetter = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < romanNumber.length(); i++) {
            String firstLetter = Character.toString(romanNumber.charAt(i));
            int value = getValue(firstLetter);
            if (posSecondLetter < romanNumber.length()) {
                String secondLetter = Character.toString(romanNumber.charAt(posSecondLetter));
                if (getValue(firstLetter) < getValue(secondLetter)) {
                    value = getValue(firstLetter) - (getValue(firstLetter) * 2);
                }
                posSecondLetter += 1;
            }
            list.add(value);
        }
        System.out.println(list);
        return getSumma(list);
    }

    /**
     * The getSumma method is to get a value of operation summa of values in a list.
     * @param list is the data from all value in decimal.
     * @return decimal number.
     *
     */
    private int getSumma(ArrayList<Integer> list){
        int res = 0;
        for (int number : list) {
            res = res + number;
        }
        return res;
    }

    /**
     * The getValue method is to get a value of Roman number map.
     * @param number is the key data of a map with all values of Roman number.
     * @return value of a key data of a map.
     *
     */
    private int getValue(String number){
        return numbers.get(number);
    }
}
