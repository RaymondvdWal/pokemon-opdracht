package Assets.src;

public class FirePokemon extends Pokemon{
    private int burn;
    private int magmaArmor;

    public FirePokemon(String name, int level, int baseAttack, int baseDefence, int baseHp, String type, int burn, int magmaArmor, String trainerName) {
        super(name, level, baseAttack, baseDefence, baseHp, type, trainerName);
        this.burn = burn;
        this.magmaArmor = magmaArmor;
    }


    @Override
    public void thisPokemon() {
        System.out.println(announcement()+ " sends out " + getName() + " on level " + getLevel()+" "+
                getName()+ " is a beautiful "+getType()+ " pokemon");
    }

    public void armor(){
        System.out.println( getName()+ " is raising his armor with " + getMagmaArmor() +", "+ getName()
        + " armor is now raised to "+ (defencePokemon()+getMagmaArmor()));
    }

    public void inferno(){
        System.out.println( getName()+ " unleashes a inferno and deals " + attackPokemon() + " damage to the foe "
                + " and " + getBurn() + " burning damage.");
    }


    public int getBurn() {
        return burn;
    }

    public void setBurn(int burn) {
        this.burn = burn;
    }

    public int getMagmaArmor() {
        return magmaArmor;
    }

    public void setMagmaArmor(int magmaArmor) {
        this.magmaArmor = magmaArmor;
    }
}
