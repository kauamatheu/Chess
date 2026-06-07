package pieces;

public class Knight extends Piece {
    private int [][] position_rule = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};

    public Knight(int [] position, String color){
        super(position, color);
    }

    @Override
    public int[][] valid_position(int [] position){
        int [][] valid_position = new int[2];

        for (int [] num : position_rule) {
            int x_position = position[0] + num[0];
            int y_position = position[1] + num[1];
        }
        

        return [0,0];

    }


    
}
