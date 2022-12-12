module com.example.comp1011200489011test2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.google.gson;
    requires java.net.http;


    opens com.example.comp1011200489011test2 to javafx.fxml, com.google.gson;
    exports com.example.comp1011200489011test2;
}