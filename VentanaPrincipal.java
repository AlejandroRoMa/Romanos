/*
 Nombre del Autor: Abraham Alejandro Rosales Martinez 
 Correo:   lelalez@hotmail.com
 tel: 715 159 63 23
 Instituto Tecnologico de Zitacuaro 
 Ing Informatica 8º sem
    
Programa desarrollado en NetBeans IDE 8.0.2 con JDK 1.8
 */
package romanos;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author AbrahamAlejandro
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setJTexFieldChanged(jTextTexto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextTraduccion = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextTexto = new javax.swing.JTextPane();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversion de numeros arabigos a romanos");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Ingrese el número a convertir:");

        jTextTraduccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(jTextTraduccion);

        jLabel3.setText("El resultado de la conversion es la siguiente:");

        jTextTexto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(jTextTexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(70, 70, 70)))
                .addContainerGap(279, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextTexto;
    private javax.swing.JTextPane jTextTraduccion;
    // End of variables declaration//GEN-END:variables

    private void setJTexFieldChanged(JTextPane jTextTexto) {
        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!jTextTexto.getText().isEmpty()) {
                    jTextTraduccion.setText(convertir(jTextTexto.getText()));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (!jTextTexto.getText().isEmpty()) {
                    jTextTraduccion.setText(convertir(jTextTexto.getText()));
                } else {
                    jTextTraduccion.setText("");
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        };
        jTextTexto.getDocument().addDocumentListener(documentListener);
    }

    public String convertir(String numero) {
        try {

            int num = Integer.parseInt(numero);

            /*
            int romano = 0;
            BufferedReader br = new BufferedReader(new FileReader("src/romanos/num.txt"));
            String reg = br.readLine();
            while (reg != null) {
                romano++;
                String[] numeros = reg.split(":");
                String rom =convertir(romano, 0, "");
                if (!numeros[1].trim().equalsIgnoreCase(rom)) {
                    JOptionPane.showMessageDialog(rootPane, numeros[1] + "  =  " + rom + " = " + romano);
                }
                reg = br.readLine();
            }*/
            return convertir(num, 0, "");
        } catch (Exception e) {
            if (numero.trim().equalsIgnoreCase("1000")) {
                return "M";
            }
            //else
            //JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        return "No es posible realizar la conversion! Favor de introducir un número entero sin decimales no mayor a 1000.";
    }

    private final String[][] simbolos = {{"I", "IV", "V", "IX"}, {"X", "XL", "L", "XC"}, {"C", "CD", "D", "CM"}};

    public String convertir(int numero, int r, String romano) {
        String f = Math.pow(10, r) + "";
        int rb = Integer.parseInt(f.substring(0, f.lastIndexOf(".")));
        int md;
        md = numero % (10 * rb);

        //JOptionPane.showMessageDialog(rootPane, "fundamental=" + rb + "---md="+ md + "---romano=" + romano + "---numero=" + numero + "---r=" + r+ "---mul=" + 10 * rb);
        if (numero > 0) {
            if (md >= (4 * rb) && md < (5 * rb)) {
                romano = simbolos[r][1] + romano;
            } else {
                if (md >= (9 * rb)) {
                    romano = simbolos[r][3] + romano;
                } else {
                    int u = numero % ((5 * rb));
                    if (u < 10) {
                        for (int i = 0; i < u; i++) {
                            romano = simbolos[r][0] + romano;
                        }
                    } else {
                       
    //JOptionPane.showMessageDialog(rootPane, "RB=" + rb + "---md="  + md + "---romano=" + romano + "---numero=" + numero + "---r=" + r + "---U=" + u + "---div(md / rb)=" + (md / rb));
                        for (int i = 0; i < (md / rb); i++) {
                            if(md==60||md==600)
                                i=i+2;
                            if(md==70||md==700)
                                i++;                                
                            romano = simbolos[r][0] + romano;
                            if (i > 1) {
                                i = (md / rb);
                            }
                        }
                    }
                    if (md >= (5 * rb)) {
                        romano = simbolos[r][2] + romano;
                    }
                }
            }
            numero -= md;
            r++;
            //JOptionPane.showMessageDialog(rootPane, "fundamental=" + rb + "---md="  + md + "---romano=" + romano + "---numero=" + numero + "---r=" + r + "---mul=" + 10 * rb);
            return convertir(numero, r, romano);
        };
        return romano;
    }
}
