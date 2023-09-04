package View;

import Controller.ContaController;
import Controller.PessoaController;
import Main.MyBank;
import Model.Conta;
import Model.Pessoa;
import javax.swing.JOptionPane;

public class Gerente extends javax.swing.JFrame {

    private final PessoaController pessoaController;
    private final ContaController contaController;

    public Gerente() {
        initComponents();
        pessoaController = new PessoaController();
        contaController = new ContaController();

        this.setLocationRelativeTo(null);
    }

    private void limparCampos() {
        this.nomeTitular.setText("");
        this.cpf.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nomeTitular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contaCorrente = new javax.swing.JRadioButton();
        contaPoupanca = new javax.swing.JRadioButton();
        contaSalario = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        tipoTitular = new javax.swing.JComboBox<>();
        criarConta = new javax.swing.JButton();
        cliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel1.setText("Titular: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel2.setText("CPF/CNPJ:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel3.setText("Conta: ");

        buttonGroup1.add(contaCorrente);
        contaCorrente.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        contaCorrente.setText("Conta Corrente");

        buttonGroup1.add(contaPoupanca);
        contaPoupanca.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        contaPoupanca.setText("Conta Poupança");

        buttonGroup1.add(contaSalario);
        contaSalario.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        contaSalario.setText("Conta Salário");
        contaSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contaSalarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel4.setText("Tipo:");

        tipoTitular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Jurídica" }));
        tipoTitular.setToolTipText("");

        criarConta.setFont(new java.awt.Font("Segoe UI", 2, 30)); // NOI18N
        criarConta.setText("Criar Conta");
        criarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarContaActionPerformed(evt);
            }
        });

        cliente.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        cliente.setText("Cliente");
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeTitular)
                    .addComponent(cpf)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(contaCorrente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contaPoupanca))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(contaSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(criarConta))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(tipoTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contaCorrente)
                    .addComponent(contaPoupanca)
                    .addComponent(contaSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(criarConta)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contaSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contaSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contaSalarioActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        this.dispose();
        new Cliente().setVisible(true);
    }//GEN-LAST:event_clienteActionPerformed

    private void criarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarContaActionPerformed
        String nome = this.nomeTitular.getText();
        String cpfOuCnpj = this.cpf.getText();
        String tipo = (String) this.tipoTitular.getSelectedItem();

        // CHAMA QUEM CRIA PESSOA
        Pessoa pessoa = pessoaController.criarPessoa(nome, cpfOuCnpj, tipo);

        // PEGAR INFORMAÇÕES DA CONTA
        boolean corrente = this.contaCorrente.isSelected();
        boolean poupanca = this.contaPoupanca.isSelected();
        boolean salario = this.contaSalario.isSelected();

        // CHAMA QUEM CRIA CONTA
        Conta numeroConta = contaController.criaConta(pessoa, corrente, poupanca, salario);

        JOptionPane.showMessageDialog(this, "Conta criada com sucesso. O número dela é: " + numeroConta);
        limparCampos();

        for (Conta c : MyBank.banco) {
            System.out.println("Número da conta: " + c.getNumero() + "\nTitular: " + c.getTitular().getNome());
        }
    }//GEN-LAST:event_criarContaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cliente;
    private javax.swing.JRadioButton contaCorrente;
    private javax.swing.JRadioButton contaPoupanca;
    private javax.swing.JRadioButton contaSalario;
    private javax.swing.JTextField cpf;
    private javax.swing.JButton criarConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nomeTitular;
    private javax.swing.JComboBox<String> tipoTitular;
    // End of variables declaration//GEN-END:variables
}
