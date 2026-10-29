            package io.sentry.android.core;

            import android.os.SystemClock;
            import android.system.Os;
            import android.system.OsConstants;
            import io.sentry.C1536l3;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1750y0;
            import io.sentry.util.AbstractC1704c;
            import java.io.File;
            import java.io.IOException;
            import java.util.regex.Pattern;
            
            /* JADX INFO: renamed from: io.sentry.android.core.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1196i implements InterfaceC1750y0 {

                /* JADX INFO: renamed from: g */
                public final ILogger f10058g;

                /* JADX INFO: renamed from: a */
                public long f10052a = 0;

                /* JADX INFO: renamed from: b */
                public long f10053b = 0;

                /* JADX INFO: renamed from: c */
                public long f10054c = 1;

                /* JADX INFO: renamed from: d */
                public long f10055d = 1;

                /* JADX INFO: renamed from: e */
                public double f10056e = 1.0E9d;

                /* JADX INFO: renamed from: f */
                public final File f10057f = new File("/proc/self/stat");

                /* JADX INFO: renamed from: h */
                public boolean f10059h = false;

                /* JADX INFO: renamed from: i */
                public final Pattern f10060i = Pattern.compile("[\n\t\r ]");

                public C1196i(ILogger iLogger) {
/* 45 */            AbstractC1704c.m5462q(iLogger, "Logger is required.");
/* 48 */            this.f10058g = iLogger;
                }

                @Override // io.sentry.InterfaceC1750y0
                /* JADX INFO: renamed from: a */
                public final void mo4805a(C1536l3 c1536l3) {
/* 3 */             if (this.f10059h) {
/* 6 */                 long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
/* 12 */                long j = jElapsedRealtimeNanos - this.f10052a;
/* 14 */                this.f10052a = jElapsedRealtimeNanos;
/* 16 */                long jM4806b = m4806b();
/* 22 */                long j2 = jM4806b - this.f10053b;
/* 24 */                this.f10053b = jM4806b;
/* 40 */                c1536l3.f11116a = Double.valueOf(((j2 / j) / this.f10055d) * 100.0d);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final long m4806b() {
                    String strM5461p;
/* 1 */             ILogger iLogger = this.f10058g;
                    try {
/* 5 */                 strM5461p = AbstractC1704c.m5461p(this.f10057f);
                    } catch (IOException e) {
/* 12 */                this.f10059h = false;
/* 18 */                iLogger.mo4671d(EnumC1553m5.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e);
/* 21 */                strM5461p = null;
                    }
/* 24 */            if (strM5461p != null) {
/* 32 */                String[] strArrSplit = this.f10060i.split(strM5461p.trim());
                        try {
/* 75 */                    return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f10056e);
                        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
/* 84 */                    iLogger.mo4671d(EnumC1553m5.ERROR, "Error parsing /proc/self/stat file.", e2);
                        }
                    }
/* 22 */            return 0L;
                }

                @Override // io.sentry.InterfaceC1750y0
                /* JADX INFO: renamed from: c */
                public final void mo4807c() {
/* 2 */             this.f10059h = true;
/* 10 */            this.f10054c = Os.sysconf(OsConstants._SC_CLK_TCK);
/* 18 */            this.f10055d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
/* 29 */            this.f10056e = 1.0E9d / this.f10054c;
/* 35 */            this.f10053b = m4806b();
                }
            }
