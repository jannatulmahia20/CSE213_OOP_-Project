module com.example.movieproduction.usee7and8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.movieproduction.usee7and8 to javafx.fxml;
    exports com.example.movieproduction.usee7and8;
}