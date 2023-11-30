public interface Equipment {
    String getName();
    double getMainStat();
    int getLevel();
    void upgrade();
}
class MainWeapon implements Equipment{
    private final String name;
    private int level;
    private final double baseStat;
    private double statValue;

    public MainWeapon(String name, int level, double baseStat){
        this.name = name;
        this.level = level;
        this.baseStat = baseStat;
        this.statValue = baseStat + (2.5 * level);
    }
    public String getName(){
        return name;
    }
    public double getMainStat() {
        return statValue;
    }
    public int getLevel(){
        return level;
    }
    public void upgrade(){
        level++;
        statValue += 2.5;
    }
}

class SubWeapon implements Equipment{
    private final String name;
    private int level;
    private final double baseStat;
    private double statValue;

    public SubWeapon(String name, int level, double baseStat){
        this.name = name;
        this.level = level;
        this.baseStat = baseStat;
        statValue = baseStat + (2.5 * level);
    }
    public String getName(){
        return name;
    }
    public double getMainStat() {
        return statValue;
    }
    public int getLevel(){
        return level;
    }
    public void upgrade(){
        level++;
        statValue += 2.5;
    }
}