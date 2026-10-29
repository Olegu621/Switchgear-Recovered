            package io.sentry.android.core;

            import android.content.Context;
            import android.os.Build;
            import io.sentry.AbstractC1552m4;
            import io.sentry.C1554m6;
            import io.sentry.C1642r3;
            import io.sentry.C1663s3;
            import io.sentry.C1748x6;
            import io.sentry.CallableC1515j0;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1549m1;
            import io.sentry.InterfaceC1562n1;
            import io.sentry.android.core.internal.util.C1231r;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import io.sentry.util.InterfaceC1707f;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.Future;
            import java.util.concurrent.atomic.AtomicBoolean;
            import okhttp3.HttpUrl;
            import p000.C2261un;
            
            /* JADX INFO: renamed from: io.sentry.android.core.v */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1277v implements InterfaceC1562n1 {

                /* JADX INFO: renamed from: U */
                public final C1231r f10353U;

                /* JADX INFO: renamed from: V */
                public volatile C1663s3 f10354V;

                /* JADX INFO: renamed from: X */
                public long f10356X;

                /* JADX INFO: renamed from: Y */
                public long f10357Y;

                /* JADX INFO: renamed from: Z */
                public Date f10358Z;

                /* JADX INFO: renamed from: a */
                public final Context f10359a;

                /* JADX INFO: renamed from: b */
                public final ILogger f10361b;

                /* JADX INFO: renamed from: c */
                public final String f10362c;

                /* JADX INFO: renamed from: d */
                public final boolean f10363d;

                /* JADX INFO: renamed from: e */
                public final int f10364e;

                /* JADX INFO: renamed from: f */
                public final InterfaceC1707f f10365f;

                /* JADX INFO: renamed from: i */
                public final C1248o0 f10366i;

                /* JADX INFO: renamed from: v */
                public boolean f10367v = false;

                /* JADX INFO: renamed from: w */
                public final AtomicBoolean f10368w = new AtomicBoolean(false);

                /* JADX INFO: renamed from: W */
                public volatile C1271t f10355W = null;

                /* JADX INFO: renamed from: a0 */
                public final C1702a f10360a0 = new C1702a();

                public C1277v(Context context, C1248o0 c1248o0, C1231r c1231r, ILogger iLogger, String str, boolean z, int i, InterfaceC1707f interfaceC1707f) {
/* 24 */            Context applicationContext = context.getApplicationContext();
/* 31 */            this.f10359a = applicationContext != null ? applicationContext : context;
/* 35 */            AbstractC1704c.m5462q(iLogger, "ILogger is required");
/* 38 */            this.f10361b = iLogger;
/* 40 */            this.f10353U = c1231r;
/* 44 */            AbstractC1704c.m5462q(c1248o0, "The BuildInfoProvider is required.");
/* 47 */            this.f10366i = c1248o0;
/* 49 */            this.f10362c = str;
/* 51 */            this.f10363d = z;
/* 53 */            this.f10364e = i;
/* 55 */            this.f10365f = interfaceC1707f;
/* 62 */            this.f10358Z = new Date();
                }

                /* JADX INFO: renamed from: a */
                public final C1642r3 m4949a(String str, String str2, String str3, boolean z, List list, C1554m6 c1554m6) {
/* 11 */            this.f10366i.getClass();
/* 14 */            int i = Build.VERSION.SDK_INT;
/* 19 */            if (this.f10355W != null) {
/* 22 */                C1702a c1702a = this.f10360a0;
/* 24 */                c1702a.m5443c();
                        try {
/* 27 */                    C1663s3 c1663s3 = this.f10354V;
/* 29 */                    if (c1663s3 == null || !c1663s3.f11641a.equals(str2)) {
/* 319 */                       this.f10361b.mo4672k(EnumC1553m5.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
/* 322 */                       c1702a.close();
/* 18 */                        return null;
                            }
/* 45 */                    this.f10354V = null;
/* 47 */                    c1702a.close();
/* 60 */                    this.f10361b.mo4672k(EnumC1553m5.DEBUG, "Transaction %s (%s) finished.", str, str3);
/* 68 */                    C1268s c1268sM4934a = this.f10355W.m4934a(list, false);
/* 74 */                    this.f10368w.set(false);
/* 77 */                    if (c1268sM4934a != null) {
/* 84 */                        long j = c1268sM4934a.f10297a - this.f10356X;
/* 89 */                        ArrayList arrayList = new ArrayList(1);
/* 92 */                        arrayList.add(c1663s3);
/* 95 */                        long j2 = c1268sM4934a.f10297a;
/* 100 */                       long j3 = this.f10356X;
/* 106 */                       long j4 = c1268sM4934a.f10299c;
/* 109 */                       long j5 = this.f10357Y;
/* 115 */                       if (c1663s3.f11645e == null) {
/* 123 */                           c1663s3.f11645e = Long.valueOf(j2 - j3);
/* 136 */                           c1663s3.f11644d = Long.valueOf(c1663s3.f11644d.longValue() - j3);
/* 144 */                           c1663s3.f11647i = Long.valueOf(j4 - j5);
/* 158 */                           c1663s3.f11646f = Long.valueOf(c1663s3.f11646f.longValue() - j5);
                                }
/* 176 */                       Long l = c1554m6 instanceof SentryAndroidOptions ? C1272t0.m4938c(this.f10359a, (SentryAndroidOptions) c1554m6).f10333h : null;
/* 189 */                       String string = l != null ? Long.toString(l.longValue()) : "0";
/* 191 */                       String[] strArr = Build.SUPPORTED_ABIS;
/* 197 */                       File file = (File) c1268sM4934a.f10300d;
/* 199 */                       Date date = this.f10358Z;
/* 201 */                       String string2 = Long.toString(j);
/* 207 */                       this.f10366i.getClass();
/* 220 */                       String str4 = (strArr == null || strArr.length <= 0) ? HttpUrl.FRAGMENT_ENCODE_SET : strArr[0];
/* 226 */                       CallableC1515j0 callableC1515j0 = new CallableC1515j0(3);
/* 231 */                       this.f10366i.getClass();
/* 234 */                       String str5 = Build.MANUFACTURER;
/* 238 */                       this.f10366i.getClass();
/* 241 */                       String str6 = Build.MODEL;
/* 245 */                       this.f10366i.getClass();
/* 302 */                       return new C1642r3(file, date, arrayList, str, str2, str3, string2, i, str4, callableC1515j0, str5, str6, Build.VERSION.RELEASE, this.f10366i.m4895a(), string, c1554m6.getProguardUuid(), c1554m6.getRelease(), c1554m6.getEnvironment(), (c1268sM4934a.f10298b || z) ? "timeout" : "normal", (Map) c1268sM4934a.f10301e);
                            }
                        } catch (Throwable th) {
                            try {
/* 326 */                       c1702a.close();
/* 334 */                       throw th;
                            } catch (Throwable th2) {
/* 331 */                       th.addSuppressed(th2);
/* 334 */                       throw th;
                            }
                        }
                    }
/* 18 */            return null;
                }

                @Override // io.sentry.InterfaceC1562n1
                public final void close() {
                    C1277v c1277v;
/* 1 */             C1663s3 c1663s3 = this.f10354V;
/* 3 */             if (c1663s3 != null) {
/* 21 */                c1277v = this;
/* 22 */                c1277v.m4949a(c1663s3.f11643c, c1663s3.f11641a, c1663s3.f11642b, true, null, AbstractC1552m4.m5357b().mo5092l());
                    } else {
/* 26 */                c1277v = this;
                    }
/* 30 */            c1277v.f10368w.set(false);
/* 35 */            if (c1277v.f10355W != null) {
/* 37 */                C1271t c1271t = c1277v.f10355W;
/* 39 */                C1702a c1702a = c1271t.f10323o;
/* 41 */                c1702a.m5443c();
                        try {
/* 44 */                    Future future = c1271t.f10312d;
/* 48 */                    if (future != null) {
/* 50 */                        future.cancel(true);
/* 53 */                        c1271t.f10312d = null;
                            }
/* 61 */                    if (c1271t.f10322n) {
/* 63 */                        c1271t.m4934a(null, true);
                            }
/* 66 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 70 */                        c1702a.close();
/* 78 */                        throw th;
                            } catch (Throwable th2) {
/* 75 */                        th.addSuppressed(th2);
/* 78 */                        throw th;
                            }
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1562n1
                /* JADX INFO: renamed from: e */
                public final void mo4950e(InterfaceC1549m1 interfaceC1549m1) {
/* 7 */             if (this.f10368w.get() && this.f10354V == null) {
/* 13 */                C1702a c1702a = this.f10360a0;
/* 15 */                c1702a.m5443c();
                        try {
/* 24 */                    if (this.f10368w.get() && this.f10354V == null) {
/* 47 */                        this.f10354V = new C1663s3(interfaceC1549m1, Long.valueOf(this.f10356X), Long.valueOf(this.f10357Y));
                            }
/* 52 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 56 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 61 */                        th.addSuppressed(th2);
                            }
/* 64 */                    throw th;
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1562n1
                /* JADX INFO: renamed from: f */
                public final C1642r3 mo4951f(C1748x6 c1748x6, List list, C1554m6 c1554m6) {
/* 23 */            return m4949a(c1748x6.f11822e, c1748x6.f11818a.m5380a(), c1748x6.f11819b.f9804c.f10755a.m5380a(), false, list, c1554m6);
                }

                @Override // io.sentry.InterfaceC1562n1
                public final boolean isRunning() {
/* 3 */             return this.f10368w.get();
                }

                @Override // io.sentry.InterfaceC1562n1
                public final void start() {
                    C2261un c2261unM4936c;
/* 3 */             this.f10366i.getClass();
/* 13 */            if (this.f10368w.getAndSet(true)) {
/* 183 */               return;
                    }
/* 18 */            if (!this.f10367v) {
/* 21 */                this.f10367v = true;
/* 25 */                if (this.f10363d) {
/* 39 */                    String str = this.f10362c;
/* 41 */                    if (str == null) {
/* 51 */                        this.f10361b.mo4672k(EnumC1553m5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                            } else {
/* 55 */                        int i = this.f10364e;
/* 57 */                        if (i <= 0) {
/* 73 */                            this.f10361b.mo4672k(EnumC1553m5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                                } else {
/* 93 */                            this.f10355W = new C1271t(str, 1000000 / i, this.f10353U, this.f10365f, this.f10361b);
                                }
                            }
                        } else {
/* 35 */                    this.f10361b.mo4672k(EnumC1553m5.INFO, "Profiling is disabled in options.", new Object[0]);
                        }
                    }
/* 97 */            if (this.f10355W != null && (c2261unM4936c = this.f10355W.m4936c()) != null) {
/* 160 */               this.f10356X = c2261unM4936c.f17600a;
/* 164 */               this.f10357Y = c2261unM4936c.f17601b;
/* 170 */               this.f10358Z = (Date) c2261unM4936c.f17602c;
/* 180 */               this.f10361b.mo4672k(EnumC1553m5.DEBUG, "Profiler started.", new Object[0]);
/* 183 */               return;
                    }
/* 110 */           if (this.f10355W != null && this.f10355W.f10322n) {
/* 126 */               this.f10361b.mo4672k(EnumC1553m5.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
/* 129 */               return;
                    }
/* 130 */           C1702a c1702a = this.f10360a0;
/* 132 */           c1702a.m5443c();
                    try {
/* 136 */               this.f10354V = null;
/* 138 */               c1702a.close();
/* 143 */               this.f10368w.set(false);
                    } catch (Throwable th) {
                        try {
/* 149 */                   c1702a.close();
/* 157 */                   throw th;
                        } catch (Throwable th2) {
/* 154 */                   th.addSuppressed(th2);
/* 157 */                   throw th;
                        }
                    }
                }
            }
