module com.example.pianina {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.pianina to javafx.fxml;
    exports com.example.pianina;
}