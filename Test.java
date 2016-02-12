import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Before function called.");
	}

	@Test(expected=Exception.class)
	public void test() {
		int [][] Mat1 = new int[][]{{1,2,3}};
        int [][] Mat2 = new int[][]{{1},{3},{1}};
        MatrixMultiplication.MatrixMulti(Mat1,Mat2);
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void test1() {
		int [][] Mat1 = new int[][]{{1,2}};
        int [][] Mat2 = new int[][]{{1},{3},{1}};
        int [][] Mat3 = new int[][]{{5,10}};
        assertEquals(5,MatrixMultiplication.MatrixMulti(Mat1,Mat2));
        assertEquals(Mat3,MatrixMultiplication.MatrixMulti(Mat1,Mat2));
	}

}

















