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

public class CharPairCount implements Comparable<CharCount> {
    
    private String pairValue;
    private int countValue;

    public CharPairCount(String s) {
        pairValue = s;
        countValue = 0;
    }
    
    public void increment() {
        countValue++;
    }
    
    public String getCharValue() {
        return pairValue;
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