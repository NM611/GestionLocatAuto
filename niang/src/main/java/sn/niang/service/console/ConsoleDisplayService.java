package sn.niang.service.console;

import sn.niang.domain.Location;
import sn.niang.domain.User;
import sn.niang.domain.Vehicule;
import sn.niang.repository.UserRepository;
import sn.niang.service.DisplayService;

import java.util.Locale;

public class ConsoleDisplayService implements DisplayService {


    private final UserRepository userRepository;

    public ConsoleDisplayService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public void afficherBienvenu() {
        System.out.println("Bienvenu sur la plateforme de location en ligne!");
    }

    public void afficherMenuPrincipal() {
        System.out.println("> l pour lister les services disponibles ");
    }


    public void afficherListeUsers(User[] users){
        System.out.println("Liste des utilisateurs");
        for (int i=0;i<users.length;i++){
            User user=users[i];
            System.out.println(String.format("> %s %s %s %s %s", user.getId(), user.getNomComplet(),user.getTel(),user.getEmail(),user.getAdresse(),user.getProfil().getLibelle()));

        }

    }

    public void afficherListeVehicules(Vehicule[] vehicules){
        System.out.println("Liste des vehicules");
        for (int i=0;i<vehicules.length;i++){
            Vehicule vehicule=vehicules[i];
            System.out.println(String.format("> %s %s %s",vehicule.getId(),vehicule.getMatricule(),vehicule.getDescription().getMarque(),vehicule.getDescription().getCouleur(),vehicule.getDescription().getNbRoues()));
        }

    }

    public void afficherListeLocations(Location[] locations,User user){
        System.out.println(String.format("La liste des locations de %s :", user.getNomComplet()));
        for (int i = 0; i < locations.length; i++) {
            Location location = locations[i];
            System.out.println(String.format("> %s %s %s", location.getId(), location.getDate(), location.getPeriode(),location.getVehicule().getMatricule()));
        }
    }





}
