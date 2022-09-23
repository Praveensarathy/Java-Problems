
class Solution{
    static int isSuperSimilar(int n, int m, int org[][], int x)
    {
        int mat[][] = org.clone();
        int i,j,temp;
        while(x!=0){
        for(i=0;i<n;i++){
            for(j=i;j<m;j++){
                if(i!=j){
                    temp = mat[i][j];
                    mat[i][j] = mat[j][i]  ;
                    mat[j][i] = temp;
                }
            }
        }
        x--;
    }
    if(org.equals(mat))
        return 1;
    else
        return 0;
    
    }
}
