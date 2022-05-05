module com.example.imageserviceapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.imageserviceapp to javafx.fxml;
    exports com.example.imageserviceapp;
}