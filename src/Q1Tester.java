
public class Q1Tester {

	public static void main(String[] args) {
		System.out.println("Test Case 1:");
		getOpChar_ReturnNotNull();
		
		System.out.println("Test Case 2:");
		getOpChar_ReturnNull();
		
		System.out.println("Test Case 3:");
		getOpString_ReturnNotNull();
		
		System.out.println("Test Case 4:");
		getOpString_ReturnNull();
		
		System.out.println("Test Case 5:");
		getSymbol_ReturnNotNull();
		
		System.out.println("Test Case 6:");
		getSymbol_ReturnNull();
		
		System.out.println("Test Case 7:");
		getHobbits_ReturnNotNull();
		
		System.out.println("Test Case 8:");
		getHobbits_ReturnNull();
		
		System.out.println("Test Case 9:");
		isLetter_ReturnTrue();
		
		System.out.println("Test Case 10:");
		isLetter_ReturnFalse();
		
		System.out.println("Test Case 11:");
		isDigit_ReturnTrue();
		
		System.out.println("Test Case 12:");
		isDigit_ReturnFalse();
		
		System.out.println("Test Case 13:");
		isWhiteSpace_ReturnTrue();
		
		System.out.println("Test Case 14:");
		isWhiteSpace_ReturnFalse();
		
		System.out.println("Test Case 15:");
		isLineBreak_ReturnTrue();
		
		System.out.println("Test Case 16:");
		isLineBreak_ReturnFalse();
	}
	
	// Test Case 1:
	// Method created to test if the getOp(char ch) method can return non-null values.
	public static void getOpChar_ReturnNotNull() {
		TokenType actualResult = Q1.getOp('+');                       // getOp method is called and used with the result being stored.
		System.out.println("Expected Result: " + TokenType.OP_ADD);   // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}
	
	
	// Test Case 2:
	// Method created to test if the getOp(char ch) method can return null values.
	public static void getOpChar_ReturnNull() {
		TokenType actualResult = Q1.getOp('a');                       // getOp method is called and used with the result being stored.
		System.out.println("Expected Result: " + "null");             // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}
	
	
	// Test Case 3:
	// Method created to test if the getOp(String s) method can return non-null values.
	public static void getOpString_ReturnNotNull() {
		TokenType actualResult = Q1.getOp("==");                       // getOp method is called and used with the result being stored.
		System.out.println("Expected Result: " + TokenType.OP_EQUAL);  // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");   
	}
	
	
	// Test Case 4:
	// Method created to test if the getOp(String s) method can return null values.
	public static void getOpString_ReturnNull() {
		TokenType actualResult = Q1.getOp("=");                       // getOp method is called and used with the result being stored.
		System.out.println("Expected Result: " + "null");             // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}
	
	
	// Test Case 5:
	// Method created to test if the getSymbol method can return non-null values.
	public static void getSymbol_ReturnNotNull() {
		TokenType actualResult = Q1.getSymbol('{');                      // getSymbol method is called and used with the result being stored.
		System.out.println("Expected Result: " + TokenType.LEFT_BRACE);  // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");     
	}
	
	
	// Test Case 6:
	// Method created to test if the getSymbol method can return null values.
	public static void getSymbol_ReturnNull() {
		TokenType actualResult = Q1.getSymbol('.');                    // getSymbol method is called and used with the result being stored.
		System.out.println("Expected Result: " + "null");              // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");   
	}
	
	
	// Test Case 7:
	// Method created to test if the getHobbits method can return non-null values.
	public static void getHobbits_ReturnNotNull() {
		TokenType actualResult = Q1.getHobbits("HobbitsSay");            // getHobbits method is called and used with the result being stored.
		System.out.println("Expected Result: " + TokenType.HOBBITS_SAY); // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");     
	}
	
	
	// Test Case 8:
	// Method created to test if the getHobbits method can return null values.
	public static void getHobbits_ReturnNull() {
		TokenType actualResult = Q1.getHobbits("Hobbitssay");         // getHobbits method is called and used with the result being stored.
		System.out.println("Expected Result: " + "null");             // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}
	
	
	// Test Case 9:
	// Method created to test if the isLetter method can return true values.
	public static void isLetter_ReturnTrue() {
		boolean actualResult = Q1.isLetter('G');                      // isLetter method is called and used with the result being stored.
		System.out.println("Expected Result: " + "true");             // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}
	
	
	// Test Case 10:
	// Method created to test if the isLetter method can return false values.
	public static void isLetter_ReturnFalse() {
		boolean actualResult = Q1.isLetter('9');                      // isLetter method is called and used with the result being stored.
		System.out.println("Expected Result: " + "false");            // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}
	
	
	// Test Case 11:
	// Method created to test if the isDigit method can return true values.
	public static void isDigit_ReturnTrue() {
		boolean actualResult = Q1.isDigit('0');                        // isDigit method is called and used with the result being stored.
		System.out.println("Expected Result: " + "true");              // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");   
	}
		
	
	// Test Case 12:
	// Method created to test if the isDigit method can return false values.
	public static void isDigit_ReturnFalse() {
		boolean actualResult = Q1.isDigit('v');                       // isDigit method is called and used with the result being stored.
		System.out.println("Expected Result: " + "false");            // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}
	
	
	// Test Case 13:
	// Method created to test if the isWhiteSpace method can return true values.
	public static void isWhiteSpace_ReturnTrue() {
		boolean actualResult = Q1.isWhiteSpace('\t');                 // isWhiteSpace method is called and used with the result being stored.
		System.out.println("Expected Result: " + "true");             // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}
	
	
	// Test Case 14:
	// Method created to test if the isWhiteSpace method can return false values.
	public static void isWhiteSpace_ReturnFalse() {
		boolean actualResult = Q1.isWhiteSpace('_');                  // isWhiteSpace method is called and used with the result being stored.
		System.out.println("Expected Result: " + "false");            // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}

	
	// Test Case 15:
	// Method created to test if the isLineBreak method can return true values.
	public static void isLineBreak_ReturnTrue() {
		boolean actualResult = Q1.isLineBreak('\n');                  // isNewLine method is called and used with the result being stored.
		System.out.println("Expected Result: " + "true");             // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}
	
	
	// Test Case 16:
	// Method created to test if the isLineBreak method can return false values.
	public static void isLineBreak_ReturnFalse() {
		boolean actualResult = Q1.isLineBreak('n');                   // isNewLine method is called and used with the result being stored.
		System.out.println("Expected Result: " + "false");            // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}
}
