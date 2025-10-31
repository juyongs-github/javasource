package student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// DTO (Data Transfer Object)

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProfessorDTO {
    private String profId;
    private String profName;
    private String deptId;
}