
public class Q1 {

	public static void main(String[] args) {
		
		
		/** Test Case 1:
		 * @parameter: character '+'
		 * @return: TokenType.OP_ADD
		 */
		TokenType op1 = getOp('+');
		System.out.println("Op1: " + op1);
		
		
		/** Test Case 2:
		 * @parameter: String "=="
		 * @return: TokenType.OP_EQUAL
		 */
		TokenType op2 = getOp("==");
		System.out.println("Op2: " + op2);
		
		
		/** Test Case 3:
		 * @parameter: Character '{'
		 * @return: TokenType.LEFT_BRACE
		 */
		TokenType sym = getSymbol('{');
		System.out.println("Symbol: " + sym);
		
		
		/** Test Case 4:
		 * @parameter: String "int"
		 * @return: TokenType.KEYWORD_INT
		 */
		TokenType keyword = getKeyword("int");
		System.out.println("Keyword: " + keyword);
		
		
		/** Test Case 5:
		 * @parameter: String "HobbitsSay"
		 * @return: TokenType.HOBBITS_SAY
		 */
		TokenType hobbits = getHobbits("HobbitsSay");
		System.out.println("Hobbits: " + hobbits);
		
		
		/** Test Case 6:
		 * @parameter: Character 'a'
		 * @return: true
		 */
		boolean letter = isLetter('a');
		System.out.println("Letter: " + letter);
		
		
		/** Test Case 7:
		 * @parameter: Character '0'
		 * @return: true
		 */
		boolean digit = isDigit('0');
		System.out.println("Digit: " + digit);
		
		
		/** Test Case 8:
		 * @parameter: Character ' '
		 * @return: true
		 */
		boolean whiteSpace = isWhiteSpace(' ');
		System.out.println("WhiteSpace: " + whiteSpace);
		
		
		/** Test Case 9:
		 * @parameter: Character '\n'
		 * @return: true
		 */
		boolean newLine = isLineBreak('\n');
		System.out.println("Newline: " + newLine);
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
}