public class Main {

    public static void main(String[] args) {

        String[][] a = new String[5][4];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(i == 0 || i == 2 ){
                    a[i][j] = "*";
                }else if(j == 0 || j == 3){
                    a[i][j] = "*";
                }else{
                    a[i][j] = " ";
                }
            }
        }
        String[][] b = new String[7][4];
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                if(i == 0 || i == 3 || i == 6){
                    b[i][j] = "*";
                }else if(j == 0 || j == 3){
                    b[i][j] = "*";
                }else{
                    b[i][j] = " ";
                }
            }
        }

        for(String[] row : a){
            for(String col : row){
                System.out.print(" " + col + " ");
            }
            System.out.println();
        }
        System.out.println("\n----------------------\n");
        for(String[] row : b){
            for(String col : row){
                System.out.print(" " + col + " ");
            }
            System.out.println();
        }
    }
}
