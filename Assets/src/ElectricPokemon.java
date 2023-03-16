package Assets.src;

public class ElectricPokemon extends Pokemon{

    private String paralyze;
    private boolean statics;

    public ElectricPokemon(String name, int level, int baseAttack, int baseDefence, int baseHp, String type, String paralyze, boolean statics, String trainerName) {
        super(name, level, baseAttack, baseDefence, baseHp, type, trainerName);
        this.paralyze = paralyze;
        this.statics = statics;
    }


    @Override
   public void thisPokemon() {
        System.out.println(announcement()+ " sends out " + getName() + " on level " + getLevel()+" "+
                getName()+ " is a merciless "+getType()+ " pokemon");
    }

    public void cantMove(){
        System.out.println(getName()+ " shocks the foe and makes it unable to move due to "+ getParalyze());
    }

    public void continuesAttack(){
        int continuesDamage = getBaseAttack()*2;
        System.out.println(getName()+ " is static and does continue "+continuesDamage+ " damage to his foe. ");
    }

    public String getParalyze() {
        return paralyze;
    }

    public void setParalyze(String paralyze) {
        this.paralyze = paralyze;
    }

    public boolean isStatics() {
        return statics;
    }

    public void setStatics(boolean statics) {
        this.statics = statics;
    }
}
