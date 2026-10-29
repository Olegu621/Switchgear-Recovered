            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Map;
            import java.util.NoSuchElementException;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.Executor;
            import kotlin.jvm.functions.Function0;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: renamed from: yy */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2515yy {

                /* JADX INFO: renamed from: b */
                public static final Object f19851b = new Object();

                /* JADX INFO: renamed from: c */
                public static volatile C2515yy f19852c;

                /* JADX INFO: renamed from: a */
                public final ConcurrentHashMap f19853a;

                public C2515yy(int i) {
                    switch (i) {
                        case 1:
/* 24 */                    this.f19853a = new ConcurrentHashMap(1);
                            break;
                        default:
/* 12 */                    this.f19853a = new ConcurrentHashMap();
                            break;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static C2515yy m10190b() {
/* 3 */             if (f19852c == null) {
                        synchronized (f19851b) {
                            try {
/* 10 */                        if (f19852c == null) {
/* 18 */                            f19852c = new C2515yy(0);
                                }
                            } catch (Throwable th) {
/* 26 */                        throw th;
                            }
                        }
                    }
/* 27 */            C2515yy c2515yy = f19852c;
/* 29 */            kb1.m6061n(c2515yy);
/* 32 */            return c2515yy;
                }

                /* JADX INFO: renamed from: a */
                public boolean m10191a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
/* 15 */            return m10194e(context, context.getClass().getName(), intent, serviceConnection, i, null);
                }

                /* JADX INFO: renamed from: c */
                public Object m10192c(SerialDescriptor serialDescriptor, Function0 function0) {
/* 1 */             xt0 xt0Var = w11.f18416a;
/* 3 */             serialDescriptor.getClass();
/* 6 */             ConcurrentHashMap concurrentHashMap = this.f19853a;
/* 12 */            Map map = (Map) concurrentHashMap.get(serialDescriptor);
/* 22 */            Object obj = map != null ? map.get(xt0Var) : null;
/* 23 */            Object obj2 = obj != null ? obj : null;
/* 27 */            if (obj2 != null) {
/* 29 */                return obj2;
                    }
/* 30 */            Object objInvoke = function0.invoke();
/* 34 */            objInvoke.getClass();
/* 37 */            Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
/* 41 */            if (concurrentHashMap2 == null) {
/* 46 */                concurrentHashMap2 = new ConcurrentHashMap(1);
/* 49 */                concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
                    }
/* 54 */            ((Map) concurrentHashMap2).put(xt0Var, objInvoke);
/* 57 */            return objInvoke;
                }

                /* JADX INFO: renamed from: d */
                public void m10193d(Context context, ServiceConnection serviceConnection) {
/* 3 */             if (!(serviceConnection instanceof fo3)) {
/* 5 */                 ConcurrentHashMap concurrentHashMap = this.f19853a;
/* 11 */                if (concurrentHashMap.containsKey(serviceConnection)) {
                            try {
                                try {
/* 19 */                            context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                                }
/* 28 */                        return;
                            } finally {
/* 29 */                        concurrentHashMap.remove(serviceConnection);
                            }
                        }
                    }
                    try {
/* 33 */                context.unbindService(serviceConnection);
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                    }
                }

                /* JADX INFO: renamed from: e */
                public boolean m10194e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
/* 1 */             ComponentName component = intent.getComponent();
/* 8 */             if (component != null) {
/* 11 */                String packageName = component.getPackageName();
/* 17 */                "com.google.android.gms".equals(packageName);
                        try {
/* 33 */                    if ((g93.m3898a(context).m9213b(0, packageName).flags & 2097152) != 0) {
/* 37 */                        AbstractC1245n0.m4889q("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
/* 7 */                         return false;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
/* 46 */            if (serviceConnection instanceof fo3) {
/* 107 */               if (executor == null) {
/* 109 */                   executor = null;
                        }
/* 122 */               return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
                    }
/* 48 */            ConcurrentHashMap concurrentHashMap = this.f19853a;
/* 54 */            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
/* 56 */            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
/* 74 */                AbstractC1245n0.m4889q("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
                    }
/* 77 */            if (executor == null) {
/* 79 */                executor = null;
                    }
                    try {
/* 91 */                boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
/* 95 */                if (zBindService) {
/* 127 */                   return zBindService;
                        }
/* 98 */                concurrentHashMap.remove(serviceConnection, serviceConnection);
/* 7 */                 return false;
                    } catch (Throwable th) {
/* 103 */               concurrentHashMap.remove(serviceConnection, serviceConnection);
/* 106 */               throw th;
                    }
                }
            }
