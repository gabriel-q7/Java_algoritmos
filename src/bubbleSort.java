
public class bubbleSort {
    public static void main(String[] args) {

        int[] vetor = {2,23,54,1,71,2,59};

        for(int i=0; i< vetor.length - 2; i++){
            for(int j=0; j < vetor.length - 2 - i; j++){
                if(vetor[j] > vetor[j+1]){
                    int temp;
                    temp = vetor[j+1];
                    vetor[j+1] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        for(int numero: vetor){
            System.out.println(numero);
        }
    }
}
