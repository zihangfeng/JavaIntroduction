/*Engima is way to encrypt or decrypt a secret
 * message. For convention, we use three wheels
 * with unorganized letter on it to encrypt and
 * decrypt. For instance, if we want encrypt a 
 * message "hello", we would put the first letter
 * into the first wheel, and convert another. And,
 * put the new letter into the second wheel. After
 * finishing the third wheel, a new different letter
 * will come out. Decryption would use a new letter
 * convert back to the original one.
 * Class: CS 107, Fall 2011
 * Lab: Venkatakumar Srinivasan, Tue. 9:00 AM
 * @author Jian Heng Feng
 * @version April 07, 2012
 *----------------------------------------*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.File;
public class Engima {
public static int numberChanged, leftRotor, middleRotor, rightRotor;
public static char numberOfCharOne, numberOfCharTwo, numberOfCharThree;


	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);  
		Scanner inputStream= null;// it reads the line from the file
        PrintWriter outputStream = null;// it prints the line from the file to a new file
        System.out.print("Type whether you want to encrypt or decrypt, e represents encrytion, d represents decryption: ");
        String Encode = keyboard.nextLine();
        
        // encrytion
       if (Encode.equals("e"))
       {  
    	   System.out.print("Type the file name you want to encrypt: ");
    	   String theNameOfTheFile = keyboard.nextLine();// read the name from the keyboard
    	   File fileObject = new File(theNameOfTheFile);
    	   System.out.print("Type the name of the file you want to output into a file: ");
           String theNameOfOutputFile = keyboard.nextLine();
            if (fileObject.exists())// to check whether the file exists.
               	                    // if it does, then starts to encrypt. 
           {	 
              try 
             {
         	 inputStream = new Scanner(new FileInputStream(theNameOfTheFile));
        	 outputStream = new PrintWriter(new FileOutputStream(theNameOfOutputFile));
             }
              catch (FileNotFoundException e)
              {
            	  System.out.println("File original.txt was not found or could not be opened.");
              }
              catch (IOException e)
              {
            	  System.out.println("Erorr reading from roginal.txt");
              }
              char[][] TheWheel = {{'E', 'K', 'M', 'F', 'L', 'G', 'D', // the first wheel
    	                            'Q', 'V', 'Z', 'N', 'T', 'O', 'W', 
                                    'Y', 'H', 'X', 'U', 'S', 'P', 'A', 
                                    'I', 'B', 'R', 'C', 'J'},
                                        
                                   {'A', 'J', 'D', 'K', 'S', 'I', 'R', // the second wheel
                                    'U', 'X', 'B', 'L', 'H', 'W', 'T', 
                                    'M', 'C', 'Q', 'G', 'Z', 'N', 'P', 
                                    'Y', 'F', 'V', 'O', 'E'},
                                    
                                   {'B', 'D', 'F', 'H', 'J', 'L', 'C',// the third wheel 
                                    'P', 'R', 'T', 'X', 'V', 'Z', 'N', 
                                    'Y', 'E', 'I', 'W', 'G', 'A', 'K', 
                                    'M', 'U', 'S', 'Q', 'O'},
                                
                                   {'E', 'S', 'O', 'V', 'P', 'Z', 'J',// the fourth wheel
                                    'A', 'Y', 'Q', 'U', 'I', 'R', 'H',
                                    'X', 'L', 'N', 'F', 'T', 'G', 'K', 
                                    'D', 'C', 'M', 'W', 'B'},
                                   
                                   {'V', 'Z', 'B', 'R', 'G', 'I', 'T',// the fifth wheel
                                	'Y', 'U', 'P', 'S', 'D', 'N', 'H',
                                	'L', 'X', 'A', 'W', 'M', 'J', 'Q', 
                                	'O', 'F', 'E', 'C', 'K'},
                                	
                                   {'J', 'P', 'G', 'V', 'O', 'U', 'M',// the sixth wheel
                                	'F', 'Y', 'Q', 'B', 'E', 'N', 'H',
                                	'Z', 'R', 'D', 'K', 'A', 'S', 'X',
                                	'L', 'I', 'C', 'T', 'W'},
                                   
                                   {'N', 'Z', 'J', 'H', 'G', 'R', 'C',// the seventh wheel
                                	'X', 'M', 'Y', 'S', 'W', 'B', 'O',
                                	'U', 'F', 'A', 'I', 'V', 'L', 'P',
                                	'E', 'K', 'Q', 'D', 'T',},
                                   
                                   {'F', 'K', 'Q', 'H', 'T', 'L', 'X',// the eighth wheel
                                	'O', 'C', 'B', 'J', 'S', 'P', 'D', 
                                	'Z', 'R', 'A', 'M', 'E', 'W', 'N',
                                	'I', 'U', 'Y', 'G', 'V'}
                                     };// all eight wheels  
           String line1 = inputStream.next();
           String line2 = inputStream.next();
           String line3 = inputStream.next();
           String line4 = inputStream.next();
           String line5 = inputStream.next();
           String line6 = inputStream.next();
           String line7 = inputStream.next();

           outputStream.println(line1 + " " + line2);
           outputStream.println(line3 + " " + line4);
           outputStream.println(line5 + " " + line6);  
              
            	   if (line1 != null)
            	      {
            		   leftRotor = ChooseWheelNumber(line1);
            	      }
                   if (line3 != null)
                      {
                	   middleRotor = ChooseWheelNumber(line3);
                      }
                   if (line5 != null)
                      {
                	   rightRotor = ChooseWheelNumber(line5);
                      }
                         // all three chosen ends here
            int firstIncrement = 0, secondIncrement = 0, thirdIncrement = 0;
        for (int i = 0; i < line7.length(); i++)
         {  
             int startingPosition = 0;
        	Engima ChangedChar = new Engima(); // created an object to use all methods in the Engima class
        	startingPosition = setNumberOfString(line6);
   	        char TheString = line7.charAt(i); // give all letters we need to convert to TheString   
   	        ChangedChar.setValueToCharacter(TheString); // start to change the letters we need to convert 
            ChangedChar.setValueToCharacter(TheWheel[rightRotor][(numberChanged + startingPosition + firstIncrement)%26]);// change the letter from the first wheel
            if (firstIncrement != 0 && firstIncrement%26 == 0)
            {
            	secondIncrement++;
            }
            startingPosition = setNumberOfString(line4); 
            ChangedChar.setValueToCharacter(TheWheel[middleRotor][(numberChanged + startingPosition + secondIncrement)%26]);// change the letter from the second wheel
            if (secondIncrement != 0 && secondIncrement%26 == 0)
            {
            	thirdIncrement++;
            }
            startingPosition = setNumberOfString(line2);
            outputStream.print(TheWheel[leftRotor][(numberChanged + startingPosition + thirdIncrement)%26]);	// takes out the letter from the third wheel
            firstIncrement++;

             }	// end the for loop
                    // those two lines below help end the while loop, otherwise, the
                    // outputStream would never stop
                     inputStream.close();
                     outputStream.close();
                     
                
             } // end the beginning if loop
        }// end the encrytion
	 
       //decrpytion
       if (Encode.equals("d"))
       { 
       System.out.print("Type the file name that you want to decrypt: ");
	   String theNameOfTheFile = keyboard.nextLine();// read the name from the keyboard
	   File fileObject = new File(theNameOfTheFile);
	   System.out.print("Type the name of the file you want to output into a file: ");
       String theNameOfOutputFile = keyboard.nextLine(); 
        if (fileObject.exists())// to check whether the file exists.
        	                    // if it does, then starts to encrypt. 
         {	 
              try 
             {
        	 inputStream = new Scanner(new FileInputStream(theNameOfTheFile));
        	 outputStream = new PrintWriter(new FileOutputStream(theNameOfOutputFile));
             }
              catch (FileNotFoundException e)
              {
            	  System.out.println("File original.txt was not found or could not be opened.");
              }
              catch (IOException e)
              {
            	  System.out.println("Erorr reading from roginal.txt");
              }
              char[][] TheWheel = {{'E', 'K', 'M', 'F', 'L', 'G', 'D', // the first wheel
    	                            'Q', 'V', 'Z', 'N', 'T', 'O', 'W', 
                                    'Y', 'H', 'X', 'U', 'S', 'P', 'A', 
                                    'I', 'B', 'R', 'C', 'J'},
                                        
                                   {'A', 'J', 'D', 'K', 'S', 'I', 'R', // the second wheel
                                    'U', 'X', 'B', 'L', 'H', 'W', 'T', 
                                    'M', 'C', 'Q', 'G', 'Z', 'N', 'P', 
                                    'Y', 'F', 'V', 'O', 'E'},
                                    
                                   {'B', 'D', 'F', 'H', 'J', 'L', 'C',// the third wheel 
                                    'P', 'R', 'T', 'X', 'V', 'Z', 'N', 
                                    'Y', 'E', 'I', 'W', 'G', 'A', 'K', 
                                    'M', 'U', 'S', 'Q', 'O'},
                                
                                   {'E', 'S', 'O', 'V', 'P', 'Z', 'J',// the fourth wheel
                                    'A', 'Y', 'Q', 'U', 'I', 'R', 'H',
                                    'X', 'L', 'N', 'F', 'T', 'G', 'K', 
                                    'D', 'C', 'M', 'W', 'B'},
                                   
                                   {'V', 'Z', 'B', 'R', 'G', 'I', 'T',// the fifth wheel
                                	'Y', 'U', 'P', 'S', 'D', 'N', 'H',
                                	'L', 'X', 'A', 'W', 'M', 'J', 'Q', 
                                	'O', 'F', 'E', 'C', 'K'},
                                	
                                   {'J', 'P', 'G', 'V', 'O', 'U', 'M',// the sixth wheel
                                	'F', 'Y', 'Q', 'B', 'E', 'N', 'H',
                                	'Z', 'R', 'D', 'K', 'A', 'S', 'X',
                                	'L', 'I', 'C', 'T', 'W'},
                                   
                                   {'N', 'Z', 'J', 'H', 'G', 'R', 'C',// the seventh wheel
                                	'X', 'M', 'Y', 'S', 'W', 'B', 'O',
                                	'U', 'F', 'A', 'I', 'V', 'L', 'P',
                                	'E', 'K', 'Q', 'D', 'T',},
                                   
                                   {'F', 'K', 'Q', 'H', 'T', 'L', 'X',// the eighth wheel
                                	'O', 'C', 'B', 'J', 'S', 'P', 'D', 
                                	'Z', 'R', 'A', 'M', 'E', 'W', 'N',
                                	'I', 'U', 'Y', 'G', 'V'}
                                     };// all eight wheels  
           String line1 = inputStream.next();
           String line2 = inputStream.next();
           String line3 = inputStream.next();
           String line4 = inputStream.next();
           String line5 = inputStream.next();
           String line6 = inputStream.next();
           String line7 = inputStream.next();

           outputStream.println(line1 + " " + line2);
           outputStream.println(line3 + " " + line4);
           outputStream.println(line5 + " " + line6);  
              
            	   if (line1 != null)
            	      {
            		   leftRotor = ChooseWheelNumber(line1);
            	      }
                   if (line3 != null)
                      {
                	   middleRotor = ChooseWheelNumber(line3);
                      }
                   if (line5 != null)
                      {
                	   rightRotor = ChooseWheelNumber(line5);
                      }
                         // all three chosen ends here
        int firstDecrement = 0, secondDecrement = 0, thirdDecrement = 0;            
        for (int i = 0; i < line7.length(); i++)
         {  
        	
        	Engima change = new Engima();    
   	        char TheString = line7.charAt(i);// give all letters we need to convert to TheString      
   	        int j = 0, k = 0, p = 0, startingPosition = 0;
   	        while (TheWheel[leftRotor][j] != TheString)// find the position of the letter
   	        {
   	        	j++;
   	        } 
   	     startingPosition = setNumberOfString(line2);
   	     if ((j - startingPosition) < 0)
   	     {
   	    	 j = j - startingPosition + 26;
   	     }
   	     else 
   	     {
   	    	 j = j - startingPosition;
   	     }
   	     numberOfCharOne = change.setIntegerToCharacter(j%26);  
   	        while (TheWheel[middleRotor][k] != numberOfCharOne)// find the position of the letter
   	        { 
   	        	k++;
	        } 
   	     startingPosition = setNumberOfString(line4);  	
         if (firstDecrement >= 26)
         {
        	 
        	 if (firstDecrement%26 == 0) 
        	 {
        		 secondDecrement++; 
        	 }    	 
         }   
   	     if ((k - startingPosition - secondDecrement) < 0)
   	     {
   	    	 k = k - startingPosition - secondDecrement + 26;
   	     }
   	     else
   	     {
   	    	k = k - startingPosition - secondDecrement; 
   	     }
   	     numberOfCharTwo = change.setIntegerToCharacter(k%26); 
       	  while (TheWheel[rightRotor][p] != numberOfCharTwo)// find the position of the letter
       	    {  	
                p++;
      	    }  
       	startingPosition = setNumberOfString(line6);
  	     if ((p - startingPosition - firstDecrement) < 0)
  	     {
  	    	int MultipleNumber = 0; 
  	    	MultipleNumber = ((p - startingPosition - firstDecrement)/26)*(-1);      	 
  	    	 p = p - startingPosition - firstDecrement + 26*(MultipleNumber + 1); 	  	
  	    	
  	     }
  	     else
  	     {
  	    	p = p - startingPosition - firstDecrement;
  	     }  	
       	numberOfCharThree = change.setIntegerToCharacter(p%26);        	
       	firstDecrement++;    
            outputStream.print(numberOfCharThree); // takes out the letter from the third wheel

             }	 // end the while loop
                    // those two lines below help end the while loop, otherwise, the
                    // outputStream would never stop
                     inputStream.close();
                     outputStream.close();
                     
               
             } // end the beginning if loop
        }// end the decrytion
	
	} 
       
  
         
        
     

	public void setValueToCharacter (int Number)// give the number to the calling object
	{
		numberChanged = setNumber((char) Number);
	}
		
    public int setNumber (char theNumber)// convert the character to integer
          { 
	    	   switch (theNumber)
	    	   {
	    		case 'A':return 0; 
	    		case 'B':return 1; 
	    		case 'C':return 2; 
	    		case 'D':return 3;
	    		case 'E':return 4;
	    		case 'F':return 5; 
	    		case 'G':return 6; 
	    		case 'H':return 7;
	    		case 'I':return 8;
	    		case 'J':return 9; 
	    		case 'K':return 10; 
	    		case 'L':return 11; 
	    		case 'M':return 12; 
	    		case 'N':return 13;
	    		case 'O':return 14; 
	    		case 'P':return 15; 
	    		case 'Q':return 16; 
	    		case 'R':return 17; 
	    		case 'S':return 18; 
	    		case 'T':return 19; 
	    		case 'U':return 20; 
	    		case 'V':return 21; 
	    		case 'W':return 22; 
	    		case 'X':return 23; 
	    		case 'Y':return 24; 
	    		case 'Z':return 25;
	          default:
	        	  System.out.println("Error");
	        	  System.exit(0);
	        	  return 100;// just keep the compiler happy
	    		}

	       }
 public  static int ChooseWheelNumber(String ChooseWheel)// choose which wheel to use
	        {
	              if (ChooseWheel.equals("I"))
	              {
	            	  return 0;
	              }
	              if (ChooseWheel.equals("II"))
	              {
	            	  return 1;
	              }
	              if (ChooseWheel.equals("III"))
	              {
	            	  return 2;
	              }
	              if (ChooseWheel.equals("IV"))
	              {
	            	  return 3;
	              }
	              if (ChooseWheel.equals("V"))
	              {
	            	  return 4;
	              }
	              if (ChooseWheel.equals("VI"))
	              {
	            	  return 5;
	              }
	              if (ChooseWheel.equals("VII"))
	              {
	            	  return 6;
	              } 
	           return 7;      
	        }
 
 
          public char setIntegerToCharacter(int ConvertedNumber)// convert integer to Character
           {
	         if (ConvertedNumber == 0)
	         {
	        	 return 'A';
	         }
	         if (ConvertedNumber == 1)
	         {
	        	 return 'B';
	         }
	         if (ConvertedNumber == 2)
	         {
	        	 return 'C';
	         }
	         if (ConvertedNumber == 3)
	         {
	        	 return 'D';
	         }
	         if (ConvertedNumber == 4)
	         {
	        	 return 'E';
	         }
	         if (ConvertedNumber == 5)
	         {
	        	 return 'F';
	         }
	         if (ConvertedNumber == 6)
	         {
	        	 return 'G';
	         }
	         if (ConvertedNumber == 7)
	         {
	        	 return 'H';
	         }
	         if (ConvertedNumber == 8)
	         {
	        	 return 'I';
	         }
	         if (ConvertedNumber == 9)
	         {
	        	 return 'J';
	         }
	         if (ConvertedNumber == 10)
	         {
	        	 return 'K';
	         }
	         if (ConvertedNumber == 11)
	         {
	        	 return 'L';
	         }
	         if (ConvertedNumber == 12)
	         {
	        	 return 'M';
	         }
	         if (ConvertedNumber == 13)
	         {
	        	 return 'N';
	         }
	         if (ConvertedNumber == 14)
	         {
	        	 return 'O';
	         }
	         if (ConvertedNumber == 15)
	         {
	        	 return 'P';
	         }
	         if (ConvertedNumber == 16)
	         {
	        	 return 'Q';
	         }
	         if (ConvertedNumber == 17)
	         {
	        	 return 'R';
	         }
	         if (ConvertedNumber == 18)
	         {
	        	 return 'S';
	         }
	         if (ConvertedNumber == 19)
	         {
	        	 return 'T';
	         }
	         if (ConvertedNumber == 20)
	         {
	        	 return 'U';
	         }
	         if (ConvertedNumber == 21)
	         {
	        	 return 'V';
	         }
	         if (ConvertedNumber == 22)
	         {
	        	 return 'W';
	         }
	         if (ConvertedNumber == 23)
	         {
	        	 return 'X';
	         }
	         if (ConvertedNumber == 24)
	         {
	        	 return 'Y';
	         }
	         return 'Z';
           }
          
          
          
       public static int setNumberOfString(String singleString)// convert String to integer
          {
        	  if (singleString.equals("A"))
        	  {
        		  return 0;
        	  }
        	  if (singleString.equals("B"))
        	  {
        		  return 1;
        	  }
        	  if (singleString.equals("C"))
        	  {
        		  return 2;
        	  }
        	  if (singleString.equals("D"))
        	  {
        		  return 3;
        	  }
        	  if (singleString.equals("E"))
        	  {
        		  return 4;
        	  }
        	  if (singleString.equals("F"))
        	  {
        		  return 5;
        	  }
        	  if (singleString.equals("G"))
        	  {
        		  return 6;
        	  }
        	  if (singleString.equals("H"))
        	  {
        		  return 7;
        	  }
        	  if (singleString.equals("I"))
        	  {
        		  return 8;
        	  }
        	  if (singleString.equals("J"))
        	  {
        		  return 9;
        	  }
        	  if (singleString.equals("K"))
        	  {
        		  return 10;
        	  }
        	  if (singleString.equals("L"))
        	  {
        		  return 11;
        	  }
        	  if (singleString.equals("M"))
        	  {
        		  return 12;
        	  }
        	  if (singleString.equals("N"))
        	  {
        		  return 13;
        	  }
        	  if (singleString.equals("O"))
        	  {
        		  return 14;
        	  }
        	  if (singleString.equals("P"))
        	  {
        		  return 15;
        	  }
        	  if (singleString.equals("Q"))
        	  {
        		  return 16;
        	  }
        	  if (singleString.equals("R"))
        	  {
        		  return 17;
        	  }
        	  if (singleString.equals("S"))
        	  {
        		  return 18;
        	  }
        	  if (singleString.equals("T"))
        	  {
        		  return 19;
        	  }
        	  if (singleString.equals("U"))
        	  {
        		  return 20;
        	  }
        	  if (singleString.equals("V"))
        	  {
        		  return 21;
        	  }
        	  if (singleString.equals("W"))
        	  {
        		  return 22;
        	  }
        	  if (singleString.equals("X"))
        	  {
        		  return 23;
        	  }
        	  if (singleString.equals("Y"))
        	  {
        		  return 24;
        	  }
        	  return 25;
          }
  }// ends the whole class