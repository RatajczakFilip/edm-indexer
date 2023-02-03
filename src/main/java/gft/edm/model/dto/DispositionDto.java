package gft.edm.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DispositionDto {

    private UUID id;
    private LocalDate day;
    private String start;
    private String stop;
    private String employeeCode;

}
