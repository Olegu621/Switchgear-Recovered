            package p000;

            import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lc2 extends en1 {

                /* JADX INFO: renamed from: d */
                public final C2130r3 f13183d;

                /* JADX INFO: renamed from: e */
                public String f13184e;

                /* JADX INFO: renamed from: f */
                public boolean f13185f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public lc2(C2130r3 c2130r3, a21 a21Var, i03 i03Var, se0 se0Var, fn1 fn1Var) {
/* 13 */            super(i03Var, se0Var, fn1Var);
/* 1 */             a21Var.getClass();
/* 4 */             i03Var.getClass();
/* 7 */             se0Var.getClass();
/* 10 */            fn1Var.getClass();
/* 16 */            this.f13183d = c2130r3;
/* 20 */            this.f13184e = "en";
                }

                @Override // p000.ve0
                /* JADX INFO: renamed from: a */
                public final String mo5992a() {
/* 5 */             return AbstractC0886en.m3507k("settings-", this.f13184e);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: i */
                public final Object m6416i(SettingsInitializationParameters settingsInitializationParameters, d10 d10Var) {
                    kc2 kc2Var;
                    boolean z;
                    Object obj;
                    lc2 lc2Var;
/* 3 */             if (d10Var instanceof kc2) {
/* 6 */                 kc2Var = (kc2) d10Var;
/* 8 */                 int i = kc2Var.f12685e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    kc2Var.f12685e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    kc2Var = new kc2(this, d10Var);
                        }
                    } else {
/* 22 */                kc2Var = new kc2(this, d10Var);
                    }
/* 25 */            Object obj2 = kc2Var.f12683c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = kc2Var.f12685e;
/* 31 */            boolean z2 = true;
/* 32 */            if (i2 == 0) {
/* 55 */                pg3.m7417A(obj2);
/* 60 */                this.f13184e = settingsInitializationParameters.f6078c;
/* 62 */                z = settingsInitializationParameters.f6080e;
/* 73 */                C0907f7 c0907f7 = new C0907f7(this, settingsInitializationParameters.f6076a, settingsInitializationParameters.f6077b, null, 2);
/* 76 */                kc2Var.f12681a = this;
/* 78 */                kc2Var.f12682b = z;
/* 80 */                kc2Var.f12685e = 1;
/* 82 */                Object objM3524g = m3524g(z, c0907f7, kc2Var);
/* 86 */                if (objM3524g == z10Var) {
/* 88 */                    return z10Var;
                        }
/* 89 */                obj = objM3524g;
/* 90 */                lc2Var = this;
                    } else {
/* 34 */                if (i2 != 1) {
/* 50 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 53 */                    return null;
                        }
/* 36 */                boolean z3 = kc2Var.f12682b;
/* 38 */                lc2 lc2Var2 = kc2Var.f12681a;
/* 40 */                pg3.m7417A(obj2);
/* 44 */                z = z3;
/* 45 */                lc2Var = lc2Var2;
/* 46 */                obj = obj2;
                    }
/* 91 */            zu0 zu0Var = (zu0) obj;
/* 93 */            if (!z) {
/* 96 */                int i3 = zu0Var.f20333c;
/* 98 */                lc2Var.getClass();
/* 103 */               if (i3 != 200) {
/* 106 */                   z2 = false;
                        }
                    }
/* 107 */           lc2Var.f13185f = z2;
/* 109 */           String str = zu0Var.f20332b;
/* 111 */           r11 r11Var = b21.f2178a;
/* 129 */           return (UsercentricsSettings) r11Var.m1198a(str, jb1.m5766z(r11Var.f2163b, j22.m5668b(UsercentricsSettings.class)));
                }
            }
