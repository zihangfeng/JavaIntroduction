/* Connect 4 is very similar to tic-tac-toe game.
 * The only difference is that connect 4 needs to
 * forms a L shape in order to win the game.
 * Player 1 uses red color, and player 2 uses blue 
 * color. If any of the colors match in the shape of
 * L, then the game would stop, and on the screen, would
 * show the winner. If all circles are full without any
 * winner, then the screen would display that there are 
 * no more spaces.
 * Class: CS 107, Fall 2011
 * Lab: Venkatakumar Srinivasan, Tue. 9:00 AM
 * @author Jian Heng Feng
 * @version March 02, 2012
 * ---------------------------------------------- */ 
 
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Project4 implements MouseListener{
	public static Circle[][] allCircles = new Circle[7][8];
	int number = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
	

	
		// place a 6x7 grid of squares onto the canvas.	

			Square boardBackground = new Square (0, 0, 300, "black", true, "hello");
			Project4 board = new Project4();
			Canvas.getCanvas().setMouseListener(board);
			
			
			for (int row=0;row<7;row++){
				for (int column=0;column<6;column++){
					
					allCircles[row][column]= new Circle(40*row+ 15,40*column+35,30,"white",true);
				
			        
			}
			
		
		
		
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) 
{
		// TODO Auto-generated method stub
		
		if (number%2==0)
   {	
		for (int column=0;column<7;column++)
	   { 
			int left = column*40 + 15;
			int right = column*40 + 55;
		if (right>e.getX() && left<=e.getX())
		{	for (int row = 5; row>=0; row--)
		    {      
			    if (allCircles[column][row].getColor().equals("white") && 
			     !(allCircles[column][row].getColor().equals("red") && 
			       allCircles[column][row].getColor().equals("blue")))
			     {
				       allCircles[column][row].setColor("red");
				       number++;
				       // check the condition 1
					      if (column <= 4 && row >= 1)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column+1][row].getColor().equals("red") &&
								    allCircles[column+2][row].getColor().equals("red") &&
								    allCircles[column+2][row-1].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}						        
			                }
					      // condition 2
					     if (column >= 1  && column <= 5 && row >=1)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column-1][row].getColor().equals("red") &&
								    allCircles[column+1][row].getColor().equals("red") &&
								    allCircles[column+1][row-1].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}						        
			                }
					     // condition 3
					     if (column >= 2 && row <= 4)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column][row+1].getColor().equals("red") &&
								    allCircles[column-1][row+1].getColor().equals("red") &&
								    allCircles[column-2][row+1].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}						        
			                }
					     // condition 4
					     if (column <= 4 && row <= 4)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column][row+1].getColor().equals("red") &&
								    allCircles[column+1][row+1].getColor().equals("red") &&
								    allCircles[column+2][row+1].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}						        
			                }
					     //condition 5
					     if (column >= 1 && column <= 5 && row >= 1)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column-1][row].getColor().equals("red") &&
								    allCircles[column+1][row].getColor().equals("red") &&
								    allCircles[column-1][row-1].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}						        
			                }
					     //condition 6
					     if (column >= 2 && row >=1)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column-1][row].getColor().equals("red") &&
								    allCircles[column-2][row].getColor().equals("red") &&
								    allCircles[column-2][row-1].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}						        
			                }
					     // condition 7
					     if (column <= 4 && row <= 4)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column+1][row].getColor().equals("red") &&
								    allCircles[column+2][row].getColor().equals("red") &&
								    allCircles[column][row+1].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     // condition 8
					     if (column >= 1 && column <= 5 && row <= 4)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column-1][row].getColor().equals("red") &&
								    allCircles[column+1][row].getColor().equals("red") &&
								    allCircles[column-1][row+1].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     // condition 9
					     if (column >= 2 && row <= 4)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column-1][row].getColor().equals("red") &&
								    allCircles[column-2][row].getColor().equals("red") &&
								    allCircles[column-2][row+1].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     // condition 10
					     if (column <= 4 && row <= 4)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column+1][row].getColor().equals("red") &&
								    allCircles[column+2][row].getColor().equals("red") &&
								    allCircles[column+2][row+1].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     // condition 11
					     if (column >= 1 && column <= 5 && row <= 4)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column-1][row].getColor().equals("red") &&
								    allCircles[column+1][row].getColor().equals("red") &&
								    allCircles[column+1][row+1].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     // condition 12
					     if (column >= 2 && row <= 4)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column-1][row].getColor().equals("red") &&
								    allCircles[column-2][row].getColor().equals("red") &&
								    allCircles[column][row+1].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     // condition 13
					     if (column <= 5 && row <= 3)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column][row+1].getColor().equals("red") &&
								    allCircles[column][row+2].getColor().equals("red") &&
								    allCircles[column+1][row+2].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     // condition 14
					     if (column >= 1 && row >= 2)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column-1][row].getColor().equals("red") &&
								    allCircles[column-1][row-1].getColor().equals("red") &&
								    allCircles[column-1][row-2].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     // condition 15
					     if (column <= 5 && row >= 2)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column+1][row].getColor().equals("red") &&
								    allCircles[column+1][row-1].getColor().equals("red") &&
								    allCircles[column+1][row-2].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     // condition 16 
					     if (column >=1 && row <= 3)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column][row+1].getColor().equals("red") &&
								    allCircles[column][row+2].getColor().equals("red") &&
								    allCircles[column-1][row+2].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     // condition 17
					     if (column <= 5 && row <= 3)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column+1][row].getColor().equals("red") &&
								    allCircles[column+1][row+1].getColor().equals("red") &&
								    allCircles[column+1][row+2].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     // condition 18
					     if (column >=1 && row <= 3)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column-1][row].getColor().equals("red") &&
								    allCircles[column][row+1].getColor().equals("red") &&
								    allCircles[column][row+2].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     // condition 19
					     if (column >=1 && row <= 3)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column-1][row].getColor().equals("red") &&
								    allCircles[column-1][row+1].getColor().equals("red") &&
								    allCircles[column-1][row+2].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     // condition 20
					     if (column <= 5 && row <= 3)
							{
								if (allCircles[column][row].getColor().equals("red") && 
								    allCircles[column+1][row].getColor().equals("red") &&
								    allCircles[column][row+1].getColor().equals("red") &&
								    allCircles[column][row+2].getColor().equals("red"))
								{
									System.out.println("Player 1 wins");
									System.exit(1);
								}
							}
					     
					       break;
			     }
			    
			     
		    }
		
		}
	   }

   }
		else 
			for (int column=0;column<7;column++)
		{ 
				int left = column*40 + 15;
				int right = column*40 + 55;
			if (right>e.getX() && left<=e.getX())
			{	for (int row = 5; row>=0; row--)
			    {
				 if (allCircles[column][row].getColor().equals("white") && 
				   !(allCircles[column][row].getColor().equals("red") && 
					 allCircles[column][row].getColor().equals("blue")))
					     {
						       allCircles[column][row].setColor("blue");
						       number++;
						       // check the condition 1
						      if (column <= 4 && row >= 1)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column+1][row].getColor().equals("blue") &&
									    allCircles[column+2][row].getColor().equals("blue") &&
									    allCircles[column+2][row-1].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}						        
				                }
						      // condition 2
						     if (column >= 1  && column <= 5 && row >=1)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column-1][row].getColor().equals("blue") &&
									    allCircles[column+1][row].getColor().equals("blue") &&
									    allCircles[column+1][row-1].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}						        
				                }
						     // condition 3
						     if (column >= 2 && row <= 4)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column][row+1].getColor().equals("blue") &&
									    allCircles[column-1][row+1].getColor().equals("blue") &&
									    allCircles[column-2][row+1].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}						        
				                }
						     // condition 4
						     if (column <= 4 && row <= 4)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column][row+1].getColor().equals("blue") &&
									    allCircles[column+1][row+1].getColor().equals("blue") &&
									    allCircles[column+2][row+1].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}						        
				                }
						     //condition 5
						     if (column >= 1 && column <= 5 && row >= 1)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column-1][row].getColor().equals("blue") &&
									    allCircles[column+1][row].getColor().equals("blue") &&
									    allCircles[column-1][row-1].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}						        
				                }
						     //condition 6
						     if (column >= 2 && row >=1)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column-1][row].getColor().equals("blue") &&
									    allCircles[column-2][row].getColor().equals("blue") &&
									    allCircles[column-2][row-1].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}						        
				                }
						     // condition 7
						     if (column <= 4 && row <= 4)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column+1][row].getColor().equals("blue") &&
									    allCircles[column+2][row].getColor().equals("blue") &&
									    allCircles[column][row+1].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						     // condition 8
						     if (column >= 1 && column <= 5 && row <= 4)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column-1][row].getColor().equals("blue") &&
									    allCircles[column+1][row].getColor().equals("blue") &&
									    allCircles[column-1][row+1].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						     // condition 9
						     if (column >= 2 && row <= 4)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column-1][row].getColor().equals("blue") &&
									    allCircles[column-2][row].getColor().equals("blue") &&
									    allCircles[column-2][row+1].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						     // condition 10
						     if (column <= 4 && row <= 4)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column+1][row].getColor().equals("blue") &&
									    allCircles[column+2][row].getColor().equals("blue") &&
									    allCircles[column+2][row+1].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						     // condition 11
						     if (column >= 1 && column <= 5 && row <= 4)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column-1][row].getColor().equals("blue") &&
									    allCircles[column+1][row].getColor().equals("blue") &&
									    allCircles[column+1][row+1].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						     // condition 12
						     if (column >= 2 && row <= 4)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column-1][row].getColor().equals("blue") &&
									    allCircles[column-2][row].getColor().equals("blue") &&
									    allCircles[column][row+1].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						     // condition 13
						     if (column <= 5 && row <= 3)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column][row+1].getColor().equals("blue") &&
									    allCircles[column][row+2].getColor().equals("blue") &&
									    allCircles[column+1][row+2].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						     // condition 14
						     if (column >= 1 && row >= 2)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column-1][row].getColor().equals("blue") &&
									    allCircles[column-1][row-1].getColor().equals("blue") &&
									    allCircles[column-1][row-2].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						     // condition 15
						     if (column <= 5 && row >= 2)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column+1][row].getColor().equals("blue") &&
									    allCircles[column+1][row-1].getColor().equals("blue") &&
									    allCircles[column+1][row-2].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						     // condition 16 
						     if (column >=1 && row <= 3)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column][row+1].getColor().equals("blue") &&
									    allCircles[column][row+2].getColor().equals("blue") &&
									    allCircles[column-1][row+2].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						     // condition 17
						     if (column <= 5 && row <= 3)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column+1][row].getColor().equals("blue") &&
									    allCircles[column+1][row+1].getColor().equals("blue") &&
									    allCircles[column+1][row+2].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						     // condition 18
						     if (column >=1 && row <= 3)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column-1][row].getColor().equals("blue") &&
									    allCircles[column][row+1].getColor().equals("blue") &&
									    allCircles[column][row+2].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						     // condition 19
						     if (column >=1 && row <= 3)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column-1][row].getColor().equals("blue") &&
									    allCircles[column-1][row+1].getColor().equals("blue") &&
									    allCircles[column-1][row+2].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						     // condition 20
						     if (column <=5 && row <= 3)
								{
									if (allCircles[column][row].getColor().equals("blue") && 
									    allCircles[column+1][row].getColor().equals("blue") &&
									    allCircles[column][row+1].getColor().equals("blue") &&
									    allCircles[column][row+2].getColor().equals("blue"))
									{
										System.out.println("Player 2 wins");
										System.exit(1);
									}
								}
						   
						     noMoreSpace();
						     
						       break;
			  }
		  }
	   }
    }
		
}
// check if there are no more spaces
boolean noMoreSpace()
{
	 if (!(allCircles[0][0].getColor().equals("white") ||
  		   allCircles[1][0].getColor().equals("white") ||
  		   allCircles[2][0].getColor().equals("white") ||
  		   allCircles[3][0].getColor().equals("white") ||
  		   allCircles[4][0].getColor().equals("white") ||
  		   allCircles[5][0].getColor().equals("white") ||
  		   allCircles[6][0].getColor().equals("white")))
  	 {
  		 System.out.println("There are no more spaces");
  		 System.exit(0);
  	 }
	return true;
}
    
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
