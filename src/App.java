public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello mundo!");

        int [] vector = {0,1,2,3,4,5,6,7,8,9};
        imprimirVector(vector);
        System.out.println("\n Fin del progrema");
    }

    public static void imprimirVector (int [] v){
        imprimir(v, 0);
    }
    private static void imprimir(int[] v,int i){
        if(i == v.length)return;
        System.out.print(v[i]+", ");
        imprimir(v, i+1);
    }
}
