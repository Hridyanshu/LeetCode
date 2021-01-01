class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        //temp stores length of current piece
        //temp2 validates whether current piece matches any integer in arr or not
        int temp,temp2=0; //temp2=0 means no match
        int i,j;
        outer: for(i=0;i<pieces.length;i++) {
            temp2=0;
            temp = pieces[i].length;
            for(j=0;j<arr.length;j++) {
                if(pieces[i][0] == arr[j]) {
                    temp2=1; //indicates match
                    //checking whether the piece is present in arr or not
                    //subsequent integers of the piece are matched with integers of arr
                    for(int k=1;k<temp;k++) {
                        if(k+j>=arr.length)
                            break outer;
                        else {
                            if(arr[k+j] == pieces[i][k])
                                continue;
                            else
                                break outer;
                        }
                    }
                }
            }
            if(temp2==0)
                break outer;
        }
        if(i<pieces.length)
            return false;
        else 
            return true;
    }
}
