import java.awt.*;
import java.awt.event.*;
public class maxof3 extends Frame implements ActionListener{
    TextField t1 = new TextField(5);
    TextField t2 = new TextField(5);
    TextField t3 = new TextField(5);
    Label res = new Label("Result will appear here");
    Button find = new Button("Find max");
    
    public maxof3(){
      setLayout(new FlowLayout());
      add(new Label("enter first number"));
      add(t1);
      add(new Label("enter 2nd number"));
      add(t2);
      add(new Label("enter 3rd number"));
      add(t3);
      add(find); add(res);
      find.addActionListener(this);
      
      setSize(300,150);
      setTitle("Max of 3");
      setVisible(true);
      addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
        dispose();
        }
      });
    } 
  public void actionPerformed(ActionEvent e){
    int a = Integer.parseInt(t1.getText());
    int b = Integer.parseInt(t2.getText());
    int c = Integer.parseInt(t3.getText());
    int max = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
    res.setText("max:"+max);
  }
  public static void main(String[] args){
   new maxof3();
  }
 }
 
 
 
 
 
 
 
 
 
