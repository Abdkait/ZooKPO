package zoo.domains;

import zoo.params.HerboParams;
import lombok.ToString;

@ToString(callSuper = true)
public class Monkey extends Herbo {
    public Monkey(HerboParams params) {
        super(params);
    }
}