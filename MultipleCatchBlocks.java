public class MultipleCatchBlocks {

    public static void retrivevalue(int[] arr , int index){
        System.out.println("Value at Index " + index + " :- " + arr[index]);
    }
    public static void main(String[] args) {
        
        try {
            retrivevalue(null, 0);        // null exception 
            retrivevalue(new int[]{1,2,3,4}, 3);  //get the value directly
            retrivevalue(new int[]{1,2,3}, 4);      //give the arrayout of bound exception
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
    }   
}
