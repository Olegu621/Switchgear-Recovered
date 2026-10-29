            package io.sentry.android.core;

            import android.os.Debug;
            import android.os.Process;
            import android.os.SystemClock;
            import io.sentry.C1536l3;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1457g1;
            import io.sentry.android.core.internal.util.C1231r;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.profilemeasurements.C1585a;
            import io.sentry.profilemeasurements.C1586b;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import io.sentry.util.InterfaceC1707f;
            import java.io.File;
            import java.util.ArrayDeque;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.Future;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.TimeUnit;
            import p000.C2261un;
            import p000.f72;
            
            /* JADX INFO: renamed from: io.sentry.android.core.t */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1271t {

                /* JADX INFO: renamed from: b */
                public final File f10310b;

                /* JADX INFO: renamed from: c */
                public final int f10311c;

                /* JADX INFO: renamed from: f */
                public String f10314f;

                /* JADX INFO: renamed from: g */
                public final C1231r f10315g;

                /* JADX INFO: renamed from: l */
                public final InterfaceC1707f f10320l;

                /* JADX INFO: renamed from: m */
                public final ILogger f10321m;

                /* JADX INFO: renamed from: a */
                public long f10309a = 0;

                /* JADX INFO: renamed from: d */
                public Future f10312d = null;

                /* JADX INFO: renamed from: e */
                public File f10313e = null;

                /* JADX INFO: renamed from: h */
                public final ArrayDeque f10316h = new ArrayDeque();

                /* JADX INFO: renamed from: i */
                public final ArrayDeque f10317i = new ArrayDeque();

                /* JADX INFO: renamed from: j */
                public final ArrayDeque f10318j = new ArrayDeque();

                /* JADX INFO: renamed from: k */
                public final HashMap f10319k = new HashMap();

                /* JADX INFO: renamed from: n */
                public volatile boolean f10322n = false;

                /* JADX INFO: renamed from: o */
                public final C1702a f10323o = new C1702a();

                public C1271t(String str, int i, C1231r c1231r, InterfaceC1707f interfaceC1707f, ILogger iLogger) {
/* 55 */            AbstractC1704c.m5462q(str, "TracesFilesDirPath is required");
/* 61 */            this.f10310b = new File(str);
/* 63 */            this.f10311c = i;
/* 67 */            AbstractC1704c.m5462q(iLogger, "Logger is required");
/* 70 */            this.f10321m = iLogger;
/* 72 */            this.f10320l = interfaceC1707f;
/* 76 */            AbstractC1704c.m5462q(c1231r, "SentryFrameMetricsCollector is required");
/* 79 */            this.f10315g = c1231r;
                }

                /* JADX INFO: renamed from: a */
                public final C1268s m4934a(List list, boolean z) {
/* 1 */             C1702a c1702a = this.f10323o;
/* 3 */             c1702a.m5443c();
                    try {
/* 10 */                if (!this.f10322n) {
/* 20 */                    this.f10321m.mo4672k(EnumC1553m5.WARNING, "Profiler not running", new Object[0]);
/* 23 */                    c1702a.close();
/* 8 */                     return null;
                        }
                        try {
/* 31 */                    Debug.stopMethodTracing();
                        } catch (Throwable th) {
                            try {
/* 44 */                        this.f10321m.mo4671d(EnumC1553m5.ERROR, "Error while stopping profiling: ", th);
                            } catch (Throwable th2) {
/* 181 */                       this.f10322n = false;
/* 183 */                       throw th2;
                            }
                        }
/* 34 */                this.f10322n = false;
/* 52 */                this.f10315g.m4849b(this.f10314f);
/* 55 */                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
/* 59 */                long elapsedCpuTime = Process.getElapsedCpuTime();
/* 65 */                if (this.f10313e == null) {
/* 75 */                    this.f10321m.mo4672k(EnumC1553m5.ERROR, "Trace file does not exists", new Object[0]);
/* 78 */                    c1702a.close();
/* 8 */                     return null;
                        }
/* 90 */                if (!this.f10317i.isEmpty()) {
/* 103 */                   this.f10319k.put("slow_frame_renders", new C1585a("nanosecond", this.f10317i));
                        }
/* 112 */               if (!this.f10318j.isEmpty()) {
/* 125 */                   this.f10319k.put("frozen_frame_renders", new C1585a("nanosecond", this.f10318j));
                        }
/* 134 */               if (!this.f10316h.isEmpty()) {
/* 149 */                   this.f10319k.put("screen_frame_rates", new C1585a("hz", this.f10316h));
                        }
/* 152 */               m4935b(list);
/* 155 */               Future future = this.f10312d;
/* 157 */               if (future != null) {
/* 160 */                   future.cancel(true);
/* 163 */                   this.f10312d = null;
                        }
/* 172 */               C1268s c1268s = new C1268s(jElapsedRealtimeNanos, elapsedCpuTime, z, this.f10313e, this.f10319k);
/* 175 */               c1702a.close();
/* 178 */               return c1268s;
                    } catch (Throwable th3) {
                        try {
/* 184 */                   c1702a.close();
/* 193 */                   throw th3;
                        } catch (Throwable th4) {
/* 190 */                   th3.addSuppressed(th4);
/* 193 */                   throw th3;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m4935b(List list) {
/* 20 */            long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f10309a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
/* 21 */            if (list != null) {
/* 29 */                ArrayDeque arrayDeque = new ArrayDeque(list.size());
/* 38 */                ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
/* 47 */                ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
                        synchronized (list) {
                            try {
/* 51 */                        Iterator it = list.iterator();
/* 59 */                        while (it.hasNext()) {
/* 65 */                            C1536l3 c1536l3 = (C1536l3) it.next();
/* 67 */                            long j = c1536l3.f11119d;
/* 69 */                            long j2 = j + jElapsedRealtimeNanos;
/* 71 */                            Double d = c1536l3.f11116a;
/* 73 */                            Long l = c1536l3.f11117b;
/* 75 */                            Long l2 = c1536l3.f11118c;
/* 77 */                            if (d != null) {
/* 88 */                                arrayDeque3.add(new C1586b(Long.valueOf(j2), d, j));
                                    }
/* 94 */                            if (l != null) {
/* 105 */                               arrayDeque.add(new C1586b(Long.valueOf(j2), l, j));
                                    }
/* 108 */                           if (l2 != null) {
/* 119 */                               arrayDeque2.add(new C1586b(Long.valueOf(j2), l2, j));
                                    }
                                }
                            } catch (Throwable th) {
/* 186 */                       throw th;
                            }
                        }
/* 128 */               if (!arrayDeque3.isEmpty()) {
/* 141 */                   this.f10319k.put("cpu_usage", new C1585a("percent", arrayDeque3));
                        }
/* 148 */               if (!arrayDeque.isEmpty()) {
/* 161 */                   this.f10319k.put("memory_footprint", new C1585a("byte", arrayDeque));
                        }
/* 168 */               if (arrayDeque2.isEmpty()) {
/* 187 */                   return;
                        }
/* 181 */               this.f10319k.put("memory_native_footprint", new C1585a("byte", arrayDeque2));
                    }
                }

                /* JADX INFO: renamed from: c */
                public final C2261un m4936c() {
/* 3 */             C1702a c1702a = this.f10323o;
/* 5 */             c1702a.m5443c();
                    try {
/* 8 */                 int i = this.f10311c;
/* 11 */                if (i == 0) {
/* 27 */                    this.f10321m.mo4672k(EnumC1553m5.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
/* 30 */                    c1702a.close();
/* 10 */                    return null;
                        }
/* 41 */                if (this.f10322n) {
/* 51 */                    this.f10321m.mo4672k(EnumC1553m5.WARNING, "Profiling has already started...", new Object[0]);
/* 54 */                    c1702a.close();
/* 10 */                    return null;
                        }
/* 73 */                this.f10313e = new File(this.f10310b, AbstractC1417a.m5172j().concat(".trace"));
/* 77 */                this.f10319k.clear();
/* 82 */                this.f10316h.clear();
/* 87 */                this.f10317i.clear();
/* 92 */                this.f10318j.clear();
/* 106 */               this.f10314f = this.f10315g.m4848a(new C1265r(this));
                        try {
/* 108 */                   InterfaceC1707f interfaceC1707f = this.f10320l;
/* 110 */                   if (interfaceC1707f != null) {
/* 131 */                       this.f10312d = ((InterfaceC1457g1) interfaceC1707f.mo4803b()).mo4714b(new f72(this, 19), 30000L);
                            }
                        } catch (RejectedExecutionException e) {
/* 141 */                   this.f10321m.mo4671d(EnumC1553m5.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
                        }
/* 148 */               this.f10309a = SystemClock.elapsedRealtimeNanos();
/* 152 */               Date date = new Date();
/* 155 */               long elapsedCpuTime = Process.getElapsedCpuTime();
                        try {
/* 170 */                   Debug.startMethodTracingSampling(this.f10313e.getPath(), 3000000, this.f10311c);
/* 174 */                   this.f10322n = true;
/* 180 */                   C2261un c2261un = new C2261un(this.f10309a, elapsedCpuTime, date);
/* 183 */                   c1702a.close();
/* 186 */                   return c2261un;
                        } catch (Throwable th) {
/* 188 */                   m4934a(null, false);
/* 197 */                   this.f10321m.mo4671d(EnumC1553m5.ERROR, "Unable to start a profile: ", th);
/* 200 */                   this.f10322n = false;
/* 202 */                   c1702a.close();
/* 10 */                    return null;
                        }
                    } catch (Throwable th2) {
                        try {
/* 206 */                   c1702a.close();
/* 214 */                   throw th2;
                        } catch (Throwable th3) {
/* 211 */                   th2.addSuppressed(th3);
/* 214 */                   throw th2;
                        }
                    }
                }
            }
