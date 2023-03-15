package Assets.src;

public class FirePokemon extends Pokemon{
    private int burn;
    private int magmaArmor;

    public FirePokemon(String name, int level, int baseAttack, int baseDefence, int baseHp, String type, int burn, int magmaArmor, String trainerName) {
        super(name, level, baseAttack, baseDefence, baseHp, type, trainerName);
        this.burn = burn;
        this.magmaArmor = magmaArmor;
    }

    Pokemon fire = new Pokemon("Ninetails",67,15,9,27,"Fire","input") {
    };

    @Override
    void thisPokemon() {
        super.thisPokemon();
    }

    public void armor(){
        System.out.println( fire.getName()+ " is raising his armor with " + getMagmaArmor() +", "+ fire.getName()
        + " armor is now raised to "+ (defencePokemon()+getMagmaArmor()));
    }

    public void inferno(){
        System.out.println( fire.getName()+ " unleashes a inferno and deals " + attackPokemon() + " damage to the foe "
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
