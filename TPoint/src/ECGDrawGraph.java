import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

/**
 * Created with IntelliJ IDEA.
 * User: vasil
 * Date: 22.11.12
 * Time: 14:25
 * To change this template use File | Settings | File Templates.
 */
//Панель на которой отображается ECG
//public class DrawPanel extends JPanel {
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        Graphics2D g2 = (Graphics2D) g;
//        //Прямоугольник для проверки
//        Line2D line = new Line2D.Double(100,100,200,150);
//    }
//}
class ECGDrawGraph extends JPanel{
    private int [] ecgPointsX = {10,40,70,100,130,160,190,220,250,280,310,340,370,400};
    private int [] ecgPointsY = {200,200,220,200,200,300,200,200,220,200,200,300,200,200};
    private int correction = 120;// Y correction


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        GeneralPath polyline = new GeneralPath(GeneralPath.WIND_EVEN_ODD, ecgPointsX.length);

        polyline.moveTo (ecgPointsX[0], ecgPointsY[0]);
        for (int i = 1; i < ecgPointsX.length; i++) {
            if (ecgPointsY[i] != 200)
            polyline.lineTo(ecgPointsX[i], ecgPointsY[i]-correction);
            else
            polyline.lineTo(ecgPointsX[i], ecgPointsY[i]);
        };
        g2.setPaint(Color.red);
        g2.setStroke(new BasicStroke(1.2f));
        g2.draw(polyline);
//        g2.drawPolygon(ecgPointsX,ecgPointsY,14);
    }
}