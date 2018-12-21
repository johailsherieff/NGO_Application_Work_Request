package userinterface.AdministrativeEventRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminWorkEventAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    EcoSystem ecosystem;
    Network network;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public AdminWorkEventAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, Network network, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.ecosystem = ecosystem;
        this.network = network;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        userJButton2 = new javax.swing.JButton();
        userJButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        userJButton1 = new javax.swing.JButton();
        userJButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(119, 155, 212));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 180, -1));

        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 190, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 30));
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 130, 20));

        userJButton2.setText("Patient Fund Requests");
        userJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButton2ActionPerformed(evt);
            }
        });
        add(userJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 180, -1));

        userJButton3.setText("Manage User");
        userJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButton3ActionPerformed(evt);
            }
        });
        add(userJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 180, -1));

        jButton1.setText("Fundraiser Events");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 180, -1));

        userJButton1.setText("Sponsor Approval");
        userJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButton1ActionPerformed(evt);
            }
        });
        add(userJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 180, -1));

        userJButton4.setText("Volunteer Approval");
        userJButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButton4ActionPerformed(evt);
            }
        });
        add(userJButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void userJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButton2ActionPerformed
        // TODO add your handling code here:
        FundRequests mPanel = new FundRequests(userProcessContainer, enterprise, account, network, ecosystem);
        userProcessContainer.add("ManageUserAccountJPanel", mPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButton2ActionPerformed

    private void userJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButton3ActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel manageUserAccountJPanel = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", manageUserAccountJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FundraiserEvents jPanel = new FundraiserEvents(userProcessContainer, enterprise, network);
        userProcessContainer.add("ManageUserAccountJPanel", jPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButton1ActionPerformed
        // TODO add your handling code here:
        SponsorApprovalJPanel sponsorApprovalJPanel = new SponsorApprovalJPanel(userProcessContainer, enterprise, account);
        userProcessContainer.add("SponsorApprovalJPanel", sponsorApprovalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButton1ActionPerformed

    private void userJButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButton4ActionPerformed
        // TODO add your handling code here:
        VolunteerApprovalJPanel volunteerApprovalJPanel = new VolunteerApprovalJPanel(userProcessContainer, enterprise, account);
        userProcessContainer.add("VolunteerApprovalJPanel", volunteerApprovalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton1;
    private javax.swing.JButton userJButton2;
    private javax.swing.JButton userJButton3;
    private javax.swing.JButton userJButton4;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
