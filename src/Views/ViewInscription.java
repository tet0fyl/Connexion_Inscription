package Views;

import Controllers.ControllerInscription;
import Models.User;
import Tools.NodeIniter;
import Tools.Paths;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.Hashtable;

public class ViewInscription {
    private Group root;
    private VBox titleFormulaire;
    private Label lblLogin, lblMotDePasse, lblNom,lblPrenom,lblAdresse, lblCodePostal,lblVille,lblEmail;
    private TextField fieldLogin, fieldNom,fieldPrenom, fieldAdresse,fieldCodePostal, fieldVille, fieldEmail;
    private PasswordField fieldMotDePasse;
    private Hashtable<Integer,TextField> listTextFiled = new Hashtable<Integer,TextField>();
    private Button btnValider, btnExit;
    private VBox vBoxMainContainer;

    ViewInscription(Group root){
        this.root=root;

        initElementOfTheView();

        clearAndInitRoot();
    }

    void initElementOfTheView(){

        titleFormulaire = NodeIniter.initTitle(Paths.titleInscription);

        lblLogin = NodeIniter.initLabel(Paths.lblLogin);
        fieldLogin = NodeIniter.initTextField();
        listTextFiled.put(User.KEY_LOGIN, fieldLogin);

        lblMotDePasse = NodeIniter.initLabel(Paths.lblMdp);
        fieldMotDePasse = NodeIniter.initPasswordField();
        listTextFiled.put(User.KEY_MDP, fieldMotDePasse);

        lblNom = NodeIniter.initLabel(Paths.lblNom);
        fieldNom = NodeIniter.initTextField();
        listTextFiled.put(User.KEY_NOM, fieldNom);

        lblPrenom = NodeIniter.initLabel(Paths.lblPrenom);
        fieldPrenom = NodeIniter.initTextField();
        listTextFiled.put(User.KEY_PRENOM, fieldPrenom);

        lblAdresse = NodeIniter.initLabel(Paths.lblAdresse);
        fieldAdresse = NodeIniter.initTextField();
        listTextFiled.put(User.KEY_ADRESSE, fieldAdresse);

        lblCodePostal = NodeIniter.initLabel(Paths.lblCodeVille);
        fieldCodePostal = NodeIniter.initTextField();
        listTextFiled.put(User.KEY_CODE_VILLE, fieldCodePostal);

        lblVille = NodeIniter.initLabel(Paths.lblVille);
        fieldVille = NodeIniter.initTextField();
        listTextFiled.put(User.KEY_VILLE, fieldVille);

        lblEmail = NodeIniter.initLabel(Paths.lblEMail);
        fieldEmail = NodeIniter.initTextField();
        listTextFiled.put(User.KEY_EMAIL, fieldEmail);

        btnValider = NodeIniter.initButton(Paths.titleInscription);
        btnValider.setDisable(true);

        btnExit = NodeIniter.initButton(Paths.btnExit);


        addToVBox();

    }

    void addToVBox(){
        vBoxMainContainer = NodeIniter.initVBox();
        vBoxMainContainer.getChildren().add(titleFormulaire);
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndFieldHBox(lblLogin,fieldLogin));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndFieldHBox(lblMotDePasse,fieldMotDePasse));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndFieldHBox(lblNom,fieldNom));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndFieldHBox(lblPrenom,fieldPrenom));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndFieldHBox(lblAdresse,fieldAdresse));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndFieldHBox(lblCodePostal,fieldCodePostal));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndFieldHBox(lblVille,fieldVille));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndFieldHBox(lblEmail,fieldEmail));
        vBoxMainContainer.getChildren().add(btnValider);
        vBoxMainContainer.getChildren().add(btnExit);

    }

    void clearAndInitRoot(){
        root.getChildren().clear();
        root.getChildren().add(NodeIniter.initBackground());
        root.getChildren().add(vBoxMainContainer);
    }

    void setEvents(ControllerInscription controllerInscription){
        btnValider.setOnMouseClicked(controllerInscription);
        btnExit.setOnMouseClicked(controllerInscription);
    }

    public Button getBtnValider() {
        return btnValider;
    }

    public Button getBtnExit(){
        return btnExit;
    }

    public Hashtable<Integer,TextField> getListTextField() {
        return listTextFiled;
    }
}
