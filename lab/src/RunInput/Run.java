package RunInput;

import Task.Tasks;

public class Run {

    public void RunTask(){
        Input input = new Input();
        Tasks tasks = new Tasks();
        System.out.println("Laboratorium 1\n");
        System.out.println("Zadanie 1");
        System.out.println("Zadanie 2");
        System.out.println("Zadanie 3");
        System.out.println("Zadanie 4");
        System.out.println("Zadanie 5");
        System.out.println("Wybierz zadananie:");

        int wybor = input.InputInt();
        switch (wybor) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Nie ma takiego zadania");
        }
    }
}
