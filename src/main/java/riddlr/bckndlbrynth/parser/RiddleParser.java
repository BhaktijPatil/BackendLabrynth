package riddlr.bckndlbrynth.parser;

import riddlr.bckndlbrynth.model.Riddle;

public class RiddleParser {
    private RiddleParser() {
    }

    public static String parseDirect(Riddle riddle) {
        return riddle.getRiddleText();
    }
}
