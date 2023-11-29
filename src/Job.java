public interface Job extends RPGCharacter{
    String getJobName();
    String[] getAllAbility();
    default void showAllAbilities() {
        System.out.println("Job : " + getJobName());
        System.out.println("Abilities : ");
        for (String ability : getAllAbility()) {
            System.out.print(getJobName() + " ");
        }
    }
}
interface Warrior extends Job{
    void slash();
    void block();
    default String getJobName() {
        return "Warrior";
    }
    default String[] getAllAbility(){
        return new String[]{"Slash", "Black"};
    }

}
interface Mage extends  Job{
    void castSpell();
    void teleport();

    default String getJobName() {
        return "Mage";
    }
    default String[] getAllAbility(){
        return new String[]{"Cast Spell", "Teleport"};
    }
}
interface Archer extends  Job{
    void shot();
    void dodge();

    default String getJobName() {
        return "Archer";
    }
    default String[] getAllAbility(){
        return new String[]{"Shot", "Dodge"};
    }
}