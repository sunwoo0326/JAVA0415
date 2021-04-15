public int[] divisible(int[] array, int divisor) {

    int resultArraySize=0;

    for(int i = 0; i < array.length; i++) {
        if(array[i] % divisor == 0)
            resultArraySize++;
    }

    int[] ret = new int[resultArraySize];
    int index = 0; 
    for(int i = 0; i < array.length; i++) {
        if(array[i] % divisor == 0)  
            ret[index++] = array[i];
    }
    return ret;
}