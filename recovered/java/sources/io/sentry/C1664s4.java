            package io.sentry;

            import io.sentry.util.C1702a;
            
            /* JADX INFO: renamed from: io.sentry.s4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1664s4 {

                /* JADX INFO: renamed from: c */
                public static final C1664s4 f11649c = new C1664s4();

                /* JADX INFO: renamed from: a */
                public boolean f11650a;

                /* JADX INFO: renamed from: b */
                public final C1702a f11651b = new C1702a();

                /* JADX INFO: renamed from: a */
                public final void m5403a() {
/* 1 */             C1702a c1702a = this.f11651b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 if (!this.f11650a) {
/* 11 */                    this.f11650a = true;
                        }
/* 16 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 20 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 25 */                    th.addSuppressed(th2);
                        }
/* 28 */                throw th;
                    }
                }
            }
