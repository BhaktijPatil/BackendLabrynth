package riddlr.bckndlbrynth.common;

import riddlr.bckndlbrynth.model.Riddle;

public class RiddleController {
    protected Riddle getRiddle(int riddleId) {
        Riddle riddle = new Riddle(riddleId);
        return riddle;
    }
}
