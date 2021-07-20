public class Player {

    private String playerName;
    private int playerAge;
    private String playerType; 		// spin, seam, batsman, keeper
    private int playerStatistic; 	//total number of runs or wickets in the last 15 matches

    public Player(){}																			//this is the Default constructor

    public Player(String playerName, int playerAge, String playerType, int playerStatistic) {	//this is a Overloaded constructor
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerType = playerType;
        this.playerStatistic = playerStatistic;
    }

    public void getAverage(){
        System.out.println("Player Average = " + playerStatistic/15);
    }

    public void getDetails(){
        System.out.println("Name: " + playerName);
        System.out.println("Age: " + playerAge);
        System.out.println("Type: " + playerType);
        System.out.println("Stats (Last 15 matches): " + playerStatistic);
        System.out.println("");
    }

}

