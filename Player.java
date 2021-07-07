public class Player {
    String name;
    int age;
    String type; // spin, seam, batsman, keeper
    int stats; //total number of runs or wickets in the last 15 matches

    public Player(String name, int age, String type, int stats) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.stats = stats;
    }

    public void getAverage(){
        System.out.println("Player Average = " + stats/15);
    }

    public void getDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
        System.out.println("Stats (Last 15 matches): " + stats);
    }

    public void getType(){
        System.out.println("Player Type: " + type);
    }
}
