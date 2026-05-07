package Vista;

import Modelo.Cancion;

import javax.swing.*;
import java.awt.*;

public class CancionCellRenderer extends DefaultListCellRenderer {

    // ── Paleta consistente con tu app ──────────────────────────────────────
    private static final Color FONDO_NORMAL      = new Color(0,   0,   0,   160); // negro 63% opaco
    private static final Color FONDO_HOVER       = new Color(29, 185,  84,  50);  // verde spotify suave
    private static final Color FONDO_SELECCION   = new Color(29, 185,  84,  120); // verde spotify fuerte
    private static final Color TEXTO_TITULO      = new Color(255, 255, 255);
    private static final Color TEXTO_ARTISTA     = new Color(180, 180, 180);
    private static final Color TEXTO_FAV         = new Color(29,  185,  84);

    private int hoveredIndex = -1;

    @Override
    public Component getListCellRendererComponent(
            JList<?> list, Object value, int index,
            boolean isSelected, boolean cellHasFocus) {

        // Panel con dos líneas: título arriba, artista abajo
        JPanel panel = new JPanel(new BorderLayout(6, 0)) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                    RenderingHints.VALUE_ANTIALIAS_ON);

                Color fondo;
                if (isSelected) {
                    fondo = FONDO_SELECCION;
                } else if (index == hoveredIndex) {
                    fondo = FONDO_HOVER;
                } else {
                    fondo = FONDO_NORMAL;
                }

                g2.setColor(fondo);
                g2.fillRoundRect(4, 2, getWidth() - 8, getHeight() - 4, 10, 10);
                g2.dispose();
            }
        };

        panel.setOpaque(false);
        panel.setBorder(BorderFactory.createEmptyBorder(4, 10, 4, 10));

        if (value instanceof Cancion cancion) {

            // ── Línea izquierda: ícono favorito ──
            JLabel lblFav = new JLabel(cancion.isCancionFav() ? "❤" : "  ");
            lblFav.setForeground(TEXTO_FAV);
            lblFav.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            lblFav.setPreferredSize(new Dimension(22, 20));

            // ── Centro: título + artista en columna ──
            JPanel centro = new JPanel(new GridLayout(2, 1, 0, 1));
            centro.setOpaque(false);

            JLabel lblTitulo = new JLabel(cancion.getTitulo());
            lblTitulo.setForeground(isSelected ? Color.WHITE : TEXTO_TITULO);
            lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 13));

            JLabel lblArtista = new JLabel(cancion.getArtista());
            lblArtista.setForeground(TEXTO_ARTISTA);
            lblArtista.setFont(new Font("Segoe UI", Font.PLAIN, 11));

            centro.add(lblTitulo);
            centro.add(lblArtista);

            panel.add(lblFav,   BorderLayout.WEST);
            panel.add(centro,   BorderLayout.CENTER);

        } else {
            // Fallback por si hay strings en la lista
            JLabel lbl = new JLabel(value != null ? value.toString() : "");
            lbl.setForeground(TEXTO_TITULO);
            panel.add(lbl, BorderLayout.CENTER);
        }

        return panel;
    }

    // Llamar desde ManagementPlayer para activar el hover
    public void setHoveredIndex(int index) {
        this.hoveredIndex = index;
    }
}