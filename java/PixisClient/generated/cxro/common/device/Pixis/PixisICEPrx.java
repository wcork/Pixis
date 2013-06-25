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
// Generated from file `PixisICEPrx.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package cxro.common.device.Pixis;

public interface PixisICEPrx extends Ice.ObjectPrx
{
    public boolean initCamera(int index)
        throws CamException;

    public boolean initCamera(int index, java.util.Map<String, String> __ctx)
        throws CamException;

    public Ice.AsyncResult begin_initCamera(int index);

    public Ice.AsyncResult begin_initCamera(int index, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_initCamera(int index, Ice.Callback __cb);

    public Ice.AsyncResult begin_initCamera(int index, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_initCamera(int index, Callback_PixisICE_initCamera __cb);

    public Ice.AsyncResult begin_initCamera(int index, java.util.Map<String, String> __ctx, Callback_PixisICE_initCamera __cb);

    public boolean end_initCamera(Ice.AsyncResult __result)
        throws CamException;

    public boolean uninitCamera();

    public boolean uninitCamera(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_uninitCamera();

    public Ice.AsyncResult begin_uninitCamera(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_uninitCamera(Ice.Callback __cb);

    public Ice.AsyncResult begin_uninitCamera(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_uninitCamera(Callback_PixisICE_uninitCamera __cb);

    public Ice.AsyncResult begin_uninitCamera(java.util.Map<String, String> __ctx, Callback_PixisICE_uninitCamera __cb);

    public boolean end_uninitCamera(Ice.AsyncResult __result);

    public boolean getSensorSize(Ice.ShortHolder xSize, Ice.ShortHolder ySize);

    public boolean getSensorSize(Ice.ShortHolder xSize, Ice.ShortHolder ySize, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getSensorSize();

    public Ice.AsyncResult begin_getSensorSize(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getSensorSize(Ice.Callback __cb);

    public Ice.AsyncResult begin_getSensorSize(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getSensorSize(Callback_PixisICE_getSensorSize __cb);

    public Ice.AsyncResult begin_getSensorSize(java.util.Map<String, String> __ctx, Callback_PixisICE_getSensorSize __cb);

    public boolean end_getSensorSize(Ice.ShortHolder xSize, Ice.ShortHolder ySize, Ice.AsyncResult __result);

    public boolean expSetup(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin);

    public boolean expSetup(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_expSetup(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin);

    public Ice.AsyncResult begin_expSetup(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_expSetup(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin, Ice.Callback __cb);

    public Ice.AsyncResult begin_expSetup(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_expSetup(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin, Callback_PixisICE_expSetup __cb);

    public Ice.AsyncResult begin_expSetup(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin, java.util.Map<String, String> __ctx, Callback_PixisICE_expSetup __cb);

    public boolean end_expSetup(Ice.AsyncResult __result);

    public boolean expStart();

    public boolean expStart(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_expStart();

    public Ice.AsyncResult begin_expStart(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_expStart(Ice.Callback __cb);

    public Ice.AsyncResult begin_expStart(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_expStart(Callback_PixisICE_expStart __cb);

    public Ice.AsyncResult begin_expStart(java.util.Map<String, String> __ctx, Callback_PixisICE_expStart __cb);

    public boolean end_expStart(Ice.AsyncResult __result);

    public boolean expCheckStatus();

    public boolean expCheckStatus(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_expCheckStatus();

    public Ice.AsyncResult begin_expCheckStatus(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_expCheckStatus(Ice.Callback __cb);

    public Ice.AsyncResult begin_expCheckStatus(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_expCheckStatus(Callback_PixisICE_expCheckStatus __cb);

    public Ice.AsyncResult begin_expCheckStatus(java.util.Map<String, String> __ctx, Callback_PixisICE_expCheckStatus __cb);

    public boolean end_expCheckStatus(Ice.AsyncResult __result);

    public boolean expGetFrame(ImageContainerHolder image);

    public boolean expGetFrame(ImageContainerHolder image, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_expGetFrame();

    public Ice.AsyncResult begin_expGetFrame(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_expGetFrame(Ice.Callback __cb);

    public Ice.AsyncResult begin_expGetFrame(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_expGetFrame(Callback_PixisICE_expGetFrame __cb);

    public Ice.AsyncResult begin_expGetFrame(java.util.Map<String, String> __ctx, Callback_PixisICE_expGetFrame __cb);

    public boolean end_expGetFrame(ImageContainerHolder image, Ice.AsyncResult __result);

    public boolean expHalt(short camState);

    public boolean expHalt(short camState, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_expHalt(short camState);

    public Ice.AsyncResult begin_expHalt(short camState, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_expHalt(short camState, Ice.Callback __cb);

    public Ice.AsyncResult begin_expHalt(short camState, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_expHalt(short camState, Callback_PixisICE_expHalt __cb);

    public Ice.AsyncResult begin_expHalt(short camState, java.util.Map<String, String> __ctx, Callback_PixisICE_expHalt __cb);

    public boolean end_expHalt(Ice.AsyncResult __result);

    public boolean contStart(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin);

    public boolean contStart(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_contStart(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin);

    public Ice.AsyncResult begin_contStart(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_contStart(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin, Ice.Callback __cb);

    public Ice.AsyncResult begin_contStart(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_contStart(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin, Callback_PixisICE_contStart __cb);

    public Ice.AsyncResult begin_contStart(long exposureTime, short x0, short x1, short y0, short y1, short xbin, short ybin, java.util.Map<String, String> __ctx, Callback_PixisICE_contStart __cb);

    public boolean end_contStart(Ice.AsyncResult __result);

    public boolean contCheckStatus()
        throws CamException;

    public boolean contCheckStatus(java.util.Map<String, String> __ctx)
        throws CamException;

    public Ice.AsyncResult begin_contCheckStatus();

    public Ice.AsyncResult begin_contCheckStatus(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_contCheckStatus(Ice.Callback __cb);

    public Ice.AsyncResult begin_contCheckStatus(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_contCheckStatus(Callback_PixisICE_contCheckStatus __cb);

    public Ice.AsyncResult begin_contCheckStatus(java.util.Map<String, String> __ctx, Callback_PixisICE_contCheckStatus __cb);

    public boolean end_contCheckStatus(Ice.AsyncResult __result)
        throws CamException;

    public boolean contHalt(short camState);

    public boolean contHalt(short camState, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_contHalt(short camState);

    public Ice.AsyncResult begin_contHalt(short camState, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_contHalt(short camState, Ice.Callback __cb);

    public Ice.AsyncResult begin_contHalt(short camState, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_contHalt(short camState, Callback_PixisICE_contHalt __cb);

    public Ice.AsyncResult begin_contHalt(short camState, java.util.Map<String, String> __ctx, Callback_PixisICE_contHalt __cb);

    public boolean end_contHalt(Ice.AsyncResult __result);

    public boolean contGetFrame(ImageContainerHolder image);

    public boolean contGetFrame(ImageContainerHolder image, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_contGetFrame();

    public Ice.AsyncResult begin_contGetFrame(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_contGetFrame(Ice.Callback __cb);

    public Ice.AsyncResult begin_contGetFrame(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_contGetFrame(Callback_PixisICE_contGetFrame __cb);

    public Ice.AsyncResult begin_contGetFrame(java.util.Map<String, String> __ctx, Callback_PixisICE_contGetFrame __cb);

    public boolean end_contGetFrame(ImageContainerHolder image, Ice.AsyncResult __result);

    public boolean getError(Ice.StringHolder error);

    public boolean getError(Ice.StringHolder error, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getError();

    public Ice.AsyncResult begin_getError(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getError(Ice.Callback __cb);

    public Ice.AsyncResult begin_getError(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getError(Callback_PixisICE_getError __cb);

    public Ice.AsyncResult begin_getError(java.util.Map<String, String> __ctx, Callback_PixisICE_getError __cb);

    public boolean end_getError(Ice.StringHolder error, Ice.AsyncResult __result);

    public boolean getParamList(ParamContainerHolder params);

    public boolean getParamList(ParamContainerHolder params, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getParamList();

    public Ice.AsyncResult begin_getParamList(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getParamList(Ice.Callback __cb);

    public Ice.AsyncResult begin_getParamList(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getParamList(Callback_PixisICE_getParamList __cb);

    public Ice.AsyncResult begin_getParamList(java.util.Map<String, String> __ctx, Callback_PixisICE_getParamList __cb);

    public boolean end_getParamList(ParamContainerHolder params, Ice.AsyncResult __result);

    public boolean getCcsStatus(Ice.IntHolder ccsStatus);

    public boolean getCcsStatus(Ice.IntHolder ccsStatus, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getCcsStatus();

    public Ice.AsyncResult begin_getCcsStatus(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getCcsStatus(Ice.Callback __cb);

    public Ice.AsyncResult begin_getCcsStatus(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getCcsStatus(Callback_PixisICE_getCcsStatus __cb);

    public Ice.AsyncResult begin_getCcsStatus(java.util.Map<String, String> __ctx, Callback_PixisICE_getCcsStatus __cb);

    public boolean end_getCcsStatus(Ice.IntHolder ccsStatus, Ice.AsyncResult __result);

    public boolean getShtrStatus(Ice.ShortHolder shtrStatus);

    public boolean getShtrStatus(Ice.ShortHolder shtrStatus, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getShtrStatus();

    public Ice.AsyncResult begin_getShtrStatus(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getShtrStatus(Ice.Callback __cb);

    public Ice.AsyncResult begin_getShtrStatus(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getShtrStatus(Callback_PixisICE_getShtrStatus __cb);

    public Ice.AsyncResult begin_getShtrStatus(java.util.Map<String, String> __ctx, Callback_PixisICE_getShtrStatus __cb);

    public boolean end_getShtrStatus(Ice.ShortHolder shtrStatus, Ice.AsyncResult __result);

    public boolean shtrOpenNever();

    public boolean shtrOpenNever(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_shtrOpenNever();

    public Ice.AsyncResult begin_shtrOpenNever(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_shtrOpenNever(Ice.Callback __cb);

    public Ice.AsyncResult begin_shtrOpenNever(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_shtrOpenNever(Callback_PixisICE_shtrOpenNever __cb);

    public Ice.AsyncResult begin_shtrOpenNever(java.util.Map<String, String> __ctx, Callback_PixisICE_shtrOpenNever __cb);

    public boolean end_shtrOpenNever(Ice.AsyncResult __result);

    public boolean shtrOpenNormal();

    public boolean shtrOpenNormal(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_shtrOpenNormal();

    public Ice.AsyncResult begin_shtrOpenNormal(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_shtrOpenNormal(Ice.Callback __cb);

    public Ice.AsyncResult begin_shtrOpenNormal(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_shtrOpenNormal(Callback_PixisICE_shtrOpenNormal __cb);

    public Ice.AsyncResult begin_shtrOpenNormal(java.util.Map<String, String> __ctx, Callback_PixisICE_shtrOpenNormal __cb);

    public boolean end_shtrOpenNormal(Ice.AsyncResult __result);

    public boolean getShtrOpenDly(Ice.IntHolder shtrOpenDly);

    public boolean getShtrOpenDly(Ice.IntHolder shtrOpenDly, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getShtrOpenDly();

    public Ice.AsyncResult begin_getShtrOpenDly(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getShtrOpenDly(Ice.Callback __cb);

    public Ice.AsyncResult begin_getShtrOpenDly(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getShtrOpenDly(Callback_PixisICE_getShtrOpenDly __cb);

    public Ice.AsyncResult begin_getShtrOpenDly(java.util.Map<String, String> __ctx, Callback_PixisICE_getShtrOpenDly __cb);

    public boolean end_getShtrOpenDly(Ice.IntHolder shtrOpenDly, Ice.AsyncResult __result);

    public boolean setShtrOpenDly(int shtrOpenDly);

    public boolean setShtrOpenDly(int shtrOpenDly, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setShtrOpenDly(int shtrOpenDly);

    public Ice.AsyncResult begin_setShtrOpenDly(int shtrOpenDly, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setShtrOpenDly(int shtrOpenDly, Ice.Callback __cb);

    public Ice.AsyncResult begin_setShtrOpenDly(int shtrOpenDly, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setShtrOpenDly(int shtrOpenDly, Callback_PixisICE_setShtrOpenDly __cb);

    public Ice.AsyncResult begin_setShtrOpenDly(int shtrOpenDly, java.util.Map<String, String> __ctx, Callback_PixisICE_setShtrOpenDly __cb);

    public boolean end_setShtrOpenDly(Ice.AsyncResult __result);

    public boolean getShtrCloseDly(Ice.IntHolder shtrCloseDly);

    public boolean getShtrCloseDly(Ice.IntHolder shtrCloseDly, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getShtrCloseDly();

    public Ice.AsyncResult begin_getShtrCloseDly(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getShtrCloseDly(Ice.Callback __cb);

    public Ice.AsyncResult begin_getShtrCloseDly(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getShtrCloseDly(Callback_PixisICE_getShtrCloseDly __cb);

    public Ice.AsyncResult begin_getShtrCloseDly(java.util.Map<String, String> __ctx, Callback_PixisICE_getShtrCloseDly __cb);

    public boolean end_getShtrCloseDly(Ice.IntHolder shtrCloseDly, Ice.AsyncResult __result);

    public boolean setShtrCloseDly(int shtrCloseDly);

    public boolean setShtrCloseDly(int shtrCloseDly, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setShtrCloseDly(int shtrCloseDly);

    public Ice.AsyncResult begin_setShtrCloseDly(int shtrCloseDly, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setShtrCloseDly(int shtrCloseDly, Ice.Callback __cb);

    public Ice.AsyncResult begin_setShtrCloseDly(int shtrCloseDly, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setShtrCloseDly(int shtrCloseDly, Callback_PixisICE_setShtrCloseDly __cb);

    public Ice.AsyncResult begin_setShtrCloseDly(int shtrCloseDly, java.util.Map<String, String> __ctx, Callback_PixisICE_setShtrCloseDly __cb);

    public boolean end_setShtrCloseDly(Ice.AsyncResult __result);

    public boolean getClearCycles(Ice.IntHolder cycles);

    public boolean getClearCycles(Ice.IntHolder cycles, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getClearCycles();

    public Ice.AsyncResult begin_getClearCycles(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getClearCycles(Ice.Callback __cb);

    public Ice.AsyncResult begin_getClearCycles(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getClearCycles(Callback_PixisICE_getClearCycles __cb);

    public Ice.AsyncResult begin_getClearCycles(java.util.Map<String, String> __ctx, Callback_PixisICE_getClearCycles __cb);

    public boolean end_getClearCycles(Ice.IntHolder cycles, Ice.AsyncResult __result);

    public boolean setClearCycles(int clearCycles);

    public boolean setClearCycles(int clearCycles, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setClearCycles(int clearCycles);

    public Ice.AsyncResult begin_setClearCycles(int clearCycles, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setClearCycles(int clearCycles, Ice.Callback __cb);

    public Ice.AsyncResult begin_setClearCycles(int clearCycles, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setClearCycles(int clearCycles, Callback_PixisICE_setClearCycles __cb);

    public Ice.AsyncResult begin_setClearCycles(int clearCycles, java.util.Map<String, String> __ctx, Callback_PixisICE_setClearCycles __cb);

    public boolean end_setClearCycles(Ice.AsyncResult __result);

    public boolean getClearStrips(Ice.IntHolder strips);

    public boolean getClearStrips(Ice.IntHolder strips, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getClearStrips();

    public Ice.AsyncResult begin_getClearStrips(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getClearStrips(Ice.Callback __cb);

    public Ice.AsyncResult begin_getClearStrips(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getClearStrips(Callback_PixisICE_getClearStrips __cb);

    public Ice.AsyncResult begin_getClearStrips(java.util.Map<String, String> __ctx, Callback_PixisICE_getClearStrips __cb);

    public boolean end_getClearStrips(Ice.IntHolder strips, Ice.AsyncResult __result);

    public boolean setClearStrips(int strips);

    public boolean setClearStrips(int strips, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setClearStrips(int strips);

    public Ice.AsyncResult begin_setClearStrips(int strips, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setClearStrips(int strips, Ice.Callback __cb);

    public Ice.AsyncResult begin_setClearStrips(int strips, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setClearStrips(int strips, Callback_PixisICE_setClearStrips __cb);

    public Ice.AsyncResult begin_setClearStrips(int strips, java.util.Map<String, String> __ctx, Callback_PixisICE_setClearStrips __cb);

    public boolean end_setClearStrips(Ice.AsyncResult __result);

    public boolean getTmp(Ice.FloatHolder curTmp);

    public boolean getTmp(Ice.FloatHolder curTmp, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getTmp();

    public Ice.AsyncResult begin_getTmp(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getTmp(Ice.Callback __cb);

    public Ice.AsyncResult begin_getTmp(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getTmp(Callback_PixisICE_getTmp __cb);

    public Ice.AsyncResult begin_getTmp(java.util.Map<String, String> __ctx, Callback_PixisICE_getTmp __cb);

    public boolean end_getTmp(Ice.FloatHolder curTmp, Ice.AsyncResult __result);

    public boolean getTmpSetpoint(Ice.FloatHolder tmpSetpoint);

    public boolean getTmpSetpoint(Ice.FloatHolder tmpSetpoint, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getTmpSetpoint();

    public Ice.AsyncResult begin_getTmpSetpoint(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getTmpSetpoint(Ice.Callback __cb);

    public Ice.AsyncResult begin_getTmpSetpoint(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getTmpSetpoint(Callback_PixisICE_getTmpSetpoint __cb);

    public Ice.AsyncResult begin_getTmpSetpoint(java.util.Map<String, String> __ctx, Callback_PixisICE_getTmpSetpoint __cb);

    public boolean end_getTmpSetpoint(Ice.FloatHolder tmpSetpoint, Ice.AsyncResult __result);

    public boolean setTmpSetpoint(float tmpSetpoint);

    public boolean setTmpSetpoint(float tmpSetpoint, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setTmpSetpoint(float tmpSetpoint);

    public Ice.AsyncResult begin_setTmpSetpoint(float tmpSetpoint, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setTmpSetpoint(float tmpSetpoint, Ice.Callback __cb);

    public Ice.AsyncResult begin_setTmpSetpoint(float tmpSetpoint, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setTmpSetpoint(float tmpSetpoint, Callback_PixisICE_setTmpSetpoint __cb);

    public Ice.AsyncResult begin_setTmpSetpoint(float tmpSetpoint, java.util.Map<String, String> __ctx, Callback_PixisICE_setTmpSetpoint __cb);

    public boolean end_setTmpSetpoint(Ice.AsyncResult __result);

    public boolean getMaxGain(Ice.IntHolder maxGain);

    public boolean getMaxGain(Ice.IntHolder maxGain, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getMaxGain();

    public Ice.AsyncResult begin_getMaxGain(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getMaxGain(Ice.Callback __cb);

    public Ice.AsyncResult begin_getMaxGain(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getMaxGain(Callback_PixisICE_getMaxGain __cb);

    public Ice.AsyncResult begin_getMaxGain(java.util.Map<String, String> __ctx, Callback_PixisICE_getMaxGain __cb);

    public boolean end_getMaxGain(Ice.IntHolder maxGain, Ice.AsyncResult __result);

    public boolean getGain(Ice.IntHolder gain);

    public boolean getGain(Ice.IntHolder gain, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getGain();

    public Ice.AsyncResult begin_getGain(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getGain(Ice.Callback __cb);

    public Ice.AsyncResult begin_getGain(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getGain(Callback_PixisICE_getGain __cb);

    public Ice.AsyncResult begin_getGain(java.util.Map<String, String> __ctx, Callback_PixisICE_getGain __cb);

    public boolean end_getGain(Ice.IntHolder gain, Ice.AsyncResult __result);

    public boolean setGain(int gain);

    public boolean setGain(int gain, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setGain(int gain);

    public Ice.AsyncResult begin_setGain(int gain, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setGain(int gain, Ice.Callback __cb);

    public Ice.AsyncResult begin_setGain(int gain, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setGain(int gain, Callback_PixisICE_setGain __cb);

    public Ice.AsyncResult begin_setGain(int gain, java.util.Map<String, String> __ctx, Callback_PixisICE_setGain __cb);

    public boolean end_setGain(Ice.AsyncResult __result);

    public boolean getGainMultEnable(Ice.IntHolder enabled);

    public boolean getGainMultEnable(Ice.IntHolder enabled, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getGainMultEnable();

    public Ice.AsyncResult begin_getGainMultEnable(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getGainMultEnable(Ice.Callback __cb);

    public Ice.AsyncResult begin_getGainMultEnable(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getGainMultEnable(Callback_PixisICE_getGainMultEnable __cb);

    public Ice.AsyncResult begin_getGainMultEnable(java.util.Map<String, String> __ctx, Callback_PixisICE_getGainMultEnable __cb);

    public boolean end_getGainMultEnable(Ice.IntHolder enabled, Ice.AsyncResult __result);

    public boolean setGainMultEnable(int enabled);

    public boolean setGainMultEnable(int enabled, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setGainMultEnable(int enabled);

    public Ice.AsyncResult begin_setGainMultEnable(int enabled, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setGainMultEnable(int enabled, Ice.Callback __cb);

    public Ice.AsyncResult begin_setGainMultEnable(int enabled, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setGainMultEnable(int enabled, Callback_PixisICE_setGainMultEnable __cb);

    public Ice.AsyncResult begin_setGainMultEnable(int enabled, java.util.Map<String, String> __ctx, Callback_PixisICE_setGainMultEnable __cb);

    public boolean end_setGainMultEnable(Ice.AsyncResult __result);

    public boolean getGainMultFactor(Ice.IntHolder factor);

    public boolean getGainMultFactor(Ice.IntHolder factor, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getGainMultFactor();

    public Ice.AsyncResult begin_getGainMultFactor(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getGainMultFactor(Ice.Callback __cb);

    public Ice.AsyncResult begin_getGainMultFactor(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getGainMultFactor(Callback_PixisICE_getGainMultFactor __cb);

    public Ice.AsyncResult begin_getGainMultFactor(java.util.Map<String, String> __ctx, Callback_PixisICE_getGainMultFactor __cb);

    public boolean end_getGainMultFactor(Ice.IntHolder factor, Ice.AsyncResult __result);

    public boolean setGainMultFactor(int factor);

    public boolean setGainMultFactor(int factor, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setGainMultFactor(int factor);

    public Ice.AsyncResult begin_setGainMultFactor(int factor, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setGainMultFactor(int factor, Ice.Callback __cb);

    public Ice.AsyncResult begin_setGainMultFactor(int factor, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setGainMultFactor(int factor, Callback_PixisICE_setGainMultFactor __cb);

    public Ice.AsyncResult begin_setGainMultFactor(int factor, java.util.Map<String, String> __ctx, Callback_PixisICE_setGainMultFactor __cb);

    public boolean end_setGainMultFactor(Ice.AsyncResult __result);

    public boolean getSpeed(Ice.IntHolder speed);

    public boolean getSpeed(Ice.IntHolder speed, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getSpeed();

    public Ice.AsyncResult begin_getSpeed(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getSpeed(Ice.Callback __cb);

    public Ice.AsyncResult begin_getSpeed(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getSpeed(Callback_PixisICE_getSpeed __cb);

    public Ice.AsyncResult begin_getSpeed(java.util.Map<String, String> __ctx, Callback_PixisICE_getSpeed __cb);

    public boolean end_getSpeed(Ice.IntHolder speed, Ice.AsyncResult __result);

    public boolean getSpeedEntries(Ice.IntHolder entries);

    public boolean getSpeedEntries(Ice.IntHolder entries, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getSpeedEntries();

    public Ice.AsyncResult begin_getSpeedEntries(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getSpeedEntries(Ice.Callback __cb);

    public Ice.AsyncResult begin_getSpeedEntries(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getSpeedEntries(Callback_PixisICE_getSpeedEntries __cb);

    public Ice.AsyncResult begin_getSpeedEntries(java.util.Map<String, String> __ctx, Callback_PixisICE_getSpeedEntries __cb);

    public boolean end_getSpeedEntries(Ice.IntHolder entries, Ice.AsyncResult __result);

    public boolean getReadoutPortEntries(Ice.IntHolder entries);

    public boolean getReadoutPortEntries(Ice.IntHolder entries, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getReadoutPortEntries();

    public Ice.AsyncResult begin_getReadoutPortEntries(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getReadoutPortEntries(Ice.Callback __cb);

    public Ice.AsyncResult begin_getReadoutPortEntries(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getReadoutPortEntries(Callback_PixisICE_getReadoutPortEntries __cb);

    public Ice.AsyncResult begin_getReadoutPortEntries(java.util.Map<String, String> __ctx, Callback_PixisICE_getReadoutPortEntries __cb);

    public boolean end_getReadoutPortEntries(Ice.IntHolder entries, Ice.AsyncResult __result);

    public boolean getBits(Ice.IntHolder bits);

    public boolean getBits(Ice.IntHolder bits, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getBits();

    public Ice.AsyncResult begin_getBits(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getBits(Ice.Callback __cb);

    public Ice.AsyncResult begin_getBits(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getBits(Callback_PixisICE_getBits __cb);

    public Ice.AsyncResult begin_getBits(java.util.Map<String, String> __ctx, Callback_PixisICE_getBits __cb);

    public boolean end_getBits(Ice.IntHolder bits, Ice.AsyncResult __result);

    public boolean getSpeedMode(Ice.ShortHolder speed);

    public boolean getSpeedMode(Ice.ShortHolder speed, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getSpeedMode();

    public Ice.AsyncResult begin_getSpeedMode(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getSpeedMode(Ice.Callback __cb);

    public Ice.AsyncResult begin_getSpeedMode(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getSpeedMode(Callback_PixisICE_getSpeedMode __cb);

    public Ice.AsyncResult begin_getSpeedMode(java.util.Map<String, String> __ctx, Callback_PixisICE_getSpeedMode __cb);

    public boolean end_getSpeedMode(Ice.ShortHolder speed, Ice.AsyncResult __result);

    public boolean setSpeedMode(short speed);

    public boolean setSpeedMode(short speed, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setSpeedMode(short speed);

    public Ice.AsyncResult begin_setSpeedMode(short speed, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setSpeedMode(short speed, Ice.Callback __cb);

    public Ice.AsyncResult begin_setSpeedMode(short speed, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setSpeedMode(short speed, Callback_PixisICE_setSpeedMode __cb);

    public Ice.AsyncResult begin_setSpeedMode(short speed, java.util.Map<String, String> __ctx, Callback_PixisICE_setSpeedMode __cb);

    public boolean end_setSpeedMode(Ice.AsyncResult __result);

    public boolean getReadoutPort(Ice.ShortHolder port);

    public boolean getReadoutPort(Ice.ShortHolder port, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getReadoutPort();

    public Ice.AsyncResult begin_getReadoutPort(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getReadoutPort(Ice.Callback __cb);

    public Ice.AsyncResult begin_getReadoutPort(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getReadoutPort(Callback_PixisICE_getReadoutPort __cb);

    public Ice.AsyncResult begin_getReadoutPort(java.util.Map<String, String> __ctx, Callback_PixisICE_getReadoutPort __cb);

    public boolean end_getReadoutPort(Ice.ShortHolder port, Ice.AsyncResult __result);

    public boolean setReadoutport(short port);

    public boolean setReadoutport(short port, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setReadoutport(short port);

    public Ice.AsyncResult begin_setReadoutport(short port, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setReadoutport(short port, Ice.Callback __cb);

    public Ice.AsyncResult begin_setReadoutport(short port, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setReadoutport(short port, Callback_PixisICE_setReadoutport __cb);

    public Ice.AsyncResult begin_setReadoutport(short port, java.util.Map<String, String> __ctx, Callback_PixisICE_setReadoutport __cb);

    public boolean end_setReadoutport(Ice.AsyncResult __result);

    public boolean getRetries(Ice.IntHolder retries);

    public boolean getRetries(Ice.IntHolder retries, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getRetries();

    public Ice.AsyncResult begin_getRetries(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getRetries(Ice.Callback __cb);

    public Ice.AsyncResult begin_getRetries(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getRetries(Callback_PixisICE_getRetries __cb);

    public Ice.AsyncResult begin_getRetries(java.util.Map<String, String> __ctx, Callback_PixisICE_getRetries __cb);

    public boolean end_getRetries(Ice.IntHolder retries, Ice.AsyncResult __result);

    public boolean setRetries(int retries);

    public boolean setRetries(int retries, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setRetries(int retries);

    public Ice.AsyncResult begin_setRetries(int retries, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setRetries(int retries, Ice.Callback __cb);

    public Ice.AsyncResult begin_setRetries(int retries, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setRetries(int retries, Callback_PixisICE_setRetries __cb);

    public Ice.AsyncResult begin_setRetries(int retries, java.util.Map<String, String> __ctx, Callback_PixisICE_setRetries __cb);

    public boolean end_setRetries(Ice.AsyncResult __result);

    public boolean getTimeout(Ice.IntHolder mSec);

    public boolean getTimeout(Ice.IntHolder mSec, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getTimeout();

    public Ice.AsyncResult begin_getTimeout(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getTimeout(Ice.Callback __cb);

    public Ice.AsyncResult begin_getTimeout(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getTimeout(Callback_PixisICE_getTimeout __cb);

    public Ice.AsyncResult begin_getTimeout(java.util.Map<String, String> __ctx, Callback_PixisICE_getTimeout __cb);

    public boolean end_getTimeout(Ice.IntHolder mSec, Ice.AsyncResult __result);

    public boolean setTimeout(int mSec);

    public boolean setTimeout(int mSec, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setTimeout(int mSec);

    public Ice.AsyncResult begin_setTimeout(int mSec, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setTimeout(int mSec, Ice.Callback __cb);

    public Ice.AsyncResult begin_setTimeout(int mSec, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setTimeout(int mSec, Callback_PixisICE_setTimeout __cb);

    public Ice.AsyncResult begin_setTimeout(int mSec, java.util.Map<String, String> __ctx, Callback_PixisICE_setTimeout __cb);

    public boolean end_setTimeout(Ice.AsyncResult __result);

    public boolean getFrameCapable(Ice.IntHolder frameCapable);

    public boolean getFrameCapable(Ice.IntHolder frameCapable, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getFrameCapable();

    public Ice.AsyncResult begin_getFrameCapable(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getFrameCapable(Ice.Callback __cb);

    public Ice.AsyncResult begin_getFrameCapable(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getFrameCapable(Callback_PixisICE_getFrameCapable __cb);

    public Ice.AsyncResult begin_getFrameCapable(java.util.Map<String, String> __ctx, Callback_PixisICE_getFrameCapable __cb);

    public boolean end_getFrameCapable(Ice.IntHolder frameCapable, Ice.AsyncResult __result);
}
