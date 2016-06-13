package o.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import o.beans.GameCharacter;

public class Man extends GameCharacter {
    private static final Logger LOGGER = LoggerFactory.getLogger(Man.class);
    public Man(String name) {
        super(name);
    }

    @Override
    public void move() {
        LOGGER.info(getName() + " moved.");
    }
}
