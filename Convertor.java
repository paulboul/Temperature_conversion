import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Convertor {
    private JFrame frame;
    private JLabel lab;
    private JLabel lab2;
    private JButton bot;
    private JButton bot1;
    private JTextField te;

    public Convertor(){
        frame=new JFrame("攝氏轉華氏溫度");
        frame.setLayout(null);

        lab=new JLabel("請輸入攝氏溫度:");
        lab.setBounds(5,5,100,20);
        frame.add(lab);

        te=new JTextField();
        te.setBounds(107,5,1002,20);
        frame.add(te);

        bot=new JButton("求華氏溫度");
        bot.setBounds(5,37,100,20);
        frame.add(bot);

        lab2=new JLabel("");
        lab2.setBounds(5,59,200,40);
        frame.add(lab2);

        bot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double c=Double.parseDouble(te.getText());
                    double f=(9.0/5.0)*c+32;
                    lab2.setText("華氏溫度: "+f);
                }catch (Exception e1){

                }
            }
        });

        bot1=new JButton("清除");
        bot1.setBounds(107,37,100,20);
        frame.add(bot1);

        bot1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                te.setText("");
                lab2.setText("");
            }
        });

        frame.setSize(400,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
