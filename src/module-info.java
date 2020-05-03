module workshop.javafx.jdbc {

    requires javafx.fxml;
    requires javafx.controls;

    opens application;
    opens gui;
    opens gui.util;
    opens model.entities;

}