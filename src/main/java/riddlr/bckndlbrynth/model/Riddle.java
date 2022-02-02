package riddlr.bckndlbrynth.model;

import lombok.Getter;

@Getter
public class Riddle {
    private String riddleText;

    public Riddle(int riddleId) {
        switch (riddleId) {
            case 1:
                riddleText = "Three eyes have I, all in a row; when the red one opens, all freeze like the snow.";
                break;
            default:
                riddleText = "Riddle Not Found";
                break;
        }
    }
}
