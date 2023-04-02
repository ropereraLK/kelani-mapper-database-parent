package io.github.ropereralk.kelani.mapper.util.constants.tools;

import io.github.ropereralk.kelani.mapper.exceptions.SanitizerException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;

public class SanitizerTest {
    Sanitizer sanitizer;

    @Test
    public void testNull(){
        try {
            sanitizer.sanitize(null);
        }catch (SanitizerException sae){
        assertEquals("Input Sanitization Failed",sae.getMessage());
        }
    }

    @Test
    public void testEmptyString(){
        try {
            sanitizer.sanitize("");
        }catch (SanitizerException sae){
            assertEquals("Input Sanitization Failed",sae.getMessage());
        }
    }

    @Test
    public void testValidString(){
        assertEquals("a",  sanitizer.sanitize("a"));
    }

}