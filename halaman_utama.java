/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apl_laundry;
import javax.swing.JOptionPane;

/**
 *
 * @author RPL
 */
public class halaman_utama extends javax.swing.JFrame {
     private String role;
    public void setrole(String l){
        role=l;
        if(role.equals("admin")){
        
        } else if (role.equals("kasir")){
            mnoutlet.hide();
            mnproduk.hide();
            mnpengguna.hide();
            mnlap.hide();
        } else if (role.equals("owner")){
            regpel.hide();
            mnoutlet.hide();
            mnproduk.hide();
            mnpengguna.hide();
            pem.hide();
            mnmaster.hide();
            mntran.hide();
        } else {
            JOptionPane.showMessageDialog(null, "level tidak ditemukan");
        } 
    }

    /**
     * Creates new form halaman_utama
     */
    public halaman_utama() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menulogin = new javax.swing.JMenuItem();
        mnlogout = new javax.swing.JMenuItem();
        mnmaster = new javax.swing.JMenu();
        regpel = new javax.swing.JMenuItem();
        mnoutlet = new javax.swing.JMenuItem();
        mnproduk = new javax.swing.JMenuItem();
        mnpengguna = new javax.swing.JMenuItem();
        mntran = new javax.swing.JMenu();
        pem = new javax.swing.JMenuItem();
        mnlap = new javax.swing.JMenu();
        dt = new javax.swing.JMenuItem();
        mnexit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apl_laundry/lon.jpg"))); // NOI18N

        jMenu1.setText("Login");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menulogin.setText("Login");
        menulogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuloginActionPerformed(evt);
            }
        });
        jMenu1.add(menulogin);

        mnlogout.setText("Logout");
        mnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnlogoutActionPerformed(evt);
            }
        });
        jMenu1.add(mnlogout);

        jMenuBar1.add(jMenu1);

        mnmaster.setText("Master Data");

        regpel.setText("Registrasi Pelanggan");
        regpel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regpelActionPerformed(evt);
            }
        });
        mnmaster.add(regpel);

        mnoutlet.setText("Outlet");
        mnoutlet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoutletActionPerformed(evt);
            }
        });
        mnmaster.add(mnoutlet);

        mnproduk.setText("Produk");
        mnproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnprodukActionPerformed(evt);
            }
        });
        mnmaster.add(mnproduk);

        mnpengguna.setText("Pengguna");
        mnpengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnpenggunaActionPerformed(evt);
            }
        });
        mnmaster.add(mnpengguna);

        jMenuBar1.add(mnmaster);

        mntran.setText("Transaksi");

        pem.setText("Pembayaran");
        pem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemActionPerformed(evt);
            }
        });
        mntran.add(pem);

        jMenuBar1.add(mntran);

        mnlap.setText("Laporan");
        mnlap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnlapActionPerformed(evt);
            }
        });

        dt.setText("data laporan");
        dt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtActionPerformed(evt);
            }
        });
        mnlap.add(dt);

        jMenuBar1.add(mnlap);

        mnexit.setText("Exit");
        mnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnexitActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnexit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(609, 358));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnlogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnlogoutActionPerformed

    private void menuloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuloginActionPerformed
        // TODO add your handling code here:
        login log=new login();
        log.show();
        halaman_utama utm=new halaman_utama();
        utm.dispose();
    }//GEN-LAST:event_menuloginActionPerformed

    private void mnoutletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoutletActionPerformed
        // TODO add your handling code here:
        form_outlet outlet=new form_outlet();
        outlet.show();
    }//GEN-LAST:event_mnoutletActionPerformed

    private void regpelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regpelActionPerformed
        // TODO add your handling code here:
        form_member member=new form_member();
        member.show();
    }//GEN-LAST:event_regpelActionPerformed

    private void mnprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnprodukActionPerformed
        // TODO add your handling code here:
        form_paket paket=new form_paket();
        paket.show();
    }//GEN-LAST:event_mnprodukActionPerformed

    private void mnpenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnpenggunaActionPerformed
        // TODO add your handling code here:
        form_user user=new form_user();
        user.show();
    }//GEN-LAST:event_mnpenggunaActionPerformed

    private void pemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemActionPerformed
        // TODO add your handling code here:
        form_transaksi transaksi=new form_transaksi();
        transaksi.show();
    }//GEN-LAST:event_pemActionPerformed

    private void mnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnexitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_mnexitActionPerformed

    private void mnlapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnlapActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnlapActionPerformed

    private void dtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtActionPerformed
        // TODO add your handling code here:
        laporan lap = new laporan();
        lap.show(); 
    }//GEN-LAST:event_dtActionPerformed

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
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halaman_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem dt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menulogin;
    private javax.swing.JMenu mnexit;
    private javax.swing.JMenu mnlap;
    private javax.swing.JMenuItem mnlogout;
    private javax.swing.JMenu mnmaster;
    private javax.swing.JMenuItem mnoutlet;
    private javax.swing.JMenuItem mnpengguna;
    private javax.swing.JMenuItem mnproduk;
    private javax.swing.JMenu mntran;
    private javax.swing.JMenuItem pem;
    private javax.swing.JMenuItem regpel;
    // End of variables declaration//GEN-END:variables
}
