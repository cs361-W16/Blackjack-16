package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testFace{
    @Test
    public void testFace(){
        Face a = new Face("Hearts","9",9);
        assertEquals(9,a.getValue());
    }

}