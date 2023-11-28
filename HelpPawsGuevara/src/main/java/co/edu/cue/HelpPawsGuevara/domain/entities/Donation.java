package co.edu.cue.HelpPawsGuevara.domain.entities;

import co.edu.cue.HelpPawsGuevara.domain.enums.PayMethod;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "donations")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double amount;
    @Enumerated(EnumType.STRING)
    private PayMethod payMethod;
    private LocalDate date;
    @ManyToOne
    private Foundation foundation;
}
