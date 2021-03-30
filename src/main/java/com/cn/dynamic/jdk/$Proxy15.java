package com.cn.dynamic.jdk;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.SpringProxy;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.framework.AopConfigException;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class $Proxy15 extends Proxy implements UserService, SpringProxy, Advised {
  private static Method m1;
  
  private static Method m10;
  
  private static Method m12;
  
  private static Method m15;
  
  private static Method m17;
  
  private static Method m25;
  
  private static Method m4;
  
  private static Method m9;
  
  private static Method m20;
  
  private static Method m21;
  
  private static Method m0;
  
  private static Method m23;
  
  private static Method m16;
  
  private static Method m7;
  
  private static Method m14;
  
  private static Method m3;
  
  private static Method m2;
  
  private static Method m26;
  
  private static Method m11;
  
  private static Method m18;
  
  private static Method m5;
  
  private static Method m6;
  
  private static Method m19;
  
  private static Method m8;
  
  private static Method m24;
  
  private static Method m13;
  
  private static Method m22;
  
  public $Proxy15(InvocationHandler paramInvocationHandler) {
    super(paramInvocationHandler);
  }
  
  static {
    try {
      m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[] { Class.forName("java.lang.Object") });
      m10 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isExposeProxy", new Class[0]);
      m12 = Class.forName("org.springframework.aop.framework.Advised").getMethod("addAdvisor", new Class[] { Class.forName("org.springframework.aop.Advisor") });
      m15 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isProxyTargetClass", new Class[0]);
      m17 = Class.forName("org.springframework.aop.framework.Advised").getMethod("removeAdvisor", new Class[] { int.class });
      m25 = Class.forName("org.springframework.aop.framework.Advised").getMethod("getProxiedInterfaces", new Class[0]);
      m4 = Class.forName("org.springframework.aop.framework.Advised").getMethod("indexOf", new Class[] { Class.forName("org.springframework.aop.Advisor") });
      m9 = Class.forName("org.springframework.aop.framework.Advised").getMethod("getTargetSource", new Class[0]);
      m20 = Class.forName("org.springframework.aop.framework.Advised").getMethod("addAdvice", new Class[] { int.class, Class.forName("org.aopalliance.aop.Advice") });
      m21 = Class.forName("org.springframework.aop.framework.Advised").getMethod("addAdvice", new Class[] { Class.forName("org.aopalliance.aop.Advice") });
      m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
      m23 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isInterfaceProxied", new Class[] { Class.forName("java.lang.Class") });
      m16 = Class.forName("org.springframework.aop.framework.Advised").getMethod("removeAdvice", new Class[] { Class.forName("org.aopalliance.aop.Advice") });
      m7 = Class.forName("org.springframework.aop.framework.Advised").getMethod("setExposeProxy", new Class[] { boolean.class });
      m14 = Class.forName("org.springframework.aop.framework.Advised").getMethod("setTargetSource", new Class[] { Class.forName("org.springframework.aop.TargetSource") });
      m3 = Class.forName("com.cn.dynamic.jdk.UserService").getMethod("sayHello", new Class[] { Class.forName("java.lang.String") });
      m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
      m26 = Class.forName("org.springframework.aop.framework.Advised").getMethod("getTargetClass", new Class[0]);
      m11 = Class.forName("org.springframework.aop.framework.Advised").getMethod("addAdvisor", new Class[] { int.class, Class.forName("org.springframework.aop.Advisor") });
      m18 = Class.forName("org.springframework.aop.framework.Advised").getMethod("removeAdvisor", new Class[] { Class.forName("org.springframework.aop.Advisor") });
      m5 = Class.forName("org.springframework.aop.framework.Advised").getMethod("indexOf", new Class[] { Class.forName("org.aopalliance.aop.Advice") });
      m6 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isFrozen", new Class[0]);
      m19 = Class.forName("org.springframework.aop.framework.Advised").getMethod("replaceAdvisor", new Class[] { Class.forName("org.springframework.aop.Advisor"), Class.forName("org.springframework.aop.Advisor") });
      m8 = Class.forName("org.springframework.aop.framework.Advised").getMethod("setPreFiltered", new Class[] { boolean.class });
      m24 = Class.forName("org.springframework.aop.framework.Advised").getMethod("toProxyConfigString", new Class[0]);
      m13 = Class.forName("org.springframework.aop.framework.Advised").getMethod("getAdvisors", new Class[0]);
      m22 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isPreFiltered", new Class[0]);
//      return;
    } catch (NoSuchMethodException noSuchMethodException) {
      throw new NoSuchMethodError(noSuchMethodException.getMessage());
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }

  @Override
  public final boolean equals(Object paramObject) {
    try {
      return ((Boolean)this.h.invoke(this, m1, new Object[] { paramObject })).booleanValue();
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final String toString() {
    try {
      return (String)this.h.invoke(this, m2, null);
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final int hashCode() {
    try {
      return ((Integer)this.h.invoke(this, m0, null)).intValue();
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final int indexOf(Advisor paramAdvisor) {
    try {
      return ((Integer)this.h.invoke(this, m4, new Object[] { paramAdvisor })).intValue();
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final int indexOf(Advice paramAdvice) {
    try {
      return ((Integer)this.h.invoke(this, m5, new Object[] { paramAdvice })).intValue();
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final boolean isFrozen() {
    try {
      return ((Boolean)this.h.invoke(this, m6, null)).booleanValue();
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  /**
   * jdk动态代理生成的代理类中的sayHello方法，会调用InvocationHandler.invoke方法
   * @param paramString
   */
  @Override
  public final void sayHello(String paramString) {
    try {
      this.h.invoke(this, m3, new Object[] { paramString });
      return;
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final void setExposeProxy(boolean paramBoolean) {
    try {
      this.h.invoke(this, m7, new Object[] { Boolean.valueOf(paramBoolean) });
      return;
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final void setPreFiltered(boolean paramBoolean) {
    try {
      this.h.invoke(this, m8, new Object[] { Boolean.valueOf(paramBoolean) });
      return;
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final TargetSource getTargetSource() {
    try {
      return (TargetSource)this.h.invoke(this, m9, null);
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final boolean isExposeProxy() {
    try {
      return ((Boolean)this.h.invoke(this, m10, null)).booleanValue();
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final void addAdvisor(Advisor paramAdvisor) throws AopConfigException {
    try {
      this.h.invoke(this, m12, new Object[] { paramAdvisor });
      return;
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final void addAdvisor(int paramInt, Advisor paramAdvisor) throws AopConfigException {
    try {
      this.h.invoke(this, m11, new Object[] { Integer.valueOf(paramInt), paramAdvisor });
      return;
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final Advisor[] getAdvisors() {
    try {
      return (Advisor[])this.h.invoke(this, m13, null);
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final Class getTargetClass() {
    try {
      return (Class)this.h.invoke(this, m26, null);
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final void setTargetSource(TargetSource paramTargetSource) {
    try {
      this.h.invoke(this, m14, new Object[] { paramTargetSource });
      return;
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final boolean isProxyTargetClass() {
    try {
      return ((Boolean)this.h.invoke(this, m15, null)).booleanValue();
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final boolean removeAdvice(Advice paramAdvice) {
    try {
      return ((Boolean)this.h.invoke(this, m16, new Object[] { paramAdvice })).booleanValue();
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final void removeAdvisor(int paramInt) throws AopConfigException {
    try {
      this.h.invoke(this, m17, new Object[] { Integer.valueOf(paramInt) });
      return;
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final boolean removeAdvisor(Advisor paramAdvisor) {
    try {
      return ((Boolean)this.h.invoke(this, m18, new Object[] { paramAdvisor })).booleanValue();
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final boolean replaceAdvisor(Advisor paramAdvisor1, Advisor paramAdvisor2) throws AopConfigException {
    try {
      return ((Boolean)this.h.invoke(this, m19, new Object[] { paramAdvisor1, paramAdvisor2 })).booleanValue();
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final void addAdvice(Advice paramAdvice) throws AopConfigException {
    try {
      this.h.invoke(this, m21, new Object[] { paramAdvice });
      return;
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final void addAdvice(int paramInt, Advice paramAdvice) throws AopConfigException {
    try {
      this.h.invoke(this, m20, new Object[] { Integer.valueOf(paramInt), paramAdvice });
      return;
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final boolean isPreFiltered() {
    try {
      return ((Boolean)this.h.invoke(this, m22, null)).booleanValue();
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final boolean isInterfaceProxied(Class paramClass) {
    try {
      return ((Boolean)this.h.invoke(this, m23, new Object[] { paramClass })).booleanValue();
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final String toProxyConfigString() {
    try {
      return (String)this.h.invoke(this, m24, null);
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }

  @Override
  public final Class[] getProxiedInterfaces() {
    try {
      return (Class[])this.h.invoke(this, m25, null);
    } catch (Error|RuntimeException error) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(throwable);
    } 
  }
}


/* Location:              C:\Users\admin\Desktop\!\$Proxy15.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */