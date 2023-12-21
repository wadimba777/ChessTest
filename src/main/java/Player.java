public class Player {

    public String name;
    private String email;
    private boolean white;
    private int rank;
    private int age;

    public Player(String name, String email, boolean white, int rank, int age){
        this.name = name;
        this.email = email;
        this.white = white;
        this.rank = rank;
        this.age = age;
    }
    public String getName(){return name;}
    public String getEmail() {return email;}
    public boolean getWhite() {return white;}
    public int getAge() {return age;}
    public int getRank() {return rank;}

    @Override
    public String toString() {
        return "Player {" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", white=" + white +
                ", rank=" + rank +
                ", age=" + age +
                '}';
    }
}
