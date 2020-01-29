package eu.sig.training.ch03;

import java.awt.*;
import java.util.*;
import java.util.List;

public enum Nationality {
    DUTCH (Arrays.asList(Color.RED, Color.WHITE, Color.BLUE)),
    GERMAN (Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW)),
    BELGIAN (Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED)),
    LUXEMBOURGER (),
    FRENCH (Arrays.asList(Color.BLUE, Color.WHITE, Color.RED)),
    ITALIAN (Arrays.asList(Color.GREEN, Color.WHITE, Color.RED)),
    ROMANIA (Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED)),
    IRELAND (Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE)),
    HUNGARIAN (Arrays.asList(Color.RED, Color.WHITE, Color.GREEN)),
    BULGARIAN (Arrays.asList(Color.WHITE, Color.GREEN, Color.RED)),
    RUSSIA (Arrays.asList(Color.WHITE, Color.BLUE, Color.RED)),
    UNCLASSIFIED ();

	private List<Color> colors = Arrays.asList(Color.GRAY);

	private Nationality() {}

    private Nationality(List<Color> colors) {
    	this.colors = colors;
    }

    public List<Color> getColors() {
    	return this.colors;
    }
}