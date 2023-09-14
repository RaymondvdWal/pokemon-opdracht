package Assets.src;

public class WaterPokemon extends Pokemon{

    private int rain;
    private int bubbleShield;

    public WaterPokemon(String name, int level, int baseAttack, int baseDefence, int baseHp, String type, int rain, int bubbleShield, String trainerName) {
        super(name, level, baseAttack, baseDefence, baseHp, type, trainerName);
        this.rain = rain;
        this.bubbleShield = bubbleShield;
    }


    @Override
   public void thisPokemon() {
        System.out.println(announcement()+ " sends out " + getName() + " on level " + getLevel()+" "+
                getName()+ " is a awesome "+getType()+ " pokemon");
    }

    public void raiseAttack(){
        System.out.println(getName()+ " does a rain-dance so it started raining, "+ getName()+
                " attack is now increased to "+ (getRain()+attackPokemon()));
    }

    public void raiseArmor(){
        System.out.println(getName()+ " putting up a bubble-shield, "+ getName() + " defense" +
                " is now raised to "+ (defencePokemon()+getBubbleShield()));
    }

    public int getRain() {
        return rain;
    }

    public void setRain(int rain) {
        this.rain = rain;
    }

    public int getBubbleShield() {
        return bubbleShield;
    }

    public void setBubbleShield(int bubbleShield) {
        this.bubbleShield = bubbleShield;
    }
}
