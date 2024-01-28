package practise.tic_tac_toe;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        char[][] board=new char[3][3];
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                board[i][j]=' ';
            }
        }
        char player='O';
        boolean b=false;

        while (!b){
            displayBoard(board);
            System.out.println("Player "+player+" please enter your row and col position");
            int row=input.nextInt();
            int col=input.nextInt();
            if(board[row][col]==' '){
                board[row][col]=player;
                if(checkWin(board,player)){
                    System.out.println("Player "+player+" you won the game");
                    b=true;
                }
                else {
                    player=(player=='X')?'O':'X';
                }
            }
            else{
                System.out.println("please enter valid input to place");
            }
        }
        displayBoard(board);
    }

    private static boolean checkWin(char[][] board, char player) {
        for(int row=0;row<board.length;row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }

        for(int col=0;col<board[0].length;col++)
        {
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }

        if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }

        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        return false;
    }

    private static void displayBoard(char[][] board) {
        for(int i=0;i< board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                System.out.print(board[i][j]+" || ");
            }
            System.out.println();
        }
    }
}
