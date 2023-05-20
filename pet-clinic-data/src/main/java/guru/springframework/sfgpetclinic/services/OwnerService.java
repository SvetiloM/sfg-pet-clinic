package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    public Vet findByLastName(String lastName);
}
