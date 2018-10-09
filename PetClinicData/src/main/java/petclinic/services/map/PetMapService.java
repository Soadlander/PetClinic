package petclinic.services.map;

import petclinic.model.Owner;
import petclinic.model.Pet;
import petclinic.services.CrudService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deletaById(id);

    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
