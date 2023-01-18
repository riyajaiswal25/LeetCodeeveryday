class DiningPhilosophers {

    public AtomicBoolean[] forks = new AtomicBoolean[5];
    public AtomicInteger taken = new AtomicInteger(0);      // Avoid Deadlock
    public DiningPhilosophers() {
        forks[0] = new AtomicBoolean(true);
        forks[1] = new AtomicBoolean(true);
        forks[2] = new AtomicBoolean(true);
        forks[3] = new AtomicBoolean(true);
        forks[4] = new AtomicBoolean(true);
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        int left = philosopher;
        int right = (philosopher+4)%5;
        synchronized(forks[left]){
            while (!forks[left].get() || taken.get()==4){
                forks[left].wait();
            }
            forks[left].compareAndSet(true, false);
            taken.getAndIncrement();
            pickLeftFork.run();
        }
        synchronized(forks[right]){
            while (!forks[right].get()){
                forks[right].wait();
            }
            forks[right].compareAndSet(true, false);
            pickRightFork.run();  
        }
        eat.run();
        synchronized(forks[left]){
            forks[left].compareAndSet(false, true);
            putLeftFork.run();
            forks[left].notifyAll();
        }
        synchronized(forks[right]){
            forks[right].compareAndSet(false, true);
            putRightFork.run();
            taken.getAndDecrement();
            forks[right].notifyAll();
        }
    }
}