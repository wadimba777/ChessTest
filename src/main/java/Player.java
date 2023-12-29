public class Player {

    public String name;
    private String email;
    private boolean white;
    private int rank;
    private int age;



    public Player(String name, String email, boolean white, int rank, int age){
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("The name should not be empty");
        } else {
            this.name = name;
        }
        if (email == null || email.isEmpty() || email.isBlank()) {
            throw new IllegalArgumentException("Email cant be empty");
        }
        if (!email.contains("@") || !(email.contains(".com") || email.contains(".ru"))) {
            throw new IllegalArgumentException("Email should contains '@' and '.'");
        } else {
            this.email = email;
        }
        this.white = white;
        if (rank < 100 || rank > 3000){
            throw new IllegalArgumentException("The rank should be in range of 100 and 3000!!!");
        } else {
            this.rank = rank;
        }
        if (age < 0 || age > 130){
            throw new IllegalArgumentException("The player's age cant be negative");
        } else {
            this.age = age;
        }

    }

    public void setWhite(boolean white) {
        this.white = white;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public boolean isWhite() {
        return white;
    }
    public int getRank() {
        return rank;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) { this.age = age; }
    public void setRank(int rank) {
        this.rank = rank;
        System.out.println("The rank of " + name + " is " + rank);
    }

    public void movePiece(Piece piece, Spot spot){
        if (isWhite() != piece.isWhite()){
            throw new IllegalArgumentException("Incorrect piece color. Try Again");
        }
        piece.setSpot(spot);
        System.out.println("Piece " + piece.getName() + " is moved to: " + spot);
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", white=" + white +
                ", rank=" + rank +
                ", age=" + age +
                '}';
    }
}
