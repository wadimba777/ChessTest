import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {
    public static void main(String[] args) {
        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();
        HashMap<String, Piece> pieceHashMap = main.createPieces();


        System.out.println(pieceHashMap);


        main.createPieces();

        main.play(players, pieceHashMap);
    }
    public ArrayList<Player> createPlayers(){
        Player whitePlayer = new Player("Beth Harmon", "beth.harmon@gmail.com",
                true, 2000, 20);
        Player blackPlayer = new Player("Vasiliy Borgov", "vasiliy.borgov@yandex.ru",
                false, 2500, 45);
        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;
    }

    public HashMap<String, Piece> createPieces(){
        King whiteKing = new King(new Spot("h",7), "white_king", true);
        King blackKing = new King(new Spot("d", 8), "black_king", false);
        Rook whiteRook1 = new Rook(new Spot("a", 7), "white_rook1", true);
        Rook whiteRook2 = new Rook(new Spot("g", 7), "white_rook2", true);
        Knight blackKnight1 = new Knight(new Spot("d", 6), "black_knight1", false);

        HashMap<String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(whiteRook1.getId(), whiteRook1);
        pieceHashMap.put(whiteRook2.getId(), whiteRook2);
        pieceHashMap.put(blackKnight1.getId(), blackKnight1);

        return pieceHashMap;
    }

    public void play(ArrayList<Player> players, HashMap<String, Piece> hashMap){
        //move 1
        try {
            players.get(0).movePiece(hashMap.get("white_rook1"), new Spot("a", 8));
        } catch (IllegalArgumentException e) {
            System.out.println("The move is incorrect. Please try again");
            //retry functionality
        }

    }

}
