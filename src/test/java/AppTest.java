import org.junit.Assert;
import org.junit.Test;

import com.Test.App;

public class AppTest {

	@Test
	public void strTest() {
		App obj=new App();
		Assert.assertEquals("Test", obj.strTest());
	}
	@Test
	public void trueFalseTest(){
		App obj=new App();
		Assert.assertTrue(obj.trueFalse());
	}

}
