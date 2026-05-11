package Vista;

import Modelo.dominio.Cancion;

import javax.swing.*;
import java.awt.*;

public class CancionCellRenderer extends DefaultListCellRenderer {

    // ── Paleta consistente con tu app ──────────────────────────────────────
    private static final Color FONDO_NORMAL      = new Color(0,   0,   0,   160);
    private static final Color FONDO_HOVER       = new Color(29, 185,  84,  50);
    private static final Color FONDO_SELECCION   = new Color(29, 185,  84,  120);
    private static final Color TEXTO_TITULO      = new Color(255, 255, 255);
    private static final Color TEXTO_ARTISTA     = new Color(180, 180, 180);
    private static final Color COLOR_FAV         = new Color(29,  185,  84);

    // ♥ U+2665 — soportado por "Dialog" y "DejaVu Sans" en todos los JDK
    private static final String ICONO_FAV    = "\u2665";   // ♥ relleno
    private static final String ICONO_NO_FAV = "\u2661";   // ♡ vacío (no favorita)
    private static final Font   FONT_FAV     = new Font("Dialog", Font.PLAIN, 15);
    private static final Font   FONT_TITULO  = new Font("Segoe UI", Font.BOLD,  13);
    private static final Font   FONT_ARTISTA = new Font("Segoe UI", Font.PLAIN, 11);

    private int hoveredIndex = -1;

    @Override
    public Component getListCellRendererComponent(
            JList<?> list, Object value, int index,
            boolean isSelected, boolean cellHasFocus) {

        JPanel panel = new JPanel(new BorderLayout(6, 0)) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                    RenderingHints.VALUE_ANTIALIAS_ON);
                Color fondo;
                if (isSelected)            fondo = FONDO_SELECCION;
                else if (index == hoveredIndex) fondo = FONDO_HOVER;
                else                       fondo = FONDO_NORMAL;

                g2.setColor(fondo);
                g2.fillRoundRect(4, 2, getWidth() - 8, getHeight() - 4, 10, 10);
                g2.dispose();
            }
        };
        panel.setOpaque(false);
        panel.setBorder(BorderFactory.createEmptyBorder(4, 10, 4, 10));

        if (value instanceof Cancion cancion) {

            // ── Ícono favorito ──────────────────────────────────────────────
            // Usamos "Dialog" que mapea a las fuentes del sistema con soporte Unicode
            JLabel lblFav = new JLabel(cancion.isCancionFav() ? ICONO_FAV : ICONO_NO_FAV);
            lblFav.setFont(FONT_FAV);
            lblFav.setForeground(cancion.isCancionFav()
                    ? COLOR_FAV
                    : new Color(80, 80, 80));   // gris tenue cuando no es favorita
            lblFav.setPreferredSize(new Dimension(24, 20));
            lblFav.setHorizontalAlignment(SwingConstants.CENTER);

            // ── Título + artista ────────────────────────────────────────────
            JPanel centro = new JPanel(new GridLayout(2, 1, 0, 1));
            centro.setOpaque(false);

            JLabel lblTitulo = new JLabel(cancion.getTitulo());
            lblTitulo.setForeground(isSelected ? Color.WHITE : TEXTO_TITULO);
            lblTitulo.setFont(FONT_TITULO);

            JLabel lblArtista = new JLabel(cancion.getArtista());
            lblArtista.setForeground(TEXTO_ARTISTA);
            lblArtista.setFont(FONT_ARTISTA);

            centro.add(lblTitulo);
            centro.add(lblArtista);

            panel.add(lblFav,  BorderLayout.WEST);
            panel.add(centro,  BorderLayout.CENTER);

        } else {
            JLabel lbl = new JLabel(value != null ? value.toString() : "");
            lbl.setForeground(TEXTO_TITULO);
            panel.add(lbl, BorderLayout.CENTER);
        }

        return panel;
    }

    public void setHoveredIndex(int index) {
        this.hoveredIndex = index;
    }
}