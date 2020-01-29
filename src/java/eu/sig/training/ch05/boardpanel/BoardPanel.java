package eu.sig.training.ch05.boardpanel;

import java.awt.Graphics;
import java.util.List;

public class BoardPanel {
    @SuppressWarnings("unused")
    private void render(Square square, Graphics g, Size s) {
        square.getSprite().draw(g, s);
        for (Unit unit : square.getOccupants()) {
            unit.getSprite().draw(g, s);
        }
    }

    private class Sprite {
        public void draw(Graphics g, Size s) {
        }
    }

    private class Unit {
        public Sprite getSprite() {
            return null;
        }
    }

    private class Square extends Unit {

        public List<Unit> getOccupants() {
            return null;
        }
    }
}
