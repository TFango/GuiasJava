public class Autor {
    private String name;
    private String apellido;
    private String email;
    private char genero;

    public Autor(String name, String apellido, String email, char genero) {
        this.name = name;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public char getGenero() { return genero; }
    public void setGenero(char genero) { this.genero = genero; }


    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", genero=" + genero +
                '}';
    }
}
