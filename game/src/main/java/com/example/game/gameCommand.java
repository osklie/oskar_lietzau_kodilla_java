package com.example.game;

public enum gameCommand {
    ROCK("1"), PAPER("2"), SCISSORS("3"), LIZARD("4"), SPOCK("5"),
    quitTheGame("6"), NEWGAME("7"), YES("YES"), NO("NO");

    private final String value;

    gameCommand(String value) {
        this.value = value;
    }

    public static gameCommand of(String value) {
        for(gameCommand command : values()){
            if(command.value.equals(value)){
                return command;
            }
        }

        throw new IllegalArgumentException("Wrong commands " + value);
    }
}
