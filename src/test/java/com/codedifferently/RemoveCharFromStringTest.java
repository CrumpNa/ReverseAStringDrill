package com.codedifferently;
import static org.junit.Assert.*;
import org.junit.Test;

public class RemoveCharFromStringTest {

    @Test
    public void removeAtBeginningTest(){
        RemoveCharFromString removeCharFromString = new RemoveCharFromString();
        String expected = "bc";
        String actual = removeCharFromString.remove("abc", 'a');
        assertEquals(expected, actual);
    }

    @Test
    public void removeAtMiddle(){
        RemoveCharFromString removeCharFromString = new RemoveCharFromString();
        String expected = "abd";
        String actual = removeCharFromString.remove("abcd", 'c');
        assertEquals(expected, actual);
    }

    @Test
    public void cornerCases(){
        RemoveCharFromString removeCharFromString = new RemoveCharFromString();
        // empty string test
        String expected = "";
        String actual = removeCharFromString.remove("", 'd');
        assertEquals(expected, actual);
    }

    @Test
    public void removeAtEnd(){
        RemoveCharFromString removeCharFromString = new RemoveCharFromString();
        String expected = "abc";
        String actual = removeCharFromString.remove("abcd", 'd');
        assertEquals(expected, actual);
    }
    /*

    @Test
    public void removeAtBeginningRecursiveTest(){
        RemoveCharFromString removeCharFromString = new RemoveCharFromString();
        assertEquals("bcdefgh", removeCharFromString.removeRecursive("abcdefgh", 'a'));
    }

    @Test
    public void removeAtMiddleRecursive(){
        RemoveCharFromString removeCharFromString = new RemoveCharFromString();
        assertEquals("abd", removeCharFromString.removeRecursive("abcd", 'c'));
    }



    @Test
    public void removeAtEndRecursive(){
        RemoveCharFromString removeCharFromString = new RemoveCharFromString();
        assertEquals("abc", removeCharFromString.removeRecursive("abcd", 'd'));
    }

    @Test
    public void cornerCasesRecursive1(){
        RemoveCharFromString removeCharFromString = new RemoveCharFromString();
        // all removable character test
        assertEquals("", removeCharFromString.remove("aaaaaaaaaaaaaa", 'a'));
    }

    @Test
    public void cornerCasesRecursive2(){
        RemoveCharFromString removeCharFromString = new RemoveCharFromString();
        // all but one removable characters
        assertEquals("b", removeCharFromString.remove("aaaaaaaaaaaaaab", 'a'));
    }
*/
}
