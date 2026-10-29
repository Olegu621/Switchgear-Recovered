            package io.sentry.android.core;

            import android.os.FileObserver;
            import io.sentry.C1486i0;
            import io.sentry.C1527k3;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.util.AbstractC1704c;
            import java.io.File;
            import p000.AbstractC0886en;
            
            /* JADX INFO: renamed from: io.sentry.android.core.w0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class FileObserverC1281w0 extends FileObserver {

                /* JADX INFO: renamed from: a */
                public final String f10377a;

                /* JADX INFO: renamed from: b */
                public final C1527k3 f10378b;

                /* JADX INFO: renamed from: c */
                public final ILogger f10379c;

                /* JADX INFO: renamed from: d */
                public final long f10380d;

                public FileObserverC1281w0(String str, C1527k3 c1527k3, ILogger iLogger, long j) {
/* 1 */             super(str);
/* 4 */             this.f10377a = str;
/* 6 */             this.f10378b = c1527k3;
/* 10 */            AbstractC1704c.m5462q(iLogger, "Logger is required.");
/* 13 */            this.f10379c = iLogger;
/* 15 */            this.f10380d = j;
                }

                @Override // android.os.FileObserver
                public final void onEvent(int i, String str) {
/* 1 */             if (str == null || i != 8) {
/* 67 */                return;
                    }
/* 8 */             EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 10 */            Integer numValueOf = Integer.valueOf(i);
/* 14 */            String str2 = this.f10377a;
/* 20 */            ILogger iLogger = this.f10379c;
/* 24 */            iLogger.mo4672k(enumC1553m5, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
/* 34 */            C1486i0 c1486i0M5450e = AbstractC1704c.m5450e(new C1278v0(this.f10380d, iLogger));
/* 38 */            StringBuilder sbM3512p = AbstractC0886en.m3512p(str2);
/* 44 */            sbM3512p.append(File.separator);
/* 47 */            sbM3512p.append(str);
/* 50 */            String string = sbM3512p.toString();
/* 54 */            C1527k3 c1527k3 = this.f10378b;
/* 56 */            c1527k3.getClass();
/* 64 */            c1527k3.mo5058b(new File(string), c1486i0M5450e);
                }
            }
