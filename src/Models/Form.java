package Models;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicBoolean;

public class Form {

    private Hashtable<Integer,TextField> listOfTextField;
    private Button btnValidation;

    public Form(Hashtable<Integer, TextField> listOfTextField, Button btnValidation) {
        this.listOfTextField = listOfTextField;
        this.btnValidation = btnValidation;

        addEventOnChangeForAllTextViewToDisableValidationButton();
    }

    public boolean isEmtpyForm(){
        AtomicBoolean flag = new AtomicBoolean(true);

        listOfTextField.forEach((key,field)->{
            if(field.getText().trim().isEmpty()){
                flag.set(false);
            }
        });

        return flag.get();
    }

    public void addEventOnChangeForAllTextViewToDisableValidationButton(){
        listOfTextField.forEach((key,field)->{
            field.textProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    if(isEmtpyForm()){
                        btnValidation.setDisable(false);
                    }else{
                        btnValidation.setDisable(true);
                    }
                }
            });
        });
    }

    public Button getBtnValidation() {
        return btnValidation;
    }
}
