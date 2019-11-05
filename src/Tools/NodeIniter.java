package Tools;

import Views.ViewHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class NodeIniter {

    public static Button initButton(String text){
        Button b = new Button(text);
        b.getStyleClass().add("btn");

        return b;
    }

    public static Text initTitle(String text){
        Text t = new Text(text);
        t.getStyleClass().add("title");

        return t;
    }

    public static Label initLabel(String txt){
        Label l = new Label(txt);
        l.setMinWidth(ViewHandler.squareSizeScene/3);
        l.setAlignment(Pos.BOTTOM_RIGHT);
        return l;
    }

    public static Label initText(String txt){
        Label l = new Label(txt);
        l.setMinWidth(ViewHandler.squareSizeScene/3);
        l.setAlignment(Pos.BOTTOM_RIGHT);
        return l;
    }

    public static TextField initTextField(){
        TextField tf = new TextField();
        tf.setMinWidth(ViewHandler.squareSizeScene/3);
        tf.setAlignment(Pos.BOTTOM_LEFT);
        return tf;
    }

    public static PasswordField initPasswordField(){
        PasswordField pf = new PasswordField();
        pf.setMinWidth(ViewHandler.squareSizeScene/3);
        pf.setAlignment(Pos.BOTTOM_LEFT);
        return pf;
    }

    public static HBox initLabelAndFieldHBox(Label label, TextField field){
        HBox hbox = new HBox();
        hbox.getChildren().add(label);
        hbox.getChildren().add(field);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(5);
        hbox.setMinWidth(ViewHandler.squareSizeScene);
        return hbox;
    }

    public static HBox initLabelAndTextHBox(Label label, Label field){
        HBox hbox = new HBox();
        hbox.getChildren().add(label);
        hbox.getChildren().add(field);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(5);
        hbox.setMinWidth(ViewHandler.squareSizeScene);
        return hbox;
    }

    public static VBox initVBox(){
        VBox vbox = new VBox();

        vbox.setMinWidth(ViewHandler.squareSizeScene);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        return vbox;
    }

}
