/*
Juan Angel Garcia Reyes.
80591934.
T-TH 3:00- 4:20.
Professor- Dr. Oscar Mondragon.
*/
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;



public class Chess{
  public static void main(String args[]) throws FileNotFoundException { //this will help us if the file is not found
    System.out.println("Welcome to the Juan's Checklist, Do you want to play?");
    System.out.println("true or false");
    Scanner scanner = new Scanner(System.in); //creating an scanner variable
    boolean answer = scanner.nextBoolean(); //variable
    if(!answer){
      System.out.println("See you later...");
      System.exit(0); //this will kill the code
    }
    File text = new File("test.txt"); //this variable will contain the file we will manipulate.
    Scanner scanFile = new Scanner(text);
    ArrayList<Piece> arrayList = new ArrayList<>();



    System.out.println("which position in x do you want?");
    boolean helper = true; //helper for the while
    char x = scanner.next().charAt(0); //input the position in x
    x = Character.toLowerCase(x);
    if(x <'a' || x >'h'){
      System.out.println("try again later please");
      System.exit(0);
    }
    System.out.println("Which position in Y do you want to start?");
    String first_y = scanner.next();// input the position in y
    int y = Integer.parseInt(first_y); //convertion of the input entry
    if(y>8){
      System.out.println("try again later please");
      return;
    }
    while(scanFile.hasNextLine()){
      String line = scanFile.nextLine();
      String[] temp = line.split(", ");
      String switchcase = temp[0].substring(0, temp[0].length()-2);
      //System.out.println(switchcase);
      switch(switchcase){
        case "Pawn":
        Pawn pawn = new Pawn(temp[0],temp[1],temp[2].charAt(0),Integer.parseInt(temp[3]));
        System.out.println("------------------------------");
        System.out.print(temp[0] +" is ");
        pawn.checkMovement(x, y);
        System.out.println("------------------------------");
        System.out.println("");

        break;
        case "Knight":
        Knight knight = new Knight(temp[0], temp[1], temp[2].charAt(0), Integer.parseInt(temp[3]));
        System.out.println("------------------------------");
        System.out.print(temp[0] +" is ");
        knight.checkMovement(x, y);
        System.out.println("------------------------------");
        System.out.println("");
        break;
        case "Bishop":
        Bishop bishop = new Bishop(temp[0], temp[1], temp[2].charAt(0), Integer.parseInt(temp[3]));
        System.out.println("------------------------------");
        System.out.print(temp[0] +" is ");
        bishop.checkMovement(x, y);
        System.out.println("------------------------------");
        System.out.println("");
        break;
        case "Rook":
        Rook rook = new Rook(temp[0], temp[1], temp[2].charAt(0), Integer.parseInt(temp[3]));
        System.out.println("------------------------------");
        System.out.print(temp[0] +" is ");
        rook.checkMovement(x, y);
        System.out.println("------------------------------");
        System.out.println("");
        break;
        case "King":
        King king = new King(temp[0],temp[1],temp[2].charAt(0),Integer.parseInt(temp[3]));
        System.out.println("------------------------------");
        System.out.print(temp[0] +" is ");
        king.checkMovement(x, y);
        System.out.println("------------------------------");
        System.out.println("");
        break;
        case "Queen":
        Queen queen = new Queen(temp[0],temp[1],temp[2].charAt(0),Integer.parseInt(temp[3]));
        System.out.println("------------------------------");
        System.out.print(temp[0] +" is ");
        queen.checkMovement(x, y);
        System.out.println("------------------------------");
        System.out.println("");

        break;
        default:
        System.out.println("");
        System.out.println("The piece was not readable.");
        System.out.println("");
        break;
      }//switch
    }//while
  }//main done
}//class done
