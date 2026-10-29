            package io.sentry.android.core;

            import android.content.Context;
            import android.os.SystemClock;
            import io.sentry.AbstractC1552m4;
            import io.sentry.EnumC1553m5;
            import io.sentry.InterfaceC1389c1;
            import io.sentry.InterfaceC1537l4;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.android.fragment.FragmentLifecycleIntegration;
            import io.sentry.android.timber.SentryTimberIntegration;
            import io.sentry.util.C1702a;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.ds0;
            
            /* JADX INFO: renamed from: io.sentry.android.core.i1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1198i1 {

                /* JADX INFO: renamed from: a */
                public static final long f10067a = SystemClock.uptimeMillis();

                /* JADX INFO: renamed from: b */
                public static final C1702a f10068b = new C1702a();

                /* JADX INFO: renamed from: a */
                public static void m4809a(SentryAndroidOptions sentryAndroidOptions, boolean z, boolean z2) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             ArrayList arrayList2 = new ArrayList();
/* 13 */            ArrayList arrayList3 = new ArrayList();
/* 28 */            for (InterfaceC1661s1 interfaceC1661s1 : sentryAndroidOptions.getIntegrations()) {
/* 36 */                if (z && (interfaceC1661s1 instanceof FragmentLifecycleIntegration)) {
/* 42 */                    arrayList2.add(interfaceC1661s1);
                        }
/* 45 */                if (z2 && (interfaceC1661s1 instanceof SentryTimberIntegration)) {
/* 51 */                    arrayList.add(interfaceC1661s1);
                        }
/* 56 */                if (interfaceC1661s1 instanceof SystemEventsBreadcrumbsIntegration) {
/* 58 */                    arrayList3.add(interfaceC1661s1);
                        }
                    }
/* 68 */            if (arrayList2.size() > 1) {
/* 76 */                for (int i = 0; i < arrayList2.size() - 1; i++) {
/* 88 */                    sentryAndroidOptions.getIntegrations().remove((InterfaceC1661s1) arrayList2.get(i));
                        }
                    }
/* 98 */            if (arrayList.size() > 1) {
/* 106 */               for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
/* 118 */                   sentryAndroidOptions.getIntegrations().remove((InterfaceC1661s1) arrayList.get(i2));
                        }
                    }
/* 128 */           if (arrayList3.size() > 1) {
/* 135 */               for (int i3 = 0; i3 < arrayList3.size() - 1; i3++) {
/* 147 */                   sentryAndroidOptions.getIntegrations().remove((InterfaceC1661s1) arrayList3.get(i3));
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public static void m4810b(Context context, C1274u c1274u, InterfaceC1537l4 interfaceC1537l4) {
                    try {
/* 5 */                 C1702a c1702a = f10068b;
/* 7 */                 c1702a.m5443c();
                        try {
/* 21 */                    AbstractC1552m4.m5358c(new C1274u(6), new C1184e(c1274u, context, interfaceC1537l4));
/* 24 */                    InterfaceC1389c1 interfaceC1389c1M5357b = AbstractC1552m4.m5357b();
/* 32 */                    if (AbstractC1245n0.m4882j()) {
/* 42 */                        if (interfaceC1389c1M5357b.mo5092l().isEnableAutoSessionTracking()) {
/* 47 */                            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
/* 55 */                            interfaceC1389c1M5357b.mo5098r(new C1195h1(atomicBoolean, 0));
/* 62 */                            if (!atomicBoolean.get()) {
/* 64 */                                interfaceC1389c1M5357b.mo5095o();
                                    }
                                }
/* 78 */                        interfaceC1389c1M5357b.mo5092l().getReplayController().mo4976n();
                            }
/* 81 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 93 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 98 */                        th.addSuppressed(th2);
                            }
/* 101 */                   throw th;
                        }
                    } catch (IllegalAccessException e) {
/* 131 */               c1274u.mo4671d(EnumC1553m5.FATAL, "Fatal error during SentryAndroid.init(...)", e);
/* 134 */               ds0.m3198o("Failed to initialize Sentry's SDK", e);
                    } catch (InstantiationException e2) {
/* 122 */               c1274u.mo4671d(EnumC1553m5.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
/* 125 */               ds0.m3198o("Failed to initialize Sentry's SDK", e2);
                    } catch (NoSuchMethodException e3) {
/* 113 */               c1274u.mo4671d(EnumC1553m5.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
/* 116 */               ds0.m3198o("Failed to initialize Sentry's SDK", e3);
                    } catch (InvocationTargetException e4) {
/* 104 */               c1274u.mo4671d(EnumC1553m5.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
/* 107 */               ds0.m3198o("Failed to initialize Sentry's SDK", e4);
                    }
                }
            }
