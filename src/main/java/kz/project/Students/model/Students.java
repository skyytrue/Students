package kz.project.Students.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Students {

    private long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;
    private String group;
}
