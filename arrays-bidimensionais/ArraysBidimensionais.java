public class ArraysBidimensionais {

    public static void main(String[] args) {

        int[][] adicionandoNumeros = { { 3, 5, 7, 9 }, { 13, 15, 18, 19 }, { 21, 25, 30, 33 }, { 45, 55, 62, 70 },
                { 100, 115, 132, 135 }, { 200, 220, 233, 250 }, { 300, 333, 400, 450 }, { 515, 522, 540, 590 },
                { 615, 620, 640, 700 }, { 800, 815, 890, 900 }, { 1100, 1200, 1455, 1500 } };

                //percorrer todos os itens em uma matriz bidimensional usando um loop aninhado.
                for(int i = 0; i < adicionandoNumeros.length; i++){
                    for(int j = 0; j < adicionandoNumeros[i].length; j++){
                        System.out.println(adicionandoNumeros[i][j]);
                    }   
                }
    }
}
