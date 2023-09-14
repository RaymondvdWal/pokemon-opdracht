package Assets.src;

public class PsychicPokemon extends Pokemon{

    private String confusing;
    private boolean psychicTerrain;

    public PsychicPokemon(String name, int level, int baseAttack, int baseDefence, int baseHp, String type, String confusing, boolean psychicTerrain, String trainerName) {
        super(name, level, baseAttack, baseDefence, baseHp, type, trainerName);
        this.confusing = confusing;
        this.psychicTerrain = psychicTerrain;
    }


    @Override
   public void thisPokemon() {
        System.out.println(announcement()+ " sends out " + getName() + " on level " + getLevel()+" "+
                getName()+ " is a really tough "+getType()+ " pokemon");
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

    public void dreamEater(){
        System.out.println(getName()+" puts the foe to sleep and restores his health to "+ hpPokemon());
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
