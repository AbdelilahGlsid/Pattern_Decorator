module designpattern.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens designpattern.demo1 to javafx.fxml;
    exports designpattern.demo1;
    exports designpattern.demo1.Boisson;
    opens designpattern.demo1.Boisson to javafx.fxml;
}