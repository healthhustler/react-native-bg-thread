
class BgThread extends Thread implements Runnable{
    Callback callback;
    public BgThread(Callback cb){
            this.callback = cb;
    }
    @Override
    public void run() {

        this.callback.invoke();
    }
}
