public class FootballPlayerFactory {
    public static IFootballPlayer createPlayer(String playerType) {
        switch (playerType.toLowerCase()) {
            case "striker":
                return new Striker();
            case "midfielder":
                return new Midfielder();
            case "defender":
                return new Defender();
            default:
                throw new IllegalArgumentException("Invalid player type: " + playerType);
        }
    }
}
