class Print2D{
    public static void main(String[] args){
        int[][] a = { 
            {01, 02, 03, 04},
            {11, 12, 13, 14},
            {21, 22, 23, 24},
        };

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}