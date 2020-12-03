import java.util.Scanner;


public class TicTacToe {

    
   
static Scanner in;
static String[] board;
static String turn;

public static void main(String[] args) {
in = new Scanner(System.in);
board = new String[9];
turn = "X";
String winner = null;
populateEmptyBoard();

System.out.println("\nWelcome to 2 Player Tic Tac Toe.");
System.out.println("\n--------------------------------");
printBoard();
System.out.println("\nX's will play first. Enter a slot number to place X in:");

}
static void printBoard() {
System.out.println("\n/---|---|---\\");
System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
System.out.println("|-----------|");
System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
System.out.println("|-----------|");
System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
System.out.println("/---|---|---\\");
}
static void populateEmptyBoard() {
for (int a = 0; a< 9; a++) {
board[a] = String.valueOf(a+1);
}
}
}
