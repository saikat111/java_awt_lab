package Java;
import java.awt.*;  
import java.awt.event.*;  
public class TextAreaExample extends Frame implements ActionListener{  
	Label l1,l2;  
	TextArea area;  
	Button b;  
	Checkbox c2;
	
TextAreaExample(){
	    addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        }); 
Choice c = new Choice();
    l1=new Label(); 
      Checkbox c1 = new  Checkbox("java");
	c2 = new Checkbox("Python");
	c1.setBounds(100,450,100,30);
	c2.setBounds(200,450,150,40);
	c = new Choice();
	c.add("c");
	c.add("java");
	c.add("Python");
	c.setBounds(350,450,150,40);
    l1.setBounds(50,50,100,30);  
    l2=new Label();  
    l2.setBounds(160,50,100,30);  
    area=new TextArea();  
    area.setBounds(20,100,300,300);  
    b=new Button("Count Words");  
    b.setBounds(100,400,100,30);  
    b.addActionListener(this);
    add(l1);add(l2);add(area);add(b);add(c1);add(c2);add(c); 
    setSize(800,800);  
    setLayout(null);  
    setVisible(true);  
}  
  
public void actionPerformed(ActionEvent e){  
    String text=area.getText();  
    String words[]=text.split("\\s");  
    l1.setText("Words: "+words.length);  
    l2.setText("Characters: "+text.length());  
}  
public static void main(String[] args) {  
    new TextAreaExample();  
	}  
}