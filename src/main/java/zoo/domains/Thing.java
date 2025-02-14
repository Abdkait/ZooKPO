package zoo.domains;

import zoo.interfaces.InventoryInterface;
import zoo.params.ThingParams;
import lombok.ToString;

@ToString
public abstract class Thing implements InventoryInterface {
    protected int number;

    public Thing(ThingParams params) {
        this.number = params.number();
    }

    @Override
    public int getNumber() {
        return number;
    }
}