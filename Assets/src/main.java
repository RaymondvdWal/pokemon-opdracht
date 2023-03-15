package Assets.src;

public class main {

    public static void main(String[] args) {

        FirePokemon ninetails = new FirePokemon("Ninetails",69,15,8,27,
                "Fire",23,16, "input");


        ninetails.thisPokemon();
        ninetails.armor();
        ninetails.inferno();

        WaterPokemon blastoise = new WaterPokemon("Blastoise", 89,16,35,28,"water",
                6,10,"input");

        blastoise.thisPokemon();
        blastoise.raiseAttack();
        blastoise.raiseArmor();

        ElectricPokemon elektrabuzz = new ElectricPokemon("Elektrabuzz", 76, 26,8,3,
                "Electric","paralyze", true,"input");

        elektrabuzz.thisPokemon();
        elektrabuzz.cantMove();
        elektrabuzz.continuesAttack();

        PsychicPokemon mewtwo = new PsychicPokemon("Mewtwo",100,35,25,30,"Psychic",
                "confused",true,"input");

        mewtwo.thisPokemon();
        mewtwo.shadowPunch();
        mewtwo.terrain();




    }
}
