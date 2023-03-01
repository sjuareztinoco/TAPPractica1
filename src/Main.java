import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static Scanner dato = new Scanner(System.in);
    public static Scanner datoString =new Scanner(System.in);
    public static ArrayList<Especialidad> especialidades = new ArrayList<Especialidad>();

    public static ArrayList<Materia> materias = new ArrayList<Materia>();
    public static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public static void main(String[] args) {
        int opc;
        do{
            opc=menu();
            switch(opc){
                case 1:
                    altaEspecialidad();
                    break;
                case 2:
                    altaAlumno();
                    break;
                case 3:
                    //altaCatedratico();
                    break;
                case 4:
                    altaMateria();
                    break;
                case 5:
                    //altaGrupo();
                    break;
                case 6:
                    listarBD();
                    break;
                case 7:
                    System.out.println("bye!");
                    break;
                default:
                    System.out.println("... opcion no valida!");
                    break;
            }
        }while(opc!=7);

    }

    public static int menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Alta Especialidad");
        System.out.println("2. Alta Alumno");
        System.out.println("3. Alta Catedratico");
        System.out.println("4. Alta Materia");
        System.out.println("5. Alta Grupo");
        System.out.println("6. Lista BD");
        System.out.println("7. Salir");
        System.out.println("Deme opción");
        return dato.nextInt();
    }

    public static void altaEspecialidad(){
        int id;
        String nombre;
        System.out.println("id:");
        id=dato.nextInt();
        System.out.println("Nombre:");
        nombre=datoString.nextLine();
        especialidades.add(new Especialidad(id,nombre));
    }
    public static void altaAlumno(){
        int numControl;
        String nombre;
        Especialidad especialidad;
        int idEspecialidad;
        System.out.println("numControl");
        numControl = dato.nextInt();
        System.out.println("Nombre");
        nombre = datoString.nextLine();
        System.out.println("id especialidad");
        idEspecialidad = dato.nextInt();
        especialidades.get(idEspecialidad);
    }

    public static void altaMateria(){
        int id;
        String nombre;
        System.out.println("id:");
        id=dato.nextInt();
        System.out.println("Nombre:");
        nombre=datoString.nextLine();
        materias.add(new Materia(id,nombre));
    }

    public static void listarBD(){
        for(int i=0; i<especialidades.size(); i++){
            System.out.println(especialidades.get(i).toString());
        }


        for(int i=0; i<materias.size(); i++){
            System.out.println(materias.get(i).toString());
        }


        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i).toString());
        }

    }
}