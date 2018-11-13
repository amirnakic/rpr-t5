package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    private SimpleStringProperty tekst;

    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn0;
    public Button percentBtn;
    public Button divideBtn;
    public Button multiplyBtn;
    public Button minusBtn;
    public Button plusBtn;
    public Button equalsBtn;
    public Button dotBtn;
    public Label display;

    public Controller() {
        tekst = new SimpleStringProperty("0");
    }

    public String getTekst() {
        return tekst.get();
    }

    public void setTekst(String s) {
        this.tekst.set(s);
    }

    public SimpleStringProperty tekstProperty() {
        return tekst;
    }

    public void divideClick(ActionEvent actionEvent) {
    }

    public void multiplyClick(ActionEvent actionEvent) {
    }

    public void no1Click(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btn1) {
            if (getTekst().equals("0"))
                setTekst("1");
            else setTekst(getTekst() + "1");
        }
    }

    public void no2Click(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btn2) {
            if (getTekst().equals("0"))
                setTekst("2");
            else setTekst(getTekst() + "2");
        }
    }

    public void no3Click(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btn3) {
            if (getTekst().equals("0"))
                setTekst("3");
            else setTekst(getTekst() + "3");
        }
    }

    public void no4Click(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btn4) {
            if (getTekst().equals("0"))
                setTekst("4");
            else setTekst(getTekst() + "4");
        }
    }

    public void no5Click(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btn5) {
            if (getTekst().equals("0"))
                setTekst("5");
            else setTekst(getTekst() + "5");
        }
    }

    public void no6Click(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btn6) {
            if (getTekst().equals("0"))
                setTekst("6");
            else setTekst(getTekst() + "6");
        }
    }

    public void no7Click(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btn7) {
            if (getTekst().equals("0"))
                setTekst("7");
            else setTekst(getTekst() + "7");
        }
    }

    public void no8Click(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btn8) {
            if (getTekst().equals("0"))
                setTekst("8");
            else setTekst(getTekst() + "8");
        }
    }

    public void no9Click(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btn9) {
            if (getTekst().equals("0"))
                setTekst("9");
            else setTekst(getTekst() + "9");
        }
    }

    public void minusClick(ActionEvent actionEvent) {
    }

    public void plusClick(ActionEvent actionEvent) {
    }

    public void equalsClick(ActionEvent actionEvent) {
    }

    public void dotClick(ActionEvent actionEvent) {
    }

    public void no0Click(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btn0) {
            if (getTekst().equals("0"))
                setTekst("0");
            else setTekst(getTekst() + "0");
        }
    }

    public void percentCllick(ActionEvent actionEvent) {
    }
}
