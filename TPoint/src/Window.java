import javax.swing.*;
/**
 * Created with IntelliJ IDEA.
 * User: vasil
 * Date: 22.11.12
 * Time: 8:43
 * Окно с диаграммой ЭКГ
 */
public class Window extends JFrame {
    public Window(int width, int height, String title){
        this.setSize(width, height);
        this.setTitle(title);
        ECGDrawGraph panelECG = new ECGDrawGraph();
        add(panelECG);
    }
    public Window(int width, int height){
        this.setSize(width, height);
        this.setVisible(true);
        ECGDrawGraph panelECG = new ECGDrawGraph();
        add(panelECG);
    }
    public Window(){
        this.setSize(400, 600);
        this.setVisible(true);
        ECGDrawGraph panelECG = new ECGDrawGraph();
        add(panelECG);
    }

}