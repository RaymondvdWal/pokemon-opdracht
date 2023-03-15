package Assets.src;

public abstract class Pokemon extends Trainer{

   private String name;
   private int level;
   private int baseAttack;
   private int baseDefence;
   private int baseHp;
   private String type;


    public Pokemon(String name, int level, int baseAttack, int baseDefence, int baseHp,String type, String trainerName) {
        super(trainerName);
        this.name = name;
        this.level = level;
        this.baseAttack = baseAttack;
        this.baseDefence = baseDefence;
        this.baseHp = baseHp;
        this.type= type;
    }

    void thisPokemon(){
        System.out.println(announcement()+ " sends out " + getName() + " on level " + getLevel());
    }

    int attackPokemon(){
        return getBaseAttack()*getLevel();
    }


    int defencePokemon(){
        return getBaseDefence()*getLevel();
    }

    int hpPokemon(){
        return getBaseHp()*getLevel();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int attack) {
        this.baseAttack = attack;
    }

    public int getBaseDefence() {
        return baseDefence;
    }

    public void setBaseDefence(int baseDefence) {
        this.baseDefence = baseDefence;
    }


    public int getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(int hp) {
        this.baseHp = hp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
