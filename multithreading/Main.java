public class Main {
    public static void main(String args[])
    {
       final ProducerConsumer producerConsumer=new ProducerConsumer();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run()
            {            try {
                producerConsumer.producer();
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            }
        });

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run()
            {            try {
                producerConsumer.consumer();
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            }
        }
        );

        thread.start();
        
        thread1.start();

     

    }
}
