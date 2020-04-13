package org.palfoldesi.behavioural.command;

public class LubeCommand implements Command {
    private Bike bike;

    public LubeCommand(Bike bike) {
        this.bike = bike;
    }

    @Override
    public void execute() {
        if (!bike.getOiledness().equals(Oiledness.VERY_WELL_OILED)) {
            bike.setOiledness(bike.getOiledness().increase());
        }
    }
}
