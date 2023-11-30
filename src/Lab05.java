public class Lab05 {
    public static void main(String[] args) {
        // For testing
        RPGCharacter james = new WarriorCharacter("James");
        james.showCharacterInfo();

        System.out.println("======================================");
        Accessory blood = new Ring("Vampire's Ring", "Life steal", 0.155);
        Equipment sword = new Sword("James's Legacy", 30, 10);

        james.equipAccessory(blood);
        james.equipEquipment(sword);
        System.out.println("======================================");
        james.levelUp();
        System.out.println("======================================");
        james.showCharacterInfo();
        System.out.println("======================================");

        System.out.println("Sword Damage : " + sword.getMainStat());
        sword.upgrade();
        System.out.println("Sword Damage : " + sword.getMainStat());
        System.out.println("======================================");

        blood.showStats();
        System.out.println("======================================");
        RPGCharacter tent = new MageCharacter("tent");
        tent.showCharacterInfo();
        System.out.println("======================================");
        Accessory AmuletThai = new Amulet("pramaharsompong", "+Kongklang" , 1);
        Accessory RingThai = new Ring("pramaharsompong Ring", "++Kongklang mak mak" ,0.05 );
        Accessory EarringThai = new Earring("pramaharsompong tumhu", "Slowdown yourself" , 0.001)   ;
        tent.equipAccessory(AmuletThai);
        tent.equipAccessory(RingThai);
        tent.equipAccessory(EarringThai);
        System.out.println("======================================");
        Equipment lugpharkum = new Charm("lugpharkum",1000,3000);
        Equipment karta = new Staff("karta", 100, 200);
        tent.equipEquipment(lugpharkum);
        tent.equipEquipment(karta);
        System.out.println("======================================");
        tent.showCharacterInfo();
        System.out.println("======================================");

    }
}