            package io.sentry.android.replay.capture;

            import android.view.MotionEvent;
            import io.sentry.C1469h4;
            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1567n6;
            import io.sentry.InterfaceC1389c1;
            import io.sentry.RunnableC1526k2;
            import io.sentry.android.core.C1195h1;
            import io.sentry.android.core.RunnableC1174b0;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.C1326k;
            import io.sentry.android.replay.C1327l;
            import io.sentry.android.replay.C1331p;
            import io.sentry.android.replay.C1372x;
            import io.sentry.android.replay.util.RunnableC1354h;
            import io.sentry.android.replay.util.ScheduledExecutorServiceC1353g;
            import io.sentry.protocol.C1626w;
            import io.sentry.rrweb.AbstractC1647b;
            import io.sentry.transport.C1678d;
            import io.sentry.transport.InterfaceC1680f;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1713l;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.concurrent.ConcurrentLinkedDeque;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C1983o;
            import p000.C1996oc;
            import p000.u21;
            import p000.xe2;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.capture.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1305g extends AbstractC1301c {

                /* JADX INFO: renamed from: t */
                public final C1554m6 f10488t;

                /* JADX INFO: renamed from: u */
                public final InterfaceC1389c1 f10489u;

                /* JADX INFO: renamed from: v */
                public final InterfaceC1680f f10490v;

                /* JADX INFO: renamed from: w */
                public final C1713l f10491w;

                /* JADX INFO: renamed from: x */
                public final ArrayList f10492x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1305g(SentryAndroidOptions sentryAndroidOptions, C1469h4 c1469h4, C1678d c1678d, C1713l c1713l, ScheduledExecutorServiceC1353g scheduledExecutorServiceC1353g, ScheduledExecutorServiceC1353g scheduledExecutorServiceC1353g2) {
/* 22 */            super(sentryAndroidOptions, c1469h4, c1678d, scheduledExecutorServiceC1353g, scheduledExecutorServiceC1353g2);
/* 1 */             sentryAndroidOptions.getClass();
/* 4 */             c1678d.getClass();
/* 7 */             c1713l.getClass();
/* 10 */            scheduledExecutorServiceC1353g.getClass();
/* 13 */            scheduledExecutorServiceC1353g2.getClass();
/* 25 */            this.f10488t = sentryAndroidOptions;
/* 27 */            this.f10489u = c1469h4;
/* 29 */            this.f10490v = c1678d;
/* 31 */            this.f10491w = c1713l;
/* 38 */            this.f10492x = new ArrayList();
                }

                @Override // io.sentry.android.replay.capture.AbstractC1301c
                /* JADX INFO: renamed from: a */
                public final void mo4985a(boolean z, C1983o c1983o) throws Exception {
/* 1 */             C1554m6 c1554m6 = this.f10488t;
/* 7 */             Double d = c1554m6.getSessionReplay().f11528e;
/* 9 */             C1713l c1713l = this.f10491w;
/* 11 */            c1713l.getClass();
/* 15 */            if (d == null || d.doubleValue() < c1713l.m5480c()) {
/* 87 */                c1554m6.getLogger().mo4672k(EnumC1553m5.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
/* 90 */                return;
                    }
/* 29 */            InterfaceC1389c1 interfaceC1389c1 = this.f10489u;
/* 31 */            if (interfaceC1389c1 != null) {
/* 39 */                interfaceC1389c1.mo5098r(new C1195h1(this, 4));
                    }
/* 42 */            if (!z) {
/* 73 */                m4998o("capture_replay", new C1996oc(18, this, c1983o));
                    } else {
/* 47 */                this.f10464g.set(true);
/* 60 */                c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
                    }
                }

                @Override // io.sentry.android.replay.capture.AbstractC1301c
                /* JADX INFO: renamed from: b */
                public final AbstractC1301c mo4986b() {
/* 3 */             boolean z = this.f10464g.get();
/* 8 */             C1554m6 c1554m6 = this.f10488t;
/* 10 */            if (z) {
/* 22 */                c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
/* 25 */                return this;
                    }
/* 36 */            C1312n c1312n = new C1312n(c1554m6, this.f10489u, this.f10490v, this.f10461d, this.f10462e);
/* 39 */            C1372x c1372xM4989f = m4989f();
/* 45 */            u21 u21Var = AbstractC1301c.f10457s[0];
/* 47 */            C1300b c1300b = c1312n.f10466i;
/* 49 */            c1300b.getClass();
/* 52 */            u21Var.getClass();
/* 57 */            Object andSet = c1300b.f10454b.getAndSet(c1372xM4989f);
/* 65 */            if (!Intrinsics.m6216a(andSet, c1372xM4989f)) {
/* 72 */                C1299a c1299a = new C1299a(andSet, c1372xM4989f, c1300b.f10456d, 1);
/* 75 */                AbstractC1301c abstractC1301c = c1300b.f10455c;
/* 77 */                C1554m6 c1554m7 = abstractC1301c.f10458a;
/* 87 */                if (c1554m7.getThreadChecker().mo4842c()) {
/* 104 */                   abstractC1301c.f10462e.submit(new RunnableC1354h(new RunnableC1526k2(c1299a, 4), "CaptureStrategy.runInBackground"));
                        } else {
                            try {
/* 108 */                       c1299a.invoke();
                            } catch (Throwable th) {
/* 121 */                       c1554m7.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                            }
                        }
                    }
/* 134 */           c1312n.mo4996m(m4988e(), m4987d(), EnumC1567n6.BUFFER);
/* 137 */           return c1312n;
                }

                @Override // io.sentry.android.replay.capture.AbstractC1301c
                /* JADX INFO: renamed from: g */
                public final void mo4990g(C1372x c1372x) throws Exception {
/* 9 */             m4998o("configuration_changed", new C1304f(this, 0));
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
/* 21 */            this.f10461d.submit(new RunnableC1354h(new RunnableC1174b0(this, c1331p, this.f10490v.mo4838c()), "BufferCaptureStrategy.add_frame"));
                }

                @Override // io.sentry.android.replay.capture.AbstractC1301c
                /* JADX INFO: renamed from: i */
                public final void mo4992i(MotionEvent motionEvent) {
/* 1 */             super.mo4992i(motionEvent);
/* 18 */            long jMo4838c = this.f10490v.mo4838c() - this.f10488t.getSessionReplay().f11531h;
/* 19 */            ConcurrentLinkedDeque concurrentLinkedDeque = this.f10473p;
/* 21 */            concurrentLinkedDeque.getClass();
/* 24 */            Iterator it = concurrentLinkedDeque.iterator();
/* 28 */            it.getClass();
/* 35 */            while (it.hasNext()) {
/* 47 */                if (((AbstractC1647b) it.next()).f11589b < jMo4838c) {
/* 49 */                    it.remove();
                        }
                    }
                }

                @Override // io.sentry.android.replay.capture.AbstractC1301c
                /* JADX INFO: renamed from: j */
                public final void mo4993j() throws Exception {
/* 9 */             m4998o("pause", new C1304f(this, 1));
                }

                @Override // io.sentry.android.replay.capture.AbstractC1301c
                /* JADX INFO: renamed from: n */
                public final void mo4997n() {
/* 1 */             C1326k c1326k = this.f10465h;
/* 27 */            this.f10461d.submit(new RunnableC1354h(new RunnableC1303e(0, c1326k != null ? c1326k.m5015g() : null, this), "BufferCaptureStrategy.stop"));
/* 30 */            C1326k c1326k2 = this.f10465h;
/* 32 */            if (c1326k2 != null) {
/* 34 */                c1326k2.close();
                    }
/* 41 */            this.f10468k.set(0L);
/* 44 */            m4995l(null);
/* 47 */            C1626w c1626w = C1626w.f11478b;
/* 49 */            c1626w.getClass();
/* 55 */            u21 u21Var = AbstractC1301c.f10457s[3];
/* 57 */            C1300b c1300b = this.f10470m;
/* 59 */            c1300b.getClass();
/* 62 */            u21Var.getClass();
/* 67 */            Object andSet = c1300b.f10454b.getAndSet(c1626w);
/* 75 */            if (Intrinsics.m6216a(andSet, c1626w)) {
/* 133 */               return;
                    }
/* 81 */            C1299a c1299a = new C1299a(andSet, c1626w, c1300b.f10456d, 0);
/* 84 */            AbstractC1301c abstractC1301c = c1300b.f10455c;
/* 86 */            C1554m6 c1554m6 = abstractC1301c.f10458a;
/* 96 */            if (c1554m6.getThreadChecker().mo4842c()) {
/* 113 */               abstractC1301c.f10462e.submit(new RunnableC1354h(new RunnableC1526k2(c1299a, 1), "CaptureStrategy.runInBackground"));
/* 116 */               return;
                    }
                    try {
/* 117 */               c1299a.invoke();
                    } catch (Throwable th) {
/* 130 */               c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:23:0x005c  */
                /* JADX INFO: renamed from: o */
                public final void m4998o(String str, Function1 function1) throws Exception {
                    Date date;
/* 1 */             C1372x c1372xM4989f = m4989f();
/* 5 */             C1554m6 c1554m6 = this.f10488t;
/* 7 */             if (c1372xM4989f == null) {
/* 24 */                c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
/* 27 */                return;
                    }
/* 32 */            long j = c1554m6.getSessionReplay().f11531h;
/* 36 */            long jMo4838c = this.f10490v.mo4838c();
/* 40 */            C1326k c1326k = this.f10465h;
/* 42 */            if (c1326k != null) {
/* 44 */                C1702a c1702a = c1326k.f10557f;
/* 46 */                c1702a.m5443c();
                        try {
/* 55 */                    C1327l c1327l = (C1327l) CollectionsKt.firstOrNull(c1326k.f10560w);
/* 70 */                    Long lValueOf = c1327l != null ? Long.valueOf(c1327l.f10562b) : null;
/* 71 */                    xe2.m9770h(c1702a, null);
/* 74 */                    if (lValueOf != null) {
/* 82 */                        date = new Date(lValueOf.longValue());
                            } else {
/* 97 */                        date = new Date(jMo4838c - j);
                            }
                        } catch (Throwable th) {
                            try {
/* 86 */                        throw th;
                            } catch (Throwable th2) {
/* 89 */                        xe2.m9770h(c1702a, th);
/* 92 */                        throw th2;
                            }
                        }
                    } else {
/* 97 */                date = new Date(jMo4838c - j);
                    }
/* 130 */           this.f10461d.submit(new RunnableC1354h(new RunnableC1302d(this, jMo4838c - date.getTime(), date, m4987d(), c1372xM4989f, function1, 0), "BufferCaptureStrategy.".concat(str)));
                }
            }
