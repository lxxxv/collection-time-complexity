package com.lxxxv.quick;

import com.lxxxv.Policy;
import com.lxxxv.quick.list.*;
import com.lxxxv.quick.map.*;
import com.lxxxv.quick.queue.*;
import com.lxxxv.quick.set.*;

public class quickMain
{
    public static void main(String args[]) throws Exception
    {
        System.out.println("LOOP COUNT : " + Integer.toString(Policy.LOOP_COUNT));

        new ListAdd().execute();
        new ListDel().execute();
        new ListGet().execute();
        new ListSort().execute();

        new MapAdd().execute();
        new MapDel().execute();
        new MapGet().execute();

        new QueueAdd().execute();
        new QueueGet().execute();
    }
}
