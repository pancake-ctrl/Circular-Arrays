import java.util.Arrays;

interface iQueuable{

    void queueSize(int a);
    boolean isEmpty();
    void enqeue(String data);
    void deqeue();
    void getQueue();
    void size();

}


public class QUEUE {
    public static void main(String[] args)  {
        

        STACK q = new STACK();


        q.queueSize(5);

        q.enqeue("amy");

        q.enqeue("Kobe");

        q.enqeue("Jordan");


        q.getQueue();

        q.size();

        q.deqeue();

        q.getQueue();

        }
}

class STACK implements iQueuable{

        public static String[] queue;
        static int size;
        static int front;
        static int rear;
        
    
        public void queueSize(int s)
            {
                front = rear = -1;
                size = s;
                queue = new String[size];
                
            } 
    
    
        public boolean isEmpty()
            {
                if (front == -1 && rear == -1){
                    return true;
                }
                else{
                    return false;
                }
            }
    
    
            
         public void enqeue(String data)
            {
                if ((rear + 1) % size == front){
                    return;
                }        
    
                else if (isEmpty() == true){
                    front = 0;
                    rear = 0;
                }
                else {
                    rear = (rear + 1) % size;
                }
                
                queue[rear]= data;
               
                System.out.println("The enqueue is " + queue[rear]);    
         
            }
    
        public void deqeue()
            {
                if (isEmpty() == true){
                    System.out.println("Queue is empty");
                    
                }
                
                else if (front == rear){
                    front = -1;
                    rear = -1;
                }
                else {
                    front = (front + 1) % size;
                }
    
                System.out.println("The item that is removed is " + queue[front-1]);
            }
            
            public void getQueue()
            {
                
                if (front == -1 && rear == -1) {
                    System.out.printf("\nQueue is Empty\n");
                    return;
                }
         
                
                else {
                    System.out.print(Arrays.toString(queue));
    
                }
                return;
            }
            public void size()
            {
                    if (front == -1 && rear == -1){
                        System.out.printf("\nQueue is Empty\n");
                    }
                    else {
                        System.out.printf("\nThere are " + (rear-front+1) + " items in the queue\n");
    
                    }
            }
            
        
}