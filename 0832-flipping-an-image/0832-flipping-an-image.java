class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int l = image.length;
        for(int []arr : image)
        {
            for(int i = 0; i < l/2; i++)
            {
                int temp = arr[i];
                arr[i] = arr[l-1-i];
                arr[l-1-i] = temp;
            }

            for(int i = 0; i < l; i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();

            for(int i = 0; i < l; i++)
            {
                if(arr[i] == 1)
                {
                    arr[i] = 0;
                }
                else if(arr[i] == 0)
                {
                    arr[i] = 1;
                }
            }
        }
        return image;
    }
}