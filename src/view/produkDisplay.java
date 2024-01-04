/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import model.Akun;
import model.Database;
import model.Elektronik;
import model.Makanan;
import model.Minuman;
import model.Produk;
import model.Seller;

/**
 *
 * @author wwwvf
 */
public class produkDisplay extends javax.swing.JDialog {
    static private Produk product;
    static private String productCategory; // Not really needed
    static private Akun user;
    
    /**
     * Creates new form produkDisplay
     */
    public produkDisplay(java.awt.Frame parent, boolean modal, Produk product, Akun user) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        
        // Disable spinner text field
        // https://stackoverflow.com/questions/2902101/how-to-set-jspinner-as-non-editable
        ((DefaultEditor) produkDisplayAmount.getEditor()).getTextField().setEditable(false);
        
        this.product = product;
        this.user = user;
        updateGUI();
    }

    private void updateGUI() {
        System.out.println(user.getImgPath());
        // Seller related update
        if((user instanceof Seller)) {
            produkDisplaySellerDetails.setVisible(false);
            produkDisplayPurchasePanel.setVisible(false);
        } else {
            produkDisplayConfigureProduct.setVisible(false);
            produkDisplaySellerInfo.setText(product.getPenjual().getNo_telepon());
            produkDisplaySellerName.setText(product.getPenjual().getNamaToko());
            Gambar.renderAkun(produkDisplaySellerImg, product.getPenjual().getImgPath());
        }
        
        // Product related update
        if(product instanceof Minuman ) {
            produkDisplayCategory.setText("Minuman");
            produkDisplayTaxPercentage.setText("(1%)");
        } else if(product instanceof Makanan ) {
            produkDisplayCategory.setText("Makanan");
            produkDisplayTaxPercentage.setText("(2%)");
        } else {
            produkDisplayCategory.setText("Elektronik");
            produkDisplayTaxPercentage.setText("(10%)");
        }
        
        Gambar.renderProduk(produkDisplayImg, product.getImgPath());
        produkDisplayName.setText(product.getNamaProduk());
        produkDisplayPrice.setText(String.valueOf(product.getHargaProduk()));
        produkDisplayStock.setText(String.valueOf(product.getStok()));
        produkDisplayDescription.setText(product.getDeskripsiProduk());

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        produkDisplayImg = new javax.swing.JLabel();
        produkDisplayName = new javax.swing.JLabel();
        produkDisplaySellerDetails = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        produkDisplaySellerImg = new javax.swing.JLabel();
        produkDisplaySellerName = new javax.swing.JLabel();
        produkDisplaySellerInfo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        produkDisplayCategory = new javax.swing.JLabel();
        produkDisplayPrice = new javax.swing.JLabel();
        produkDisplayStock = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        produkDisplayDescription = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        dashboardTitle = new javax.swing.JLabel();
        produkDisplayPurchasePanel = new javax.swing.JPanel();
        produkDisplayPurchaseButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        produkDisplayGrandTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        produkDisplayAmount = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        displayProdukPackaging = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        produkDisplaySubtotal = new javax.swing.JLabel();
        produkDisplayTax = new javax.swing.JLabel();
        produkDisplayTaxPercentage = new javax.swing.JLabel();
        produkDisplayBackButton = new javax.swing.JButton();
        produkDisplayConfigureProduct = new javax.swing.JButton();
        produkDisplayprice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1619, 778));

        jPanel2.setBackground(new java.awt.Color(255, 225, 54));
        jPanel2.setPreferredSize(new java.awt.Dimension(1920, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setText("Warungpedia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        produkDisplayImg.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(produkDisplayImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(produkDisplayImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        produkDisplayName.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        produkDisplayName.setText("Nama Produk");

        produkDisplaySellerDetails.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        produkDisplaySellerImg.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(produkDisplaySellerImg, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(produkDisplaySellerImg, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        produkDisplaySellerName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        produkDisplaySellerName.setText("Nama Toko");

        produkDisplaySellerInfo.setText("Alamat Toko");

        javax.swing.GroupLayout produkDisplaySellerDetailsLayout = new javax.swing.GroupLayout(produkDisplaySellerDetails);
        produkDisplaySellerDetails.setLayout(produkDisplaySellerDetailsLayout);
        produkDisplaySellerDetailsLayout.setHorizontalGroup(
            produkDisplaySellerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produkDisplaySellerDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(produkDisplaySellerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(produkDisplaySellerName)
                    .addComponent(produkDisplaySellerInfo))
                .addContainerGap(377, Short.MAX_VALUE))
        );
        produkDisplaySellerDetailsLayout.setVerticalGroup(
            produkDisplaySellerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produkDisplaySellerDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(produkDisplaySellerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(produkDisplaySellerDetailsLayout.createSequentialGroup()
                        .addComponent(produkDisplaySellerName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produkDisplaySellerInfo)))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setText("Deskripsi");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("Kategori");

        produkDisplayCategory.setText("jLabel11");

        produkDisplayPrice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        produkDisplayPrice.setText("50.000");

        produkDisplayStock.setText("696969");

        jLabel8.setText("Stok: ");

        produkDisplayDescription.setText("jLabel12");

        jPanel4.setBackground(new java.awt.Color(255, 225, 54));
        jPanel4.setPreferredSize(new java.awt.Dimension(337, 39));

        dashboardTitle.setBackground(new java.awt.Color(255, 225, 54));
        dashboardTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        dashboardTitle.setText("Seputar Produk");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(dashboardTitle)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        produkDisplayPurchasePanel.setBackground(new java.awt.Color(255, 255, 255));
        produkDisplayPurchasePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        produkDisplayPurchaseButton.setBackground(new java.awt.Color(255, 225, 54));
        produkDisplayPurchaseButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        produkDisplayPurchaseButton.setText("Beli");
        produkDisplayPurchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkDisplayPurchaseButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Grand Total");

        produkDisplayGrandTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        produkDisplayGrandTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        produkDisplayGrandTotal.setText("Rp. 0");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Banyak Barang");

        produkDisplayAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        produkDisplayAmount.setEditor(new javax.swing.JSpinner.NumberEditor(produkDisplayAmount, ""));
        produkDisplayAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                produkDisplayAmountStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Kemasan");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Beli Barang");

        displayProdukPackaging.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayProdukPackaging.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("Detail Harga");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel11.setText("Subtotal:");

        jLabel12.setText("Pajak:");

        produkDisplaySubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        produkDisplaySubtotal.setText("Rp. 0");

        produkDisplayTax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        produkDisplayTax.setText("Rp. 0");

        produkDisplayTaxPercentage.setText("(100%)");

        javax.swing.GroupLayout produkDisplayPurchasePanelLayout = new javax.swing.GroupLayout(produkDisplayPurchasePanel);
        produkDisplayPurchasePanel.setLayout(produkDisplayPurchasePanelLayout);
        produkDisplayPurchasePanelLayout.setHorizontalGroup(
            produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produkDisplayPurchasePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produkDisplayPurchasePanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produkDisplayPurchasePanelLayout.createSequentialGroup()
                        .addGroup(produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(produkDisplayPurchasePanelLayout.createSequentialGroup()
                                .addGroup(produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(displayProdukPackaging, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(produkDisplayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produkDisplayPurchasePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addGroup(produkDisplayPurchasePanelLayout.createSequentialGroup()
                                        .addGroup(produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addGroup(produkDisplayPurchasePanelLayout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(produkDisplayTaxPercentage)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                        .addGroup(produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(produkDisplayTax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(produkDisplaySubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                                        .addGap(37, 37, 37)
                                        .addComponent(produkDisplayGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produkDisplayPurchasePanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(produkDisplayPurchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(22, 22, 22))))
        );
        produkDisplayPurchasePanelLayout.setVerticalGroup(
            produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produkDisplayPurchasePanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produkDisplayPurchasePanelLayout.createSequentialGroup()
                        .addGroup(produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(produkDisplayPurchasePanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(produkDisplayGrandTotal))
                            .addGroup(produkDisplayPurchasePanelLayout.createSequentialGroup()
                                .addGroup(produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(produkDisplayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(displayProdukPackaging, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(produkDisplayPurchasePanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(produkDisplaySubtotal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(produkDisplayPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(produkDisplayTax)
                                    .addComponent(produkDisplayTaxPercentage))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(produkDisplayPurchaseButton)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );

        produkDisplayBackButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        produkDisplayBackButton.setText("Kembali");
        produkDisplayBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkDisplayBackButtonActionPerformed(evt);
            }
        });

        produkDisplayConfigureProduct.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        produkDisplayConfigureProduct.setText("Edit Barang");

        produkDisplayprice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        produkDisplayprice.setText("Rp.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1631, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(produkDisplayBackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(produkDisplayConfigureProduct))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(produkDisplayPurchasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(produkDisplayDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(produkDisplayName)
                                .addComponent(produkDisplaySellerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel10)
                                .addComponent(produkDisplayCategory)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(produkDisplayprice)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(produkDisplayPrice))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(produkDisplayStock))))))
                .addContainerGap(454, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(produkDisplayName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produkDisplaySellerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(produkDisplayPrice)
                            .addComponent(produkDisplayprice))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(produkDisplayStock))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produkDisplayDescription)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produkDisplayCategory)))
                .addGap(18, 18, 18)
                .addComponent(produkDisplayPurchasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produkDisplayBackButton)
                    .addComponent(produkDisplayConfigureProduct))
                .addGap(0, 100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void produkDisplayBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkDisplayBackButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_produkDisplayBackButtonActionPerformed

    private void updateReceipt() {
        try {
            int itemCount = ((int) produkDisplayAmount.getValue());
            int subtotal = itemCount*product.getHargaProduk();
            produkDisplaySubtotal.setText(String.format(
                "Rp. %d", subtotal)
            );
            
            int tax;
            if(product instanceof Minuman) tax = itemCount*((Minuman) product).hitungPajak();
            else if(product instanceof Makanan ) tax = itemCount*((Makanan) product).hitungPajak();
            else tax = itemCount*((Elektronik) product).hitungPajak();
            
            produkDisplayTax.setText(String.format(
                "Rp. %d", tax
            ));
            produkDisplayGrandTotal.setText(String.format(
                "Rp. %d", tax + subtotal
            ));
        } catch(ClassCastException e) {
            produkDisplaySubtotal.setText("Rp. -");
            produkDisplayTax.setText("Rp. -");
        }
    }
    private void produkDisplayAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_produkDisplayAmountStateChanged
        int itemCount = (int) produkDisplayAmount.getValue();
        if(itemCount < 0) {
            produkDisplayAmount.setValue(0);
        } else if(itemCount > product.getStok()) {
            produkDisplayAmount.setValue(product.getStok());
        }
        updateReceipt();
    }//GEN-LAST:event_produkDisplayAmountStateChanged

    private void produkDisplayPurchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkDisplayPurchaseButtonActionPerformed
        int itemCount = ((int) produkDisplayAmount.getValue());
        int subtotal = itemCount*product.getHargaProduk();
        int tax;
        
        if(itemCount > 0) {
            if(product instanceof Minuman) tax = itemCount*((Minuman) product).hitungPajak();
            else if(product instanceof Makanan ) tax = itemCount*((Makanan) product).hitungPajak();
            else tax = itemCount*((Elektronik) product).hitungPajak();
            int totalHarga = tax + subtotal;

            try{
                Database db = new Database();
                if(user.getSaldo()>=totalHarga){
                    String sql = String.format("update customer set saldo = %d where email = '%s'",user.getSaldo()-totalHarga,user.getEmail());
                    db.query(sql);
                    JOptionPane.showMessageDialog(null, "Produk berhasil dibeli!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Saldo anda tidak cukup!", "Gagal", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                Seller penjual = product.getPenjual();
                String emailSeller = penjual.getEmail();
                String sql2 = String.format("update seller set saldo = %d where email = '%s'",penjual.getSaldo()+totalHarga,emailSeller);
                db.query(sql2);

                String sql3 = String.format("update produk set stok = %d where nama = '%s' and penjual = '%s'",product.getStok()-itemCount,product.getNamaProduk(),emailSeller);
                db.query(sql3);

            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Kesalahan", JOptionPane.INFORMATION_MESSAGE);
            }
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Anda tidak beli apa-apa", "Perhatian", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_produkDisplayPurchaseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(produkDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(produkDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(produkDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(produkDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                produkDisplay dialog = new produkDisplay(new javax.swing.JFrame(), true, null, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboardTitle;
    private javax.swing.JComboBox<String> displayProdukPackaging;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner produkDisplayAmount;
    private javax.swing.JButton produkDisplayBackButton;
    private javax.swing.JLabel produkDisplayCategory;
    private javax.swing.JButton produkDisplayConfigureProduct;
    private javax.swing.JLabel produkDisplayDescription;
    private javax.swing.JLabel produkDisplayGrandTotal;
    private javax.swing.JLabel produkDisplayImg;
    private javax.swing.JLabel produkDisplayName;
    private javax.swing.JLabel produkDisplayPrice;
    private javax.swing.JButton produkDisplayPurchaseButton;
    private javax.swing.JPanel produkDisplayPurchasePanel;
    private javax.swing.JPanel produkDisplaySellerDetails;
    private javax.swing.JLabel produkDisplaySellerImg;
    private javax.swing.JLabel produkDisplaySellerInfo;
    private javax.swing.JLabel produkDisplaySellerName;
    private javax.swing.JLabel produkDisplayStock;
    private javax.swing.JLabel produkDisplaySubtotal;
    private javax.swing.JLabel produkDisplayTax;
    private javax.swing.JLabel produkDisplayTaxPercentage;
    private javax.swing.JLabel produkDisplayprice;
    // End of variables declaration//GEN-END:variables
}
