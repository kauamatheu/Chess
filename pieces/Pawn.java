package pieces;

import javax.swing.text.Position;

public class Pawn extends Piece{
    private boolean initialposition = true;

    public Pawn(int [] position, String color){
        super(position, color);
    }

    public void move(int x_coordinate, int y_coordinate){        

         if (initialposition == true){
            initialposition = false;
        }
    } 
       
}
