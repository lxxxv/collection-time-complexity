package com.lxxxv;

import java.util.Optional;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.lxxxv.Policy;

public class CallBackRandom
{
    private final int MAX_LOOP = 1000;

    private void buildString(int _maxLoop, Consumer<String> _caller)
    {
        try
        {
            Consumer<String> caller = Optional.of(_caller).orElseThrow(NullPointerException::new);

            Random rm = new Random();
            int idx = 0;
            while (idx < _maxLoop)
            {
                caller.accept(Integer.toString(rm.nextInt()) + "_" + Integer.toString(idx));
                idx++;
            }
        }
        catch(Exception e)
        {

        }
    }

    public void getString(Consumer<String> _caller)
    {
        this.getString(MAX_LOOP, _caller);
    }

    public void getString(int _maxLoop, Consumer<String> _caller)
    {
        try
        {
            Consumer<String> caller = Optional.of(_caller).orElseThrow(NullPointerException::new);

            this.buildString
            (
                _maxLoop, (Sender)->
                {
                    caller.accept(Sender);
                }
            );
        }
        catch(Exception e)
        {

        }
    }
}
