package Vista;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;

public class ModernSliderUI extends BasicSliderUI {

    private final Color trackColor = new Color(60, 60, 60);
    private final Color progressColor = new Color(30, 215, 96); // tipo Spotify
    private final Color thumbColor = Color.WHITE;

    public ModernSliderUI(JSlider slider) {
        super(slider);
    }

    @Override
    public void paintTrack(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int trackHeight = 6;
        int cy = trackRect.y + (trackRect.height / 2) - (trackHeight / 2);

        // Track base
        g2.setColor(trackColor);
        g2.fillRoundRect(trackRect.x, cy, trackRect.width, trackHeight, 10, 10);

        // Progreso
        int progressWidth = thumbRect.x - trackRect.x;

        g2.setColor(progressColor);
        g2.fillRoundRect(trackRect.x, cy, progressWidth, trackHeight, 10, 10);
    }

    @Override
    public void paintThumb(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int size = 14;

        int x = thumbRect.x + (thumbRect.width - size) / 2;
        int y = thumbRect.y + (thumbRect.height - size) / 2;

        g2.setColor(thumbColor);
        g2.fillOval(x, y, size, size);
    }

    @Override
    protected Dimension getThumbSize() {
        return new Dimension(16, 16);
    }
}