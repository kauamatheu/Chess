package pieces;

public abstract class Piece {
    private int[] position; 
    private String color;

    public Piece(int [] position, String color){
        this.position = position;
        this.color = color;
    }

    // Getters
    public int[] getPosition(){
        return position;
    }

    public String getColor(){
        return color;
    }

    // Setters
    public void setPosition(int[] position){
        this.position = position;
    }

    public void set_color(String color){
        this.color = color;
    }


    public abstract int[][] valid_position(int [] position);
}
