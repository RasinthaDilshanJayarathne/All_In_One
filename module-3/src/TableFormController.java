import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class TableFormController {
    public TableView<Customer> tblCustomer;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colSalary;
    ArrayList<Customer>customerArrayList=new ArrayList();

    {
        customerArrayList.add(new Customer("C001","Nimal","Colombo",25000));
        customerArrayList.add(new Customer("C002","Sunimal","Panadura",55000));
        customerArrayList.add(new Customer("C003","Wimal","Galle",67000));
        customerArrayList.add(new Customer("C004","Bimal","Mathara",100000));
        customerArrayList.add(new Customer("C005","Kamal","Kaluthara",35000));
    }
    public void initialize(){
        colId.setCellValueFactory(new PropertyValueFactory("id"));
        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory("salary"));

        tblCustomer.setItems(FXCollections.observableArrayList(customerArrayList));

    }
}
