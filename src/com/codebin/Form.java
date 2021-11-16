package com.codebin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JTextField Jtxt_fogyaszta;
    private JTextField Jtxt_km;
    private JTextField Jtxt_felhasznaltuz;
    private JButton Jb_feldolgoz;
    private JLabel JL_fogyasztas;
    private JLabel JL_km;
    private JLabel LF_fuzany;
    private JPanel panelMain;

    public Form() {
        Jb_feldolgoz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double fogyasztas = Double.parseDouble(Jtxt_fogyaszta.getText());
                double km = Double.parseDouble(Jtxt_km.getText());
                double felhasznaltuzi = fogyasztas * km;
                Jtxt_felhasznaltuz.setText(Double.toString(felhasznaltuzi));
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setContentPane(new Form().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }




}

