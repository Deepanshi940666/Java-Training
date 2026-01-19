#include <iostream>
using namespace std;

int main()
{
        int array[5] = {0, 2, 1, 0, 1};
        int a[5];
        int i = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (i = 0; i < 5; i++)
        {
                if (array[i] == 0)
                {
                        count1++;
                }
                else if (array[i] == 1)
                {
                        // a[i]=1;
                        count2++;
                }
                else if (array[i] == 2)
                {
                        // a[i]=2;
                        count3++;
                }
        }
        for (int j = 0; j < count1; j++)
        {
                array[j] = 0;
                i++;
        }
        for (int k = count1; k < count2; k++)
        {
                array[k] = 1;
                i++;
        }
        for (int l = count2; l < count3; l++)
        {
                array[l] = 2;
                i++;
        }

        cout << array[i] << endl;
}
