package zoo.services;

import zoo.domains.Animal;
import org.springframework.stereotype.Component;

@Component
class VetClinic {
    public boolean checkHealth(Animal animal) {
        return true;
    }
}