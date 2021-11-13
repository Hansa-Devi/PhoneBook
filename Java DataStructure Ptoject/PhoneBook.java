import javax.swing.* ;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.*;
  
  import java.awt.Graphics;
  
  import javax.swing.ImageIcon;
  import javax.swing.JPanel;
  import javax.swing.*;
  import javax.swing.JFrame;
  import javax.swing.JLabel;
  import javax.swing.JTextField;


class MyPhoneBook {

String name;
String Number;

public MyPhoneBook(String n, String num) {

	name = n;
	Number = num;
}

}

class CheckBook extends JFrame implements ActionListener
{
Container c;
JLabel lb1=new JLabel("WELCOME TO PHONEBOOK");

JButton btn=new JButton("LOGIN");


 
CheckBook()
  {
c=this.getContentPane();
c.setLayout(null);

Font font=new Font ("Times New Roman",Font.BOLD,25);
ImageIcon icon2=new ImageIcon("phone8.jpg");
JLabel frame=new JLabel(icon2);
lb1.setForeground(Color.WHITE);

lb1.setBounds(100,0,400,100);
btn.setBounds(350,460,150,35);
frame.setBounds(0,0,550,550);

lb1.setFont(font);
btn.setFont(font);


btn.addActionListener(this);

c.add(lb1);
c.add(btn);
c.add(frame);
}

public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==btn)
{
  
    Contacts sr=new Contacts();
  }
 

  }
 }


class Contacts {

static HashMap<String, MyPhoneBook> ht = new HashMap<String, MyPhoneBook>();

public void addContacts() {

ht.put("hanna", new MyPhoneBook("h","03090000000"));
ht.put("baba", new MyPhoneBook("b","03070000000"));
ht.put("rida", new MyPhoneBook("r","03230000000"));
ht.put("urmilla", new MyPhoneBook("u","03030000000"));
ht.put("anju", new MyPhoneBook("a","03070000000"));
ht.put("bhaiya", new MyPhoneBook("d","03090000000"));
ht.put("pagal", new MyPhoneBook("p","03360000000"));
ht.put("cr", new MyPhoneBook("cr","03160000000"));
ht.put("pvc", new MyPhoneBook("Sir ","03010000000"));
ht.put("hira", new MyPhoneBook("abc","03310000000"));
}

Contacts() {

addContacts();
JFrame frame = new JFrame("Search contact");
JButton b3 = new JButton("Cancel");
JLabel label = new JLabel("Search");
JButton b4 = new JButton("Add Delete Modefy");
JTextField user_tf=new JTextField();



Font font=new Font ("Times New Roman",Font.BOLD,30);
Font ft=new Font ("Arial",Font.PLAIN,18);

b3.setBounds(450, 615, 100, 40);
b3.setFont(ft);
b3.setBackground(Color.WHITE);
b4.setBounds(150, 600, 200, 50);
b4.setFont(ft);
b4.setBackground(Color.WHITE);
b4.setForeground(Color.RED);
label.setBounds(18, 0, 150, 60);
label.setFont(font);
label.setForeground(Color.BLACK);
user_tf.setBounds(120,15,250,30);


user_tf.setFont(ft);

b3.addActionListener(new ActionListener(){
 @Override
    public void actionPerformed(ActionEvent e)
 {
  if(e.getSource()==b3)
{
   System.exit(0);
   }
}
});

user_tf.addActionListener(new ActionListener(){
 @Override
    public void actionPerformed(ActionEvent e)
 {
 
   Object obj = ht.get(user_tf.getText().toLowerCase());
   MyPhoneBook mp;
   if(obj != null) {
   mp = (MyPhoneBook) obj;
 
   JOptionPane.showMessageDialog(null,  mp.name + " 's number: " +  mp.Number ,"Number" , JOptionPane.INFORMATION_MESSAGE);
   }else {
  
   JOptionPane.showMessageDialog(null, "Number not found" , "Error"  , JOptionPane.ERROR_MESSAGE);
	
   }
} 
 
  
});

b4.addActionListener(new ActionListener(){
 @Override
    public void actionPerformed(ActionEvent e)
 {
  if(e.getSource()==b4)
{
   Modefy mod=new Modefy();
   }
}
});


frame.setBackground(Color.WHITE);
frame.setContentPane(new JLabel(new ImageIcon("phone11.jpg")));
frame.setLayout(null);
frame.add(b3);
frame.add(b4);
frame.add(user_tf);
frame.add(label);
frame.setVisible(true);
frame.setSize(580,700);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}


class PhoneBook{
public static void main(String agr[])
{
  CheckBook f= new CheckBook();
  f.setVisible(true);
  f.setTitle("Phone Book");
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setBounds(350,100,560,560);

  
  
}
}


class Modefy extends JFrame implements ActionListener
{
Container c;

JButton btn1=new JButton("Add");
JButton btn2=new JButton("Delete");
JButton btn3=new JButton("Modefy");
JButton btn4=new JButton("Cancel");
JLabel l1=new JLabel("Name");
JLabel l2=new JLabel("Number");
JLabel l3=new JLabel("Write Key");
JLabel l4=new JLabel("Name");
JLabel l5=new JLabel("NewNumber");
JTextField numfield = new JTextField();
JTextField newNumber = new JTextField();
JTextField namefield = new JTextField();
JTextField nameField = new JTextField();
JTextField numField = new JTextField();
 
Modefy()
  {
c=this.getContentPane();
c.setLayout(null);

Font font=new Font ("Times New Roman",Font.BOLD,22);

l1.setBounds(50,50,250,30);
l2.setBounds(50,85,250,30);
l3.setBounds(50,200,250,30);
l4.setBounds(50,300,250,30);
l5.setBounds(50,335,250,30);

numfield.setBounds(170,50,250,30);
newNumber.setBounds(170,85,250,30);
namefield.setBounds(170,200,250,30);
nameField.setBounds(170,300,250,30);
numField.setBounds(170,335,250,30);



btn1.setBounds(425,70,100,35);
btn2.setBounds(425,200,100,35);
btn3.setBounds(425,310,120,35);
btn4.setBounds(470,500,100,35);
btn1.setBackground(Color.PINK);
btn2.setBackground(Color.PINK);
btn3.setBackground(Color.PINK);
btn4.setBackground(Color.WHITE);


btn1.setFont(font);
btn2.setFont(font);
btn3.setFont(font);
btn4.setFont(font);
l1.setFont(font);
l2.setFont(font);
l3.setFont(font);
l4.setFont(font);
l5.setFont(font);


btn2.addActionListener(this);
btn3.addActionListener(this);

btn4.addActionListener(new ActionListener(){
 @Override
    public void actionPerformed(ActionEvent e)
 {
  if(e.getSource()==btn4)
{
   System.exit(0);
   }
}
});

btn1.addActionListener(new ActionListener(){
 
public void actionPerformed(ActionEvent e){
 if(e.getSource()==btn1)
    {
      

 

if(numfield.getText().isEmpty() || newNumber.getText().isEmpty()){

JOptionPane.showMessageDialog(null, "Please fill the required fields!");

return;

}
 
String key = numfield.getText();
String value = newNumber.getText();


try {


Double.parseDouble(value);



}catch(Exception exeee) {


JOptionPane.showMessageDialog(null, "Please enter the correct Number!");
newNumber.setText("");
return;

}

if(value.length() < 11  || value.length()  > 12){

JOptionPane.showMessageDialog(null, "Length must be 11 or 12");
newNumber.setText("");
return;

}



Contacts.ht.put(key.toLowerCase(), new MyPhoneBook(key, value));
JOptionPane.showMessageDialog(null, "Added!");
numfield.setText("");
newNumber.setText("");



}

}


});


c.add(btn1);
c.add(btn2);
c.add(btn3);
c.add(btn4);
c.add(l1);
c.add(l2);
c.add(l3);
c.add(l4);
c.add(l5);
c.add(numfield);
c.add(newNumber);
c.add(namefield);
c.add(nameField);
c.add(numField);
c.setBackground(Color.PINK);
setVisible(true);
setTitle("Updates in Contact list");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(350,100,600,600);
}

public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==btn2)
    {
  	if(namefield.getText().isEmpty()){

JOptionPane.showMessageDialog(null, "Please enter the key!");

return;

}
    
Contacts.ht.remove(namefield.getText());
JOptionPane.showMessageDialog(null, "Deleted!");
namefield.setText("");

    }
if(e.getSource()==btn3)
    {
if(nameField.getText().isEmpty() || numField.getText().isEmpty()){

JOptionPane.showMessageDialog(null, "Please fill the required fields!");

return;

}
 
String key1 = nameField.getText();
String value1 = numField.getText();


try {


Double.parseDouble(value1);



}catch(Exception exeee) {


JOptionPane.showMessageDialog(null, "Please enter the correct Number!");
numField.setText("");
return;

}

if(value1.length() < 11  || value1.length()  > 12){

JOptionPane.showMessageDialog(null, "Length must be 11 or greater baby!");
numField.setText("");
return;

}
      Contacts.ht.remove(nameField.getText());
	Contacts.ht.put(nameField.getText().toLowerCase(), new MyPhoneBook(nameField.getText(), numField.getText()));
JOptionPane.showMessageDialog(null, "Modefied");
nameField.setText("");
numField.setText("");
    }
}


}

