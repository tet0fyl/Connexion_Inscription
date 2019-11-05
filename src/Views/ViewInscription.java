package Views;

import Controllers.ControllerInscription;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.lang.reflect.Field;
import java.nio.file.attribute.PosixFileAttributes;

public class ViewInscription {
    private Group root;
    private Text titleFormulaire;
    private Label lblNom,lblPrenom,lblAdresse, lblCodePostal,lblVille,lblEmail;
    private TextField fieldNom,fieldPrenom, fieldAdresse,fieldCodePostal, fieldVille, fieldEmail;
    private Button btnValider;
    private VBox vBoxMainContainer;

    ViewInscription(Group root){
        this.root=root;

        initElementOfTheView();

        initVBox();

        clearAndInitRoot();
    }

    void initElementOfTheView(){
        vBoxMainContainer=new VBox();

        titleFormulaire = initTitle("Inscription");

        lblNom = initLabel("Nom :");
        fieldNom = initTextField();


        lblPrenom = initLabel("Prenom :");
        fieldPrenom = initTextField();


        lblAdresse = initLabel("Adresse :");
        fieldAdresse = initTextField();


        lblCodePostal = initLabel("Code Postal :");
        fieldCodePostal = initTextField();


        lblVille = initLabel("Ville :");
        fieldVille = initTextField();


        lblEmail = initLabel("E-Mail :");
        fieldEmail = initTextField();

        btnValider = initButton("Valider");

    }

    Button initButton(String text){
        Button b = new Button(text);
        return b;
    }

    Text initTitle(String text){
        Text t = new Text(text);

        return t;
    }

    Label initLabel(String txt){
        Label l = new Label(txt);
        l.setMinWidth(ViewHandler.squareSizeScene/3);
        l.setAlignment(Pos.BOTTOM_RIGHT);
        return l;
    }

    TextField initTextField(){
        TextField tf = new TextField();
        tf.setMinWidth(ViewHandler.squareSizeScene/3);
        tf.setAlignment(Pos.BOTTOM_LEFT);
        return tf;
    }

    HBox initLabelAndField(Label label, TextField field){
        HBox hbox = new HBox();
        hbox.getChildren().add(label);
        hbox.getChildren().add(field);
        hbox.setAlignment(Pos.CENTER);
        hbox.setMinWidth(ViewHandler.squareSizeScene);
        return hbox;
    }

    void initVBox(){
        vBoxMainContainer.setMinWidth(ViewHandler.squareSizeScene);
        vBoxMainContainer.setAlignment(Pos.CENTER);
        vBoxMainContainer.getChildren().add(titleFormulaire);
        vBoxMainContainer.getChildren().add(initLabelAndField(lblNom,fieldNom));
        vBoxMainContainer.getChildren().add(initLabelAndField(lblPrenom,fieldPrenom));
        vBoxMainContainer.getChildren().add(initLabelAndField(lblAdresse,fieldAdresse));
        vBoxMainContainer.getChildren().add(initLabelAndField(lblCodePostal,fieldCodePostal));
        vBoxMainContainer.getChildren().add(initLabelAndField(lblVille,fieldVille));
        vBoxMainContainer.getChildren().add(initLabelAndField(lblEmail,fieldEmail));
        vBoxMainContainer.getChildren().add(btnValider);

    }

    void clearAndInitRoot(){
        root.getChildren().clear();
        root.getChildren().add(vBoxMainContainer);
    }

    void setEvents(ControllerInscription controllerInscription){

    }

}
