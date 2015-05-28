import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCalculate {
	private Calculate cal;

	@Before
	public void setUp() throws Exception {
		cal = new Calculate();
	}

	@Test
	public void testAdd() {
		
		assertEquals("正正加法有问题", 4, cal.add(1,3));
		assertEquals("负负加法有问题", -2, cal.add(-1,-1));
		assertEquals("正负加法有问题", 0, cal.add(1,-1));
		assertEquals("正负进位有问题", 102, cal.add(99,3));
	}

	@Test
	public void testMinus() {
		assertEquals("减法有问题", -1, cal.minus(1, 2));
	}

	@Test
	public void testDivide() {
		assertEquals("除法有问题", 6, cal.divide(12, 2));
	}

	@Test
	public void testMulti() {
		assertEquals("乘法有问题",20,cal.multi(10, 2));
	}
	
 	@Test(timeout=100)
 	public void testTime() throws InterruptedException{
 		int rel = cal.divide(12, 2);
 	}
	

}
