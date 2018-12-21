/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeEventRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EventEnterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author jo-ji
 */
public class FundraiserEvents extends javax.swing.JPanel {

    /**
     * Creates new form FundraiserEvents
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Network network;

    public FundraiserEvents(JPanel userProcessContainer, Enterprise enterprise, Network network) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        pieBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(119, 155, 212));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Street", "City", "State", "Zipcode", "Budget", "Funds Collected"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        pieBtn.setText("Generate Bar Chart");
        pieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(200, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pieBtn)
                        .addGap(190, 190, 190))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(pieBtn))
                .addContainerGap(476, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieBtnActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // dataset.setValue(80, "M", "M");
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {

            //System.out.println(e.getName() + "---" + e.getEnterpriseType().equals(Enterprise.EnterpriseType.Camp));
            if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Event)) {
                EventEnterprise ep = (EventEnterprise) e;
                // System.out.println(ep.getFundsCollected());
                //System.out.println();
                if (ep.getFundsCollected() != 0) {
                    dataset.setValue(ep.getFundsCollected(), "Funds Collected", ep.getName());
                }
            }
        }

        JFreeChart chart = ChartFactory.createBarChart("Funds Collected Per Camp", "Event Camp Name", "Total Funds", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame = new ChartFrame("Plot for Most Affected People in Different Areas", chart);
        frame.setVisible(true);
        frame.setSize(450, 350);
    }//GEN-LAST:event_pieBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pieBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        int count = 0;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enter.getEnterpriseType().equals(Enterprise.EnterpriseType.Event)) {
                if (count != 0) {
                    EventEnterprise event = (EventEnterprise) enter;
                    Object[] row = new Object[7];
                    row[0] = event;
                    row[1] = event.getStreet();;
                    row[2] = event.getCity();
                    row[3] = event.getState();
                    row[4] = event.getZipcode();
                    row[5] = event.getBudgetCount();
                    row[6] = event.getFundsCollected();
                    model.addRow(row);
                } else {
                    count++;
                }
            }
        }

    }

}
