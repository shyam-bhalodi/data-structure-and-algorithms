package hashing;

public class linearProbing {
    public static void main(String[] args) {
        Math.pow(1,2);
    }

    int[] linearProbing(int hash_size, int arr[], int sizeOfArray) {
        int[] hashArray = new int[hash_size];
        int size = 0;
        for (int i = 0; i < hash_size; ++i)
            hashArray[i] = -1;
        for (int i = 0; i < arr.length; ++i) {
            int h = arr[i] % hash_size;
            if (size == hash_size)
                break;
            while (hashArray[h] != -1 && hashArray[h] != arr[i]) {
                h = (h + 1) % hash_size;
            }
            hashArray[h] = arr[i];
            size++;
        }
        return hashArray;
    }
}
