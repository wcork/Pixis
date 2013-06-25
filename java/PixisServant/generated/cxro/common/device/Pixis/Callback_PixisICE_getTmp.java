// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.4.2
//
// <auto-generated>
//
// Generated from file `Callback_PixisICE_getTmp.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package cxro.common.device.Pixis;

public abstract class Callback_PixisICE_getTmp extends Ice.TwowayCallback
{
    public abstract void response(boolean __ret, float curTmp);

    public final void __completed(Ice.AsyncResult __result)
    {
        PixisICEPrx __proxy = (PixisICEPrx)__result.getProxy();
        boolean __ret = false;
        Ice.FloatHolder curTmp = new Ice.FloatHolder();
        try
        {
            __ret = __proxy.end_getTmp(curTmp, __result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret, curTmp.value);
    }
}
