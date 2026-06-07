public class Main {
    public static void main(String[] args) {
        PrintaTabuleiro();


    }

    public static void PrintaTabuleiro() {
        String [][] tabuleiro ={
            {"T", "C", "B", "K", "R", "B", "C", "T"},
            {"P", "P", "P", "P", "P", "P", "P", "P"},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {"p", "p", "p", "p", "p", "p", "p", "p"},
            {"t", "c", "b", "k", "r", "b", "c", "t"}
        };
        
        System.out.println("  A B C D E F G H");
        for (int line = 0; line < 8; line++) {
            System.out.print((line+1) + " ");
            for (int col = 0; col < 8; col++) {
                System.out.print(tabuleiro[line][col] + " ");
            }
            System.out.println("");
        }
    }
        
}