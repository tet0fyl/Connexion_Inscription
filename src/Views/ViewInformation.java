package Views;

import Controllers.ControllerInformation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class ViewInformation {
    private Group root;
    private Text titleInformation;
    private Label lblLogin, lblNom,lblPrenom,lblAdresse, lblCodePostal,lblVille,lblEmail, fieldLogin, fieldNom,fieldPrenom, fieldAdresse,fieldCodePostal, fieldVille, fieldEmail;;
    private Button btnRetour;
    private VBox vBoxMainContainer;

    ViewInformation(Group root){
        this.root=root;

        initElementOfTheView();

        clearAndInitRoot();
    }

    void initElementOfTheView(){
        vBoxMainContainer=new VBox();

        titleInformation = initTitle("Inscription");

        lblLogin = initLabel("Login :");
        fieldLogin = initText();

        lblNom = initLabel("Nom :");
        fieldNom = initText();

        lblPrenom = initLabel("Prenom :");
        fieldPrenom = initText();

        lblAdresse = initLabel("Adresse :");
        fieldAdresse = initText();

        lblCodePostal = initLabel("Code Postal :");
        fieldCodePostal = initText();

        lblVille = initLabel("Ville :");
        fieldVille = initText();

        lblEmail = initLabel("E-Mail :");
        fieldEmail = initText();

        btnRetour = initButton("RETOUR");

        initVBox();

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

    Label initText(){
        Label l = new Label();
        l.setMinWidth(ViewHandler.squareSizeScene/3);
        l.setAlignment(Pos.BOTTOM_LEFT);
        return l;
    }

    PasswordField initPasswordField(){
        PasswordField pf = new PasswordField();
        pf.setMinWidth(ViewHandler.squareSizeScene/3);
        pf.setAlignment(Pos.BOTTOM_LEFT);
        return pf;
    }

    HBox initLabelAndField(Label label, Label field){
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
        vBoxMainContainer.getChildren().add(titleInformation);
        vBoxMainContainer.getChildren().add(initLabelAndField(lblLogin,fieldLogin));
        vBoxMainContainer.getChildren().add(initLabelAndField(lblNom,fieldNom));
        vBoxMainContainer.getChildren().add(initLabelAndField(lblPrenom,fieldPrenom));
        vBoxMainContainer.getChildren().add(initLabelAndField(lblAdresse,fieldAdresse));
        vBoxMainContainer.getChildren().add(initLabelAndField(lblCodePostal,fieldCodePostal));
        vBoxMainContainer.getChildren().add(initLabelAndField(lblVille,fieldVille));
        vBoxMainContainer.getChildren().add(initLabelAndField(lblEmail,fieldEmail));
        vBoxMainContainer.getChildren().add(btnRetour);
    }

    void clearAndInitRoot(){
        root.getChildren().clear();
        root.getChildren().add(vBoxMainContainer);
    }

    void setEvents(ControllerInformation controllerInformation){
        btnRetour.setOnMouseClicked(controllerInformation);
    }

    public Button getBtnRetour() {
        return btnRetour;
    }
}
