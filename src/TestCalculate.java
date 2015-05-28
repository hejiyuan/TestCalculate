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
		
		assertEquals("�����ӷ�������", 4, cal.add(1,3));
		assertEquals("�����ӷ�������", -2, cal.add(-1,-1));
		assertEquals("�����ӷ�������", 0, cal.add(1,-1));
		assertEquals("������λ������", 102, cal.add(99,3));
	}

	@Test
	public void testMinus() {
		assertEquals("����������", -1, cal.minus(1, 2));
	}

	@Test
	public void testDivide() {
		assertEquals("����������", 6, cal.divide(12, 2));
	}

	@Test
	public void testMulti() {
		assertEquals("�˷�������",20,cal.multi(10, 2));
	}
	
 	@Test(timeout=100)
 	public void testTime() throws InterruptedException{
 		int rel = cal.divide(12, 2);
 	}
	

}
