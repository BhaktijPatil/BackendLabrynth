package riddlr.bckndlbrynth.controllers;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import riddlr.bckndlbrynth.model.Riddle;
import riddlr.bckndlbrynth.repository.RiddleRepository;

@Hidden
@RestController
@RequestMapping("/Admin")
public class RiddleAdminController {

    @Autowired
    private RiddleRepository riddleRepository;

    @PostMapping(path = "/createRiddle")
    public @ResponseBody
    HttpStatus createRiddle(@RequestParam int riddleId, @RequestParam String riddleKey, @RequestParam String riddleAnswer, @RequestParam String riddleText) {
        Riddle newRiddle = new Riddle(riddleId, riddleKey, riddleAnswer, riddleText);
        riddleRepository.save(newRiddle);
        return HttpStatus.CREATED;
    }
}
