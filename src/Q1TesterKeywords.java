
public class Q1TesterKeywords {

	public static void main(String[] args) {
		System.out.println("Test Case 1 -- \"if\":");
		getKeywordIf_ReturnNotNull();
		
		System.out.println("Test Case 2 -- \"If\":");
		getKeywordIf_ReturnNull();
		
		System.out.println("Test Case 3 -- \"else\":");
		getKeywordElse_ReturnNotNull();
		
		System.out.println("Test Case 4 -- \"Else\":");
		getKeywordElse_ReturnNull();
		
		System.out.println("Test Case 5 -- \"int\":");
		getKeywordInt_ReturnNotNull();
		
		System.out.println("Test Case 6 -- \"Int\":");
		getKeywordInt_ReturnNull();
		
		System.out.println("Test Case 7 -- \"String\":");
		getKeywordString_ReturnNotNull();
		
		System.out.println("Test Case 8 -- \"string\":");
		getKeywordString_ReturnNull();
		
		System.out.println("Test Case 9 -- \"public\":");
		getKeywordPublic_ReturnNotNull();
		
		System.out.println("Test Case 10 -- \"Public\":");
		getKeywordPublic_ReturnNull();
		
		System.out.println("Test Case 11 -- \"class\":");
		getKeywordClass_ReturnNotNull();
		
		System.out.println("Test Case 12 -- \"Class\":");
		getKeywordClass_ReturnNull();
		
		System.out.println("Test Case 13 -- \"void\":");
		getKeywordVoid_ReturnNotNull();
		
		System.out.println("Test Case 14 -- \"Void\":");
		getKeywordVoid_ReturnNull();
		
		System.out.println("Test Case 15 -- \"static\":");
		getKeywordStatic_ReturnNotNull();
		
		System.out.println("Test Case 16 -- \"Static\":");
		getKeywordStatic_ReturnNull();
	}
	
	
	// Keyword Test Case 1 - Keyword "if" returning a non-null value
	public static void getKeywordIf_ReturnNotNull() {
		TokenType actualResult = Q1.getKeyword("if");                     // getKeyword method is called and tested with "if", the result is then stored.
		System.out.println("Expected Result: " + TokenType.KEYWORD_IF);   // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");      
		
	}
	
	
	// Keyword Test Case 2 - Keyword "if" returning a null value
	public static void getKeywordIf_ReturnNull() {
		TokenType actualResult = Q1.getKeyword("If");                  // getKeyword method is called and tested with "If", the result is then stored.
		System.out.println("Expected Result: " + "null");              // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");   
	}

	
	// Keyword Test Case 3 - Keyword "else" returning a non-null value
	public static void getKeywordElse_ReturnNotNull() {
		TokenType actualResult = Q1.getKeyword("else");                    // getKeyword method is called and tested with "else", the result is then stored.
		System.out.println("Expected Result: " + TokenType.KEYWORD_ELSE);  // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");      
	}
	
	
	// Keyword Test Case 4 - Keyword "else" returning a null value
	public static void getKeywordElse_ReturnNull() {
		TokenType actualResult = Q1.getKeyword("Else");               // getKeyword method is called and tested with "Else", the result is then stored.
		System.out.println("Expected Result: " + "null");             // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}
	
	
	// Keyword Test Case 5 - Keyword "int" returning a non-null value
	public static void getKeywordInt_ReturnNotNull() {
		TokenType actualResult = Q1.getKeyword("int");                    // getKeyword method is called and tested with "int", the result is then stored.
		System.out.println("Expected Result: " + TokenType.KEYWORD_INT);  // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");     
	}
	
	
	// Keyword Test Case 6 - Keyword "int" returning a null value
	public static void getKeywordInt_ReturnNull() {
		TokenType actualResult = Q1.getKeyword("Int");                 // getKeyword method is called and tested with "Int", the result is then stored.
		System.out.println("Expected Result: " + "null");              // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");   
	}
	
	
	// Keyword Test Case 7 - Keyword "String" returning a non-null value
	public static void getKeywordString_ReturnNotNull() {
		TokenType actualResult = Q1.getKeyword("String");                    // getKeyword method is called and tested with "String", the result is then stored.
		System.out.println("Expected Result: " + TokenType.KEYWORD_STRING);  // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");         
	}
	
	
	// Keyword Test Case 8 - Keyword "String" returning a null value
	public static void getKeywordString_ReturnNull() {
		TokenType actualResult = Q1.getKeyword("string");             // getKeyword method is called and tested with "string", the result is then stored.
		System.out.println("Expected Result: " + "null");             // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}
	
	
	// Keyword Test Case 9 - Keyword "public" returning a non-null value
	public static void getKeywordPublic_ReturnNotNull() {
		TokenType actualResult = Q1.getKeyword("public");                    // getKeyword method is called and tested with "public", the result is then stored.
		System.out.println("Expected Result: " + TokenType.KEYWORD_PUBLIC);  // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");         
	}
		
	
	// Keyword Test Case 10 - Keyword "public" returning a null value
	public static void getKeywordPublic_ReturnNull() {
		TokenType actualResult = Q1.getKeyword("Public");              // getKeyword method is called and tested with "Public", the result is then stored.
		System.out.println("Expected Result: " + "null");              // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");   
	}
	
	
	// Keyword Test Case 11 - Keyword "class" returning a non-null value
	public static void getKeywordClass_ReturnNotNull() {
		TokenType actualResult = Q1.getKeyword("class");                    // getKeyword method is called and tested with "class", the result is then stored.
		System.out.println("Expected Result: " + TokenType.KEYWORD_CLASS);  // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");        
	}
		
	
	// Keyword Test Case 12 - Keyword "class" returning a null value
	public static void getKeywordClass_ReturnNull() {
		TokenType actualResult = Q1.getKeyword("Class");               // getKeyword method is called and tested with "Class", the result is then stored.
		System.out.println("Expected Result: " + "null");              // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");   
	}
	
	
	// Keyword Test Case 13 - Keyword "void" returning a non-null value
	public static void getKeywordVoid_ReturnNotNull() {
		TokenType actualResult = Q1.getKeyword("void");                    // getKeyword method is called and tested with "void", the result is then stored.
		System.out.println("Expected Result: " + TokenType.KEYWORD_VOID);  // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");       
	}
		
	
	// Keyword Test Case 14 - Keyword "void" returning a null value
	public static void getKeywordVoid_ReturnNull() {
		TokenType actualResult = Q1.getKeyword("Void");                // getKeyword method is called and tested with "Void", the result is then stored.
		System.out.println("Expected Result: " + "null");              // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");   
	}
	
	
	// Keyword Test Case 15 - Keyword "static" returning a non-null value
	public static void getKeywordStatic_ReturnNotNull() {
		TokenType actualResult = Q1.getKeyword("static");                    // getKeyword method is called and tested with "static", the result is then stored.
		System.out.println("Expected Result: " + TokenType.KEYWORD_STATIC);  // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");         
	}
	
	
	// Keyword Test Case 16 - Keyword "static" returning a null value
	public static void getKeywordStatic_ReturnNull() {
		TokenType actualResult = Q1.getKeyword("Static");             // getKeyword method is called and tested with "Static", the result is then stored.
		System.out.println("Expected Result: " + "null");             // Expected and actual result printed.
		System.out.println("Actual Result: " + actualResult + "\n");  
	}
}
