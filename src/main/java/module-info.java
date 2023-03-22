module com.upchiapas.m_lectorescritore {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.upchiapas.m_lectorescritore to javafx.fxml;
    exports com.upchiapas.m_lectorescritore;
}