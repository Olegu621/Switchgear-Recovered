            package io.sentry.util;

            import io.flutter.embedding.android.KeyboardMap;
            import java.io.Serializable;
            import java.util.concurrent.atomic.AtomicLong;
            
            /* JADX INFO: renamed from: io.sentry.util.l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1713l implements Serializable {

                /* JADX INFO: renamed from: c */
                public static final AtomicLong f11738c = new AtomicLong(System.nanoTime());

                /* JADX INFO: renamed from: a */
                public long f11739a;

                /* JADX INFO: renamed from: b */
                public final long f11740b;

                public C1713l() {
/* 1 */             long jM5478a = m5478a();
/* 16 */            long jM5478a2 = (m5478a() << 1) | 1;
/* 17 */            this.f11740b = jM5478a2;
/* 20 */            this.f11739a = jM5478a2 + jM5478a;
                }

                /* JADX INFO: renamed from: a */
                public static long m5478a() {
                    AtomicLong atomicLong;
                    long j;
                    long j2;
/* 32 */            do {
/* 1 */                 atomicLong = f11738c;
/* 3 */                 j = atomicLong.get();
/* 11 */                long j3 = (j >> 12) ^ j;
/* 16 */                long j4 = j3 ^ (j3 << 25);
/* 27 */                j2 = (j4 ^ (j4 >> 27)) * 2685821657736338717L;
/* 32 */            } while (!atomicLong.compareAndSet(j, j2));
/* 34 */            return j2;
                }

                /* JADX INFO: renamed from: b */
                public final void m5479b(byte[] bArr) {
/* 3 */             for (int i = 0; i < bArr.length; i++) {
/* 15 */                long j = (this.f11739a * 6364136223846793005L) + this.f11740b;
/* 16 */                this.f11739a = j;
/* 37 */                bArr[i] = (byte) ((((j >>> 22) ^ j) >>> ((int) ((j >>> 61) + 22))) >>> 24);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final double m5480c() {
/* 8 */             long j = this.f11739a * 6364136223846793005L;
/* 9 */             long j2 = this.f11740b;
/* 11 */            long j3 = j + j2;
/* 31 */            long j4 = (((j3 >>> 22) ^ j3) >>> ((int) ((j3 >>> 61) + 22))) & KeyboardMap.kValueMask;
/* 33 */            long j5 = (j3 * 6364136223846793005L) + j2;
/* 34 */            this.f11739a = j5;
/* 57 */            return (((j4 >>> 6) << 27) + (((((j5 >>> 22) ^ j5) >>> ((int) ((j5 >>> 61) + 22))) & KeyboardMap.kValueMask) >>> 5)) / 9.007199254740992E15d;
                }
            }
