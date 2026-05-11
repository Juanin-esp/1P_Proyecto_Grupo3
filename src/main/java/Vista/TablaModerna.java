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
    private static final Color TEXTO_FAV        = new Color(29,  185,  84);
    private static final Color BORDE_HEADER     = new Color(50,  50,  50);
    private static final Color BORDE_GRID       = new Color(35,  35,  35);

    private static final Font FONT_HEADER = new Font("Segoe UI", Font.BOLD,   12);
    private static final Font FONT_CELDA  = new Font("Segoe UI", Font.PLAIN,  13);

    /**
     * Aplica el tema oscuro a la tabla y a su JScrollPane contenedor.
     * Llama a este método después de cargar los datos en la tabla.
     */
    public static void aplicar(JTable tabla) {
        // ── Tabla base ──────────────────────────────────────────────────────
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

        // ── Header ──────────────────────────────────────────────────────────
        JTableHeader header = tabla.getTableHeader();
        header.setBackground(FONDO_HEADER);
        header.setForeground(TEXTO_HEADER);
        header.setFont(FONT_HEADER);
        header.setPreferredSize(new Dimension(header.getWidth(), 36));
        header.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, BORDE_HEADER));
        header.setDefaultRenderer(new HeaderRenderer());

        // ── Renderer de celdas ──────────────────────────────────────────────
        tabla.setDefaultRenderer(Object.class,  new CeldaRenderer());
        tabla.setDefaultRenderer(Boolean.class, new CeldaRenderer());

        // ── Hover ───────────────────────────────────────────────────────────
        tabla.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            int filaAnterior = -1;
            @Override
            public void mouseMoved(java.awt.event.MouseEvent e) {
                int fila = tabla.rowAtPoint(e.getPoint());
                if (fila != filaAnterior) {
                    filaAnterior = fila;
                    tabla.repaint();
                }
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                tabla.repaint();
            }
        });
    }

    // ── Renderer: header ────────────────────────────────────────────────────
    private static class HeaderRenderer extends DefaultTableCellRenderer {
        HeaderRenderer() {
            setHorizontalAlignment(LEFT);
        }
        @Override
        public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {

            JLabel lbl = new JLabel(value != null ? value.toString() : "") {
                @Override
                protected void paintComponent(Graphics g) {
                    g.setColor(FONDO_HEADER);
                    g.fillRect(0, 0, getWidth(), getHeight());
                    super.paintComponent(g);
                }
            };
            lbl.setForeground(TEXTO_HEADER);
            lbl.setFont(FONT_HEADER);
            lbl.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createMatteBorder(0, 0, 1, 0, BORDE_HEADER),
                    BorderFactory.createEmptyBorder(0, 12, 0, 8)
            ));
            lbl.setOpaque(false);
            return lbl;
        }
    }

    // ── Renderer: celda ─────────────────────────────────────────────────────
    private static class CeldaRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(
                JTable tabla, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {

            // Detectar fila bajo el ratón
            Point mousePos = tabla.getMousePosition();
            int hoveredRow = (mousePos != null) ? tabla.rowAtPoint(mousePos) : -1;

            Color fondo;
            if (isSelected) {
                fondo = FONDO_SELECCION;
            } else if (row == hoveredRow) {
                fondo = FONDO_HOVER;
            } else {
                fondo = (row % 2 == 0) ? FONDO_FILA_PAR : FONDO_FILA_IMPAR;
            }

            // Valor booleano → ícono favorito
            String texto;
            Color colorTexto = isSelected ? Color.WHITE : TEXTO_CELDA;

            if (value instanceof Boolean) {
                texto = ((Boolean) value) ? "❤" : "";
                colorTexto = TEXTO_FAV;
                setHorizontalAlignment(CENTER);
            } else {
                texto = value != null ? value.toString() : "";
                setHorizontalAlignment(LEFT);
            }

            JLabel lbl = new JLabel(texto) {
                @Override
                protected void paintComponent(Graphics g) {
                    g.setColor(fondo);
                    g.fillRect(0, 0, getWidth(), getHeight());
                    super.paintComponent(g);
                }
            };
            lbl.setForeground(colorTexto);
            lbl.setFont(FONT_CELDA);
            lbl.setBorder(BorderFactory.createEmptyBorder(0, 12, 0, 8));
            lbl.setOpaque(false);
            return lbl;
        }
    }
}