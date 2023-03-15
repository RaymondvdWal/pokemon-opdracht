package Assets.src;

import java.util.Scanner;

public class Trainer {

    String trainerName;

    public Trainer(String trainerName) {
        this.trainerName = trainerName;
    }
    Scanner scanner = new Scanner(System.in);
    String announcement(){
        System.out.println("Hello trainer, what is your name?");
        trainerName = scanner.nextLine();
        return trainerName;
    }
}
