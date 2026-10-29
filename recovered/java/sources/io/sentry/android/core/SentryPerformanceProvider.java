            package io.sentry.android.core;

            import android.app.Application;
            import android.content.Context;
            import android.content.pm.ProviderInfo;
            import android.net.Uri;
            import android.os.Process;
            import android.os.SystemClock;
            import io.sentry.C1461g5;
            import io.sentry.C1467h2;
            import io.sentry.C1493i7;
            import io.sentry.C1554m6;
            import io.sentry.C1565n4;
            import io.sentry.C1671t3;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.internal.util.C1231r;
            import io.sentry.android.core.performance.C1259g;
            import io.sentry.util.C1702a;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.InputStreamReader;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SentryPerformanceProvider extends AbstractC1275u0 {

                /* JADX INFO: renamed from: e */
                public static final long f9887e = SystemClock.uptimeMillis();

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ int f9888f = 0;

                /* JADX INFO: renamed from: b */
                public Application f9889b;

                /* JADX INFO: renamed from: c */
                public final C1274u f9890c;

                /* JADX INFO: renamed from: d */
                public final C1248o0 f9891d;

                public SentryPerformanceProvider() {
/* 9 */             C1274u c1274u = new C1274u(3);
/* 12 */            this.f9890c = c1274u;
/* 19 */            this.f9891d = new C1248o0(c1274u);
                }

                /* JADX INFO: renamed from: a */
                public final void m4758a(Context context, C1565n4 c1565n4, C1259g c1259g) {
/* 1 */             boolean z = c1565n4.f11176w;
/* 4 */             C1274u c1274u = this.f9890c;
/* 6 */             if (!z) {
/* 14 */                c1274u.mo4672k(EnumC1553m5.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
/* 17 */                return;
                    }
/* 48 */            C1193h c1193h = new C1193h(this.f9891d, new C1231r(context.getApplicationContext(), c1274u, this.f9891d), c1274u, c1565n4.f11172e, c1565n4.f11175v, new C1195h1(new C1461g5(), 1));
/* 52 */            c1259g.f10280w = null;
/* 54 */            c1259g.f10257U = c1193h;
/* 62 */            c1274u.mo4672k(EnumC1553m5.DEBUG, "App start continuous profiling started.", new Object[0]);
/* 65 */            C1554m6 c1554m6Empty = C1554m6.empty();
/* 82 */            c1554m6Empty.setProfileSessionSampleRate(Double.valueOf(c1565n4.f11176w ? 1.0d : 0.0d));
/* 92 */            c1193h.mo4795c(c1565n4.f11166W, new C1493i7(c1554m6Empty));
                }

                @Override // android.content.ContentProvider
                public final void attachInfo(Context context, ProviderInfo providerInfo) {
/* 13 */            if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
/* 21 */                f42.m3656l("An applicationId is required to fulfill the manifest placeholder.");
                    } else {
/* 15 */                super.attachInfo(context, providerInfo);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m4759b(Context context, C1565n4 c1565n4, C1259g c1259g) {
/* 9 */             boolean z = c1565n4.f11170c;
/* 26 */            C1671t3 c1671t3 = new C1671t3(Boolean.valueOf(z), c1565n4.f11171d, (Double) null, Boolean.valueOf(c1565n4.f11168a), c1565n4.f11169b);
/* 29 */            c1259g.f10258V = c1671t3;
/* 35 */            boolean zBooleanValue = ((Boolean) c1671t3.f11670d).booleanValue();
/* 40 */            C1274u c1274u = this.f9890c;
/* 42 */            if (!zBooleanValue || !z) {
/* 108 */               c1274u.mo4672k(EnumC1553m5.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
/* 111 */               return;
                    }
/* 49 */            C1461g5 c1461g5 = new C1461g5();
/* 56 */            C1248o0 c1248o0 = this.f9891d;
/* 81 */            C1277v c1277v = new C1277v(context, c1248o0, new C1231r(context, c1274u, c1248o0), c1274u, c1565n4.f11172e, c1565n4.f11173f, c1565n4.f11175v, new C1195h1(c1461g5, 1));
/* 85 */            c1259g.f10257U = null;
/* 87 */            c1259g.f10280w = c1277v;
/* 95 */            c1274u.mo4672k(EnumC1553m5.DEBUG, "App start profiling started.", new Object[0]);
/* 98 */            c1277v.start();
                }

                @Override // android.content.ContentProvider
                public final String getType(Uri uri) {
/* 1 */             return null;
                }

                @Override // android.content.ContentProvider
                public final boolean onCreate() {
/* 1 */             C1259g.m4908d(this);
/* 4 */             C1259g c1259gM4907c = C1259g.m4907c();
/* 8 */             Context context = getContext();
/* 16 */            c1259gM4907c.f10271e.m4920f(f9887e);
/* 21 */            this.f9891d.getClass();
/* 30 */            c1259gM4907c.f10269d.m4920f(Process.getStartUptimeMillis());
/* 35 */            if (context instanceof Application) {
/* 39 */                this.f9889b = (Application) context;
                    }
/* 41 */            Application application = this.f9889b;
/* 43 */            if (application != null) {
/* 46 */                c1259gM4907c.m4913g(application);
                    }
/* 49 */            Context context2 = getContext();
/* 54 */            C1274u c1274u = this.f9890c;
/* 56 */            if (context2 == null) {
/* 64 */                c1274u.mo4672k(EnumC1553m5.FATAL, "App. Context from ContentProvider is null", new Object[0]);
                    } else {
/* 84 */                File file = new File(new File(context2.getCacheDir(), "sentry"), "app_start_profiling_config");
/* 91 */                if (file.exists() && file.canRead()) {
                            try {
/* 113 */                       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                                try {
/* 131 */                           C1565n4 c1565n4 = (C1565n4) new C1467h2(C1554m6.empty()).mo5064b(bufferedReader, C1565n4.class);
/* 133 */                           if (c1565n4 == null) {
/* 141 */                               c1274u.mo4672k(EnumC1553m5.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                                    } else if (c1565n4.f11174i && c1565n4.f11165V) {
/* 162 */                               m4758a(context2, c1565n4, c1259gM4907c);
                                    } else if (!c1565n4.f11173f) {
/* 176 */                               c1274u.mo4672k(EnumC1553m5.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                                    } else if (c1565n4.f11164U) {
/* 184 */                               m4759b(context2, c1565n4, c1259gM4907c);
                                    }
/* 144 */                           bufferedReader.close();
                                } catch (Throwable th) {
                                    try {
/* 188 */                               bufferedReader.close();
                                    } catch (Throwable th2) {
/* 193 */                               th.addSuppressed(th2);
                                    }
/* 196 */                           throw th;
                                }
                            } catch (FileNotFoundException e) {
/* 209 */                       c1274u.mo4671d(EnumC1553m5.ERROR, "App start profiling config file not found. ", e);
                            } catch (Throwable th3) {
/* 201 */                       c1274u.mo4671d(EnumC1553m5.ERROR, "Error reading app start profiling config file. ", th3);
                            }
                        }
                    }
/* 212 */           C1259g.m4909e(this);
/* 215 */           return true;
                }

                @Override // android.content.ContentProvider
                public final void shutdown() {
/* 1 */             C1702a c1702a = C1259g.f10256l0;
/* 3 */             c1702a.m5443c();
                    try {
/* 10 */                C1277v c1277v = C1259g.m4907c().f10280w;
/* 12 */                if (c1277v != null) {
/* 14 */                    c1277v.close();
                        }
/* 24 */                C1193h c1193h = C1259g.m4907c().f10257U;
/* 26 */                if (c1193h != null) {
/* 29 */                    c1193h.mo4793a(true);
                        }
/* 32 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 36 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 41 */                    th.addSuppressed(th2);
                        }
/* 44 */                throw th;
                    }
                }
            }
