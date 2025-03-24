module com.konekotech.jGraphMaker {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires aspose.cells;

    exports com.konekotech.jGraphMaker;
    opens com.konekotech.jGraphMaker to javafx.fxml;
}
