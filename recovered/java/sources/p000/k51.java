            package p000;

            import com.usercentrics.sdk.p009v2.language.data.LanguageData;
            import com.usercentrics.sdk.p009v2.location.data.UsercentricsLocation;
            import com.usercentrics.sdk.p009v2.ruleset.data.RuleSet;
            import com.usercentrics.tcf.core.model.gvl.VendorList;
            import java.io.Serializable;
            import java.util.List;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public final class k51 extends en1 {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f12599d = 1;

                /* JADX INFO: renamed from: e */
                public final Object f12600e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public k51(C2130r3 c2130r3, a21 a21Var, i03 i03Var, se0 se0Var, fn1 fn1Var, byte b) {
/* 16 */            super(i03Var, se0Var, fn1Var);
/* 4 */             a21Var.getClass();
/* 7 */             i03Var.getClass();
/* 10 */            se0Var.getClass();
/* 13 */            fn1Var.getClass();
/* 19 */            this.f12600e = c2130r3;
                }

                @Override // p000.ve0
                /* JADX INFO: renamed from: a */
                public final String mo5992a() {
                    switch (this.f12599d) {
                        case 0:
/* 12 */                    return "languages";
                        case 1:
/* 9 */                     return "ruleSet";
                        default:
/* 6 */                     return "tcf-vendorlist";
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: i */
                public Object m5993i(String str, String str2, boolean z, d10 d10Var) {
                    j51 j51Var;
                    k51 k51Var;
/* 3 */             if (d10Var instanceof j51) {
/* 6 */                 j51Var = (j51) d10Var;
/* 8 */                 int i = j51Var.f12076e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    j51Var.f12076e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    j51Var = new j51(this, d10Var);
                        }
                    } else {
/* 22 */                j51Var = new j51(this, d10Var);
                    }
/* 25 */            Object objM3524g = j51Var.f12074c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = j51Var.f12076e;
/* 31 */            boolean z2 = true;
/* 32 */            if (i2 == 0) {
/* 51 */                pg3.m7417A(objM3524g);
/* 61 */                C0907f7 c0907f7 = new C0907f7(this, str, str2, null, 1);
/* 64 */                j51Var.f12072a = this;
/* 66 */                j51Var.f12073b = z;
/* 68 */                j51Var.f12076e = 1;
/* 70 */                objM3524g = m3524g(z, c0907f7, j51Var);
/* 74 */                if (objM3524g == z10Var) {
/* 76 */                    return z10Var;
                        }
/* 77 */                k51Var = this;
                    } else {
/* 34 */                if (i2 != 1) {
/* 46 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 49 */                    return null;
                        }
/* 36 */                z = j51Var.f12073b;
/* 38 */                k51Var = j51Var.f12072a;
/* 40 */                pg3.m7417A(objM3524g);
                    }
/* 78 */            zu0 zu0Var = (zu0) objM3524g;
/* 80 */            String str3 = zu0Var.f20332b;
/* 82 */            k51Var.getClass();
/* 85 */            r11 r11Var = b21.f2178a;
/* 105 */           List list = ((LanguageData) r11Var.m1198a(str3, jb1.m5766z(r11Var.f2163b, j22.m5668b(LanguageData.class)))).f6354a;
/* 109 */           UsercentricsLocation usercentricsLocationM10442a = zu0Var.m10442a();
/* 113 */           if (!z && zu0Var.f20333c != 200) {
/* 123 */               z2 = false;
                    }
/* 124 */           return new k91(list, usercentricsLocationM10442a, z2);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: j */
                public Serializable m5994j(String str, boolean z, d10 d10Var) {
                    k52 k52Var;
/* 3 */             if (d10Var instanceof k52) {
/* 6 */                 k52Var = (k52) d10Var;
/* 8 */                 int i = k52Var.f12604d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    k52Var.f12604d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    k52Var = new k52(this, d10Var);
                        }
                    } else {
/* 22 */                k52Var = new k52(this, d10Var);
                    }
/* 25 */            Object objM3524g = k52Var.f12602b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = k52Var.f12604d;
/* 31 */            c10 c10Var = null;
/* 32 */            int i3 = 1;
/* 33 */            if (i2 == 0) {
/* 49 */                pg3.m7417A(objM3524g);
/* 54 */                v40 v40Var = new v40(this, str, c10Var, i3);
/* 57 */                k52Var.f12601a = this;
/* 59 */                k52Var.f12604d = 1;
/* 61 */                objM3524g = m3524g(z, v40Var, k52Var);
/* 65 */                if (objM3524g == z10Var) {
/* 67 */                    return z10Var;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 45 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                this = k52Var.f12601a;
/* 39 */                pg3.m7417A(objM3524g);
                    }
/* 68 */            zu0 zu0Var = (zu0) objM3524g;
/* 70 */            this.getClass();
/* 73 */            String str2 = zu0Var.f20332b;
/* 75 */            r11 r11Var = b21.f2178a;
/* 101 */           return new Pair((RuleSet) r11Var.m1198a(str2, jb1.m5766z(r11Var.f2163b, j22.m5668b(RuleSet.class))), zu0Var.m10442a());
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: k */
                public Object m5995k(d10 d10Var) {
                    nl2 nl2Var;
/* 3 */             if (d10Var instanceof nl2) {
/* 6 */                 nl2Var = (nl2) d10Var;
/* 8 */                 int i = nl2Var.f14368d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    nl2Var.f14368d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    nl2Var = new nl2(this, d10Var);
                        }
                    } else {
/* 22 */                nl2Var = new nl2(this, d10Var);
                    }
/* 25 */            Object objM3525h = nl2Var.f14366b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = nl2Var.f14368d;
/* 31 */            c10 c10Var = null;
/* 33 */            if (i2 == 0) {
/* 49 */                pg3.m7417A(objM3525h);
/* 55 */                C2241u3 c2241u3 = new C2241u3(this, c10Var, 2);
/* 58 */                nl2Var.f14365a = this;
/* 60 */                nl2Var.f14368d = 1;
/* 63 */                objM3525h = m3525h(false, c2241u3, nl2Var);
/* 67 */                if (objM3525h == z10Var) {
/* 69 */                    return z10Var;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 45 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                this = nl2Var.f14365a;
/* 39 */                pg3.m7417A(objM3525h);
                    }
/* 72 */            this.getClass();
/* 75 */            r11 r11Var = b21.f2178a;
/* 93 */            return (VendorList) r11Var.m1198a((String) objM3525h, jb1.m5766z(r11Var.f2163b, j22.m5668b(VendorList.class)));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 21 */        public k51(C2130r3 c2130r3, a21 a21Var, i03 i03Var, se0 se0Var, fn1 fn1Var) {
/* 22 */            super(i03Var, se0Var, fn1Var);
                    a21Var.getClass();
                    i03Var.getClass();
                    se0Var.getClass();
                    fn1Var.getClass();
/* 23 */            this.f12600e = c2130r3;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 23 */        public k51(C0834d7 c0834d7, a21 a21Var, i03 i03Var, se0 se0Var, fn1 fn1Var) {
/* 24 */            super(i03Var, se0Var, fn1Var);
                    a21Var.getClass();
                    i03Var.getClass();
                    se0Var.getClass();
                    fn1Var.getClass();
/* 25 */            this.f12600e = c0834d7;
                }
            }
