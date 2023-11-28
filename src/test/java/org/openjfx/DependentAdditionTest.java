package org.openjfx;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


import org.junit.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class DependentAdditionTest {

    @Test
    public void dependentCreationTest1(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                "1234", "Mary","5678","mary@gmail.com");
        assertNotNull(dependent);
    }

    @Test
    public void dependentCreationTest2(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                "1234", "Mary","5678","mary@gmail.com");
        
        
        assertEquals(dependent.getName(),"Tom");
        assertEquals(dependent.getDateOfBirth(),"09/03/2002");
        assertEquals(dependent.getAddress(),"1234 Road" );
        assertEquals(dependent.getAlienNum(), "1234");
        assertEquals(dependent.getApplicantName(),"Mary");
        assertEquals(dependent.getApplicantAlienNum(),"5678");
        assertEquals(dependent.getApplicantEmail(), "mary@gmail.com");
    }

    /*
     * Creates an empty dependent and sets the values
     */
    @Test
    public void dependentCreationTest3(){

        DependentAddition dependent = DependentAddition.dependentCreation();

        dependent.setName("Tom");
        dependent.setDateOfBirth("09/03/2002");
        dependent.setAddress("1234 Road");
        dependent.setAlienNum("1234");
        dependent.setApplicantName("Mary");
        dependent.setApplicantAlienNum("5678");
        dependent.setApplicantEmail("mary@gmail.com");
        
        assertEquals(dependent.getName(),"Tom");
        assertEquals(dependent.getDateOfBirth(),"09/03/2002");
        assertEquals(dependent.getAddress(),"1234 Road" );
        assertEquals(dependent.getAlienNum(), "1234");
        assertEquals(dependent.getApplicantName(),"Mary");
        assertEquals(dependent.getApplicantAlienNum(),"5678");
        assertEquals(dependent.getApplicantEmail(), "mary@gmail.com");

    }
    
    /**
     * successfully validates because correct dependent information
     */
    @Test
    public void validateDependentTest1(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                "1234", "Mary","5678","mary@gmail.com");
        assertTrue(dependent.validateDependent(dependent));
    }

}
