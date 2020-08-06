import java.math.BigDecimal;

public class Hello {

	public static void main(String[] args) {
		int value1 = 0, valueMax, valueMin;//without initialize variable can not print
		valueMax = Integer.MAX_VALUE;
		valueMin = Integer.MIN_VALUE;
		
		short shortMax = Short.MAX_VALUE;
		long logMax = Long.MAX_VALUE;
		long varLong = 2342435467675675534L;
		
		float varfloat = 9f;//take 32 bit in memory
		double varDouble = 9d;//take 64 bit in memory; is more faster 
		// than float
		
		int marker = 100;
		double percentage = marker * 0.46f;
		
		boolean varBool = false;
		
		// using '\' with unicode can print some special character
		char varChar = '\u00A7';
		
		BigDecimal d1 = new BigDecimal("1.05");
		BigDecimal d2 = new BigDecimal("2.55");
		
		String var = "Hello World! \u00BB";
		
		//type casting
		short x = 5;
		int y = x;
		
		System.out.println(var);
	}

}

/*
 * Lecture Variable and data type
 * 		variable is a space in memory
 * 		data type: the type of data store in variable
 * 
 * 		java can print any character in unicode table
 * 
 * 		BigDecimal
 * 
 * 		//type casting:
 * 			implicit casting: byte->short->int->long->float->double
 * 			explicitly casting: double->float->long->int>short->byte
 * */

