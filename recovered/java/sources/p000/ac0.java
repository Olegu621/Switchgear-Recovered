            package p000;

            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final class ac0 implements c00 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f172a;

                /* JADX INFO: renamed from: b */
                public Object f173b;

                public /* synthetic */ ac0(Object obj, int i) {
/* 1 */             this.f172a = i;
/* 3 */             this.f173b = obj;
                }

                @Override // p000.c00
                public final void accept(Object obj) {
                    switch (this.f172a) {
                        case 0:
/* 82 */                    ((c00) this.f173b).getClass();
/* 89 */                    ((c00) this.f173b).accept(obj);
/* 92 */                    return;
                        case 1:
/* 60 */                    ol0 ol0Var = (ol0) obj;
/* 62 */                    if (ol0Var == null) {
/* 67 */                        ol0Var = new ol0(-3);
                            }
/* 74 */                    ((C0210cb) this.f173b).m1570D(ol0Var);
/* 77 */                    return;
                        default:
/* 6 */                     ol0 ol0Var2 = (ol0) obj;
                            synchronized (pl0.f15169c) {
                                try {
/* 11 */                            le2 le2Var = pl0.f15170d;
/* 22 */                            ArrayList arrayList = (ArrayList) le2Var.getOrDefault((String) this.f173b, null);
/* 24 */                            if (arrayList == null) {
/* 57 */                                return;
                                    }
/* 34 */                            le2Var.remove((String) this.f173b);
/* 43 */                            for (int i = 0; i < arrayList.size(); i++) {
/* 51 */                                ((c00) arrayList.get(i)).accept(ol0Var2);
                                    }
/* 57 */                            return;
                                } catch (Throwable th) {
/* 59 */                            throw th;
                                }
                            }
                    }
                }
            }
