public class Player {
    public String name;
    public Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

}
