public class Main {
    public static void main(String[] args) {



    }
    public class Autor{
        private String nombre;
        private String nacionalidad;

        public Autor(String nombre, String nacionalidad) {
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNacionalidad() {
            return nacionalidad;
        }

        public void setNacionalidad(String nacionalidad) {
            this.nacionalidad = nacionalidad;
        }
    }
    public class Obra{
        private String titulo;

        public Obra(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    }
    public class Pintura extends Obra{
        enum TipoPintura{

            A("Oleo"), B("Pastel"), C("Acuarela");

            private TipoPintura(String formato){
                this.formato = formato;
            }
            private String formato;
        }


        public Pintura(String titulo) {
            super(titulo);
        }
    }
    public class Escultura extends Obra{
        enum Materiales {
            A("Bronce"), B("Hierro"), C("Marmol");
            private Materiales(String material) {

                this.material =material;
            }
            private String material;
        }
        enum Estilos{
            A("Neoclasico"), B("Grecorromano"), C("Cubista");
            private Estilos(String estilo) {

                this.estilo =estilo;
            }
            private String estilo;
        }

        public Escultura(String titulo) {
            super(titulo);
        }
    }
    public class Sala{
        String nombre;

        public Sala(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
    public class Museo{
        String nombre;
        String direccion;
        String ciudad;
        String pais;

        public Museo(String nombre, String direccion, String ciudad, String pais) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.ciudad = ciudad;
            this.pais = pais;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }
    }
}