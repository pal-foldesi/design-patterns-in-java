package org.palfoldesi.behavioural.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandPatternTest {
    @DisplayName("Test lubing")
    @Test
    public void testLubing() {
        Bike bike = new Bike(Oiledness.SLIGHTLY_WELL_OILED);
        Command command = new LubeCommand(bike);
        command.execute();
        command.execute();
        Oiledness actual = bike.getOiledness();
        Oiledness expected = Oiledness.VERY_WELL_OILED;
        assertEquals(expected, actual);
    }

    @DisplayName("Test pumping")
    @Test
    public void testPumping() {
        Bike bike = new Bike(25);
        Command command = new PumpCommand(bike);
        command.execute();
        command.execute();
        command.execute();
        int actual = bike.getTirePressureInPsi();
        int expected = 40;
        assertEquals(expected, actual);
    }

    @DisplayName("Test lubing and pumping")
    @Test
    public void testLubingAndPumping() {
        Bike bike = new Bike(Oiledness.NOT_VERY_WELL_OILED_AT_ALL, 34);
        List<Command> commands = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Command pumpCommand = new PumpCommand(bike);
            Command lubeCommand = new LubeCommand(bike);
            commands.add(pumpCommand);
            commands.add(lubeCommand);
        }
        commands.forEach(Command::execute);
        int actualTirePressure = bike.getTirePressureInPsi();
        int expectedTirePressure = 49;
        Oiledness actualOiledness = bike.getOiledness();
        Oiledness expectedOiledness = Oiledness.VERY_WELL_OILED;
        assertEquals(expectedTirePressure, actualTirePressure);
        assertEquals(expectedOiledness, actualOiledness);
    }
}
