package com.lxxxv;

import java.util.Random;
import java.util.function.Consumer;

import com.lxxxv.Policy;

public class CallBackAdd
{
    private Consumer<CallBackAdd> caller;
    public String Data;

    public CallBackAdd(Consumer<CallBackAdd> caller)
    {
        this.caller = caller;
    }

    public void start()
    {
        if(this.caller != null)
        {
            Random rm = new Random();

            for (int loop = 0; loop < Policy.LOOP_COUNT; loop++)
            {
                this.Data = Integer.toString(rm.nextInt()) + "_" + Integer.toString(loop);
                this.caller.accept(CallBackAdd.this);
            }
        }
    }

    public String getData()
    {
        return this.Data;
    }
}
