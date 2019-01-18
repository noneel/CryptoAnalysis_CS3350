/**
* 
*
* @author 
* @version 1.0
* ©Copyright Cedarville University, its Computer Science faculty, and the 
* authors. All rights reserved.
* 
* File: 
* Created: Sept 2018
* Summary of Modifications:
*
* Description:
*/
package CryptoClasses;

public class CharCount implements Comparable<CharCount> {
    
    private char charValue;
    private int countValue;

    public CharCount(char c) {
        charValue = c;
        countValue = 0;
    }
    
    public void increment() {
        countValue++;
    }
    
    public char getCharValue() {
        return charValue;
    }
    
    public int getCountValue() {
        return countValue;
    }
    
    public int compareTo(CharCount other) {
        
        if(getCountValue() > other.getCountValue()) {
            return 1;
        } else if(getCountValue() < other.getCountValue()) {
            return -1;
        } else {
            return 0;
        }
        //return getCountValue() > other.getCountValue();
        //return Integer.toString(getCountValue()).compareTo(Integer.toString(other.getCountValue()));
    }
}