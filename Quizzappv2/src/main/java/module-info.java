module com.pnkn.quizzappv2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pnkn.quizzappv2 to javafx.fxml;
    exports com.pnkn.quizzappv2;
}
