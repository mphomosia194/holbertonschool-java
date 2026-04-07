public class CustomerTest {

    public static void main(String[] args) {

        String url = "jdbc:sqlite:sqlite_database_marco_2022.db";

        CustomerDAOImpl dao = new CustomerDAOImpl();

        dao.connect(url);
        dao.createTable(url);

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

        dao.insert(url, c1);
        dao.insert(url, c2);

        dao.selectAll(url);

        dao.update(url, 1, "Danilo Rodrigues Pereira", 38);
        dao.selectAll(url);

        dao.delete(url, 2);
        dao.selectAll(url);
    }
}
