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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
        setTitle("Computadoras");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int lastNumber=5;
        this.m= new Main( lastNumber);
         SpinnerNumberModel modeloSpinner1 = new SpinnerNumberModel(12 + lastNumber, 12 + lastNumber, 12 + 9, 1);
         SpinnerNumberModel modeloSpinner2 = new SpinnerNumberModel(12 + lastNumber, 12 + lastNumber, 12 + 9, 1);
        SpinnerNumberModel modeloSpinner3  = new SpinnerNumberModel(12 + lastNumber, 12 + lastNumber, 12 + 9, 1);
        SpinnerNumberModel modeloSpinner4 = new SpinnerNumberModel(12 + lastNumber, 12 + lastNumber, 12 + 9, 1);
        SpinnerNumberModel modeloSpinner5  = new SpinnerNumberModel(12 + lastNumber, 12 + lastNumber, 12 + 9, 1);
        SpinnerNumberModel modeloSpinner6  = new SpinnerNumberModel(12 + lastNumber, 12 + lastNumber, 12 + 9, 1);
        SpinnerNumberModel modeloSpinner7 = new SpinnerNumberModel(12 + lastNumber, 12 + lastNumber, 12 + 9, 1);
        SpinnerNumberModel modeloSpinner8  = new SpinnerNumberModel(12 + lastNumber, 12 + lastNumber, 12 + 9, 1);
        SpinnerNumberModel modeloSpinner9 = new SpinnerNumberModel(12 + lastNumber, 12 + lastNumber, 12 + 9, 1);
        SpinnerNumberModel modeloSpinner10 = new SpinnerNumberModel(12 + lastNumber, 12 + lastNumber, 12 + 9, 1);
        SpinnerNumberModel modeloSpinner11 = new SpinnerNumberModel(1, 1, 100, 1);
        SpinnerNumberModel modeloSpinner12 = new SpinnerNumberModel(1, 1, 100, 1);
        SpinnerNumberModel modeloSpinner13  = new SpinnerNumberModel(12 + lastNumber, 12 + lastNumber, 12 + 9, 1);
        SpinnerNumberModel modeloSpinner14 = new SpinnerNumberModel(12 + lastNumber, 12 + lastNumber, 12 + 9, 1);
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
           JLabel lblTarjetas1;
         JLabel lblPlacaBase1;
         JLabel lblCPUs1;
         JLabel lblRAM1;
         JLabel lblFuenteAlimentacion1;
         JLabel lblEarnings1;
         JLabel lblCosts1;
         JLabel lblTotalProfit1;
         JLabel lblDaysLeft1;
         boolean click=false;
         JLabel status2;
         
         
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

        JLabel lblProductionParts = new JLabel("PARTES EN PRODUCCION");
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

        lblEarnings = new JLabel("GANANCIAS: 0");
        lblEarnings.setForeground(Color.white);

        lblCosts = new JLabel("COSTOS: 0");
        lblCosts.setForeground(Color.white);

        lblTotalProfit = new JLabel("TOTAL DE GANANCIAS: 0");
        lblTotalProfit.setFont(new Font("Arial", Font.BOLD, 18));
        lblTotalProfit.setForeground(lightGreen);

        lblDaysLeft = new JLabel("QUEDAN DIAS: 0");
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
     
         status2 = new JLabel("Status: Nothing");
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
                    (int) InputHP6.getValue(),
                    (int)InputDaysDelivery.getValue()
                );
                click=true;

                // Desactivar el MouseListener después del primer clic
                System.out.print("Entro");
                panel.removeMouseListener(this);
            }
        });
        final int[] valoresAnteriores = {
    (int) InputHP1.getValue(),
    (int) InputHP2.getValue(),
    (int) InputHP3.getValue(),
    (int) InputHP4.getValue(),
    (int) InputHP6.getValue()
};

// Función para manejar cambios en los JSpinner
ChangeListener changeListener = new ChangeListener() {
    @Override
    public void stateChanged(ChangeEvent e) {
        if (click){
        JSpinner source = (JSpinner) e.getSource();
        int valorActual = (int) source.getValue();
        int indice = -1;
        String x;
        // Identificar cuál JSpinner cambió
        if (source == InputHP1) {
             x="Placa";
            indice = 0;
        } else if (source == InputHP2) {
             x="Ram";
            indice = 1;
        } else if (source == InputHP3) {
            x="Fuente";
            indice = 2;
        } else if (source == InputHP4) {
             x="CPU";
            indice = 3;
        } else if (source == InputHP6) {
             x="Tarjeta";
            indice = 4;
        }
        else{
        x="";
        }

        // Comparar el valor actual con el valor anterior
        if (indice != -1) {
            if (valorActual > valoresAnteriores[indice]) {
                System.out.println(); System.out.println(); System.out.println(); System.out.println(); System.out.println();
                System.out.println("El valor de InputHP" + (indice + 1) + " ha aumentado de " + valoresAnteriores[indice] + " a " + valorActual);
                               System.out.println();
                                System.out.println();
                                 System.out.println(); System.out.println();
                                  System.out.println();
                System.out.println("El valor de InputHP" + (indice + 1) + " ha aumentado de " + valoresAnteriores[indice] + " a " + valorActual);
                m.setaddHP(x);
            } else if (valorActual < valoresAnteriores[indice]) {
                System.out.println("El valor de InputHP" + (indice + 1) + " ha disminuido de " + valoresAnteriores[indice] + " a " + valorActual);
                m.setdeleteHP(x);
            }

            // Actualizar el valor anterior
            valoresAnteriores[indice] = valorActual;
        }}
    }
};

// Agregar el ChangeListener a cada JSpinner
InputHP1.addChangeListener(changeListener);
InputHP2.addChangeListener(changeListener);
InputHP3.addChangeListener(changeListener);
InputHP4.addChangeListener(changeListener);
InputHP6.addChangeListener(changeListener);
        return panel;
    }

JLabel status22;

    // Métodos para actualizar dinámicamente los valores
    public void PM(boolean t) {
        if(t==true){
        status2.setText("Status: Viendo anime");
        }
        else{
        status2.setText("Status: Trabjando");
        
        }
        
    }
    public void PM1(boolean t) {
        if(t){
        status22.setText("Status: Viendo anime");
        }
        else{
        status22.setText("Status: Viendo anime");
        
        }
        
    }

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
    int ganancias = 0;
    public void updateEarnings(int earnings) {
        lblEarnings.setText("GANANCIAS: " + earnings);
        this.ganancias=earnings;
    }

    public void updateCosts(int costs) {
         int cpu= (int) InputHP4.getValue() *26*costs;
        int fuente= (int) InputHP3.getValue() * 16*costs;
        int placa= (int) InputHP1.getValue()*20*costs;
        int ram =   (int) InputHP2.getValue() *40*costs;
        int tarjeta = (int) InputHP6.getValue()*34*costs;
        int total = cpu+fuente+placa+ram+tarjeta;
        lblCosts.setText("COSTOS: " + total);
        this.updateTotalProfit(this.ganancias-total);
    }

    public void updateTotalProfit(int profit) {
        lblTotalProfit.setText("TOTAL DE GANANCIAS: " + profit);
    }

    public void updateDaysLeft(int daysLeft) {
        lblDaysLeft.setText("QUEDAN DIAS: " + daysLeft);
    }

    public void updateTarjetas1(int current, int total) {
        lblTarjetas1.setText("Tarjetas: " + current + " / " + total);
    }

    public void updatePlacaBase1(int current, int total) {
        lblPlacaBase1.setText("Placa base: " + current + " / " + total);
    }

    public void updateCPUs1(int current, int total) {
        lblCPUs1.setText("CPUs: " + current + " / " + total);
    }

    public void updateRAM1(int current, int total) {
        lblRAM1.setText("Memoria RAM: " + current + " / " + total);
    }

    public void updateFuenteAlimentacion1(int current, int total) {
        lblFuenteAlimentacion1.setText("Fuente de alimentación: " + current + " / " + total);
    }
    int ganancias1 = 0;
    public void updateEarnings1(int earnings) {
        lblEarnings1.setText("GANANCIAS: " + earnings);
        this.ganancias1=earnings;
    }

    public void updateCosts1(int costs) {
        int cpu= (int) InputMSI4.getValue() *26*costs;
        int fuente= (int) InputMSI3.getValue() * 16*costs;
        int placa= (int) InputMSI1.getValue()*20*costs;
        int ram =   (int) InputMSI2.getValue() *40*costs;
        int tarjeta = (int) InputMSI6.getValue()*34*costs;
        int total = cpu+fuente+placa+ram+tarjeta;
        lblCosts1.setText("COSTOS: " + total);
        this.updateTotalProfit1(this.ganancias1-total);
    }

    public void updateTotalProfit1(int profit) {
        lblTotalProfit1.setText("TOTAL  DE GANANCIAS: " + profit);
    }

    public void updateDaysLeft1(int daysLeft) {
        lblDaysLeft1.setText("QUEDAN DIAS: " + daysLeft);
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

        JLabel lblProductionParts = new JLabel("PARTES EN PRODUCCION");
        lblProductionParts.setFont(new Font("Arial", Font.BOLD, 24));
        lblProductionParts.setForeground(lightGreen);

        // Secciones de "Componentes"
        lblTarjetas1 = new JLabel("Tarjetas: 0 / 35");
        lblTarjetas1.setForeground(Color.white);

        lblPlacaBase1 = new JLabel("Placa base: 0 / 25");
        lblPlacaBase1.setForeground(Color.white);

        lblCPUs1 = new JLabel("CPUs: 0 / 20");
        lblCPUs1.setForeground(Color.white);

        lblRAM1 = new JLabel("Memoria RAM: 0 / 55");
        lblRAM1.setForeground(Color.white);

        lblFuenteAlimentacion1 = new JLabel("Fuente de alimentación: 0 / 55");
        lblFuenteAlimentacion1.setForeground(Color.white);

        lblEarnings1 = new JLabel("GANANCIAS: 0");
        lblEarnings1.setForeground(Color.white);

        lblCosts1 = new JLabel("COSTOS: 0");
        lblCosts1.setForeground(Color.white);

        lblTotalProfit1 = new JLabel("TOTAL DE GANANCIAS: 0");
        lblTotalProfit1.setFont(new Font("Arial", Font.BOLD, 18));
        lblTotalProfit1.setForeground(lightGreen);

        lblDaysLeft1 = new JLabel("QUEDAN DIAS: 0");
        lblDaysLeft1.setForeground(lightGreen);

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
     
        status22 = new JLabel("Status: Nothing");
        status22.setForeground(Color.white);
        innerPanel.add(status22, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        innerPanel.add(lblProductionParts, gbc);

        // Section for Production Parts
        gbc.gridy++;
        gbc.gridwidth = 1;
        innerPanel.add(lblTarjetas1, gbc);
        gbc.gridy++;
        innerPanel.add(lblPlacaBase1, gbc);
        gbc.gridy++;
        innerPanel.add(lblCPUs1, gbc);
        gbc.gridy++;
        innerPanel.add(lblRAM1, gbc);
        gbc.gridy++;
        innerPanel.add(lblFuenteAlimentacion1, gbc);

        // Earnings, Costs, and Total Profit
        gbc.gridy++;
        innerPanel.add(lblEarnings1, gbc);
        gbc.gridy++;
        innerPanel.add(lblCosts1, gbc);

        // Total profit
        gbc.gridy = 1;
        gbc.gridx = 2;
        innerPanel.add(lblTotalProfit1, gbc);

        // Days left
        gbc.gridy++;
        innerPanel.add(lblDaysLeft1, gbc);

        // Agregar el panel al BorderLayout
        panel.add(innerPanel, BorderLayout.CENTER);
        
         panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Llamada a setHP cuando se hace clic en el panel
                click=true;
                m.setHMSI(
                    prueba.this, // Usar 'this' para referirse a la instancia del JFrame
                    (int) InputMSI4.getValue(),
                    (int) InputMSI3.getValue(),
                    (int) InputMSI1.getValue(),
                    (int) InputMSI2.getValue(),
                    (int) InputMSI6.getValue(),
                      (int)InputDaysDelivery.getValue()
                );

                // Desactivar el MouseListener después del primer clic
                System.out.print("Entro");
                panel.removeMouseListener(this);
            }
        });
//      this.m.setHMSI(this,(int) InputMSI4.getValue(),(int) InputMSI3.getValue(),(int) InputMSI1.getValue(),(int) InputMSI2.getValue(),(int) InputMSI6.getValue());
       final int[] valoresAnteriores = {
    (int) InputMSI1.getValue(),
    (int) InputMSI2.getValue(),
    (int) InputMSI3.getValue(),
    (int) InputMSI4.getValue(),
    (int) InputMSI6.getValue()
};

// Función para manejar cambios en los JSpinner
ChangeListener changeListener = new ChangeListener() {
    @Override
    public void stateChanged(ChangeEvent e) {
        if (click){
        JSpinner source = (JSpinner) e.getSource();
        int valorActual = (int) source.getValue();
        int indice = -1;
        String x;
        // Identificar cuál JSpinner cambió
        if (source == InputMSI1) {
             x="Placa";
            indice = 0;
        } else if (source == InputMSI2) {
             x="Ram";
            indice = 1;
        } else if (source == InputMSI3) {
            x="Fuente";
            indice = 2;
        } else if (source == InputMSI4) {
             x="CPU";
            indice = 3;
        } else if (source == InputMSI6) {
             x="Tarjeta";
            indice = 4;
        }
        else{
        x="";
        }

        // Comparar el valor actual con el valor anterior
        if (indice != -1) {
            if (valorActual > valoresAnteriores[indice]) {
                
                 System.out.println(); System.out.println(); System.out.println(); System.out.println(); System.out.println();
                System.out.println("El valor de InputHP" + (indice + 1) + " ha aumentado de " + valoresAnteriores[indice] + " a " + valorActual);
                               System.out.println();
                                System.out.println();
                                 System.out.println(); System.out.println();
                                  System.out.println();
                                   System.out.println();
                                 
                m.setaddMSI(x);
            } else if (valorActual < valoresAnteriores[indice]) {
                System.out.println("El valor de InputHP" + (indice + 1) + " ha disminuido de " + valoresAnteriores[indice] + " a " + valorActual);
                m.setdeleteMSI(x);
            }

            // Actualizar el valor anterior
            valoresAnteriores[indice] = valorActual;
        }}
    }
};

// Agregar el ChangeListener a cada JSpinner
InputHP1.addChangeListener(changeListener);
InputHP2.addChangeListener(changeListener);
InputHP3.addChangeListener(changeListener);
InputHP4.addChangeListener(changeListener);
InputHP6.addChangeListener(changeListener);
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
