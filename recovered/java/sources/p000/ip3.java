            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ip3 implements qp3 {

                /* JADX INFO: renamed from: a */
                public final qp3[] f11892a;

                public ip3(qp3... qp3VarArr) {
/* 4 */             this.f11892a = qp3VarArr;
                }

                @Override // p000.qp3
                public final boolean zzb(Class cls) {
/* 4 */             for (int i = 0; i < 2; i++) {
/* 14 */                if (this.f11892a[i].zzb(cls)) {
/* 16 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                @Override // p000.qp3
                public final aq3 zzc(Class cls) {
/* 3 */             for (int i = 0; i < 2; i++) {
/* 7 */                 qp3 qp3Var = this.f11892a[i];
/* 13 */                if (qp3Var.zzb(cls)) {
/* 15 */                    return qp3Var.zzc(cls);
                        }
                    }
/* 33 */            C1951n4.m6866q("No factory is available for message type: ".concat(cls.getName()));
/* 36 */            return null;
                }
            }
