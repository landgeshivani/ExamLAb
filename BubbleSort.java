class BubbleSort {
   

    static void bubblesort(int a1[]) {
        int n = a1.length;
        for (int i = 0; i < n - 1; i++)//pass
        {
            for (int j = 0; j < n - i - 1; j++)//internal iterations
            {
                if (a1[j] > a1[j + 1]) {
                    //exchange
                    int temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;

                }

                display(a1);
                System.out.println();

            }
            
        }
    }


    static void InsertionSort(int a1[])
    {
        int n = a1.length;
        for (int i = 1; i < n; ++i) {
            int key = a1[i];
            int j = i - 1;

            while (j >= 0 && a1[j] > key) {
                a1[j + 1] = a1[j];
                j = j - 1;
            }
            a1[j + 1] = key;
            display(a1);
            System.out.println();
        }
    }

    static void Selectionsort(int a1[])
{
	int n=a1.length;
	for(int i=0;i<n-1;i++)
	{
		int min = i;
		for(int j=i+1;j<n;j++)
		{
			if(a1[j] < a1[min])
				min =j;
		}
		//swapping 
		int temp = a1[min];
		a1[min]=a1[i];
		a1[i]=temp;
	}
}
    static void display(int a1[])
	{
		int n =a1.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}

    public static void main(String args[]){
		//int a1[] = new int[10];
		int a1[]={2,13,24,45,9,30};
		int n =a1.length;
		
		System.out.println();
        bubblesort(a1);
        InsertionSort(a1);
        Selectionsort(a1);

	}
}
