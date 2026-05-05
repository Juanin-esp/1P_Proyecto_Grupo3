package Vista;
 
import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;
import java.awt.geom.*;
 
/**
 * SliderModerno - Custom UI para JSlider estilo reproductor oscuro moderno.
 * 
 * USO RÁPIDO:
 *   SliderModerno.aplicar(vista.sliderProgress, SliderModerno.Tipo.PROGRESO);
 *   SliderModerno.aplicar(vista.sliderVolume,   SliderModerno.Tipo.VOLUMEN);
 * 
 * Llama estos métodos en ManagementPlayer después de initSlider() e initVolume().
 */
public class SliderModerno extends BasicSliderUI {
 
    public enum Tipo {
        PROGRESO,   // Verde Spotify, más ancho, sin thumb visible en reposo
        VOLUMEN     // Blanco/gris, compacto
    }
 
    // ── Paleta ─────────────────────────────────────────────────────────────────
    private static final Color TRACK_BG      = new Color(55, 55, 55);
    private static final Color FILL_VERDE    = new Color(29, 185, 84);   // Spotify green
    private static final Color FILL_BLANCO   = new Color(200, 200, 200);
    private static final Color THUMB_COLOR   = Color.WHITE;
    private static final Color THUMB_HOVER   = new Color(29, 185, 84);
 
    private final Tipo tipo;
    private boolean hovered = false;
 
    public SliderModerno(JSlider slider, Tipo tipo) {
        super(slider);
        this.tipo = tipo;
    }
 
    // ── Aplicar al slider desde fuera ──────────────────────────────────────────
    public static void aplicar(JSlider slider, Tipo tipo) {
        slider.setUI(new SliderModerno(slider, tipo));
        slider.setOpaque(false);
        slider.setFocusable(false);
        slider.setBorder(BorderFactory.createEmptyBorder(4, 0, 4, 0));
 
        // Efecto hover: thumb aparece / cambia color
        slider.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override public void mouseEntered(java.awt.event.MouseEvent e) {
                ((SliderModerno) slider.getUI()).hovered = true;
                slider.repaint();
            }
            @Override public void mouseExited(java.awt.event.MouseEvent e) {
                ((SliderModerno) slider.getUI()).hovered = false;
                slider.repaint();
            }
        });
    }
 
    // ── Alturas de track ───────────────────────────────────────────────────────
    private int trackHeight() {
        return (hovered && tipo == Tipo.PROGRESO) ? 5 : 4;
    }
 
    // ── Pintar track ───────────────────────────────────────────────────────────
    @Override
    public void paintTrack(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
 
        Rectangle trackRect = this.trackRect;
        int cy = trackRect.y + trackRect.height / 2;
        int h  = trackHeight();
 
        // Fondo del track
        g2.setColor(TRACK_BG);
        g2.fill(new RoundRectangle2D.Float(trackRect.x, cy - h / 2, trackRect.width, h, h, h));
 
        // Parte rellena (progreso)
        int fillW = thumbRect.x + thumbRect.width / 2 - trackRect.x;
        fillW = Math.max(0, Math.min(fillW, trackRect.width));
 
        Color fillColor = (tipo == Tipo.PROGRESO) ? FILL_VERDE : FILL_BLANCO;
        g2.setColor(fillColor);
        g2.fill(new RoundRectangle2D.Float(trackRect.x, cy - h / 2, fillW, h, h, h));
 
        g2.dispose();
    }
 
    // ── Pintar thumb ───────────────────────────────────────────────────────────
    @Override
    public void paintThumb(Graphics g) {
        // Para PROGRESO: thumb solo visible en hover
        if (tipo == Tipo.PROGRESO && !hovered) return;
 
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
 
        int cx = thumbRect.x + thumbRect.width / 2;
        int cy = thumbRect.y + thumbRect.height / 2;
        int r  = (tipo == Tipo.PROGRESO) ? 6 : 5;
 
        // Sombra suave
        g2.setColor(new Color(0, 0, 0, 60));
        g2.fillOval(cx - r + 1, cy - r + 2, r * 2, r * 2);
 
        // Círculo principal
        g2.setColor(hovered ? THUMB_HOVER : THUMB_COLOR);
        g2.fillOval(cx - r, cy - r, r * 2, r * 2);
 
        g2.dispose();
    }
 
    // ── Suprimir elementos por defecto ─────────────────────────────────────────
    @Override public void paintFocus(Graphics g) {}
    @Override public void paintTicks(Graphics g) {}
    @Override public void paintLabels(Graphics g) {}
    @Override public void paintMajorTickForHorizSlider(Graphics g, Rectangle r, int x) {}
    @Override public void paintMinorTickForHorizSlider(Graphics g, Rectangle r, int x) {}
 
    // ── Tamaño del thumb ───────────────────────────────────────────────────────
    @Override
    public Dimension getThumbSize() {
        return new Dimension(14, 14);
    }
}