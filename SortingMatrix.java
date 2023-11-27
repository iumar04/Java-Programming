public class SortingMatrix {
    public static void displayMat(int[][] mat){
        for (int[] row:mat){
            for (int elmnt:row){
                System.out.print(elmnt+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] mat={{2,5,3},{6,3,2},{9,7,5}};
        System.out.println("Original Matrix: ");
        displayMat(mat);
        int[] smat=new int[9];
        int c=0;
        for (int i=0;i< mat.length;i++) {
            for (int j = 0; j < mat.length; j++) {
                smat[c++] = mat[i][j];
            }
        }
        int temp=0;
        for(int i=0;i<smat.length;i++)
        {
            for(int j=i+1;j<smat.length;j++)
            {
                if(smat[i]>smat[j])
                {
                    temp=smat[i];
                    smat[i]=smat[j];
                    smat[j]=temp;
                }
            }
        }
        c=0;
        for (int i=0;i< mat.length;i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j]=smat[c++];
            }
        }
        System.out.println("Rearranged Matrix: ");
        displayMat(mat);
    }
}
