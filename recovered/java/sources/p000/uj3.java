            package p000;

            import io.sentry.android.core.AbstractC1245n0;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uj3 extends sq3 {

                /* JADX INFO: renamed from: c */
                public static final AtomicReference f17563c = new AtomicReference();

                /* JADX INFO: renamed from: d */
                public static final AtomicLong f17564d = new AtomicLong();

                /* JADX INFO: renamed from: e */
                public static final ConcurrentLinkedQueue f17565e = new ConcurrentLinkedQueue();

                /* JADX INFO: renamed from: b */
                public volatile sq3 f17566b;

                /* JADX INFO: renamed from: A */
                public static void m9032A() {
                    while (true) {
/* 7 */                 tj3 tj3Var = (tj3) f17565e.poll();
/* 9 */                 if (tj3Var == null) {
/* 51 */                    return;
                        }
/* 13 */                f17564d.getAndDecrement();
/* 16 */                uj3 uj3Var = tj3Var.f17129a;
/* 18 */                sg3 sg3Var = tj3Var.f17130b;
/* 20 */                eh3 eh3Var = sg3Var.f16612c;
/* 22 */                if ((eh3Var != null && Boolean.TRUE.equals(eh3Var.mo3441a0(dh3.f7215f))) || uj3Var.mo8628r(sg3Var.f16610a)) {
/* 47 */                    uj3Var.mo8629t(sg3Var);
                        }
                    }
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: r */
                public final boolean mo8628r(Level level) {
/* 3 */             if (this.f17566b != null) {
/* 7 */                 return this.f17566b.mo8628r(level);
                    }
/* 12 */            return true;
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: t */
                public final void mo8629t(sg3 sg3Var) {
/* 3 */             if (this.f17566b != null) {
/* 7 */                 this.f17566b.mo8629t(sg3Var);
/* 10 */                return;
                    }
/* 21 */            if (f17564d.incrementAndGet() > 20) {
/* 25 */                f17565e.poll();
/* 32 */                AbstractC1245n0.m4889q("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
                    }
/* 42 */            f17565e.offer(new tj3(this, sg3Var));
/* 47 */            if (this.f17566b != null) {
/* 49 */                m9032A();
                    }
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: v */
                public final void mo8630v(RuntimeException runtimeException, sg3 sg3Var) {
/* 3 */             if (this.f17566b != null) {
/* 7 */                 this.f17566b.mo8630v(runtimeException, sg3Var);
                    } else {
/* 15 */                AbstractC1245n0.m4877e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
                    }
                }
            }
