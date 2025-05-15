public class GenericData<T> {
                 private T data;
                 public GenericData(T data) {
                     this.data = data;
                 }
                 public void argSwap(GenericData<T> other) {
                     T temp = this.data;
                     this.data = other.data;
                     other.data = temp;
                 }

                 public static void main(String[] args) {
                     try {
                         GenericData<String> obj1 = new GenericData<>("Hello");
                         obj1.argSwap(null);


                     } catch (NullPointerException e) {
                         System.out.println( e.getMessage());
                     }
                 }
             }