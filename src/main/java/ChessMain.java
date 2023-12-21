public class ChessMain {
    public static void main(String[] args) {
        Player whitePlayer = new Player("Beth Harmon", "beth.harmon@gmail.com",
                                        true, 2000, 20);
        Player blackPlayer = new Player("Vasiliy Borgov", "vasiliy.borgov@yandex.ru",
                                        false, 2500, 45);

//        System.out.println("player 1 name is: " + whitePlayer.getName());
//        System.out.println("player 2 name is: " + blackPlayer.getName());

        System.out.println(whitePlayer);
        System.out.println(blackPlayer);

    }
}
