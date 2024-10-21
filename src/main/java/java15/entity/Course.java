package java15.entity;

import jakarta.persistence.*;
import java15.enums.StudyFormat;
import lombok.*;

import java.math.BigDecimal;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(name = "courses")

public class Course {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_id_gen"
    )
    @SequenceGenerator(
            name = "course_id_gen",
            sequenceName = "course_seq_name",
            allocationSize = 1
    )
    private Long id;
    @Column(name = "course_name")
    private String courseName;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private StudyFormat studyFormat;
}
