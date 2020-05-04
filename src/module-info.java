module workshop.javafx.jdbc {

    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;

    opens application;
    opens db;
    opens gui;
    opens gui.util;
    opens model.dao;
    opens model.entities;
    opens model.services;

}