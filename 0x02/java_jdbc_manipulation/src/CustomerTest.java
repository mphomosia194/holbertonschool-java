public class CustomerTest {

    public static void main(String[] args) {

        String url = "jdbc:sqlite:sqlite_database_marco_2022.db";

        CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();

        // 1) Creating the database
        customerDAOImpl.connect(url);

        // 2) Creating the table
        customerDAOImpl.createTable(url);

        // 3) Inserting customers
        Customer c1 = new Customer();
        c1.setName("Danilo R. Pereira");
        c1.setAge(37);
        c1.setCpf("111.111.111-11");
        c1.setRg("222.222.222-22");

        Customer c2 = new Customer();
        c2.setName("Joao Oliveira Silva");
        c2.setAge(55);
        c2.setCpf("888.111.111-11");
        c2.setRg("777.222.222-22");

        customerDAOImpl.insert(url, c1);
        customerDAOImpl.insert(url, c2);

        // 4) Selecting all customers
        customerDAOImpl.selectAll(url);

        // 5) Updating a customer
        customerDAOImpl.update(url, 1, "Danilo Rodrigues Pereira", 38);
        customerDAOImpl.selectAll(url);

        // 6) Deleting a customer
        customerDAOImpl.delete(url, 2);
        customerDAOImpl.selectAll(url);
    }
}
