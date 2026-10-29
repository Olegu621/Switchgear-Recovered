            package io.sentry.android.replay.capture;

            import io.sentry.C1554m6;
            import io.sentry.C1697u2;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1567n6;
            import io.sentry.InterfaceC1389c1;
            import io.sentry.RunnableC1526k2;
            import io.sentry.android.core.C1195h1;
            import io.sentry.android.replay.C1326k;
            import io.sentry.android.replay.C1331p;
            import io.sentry.android.replay.C1372x;
            import io.sentry.android.replay.util.RunnableC1354h;
            import io.sentry.protocol.C1626w;
            import io.sentry.transport.InterfaceC1680f;
            import java.util.Date;
            import java.util.concurrent.ScheduledExecutorService;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C1983o;
            import p000.C1996oc;
            import p000.k31;
            import p000.u21;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.capture.n */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1312n extends AbstractC1301c {

                /* JADX INFO: renamed from: t */
                public final C1554m6 f10498t;

                /* JADX INFO: renamed from: u */
                public final InterfaceC1389c1 f10499u;

                /* JADX INFO: renamed from: v */
                public final InterfaceC1680f f10500v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1312n(C1554m6 c1554m6, InterfaceC1389c1 interfaceC1389c1, InterfaceC1680f interfaceC1680f, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
/* 13 */            super(c1554m6, interfaceC1389c1, interfaceC1680f, scheduledExecutorService, scheduledExecutorService2);
/* 1 */             c1554m6.getClass();
/* 4 */             interfaceC1680f.getClass();
/* 7 */             scheduledExecutorService.getClass();
/* 10 */            scheduledExecutorService2.getClass();
/* 16 */            this.f10498t = c1554m6;
/* 18 */            this.f10499u = interfaceC1389c1;
/* 20 */            this.f10500v = interfaceC1680f;
                }

                @Override // io.sentry.android.replay.capture.AbstractC1301c
                /* JADX INFO: renamed from: a */
                public final void mo4985a(boolean z, C1983o c1983o) {
/* 1 */             C1554m6 c1554m6 = this.f10498t;
/* 9 */             if (c1554m6.getSessionReplay().f11536m) {
/* 22 */                c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
                    }
/* 27 */            this.f10464g.set(z);
                }

                @Override // io.sentry.android.replay.capture.AbstractC1301c
                /* JADX INFO: renamed from: b */
                public final AbstractC1301c mo4986b() {
/* 1 */             return this;
                }

                @Override // io.sentry.android.replay.capture.AbstractC1301c
                /* JADX INFO: renamed from: g */
                public final void mo4990g(C1372x c1372x) {
/* 9 */             m5001o("onConfigurationChanged", new C1311m(this, 0));
/* 14 */            u21 u21Var = AbstractC1301c.f10457s[0];
/* 16 */            C1300b c1300b = this.f10466i;
/* 18 */            c1300b.getClass();
/* 21 */            u21Var.getClass();
/* 26 */            Object andSet = c1300b.f10454b.getAndSet(c1372x);
/* 34 */            if (Intrinsics.m6216a(andSet, c1372x)) {
/* 93 */                return;
                    }
/* 41 */            C1299a c1299a = new C1299a(andSet, c1372x, c1300b.f10456d, 1);
/* 44 */            AbstractC1301c abstractC1301c = c1300b.f10455c;
/* 46 */            C1554m6 c1554m6 = abstractC1301c.f10458a;
/* 56 */            if (c1554m6.getThreadChecker().mo4842c()) {
/* 73 */                abstractC1301c.f10462e.submit(new RunnableC1354h(new RunnableC1526k2(c1299a, 4), "CaptureStrategy.runInBackground"));
/* 76 */                return;
                    }
                    try {
/* 77 */                c1299a.invoke();
                    } catch (Throwable th) {
/* 90 */                c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                    }
                }

                @Override // io.sentry.android.replay.capture.AbstractC1301c
                /* JADX INFO: renamed from: h */
                public final void mo4991h(C1331p c1331p) {
/* 28 */            this.f10461d.submit(new RunnableC1354h(new k31(this, c1331p, this.f10500v.mo4838c(), m4989f(), 2), "SessionCaptureStrategy.add_frame"));
                }

                @Override // io.sentry.android.replay.capture.AbstractC1301c
                /* JADX INFO: renamed from: j */
                public final void mo4993j() {
/* 9 */             m5001o("pause", new C1311m(this, 1));
                }

                @Override // io.sentry.android.replay.capture.AbstractC1301c
                /* JADX INFO: renamed from: m */
                public final void mo4996m(int i, C1626w c1626w, EnumC1567n6 enumC1567n6) {
/* 1 */             c1626w.getClass();
/* 4 */             super.mo4996m(i, c1626w, enumC1567n6);
/* 7 */             InterfaceC1389c1 interfaceC1389c1 = this.f10499u;
/* 9 */             if (interfaceC1389c1 != null) {
/* 17 */                interfaceC1389c1.mo5098r(new C1195h1(this, 5));
                    }
                }

                @Override // io.sentry.android.replay.capture.AbstractC1301c
                /* JADX INFO: renamed from: n */
                public final void mo4997n() {
/* 1 */             C1326k c1326k = this.f10465h;
/* 21 */            m5001o("stop", new C1996oc(20, this, c1326k != null ? c1326k.m5015g() : null));
/* 24 */            InterfaceC1389c1 interfaceC1389c1 = this.f10499u;
/* 26 */            if (interfaceC1389c1 != null) {
/* 33 */                interfaceC1389c1.mo5098r(new C1697u2(20));
                    }
/* 36 */            C1326k c1326k2 = this.f10465h;
/* 38 */            if (c1326k2 != null) {
/* 40 */                c1326k2.close();
                    }
/* 47 */            this.f10468k.set(0L);
/* 50 */            m4995l(null);
/* 53 */            C1626w c1626w = C1626w.f11478b;
/* 55 */            c1626w.getClass();
/* 61 */            u21 u21Var = AbstractC1301c.f10457s[3];
/* 63 */            C1300b c1300b = this.f10470m;
/* 65 */            c1300b.getClass();
/* 68 */            u21Var.getClass();
/* 73 */            Object andSet = c1300b.f10454b.getAndSet(c1626w);
/* 81 */            if (Intrinsics.m6216a(andSet, c1626w)) {
/* 140 */               return;
                    }
/* 88 */            C1299a c1299a = new C1299a(andSet, c1626w, c1300b.f10456d, 0);
/* 91 */            AbstractC1301c abstractC1301c = c1300b.f10455c;
/* 93 */            C1554m6 c1554m6 = abstractC1301c.f10458a;
/* 103 */           if (c1554m6.getThreadChecker().mo4842c()) {
/* 120 */               abstractC1301c.f10462e.submit(new RunnableC1354h(new RunnableC1526k2(c1299a, 1), "CaptureStrategy.runInBackground"));
/* 123 */               return;
                    }
                    try {
/* 124 */               c1299a.invoke();
                    } catch (Throwable th) {
/* 137 */               c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                    }
                }

                /* JADX INFO: renamed from: o */
                public final void m5001o(String str, Function1 function1) {
/* 1 */             C1372x c1372xM4989f = m4989f();
/* 5 */             if (c1372xM4989f == null) {
/* 24 */                this.f10498t.getLogger().mo4672k(EnumC1553m5.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
/* 27 */                return;
                    }
/* 30 */            long jMo4838c = this.f10500v.mo4838c();
/* 46 */            Date date = (Date) this.f10467j.mo4392a(this, AbstractC1301c.f10457s[1]);
/* 48 */            if (date == null) {
/* 50 */                return;
                    }
/* 55 */            long time = jMo4838c - date.getTime();
/* 57 */            C1626w c1626wM4987d = m4987d();
/* 82 */            this.f10461d.submit(new RunnableC1354h(new RunnableC1302d(this, time, date, c1626wM4987d, c1372xM4989f, function1, 1), "SessionCaptureStrategy.".concat(str)));
                }
            }
