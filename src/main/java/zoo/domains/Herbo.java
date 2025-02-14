package zoo.domains;

import zoo.params.AnimalParams;
import zoo.params.HerboParams;
import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
public abstract class Herbo extends Animal {
    protected int kindness;

    public Herbo(HerboParams params) {
        super(new AnimalParams(params.food()));
        this.kindness = params.kindness();
    }
}