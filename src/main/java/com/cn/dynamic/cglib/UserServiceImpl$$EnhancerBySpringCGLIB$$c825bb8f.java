package com.cn.dynamic.cglib;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.SpringProxy;
import org.springframework.aop.TargetClassAware;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.framework.AopConfigException;
import org.springframework.cglib.core.ReflectUtils;
import org.springframework.cglib.core.Signature;
import org.springframework.cglib.proxy.*;

import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

public class UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f extends UserServiceImpl implements SpringProxy, Advised, Factory {
  private boolean CGLIB$BOUND;
  
  public static Object CGLIB$FACTORY_DATA;
  
  private static ThreadLocal CGLIB$THREAD_CALLBACKS;
  
  private static Callback[] CGLIB$STATIC_CALLBACKS;

  //生成CGLIB$CALLBACK_0为CglibAopProxy$DynamicAdvisedInterceptor@2332
  private MethodInterceptor CGLIB$CALLBACK_0;

  //生成的CGLIB$CALLBACK_1为CglibAopProxy$StaticUnadvisedInterceptor@2713
  private MethodInterceptor CGLIB$CALLBACK_1;

  //生成的CGLIB$CALLBACK_2为CglibAopProxy$SerializableNoOp@2714
  private NoOp CGLIB$CALLBACK_2;

  //生成的CGLIB$CALLBACK_3为CglibAopProxy$StaticDispatcher@2715
  private Dispatcher CGLIB$CALLBACK_3;

  //生成的CGLIB$CALLBACK_4为CglibAopProxy$AdvisedDispatcher@2330
  private Dispatcher CGLIB$CALLBACK_4;

  //生成的CGLIB$CALLBACK_5为EqualsInterceptor@2716
  private MethodInterceptor CGLIB$CALLBACK_5;

  //生成的CGLIB$CALLBACK_6为HashCodeInterceptor@2717
  private MethodInterceptor CGLIB$CALLBACK_6;
  
  private static Method CGLIB$sayHello$0$Method = null;
  
  private static MethodProxy CGLIB$sayHello$0$Proxy = null;
  
  private static Object[] CGLIB$emptyArgs = new Object[0];
  
  private static Method CGLIB$equals$1$Method = null;
  
  private static MethodProxy CGLIB$equals$1$Proxy = null;
  
  private static Method CGLIB$toString$2$Method = null;
  
  private static MethodProxy CGLIB$toString$2$Proxy = null;
  
  private static Method CGLIB$hashCode$3$Method = null;
  
  private static MethodProxy CGLIB$hashCode$3$Proxy = null;
  
  private static Method CGLIB$clone$4$Method = null;
  
  private static MethodProxy CGLIB$clone$4$Proxy = null;
  
  static {
    CGLIB$STATICHOOK4();
    try {
      CGLIB$STATICHOOK3();
    } catch (ClassNotFoundException exception) {
      exception.printStackTrace();
    }
  }
  
  @Override
  public final boolean equals(Object paramObject) {
    try {
      if (this.CGLIB$CALLBACK_5 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      if (this.CGLIB$CALLBACK_5 != null) {
        this.CGLIB$CALLBACK_5.intercept(this, CGLIB$equals$1$Method, new Object[] { paramObject }, CGLIB$equals$1$Proxy);
        return (this.CGLIB$CALLBACK_5.intercept(this, CGLIB$equals$1$Method, new Object[] { paramObject }, CGLIB$equals$1$Proxy) == null) ? false : ((Boolean)this.CGLIB$CALLBACK_5.intercept(this, CGLIB$equals$1$Method, new Object[] { paramObject }, CGLIB$equals$1$Proxy)).booleanValue();
      } 
      return super.equals(paramObject);
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final String toString() {
    try {
      if (this.CGLIB$CALLBACK_0 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return (this.CGLIB$CALLBACK_0 != null) ? (String)this.CGLIB$CALLBACK_0.intercept(this, CGLIB$toString$2$Method, CGLIB$emptyArgs, CGLIB$toString$2$Proxy) : super.toString();
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final int hashCode() {
    try {
      if (this.CGLIB$CALLBACK_6 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      if (this.CGLIB$CALLBACK_6 != null) {
        this.CGLIB$CALLBACK_6.intercept(this, CGLIB$hashCode$3$Method, CGLIB$emptyArgs, CGLIB$hashCode$3$Proxy);
        return (this.CGLIB$CALLBACK_6.intercept(this, CGLIB$hashCode$3$Method, CGLIB$emptyArgs, CGLIB$hashCode$3$Proxy) == null) ? 0 : ((Number)this.CGLIB$CALLBACK_6.intercept(this, CGLIB$hashCode$3$Method, CGLIB$emptyArgs, CGLIB$hashCode$3$Proxy)).intValue();
      } 
      return super.hashCode();
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  protected final Object clone() throws CloneNotSupportedException {
    try {
      if (this.CGLIB$CALLBACK_0 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return (this.CGLIB$CALLBACK_0 != null) ? this.CGLIB$CALLBACK_0.intercept(this, CGLIB$clone$4$Method, CGLIB$emptyArgs, CGLIB$clone$4$Proxy) : super.clone();
    } catch (RuntimeException|Error|CloneNotSupportedException runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final int indexOf(Advisor paramAdvisor) {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).indexOf(paramAdvisor);
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final int indexOf(Advice paramAdvice) {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).indexOf(paramAdvice);
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public Object newInstance(Callback paramCallback) {
    try {
      throw new IllegalStateException("More than one callback object required");
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public Object newInstance(Callback[] paramArrayOfCallback) {
    try {
      CGLIB$SET_THREAD_CALLBACKS(paramArrayOfCallback);
      CGLIB$SET_THREAD_CALLBACKS(null);
      return new UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f();
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public Object newInstance(Class[] paramArrayOfClass, Object[] paramArrayOfObject, Callback[] paramArrayOfCallback) {
    // Byte code:
    //   0: aload_3
    //   1: invokestatic CGLIB$SET_THREAD_CALLBACKS : ([Lorg/springframework/cglib/proxy/Callback;)V
    //   4: new com/cn/dynamic/cglib/UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f
    //   7: dup
    //   8: aload_1
    //   9: dup
    //   10: arraylength
    //   11: tableswitch default -> 35, 0 -> 28
    //   28: pop
    //   29: invokespecial <init> : ()V
    //   32: goto -> 50
    //   35: goto -> 38
    //   38: pop
    //   39: new java/lang/IllegalArgumentException
    //   42: dup
    //   43: ldc_w 'Constructor not found'
    //   46: invokespecial <init> : (Ljava/lang/String;)V
    //   49: athrow
    //   50: aconst_null
    //   51: invokestatic CGLIB$SET_THREAD_CALLBACKS : ([Lorg/springframework/cglib/proxy/Callback;)V
    //   54: areturn
    //   55: athrow
    //   56: new java/lang/reflect/UndeclaredThrowableException
    //   59: dup_x1
    //   60: swap
    //   61: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   64: athrow
    // Exception table:
    //   from	to	target	type
    //   0	55	55	java/lang/RuntimeException
    //   0	55	55	java/lang/Error
    //   0	55	56	java/lang/Throwable
    return null;//这里手动添加的
  }
  
  @Override
  public final boolean isFrozen() {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this);
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).isFrozen();
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final void sayHello(String paramString) {
    try {
      if (this.CGLIB$CALLBACK_0 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      if (this.CGLIB$CALLBACK_0 != null) {
        (new Object[1])[0] = paramString;
        return;
      } 
      super.sayHello(paramString);
      return;
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final void setExposeProxy(boolean paramBoolean) {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this);
      }
      ((Advised)this.CGLIB$CALLBACK_4.loadObject()).setExposeProxy(paramBoolean);
      return;
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final boolean isExposeProxy() {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).isExposeProxy();
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final void addAdvisor(Advisor paramAdvisor) throws AopConfigException {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      ((Advised)this.CGLIB$CALLBACK_4.loadObject()).addAdvisor(paramAdvisor);
      return;
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final void addAdvisor(int paramInt, Advisor paramAdvisor) throws AopConfigException {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      ((Advised)this.CGLIB$CALLBACK_4.loadObject()).addAdvisor(paramInt, paramAdvisor);
      return;
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final Advisor[] getAdvisors() {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).getAdvisors();
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final TargetSource getTargetSource() {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).getTargetSource();
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final void setPreFiltered(boolean paramBoolean) {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      ((Advised)this.CGLIB$CALLBACK_4.loadObject()).setPreFiltered(paramBoolean);
      return;
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final Class getTargetClass() {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return ((TargetClassAware)this.CGLIB$CALLBACK_4.loadObject()).getTargetClass();
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final void setTargetSource(TargetSource paramTargetSource) {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      ((Advised)this.CGLIB$CALLBACK_4.loadObject()).setTargetSource(paramTargetSource);
      return;
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public void setCallback(int paramInt, Callback paramCallback) {
    try {
      switch (paramInt) {
        case 0:
          this.CGLIB$CALLBACK_0 = (MethodInterceptor)paramCallback;
          break;
        case 1:
          this.CGLIB$CALLBACK_1 = (MethodInterceptor)paramCallback;
          break;
        case 2:
          this.CGLIB$CALLBACK_2 = (NoOp)paramCallback;
          break;
        case 3:
          this.CGLIB$CALLBACK_3 = (Dispatcher)paramCallback;
          break;
        case 4:
          this.CGLIB$CALLBACK_4 = (Dispatcher)paramCallback;
          break;
        case 5:
          this.CGLIB$CALLBACK_5 = (MethodInterceptor)paramCallback;
          break;
        case 6:
          this.CGLIB$CALLBACK_6 = (MethodInterceptor)paramCallback;
          break;
      } 
      return;
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }

  /**
   * 在AbstractAutoProxyCreator处理器的postProcessAfterInitialization方法中会创建代理对象，如果是创建CGLIB动态代理对象，
   * 则会走CglibAopProxy的getProxy方法，该方法中会调用getCallbacks方法，该方法中有如下代码：
   * Callback[] mainCallbacks = new Callback[] {
   * 				//将拦截器加入Callback中
   * 				aopInterceptor,  // DynamicAdvisedInterceptor对象
   * 				targetInterceptor,  // StaticUnadvisedExposedInterceptor对象
   * 				new SerializableNoOp(),  // new了一个SerializableNoOp对象
   * 				targetDispatcher,  // StaticDispatcher对象
   * 				this.advisedDispatcher, // AdvisedDispatcher对象
   * 				new EqualsInterceptor(this.advised), // new了一个EqualsInterceptor对象
   * 				new HashCodeInterceptor(this.advised) // new了一个HashCodeInterceptor对象
   *                };
   * 加入的7个Callback分别对应CGLIB$CALLBACK_0、CGLIB$CALLBACK_1、CGLIB$CALLBACK_2、CGLIB$CALLBACK_3、
   * CGLIB$CALLBACK_4、CGLIB$CALLBACK_5、CGLIB$CALLBACK_6这7个属性
   *
   * @param paramArrayOfCallback
   */
  @Override
  public void setCallbacks(Callback[] paramArrayOfCallback) {
    try {
      this.CGLIB$CALLBACK_0 = (MethodInterceptor)paramArrayOfCallback[0];
      this.CGLIB$CALLBACK_1 = (MethodInterceptor)paramArrayOfCallback[1];
      this.CGLIB$CALLBACK_2 = (NoOp)paramArrayOfCallback[2];
      this.CGLIB$CALLBACK_3 = (Dispatcher)paramArrayOfCallback[3];
      this.CGLIB$CALLBACK_4 = (Dispatcher)paramArrayOfCallback[4];
      this.CGLIB$CALLBACK_5 = (MethodInterceptor)paramArrayOfCallback[5];
      this.CGLIB$CALLBACK_6 = (MethodInterceptor)paramArrayOfCallback[6];
      return;
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public Callback getCallback(int paramInt) {
    try {
      CGLIB$BIND_CALLBACKS(this);
      switch (paramInt) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
      } 
      return null;
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public Callback[] getCallbacks() {
    try {
      CGLIB$BIND_CALLBACKS(this);
      return new Callback[] { (Callback)this.CGLIB$CALLBACK_0, (Callback)this.CGLIB$CALLBACK_1, (Callback)this.CGLIB$CALLBACK_2, (Callback)this.CGLIB$CALLBACK_3, (Callback)this.CGLIB$CALLBACK_4, (Callback)this.CGLIB$CALLBACK_5, (Callback)this.CGLIB$CALLBACK_6 };
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final String toProxyConfigString() {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).toProxyConfigString();
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final void removeAdvisor(int paramInt) throws AopConfigException {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      ((Advised)this.CGLIB$CALLBACK_4.loadObject()).removeAdvisor(paramInt);
      return;
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final boolean removeAdvisor(Advisor paramAdvisor) {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).removeAdvisor(paramAdvisor);
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final boolean isPreFiltered() {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).isPreFiltered();
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final void addAdvice(Advice paramAdvice) throws AopConfigException {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      ((Advised)this.CGLIB$CALLBACK_4.loadObject()).addAdvice(paramAdvice);
      return;
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final void addAdvice(int paramInt, Advice paramAdvice) throws AopConfigException {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      ((Advised)this.CGLIB$CALLBACK_4.loadObject()).addAdvice(paramInt, paramAdvice);
      return;
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final boolean removeAdvice(Advice paramAdvice) {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).removeAdvice(paramAdvice);
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final boolean replaceAdvisor(Advisor paramAdvisor1, Advisor paramAdvisor2) throws AopConfigException {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).replaceAdvisor(paramAdvisor1, paramAdvisor2);
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  private static final void CGLIB$BIND_CALLBACKS(Object paramObject) {
    UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f c825bb8f1 = (UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f)paramObject;
    if (!c825bb8f1.CGLIB$BOUND) {
      c825bb8f1.CGLIB$BOUND = true;
      if (CGLIB$THREAD_CALLBACKS.get() == null) {
        CGLIB$THREAD_CALLBACKS.get();
        if (CGLIB$STATIC_CALLBACKS == null) {
          return;
        }
      }
      c825bb8f1.CGLIB$CALLBACK_6 = (MethodInterceptor)((Callback[])CGLIB$THREAD_CALLBACKS.get())[6];
      c825bb8f1.CGLIB$CALLBACK_5 = (MethodInterceptor)((Callback[])CGLIB$THREAD_CALLBACKS.get())[5];
      c825bb8f1.CGLIB$CALLBACK_4 = (Dispatcher)((Callback[])CGLIB$THREAD_CALLBACKS.get())[4];
      c825bb8f1.CGLIB$CALLBACK_3 = (Dispatcher)((Callback[])CGLIB$THREAD_CALLBACKS.get())[3];
      c825bb8f1.CGLIB$CALLBACK_2 = (NoOp)((Callback[])CGLIB$THREAD_CALLBACKS.get())[2];
      c825bb8f1.CGLIB$CALLBACK_1 = (MethodInterceptor)((Callback[])CGLIB$THREAD_CALLBACKS.get())[1];
      c825bb8f1.CGLIB$CALLBACK_0 = (MethodInterceptor)((Callback[])CGLIB$THREAD_CALLBACKS.get())[0];
    } 
  }
  
  @Override
  public final boolean isProxyTargetClass() {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).isProxyTargetClass();
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  public static void CGLIB$SET_STATIC_CALLBACKS(Callback[] paramArrayOfCallback) {
    CGLIB$STATIC_CALLBACKS = paramArrayOfCallback;
  }
  
  public static void CGLIB$SET_THREAD_CALLBACKS(Callback[] paramArrayOfCallback) {
    CGLIB$THREAD_CALLBACKS.set(paramArrayOfCallback);
  }
  
  @Override
  public final boolean isInterfaceProxied(Class paramClass) {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this);
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).isInterfaceProxied(paramClass);
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  @Override
  public final Class[] getProxiedInterfaces() {
    try {
      if (this.CGLIB$CALLBACK_4 == null) {
        CGLIB$BIND_CALLBACKS(this); 
      }
      return ((Advised)this.CGLIB$CALLBACK_4.loadObject()).getProxiedInterfaces();
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  public static MethodProxy CGLIB$findMethodProxy(Signature paramSignature) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual toString : ()Ljava/lang/String;
    //   4: dup
    //   5: invokevirtual hashCode : ()I
    //   8: lookupswitch default -> 120, -508378822 -> 60, 771401912 -> 72, 1826985398 -> 84, 1913648695 -> 96, 1984935277 -> 108
    //   60: ldc 'clone()Ljava/lang/Object;'
    //   62: invokevirtual equals : (Ljava/lang/Object;)Z
    //   65: ifeq -> 121
    //   68: getstatic com/cn/dynamic/cglib/UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f.CGLIB$clone$4$Proxy : Lorg/springframework/cglib/proxy/MethodProxy;
    //   71: areturn
    //   72: ldc 'sayHello(Ljava/lang/String;)V'
    //   74: invokevirtual equals : (Ljava/lang/Object;)Z
    //   77: ifeq -> 121
    //   80: getstatic com/cn/dynamic/cglib/UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f.CGLIB$sayHello$0$Proxy : Lorg/springframework/cglib/proxy/MethodProxy;
    //   83: areturn
    //   84: ldc 'equals(Ljava/lang/Object;)Z'
    //   86: invokevirtual equals : (Ljava/lang/Object;)Z
    //   89: ifeq -> 121
    //   92: getstatic com/cn/dynamic/cglib/UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f.CGLIB$equals$1$Proxy : Lorg/springframework/cglib/proxy/MethodProxy;
    //   95: areturn
    //   96: ldc 'toString()Ljava/lang/String;'
    //   98: invokevirtual equals : (Ljava/lang/Object;)Z
    //   101: ifeq -> 121
    //   104: getstatic com/cn/dynamic/cglib/UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f.CGLIB$toString$2$Proxy : Lorg/springframework/cglib/proxy/MethodProxy;
    //   107: areturn
    //   108: ldc 'hashCode()I'
    //   110: invokevirtual equals : (Ljava/lang/Object;)Z
    //   113: ifeq -> 121
    //   116: getstatic com/cn/dynamic/cglib/UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f.CGLIB$hashCode$3$Proxy : Lorg/springframework/cglib/proxy/MethodProxy;
    //   119: areturn
    //   120: pop
    //   121: aconst_null
    //   122: areturn
    return null;//这里手动添加的
  }
  
  static void CGLIB$STATICHOOK4() {
    try {
      return;
    } catch (RuntimeException|Error runtimeException) {
      throw null;
    } catch (Throwable throwable) {
      throw new UndeclaredThrowableException(null);
    } 
  }
  
  static void CGLIB$STATICHOOK3() throws ClassNotFoundException {
    CGLIB$THREAD_CALLBACKS = new ThreadLocal();
    CGLIB$emptyArgs = new Object[0];
    Class clazz1 = Class.forName("com.cn.dynamic.cglib.UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f");
    Class clazz2;
    CGLIB$equals$1$Method = ReflectUtils.findMethods(new String[] { "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;" }, (clazz2 = Class.forName("java.lang.Object")).getDeclaredMethods())[0];
    CGLIB$equals$1$Proxy = MethodProxy.create(clazz2, clazz1, "(Ljava/lang/Object;)Z", "equals", "CGLIB$equals$1");
    CGLIB$toString$2$Method = ReflectUtils.findMethods(new String[] { "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;" }, (clazz2 = Class.forName("java.lang.Object")).getDeclaredMethods())[1];
    CGLIB$toString$2$Proxy = MethodProxy.create(clazz2, clazz1, "()Ljava/lang/String;", "toString", "CGLIB$toString$2");
    CGLIB$hashCode$3$Method = ReflectUtils.findMethods(new String[] { "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;" }, (clazz2 = Class.forName("java.lang.Object")).getDeclaredMethods())[2];
    CGLIB$hashCode$3$Proxy = MethodProxy.create(clazz2, clazz1, "()I", "hashCode", "CGLIB$hashCode$3");
    CGLIB$clone$4$Method = ReflectUtils.findMethods(new String[] { "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;" }, (clazz2 = Class.forName("java.lang.Object")).getDeclaredMethods())[3];
    CGLIB$clone$4$Proxy = MethodProxy.create(clazz2, clazz1, "()Ljava/lang/Object;", "clone", "CGLIB$clone$4");
    ReflectUtils.findMethods(new String[] { "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;" }, (clazz2 = Class.forName("java.lang.Object")).getDeclaredMethods());
    CGLIB$sayHello$0$Method = ReflectUtils.findMethods(new String[] { "sayHello", "(Ljava/lang/String;)V" }, (clazz2 = Class.forName("com.cn.dynamic.cglib.UserServiceImpl")).getDeclaredMethods())[0];
    CGLIB$sayHello$0$Proxy = MethodProxy.create(clazz2, clazz1, "(Ljava/lang/String;)V", "sayHello", "CGLIB$sayHello$0");
    ReflectUtils.findMethods(new String[] { "sayHello", "(Ljava/lang/String;)V" }, (clazz2 = Class.forName("com.cn.dynamic.cglib.UserServiceImpl")).getDeclaredMethods());
  }
  
  final int CGLIB$hashCode$3() {
    return super.hashCode();
  }
  
  final String CGLIB$toString$2() {
    return super.toString();
  }
  
  final boolean CGLIB$equals$1(Object paramObject) {
    return super.equals(paramObject);
  }
  
  final void CGLIB$sayHello$0(String paramString) {
    super.sayHello(paramString);
  }
  
  final Object CGLIB$clone$4() throws CloneNotSupportedException {
    return super.clone();
  }
}


/* Location:              C:\Users\admin\Desktop\!\UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */