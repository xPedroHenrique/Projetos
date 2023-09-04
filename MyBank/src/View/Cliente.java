package View;

import Controller.ContaController;
import Model.Conta;
import javax.swing.JOptionPane;

public class Cliente extends javax.swing.JFrame {

    private final ContaController contaController;
    Conta conta = null;

    public Cliente() {
        initComponents();
        contaController = new ContaController();
        solicitaDocumentoCliente();
        this.setLocationRelativeTo(null);
    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        depositar = new javax.swing.JButton();
        sacar = new javax.swing.JButton();
        transferir = new javax.swing.JButton();
        extrato = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numeroConta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomeTitular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        depositar.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        depositar.setText("Depositar");
        depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositarActionPerformed(evt);
            }
        });

        sacar.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        sacar.setText("Sacar");
        sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarActionPerformed(evt);
            }
        });

        transferir.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        transferir.setText("Transferir");
        transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferirActionPerformed(evt);
            }
        });

        extrato.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        extrato.setText("Extrato");
        extrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extratoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel1.setText("N° Conta:");

        numeroConta.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel2.setText("Titular:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel3.setText("Saldo:");

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(depositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(transferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(extrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroConta)
                            .addComponent(nomeTitular)
                            .addComponent(saldo))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositar)
                    .addComponent(transferir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sacar)
                    .addComponent(extrato))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solicitaDocumentoCliente() {

        do {
            String doc = JOptionPane.showInputDialog("Informe seu documento (CPF/CNPJ) ");
            conta = contaController.buscarContaDocumento(doc);
        } while (conta == null);

        this.numeroConta.setText(String.valueOf(conta.getNumero()));
        this.nomeTitular.setText(conta.getTitular().getNome());
        this.saldo.setText("R$" + String.valueOf(conta.getSaldo()));
    }

    private String obterExtratoCliente(Conta conta) {
        String extrato = "Extrato Bancário\n";
        extrato += "N° Conta: " + conta.getNumero() + "\n";
        extrato += "Titular: " + conta.getTitular().getNome() + "\n";
        extrato += "Saldo: R$" + conta.getSaldo() + "\n";

        return extrato;
    }
    private void depositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositarActionPerformed
        String valor = JOptionPane.showInputDialog("Informe o valor a ser depositado:");
        double valorDeposito = Double.parseDouble(valor);

        this.contaController.depositar(this.conta, valorDeposito);

        this.saldo.setText("R$" + String.valueOf(conta.getSaldo()));
    }//GEN-LAST:event_depositarActionPerformed

    private void sacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacarActionPerformed
        String valor = JOptionPane.showInputDialog("Informe o valor a ser sacado:");
        double valorDeposito = Double.parseDouble(valor);

        this.contaController.sacar(this.conta, valorDeposito);

        this.saldo.setText("R$" + String.valueOf(conta.getSaldo()));
    }//GEN-LAST:event_sacarActionPerformed

    private void transferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferirActionPerformed
        String resp = JOptionPane.showInputDialog("Informe para quem será a transferência (CPF/CNPJ): ");
        Conta pessoa = contaController.buscarContaDocumento(resp);

        String valor = JOptionPane.showInputDialog("Informe o valor a ser transferido:");
        double valorTransferencia = Double.parseDouble(valor);

        conta = contaController.transferir(this.conta, pessoa, valorTransferencia);

        this.saldo.setText("R$" + String.valueOf(conta.getSaldo()));
    }//GEN-LAST:event_transferirActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.dispose();
        new Sistema().setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void extratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extratoActionPerformed
        String extrato = obterExtratoCliente(this.conta);

        JOptionPane.showMessageDialog(this, extrato, "Extrato Bancário", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_extratoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositar;
    private javax.swing.JButton extrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nomeTitular;
    private javax.swing.JTextField numeroConta;
    private javax.swing.JButton sacar;
    private javax.swing.JTextField saldo;
    private javax.swing.JButton transferir;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

}
