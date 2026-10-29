            package p000;

            import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
            import com.usercentrics.sdk.p009v2.translation.data.LegalBasisLocalization;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yb2 {

                /* JADX INFO: renamed from: a */
                public final pc2 f19570a;

                /* JADX INFO: renamed from: b */
                public final sr2 f19571b;

                /* JADX INFO: renamed from: c */
                public final ac1 f19572c;

                /* JADX INFO: renamed from: d */
                public final C1032im f19573d;

                public yb2(pc2 pc2Var, sr2 sr2Var, ac1 ac1Var, C1032im c1032im) {
/* 1 */             pc2Var.getClass();
/* 4 */             sr2Var.getClass();
/* 7 */             c1032im.getClass();
/* 13 */            this.f19570a = pc2Var;
/* 15 */            this.f19571b = sr2Var;
/* 17 */            this.f19572c = ac1Var;
/* 19 */            this.f19573d = c1032im;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public final Object m10139a(SettingsInitializationParameters settingsInitializationParameters, d10 d10Var) {
                    xb2 xb2Var;
                    yb2 yb2Var;
                    SettingsInitializationParameters settingsInitializationParameters2;
/* 3 */             if (d10Var instanceof xb2) {
/* 6 */                 xb2Var = (xb2) d10Var;
/* 8 */                 int i = xb2Var.f19019e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    xb2Var.f19019e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    xb2Var = new xb2(this, d10Var);
                        }
                    } else {
/* 22 */                xb2Var = new xb2(this, d10Var);
                    }
/* 25 */            Object obj = xb2Var.f19017c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = xb2Var.f19019e;
                    try {
/* 33 */                if (i2 == 0) {
/* 62 */                    pg3.m7417A(obj);
/* 65 */                    pc2 pc2Var = this.f19570a;
/* 67 */                    xb2Var.f19015a = this;
/* 69 */                    xb2Var.f19016b = settingsInitializationParameters;
/* 71 */                    xb2Var.f19019e = 1;
/* 77 */                    if (pc2Var.m7387c(settingsInitializationParameters, xb2Var) == z10Var) {
                            }
/* 100 */                   return z10Var;
                        }
/* 35 */                if (i2 == 1) {
/* 54 */                    settingsInitializationParameters = xb2Var.f19016b;
/* 56 */                    this = xb2Var.f19015a;
/* 58 */                    pg3.m7417A(obj);
                        } else {
/* 37 */                    if (i2 != 2) {
/* 49 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 52 */                        return null;
                            }
/* 39 */                    settingsInitializationParameters2 = xb2Var.f19016b;
/* 41 */                    yb2Var = xb2Var.f19015a;
/* 43 */                    pg3.m7417A(obj);
                        }
/* 106 */               kn1 kn1Var = yb2Var.f19570a.f15067d;
/* 108 */               kn1Var.getClass();
/* 113 */               LegalBasisLocalization legalBasisLocalization = yb2Var.f19571b.f16751b;
/* 115 */               legalBasisLocalization.getClass();
/* 126 */               k61 k61VarM165C = yb2Var.f19572c.m165C(kn1Var.f12892a, kn1Var.f12893b, legalBasisLocalization, settingsInitializationParameters2.f6079d);
/* 130 */               m42 m42Var = o42.f14612b;
/* 132 */               return k61VarM165C;
/* 80 */                sr2 sr2Var = this.f19571b;
/* 82 */                String str = settingsInitializationParameters.f6078c;
/* 86 */                boolean z = this.f19573d.f9710a;
/* 88 */                xb2Var.f19015a = this;
/* 90 */                xb2Var.f19016b = settingsInitializationParameters;
/* 92 */                xb2Var.f19019e = 2;
/* 98 */                if (sr2Var.m8631a(str, z, xb2Var) != z10Var) {
/* 101 */                   SettingsInitializationParameters settingsInitializationParameters3 = settingsInitializationParameters;
/* 102 */                   yb2Var = this;
/* 103 */                   settingsInitializationParameters2 = settingsInitializationParameters3;
/* 106 */                   kn1 kn1Var2 = yb2Var.f19570a.f15067d;
/* 108 */                   kn1Var2.getClass();
/* 113 */                   LegalBasisLocalization legalBasisLocalization2 = yb2Var.f19571b.f16751b;
/* 115 */                   legalBasisLocalization2.getClass();
/* 126 */                   k61 k61VarM165C2 = yb2Var.f19572c.m165C(kn1Var2.f12892a, kn1Var2.f12893b, legalBasisLocalization2, settingsInitializationParameters2.f6079d);
/* 130 */                   m42 m42Var2 = o42.f14612b;
/* 132 */                   return k61VarM165C2;
                        }
/* 100 */               return z10Var;
                    } catch (Exception e) {
/* 134 */               m42 m42Var3 = o42.f14612b;
/* 145 */               return new n42(new vz2("Unable to initialise due to poor or no network connection while fetching the settings.", e));
                    }
                }
            }
