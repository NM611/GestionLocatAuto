package sn.niang;

import sn.niang.controller.ClientController;

public class GestionLocatAuto {
    public static void main(String[] args) {
        System.out.println("Initialisation application");
        ClientController clientController = new ClientController();
        clientController.process();
    }
}
