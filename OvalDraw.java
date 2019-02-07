// Programmer: Dayne Hultman
// Date: February 5, 2019
// Purpose: Make an oval in a window

//Importing the essential classes
import javax.swing.JFrame; // Brings the tools to create a frame/window
import javax.swing.JPanel; // Brings the tools to create a panel within the window
import java.awt.Graphics; // Brings the tools to
import java.awt.Container; // Brings the tools 
import java.awt.Color; // Brings the tools to add color

class Oval extends JPanel {
    Oval() { //Default Constructor

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //g.fillRect(1,1,200,200);
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        Color rectColor = new Color(0,255,0);//the color green
        g.setColor(rectColor);
        g.fillRect(0,0,panelWidth,panelHeight);


        Color myColor = new Color(255,0,0);//the color red
        g.setColor(myColor);
        g.fillOval(0,0,panelWidth,panelHeight); //adds the oval with color (color,color,size,size)
    }
}



class OvalFrame extends JFrame {
    OvalFrame() { //Default Constructor
        setTitle("OvalDraw");
        setBounds(300,300,400,500); // the boundaries of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //the X close button

        Oval myOval = new Oval();
        Container contentPane = getContentPane();
        contentPane.add(myOval);
    }
}

public class OvalDraw {
    public static void main(String[] args) {
        System.out.println("OvalDraw Starting...");

        OvalFrame myFrame = new OvalFrame();
        myFrame.setVisible(true); //Makes the window visible if true
        //would like to be in default constructor, but is dangerous to be in there since it isn't safe

    }
}


















