package Assets.src;

public class PsychicPokemon extends Pokemon{

    private String confusing;
    private boolean psychicTerrain;

    public PsychicPokemon(String name, int level, int baseAttack, int baseDefence, int baseHp, String type, String confusing, boolean psychicTerrain, String trainerName) {
        super(name, level, baseAttack, baseDefence, baseHp, type, trainerName);
        this.confusing = confusing;
        this.psychicTerrain = psychicTerrain;
    }

    Pokemon psychic = new Pokemon("Mewtwo", 100, 25, 21, 35, "Psychic",
            "input") {
    };

    @Override
    void thisPokemon() {
        super.thisPokemon();
    }

    public void shadowPunch(){
        System.out.println(getName()+ " punches the enemy whit a shadow-punch, the foe doesn't know anymore how to fight,"+
                " status is "+getConfusing());
    }

    public void terrain(){
        int raisedAttack = getBaseAttack()*5;
        psychicTerrain = attackPokemon() <= attackPokemon();
        System.out.println(getName()+ " uses his psychic terrain to raises his attack to "+ (attackPokemon()+raisedAttack));
    }

    public String getConfusing() {
        return confusing;
    }

    public void setConfusing(String confusing) {
        this.confusing = confusing;
    }

    public boolean isPsychicTerrain() {
        return psychicTerrain;
    }

    public void setPsychicTerrain(boolean psychicTerrain) {
        this.psychicTerrain = psychicTerrain;
    }
}
