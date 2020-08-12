package com.codedifferently;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;

public class RemoveCharFromString {
    //private static final Logger logger = LoggerFactory.getLogger(RemoveCharFromString.class);

    public String remove(String word, char unwanted) {

        int strLen = word.length();
        String newStr = "";

        for (int i = 0; i <= strLen - 1; i++) {
            int restOfWord=i+1;
            if (word.charAt(i) == unwanted && i!=0) {

                newStr=word.substring(i-i,i);
                newStr+=word.substring(restOfWord);
            }
            if (word.charAt(i) == unwanted && i==0) {
                newStr = word.substring(restOfWord); //everything after index zero
                //word=newStr;
            } else {
                //cont loop
            }
        }
        return newStr;
    }

/*
    Extra Credit Flex
    public String removeRecursive(String word, char ch){
        return null;
    }*/
}
