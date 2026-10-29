            package io.sentry.android.core.performance;

            import android.os.SystemClock;
            import io.sentry.C1644r5;
            
            /* JADX INFO: renamed from: io.sentry.android.core.performance.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1260h implements Comparable {

                /* JADX INFO: renamed from: a */
                public String f10281a;

                /* JADX INFO: renamed from: b */
                public long f10282b;

                /* JADX INFO: renamed from: c */
                public long f10283c;

                /* JADX INFO: renamed from: d */
                public long f10284d;

                /* JADX INFO: renamed from: a */
                public final long m4915a() {
/* 5 */             if (m4919e()) {
/* 11 */                return this.f10284d - this.f10283c;
                    }
/* 13 */            return 0L;
                }

                /* JADX INFO: renamed from: b */
                public final C1644r5 m4916b() {
/* 5 */             if (m4918d()) {
/* 15 */                return new C1644r5(this.f10282b * 1000000);
                    }
/* 19 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public final boolean m4917c() {
                    return this.f10284d == 0;
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 7 */             return Long.compare(this.f10282b, ((C1260h) obj).f10282b);
                }

                /* JADX INFO: renamed from: d */
                public final boolean m4918d() {
                    return this.f10283c != 0;
                }

                /* JADX INFO: renamed from: e */
                public final boolean m4919e() {
                    return this.f10284d != 0;
                }

                /* JADX INFO: renamed from: f */
                public final void m4920f(long j) {
/* 1 */             this.f10283c = j;
/* 15 */            this.f10282b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f10283c);
                }
            }
