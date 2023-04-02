package io.github.ropereralk.kelani.mapper.util.constants.tools;

import org.junit.Before;
import org.junit.Test;

public class SanitizerTest {
    Sanitizer sanitizer;
    @Before
    public void setUp(){
        sanitizer = new Sanitizer();
    }

    @Test
    public void testNull(){
        sanitizer.sanitize("dhjh#8<html>&&!==null");
    }

}