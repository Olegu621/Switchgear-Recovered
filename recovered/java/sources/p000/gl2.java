            package p000;

            import com.usercentrics.tcf.core.model.gvl.Declarations;
            import com.usercentrics.tcf.core.model.gvl.VendorList;
            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gl2 {

                /* JADX INFO: renamed from: a */
                public final k51 f8699a;

                /* JADX INFO: renamed from: b */
                public final C2279v3 f8700b;

                /* JADX INFO: renamed from: c */
                public VendorList f8701c;

                /* JADX INFO: renamed from: d */
                public Declarations f8702d;

                public gl2(k51 k51Var, C2279v3 c2279v3) {
/* 4 */             this.f8699a = k51Var;
/* 6 */             this.f8700b = c2279v3;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public final Object m3971a(String str, d10 d10Var) {
                    el2 el2Var;
/* 3 */             if (d10Var instanceof el2) {
/* 6 */                 el2Var = (el2) d10Var;
/* 8 */                 int i = el2Var.f7782d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    el2Var.f7782d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    el2Var = new el2(this, d10Var);
                        }
                    } else {
/* 22 */                el2Var = new el2(this, d10Var);
                    }
/* 25 */            Object objM9208i = el2Var.f7780b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = el2Var.f7782d;
/* 32 */            if (i2 == 0) {
/* 49 */                pg3.m7417A(objM9208i);
/* 52 */                el2Var.f7779a = this;
/* 54 */                el2Var.f7782d = 1;
/* 58 */                objM9208i = this.f8700b.m9208i(str, el2Var);
/* 62 */                if (objM9208i == z10Var) {
/* 64 */                    return z10Var;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                this = el2Var.f7779a;
/* 38 */                pg3.m7417A(objM9208i);
                    }
/* 67 */            this.f8702d = (Declarations) objM9208i;
/* 69 */            return Unit.f12910a;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: b */
                public final Object m3972b(d10 d10Var) {
                    fl2 fl2Var;
/* 3 */             if (d10Var instanceof fl2) {
/* 6 */                 fl2Var = (fl2) d10Var;
/* 8 */                 int i = fl2Var.f8272d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    fl2Var.f8272d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    fl2Var = new fl2(this, d10Var);
                        }
                    } else {
/* 22 */                fl2Var = new fl2(this, d10Var);
                    }
/* 25 */            Object objM5995k = fl2Var.f8270b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = fl2Var.f8272d;
/* 32 */            if (i2 == 0) {
/* 49 */                pg3.m7417A(objM5995k);
/* 52 */                fl2Var.f8269a = this;
/* 54 */                fl2Var.f8272d = 1;
/* 58 */                objM5995k = this.f8699a.m5995k(fl2Var);
/* 62 */                if (objM5995k == z10Var) {
/* 64 */                    return z10Var;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                this = fl2Var.f8269a;
/* 38 */                pg3.m7417A(objM5995k);
                    }
/* 67 */            this.f8701c = (VendorList) objM5995k;
/* 69 */            return Unit.f12910a;
                }
            }
