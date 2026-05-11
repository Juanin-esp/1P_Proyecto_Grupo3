package Vista;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

/**
 * TablaModerna — Estilo oscuro estilo Spotify para JTable.
 *
 * USO RÁPIDO (en ControladorCanciones, después de cargarTablaCanciones()):
 *   TablaModerna.aplicar(vista.tblCanciones);
 */
public class TablaModerna {

    // ── Paleta ─────────────────────────────────────────────────────────────
    private static final Color FONDO_TABLA      = new Color(18,  18,  18);
    private static final Color FONDO_HEADER     = new Color(0,    0,   0);
    private static final Color FONDO_FILA_PAR   = new Color(24,  24,  24);
    private static final Color FONDO_FILA_IMPAR = new Color(30,  30,  30);
    private static final Color FONDO_HOVER      = new Color(29, 185,  84,  45);
    private static final Color FONDO_SELECCION  = new Color(29, 185,  84, 110);
    private static final Color TEXTO_HEADER     = new Color(180, 180, 180);
    private static final Color TEXTO_CELDA      = new Color(220, 220, 220);
    private static final Color COLOR_FAV        = new Color(29,  185,  84);
    private static final Color COLOR_NO_FAV     = new Color(70,  70,   70);
    private static final Color BORDE_HEADER     = new Color(50,  50,  50);
    private static final Color BORDE_GRID       = new Color(35,  35,  35);

    // U+2665 ♥ relleno / U+2661 ♡ vacío — soportados por "Dialog" en todos los JDK
    private static final String ICONO_FAV    = "\u2665";
    private static final String ICONO_NO_FAV = "\u2661";

    private static final Font FONT_HEADER = new Font("Segoe UI", Font.BOLD,  12);
    private static final Font FONT_CELDA  = new Font("Segoe UI", Font.PLAIN, 13);
    private static final Font FONT_FAV    = new Font("Dialog",   Font.PLAIN, 15);

    public static void aplicar(JTable tabla) {
        tabla.setBackground(FONDO_TABLA);
        tabla.setForeground(TEXTO_CELDA);
        tabla.setFont(FONT_CELDA);
        tabla.setRowHeight(38);
        tabla.setShowGrid(false);
        tabla.setIntercellSpacing(new Dimension(0, 0));
        tabla.setSelectionBackground(FONDO_SELECCION);
        tabla.setSelectionForeground(Color.WHITE);
        tabla.setGridColor(BORDE_GRID);
        tabla.setFocusable(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.setOpaque(true);
        tabla.setFillsViewportHeight(true);

        JTableHeader header = tabla.getTableHeader();
        header.setBackground(FONDO_HEADER);
        header.setForeground(TEXTO_HEADER);
        header.setFont(FONT_HEADER);
        header.setPreferredSize(new Dimension(header.getWidth(), 36));
        header.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, BORDE_HEADER));
        header.setDefaultRenderer(new HeaderRenderer());

        tabla.setDefaultRenderer(Object.class,  new CeldaRenderer());
        tabla.setDefaultRenderer(Boolean.class, new FavRenderer());

        tabla.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            int filaAnterior = -1;
            @Override
            public void mouseMoved(java.awt.event.MouseEvent e) {
                int fila = tabla.rowAtPoint(e.getPoint());
                if (fila != filaAnterior) { filaAnterior = fila; tabla.repaint(); }
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override public void mouseExited(java.awt.event.MouseEvent e) { tabla.repaint(); }
        });
    }

    private static Color fondoDeFila(JTable tabla, int row, boolean isSelected) {
        if (isSelected) return FONDO_SELECCION;
        Point p = tabla.getMousePosition();
        if (p != null && tabla.rowAtPoint(p) == row) return FONDO_HOVER;
        return (row % 2 == 0) ? FONDO_FILA_PAR : FONDO_FILA_IMPAR;
    }

    private static class HeaderRenderer extends DefaultTableCellRenderer {
        HeaderRenderer() { setHorizontalAlignment(LEFT); }
        @Override
        public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {
            JLabel lbl = new JLabel(value != null ? value.toString() : "") {
                @Override protected void paintComponent(Graphics g) {
                    g.setColor(FONDO_HEADER); g.fillRect(0,0,getWidth(),getHeight());
                    super.paintComponent(g);
                }
            };
            lbl.setForeground(TEXTO_HEADER);
            lbl.setFont(FONT_HEADER);
            lbl.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createMatteBorder(0, 0, 1, 0, BORDE_HEADER),
                    BorderFactory.createEmptyBorder(0, 12, 0, 8)));
            lbl.setOpaque(false);
            return lbl;
        }
    }

    private static class CeldaRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(
                JTable tabla, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {
            final Color fondo = fondoDeFila(tabla, row, isSelected);
            JLabel lbl = new JLabel(value != null ? value.toString() : "") {
                @Override protected void paintComponent(Graphics g) {
                    g.setColor(fondo); g.fillRect(0,0,getWidth(),getHeight());
                    super.paintComponent(g);
                }
            };
            lbl.setForeground(isSelected ? Color.WHITE : TEXTO_CELDA);
            lbl.setFont(FONT_CELDA);
            lbl.setHorizontalAlignment(LEFT);
            lbl.setBorder(BorderFactory.createEmptyBorder(0, 12, 0, 8));
            lbl.setOpaque(false);
            return lbl;
        }
    }

    // Renderer dedicado para la columna Boolean de favorita
    private static class FavRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(
                JTable tabla, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {
            final Color fondo = fondoDeFila(tabla, row, isSelected);
            boolean esFav = Boolean.TRUE.equals(value);
            JLabel lbl = new JLabel(esFav ? ICONO_FAV : ICONO_NO_FAV) {
                @Override protected void paintComponent(Graphics g) {
                    g.setColor(fondo); g.fillRect(0,0,getWidth(),getHeight());
                    super.paintComponent(g);
                }
            };
            lbl.setFont(FONT_FAV);
            lbl.setForeground(esFav ? COLOR_FAV : COLOR_NO_FAV);
            lbl.setHorizontalAlignment(CENTER);
            lbl.setOpaque(false);
            return lbl;
        }
    }
}