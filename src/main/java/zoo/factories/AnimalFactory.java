package zoo.factories;

import zoo.domains.*;
import zoo.params.AnimalParams;
import zoo.params.HerboParams;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AnimalFactory {
    private final Map<String, Class<? extends Animal>> animalTypes = Map.of("monkey", Monkey.class, "rabbit", Rabbit.class, "tiger", Tiger.class, "wolf", Wolf.class);

    public Animal createAnimal(String type, int food, Integer kindness) {
        Class<? extends Animal> animalClass = animalTypes.get(type.toLowerCase());
        if (animalClass == null) {
            throw new IllegalArgumentException("Invalid animal type.");
        }

        try {
            if (isHerbo(type)) {
                if (kindness == null || kindness < 0 || kindness > 10) {
                    throw new IllegalArgumentException("Invalid kindness level.");
                }
                return animalClass.getConstructor(HerboParams.class).newInstance(new HerboParams(food, kindness));
            } else {
                return animalClass.getConstructor(AnimalParams.class).newInstance(new AnimalParams(food));
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to create animal instance", e);
        }
    }

    public boolean isHerbo(String type) {
        Class<? extends Animal> animalClass = animalTypes.get(type.toLowerCase());
        if (animalClass == null) {
            throw new IllegalArgumentException("Invalid animal type.");
        }

        return Herbo.class.isAssignableFrom(animalClass);
    }
}