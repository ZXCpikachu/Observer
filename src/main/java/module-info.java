module com.example.obser1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.example.obser1 to javafx.fxml;
    exports com.example.obser1;
    exports sub;
    opens sub to javafx.fxml;
}