/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Models.Dao.ThongKeDAO;
import Utils.Auth;
import Utils.mgsBox;
import com.sun.org.apache.xml.internal.serializer.utils.MsgKey;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author you have to better
 */
public class ManHinhChinhJDialog extends javax.swing.JFrame {

    /**
     * Creates new form ManHinhChinh
     */
    public ManHinhChinhJDialog() {
        initComponents();
        setTitle("EduSys - Màn hình chính");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnChuyenDe = new javax.swing.JButton();
        btnNguoiHoc = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        btnHocVien = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnHuongDan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniQuanLyChuyenDe = new javax.swing.JMenuItem();
        mniQuanLyKhoaHoc = new javax.swing.JMenuItem();
        mniQuanLyNguoiHoc = new javax.swing.JMenuItem();
        mniQuanLyHocvien = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniQuanLyNhanVien = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniThongKeBangDiem = new javax.swing.JMenuItem();
        mniThongKeLuongNguoiHoc = new javax.swing.JMenuItem();
        mniThongKeDiemChuyenDe = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniThongKeDoanhThu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mniTroGiupHDSD = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniTroGiupGT = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setRollover(true);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Exit.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Stop sign.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetThuc);
        jToolBar1.add(jSeparator8);

        btnChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/List.png"))); // NOI18N
        btnChuyenDe.setText("Chuyên đề");
        btnChuyenDe.setFocusable(false);
        btnChuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyenDe.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnChuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnChuyenDe);

        btnNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/People.png"))); // NOI18N
        btnNguoiHoc.setText("Người học");
        btnNguoiHoc.setFocusable(false);
        btnNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoiHoc.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNguoiHoc);

        btnKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Favourites.png"))); // NOI18N
        btnKhoaHoc.setText("Khóa học");
        btnKhoaHoc.setFocusable(false);
        btnKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoaHoc.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnKhoaHoc);

        btnHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Boss.png"))); // NOI18N
        btnHocVien.setText("Học viên");
        btnHocVien.setFocusable(false);
        btnHocVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHocVien.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnHocVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHocVien);
        jToolBar1.add(jSeparator7);

        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Help book.png"))); // NOI18N
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHuongDan);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Info.png"))); // NOI18N
        jLabel1.setText("Hệ quản lý đào tạo");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Clock.png"))); // NOI18N
        jLabel2.setText("12:00:00 AM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        jMenu1.setText("Hệ thống");

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Go forward.png"))); // NOI18N
        mniDangNhap.setMnemonic('L');
        mniDangNhap.setText("Đăng nhập");
        jMenu1.add(mniDangNhap);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Go back.png"))); // NOI18N
        mniDangXuat.setMnemonic('O');
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(mniDangXuat);
        jMenu1.add(jSeparator2);

        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Refresh.png"))); // NOI18N
        mniDoiMatKhau.setText("Đổi mật khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        jMenu1.add(mniDoiMatKhau);
        jMenu1.add(jSeparator3);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Close.png"))); // NOI18N
        mniKetThuc.setText("Kết thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        jMenu1.add(mniKetThuc);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        mniQuanLyChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        mniQuanLyChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Copy.png"))); // NOI18N
        mniQuanLyChuyenDe.setText("chuyên đề");
        mniQuanLyChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQuanLyChuyenDeActionPerformed(evt);
            }
        });
        jMenu2.add(mniQuanLyChuyenDe);

        mniQuanLyKhoaHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        mniQuanLyKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Favourites.png"))); // NOI18N
        mniQuanLyKhoaHoc.setText("khóa học");
        jMenu2.add(mniQuanLyKhoaHoc);

        mniQuanLyNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        mniQuanLyNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Boss.png"))); // NOI18N
        mniQuanLyNguoiHoc.setText("người học");
        mniQuanLyNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQuanLyNguoiHocActionPerformed(evt);
            }
        });
        jMenu2.add(mniQuanLyNguoiHoc);

        mniQuanLyHocvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        mniQuanLyHocvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Male.png"))); // NOI18N
        mniQuanLyHocvien.setText("học viên");
        jMenu2.add(mniQuanLyHocvien);
        jMenu2.add(jSeparator1);

        mniQuanLyNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_MASK));
        mniQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/People.png"))); // NOI18N
        mniQuanLyNhanVien.setText("nhân viên");
        mniQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQuanLyNhanVienActionPerformed(evt);
            }
        });
        jMenu2.add(mniQuanLyNhanVien);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống kê");

        mniThongKeBangDiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        mniThongKeBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/List.png"))); // NOI18N
        mniThongKeBangDiem.setText("bảng điểm");
        jMenu3.add(mniThongKeBangDiem);

        mniThongKeLuongNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        mniThongKeLuongNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Female.png"))); // NOI18N
        mniThongKeLuongNguoiHoc.setText("lượng người học");
        jMenu3.add(mniThongKeLuongNguoiHoc);

        mniThongKeDiemChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_MASK));
        mniThongKeDiemChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Disaster.png"))); // NOI18N
        mniThongKeDiemChuyenDe.setText("điểm chuyển đề");
        mniThongKeDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeDiemChuyenDeActionPerformed(evt);
            }
        });
        jMenu3.add(mniThongKeDiemChuyenDe);
        jMenu3.add(jSeparator4);

        mniThongKeDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        mniThongKeDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/Report.png"))); // NOI18N
        mniThongKeDoanhThu.setText("doanh thu");
        mniThongKeDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeDoanhThuActionPerformed(evt);
            }
        });
        jMenu3.add(mniThongKeDoanhThu);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Trợ giúp");

        mniTroGiupHDSD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniTroGiupHDSD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/How-to.png"))); // NOI18N
        mniTroGiupHDSD.setText("hướng dẫn sử dụng");
        mniTroGiupHDSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTroGiupHDSDActionPerformed(evt);
            }
        });
        jMenu4.add(mniTroGiupHDSD);
        jMenu4.add(jSeparator5);

        mniTroGiupGT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icon/About.png"))); // NOI18N
        mniTroGiupGT.setText("giới thiệu sản phẩm");
        jMenu4.add(mniTroGiupGT);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        // TODO add your handling code here:
        dangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        // TODO add your handling code here:
        ketThuc();
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void mniThongKeDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeDiemChuyenDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniThongKeDiemChuyenDeActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
        ketThuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void btnChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenDeActionPerformed
        // TODO add your handling code here:
        openChuyenDe();
    }//GEN-LAST:event_btnChuyenDeActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void mniQuanLyChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQuanLyChuyenDeActionPerformed
        // TODO add your handling code here:
        openChuyenDe();
    }//GEN-LAST:event_mniQuanLyChuyenDeActionPerformed

    private void mniQuanLyNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQuanLyNguoiHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniQuanLyNguoiHocActionPerformed

    private void mniQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQuanLyNhanVienActionPerformed
        // TODO add your handling code here:
        openNhanVien();
    }//GEN-LAST:event_mniQuanLyNhanVienActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        // TODO add your handling code here:
        openDoiMatKhau();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void mniThongKeDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeDoanhThuActionPerformed
        // TODO add your handling code here:
        openThongKe(3);
    }//GEN-LAST:event_mniThongKeDoanhThuActionPerformed

    private void mniTroGiupHDSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTroGiupHDSDActionPerformed
        // TODO add your handling code here:
        openHuongDan();
    }//GEN-LAST:event_mniTroGiupHDSDActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        // TODO add your handling code here:
        openHuongDan();
    }//GEN-LAST:event_btnHuongDanActionPerformed
    
    public void ketThuc() {
        if (mgsBox.confirm(this, "are you sure?")) {
            System.exit(0);
        }
    }
    
    public void dangXuat() {
        Auth.clear();
        DangNhapJDialog dangNhapJDialog = new DangNhapJDialog();
        dangNhapJDialog.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }
    
    public void openDoiMatKhau() {
        if (Auth.isLogin()) {
            DoiMatKhauJDialog doiMatKhauJDialog = new DoiMatKhauJDialog();
            doiMatKhauJDialog.setVisible(true);
        } else {
            mgsBox.alert(ManHinhChinhJDialog.this, "vui long dang nhap");
        }
    }
    
    public void openChuyenDe() {
        QuanLyChuyenDeJDialog quanLyChuyenDeJDialog = new QuanLyChuyenDeJDialog();
        quanLyChuyenDeJDialog.setVisible(true);
    }
    
    public void openKhoaHoc() {
        QuanlyKhoaHocJDialog qlkh = new QuanlyKhoaHocJDialog();
        qlkh.setVisible(true);
    }
    
    public void openNguoiHoc() {
        QuanLyNguoiHocJDialog qlnh = new QuanLyNguoiHocJDialog();
        qlnh.setVisible(true);
    }
    
    public void openHocVien() {
        QuanLyHocVienJDialog qlhv = new QuanLyHocVienJDialog();
        qlhv.setVisible(true);
    }
    
    public void openNhanVien() {
        if (Auth.isLogin()) {
            QuanLyNhanVienJDialog nhanvien = new QuanLyNhanVienJDialog();
            nhanvien.setVisible(true);
        }
    }
    
    public void openHuongDan() {
        System.out.println("file" + System.getProperty("user.dir"));
        try {
            Desktop.getDesktop().browse(new File("src/help/index.html").toURI());
        } catch (IOException ex) {
            mgsBox.alert(this, "Không tìm thấy đường dẫn");
            ex.printStackTrace();
        }
    }
    
    public void openGioiThieu() {
        
    }
    
    public void openThongKe(int in) {
        if (Auth.isLogin()) {
            // voi tu cach la truong phong
            if (!Auth.isManager() && in == 3) {
                mgsBox.alert(ManHinhChinhJDialog.this, "Ban khong co quyen vao khu vuc nay");
            } else {
                TongHopThongKeJDialog tongHopThongKeJDialog = new TongHopThongKeJDialog(in);
                tongHopThongKeJDialog.setVisible(true);
            }
        } else {
            mgsBox.alert(ManHinhChinhJDialog.this, "Vui long dang nhap");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenDe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHocVien;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniQuanLyChuyenDe;
    private javax.swing.JMenuItem mniQuanLyHocvien;
    private javax.swing.JMenuItem mniQuanLyKhoaHoc;
    private javax.swing.JMenuItem mniQuanLyNguoiHoc;
    private javax.swing.JMenuItem mniQuanLyNhanVien;
    private javax.swing.JMenuItem mniThongKeBangDiem;
    private javax.swing.JMenuItem mniThongKeDiemChuyenDe;
    private javax.swing.JMenuItem mniThongKeDoanhThu;
    private javax.swing.JMenuItem mniThongKeLuongNguoiHoc;
    private javax.swing.JMenuItem mniTroGiupGT;
    private javax.swing.JMenuItem mniTroGiupHDSD;
    // End of variables declaration//GEN-END:variables
}