
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IFootballPlayer striker = FootballPlayerFactory.createPlayer("Striker");
        striker.play();

        IFootballPlayer midfielder = FootballPlayerFactory.createPlayer("Midfielder");
        midfielder.play();

        IFootballPlayer defender = FootballPlayerFactory.createPlayer("Defender");
        defender.play();
    }
}