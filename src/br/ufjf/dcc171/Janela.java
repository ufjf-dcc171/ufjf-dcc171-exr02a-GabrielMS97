package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {

    private final JLabel lblNum1;
    private final JLabel lblNum2;
    private final JTextField txtNum1;
    private final JTextField txtNum2;
    private final JLabel resultado;

    private int n1;
    private int n2;

    public Janela() throws HeadlessException {
        super("Soma");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        lblNum1 = new JLabel("Número 1: ");
        txtNum1 = new JTextField(15);
        add(lblNum1);
        add(txtNum1);
        lblNum2 = new JLabel("Número 2: ");
        txtNum2 = new JTextField(15);
        add(lblNum2);
        add(txtNum2);
        resultado = new JLabel("");
        add(resultado);

        txtNum1.addActionListener(new Numero1Enter());
        txtNum2.addActionListener(new Numero2Enter());
    }

    private class Numero2Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n2 = Integer.parseInt(txtNum2.getText());
            resultado.setText("Resultado: " + (n1 + n2));
        }

    }

    private class Numero1Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n1 = Integer.parseInt(txtNum1.getText());
            txtNum2.requestFocus();
        }
    }
}

/*public class Janela extends JFrame {

    private final JLabel num1;
    private final JLabel num3;
    private final JLabel num2;
    private final JLabel num4;
    private final JTextField t1;
    private final JTextField t2;
    private final JLabel et1;

    public Janela() throws HeadlessException {
        super("Soma");
        num1 = new JLabel("Digite o primeiro número: ");
        num3 = new JLabel("");
        num2 = new JLabel("Digite o segundo número: ");
        num4 = new JLabel("");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        et1 = new JLabel("");
        
        String str1, str2;
        Integer n1, n2;
        
        setLayout((new FlowLayout()));
        add(num1);
        add(num3);
        add(t1);
        add(num2);
        add(num4);
        add(t2);
        add(et1);
        
        //str1 = Integer.parseInt(t1);
        t2.addActionListener((ActionListener) new EscreveMensagem());
        
        
    }
    private class EscreveMensagem implements ActionListener {
        
        public EscreveMensagem() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            et1.setText("");
        }
    }
}*/
