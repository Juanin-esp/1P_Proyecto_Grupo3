package Vista;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

/**
 * ScrollModerno — Scrollbar oscuro estilo Spotify para JScrollPane.
 *
 * USO RÁPIDO:
 *   ScrollModerno.aplicar(vista.scrollTabla);    // en FrmCanciones
 *   ScrollModerno.aplicar(vista.ScrollPlayList); // en FrmPrincipal
 *
 * Llama a estos métodos en el controlador correspondiente, al inicializar la UI.
 */
public class ScrollModerno {

    // ── Paleta ─────────────────────────────────────────────────────────────
    private static final Color FONDO_SCROLL   = new Color(18,  18,  18);
    private static final Color THUMB_NORMAL   = new Color(80,  80,  80);
    private static final Color THUMB_HOVER    = new Color(29, 185,  84);
    private static final Color THUMB_DRAG     = new Color(29, 185,  84, 200);
    private static final Color TRACK_COLOR    = new Color(18,  18,  18);

    /**
     * Aplica el tema oscuro al JScrollPane y a sus barras de desplazamiento.
     */
    public static void aplicar(JScrollPane scroll) {
        scroll.setBackground(FONDO_SCROLL);
        scroll.setBorder(BorderFactory.createEmptyBorder());
        scroll.getViewport().setBackground(FONDO_SCROLL);

        // Barra vertical
        JScrollBar vertical = scroll.getVerticalScrollBar();
        vertical.setOpaque(false);
        vertical.setPreferredSize(new Dimension(8, Integer.MAX_VALUE));
        vertical.setUI(new BarraUI());

        // Barra horizontal (se oculta visualmente si no se necesita)
        JScrollBar horizontal = scroll.getHorizontalScrollBar();
        horizontal.setOpaque(false);
        horizontal.setPreferredSize(new Dimension(Integer.MAX_VALUE, 8));
        horizontal.setUI(new BarraUI());

        // Esquina inferior derecha (donde se cruzan las dos barras)
        scroll.setCorner(JScrollPane.LOWER_RIGHT_CORNER,
                crearEsquina());
    }

    private static JComponent crearEsquina() {
        JPanel p = new JPanel();
        p.setBackground(FONDO_SCROLL);
        p.setOpaque(true);
        return p;
    }

    // ── UI personalizada para la scrollbar ─────────────────────────────────
    private static class BarraUI extends BasicScrollBarUI {

        @Override
        protected void configureScrollBarColors() {
            thumbColor      = THUMB_NORMAL;
            thumbDarkShadowColor = new Color(0, 0, 0, 0);
            thumbLightShadowColor = new Color(0, 0, 0, 0);
            trackColor      = TRACK_COLOR;
            trackHighlightColor = TRACK_COLOR;
        }

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return botonInvisible();
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return botonInvisible();
        }

        /** Elimina las flechas de los extremos de la scrollbar */
        private JButton botonInvisible() {
            JButton btn = new JButton();
            btn.setPreferredSize(new Dimension(0, 0));
            btn.setMinimumSize(new Dimension(0, 0));
            btn.setMaximumSize(new Dimension(0, 0));
            btn.setVisible(false);
            return btn;
        }

        @Override
        protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
            g.setColor(TRACK_COLOR);
            g.fillRect(trackBounds.x, trackBounds.y,
                       trackBounds.width, trackBounds.height);
        }

        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
            if (thumbBounds.isEmpty() || !scrollbar.isEnabled()) return;

            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                RenderingHints.VALUE_ANTIALIAS_ON);

            Color color;
            if (isDragging) {
                color = THUMB_DRAG;
            } else if (isThumbRollover()) {
                color = THUMB_HOVER;
            } else {
                color = THUMB_NORMAL;
            }

            int arc = 6;
            // Margen interno para que el thumb no pegue al borde
            int margen = 2;
            g2.setColor(color);
            g2.fillRoundRect(
                    thumbBounds.x      + margen,
                    thumbBounds.y      + margen,
                    thumbBounds.width  - margen * 2,
                    thumbBounds.height - margen * 2,
                    arc, arc
            );
            g2.dispose();
        }
    }
}