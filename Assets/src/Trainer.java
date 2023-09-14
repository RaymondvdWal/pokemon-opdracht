package Assets.src;

import java.util.Scanner;

public class Trainer {

    private String trainerName;

    public Trainer(String trainerName) {
        this.trainerName = trainerName;
    }
    Scanner scanner = new Scanner(System.in);
    String announcement(){
        System.out.println("Hello trainer, what is your name?");
        trainerName = scanner.nextLine();
        return trainerName;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
