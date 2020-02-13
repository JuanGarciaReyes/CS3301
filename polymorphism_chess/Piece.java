import java.lang.Math;
/*
Juan Angel Garcia Reyes.
80591934.
T-TH 3:00- 4:20.
Professor- Dr. Oscar Mondragon.
*/
public class Piece {
  private String color;
  private char x_move;
  private int y_move;
  private String type;

  public Piece(){
    this.type = null;

  }
  public Piece(String type,String color, char x_move, int y_move){
    this.type = type;
    this.color = color;
    this.x_move = x_move;
    this.y_move = y_move;

  }
  public void setType(String type){
    this.type = type;
  }
  public void set_color(String color){
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
  public String get_color(){
    return this.color;
  }

  public boolean checkMovement(int x, int y){
    return false;
  }
}
