package pieces;
public class Pawn{
    private int x_coordinate; 
    private int y_coordinate;
    private String color;

    public Pawn(){

    }

    // Getters
    public int get_xcoor(){
        return this.x_coordinate;
    }

    public int get_ycoor(){
        return this.y_coordinate;
    }

    public String get_color(){
        return this.color;
    }

    // Setters
    public void  set_xcoor(int x_coordinate){
        this.x_coordinate = x_coordinate;
    }

    public void set_ycoor(int y_coordinate){
        this.y_coordinate = y_coordinate;
    }

    public void set_color(String color){
        this.color = color;
    }

    

}
