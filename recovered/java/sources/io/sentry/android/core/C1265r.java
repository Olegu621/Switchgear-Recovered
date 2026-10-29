            package io.sentry.android.core;

            import android.os.SystemClock;
            import io.sentry.android.core.internal.util.InterfaceC1230q;
            import io.sentry.profilemeasurements.C1586b;
            
            /* JADX INFO: renamed from: io.sentry.android.core.r */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1265r implements InterfaceC1230q {

                /* JADX INFO: renamed from: a */
                public float f10293a = 0.0f;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1271t f10294b;

                public C1265r(C1271t c1271t) {
/* 4 */             this.f10294b = c1271t;
                }

                @Override // io.sentry.android.core.internal.util.InterfaceC1230q
                /* JADX INFO: renamed from: b */
                public final void mo4847b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
/* 1 */             long jCurrentTimeMillis = System.currentTimeMillis();
/* 5 */             System.nanoTime();
/* 11 */            long j5 = jCurrentTimeMillis * 1000000;
/* 21 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j2 - System.nanoTime());
/* 22 */            C1271t c1271t = this.f10294b;
/* 26 */            long j6 = jElapsedRealtimeNanos - c1271t.f10309a;
/* 31 */            if (j6 < 0) {
/* 101 */               return;
                    }
/* 34 */            if (z2) {
/* 51 */                c1271t.f10318j.addLast(new C1586b(Long.valueOf(j6), Long.valueOf(j3), j5));
                    } else if (z) {
/* 72 */                c1271t.f10317i.addLast(new C1586b(Long.valueOf(j6), Long.valueOf(j3), j5));
                    }
/* 79 */            if (f != this.f10293a) {
/* 81 */                this.f10293a = f;
/* 98 */                c1271t.f10316h.addLast(new C1586b(Long.valueOf(j6), Float.valueOf(f), j5));
                    }
                }
            }
