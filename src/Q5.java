import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Q5 {

	public static void main(String[] args) {
		System.out.println("## Q5Example1:"); 
		scan("src/Q5Example1.txt");
		
        System.out.println("\n## Q5Example2:"); 
		scan("src/Q5Example2.txt"); 
		
		System.out.println("\n## Q5Example3:"); 
		scan("src/Q5Example3.txt"); 
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

	/** This method is created to take in a text file path location and then parse it to search for compile-time errors.
	 * 
	 * @parameter: String variable called "fname"
	 * @return: The compile-time errors found in the text file code.
	 * @return: If the text file can't be read then the catch IOException message (from fileToString method) is printed, and the variable is returned as null.
	 */
	public static void scan(String fname) {
		
		String text = fileToString(fname);
		int textLength = text.length();     // Calculate the length of the returned text.
		int index = 0;                      // Stores the index value (position value).
		int lineNumber = 1;                 // Stores the line number.
		int leftBraceCount = 0;             // Stores the total number of Left Braces.
		int rightBraceCount = 0;            // Stores the total number of Right Braces.

		// All of this code runs until the index position equals that of the text file's length.
		while (index < textLength) {
			char ch = text.charAt(index);                             // set the Character variable "ch" to equal the current index position.
			char nextCh = ' ';                                        // Character variable "nextCh" initialised.
			if (index < textLength-1) nextCh = text.charAt(index+1);  // If true, set the Character variable "nextCh" to equal the index position + 1.
			
			// Only one of the following methods that are called can be "not null" or "true" for the character encountered.
			boolean letters = isLetter(ch);
			boolean whiteSpace = isWhiteSpace(ch);
			boolean newLine = isLineBreak(ch);
			boolean digit = isDigit(ch);
			TokenType symbol = getSymbol(ch);
			TokenType operator = getOp(ch);
			
			// If a space or tab Character is encountered, this code will run.
			if (whiteSpace) {
				if (isDigit(nextCh)) {   // This code runs if it picks up on an integer right after a space.
					String s = "";
					index++;
					ch = text.charAt(index);
					while (isDigit(ch)) {
						s += ch;
						index++;
						ch = text.charAt(index);
					}
					/* If the character that follows the end of the integer is a letter then this is a compile-time error in which
					 * an identifier, keyword or method has a number in front of it when it shouldn't. So, an error message is printed.
					 */
					if (isLetter(ch)) {
						System.out.println("Syntax error on token \"" + s + "\", delete this token \nat line " + lineNumber);
					}
				}
				index++;   // used to skip White space Characters.
				continue;
			}
			
			// If a new Line / line break  Character is encountered, this code will run.
			else if (newLine) {
				lineNumber++; 
				index++;      // Used to skip New Line Characters.
				continue;
			}
			
			// If a symbol is encountered, this code will run.
			else if (symbol != null) {
				if (symbol == TokenType.LEFT_BRACE) {         // If the symbol is a left brace, this code will run.
					leftBraceCount++;
				}
				else if (symbol == TokenType.RIGHT_BRACE) {   // If the symbol is a right brace, this code will run.
					rightBraceCount++;
				}
				index++;  // Used to skip other symbol Characters.
				continue;
			}
			
			// If an operator Character is encountered, this code will run.
			else if (operator != null || ch == '!') {
				if (operator != null && getOp(nextCh) != null || ch == '!' && nextCh == '=') {
					index+=2;  // Used to skip double Character operators.
					continue;
				}
				index++;  // Used to skip single Character operators.
				continue;
			}
			
			// if a word that isn't a string literal is encountered, this code will run.
			else if (letters) {
				String word = "";
				word += ch;
				index++;
				while (index < textLength) {
					ch = text.charAt(index);
					if (isLetter(ch)) {
						word += ch;
						index++;
					}
					else {
						break;
					}
				}
				TokenType keyword = getKeyword(word);
				TokenType hobbit = getHobbits(word);
				
				if (keyword != null) {
					continue;                 // Used to skip keywords.
				}
				else if (hobbit != null) {
					continue;                 // Used to skip weeJava Hobbits methods.
				}
				else {
					continue;                 // Used to skip Identifiers.
				}
			}
			
			// If an integer is encountered 
			else if (digit) {
				String number = "";
				number += ch; 
				index++;
				while (index < textLength) {
					ch = text.charAt(index);
					if (isDigit(ch)) {
						number += ch;
						index++;
					}
					else {
						break;
					}
				}
				continue;  // Used to skip any integer of any length.
			}
			
			// If a string literal is encountered.
			else if (ch == '\"') {
				index++;
				while (index < textLength-1) {
					ch = text.charAt(index);
					nextCh = text.charAt(index+1);
					if(ch != '\"') {
						/* This code checks to see if the String literal has been properly closed with double 
						 * quotation marks, if it hasn't then this is a compile-time error and an error message
						 * is printed.
						 */
						if (ch != '\"' && nextCh == ')' || ch != '\"' && ch != ')' && nextCh == ';') {
							System.out.println("String literal is not properly closed by a double-quote \nat line " + lineNumber);
							break;
						}
						index+=1;
					}
					else if (ch == '\"') {
						index++;
						break;
					}
				}
				continue; // Used to skip properly enclosed String literals.
			}
			
			// If the character encountered is something that hasn't been defined previously, this code will run.
			else {
				index++;   // Used to skip undefined Characters.
				continue;
			}
		}
		/* Checks to see if there is only one missing right brace. Seeing as how we are dealing
		 * with the class Body, if there were two missing right braces then the placement of them
		 * would have to be more specific and defined. So, for the sake of only properly closing the 
		 * class Body, this code will work.
		 */
		if ((leftBraceCount - rightBraceCount) == 1) {
			System.out.print("Syntax error, insert \"}\" to complete class Body \nat line " + lineNumber);
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
