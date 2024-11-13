module dk.haliimo.startproject46 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.haliimo.startproject46 to javafx.fxml;
    exports dk.haliimo.startproject46;
}