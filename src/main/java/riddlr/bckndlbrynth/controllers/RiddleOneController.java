package riddlr.bckndlbrynth.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import riddlr.bckndlbrynth.common.RiddleController;
import riddlr.bckndlbrynth.model.Riddle;

@RestController
@RequestMapping("/RiddleOne")
public class RiddleOneController extends RiddleController {
    @RequestMapping(method = RequestMethod.GET, value = "/getRiddle/{riddleId}")
    public Riddle getRiddleOne(@PathVariable("riddleId") int riddleId) {
        return getRiddle(riddleId);
    }
}
