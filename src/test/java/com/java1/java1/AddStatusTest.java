package com.java1.java1;

import java.util.Calendar;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.java1.java1.model.StatusUpdate;
import com.java1.java1.model.StatusUpdateDao;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
@WebAppConfiguration
@Transactional
public class AddStatusTest {
	/*@Test
	public void testDummpy(){
	Long value = 7L;
	Assert.assertNotNull("value should not be null", value);
	}
	*/
	
	@Autowired
	private StatusUpdateDao statusUpdateDao;

	@Test
	public void testSave() {
		StatusUpdate status = new StatusUpdate("This is a test status update.");
		
		statusUpdateDao.save(status);
		
		  Assert.assertNotNull("Non-null ID", status.getId());
		  Assert.assertNotNull("Non-null Date", status.getAdded());
		  
		  StatusUpdate retrieved = statusUpdateDao.findById(status.getId()).get();
		  
		  Assert.assertEquals("Matching StatusUpdate", status, retrieved);
		 
	}
	
	@Test
	public void testFindLatest() {
		
		Calendar calendar = Calendar.getInstance();
		
		StatusUpdate lastStatusUpdate = null;
		
		for(int i=0; i<10; i++) {
			calendar.add(Calendar.DAY_OF_YEAR, 1);
			
			StatusUpdate status = new StatusUpdate("Status update " + i, calendar.getTime());
			
			statusUpdateDao.save(status);
			
			lastStatusUpdate = status;
		}
		
		StatusUpdate retrieved = statusUpdateDao.findFirstByOrderByAddedDesc();
		
		Assert.assertEquals("Latest status update", lastStatusUpdate, retrieved);
	}
	
	
}
