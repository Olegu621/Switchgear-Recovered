            package io.sentry.android.core;

            import androidx.core.app.NotificationCompat;
            import io.sentry.C1443f;
            import io.sentry.C1469h4;
            import io.sentry.C1697u2;
            import io.sentry.EnumC1553m5;
            import io.sentry.transport.C1678d;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1708g;
            import java.util.Timer;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.C1918m8;
            import p000.C2357x6;
            
            /* JADX INFO: renamed from: io.sentry.android.core.z0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1289z0 implements InterfaceC1182d0 {

                /* JADX INFO: renamed from: b */
                public final long f10397b;

                /* JADX INFO: renamed from: c */
                public C1918m8 f10398c;

                /* JADX INFO: renamed from: i */
                public final boolean f10402i;

                /* JADX INFO: renamed from: v */
                public final boolean f10403v;

                /* JADX INFO: renamed from: a */
                public final AtomicLong f10396a = new AtomicLong(0);

                /* JADX INFO: renamed from: d */
                public final C1708g f10399d = new C1708g(new C1697u2(16));

                /* JADX INFO: renamed from: e */
                public final C1702a f10400e = new C1702a();

                /* JADX INFO: renamed from: f */
                public final C1469h4 f10401f = C1469h4.f10976a;

                /* JADX INFO: renamed from: w */
                public final C1678d f10404w = C1678d.f11692a;

                public C1289z0(long j, boolean z, boolean z2) {
/* 34 */            this.f10397b = j;
/* 36 */            this.f10402i = z;
/* 38 */            this.f10403v = z2;
                }

                /* JADX INFO: renamed from: a */
                public final void m4964a(String str) {
/* 3 */             if (this.f10403v) {
/* 7 */                 C1443f c1443f = new C1443f();
/* 12 */                c1443f.f10930e = NotificationCompat.CATEGORY_NAVIGATION;
/* 16 */                c1443f.m5209d(str, "state");
/* 21 */                c1443f.f10932i = "app.lifecycle";
/* 25 */                c1443f.f10934w = EnumC1553m5.INFO;
/* 29 */                this.f10401f.mo5089i(c1443f);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m4965b() {
/* 1 */             C1702a c1702a = this.f10400e;
/* 3 */             c1702a.m5443c();
                    try {
/* 6 */                 C1918m8 c1918m8 = this.f10398c;
/* 8 */                 if (c1918m8 != null) {
/* 10 */                    c1918m8.cancel();
/* 14 */                    this.f10398c = null;
                        }
/* 19 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 23 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 28 */                    th.addSuppressed(th2);
                        }
/* 31 */                throw th;
                    }
                }

                @Override // io.sentry.android.core.InterfaceC1182d0
                /* JADX INFO: renamed from: c */
                public final void mo4761c() {
/* 1 */             m4965b();
/* 6 */             this.f10404w.getClass();
/* 9 */             long jCurrentTimeMillis = System.currentTimeMillis();
/* 17 */            C2357x6 c2357x6 = new C2357x6(this, 29);
/* 20 */            C1469h4 c1469h4 = this.f10401f;
/* 22 */            c1469h4.mo5098r(c2357x6);
/* 25 */            AtomicLong atomicLong = this.f10396a;
/* 27 */            long j = atomicLong.get();
/* 35 */            if (j == 0 || j + this.f10397b <= jCurrentTimeMillis) {
/* 46 */                if (this.f10402i) {
/* 48 */                    c1469h4.mo5095o();
                        }
/* 59 */                c1469h4.mo5092l().getReplayController().mo4976n();
                    }
/* 70 */            c1469h4.mo5092l().getReplayController().resume();
/* 73 */            atomicLong.set(jCurrentTimeMillis);
/* 78 */            m4964a("foreground");
                }

                @Override // io.sentry.android.core.InterfaceC1182d0
                /* JADX INFO: renamed from: f */
                public final void mo4762f() {
/* 3 */             this.f10404w.getClass();
/* 12 */            this.f10396a.set(System.currentTimeMillis());
/* 25 */            this.f10401f.mo5092l().getReplayController().pause();
/* 28 */            C1702a c1702a = this.f10400e;
/* 30 */            c1702a.m5443c();
                    try {
/* 33 */                m4965b();
/* 42 */                this.f10398c = new C1918m8(this, 2);
/* 56 */                ((Timer) this.f10399d.m5471a()).schedule(this.f10398c, this.f10397b);
/* 59 */                c1702a.close();
/* 64 */                m4964a("background");
                    } catch (Throwable th) {
                        try {
/* 69 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 74 */                    th.addSuppressed(th2);
                        }
/* 77 */                throw th;
                    }
                }
            }
