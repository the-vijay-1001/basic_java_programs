class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        for(int i = 0; i < arr.length; i++){
            if(i < (arr.length / 2)){
                int temp = arr[i];
                arr[i] = arr[(arr.length-1) - i];
                arr[(arr.length-1) - i] = temp;
            }
        }
        for(int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}
