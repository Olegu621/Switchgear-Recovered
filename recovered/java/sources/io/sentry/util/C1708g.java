            package io.sentry.util;
            
            /* JADX INFO: renamed from: io.sentry.util.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1708g {

                /* JADX INFO: renamed from: b */
                public final InterfaceC1707f f11731b;

                /* JADX INFO: renamed from: a */
                public volatile Object f11730a = null;

                /* JADX INFO: renamed from: c */
                public final C1702a f11732c = new C1702a();

                public C1708g(InterfaceC1707f interfaceC1707f) {
/* 14 */            this.f11731b = interfaceC1707f;
                }

                /* JADX INFO: renamed from: a */
                public final Object m5471a() {
/* 3 */             if (this.f11730a == null) {
/* 5 */                 C1702a c1702a = this.f11732c;
/* 7 */                 c1702a.m5443c();
                        try {
/* 12 */                    if (this.f11730a == null) {
/* 20 */                        this.f11730a = this.f11731b.mo4803b();
                            }
/* 25 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 29 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 34 */                        th.addSuppressed(th2);
                            }
/* 37 */                    throw th;
                        }
                    }
/* 38 */            return this.f11730a;
                }

                /* JADX INFO: renamed from: b */
                public final void m5472b(Object obj) {
/* 1 */             C1702a c1702a = this.f11732c;
/* 3 */             c1702a.m5443c();
                    try {
/* 6 */                 this.f11730a = obj;
/* 8 */                 c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 13 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 18 */                    th.addSuppressed(th2);
                        }
/* 21 */                throw th;
                    }
                }
            }
