package riddlr.bckndlbrynth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import riddlr.bckndlbrynth.common.RiddleCoreController;
import riddlr.bckndlbrynth.model.RiddleResponse;
import riddlr.bckndlbrynth.parser.RiddleParser;
import riddlr.bckndlbrynth.repository.RiddleRepository;


@RestController
@RequestMapping("/RiddleOne")
public class RiddleOneController extends RiddleCoreController {

    @Autowired
    private RiddleRepository riddleRepository;
    private static final int PEHLI_PAHELI = 1;

    @GetMapping(value = "/getRiddle")
    public String getRiddleOne() {
        return RiddleParser.parseDirect(getRiddleById(PEHLI_PAHELI));
    }

    @GetMapping(value = "/getNextRiddleKey/{answer}")
    public RiddleResponse getNextRiddleKey(@PathVariable("answer") String answer) {
        return getRiddleResponse(PEHLI_PAHELI, answer);
    }
}
