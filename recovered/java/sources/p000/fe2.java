            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.graphics.Rect;
            import android.os.IBinder;
            import android.view.Window;
            import android.view.WindowManager;
            import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
            import androidx.window.sidecar.SidecarDeviceState;
            import androidx.window.sidecar.SidecarDisplayFeature;
            import androidx.window.sidecar.SidecarInterface;
            import androidx.window.sidecar.SidecarWindowLayoutInfo;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.WeakHashMap;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.jvm.internal.Intrinsics;
            import p000.ac1;
            import p000.ce2;
            import p000.fe2;
            import p000.q83;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fe2 implements ag0 {

                /* JADX INFO: renamed from: a */
                public final SidecarInterface f8178a;

                /* JADX INFO: renamed from: b */
                public final ce2 f8179b;

                /* JADX INFO: renamed from: c */
                public final LinkedHashMap f8180c;

                /* JADX INFO: renamed from: d */
                public final LinkedHashMap f8181d;

                /* JADX INFO: renamed from: e */
                public ac1 f8182e;

                public fe2(Context context) {
/* 1 */             context.getClass();
/* 4 */             SidecarInterface sidecarInterfaceM3013a = de2.m3013a(context);
/* 10 */            ce2 ce2Var = new ce2();
/* 16 */            this.f8178a = sidecarInterfaceM3013a;
/* 18 */            this.f8179b = ce2Var;
/* 25 */            this.f8180c = new LinkedHashMap();
/* 32 */            this.f8181d = new LinkedHashMap();
                }

                /* JADX INFO: renamed from: a */
                public final q83 m3753a(Activity activity) {
                    SidecarDeviceState sidecarDeviceState;
                    WindowManager.LayoutParams attributes;
/* 1 */             Window window = activity.getWindow();
/* 17 */            IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
/* 18 */            if (iBinder == null) {
/* 24 */                return new q83(nd0.f14189a);
                    }
/* 28 */            SidecarInterface sidecarInterface = this.f8178a;
/* 32 */            SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinder) : null;
/* 36 */            SidecarInterface sidecarInterface2 = this.f8178a;
/* 38 */            if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
/* 48 */                sidecarDeviceState = new SidecarDeviceState();
                    }
/* 53 */            return this.f8179b.m1643c(windowLayoutInfo, sidecarDeviceState);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: b */
                public final void m3754b(Activity activity) {
                    SidecarInterface sidecarInterface;
                    WindowManager.LayoutParams attributes;
/* 1 */             Window window = activity.getWindow();
/* 17 */            IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
/* 18 */            if (iBinder == null) {
/* 103 */               return;
                    }
/* 21 */            SidecarInterface sidecarInterface2 = this.f8178a;
/* 23 */            if (sidecarInterface2 != null) {
/* 25 */                sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
                    }
/* 28 */            LinkedHashMap linkedHashMap = this.f8181d;
/* 34 */            c00 c00Var = (c00) linkedHashMap.get(activity);
/* 36 */            if (c00Var != null) {
/* 41 */                if (activity instanceof vp1) {
/* 46 */                    ((vp1) activity).removeOnConfigurationChangedListener(c00Var);
                        }
/* 49 */                linkedHashMap.remove(activity);
                    }
/* 52 */            ac1 ac1Var = this.f8182e;
/* 54 */            if (ac1Var != null) {
/* 58 */                ReentrantLock reentrantLock = (ReentrantLock) ac1Var.f178c;
/* 60 */                reentrantLock.lock();
                        try {
/* 67 */                    ((WeakHashMap) ac1Var.f179d).put(activity, null);
/* 70 */                    reentrantLock.unlock();
                        } catch (Throwable th) {
/* 75 */                    reentrantLock.unlock();
/* 78 */                    throw th;
                        }
                    }
/* 79 */            LinkedHashMap linkedHashMap2 = this.f8180c;
/* 90 */            boolean z = linkedHashMap2.size() == 1;
/* 91 */            linkedHashMap2.remove(iBinder);
/* 94 */            if (!z || (sidecarInterface = this.f8178a) == null) {
/* 103 */               return;
                    }
/* 100 */           sidecarInterface.onDeviceStateListenersChanged(true);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: c */
                public final void m3755c(IBinder iBinder, Activity activity) {
                    SidecarInterface sidecarInterface;
/* 1 */             LinkedHashMap linkedHashMap = this.f8180c;
/* 3 */             linkedHashMap.put(iBinder, activity);
/* 6 */             SidecarInterface sidecarInterface2 = this.f8178a;
/* 8 */             if (sidecarInterface2 != null) {
/* 10 */                sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
                    }
/* 18 */            if (linkedHashMap.size() == 1 && (sidecarInterface = this.f8178a) != null) {
/* 25 */                sidecarInterface.onDeviceStateListenersChanged(false);
                    }
/* 28 */            ac1 ac1Var = this.f8182e;
/* 30 */            if (ac1Var != null) {
/* 36 */                ac1Var.m167I(activity, m3753a(activity));
                    }
/* 39 */            LinkedHashMap linkedHashMap2 = this.f8181d;
/* 45 */            if (linkedHashMap2.get(activity) == null && (activity instanceof vp1)) {
/* 54 */                C1973nq c1973nq = new C1973nq(3, this, activity);
/* 57 */                linkedHashMap2.put(activity, c1973nq);
/* 62 */                ((vp1) activity).addOnConfigurationChangedListener(c1973nq);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m3756d(fs0 fs0Var) {
/* 6 */             this.f8182e = new ac1(fs0Var);
/* 8 */             SidecarInterface sidecarInterface = this.f8178a;
/* 10 */            if (sidecarInterface != null) {
/* 28 */                sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f8179b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                            public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
                                SidecarInterface sidecarInterface2;
                                Window window;
                                WindowManager.LayoutParams attributes;
/* 1 */                         newDeviceState.getClass();
/* 8 */                         Collection<Activity> collectionValues = this.f2041a.f8180c.values();
/* 12 */                        fe2 fe2Var = this.f2041a;
/* 22 */                        for (Activity activity : collectionValues) {
/* 30 */                            SidecarWindowLayoutInfo windowLayoutInfo = null;
/* 48 */                            IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
/* 49 */                            if (iBinder != null && (sidecarInterface2 = fe2Var.f8178a) != null) {
/* 55 */                                windowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinder);
                                    }
/* 59 */                            ac1 ac1Var = fe2Var.f8182e;
/* 61 */                            if (ac1Var != null) {
/* 69 */                                ac1Var.m167I(activity, fe2Var.f8179b.m1643c(windowLayoutInfo, newDeviceState));
                                    }
                                }
                            }

                            public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
                                SidecarDeviceState sidecarDeviceState;
/* 1 */                         windowToken.getClass();
/* 4 */                         newLayout.getClass();
/* 15 */                        Activity activity = (Activity) this.f2041a.f8180c.get(windowToken);
/* 17 */                        if (activity == null) {
/* 23 */                            AbstractC1245n0.m4889q("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
/* 26 */                            return;
                                }
/* 27 */                        fe2 fe2Var = this.f2041a;
/* 29 */                        ce2 ce2Var = fe2Var.f8179b;
/* 31 */                        SidecarInterface sidecarInterface2 = fe2Var.f8178a;
/* 33 */                        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
/* 43 */                            sidecarDeviceState = new SidecarDeviceState();
                                }
/* 46 */                        q83 q83VarM1643c = ce2Var.m1643c(newLayout, sidecarDeviceState);
/* 52 */                        ac1 ac1Var = this.f2041a.f8182e;
/* 54 */                        if (ac1Var != null) {
/* 56 */                            ac1Var.m167I(activity, q83VarM1643c);
                                }
                            }
                        }));
                    }
                }

                /* JADX INFO: renamed from: e */
                public final boolean m3757e() {
                    Class<?> cls;
                    Class<?> cls2;
                    Class<?> cls3;
                    Class<?> cls4;
                    try {
/* 9 */                 SidecarInterface sidecarInterface = this.f8178a;
/* 33 */                Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
/* 41 */                Class<?> returnType = method != null ? method.getReturnType() : null;
/* 42 */                Class cls5 = Void.TYPE;
/* 48 */                if (!Intrinsics.m6216a(returnType, cls5)) {
/* 404 */                   throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
                        }
/* 50 */                SidecarInterface sidecarInterface2 = this.f8178a;
/* 52 */                if (sidecarInterface2 != null) {
/* 54 */                    sidecarInterface2.getDeviceState();
                        }
/* 57 */                SidecarInterface sidecarInterface3 = this.f8178a;
/* 60 */                if (sidecarInterface3 != null) {
/* 62 */                    sidecarInterface3.onDeviceStateListenersChanged(true);
                        }
/* 65 */                SidecarInterface sidecarInterface4 = this.f8178a;
/* 88 */                Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
/* 96 */                Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
/* 103 */               if (!Intrinsics.m6216a(returnType2, SidecarWindowLayoutInfo.class)) {
/* 386 */                   throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
                        }
/* 105 */               SidecarInterface sidecarInterface5 = this.f8178a;
/* 126 */               Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
/* 134 */               Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
/* 139 */               if (!Intrinsics.m6216a(returnType3, cls5)) {
/* 368 */                   throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
                        }
/* 141 */               SidecarInterface sidecarInterface6 = this.f8178a;
/* 162 */               Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
/* 170 */               Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
/* 175 */               if (!Intrinsics.m6216a(returnType4, cls5)) {
/* 350 */                   throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
                        }
/* 179 */               SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                        try {
/* 183 */                   sidecarDeviceState.posture = 3;
                        } catch (NoSuchFieldError unused) {
/* 208 */                   SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
/* 219 */                   Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
/* 223 */                   objInvoke.getClass();
/* 232 */                   if (((Integer) objInvoke).intValue() != 3) {
/* 332 */                       throw new Exception("Invalid device posture getter/setter");
                            }
                        }
/* 236 */               SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
/* 239 */               Rect rect = sidecarDisplayFeature.getRect();
/* 243 */               rect.getClass();
/* 246 */               sidecarDisplayFeature.setRect(rect);
/* 249 */               sidecarDisplayFeature.getType();
/* 252 */               sidecarDisplayFeature.setType(1);
/* 257 */               SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                        try {
/* 260 */                   List list = sidecarWindowLayoutInfo.displayFeatures;
/* 59 */                    return true;
                        } catch (NoSuchFieldError unused2) {
/* 266 */                   ArrayList arrayList = new ArrayList();
/* 269 */                   arrayList.add(sidecarDisplayFeature);
/* 290 */                   SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
/* 301 */                   Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
/* 305 */                   objInvoke2.getClass();
/* 314 */                   if (arrayList.equals((List) objInvoke2)) {
/* 59 */                        return true;
                            }
/* 324 */                   throw new Exception("Invalid display feature getter/setter");
                        }
                    } catch (Throwable unused3) {
/* 405 */               return false;
                    }
                }
            }
