module co.edu.uniquindio.empresatransportefx.empresaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.empresatransportefx.empresaapp to javafx.fxml;
    exports co.edu.uniquindio.empresatransportefx.empresaapp;
    opens co.edu.uniquindio.empresatransportefx.empresaapp.controller;
    exports co.edu.uniquindio.empresatransportefx.empresaapp.controller;
}