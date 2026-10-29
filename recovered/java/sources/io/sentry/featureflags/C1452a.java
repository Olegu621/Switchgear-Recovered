            package io.sentry.featureflags;

            import io.sentry.protocol.C1607j;
            import io.sentry.util.C1702a;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.CopyOnWriteArrayList;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.featureflags.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public final class C1452a implements InterfaceC1453b {

                /* JADX INFO: renamed from: a */
                public volatile CopyOnWriteArrayList f10943a;

                /* JADX INFO: renamed from: b */
                public final C1702a f10944b;

                public C1452a(C1452a c1452a) {
/* 9 */             this.f10944b = new C1702a();
/* 18 */            this.f10943a = new CopyOnWriteArrayList(c1452a.f10943a);
                }

                @Override // io.sentry.featureflags.InterfaceC1453b
                public final void clear() {
/* 1 */             C1702a c1702a = this.f10944b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 this.f10943a.clear();
/* 11 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 16 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 21 */                    th.addSuppressed(th2);
                        }
/* 24 */                throw th;
                    }
                }

                @Override // io.sentry.featureflags.InterfaceC1453b
                public final InterfaceC1453b clone() {
/* 3 */             return new C1452a(this);
                }

                @Override // io.sentry.featureflags.InterfaceC1453b
                /* JADX INFO: renamed from: h */
                public final C1607j mo5254h() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             Iterator it = this.f10943a.iterator();
/* 16 */            if (it.hasNext()) {
/* 28 */                throw fm0.m3780f(it);
                    }
/* 20 */            return new C1607j(arrayList);
                }

                /* JADX INFO: renamed from: clone, reason: collision with other method in class */
/* 6 */         public final Object m10490clone() {
/* 7 */             return new C1452a(this);
                }

/* 20 */        public C1452a(int i, CopyOnWriteArrayList copyOnWriteArrayList) {
/* 24 */            this.f10944b = new C1702a();
/* 25 */            this.f10943a = copyOnWriteArrayList;
                }

/* 25 */        public C1452a(int i) {
/* 29 */            this.f10944b = new C1702a();
/* 30 */            this.f10943a = new CopyOnWriteArrayList();
                }
            }
