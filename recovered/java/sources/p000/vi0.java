            package p000;

            import android.app.Application;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.IntentFilter;
            import android.content.pm.PackageManager;
            import android.content.pm.ServiceInfo;
            import android.os.Bundle;
            import android.os.Trace;
            import android.util.Base64;
            import com.google.firebase.FirebaseCommonRegistrar;
            import com.google.firebase.components.ComponentDiscoveryService;
            import com.google.firebase.components.ComponentRegistrar;
            import com.google.firebase.concurrent.ExecutorsRegistrar;
            import com.google.firebase.provider.FirebaseInitProvider;
            import io.sentry.android.core.AbstractC1245n0;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vi0 {

                /* JADX INFO: renamed from: j */
                public static final Object f18190j = new Object();

                /* JADX INFO: renamed from: k */
                public static final C1024id f18191k = new C1024id();

                /* JADX INFO: renamed from: a */
                public final Context f18192a;

                /* JADX INFO: renamed from: b */
                public final String f18193b;

                /* JADX INFO: renamed from: c */
                public final cj0 f18194c;

                /* JADX INFO: renamed from: d */
                public final C1773iy f18195d;

                /* JADX INFO: renamed from: g */
                public final q51 f18198g;

                /* JADX INFO: renamed from: h */
                public final iz1 f18199h;

                /* JADX INFO: renamed from: e */
                public final AtomicBoolean f18196e = new AtomicBoolean(false);

                /* JADX INFO: renamed from: f */
                public final AtomicBoolean f18197f = new AtomicBoolean();

                /* JADX INFO: renamed from: i */
                public final CopyOnWriteArrayList f18200i = new CopyOnWriteArrayList();

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
                public vi0(Context context, String str, cj0 cj0Var) {
                    ?? arrayList;
/* 6 */             int i = 0;
/* 28 */            new CopyOnWriteArrayList();
/* 31 */            this.f18192a = context;
/* 33 */            kb1.m6058k(str);
/* 36 */            this.f18193b = str;
/* 38 */            this.f18194c = cj0Var;
/* 40 */            C1963ng c1963ng = FirebaseInitProvider.f5309a;
/* 44 */            Trace.beginSection("Firebase");
/* 49 */            Trace.beginSection("ComponentDiscovery");
/* 56 */            ArrayList arrayList2 = new ArrayList();
/* 59 */            Bundle bundle = null;
                    try {
/* 60 */                PackageManager packageManager = context.getPackageManager();
/* 64 */                if (packageManager == null) {
/* 68 */                    AbstractC1245n0.m4889q("ComponentDiscovery", "Context has no PackageManager.");
                        } else {
/* 79 */                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
/* 83 */                    if (serviceInfo == null) {
/* 102 */                       AbstractC1245n0.m4889q("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                            } else {
/* 106 */                       bundle = serviceInfo.metaData;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
/* 111 */               AbstractC1245n0.m4889q("ComponentDiscovery", "Application info not found.");
                    }
/* 114 */           if (bundle == null) {
/* 118 */               AbstractC1245n0.m4889q("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
/* 121 */               arrayList = Collections.EMPTY_LIST;
                    } else {
/* 126 */               arrayList = new ArrayList();
/* 141 */               for (String str2 : bundle.keySet()) {
/* 159 */                   if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
/* 175 */                       arrayList.add(str2.substring(31));
                            }
                        }
                    }
/* 179 */           Iterator it = arrayList.iterator();
/* 187 */           while (it.hasNext()) {
/* 200 */               arrayList2.add(new C0897ey((String) it.next(), i));
                    }
/* 204 */           Trace.endSection();
/* 209 */           Trace.beginSection("Runtime");
/* 212 */           fx2 fx2Var = fx2.f8393a;
/* 216 */           ArrayList arrayList3 = new ArrayList();
/* 221 */           ArrayList<C2197sx> arrayList4 = new ArrayList();
/* 224 */           arrayList3.addAll(arrayList2);
/* 234 */           int i2 = 1;
/* 238 */           arrayList3.add(new C0897ey(new FirebaseCommonRegistrar(), i2));
/* 251 */           arrayList3.add(new C0897ey(new ExecutorsRegistrar(), i2));
/* 262 */           arrayList4.add(C2197sx.m8645c(context, Context.class, new Class[0]));
/* 273 */           arrayList4.add(C2197sx.m8645c(this, vi0.class, new Class[0]));
/* 284 */           arrayList4.add(C2197sx.m8645c(cj0Var, cj0.class, new Class[0]));
/* 291 */           dc0 dc0Var = new dc0(26);
/* 298 */           if (dz2.m3284a(context) && FirebaseInitProvider.f5310b.get()) {
/* 316 */               arrayList4.add(C2197sx.m8645c(c1963ng, C1963ng.class, new Class[0]));
                    }
/* 321 */           fx2 fx2Var2 = fx2.f8393a;
/* 323 */           C1773iy c1773iy = new C1773iy();
/* 331 */           c1773iy.f11955a = new HashMap();
/* 338 */           c1773iy.f11956b = new HashMap();
/* 345 */           c1773iy.f11957c = new HashMap();
/* 352 */           c1773iy.f11958d = new HashSet();
/* 359 */           c1773iy.f11960f = new AtomicReference();
/* 363 */           xe0 xe0Var = new xe0();
/* 366 */           c1773iy.f11959e = xe0Var;
/* 368 */           c1773iy.f11961i = dc0Var;
/* 372 */           ArrayList<C2197sx> arrayList5 = new ArrayList();
/* 389 */           arrayList5.add(C2197sx.m8645c(xe0Var, xe0.class, li2.class, pz1.class));
/* 400 */           arrayList5.add(C2197sx.m8645c(c1773iy, C1773iy.class, new Class[0]));
/* 411 */           for (C2197sx c2197sx : arrayList4) {
/* 419 */               if (c2197sx != null) {
/* 421 */                   arrayList5.add(c2197sx);
                        }
                    }
/* 427 */           ArrayList arrayList6 = new ArrayList();
/* 430 */           Iterator it2 = arrayList3.iterator();
/* 438 */           while (it2.hasNext()) {
/* 444 */               arrayList6.add(it2.next());
                    }
/* 450 */           ArrayList arrayList7 = new ArrayList();
                    synchronized (c1773iy) {
/* 454 */               Iterator it3 = arrayList6.iterator();
/* 462 */               while (it3.hasNext()) {
                            try {
/* 474 */                       ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((iz1) it3.next()).get();
/* 476 */                       if (componentRegistrar != null) {
/* 486 */                           arrayList5.addAll(((dc0) c1773iy.f11961i).m2995k(componentRegistrar));
/* 489 */                           it3.remove();
                                }
                            } catch (rz0 e) {
/* 497 */                       it3.remove();
/* 504 */                       AbstractC1245n0.m4891s("ComponentDiscovery", "Invalid component registrar.", e);
                            }
                        }
/* 508 */               Iterator it4 = arrayList5.iterator();
/* 516 */               while (it4.hasNext()) {
/* 532 */                   for (Object obj : ((C2197sx) it4.next()).f16832b.toArray()) {
/* 546 */                       if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
/* 560 */                           if (((HashSet) c1773iy.f11958d).contains(obj.toString())) {
/* 562 */                               it4.remove();
                                        break;
                                    }
/* 574 */                           ((HashSet) c1773iy.f11958d).add(obj.toString());
                                }
                            }
                        }
/* 588 */               if (((HashMap) c1773iy.f11955a).isEmpty()) {
/* 590 */                   kb1.m6072y(arrayList5);
                        } else {
/* 604 */                   ArrayList arrayList8 = new ArrayList(((HashMap) c1773iy.f11955a).keySet());
/* 607 */                   arrayList8.addAll(arrayList5);
/* 610 */                   kb1.m6072y(arrayList8);
                        }
/* 621 */               for (C2197sx c2197sx2 : arrayList5) {
/* 643 */                   ((HashMap) c1773iy.f11955a).put(c2197sx2, new q51(new C1008hy(i, c1773iy, c2197sx2)));
                        }
/* 651 */               arrayList7.addAll(c1773iy.m5621p(arrayList5));
/* 658 */               arrayList7.addAll(c1773iy.m5622q());
/* 661 */               c1773iy.m5620o();
                    }
/* 665 */           Iterator it5 = arrayList7.iterator();
/* 673 */           while (it5.hasNext()) {
/* 681 */               ((Runnable) it5.next()).run();
                    }
/* 693 */           Boolean bool = (Boolean) ((AtomicReference) c1773iy.f11960f).get();
/* 695 */           if (bool != null) {
/* 705 */               c1773iy.m5612g((HashMap) c1773iy.f11955a, bool.booleanValue());
                    }
/* 708 */           this.f18195d = c1773iy;
/* 710 */           Trace.endSection();
/* 724 */           this.f18198g = new q51(new C1008hy(2, this, context));
/* 732 */           this.f18199h = c1773iy.mo1258b(b60.class);
/* 736 */           si0 si0Var = new si0(this);
/* 739 */           m9274a();
/* 748 */           if (this.f18196e.get()) {
/* 754 */               ComponentCallbacks2C1831kh.f12758e.f12759a.get();
                    }
/* 759 */           this.f18200i.add(si0Var);
/* 762 */           Trace.endSection();
                }

                /* JADX INFO: renamed from: c */
                public static vi0 m9271c() {
                    vi0 vi0Var;
                    synchronized (f18190j) {
                        try {
/* 15 */                    vi0Var = (vi0) f18191k.getOrDefault("[DEFAULT]", null);
/* 17 */                    if (vi0Var == null) {
/* 60 */                        throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + mn0.m6702r() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                            }
/* 27 */                    ((b60) vi0Var.f18199h.get()).m1292b();
                        } catch (Throwable th) {
/* 62 */                    throw th;
                        }
                    }
/* 31 */            return vi0Var;
                }

                /* JADX INFO: renamed from: f */
                public static vi0 m9272f(Context context, cj0 cj0Var) {
                    vi0 vi0Var;
/* 3 */             AtomicReference atomicReference = ti0.f17112a;
/* 11 */            if (context.getApplicationContext() instanceof Application) {
/* 18 */                Application application = (Application) context.getApplicationContext();
/* 20 */                AtomicReference atomicReference2 = ti0.f17112a;
/* 26 */                if (atomicReference2.get() == null) {
/* 30 */                    ti0 ti0Var = new ti0();
/* 63 */                    do {
/* 38 */                        if (atomicReference2.compareAndSet(null, ti0Var)) {
/* 40 */                            ComponentCallbacks2C1831kh.m6102a(application);
/* 43 */                            ComponentCallbacks2C1831kh componentCallbacks2C1831kh = ComponentCallbacks2C1831kh.f12758e;
/* 45 */                            componentCallbacks2C1831kh.getClass();
                                    synchronized (componentCallbacks2C1831kh) {
/* 51 */                                componentCallbacks2C1831kh.f12761c.add(ti0Var);
                                    }
                                    break;
                                }
/* 63 */                    } while (atomicReference2.get() == null);
                        }
                    }
/* 69 */            if (context.getApplicationContext() != null) {
/* 72 */                context = context.getApplicationContext();
                    }
                    synchronized (f18190j) {
/* 79 */                C1024id c1024id = f18191k;
/* 109 */               kb1.m6063p("FirebaseApp name [DEFAULT] already exists!", !c1024id.containsKey("[DEFAULT]"));
/* 114 */               kb1.m6062o(context, "Application context cannot be null.");
/* 119 */               vi0Var = new vi0(context, "[DEFAULT]", cj0Var);
/* 122 */               c1024id.put("[DEFAULT]", vi0Var);
                    }
/* 126 */           vi0Var.m9277e();
/* 129 */           return vi0Var;
                }

                /* JADX INFO: renamed from: g */
                public static void m9273g(Context context) {
                    synchronized (f18190j) {
                        try {
/* 12 */                    if (f18191k.containsKey("[DEFAULT]")) {
/* 14 */                        m9271c();
/* 18 */                        return;
                            }
/* 21 */                    cj0 cj0VarM1698a = cj0.m1698a(context);
/* 25 */                    if (cj0VarM1698a == null) {
/* 31 */                        AbstractC1245n0.m4889q("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                            } else {
/* 36 */                        m9272f(context, cj0VarM1698a);
                            }
                        } catch (Throwable th) {
/* 42 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m9274a() {
/* 11 */            kb1.m6063p("FirebaseApp was deleted", !this.f18197f.get());
                }

                /* JADX INFO: renamed from: b */
                public final Object m9275b(Class cls) {
/* 1 */             m9274a();
/* 6 */             return this.f18195d.get(cls);
                }

                /* JADX INFO: renamed from: d */
                public final String m9276d() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             m9274a();
/* 15 */            byte[] bytes = this.f18193b.getBytes(Charset.defaultCharset());
/* 30 */            sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
/* 35 */            sb.append("+");
/* 38 */            m9274a();
/* 49 */            byte[] bytes2 = this.f18194c.f2935b.getBytes(Charset.defaultCharset());
/* 60 */            sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
/* 63 */            return sb.toString();
                }

                /* JADX INFO: renamed from: e */
                public final void m9277e() {
                    HashMap map;
/* 8 */             if (!dz2.m3284a(this.f18192a)) {
/* 10 */                m9274a();
/* 13 */                Context context = this.f18192a;
/* 15 */                AtomicReference atomicReference = ui0.f17542b;
/* 21 */                if (atomicReference.get() == null) {
/* 25 */                    ui0 ui0Var = new ui0(context);
/* 32 */                    while (!atomicReference.compareAndSet(null, ui0Var)) {
/* 49 */                        if (atomicReference.get() != null) {
/* 51 */                            return;
                                }
                            }
/* 41 */                    context.registerReceiver(ui0Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
/* 44 */                    return;
                        }
/* 51 */                return;
                    }
/* 52 */            m9274a();
/* 55 */            C1773iy c1773iy = this.f18195d;
/* 59 */            m9274a();
/* 64 */            boolean zEquals = "[DEFAULT]".equals(this.f18193b);
/* 70 */            AtomicReference atomicReference2 = (AtomicReference) c1773iy.f11960f;
/* 72 */            Boolean boolValueOf = Boolean.valueOf(zEquals);
/* 80 */            while (!atomicReference2.compareAndSet(null, boolValueOf)) {
/* 104 */               if (atomicReference2.get() != null) {
/* 114 */                   ((b60) this.f18199h.get()).m1292b();
                        }
                    }
                    synchronized (c1773iy) {
/* 89 */                map = new HashMap((HashMap) c1773iy.f11955a);
                    }
/* 93 */            c1773iy.m5612g(map, zEquals);
/* 114 */           ((b60) this.f18199h.get()).m1292b();
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof vi0)) {
/* 5 */                 return false;
                    }
/* 7 */             vi0 vi0Var = (vi0) obj;
/* 9 */             vi0Var.m9274a();
/* 16 */            return this.f18193b.equals(vi0Var.f18193b);
                }

                public final int hashCode() {
/* 3 */             return this.f18193b.hashCode();
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.f18193b, "name");
/* 17 */            wc0Var.m9529d(this.f18194c, "options");
/* 20 */            return wc0Var.toString();
                }
            }
