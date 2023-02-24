import java.util.Scanner;
public class Main {

    public static Scanner dato = new Scanner(System.in);
    public static void main(String[] args) {
        int opc;
        do{
            opc=menu();
            switch(opc){
                case 1:
                    //altaEspecialidad();
                    break;
                case 2:
                    //altaAlumno();
                    break;
                case 3:
                    //altaCatedratico();
                    break;
                case 4:
                    //altaMateria();
                    break;
                case 5:
                    //altaGrupo();
                    break;
                case 6:
                    System.out.println("bye!");
                    break;
                default:
                    System.out.println("... opcion no valida!");
                    break;
            }
        }while(opc!=6);

    }

    public static int menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Alta Especialidad");
        System.out.println("2. Alta Alumno");
        System.out.println("3. Alta Catedratico");
        System.out.println("4. Alta Materia");
        System.out.println("5. Alta Grupo");
        System.out.println("6. Salir");
        System.out.println("Deme opción");
        return dato.nextInt();
    }
}