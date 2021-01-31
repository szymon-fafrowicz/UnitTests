package pl.coderslab.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilsTest {

    @Test
    public void validatePasswordWithLowerCase() {
        String password = "slabehaslo7$";
        assertFalse(PasswordUtils.validatePasswordStrength(password));
    }

    @Test
    public void validatePasswordWithUpperCase() {
        String password = "SLABEHASLO7$";
        assertFalse(PasswordUtils.validatePasswordStrength(password));
    }

    @Test
    public void validatePasswordShorterThan7() {
        String password = "Slab7$";
        assertFalse(PasswordUtils.validatePasswordStrength(password));
    }

    @Test
    public void validatePasswordNoNumber() {
        String password = "Slabehaslo$";
        assertFalse(PasswordUtils.validatePasswordStrength(password));
    }

    @Test
    public void validatePasswordNoSpecialChar() {
        String password = "Slabehaslo7";
        assertFalse(PasswordUtils.validatePasswordStrength(password));
    }

    @Test
    public void validatePassworCorrect() {
        String password = "Haslo7$@";
        assertTrue(PasswordUtils.validatePasswordStrength(password));
    }

    @Test
    public void test() {
        String password = "Slabehasl3o$!4sa";
        assertTrue(PasswordUtils.validatePasswordStrength(password));
    }



}