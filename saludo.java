import java.util.Scanner;
public class saludo extends Operacion_basicas{
    Scanner teclado =new Scanner(System.in);
    public saludo(int numero1,int numero2,int resultado){
        //ya esta inicializado
        super(numero1, numero2, resultado);
        System.out.println("hola bienbenido a mi calculadora.");
    };
    public void mostrar_datos(){
        System.out.println("resultado: "+GetSuma());
        System.out.println("resultado: "+GetResta());
        System.out.println("resultado: "+Getmultipricacion());
        System.out.println("resultado: "+Getdivision());
        System.out.println("resultado: "+factorial_fibo(0));
    };
}