/*
Juan Angel Garcia Reyes.
80591934.
T-TH 3:00- 4:20.
Professor- Dr. Oscar Mondragon.
*/
import java.io.*;
import java.util.*;
public class Rook extends Piece{
  public Rook(){
    super("Rook", "White", 'A', 1);

  }
  public Rook(String type, String color, char x_move, int y_move){
    super(type, color, x_move, y_move);
  }
  public boolean checkMovement(int x, int y){
    HashMap<Character, Integer> converter = new HashMap<Character, Integer>(); // Hashmmap creation for changing letters to numbers
    converter.put('A', 1); converter.put('B', 2); converter.put('C', 3); converter.put('D', 4);converter.put('E', 5);converter.put('F', 6);converter.put('G', 7);converter.put('H', 8);
    converter.put('a', 1); converter.put('b', 2); converter.put('c', 3); converter.put('d', 4);converter.put('e', 5);converter.put('f', 6);converter.put('g', 7);converter.put('h', 8);
    int temp = converter.get(getpos_x());
    if((getpos_y() == y)&&(x != temp)||(temp==x)&& y!= getpos_y()){
      System.out.println("a valid move");
      return true;
    }
    else{
      System.out.println("an invalid move");
    return false;
   }
 }// end of method
}//end of class
