package org.openjfx;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class workFlowTest {
	


	@Test
	public void CreateWFObjTest1() {
        workFlow testobj = new workFlow();
        assertNotNull(testobj);
    }
	
	
	@Test
	public void addToWFTest2() {
		
        workFlow testobj = new workFlow();
		testobj.addToWF(123456789,"Reviewer");
	
		assertNotNull(testobj.getReviewStack());
		assertNotNull(testobj.getApproveStack());
	}

}