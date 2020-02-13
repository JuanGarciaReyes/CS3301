import java.lang.Math;
import java.io.*;
import java.util.*;
/*
Juan Angel Garcia Reyes.
80591934.
T-TH 3:00- 4:20.
Professor- Dr. Oscar Mondragon.
*/
public class Knight extends Piece {

  public Knight(){
    super("Knight", "White", 'C', 1);
  }
  public Knight(String type, String color, char x_move, int y_move){
    super(type, color, x_move, y_move);
  }

  @Override
  public boolean checkMovement( int x, int y){
    HashMap<Character, Integer> converter = new HashMap<Character, Integer>(); // Hashmmap creation for changing letters to numbers
    converter.put('A', 1); converter.put('B', 2); converter.put('C', 3); converter.put('D', 4);converter.put('E', 5);converter.put('F', 6);converter.put('G', 7);converter.put('H', 8);
    converter.put('a', 1); converter.put('b', 2); converter.put('c', 3); converter.put('d', 4);converter.put('e', 5);converter.put('f', 6);converter.put('g', 7);converter.put('h', 8);
    int temp = converter.get(getpos_x());
    if((Math.abs(x-temp) == 1 && Math.abs(y-getpos_y())== 2 )||(Math.abs(x-temp) == 2 && Math.abs(y-getpos_y()) == 1 )){
      System.out.println("a valid move");
      return true;
    }
    else{
      System.out.println("an invalid move");
    return false;
   }
  }// end of method
 }//end of class
