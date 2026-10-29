            package io.sentry.android.core;

            import android.app.ActivityManager;
            import android.app.ApplicationExitInfo;
            import android.content.Context;
            import com.appsflyer.internal.AbstractC0303o;
            import io.sentry.C1393c5;
            import io.sentry.C1469h4;
            import io.sentry.C1486i0;
            import io.sentry.C1532l;
            import io.sentry.EnumC1553m5;
            import io.sentry.cache.C1398c;
            import io.sentry.cache.InterfaceC1399d;
            import io.sentry.hints.AbstractC1475c;
            import io.sentry.protocol.C1626w;
            import io.sentry.transport.C1678d;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: renamed from: io.sentry.android.core.k0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC1236k0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final Context f10208a;

                /* JADX INFO: renamed from: b */
                public final C1469h4 f10209b;

                /* JADX INFO: renamed from: c */
                public final SentryAndroidOptions f10210c;

                /* JADX INFO: renamed from: d */
                public final InterfaceC1233j0 f10211d;

                /* JADX INFO: renamed from: e */
                public final long f10212e;

                public RunnableC1236k0(Context context, SentryAndroidOptions sentryAndroidOptions, C1678d c1678d, InterfaceC1233j0 interfaceC1233j0) {
/* 4 */             Context applicationContext = context.getApplicationContext();
/* 11 */            this.f10208a = applicationContext != null ? applicationContext : context;
/* 15 */            this.f10209b = C1469h4.f10976a;
/* 17 */            this.f10210c = sentryAndroidOptions;
/* 19 */            this.f10211d = interfaceC1233j0;
/* 21 */            c1678d.getClass();
/* 34 */            this.f10212e = System.currentTimeMillis() - 7862400000L;
                }

                /* JADX INFO: renamed from: a */
                public final void m4857a(ApplicationExitInfo applicationExitInfo, boolean z) {
/* 1 */             InterfaceC1233j0 interfaceC1233j0 = this.f10211d;
/* 3 */             C1532l c1532lMo4855w = interfaceC1233j0.mo4855w(applicationExitInfo, z);
/* 7 */             if (c1532lMo4855w == null) {
/* 65 */                return;
                    }
/* 12 */            C1393c5 c1393c5 = (C1393c5) c1532lMo4855w.f11100b;
/* 30 */            if (this.f10209b.mo5080B(c1393c5, (C1486i0) c1532lMo4855w.f11101c).equals(C1626w.f11478b) || ((AbstractC1475c) c1532lMo4855w.f11102d).mo4955d()) {
/* 65 */                return;
                    }
/* 62 */            this.f10210c.getLogger().mo4672k(EnumC1553m5.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", interfaceC1233j0.mo4853d(), c1393c5.f11516a);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ApplicationExitInfo applicationExitInfoM1885c;
/* 9 */             ActivityManager activityManager = (ActivityManager) this.f10208a.getSystemService("activity");
/* 12 */            SentryAndroidOptions sentryAndroidOptions = this.f10210c;
/* 14 */            if (activityManager == null) {
/* 26 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
/* 29 */                return;
                    }
/* 3 */             List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
/* 38 */            if (historicalProcessExitReasons.isEmpty()) {
/* 50 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "No records in historical exit reasons.", new Object[0]);
/* 53 */                return;
                    }
/* 54 */            InterfaceC1399d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
/* 60 */            if ((envelopeDiskCache instanceof C1398c) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
/* 68 */                C1398c c1398c = (C1398c) envelopeDiskCache;
/* 74 */                if (!c1398c.m5122f()) {
/* 86 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
/* 91 */                    c1398c.f10803e.countDown();
                        }
                    }
/* 96 */            ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
/* 99 */            InterfaceC1233j0 interfaceC1233j0 = this.f10211d;
/* 101 */           Long lMo4852b = interfaceC1233j0.mo4852b();
/* 105 */           Iterator it = arrayList.iterator();
                    while (true) {
/* 113 */               if (!it.hasNext()) {
/* 137 */                   applicationExitInfoM1885c = null;
                            break;
                        }
/* 119 */               applicationExitInfoM1885c = AbstractC0303o.m1885c(it.next());
/* 131 */               if (applicationExitInfoM1885c.getReason() == interfaceC1233j0.mo4851a()) {
/* 133 */                   it.remove();
                            break;
                        }
                    }
/* 138 */           if (applicationExitInfoM1885c == null) {
/* 156 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "No %ss have been found in the historical exit reasons list.", interfaceC1233j0.mo4853d());
/* 159 */               return;
                    }
/* 1 */             long timestamp = applicationExitInfoM1885c.getTimestamp();
/* 164 */           long j = this.f10212e;
/* 168 */           if (timestamp < j) {
/* 186 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Latest %s happened too long ago, returning early.", interfaceC1233j0.mo4853d());
/* 189 */               return;
                    }
/* 190 */           if (lMo4852b != null && applicationExitInfoM1885c.getTimestamp() <= lMo4852b.longValue()) {
/* 220 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Latest %s has already been reported, returning early.", interfaceC1233j0.mo4853d());
/* 223 */               return;
                    }
/* 228 */           if (interfaceC1233j0.mo4854e()) {
/* 230 */               Collections.reverse(arrayList);
/* 233 */               Iterator it2 = arrayList.iterator();
/* 241 */               while (it2.hasNext()) {
/* 247 */                   ApplicationExitInfo applicationExitInfoM1885c2 = AbstractC0303o.m1885c(it2.next());
/* 259 */                   if (applicationExitInfoM1885c2.getReason() == interfaceC1233j0.mo4851a()) {
/* 267 */                       if (applicationExitInfoM1885c2.getTimestamp() < j) {
/* 285 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "%s happened too long ago %s.", interfaceC1233j0.mo4853d(), applicationExitInfoM1885c2);
                                } else if (lMo4852b == null || applicationExitInfoM1885c2.getTimestamp() > lMo4852b.longValue()) {
/* 323 */                           m4857a(applicationExitInfoM1885c2, false);
                                } else {
/* 319 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "%s has already been reported %s.", interfaceC1233j0.mo4853d(), applicationExitInfoM1885c2);
                                }
                            }
                        }
                    }
/* 328 */           m4857a(applicationExitInfoM1885c, true);
                }
            }
