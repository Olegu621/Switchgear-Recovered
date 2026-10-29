            package io.sentry.transport;

            import io.sentry.EnumC1560n;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.util.C1702a;
            import java.io.Closeable;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.Timer;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import p000.C1918m8;
            
            /* JADX INFO: renamed from: io.sentry.transport.p */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1690p implements Closeable {

                /* JADX INFO: renamed from: b */
                public final SentryAndroidOptions f11709b;

                /* JADX INFO: renamed from: c */
                public final ConcurrentHashMap f11710c = new ConcurrentHashMap();

                /* JADX INFO: renamed from: d */
                public final CopyOnWriteArrayList f11711d = new CopyOnWriteArrayList();

                /* JADX INFO: renamed from: e */
                public Timer f11712e = null;

                /* JADX INFO: renamed from: f */
                public final C1702a f11713f = new C1702a();

                /* JADX INFO: renamed from: a */
                public final C1678d f11708a = C1678d.f11692a;

                public C1690p(SentryAndroidOptions sentryAndroidOptions) {
/* 32 */            this.f11709b = sentryAndroidOptions;
                }

                /* JADX INFO: renamed from: c */
                public final void m5427c(EnumC1560n enumC1560n, Date date) {
/* 1 */             ConcurrentHashMap concurrentHashMap = this.f11710c;
/* 7 */             Date date2 = (Date) concurrentHashMap.get(enumC1560n);
/* 9 */             if (date2 == null || date.after(date2)) {
/* 19 */                concurrentHashMap.put(enumC1560n, date);
/* 24 */                Iterator it = this.f11711d.iterator();
/* 32 */                while (it.hasNext()) {
/* 40 */                    ((InterfaceC1689o) it.next()).mo4801k(this);
                        }
/* 44 */                C1702a c1702a = this.f11713f;
/* 46 */                c1702a.m5443c();
                        try {
/* 51 */                    if (this.f11712e == null) {
/* 59 */                        this.f11712e = new Timer(true);
                            }
/* 72 */                    this.f11712e.schedule(new C1918m8(this, 3), date);
/* 75 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 79 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 84 */                        th.addSuppressed(th2);
                            }
/* 87 */                    throw th;
                        }
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             C1702a c1702a = this.f11713f;
/* 3 */             c1702a.m5443c();
                    try {
/* 6 */                 Timer timer = this.f11712e;
/* 8 */                 if (timer != null) {
/* 10 */                    timer.cancel();
/* 14 */                    this.f11712e = null;
                        }
/* 19 */                c1702a.close();
/* 24 */                this.f11711d.clear();
                    } catch (Throwable th) {
                        try {
/* 28 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 33 */                    th.addSuppressed(th2);
                        }
/* 36 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: f */
                public final boolean m5428f(EnumC1560n enumC1560n) {
                    Date date;
/* 5 */             this.f11708a.getClass();
/* 12 */            Date date2 = new Date(System.currentTimeMillis());
/* 15 */            EnumC1560n enumC1560n2 = EnumC1560n.All;
/* 17 */            ConcurrentHashMap concurrentHashMap = this.f11710c;
/* 23 */            Date date3 = (Date) concurrentHashMap.get(enumC1560n2);
/* 26 */            if (date3 != null && !date2.after(date3)) {
/* 25 */                return true;
                    }
/* 41 */            if (EnumC1560n.Unknown.equals(enumC1560n) || (date = (Date) concurrentHashMap.get(enumC1560n)) == null) {
/* 58 */                return false;
                    }
/* 56 */            return !date2.after(date);
                }
            }
