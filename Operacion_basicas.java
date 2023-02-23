import java.util.Scanner;
public class Operacion_basicas {
    private int numero1,numero2,resultado;
    Scanner teclado = new Scanner(System.in);
    public Operacion_basicas(int numero1,int numero2,int resultado){
        //para inicializar
        this.numero1=numero1;
        this.numero2=numero2;
        this.resultado=resultado;
    };
    public int GetSuma(){
        System.out.println(" operaciones basicas: ");
        System.out.println("inserte el primer numero");
        numero1= teclado.nextInt();
        System.out.println("inserte el segundo numero");
        numero2= teclado.nextInt();
        resultado=numero1+numero2;
        System.out.println("la suma es: "+resultado);
        System.out.println("    ");
        return resultado;
    };
    public int GetResta(){
        System.out.println(" operaciones basicas: ");
        System.out.println("inserte el primer numero");
        numero1= teclado.nextInt();
        System.out.println("inserte el segundo numero");
        numero2= teclado.nextInt();
        resultado=numero1-numero2;
        System.out.println("la resta es: "+resultado);
        System.out.println("    ");
        return resultado;
    }
    public int Getmultipricacion(){
        System.out.println(" operaciones basicas: ");
        System.out.println("inserte el primer numero");
        numero1= teclado.nextInt();
        System.out.println("inserte el segundo numero");
        numero2= teclado.nextInt();
        resultado=numero1*numero2;
        System.out.println("la multipricacion es: "+resultado);
        System.out.println("    ");
        return resultado;
    }
    public int Getdivision(){
        System.out.println(" operaciones basicas: ");
        System.out.println("inserte el primer numero");
        numero1= teclado.nextInt();
        System.out.println("inserte el segundo numero");
        numero2= teclado.nextInt();
        resultado=numero1/numero2;
        System.out.println("la vision es: "+resultado);
        System.out.println("    ");
        return resultado;
    }
    public int factorial_fibo(int numero1){
        System.out.println(" operaciones factorial: ");
        System.out.println("inserte numero de mayor a menor asta 0");
        numero1= teclado.nextInt();
        if (numero1==0){
            System.out.println(" factorial: "+numero1);
            return 1;
        }else{
            return numero1 * factorial_fibo(numero1-1);
        }
    }
}