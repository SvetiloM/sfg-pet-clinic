package guru.springframework.sfgpetclinic.model;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

@Data
@MappedSuperclass
public class Person extends BaseEntity {
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

}
