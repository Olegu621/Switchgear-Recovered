            package p000;

            import com.usercentrics.sdk.AdTechProvider;
            import com.usercentrics.sdk.acm.data.AdditionalConsentModeListResponse;
            import com.usercentrics.sdk.p009v2.translation.data.LegalBasisLocalization;
            import com.usercentrics.sdk.services.api.NewServiceTemplates;
            import com.usercentrics.tcf.core.model.gvl.Declarations;
            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: renamed from: v3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 24 */    public final class C2279v3 extends en1 {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f17847d = 1;

                /* JADX INFO: renamed from: e */
                public final Object f17848e;

                /* JADX INFO: renamed from: f */
                public Object f17849f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2279v3(C2130r3 c2130r3, a21 a21Var, i03 i03Var, se0 se0Var, fn1 fn1Var, byte b) {
/* 16 */            super(i03Var, se0Var, fn1Var);
/* 4 */             a21Var.getClass();
/* 7 */             i03Var.getClass();
/* 10 */            se0Var.getClass();
/* 13 */            fn1Var.getClass();
/* 19 */            this.f17848e = c2130r3;
/* 23 */            this.f17849f = "en";
                }

                @Override // p000.ve0
                /* JADX INFO: renamed from: a */
                public final String mo5992a() {
                    switch (this.f17847d) {
                        case 0:
/* 39 */                    return "acp";
                        case 1:
/* 34 */                    return AbstractC0886en.m3507k("aggregator-", (String) this.f17849f);
                        case 2:
/* 23 */                    return AbstractC0886en.m3507k("tcf-declarations-", (String) this.f17849f);
                        default:
/* 12 */                    return AbstractC0886en.m3507k("translations-", (String) this.f17849f);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: i */
                public Object m9208i(String str, d10 d10Var) {
                    xk2 xk2Var;
/* 3 */             if (d10Var instanceof xk2) {
/* 6 */                 xk2Var = (xk2) d10Var;
/* 8 */                 int i = xk2Var.f19241d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    xk2Var.f19241d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    xk2Var = new xk2(this, d10Var);
                        }
                    } else {
/* 22 */                xk2Var = new xk2(this, d10Var);
                    }
/* 25 */            Object objM3525h = xk2Var.f19239b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = xk2Var.f19241d;
/* 31 */            c10 c10Var = null;
/* 33 */            if (i2 == 0) {
/* 49 */                pg3.m7417A(objM3525h);
/* 52 */                this.f17849f = str;
/* 57 */                v40 v40Var = new v40(this, str, c10Var, 2);
/* 60 */                xk2Var.f19238a = this;
/* 62 */                xk2Var.f19241d = 1;
/* 65 */                objM3525h = m3525h(false, v40Var, xk2Var);
/* 69 */                if (objM3525h == z10Var) {
/* 71 */                    return z10Var;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 45 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                this = xk2Var.f19238a;
/* 39 */                pg3.m7417A(objM3525h);
                    }
/* 74 */            this.getClass();
/* 77 */            r11 r11Var = b21.f2178a;
/* 95 */            return (Declarations) r11Var.m1198a((String) objM3525h, jb1.m5766z(r11Var.f2163b, j22.m5668b(Declarations.class)));
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: j */
                public Object m9209j(String str, List list, boolean z, d10 d10Var) {
                    C0870e7 c0870e7;
                    C2279v3 c2279v3;
/* 3 */             if (d10Var instanceof C0870e7) {
/* 6 */                 c0870e7 = (C0870e7) d10Var;
/* 8 */                 int i = c0870e7.f7563d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    c0870e7.f7563d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    c0870e7 = new C0870e7(this, d10Var);
                        }
                    } else {
/* 22 */                c0870e7 = new C0870e7(this, d10Var);
                    }
/* 25 */            Object objM3525h = c0870e7.f7561b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = c0870e7.f7563d;
/* 32 */            if (i2 == 0) {
/* 49 */                pg3.m7417A(objM3525h);
/* 52 */                this.f17849f = str;
/* 61 */                C0907f7 c0907f7 = new C0907f7(this, str, list, null, 0);
/* 64 */                c0870e7.f7560a = this;
/* 66 */                c0870e7.f7563d = 1;
/* 68 */                objM3525h = m3525h(z, c0907f7, c0870e7);
/* 72 */                if (objM3525h == z10Var) {
/* 74 */                    return z10Var;
                        }
/* 75 */                c2279v3 = this;
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                c2279v3 = c0870e7.f7560a;
/* 38 */                pg3.m7417A(objM3525h);
                    }
/* 78 */            c2279v3.getClass();
/* 81 */            r11 r11Var = b21.f2178a;
/* 101 */           return ((NewServiceTemplates) r11Var.m1198a((String) objM3525h, jb1.m5766z(r11Var.f2163b, j22.m5668b(NewServiceTemplates.class)))).f6107a;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: k */
                public Object m9210k(String str, boolean z, d10 d10Var) {
                    qr2 qr2Var;
/* 3 */             if (d10Var instanceof qr2) {
/* 6 */                 qr2Var = (qr2) d10Var;
/* 8 */                 int i = qr2Var.f15718d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    qr2Var.f15718d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    qr2Var = new qr2(this, d10Var);
                        }
                    } else {
/* 22 */                qr2Var = new qr2(this, d10Var);
                    }
/* 25 */            Object objM3525h = qr2Var.f15716b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = qr2Var.f15718d;
/* 31 */            c10 c10Var = null;
/* 33 */            if (i2 == 0) {
/* 49 */                pg3.m7417A(objM3525h);
/* 52 */                this.f17849f = str;
/* 57 */                v40 v40Var = new v40(this, str, c10Var, 3);
/* 60 */                qr2Var.f15715a = this;
/* 62 */                qr2Var.f15718d = 1;
/* 64 */                objM3525h = m3525h(z, v40Var, qr2Var);
/* 68 */                if (objM3525h == z10Var) {
/* 70 */                    return z10Var;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 45 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                this = qr2Var.f15715a;
/* 39 */                pg3.m7417A(objM3525h);
                    }
/* 73 */            this.getClass();
/* 76 */            r11 r11Var = b21.f2178a;
/* 94 */            return (LegalBasisLocalization) r11Var.m1198a((String) objM3525h, jb1.m5766z(r11Var.f2163b, j22.m5668b(LegalBasisLocalization.class)));
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: l */
                public Serializable m9211l(List list, List list2, d10 d10Var) {
                    C2204t3 c2204t3;
/* 3 */             if (d10Var instanceof C2204t3) {
/* 6 */                 c2204t3 = (C2204t3) d10Var;
/* 8 */                 int i = c2204t3.f16907f;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    c2204t3.f16907f = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    c2204t3 = new C2204t3(this, d10Var);
                        }
                    } else {
/* 22 */                c2204t3 = new C2204t3(this, d10Var);
                    }
/* 25 */            Object objM3524g = c2204t3.f16905d;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = c2204t3.f16907f;
/* 31 */            int i3 = 0;
/* 32 */            c10 c10Var = null;
/* 34 */            if (i2 == 0) {
/* 57 */                pg3.m7417A(objM3524g);
/* 62 */                C2241u3 c2241u3 = new C2241u3(this, c10Var, i3);
/* 65 */                c2204t3.f16902a = this;
/* 67 */                c2204t3.f16903b = list;
/* 69 */                c2204t3.f16904c = list2;
/* 71 */                c2204t3.f16907f = 1;
/* 73 */                objM3524g = m3524g(false, c2241u3, c2204t3);
/* 77 */                if (objM3524g == z10Var) {
/* 79 */                    return z10Var;
                        }
                    } else {
/* 36 */                if (i2 != 1) {
/* 53 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 41 */                list2 = (List) c2204t3.f16904c;
/* 43 */                list = c2204t3.f16903b;
/* 45 */                this = c2204t3.f16902a;
/* 47 */                pg3.m7417A(objM3524g);
                    }
/* 82 */            Object obj = this.f17849f;
/* 84 */            String str = ((zu0) objM3524g).f20332b;
/* 86 */            r11 r11Var = b21.f2178a;
/* 106 */           Map map = ((AdditionalConsentModeListResponse) r11Var.m1198a(str, jb1.m5766z(r11Var.f2163b, j22.m5668b(AdditionalConsentModeListResponse.class)))).f6075a;
/* 110 */           ArrayList arrayList = new ArrayList();
/* 125 */           for (Map.Entry entry : map.entrySet()) {
/* 139 */               Integer intOrNull = StringsKt.toIntOrNull((String) entry.getKey());
/* 190 */               AdTechProvider adTechProvider = (intOrNull == null || !list.contains(intOrNull)) ? null : new AdTechProvider(intOrNull.intValue(), (String) ((List) entry.getValue()).get(0), (String) ((List) entry.getValue()).get(1), list2.contains(intOrNull));
/* 191 */               if (adTechProvider != null) {
/* 193 */                   arrayList.add(adTechProvider);
                        }
                    }
/* 197 */           return arrayList;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 25 */        public C2279v3(C2130r3 c2130r3, a21 a21Var, i03 i03Var, se0 se0Var, fn1 fn1Var) {
/* 26 */            super(i03Var, se0Var, fn1Var);
                    a21Var.getClass();
                    i03Var.getClass();
                    se0Var.getClass();
                    fn1Var.getClass();
/* 27 */            this.f17848e = c2130r3;
/* 28 */            this.f17849f = a21Var;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 28 */        public C2279v3(C2130r3 c2130r3, a21 a21Var, i03 i03Var, se0 se0Var, fn1 fn1Var, char c) {
/* 29 */            super(i03Var, se0Var, fn1Var);
                    a21Var.getClass();
                    i03Var.getClass();
                    se0Var.getClass();
                    fn1Var.getClass();
/* 30 */            this.f17848e = c2130r3;
/* 31 */            this.f17849f = "en";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 31 */        public C2279v3(C0834d7 c0834d7, a21 a21Var, i03 i03Var, se0 se0Var, fn1 fn1Var) {
/* 32 */            super(i03Var, se0Var, fn1Var);
                    a21Var.getClass();
                    i03Var.getClass();
                    se0Var.getClass();
                    fn1Var.getClass();
/* 33 */            this.f17848e = c0834d7;
/* 34 */            this.f17849f = "en";
                }
            }
