package pruebas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class lol extends JFrame {

    private JPanel panel;
    private JButton[] botones = new JButton[12];
    private Integer[] valores = {1,1,2,2,3,3,4,4,5,5,6,6};
    private int seleccion1 = -1;
    private int seleccion2 = -1;
    private int puntos = 0;
    private int parejas = 0;

    private JLabel etiquetaPuntos;
    private ImageIcon dorso;
    private ImageIcon[] imagenes = new ImageIcon[6];

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            lol juego = new lol();
            juego.setVisible(true);
        });
    }

    public lol() {
        setTitle("Memorama Básico");
        setSize(540, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titulo = new JLabel("JUEGO!!!");
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setBounds(200, 10, 200, 30);
        add(titulo);

        etiquetaPuntos = new JLabel("Puntos: 0");
        etiquetaPuntos.setBounds(400, 20, 100, 20);
        etiquetaPuntos.setFont(new Font("Arial", Font.PLAIN, 14));
        add(etiquetaPuntos);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(10, 60, 500, 380);
        add(panel);

        // Cargar imágenes
        cargarImagenes();

        // Revolver las cartas
        List<Integer> listaCartas = Arrays.asList(valores);
        Collections.shuffle(listaCartas);
        listaCartas.toArray(valores);

        // Posiciones para los botones
        int[] x = {20, 130, 240, 350};
        int[] y = {20, 140, 260};

        for (int i = 0; i < 12; i++) {
            JButton boton = new JButton();
            boton.setBounds(x[i % 4], y[i / 4], 100, 100);
            boton.setIcon(dorso);
            int pos = i;
            boton.addActionListener(e -> manejarClick(pos));
            botones[i] = boton;
            panel.add(boton);
        }
    }

    private void cargarImagenes() {
        // Imagen del dorso
        dorso = new ImageIcon(getClass().getResource("/iamgenes/modificado 3.png"));
        // Cargar las imágenes de frente (asegúrate que existan c1.png a c6.png)
        for (int i = 0; i < 6; i++) {
            imagenes[i] = new ImageIcon(getClass().getResource("/iamgenes/c" + (i + 1) + ".png"));
        }
    }

    private void manejarClick(int index) {
        if (botones[index].getIcon() != dorso || seleccion2 != -1) {
            return;
        }

        botones[index].setIcon(imagenes[valores[index] - 1]);

        if (seleccion1 == -1) {
            seleccion1 = index;
        } else {
            seleccion2 = index;

            if (valores[seleccion1].equals(valores[seleccion2])) {
                botones[seleccion1].setEnabled(false);
                botones[seleccion2].setEnabled(false);
                puntos += 10;
                parejas++;
                actualizarPuntos();

                if (parejas == 6) {
                    JOptionPane.showMessageDialog(this, "¡Ganaste!\nPuntaje final: " + puntos);
                }

                seleccion1 = -1;
                seleccion2 = -1;
            } else {
                Timer timer = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        botones[seleccion1].setIcon(dorso);
                        botones[seleccion2].setIcon(dorso);
                        seleccion1 = -1;
                        seleccion2 = -1;
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }

    private void actualizarPuntos() {
        etiquetaPuntos.setText("Puntos: " + puntos);
    }
}

