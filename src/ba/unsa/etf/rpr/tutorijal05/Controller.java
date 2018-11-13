package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class Controller {

    private SimpleStringProperty tekst;
    private double data = 0;
    private String operation = "";

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

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void divideClick(ActionEvent actionEvent) {
        data = Double.parseDouble(getTekst());
        operation = "/";
        setTekst("0");
    }

    public void multiplyClick(ActionEvent actionEvent) {
        data = Double.parseDouble(getTekst());
        operation = "x";
        setTekst("0");
    }

    public void no1Click(ActionEvent actionEvent) {
        if (getTekst().equals("0"))
            setTekst("1");
        else setTekst(getTekst() + "1");
    }

    public void no2Click(ActionEvent actionEvent) {
        if (getTekst().equals("0"))
            setTekst("2");
        else setTekst(getTekst() + "2");

    }

    public void no3Click(ActionEvent actionEvent) {
        if (getTekst().equals("0"))
            setTekst("3");
        else setTekst(getTekst() + "3");

    }

    public void no4Click(ActionEvent actionEvent) {
        if (getTekst().equals("0"))
            setTekst("4");
        else setTekst(getTekst() + "4");

    }

    public void no5Click(ActionEvent actionEvent) {
        if (getTekst().equals("0"))
            setTekst("5");
        else setTekst(getTekst() + "5");

    }

    public void no6Click(ActionEvent actionEvent) {
        if (getTekst().equals("0"))
            setTekst("6");
        else setTekst(getTekst() + "6");

    }

    public void no7Click(ActionEvent actionEvent) {
        if (getTekst().equals("0"))
            setTekst("7");
        else setTekst(getTekst() + "7");

    }

    public void no8Click(ActionEvent actionEvent) {
        if (getTekst().equals("0"))
            setTekst("8");
        else setTekst(getTekst() + "8");

    }

    public void no9Click(ActionEvent actionEvent) {
        if (getTekst().equals("0"))
            setTekst("9");
        else setTekst(getTekst() + "9");

    }

    public void minusClick(ActionEvent actionEvent) {
        setData(Double.parseDouble(getTekst()));
        setOperation("-");
        setTekst("0");
    }

    public void plusClick(ActionEvent actionEvent) {
        setData(Double.parseDouble(getTekst()));
        setOperation("+");
        setTekst("0");
    }

    public void equalsClick(ActionEvent actionEvent) {
        double data1 = Double.parseDouble(getTekst());
        Double rezultat = new Double(0);
        if (getOperation().equals("+")) {
            rezultat = getData() + data1;
            setTekst(rezultat.toString());
        } else if (getOperation().equals("-")) {
            rezultat = getData() - data1;
            setTekst(rezultat.toString());
        } else if (getOperation().equals("/")) {
            rezultat = getData() / data1;
            setTekst(rezultat.toString());
        } else if (getOperation().equals("x")) {
            rezultat = getData() * data1;
            setTekst(rezultat.toString());
        } else if (getOperation().equals("%")) {
            rezultat = getData() % data1;
            setTekst(rezultat.toString());
        }
    }

    public void dotClick(ActionEvent actionEvent) {
        setTekst(getTekst() + ".");
    }

    public void no0Click(ActionEvent actionEvent) {
        if (getTekst().equals("0"))
            setTekst("0");
        else setTekst(getTekst() + "0");

    }

    public void percentClick(ActionEvent actionEvent) {
        setData(Double.parseDouble(getTekst()));
        setOperation("%");
        setTekst("0");
    }
}
