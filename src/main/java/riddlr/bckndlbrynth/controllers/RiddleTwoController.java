package riddlr.bckndlbrynth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import riddlr.bckndlbrynth.common.RiddleCoreController;
import riddlr.bckndlbrynth.model.RiddleResponse;
import riddlr.bckndlbrynth.parser.RiddleParser;
import riddlr.bckndlbrynth.repository.RiddleRepository;


@RestController
@RequestMapping("/RiddleTwo")
public class RiddleTwoController extends RiddleCoreController {

    @Autowired
    private RiddleRepository riddleRepository;
    private static final int SEGUNDO_ROMPECABEZAS = 2;

    @GetMapping(value = "/getRiddle/{riddleKey}")
    public String getRiddleTwo(@PathVariable("riddleKey") String riddleKey) {
        return RiddleParser.parseDirect(getRiddleByKey(riddleKey));
    }

    @GetMapping(value = "/getNextRiddleKey/{answer}")
    public RiddleResponse getNextRiddleKey(@PathVariable("answer") String answer) {
        return getRiddleResponse(SEGUNDO_ROMPECABEZAS, answer);
    }
}
