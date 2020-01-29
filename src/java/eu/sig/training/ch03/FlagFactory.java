package eu.sig.training.ch03;

import java.awt.Color;
import java.util.*;

public class FlagFactory {

    public List<Color> getFlagColors(Nationality nationality) {
        return nationality.getColors();
    }
}