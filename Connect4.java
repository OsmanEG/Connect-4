/*******************************************************
  * Osman El-Ghotmi                                    *
  * My Epic Game of Connect 4                          *
  * ****************************************************/

import java.util.Random; //Important random number generator

//Connect 4 class
class Connect4 {
  //Method that creates the text based Connect 4 board
  public static void printBoard(char grid [][]) {
    System.out.println("-----------------------------"); 
    System.out.println("|" + " " + grid[0][0] + " " + "|" + " " + grid[0][1] + " " + "|" + " " + grid[0][2] + " " + "|" + " " + grid[0][3] + " " + "|" + " " + grid[0][4] + " " + "|" + " " + grid[0][5] + " " + "|" + " " + grid[0][6] + " " + "|");
    System.out.println("-----------------------------");
    System.out.println("|" + " " + grid[1][0] + " " + "|" + " " + grid[1][1] + " " + "|" + " " + grid[1][2] + " " + "|" + " " + grid[1][3] + " " + "|" + " " + grid[1][4] + " " + "|" + " " + grid[1][5] + " " + "|" + " " + grid[1][6] + " " + "|");
    System.out.println("-----------------------------");
    System.out.println("|" + " " + grid[2][0] + " " + "|" + " " + grid[2][1] + " " + "|" + " " + grid[2][2] + " " + "|" + " " + grid[2][3] + " " + "|" + " " + grid[2][4] + " " + "|" + " " + grid[2][5] + " " + "|" + " " + grid[2][6] + " " + "|");
    System.out.println("-----------------------------");
    System.out.println("|" + " " + grid[3][0] + " " + "|" + " " + grid[3][1] + " " + "|" + " " + grid[3][2] + " " + "|" + " " + grid[3][3] + " " + "|" + " " + grid[3][4] + " " + "|" + " " + grid[3][5] + " " + "|" + " " + grid[3][6] + " " + "|");
    System.out.println("-----------------------------");
    System.out.println("|" + " " + grid[4][0] + " " + "|" + " " + grid[4][1] + " " + "|" + " " + grid[4][2] + " " + "|" + " " + grid[4][3] + " " + "|" + " " + grid[4][4] + " " + "|" + " " + grid[4][5] + " " + "|" + " " + grid[4][6] + " " + "|");
    System.out.println("-----------------------------");
    System.out.println("|" + " " + grid[5][0] + " " + "|" + " " + grid[5][1] + " " + "|" + " " + grid[5][2] + " " + "|" + " " + grid[5][3] + " " + "|" + " " + grid[5][4] + " " + "|" + " " + grid[5][5] + " " + "|" + " " + grid[5][6] + " " + "|");
    System.out.println("-----------------------------");
  }
  
  //Prints potential position options
  public static void printOptions() {
    System.out.println("| 1 | 2 | 3 | 4 | 5 | 6 | 7 |");
  }

  //Main method that calls the games main menu
  public static void main(String[]args) {
    mainMenu();
  }

  //Method for the main menu of the game
  public static void mainMenu() {
    //List of the main menu options
    System.out.println("Welcome to Osmans Game of Connect Four!!!");
    System.out.println("Be sure to use the number key pad as your Connect Four Game board to select your option");
    System.out.println("And use the numbers to select the boxes respectively to the ones that will be shown");
    System.out.println("Press (1) To Challenge Your Friend in a Game of Two Player Connect Four");
    System.out.println("Press (2) To Practice Against Silly Bobo in a Game of Connect Four (Go Easy on Bobo... He's Not Very Good)");
    int userPick = In.getInt();

    //Switch statement for user options
    switch(userPick) {
      case 1: {
        twoPlayer(); //Two player mode
      }
      break;

      case 2: {
        easyMode(); //Easy computer mode
      }
      break;

      default:{
        System.out.println("Thanks For Playing!"); //Exiting the game
      }
      break;
    }// End of User Selection
  }
  
  //Method for the two player mde of the game
  public static void twoPlayer() {
    boolean isPlayer1Turn = true;
    boolean isGameRunning = true; //Tracking user turns
    System.out.println("Welcome to 2 Player Connect Four");
    System.out.println("Player One will be represented as X");
    System.out.println("Player Two will be represented as O"); //Lisitng player pieces
    //End of information for Player
    
    char[][]grid = new char [6][7];
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 7; j++) {
        grid[i][j] = ' ';
      }
    }
   
    printOptions();
    printBoard(grid);
    //End of Connect Four Board Creation.
    
    while(isGameRunning == true) {
      do
      {
        System.out.println("Player Ones Turn");
        int userInput = In.getInt();
        
        switch (userInput)
        {
          case 1:
          {
            if(grid[5][0] == ' ' )
            {
              grid[5][0] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][0] == ' ')
            {
              grid[4][0] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][0] == ' ')
            {
              grid[3][0] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][0] == ' ')
            {
              grid[2][0] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[1][0] == ' ')
            {
              grid[1][0] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][0] == ' ')
            {
              grid[0][0] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 2:
          {
            if(grid[5][1] == ' ')
            {
              grid[5][1] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][1] == ' ')
            {
              grid[4][1] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][1] == ' ')
            {
              grid[3][1] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][1] == ' ')
            {
              grid[2][1] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[1][1] == ' ')
            {
              grid[1][1] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][1] == ' ')
            {
              grid[0][1] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 3:
          {
            if(grid[5][2] == ' ')
            {
              grid[5][2] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][2] == ' ')
            {
              grid[4][2] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][2] == ' ')
            {
              grid[3][2] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][2] == ' ')
            {
              grid[2][2] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[1][2] == ' ')
            {
              grid[1][2] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][2] == ' ')
            {
              grid[0][2] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 4:
          {
            if(grid[5][3] == ' ')
            {
              grid[5][3] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][3] == ' ')
            {
              grid[4][3] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][3] == ' ')
            {
              grid[3][3] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][3] == ' ')
            {
              grid[2][3] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[1][3] == ' ')
            {
              grid[1][3] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][3] == ' ')
            {
              grid[0][3] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 5:
          {
            if(grid[5][4] == ' ')
            {
              grid[5][4] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][4] == ' ')
            {
              grid[4][4] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][4] == ' ')
            {
              grid[3][4] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][4] == ' ')
            {
              grid[2][4] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[1][4] == ' ')
            {
              grid[1][4] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][4] == ' ')
            {
              grid[0][4] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 6:
          {
            if(grid[5][5] == ' ')
            {
              grid[5][5] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][5] == ' ')
            {
              grid[4][5] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][5] == ' ')
            {
              grid[3][5] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][5] == ' ')
            {
              grid[2][5] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[1][5] == ' ')
            {
              grid[1][5] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][5] == ' ')
            {
              grid[0][5] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 7:
          {
            if(grid[5][6] == ' ')
            {
              grid[5][6] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][6] == ' ')
            {
              grid[4][6] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][6] == ' ')
            {
              grid[3][6] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][6] == ' ')
            {
              grid[2][6] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][6] == ' ')
            {
              grid[1][6] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][6] == ' ')
            {
              grid[0][6] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          default:
            System.out.println("That's Not Even a Row You Goof!!! Please Try Again");
            isPlayer1Turn = true;
              break;
        }
      }while(isPlayer1Turn == true);
      // End of User Selection Possibility Check
      
      printOptions();
      printBoard(grid);
      
      //Print Options
 
        
      if(grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X' && grid[3][0] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'X' && grid[2][0] == 'X' && grid[3][0] == 'X' && grid[4][0] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[3][0] == 'X' && grid[4][0] == 'X' && grid[5][0] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X' && grid[3][1] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][1] == 'X' && grid[2][1] == 'X' && grid[3][1] == 'X' && grid[4][1] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][1] == 'X' && grid[3][1] == 'X' && grid[4][1] == 'X' && grid[5][1] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X' && grid[3][2] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][2] == 'X' && grid[2][2] == 'X' && grid[3][2] == 'X' && grid[4][2] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][2] == 'X' && grid[3][2] == 'X' && grid[4][2] == 'X' && grid[5][2] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][3] == 'X' && grid[1][3] == 'X' && grid[2][3] == 'X' && grid[3][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][3] == 'X' && grid[2][3] == 'X' && grid[3][3] == 'X' && grid[4][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][3] == 'X' && grid[3][3] == 'X' && grid[4][3] == 'X' && grid[5][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][4] == 'X' && grid[1][4] == 'X' && grid[2][4] == 'X' && grid[3][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][4] == 'X' && grid[2][4] == 'X' && grid[3][4] == 'X' && grid[4][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][4] == 'X' && grid[3][4] == 'X' && grid[4][4] == 'X' && grid[5][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
       else if(grid[0][5] == 'X' && grid[1][5] == 'X' && grid[2][5] == 'X' && grid[3][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][5] == 'X' && grid[2][5] == 'X' && grid[3][5] == 'X' && grid[4][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][5] == 'X' && grid[3][5] == 'X' && grid[4][5] == 'X' && grid[5][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][6] == 'X' && grid[1][6] == 'X' && grid[2][6] == 'X' && grid[3][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][6] == 'X' && grid[2][6] == 'X' && grid[3][6] == 'X' && grid[4][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][6] == 'X' && grid[3][6] == 'X' && grid[4][6] == 'X' && grid[5][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][0] == 'X' && grid[4][1] == 'X' && grid[3][2] == 'X' && grid[2][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][0] == 'X' && grid[3][1] == 'X' && grid[2][2] == 'X' && grid[1][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X' && grid[0][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'X' && grid[0][2] == 'X' && grid[0][3] == 'X' && grid[0][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'X' && grid[0][3] == 'X' && grid[0][4] == 'X' && grid[0][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][3] == 'X' && grid[0][4] == 'X' && grid[0][5] == 'X' && grid[0][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X' && grid[1][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][1] == 'X' && grid[1][2] == 'X' && grid[1][3] == 'X' && grid[1][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][2] == 'X' && grid[1][3] == 'X' && grid[1][4] == 'X' && grid[1][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][3] == 'X' && grid[1][4] == 'X' && grid[1][5] == 'X' && grid[1][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X' && grid[2][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][1] == 'X' && grid[2][2] == 'X' && grid[2][3] == 'X' && grid[2][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][2] == 'X' && grid[2][3] == 'X' && grid[2][4] == 'X' && grid[2][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][3] == 'X' && grid[2][4] == 'X' && grid[2][5] == 'X' && grid[2][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][0] == 'X' && grid[3][1] == 'X' && grid[3][2] == 'X' && grid[3][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][1] == 'X' && grid[3][2] == 'X' && grid[3][3] == 'X' && grid[3][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][2] == 'X' && grid[3][3] == 'X' && grid[3][4] == 'X' && grid[3][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][3] == 'X' && grid[3][4] == 'X' && grid[3][5] == 'X' && grid[3][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][0] == 'X' && grid[4][1] == 'X' && grid[4][2] == 'X' && grid[4][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][1] == 'X' && grid[4][2] == 'X' && grid[4][3] == 'X' && grid[4][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][2] == 'X' && grid[4][3] == 'X' && grid[4][4] == 'X' && grid[4][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][3] == 'X' && grid[4][4] == 'X' && grid[4][5] == 'X' && grid[4][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][0] == 'X' && grid[5][1] == 'X' && grid[5][2] == 'X' && grid[5][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
       else if(grid[4][1] == 'X' && grid[3][2] == 'X' && grid[2][3] == 'X' && grid[1][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][1] == 'X' && grid[2][2] == 'X' && grid[1][3] == 'X' && grid[0][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][1] == 'X' && grid[5][2] == 'X' && grid[5][3] == 'X' && grid[5][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][2] == 'X' && grid[5][3] == 'X' && grid[5][4] == 'X' && grid[5][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][3] == 'X' && grid[5][4] == 'X' && grid[5][5] == 'X' && grid[5][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[3][1] == 'X' && grid[4][2] == 'X' && grid[5][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'X' && grid[2][1] == 'X' && grid[3][2] == 'X' && grid[4][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][1] == 'X' && grid[3][2] == 'X' && grid[4][3] == 'X' && grid[5][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X' && grid[3][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][1] == 'X' && grid[2][2] == 'X' && grid[3][3] == 'X' && grid[4][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][2] == 'X' && grid[3][3] == 'X' && grid[4][4] == 'X' && grid[5][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'X' && grid[1][2] == 'X' && grid[2][3] == 'X' && grid[3][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][2] == 'X' && grid[2][3] == 'X' && grid[3][4] == 'X' && grid[4][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][3] == 'X' && grid[3][4] == 'X' && grid[4][5] == 'X' && grid[5][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'X' && grid[1][3] == 'X' && grid[2][4] == 'X' && grid[3][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][3] == 'X' && grid[2][4] == 'X' && grid[3][5] == 'X' && grid[4][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][3] == 'X' && grid[1][4] == 'X' && grid[2][5] == 'X' && grid[3][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][3] == 'X' && grid[4][4] == 'X' && grid[3][5] == 'X' && grid[2][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][2] == 'X' && grid[4][3] == 'X' && grid[3][4] == 'X' && grid[2][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][3] == 'X' && grid[3][4] == 'X' && grid[2][5] == 'X' && grid[1][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][1] == 'X' && grid[4][2] == 'X' && grid[3][3] == 'X' && grid[2][4] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][2] == 'X' && grid[3][3] == 'X' && grid[2][4] == 'X' && grid[1][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][3] == 'X' && grid[2][4] == 'X' && grid[1][5] == 'X' && grid[0][6] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][2] == 'X' && grid[2][3] == 'X' && grid[1][4] == 'X' && grid[0][5] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][0] == 'X' && grid[2][1] == 'X' && grid[1][2] == 'X' && grid[0][3] == 'X')
      {
        System.out.println("Player 1 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] != ' ' && grid[0][1] != ' ' && grid[0][2] != ' ' && grid[0][3] != ' ' && grid[0][4] != ' ' && grid[0][5] != ' ' && grid[0][6] != ' ' && grid[1][0] != ' ' && grid[1][1] != ' ' && grid[1][2] != ' ' && grid[1][3] != ' ' && grid[1][4] != ' ' && grid[1][5] != ' ' && grid[1][6] != ' ' && grid[2][0] != ' ' && grid[2][1] != ' ' && grid[2][2] != ' ' && grid[2][3] != ' ' && grid[2][4] != ' ' && grid[2][5] != ' ' && grid[2][6] != ' ' && grid[3][0] != ' ' && grid[3][1] != ' ' && grid[3][2] != ' ' && grid[3][3] != ' ' && grid[3][4] != ' ' && grid[3][5] != ' ' && grid[3][6] != ' ' && grid[4][0] != ' ' && grid[4][1] != ' ' && grid[4][2] != ' ' && grid[4][3] != ' ' && grid[4][4] != ' ' && grid[4][5] != ' ' && grid[4][6] != ' ' &&grid[5][0] != ' ' && grid[5][1] != ' ' && grid[5][2] != ' ' && grid[5][3] != ' ' && grid[5][4] != ' ' && grid[5][5] != ' ' && grid[5][6] != ' ')
      {
        System.out.println("WOW! The Two Of You Have Tied The Game!!! Congratz!!!");
        isGameRunning = false;
      }
      else
      {
        isGameRunning = true;
      }// End of Checking for winner 
      
      if(isGameRunning == true)
      {
        do
      {
        System.out.println("Player Twos Turn");//Player Two Turn
        int userInput2 = In.getInt();
        
        switch (userInput2)
        {
          case 1:
          {
            if(grid[5][0] == ' ')
            {
              grid[5][0] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][0] == ' ')
            {
              grid[4][0] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][0] == ' ')
            {
              grid[3][0] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][0] == ' ')
            {
              grid[2][0] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][0] == ' ')
            {
              grid[1][0] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][0] == ' ')
            {
              grid[0][0] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 2:
          {
            if(grid[5][1] == ' ')
            {
              grid[5][1] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][1] == ' ')
            {
              grid[4][1] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][1] == ' ')
            {
              grid[3][1] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][1] == ' ')
            {
              grid[2][1] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][1] == ' ')
            {
              grid[1][1] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][1] == ' ')
            {
              grid[0][1] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 3:
          {
            if(grid[5][2] == ' ')
            {
              grid[5][2] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][2] == ' ')
            {
              grid[4][2] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][2] == ' ')
            {
              grid[3][2] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][2] == ' ')
            {
              grid[2][2] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][2] == ' ')
            {
              grid[1][2] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][2] == ' ')
            {
              grid[0][2] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 4:
          {
            if(grid[5][3] == ' ')
            {
              grid[5][3] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][3] == ' ')
            {
              grid[4][3] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][3] == ' ')
            {
              grid[3][3] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][3] == ' ')
            {
              grid[2][3] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][3] == ' ')
            {
              grid[1][3] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][3] == ' ')
            {
              grid[0][3] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 5:
          {
            if(grid[5][4] == ' ')
            {
              grid[5][4] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][4] == ' ')
            {
              grid[4][4] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][4] == ' ')
            {
              grid[3][4] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][4] == ' ')
            {
              grid[2][4] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][4] == ' ')
            {
              grid[1][4] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][4] == ' ')
            {
              grid[0][4] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 6:
          {
            if(grid[5][5] == ' ')
            {
              grid[5][5] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][5] == ' ')
            {
              grid[4][5] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][5] == ' ')
            {
              grid[3][5] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][5] == ' ')
            {
              grid[2][5] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][5] == ' ')
            {
              grid[1][5] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][5] == ' ')
            {
              grid[0][5] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 7:
          {
            if(grid[5][6] == ' ')
            {
              grid[5][6] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][6] == ' ')
            {
              grid[4][6] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][6] == ' ')
            {
              grid[3][6] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][6] == ' ')
            {
              grid[2][6] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][6] == ' ')
            {
              grid[1][6] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][6] == ' ')
            {
              grid[0][6] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          default:
            System.out.println("That's Not Even a Row You Goof!!! Please Try Again");
            isPlayer1Turn = false;
              break;
        }
      }while(isPlayer1Turn == false);
      
      //End of Checking is Player Two Possible
      
      printOptions();
      printBoard(grid);
      //Printing Board
 
        
      if(grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O' && grid[3][0] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'O' && grid[2][0] == 'O' && grid[3][0] == 'O' && grid[4][0] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'O' && grid[3][0] == 'O' && grid[4][0] == 'O' && grid[5][0] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O' && grid[3][1] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][1] == 'O' && grid[2][1] == 'O' && grid[3][1] == 'O' && grid[4][1] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][1] == 'O' && grid[3][1] == 'O' && grid[4][1] == 'O' && grid[5][1] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O' && grid[3][2] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][2] == 'O' && grid[2][2] == 'O' && grid[3][2] == 'O' && grid[4][2] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][2] == 'O' && grid[3][2] == 'O' && grid[4][2] == 'O' && grid[5][2] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][3] == 'O' && grid[1][3] == 'O' && grid[2][3] == 'O' && grid[3][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][3] == 'O' && grid[2][3] == 'O' && grid[3][3] == 'O' && grid[4][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][3] == 'O' && grid[3][3] == 'O' && grid[4][3] == 'O' && grid[5][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][4] == 'O' && grid[1][4] == 'O' && grid[2][4] == 'O' && grid[3][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][4] == 'O' && grid[2][4] == 'O' && grid[3][4] == 'O' && grid[4][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][4] == 'O' && grid[3][4] == 'O' && grid[4][4] == 'O' && grid[5][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
       else if(grid[0][5] == 'O' && grid[1][5] == 'O' && grid[2][5] == 'O' && grid[3][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][5] == 'O' && grid[2][5] == 'O' && grid[3][5] == 'O' && grid[4][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][5] == 'O' && grid[3][5] == 'O' && grid[4][5] == 'O' && grid[5][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][6] == 'O' && grid[1][6] == 'O' && grid[2][6] == 'O' && grid[3][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][6] == 'O' && grid[2][6] == 'O' && grid[3][6] == 'O' && grid[4][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][6] == 'O' && grid[3][6] == 'O' && grid[4][6] == 'O' && grid[5][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][0] == 'O' && grid[4][1] == 'O' && grid[3][2] == 'O' && grid[2][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][0] == 'O' && grid[3][1] == 'O' && grid[2][2] == 'O' && grid[1][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O' && grid[0][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'O' && grid[0][2] == 'O' && grid[0][3] == 'O' && grid[0][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'O' && grid[0][3] == 'O' && grid[0][4] == 'O' && grid[0][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][3] == 'O' && grid[0][4] == 'O' && grid[0][5] == 'O' && grid[0][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O' && grid[1][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][1] == 'O' && grid[1][2] == 'O' && grid[1][3] == 'O' && grid[1][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][2] == 'O' && grid[1][3] == 'O' && grid[1][4] == 'O' && grid[1][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][3] == 'O' && grid[1][4] == 'O' && grid[1][5] == 'O' && grid[1][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O' && grid[2][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][1] == 'O' && grid[2][2] == 'O' && grid[2][3] == 'O' && grid[2][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][2] == 'O' && grid[2][3] == 'O' && grid[2][4] == 'O' && grid[2][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][3] == 'O' && grid[2][4] == 'O' && grid[2][5] == 'O' && grid[2][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][0] == 'O' && grid[3][1] == 'O' && grid[3][2] == 'O' && grid[3][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][1] == 'O' && grid[3][2] == 'O' && grid[3][3] == 'O' && grid[3][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][2] == 'O' && grid[3][3] == 'O' && grid[3][4] == 'O' && grid[3][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][3] == 'O' && grid[3][4] == 'O' && grid[3][5] == 'O' && grid[3][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][0] == 'O' && grid[4][1] == 'O' && grid[4][2] == 'O' && grid[4][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][1] == 'O' && grid[4][2] == 'O' && grid[4][3] == 'O' && grid[4][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][2] == 'O' && grid[4][3] == 'O' && grid[4][4] == 'X' && grid[4][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][3] == 'O' && grid[4][4] == 'O' && grid[4][5] == 'O' && grid[4][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][0] == 'O' && grid[5][1] == 'O' && grid[5][2] == 'O' && grid[5][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
       else if(grid[4][1] == 'O' && grid[3][2] == 'O' && grid[2][3] == 'O' && grid[1][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][1] == 'O' && grid[2][2] == 'O' && grid[1][3] == 'O' && grid[0][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][1] == 'O' && grid[5][2] == 'O' && grid[5][3] == 'O' && grid[5][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][2] == 'O' && grid[5][3] == 'O' && grid[5][4] == 'O' && grid[5][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][3] == 'O' && grid[5][4] == 'O' && grid[5][5] == 'O' && grid[5][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'O' && grid[3][1] == 'O' && grid[4][2] == 'O' && grid[5][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'O' && grid[2][1] == 'O' && grid[3][2] == 'O' && grid[4][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][1] == 'O' && grid[3][2] == 'O' && grid[4][3] == 'O' && grid[5][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O' && grid[3][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][1] == 'O' && grid[2][2] == 'O' && grid[3][3] == 'O' && grid[4][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][2] == 'O' && grid[3][3] == 'O' && grid[4][4] == 'O' && grid[5][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'X' && grid[1][2] == 'O' && grid[2][3] == 'O' && grid[3][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][2] == 'O' && grid[2][3] == 'O' && grid[3][4] == 'O' && grid[4][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][3] == 'O' && grid[3][4] == 'O' && grid[4][5] == 'O' && grid[5][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'O' && grid[1][3] == 'O' && grid[2][4] == 'O' && grid[3][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][3] == 'O' && grid[2][4] == 'O' && grid[3][5] == 'O' && grid[4][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][3] == 'O' && grid[1][4] == 'O' && grid[2][5] == 'O' && grid[3][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][3] == 'O' && grid[4][4] == 'O' && grid[3][5] == 'O' && grid[2][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][2] == 'O' && grid[4][3] == 'O' && grid[3][4] == 'O' && grid[2][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][3] == 'O' && grid[3][4] == 'O' && grid[2][5] == 'O' && grid[1][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[5][1] == 'O' && grid[4][2] == 'O' && grid[3][3] == 'O' && grid[2][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[4][2] == 'O' && grid[3][3] == 'O' && grid[2][4] == 'O' && grid[1][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][3] == 'O' && grid[2][4] == 'O' && grid[1][5] == 'O' && grid[0][6] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][2] == 'O' && grid[2][3] == 'O' && grid[1][4] == 'O' && grid[0][5] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[3][0] == 'O' && grid[2][1] == 'O' && grid[1][2] == 'O' && grid[0][3] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] != ' ' && grid[0][1] != ' ' && grid[0][2] != ' ' && grid[0][3] != ' ' && grid[0][4] != ' ' && grid[0][5] != ' ' && grid[0][6] != ' ' && grid[1][0] != ' ' && grid[1][1] != ' ' && grid[1][2] != ' ' && grid[1][3] != ' ' && grid[1][4] != ' ' && grid[1][5] != ' ' && grid[1][6] != ' ' && grid[2][0] != ' ' && grid[2][1] != ' ' && grid[2][2] != ' ' && grid[2][3] != ' ' && grid[2][4] != ' ' && grid[2][5] != ' ' && grid[2][6] != ' ' && grid[3][0] != ' ' && grid[3][1] != ' ' && grid[3][2] != ' ' && grid[3][3] != ' ' && grid[3][4] != ' ' && grid[3][5] != ' ' && grid[3][6] != ' ' && grid[4][0] != ' ' && grid[4][1] != ' ' && grid[4][2] != ' ' && grid[4][3] != ' ' && grid[4][4] != ' ' && grid[4][5] != ' ' && grid[4][6] != ' ' && grid[5][0] != ' ' && grid[5][1] != ' ' && grid[5][2] != ' ' && grid[5][3] != ' ' && grid[5][4] != ' ' && grid[5][5] != ' ' && grid[5][6] != ' ')
      {
        System.out.println("WOW! The Two Of You Have Tied The Game!!! Congratz!!!");
        isGameRunning = false;
      }
      else
      {
        isGameRunning = true;
      }
      }// End of Checking if Player Two Wins
    }mainMenu();//Back to MAin Menu, when the game is done
  }
        
        
  
  public static void easyMode()// Method against random AI
  {
    {
    boolean isPlayer1Turn = true;
    boolean isGameRunning = true;
    System.out.println("Welcome to 2 Player Connect Four");
    System.out.println("Player One will be represented as X");
    System.out.println("Player Two will be represented as O");
    //End of information for Player
    
    char[][]grid = new char [6][7];
    grid[0][0] = ' ';
    grid[0][1] = ' ';
    grid[0][2] = ' ';
    grid[0][3] = ' ';
    grid[0][4] = ' ';
    grid[0][5] = ' ';
    grid[0][6] = ' ';
    grid[1][0] = ' ';
    grid[1][1] = ' ';
    grid[1][2] = ' ';
    grid[1][3] = ' ';
    grid[1][4] = ' ';
    grid[1][5] = ' ';
    grid[1][6] = ' ';
    grid[2][0] = ' ';
    grid[2][1] = ' ';
    grid[2][2] = ' ';
    grid[2][3] = ' ';
    grid[2][4] = ' ';
    grid[2][5] = ' ';
    grid[2][6] = ' ';
    grid[3][0] = ' ';
    grid[3][1] = ' ';
    grid[3][2] = ' ';
    grid[3][3] = ' ';
    grid[3][4] = ' ';
    grid[3][5] = ' ';
    grid[3][6] = ' ';
    grid[4][0] = ' ';
    grid[4][1] = ' ';
    grid[4][2] = ' ';
    grid[4][3] = ' ';
    grid[4][4] = ' ';
    grid[4][5] = ' ';
    grid[4][6] = ' ';
    grid[5][0] = ' ';
    grid[5][1] = ' ';
    grid[5][2] = ' ';
    grid[5][3] = ' ';
    grid[5][4] = ' ';
    grid[5][5] = ' ';
    grid[5][6] = ' ';
    printOptions();
    printBoard(grid);
    //End of Connect Four Board Creation.
    
    while(isGameRunning == true)
    {
      
      do
      {
        System.out.println("Player Ones Turn");
        int userInput = In.getInt();
        
        switch (userInput)
        {
          case 1:
          {
            if(grid[5][0] == ' ')
            {
              grid[5][0] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][0] == ' ')
            {
              grid[4][0] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][0] == ' ')
            {
              grid[3][0] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][0] == ' ')
            {
              grid[2][0] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[1][0] == ' ')
            {
              grid[1][0] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][0] == ' ')
            {
              grid[0][0] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 2:
          {
            if(grid[5][1] == ' ')
            {
              grid[5][1] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][1] == ' ')
            {
              grid[4][1] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][1] == ' ')
            {
              grid[3][1] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][1] == ' ')
            {
              grid[2][1] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[1][1] == ' ')
            {
              grid[1][1] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][1] == ' ')
            {
              grid[0][1] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 3:
          {
            if(grid[5][2] == ' ')
            {
              grid[5][2] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][2] == ' ')
            {
              grid[4][2] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][2] == ' ')
            {
              grid[3][2] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][2] == ' ')
            {
              grid[2][2] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[1][2] == ' ')
            {
              grid[1][2] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][2] == ' ')
            {
              grid[0][2] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 4:
          {
            if(grid[5][3] == ' ')
            {
              grid[5][3] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][3] == ' ')
            {
              grid[4][3] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][3] == ' ')
            {
              grid[3][3] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][3] == ' ')
            {
              grid[2][3] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[1][3] == ' ')
            {
              grid[1][3] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][3] == ' ')
            {
              grid[0][3] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 5:
          {
            if(grid[5][4] == ' ')
            {
              grid[5][4] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][4] == ' ')
            {
              grid[4][4] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][4] == ' ')
            {
              grid[3][4] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][4] == ' ')
            {
              grid[2][4] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[1][4] == ' ')
            {
              grid[1][4] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][4] == ' ')
            {
              grid[0][4] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 6:
          {
            if(grid[5][5] == ' ')
            {
              grid[5][5] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][5] == ' ')
            {
              grid[4][5] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][5] == ' ')
            {
              grid[3][5] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][5] == ' ')
            {
              grid[2][5] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[1][5] == ' ')
            {
              grid[1][5] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][5] == ' ')
            {
              grid[0][5] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 7:
          {
            if(grid[5][6] == ' ')
            {
              grid[5][6] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[4][6] == ' ')
            {
              grid[4][6] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][6] == ' ')
            {
              grid[3][6] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[3][6] == ' ')
            {
              grid[2][6] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[2][6] == ' ')
            {
              grid[1][6] = 'X';
              isPlayer1Turn = false;
            }
            else if(grid[0][6] == ' ')
            {
              grid[0][6] = 'X';
              isPlayer1Turn = false;
            }
            else
            {
              isPlayer1Turn = true;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          default:
            System.out.println("That's Not Even a Row You Goof!!! Please Try Again");
            isPlayer1Turn = true;
              break;
        }
      }while(isPlayer1Turn == true);
      //End of checking if Player 1 Possible Position
      
      printOptions();
      printBoard(grid);
 
        
      if(grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X' && grid[3][0] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'X' && grid[2][0] == 'X' && grid[3][0] == 'X' && grid[4][0] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[3][0] == 'X' && grid[4][0] == 'X' && grid[5][0] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X' && grid[3][1] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][1] == 'X' && grid[2][1] == 'X' && grid[3][1] == 'X' && grid[4][1] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][1] == 'X' && grid[3][1] == 'X' && grid[4][1] == 'X' && grid[5][1] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X' && grid[3][2] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][2] == 'X' && grid[2][2] == 'X' && grid[3][2] == 'X' && grid[4][2] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][2] == 'X' && grid[3][2] == 'X' && grid[4][2] == 'X' && grid[5][2] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][3] == 'X' && grid[1][3] == 'X' && grid[2][3] == 'X' && grid[3][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][3] == 'X' && grid[2][3] == 'X' && grid[3][3] == 'X' && grid[4][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][3] == 'X' && grid[3][3] == 'X' && grid[4][3] == 'X' && grid[5][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][4] == 'X' && grid[1][4] == 'X' && grid[2][4] == 'X' && grid[3][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][4] == 'X' && grid[2][4] == 'X' && grid[3][4] == 'X' && grid[4][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][4] == 'X' && grid[3][4] == 'X' && grid[4][4] == 'X' && grid[5][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
       else if(grid[0][5] == 'X' && grid[1][5] == 'X' && grid[2][5] == 'X' && grid[3][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][5] == 'X' && grid[2][5] == 'X' && grid[3][5] == 'X' && grid[4][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][5] == 'X' && grid[3][5] == 'X' && grid[4][5] == 'X' && grid[5][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][6] == 'X' && grid[1][6] == 'X' && grid[2][6] == 'X' && grid[3][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][6] == 'X' && grid[2][6] == 'X' && grid[3][6] == 'X' && grid[4][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][6] == 'X' && grid[3][6] == 'X' && grid[4][6] == 'X' && grid[5][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[5][0] == 'X' && grid[4][1] == 'X' && grid[3][2] == 'X' && grid[2][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[4][0] == 'X' && grid[3][1] == 'X' && grid[2][2] == 'X' && grid[1][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X' && grid[0][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'X' && grid[0][2] == 'X' && grid[0][3] == 'X' && grid[0][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'X' && grid[0][3] == 'X' && grid[0][4] == 'X' && grid[0][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][3] == 'X' && grid[0][4] == 'X' && grid[0][5] == 'X' && grid[0][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X' && grid[1][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][1] == 'X' && grid[1][2] == 'X' && grid[1][3] == 'X' && grid[1][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][2] == 'X' && grid[1][3] == 'X' && grid[1][4] == 'X' && grid[1][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][3] == 'X' && grid[1][4] == 'X' && grid[1][5] == 'X' && grid[1][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X' && grid[2][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][1] == 'X' && grid[2][2] == 'X' && grid[2][3] == 'X' && grid[2][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][2] == 'X' && grid[2][3] == 'X' && grid[2][4] == 'X' && grid[2][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][3] == 'X' && grid[2][4] == 'X' && grid[2][5] == 'X' && grid[2][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[3][0] == 'X' && grid[3][1] == 'X' && grid[3][2] == 'X' && grid[3][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[3][1] == 'X' && grid[3][2] == 'X' && grid[3][3] == 'X' && grid[3][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[3][2] == 'X' && grid[3][3] == 'X' && grid[3][4] == 'X' && grid[3][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[3][3] == 'X' && grid[3][4] == 'X' && grid[3][5] == 'X' && grid[3][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[4][0] == 'X' && grid[4][1] == 'X' && grid[4][2] == 'X' && grid[4][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[4][1] == 'X' && grid[4][2] == 'X' && grid[4][3] == 'X' && grid[4][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[4][2] == 'X' && grid[4][3] == 'X' && grid[4][4] == 'X' && grid[4][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[4][3] == 'X' && grid[4][4] == 'X' && grid[4][5] == 'X' && grid[4][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[5][0] == 'X' && grid[5][1] == 'X' && grid[5][2] == 'X' && grid[5][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
       else if(grid[4][1] == 'X' && grid[3][2] == 'X' && grid[2][3] == 'X' && grid[1][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[3][1] == 'X' && grid[2][2] == 'X' && grid[1][3] == 'X' && grid[0][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[5][1] == 'X' && grid[5][2] == 'X' && grid[5][3] == 'X' && grid[5][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[5][2] == 'X' && grid[5][3] == 'X' && grid[5][4] == 'X' && grid[5][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[5][3] == 'X' && grid[5][4] == 'X' && grid[5][5] == 'X' && grid[5][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[3][1] == 'X' && grid[4][2] == 'X' && grid[5][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'X' && grid[2][1] == 'X' && grid[3][2] == 'X' && grid[4][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][1] == 'X' && grid[3][2] == 'X' && grid[4][3] == 'X' && grid[5][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X' && grid[3][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][1] == 'X' && grid[2][2] == 'X' && grid[3][3] == 'X' && grid[4][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][2] == 'X' && grid[3][3] == 'X' && grid[4][4] == 'X' && grid[5][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'X' && grid[1][2] == 'X' && grid[2][3] == 'X' && grid[3][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][2] == 'X' && grid[2][3] == 'X' && grid[3][4] == 'X' && grid[4][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][3] == 'X' && grid[3][4] == 'X' && grid[4][5] == 'X' && grid[5][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'X' && grid[1][3] == 'X' && grid[2][4] == 'X' && grid[3][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][3] == 'X' && grid[2][4] == 'X' && grid[3][5] == 'X' && grid[4][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][3] == 'X' && grid[1][4] == 'X' && grid[2][5] == 'X' && grid[3][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[5][3] == 'X' && grid[4][4] == 'X' && grid[3][5] == 'X' && grid[2][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[5][2] == 'X' && grid[4][3] == 'X' && grid[3][4] == 'X' && grid[2][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[4][3] == 'X' && grid[3][4] == 'X' && grid[2][5] == 'X' && grid[1][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[5][1] == 'X' && grid[4][2] == 'X' && grid[3][3] == 'X' && grid[2][4] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[4][2] == 'X' && grid[3][3] == 'X' && grid[2][4] == 'X' && grid[1][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[3][3] == 'X' && grid[2][4] == 'X' && grid[1][5] == 'X' && grid[0][6] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[3][2] == 'X' && grid[2][3] == 'X' && grid[1][4] == 'X' && grid[0][5] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[3][0] == 'X' && grid[2][1] == 'X' && grid[1][2] == 'X' && grid[0][3] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] != ' ' && grid[0][1] != ' ' && grid[0][2] != ' ' && grid[0][3] != ' ' && grid[0][4] != ' ' && grid[0][5] != ' ' && grid[0][6] != ' ' && grid[1][0] != ' ' && grid[1][1] != ' ' && grid[1][2] != ' ' && grid[1][3] != ' ' && grid[1][4] != ' ' && grid[1][5] != ' ' && grid[1][6] != ' ' && grid[2][0] != ' ' && grid[2][1] != ' ' && grid[2][2] != ' ' && grid[2][3] != ' ' && grid[2][4] != ' ' && grid[2][5] != ' ' && grid[2][6] != ' ' && grid[3][0] != ' ' && grid[3][1] != ' ' && grid[3][2] != ' ' && grid[3][3] != ' ' && grid[3][4] != ' ' && grid[3][5] != ' ' && grid[3][6] != ' ' && grid[4][0] != ' ' && grid[4][1] != ' ' && grid[4][2] != ' ' && grid[4][3] != ' ' && grid[4][4] != ' ' && grid[4][5] != ' ' && grid[4][6] != ' ' &&grid[5][0] != ' ' && grid[5][1] != ' ' && grid[5][2] != ' ' && grid[5][3] != ' ' && grid[5][4] != ' ' && grid[5][5] != ' ' && grid[5][6] != ' ')
      {
        System.out.println("WOW! You and Bobo Have Tied The Game!!! Congratz!!!");
        isGameRunning = false;
      }
      else
      {
        isGameRunning = true;
      }// End of checking if Player 1 Wins 
      
      if(isGameRunning == true)
      {
        do
      { // Computers Turn
        System.out.println("Bobo's Turn");
        Random rand = new Random(); 
        rand.nextInt(8);
        int computerInput = rand.nextInt(8) + 1;
        
        switch (computerInput)
        {
          case 1:
          {
            if(grid[5][0] == ' ')
            {
              grid[5][0] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][0] == ' ')
            {
              grid[4][0] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][0] == ' ')
            {
              grid[3][0] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][0] == ' ')
            {
              grid[2][0] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][0] == ' ')
            {
              grid[1][0] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][0] == ' ')
            {
              grid[0][0] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 2:
          {
            if(grid[5][1] == ' ')
            {
              grid[5][1] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][1] == ' ')
            {
              grid[4][1] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][1] == ' ')
            {
              grid[3][1] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][1] == ' ')
            {
              grid[2][1] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][1] == ' ')
            {
              grid[1][1] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][1] == ' ')
            {
              grid[0][1] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 3:
          {
            if(grid[5][2] == ' ')
            {
              grid[5][2] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][2] == ' ')
            {
              grid[4][2] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][2] == ' ')
            {
              grid[3][2] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][2] == ' ')
            {
              grid[2][2] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][2] == ' ')
            {
              grid[1][2] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][2] == ' ')
            {
              grid[0][2] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 4:
          {
            if(grid[5][3] == ' ')
            {
              grid[5][3] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][3] == ' ')
            {
              grid[4][3] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][3] == ' ')
            {
              grid[3][3] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][3] == ' ')
            {
              grid[2][3] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][3] == ' ')
            {
              grid[1][3] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][3] == ' ')
            {
              grid[0][3] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 5:
          {
            if(grid[5][4] == ' ')
            {
              grid[5][4] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][4] == ' ')
            {
              grid[4][4] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][4] == ' ')
            {
              grid[3][4] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][4] == ' ')
            {
              grid[2][4] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][4] == ' ')
            {
              grid[1][4] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][4] == ' ')
            {
              grid[0][4] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 6:
          {
            if(grid[5][5] == ' ')
            {
              grid[5][5] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][5] == ' ')
            {
              grid[4][5] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][5] == ' ')
            {
              grid[3][5] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][5] == ' ')
            {
              grid[2][5] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][5] == ' ')
            {
              grid[1][5] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][5] == ' ')
            {
              grid[0][5] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          case 7:
          {
            if(grid[5][6] == ' ')
            {
              grid[5][6] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[4][6] == ' ')
            {
              grid[4][6] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[3][6] == ' ')
            {
              grid[3][6] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[2][6] == ' ')
            {
              grid[2][6] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[1][6] == ' ')
            {
              grid[1][6] = 'O';
              isPlayer1Turn = true;
            }
            else if(grid[0][6] == ' ')
            {
              grid[0][6] = 'O';
              isPlayer1Turn = true;
            }
            else
            {
              isPlayer1Turn = false;
              System.out.println("This Column Is Full Silly!!! Please Try Again");
            }
          }
          break;
          default:
            System.out.println("That's Not Even a Row You Goof!!! Please Try Again");
            isPlayer1Turn = false;
              break;
        }
      }while(isPlayer1Turn == false);
      // End of Checking if Computer Possible Position
      printOptions();
      printBoard(grid);
 
        
      if(grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O' && grid[3][0] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'O' && grid[2][0] == 'O' && grid[3][0] == 'O' && grid[4][0] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'O' && grid[3][0] == 'O' && grid[4][0] == 'O' && grid[5][0] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O' && grid[3][1] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][1] == 'O' && grid[2][1] == 'O' && grid[3][1] == 'O' && grid[4][1] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][1] == 'O' && grid[3][1] == 'O' && grid[4][1] == 'O' && grid[5][1] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O' && grid[3][2] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][2] == 'O' && grid[2][2] == 'O' && grid[3][2] == 'O' && grid[4][2] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][2] == 'O' && grid[3][2] == 'O' && grid[4][2] == 'O' && grid[5][2] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][3] == 'O' && grid[1][3] == 'O' && grid[2][3] == 'O' && grid[3][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][3] == 'O' && grid[2][3] == 'O' && grid[3][3] == 'O' && grid[4][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][3] == 'O' && grid[3][3] == 'O' && grid[4][3] == 'O' && grid[5][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][4] == 'O' && grid[1][4] == 'O' && grid[2][4] == 'O' && grid[3][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][4] == 'O' && grid[2][4] == 'O' && grid[3][4] == 'O' && grid[4][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][4] == 'O' && grid[3][4] == 'O' && grid[4][4] == 'O' && grid[5][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
       else if(grid[0][5] == 'O' && grid[1][5] == 'O' && grid[2][5] == 'O' && grid[3][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][5] == 'O' && grid[2][5] == 'O' && grid[3][5] == 'O' && grid[4][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][5] == 'O' && grid[3][5] == 'O' && grid[4][5] == 'O' && grid[5][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][6] == 'O' && grid[1][6] == 'O' && grid[2][6] == 'O' && grid[3][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][6] == 'O' && grid[2][6] == 'O' && grid[3][6] == 'O' && grid[4][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!!");
        isGameRunning = false;
      }
      else if(grid[2][6] == 'O' && grid[3][6] == 'O' && grid[4][6] == 'O' && grid[5][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[5][0] == 'O' && grid[4][1] == 'O' && grid[3][2] == 'O' && grid[2][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[4][0] == 'O' && grid[3][1] == 'O' && grid[2][2] == 'O' && grid[1][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O' && grid[0][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'O' && grid[0][2] == 'O' && grid[0][3] == 'O' && grid[0][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'O' && grid[0][3] == 'O' && grid[0][4] == 'O' && grid[0][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][3] == 'O' && grid[0][4] == 'O' && grid[0][5] == 'O' && grid[0][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O' && grid[1][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][1] == 'O' && grid[1][2] == 'O' && grid[1][3] == 'O' && grid[1][4] == 'O')
      {
        System.out.println("Player 2 Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][2] == 'O' && grid[1][3] == 'O' && grid[1][4] == 'O' && grid[1][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][3] == 'O' && grid[1][4] == 'O' && grid[1][5] == 'O' && grid[1][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O' && grid[2][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][1] == 'O' && grid[2][2] == 'O' && grid[2][3] == 'O' && grid[2][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][2] == 'O' && grid[2][3] == 'O' && grid[2][4] == 'O' && grid[2][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][3] == 'O' && grid[2][4] == 'O' && grid[2][5] == 'O' && grid[2][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[3][0] == 'O' && grid[3][1] == 'O' && grid[3][2] == 'O' && grid[3][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[3][1] == 'O' && grid[3][2] == 'O' && grid[3][3] == 'O' && grid[3][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[3][2] == 'O' && grid[3][3] == 'O' && grid[3][4] == 'O' && grid[3][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[3][3] == 'O' && grid[3][4] == 'O' && grid[3][5] == 'O' && grid[3][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[4][0] == 'O' && grid[4][1] == 'O' && grid[4][2] == 'O' && grid[4][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[4][1] == 'O' && grid[4][2] == 'O' && grid[4][3] == 'O' && grid[4][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[4][2] == 'O' && grid[4][3] == 'O' && grid[4][4] == 'X' && grid[4][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[4][3] == 'O' && grid[4][4] == 'O' && grid[4][5] == 'O' && grid[4][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[5][0] == 'O' && grid[5][1] == 'O' && grid[5][2] == 'O' && grid[5][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
       else if(grid[4][1] == 'O' && grid[3][2] == 'O' && grid[2][3] == 'O' && grid[1][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[3][1] == 'O' && grid[2][2] == 'O' && grid[1][3] == 'O' && grid[0][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[5][1] == 'O' && grid[5][2] == 'O' && grid[5][3] == 'O' && grid[5][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[5][2] == 'O' && grid[5][3] == 'O' && grid[5][4] == 'O' && grid[5][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[5][3] == 'O' && grid[5][4] == 'O' && grid[5][5] == 'O' && grid[5][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'O' && grid[3][1] == 'O' && grid[4][2] == 'O' && grid[5][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'O' && grid[2][1] == 'O' && grid[3][2] == 'O' && grid[4][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][1] == 'O' && grid[3][2] == 'O' && grid[4][3] == 'O' && grid[5][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O' && grid[3][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][1] == 'O' && grid[2][2] == 'O' && grid[3][3] == 'O' && grid[4][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][2] == 'O' && grid[3][3] == 'O' && grid[4][4] == 'O' && grid[5][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'X' && grid[1][2] == 'O' && grid[2][3] == 'O' && grid[3][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][2] == 'O' && grid[2][3] == 'O' && grid[3][4] == 'O' && grid[4][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[2][3] == 'O' && grid[3][4] == 'O' && grid[4][5] == 'O' && grid[5][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'O' && grid[1][3] == 'O' && grid[2][4] == 'O' && grid[3][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[1][3] == 'O' && grid[2][4] == 'O' && grid[3][5] == 'O' && grid[4][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][3] == 'O' && grid[1][4] == 'O' && grid[2][5] == 'O' && grid[3][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[5][3] == 'O' && grid[4][4] == 'O' && grid[3][5] == 'O' && grid[2][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[5][2] == 'O' && grid[4][3] == 'O' && grid[3][4] == 'O' && grid[2][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[4][3] == 'O' && grid[3][4] == 'O' && grid[2][5] == 'O' && grid[1][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[5][1] == 'O' && grid[4][2] == 'O' && grid[3][3] == 'O' && grid[2][4] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[4][2] == 'O' && grid[3][3] == 'O' && grid[2][4] == 'O' && grid[1][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[3][3] == 'O' && grid[2][4] == 'O' && grid[1][5] == 'O' && grid[0][6] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[3][2] == 'O' && grid[2][3] == 'O' && grid[1][4] == 'O' && grid[0][5] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[3][0] == 'O' && grid[2][1] == 'O' && grid[1][2] == 'O' && grid[0][3] == 'O')
      {
        System.out.println("Bobo Won!!! Bobo Never Wins!!! WOW!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] != ' ' && grid[0][1] != ' ' && grid[0][2] != ' ' && grid[0][3] != ' ' && grid[0][4] != ' ' && grid[0][5] != ' ' && grid[0][6] != ' ' && grid[1][0] != ' ' && grid[1][1] != ' ' && grid[1][2] != ' ' && grid[1][3] != ' ' && grid[1][4] != ' ' && grid[1][5] != ' ' && grid[1][6] != ' ' && grid[2][0] != ' ' && grid[2][1] != ' ' && grid[2][2] != ' ' && grid[2][3] != ' ' && grid[2][4] != ' ' && grid[2][5] != ' ' && grid[2][6] != ' ' && grid[3][0] != ' ' && grid[3][1] != ' ' && grid[3][2] != ' ' && grid[3][3] != ' ' && grid[3][4] != ' ' && grid[3][5] != ' ' && grid[3][6] != ' ' && grid[4][0] != ' ' && grid[4][1] != ' ' && grid[4][2] != ' ' && grid[4][3] != ' ' && grid[4][4] != ' ' && grid[4][5] != ' ' && grid[4][6] != ' ' && grid[5][0] != ' ' && grid[5][1] != ' ' && grid[5][2] != ' ' && grid[5][3] != ' ' && grid[5][4] != ' ' && grid[5][5] != ' ' && grid[5][6] != ' ')
      {
        System.out.println("WOW! You and Bobo Have Tied The Game!!! Congratz!!!");
        isGameRunning = false;
      }
      else
      {
        isGameRunning = true;
      }// End of Checking if Computer Wins
      }
    }mainMenu(); //End of Game, back to main menu
  }
  }
}