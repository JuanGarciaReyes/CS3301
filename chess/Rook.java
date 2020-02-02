public class Rook {
  boolean color;
  char x_move;
  int y_move;

  public void set_color(boolean color){
    this.color = color;
  }
  public void setpos_x(char x_move) {
    this.x_move = x_move;
  }
  public void setpos_y(int y_move) {
    this.y_move = y_move;
  }
  public char getpos_x() {
    return this.x_move;
  }
  public int getpos_y() {
    return this.y_move;
  }
  public boolean get_color(){
    return this.color;
  }
  public static boolean check_movement(int x, int y, int pos_x, int pos_y){
    if((pos_y == y)&&(x != pos_x)||(pos_x==x)&& y!= pos_y){
      System.out.println("a valid move");
      return true;
    }
    else{
      System.out.println("an invalid move");
    return false;
   }
 }// end of method
}//end of class
