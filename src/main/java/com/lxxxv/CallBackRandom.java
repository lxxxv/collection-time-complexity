package com.lxxxv;

import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;

import com.lxxxv.Policy;

public class CallBackRandom
{
    public void getString(Consumer<String> _caller)
    {
        this.getString(Policy.LOOP_COUNT, _caller);
    }

    public void getString(int _maxLoop, Consumer<String> _caller)
    {
        try
        {
            Optional<Consumer> caller = Optional.of(_caller);

            Random rm = new Random();
            int idx = 0;
            while (idx < _maxLoop)
            {
                String data = Integer.toString(rm.nextInt()) + "_" + Integer.toString(idx);
                caller.orElse(_caller).accept(data);
                idx++;
            }
        }
        catch(Exception e)
        {

        }
    }
}
