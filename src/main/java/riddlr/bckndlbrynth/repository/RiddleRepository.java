package riddlr.bckndlbrynth.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import riddlr.bckndlbrynth.model.Riddle;

public interface RiddleRepository extends CrudRepository<Riddle, Integer> {
    @Query(value = "SELECT * FROM riddle_details WHERE riddle_key =?1", nativeQuery = true)
    Riddle findRiddleByKey(String riddleKey);
}