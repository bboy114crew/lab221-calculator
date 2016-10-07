package com.fpt.lab221.gui;

import com.fpt.lab221.bo.Caculator;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NgT
 */
public class Calc extends javax.swing.JFrame {

    private BigDecimal currentValue = BigDecimal.ZERO;
    private BigDecimal savedValue = BigDecimal.ZERO;
    private boolean initValue = true;
    private boolean doInitValue = true;
    private char commandCode = '=';
    private char commandCodeOld = '=';
    BigDecimal memoryValue = BigDecimal.ZERO;
    private String text;
    private final String template
            = "<html>"
            + "  <head>"
            + "  </head>"
            + "  <body>"
            + "    <p style=\"text-align:right;font-size:14px;margin-top: 0\">"
            + "     %s"
            + "    </p>"
            + "  </body>"
            + "</html>";

    /**
     * Creates new form Calc
     */
    public Calc() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        initCalc();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMR = new javax.swing.JButton();
        btnMAdd = new javax.swing.JButton();
        btnMMinus = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnAddMinus = new javax.swing.JButton();
        btnSquare = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnPercent = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnComma = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        btnOneDivideX = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextPane();
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        btnMR.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnMR.setText("MR");
        btnMR.setFocusable(false);
        btnMR.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRActionPerformed(evt);
            }
        });

        btnMAdd.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnMAdd.setText("M+");
        btnMAdd.setFocusable(false);
        btnMAdd.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnMAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAddActionPerformed(evt);
            }
        });

        btnMMinus.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnMMinus.setText("M-");
        btnMMinus.setFocusable(false);
        btnMMinus.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnMMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMMinusActionPerformed(evt);
            }
        });

        btnCE.setText("CE");
        btnCE.setFocusable(false);
        btnCE.setMargin(new java.awt.Insets(2, -1, 2, -1));
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnAddMinus.setText("±");
        btnAddMinus.setFocusable(false);
        btnAddMinus.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnAddMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMinusActionPerformed(evt);
            }
        });

        btnSquare.setText("√");
        btnSquare.setFocusable(false);
        btnSquare.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareActionPerformed(evt);
            }
        });

        btnSeven.setText("7");
        btnSeven.setFocusable(false);
        btnSeven.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnEight.setText("8");
        btnEight.setFocusable(false);
        btnEight.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnNine.setText("9");
        btnNine.setFocusable(false);
        btnNine.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnDivide.setText("/");
        btnDivide.setFocusable(false);
        btnDivide.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        btnPercent.setText("%");
        btnPercent.setFocusable(false);
        btnPercent.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentActionPerformed(evt);
            }
        });

        btnFour.setText("4");
        btnFour.setFocusable(false);
        btnFour.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setText("5");
        btnFive.setFocusable(false);
        btnFive.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setText("6");
        btnSix.setFocusable(false);
        btnSix.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnMultiply.setText("*");
        btnMultiply.setFocusable(false);
        btnMultiply.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });

        btnOne.setText("1");
        btnOne.setFocusable(false);
        btnOne.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setText("2");
        btnTwo.setFocusable(false);
        btnTwo.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnThree.setText("3");
        btnThree.setFocusable(false);
        btnThree.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnMinus.setText("-");
        btnMinus.setFocusable(false);
        btnMinus.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnEqual.setText("=");
        btnEqual.setFocusable(false);
        btnEqual.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnZero.setText("0");
        btnZero.setFocusable(false);
        btnZero.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnComma.setText(".");
        btnComma.setFocusable(false);
        btnComma.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnComma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommaActionPerformed(evt);
            }
        });

        btnAdd.setText("+");
        btnAdd.setFocusable(false);
        btnAdd.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnMC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnMC.setText("MC");
        btnMC.setFocusable(false);
        btnMC.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCActionPerformed(evt);
            }
        });

        btnOneDivideX.setText("1/x");
        btnOneDivideX.setFocusable(false);
        btnOneDivideX.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnOneDivideX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneDivideXActionPerformed(evt);
            }
        });

        txtResult.setEditable(false);
        txtResult.setContentType("text/html"); // NOI18N
        txtResult.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtResult.setText("<html>\r\n  <head>\r\n\r  </head>\r\n  <body>\r\n    <p style=\"text-align:right;font-size:10px;margin-top: 0\">\r\n    </p>\r\n    <p style=\"text-align:right;font-size:16px;margin-top: 0\">\n     0\n    </p>\n  </body>\r\n</html>\r\n");
        txtResult.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtResult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtResultKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResultKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtResult);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(btnMC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnMR, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnMAdd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnMMinus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(btnSquare, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnCE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(btnSeven, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnEight, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnNine, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnDivide, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(btnFour, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnFive, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnSix, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnMultiply, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(btnOne, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(btnZero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(btnTwo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(btnAddMinus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(6, 6, 6)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(btnThree, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(btnComma, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(btnMinus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(btnAdd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(btnPercent, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnOneDivideX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnEqual, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(btnCE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnMR)
                    .add(btnMAdd)
                    .add(btnMMinus)
                    .add(btnMC)
                    .add(btnSquare))
                .add(7, 7, 7)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(29, 29, 29)
                        .add(btnPercent)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnEqual, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnSeven)
                            .add(btnEight)
                            .add(btnNine)
                            .add(btnDivide)
                            .add(btnOneDivideX))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnFour)
                            .add(btnFive)
                            .add(btnSix)
                            .add(btnMultiply))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnMinus)
                            .add(btnThree)
                            .add(btnTwo)
                            .add(btnOne))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnAdd)
                            .add(btnComma)
                            .add(btnZero)
                            .add(btnAddMinus))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setText(String text) {
        this.text = text;
        txtResult.setText(String.format(template, text));

    }

    private String getText() {
        return text;
    }

    private void addCalc(java.awt.event.ActionEvent evt) {
        if (initValue) {
            if (evt.getActionCommand().equals(".")) {
                setText("0" + evt.getActionCommand());
            } else {
                setText(evt.getActionCommand());
            }
        } else {
            setText(getText() + evt.getActionCommand());
        }
        if (commandCode == '=') {
            savedValue = new BigDecimal(getText());
            currentValue = BigDecimal.ZERO;
        } else {
            currentValue = new BigDecimal(getText());
        }
        initValue = false;
    }

    private void initCalc() {
        currentValue = BigDecimal.ZERO;
        savedValue = BigDecimal.ZERO;
        initValue = true;
        doInitValue = true;
        commandCode = '=';
        setText("0");
    }

    /**
     *
     * @param command
     */
    private void fCalc(String command) {
        if ("ce".equals(command)) {
            initCalc();
        } else if ("=".equals(command)) {
            try {

                if (commandCode != '=' && !initValue) {
                    BigDecimal value = new BigDecimal(getText());
                    BigDecimal result = calcResult(value);
                    commandCode = '=';
                    setText(result.setScale(16, BigDecimal.ROUND_HALF_UP).toPlainString()
                            .replaceFirst("0+$", "").replaceFirst(",$", ""));

                } else {
                    BigDecimal value = new BigDecimal(getText());
                    BigDecimal result = null;
                    switch (commandCodeOld) {
                        case '+':
                            result = value.add(currentValue);
                            break;
                        case '-':
                            result = value.subtract(currentValue);
                            break;
                        case '*':
                            result = value.multiply(currentValue);
                            break;
                        case '/':
                            try {
                                result = value.divide(currentValue, 16, BigDecimal.ROUND_HALF_UP);
                            } catch (ArithmeticException ex) {
                                initCalc();
                                setText("Error");
                            }
//                            result = value.divide(currentValue);
                            break;
                        default:
                            result = value;
                            break;

                    }
                    setText(result.setScale(16, BigDecimal.ROUND_HALF_UP).toPlainString()
                            .replaceFirst("0+$", "").replaceFirst(",$", ""));

                    savedValue = result;
                    commandCode = '=';
                }

            } catch (Exception e) {
            }

        } else if ("+-".equals(command)) {
            currentValue = new BigDecimal(getText());
            currentValue = currentValue.multiply(new BigDecimal("-1"));
            setText(currentValue.toString());
            if (commandCode == '=') {
                savedValue = currentValue;
                currentValue = BigDecimal.ZERO;
            }
            doInitValue = false;
        } else if ("sqrt".equals(command)) {
            if (getText().equals("0")) {
                setText("0");
                return;
            }
            currentValue = new BigDecimal(getText());
            try {
                currentValue = Caculator.sqrt(currentValue);
                if (currentValue == null) {
                    initCalc();
                    setText("Errors");

                } else {
                    setText(currentValue.setScale(16, BigDecimal.ROUND_HALF_UP).toPlainString()
                            .replaceFirst("(.+?)0+$", "$1").replaceFirst(",$", ""));
                    if (commandCode == '=') {
                        savedValue = currentValue;
                        currentValue = BigDecimal.ZERO;
                    }
                    doInitValue = true;
                }

            } catch (Exception ex) {
                initCalc();
                setText("Errors");

            }

        } else if ("+".equals(command)) {
            String saveText = getText();
            if (commandCode != '=' && !initValue) {
                BigDecimal value = new BigDecimal(getText());
                BigDecimal result = calcResult(value);
                setText(result.setScale(16, BigDecimal.ROUND_HALF_UP).toPlainString()
                            .replaceFirst("0+$", "").replaceFirst(",$", ""));
                savedValue = result;
                currentValue = BigDecimal.ZERO;

            } else {
                BigDecimal value = new BigDecimal(getText());
                savedValue = value;
            }
            commandCode = '+';
            commandCodeOld = '+';
        } else if ("-".equals(command)) {
            String saveText = getText();
            if (commandCode != '=' && !initValue) {
                BigDecimal value = new BigDecimal(getText());
                BigDecimal result = calcResult(value);
                setText(result.setScale(16, BigDecimal.ROUND_HALF_UP).toPlainString()
                            .replaceFirst("0+$", "").replaceFirst(",$", ""));
                savedValue = result;
                currentValue = BigDecimal.ZERO;
            } else {
                BigDecimal value = new BigDecimal(getText());
                savedValue = value;
            }
            commandCode = '-';
            commandCodeOld = '-';
        } else if ("*".equals(command)) {
            String saveText = getText();
            if (commandCode != '=' && !initValue) {
                BigDecimal value = new BigDecimal(getText());
                BigDecimal result = calcResult(value);
                setText(result.setScale(16, BigDecimal.ROUND_HALF_UP).toPlainString()
                            .replaceFirst("0+$", "").replaceFirst(",$", ""));
                savedValue = result;
                currentValue = BigDecimal.ZERO;
            } else {
                BigDecimal value = new BigDecimal(getText());
                savedValue = value;
            }
            commandCode = '*';
            commandCodeOld = '*';
        } else if ("/".equals(command)) {
            String saveText = getText();

            if (commandCode != '=' && !initValue) {

                BigDecimal value = new BigDecimal(getText());
                BigDecimal result = calcResult(value);
                if (result == null) {
                    setText("Errors");
                    initCalc();
                } else {
                    setText(result.setScale(16, BigDecimal.ROUND_HALF_UP).toPlainString()
                            .replaceFirst("(.+?)0+$", "$1").replaceFirst(",$", ""));
                    savedValue = result;
                    currentValue = BigDecimal.ZERO;

                }

            } else {
                BigDecimal value = new BigDecimal(getText());
                savedValue = value;
            }

            commandCode = '/';
            commandCodeOld = '/';
        } else if ("1/x".equals(command)) {
            if (getText().equals("0")) {
                setText("Errors");
                return;
            }
            currentValue = savedValue == BigDecimal.ZERO
                    ? new BigDecimal(getText()) : savedValue;
            try {
                currentValue = BigDecimal.ONE.divide(currentValue, 32, BigDecimal.ROUND_HALF_UP);
            } catch (ArithmeticException ex) {
                ex.getMessage();
            }
            setText(currentValue.setScale(16, BigDecimal.ROUND_HALF_UP).toPlainString()
                    .replaceFirst("(.+?)0+$", "$1").replaceFirst(",$", ""));
            if (commandCode == '=') {
                savedValue = currentValue;
                currentValue = BigDecimal.ZERO;
            }
            doInitValue = true;
        } else if ("%".equals(command)) {
            if (getText().equals("Errors")) {
                return;
            }
            currentValue = new BigDecimal(getText());
            try {
                currentValue = currentValue.divide(new BigDecimal("100"));
            } catch (ArithmeticException ex) {
                ex.getMessage();
            }
            setText(currentValue.setScale(16, BigDecimal.ROUND_HALF_UP).toPlainString()
                    .replaceFirst("(.+?)0+$", "$1").replaceFirst(",$", ""));
            if (commandCode == '=') {
                savedValue = currentValue;
                currentValue = BigDecimal.ZERO;
            }
            doInitValue = true;
        } else if ("MC".equals(command)) {
            memoryValue = BigDecimal.ZERO;
            doInitValue = true;
        } else if ("MR".equals(command)) {
            setText(memoryValue.toPlainString());
            if (commandCode == '=') {
                savedValue = memoryValue;
                currentValue = BigDecimal.ZERO;
                doInitValue = true;
            } else {
                currentValue = memoryValue;
                doInitValue = false;
                initValue = false;
            }
        } else if ("M+".equals(command)) {
            currentValue = new BigDecimal(getText());
            memoryValue = memoryValue.add(currentValue);
            doInitValue = true;
        } else if ("M-".equals(command)) {
            currentValue = new BigDecimal(getText());
            memoryValue = memoryValue.subtract(currentValue);
            doInitValue = true;
        }
        if (doInitValue) {
            initValue = true;
        } else {
            doInitValue = true;
        }
    }

    /**
     *
     * @param evt
     */
    private void keyDetect(java.awt.event.ActionEvent evt) {
        if (getText().length() >= 20) {

            return;
        }
        if (evt.getActionCommand().charAt(0) >= '0' && evt.getActionCommand().charAt(0) <= '9') {
            if (evt.getActionCommand().charAt(0) == '0') {
                if (!initValue) {
                    addCalc(evt);
                } else {
                    setText("0");
                }
            } else {
                addCalc(evt);
            }
        } else if (evt.getActionCommand().charAt(0) == '.') {
            if (getText().equals("Errors")) {
                return;
            }
            if (initValue || !getText().contains(".")) {
                addCalc(evt);
            }
        }
    }

    /**
     *
     * @param value to be calculate
     * @return result
     */
    private BigDecimal calcResult(BigDecimal value) {
        BigDecimal result = BigDecimal.ZERO;
        switch (commandCode) {
            case '+':
                result = savedValue.add(value);
                break;
            case '-':
                result = savedValue.subtract(value);
                break;
            case '*':
                result = savedValue.multiply(value);
                break;
            case '/':
                try {
                    result = savedValue.divide(value, 16, BigDecimal.ROUND_HALF_UP);
                } catch (ArithmeticException ex) {
                    initCalc();
                    setText("Error.");
                    return null;
                }
                break;
        }
        return result;
    }

    private void btnMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRActionPerformed
        if (getText().equals("Errors")) {
            return;
        }
        fCalc("MR");
    }//GEN-LAST:event_btnMRActionPerformed

    private void btnMAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAddActionPerformed
        if (getText().equals("Errors")) {
            return;
        }
        fCalc("M+");
    }//GEN-LAST:event_btnMAddActionPerformed

    private void btnMMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMMinusActionPerformed
        if (getText().equals("Errors")) {
            return;
        }
        fCalc("M-");
    }//GEN-LAST:event_btnMMinusActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        fCalc("ce");
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnAddMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMinusActionPerformed
        if (getText().equals("Errors")) {
            return;
        }
        fCalc("+-");
    }//GEN-LAST:event_btnAddMinusActionPerformed

    private void btnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareActionPerformed
        if (getText().equals("Errors")) {
            return;
        }
        fCalc("sqrt");
    }//GEN-LAST:event_btnSquareActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        keyDetect(evt);
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        keyDetect(evt);
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        if (getText().equals("Errors")) {
            return;
        }
        fCalc("/");
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentActionPerformed
        if (getText().equals("Errors")) {
            return;
        }
        fCalc("%");
    }//GEN-LAST:event_btnPercentActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        keyDetect(evt);
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        keyDetect(evt);
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        fCalc("*");
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        keyDetect(evt);
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        keyDetect(evt);
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        fCalc("-");
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnCommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommaActionPerformed
        keyDetect(evt);
    }//GEN-LAST:event_btnCommaActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        fCalc("+");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        fCalc("=");
    }
        // TODO add your handling code here:}//GEN-LAST:event_btnEqualActionPerformed

    private void btnOneDivideXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneDivideXActionPerformed
        fCalc("1/x");
    }//GEN-LAST:event_btnOneDivideXActionPerformed

    private void txtResultKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultKeyTyped
        if (evt.getKeyChar() == '+' || evt.getKeyChar() == '-' || evt.getKeyChar() == '*'
                || evt.getKeyChar() == '/' || evt.getKeyChar() == '=' || evt.getKeyChar() == '%') {
            fCalc("" + evt.getKeyChar());
        } else if (evt.getKeyChar() == '\n') {
            fCalc("=");
        } else {
            java.awt.event.ActionEvent actionEvent = new java.awt.event.ActionEvent(this, 0, "" 
                    + evt.getKeyChar());
            if (evt.getKeyChar() == '.') {
                actionEvent = new java.awt.event.ActionEvent(this, 0, ",");
            }
            keyDetect(actionEvent);
        }
    }//GEN-LAST:event_txtResultKeyTyped

    private void txtResultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultKeyPressed
        if (evt.getKeyChar() == '\n' || evt.getKeyChar() == '\b') {
            evt.consume();
        }
    }//GEN-LAST:event_txtResultKeyPressed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        keyDetect(evt);
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        keyDetect(evt);
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        keyDetect(evt);
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCActionPerformed
        if (getText().equals("Errors")) {
            return;
        }
        fCalc("MC");
    }//GEN-LAST:event_btnMCActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        keyDetect(evt);
    }//GEN-LAST:event_btnZeroActionPerformed

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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels = javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx = 0; idx < installedLookAndFeels.length; idx++) {
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.
                        getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException |
                    InstantiationException |
                    IllegalAccessException |
                    UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Calc.class.getName()).log(Level.SEVERE, null, ex);
            }
            new Calc().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddMinus;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnComma;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMAdd;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMMinus;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnOneDivideX;
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSquare;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtResult;
    // End of variables declaration//GEN-END:variables

}
