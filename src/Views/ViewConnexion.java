package Views;

import Controllers.ControllerConnexion;
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


public class ViewConnexion {
    private Group root;
    private VBox titleConnexion;
    private TextField fieldLogin;
    private PasswordField fieldMdp;
    private Label lblLogin, lblMdp;
    private VBox vBoxMainContainer;
    private Button btnValider, btnRetour;
    private Hashtable<Integer,TextField> listTextFiled = new Hashtable<Integer,TextField>();


    ViewConnexion(Group root){
        this.root=root;

        initElementOfTheView();

        clearAndInitRoot();
    }

    void initElementOfTheView(){

        titleConnexion = NodeIniter.initTitle(Paths.titleConnexion);

        lblLogin = NodeIniter.initLabel("Login :");
        fieldLogin = NodeIniter.initTextField();
        listTextFiled.put(User.KEY_LOGIN, fieldLogin);


        lblMdp = NodeIniter.initLabel("Mot de passe :");
        fieldMdp = NodeIniter.initPasswordField();
        listTextFiled.put(User.KEY_LOGIN, fieldMdp);


        btnValider = NodeIniter.initButton("Connexion");
        btnRetour = NodeIniter.initButton("Retour");

        addToVBox();

    }

    void addToVBox(){
        vBoxMainContainer = NodeIniter.initVBox();
        vBoxMainContainer.getChildren().add(titleConnexion);
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndFieldHBox(lblLogin,fieldLogin));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndFieldHBox(lblMdp,fieldMdp));
        vBoxMainContainer.getChildren().add(btnValider);
        vBoxMainContainer.getChildren().add(btnRetour);
    }

    void clearAndInitRoot(){
        root.getChildren().clear();
        root.getChildren().add(NodeIniter.initBackground());
        root.getChildren().add(vBoxMainContainer);
    }

    void setEvents(ControllerConnexion controllerConnexion){
        btnValider.setOnMouseClicked(controllerConnexion);
        btnRetour.setOnMouseClicked(controllerConnexion);
    }

    public Button getBtnValider() {
        return btnValider;
    }

    public Button getBtnRetour() {
        return btnRetour;
    }

    public TextField getFieldLogin() {
        return fieldLogin;
    }

    public PasswordField getFieldMdp(){
        return fieldMdp;
    }

    public Hashtable<Integer, TextField> getListTextFiled() {
        return listTextFiled;
    }
}
