package Views;

import Controllers.ControllerInscription;
import Models.ModelUser;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.Hashtable;

public class ViewInscription {
    private Group root;
    private Text titleFormulaire;
    private Label lblLogin, lblMotDePasse, lblNom,lblPrenom,lblAdresse, lblCodePostal,lblVille,lblEmail;
    private TextField fieldLogin, fieldNom,fieldPrenom, fieldAdresse,fieldCodePostal, fieldVille, fieldEmail;
    private PasswordField fieldMotDePasse;
    private Hashtable<Integer,TextField> listTextFiled = new Hashtable<Integer,TextField>();
    private Button btnValider;
    private VBox vBoxMainContainer;

    ViewInscription(Group root){
        this.root=root;

        initElementOfTheView();

        clearAndInitRoot();
    }

    void initElementOfTheView(){
        vBoxMainContainer=new VBox();

        titleFormulaire = initTitle("Inscription");

        lblLogin = initLabel("Login :");
        fieldLogin = initTextField();
        listTextFiled.put(ModelUser.KEY_LOGIN, fieldLogin);

        lblMotDePasse = initLabel("Mot de passe :");
        fieldMotDePasse = initPasswordField();
        listTextFiled.put(ModelUser.KEY_MDP, fieldMotDePasse);

        lblNom = initLabel("Nom :");
        fieldNom = initTextField();
        listTextFiled.put(ModelUser.KEY_NOM, fieldNom);

        lblPrenom = initLabel("Prenom :");
        fieldPrenom = initTextField();
        listTextFiled.put(ModelUser.KEY_PRENOM, fieldPrenom);

        lblAdresse = initLabel("Adresse :");
        fieldAdresse = initTextField();
        listTextFiled.put(ModelUser.KEY_ADRESSE, fieldAdresse);

        lblCodePostal = initLabel("Code Postal :");
        fieldCodePostal = initTextField();
        listTextFiled.put(ModelUser.KEY_CODE_VILLE, fieldCodePostal);



        lblVille = initLabel("Ville :");
        fieldVille = initTextField();
        listTextFiled.put(ModelUser.KEY_VILLE, fieldVille);




        lblEmail = initLabel("E-Mail :");
        fieldEmail = initTextField();
        listTextFiled.put(ModelUser.KEY_EMAIL, fieldEmail);



        btnValider = initButton("Valider");

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

    TextField initTextField(){
        TextField tf = new TextField();
        tf.setMinWidth(ViewHandler.squareSizeScene/3);
        tf.setAlignment(Pos.BOTTOM_LEFT);
        return tf;
    }

    PasswordField initPasswordField(){
        PasswordField pf = new PasswordField();
        pf.setMinWidth(ViewHandler.squareSizeScene/3);
        pf.setAlignment(Pos.BOTTOM_LEFT);
        return pf;
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
        vBoxMainContainer.getChildren().add(initLabelAndField(lblLogin,fieldLogin));
        vBoxMainContainer.getChildren().add(initLabelAndField(lblMotDePasse,fieldMotDePasse));
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
        btnValider.setOnMouseClicked(controllerInscription);
    }

    public TextField getFieldMotDePasse() {
        return fieldMotDePasse;
    }

    public Button getBtnValider() {
        return btnValider;
    }

    public Hashtable<Integer,TextField> getListTextFiled() {
        return listTextFiled;
    }
}
