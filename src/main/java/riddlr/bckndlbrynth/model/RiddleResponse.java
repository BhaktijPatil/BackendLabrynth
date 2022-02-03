package riddlr.bckndlbrynth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RiddleResponse {
    private boolean isRiddleSolved;
    private String nextRiddleKey;

    public RiddleResponse(boolean isRiddleSolved) {
        this.isRiddleSolved = isRiddleSolved;
    }
}
