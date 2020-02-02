public class Pawn {
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
  public static boolean check_movement( boolean color, int x, int y, int pos_x, int pos_y){
    if(color == true){
      if((x == pos_x)&&((y-pos_y)== 1)||(pos_y==2)&&(y-pos_y==2)){
        System.out.println("a valid move");
        return true;
      }
    }else if (color != true) {
      if((x == pos_x)&&((pos_y - y)== 1)||(pos_y==7)&&(pos_y - y ==2)&&(x == pos_x)){
        System.out.println("a valid move");
        return true;
      }
    }
    System.out.println("an invalid move");
    return false;
  }//end of method
}//end of class
