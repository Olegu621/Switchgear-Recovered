            package com.supercell.titan;

            import android.content.Context;
            import android.os.SystemClock;
            import io.sentry.android.core.AbstractC1198i1;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.C1274u;
            import io.sentry.android.core.performance.C1259g;
            import io.sentry.android.core.performance.C1260h;
            import p000.f42;
            import xhpgvfjuz.ApplicationC2450o;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class TitanApplication extends ApplicationC2450o {

                /* JADX INFO: renamed from: b */
                public static TitanApplication f5937b;

                /* JADX INFO: renamed from: c */
                public static volatile boolean f5938c;
                public static boolean nativeBaseLibrariesLoaded;
                public static boolean nativeLibrariesLoaded;

                /* JADX INFO: renamed from: a */
                public final BackgroundObserver f5939a = new BackgroundObserver(new C0806m());

                public static Context getAppContext() {
/* 1 */             return f5937b;
                }

                public static boolean isInForeground() {
/* 1 */             return f5938c;
                }

                public static void nOnApplicationCreate() {
/* 1 */             GameApp.nOnApplicationCreate();
                }

                public static native void nOnNativeLibrariesLoaded();

                @Override // xhpgvfjuz.ApplicationC2450o, android.app.Application
                public void onCreate() {
                    boolean zLoadLibG;
/* 1 */             C1259g c1259g = C1259g.f10255k0;
/* 3 */             long jUptimeMillis = SystemClock.uptimeMillis();
/* 7 */             C1259g c1259gM4907c = C1259g.m4907c();
/* 11 */            C1260h c1260h = c1259gM4907c.f10273f;
/* 19 */            if (c1260h.f10283c == 0) {
/* 21 */                c1260h.m4920f(jUptimeMillis);
/* 24 */                c1259gM4907c.m4913g(this);
                    }
/* 27 */            super.onCreate();
/* 30 */            f5937b = this;
/* 45 */            AbstractC1198i1.m4810b(this, new C1274u(3), new f42(10));
                    try {
/* 53 */                System.loadLibrary("fmod");
                    } catch (UnsatisfiedLinkError e) {
                        try {
/* 61 */                    System.loadLibrary("fmodL");
                        } catch (UnsatisfiedLinkError e2) {
/* 68 */                    AbstractC1245n0.m4877e("TitanApplication", "UnsatisfiedLinkError loading fmod", e);
/* 73 */                    AbstractC1245n0.m4877e("TitanApplication", "UnsatisfiedLinkError loading fmodL", e2);
/* 76 */                    zLoadLibG = false;
                        }
                    }
/* 56 */            zLoadLibG = true;
/* 77 */            if (zLoadLibG && !(zLoadLibG = LibsSideload.loadLibG(this))) {
                        try {
/* 87 */                    System.loadLibrary("g");
/* 90 */                    zLoadLibG = true;
                        } catch (UnsatisfiedLinkError e3) {
/* 95 */                    AbstractC1245n0.m4877e("TitanApplication", "UnsatisfiedLinkError libg", e3);
                        }
                    }
/* 98 */            if (zLoadLibG) {
/* 50 */                nativeBaseLibrariesLoaded = true;
                    }
/* 110 */           registerActivityLifecycleCallbacks(this.f5939a);
/* 113 */           long jUptimeMillis2 = SystemClock.uptimeMillis();
/* 121 */           C1260h c1260h2 = C1259g.m4907c().f10273f;
/* 127 */           if (c1260h2.m4917c()) {
/* 143 */               c1260h2.f10281a = getClass().getName().concat(".onCreate");
/* 145 */               c1260h2.f10284d = jUptimeMillis2;
                    }
                }
            }
