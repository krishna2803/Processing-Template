import processing.core.PApplet;
import processing.event.MouseEvent;

public class Application extends PApplet {

    // to handle multiple key events at once
    // index corresponds to ASCII code of the key
    private boolean keys[] = new boolean[257];

    public static void main(String ... args) {
        PApplet.main("Application");
    }

    @Override
    public void settings() {
        size(640, 640);
    }

    @Override
    public void setup() {
        background(255);
    }

    @Override
    public void draw() {
        background(255);
    }


    // keyboard events
    @Override
    public void keyPressed() {
        if (this.key != CODED) this.keys[(int) this.key] = true;
    }

    @Override
    public void keyReleased() {
        if (this.key != CODED) this.keys[(int) this.key] = false;
    }


    // mouse events
    @Override
    public void mousePressed() {
        switch(mouseButton) {
            case LEFT: 
                // left click
                break;
            case RIGHT: 
                // right click
                break;
            case CENTER:
                // middle click
                break;
        }
    }

    @Override
    public void mouseWheel(MouseEvent e) {
        if (e.getCount() < 0) {
            // mouse up
        } else {
            // mouse down
        }
    }
}
