import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
public class TrollyLoad extends Frame implements ActionListener{ 
	JFrame f;
	JLabel trollyL1,trollyL2,enter,income,driver,tax,desial,profit;
	JTextField	enter_tf,income_tf,driver_tf,tax_tf,desial_tf,profit_tf;  
    JButton calc,exit,clear,about;  
    TrollyLoad(){  
		f=new JFrame("Trolly Load");
		f.setBounds(0,0,1000,1000);
		
		trollyL1=new JLabel("Sindhiana Transport Co.");
		trollyL1.setBounds(100,20,250,50);
		Font font1=new Font("Brush Script Std",Font.ITALIC,25);
		trollyL1.setFont(font1);

		trollyL2=new JLabel("TROLLY LOAD");
		trollyL2.setBounds(120,40,250,50);
		Font font2=new Font("Brush Script Std",Font.ITALIC,25);
		trollyL2.setFont(font2);		
		
		enter=new JLabel("Enter Trolly Load");
		enter.setBounds(10,100,200,20);
		
		income=new JLabel("Total Income");
		income.setBounds(10,150,200,20);
		
		driver=new JLabel("Driver");
		driver.setBounds(10,200,200,20);	
				
		tax=new JLabel("Tax 10%");
		tax.setBounds(10,250,200,20);		
		
		desial=new JLabel("Desial");
		desial.setBounds(10,300,200,20);		
		
		profit=new JLabel("Profit");
		profit.setBounds(10,350,200,20);
		
        enter_tf=new JTextField();  
        enter_tf.setBounds(200,100,200,20);
		
        income_tf=new JTextField();  
        income_tf.setBounds(200,150,200,20); 
			income_tf.setEditable(false);  
        driver_tf=new JTextField();  
        driver_tf.setBounds(200,200,200,20);		
			driver_tf.setEditable(false);  
        tax_tf=new JTextField();  
        tax_tf.setBounds(200,250,200,20);		
			tax_tf.setEditable(false);  
        desial_tf=new JTextField();  
        desial_tf.setBounds(200,300,200,20);		
			desial_tf.setEditable(false);  
        profit_tf=new JTextField();  
        profit_tf.setBounds(200,350,200,20);		 
			profit_tf.setEditable(false);  
			
        calc=new JButton("Calculate");  
        calc.setBounds(500,100,150,20);  
		
		exit=new JButton("EXIT");
		exit.setBounds(100,400,100,40);
		
		clear=new JButton("CLEAR");
		clear.setBounds(200,400,100,40);
		
		about=new JButton("ABOUT");
		about.setBounds(300,400,100,40);
		
		calc.addActionListener(this);
		exit.addActionListener(this);
		clear.addActionListener(this);
		about.addActionListener(this);
		
		f.add(trollyL1);
		f.add(trollyL2);
		f.add(enter);
		f.add(income);
		f.add(driver);
		f.add(tax); 
		f.add(desial);
		f.add(profit);
		f.add(enter_tf);
		f.add(income_tf);
		f.add(driver_tf);
		f.add(tax_tf);
		f.add(desial_tf);
		f.add(profit_tf);
		f.add(calc);
		f.add(exit);
		f.add(clear);
		f.add(about);
		
        setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true); 
		f.show();
	}
	private void clear()
	{
		enter_tf.setText("");
		income_tf.setText("");
		driver_tf.setText("");
		tax_tf.setText("");
		desial_tf.setText("");
		profit_tf.setText("");;
	}			
             
    public void actionPerformed(ActionEvent e) {  
 
        if(calc==e.getSource()){  
		String s1=enter_tf.getText();  
        int a=Integer.parseInt(s1);   
            income_tf.setText(""+(a*800));  
			driver_tf.setText(""+(150*a));
			tax_tf.setText(""+(0.1*(800*a)));
			desial_tf.setText(""+(210*a));
			profit_tf.setText(""+((a*800)-(150*a)+(0.1*(800*a))+(210*a)));
        } 
		if(clear==e.getSource()){
			clear();
		}
		if(exit==e.getSource()){
			System.exit(0);
		}
		if(about==e.getSource()){
			JOptionPane.showMessageDialog(null,"Name: Danish Azeem \nOrganization: Muet \nContact: 03066558872");
		}				
    }  
public static void main(String[] args) {  
    new TrollyLoad();  
}  
}  