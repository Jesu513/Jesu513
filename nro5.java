    private static int aSaber(int v[], int n)
    {
        int result=0;
        int i= n-1;
        while (i>=0)
        {
            result =result+v[i];
            i= i-1;
        }
        return result;
    }
