package controller;

import view.DiceGUI;
import model.Dice;

public class DiceController {
    private DiceGUI gui;
    private Dice dice = new Dice(6);

    public DiceController(DiceGUI gui) {
        this.gui = gui;
    }

    public void cast() {
        int sides = gui.getSides();
        dice.setSides(sides);
        int result = dice.cast();
        gui.setResult(result);
    }

    public static void main(String[] args) {
        DiceGUI.launch(DiceGUI.class);
    }
}
