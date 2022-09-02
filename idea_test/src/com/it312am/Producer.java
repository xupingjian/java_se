package com.it312am;

import java.util.List;

class Producer1 implements Runnable{
    private Box b;
    public Producer1(List b) {
        this.b = (Box) b;
    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            b.put(i);
        }

    }
}
