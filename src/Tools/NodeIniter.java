package Tools;

import Views.ViewHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

public class NodeIniter {

    public static Button initButton(String text){
        Button b = new Button(text);
        b.getStyleClass().add("button");
        VBox.setMargin(b,new Insets(10,0,0,0));

        return b;
    }

    public static VBox initTitle(String text){
        Label t = new Label(text);
        VBox.setMargin(t,new Insets(100,0,0,0));
        t.getStyleClass().add("label-header");
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().add(t);
        vbox.getStyleClass().add("menu-bar");

        return vbox;
    }

    public static Label initErrorLabel(){
        Label l = new Label();
        l.getStyleClass().add("label-error");
        l.setAlignment(Pos.CENTER);
        return l;
    }

    public static Label initLabel(String txt){
        Label l = new Label(txt);
        l.setMinWidth(ViewHandler.squareSizeScene/3);
        l.getStyleClass().add("label-bright");
        l.setAlignment(Pos.BOTTOM_RIGHT);
        return l;
    }

    public static Label initText(String txt){
        Label l = new Label(txt);
        l.setMinWidth(ViewHandler.squareSizeScene/3);
        l.setAlignment(Pos.BOTTOM_LEFT);
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

    public static VBox initBackground(){
        VBox vbox = new VBox();
        vbox.setMinWidth(Screen.getPrimary().getBounds().getWidth());
        vbox.setMinHeight(Screen.getPrimary().getBounds().getHeight());
        vbox.getStyleClass().add("background");
        return vbox;
    }


}
