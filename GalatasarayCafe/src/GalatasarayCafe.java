/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author by101
 */
public class GalatasarayCafe extends javax.swing.JFrame {

    public double hesap = 0;

    /**
     * Creates new form GalatasarayCafe
     */
    public GalatasarayCafe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        chcsu = new javax.swing.JCheckBox();
        chccay = new javax.swing.JCheckBox();
        chckahve = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        chcmozaik = new javax.swing.JCheckBox();
        chcprofiterol = new javax.swing.JCheckBox();
        chctrilice = new javax.swing.JCheckBox();
        chccheescake = new javax.swing.JCheckBox();
        btnsiparis = new javax.swing.JButton();
        lblsiparisozeti = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        chcpatso = new javax.swing.JCheckBox();
        chctost = new javax.swing.JCheckBox();
        chchamburger = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        chcmısır = new javax.swing.JCheckBox();
        chccerez = new javax.swing.JCheckBox();
        chcdinleti = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        chcnargile = new javax.swing.JCheckBox();
        lblpara = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Galatasaray");

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("içecekler");

        chcsu.setForeground(new java.awt.Color(255, 255, 0));
        chcsu.setText("Su(5TL)");
        chcsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcsuActionPerformed(evt);
            }
        });

        chccay.setForeground(new java.awt.Color(255, 255, 0));
        chccay.setText("Çay(10TL)");
        chccay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chccayActionPerformed(evt);
            }
        });

        chckahve.setForeground(new java.awt.Color(255, 255, 0));
        chckahve.setText("Kahve(25TL)");
        chckahve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckahveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chcsu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chccay, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chckahve)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chcsu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chccay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chckahve)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        jLabel4.setBackground(new java.awt.Color(255, 255, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Pastalar");

        chcmozaik.setForeground(new java.awt.Color(255, 255, 0));
        chcmozaik.setText("Mozaik(90TL)");
        chcmozaik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcmozaikActionPerformed(evt);
            }
        });

        chcprofiterol.setForeground(new java.awt.Color(255, 255, 0));
        chcprofiterol.setText("Profiterol(100TL)");
        chcprofiterol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcprofiterolActionPerformed(evt);
            }
        });

        chctrilice.setForeground(new java.awt.Color(255, 255, 0));
        chctrilice.setText("Triliçe(90TL)");
        chctrilice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chctriliceActionPerformed(evt);
            }
        });

        chccheescake.setForeground(new java.awt.Color(255, 255, 0));
        chccheescake.setText("CheesCake(100TL)");
        chccheescake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chccheescakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chcmozaik, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chcprofiterol))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chctrilice, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chccheescake)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chcmozaik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chcprofiterol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chctrilice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chccheescake)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btnsiparis.setBackground(new java.awt.Color(255, 255, 0));
        btnsiparis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnsiparis.setForeground(new java.awt.Color(255, 0, 0));
        btnsiparis.setText("Sipariş Ver");
        btnsiparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiparisActionPerformed(evt);
            }
        });

        lblsiparisozeti.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblsiparisozeti.setForeground(new java.awt.Color(255, 0, 0));
        lblsiparisozeti.setText("Sipariş Özeti : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnsiparis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblsiparisozeti))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsiparis)
                    .addComponent(lblsiparisozeti))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Cafe");

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        chcpatso.setForeground(new java.awt.Color(255, 0, 0));
        chcpatso.setText("Patso(70TL)");
        chcpatso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcpatsoActionPerformed(evt);
            }
        });

        chctost.setForeground(new java.awt.Color(255, 0, 0));
        chctost.setText("Tost(50TL)");
        chctost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chctostActionPerformed(evt);
            }
        });

        chchamburger.setForeground(new java.awt.Color(255, 0, 0));
        chchamburger.setText("Hamburger(200TL)");
        chchamburger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chchamburgerActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Atıştırmalık");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chchamburger)
                    .addComponent(chctost, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addComponent(chcpatso, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chctost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chchamburger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chcpatso)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 0));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        chcmısır.setForeground(new java.awt.Color(255, 0, 0));
        chcmısır.setText("Mısır(100TL)");
        chcmısır.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcmısırActionPerformed(evt);
            }
        });

        chccerez.setForeground(new java.awt.Color(255, 0, 0));
        chccerez.setText("Çerez Tabağı(100TL)");
        chccerez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chccerezActionPerformed(evt);
            }
        });

        chcdinleti.setForeground(new java.awt.Color(255, 0, 0));
        chcdinleti.setText("Dinleti(100TL)");
        chcdinleti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcdinletiActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Diğer");

        chcnargile.setForeground(new java.awt.Color(255, 0, 0));
        chcnargile.setText("Nargile(150TL)");
        chcnargile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcnargileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chcmısır, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addComponent(chcdinleti, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chccerez)
                    .addComponent(chcnargile))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chccerez)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chcdinleti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chcmısır)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chcnargile)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        lblpara.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblpara.setForeground(new java.awt.Color(255, 255, 0));
        lblpara.setText("0 TL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblpara, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblpara)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsiparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiparisActionPerformed
        // TODO add your handling code here:
        double hesap = 0;
        if (chcsu.isSelected()) {
            hesap += 5;
        }
        if (chccay.isSelected()) {
            hesap += 10;
        }
        if (chckahve.isSelected()) {
            hesap += 25;
        }
        if (chccheescake.isSelected()) {
            hesap += 100;
        }
        if (chcprofiterol.isSelected()) {
            hesap += 100;
        }
        if (chctrilice.isSelected()) {
            hesap += 90;
        }
        if (chcmozaik.isSelected()) {
            hesap += 90;
        }
        if (chctost.isSelected()) {
            hesap += 50;
        }
        if (chchamburger.isSelected()) {
            hesap += 200;
        }
        if (chcpatso.isSelected()) {
            hesap += 70;
        }
        if (chccerez.isSelected()) {
            hesap += 100;
        }
        if (chcdinleti.isSelected()) {
            hesap += 100;
        }
        if (chcmısır.isSelected()) {
            hesap += 100;
        }
        if (chcnargile.isSelected()) {
            hesap += 150;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_btnsiparisActionPerformed

    private void chcsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcsuActionPerformed
        // TODO add your handling code here:
        if (chcsu.isSelected()) {
            hesap += 5;
        } else {
            hesap -= 5;
        }
        lblpara.setText(hesap + " TL");

    }//GEN-LAST:event_chcsuActionPerformed

    private void chccayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chccayActionPerformed
        // TODO add your handling code here:
        if (chccay.isSelected()) {
            hesap += 10;
        } else {
            hesap -= 10;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_chccayActionPerformed

    private void chckahveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckahveActionPerformed
        // TODO add your handling code here:
         if (chckahve.isSelected()) {
            hesap += 25;
        } else {
            hesap -= 25;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_chckahveActionPerformed

    private void chctostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chctostActionPerformed
        // TODO add your handling code here:
        if (chctost.isSelected()) {
            hesap += 50;
        } else {
            hesap -= 50;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_chctostActionPerformed

    private void chchamburgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chchamburgerActionPerformed
        // TODO add your handling code here:
        if (chchamburger.isSelected()) {
            hesap += 200;
        } else {
            hesap -= 200;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_chchamburgerActionPerformed

    private void chcpatsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcpatsoActionPerformed
        // TODO add your handling code here:
        if (chcpatso.isSelected()) {
            hesap += 70;
        } else {
            hesap -= 70;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_chcpatsoActionPerformed

    private void chcmozaikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcmozaikActionPerformed
        // TODO add your handling code here:
        if (chcmozaik.isSelected()) {
            hesap += 90;
        } else {
            hesap -= 90;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_chcmozaikActionPerformed

    private void chcprofiterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcprofiterolActionPerformed
        // TODO add your handling code here:
         if (chcprofiterol.isSelected()) {
            hesap += 100;
        } else {
            hesap -= 100;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_chcprofiterolActionPerformed

    private void chctriliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chctriliceActionPerformed
        // TODO add your handling code here:
         if (chctrilice.isSelected()) {
            hesap += 90;
        } else {
            hesap -= 90;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_chctriliceActionPerformed

    private void chccheescakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chccheescakeActionPerformed
        // TODO add your handling code here:
         if (chccheescake.isSelected()) {
            hesap += 100;
        } else {
            hesap -= 100;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_chccheescakeActionPerformed

    private void chccerezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chccerezActionPerformed
        // TODO add your handling code here:
         if (chccerez.isSelected()) {
            hesap += 100;
        } else {
            hesap -= 100;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_chccerezActionPerformed

    private void chcdinletiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcdinletiActionPerformed
        // TODO add your handling code here:
           if (chcdinleti.isSelected()) {
            hesap += 100;
        } else {
            hesap -= 100;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_chcdinletiActionPerformed

    private void chcmısırActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcmısırActionPerformed
        // TODO add your handling code here:
         if (chcmısır.isSelected()) {
            hesap += 100;
        } else {
            hesap -= 100;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_chcmısırActionPerformed

    private void chcnargileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcnargileActionPerformed
        // TODO add your handling code here:
         if (chcnargile.isSelected()) {
            hesap += 150;
        } else {
            hesap -= 150;
        }
        lblpara.setText(hesap + " TL");
    }//GEN-LAST:event_chcnargileActionPerformed

 
  

   
 
 

    

  

    

   

    

   

  

  
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
            java.util.logging.Logger.getLogger(GalatasarayCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GalatasarayCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GalatasarayCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GalatasarayCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GalatasarayCafe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsiparis;
    private javax.swing.JCheckBox chccay;
    private javax.swing.JCheckBox chccerez;
    private javax.swing.JCheckBox chccheescake;
    private javax.swing.JCheckBox chcdinleti;
    private javax.swing.JCheckBox chchamburger;
    private javax.swing.JCheckBox chckahve;
    private javax.swing.JCheckBox chcmozaik;
    private javax.swing.JCheckBox chcmısır;
    private javax.swing.JCheckBox chcnargile;
    private javax.swing.JCheckBox chcpatso;
    private javax.swing.JCheckBox chcprofiterol;
    private javax.swing.JCheckBox chcsu;
    private javax.swing.JCheckBox chctost;
    private javax.swing.JCheckBox chctrilice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblpara;
    private javax.swing.JLabel lblsiparisozeti;
    // End of variables declaration//GEN-END:variables
}
