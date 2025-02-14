package zoo.domains;

import zoo.params.AnimalParams;
import lombok.ToString;

@ToString(callSuper = true)
public class Tiger extends Predator {
    public Tiger(AnimalParams params) {
        super(params);
    }
}