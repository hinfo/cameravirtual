package cameravirtual;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;

public class Principal extends javax.swing.JFrame {

    int windowmin = -1;
    int windowmax = 1;
    int viewportmin = 0;
    int viewportmax = 400;
    SpinnerNumberModel spinnerModel;

    float tx, ty, tz;
    float ctx, cty, ctz;
    float sx, sy, sz;
    float rx, ry, rz;
    float crx, cry, crz;
    float vertice;
    Matrix4f matriz_projecao_vp1;
    Matrix4f matriz_modelo_camera, matriz_modelo_cubo;
    Matrix4f matriz_visualizacao_camera, matriz_visualizacao_camera2;
    DecimalFormat df;

    public Principal() {
        spinnerModel = new SpinnerNumberModel(0.1, 0.0, 100.0, 0.1);
        initComponents();
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
        otherSymbols.setDecimalSeparator('.');
        otherSymbols.setGroupingSeparator('.');
        df = new DecimalFormat("#0.00", otherSymbols);
        atualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroupOrdem = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpCuboTx = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jSpCuboTy = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jSpCuboTz = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTFCuboTx03 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTFCuboTy13 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTFCuboTz23 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jSpCuboSx = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        jSpCuboSy = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        jSpCuboSz = new javax.swing.JSpinner();
        jPanel23 = new javax.swing.JPanel();
        jTFCuboSx00 = new javax.swing.JTextField();
        jTextField146 = new javax.swing.JTextField();
        jTextField147 = new javax.swing.JTextField();
        jTextField148 = new javax.swing.JTextField();
        jTextField149 = new javax.swing.JTextField();
        jTFCuboSy11 = new javax.swing.JTextField();
        jTextField151 = new javax.swing.JTextField();
        jTextField152 = new javax.swing.JTextField();
        jTextField153 = new javax.swing.JTextField();
        jTextField154 = new javax.swing.JTextField();
        jTFCuboSz22 = new javax.swing.JTextField();
        jTextField156 = new javax.swing.JTextField();
        jTextField157 = new javax.swing.JTextField();
        jTextField158 = new javax.swing.JTextField();
        jTextField159 = new javax.swing.JTextField();
        jTextField160 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSpCuboRx = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jSpCuboRy = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        jSpCuboRz = new javax.swing.JSpinner();
        jPanel14 = new javax.swing.JPanel();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTFCuboRx11 = new javax.swing.JTextField();
        jTFCuboRx12 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTFCuboRx21 = new javax.swing.JTextField();
        jTFCuboRx22 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jTFCuboRy00 = new javax.swing.JTextField();
        jTextField114 = new javax.swing.JTextField();
        jTFCuboRy02 = new javax.swing.JTextField();
        jTextField116 = new javax.swing.JTextField();
        jTextField117 = new javax.swing.JTextField();
        jTextField118 = new javax.swing.JTextField();
        jTextField119 = new javax.swing.JTextField();
        jTextField120 = new javax.swing.JTextField();
        jTFCuboRy20 = new javax.swing.JTextField();
        jTextField122 = new javax.swing.JTextField();
        jTFCuboRy22 = new javax.swing.JTextField();
        jTextField124 = new javax.swing.JTextField();
        jTextField125 = new javax.swing.JTextField();
        jTextField126 = new javax.swing.JTextField();
        jTextField127 = new javax.swing.JTextField();
        jTextField128 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jTFCuboRz00 = new javax.swing.JTextField();
        jTFCuboRz01 = new javax.swing.JTextField();
        jTextField131 = new javax.swing.JTextField();
        jTextField132 = new javax.swing.JTextField();
        jTFCuboRz10 = new javax.swing.JTextField();
        jTFCuboRz11 = new javax.swing.JTextField();
        jTextField135 = new javax.swing.JTextField();
        jTextField136 = new javax.swing.JTextField();
        jTextField137 = new javax.swing.JTextField();
        jTextField138 = new javax.swing.JTextField();
        jTextField139 = new javax.swing.JTextField();
        jTextField140 = new javax.swing.JTextField();
        jTextField141 = new javax.swing.JTextField();
        jTextField142 = new javax.swing.JTextField();
        jTextField143 = new javax.swing.JTextField();
        jTextField144 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFTamanho = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpTx = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jSpTy = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        jSpTz = new javax.swing.JSpinner();
        jPanel25 = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTFCameraTx03 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTFCameraTx13 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTFCameraTx23 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jSpRx = new javax.swing.JSpinner();
        jLabel35 = new javax.swing.JLabel();
        jSpRy = new javax.swing.JSpinner();
        jLabel36 = new javax.swing.JLabel();
        jSpRz = new javax.swing.JSpinner();
        jPanel28 = new javax.swing.JPanel();
        jTextField161 = new javax.swing.JTextField();
        jTextField162 = new javax.swing.JTextField();
        jTextField163 = new javax.swing.JTextField();
        jTextField164 = new javax.swing.JTextField();
        jTextField165 = new javax.swing.JTextField();
        jTFCameraRx11 = new javax.swing.JTextField();
        jTFCameraRx12 = new javax.swing.JTextField();
        jTextField168 = new javax.swing.JTextField();
        jTextField169 = new javax.swing.JTextField();
        jTFCameraRx21 = new javax.swing.JTextField();
        jTFCameraRx22 = new javax.swing.JTextField();
        jTextField172 = new javax.swing.JTextField();
        jTextField173 = new javax.swing.JTextField();
        jTextField174 = new javax.swing.JTextField();
        jTextField175 = new javax.swing.JTextField();
        jTextField176 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jTFCameraRy00 = new javax.swing.JTextField();
        jTextField178 = new javax.swing.JTextField();
        jTFCameraRy02 = new javax.swing.JTextField();
        jTextField180 = new javax.swing.JTextField();
        jTextField181 = new javax.swing.JTextField();
        jTextField182 = new javax.swing.JTextField();
        jTextField183 = new javax.swing.JTextField();
        jTextField184 = new javax.swing.JTextField();
        jTFCameraRy20 = new javax.swing.JTextField();
        jTextField186 = new javax.swing.JTextField();
        jTFCameraRy22 = new javax.swing.JTextField();
        jTextField188 = new javax.swing.JTextField();
        jTextField189 = new javax.swing.JTextField();
        jTextField190 = new javax.swing.JTextField();
        jTextField191 = new javax.swing.JTextField();
        jTextField192 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jTFCameraRz00 = new javax.swing.JTextField();
        jTFCameraRz01 = new javax.swing.JTextField();
        jTextField195 = new javax.swing.JTextField();
        jTextField196 = new javax.swing.JTextField();
        jTFCameraRz10 = new javax.swing.JTextField();
        jTFCameraRz11 = new javax.swing.JTextField();
        jTextField199 = new javax.swing.JTextField();
        jTextField200 = new javax.swing.JTextField();
        jTextField201 = new javax.swing.JTextField();
        jTextField202 = new javax.swing.JTextField();
        jTextField203 = new javax.swing.JTextField();
        jTextField204 = new javax.swing.JTextField();
        jTextField205 = new javax.swing.JTextField();
        jTextField206 = new javax.swing.JTextField();
        jTextField207 = new javax.swing.JTextField();
        jTextField208 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jSpWinmin = new javax.swing.JSpinner();
        jLabel39 = new javax.swing.JLabel();
        jSpWinmax = new javax.swing.JSpinner();
        jLabel50 = new javax.swing.JLabel();
        jSpViewportmin = new javax.swing.JSpinner();
        jLabel51 = new javax.swing.JLabel();
        jSpViewportmax = new javax.swing.JSpinner();
        jPanel32 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jRBPerspectiva = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        jSPFov = new javax.swing.JSpinner();
        jSPPerZnear = new javax.swing.JSpinner();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jSPPerZfar = new javax.swing.JSpinner();
        jSPAspect = new javax.swing.JSpinner();
        jPanel35 = new javax.swing.JPanel();
        jRBParalela = new javax.swing.JRadioButton();
        jLabel44 = new javax.swing.JLabel();
        jSPLeft = new javax.swing.JSpinner();
        jLabel45 = new javax.swing.JLabel();
        jSPRight = new javax.swing.JSpinner();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jSPBottom = new javax.swing.JSpinner();
        jSPTop = new javax.swing.JSpinner();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jSPParZnear = new javax.swing.JSpinner();
        jSPParZfar = new javax.swing.JSpinner();
        jPanel38 = new javax.swing.JPanel();
        jTFProjecao00 = new javax.swing.JTextField();
        jTFProjecao01 = new javax.swing.JTextField();
        jTFProjecao02 = new javax.swing.JTextField();
        jTFProjecao03 = new javax.swing.JTextField();
        jTFProjecao10 = new javax.swing.JTextField();
        jTFProjecao11 = new javax.swing.JTextField();
        jTFProjecao12 = new javax.swing.JTextField();
        jTFProjecao13 = new javax.swing.JTextField();
        jTFProjecao20 = new javax.swing.JTextField();
        jTFProjecao21 = new javax.swing.JTextField();
        jTFProjecao22 = new javax.swing.JTextField();
        jTFProjecao23 = new javax.swing.JTextField();
        jTFProjecao30 = new javax.swing.JTextField();
        jTFProjecao31 = new javax.swing.JTextField();
        jTFProjecao32 = new javax.swing.JTextField();
        jTFProjecao33 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jTFTransfModel00 = new javax.swing.JTextField();
        jTFTransfModel01 = new javax.swing.JTextField();
        jTFTransfModel02 = new javax.swing.JTextField();
        jTFTransfModel03 = new javax.swing.JTextField();
        jTFTransfModel10 = new javax.swing.JTextField();
        jTFTransfModel11 = new javax.swing.JTextField();
        jTFTransfModel12 = new javax.swing.JTextField();
        jTFTransfModel13 = new javax.swing.JTextField();
        jTFTransfModel20 = new javax.swing.JTextField();
        jTFTransfModel21 = new javax.swing.JTextField();
        jTFTransfModel22 = new javax.swing.JTextField();
        jTFTransfModel23 = new javax.swing.JTextField();
        jTFTransfModel30 = new javax.swing.JTextField();
        jTFTransfModel31 = new javax.swing.JTextField();
        jTFTransfModel32 = new javax.swing.JTextField();
        jTFTransfModel33 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jRBTRE = new javax.swing.JRadioButton();
        jRBTER = new javax.swing.JRadioButton();
        jRBRTE = new javax.swing.JRadioButton();
        jRBRET = new javax.swing.JRadioButton();
        jRBETR = new javax.swing.JRadioButton();
        jRBERT = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jTFTransfCamera00 = new javax.swing.JTextField();
        jTFTransfCamera01 = new javax.swing.JTextField();
        jTFTransfCamera02 = new javax.swing.JTextField();
        jTFTransfCamera03 = new javax.swing.JTextField();
        jTFTransfCamera10 = new javax.swing.JTextField();
        jTFTransfCamera11 = new javax.swing.JTextField();
        jTFTransfCamera12 = new javax.swing.JTextField();
        jTFTransfCamera13 = new javax.swing.JTextField();
        jTFTransfCamera20 = new javax.swing.JTextField();
        jTFTransfCamera21 = new javax.swing.JTextField();
        jTFTransfCamera22 = new javax.swing.JTextField();
        jTFTransfCamera23 = new javax.swing.JTextField();
        jTFTransfCamera30 = new javax.swing.JTextField();
        jTFTransfCamera31 = new javax.swing.JTextField();
        jTFTransfCamera32 = new javax.swing.JTextField();
        jTFTransfCamera33 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanelImagens = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelImagem2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        jPanel1.setAutoscrolls(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Translação:");

        jLabel5.setText("Tx:");

        jSpCuboTx.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpCuboTxStateChanged(evt);
            }
        });

        jLabel6.setText("Ty:");

        jSpCuboTy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpCuboTyStateChanged(evt);
            }
        });

        jLabel7.setText("Tz:");

        jSpCuboTz.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpCuboTzStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpCuboTx, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpCuboTy, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpCuboTz, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpCuboTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpCuboTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSpCuboTz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(220, 220, 220));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("1");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(220, 220, 220));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(220, 220, 220));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");

        jTFCuboTx03.setEditable(false);
        jTFCuboTx03.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboTx03.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboTx03.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboTx03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboTx03.setText("0");

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(220, 220, 220));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("0");

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(220, 220, 220));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("1");

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(220, 220, 220));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("0");

        jTFCuboTy13.setEditable(false);
        jTFCuboTy13.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboTy13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboTy13.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboTy13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboTy13.setText("0");

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(220, 220, 220));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("0");

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(220, 220, 220));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("0");

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(220, 220, 220));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("1");

        jTFCuboTz23.setEditable(false);
        jTFCuboTz23.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboTz23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboTz23.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboTz23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboTz23.setText("0");

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(220, 220, 220));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("0");

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(220, 220, 220));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("0");

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(220, 220, 220));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("0");

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(220, 220, 220));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("1");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Matriz de Translação (?)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCuboTx03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCuboTy13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCuboTz23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuboTx03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuboTy13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuboTz23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel28.setText("Escala:");

        jLabel29.setText("Sx:");

        jSpCuboSx.setValue(1);
        jSpCuboSx.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpCuboSxStateChanged(evt);
            }
        });

        jLabel30.setText("Sy:");

        jSpCuboSy.setValue(1);
        jSpCuboSy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpCuboSyStateChanged(evt);
            }
        });

        jLabel31.setText("Sz:");

        jSpCuboSz.setValue(1);
        jSpCuboSz.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpCuboSzStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpCuboSx, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpCuboSy, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpCuboSz, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jSpCuboSx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jSpCuboSy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jSpCuboSz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFCuboSx00.setEditable(false);
        jTFCuboSx00.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboSx00.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboSx00.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboSx00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboSx00.setText("1");

        jTextField146.setEditable(false);
        jTextField146.setBackground(new java.awt.Color(220, 220, 220));
        jTextField146.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField146.setText("0");

        jTextField147.setEditable(false);
        jTextField147.setBackground(new java.awt.Color(220, 220, 220));
        jTextField147.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField147.setText("0");

        jTextField148.setEditable(false);
        jTextField148.setBackground(new java.awt.Color(220, 220, 220));
        jTextField148.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField148.setText("0");

        jTextField149.setEditable(false);
        jTextField149.setBackground(new java.awt.Color(220, 220, 220));
        jTextField149.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField149.setText("0");

        jTFCuboSy11.setEditable(false);
        jTFCuboSy11.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboSy11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboSy11.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboSy11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboSy11.setText("1");

        jTextField151.setEditable(false);
        jTextField151.setBackground(new java.awt.Color(220, 220, 220));
        jTextField151.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField151.setText("0");

        jTextField152.setEditable(false);
        jTextField152.setBackground(new java.awt.Color(220, 220, 220));
        jTextField152.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField152.setText("0");

        jTextField153.setEditable(false);
        jTextField153.setBackground(new java.awt.Color(220, 220, 220));
        jTextField153.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField153.setText("0");

        jTextField154.setEditable(false);
        jTextField154.setBackground(new java.awt.Color(220, 220, 220));
        jTextField154.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField154.setText("0");

        jTFCuboSz22.setEditable(false);
        jTFCuboSz22.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboSz22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboSz22.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboSz22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboSz22.setText("1");

        jTextField156.setEditable(false);
        jTextField156.setBackground(new java.awt.Color(220, 220, 220));
        jTextField156.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField156.setText("0");

        jTextField157.setEditable(false);
        jTextField157.setBackground(new java.awt.Color(220, 220, 220));
        jTextField157.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField157.setText("0");

        jTextField158.setEditable(false);
        jTextField158.setBackground(new java.awt.Color(220, 220, 220));
        jTextField158.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField158.setText("0");

        jTextField159.setEditable(false);
        jTextField159.setBackground(new java.awt.Color(220, 220, 220));
        jTextField159.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField159.setText("0");

        jTextField160.setEditable(false);
        jTextField160.setBackground(new java.awt.Color(220, 220, 220));
        jTextField160.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField160.setText("1");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Matriz de Escala (?)");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jTFCuboSx00, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField146, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField147, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField148, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jTextField149, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCuboSy11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField151, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField152, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jTextField153, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField154, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCuboSz22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField156, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jTextField157, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField158, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField159, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField160, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCuboSx00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField147, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField148, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField149, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuboSy11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField152, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField153, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuboSz22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField156, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField157, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField158, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField159, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField160, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setText("Rotação:");

        jLabel21.setText("Rx:");

        jSpCuboRx.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpCuboRxStateChanged(evt);
            }
        });

        jLabel22.setText("Ry:");

        jSpCuboRy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpCuboRyStateChanged(evt);
            }
        });

        jLabel23.setText("Rz:");

        jSpCuboRz.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpCuboRzStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpCuboRx, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpCuboRy, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpCuboRz, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jSpCuboRx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jSpCuboRy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jSpCuboRz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField33.setEditable(false);
        jTextField33.setBackground(new java.awt.Color(220, 220, 220));
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setText("1");

        jTextField34.setEditable(false);
        jTextField34.setBackground(new java.awt.Color(220, 220, 220));
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setText("0");

        jTextField35.setEditable(false);
        jTextField35.setBackground(new java.awt.Color(220, 220, 220));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setText("0");

        jTextField36.setEditable(false);
        jTextField36.setBackground(new java.awt.Color(220, 220, 220));
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setText("0");

        jTextField37.setEditable(false);
        jTextField37.setBackground(new java.awt.Color(220, 220, 220));
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setText("0");

        jTFCuboRx11.setEditable(false);
        jTFCuboRx11.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboRx11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboRx11.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboRx11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboRx11.setText("1");

        jTFCuboRx12.setEditable(false);
        jTFCuboRx12.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboRx12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboRx12.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboRx12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboRx12.setText("0");

        jTextField40.setEditable(false);
        jTextField40.setBackground(new java.awt.Color(220, 220, 220));
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.setText("0");

        jTextField41.setEditable(false);
        jTextField41.setBackground(new java.awt.Color(220, 220, 220));
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.setText("0");

        jTFCuboRx21.setEditable(false);
        jTFCuboRx21.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboRx21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboRx21.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboRx21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboRx21.setText("0");

        jTFCuboRx22.setEditable(false);
        jTFCuboRx22.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboRx22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboRx22.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboRx22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboRx22.setText("1");

        jTextField44.setEditable(false);
        jTextField44.setBackground(new java.awt.Color(220, 220, 220));
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setText("0");

        jTextField45.setEditable(false);
        jTextField45.setBackground(new java.awt.Color(220, 220, 220));
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setText("0");

        jTextField46.setEditable(false);
        jTextField46.setBackground(new java.awt.Color(220, 220, 220));
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.setText("0");

        jTextField47.setEditable(false);
        jTextField47.setBackground(new java.awt.Color(220, 220, 220));
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setText("0");

        jTextField48.setEditable(false);
        jTextField48.setBackground(new java.awt.Color(220, 220, 220));
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.setText("1");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Matriz de Rotação em x (?)");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCuboRx11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCuboRx12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCuboRx21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCuboRx22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuboRx11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuboRx12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuboRx21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuboRx22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFCuboRy00.setEditable(false);
        jTFCuboRy00.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboRy00.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboRy00.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboRy00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboRy00.setText("1");

        jTextField114.setEditable(false);
        jTextField114.setBackground(new java.awt.Color(220, 220, 220));
        jTextField114.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField114.setText("0");

        jTFCuboRy02.setEditable(false);
        jTFCuboRy02.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboRy02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboRy02.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboRy02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboRy02.setText("0");

        jTextField116.setEditable(false);
        jTextField116.setBackground(new java.awt.Color(220, 220, 220));
        jTextField116.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField116.setText("0");

        jTextField117.setEditable(false);
        jTextField117.setBackground(new java.awt.Color(220, 220, 220));
        jTextField117.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField117.setText("0");

        jTextField118.setEditable(false);
        jTextField118.setBackground(new java.awt.Color(220, 220, 220));
        jTextField118.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField118.setText("1");

        jTextField119.setEditable(false);
        jTextField119.setBackground(new java.awt.Color(220, 220, 220));
        jTextField119.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField119.setText("0");

        jTextField120.setEditable(false);
        jTextField120.setBackground(new java.awt.Color(220, 220, 220));
        jTextField120.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField120.setText("0");

        jTFCuboRy20.setEditable(false);
        jTFCuboRy20.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboRy20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboRy20.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboRy20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboRy20.setText("0");

        jTextField122.setEditable(false);
        jTextField122.setBackground(new java.awt.Color(220, 220, 220));
        jTextField122.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField122.setText("0");

        jTFCuboRy22.setEditable(false);
        jTFCuboRy22.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboRy22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboRy22.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboRy22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboRy22.setText("1");

        jTextField124.setEditable(false);
        jTextField124.setBackground(new java.awt.Color(220, 220, 220));
        jTextField124.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField124.setText("0");

        jTextField125.setEditable(false);
        jTextField125.setBackground(new java.awt.Color(220, 220, 220));
        jTextField125.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField125.setText("0");

        jTextField126.setEditable(false);
        jTextField126.setBackground(new java.awt.Color(220, 220, 220));
        jTextField126.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField126.setText("0");

        jTextField127.setEditable(false);
        jTextField127.setBackground(new java.awt.Color(220, 220, 220));
        jTextField127.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField127.setText("0");

        jTextField128.setEditable(false);
        jTextField128.setBackground(new java.awt.Color(220, 220, 220));
        jTextField128.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField128.setText("1");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Matriz de Rotação em y (?)");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jTFCuboRy00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField114, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCuboRy02, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField116, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField118, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField119, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField120, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jTFCuboRy20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField122, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCuboRy22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField124, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField127, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField128, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCuboRy00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuboRy02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCuboRy20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuboRy22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField127, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFCuboRz00.setEditable(false);
        jTFCuboRz00.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboRz00.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboRz00.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboRz00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboRz00.setText("1");

        jTFCuboRz01.setEditable(false);
        jTFCuboRz01.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboRz01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboRz01.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboRz01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboRz01.setText("0");

        jTextField131.setEditable(false);
        jTextField131.setBackground(new java.awt.Color(220, 220, 220));
        jTextField131.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField131.setText("0");

        jTextField132.setEditable(false);
        jTextField132.setBackground(new java.awt.Color(220, 220, 220));
        jTextField132.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField132.setText("0");

        jTFCuboRz10.setEditable(false);
        jTFCuboRz10.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboRz10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboRz10.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboRz10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboRz10.setText("0");

        jTFCuboRz11.setEditable(false);
        jTFCuboRz11.setBackground(new java.awt.Color(220, 220, 220));
        jTFCuboRz11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCuboRz11.setForeground(new java.awt.Color(0, 0, 255));
        jTFCuboRz11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCuboRz11.setText("1");

        jTextField135.setEditable(false);
        jTextField135.setBackground(new java.awt.Color(220, 220, 220));
        jTextField135.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField135.setText("0");

        jTextField136.setEditable(false);
        jTextField136.setBackground(new java.awt.Color(220, 220, 220));
        jTextField136.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField136.setText("0");

        jTextField137.setEditable(false);
        jTextField137.setBackground(new java.awt.Color(220, 220, 220));
        jTextField137.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField137.setText("0");

        jTextField138.setEditable(false);
        jTextField138.setBackground(new java.awt.Color(220, 220, 220));
        jTextField138.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField138.setText("0");

        jTextField139.setEditable(false);
        jTextField139.setBackground(new java.awt.Color(220, 220, 220));
        jTextField139.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField139.setText("1");

        jTextField140.setEditable(false);
        jTextField140.setBackground(new java.awt.Color(220, 220, 220));
        jTextField140.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField140.setText("0");

        jTextField141.setEditable(false);
        jTextField141.setBackground(new java.awt.Color(220, 220, 220));
        jTextField141.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField141.setText("0");

        jTextField142.setEditable(false);
        jTextField142.setBackground(new java.awt.Color(220, 220, 220));
        jTextField142.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField142.setText("0");

        jTextField143.setEditable(false);
        jTextField143.setBackground(new java.awt.Color(220, 220, 220));
        jTextField143.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField143.setText("0");

        jTextField144.setEditable(false);
        jTextField144.setBackground(new java.awt.Color(220, 220, 220));
        jTextField144.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField144.setText("1");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Matriz de Rotação em z (?)");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jTFCuboRz00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCuboRz01, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField131, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField132, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jTFCuboRz10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCuboRz11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField135, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField136, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jTextField137, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField138, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField139, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField140, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jTextField141, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField142, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField143, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField144, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCuboRz00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuboRz01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField131, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCuboRz10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCuboRz11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField135, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField143, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField144, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cubo");

        jLabel2.setText("Tamanho do cubo:");

        jTFTamanho.setText("1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTFTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Câmera");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Translação:");

        jLabel10.setText("Tx:");

        jSpTx.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpTxStateChanged(evt);
            }
        });

        jLabel11.setText("Ty:");

        jSpTy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpTyStateChanged(evt);
            }
        });

        jLabel32.setText("Tz:");

        jSpTz.setValue(2);
        jSpTz.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpTzStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpTx, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpTy, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpTz, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jSpTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jSpTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jSpTz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(220, 220, 220));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("1");

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(220, 220, 220));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("0");

        jTextField19.setEditable(false);
        jTextField19.setBackground(new java.awt.Color(220, 220, 220));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("0");

        jTFCameraTx03.setEditable(false);
        jTFCameraTx03.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraTx03.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraTx03.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraTx03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraTx03.setText("0");

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(220, 220, 220));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("0");

        jTextField22.setEditable(false);
        jTextField22.setBackground(new java.awt.Color(220, 220, 220));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setText("1");

        jTextField23.setEditable(false);
        jTextField23.setBackground(new java.awt.Color(220, 220, 220));
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setText("0");

        jTFCameraTx13.setEditable(false);
        jTFCameraTx13.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraTx13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraTx13.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraTx13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraTx13.setText("0");

        jTextField25.setEditable(false);
        jTextField25.setBackground(new java.awt.Color(220, 220, 220));
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setText("0");

        jTextField26.setEditable(false);
        jTextField26.setBackground(new java.awt.Color(220, 220, 220));
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.setText("0");

        jTextField27.setEditable(false);
        jTextField27.setBackground(new java.awt.Color(220, 220, 220));
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setText("1");

        jTFCameraTx23.setEditable(false);
        jTFCameraTx23.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraTx23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraTx23.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraTx23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraTx23.setText("0");

        jTextField29.setEditable(false);
        jTextField29.setBackground(new java.awt.Color(220, 220, 220));
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setText("0");

        jTextField30.setEditable(false);
        jTextField30.setBackground(new java.awt.Color(220, 220, 220));
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setText("0");

        jTextField31.setEditable(false);
        jTextField31.setBackground(new java.awt.Color(220, 220, 220));
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setText("0");

        jTextField32.setEditable(false);
        jTextField32.setBackground(new java.awt.Color(220, 220, 220));
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setText("1");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Matriz de Translação (?)");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCameraTx03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCameraTx13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCameraTx23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCameraTx03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCameraTx13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCameraTx23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel33.setText("Rotação:");

        jLabel34.setText("Rx:");

        jSpRx.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpRxStateChanged(evt);
            }
        });

        jLabel35.setText("Ry:");

        jSpRy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpRyStateChanged(evt);
            }
        });

        jLabel36.setText("Rz:");

        jSpRz.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpRzStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpRx, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpRy, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpRz, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jSpRx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jSpRy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jSpRz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField161.setEditable(false);
        jTextField161.setBackground(new java.awt.Color(220, 220, 220));
        jTextField161.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField161.setText("1");

        jTextField162.setEditable(false);
        jTextField162.setBackground(new java.awt.Color(220, 220, 220));
        jTextField162.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField162.setText("0");

        jTextField163.setEditable(false);
        jTextField163.setBackground(new java.awt.Color(220, 220, 220));
        jTextField163.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField163.setText("0");

        jTextField164.setEditable(false);
        jTextField164.setBackground(new java.awt.Color(220, 220, 220));
        jTextField164.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField164.setText("0");

        jTextField165.setEditable(false);
        jTextField165.setBackground(new java.awt.Color(220, 220, 220));
        jTextField165.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField165.setText("0");

        jTFCameraRx11.setEditable(false);
        jTFCameraRx11.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraRx11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraRx11.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraRx11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraRx11.setText("1");

        jTFCameraRx12.setEditable(false);
        jTFCameraRx12.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraRx12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraRx12.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraRx12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraRx12.setText("1");

        jTextField168.setEditable(false);
        jTextField168.setBackground(new java.awt.Color(220, 220, 220));
        jTextField168.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField168.setText("0");

        jTextField169.setEditable(false);
        jTextField169.setBackground(new java.awt.Color(220, 220, 220));
        jTextField169.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField169.setText("0");

        jTFCameraRx21.setEditable(false);
        jTFCameraRx21.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraRx21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraRx21.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraRx21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraRx21.setText("1");

        jTFCameraRx22.setEditable(false);
        jTFCameraRx22.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraRx22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraRx22.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraRx22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraRx22.setText("1");

        jTextField172.setEditable(false);
        jTextField172.setBackground(new java.awt.Color(220, 220, 220));
        jTextField172.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField172.setText("0");

        jTextField173.setEditable(false);
        jTextField173.setBackground(new java.awt.Color(220, 220, 220));
        jTextField173.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField173.setText("0");

        jTextField174.setEditable(false);
        jTextField174.setBackground(new java.awt.Color(220, 220, 220));
        jTextField174.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField174.setText("0");

        jTextField175.setEditable(false);
        jTextField175.setBackground(new java.awt.Color(220, 220, 220));
        jTextField175.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField175.setText("0");

        jTextField176.setEditable(false);
        jTextField176.setBackground(new java.awt.Color(220, 220, 220));
        jTextField176.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField176.setText("1");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Matriz de Rotação em x (?)");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jTextField161, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField162, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField163, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField164, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jTextField165, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCameraRx11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCameraRx12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField168, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jTextField169, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCameraRx21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCameraRx22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField172, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jTextField173, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField174, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField175, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField176, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField162, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField163, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField164, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField165, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCameraRx11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCameraRx12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField168, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField169, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCameraRx21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCameraRx22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField172, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField173, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField174, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField176, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFCameraRy00.setEditable(false);
        jTFCameraRy00.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraRy00.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraRy00.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraRy00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraRy00.setText("1");

        jTextField178.setEditable(false);
        jTextField178.setBackground(new java.awt.Color(220, 220, 220));
        jTextField178.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField178.setText("0");

        jTFCameraRy02.setEditable(false);
        jTFCameraRy02.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraRy02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraRy02.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraRy02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraRy02.setText("1");

        jTextField180.setEditable(false);
        jTextField180.setBackground(new java.awt.Color(220, 220, 220));
        jTextField180.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField180.setText("0");

        jTextField181.setEditable(false);
        jTextField181.setBackground(new java.awt.Color(220, 220, 220));
        jTextField181.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField181.setText("0");

        jTextField182.setEditable(false);
        jTextField182.setBackground(new java.awt.Color(220, 220, 220));
        jTextField182.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField182.setText("1");

        jTextField183.setEditable(false);
        jTextField183.setBackground(new java.awt.Color(220, 220, 220));
        jTextField183.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField183.setText("0");

        jTextField184.setEditable(false);
        jTextField184.setBackground(new java.awt.Color(220, 220, 220));
        jTextField184.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField184.setText("0");

        jTFCameraRy20.setEditable(false);
        jTFCameraRy20.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraRy20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraRy20.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraRy20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraRy20.setText("1");

        jTextField186.setEditable(false);
        jTextField186.setBackground(new java.awt.Color(220, 220, 220));
        jTextField186.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField186.setText("0");

        jTFCameraRy22.setEditable(false);
        jTFCameraRy22.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraRy22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraRy22.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraRy22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraRy22.setText("1");

        jTextField188.setEditable(false);
        jTextField188.setBackground(new java.awt.Color(220, 220, 220));
        jTextField188.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField188.setText("0");

        jTextField189.setEditable(false);
        jTextField189.setBackground(new java.awt.Color(220, 220, 220));
        jTextField189.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField189.setText("0");

        jTextField190.setEditable(false);
        jTextField190.setBackground(new java.awt.Color(220, 220, 220));
        jTextField190.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField190.setText("0");

        jTextField191.setEditable(false);
        jTextField191.setBackground(new java.awt.Color(220, 220, 220));
        jTextField191.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField191.setText("0");

        jTextField192.setEditable(false);
        jTextField192.setBackground(new java.awt.Color(220, 220, 220));
        jTextField192.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField192.setText("1");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Matriz de Rotação em y (?)");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jTFCameraRy00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField178, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCameraRy02, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField180, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jTextField181, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField182, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField183, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField184, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jTFCameraRy20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField186, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCameraRy22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField188, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jTextField189, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField190, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField191, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField192, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCameraRy00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField178, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCameraRy02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField180, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField181, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField182, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField183, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField184, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCameraRy20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField186, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCameraRy22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField188, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField189, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField190, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField191, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField192, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFCameraRz00.setEditable(false);
        jTFCameraRz00.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraRz00.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraRz00.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraRz00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraRz00.setText("1");

        jTFCameraRz01.setEditable(false);
        jTFCameraRz01.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraRz01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraRz01.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraRz01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraRz01.setText("1");

        jTextField195.setEditable(false);
        jTextField195.setBackground(new java.awt.Color(220, 220, 220));
        jTextField195.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField195.setText("0");

        jTextField196.setEditable(false);
        jTextField196.setBackground(new java.awt.Color(220, 220, 220));
        jTextField196.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField196.setText("0");

        jTFCameraRz10.setEditable(false);
        jTFCameraRz10.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraRz10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraRz10.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraRz10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraRz10.setText("1");

        jTFCameraRz11.setEditable(false);
        jTFCameraRz11.setBackground(new java.awt.Color(220, 220, 220));
        jTFCameraRz11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTFCameraRz11.setForeground(new java.awt.Color(0, 0, 255));
        jTFCameraRz11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCameraRz11.setText("1");

        jTextField199.setEditable(false);
        jTextField199.setBackground(new java.awt.Color(220, 220, 220));
        jTextField199.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField199.setText("0");

        jTextField200.setEditable(false);
        jTextField200.setBackground(new java.awt.Color(220, 220, 220));
        jTextField200.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField200.setText("0");

        jTextField201.setEditable(false);
        jTextField201.setBackground(new java.awt.Color(220, 220, 220));
        jTextField201.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField201.setText("0");

        jTextField202.setEditable(false);
        jTextField202.setBackground(new java.awt.Color(220, 220, 220));
        jTextField202.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField202.setText("0");

        jTextField203.setEditable(false);
        jTextField203.setBackground(new java.awt.Color(220, 220, 220));
        jTextField203.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField203.setText("1");

        jTextField204.setEditable(false);
        jTextField204.setBackground(new java.awt.Color(220, 220, 220));
        jTextField204.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField204.setText("0");

        jTextField205.setEditable(false);
        jTextField205.setBackground(new java.awt.Color(220, 220, 220));
        jTextField205.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField205.setText("0");

        jTextField206.setEditable(false);
        jTextField206.setBackground(new java.awt.Color(220, 220, 220));
        jTextField206.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField206.setText("0");

        jTextField207.setEditable(false);
        jTextField207.setBackground(new java.awt.Color(220, 220, 220));
        jTextField207.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField207.setText("0");

        jTextField208.setEditable(false);
        jTextField208.setBackground(new java.awt.Color(220, 220, 220));
        jTextField208.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField208.setText("1");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Matriz de Rotação em z (?)");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jTFCameraRz00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCameraRz01, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField195, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField196, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jTFCameraRz10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCameraRz11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField199, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField200, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jTextField201, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField202, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField203, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField204, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jTextField205, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField206, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField207, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField208, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCameraRz00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCameraRz01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField195, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField196, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCameraRz10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCameraRz11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField199, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField203, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField205, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField206, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField208, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setText("Projeção");

        jLabel38.setText("winmin");

        jSpWinmin.setValue(-1);
        jSpWinmin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpWinminStateChanged(evt);
            }
        });

        jLabel39.setText("winmax");

        jSpWinmax.setValue(1);
        jSpWinmax.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpWinmaxStateChanged(evt);
            }
        });

        jLabel50.setText("viewportmin");

        jSpViewportmin.setValue(0);
        jSpViewportmin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpViewportminStateChanged(evt);
            }
        });

        jLabel51.setText("viewportmax");

        jSpViewportmax.setValue(500);
        jSpViewportmax.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpViewportmaxStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpWinmin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpWinmax, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpViewportmin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpViewportmax, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel51)
                        .addComponent(jSpViewportmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel50)
                        .addComponent(jSpViewportmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(jSpWinmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(jSpWinmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel37))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(jRBPerspectiva);
        jRBPerspectiva.setSelected(true);
        jRBPerspectiva.setText("Perspectiva");
        jRBPerspectiva.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRBPerspectivaStateChanged(evt);
            }
        });

        jLabel40.setText("fov");

        jSPFov.setValue(67);
        jSPFov.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSPFovStateChanged(evt);
            }
        });

        jSPPerZnear.setValue(1);
        jSPPerZnear.setModel(spinnerModel);
        jSPPerZnear.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSPPerZnearStateChanged(evt);
            }
        });

        jLabel41.setText("znear");

        jLabel42.setText("zfar");

        jLabel43.setText("aspect");

        jSPPerZfar.setValue(2);
        jSPPerZfar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSPPerZfarStateChanged(evt);
            }
        });

        jSPAspect.setValue(1);
        jSPAspect.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSPAspectStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBPerspectiva)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSPPerZnear))
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSPFov, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSPAspect, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSPPerZfar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43)
                        .addComponent(jSPAspect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jRBPerspectiva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jSPFov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(jSPPerZfar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jSPPerZnear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(jRBParalela);
        jRBParalela.setText("Paralela");

        jLabel44.setText("Left");

        jSPLeft.setValue(-1);
        jSPLeft.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSPLeftStateChanged(evt);
            }
        });

        jLabel45.setText("Right");

        jSPRight.setValue(1);
        jSPRight.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSPRightStateChanged(evt);
            }
        });

        jLabel46.setText("Bottom");

        jLabel47.setText("Top");

        jSPBottom.setValue(-1);
        jSPBottom.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSPBottomStateChanged(evt);
            }
        });

        jSPTop.setValue(1);
        jSPTop.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSPTopStateChanged(evt);
            }
        });

        jLabel48.setText("Near");

        jLabel49.setText("Far");

        jSPParZnear.setValue(-1);
        jSPParZnear.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSPParZnearStateChanged(evt);
            }
        });

        jSPParZfar.setValue(1);
        jSPParZfar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSPParZfarStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBParalela)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSPLeft)
                                .addComponent(jSPRight, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSPBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jSPParZnear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSPTop, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSPParZfar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRBParalela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jSPLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jSPParZnear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jSPRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(jSPParZfar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jSPBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(jSPTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFProjecao00.setEditable(false);
        jTFProjecao00.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao00.setText("1");

        jTFProjecao01.setEditable(false);
        jTFProjecao01.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao01.setText("0");

        jTFProjecao02.setEditable(false);
        jTFProjecao02.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao02.setText("0");

        jTFProjecao03.setEditable(false);
        jTFProjecao03.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao03.setText("0");

        jTFProjecao10.setEditable(false);
        jTFProjecao10.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao10.setText("0");

        jTFProjecao11.setEditable(false);
        jTFProjecao11.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao11.setText("1");

        jTFProjecao12.setEditable(false);
        jTFProjecao12.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao12.setText("0");

        jTFProjecao13.setEditable(false);
        jTFProjecao13.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao13.setText("0");

        jTFProjecao20.setEditable(false);
        jTFProjecao20.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao20.setText("0");

        jTFProjecao21.setEditable(false);
        jTFProjecao21.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao21.setText("0");

        jTFProjecao22.setEditable(false);
        jTFProjecao22.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao22.setText("1");

        jTFProjecao23.setEditable(false);
        jTFProjecao23.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao23.setText("0");

        jTFProjecao30.setEditable(false);
        jTFProjecao30.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao30.setText("0");

        jTFProjecao31.setEditable(false);
        jTFProjecao31.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao31.setText("0");

        jTFProjecao32.setEditable(false);
        jTFProjecao32.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao32.setText("0");

        jTFProjecao33.setEditable(false);
        jTFProjecao33.setBackground(new java.awt.Color(220, 220, 220));
        jTFProjecao33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFProjecao33.setText("1");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("Matriz de Projeção (?)");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addComponent(jTFProjecao00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFProjecao01, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFProjecao02, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFProjecao03, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addComponent(jTFProjecao10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFProjecao11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFProjecao12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFProjecao13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addComponent(jTFProjecao20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFProjecao21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFProjecao22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFProjecao23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addComponent(jTFProjecao30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFProjecao31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFProjecao32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFProjecao33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel52)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFProjecao00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFProjecao01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFProjecao02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFProjecao03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFProjecao10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFProjecao11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFProjecao12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFProjecao13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFProjecao20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFProjecao21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFProjecao22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFProjecao23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFProjecao30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFProjecao31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFProjecao32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFProjecao33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFTransfModel00.setEditable(false);
        jTFTransfModel00.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel00.setText("1");

        jTFTransfModel01.setEditable(false);
        jTFTransfModel01.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel01.setText("0");

        jTFTransfModel02.setEditable(false);
        jTFTransfModel02.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel02.setText("0");

        jTFTransfModel03.setEditable(false);
        jTFTransfModel03.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel03.setText("0");

        jTFTransfModel10.setEditable(false);
        jTFTransfModel10.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel10.setText("0");

        jTFTransfModel11.setEditable(false);
        jTFTransfModel11.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel11.setText("1");

        jTFTransfModel12.setEditable(false);
        jTFTransfModel12.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel12.setText("0");

        jTFTransfModel13.setEditable(false);
        jTFTransfModel13.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel13.setText("0");

        jTFTransfModel20.setEditable(false);
        jTFTransfModel20.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel20.setText("0");

        jTFTransfModel21.setEditable(false);
        jTFTransfModel21.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel21.setText("0");

        jTFTransfModel22.setEditable(false);
        jTFTransfModel22.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel22.setText("1");

        jTFTransfModel23.setEditable(false);
        jTFTransfModel23.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel23.setText("0");

        jTFTransfModel30.setEditable(false);
        jTFTransfModel30.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel30.setText("0");

        jTFTransfModel31.setEditable(false);
        jTFTransfModel31.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel31.setText("0");

        jTFTransfModel32.setEditable(false);
        jTFTransfModel32.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel32.setText("0");

        jTFTransfModel33.setEditable(false);
        jTFTransfModel33.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfModel33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfModel33.setText("1");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Matriz de Transformação do Modelo (?)");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jTFTransfModel00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfModel01, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfModel02, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfModel03, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jTFTransfModel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfModel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfModel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfModel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jTFTransfModel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfModel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfModel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfModel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jTFTransfModel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfModel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfModel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfModel33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTransfModel00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfModel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfModel02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfModel03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTransfModel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfModel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfModel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfModel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTransfModel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfModel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfModel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfModel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTransfModel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfModel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfModel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfModel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Ordem das transformações:");

        buttonGroupOrdem.add(jRBTRE);
        jRBTRE.setSelected(true);
        jRBTRE.setText("Translação x Rotação x Escala");
        jRBTRE.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBTREItemStateChanged(evt);
            }
        });
        jRBTRE.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRBTREStateChanged(evt);
            }
        });

        buttonGroupOrdem.add(jRBTER);
        jRBTER.setText("Translação x Escala x Rotação");
        jRBTER.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBTERItemStateChanged(evt);
            }
        });

        buttonGroupOrdem.add(jRBRTE);
        jRBRTE.setText("Rotação x Translação x Escala");
        jRBRTE.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBRTEItemStateChanged(evt);
            }
        });

        buttonGroupOrdem.add(jRBRET);
        jRBRET.setText("Rotação x Escala x Rotação");
        jRBRET.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBRETItemStateChanged(evt);
            }
        });

        buttonGroupOrdem.add(jRBETR);
        jRBETR.setText("Escala x Translação x Rotação");
        jRBETR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBETRItemStateChanged(evt);
            }
        });

        buttonGroupOrdem.add(jRBERT);
        jRBERT.setText("Escala x Rotação x Translação");
        jRBERT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBERTItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBRTE)
                            .addComponent(jRBTER)
                            .addComponent(jRBTRE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBERT)
                            .addComponent(jRBETR)
                            .addComponent(jRBRET))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBTRE)
                    .addComponent(jRBRET))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jRBTER)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBRTE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jRBETR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBERT)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFTransfCamera00.setEditable(false);
        jTFTransfCamera00.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera00.setText("1");

        jTFTransfCamera01.setEditable(false);
        jTFTransfCamera01.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera01.setText("0");

        jTFTransfCamera02.setEditable(false);
        jTFTransfCamera02.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera02.setText("0");

        jTFTransfCamera03.setEditable(false);
        jTFTransfCamera03.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera03.setText("0");

        jTFTransfCamera10.setEditable(false);
        jTFTransfCamera10.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera10.setText("0");

        jTFTransfCamera11.setEditable(false);
        jTFTransfCamera11.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera11.setText("1");

        jTFTransfCamera12.setEditable(false);
        jTFTransfCamera12.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera12.setText("0");

        jTFTransfCamera13.setEditable(false);
        jTFTransfCamera13.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera13.setText("0");

        jTFTransfCamera20.setEditable(false);
        jTFTransfCamera20.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera20.setText("0");

        jTFTransfCamera21.setEditable(false);
        jTFTransfCamera21.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera21.setText("0");

        jTFTransfCamera22.setEditable(false);
        jTFTransfCamera22.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera22.setText("1");

        jTFTransfCamera23.setEditable(false);
        jTFTransfCamera23.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera23.setText("0");

        jTFTransfCamera30.setEditable(false);
        jTFTransfCamera30.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera30.setText("0");

        jTFTransfCamera31.setEditable(false);
        jTFTransfCamera31.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera31.setText("0");

        jTFTransfCamera32.setEditable(false);
        jTFTransfCamera32.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera32.setText("0");

        jTFTransfCamera33.setEditable(false);
        jTFTransfCamera33.setBackground(new java.awt.Color(220, 220, 220));
        jTFTransfCamera33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTransfCamera33.setText("1");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Matriz de Transformação da Câmera (?)");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jTFTransfCamera00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfCamera01, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfCamera02, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfCamera03, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jTFTransfCamera10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfCamera11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfCamera12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfCamera13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jTFTransfCamera20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfCamera21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfCamera22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfCamera23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jTFTransfCamera30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfCamera31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfCamera32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTransfCamera33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTransfCamera00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfCamera01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfCamera02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfCamera03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTransfCamera10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfCamera11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfCamera12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfCamera13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTransfCamera20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfCamera21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfCamera22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfCamera23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTransfCamera30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfCamera31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfCamera32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTransfCamera33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jScrollPane1.setViewportView(jPanel1);

        jPanelImagens.setAutoscrolls(true);
        jPanelImagens.setPreferredSize(new java.awt.Dimension(600, 61));

        jLabel1.setText(".");

        jLabelImagem2.setText(".");

        javax.swing.GroupLayout jPanelImagensLayout = new javax.swing.GroupLayout(jPanelImagens);
        jPanelImagens.setLayout(jPanelImagensLayout);
        jPanelImagensLayout.setHorizontalGroup(
            jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelImagem2))
                .addContainerGap(586, Short.MAX_VALUE))
        );
        jPanelImagensLayout.setVerticalGroup(
            jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelImagem2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanelImagens);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1437, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void atualizaMatrizTranslacaoCubo() {

        jTFCuboTx03.setText(tx + "");
        jTFCuboTy13.setText(ty + "");
        jTFCuboTz23.setText(tz + "");
    }

    public void atualizaMatrizEscalaCubo() {

        jTFCuboSx00.setText(sx + "");
        jTFCuboSy11.setText(sy + "");
        jTFCuboSz22.setText(sz + "");
    }

    public void atualizaMatrizRotacaoXCubo() {

        jTFCuboRx11.setText(df.format(Math.cos(Math.toRadians(rx))));
        jTFCuboRx12.setText(df.format(-Math.sin(Math.toRadians(rx))));
        jTFCuboRx21.setText(df.format(Math.sin(Math.toRadians(rx))));
        jTFCuboRx22.setText(df.format(Math.cos(Math.toRadians(rx))));

    }

    public void atualizaMatrizRotacaoYCubo() {

        jTFCuboRy00.setText(df.format(Math.cos(Math.toRadians(ry))));
        jTFCuboRy02.setText(df.format(Math.sin(Math.toRadians(ry))));
        jTFCuboRy20.setText(df.format(-Math.sin(Math.toRadians(ry))));
        jTFCuboRy22.setText(df.format(Math.cos(Math.toRadians(ry))));

    }

    public void atualizaMatrizRotacaoZCubo() {

        jTFCuboRz00.setText(df.format(Math.cos(Math.toRadians(rz))));
        jTFCuboRz01.setText(df.format(-Math.sin(Math.toRadians(rz))));
        jTFCuboRz10.setText(df.format(Math.sin(Math.toRadians(rz))));
        jTFCuboRz11.setText(df.format(Math.cos(Math.toRadians(rz))));

    }

    public void atualizaMatrizTranslacaoCamera() {

        jTFCameraTx03.setText(-ctx + "");
        jTFCameraTx13.setText(-cty + "");
        jTFCameraTx23.setText(-ctz + "");

    }

    public void atualizaMatrizRotacaoXCamera() {

        jTFCameraRx11.setText(df.format(Math.cos(Math.toRadians(-crx))));
        jTFCameraRx12.setText(df.format(-Math.sin(Math.toRadians(-crx))));
        jTFCameraRx21.setText(df.format(Math.sin(Math.toRadians(-crx))));
        jTFCameraRx22.setText(df.format(Math.cos(Math.toRadians(-crx))));

    }

    public void atualizaMatrizRotacaoYCamera() {

        jTFCameraRy00.setText(df.format(Math.cos(Math.toRadians(-cry))));
        jTFCameraRy02.setText(df.format(Math.sin(Math.toRadians(-cry))));
        jTFCameraRy20.setText(df.format(-Math.sin(Math.toRadians(-cry))));
        jTFCameraRy22.setText(df.format(Math.cos(Math.toRadians(-cry))));

    }

    public void atualizaMatrizRotacaoZCamera() {

        jTFCameraRz00.setText(df.format(Math.cos(Math.toRadians(-crz))));
        jTFCameraRz01.setText(df.format(-Math.sin(Math.toRadians(-crz))));
        jTFCameraRz10.setText(df.format(Math.sin(Math.toRadians(-crz))));
        jTFCameraRz11.setText(df.format(Math.cos(Math.toRadians(-crz))));

    }

    public void atualizaMatrizProjecao() {

        jTFProjecao00.setText(df.format(matriz_projecao_vp1.m00));
        jTFProjecao01.setText(df.format(matriz_projecao_vp1.m01));
        jTFProjecao02.setText(df.format(matriz_projecao_vp1.m02));
        jTFProjecao03.setText(df.format(matriz_projecao_vp1.m03));

        jTFProjecao10.setText(df.format(matriz_projecao_vp1.m10));
        jTFProjecao11.setText(df.format(matriz_projecao_vp1.m11));
        jTFProjecao12.setText(df.format(matriz_projecao_vp1.m12));
        jTFProjecao13.setText(df.format(matriz_projecao_vp1.m13));

        jTFProjecao20.setText(df.format(matriz_projecao_vp1.m20));
        jTFProjecao21.setText(df.format(matriz_projecao_vp1.m21));
        jTFProjecao22.setText(df.format(matriz_projecao_vp1.m22));
        jTFProjecao23.setText(df.format(matriz_projecao_vp1.m23));

        jTFProjecao30.setText(df.format(matriz_projecao_vp1.m30));
        jTFProjecao31.setText(df.format(matriz_projecao_vp1.m31));
        jTFProjecao32.setText(df.format(matriz_projecao_vp1.m32));
        jTFProjecao33.setText(df.format(matriz_projecao_vp1.m33));

    }

    public void atualizaMatrizTransformacaoModelo() {
        jTFTransfModel00.setText(df.format(matriz_modelo_cubo.m00));
        jTFTransfModel01.setText(df.format(matriz_modelo_cubo.m01));
        jTFTransfModel02.setText(df.format(matriz_modelo_cubo.m02));
        jTFTransfModel03.setText(df.format(matriz_modelo_cubo.m03));

        jTFTransfModel10.setText(df.format(matriz_modelo_cubo.m10));
        jTFTransfModel11.setText(df.format(matriz_modelo_cubo.m11));
        jTFTransfModel12.setText(df.format(matriz_modelo_cubo.m12));
        jTFTransfModel13.setText(df.format(matriz_modelo_cubo.m13));

        jTFTransfModel20.setText(df.format(matriz_modelo_cubo.m20));
        jTFTransfModel21.setText(df.format(matriz_modelo_cubo.m21));
        jTFTransfModel22.setText(df.format(matriz_modelo_cubo.m22));
        jTFTransfModel23.setText(df.format(matriz_modelo_cubo.m23));

        jTFTransfModel30.setText(df.format(matriz_modelo_cubo.m30));
        jTFTransfModel31.setText(df.format(matriz_modelo_cubo.m31));
        jTFTransfModel32.setText(df.format(matriz_modelo_cubo.m32));
        jTFTransfModel33.setText(df.format(matriz_modelo_cubo.m33));

    }

    public void atualizaMatrizVisualizacao() {
        jTFTransfCamera00.setText(df.format(matriz_visualizacao_camera.m00));
        jTFTransfCamera01.setText(df.format(matriz_visualizacao_camera.m01));
        jTFTransfCamera02.setText(df.format(matriz_visualizacao_camera.m02));
        jTFTransfCamera03.setText(df.format(matriz_visualizacao_camera.m03));

        jTFTransfCamera10.setText(df.format(matriz_visualizacao_camera.m10));
        jTFTransfCamera11.setText(df.format(matriz_visualizacao_camera.m11));
        jTFTransfCamera12.setText(df.format(matriz_visualizacao_camera.m12));
        jTFTransfCamera13.setText(df.format(matriz_visualizacao_camera.m13));

        jTFTransfCamera20.setText(df.format(matriz_visualizacao_camera.m20));
        jTFTransfCamera21.setText(df.format(matriz_visualizacao_camera.m21));
        jTFTransfCamera22.setText(df.format(matriz_visualizacao_camera.m22));
        jTFTransfCamera23.setText(df.format(matriz_visualizacao_camera.m23));

        jTFTransfCamera30.setText(df.format(matriz_visualizacao_camera.m30));
        jTFTransfCamera31.setText(df.format(matriz_visualizacao_camera.m31));
        jTFTransfCamera32.setText(df.format(matriz_visualizacao_camera.m32));
        jTFTransfCamera33.setText(df.format(matriz_visualizacao_camera.m33));

    }

    private void atualizar() {

        new Thread() {
            public void run() {

                //CAMERA 1
                ctx = (float) (Integer) jSpTx.getValue();
                cty = (float) (Integer) jSpTy.getValue();
                ctz = (float) (Integer) jSpTz.getValue();
                Matrix4f translacao_camera = Matrix4f.translate(-ctx, -cty, -ctz);

                crx = (float) (Integer) jSpRx.getValue();
                cry = (float) (Integer) jSpRy.getValue();
                crz = (float) (Integer) jSpRz.getValue();
                Matrix4f rotacao_x_camera = Matrix4f.rotate(-crx, 1, 0, 0);
                Matrix4f rotacao_y_camera = Matrix4f.rotate(-cry, 0, 1, 0);
                Matrix4f rotacao_z_camera = Matrix4f.rotate(-crz, 0, 0, 1);

                matriz_visualizacao_camera = rotacao_x_camera.multiply(translacao_camera);
                matriz_visualizacao_camera = rotacao_y_camera.multiply(matriz_visualizacao_camera);
                matriz_visualizacao_camera = rotacao_z_camera.multiply(matriz_visualizacao_camera);
                atualizaMatrizVisualizacao();

                //CAMERA 2
                Matrix4f translacao_camera2 = Matrix4f.translate(-8, 0, -1);
                Matrix4f rotacao_x_camera2 = Matrix4f.rotate(0, 1, 0, 0);
                Matrix4f rotacao_y_camera2 = Matrix4f.rotate(-90, 0, 1, 0);
                Matrix4f rotacao_z_camera2 = Matrix4f.rotate(0, 0, 0, 1);

                matriz_visualizacao_camera2 = rotacao_x_camera2.multiply(translacao_camera2);
                matriz_visualizacao_camera2 = rotacao_y_camera2.multiply(matriz_visualizacao_camera2);
                matriz_visualizacao_camera2 = rotacao_z_camera2.multiply(matriz_visualizacao_camera2);

                //PROJEÇÃO PARA A VIEWPORT 1
                float fov = (float) (Integer) jSPFov.getValue();
                float znear = (float) (double) jSPPerZnear.getValue();
                float zfar = (float) (Integer) jSPPerZfar.getValue();
                float aspect = (float) (Integer) jSPAspect.getValue();
                
                float left = (float) (Integer) jSPLeft.getValue();
                float right = (float) (Integer) jSPRight.getValue();
                float bottom = (float) (Integer) jSPBottom.getValue();
                float top = (float) (Integer) jSPTop.getValue();
                float near = (float) (Integer) jSPParZnear.getValue();
                float far = (float) (Integer) jSPParZfar.getValue();
                
                if (jRBPerspectiva.isSelected()) {
                    matriz_projecao_vp1 = Matrix4f.perspective(fov, aspect, znear, zfar);
                } else {
                    matriz_projecao_vp1 = Matrix4f.orthographic(left, right, bottom, top, near, far);
                }

                //PROJEÇÃO PARA A VIEWPORT 2
                Matrix4f matriz_projecao_vp2 = Matrix4f.perspective(67, 1, 0.7f, 100);

                //MATRIZES DE TRANSFORMAÇÃO DO MODELO DO OBJETO CUBO
                tx = (float) (Integer) jSpCuboTx.getValue();
                ty = (float) (Integer) jSpCuboTy.getValue();
                tz = (float) (Integer) jSpCuboTz.getValue();
                Matrix4f translacao_cubo = Matrix4f.translate(tx, ty, tz);

                sx = (float) (Integer) jSpCuboSx.getValue();
                sy = (float) (Integer) jSpCuboSy.getValue();
                sz = (float) (Integer) jSpCuboSz.getValue();
                Matrix4f escala_cubo = Matrix4f.scale(sx, sy, sz);

                rx = (float) (Integer) jSpCuboRx.getValue();
                ry = (float) (Integer) jSpCuboRy.getValue();
                rz = (float) (Integer) jSpCuboRz.getValue();

                Matrix4f rotacao_x_cubo = Matrix4f.rotate(rx, 1, 0, 0);
                Matrix4f rotacao_y_cubo = Matrix4f.rotate(ry, 0, 1, 0);
                Matrix4f rotacao_z_cubo = Matrix4f.rotate(rz, 0, 0, 1);
                Matrix4f rotacao_cubo = rotacao_y_cubo.multiply(rotacao_x_cubo);
                rotacao_cubo = rotacao_z_cubo.multiply(rotacao_cubo);

                //verifica a ordem das transformações do modelo que foi selecionada
                if (jRBTRE.isSelected()) {
                    matriz_modelo_cubo = rotacao_cubo.multiply(escala_cubo);
                    matriz_modelo_cubo = translacao_cubo.multiply(matriz_modelo_cubo);
                } else if (jRBTER.isSelected()) {
                    matriz_modelo_cubo = escala_cubo.multiply(rotacao_cubo);
                    matriz_modelo_cubo = translacao_cubo.multiply(matriz_modelo_cubo);
                } else if (jRBRTE.isSelected()) {
                    matriz_modelo_cubo = translacao_cubo.multiply(escala_cubo);
                    matriz_modelo_cubo = rotacao_cubo.multiply(matriz_modelo_cubo);
                } else if (jRBRET.isSelected()) {
                    matriz_modelo_cubo = escala_cubo.multiply(translacao_cubo);
                    matriz_modelo_cubo = rotacao_cubo.multiply(matriz_modelo_cubo);
                } else if (jRBETR.isSelected()) {
                    matriz_modelo_cubo = translacao_cubo.multiply(rotacao_cubo);
                    matriz_modelo_cubo = escala_cubo.multiply(matriz_modelo_cubo);
                } else if (jRBERT.isSelected()) {
                    matriz_modelo_cubo = rotacao_cubo.multiply(translacao_cubo);
                    matriz_modelo_cubo = escala_cubo.multiply(matriz_modelo_cubo);
                }
                atualizaMatrizTransformacaoModelo();

                //MATRIZ DE TRANSFORMAÇÃO DO MODELO DO OBJETO CAMERA
                Matrix4f translacao_camera_aux = Matrix4f.translate(ctx, cty, 0);
                Matrix4f translacao_camera_aux2 = Matrix4f.translate(0, 0, -ctz);
                Matrix4f translacao_camera_aux3 = Matrix4f.translate(0, 0, ctz);

                Matrix4f rotacao_x_camera_aux = Matrix4f.rotate(crx, 1, 0, 0);
                Matrix4f rotacao_y_camera_aux = Matrix4f.rotate(cry, 0, 1, 0);
                Matrix4f rotacao_z_camera_aux = Matrix4f.rotate(crz, 0, 0, 1);

                matriz_modelo_camera = rotacao_z_camera_aux.multiply(translacao_camera_aux2);
                matriz_modelo_camera = rotacao_y_camera_aux.multiply(matriz_modelo_camera);
                matriz_modelo_camera = rotacao_x_camera_aux.multiply(matriz_modelo_camera);
                matriz_modelo_camera = translacao_camera_aux3.multiply(matriz_modelo_camera);
                matriz_modelo_camera = translacao_camera_aux.multiply(matriz_modelo_camera);

                //MATRIZ DE TRANSFORMAÇÃO DO MODELO DO OBJETO FRUSTUM
                /*
                to do...
                 */
                //VÉRTICES DO MODELO DO OBJETO CUBO
                vertice = Float.parseFloat(jTFTamanho.getText()) / 2;
                Vector4f vertices_modelo_cubo[] = new Vector4f[8];
                int i = 0;
                for (float x = -vertice; x <= vertice; x += vertice * 2) {
                    for (float y = -vertice; y <= vertice; y += vertice * 2) {
                        for (float z = -vertice; z <= vertice; z += vertice * 2) {
                            vertices_modelo_cubo[i] = new Vector4f(x, y, z, 1);
                            i++;
                        }
                    }
                }

                //VÉRTICES DO MODELO DO OBJETO CAMERA
                Vector4f vertices_modelo_camera[] = new Vector4f[8];
                if (jRBPerspectiva.isSelected()) {
                    vertices_modelo_camera[0] = new Vector4f(-0.5f, (4 * (float) Math.tan(Math.toRadians(fov / 2))), -zfar, 1);
                    vertices_modelo_camera[1] = new Vector4f(0.5f, (4 * (float) Math.tan(Math.toRadians(fov / 2))), -zfar, 1);
                    vertices_modelo_camera[2] = new Vector4f(0.5f, (-4 * (float) Math.tan(Math.toRadians(fov / 2))), -zfar, 1);
                    vertices_modelo_camera[3] = new Vector4f(-0.5f, (-4 * (float) Math.tan(Math.toRadians(fov / 2))), -zfar, 1);
                    vertices_modelo_camera[4] = new Vector4f(-0.25f, (znear * (float) Math.tan(Math.toRadians(fov / 2))), ctz - znear, 1);
                    vertices_modelo_camera[5] = new Vector4f(0.25f, (znear * (float) Math.tan(Math.toRadians(fov / 2))), ctz - znear, 1);
                    vertices_modelo_camera[6] = new Vector4f(0.25f, (-znear * (float) Math.tan(Math.toRadians(fov / 2))), ctz - znear, 1);
                    vertices_modelo_camera[7] = new Vector4f(-0.25f, (-znear * (float) Math.tan(Math.toRadians(fov / 2))), ctz - znear, 1);
                } else {
                    vertices_modelo_camera[0] = new Vector4f(left, top, near, 1);
                    vertices_modelo_camera[1] = new Vector4f(right, top, near, 1);
                    vertices_modelo_camera[2] = new Vector4f(right, bottom, near, 1);
                    vertices_modelo_camera[3] = new Vector4f(left, bottom, near, 1);
                    vertices_modelo_camera[4] = new Vector4f(left, top, far, 1);
                    vertices_modelo_camera[5] = new Vector4f(right, top, far, 1);
                    vertices_modelo_camera[6] = new Vector4f(right, bottom, far, 1);
                    vertices_modelo_camera[7] = new Vector4f(left, bottom, far, 1);
                }
                //VÉRTICES DO MODELO DO FRUSTUM
                /*to do...*/
                //TRANSFORMAÇÕES DO OBJETO CUBO NO UNIVERSO
                Vector4f vertices_cubo_universo[] = new Vector4f[8];
                for (i = 0; i < 8; i++) {
                    vertices_cubo_universo[i] = matriz_modelo_cubo.multiply(vertices_modelo_cubo[i]);
                }

                //TRANSFORMAÇÕES DO OBJETO CAMERA NO UNIVERSO
                Vector4f vertices_camera_universo[] = new Vector4f[8];
                for (i = 0; i < 8; i++) {
                    vertices_camera_universo[i] = matriz_modelo_camera.multiply(vertices_modelo_camera[i]);
                }
                //TRANSFORMAÇÕES DO OBJETO FRUSTUM NO UNIVERSO
                /*to do...*/

                //TRANSFORMAÇOES DAS VIEWPORT
                windowmin = (Integer) jSpWinmin.getValue();
                windowmax = (Integer) jSpWinmax.getValue();
                viewportmin = (Integer) jSpViewportmin.getValue();
                viewportmax = (Integer) jSpViewportmax.getValue();

                //TRANSFORMAÇÕES DO OBJETO CUBO NA VIEWPORT 1
                Vector4f vertices_visualizacao_cubo_vp1[] = new Vector4f[8];
                Vector4f vertices_projecao_cubo_vp1[] = new Vector4f[8];
                Vector3f vertices_mapeados_cubo_vp1[] = new Vector3f[8];
                for (i = 0; i < 8; i++) {
                    vertices_visualizacao_cubo_vp1[i] = matriz_visualizacao_camera.multiply(vertices_cubo_universo[i]);
                    vertices_projecao_cubo_vp1[i] = matriz_projecao_vp1.multiply(vertices_visualizacao_cubo_vp1[i]);
                    float x_map = (int) ((((vertices_projecao_cubo_vp1[i].x / vertices_projecao_cubo_vp1[i].w) - (windowmin)) * (viewportmax - viewportmin)) / (windowmax - (windowmin))) + viewportmin;
                    float y_map = (int) ((((vertices_projecao_cubo_vp1[i].y / vertices_projecao_cubo_vp1[i].w) - (windowmin)) * (viewportmin - viewportmax)) / (windowmax - (windowmin))) + viewportmax;
                    vertices_mapeados_cubo_vp1[i] = new Vector3f(x_map, y_map, 1);
                }

                //TRANSFORMAÇÕES DO OBJETO CUBO NA VIEWPORT 2
                Vector4f vertices_visualizacao_cubo_vp2[] = new Vector4f[8];
                Vector4f vertices_projecao_cubo_vp2[] = new Vector4f[8];
                Vector3f vertices_mapeados_cubo_vp2[] = new Vector3f[8];
                for (i = 0; i < 8; i++) {
                    vertices_visualizacao_cubo_vp2[i] = matriz_visualizacao_camera2.multiply(vertices_cubo_universo[i]);
                    vertices_projecao_cubo_vp2[i] = matriz_projecao_vp2.multiply(vertices_visualizacao_cubo_vp2[i]);
                    float x_map = (int) ((((vertices_projecao_cubo_vp2[i].x / vertices_projecao_cubo_vp2[i].w) - (windowmin)) * (viewportmax - viewportmin)) / (windowmax - (windowmin))) + viewportmin;
                    float y_map = (int) ((((vertices_projecao_cubo_vp2[i].y / vertices_projecao_cubo_vp2[i].w) - (windowmin)) * (viewportmin - viewportmax)) / (windowmax - (windowmin))) + viewportmax;
                    vertices_mapeados_cubo_vp2[i] = new Vector3f(x_map, y_map, 1);
                }

                //TRANSFORMAÇÕES DO OBJETO CÂMERA NA VIEWPORT 2
                Vector4f vertices_visualizacao_camera_vp2[] = new Vector4f[8];
                Vector4f vertices_projecao_camera_vp2[] = new Vector4f[8];
                Vector3f vertices_mapeados_camera_vp2[] = new Vector3f[8];
                for (i = 0; i < 8; i++) {
                    vertices_visualizacao_camera_vp2[i] = matriz_visualizacao_camera2.multiply(vertices_camera_universo[i]);
                    vertices_projecao_camera_vp2[i] = matriz_projecao_vp2.multiply(vertices_visualizacao_camera_vp2[i]);
                    float x_map = (int) ((((vertices_projecao_camera_vp2[i].x / vertices_projecao_camera_vp2[i].w) - (windowmin)) * (viewportmax - viewportmin)) / (windowmax - (windowmin))) + viewportmin;
                    float y_map = (int) ((((vertices_projecao_camera_vp2[i].y / vertices_projecao_camera_vp2[i].w) - (windowmin)) * (viewportmin - viewportmax)) / (windowmax - (windowmin))) + viewportmax;
                    vertices_mapeados_camera_vp2[i] = new Vector3f(x_map, y_map, 1);
                }

                /*DESENHOS NA VIEWPORT 1*/
                BufferedImage img = new BufferedImage(viewportmax, viewportmax, BufferedImage.TYPE_INT_RGB);
                Graphics2D g2 = img.createGraphics();
                RenderingHints rh = new RenderingHints(
                        RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setRenderingHints(rh);
                g2.setStroke(new BasicStroke(2));
                g2.setColor(Color.BLACK);
                g2.fillRect(0, 0, viewportmax, viewportmax);
                g2.setColor(Color.WHITE);

                /*if (jCheckBox1.isSelected()) {
         for (i = 0; i < 8; i++) {
         //g2.drawString("P" + (i + 1) + "(" + vertices_modelo[i].x + "," + vertices_modelo[i].y + "," + vertices_modelo[i].z + ")", vertices_mapeados[i].x, vertices_mapeados[i].y);
         g2.drawString("P" + (i + 1) + "(" + vertices_mapeados_cubo_vp1[i].x + "," + vertices_mapeados_cubo_vp1[i].y + ")", vertices_mapeados_cubo_vp1[i].x, vertices_mapeados_cubo_vp1[i].y);

         }
         }*/
                //DESENHO DO OBJETO CUBO NA VIEWPORT1
                g2.drawLine((int) vertices_mapeados_cubo_vp1[0].x, (int) vertices_mapeados_cubo_vp1[0].y, (int) vertices_mapeados_cubo_vp1[1].x, (int) vertices_mapeados_cubo_vp1[1].y);
                g2.drawLine((int) vertices_mapeados_cubo_vp1[0].x, (int) vertices_mapeados_cubo_vp1[0].y, (int) vertices_mapeados_cubo_vp1[2].x, (int) vertices_mapeados_cubo_vp1[2].y);
                g2.drawLine((int) vertices_mapeados_cubo_vp1[0].x, (int) vertices_mapeados_cubo_vp1[0].y, (int) vertices_mapeados_cubo_vp1[4].x, (int) vertices_mapeados_cubo_vp1[4].y);

                g2.drawLine((int) vertices_mapeados_cubo_vp1[1].x, (int) vertices_mapeados_cubo_vp1[1].y, (int) vertices_mapeados_cubo_vp1[3].x, (int) vertices_mapeados_cubo_vp1[3].y);
                g2.drawLine((int) vertices_mapeados_cubo_vp1[1].x, (int) vertices_mapeados_cubo_vp1[1].y, (int) vertices_mapeados_cubo_vp1[5].x, (int) vertices_mapeados_cubo_vp1[5].y);

                g2.drawLine((int) vertices_mapeados_cubo_vp1[2].x, (int) vertices_mapeados_cubo_vp1[2].y, (int) vertices_mapeados_cubo_vp1[3].x, (int) vertices_mapeados_cubo_vp1[3].y);
                g2.drawLine((int) vertices_mapeados_cubo_vp1[2].x, (int) vertices_mapeados_cubo_vp1[2].y, (int) vertices_mapeados_cubo_vp1[6].x, (int) vertices_mapeados_cubo_vp1[6].y);

                g2.drawLine((int) vertices_mapeados_cubo_vp1[3].x, (int) vertices_mapeados_cubo_vp1[3].y, (int) vertices_mapeados_cubo_vp1[7].x, (int) vertices_mapeados_cubo_vp1[7].y);

                g2.drawLine((int) vertices_mapeados_cubo_vp1[4].x, (int) vertices_mapeados_cubo_vp1[4].y, (int) vertices_mapeados_cubo_vp1[5].x, (int) vertices_mapeados_cubo_vp1[5].y);
                g2.drawLine((int) vertices_mapeados_cubo_vp1[4].x, (int) vertices_mapeados_cubo_vp1[4].y, (int) vertices_mapeados_cubo_vp1[6].x, (int) vertices_mapeados_cubo_vp1[6].y);

                g2.drawLine((int) vertices_mapeados_cubo_vp1[5].x, (int) vertices_mapeados_cubo_vp1[5].y, (int) vertices_mapeados_cubo_vp1[7].x, (int) vertices_mapeados_cubo_vp1[7].y);

                g2.drawLine((int) vertices_mapeados_cubo_vp1[6].x, (int) vertices_mapeados_cubo_vp1[6].y, (int) vertices_mapeados_cubo_vp1[7].x, (int) vertices_mapeados_cubo_vp1[7].y);
                jLabel1.setIcon(new ImageIcon(img));

                /*DESENHOS NA VIEWPORT 2*/
                BufferedImage img2 = new BufferedImage(viewportmax, viewportmax, BufferedImage.TYPE_INT_RGB);
                g2 = img2.createGraphics();
                g2.setRenderingHints(rh);
                g2.setColor(Color.BLACK);
                g2.fillRect(0, 0, viewportmax, viewportmax);
                g2.setColor(Color.WHITE);

                //DESENHO DO OBJETO CUBO NA VIEWPORT 2
                g2.drawLine((int) vertices_mapeados_cubo_vp2[0].x, (int) vertices_mapeados_cubo_vp2[0].y, (int) vertices_mapeados_cubo_vp2[1].x, (int) vertices_mapeados_cubo_vp2[1].y);
                g2.drawLine((int) vertices_mapeados_cubo_vp2[0].x, (int) vertices_mapeados_cubo_vp2[0].y, (int) vertices_mapeados_cubo_vp2[2].x, (int) vertices_mapeados_cubo_vp2[2].y);
                g2.drawLine((int) vertices_mapeados_cubo_vp2[0].x, (int) vertices_mapeados_cubo_vp2[0].y, (int) vertices_mapeados_cubo_vp2[4].x, (int) vertices_mapeados_cubo_vp2[4].y);

                g2.drawLine((int) vertices_mapeados_cubo_vp2[1].x, (int) vertices_mapeados_cubo_vp2[1].y, (int) vertices_mapeados_cubo_vp2[3].x, (int) vertices_mapeados_cubo_vp2[3].y);
                g2.drawLine((int) vertices_mapeados_cubo_vp2[1].x, (int) vertices_mapeados_cubo_vp2[1].y, (int) vertices_mapeados_cubo_vp2[5].x, (int) vertices_mapeados_cubo_vp2[5].y);

                g2.drawLine((int) vertices_mapeados_cubo_vp2[2].x, (int) vertices_mapeados_cubo_vp2[2].y, (int) vertices_mapeados_cubo_vp2[3].x, (int) vertices_mapeados_cubo_vp2[3].y);
                g2.drawLine((int) vertices_mapeados_cubo_vp2[2].x, (int) vertices_mapeados_cubo_vp2[2].y, (int) vertices_mapeados_cubo_vp2[6].x, (int) vertices_mapeados_cubo_vp2[6].y);

                g2.drawLine((int) vertices_mapeados_cubo_vp2[3].x, (int) vertices_mapeados_cubo_vp2[3].y, (int) vertices_mapeados_cubo_vp2[7].x, (int) vertices_mapeados_cubo_vp2[7].y);

                g2.drawLine((int) vertices_mapeados_cubo_vp2[4].x, (int) vertices_mapeados_cubo_vp2[4].y, (int) vertices_mapeados_cubo_vp2[5].x, (int) vertices_mapeados_cubo_vp2[5].y);
                g2.drawLine((int) vertices_mapeados_cubo_vp2[4].x, (int) vertices_mapeados_cubo_vp2[4].y, (int) vertices_mapeados_cubo_vp2[6].x, (int) vertices_mapeados_cubo_vp2[6].y);

                g2.drawLine((int) vertices_mapeados_cubo_vp2[5].x, (int) vertices_mapeados_cubo_vp2[5].y, (int) vertices_mapeados_cubo_vp2[7].x, (int) vertices_mapeados_cubo_vp2[7].y);

                g2.drawLine((int) vertices_mapeados_cubo_vp2[6].x, (int) vertices_mapeados_cubo_vp2[6].y, (int) vertices_mapeados_cubo_vp2[7].x, (int) vertices_mapeados_cubo_vp2[7].y);

                //DESENHO DO OBJETO CAMERA NA VIEWPORT 2
                g2.setColor(Color.BLUE);
                g2.drawLine((int) vertices_mapeados_camera_vp2[0].x, (int) vertices_mapeados_camera_vp2[0].y, (int) vertices_mapeados_camera_vp2[1].x, (int) vertices_mapeados_camera_vp2[1].y);
                g2.drawLine((int) vertices_mapeados_camera_vp2[1].x, (int) vertices_mapeados_camera_vp2[1].y, (int) vertices_mapeados_camera_vp2[2].x, (int) vertices_mapeados_camera_vp2[2].y);
                g2.drawLine((int) vertices_mapeados_camera_vp2[2].x, (int) vertices_mapeados_camera_vp2[2].y, (int) vertices_mapeados_camera_vp2[3].x, (int) vertices_mapeados_camera_vp2[3].y);
                g2.drawLine((int) vertices_mapeados_camera_vp2[3].x, (int) vertices_mapeados_camera_vp2[3].y, (int) vertices_mapeados_camera_vp2[0].x, (int) vertices_mapeados_camera_vp2[0].y);

                g2.drawLine((int) vertices_mapeados_camera_vp2[4].x, (int) vertices_mapeados_camera_vp2[4].y, (int) vertices_mapeados_camera_vp2[5].x, (int) vertices_mapeados_camera_vp2[5].y);
                g2.drawLine((int) vertices_mapeados_camera_vp2[5].x, (int) vertices_mapeados_camera_vp2[5].y, (int) vertices_mapeados_camera_vp2[6].x, (int) vertices_mapeados_camera_vp2[6].y);
                g2.drawLine((int) vertices_mapeados_camera_vp2[6].x, (int) vertices_mapeados_camera_vp2[6].y, (int) vertices_mapeados_camera_vp2[7].x, (int) vertices_mapeados_camera_vp2[7].y);
                g2.drawLine((int) vertices_mapeados_camera_vp2[7].x, (int) vertices_mapeados_camera_vp2[7].y, (int) vertices_mapeados_camera_vp2[4].x, (int) vertices_mapeados_camera_vp2[4].y);

                g2.drawLine((int) vertices_mapeados_camera_vp2[0].x, (int) vertices_mapeados_camera_vp2[0].y, (int) vertices_mapeados_camera_vp2[4].x, (int) vertices_mapeados_camera_vp2[4].y);
                g2.drawLine((int) vertices_mapeados_camera_vp2[1].x, (int) vertices_mapeados_camera_vp2[1].y, (int) vertices_mapeados_camera_vp2[5].x, (int) vertices_mapeados_camera_vp2[5].y);
                g2.drawLine((int) vertices_mapeados_camera_vp2[2].x, (int) vertices_mapeados_camera_vp2[2].y, (int) vertices_mapeados_camera_vp2[6].x, (int) vertices_mapeados_camera_vp2[6].y);
                g2.drawLine((int) vertices_mapeados_camera_vp2[3].x, (int) vertices_mapeados_camera_vp2[3].y, (int) vertices_mapeados_camera_vp2[7].x, (int) vertices_mapeados_camera_vp2[7].y);

                //DESENHO DO OBJETO FRUSTUM NA VIEWPORT 2
                /*to do...*/
                jLabelImagem2.setIcon(new ImageIcon(img2));
                Dimension d = new Dimension(viewportmax, viewportmax * 2);
                jPanelImagens.setPreferredSize(d);
            }
        }.start();

    }

    public void mostraVetor(Vector3f vetor[]) {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
        otherSymbols.setDecimalSeparator('.');
        otherSymbols.setGroupingSeparator('.');
        DecimalFormat df2 = new DecimalFormat("#0.00", otherSymbols);
        for (int i = 0; i < vetor.length; i++) {
            //System.out.println("P"+(i+1)+" = M*P"+(i+1)+"="+"("+df.format(vetor[i].x)+","+df.format(vetor[i].y)+","+df.format(vetor[i].z)+","+df.format(vetor[i].w)+")");
            //System.out.println("P" + (i + 1) + "=" + "(" + df.format(vetor[i].x / vetor[i].w) + "," + df.format(vetor[i].y / vetor[i].w) + ")");
            System.out.println("P" + (i + 1) + "=" + "(" + (int) vetor[i].x + "," + (int) vetor[i].y + ")");
        }
    }

    private void jSpCuboTxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpCuboTxStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizTranslacaoCubo();
            }
        }.start();
    }//GEN-LAST:event_jSpCuboTxStateChanged

    private void jSpCuboTyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpCuboTyStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizTranslacaoCubo();
            }
        }.start();

    }//GEN-LAST:event_jSpCuboTyStateChanged

    private void jSpCuboTzStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpCuboTzStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizTranslacaoCubo();
            }
        }.start();
    }//GEN-LAST:event_jSpCuboTzStateChanged

    private void jSpCuboRxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpCuboRxStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizRotacaoXCubo();
            }
        }.start();
    }//GEN-LAST:event_jSpCuboRxStateChanged

    private void jSpCuboRyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpCuboRyStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizRotacaoYCubo();
            }
        }.start();

    }//GEN-LAST:event_jSpCuboRyStateChanged

    private void jSpCuboRzStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpCuboRzStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizRotacaoZCubo();
            }
        }.start();
    }//GEN-LAST:event_jSpCuboRzStateChanged

    private void jSpCuboSxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpCuboSxStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizEscalaCubo();
            }
        }.start();
    }//GEN-LAST:event_jSpCuboSxStateChanged

    private void jSpCuboSyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpCuboSyStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizEscalaCubo();
            }
        }.start();
    }//GEN-LAST:event_jSpCuboSyStateChanged

    private void jSpCuboSzStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpCuboSzStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizEscalaCubo();
            }
        }.start();
    }//GEN-LAST:event_jSpCuboSzStateChanged

    private void jSpTxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpTxStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizTranslacaoCamera();
            }
        }.start();
    }//GEN-LAST:event_jSpTxStateChanged

    private void jSpTyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpTyStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizTranslacaoCamera();
            }
        }.start();
    }//GEN-LAST:event_jSpTyStateChanged

    private void jSpTzStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpTzStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizTranslacaoCamera();
            }
        }.start();
    }//GEN-LAST:event_jSpTzStateChanged

    private void jSpRxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpRxStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizRotacaoXCamera();
            }
        }.start();
    }//GEN-LAST:event_jSpRxStateChanged

    private void jSpRyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpRyStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizRotacaoYCamera();
            }
        }.start();
    }//GEN-LAST:event_jSpRyStateChanged

    private void jSpRzStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpRzStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizRotacaoZCamera();
            }
        }.start();
    }//GEN-LAST:event_jSpRzStateChanged

    private void jSpWinminStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpWinminStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSpWinminStateChanged

    private void jSpWinmaxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpWinmaxStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSpWinmaxStateChanged

    private void jRBPerspectivaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRBPerspectivaStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jRBPerspectivaStateChanged

    private void jSPFovStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSPFovStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSPFovStateChanged

    private void jSPPerZnearStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSPPerZnearStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSPPerZnearStateChanged

    private void jSPPerZfarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSPPerZfarStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSPPerZfarStateChanged

    private void jSPAspectStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSPAspectStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSPAspectStateChanged

    private void jSPLeftStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSPLeftStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSPLeftStateChanged

    private void jSPRightStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSPRightStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSPRightStateChanged

    private void jSPBottomStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSPBottomStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSPBottomStateChanged

    private void jSPTopStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSPTopStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSPTopStateChanged

    private void jSPParZnearStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSPParZnearStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSPParZnearStateChanged

    private void jSPParZfarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSPParZfarStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSPParZfarStateChanged

    private void jSpViewportminStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpViewportminStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSpViewportminStateChanged

    private void jSpViewportmaxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpViewportmaxStateChanged
        atualizar();
        new Thread() {
            public void run() {
                atualizaMatrizProjecao();
            }
        }.start();
    }//GEN-LAST:event_jSpViewportmaxStateChanged

    private void jRBTREStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRBTREStateChanged

    }//GEN-LAST:event_jRBTREStateChanged

    private void jRBTREItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBTREItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            atualizar();
        }
    }//GEN-LAST:event_jRBTREItemStateChanged

    private void jRBTERItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBTERItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            atualizar();
        }
    }//GEN-LAST:event_jRBTERItemStateChanged

    private void jRBRTEItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBRTEItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            atualizar();
        }
    }//GEN-LAST:event_jRBRTEItemStateChanged

    private void jRBRETItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBRETItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            atualizar();
        }
    }//GEN-LAST:event_jRBRETItemStateChanged

    private void jRBETRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBETRItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            atualizar();
        }
    }//GEN-LAST:event_jRBETRItemStateChanged

    private void jRBERTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBERTItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            atualizar();
        }
    }//GEN-LAST:event_jRBERTItemStateChanged

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroupOrdem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImagem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelImagens;
    private javax.swing.JRadioButton jRBERT;
    private javax.swing.JRadioButton jRBETR;
    private javax.swing.JRadioButton jRBParalela;
    private javax.swing.JRadioButton jRBPerspectiva;
    private javax.swing.JRadioButton jRBRET;
    private javax.swing.JRadioButton jRBRTE;
    private javax.swing.JRadioButton jRBTER;
    private javax.swing.JRadioButton jRBTRE;
    private javax.swing.JSpinner jSPAspect;
    private javax.swing.JSpinner jSPBottom;
    private javax.swing.JSpinner jSPFov;
    private javax.swing.JSpinner jSPLeft;
    private javax.swing.JSpinner jSPParZfar;
    private javax.swing.JSpinner jSPParZnear;
    private javax.swing.JSpinner jSPPerZfar;
    private javax.swing.JSpinner jSPPerZnear;
    private javax.swing.JSpinner jSPRight;
    private javax.swing.JSpinner jSPTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpCuboRx;
    private javax.swing.JSpinner jSpCuboRy;
    private javax.swing.JSpinner jSpCuboRz;
    private javax.swing.JSpinner jSpCuboSx;
    private javax.swing.JSpinner jSpCuboSy;
    private javax.swing.JSpinner jSpCuboSz;
    private javax.swing.JSpinner jSpCuboTx;
    private javax.swing.JSpinner jSpCuboTy;
    private javax.swing.JSpinner jSpCuboTz;
    private javax.swing.JSpinner jSpRx;
    private javax.swing.JSpinner jSpRy;
    private javax.swing.JSpinner jSpRz;
    private javax.swing.JSpinner jSpTx;
    private javax.swing.JSpinner jSpTy;
    private javax.swing.JSpinner jSpTz;
    private javax.swing.JSpinner jSpViewportmax;
    private javax.swing.JSpinner jSpViewportmin;
    private javax.swing.JSpinner jSpWinmax;
    private javax.swing.JSpinner jSpWinmin;
    private javax.swing.JTextField jTFCameraRx11;
    private javax.swing.JTextField jTFCameraRx12;
    private javax.swing.JTextField jTFCameraRx21;
    private javax.swing.JTextField jTFCameraRx22;
    private javax.swing.JTextField jTFCameraRy00;
    private javax.swing.JTextField jTFCameraRy02;
    private javax.swing.JTextField jTFCameraRy20;
    private javax.swing.JTextField jTFCameraRy22;
    private javax.swing.JTextField jTFCameraRz00;
    private javax.swing.JTextField jTFCameraRz01;
    private javax.swing.JTextField jTFCameraRz10;
    private javax.swing.JTextField jTFCameraRz11;
    private javax.swing.JTextField jTFCameraTx03;
    private javax.swing.JTextField jTFCameraTx13;
    private javax.swing.JTextField jTFCameraTx23;
    private javax.swing.JTextField jTFCuboRx11;
    private javax.swing.JTextField jTFCuboRx12;
    private javax.swing.JTextField jTFCuboRx21;
    private javax.swing.JTextField jTFCuboRx22;
    private javax.swing.JTextField jTFCuboRy00;
    private javax.swing.JTextField jTFCuboRy02;
    private javax.swing.JTextField jTFCuboRy20;
    private javax.swing.JTextField jTFCuboRy22;
    private javax.swing.JTextField jTFCuboRz00;
    private javax.swing.JTextField jTFCuboRz01;
    private javax.swing.JTextField jTFCuboRz10;
    private javax.swing.JTextField jTFCuboRz11;
    private javax.swing.JTextField jTFCuboSx00;
    private javax.swing.JTextField jTFCuboSy11;
    private javax.swing.JTextField jTFCuboSz22;
    private javax.swing.JTextField jTFCuboTx03;
    private javax.swing.JTextField jTFCuboTy13;
    private javax.swing.JTextField jTFCuboTz23;
    private javax.swing.JTextField jTFProjecao00;
    private javax.swing.JTextField jTFProjecao01;
    private javax.swing.JTextField jTFProjecao02;
    private javax.swing.JTextField jTFProjecao03;
    private javax.swing.JTextField jTFProjecao10;
    private javax.swing.JTextField jTFProjecao11;
    private javax.swing.JTextField jTFProjecao12;
    private javax.swing.JTextField jTFProjecao13;
    private javax.swing.JTextField jTFProjecao20;
    private javax.swing.JTextField jTFProjecao21;
    private javax.swing.JTextField jTFProjecao22;
    private javax.swing.JTextField jTFProjecao23;
    private javax.swing.JTextField jTFProjecao30;
    private javax.swing.JTextField jTFProjecao31;
    private javax.swing.JTextField jTFProjecao32;
    private javax.swing.JTextField jTFProjecao33;
    private javax.swing.JTextField jTFTamanho;
    private javax.swing.JTextField jTFTransfCamera00;
    private javax.swing.JTextField jTFTransfCamera01;
    private javax.swing.JTextField jTFTransfCamera02;
    private javax.swing.JTextField jTFTransfCamera03;
    private javax.swing.JTextField jTFTransfCamera10;
    private javax.swing.JTextField jTFTransfCamera11;
    private javax.swing.JTextField jTFTransfCamera12;
    private javax.swing.JTextField jTFTransfCamera13;
    private javax.swing.JTextField jTFTransfCamera20;
    private javax.swing.JTextField jTFTransfCamera21;
    private javax.swing.JTextField jTFTransfCamera22;
    private javax.swing.JTextField jTFTransfCamera23;
    private javax.swing.JTextField jTFTransfCamera30;
    private javax.swing.JTextField jTFTransfCamera31;
    private javax.swing.JTextField jTFTransfCamera32;
    private javax.swing.JTextField jTFTransfCamera33;
    private javax.swing.JTextField jTFTransfModel00;
    private javax.swing.JTextField jTFTransfModel01;
    private javax.swing.JTextField jTFTransfModel02;
    private javax.swing.JTextField jTFTransfModel03;
    private javax.swing.JTextField jTFTransfModel10;
    private javax.swing.JTextField jTFTransfModel11;
    private javax.swing.JTextField jTFTransfModel12;
    private javax.swing.JTextField jTFTransfModel13;
    private javax.swing.JTextField jTFTransfModel20;
    private javax.swing.JTextField jTFTransfModel21;
    private javax.swing.JTextField jTFTransfModel22;
    private javax.swing.JTextField jTFTransfModel23;
    private javax.swing.JTextField jTFTransfModel30;
    private javax.swing.JTextField jTFTransfModel31;
    private javax.swing.JTextField jTFTransfModel32;
    private javax.swing.JTextField jTFTransfModel33;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField114;
    private javax.swing.JTextField jTextField116;
    private javax.swing.JTextField jTextField117;
    private javax.swing.JTextField jTextField118;
    private javax.swing.JTextField jTextField119;
    private javax.swing.JTextField jTextField120;
    private javax.swing.JTextField jTextField122;
    private javax.swing.JTextField jTextField124;
    private javax.swing.JTextField jTextField125;
    private javax.swing.JTextField jTextField126;
    private javax.swing.JTextField jTextField127;
    private javax.swing.JTextField jTextField128;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField131;
    private javax.swing.JTextField jTextField132;
    private javax.swing.JTextField jTextField135;
    private javax.swing.JTextField jTextField136;
    private javax.swing.JTextField jTextField137;
    private javax.swing.JTextField jTextField138;
    private javax.swing.JTextField jTextField139;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField140;
    private javax.swing.JTextField jTextField141;
    private javax.swing.JTextField jTextField142;
    private javax.swing.JTextField jTextField143;
    private javax.swing.JTextField jTextField144;
    private javax.swing.JTextField jTextField146;
    private javax.swing.JTextField jTextField147;
    private javax.swing.JTextField jTextField148;
    private javax.swing.JTextField jTextField149;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField151;
    private javax.swing.JTextField jTextField152;
    private javax.swing.JTextField jTextField153;
    private javax.swing.JTextField jTextField154;
    private javax.swing.JTextField jTextField156;
    private javax.swing.JTextField jTextField157;
    private javax.swing.JTextField jTextField158;
    private javax.swing.JTextField jTextField159;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField160;
    private javax.swing.JTextField jTextField161;
    private javax.swing.JTextField jTextField162;
    private javax.swing.JTextField jTextField163;
    private javax.swing.JTextField jTextField164;
    private javax.swing.JTextField jTextField165;
    private javax.swing.JTextField jTextField168;
    private javax.swing.JTextField jTextField169;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField172;
    private javax.swing.JTextField jTextField173;
    private javax.swing.JTextField jTextField174;
    private javax.swing.JTextField jTextField175;
    private javax.swing.JTextField jTextField176;
    private javax.swing.JTextField jTextField178;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField180;
    private javax.swing.JTextField jTextField181;
    private javax.swing.JTextField jTextField182;
    private javax.swing.JTextField jTextField183;
    private javax.swing.JTextField jTextField184;
    private javax.swing.JTextField jTextField186;
    private javax.swing.JTextField jTextField188;
    private javax.swing.JTextField jTextField189;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField190;
    private javax.swing.JTextField jTextField191;
    private javax.swing.JTextField jTextField192;
    private javax.swing.JTextField jTextField195;
    private javax.swing.JTextField jTextField196;
    private javax.swing.JTextField jTextField199;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField200;
    private javax.swing.JTextField jTextField201;
    private javax.swing.JTextField jTextField202;
    private javax.swing.JTextField jTextField203;
    private javax.swing.JTextField jTextField204;
    private javax.swing.JTextField jTextField205;
    private javax.swing.JTextField jTextField206;
    private javax.swing.JTextField jTextField207;
    private javax.swing.JTextField jTextField208;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
