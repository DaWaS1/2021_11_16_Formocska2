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
    private JComboBox JC_combobox;
    private JLabel JL_ar;
    private JTextField Jtxt_ar;
    private JLabel JL_forint;
    private JLabel JL_koltseg;
    private JLabel JL_hely;
    private JTextField Jtxt_benzinkut;
    private JTextField Jcb_koltseg;
    private JComboBox Jcb_hely;
    private JButton JB_feltolt;
    private JTextArea JtxtA_esemeny;
    private JButton Jb_osszefog;
    private JLabel JL_osszefogl;

    public Form() {
        Jb_feldolgoz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double fogyasztas = Double.parseDouble(Jtxt_fogyaszta.getText());
                double km = Double.parseDouble(Jtxt_km.getText());
                double felhasznaltuzi = fogyasztas/100 * km;
                Jtxt_felhasznaltuz.setText(Double.toString(felhasznaltuzi));
            }
        });
        JC_combobox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = JC_combobox.getSelectedIndex();
                String uza = JC_combobox.getSelectedItem() + "";
                switch (index)
                {
                    case 0 : Jtxt_ar.setText("460"); break;
                    case 1 : Jtxt_ar.setText("480"); break;
                    case 3 : Jtxt_ar.setText("490"); break;
                    default: Jtxt_ar.setText("470");
                }
                Double ar = Double.parseDouble(Jtxt_ar.getText());
                Jcb_koltseg.setText(Double.toString(Double.parseDouble(Jtxt_fogyaszta.getText())));
            }
        });
        JB_feltolt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(Jtxt_benzinkut.getText().equals(""))){
                    Jcb_hely.addItem(Jtxt_benzinkut.getText());
                }
            }
        });
        Jb_osszefog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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

