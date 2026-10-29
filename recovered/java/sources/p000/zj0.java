            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zj0 extends ak0 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f20167e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ dk0 f20168f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ zj0(dk0 dk0Var, int i) {
/* 5 */             super(dk0Var);
/* 1 */             this.f20167e = i;
/* 3 */             this.f20168f = dk0Var;
                }

                @Override // p000.ak0
                /* JADX INFO: renamed from: a */
                public final float mo298a() {
                    float f;
                    float f2;
/* 1 */             int i = this.f20167e;
/* 3 */             dk0 dk0Var = this.f20168f;
                    switch (i) {
                        case 0:
/* 17 */                    f = dk0Var.f2474h;
/* 19 */                    f2 = dk0Var.f2475i;
                            break;
                        case 1:
/* 11 */                    f = dk0Var.f2474h;
/* 13 */                    f2 = dk0Var.f2476j;
                            break;
                        default:
/* 8 */                     return dk0Var.f2474h;
                    }
/* 15 */            return f + f2;
                }
            }
