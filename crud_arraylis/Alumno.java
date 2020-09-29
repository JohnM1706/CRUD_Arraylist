
package crud_arraylis;

/**
 *
 * @author jhonj
 */
public class Alumno {
    String nombre,apellido,ide,tel;

    public Alumno(String nombre, String apellido, String ide, String tel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ide = ide;
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
