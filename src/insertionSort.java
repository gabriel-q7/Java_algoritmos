//
public class insertionSort {
    public static void main(String[] args) {
        int[] arrayNumeros = {2,23,41,66,1,3};

        for(int i = 0; i < arrayNumeros.length; i++){
            int atual = arrayNumeros[i];
            int j = i - 1;

            while(j >= 0 && arrayNumeros[j] >= atual){
                arrayNumeros[j+1] = arrayNumeros[j];
                j--;
            }
            arrayNumeros[j+1] = atual;
        }

        for(int numero: arrayNumeros){
            System.out.println(numero);
        }
    }
}
