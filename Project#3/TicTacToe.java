/** ---------------------------------------------
* This tic-tac-toe game works almost the same with 
* the traditional one. However, there is only a little
* extension on this game that either three characters
* of x or o on the edge, or four characters on diagonal, 
* row, or column, this game would finish.
* Class: CS 107, Fall 2011
* Lab: 	Venkatakumar Srinivasan, Tue. 9:00 AM
* @author Jian Heng Feng
* @version February 19, 2012
* ---------------------------------------------- */ 
import java.util.Scanner;
public class TicTacToe {

	Scanner keyboard = new Scanner( System.in); 
	char s0='.', s1='.', s2='.', s3='.', s4='.',        
	     s5='.', s6='.', s7='.', s8='.', s9='.',
	     s10='.',s11='.',s12='.',s13='.',s14='.',
	     s15='.',s16='.',s17='.',s18='.',s19='.',
	     s20='.',s21='.',s22='.',s23='.',s24='.';
	int moveNumber = 1;
	final int BOARD_SIZE = 25;
    String userInput;
    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe theTacTicToeInstance = new TicTacToe();// create an instance of this class
		theTacTicToeInstance.mainLoop();       // call a non-static method to do everything else
		
	}
    
	

    void mainLoop()  
    {    
    	// Instruction of the game
    	System.out.println("Welcome to the TacTicToe game. You need to choose the posstion on the \n"
				+ "board in order to play the game. For instance, if you want to choose the \n"
				+ "first position as your initial input, you need to use a1. Then the second \n"
				+ "row of the first column is b1, and so on, and so on. \n");
    	System.out.println("The initial board is:");
    	displayBoard();// call the method from the board

       	while( notDone() ) 
       	{
       	UsersMovement(); // call the method from UsersMovement
       	putValue();// call the method from putValue
        displayBoard();// call the method from the board and with updated value
       	}
       	if (moveNumber%2 != 0)
    		System.out.println("player2 wins");
    	else
    		System.out.println("player1 wins");
    	}//end while( notDone()...
    	
   
    private void UsersMovement()
    {
    	System.out.println(moveNumber + ". Enter row position and column position: ");
   		userInput = keyboard.next();
   		userInput = userInput.toLowerCase();
		if( userInput == "x") 
		{
    		// exit the program 
    		System.exit( -1);
    	}
	      
 
		
	}
    private void putValue()//store the value into the board
    {
    	char player;
    	if (moveNumber%2 == 0)
    		player = 'o';
    		else
    		player = 'x';
        if (userInput.equals("a1") && (s0 == '.'))
        {
        	s0 = player;
        	moveNumber++;
        }
        if (userInput.equals("a2") && (s1 == '.'))
        {
        	s1 = player;
        	moveNumber++;
        }
        if (userInput.equals("a3") && (s2 == '.'))
        {
        	s2 = player;
        	moveNumber++;
        }
        if (userInput.equals("a4") && (s3 == '.'))
        {
        	s3 = player;
        	moveNumber++;
        }
        if (userInput.equals("a5") && (s4 == '.'))
        {
        	s4 = player;
        	moveNumber++;
        }
        if (userInput.equals("b1") && (s5 == '.'))
        {
        	s5 = player;
        	moveNumber++;
        }
        if (userInput.equals("b2") && (s6 == '.'))
        {
        	s6 = player;
        	moveNumber++;
        }
        if (userInput.equals("b3") && (s7 == '.'))
        {
        	s7 = player;
        	moveNumber++;
        }
        if (userInput.equals("b4") && (s8 == '.'))
        {
        	s8 = player;
        	moveNumber++;
        }
        if (userInput.equals("b5") && (s9 == '.'))
        {
        	s9 = player;
        	moveNumber++;
        }
        if (userInput.equals("c1") && (s10 == '.'))
        {
        	s10 = player;
        	moveNumber++;
        }
        if (userInput.equals("c2") && (s11 == '.'))
        {
        	s11 = player;
        	moveNumber++;
        }
        if (userInput.equals("c3") && (s12 == '.'))
        {
        	s12 = player;
        	moveNumber++;
        }
        if (userInput.equals("c4") && (s13 == '.'))
        {
        	s13 = player;
        	moveNumber++;
        }
        if (userInput.equals("c5") && (s14 == '.'))
        {
        	s14 = player;
        	moveNumber++;
        }
        if (userInput.equals("d1") && (s15 == '.'))
        {
        	s15 = player;
        	moveNumber++;
        }
        if (userInput.equals("d2") && (s16 == '.'))
        {
        	s16 = player;
        	moveNumber++;
        }
        if (userInput.equals("d3") && (s17 == '.'))
        {
        	s17 = player;
        	moveNumber++;
        }
        if (userInput.equals("d4") && (s18 == '.'))
        {
        	s18 = player;
        	moveNumber++;
        }
        if (userInput.equals("d5") && (s19 == '.'))
        {
        	s19 = player;
        	moveNumber++;
        }
        if (userInput.equals("e1") && (s20 == '.'))
        {
        	s20 = player;
        	moveNumber++;
        }
        if (userInput.equals("e2") && (s21 == '.'))
        {
        	s21 = player;
        	moveNumber++;
        }
        if (userInput.equals("e3") && (s22 == '.'))
        {
        	s22 = player;
        	moveNumber++;
        }
        if (userInput.equals("e4") && (s23 == '.'))
        {
        	s23 = player;
        	moveNumber++;
        }
        if (userInput.equals("e5") && (s24 == '.'))
        {
        	s24 = player;
        	moveNumber++;
        }

        	    
	}
	


    void displayBoard()// the board
    {
    	System.out.println("");
    	System.out.printf( "---------------------      \n"); 
    	System.out.printf( "| %c | %c | %c | %c | %c | \n", s0, s1, s2, s3, s4 );
    	System.out.printf( "---------------------      \n"); 
    	System.out.printf( "| %c | %c | %c | %c | %c | \n", s5, s6, s7, s8, s9 );
    	System.out.printf( "---------------------      \n"); 
    	System.out.printf( "| %c | %c | %c | %c | %c | \n",s10,s11,s12,s13,s14 );
    	System.out.printf( "---------------------      \n"); 
    	System.out.printf( "| %c | %c | %c | %c | %c | \n",s15,s16,s17,s18,s19 );
    	System.out.printf( "---------------------      \n"); 
    	System.out.printf( "| %c | %c | %c | %c | %c | \n",s20,s21,s22,s23,s24  );
    	System.out.printf( "---------------------      \n"); 
    }//end displayBoard()
    boolean notDone() // check the condition where it is done
    {
    	if ((s0 == 'o' && s1 == 'o' && s2 == 'o') || (s1 == 'o' && s2 == 'o' && s3 == 'o') || (s2 == 'o' && s3 == 'o' && s4 == 'o') || 
    		(s5 == 'o' && s6 == 'o' && s7 == 'o' && s8 == 'o') || (s6 == 'o' && s7 == 'o' && s8 == 'o' && s9 == 'o') || 
    		(s10 == 'o' && s11 == 'o' && s12 == 'o' && s13 == 'o') || (s11 == 'o' && s12 == 'o' && s13 == 'o' && s14 == 'o') ||
    		(s15 == 'o' && s16 == 'o' && s17 == 'o' && s18 == 'o') || (s16 == 'o' && s17 == 'o' && s18 == 'o' && s19 == 'o') ||
    		(s20 == 'o' && s21 == 'o' && s22 == 'o' && s23 == 'o') || (s21 == 'o' && s22 == 'o' && s23 == 'o' && s24 == 'o') ||
    		(s0 == 'o' && s5 == 'o' && s10 == 'o') || (s5 == 'o' && s10 == 'o' && s15 == 'o') || (s10 == 'o' && s15 == 'o' && s20 == 'o') || 
    		(s4 == 'o' && s9 == 'o' && s14 == 'o') || (s9 == 'o' && s14 == 'o' && s19 == 'o') || (s14 == 'o' && s19 == 'o' && s24 == 'o') ||
    		(s1 == 'o' && s6 == 'o' && s11 == 'o' && s16 == 'o') || (s6 == 'o' && s11 == 'o' && s16 == 'o' && s21 == 'o') ||
    		(s2 == 'o' && s7 == 'o' && s12 == 'o' && s17 == 'o') || (s7 == 'o' && s12 == 'o' && s17 == 'o' && s22 == 'o') ||
    		(s3 == 'o' && s8 == 'o' && s13 == 'o' && s18 == 'o') || (s8 == 'o' && s13 == 'o' && s18 == 'o' && s23 == 'o') ||
    		(s4 == 'o' && s9 == 'o' && s14 == 'o' && s19 == 'o') || (s9 == 'o' && s14 == 'o' && s19 == 'o' && s24 == 'o') ||
    		(s0 == 'o' && s6 == 'o' && s12 == 'o' && s18 == 'o') || (s6 == 'o' && s12 == 'o' && s18 == 'o' && s24 == 'o') ||
    		(s5 == 'o' && s11 == 'o' && s17 == 'o' && s23 == 'o') || (s1 == 'o' && s7 == 'o' && s13 == 'o' && s19 == 'o') ||
    		(s4 == 'o' && s8 == 'o' && s12 == 'o' && s16 == 'o') || (s8 == 'o' && s12 == 'o' && s16 == 'o' && s20 == 'o') ||
    		(s3 == 'o' && s7 == 'o' && s11 == 'o' && s15 == 'o') || (s9 == 'o' && s13 == 'o' && s17 == 'o' && s21 == 'o') ||
    		(s0 == 'x' && s1 == 'x' && s2 == 'x') || (s1 == 'x' && s2 == 'x' && s3 == 'x') || (s2 == 'x' && s3 == 'x' && s4 == 'x') || 
    		(s5 == 'x' && s6 == 'x' && s7 == 'x' && s8 == 'x') || (s6 == 'x' && s7 == 'x' && s8 == 'x' && s9 == 'x') || 
    		(s10 == 'x' && s11 == 'x' && s12 == 'x' && s13 == 'x') || (s11 == 'x' && s12 == 'x' && s13 == 'x' && s14 == 'x') ||
    		(s15 == 'x' && s16 == 'x' && s17 == 'x' && s18 == 'x') || (s16 == 'x' && s17 == 'x' && s18 == 'x' && s19 == 'x') ||
    		(s20 == 'x' && s21 == 'x' && s22 == 'x' && s23 == 'x') || (s21 == 'x' && s22 == 'x' && s23 == 'x' && s24 == 'x') ||
    		(s0 == 'x' && s5 == 'x' && s10 == 'x') || (s5 == 'x' && s10 == 'x' && s15 == 'x') || (s10 == 'x' && s15 == 'x' && s20 == 'x') || 
    		(s4 == 'x' && s9 == 'x' && s14 == 'x') || (s9 == 'x' && s14 == 'x' && s19 == 'x') || (s14 == 'x' && s19 == 'x' && s24 == 'x') ||
    		(s1 == 'x' && s6 == 'x' && s11 == 'x' && s16 == 'x') || (s6 == 'x' && s11 == 'x' && s16 == 'x' && s21 == 'x') ||
    		(s2 == 'x' && s7 == 'x' && s12 == 'x' && s17 == 'x') || (s7 == 'x' && s12 == 'x' && s17 == 'x' && s22 == 'x') ||
    		(s3 == 'x' && s8 == 'x' && s13 == 'x' && s18 == 'x') || (s8 == 'x' && s13 == 'x' && s18 == 'x' && s23 == 'x') ||
    		(s4 == 'x' && s9 == 'x' && s14 == 'x' && s19 == 'x') || (s9 == 'x' && s14 == 'x' && s19 == 'x' && s24 == 'x') ||
    		(s0 == 'x' && s6 == 'x' && s12 == 'x' && s18 == 'x') || (s6 == 'x' && s12 == 'x' && s18 == 'x' && s24 == 'x') ||
    		(s5 == 'x' && s11 == 'x' && s17 == 'x' && s23 == 'x') || (s1 == 'x' && s7 == 'x' && s13 == 'x' && s19 == 'x') ||
    		(s4 == 'x' && s8 == 'x' && s12 == 'x' && s16 == 'x') || (s8 == 'x' && s12 == 'x' && s16 == 'x' && s20 == 'x') ||
    		(s3 == 'x' && s7 == 'x' && s11 == 'x' && s15 == 'x') || (s9 == 'x' && s13 == 'x' && s17 == 'x' && s21 == 'x') )
    		
    		{
    			return false;
    	}
    	else {
    		return true;
    	     }
    }//end notDone()

  
    
}
