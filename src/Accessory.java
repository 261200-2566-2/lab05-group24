public interface Accessory {
      String getName() ;
      String getEffectType();
      double getEffectvalue();
      default void showStats(){
            System.out.println("Name : " + getName());
            System.out.println("Effect : " + getEffectType() + " " + getEffectvalue()*100 + "%");
      }
}
abstract class BaseAccessory implements Accessory{
      String name;
      String effectType;
      double effactValue;
      BaseAccessory(String name , String EffectType , double effactValue){
            this.name = name ;
            this.effectType = EffectType;
            this.effactValue = effactValue;
      }
      public String getName() {
            return name;
      }

      public String getEffectType() {
            return effectType;
      }

      public double getEffectvalue() {
            return effactValue;
      }
}
class Amulet extends BaseAccessory{
      Amulet(String name, String EffectType, double effactValue) {
            super(name, EffectType, effactValue);
      }

}
class Ring extends BaseAccessory{
      Ring(String name, String EffectType, double effactValue) {
            super(name, EffectType, effactValue);
      }
}
class Earring extends BaseAccessory{
      Earring(String name, String EffectType, double effactValue) {
            super(name, EffectType, effactValue);
      }
}