package trinomiocp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
/** Clase Frame donde estan todos lo visible del programa
 * 
 * @author net_m
 */
public class Frame extends JFrame {

    JTextField num1 = new JTextField();
    JTextField num2 = new JTextField();
    JTextField num3 = new JTextField();
    JTextField ecuacion = new JTextField();
    JButton boton = new JButton("Calcular");
    JLabel tit = new JLabel("Ingrese 2 numeros");
    JLabel a = new JLabel("a");
    JLabel b = new JLabel("b");
    JLabel c = new JLabel("c");

    Numero num = new Numero();

    /**Configura el frame
     * 
     */
    public Frame() {

        super();
        setSize(360, 340);
        setTitle("Java");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        ConfigVentanaa();
        setLayout(null);
    }
    /**Configura los componentes en la ventana
     * 
     */
    public void ConfigVentanaa() {
       
        tit.setBounds(120, 10, 160, 20);
        tit.setVisible(true);
        add(tit);

        a.setBounds(60, 135, 30, 10);
        a.setVisible(true);
        add(a);

        b.setBounds(170, 135, 30, 10);
        b.setVisible(true);
        add(b);

        c.setBounds(285, 135, 30, 10);
        c.setVisible(true);
        add(c);

        ecuacion.setBounds(10, 150, 330, 30);
        ecuacion.setVisible(true);
        ecuacion.setEditable(false);
        add(ecuacion);

        num1.setBounds(10, 50, 103, 80);
        num1.setVisible(true);
        add(num1);

        num2.setBounds(123, 50, 104, 80);
        num2.setVisible(true);
        add(num2);

        num3.setBounds(237, 50, 103, 80);
        num3.setVisible(true);
        num3.setEditable(false);
        add(num3);

        boton.setBounds(10, 200, 330, 100);
        boton.setVisible(true);
        add(boton);
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = boton.getText();
                if (s.equals("Calcular")) {
                    try {

                        /**Valida que el numero sea valido
                         * 
                         */
                        num.setNum1(Integer.parseInt(num1.getText()));

                        num.setNumV(Integer.parseInt(num2.getText()));

                        num.setNum2(Double.parseDouble(num2.getText()));
                        //Valida que el numero sea valido
                        if (num.getNum1() == 0 || num.getNum2() == 0) {
                            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                        } else if (num.getNum1() != 1) {
                            num.Dividir(); 
                            /**Muestra el valor de C del método y lo muestra
                             * 
                             */
                            num3.setText(String.valueOf(num.ObtenerC()));
                            /**Muestra la ecuación
                             * 
                             */
                            ecuacion.setText(num.ecuacion());
                        } else if (num.getNum1() == 1) {
                            /**Muestra el valor de C del metodo y lo muestra
                             * 
                             */
                            num3.setText(String.valueOf(num.ObtenerC()));
                            /**Muestra la ecuacíón
                            * 
                            */
                            ecuacion.setText(num.ecuacion());
                        }

                    } catch (Exception z) {
                       
                        JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                    }
                }
            }
        });
    }

}
