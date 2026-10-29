            package io.sentry.android.core;

            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import android.os.Looper;
            import android.support.v4.media.session.PlaybackStateCompat;
            import io.sentry.AbstractC1635q4;
            import io.sentry.C1393c5;
            import io.sentry.C1486i0;
            import io.sentry.C1575o5;
            import io.sentry.C1576o6;
            import io.sentry.C1644r5;
            import io.sentry.C1697u2;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1574o4;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1388c0;
            import io.sentry.android.core.internal.util.C1218e;
            import io.sentry.android.core.performance.C1259g;
            import io.sentry.android.core.performance.C1260h;
            import io.sentry.protocol.C1589a;
            import io.sentry.protocol.C1590a0;
            import io.sentry.protocol.C1594c0;
            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1598e0;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1603h;
            import io.sentry.protocol.C1608j0;
            import io.sentry.protocol.C1614n;
            import io.sentry.protocol.C1620q;
            import io.sentry.protocol.C1625v;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1708g;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.Future;
            import java.util.concurrent.RejectedExecutionException;
            import p000.bh0;
            
            /* JADX INFO: renamed from: io.sentry.android.core.q0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1263q0 implements InterfaceC1388c0 {

                /* JADX INFO: renamed from: a */
                public final Context f10286a;

                /* JADX INFO: renamed from: b */
                public final C1248o0 f10287b;

                /* JADX INFO: renamed from: c */
                public final SentryAndroidOptions f10288c;

                /* JADX INFO: renamed from: d */
                public final Future f10289d;

                /* JADX INFO: renamed from: e */
                public final C1708g f10290e = new C1708g(new C1697u2(15));

                public C1263q0(Context context, C1248o0 c1248o0, SentryAndroidOptions sentryAndroidOptions) {
                    Future futureSubmit;
/* 18 */            Context applicationContext = context.getApplicationContext();
/* 25 */            this.f10286a = applicationContext != null ? applicationContext : context;
/* 27 */            this.f10287b = c1248o0;
/* 29 */            this.f10288c = sentryAndroidOptions;
/* 36 */            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC1251p0());
                    try {
/* 47 */                futureSubmit = executorServiceNewSingleThreadExecutor.submit(new bh0(8, this, sentryAndroidOptions));
                    } catch (RejectedExecutionException e) {
/* 61 */                sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.WARNING, "Device info caching task rejected.", e);
/* 64 */                futureSubmit = null;
                    }
/* 65 */            this.f10289d = futureSubmit;
/* 67 */            executorServiceNewSingleThreadExecutor.shutdown();
                }

                /* JADX INFO: renamed from: a */
                public final void m4923a(AbstractC1635q4 abstractC1635q4, C1486i0 c1486i0) {
                    PackageInfo packageInfo;
                    Boolean bool;
/* 3 */             C1589a c1589aMo5308d = abstractC1635q4.f11517b.mo5308d();
/* 7 */             if (c1589aMo5308d == null) {
/* 11 */                c1589aMo5308d = new C1589a();
                    }
/* 24 */            c1589aMo5308d.f11246e = (String) AbstractC1245n0.f10219c.m1157c(this.f10286a);
/* 32 */            C1260h c1260hM4911b = C1259g.m4907c().m4911b(this.f10288c);
/* 40 */            C1272t0 c1272t0 = null;
/* 41 */            if (c1260hM4911b.m4918d()) {
/* 43 */                C1644r5 c1644r5M4916b = c1260hM4911b.m4916b();
/* 66 */                c1589aMo5308d.f11243b = c1644r5M4916b == null ? null : new Date((long) (c1644r5M4916b.f11575a / 1000000.0d));
                    }
/* 72 */            if (!AbstractC1704c.m5455j(c1486i0) && c1589aMo5308d.f11238V == null && (bool = C1191g0.f10017e.f10021d) != null) {
/* 94 */                c1589aMo5308d.f11238V = Boolean.valueOf(!bool.booleanValue());
                    }
/* 96 */            Context context = this.f10286a;
/* 98 */            SentryAndroidOptions sentryAndroidOptions = this.f10288c;
/* 100 */           ILogger logger = sentryAndroidOptions.getLogger();
/* 104 */           C1248o0 c1248o0 = this.f10287b;
                    try {
/* 106 */               c1248o0.getClass();
/* 146 */               packageInfo = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                    } catch (Throwable th) {
/* 155 */               logger.mo4671d(EnumC1553m5.ERROR, "Error getting package info.", th);
/* 158 */               packageInfo = null;
                    }
/* 159 */           if (packageInfo != null) {
/* 161 */               String strM4881i = AbstractC1245n0.m4881i(packageInfo, c1248o0);
/* 167 */               if (abstractC1635q4.f11512W == null) {
/* 169 */                   abstractC1635q4.f11512W = strM4881i;
                        }
/* 171 */               Future future = this.f10289d;
/* 176 */               if (future != null) {
                            try {
/* 182 */                       c1272t0 = (C1272t0) future.get();
                            } catch (Throwable th2) {
/* 193 */                       sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to retrieve device info", th2);
                            }
                        } else {
/* 205 */                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Failed to retrieve device info", new Object[0]);
                        }
/* 210 */               c1589aMo5308d.f11242a = packageInfo.packageName;
/* 214 */               c1589aMo5308d.f11247f = packageInfo.versionName;
/* 220 */               c1589aMo5308d.f11248i = AbstractC1245n0.m4881i(packageInfo, c1248o0);
/* 224 */               HashMap map = new HashMap();
/* 227 */               String[] strArr = packageInfo.requestedPermissions;
/* 229 */               int[] iArr = packageInfo.requestedPermissionsFlags;
/* 231 */               if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
/* 242 */                   for (int i = 0; i < strArr.length; i++) {
/* 244 */                       String str = strArr[i];
/* 269 */                       map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
                            }
                        }
/* 275 */               c1589aMo5308d.f11249v = map;
/* 277 */               if (c1272t0 != null) {
                            try {
/* 279 */                       C1242m0 c1242m0 = c1272t0.f10331f;
/* 281 */                       if (c1242m0 != null) {
/* 289 */                           c1589aMo5308d.f11239W = Boolean.valueOf(c1242m0.f10215a);
/* 293 */                           String[] strArr2 = (String[]) c1242m0.f10216b;
/* 295 */                           if (strArr2 != null) {
/* 301 */                               c1589aMo5308d.f11240X = Arrays.asList(strArr2);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
/* 305 */           abstractC1635q4.f11517b.mo5317m(c1589aMo5308d);
                }

                /* JADX INFO: renamed from: b */
                public final void m4924b(AbstractC1635q4 abstractC1635q4, boolean z, boolean z2) {
/* 1 */             C1608j0 c1608j0 = abstractC1635q4.f11524w;
/* 3 */             if (c1608j0 == null) {
/* 7 */                 c1608j0 = new C1608j0();
/* 10 */                abstractC1635q4.f11524w = c1608j0;
                    }
/* 14 */            if (c1608j0.f11362b == null) {
/* 22 */                c1608j0.f11362b = AbstractC1287y0.m4963a(this.f10286a);
                    }
/* 24 */            String str = c1608j0.f11364d;
/* 26 */            SentryAndroidOptions sentryAndroidOptions = this.f10288c;
/* 28 */            if (str == null && sentryAndroidOptions.isSendDefaultPii()) {
/* 38 */                c1608j0.f11364d = "{{auto}}";
                    }
/* 40 */            C1597e c1597e = abstractC1635q4.f11517b;
/* 42 */            C1603h c1603hMo5309e = c1597e.mo5309e();
/* 48 */            Future future = this.f10289d;
/* 51 */            if (c1603hMo5309e == null) {
/* 53 */                if (future != null) {
                            try {
/* 65 */                        c1597e.mo5319o(((C1272t0) future.get()).m4940a(z, z2));
                            } catch (Throwable th) {
/* 76 */                        sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to retrieve device info", th);
                            }
                        } else {
/* 88 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Failed to retrieve device info", new Object[0]);
                        }
/* 91 */                C1620q c1620qMo5311g = c1597e.mo5311g();
/* 95 */                if (future != null) {
                            try {
/* 105 */                       c1597e.mo5322r(((C1272t0) future.get()).f10332g);
                            } catch (Throwable th2) {
/* 118 */                       sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to retrieve os system", th2);
                            }
                        } else {
/* 130 */                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Failed to retrieve device info", new Object[0]);
                        }
/* 133 */               if (c1620qMo5311g != null) {
/* 135 */                   String str2 = c1620qMo5311g.f11436a;
/* 172 */                   c1597e.mo5315k(c1620qMo5311g, (str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT));
                        }
                    }
/* 175 */           if (future == null) {
/* 271 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Failed to retrieve device info", new Object[0]);
/* 274 */               return;
                    }
                    try {
/* 183 */               C1242m0 c1242m0 = ((C1272t0) future.get()).f10330e;
/* 185 */               if (c1242m0 != null) {
/* 189 */                   HashMap map = new HashMap();
/* 200 */                   map.put("isSideLoaded", String.valueOf(c1242m0.f10215a));
/* 205 */                   String str3 = (String) c1242m0.f10216b;
/* 207 */                   if (str3 != null) {
/* 211 */                       map.put("installerStore", str3);
                            }
/* 226 */                   for (Map.Entry entry : map.entrySet()) {
/* 246 */                       abstractC1635q4.m5382b((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                    } catch (Throwable th3) {
/* 259 */               sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting side loaded info.", th3);
                    }
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: c */
                public final C1576o6 mo4925c(C1576o6 c1576o6, C1486i0 c1486i0) {
/* 1 */             boolean zM4926d = m4926d(c1576o6, c1486i0);
/* 5 */             if (zM4926d) {
/* 7 */                 m4923a(c1576o6, c1486i0);
                    }
/* 11 */            m4924b(c1576o6, false, zM4926d);
/* 14 */            return c1576o6;
                }

                /* JADX INFO: renamed from: d */
                public final boolean m4926d(AbstractC1635q4 abstractC1635q4, C1486i0 c1486i0) {
/* 5 */             if (AbstractC1704c.m5463r(c1486i0)) {
/* 7 */                 return true;
                    }
/* 25 */            this.f10288c.getLogger().mo4672k(EnumC1553m5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC1635q4.f11516a);
/* 28 */            return false;
                }

                /* JADX WARN: Code duplicated, block: B:14:0x0047  */
                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: f */
                public final C1393c5 mo4754f(C1393c5 c1393c5, C1486i0 c1486i0) {
                    C1594c0 c1594c0;
                    List list;
                    boolean z;
/* 1 */             boolean zM4926d = m4926d(c1393c5, c1486i0);
/* 6 */             if (zM4926d) {
/* 8 */                 m4923a(c1393c5, c1486i0);
/* 15 */                if (c1393c5.m5108e() != null) {
/* 17 */                    boolean zM5455j = AbstractC1704c.m5455j(c1486i0);
/* 33 */                    for (C1598e0 c1598e0 : c1393c5.m5108e()) {
/* 43 */                        C1218e.f10157a.getClass();
/* 46 */                        Long l = c1598e0.f11298a;
/* 48 */                        if (l == null) {
/* 72 */                            z = false;
                                } else if (C1218e.m4839d(Looper.getMainLooper().getThread()) == l.longValue()) {
/* 70 */                            z = true;
                                } else {
/* 72 */                            z = false;
                                }
/* 75 */                        if (c1598e0.f11303f == null) {
/* 81 */                            c1598e0.f11303f = Boolean.valueOf(z);
                                }
/* 83 */                        if (!zM5455j && c1598e0.f11305v == null) {
/* 93 */                            c1598e0.f11305v = Boolean.valueOf(z);
                                }
                            }
                        }
                    }
/* 96 */            m4924b(c1393c5, true, zM4926d);
/* 99 */            ArrayList arrayListM5107d = c1393c5.m5107d();
/* 103 */           if (arrayListM5107d != null && arrayListM5107d.size() > 1) {
/* 120 */               C1625v c1625v = (C1625v) arrayListM5107d.get(arrayListM5107d.size() - 1);
/* 130 */               if ("java.lang".equals(c1625v.f11473c) && (c1594c0 = c1625v.f11475e) != null && (list = c1594c0.f11285a) != null) {
/* 140 */                   Iterator it = list.iterator();
/* 148 */                   while (it.hasNext()) {
/* 164 */                       if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((C1590a0) it.next()).f11267f)) {
/* 166 */                           Collections.reverse(arrayListM5107d);
                                    break;
                                }
                            }
                        }
                    }
/* 169 */           return c1393c5;
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: g */
                public final C1600f0 mo4755g(C1600f0 c1600f0, C1486i0 c1486i0) {
/* 1 */             boolean zM4926d = m4926d(c1600f0, c1486i0);
/* 5 */             if (zM4926d) {
/* 7 */                 m4923a(c1600f0, c1486i0);
                    }
/* 11 */            m4924b(c1600f0, false, zM4926d);
/* 14 */            return c1600f0;
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: h */
                public final C1575o5 mo4927h(C1575o5 c1575o5) {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f10288c;
                    try {
/* 7 */                 EnumC1574o4 enumC1574o4 = EnumC1574o4.STRING;
/* 14 */                c1575o5.m5369a("device.brand", new C1614n(enumC1574o4, Build.BRAND));
/* 30 */                c1575o5.m5369a("device.model", new C1614n(enumC1574o4.apiName(), Build.MODEL));
/* 50 */                c1575o5.m5369a("device.family", new C1614n(enumC1574o4.apiName(), this.f10290e.m5471a()));
                    } catch (Throwable th) {
/* 63 */                sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to retrieve device info", th);
                    }
                    try {
/* 70 */                EnumC1574o4 enumC1574o5 = EnumC1574o4.STRING;
/* 77 */                c1575o5.m5369a("os.name", new C1614n(enumC1574o5, "Android"));
/* 93 */                c1575o5.m5369a("os.version", new C1614n(enumC1574o5.apiName(), Build.VERSION.RELEASE));
                    } catch (Throwable th2) {
/* 106 */               sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to retrieve os system", th2);
                    }
/* 109 */           return c1575o5;
                }
            }
