import javax.swing.*;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: vasil
 * Date: 28.11.12
 * Time: 12:56
 * To change this template use File | Settings | File Templates.
 */
public class ECGModel {
    public ECGModel(String type){
        if (type == "random")
            ecgMaker();
    }
    public ECGModel (){

    }

    private int [] ecg = {200,200,220,200,200,300,200,200,220,200,200,300,200,200};
    Random rnd = new Random();

    public int[] getEcg() {
        return ecg;
    }
    public void printECG (){
        for (int i = 0; i<ecg.length;i++){
            System.out.println(ecg[i]);
        }
    }

    //наполнение массива ecg
    public void ecgMaker (){
        for (int i = 0; i<ecg.length;i++){
            ecg[i] = Math.abs(rnd.nextInt()%300);
            System.out.println(ecg[i]);
        }


    }

    //Распознавание ЭКГ
    public void ecgRecognition (){
    // =1/8*(2*ecg[i]*(i) + ecg[i]*(i-1) - ecg[i]*(i-3) - 2*ecg[i]*(i-4))
    }


    public static void main(String []args){
        //Диаграмма ECG
        ECGModel ecgModel = new ECGModel();
        ecgModel.printECG();
        //главное окно
        Window appWindow = new Window(450, 400,"ECG");
        appWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appWindow.setVisible(true);


    }
}

