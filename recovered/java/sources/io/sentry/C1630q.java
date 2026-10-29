            package io.sentry;

            import io.sentry.android.core.C1276u1;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.util.C1702a;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Timer;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.AbstractC0886en;
            import p000.C1918m8;
            import p000.df1;
            
            /* JADX INFO: renamed from: io.sentry.q */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1630q implements InterfaceC1547m {

                /* JADX INFO: renamed from: f */
                public final boolean f11505f;

                /* JADX INFO: renamed from: g */
                public final SentryAndroidOptions f11506g;

                /* JADX INFO: renamed from: a */
                public final C1702a f11500a = new C1702a();

                /* JADX INFO: renamed from: b */
                public volatile Timer f11501b = null;

                /* JADX INFO: renamed from: c */
                public final ConcurrentHashMap f11502c = new ConcurrentHashMap();

                /* JADX INFO: renamed from: h */
                public final AtomicBoolean f11507h = new AtomicBoolean(false);

                /* JADX INFO: renamed from: d */
                public final ArrayList f11503d = new ArrayList();

                /* JADX INFO: renamed from: e */
                public final ArrayList f11504e = new ArrayList();

                public C1630q(SentryAndroidOptions sentryAndroidOptions) {
/* 23 */            boolean z = false;
/* 29 */            this.f11506g = sentryAndroidOptions;
/* 57 */            for (InterfaceC1742x0 interfaceC1742x0 : sentryAndroidOptions.getPerformanceCollectors()) {
/* 67 */                if (interfaceC1742x0 instanceof InterfaceC1750y0) {
/* 74 */                    this.f11503d.add((InterfaceC1750y0) interfaceC1742x0);
                        }
/* 79 */                if (interfaceC1742x0 instanceof C1276u1) {
/* 85 */                    this.f11504e.add((C1276u1) interfaceC1742x0);
                        }
                    }
/* 95 */            if (this.f11503d.isEmpty() && this.f11504e.isEmpty()) {
/* 105 */               z = true;
                    }
/* 106 */           this.f11505f = z;
                }

                @Override // io.sentry.InterfaceC1547m
                /* JADX INFO: renamed from: a */
                public final void mo5349a(String str) {
/* 3 */             if (this.f11505f) {
/* 18 */                this.f11506g.getLogger().mo4672k(EnumC1553m5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
/* 21 */                return;
                    }
/* 28 */            if (!this.f11502c.containsKey(str)) {
/* 38 */                this.f11502c.put(str, new C1577p(this, null));
                    }
/* 48 */            if (this.f11507h.getAndSet(true)) {
/* 115 */               return;
                    }
/* 50 */            C1702a c1702a = this.f11500a;
/* 52 */            c1702a.m5443c();
                    try {
/* 57 */                if (this.f11501b == null) {
/* 64 */                    this.f11501b = new Timer(true);
                        }
/* 79 */                this.f11501b.schedule(new C1918m8(this, 1), 0L);
/* 98 */                this.f11501b.schedule(new df1(this, new ArrayList()), 100L, 100L);
/* 101 */               c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 105 */                   c1702a.close();
/* 114 */                   throw th;
                        } catch (Throwable th2) {
/* 111 */                   th.addSuppressed(th2);
/* 114 */                   throw th;
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1547m
                /* JADX INFO: renamed from: b */
                public final void mo5350b(C1162a7 c1162a7) throws Throwable {
/* 3 */             Iterator it = this.f11504e.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((C1276u1) it.next()).m4947e(c1162a7);
                    }
                }

                @Override // io.sentry.InterfaceC1547m
                /* JADX INFO: renamed from: c */
                public final List mo5351c(String str) {
/* 1 */             ConcurrentHashMap concurrentHashMap = this.f11502c;
/* 7 */             C1577p c1577p = (C1577p) concurrentHashMap.remove(str);
/* 26 */            this.f11506g.getLogger().mo4672k(EnumC1553m5.DEBUG, AbstractC0886en.m3507k("stop collecting performance info for ", str), new Object[0]);
/* 33 */            if (concurrentHashMap.isEmpty()) {
/* 35 */                close();
                    }
/* 38 */            if (c1577p != null) {
/* 40 */                return c1577p.f11220a;
                    }
/* 43 */            return null;
                }

                @Override // io.sentry.InterfaceC1547m
                public final void close() {
/* 14 */            this.f11506g.getLogger().mo4672k(EnumC1553m5.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
/* 19 */            this.f11502c.clear();
/* 24 */            Iterator it = this.f11504e.iterator();
/* 32 */            while (it.hasNext()) {
/* 40 */                ((C1276u1) it.next()).m4946d();
                    }
/* 50 */            if (this.f11507h.getAndSet(false)) {
/* 52 */                C1702a c1702a = this.f11500a;
/* 54 */                c1702a.m5443c();
                        try {
/* 59 */                    if (this.f11501b != null) {
/* 63 */                        this.f11501b.cancel();
/* 67 */                        this.f11501b = null;
                            }
/* 72 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 76 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 81 */                        th.addSuppressed(th2);
                            }
/* 84 */                    throw th;
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1547m
                /* JADX INFO: renamed from: d */
                public final void mo5352d(C1162a7 c1162a7) {
/* 3 */             Iterator it = this.f11504e.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((C1276u1) it.next()).m4948f(c1162a7);
                    }
                }

                @Override // io.sentry.InterfaceC1547m
                /* JADX INFO: renamed from: e */
                public final void mo5353e(C1748x6 c1748x6) {
/* 3 */             if (this.f11505f) {
/* 18 */                this.f11506g.getLogger().mo4672k(EnumC1553m5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
/* 21 */                return;
                    }
/* 24 */            Iterator it = this.f11504e.iterator();
/* 32 */            while (it.hasNext()) {
/* 40 */                ((C1276u1) it.next()).m4948f(c1748x6);
                    }
/* 46 */            String strM5380a = c1748x6.f11818a.m5380a();
/* 50 */            ConcurrentHashMap concurrentHashMap = this.f11502c;
/* 56 */            if (!concurrentHashMap.containsKey(strM5380a)) {
/* 63 */                concurrentHashMap.put(strM5380a, new C1577p(this, c1748x6));
                    }
/* 66 */            mo5349a(strM5380a);
                }

                @Override // io.sentry.InterfaceC1547m
                /* JADX INFO: renamed from: f */
                public final List mo5354f(InterfaceC1549m1 interfaceC1549m1) {
/* 29 */            this.f11506g.getLogger().mo4672k(EnumC1553m5.DEBUG, "stop collecting performance info for transactions %s (%s)", interfaceC1549m1.getName(), interfaceC1549m1.mo4737s().f10755a.m5380a());
/* 34 */            Iterator it = this.f11504e.iterator();
/* 42 */            while (it.hasNext()) {
/* 50 */                ((C1276u1) it.next()).m4947e(interfaceC1549m1);
                    }
/* 62 */            return mo5351c(interfaceC1549m1.mo5247g().m5380a());
                }
            }
