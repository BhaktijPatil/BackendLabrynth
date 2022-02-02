package riddlr.bckndlbrynth.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import riddlr.bckndlbrynth.common.RiddleController;
import riddlr.bckndlbrynth.constants.RiddleIds;
import riddlr.bckndlbrynth.parser.RiddleParser;

@RestController
@RequestMapping("/RiddleOne")
public class RiddleOneController extends RiddleController {
    @RequestMapping(method = RequestMethod.GET, value = "/getRiddle")
    public String getRiddleOne() {
        return RiddleParser.parseDirect(getRiddle(RiddleIds.PEHLI_PAHELI));
    }
}
