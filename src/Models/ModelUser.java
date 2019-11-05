package Models;

import javafx.scene.control.TextField;

import java.util.Hashtable;

public class ModelUser {
    private String login,mdp, nom,prenom,adresse,ville,email,codeVille;

    public final static int KEY_LOGIN = 42;
    public final static int KEY_MDP = 43;
    public final static int KEY_NOM = 44;
    public final static int KEY_PRENOM = 45;
    public final static int KEY_ADRESSE = 46;
    public final static int KEY_VILLE = 47;
    public final static int KEY_CODE_VILLE = 48;
    public final static int KEY_EMAIL = 49;

    public ModelUser(){

    }

    public void initUser(Hashtable<Integer, TextField> listOfTextField) {
        this.login = listOfTextField.get(KEY_LOGIN).getText();
        this.mdp = listOfTextField.get(KEY_MDP).getText();
        this.nom = listOfTextField.get(KEY_NOM).getText();
        this.prenom = listOfTextField.get(KEY_PRENOM).getText();
        this.adresse = listOfTextField.get(KEY_ADRESSE).getText();
        this.ville = listOfTextField.get(KEY_VILLE).getText();
        this.email = listOfTextField.get(KEY_EMAIL).getText();
        this.codeVille = listOfTextField.get(KEY_CODE_VILLE).getText();
    }

    public boolean connection(String login, String mdp){
        if(this.login.equals(login) && this.mdp.equals(mdp)){
            return true;
        }else{
            return false;
        }
    }
}
