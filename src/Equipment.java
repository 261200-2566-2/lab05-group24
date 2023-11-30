public interface Equipment {
    String getName();
    double getMainStat();
    int getLevel();
    void upgrade();

}
abstract class MainWeapon implements Equipment{
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

abstract class SubWeapon implements Equipment{
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


class Sword extends MainWeapon{
    public Sword(String name, int level, double baseStat) {
        super(name, level, baseStat);
    }
}

class  Shield extends SubWeapon{

    public Shield(String name, int level, double baseStat) {
        super(name, level, baseStat);
    }
}

class Staff extends MainWeapon{

    public Staff(String name, int level, double baseStat) {
        super(name, level, baseStat);
    }
}

class Charm extends SubWeapon{

    public Charm(String name, int level, double baseStat) {
        super(name, level, baseStat);
    }
}

class Bow extends MainWeapon{

    public Bow(String name, int level, double baseStat) {
        super(name, level, baseStat);
    }
}

class Dagger extends SubWeapon{

    public Dagger(String name, int level, double baseStat) {
        super(name, level, baseStat);
    }
}