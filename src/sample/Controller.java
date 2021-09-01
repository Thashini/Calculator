
package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    private long num1;

    private long num2;
    private String text1,text2;



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button sin;

    @FXML
    private Button tan;

    @FXML
    private Button exp;

    @FXML
    private Button cos;

    @FXML
    private Button dvd;

    @FXML
    private Button clr;

    @FXML
    private Button sub;

    @FXML
    private Button mul;

    @FXML
    private Button add;

    @FXML
    private Button history;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private Label lbltotal;

    @FXML
    private Label lblOperation;
    private Object FXMLLoader;

    @FXML
    void on_add(ActionEvent event) { try {
        String text1 = txt1.getText();
        String text2 = txt2.getText();
        this.num1 = Integer.parseInt(text1);
        this.num2 = Integer.parseInt(text2);
        long add = this.num1 + this.num2;
        java.awt.Label output;
        lblOperation.setText(String.valueOf(num1) + "+" + String.valueOf(num2));
        lbltotal.setText(String.valueOf("=" + add));
    }
    catch (NumberFormatException e) {
        lbltotal.setText("Invalid Input");
    }
    }

    @FXML
    void on_clr(ActionEvent event) {
      txt1.setText("");
        txt2.setText("");
        lbltotal.setText("");
        lblOperation.setText("");
    }

    @FXML
    void on_cos(ActionEvent event) throws IOException { try {
        String a = txt1.getText();
        //this.num1=Integer.parseInt(a);
        double cos = Math.toRadians(Double.parseDouble(a));
        //float cos = (float) Math.cos(num1);
        //lblOperation.setText(String.valueOf(num1) + "+" + String.valueOf(num2));
        lbltotal.setText(String.valueOf(Math.cos(cos)));
    }
    catch (NumberFormatException e) {
        lbltotal.setText("Invalid Input");
    }
    }

    @FXML
    void on_dvd(ActionEvent event) { try {
        String text1 = txt1.getText();
        String text2 = txt2.getText();
        this.num1 = Integer.parseInt(text1);
        this.num2 = Integer.parseInt(text2);
        float dvd = this.num1 / this.num2;
        java.awt.Label output;
        lblOperation.setText(String.valueOf(num1) + "/" + String.valueOf(num2));
        lbltotal.setText(String.valueOf("=" + dvd));
    }
    catch (NumberFormatException e) {
        lbltotal.setText("Invalid Input");
    }
    }

    @FXML

    void on_exp(ActionEvent event) {
        try { String radians = txt1.getText();
            this.num1 = Integer.parseInt(radians);
            double exp = Math.exp(num1);
            lbltotal.setText(String.valueOf(exp));
            
        }
            catch (NumberFormatException e){
            lbltotal.setText("Invalid Input");
}
        }


    @FXML
    void on_his(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample/History.fxml"));
            Parent root = loader.load();
            Main.getHistoryStage().setScene(new Scene(root));
        } catch (NumberFormatException | IOException e) {
            lbltotal.setText("Invalid Input");
        }
    }

   // private void openHistoryWindow() {
        // {
            //FXMLLoader loader = new FXMLLoader(getClass().getResource("sample/History.fxml"));
           // Parent root = loader.load();
           // Main.getHistoryStage().setScene(new Scene(root));
        //} //catch (NumberFormatException | IOException e) {
            //lbltotal.setText("Invalid Input");
        //}
   // }
    @FXML
    void on_mul(ActionEvent event) {
        try{
        String text1 = txt1.getText();
        String text2 = txt2.getText();
        this.num1= Integer.parseInt(text1);
        this.num2= Integer.parseInt(text2);
        long mul = this.num1*this.num2;
        java.awt.Label output;
        lblOperation.setText(String.valueOf(num1) + "x" + String.valueOf(num2));
        lbltotal.setText(String.valueOf("="+mul));
    }
     catch (NumberFormatException e) {
        lbltotal.setText("Invalid Input");
    }

}

    @FXML
    void on_sin(ActionEvent event) { try{
        String a = txt1.getText();
        //this.num1=Integer.parseInt(a);
        double sin =Math.toRadians(Double.parseDouble(a));
        //float sin = (float) Math.cos(num1);
        lbltotal.setText(String.valueOf(Math.sin(sin))); }
    catch (NumberFormatException e) {
        lbltotal.setText("Invalid Input");
    }
    }


    @FXML
    void on_sub(ActionEvent event) { try {
        String text1 = txt1.getText();
        String text2 = txt2.getText();
        this.num1 = Integer.parseInt(text1);
        this.num2 = Integer.parseInt(text2);
        long sub = this.num1 - this.num2;
        java.awt.Label output;
        lblOperation.setText(String.valueOf(num1) + "-" + String.valueOf(num2));
        lbltotal.setText(String.valueOf("=" + sub));
    }
    catch (NumberFormatException e) {
        lbltotal.setText("Invalid Input");
    }
    }

    @FXML
    void on_tan(ActionEvent event) {
        try {
            String a = txt1.getText();
            //this.num1=Integer.parseInt(a);
            double tan = Math.toRadians(Double.parseDouble(a));
            //float cos = (float) Math.cos(num1);
            lbltotal.setText(String.valueOf(Math.tan(tan)));
        } catch (NumberFormatException e) {
            lbltotal.setText("Invalid Input");
        }
    }


    @FXML
    void initialize() {
        assert sin != null : "fx:id=\"sin\" was not injected: check your FXML file 'calculator.fxml'.";
        assert tan != null : "fx:id=\"tan\" was not injected: check your FXML file 'calculator.fxml'.";
        assert exp != null : "fx:id=\"exp\" was not injected: check your FXML file 'calculator.fxml'.";
        assert cos != null : "fx:id=\"cos\" was not injected: check your FXML file 'calculator.fxml'.";
        assert dvd != null : "fx:id=\"dvd\" was not injected: check your FXML file 'calculator.fxml'.";
        assert clr != null : "fx:id=\"clr\" was not injected: check your FXML file 'calculator.fxml'.";
        assert sub != null : "fx:id=\"sub\" was not injected: check your FXML file 'calculator.fxml'.";
        assert mul != null : "fx:id=\"mul\" was not injected: check your FXML file 'calculator.fxml'.";
        assert add != null : "fx:id=\"add\" was not injected: check your FXML file 'calculator.fxml'.";
        assert history != null : "fx:id=\"history\" was not injected: check your FXML file 'calculator.fxml'.";
        assert txt1 != null : "fx:id=\"txt1\" was not injected: check your FXML file 'calculator.fxml'.";
        assert txt2 != null : "fx:id=\"txt2\" was not injected: check your FXML file 'calculator.fxml'.";
        assert lbltotal != null : "fx:id=\"lbltotal\" was not injected: check your FXML file 'calculator.fxml'.";

    }
}
