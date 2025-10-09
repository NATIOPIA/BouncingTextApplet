import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class BouncingTextApplet extends Applet implements Runnable {

    private String[] names = {"Natnael", "Selam", "Abebe", "Marta"}; // Names
    private int[] x, y;        // x and y positions
    private int[] dx, dy;      // movement steps for x and y
    private Color[] colors;    // color for each name
    private Thread animator;
    private Random rand = new Random();

    @Override
    public void init() {
        setSize(600, 400);         // Applet size
        setBackground(Color.BLACK);

        int n = names.length;
        x = new int[n];
        y = new int[n];
        dx = new int[n];
        dy = new int[n];
        colors = new Color[n];

        for (int i = 0; i < n; i++) {
            x[i] = rand.nextInt(getWidth() - 50);      // Random x start
            y[i] = rand.nextInt(getHeight() - 50);     // Random y start
            dx[i] = rand.nextBoolean() ? 5 : -5;       // Random x direction
            dy[i] = rand.nextBoolean() ? 5 : -5;       // Random y direction
            colors[i] = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        }
    }

    @Override
    public void start() {
        if (animator == null) {
            animator = new Thread(this);
            animator.start();
        }
    }

    @Override
    public void stop() {
        animator = null;
    }

    @Override
    public void run() {
        while (Thread.currentThread() == animator) {
            for (int i = 0; i < names.length; i++) {
                x[i] += dx[i];
                y[i] += dy[i];

                int textWidth = getFontMetrics(getFont()).stringWidth(names[i]);

                // Bounce off left/right edges
                if (x[i] < 0 || x[i] + textWidth > getWidth()) {
                    dx[i] = -dx[i];
                    colors[i] = randomColor();
                }

                // Bounce off top/bottom edges
                if (y[i] < 20 || y[i] > getHeight() - 20) {  // 20px margin
                    dy[i] = -dy[i];
                    colors[i] = randomColor();
                }
            }

            repaint();

            try {
                Thread.sleep(50);  // Faster animation
            } catch (InterruptedException e) {
                // Ignore
            }
        }
    }

    private Color randomColor() {
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < names.length; i++) {
            g.setColor(colors[i]);
            g.drawString(names[i], x[i], y[i]);
        }
    }
}
