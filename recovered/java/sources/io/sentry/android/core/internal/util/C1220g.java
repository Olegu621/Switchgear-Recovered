            package io.sentry.android.core.internal.util;

            import android.os.SystemClock;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicLong;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1220g {

                /* JADX INFO: renamed from: a */
                public final long f10162a;

                /* JADX INFO: renamed from: d */
                public final int f10165d;

                /* JADX INFO: renamed from: c */
                public final AtomicInteger f10164c = new AtomicInteger(0);

                /* JADX INFO: renamed from: e */
                public final AtomicLong f10166e = new AtomicLong(0);

                /* JADX INFO: renamed from: b */
                public final C1217d f10163b = C1217d.f10156a;

                public C1220g(int i, long j) {
/* 25 */            this.f10162a = j;
/* 30 */            this.f10165d = i <= 0 ? 1 : i;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m4844a() {
/* 3 */             this.f10163b.getClass();
/* 6 */             long jUptimeMillis = SystemClock.uptimeMillis();
/* 10 */            AtomicLong atomicLong = this.f10166e;
/* 12 */            long j = atomicLong.get();
/* 20 */            AtomicInteger atomicInteger = this.f10164c;
/* 23 */            if (j == 0 || atomicLong.get() + this.f10162a <= jUptimeMillis) {
/* 51 */                atomicInteger.set(0);
/* 54 */                atomicLong.set(jUptimeMillis);
/* 22 */                return false;
                    }
/* 43 */            if (atomicInteger.incrementAndGet() < this.f10165d) {
/* 22 */                return false;
                    }
/* 46 */            atomicInteger.set(0);
/* 49 */            return true;
                }
            }
