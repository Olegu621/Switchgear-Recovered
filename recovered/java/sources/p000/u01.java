            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class u01 extends AbstractC2364xd {

                /* JADX INFO: renamed from: c */
                public final o01 f17322c;

                /* JADX INFO: renamed from: d */
                public qn1 f17323d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ z01 f17324e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ ix0 f17325f;

                public u01(o01 o01Var, z01 z01Var, ix0 ix0Var) {
/* 1 */             this.f17324e = z01Var;
/* 3 */             this.f17325f = ix0Var;
/* 8 */             this.f17322c = o01Var;
                }

                @Override // p000.AbstractC2364xd
                /* JADX INFO: renamed from: a */
                public final void mo8932a(Object obj, Object obj2) {
/* 1 */             s91 s91Var = (s91) obj;
/* 7 */             boolean z = obj2 == null;
/* 8 */             o01 o01Var = this.f17322c;
/* 14 */            ix0 ix0Var = z ? o01Var : this.f17323d;
/* 16 */            if (ix0Var != null) {
/* 18 */                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s91.f16475a;
/* 24 */                while (!atomicReferenceFieldUpdater.compareAndSet(s91Var, this, ix0Var)) {
/* 41 */                    if (atomicReferenceFieldUpdater.get(s91Var) != this) {
/* 43 */                        return;
                            }
                        }
/* 26 */                if (z) {
/* 28 */                    qn1 qn1Var = this.f17323d;
/* 30 */                    qn1Var.getClass();
/* 33 */                    o01Var.m8453g(qn1Var);
                        }
                    }
                }

                @Override // p000.AbstractC2364xd
                /* JADX INFO: renamed from: d */
                public final C2131r4 mo8933d(Object obj) {
/* 11 */            if (this.f17324e.m10260x() == this.f17325f) {
/* 13 */                return null;
                    }
/* 15 */            return b40.f2201b;
                }
            }
