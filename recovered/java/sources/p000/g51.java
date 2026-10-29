            package p000;

            import com.usercentrics.sdk.p009v2.location.data.UsercentricsLocation;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g51 {

                /* JADX INFO: renamed from: a */
                public final n51 f8475a;

                public g51(n51 n51Var) {
/* 1 */             n51Var.getClass();
/* 7 */             this.f8475a = n51Var;
                }

                /* JADX WARN: Code duplicated, block: B:8:0x0014  */
                /* JADX INFO: renamed from: a */
                public final Object m3874a(String str, String str2, String str3, boolean z, d10 d10Var) {
                    f51 f51Var;
/* 3 */             if (d10Var instanceof f51) {
/* 6 */                 f51Var = (f51) d10Var;
/* 8 */                 int i = f51Var.f8003d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    f51Var.f8003d = i - Integer.MIN_VALUE;
                        } else {
/* 23 */                    f51Var = new f51(this, d10Var);
                        }
                    } else {
/* 23 */                f51Var = new f51(this, d10Var);
                    }
/* 19 */            f51 f51Var2 = f51Var;
/* 27 */            Object obj = f51Var2.f8001b;
/* 29 */            z10 z10Var = z10.f19902a;
/* 31 */            int i2 = f51Var2.f8003d;
                    try {
/* 34 */                if (i2 == 0) {
/* 51 */                    pg3.m7417A(obj);
/* 54 */                    n51 n51Var = this.f8475a;
/* 56 */                    f51Var2.f8000a = this;
/* 58 */                    f51Var2.f8003d = 1;
/* 68 */                    if (n51Var.m6887a(str, str2, str3, z, f51Var2) == z10Var) {
/* 70 */                        return z10Var;
                            }
                        } else {
/* 36 */                    if (i2 != 1) {
/* 46 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 49 */                        return null;
                            }
/* 38 */                    this = f51Var2.f8000a;
/* 40 */                    pg3.m7417A(obj);
                        }
/* 71 */                m42 m42Var = o42.f14612b;
/* 75 */                n51 n51Var2 = this.f8475a;
/* 77 */                String str4 = n51Var2.f14124d;
/* 79 */                str4.getClass();
/* 82 */                UsercentricsLocation usercentricsLocation = n51Var2.f14125e;
/* 84 */                usercentricsLocation.getClass();
/* 89 */                return new k91(str4, usercentricsLocation, n51Var2.f14126f);
                    } catch (Exception e) {
/* 95 */                m42 m42Var2 = o42.f14612b;
/* 99 */                return new n42(e);
                    }
                }
            }
