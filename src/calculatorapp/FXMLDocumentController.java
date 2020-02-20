package calculatorapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable
{
    Calculator calc;
    boolean OperatorClicked = false;
    public FXMLDocumentController()
    {
        calc = new Calculator();
    }
    
    @FXML
    private TextField txt_display;
    
    @FXML
    private Label label;

    @FXML
    private Button btn_7;

    @FXML
    private Button btn_8;

    @FXML
    private Button btn_9;

    @FXML
    private Button btn_multiply;

    @FXML
    private Button btn_4;

    @FXML
    private Button btn_5;

    @FXML
    private Button btn_6;

    @FXML
    private Button btn_divide;

    @FXML
    private Button btn_0;

    @FXML
    private Button btn_subtract;

    @FXML
    private Button btn_3;

    @FXML
    private Button btn_2;

    @FXML
    private Button btn_1;

    @FXML
    private Button btn_add;

    @FXML
    private Button btn_equal;

    @FXML
    private Button btn_decimal;
    
    @FXML
    void btn_01_clicked(ActionEvent event)
    {
        txt_display.setText(txt_display.getText() + "1");
    }

    @FXML
    void btn_02_clicked(ActionEvent event)
    {
        txt_display.setText(txt_display.getText() + "2");
    }

    @FXML
    void btn_03_clicked(ActionEvent event)
    {
        txt_display.setText(txt_display.getText() + "3");
    }

    @FXML
    void btn_04_clicked(ActionEvent event)
    {
        txt_display.setText(txt_display.getText() + "4");
    }

    @FXML
    void btn_05_clicked(ActionEvent event)
    {
        txt_display.setText(txt_display.getText() + "5");
    }

    @FXML
    void btn_06_clicked(ActionEvent event)
    {
        txt_display.setText(txt_display.getText() + "6");
    }

    @FXML
    void btn_07_clicked(ActionEvent event)
    {
        txt_display.setText(txt_display.getText() + "7");
    }

    @FXML
    void btn_08_clicked(ActionEvent event)
    {
        txt_display.setText(txt_display.getText() + "8");
    }

    @FXML
    void btn_09_clicked(ActionEvent event)
    {
        txt_display.setText(txt_display.getText() + "9");
    }

    @FXML
    void btn_add_clicked(ActionEvent event)
    {
        calc.add(Double.parseDouble(txt_display.getText()));
        txt_display.setText("");
        OperatorClicked = true;
    }

    @FXML
    void btn_decimal_clicked(ActionEvent event)
    {
        StringBuilder sb = new StringBuilder(txt_display.getText());
        boolean isone = false;

        for(int i = 0; i < sb.length(); i++) //Checks to make sure there isn't a decimal.
        {
            if (sb.charAt(i) == '.')
            {
                isone = true;
            }
        }

        if (isone) //If there is a decimal doesn't do anything.
        { }
        else
        {
            txt_display.setText(txt_display.getText() + "."); //If false, adds a decimal.
        }
    }

    @FXML
    void btn_divide_clicked(ActionEvent event)
    {
        calc.divide(Double.parseDouble(txt_display.getText()));
        txt_display.setText("");
        OperatorClicked = true;
    }

    @FXML
    void btn_equals_clicked(ActionEvent event)
    {
        String s;
        if(OperatorClicked)
        {
            try
            {
                calc.equals(Double.parseDouble(txt_display.getText()));
                s = Double.toString(calc.getCurrentValue());
                if (s.endsWith(".0"))
                {
                    s = s.substring(0,s.length()-2);
                }
                txt_display.setText(s);
                OperatorClicked = false;
            }
            catch(Exception e)
            {
            }
        }
        else
        {
            try
            {
                calc.equals();
                s = Double.toString(calc.getCurrentValue());
                if (s.endsWith(".0"))
                {
                    s = s.substring(0,s.length()-2);
                }
                txt_display.setText(s);
            }
            catch(Exception e)
            {
            }
        }
    }

    @FXML
    void btn_multiply_clicked(ActionEvent event)
    {
        calc.multiply(Double.parseDouble(txt_display.getText()));
        txt_display.setText("");
        OperatorClicked = true;
    }

    @FXML
    void btn_subtract_clicked(ActionEvent event)
    {
        calc.subtract(Double.parseDouble(txt_display.getText()));
        txt_display.setText("");
        OperatorClicked = true;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        txt_display.setText("");
    }
    
}
