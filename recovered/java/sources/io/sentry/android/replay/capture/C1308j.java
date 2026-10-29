            package io.sentry.android.replay.capture;

            import io.sentry.C1486i0;
            import io.sentry.C1576o6;
            import io.sentry.C1745x3;
            import io.sentry.InterfaceC1389c1;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.capture.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1308j extends AbstractC1310l {

                /* JADX INFO: renamed from: a */
                public final C1576o6 f10493a;

                /* JADX INFO: renamed from: b */
                public final C1745x3 f10494b;

                public C1308j(C1576o6 c1576o6, C1745x3 c1745x3) {
/* 4 */             this.f10493a = c1576o6;
/* 6 */             this.f10494b = c1745x3;
                }

                /* JADX INFO: renamed from: a */
                public static void m5000a(C1308j c1308j, InterfaceC1389c1 interfaceC1389c1) {
/* 3 */             C1486i0 c1486i0 = new C1486i0();
/* 6 */             if (interfaceC1389c1 == null) {
/* 18 */                c1308j.getClass();
/* 21 */                return;
                    }
/* 8 */             C1576o6 c1576o6 = c1308j.f10493a;
/* 12 */            c1486i0.f11008h = c1308j.f10494b;
/* 14 */            interfaceC1389c1.mo5101u(c1576o6, c1486i0);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof C1308j)) {
/* 32 */                return false;
                    }
/* 9 */             C1308j c1308j = (C1308j) obj;
                    return this.f10493a.equals(c1308j.f10493a) && this.f10494b.equals(c1308j.f10494b);
                }

                public final int hashCode() {
/* 15 */            return this.f10494b.hashCode() + (this.f10493a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "Created(replay=" + this.f10493a + ", recording=" + this.f10494b + ')';
                }
            }
