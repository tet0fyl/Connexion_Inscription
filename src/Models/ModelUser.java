package Models;

public class ModelUser {
    private String login,mdp, nom,prenom,adresse,ville,email;
    private int codeVille;


    public ModelUser(String login, String mdp, String nom, String prenom, String adresse, String ville, String email, int codeVille) {
        this.login = login;
        this.mdp = mdp;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.email = email;
        this.codeVille = codeVille;
    }
}
