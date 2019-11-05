package Models;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicBoolean;

public class FormChecker {

    public static boolean isEmtpyForm(Hashtable<Integer, TextField> listOfTextField){
        AtomicBoolean flag = new AtomicBoolean(true);

        listOfTextField.forEach((key,field)->{
            if(field.getText().trim().isEmpty()){
                flag.set(false);
            }
        });

        return flag.get();
    }

    public static void addEventOnChangeForAllTextViewToDisableValidationButton(Hashtable<Integer,TextField> listOfTextField, Button btn){
        listOfTextField.forEach((key,field)->{
            field.textProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    if(FormChecker.isEmtpyForm(listOfTextField)){
                        btn.arm();
                    }else{
                        btn.disarm();
                    }
                    System.out.println("Y a une event");
                }
            });
        });
    }
}
