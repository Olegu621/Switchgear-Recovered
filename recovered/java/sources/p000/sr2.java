            package p000;

            import com.usercentrics.sdk.p009v2.translation.data.LegalBasisLocalization;
            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sr2 {

                /* JADX INFO: renamed from: a */
                public final C2279v3 f16750a;

                /* JADX INFO: renamed from: b */
                public LegalBasisLocalization f16751b;

                public sr2(C2279v3 c2279v3) {
/* 4 */             this.f16750a = c2279v3;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public final Object m8631a(String str, boolean z, d10 d10Var) {
                    rr2 rr2Var;
/* 3 */             if (d10Var instanceof rr2) {
/* 6 */                 rr2Var = (rr2) d10Var;
/* 8 */                 int i = rr2Var.f16252d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    rr2Var.f16252d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    rr2Var = new rr2(this, d10Var);
                        }
                    } else {
/* 22 */                rr2Var = new rr2(this, d10Var);
                    }
/* 25 */            Object objM9210k = rr2Var.f16250b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = rr2Var.f16252d;
/* 32 */            if (i2 == 0) {
/* 49 */                pg3.m7417A(objM9210k);
/* 52 */                rr2Var.f16249a = this;
/* 54 */                rr2Var.f16252d = 1;
/* 58 */                objM9210k = this.f16750a.m9210k(str, z, rr2Var);
/* 62 */                if (objM9210k == z10Var) {
/* 64 */                    return z10Var;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                this = rr2Var.f16249a;
/* 38 */                pg3.m7417A(objM9210k);
                    }
/* 67 */            this.f16751b = (LegalBasisLocalization) objM9210k;
/* 69 */            return Unit.f12910a;
                }
            }
