public class Customer {
    private Integer id;
    private String name;
    private Integer age;
    private String cpf;
    private String rg;

    public Customer() {}

    public Customer(Integer id, String name, Integer age, String cpf, String rg) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
