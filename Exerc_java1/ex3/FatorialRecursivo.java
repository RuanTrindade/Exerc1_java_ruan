package ex3;

public class FatorialRecursivo {

    public static int calcular(int n){
        if(n == 0){
            return 1;
        }else {
            return n * calcular(n - 1);
        }
    }
}
