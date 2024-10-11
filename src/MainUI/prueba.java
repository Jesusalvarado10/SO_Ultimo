/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainUI;

import Class.Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Indatech
 */
public class prueba extends javax.swing.JFrame {
    private JSpinner InputMSI1, InputMSI2, InputMSI3, InputMSI4, InputMSI5, InputMSI6;
    private JSpinner InputHP1, InputHP2, InputHP3, InputHP4, InputHP5 , InputHP6;
    private JSpinner InputDay,InputDaysDelivery ;
    boolean setData=false;
    /**
     * Creates new form prueba
     */
  private JTabbedPane tabbedPane;
    private JPanel configPanel, HPPanel, MSIPanel, statisticsPanel;
    Main m;
    public prueba() {
        setTitle("Animation Studio");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int lastNumber=5;
        this.m= new Main( lastNumber);
         SpinnerNumberModel modeloSpinner1 = new SpinnerNumberModel(1, 1, 12 + lastNumber, 1);
        SpinnerNumberModel modeloSpinner2 = new SpinnerNumberModel(1, 1, 12 + lastNumber, 1);
        SpinnerNumberModel modeloSpinner3 = new SpinnerNumberModel(1, 1, 12 + lastNumber, 1);
        SpinnerNumberModel modeloSpinner4 = new SpinnerNumberModel(1, 1, 12 + lastNumber, 1);
        SpinnerNumberModel modeloSpinner5 = new SpinnerNumberModel(1, 1, 12 + lastNumber, 1);
        SpinnerNumberModel modeloSpinner6 = new SpinnerNumberModel(1, 1, 12 + lastNumber, 1);
        SpinnerNumberModel modeloSpinner7 = new SpinnerNumberModel(1, 1, 12 + lastNumber, 1);
        SpinnerNumberModel modeloSpinner8 = new SpinnerNumberModel(1, 1, 12 + lastNumber, 1);
        SpinnerNumberModel modeloSpinner9 = new SpinnerNumberModel(1, 1, 12 + lastNumber, 1);
        SpinnerNumberModel modeloSpinner10 = new SpinnerNumberModel(1, 1, 12 + lastNumber, 1);
        SpinnerNumberModel modeloSpinner11 = new SpinnerNumberModel(1, 1, 100, 1);
        SpinnerNumberModel modeloSpinner12 = new SpinnerNumberModel(1, 1, 100, 1);
        SpinnerNumberModel modeloSpinner13 = new SpinnerNumberModel(1, 1, 12 + lastNumber, 1);
        SpinnerNumberModel modeloSpinner14 = new SpinnerNumberModel(1, 1, 12 + lastNumber, 1);
        InputMSI1 = new JSpinner(modeloSpinner1);
        InputMSI2 = new JSpinner(modeloSpinner2);
        InputMSI3 = new JSpinner(modeloSpinner3);
        InputMSI4 = new JSpinner(modeloSpinner4);
        InputMSI5 = new JSpinner(modeloSpinner5);
        InputMSI6 = new JSpinner(modeloSpinner13);
        InputHP1 = new JSpinner(modeloSpinner6);
        InputHP2 = new JSpinner(modeloSpinner7);
        InputHP3 = new JSpinner(modeloSpinner8);
        InputHP4 = new JSpinner(modeloSpinner9);
        InputHP5 = new JSpinner(modeloSpinner10);
        InputHP6 = new JSpinner(modeloSpinner14);
        InputDay= new  JSpinner(modeloSpinner11);
        InputDaysDelivery= new  JSpinner(modeloSpinner12);
        tabbedPane = new JTabbedPane();
        
        configPanel = createConfigPanel();
        MSIPanel=createMSIPanel();
        statisticsPanel = createStatisticsPanel();
        HPPanel = createHPPanel();
        tabbedPane.addTab("Configuration", configPanel);
        tabbedPane.addTab("HP", HPPanel);
        tabbedPane.addTab("MSI", MSIPanel);
        tabbedPane.addTab("Statistics", statisticsPanel);
     

        add(tabbedPane);
    }

public JPanel createConfigPanel() {
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10); // Espaciado entre componentes
    gbc.fill = GridBagConstraints.HORIZONTAL;

    // Establecer el fondo y la fuente
    panel.setBackground(Color.DARK_GRAY);

    // Crear etiquetas con estilo personalizado
    JLabel lblConfiguration = new JLabel("CONFIGURATION");
    lblConfiguration.setFont(new Font("Arial", Font.BOLD, 24));
    lblConfiguration.setForeground(Color.YELLOW);


    JLabel lblMSI = new JLabel("MSI");
    lblMSI.setFont(new Font("Arial", Font.BOLD, 24));
    lblMSI.setForeground(Color.WHITE);

    JLabel lblHP = new JLabel("HP");
    lblHP.setFont(new Font("Arial", Font.BOLD, 24));
    lblHP.setForeground(Color.WHITE);
    JLabel lblGeneral = new JLabel("General");
    lblGeneral.setFont(new Font("Arial", Font.BOLD, 24));
    lblGeneral.setForeground(Color.WHITE);

   JLabel lblEnsambladores = new JLabel("Ensambladores");
    lblEnsambladores.setForeground(Color.WHITE);
    JLabel lblPlacas = new JLabel("Placa base");
    lblPlacas.setForeground(Color.WHITE);
    JLabel lblRAM = new JLabel("Memoria RAM");
    lblRAM.setForeground(Color.WHITE);
    JLabel lblFuentes = new JLabel("Fuente de alimentación");
    lblFuentes.setForeground(Color.WHITE);
    JLabel lblCPUs = new JLabel("CPUs");
    lblCPUs.setForeground(Color.WHITE);
    JLabel lblEnsambladores1 = new JLabel("Ensambladores");
    lblEnsambladores1.setForeground(Color.WHITE);
    JLabel lblTarjeta = new JLabel("Tarjeta");
    lblTarjeta.setForeground(Color.WHITE);
    JLabel lblTarjeta1 = new JLabel("Tarjeta");
    lblTarjeta1.setForeground(Color.WHITE);
    JLabel lblPlacas1 = new JLabel("Placa base");
    lblPlacas1.setForeground(Color.WHITE);
    JLabel lblRAM1 = new JLabel("Memoria RAM");
    lblRAM1.setForeground(Color.WHITE);
    JLabel lblFuentes1 = new JLabel("Fuente de alimentación");
    lblFuentes1.setForeground(Color.WHITE);
    JLabel lblCPUs1 = new JLabel("CPUs");
    lblCPUs1.setForeground(Color.WHITE);
     JLabel lblDaysCount = new JLabel("Cuantos dias durara la simulacion");
    lblDaysCount.setForeground(Color.WHITE);
    JLabel lblDaysCountDelivery = new JLabel("Cuantos dias para hacer la entrega");
    lblDaysCountDelivery.setForeground(Color.WHITE);

    // Posicionar las etiquetas principales
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 3;
    gbc.anchor = GridBagConstraints.CENTER;
    panel.add(lblConfiguration, gbc);

    gbc.gridwidth = 1;
    gbc.gridx = 0;
    gbc.gridy = 1;

    // Sección de MSI
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.WEST;
    panel.add(lblMSI, gbc);

    gbc.gridy++;
    panel.add(lblPlacas, gbc);
    gbc.gridx++;
    panel.add(InputMSI1, gbc);

    gbc.gridx = 0;
    gbc.gridy++;
    panel.add(lblRAM, gbc);
    gbc.gridx++;
    panel.add(InputMSI2, gbc);

    gbc.gridx = 0;
    gbc.gridy++;
    panel.add(lblFuentes, gbc);
    gbc.gridx++;
    panel.add(InputMSI3, gbc);

    gbc.gridx = 0;
    gbc.gridy++;
    panel.add(lblCPUs, gbc);
    gbc.gridx++;
    panel.add(InputMSI4, gbc);

    gbc.gridx = 0;
    gbc.gridy++;
    panel.add(lblEnsambladores, gbc);
    gbc.gridx++;
    panel.add(InputMSI5, gbc);
    gbc.gridx = 0;
    gbc.gridy++;
    panel.add(lblTarjeta,gbc);
    gbc.gridx++;
    panel.add(InputMSI6, gbc);
    // Siguiente fila para separar las secciones
    gbc.gridx = 0;
    gbc.gridy++;
    gbc.gridwidth = 1;
    gbc.anchor = GridBagConstraints.WEST;

    // Sección de HP
    gbc.gridx = 2;
    gbc.gridy = 1;
    panel.add(lblHP, gbc);

    gbc.gridy++;
    panel.add(InputHP1, gbc); 
    gbc.gridx++;
    
    panel.add(lblPlacas1, gbc);

    gbc.gridx = 2;
    gbc.gridy++;
        panel.add(InputHP2, gbc);
    gbc.gridx++;
  
      panel.add(lblRAM1, gbc);

    gbc.gridx = 2;
    gbc.gridy++;
            panel.add(InputHP3, gbc);
    gbc.gridx++;

    panel.add(lblFuentes1, gbc);

    gbc.gridx = 2;
    gbc.gridy++;
  
    panel.add(InputHP4, gbc);
    gbc.gridx++;
      panel.add(lblCPUs1, gbc);

    gbc.gridx = 2;
    gbc.gridy++;
       panel.add(InputHP5, gbc);
   
    gbc.gridx++;
  panel.add(lblEnsambladores1, gbc); 
  gbc.gridx = 2;
    gbc.gridy++;
    panel.add(this.InputHP6,gbc);
    gbc.gridx++;
    panel.add(lblTarjeta1,gbc);


    gbc.gridx=6;
    gbc.gridy=0;
    panel.add(lblGeneral,gbc);
    gbc.gridx=6;
    gbc.gridy++;
    
    panel.add(lblDaysCount,gbc);
    gbc.gridy++;
    panel.add(InputDay,gbc);
     gbc.gridy++;
    panel.add(lblDaysCountDelivery,gbc);
    gbc.gridy++;
    panel.add(InputDaysDelivery,gbc);
    

    gbc.gridx = 0;
    gbc.gridy=9;
    gbc.gridwidth = 3;
    gbc.anchor = GridBagConstraints.CENTER;
    JButton btnSetConfig = new JButton("Iniciar");
    btnSetConfig.setBackground(Color.YELLOW);
    btnSetConfig.setForeground(Color.BLACK);
    btnSetConfig.setFont(new Font("Arial", Font.BOLD, 14));
    panel.add(btnSetConfig, gbc);
    btnSetConfig.addActionListener(e -> {
        System.out.println(this.InputHP1.getValue());
        System.out.println(this.InputHP2.getValue());
        System.out.println(this.InputHP3.getValue());
        System.out.println(this.InputHP4.getValue());
        System.out.println(this.InputHP5.getValue());
        
 
      

    // Cambiar el valor de Ensambladores a 5 por ejemplo
      
});
    
    

    return panel;
}



        JLabel lblTarjetas;
         JLabel lblPlacaBase;
         JLabel lblCPUs;
         JLabel lblRAM;
         JLabel lblFuenteAlimentacion;
         JLabel lblEarnings;
         JLabel lblCosts;
         JLabel lblTotalProfit;
         JLabel lblDaysLeft;
         
 public JPanel createHPPanel() {
        
  
      
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.DARK_GRAY);

        // Crear el panel principal y el layout para acomodar los componentes
        JPanel innerPanel = new JPanel(new GridBagLayout());
        innerPanel.setBackground(Color.DARK_GRAY);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaciado entre componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Verde claro
        Color lightGreen = new Color(144, 238, 144);

        // Títulos principales
        JLabel lblHP = new JLabel("HP");
        lblHP.setFont(new Font("Arial", Font.BOLD, 32));
        lblHP.setForeground(Color.GREEN);

        JLabel lblDirector = new JLabel("DIRECTOR");
        lblDirector.setFont(new Font("Arial", Font.BOLD, 24));
        lblDirector.setForeground(lightGreen);

        JLabel lblProjectManager = new JLabel("PROJECT MANAGER");
        lblProjectManager.setFont(new Font("Arial", Font.BOLD, 24));
        lblProjectManager.setForeground(lightGreen);

        JLabel lblProductionParts = new JLabel("PRODUCTION PARTS");
        lblProductionParts.setFont(new Font("Arial", Font.BOLD, 24));
        lblProductionParts.setForeground(lightGreen);

        // Secciones de "Componentes"
        lblTarjetas = new JLabel("Tarjetas: 0 / 35");
        lblTarjetas.setForeground(Color.white);

        lblPlacaBase = new JLabel("Placa base: 0 / 25");
        lblPlacaBase.setForeground(Color.white);

        lblCPUs = new JLabel("CPUs: 0 / 20");
        lblCPUs.setForeground(Color.white);

        lblRAM = new JLabel("Memoria RAM: 0 / 55");
        lblRAM.setForeground(Color.white);

        lblFuenteAlimentacion = new JLabel("Fuente de alimentación: 0 / 55");
        lblFuenteAlimentacion.setForeground(Color.white);

        lblEarnings = new JLabel("Earnings: 0");
        lblEarnings.setForeground(Color.white);

        lblCosts = new JLabel("Costs: 0");
        lblCosts.setForeground(Color.white);

        lblTotalProfit = new JLabel("TOTAL PROFIT: 0");
        lblTotalProfit.setFont(new Font("Arial", Font.BOLD, 18));
        lblTotalProfit.setForeground(lightGreen);

        lblDaysLeft = new JLabel("DAYS LEFT: 0");
        lblDaysLeft.setForeground(lightGreen);

        // Agregar los componentes usando GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        innerPanel.add(lblHP, gbc);

        gbc.gridy++;
        innerPanel.add(lblDirector, gbc);

        gbc.gridy++;
        gbc.gridwidth = 1;
        JLabel status = new JLabel("Status: Working");
        status.setForeground(Color.white);
        innerPanel.add(status, gbc);
        gbc.gridy--;
        gbc.gridx++;
        innerPanel.add(lblProjectManager, gbc);

        gbc.gridy++;
     
        JLabel status2 = new JLabel("Status: Nothing");
        status2.setForeground(Color.white);
        innerPanel.add(status2, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        innerPanel.add(lblProductionParts, gbc);

        // Section for Production Parts
        gbc.gridy++;
        gbc.gridwidth = 1;
        innerPanel.add(lblTarjetas, gbc);
        gbc.gridy++;
        innerPanel.add(lblPlacaBase, gbc);
        gbc.gridy++;
        innerPanel.add(lblCPUs, gbc);
        gbc.gridy++;
        innerPanel.add(lblRAM, gbc);
        gbc.gridy++;
        innerPanel.add(lblFuenteAlimentacion, gbc);

        // Earnings, Costs, and Total Profit
        gbc.gridy++;
        innerPanel.add(lblEarnings, gbc);
        gbc.gridy++;
        innerPanel.add(lblCosts, gbc);

        // Total profit
        gbc.gridy = 1;
        gbc.gridx = 2;
        innerPanel.add(lblTotalProfit, gbc);

        // Days left
        gbc.gridy++;
        innerPanel.add(lblDaysLeft, gbc);

        // Agregar el panel al BorderLayout
        panel.add(innerPanel, BorderLayout.CENTER);
        
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Llamada a setHP cuando se hace clic en el panel
                m.setHP(
                    prueba.this, // Usar 'this' para referirse a la instancia del JFrame
                    (int) InputHP4.getValue(),
                    (int) InputHP3.getValue(),
                    (int) InputHP1.getValue(),
                    (int) InputHP2.getValue(),
                    (int) InputHP6.getValue()
                );

                // Desactivar el MouseListener después del primer clic
                System.out.print("Entro");
                panel.removeMouseListener(this);
            }
        });
        return panel;
    }



    // Métodos para actualizar dinámicamente los valores
    public void updateTarjetas(int current, int total) {
        lblTarjetas.setText("Tarjetas: " + current + " / " + total);
    }

    public void updatePlacaBase(int current, int total) {
        lblPlacaBase.setText("Placa base: " + current + " / " + total);
    }

    public void updateCPUs(int current, int total) {
        lblCPUs.setText("CPUs: " + current + " / " + total);
    }

    public void updateRAM(int current, int total) {
        lblRAM.setText("Memoria RAM: " + current + " / " + total);
    }

    public void updateFuenteAlimentacion(int current, int total) {
        lblFuenteAlimentacion.setText("Fuente de alimentación: " + current + " / " + total);
    }

    public void updateEarnings(int earnings) {
        lblEarnings.setText("Earnings: " + earnings);
    }

    public void updateCosts(int costs) {
        lblCosts.setText("Costs: " + costs);
    }

    public void updateTotalProfit(int profit) {
        lblTotalProfit.setText("TOTAL PROFIT: " + profit);
    }

    public void updateDaysLeft(int daysLeft) {
        lblDaysLeft.setText("DAYS LEFT: " + daysLeft);
    }



    private JPanel createMSIPanel() {
    
       JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.DARK_GRAY);

        // Crear el panel principal y el layout para acomodar los componentes
        JPanel innerPanel = new JPanel(new GridBagLayout());
        innerPanel.setBackground(Color.DARK_GRAY);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaciado entre componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Verde claro
        Color lightGreen = new Color(144, 238, 144);

        // Títulos principales
        JLabel lblHP = new JLabel("MSI");
        lblHP.setFont(new Font("Arial", Font.BOLD, 32));
        lblHP.setForeground(Color.GREEN);

        JLabel lblDirector = new JLabel("DIRECTOR");
        lblDirector.setFont(new Font("Arial", Font.BOLD, 24));
        lblDirector.setForeground(lightGreen);

        JLabel lblProjectManager = new JLabel("PROJECT MANAGER");
        lblProjectManager.setFont(new Font("Arial", Font.BOLD, 24));
        lblProjectManager.setForeground(lightGreen);

        JLabel lblProductionParts = new JLabel("PRODUCTION PARTS");
        lblProductionParts.setFont(new Font("Arial", Font.BOLD, 24));
        lblProductionParts.setForeground(lightGreen);

        // Secciones de "Componentes"
        lblTarjetas = new JLabel("Tarjetas: 0 / 35");
        lblTarjetas.setForeground(Color.white);

        lblPlacaBase = new JLabel("Placa base: 0 / 25");
        lblPlacaBase.setForeground(Color.white);

        lblCPUs = new JLabel("CPUs: 0 / 20");
        lblCPUs.setForeground(Color.white);

        lblRAM = new JLabel("Memoria RAM: 0 / 55");
        lblRAM.setForeground(Color.white);

        lblFuenteAlimentacion = new JLabel("Fuente de alimentación: 0 / 55");
        lblFuenteAlimentacion.setForeground(Color.white);

        lblEarnings = new JLabel("Earnings: 0");
        lblEarnings.setForeground(Color.white);

        lblCosts = new JLabel("Costs: 0");
        lblCosts.setForeground(Color.white);

        lblTotalProfit = new JLabel("TOTAL PROFIT: 0");
        lblTotalProfit.setFont(new Font("Arial", Font.BOLD, 18));
        lblTotalProfit.setForeground(lightGreen);

        lblDaysLeft = new JLabel("DAYS LEFT: 0");
        lblDaysLeft.setForeground(lightGreen);

        // Agregar los componentes usando GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        innerPanel.add(lblHP, gbc);

        gbc.gridy++;
        innerPanel.add(lblDirector, gbc);

        gbc.gridy++;
        gbc.gridwidth = 1;
        JLabel status = new JLabel("Status: Working");
        status.setForeground(Color.white);
        innerPanel.add(status, gbc);
        gbc.gridy--;
        gbc.gridx++;
        innerPanel.add(lblProjectManager, gbc);

        gbc.gridy++;
     
        JLabel status2 = new JLabel("Status: Nothing");
        status2.setForeground(Color.white);
        innerPanel.add(status2, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        innerPanel.add(lblProductionParts, gbc);

        // Section for Production Parts
        gbc.gridy++;
        gbc.gridwidth = 1;
        innerPanel.add(lblTarjetas, gbc);
        gbc.gridy++;
        innerPanel.add(lblPlacaBase, gbc);
        gbc.gridy++;
        innerPanel.add(lblCPUs, gbc);
        gbc.gridy++;
        innerPanel.add(lblRAM, gbc);
        gbc.gridy++;
        innerPanel.add(lblFuenteAlimentacion, gbc);

        // Earnings, Costs, and Total Profit
        gbc.gridy++;
        innerPanel.add(lblEarnings, gbc);
        gbc.gridy++;
        innerPanel.add(lblCosts, gbc);

        // Total profit
        gbc.gridy = 1;
        gbc.gridx = 2;
        innerPanel.add(lblTotalProfit, gbc);

        // Days left
        gbc.gridy++;
        innerPanel.add(lblDaysLeft, gbc);

        // Agregar el panel al BorderLayout
        panel.add(innerPanel, BorderLayout.CENTER);
//      this.m.setHMSI(this,(int) InputMSI4.getValue(),(int) InputMSI3.getValue(),(int) InputMSI1.getValue(),(int) InputMSI2.getValue(),(int) InputMSI6.getValue());
        return panel;
    }

    private JPanel createStatisticsPanel() {
        if(!this.setData==false){
        return null;
        }
        JPanel panel = new JPanel(new BorderLayout());
        // Add components for the Statistics tab
        return panel;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
