import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Q4 {

	public static void main(String[] args) {
		
		// Using the Scan method on the WeeJavaExample.txt file
		scan("src/WeeJavaExample.txt");
		
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
	
	
	/** This method is created to parse through text files containing code, in order to deduce what each character is in weeJava.
	 * 
	 * @parameter: String variable called "fname"
	 * @return: Each character within the text file, along with its respective TokenType value and the line number it was encountered on.
	 * @return: If the text file can't be read then the catch IOException message (from fileToString method) is printed, and the variable is returned as null.
	 */
	public static void scan(String fname) {
		
		String text = fileToString(fname);  
		int textLength = text.length();     // Calculate the length of the returned text.
		int index = 0;                      // Stores the index value (position value).
		int lineNumber = 1;                 // Stores the line number.
		
		
		// All of this code runs until the index position equals that of the text file's length.
		while (index < textLength) {
			char ch = text.charAt(index);                              // set the Character variable "ch" to equal the current index position.
			char nextCh = ' ';                                         // Character variable "nextCh" initialised.
			if (index < textLength-1) nextCh = text.charAt(index+1);   // If true, set the Character variable "nextCh" to equal the index position + 1.
			
			// Only one of the following methods that are called can be "not null" or "true" for the character encountered.
			boolean letters = isLetter(ch);              
			boolean whiteSpace = isWhiteSpace(ch);       
			boolean newLine = isLineBreak(ch);             
			boolean digit = isDigit(ch);                
			TokenType symbol = getSymbol(ch);            
			TokenType operator = getOp(ch);              
			
			
			// If a space or tab Character is encountered, this code will run.
			if (whiteSpace) {
				index++;             // used to skip White space Characters.
				continue;            
			}    
			
			
			// If a new Line / line break  Character is encountered, this code will run.
			else if (newLine) {
				lineNumber++;   
				index++;        // Used to skip New Line Characters.
				continue;       
			}
			
			// If a symbol is encountered, this code will run.
			else if (symbol != null) {
				System.out.println(lineNumber + ", " + symbol + ", " + ch); 
				index++;                                                     
				continue;                                                    
			}
			
			
			// If an operator Character is encountered, this code will run.
			else if (operator != null || ch == '!') {
				if (operator != null && getOp(nextCh) != null || ch == '!' && nextCh == '=') {  // If the operator encountered is two Characters long, run this code.
					String doubleOp = "";                                                       
					doubleOp += ch;                                                             
					doubleOp += nextCh;                                                        
					TokenType stringOperator = getOp(doubleOp);                                 
					System.out.println(lineNumber + ", " + stringOperator + ", " + doubleOp);   
					index+=2;                                                                   // Increase the Character index by 2 in order to account for the operator being two characters long.
					continue;                                                                   
				}
				System.out.println(lineNumber + ", " + operator + ", " + ch);  // If it's a single character operator, this code will run.
				index++;                                                       
				continue;                                                      
			}
			
			
			// if a word that isn't a string literal is encountered, this code will run.
			else if (letters) {
				String word = "";               
				word += ch;                     // Add the current letter Character to the String.
				index++;                        
				while (index < textLength) {    // While the index is less than the text length, this code runs
					ch = text.charAt(index);    
					if (isLetter(ch)) {         // if the Character is a letter, add it to the String and increase the Character index by one to move on to the next one.
						word += ch;
						index++;
					}
					else {                      // If the character becomes a non-letter Character, break out of the while loop.
						break;
					}
				}
				TokenType keyword = getKeyword(word);  
				TokenType hobbit = getHobbits(word);   
				
				if (keyword != null) {                                              // If the string is a keyword, this code will run.
					System.out.println(lineNumber + ", " + keyword + ", " + word);  
				}
				else if (hobbit != null) {                                          // If the string is a weeJava Hobbits method, this code will run.
					System.out.println(lineNumber + ", " + hobbit + ", " + word);   
				}
				else {                                                                           // If the string is neither of the above, this code will run.
					System.out.println(lineNumber + ", " + TokenType.IDENTIFIER + ", " + word);  
				}
				continue;  
			}
			
			
			// If an integer is encountered 
			else if (digit) {
				String number = "";             // Initialise a string variable to store the integer number (for printing purposes).
				number += ch;                   // Add the current number Character to the String.
				index++;                        
				while (index < textLength) {    // While the index is less than the text length, this code runs
					ch = text.charAt(index);    
					if (isDigit(ch)) {          // if the Character is a digit, add it to the String and increase the Character index by one to move on to the next one.
						number += ch;
						index++;
					}
					else {                      // If the character becomes a non-digit Character, break out of the while loop.
						break;
					}
				}
				System.out.println(lineNumber + ", " + TokenType.INTEGER + ", " + number); 
				continue;   
			}
			
			
			// If a string literal is encountered.
			else if (ch == '\"') {
				String wordLiteral = "";        
				wordLiteral += ch;              // Add the current number Character to the String.
				index++;                        
				while (index < textLength) {    // While the index is less than the text length, this code runs
					ch = text.charAt(index);    
					if(ch != '\"') {            // If the character isn't the " Character, add it to the String and increase the Character index by one to move on to the next one.
						wordLiteral += ch;
						index++;
					}
					else if (ch == '\"') {      // If the character is the " Character, add it to the String and increase the Character index by one to move on to the next one.
						wordLiteral+= ch;
						index++;
						break;
					}
				}
				System.out.println(lineNumber + ", " + TokenType.STRING + ", " + wordLiteral);  
				continue;   
			}
			
			
			// If the character encountered is something that hasn't been defined previously then it will be marked as an error character.
			else {
				System.out.println("Something unexpected was encountered on line number: " + lineNumber + ", at index: " + index + ", for this character: " + ch);
				index++;
				continue;
			}
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
			System.out.println("Failed to read file");  // If the method cannot read the file, this code is executed.
		}
		return text;  // Text value is returned.
	}
}
