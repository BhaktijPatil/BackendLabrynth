package riddlr.bckndlbrynth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "riddle_details", schema = "riddlr_db")
public class Riddle {
    @Id
    @Column(nullable = false, unique = true)
    @NotNull
    private int riddleId;
    @Column(unique = true, length = 63)
    private String riddleKey;
    @Column(unique = true, length = 63)
    @NotNull
    private String riddleAnswer;
    @Column(length = 1023)
    private String riddleText;
}
