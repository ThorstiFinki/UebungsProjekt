module com.example.uebungsprojekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uebungsprojekt to javafx.fxml;
    exports com.example.uebungsprojekt;
}