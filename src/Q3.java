import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Q3 {

	public static void main(String[] args) {
		// Using the Scan method on the Q3Example1.txt file
		// In this test case, single-line comments are removed.
		System.out.println("## Q3Example1:");
		scan("src/Q3Example1.txt");
		
		System.out.println();
		
		// Using the Scan method on the Q3Example2.txt file
		// In this test case, multi-line comments are removed.
		System.out.println("## Q3Example2:");
		scan("src/Q3Example2.txt");
	}
	
	
	/** This method is to return the appropriate TokenType value for the single Character Operator entered.
	 * 
	 * @parameter: Character variable called "ch"
	 * @return: Operator TokenType associated with the parameter Character, from the TokenType enum.
	 * @return: If there's no TokenType value match, then the value null is returned.
	 */
	public static TokenType getOp(char ch) {
		TokenType singleOp = null;
		if (ch == '+') singleOp = TokenType.OP_ADD;
		if (ch == '-') singleOp = TokenType.OP_SUBTRACT;
		if (ch == '*') singleOp = TokenType.OP_MULTIPLY;
		if (ch == '/') singleOp = TokenType.OP_DIVIDE;
		if (ch == '%') singleOp = TokenType.OP_MOD;
		if (ch == '=') singleOp = TokenType.OP_ASSIGN;
		if (ch == '>') singleOp = TokenType.OP_GREATER;
		if (ch == '<') singleOp = TokenType.OP_LESS;
		return singleOp;
	}
	
	
	/** This method is to return the appropriate TokenType value for the double Character Operator entered.
	 * 
	 * @parameter: String variable called "s"
	 * @return: Operator TokenType associated with the parameter String (two Characters in length), from the TokenType enum.
	 * @return: If there's no TokenType value match, then the value null is returned.
	 */
	public static TokenType getOp(String s) {
		TokenType doubleOp = null;
		if (s.equals("==")) doubleOp = TokenType.OP_EQUAL;
		if (s.equals(">=")) doubleOp = TokenType.OP_GREATEREQUAL;
		if (s.equals("<=")) doubleOp = TokenType.OP_LESSEQUAL;
		if (s.equals("!=")) doubleOp = TokenType.OP_NOTEQUAL;
		return doubleOp;
	}
	
	
	/** This method is to return the appropriate TokenType value for the single Character Symbol entered.
	 * 
	 * @parameter: Character variable called "ch"
	 * @return: Symbol TokenType associated with the parameter Character, from the TokenType enum.
	 * @return: If there's no TokenType value match, then the value null is returned.
	 */
	public static TokenType getSymbol(char ch) {
		TokenType symbol = null;
		if (ch == '(') symbol = TokenType.LEFT_PAREN;
		if (ch == ')') symbol = TokenType.RIGHT_PAREN;
		if (ch == '{') symbol = TokenType.LEFT_BRACE;
		if (ch == '}') symbol = TokenType.RIGHT_BRACE;
		if (ch == '[') symbol = TokenType.LEFT_BRACKET;
		if (ch == ']') symbol = TokenType.RIGHT_BRACKET;
		if (ch == ';') symbol = TokenType.SEMICOLON;
		if (ch == ',') symbol = TokenType.COMMA;
		return symbol;
	}

	
	/** This method is to return the appropriate TokenType value for the String Keyword entered.
	 * 
	 * @parameter: String variable called "s"
	 * @return: Keyword TokenType associated with the parameter String, from the TokenType enum.
	 * @return: If there's no TokenType value match, then the value null is returned.
	 */
	public static TokenType getKeyword(String s) {
		TokenType keyword = null;
		if (s.equals("if")) keyword = TokenType.KEYWORD_IF;
		if (s.equals("else")) keyword = TokenType.KEYWORD_ELSE;
		if (s.equals("int")) keyword = TokenType.KEYWORD_INT;
		if (s.equals("String")) keyword = TokenType.KEYWORD_STRING;
		if (s.equals("public")) keyword = TokenType.KEYWORD_PUBLIC;
		if (s.equals("class")) keyword = TokenType.KEYWORD_CLASS;
		if (s.equals("void")) keyword = TokenType.KEYWORD_VOID;
		if (s.equals("static")) keyword = TokenType.KEYWORD_STATIC;
		return keyword;
	}
	
	
	/** This method is to return the appropriate TokenType value for the String weeJava Method entered.
	 * 
	 * @parameter: String variable called "s"
	 * @return: Hobbits TokenType associated with the parameter String, from the TokenType enum.
	 * @return: If there's no TokenType value match, then the value null is returned.
	 */
	public static TokenType getHobbits(String s) {
		TokenType hobbit = null;
		if (s.equals("HobbitsSay")) hobbit = TokenType.HOBBITS_SAY;
		if (s.equals("HobbitsDo")) hobbit = TokenType.HOBBITS_DO;
		return hobbit;
	}
	
	
	/** This method is to return a boolean value based on whether or not the single Character entered is a letter.
	 * 
	 * @parameter: Character variable called "ch"
	 * @return: boolean value true if the parameter Character is a letter.
	 * @return: boolean value false if the parameter Character isn't a letter.
	 */
	public static boolean isLetter(char ch) {
		boolean isLetter = false;
		if (ch >= 'a' && ch <= 'z') isLetter = true;
		if (ch >= 'A' && ch <= 'Z') isLetter = true;
		return isLetter;
	}
	
	
	/** This method is to return a boolean value based on whether or not the single Character entered is a digit.
	 * 
	 * @parameter: Character variable called "ch"
	 * @return: boolean value true if the parameter Character is a digit.
	 * @return: boolean value false if the parameter Character isn't a digit.
	 */
	public static boolean isDigit(char ch) {
		boolean isDigit = false;
		if (ch >= '0' && ch <= '9') isDigit = true;
		return isDigit;
	}
	
	
	/** This method is to return a boolean value based on whether or not the single Character entered is a White Space.
	 * 
	 * @parameter: Character variable called "ch"
	 * @return: boolean value true if the parameter Character is a White Space Character.
	 * @return: boolean value false if the parameter Character isn't a White Space Character.
	 */
	public static boolean isWhiteSpace(char ch) {
		boolean whiteSpace = false;
		if (ch == ' ') whiteSpace = true;
		if (ch == '\t') whiteSpace = true;
		return whiteSpace;
	}
	
	
	/** This method is to return a boolean value based on whether or not the single Character entered is the New Line Character.
	 * 
	 * @parameter: Character variable called "ch"
	 * @return: boolean value true if the parameter Character is the New Line Character.
	 * @return: boolean value false if the parameter Character isn't the New Line Character.
	 */
	public static boolean isLineBreak(char ch) {
		boolean newLine = false;
		if (ch == '\n') newLine = true;
		if (ch == '\r') newLine = true;
		return newLine;
	}
	
	
	/** This method is created to take in a text file path location and then parse it to remove comments
	 * 
	 * @parameter: String variable called "fname"
	 * @return: The text file but without the comments in it.
	 * @return: If the text file can't be read then the catch IOException message (from fileToString method) is printed, and the variable is returned as null.
	 */
	public static void scan(String fname) {
		String text = fileToString(fname);       
		int textLength = text.length();          // Calculate the length of the returned text.
		int index = 0;                           // Stores the index value (position value).
		
		while (index < textLength) {             // While the index is less than the determined value for the length of the text file, this code runs.
			char ch = text.charAt(index);        // Set the Character variable "letter" to the first index position.
			char nextCh = ' ';                   // Initialise the Character variable "nextLetter" to be empty.
			if (index < textLength-1) nextCh = text.charAt(index+1);  // If true, set the Character variable "nextLetter" to equal the index position + 1.
			
			// For single-line comments
			if (ch == '/' && nextCh == '/') {      // If the "//" combination is encountered
				while(!isLineBreak(ch)) {          // Keep skipping characters until a new line character is encountered, marking the end of the single-line comment.
					index++;                       // Characters are skipped by incrementing the index and
					ch = text.charAt(index);       // by setting "letter" to equal that new index.
				}
				while(!isWhiteSpace(ch)) {         // This while loop helps account for some spacing errors that may occur without it.
					index++;
					ch = text.charAt(index);
				}
				index++;                           // This index increment and the setting of "letter" to the new index also helps fix spacing errors.
				ch = text.charAt(index);
				continue;                               
			}
			
			// For multi-line comments
			if (ch == '/' && nextCh == '*') {      // If the "/*" combination is encountered
				index+=2;                          // Increment the index by 2 so as to skip the encountered /* character pair
				ch = text.charAt(index);            
				while(ch != '/') {                 // Keep skipping characters until a '/' character is encountered, marking the end of the multi-line comment.
					index++;                       // From here onwards, the approach is the exact same as the single-line comments.
					ch = text.charAt(index); 
				}
				while(!isWhiteSpace(ch)) {          
					index++;
					ch = text.charAt(index);
				}
				index++;
				ch = text.charAt(index);
				continue;
			}
			System.out.print(ch);   
			index++;                
		}
	}
	
	
	/** This method returns a String value based on whether or not the path name for the text file entered can be read.
	 * 
	 * @parameter: String variable called "fname"
	 * @return: If the text file can be read then the text is stored in a variable and returned.
	 * @return: If the text file can't be read then the catch IOException message is printed, and the variable is returned as null.
	 */
	public static String fileToString(String fname) {
		String text = null;  // String variable called Text is initialised as null.
		try {
			text = new String(Files.readAllBytes(Paths.get(fname)));  // method tries to read the text file in the given path location.
		} catch(IOException e) {
			System.out.println("Failed to read file"); // If the method cannot read the file, this code is executed.
		}
		return text; // Text value is returned.
	}
}




