            package p000;

            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class ym2 {

                /* JADX INFO: renamed from: a */
                public static final String f19699a;

                /* JADX INFO: renamed from: b */
                public static final long f19700b;

                /* JADX INFO: renamed from: c */
                public static final int f19701c;

                /* JADX INFO: renamed from: d */
                public static final int f19702d;

                /* JADX INFO: renamed from: e */
                public static final long f19703e;

                /* JADX INFO: renamed from: f */
                public static final dc0 f19704f;

                /* JADX INFO: renamed from: g */
                public static final vm2 f19705g;

                /* JADX INFO: renamed from: h */
                public static final vm2 f19706h;

                static {
                    String property;
/* 3 */             int i = ik2.f9695a;
                    try {
/* 5 */                 property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
                    } catch (SecurityException unused) {
/* 10 */                property = null;
                    }
/* 11 */            if (property == null) {
/* 13 */                property = "DefaultDispatcher";
                    }
/* 15 */            f19699a = property;
/* 33 */            f19700b = j13.m5662x("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
/* 35 */            int i2 = ik2.f9695a;
/* 38 */            if (i2 < 2) {
/* 40 */                i2 = 2;
                    }
/* 49 */            f19701c = j13.m5663y(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
/* 61 */            f19702d = j13.m5663y(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
/* 84 */            f19703e = TimeUnit.SECONDS.toNanos(j13.m5662x("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
/* 88 */            f19704f = dc0.f7095V;
/* 96 */            f19705g = new vm2(0);
/* 104 */           f19706h = new vm2(1);
                }
            }
