/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.utils.SharedLibraryLoader;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class ClosestPointInput {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ClosestPointInput(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ClosestPointInput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_ClosestPointInput(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public ClosestPointInput() {
    this(gdxBulletJNI.new_ClosestPointInput(), true);
  }

  public void setM_transformA(btTransform value) {
    gdxBulletJNI.ClosestPointInput_m_transformA_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getM_transformA() {
    long cPtr = gdxBulletJNI.ClosestPointInput_m_transformA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setM_transformB(btTransform value) {
    gdxBulletJNI.ClosestPointInput_m_transformB_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getM_transformB() {
    long cPtr = gdxBulletJNI.ClosestPointInput_m_transformB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setM_maximumDistanceSquared(float value) {
    gdxBulletJNI.ClosestPointInput_m_maximumDistanceSquared_set(swigCPtr, this, value);
  }

  public float getM_maximumDistanceSquared() {
    return gdxBulletJNI.ClosestPointInput_m_maximumDistanceSquared_get(swigCPtr, this);
  }

  public void setM_stackAlloc(btStackAlloc value) {
    gdxBulletJNI.ClosestPointInput_m_stackAlloc_set(swigCPtr, this, btStackAlloc.getCPtr(value), value);
  }

  public btStackAlloc getM_stackAlloc() {
    long cPtr = gdxBulletJNI.ClosestPointInput_m_stackAlloc_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btStackAlloc(cPtr, false);
  }

}