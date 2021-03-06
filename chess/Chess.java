/*
Juan Angel Garcia Reyes.
80591934.
T-TH 3:00- 4:20.
Professor- Dr. Oscar Mondragon.
*/
import java.util.HashMap;
import java.util.Scanner;

public class Chess{
  public static void main(String args[]){
    System.out.println("Do you want to play?");
    Scanner scanner = new Scanner(System.in);
    String answer = scanner.next(); //basic answering qeustion
    if(answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("Yes")|| answer.equalsIgnoreCase("YES")) { //if statement if you really want to play
      System.out.println("This will be fun");
    }else{
      System.out.println("Thank you for your honesty, have a nice day.");
      return;
    }
    Pawn pawn = new Pawn(); Rook rook = new Rook(); Bishop bishop = new Bishop(); Knight knight = new Knight(); Queen queen = new Queen(); King king = new King(); //calling and creating pieces objects
    System.out.println("Which position in X do you want to start?");
    char first_x = scanner.next().charAt(0); //input the position in x
    if((first_x != 'a')&&(first_x !='A')&&(first_x !='b')&&(first_x !='B')&&(first_x !='c')&&(first_x !='C')&&(first_x !='d')&&(first_x !='D')&&(first_x !='e')&&(first_x !='E')&&(first_x !='f')&&(first_x !='F')
    &&(first_x !='g')&&(first_x !='G')&&(first_x !='h')&&(first_x !='H')){
      System.out.println("try again later please");
      return;
    }
    pawn.setpos_x(first_x); rook.setpos_x(first_x); knight.setpos_x(first_x); bishop.setpos_x(first_x); queen.setpos_x(first_x); king.setpos_x(first_x); //setters for x position
    System.out.println("Which position in Y do you want to start?");
    String first_y = scanner.next();// input the position in y
    int first_convertion = Integer.parseInt(first_y); //convertion of the input entry
    if(first_convertion>8){
      System.out.println("try again later please");
      return;
    }
    pawn.setpos_y(first_convertion); rook.setpos_y(first_convertion); knight.setpos_y(first_convertion); bishop.setpos_y(first_convertion); queen.setpos_y(first_convertion); king.setpos_y(first_convertion); //setters for x position
    System.out.println("which color would you like ( 0 for white, 1 for black) ?");
    int color = scanner.nextInt();
    if(color == 0){
      pawn.set_color(true); rook.set_color(true); bishop.set_color(true); knight.set_color(true); queen.set_color(true); king.set_color(true); //setters for color
    }else{
      pawn.set_color(false); rook.set_color(false); bishop.set_color(false); knight.set_color(false); queen.set_color(false); king.set_color(false); //if black
    }
    System.out.println("----------------------------------------");
    System.out.print( "Your piece is color ");
    if(pawn.get_color() == true){
      System.out.print("White at position ");
    }else{
      System.out.print("Black at position ");
    }
    System.out.println(pawn.getpos_x() +""+ pawn.getpos_y());
    System.out.println("----------------------------------------");
System.out.println();
    System.out.println("Which position in X do you want to move?");
    char answer_x = scanner.next().charAt(0); //input the position in x
    System.out.println("Which position in Y do you want to move?");
    String answer_y = scanner.next();// input the position in y
    int answer_convertion = Integer.parseInt(answer_y); //convertion of the input entry
    System.out.println("----------------------------------------");
    System.out.println("Your position is " + answer_x+answer_y);
    System.out.println("----------------------------------------");
    HashMap<Character, Integer> converter = new HashMap<Character, Integer>(); // Hashmmap creation for changing letters to numbers
    converter.put('A', 1); converter.put('B', 2); converter.put('C', 3); converter.put('D', 4);converter.put('E', 5);converter.put('F', 6);converter.put('G', 7);converter.put('H', 8);
    converter.put('a', 1); converter.put('b', 2); converter.put('c', 3); converter.put('d', 4);converter.put('e', 5);converter.put('f', 6);converter.put('h', 7);converter.put('h', 8);
    System.out.println("which piece would you like?");
    String counter = scanner.next();
    int temp = converter.get(pawn.getpos_x());
    int temp2 = converter.get(answer_x);
    switch(counter){
      case "pawn":{
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.print("pawn move is ");
        pawn.check_movement(pawn.get_color(),temp2,answer_convertion,temp,pawn.getpos_y());
        System.out.println("----------------------------------------");
        break;

      }
      case "bishop":{
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.print("bishop move is ");
        bishop.check_movement(temp2,answer_convertion,temp,bishop.getpos_y());
        System.out.println("----------------------------------------");
        break;


      }
      case "rook":{
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.print("rook move is ");
        rook.check_movement(temp2,answer_convertion,temp,rook.getpos_y());
        System.out.println("----------------------------------------");
        break;

      }
      case "knight":{
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.print("Knight move is ");
        knight.check_movement(temp2,answer_convertion,temp,knight.getpos_y());
        System.out.println("----------------------------------------");
        break;

      }
      case "queen":{
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.print("Queen move is ");
        queen.check_movement(temp2,answer_convertion,temp,queen.getpos_y());
        System.out.println("----------------------------------------");
        break;

      }
      case "king":{
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.print("King move is ");
        king.check_movement(temp2,answer_convertion,temp,king.getpos_y());
        System.out.println("----------------------------------------");
        break;

      }
      default:
      System.out.println();
      System.out.println();
      System.out.println("");
    }
    System.out.println("Thank you for checking your moves with Juan Garcia ");


  }// end of main
}// end of the class
