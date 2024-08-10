void shell_sort(int A[],int n] {
    gap = n / 2;
    do
    {
        do
        {
            swapped = 0;
            for (i = 0; i < n - gap; i++)
                if (A[I] > A[i + gap])
                {
                    swap();
                    swapped = 1;
                }
        } while (swapped == 1);
    } while ((gap = gap / 2) >= 1); }