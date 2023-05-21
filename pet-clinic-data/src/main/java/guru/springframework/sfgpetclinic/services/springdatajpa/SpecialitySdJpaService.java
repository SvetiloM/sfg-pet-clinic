package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialityRepository;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySdJpaService implements SpecialtyService {

    private final SpecialityRepository specialityRepository;

    public SpecialitySdJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }


    @Override
    public Speciality findById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> owners = new HashSet<>();
        specialityRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);
    }
}
