package duke;

import duke.delay.Delay_ms;
import duke.printTextFile.PrintTextFile;

public class Ui {
    public static PrintTextFile printHelloText = new PrintTextFile("text-art/HelloText.txt");
    public static PrintTextFile printParrotText = new PrintTextFile("text-art/ParrotText.txt");
    public static PrintTextFile printDukeyText = new PrintTextFile("text-art/DukeyText.txt");
    public static PrintTextFile printByeText = new PrintTextFile("text-art/ByeText.txt");

    public void showWelcome() {
        Delay_ms delay = new Delay_ms();
        printDukeyText.printText();
        delay.wait(500);
        printParrotText.printText();
        delay.wait(500);
        printHelloText.printText();
    }

    public static void showGoodBye() {
        printByeText.printText();
    }
}