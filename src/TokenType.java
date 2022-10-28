
/** This @enum called TokenType contains all of the operators, symbols, 
 * keywords, identifiers & literals and Hobbits methods that weeJava
 * utilises. These will be referenced throughout the coursework either
 * to test that they can be called appropriately or to be used when parsing
 * through a text file which contains code.
 */

public enum TokenType {
	
	
	// The single character and double character operator TokenTypes
	// --------------------------------------------------------------
	OP_MULTIPLY,       
	OP_DIVIDE,        
	OP_MOD,            
	OP_ADD,            
	OP_SUBTRACT,      
	OP_LESS,           
	OP_LESSEQUAL,      
	OP_GREATER,        
	OP_GREATEREQUAL,   
	OP_EQUAL,          
	OP_NOTEQUAL,       
	OP_ASSIGN,         
	// --------------------------------------------------------------
	
	
	// The symbol TokenTypes that are characters
	// --------------------------------------------------------------
	LEFT_PAREN,       
	RIGHT_PAREN,      
	LEFT_BRACE, 	  
	RIGHT_BRACE,       
	LEFT_BRACKET,	 
	RIGHT_BRACKET,     
	SEMICOLON,		 
	COMMA,      	  
	// --------------------------------------------------------------
	
	
	// The keyword TokenTypes that are Strings
	// --------------------------------------------------------------
	KEYWORD_IF,        
	KEYWORD_ELSE,     
	KEYWORD_INT,       
	KEYWORD_STRING,    
	KEYWORD_PUBLIC,    
	KEYWORD_CLASS,    
	KEYWORD_VOID,      
	KEYWORD_STATIC,    
	// --------------------------------------------------------------
	
	
	// The identifier TokenTypes which are either ints or Strings 
	// --------------------------------------------------------------
	IDENTIFIER,       
	INTEGER,           
	STRING,           
	// --------------------------------------------------------------
	
	
	// The weeJava method/function TokenTypes which are Strings
	// --------------------------------------------------------------
	HOBBITS_SAY,       
	HOBBITS_DO        
	// --------------------------------------------------------------
}
