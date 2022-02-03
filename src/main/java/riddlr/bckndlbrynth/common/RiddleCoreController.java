package riddlr.bckndlbrynth.common;

import org.springframework.beans.factory.annotation.Autowired;
import riddlr.bckndlbrynth.model.Riddle;
import riddlr.bckndlbrynth.model.RiddleResponse;
import riddlr.bckndlbrynth.repository.RiddleRepository;

public class RiddleCoreController {

    @Autowired
    private RiddleRepository riddleRepository;

    protected Riddle getRiddleById(int riddleId) {
        return riddleRepository.findById(riddleId).orElseThrow();
    }

    protected Riddle getRiddleByKey(String riddleKey) {
        return riddleRepository.findRiddleByKey(riddleKey);
    }

    protected RiddleResponse getRiddleResponse(int riddleId, String answer) {
        if (riddleRepository.existsById(riddleId) && riddleRepository.findById(riddleId).orElseThrow().getRiddleAnswer().equals(answer)) {
            if (riddleRepository.existsById(riddleId + 1))
                return new RiddleResponse(true, riddleRepository.findById(riddleId + 1).orElseThrow().getRiddleKey());
            else
                return new RiddleResponse(true);
        }
        return new RiddleResponse(false);
    }
}
