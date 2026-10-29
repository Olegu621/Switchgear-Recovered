            package p000;

            import android.os.Build;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class oc0 extends k50 {

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ C0218cj f14706n;

                public oc0(C0218cj c0218cj) {
/* 4 */             this.f14706n = c0218cj;
                }

                @Override // p000.k50
                /* JADX INFO: renamed from: C */
                public final void mo5990C(Throwable th) {
/* 7 */             ((sc0) this.f14706n.f2931a).m8474d(th);
                }

                @Override // p000.k50
                /* JADX INFO: renamed from: D */
                public final void mo5991D(ra2 ra2Var) {
/* 1 */             C0218cj c0218cj = this.f14706n;
/* 3 */             c0218cj.f2933c = ra2Var;
/* 9 */             ra2 ra2Var2 = (ra2) c0218cj.f2933c;
/* 13 */            sc0 sc0Var = (sc0) c0218cj.f2931a;
/* 37 */            c0218cj.f2932b = new C0875ec(ra2Var2, sc0Var.f16519g, sc0Var.f16521i, Build.VERSION.SDK_INT >= 34 ? yc0.m10143a() : hu0.m4333b0());
/* 41 */            sc0 sc0Var2 = (sc0) c0218cj.f2931a;
/* 45 */            ArrayList arrayList = new ArrayList();
/* 54 */            sc0Var2.f16513a.writeLock().lock();
                    try {
/* 58 */                sc0Var2.f16515c = 1;
/* 62 */                arrayList.addAll(sc0Var2.f16514b);
/* 67 */                sc0Var2.f16514b.clear();
/* 76 */                sc0Var2.f16513a.writeLock().unlock();
/* 89 */                sc0Var2.f16516d.post(new RunnableC2503ym(arrayList, sc0Var2.f16515c, (Throwable) null));
                    } catch (Throwable th) {
/* 100 */               sc0Var2.f16513a.writeLock().unlock();
/* 103 */               throw th;
                    }
                }
            }
