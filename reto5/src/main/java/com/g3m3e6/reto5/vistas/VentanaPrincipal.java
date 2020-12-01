
package com.g3m3e6.reto5.vistas;

import com.g3m3e6.reto5.Reto5Application;
import com.g3m3e6.reto5.SpringContext;
import com.g3m3e6.reto5.entidades.Serie;
import com.g3m3e6.reto5.entidades.Usuario;
import com.g3m3e6.reto5.repositorios.PeliculaRepositorio;
import com.g3m3e6.reto5.repositorios.SerieRepositorio;
import com.g3m3e6.reto5.repositorios.UsuarioRepositorio;
import java.util.Optional;
import javax.swing.JOptionPane;

/**
 *
 * @author juand
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    UsuarioRepositorio usuarioRepositorio;
    PeliculaRepositorio peliculaRepositorio;
    SerieRepositorio serieRepositorio;
    
    public VentanaPrincipal() {
//         iniciar Spring
        Reto5Application.IniciarSpring();
//        que no sea expandible
        setResizable(false);
        initComponents();
        PPelicula.setVisible(false);
        PSerie.setVisible(false);
        
//        SpringContext
        usuarioRepositorio=SpringContext.getBean(UsuarioRepositorio.class);
        peliculaRepositorio=SpringContext.getBean(PeliculaRepositorio.class);
        serieRepositorio=SpringContext.getBean(SerieRepositorio.class);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAliasUsuario = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BtnUsuario = new javax.swing.JButton();
        BtnSerie = new javax.swing.JButton();
        BtnPelicula = new javax.swing.JButton();
        lbNotificaciones = new javax.swing.JLabel();
        PUsuario = new javax.swing.JPanel();
        lbUsuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfAliasUsuario = new javax.swing.JTextField();
        lbNombreUsuario = new javax.swing.JLabel();
        tfNombreUsuario = new javax.swing.JTextField();
        btnCrearUsuario = new javax.swing.JButton();
        btnBuscarUsuario = new javax.swing.JButton();
        btnActualizarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        PSerie = new javax.swing.JPanel();
        lbSerie = new javax.swing.JLabel();
        lbTituloSerie = new javax.swing.JLabel();
        tfTituloSerie = new javax.swing.JTextField();
        lbNumTemporadas = new javax.swing.JLabel();
        tfNumTemporadas = new javax.swing.JTextField();
        btnCrearSerie = new javax.swing.JButton();
        btnBuscarSerie = new javax.swing.JButton();
        btnActualizarSerie = new javax.swing.JButton();
        btnEliminarSerie = new javax.swing.JButton();
        tfNumCapitulos = new javax.swing.JTextField();
        lbNumCapitulos = new javax.swing.JLabel();
        PPelicula = new javax.swing.JPanel();
        lbPelicula = new javax.swing.JLabel();
        lbTituloPelicula = new javax.swing.JLabel();
        tfTituloPelicula = new javax.swing.JTextField();
        lbResumenPelicula = new javax.swing.JLabel();
        btnCrearPelicula = new javax.swing.JButton();
        btnBuscarPelicula = new javax.swing.JButton();
        btnActualizarPelicula = new javax.swing.JButton();
        btnEliminarPelicula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfResumenPelicula = new javax.swing.JTextArea();
        tfNombreDirector = new javax.swing.JTextField();
        tfYearPelicula = new javax.swing.JTextField();
        lbYearPelicula = new javax.swing.JLabel();
        lbNombreDirector = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        lbAliasUsuario.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setAutoscrolls(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cerrar (1).png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Red Flix");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(187, 187, 187));

        BtnUsuario.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        BtnUsuario.setForeground(new java.awt.Color(0, 0, 0));
        BtnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-protection (2).png"))); // NOI18N
        BtnUsuario.setText("Usuario");
        BtnUsuario.setBorder(null);
        BtnUsuario.setContentAreaFilled(false);
        BtnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuarioActionPerformed(evt);
            }
        });

        BtnSerie.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        BtnSerie.setForeground(new java.awt.Color(0, 0, 0));
        BtnSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/television-inteligente.png"))); // NOI18N
        BtnSerie.setText("Serie");
        BtnSerie.setBorder(null);
        BtnSerie.setContentAreaFilled(false);
        BtnSerie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSerieActionPerformed(evt);
            }
        });

        BtnPelicula.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        BtnPelicula.setForeground(new java.awt.Color(0, 0, 0));
        BtnPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie-ticket.png"))); // NOI18N
        BtnPelicula.setText("Pelicula");
        BtnPelicula.setBorder(null);
        BtnPelicula.setContentAreaFilled(false);
        BtnPelicula.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPeliculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(BtnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(BtnUsuario)
                .addGap(64, 64, 64)
                .addComponent(BtnPelicula)
                .addGap(75, 75, 75)
                .addComponent(BtnSerie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbNotificaciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbNotificaciones.setForeground(new java.awt.Color(0, 0, 0));
        lbNotificaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNotificaciones.setText("Panel de notificaciones");
        lbNotificaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PUsuario.setBackground(new java.awt.Color(187, 187, 187));
        PUsuario.setForeground(new java.awt.Color(204, 204, 204));

        lbUsuario.setBackground(new java.awt.Color(0, 0, 0));
        lbUsuario.setFont(new java.awt.Font("Arial Black", 3, 30)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lbUsuario.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Alas:");

        tfAliasUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAliasUsuarioActionPerformed(evt);
            }
        });

        lbNombreUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lbNombreUsuario.setText("Nombre y apellidos:");

        btnCrearUsuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCrearUsuario.setForeground(new java.awt.Color(0, 102, 255));
        btnCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/disquete.png"))); // NOI18N
        btnCrearUsuario.setText("Crear");
        btnCrearUsuario.setBorder(null);
        btnCrearUsuario.setBorderPainted(false);
        btnCrearUsuario.setContentAreaFilled(false);
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnBuscarUsuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBuscarUsuario.setForeground(new java.awt.Color(0, 102, 255));
        btnBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscarUsuario.setText("Buscar");
        btnBuscarUsuario.setBorder(null);
        btnBuscarUsuario.setBorderPainted(false);
        btnBuscarUsuario.setContentAreaFilled(false);
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        btnActualizarUsuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnActualizarUsuario.setForeground(new java.awt.Color(0, 102, 255));
        btnActualizarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        btnActualizarUsuario.setText("Actualizar");
        btnActualizarUsuario.setBorder(null);
        btnActualizarUsuario.setBorderPainted(false);
        btnActualizarUsuario.setContentAreaFilled(false);
        btnActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(0, 102, 255));
        btnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar.png"))); // NOI18N
        btnEliminarUsuario.setText("Eliminar");
        btnEliminarUsuario.setBorder(null);
        btnEliminarUsuario.setBorderPainted(false);
        btnEliminarUsuario.setContentAreaFilled(false);
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PUsuarioLayout = new javax.swing.GroupLayout(PUsuario);
        PUsuario.setLayout(PUsuarioLayout);
        PUsuarioLayout.setHorizontalGroup(
            PUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PUsuarioLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(PUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PUsuarioLayout.createSequentialGroup()
                        .addGroup(PUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(51, 51, 51)
                        .addGroup(PUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAliasUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PUsuarioLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PUsuarioLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        PUsuarioLayout.setVerticalGroup(
            PUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PUsuarioLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(tfAliasUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreUsuario)
                    .addComponent(tfNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(PUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        PSerie.setBackground(new java.awt.Color(187, 187, 187));
        PSerie.setForeground(new java.awt.Color(204, 204, 204));

        lbSerie.setBackground(new java.awt.Color(0, 0, 0));
        lbSerie.setFont(new java.awt.Font("Arial Black", 3, 30)); // NOI18N
        lbSerie.setForeground(new java.awt.Color(0, 0, 0));
        lbSerie.setText("Serie");

        lbTituloSerie.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbTituloSerie.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloSerie.setText("Titulo:");

        tfTituloSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTituloSerieActionPerformed(evt);
            }
        });

        lbNumTemporadas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbNumTemporadas.setForeground(new java.awt.Color(0, 0, 0));
        lbNumTemporadas.setText("Temporadas:");

        tfNumTemporadas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumTemporadasKeyTyped(evt);
            }
        });

        btnCrearSerie.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCrearSerie.setForeground(new java.awt.Color(0, 102, 255));
        btnCrearSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/disquete.png"))); // NOI18N
        btnCrearSerie.setText("Crear");
        btnCrearSerie.setBorder(null);
        btnCrearSerie.setBorderPainted(false);
        btnCrearSerie.setContentAreaFilled(false);
        btnCrearSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearSerieActionPerformed(evt);
            }
        });

        btnBuscarSerie.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBuscarSerie.setForeground(new java.awt.Color(0, 102, 255));
        btnBuscarSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscarSerie.setText("Buscar");
        btnBuscarSerie.setBorder(null);
        btnBuscarSerie.setBorderPainted(false);
        btnBuscarSerie.setContentAreaFilled(false);

        btnActualizarSerie.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnActualizarSerie.setForeground(new java.awt.Color(0, 102, 255));
        btnActualizarSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        btnActualizarSerie.setText("Actualizar");
        btnActualizarSerie.setBorder(null);
        btnActualizarSerie.setBorderPainted(false);
        btnActualizarSerie.setContentAreaFilled(false);

        btnEliminarSerie.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnEliminarSerie.setForeground(new java.awt.Color(0, 102, 255));
        btnEliminarSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar.png"))); // NOI18N
        btnEliminarSerie.setText("Eliminar");
        btnEliminarSerie.setBorder(null);
        btnEliminarSerie.setBorderPainted(false);
        btnEliminarSerie.setContentAreaFilled(false);

        tfNumCapitulos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumCapitulosKeyTyped(evt);
            }
        });

        lbNumCapitulos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbNumCapitulos.setForeground(new java.awt.Color(0, 0, 0));
        lbNumCapitulos.setText("Capitulos:");

        javax.swing.GroupLayout PSerieLayout = new javax.swing.GroupLayout(PSerie);
        PSerie.setLayout(PSerieLayout);
        PSerieLayout.setHorizontalGroup(
            PSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PSerieLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(btnCrearSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnBuscarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnActualizarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnEliminarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(PSerieLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(PSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNumCapitulos)
                    .addComponent(lbTituloSerie)
                    .addComponent(lbNumTemporadas))
                .addGap(28, 28, 28)
                .addGroup(PSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfNumTemporadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfTituloSerie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNumCapitulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PSerieLayout.setVerticalGroup(
            PSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PSerieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(PSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTituloSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTituloSerie))
                .addGap(27, 27, 27)
                .addGroup(PSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumTemporadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(PSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumCapitulos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumCapitulos))
                .addGap(32, 32, 32)
                .addGroup(PSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        PPelicula.setBackground(new java.awt.Color(187, 187, 187));
        PPelicula.setForeground(new java.awt.Color(204, 204, 204));

        lbPelicula.setBackground(new java.awt.Color(0, 0, 0));
        lbPelicula.setFont(new java.awt.Font("Arial Black", 3, 30)); // NOI18N
        lbPelicula.setForeground(new java.awt.Color(0, 0, 0));
        lbPelicula.setText("Pelicula");

        lbTituloPelicula.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbTituloPelicula.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloPelicula.setText("Titulo:");

        tfTituloPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTituloPeliculaActionPerformed(evt);
            }
        });

        lbResumenPelicula.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbResumenPelicula.setForeground(new java.awt.Color(0, 0, 0));
        lbResumenPelicula.setText("Resumen:");

        btnCrearPelicula.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCrearPelicula.setForeground(new java.awt.Color(0, 102, 255));
        btnCrearPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/disquete.png"))); // NOI18N
        btnCrearPelicula.setText("Crear");
        btnCrearPelicula.setBorder(null);
        btnCrearPelicula.setBorderPainted(false);
        btnCrearPelicula.setContentAreaFilled(false);

        btnBuscarPelicula.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBuscarPelicula.setForeground(new java.awt.Color(0, 102, 255));
        btnBuscarPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscarPelicula.setText("Buscar");
        btnBuscarPelicula.setBorder(null);
        btnBuscarPelicula.setBorderPainted(false);
        btnBuscarPelicula.setContentAreaFilled(false);

        btnActualizarPelicula.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnActualizarPelicula.setForeground(new java.awt.Color(0, 102, 255));
        btnActualizarPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        btnActualizarPelicula.setText("Actualizar");
        btnActualizarPelicula.setBorder(null);
        btnActualizarPelicula.setBorderPainted(false);
        btnActualizarPelicula.setContentAreaFilled(false);

        btnEliminarPelicula.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnEliminarPelicula.setForeground(new java.awt.Color(0, 102, 255));
        btnEliminarPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar.png"))); // NOI18N
        btnEliminarPelicula.setText("Eliminar");
        btnEliminarPelicula.setBorder(null);
        btnEliminarPelicula.setBorderPainted(false);
        btnEliminarPelicula.setContentAreaFilled(false);

        tfResumenPelicula.setColumns(20);
        tfResumenPelicula.setRows(5);
        jScrollPane1.setViewportView(tfResumenPelicula);

        tfNombreDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreDirectorActionPerformed(evt);
            }
        });

        tfYearPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfYearPeliculaActionPerformed(evt);
            }
        });

        lbYearPelicula.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbYearPelicula.setForeground(new java.awt.Color(0, 0, 0));
        lbYearPelicula.setText("Año:");

        lbNombreDirector.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbNombreDirector.setForeground(new java.awt.Color(0, 0, 0));
        lbNombreDirector.setText("Director:");

        javax.swing.GroupLayout PPeliculaLayout = new javax.swing.GroupLayout(PPelicula);
        PPelicula.setLayout(PPeliculaLayout);
        PPeliculaLayout.setHorizontalGroup(
            PPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPeliculaLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(PPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPeliculaLayout.createSequentialGroup()
                        .addComponent(btnCrearPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnActualizarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnEliminarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPeliculaLayout.createSequentialGroup()
                        .addGroup(PPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNombreDirector)
                            .addComponent(lbYearPelicula)
                            .addComponent(lbTituloPelicula)
                            .addComponent(lbResumenPelicula))
                        .addGap(32, 32, 32)
                        .addGroup(PPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfTituloPelicula)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                            .addComponent(tfYearPelicula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNombreDirector, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPeliculaLayout.createSequentialGroup()
                        .addComponent(lbPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))))
        );
        PPeliculaLayout.setVerticalGroup(
            PPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPeliculaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfTituloPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTituloPelicula))
                .addGroup(PPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PPeliculaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(PPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfYearPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbYearPelicula)))
                    .addGroup(PPeliculaLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbResumenPelicula)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(PPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombreDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombreDirector))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout lbAliasUsuarioLayout = new javax.swing.GroupLayout(lbAliasUsuario);
        lbAliasUsuario.setLayout(lbAliasUsuarioLayout);
        lbAliasUsuarioLayout.setHorizontalGroup(
            lbAliasUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(lbAliasUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lbAliasUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbAliasUsuarioLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbNotificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(lbAliasUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbAliasUsuarioLayout.createSequentialGroup()
                    .addContainerGap(195, Short.MAX_VALUE)
                    .addComponent(PSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(lbAliasUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbAliasUsuarioLayout.createSequentialGroup()
                    .addContainerGap(195, Short.MAX_VALUE)
                    .addComponent(PPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        lbAliasUsuarioLayout.setVerticalGroup(
            lbAliasUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbAliasUsuarioLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbAliasUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(lbAliasUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lbAliasUsuarioLayout.createSequentialGroup()
                    .addGap(119, 119, 119)
                    .addComponent(PSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(154, Short.MAX_VALUE)))
            .addGroup(lbAliasUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lbAliasUsuarioLayout.createSequentialGroup()
                    .addGap(119, 119, 119)
                    .addComponent(PPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(154, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAliasUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAliasUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfAliasUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAliasUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAliasUsuarioActionPerformed

    private void tfTituloSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTituloSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTituloSerieActionPerformed

    private void tfTituloPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTituloPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTituloPeliculaActionPerformed

    private void BtnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuarioActionPerformed
        PUsuario.setVisible(true);
        PSerie.setVisible(false);
        PPelicula.setVisible(false);
    }//GEN-LAST:event_BtnUsuarioActionPerformed

    private void BtnPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPeliculaActionPerformed
        PUsuario.setVisible(false);
        PSerie.setVisible(false);
        PPelicula.setVisible(true);
    }//GEN-LAST:event_BtnPeliculaActionPerformed

    private void BtnSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSerieActionPerformed
        PUsuario.setVisible(false);
        PSerie.setVisible(true);
        PPelicula.setVisible(false);
    }//GEN-LAST:event_BtnSerieActionPerformed

    private void tfNombreDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreDirectorActionPerformed

    private void tfYearPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfYearPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfYearPeliculaActionPerformed

    private void btnCrearSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearSerieActionPerformed
        // TODO add your handling code here:
        String titulo=tfTituloSerie.getText();
        int temporadas=Integer.parseInt(tfNumTemporadas.getText());
        int capitulos=Integer.parseInt(tfNumCapitulos.getText());
    
        if(titulo.isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor completar los campos ");
        }else{
            Serie nuevaSerie=new Serie();
            nuevaSerie.setTituloSerie(titulo);
            nuevaSerie.setNumTemporadas(temporadas);
            nuevaSerie.setNumCapitulos(capitulos);
            
            serieRepositorio.save(nuevaSerie);
            lbNotificaciones.setText("La Serie: "+titulo+" Se agrego correctamente");
            tfTituloSerie.setText("");
            tfNumTemporadas.setText("");
            tfNumCapitulos.setText("");
            JOptionPane.showMessageDialog(null,"La Serie: "+titulo+" Se agrego correctamente");
            
        }
          
    }//GEN-LAST:event_btnCrearSerieActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
//       obtener datos, crear y guardar Usuario
        String Alias=tfAliasUsuario.getText();
        String Nombre=tfNombreUsuario.getText();
    
        if(Alias.isEmpty() || Nombre.isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor completar los campos ");
        }else{
        Optional<Usuario> query=usuarioRepositorio.findById(Alias);
        if(query.isPresent()){
            JOptionPane.showMessageDialog(null, "El usuario "+Alias+"Ya existe");
        }else{
            Usuario usuario=new Usuario();
            usuario.setAliasUsuario(Alias);
            usuario.setNombreUsuario(Nombre);
            usuarioRepositorio.save(usuario);
            lbNotificaciones.setText(Alias+" con nombre: "+Nombre+" Se agrego correctamente");
            tfAliasUsuario.setText("");
            tfNombreUsuario.setText("");
            JOptionPane.showMessageDialog(null,"Usuario "+Alias+" se agrego correctamente");
            }
        }
        
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void tfNumTemporadasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumTemporadasKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_tfNumTemporadasKeyTyped

    private void tfNumCapitulosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumCapitulosKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_tfNumCapitulosKeyTyped

    private void btnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioActionPerformed
        // TODO add your handling code here:
        String Alias=tfAliasUsuario.getText();
        String Nombre=tfNombreUsuario.getText();
    
        if(Alias.isEmpty() || Nombre.isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor completar los campos ");
        }else{
            
            Optional<Usuario> query=usuarioRepositorio.findById(Alias);
            
            if(!query.isPresent()){
                JOptionPane.showMessageDialog(null,"El Usuario "+Alias+" usuario no existe ");
            }else{
            Usuario datos=usuarioRepositorio.findById(Alias).get();
            datos.setNombreUsuario(Nombre);
        
            usuarioRepositorio.save(datos);
            lbNotificaciones.setText("El usuario: "+ Alias+ "Se actualizo correctamente");
            tfAliasUsuario.setText("");
            tfNombreUsuario.setText("");
            JOptionPane.showMessageDialog(null,"El usuario: "+ Alias+ "Se actualizo correctamente");
            
        }
        }
    }//GEN-LAST:event_btnActualizarUsuarioActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        // TODO add your handling code here:
        String Alias=tfAliasUsuario.getText();
        String Nombre=tfNombreUsuario.getText();
    
        if(Alias.isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor completar el campo de allias ");
        }else{
            
            Optional<Usuario> query=usuarioRepositorio.findById(Alias);
            if(!query.isPresent()){
                JOptionPane.showMessageDialog(null,"El Usuario "+Alias+" usuario no existe ");
            }else{
                Usuario datos=query.get();
                tfNombreUsuario.setText(datos.getNombreUsuario());
        }
        }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    //Se crea codigo boton eliminar 
    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        // TODO add your handling code here:
        String Alias=tfAliasUsuario.getText();
        String Nombre=tfNombreUsuario.getText();
        if(Alias.isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor completar el campo de allias ");
        }else{
            Optional<Usuario> query=usuarioRepositorio.findById(Alias);
            if(!query.isPresent()){
                JOptionPane.showMessageDialog(null,"El Usuario "+Alias+" usuario no existe ");
            }else{
                usuarioRepositorio.deleteById(Alias);
                JOptionPane.showMessageDialog(null,"El Usuario "+Alias+" fue elliminado ");
            }
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPelicula;
    private javax.swing.JButton BtnSerie;
    private javax.swing.JButton BtnUsuario;
    private javax.swing.JPanel PPelicula;
    private javax.swing.JPanel PSerie;
    private javax.swing.JPanel PUsuario;
    private javax.swing.JButton btnActualizarPelicula;
    private javax.swing.JButton btnActualizarSerie;
    private javax.swing.JButton btnActualizarUsuario;
    private javax.swing.JButton btnBuscarPelicula;
    private javax.swing.JButton btnBuscarSerie;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnCrearPelicula;
    private javax.swing.JButton btnCrearSerie;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEliminarPelicula;
    private javax.swing.JButton btnEliminarSerie;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lbAliasUsuario;
    private javax.swing.JLabel lbNombreDirector;
    private javax.swing.JLabel lbNombreUsuario;
    private javax.swing.JLabel lbNotificaciones;
    private javax.swing.JLabel lbNumCapitulos;
    private javax.swing.JLabel lbNumTemporadas;
    private javax.swing.JLabel lbPelicula;
    private javax.swing.JLabel lbResumenPelicula;
    private javax.swing.JLabel lbSerie;
    private javax.swing.JLabel lbTituloPelicula;
    private javax.swing.JLabel lbTituloSerie;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JLabel lbYearPelicula;
    private javax.swing.JTextField tfAliasUsuario;
    private javax.swing.JTextField tfNombreDirector;
    private javax.swing.JTextField tfNombreUsuario;
    private javax.swing.JTextField tfNumCapitulos;
    private javax.swing.JTextField tfNumTemporadas;
    private javax.swing.JTextArea tfResumenPelicula;
    private javax.swing.JTextField tfTituloPelicula;
    private javax.swing.JTextField tfTituloSerie;
    private javax.swing.JTextField tfYearPelicula;
    // End of variables declaration//GEN-END:variables
}
