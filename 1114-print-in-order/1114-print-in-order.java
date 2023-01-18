class Foo {
    private final Object lock;
    private volatile int turn;

    public Foo() {
        lock=new Object();
        turn=1;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        synchronized(lock)
        {
            while(turn!=1)
            {
                lock.notifyAll();
                lock.wait();
            }
        
        printFirst.run();
        turn = 2;
        lock.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        synchronized(lock)
        {
            while(turn!=2)
            {
                lock.notifyAll();
                lock.wait();
            }
        
        printSecond.run();
        turn=3;
        lock.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        synchronized(lock)
        {
            while(turn!=3)
            {
                lock.notifyAll();
                lock.wait();
            }
        
        printThird.run();
        turn=1;
        }
    }
}