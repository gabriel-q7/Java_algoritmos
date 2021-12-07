public class selectionSort {

    public static void main(String[] args) {

        int[] arrayNumeros = {22,32,1,25,2,3,5};

        for(int i = 0; i < arrayNumeros.length; i++){
            int minIndex = i;

            for(int j = i + 1; j < arrayNumeros.length; j++){
                if(arrayNumeros[j] < arrayNumeros[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arrayNumeros[minIndex];
            arrayNumeros[minIndex] = arrayNumeros[i];
            arrayNumeros[i] = temp;
        }

        for(int numero: arrayNumeros){
            System.out.println(numero);
        }

    }
}
