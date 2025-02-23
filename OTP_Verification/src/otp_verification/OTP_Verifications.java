/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package otp_verification;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Asp Prothes
 */
public class OTP_Verifications extends javax.swing.JFrame {

    // Variable Declaration;
    private volatile String generatedOTP = "";
    private long otpExpirationTime;
    private Timer countdownTimer;

    public OTP_Verifications() {
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

        sendOTP = new javax.swing.JButton();
        matchOTP1 = new javax.swing.JButton();
        mobileNumberField = new javax.swing.JTextField();
        inputOTP = new javax.swing.JTextField();
        matchOutput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        countField = new javax.swing.JTextField();
        showOTP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sendOTP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sendOTP.setText("Send OTP");
        sendOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendOTPActionPerformed(evt);
            }
        });

        matchOTP1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        matchOTP1.setText("Match OTP");
        matchOTP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchOTP1ActionPerformed(evt);
            }
        });

        mobileNumberField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mobileNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        inputOTP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        inputOTP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputOTPActionPerformed(evt);
            }
        });

        matchOutput.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        matchOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        matchOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchOutputActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Count : ");

        countField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        countField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        countField.setText("TC");
        countField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countFieldActionPerformed(evt);
            }
        });

        showOTP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showOTP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(countField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobileNumberField)
                            .addComponent(matchOutput)
                            .addComponent(showOTP)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inputOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(matchOTP1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mobileNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(countField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(sendOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matchOTP1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(matchOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendOTPActionPerformed
        // Define OTP Length
        int otpLength = 6;
        // Generate OTP with the specified length
        Random rand = new Random();
        StringBuilder otpBuilder = new StringBuilder();
        for (int i = 0; i < otpLength; i++) {
            otpBuilder.append(rand.nextInt(10));
        }

        generatedOTP = otpBuilder.toString();
        showOTP.setText(generatedOTP);

        // মোবাইল নম্বর ইনপুট নেওয়া হচ্ছে
        String mobileNumber = mobileNumberField.getText().trim();

        

        // Coundown Start Here ==========
        otpExpirationTime = System.currentTimeMillis() + 60000;
        if (countdownTimer != null && countdownTimer.isRunning()) {
            countdownTimer.stop();
        }
        countdownTimer = new Timer(100, (e) -> {
            long remainingTime = otpExpirationTime - System.currentTimeMillis();
            if (remainingTime > 0) {
                long seconds = remainingTime / 1000;
                countField.setText(seconds + "s");
            } else {
                generatedOTP = "";
                mobileNumberField.setText("Time Out");
                countField.setText("TC");
                countdownTimer.stop();
            }
        });
        countdownTimer.start();
        // Coundown End Here ============
        
        if (mobileNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Give me a phn munber", "error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // OTP পাঠানোর ফাংশন কল করা হচ্ছে
        sendOTPToMobile(mobileNumber, generatedOTP);                                      
    }//GEN-LAST:event_sendOTPActionPerformed
    // OTP মোবাইলে পাঠানোর ফাংশন
    private void sendOTPToMobile(String mobileNumber, String otp) {
        try {
            String apiUrl = "https://textbelt.com/text";
            String message = "আপনার OTP হল: " + otp;
           

            // API এর জন্য POST ডাটা প্রস্তুত করা
            //String postData = "api_key=" + apiKey + "&to=" + mobileNumber + "&message=" + message + "&sender=" + senderID;
            String postData = "phone=" + mobileNumber + "&message=" + message + "&key=textbelt";

            // HTTP সংযোগ সেটআপ
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            // ডাটা পাঠানো হচ্ছে
            try (OutputStream os = conn.getOutputStream()) {
                os.write(postData.getBytes(StandardCharsets.UTF_8));
            }

            // সার্ভার থেকে রেসপন্স নেওয়া
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                JOptionPane.showMessageDialog(null, "OTP সফলভাবে পাঠানো হয়েছে!", "সফলতা", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "OTP পাঠানো যায়নি, দয়া করে আবার চেষ্টা করুন!", "ত্রুটি", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "OTP পাঠানোর সময় সমস্যা হয়েছে!", "ত্রুটি", JOptionPane.ERROR_MESSAGE);
        }
    }  
    

    private void inputOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputOTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputOTPActionPerformed

    private void matchOTP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchOTP1ActionPerformed
        String getNumber = inputOTP.getText();
        if (!getNumber.isEmpty()) {
            if (getNumber.equals(generatedOTP)) {
                matchOutput.setText("Success");
            } else {
                matchOutput.setText("Invalid OTP");
            }
        } else {
            matchOutput.setText(null);
        }
    }//GEN-LAST:event_matchOTP1ActionPerformed

    private void matchOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matchOutputActionPerformed

    private void countFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countFieldActionPerformed

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
            java.util.logging.Logger.getLogger(OTP_Verifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OTP_Verifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OTP_Verifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OTP_Verifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OTP_Verifications().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField countField;
    private javax.swing.JTextField inputOTP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton matchOTP1;
    private javax.swing.JTextField matchOutput;
    private javax.swing.JTextField mobileNumberField;
    private javax.swing.JButton sendOTP;
    private javax.swing.JTextField showOTP;
    // End of variables declaration//GEN-END:variables
}
