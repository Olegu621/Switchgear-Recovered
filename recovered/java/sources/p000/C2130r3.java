            package p000;

            import java.util.Map;
            
            /* JADX INFO: renamed from: r3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2130r3 {

                /* JADX INFO: renamed from: a */
                public final xu0 f15840a;

                /* JADX INFO: renamed from: b */
                public final hb1 f15841b;

                public C2130r3(xu0 xu0Var, hb1 hb1Var, int i) {
/* 1 */             xu0Var.getClass();
/* 4 */             hb1Var.getClass();
                    switch (i) {
                        case 1:
/* 53 */                    this.f15840a = xu0Var;
/* 55 */                    this.f15841b = hb1Var;
                            break;
                        case 2:
/* 45 */                    this.f15840a = xu0Var;
/* 47 */                    this.f15841b = hb1Var;
                            break;
                        case 3:
/* 37 */                    this.f15840a = xu0Var;
/* 39 */                    this.f15841b = hb1Var;
                            break;
                        case 4:
/* 29 */                    this.f15840a = xu0Var;
/* 31 */                    this.f15841b = hb1Var;
                            break;
                        case 5:
/* 21 */                    this.f15840a = xu0Var;
/* 23 */                    this.f15841b = hb1Var;
                            break;
                        default:
/* 13 */                    this.f15840a = xu0Var;
/* 15 */                    this.f15841b = hb1Var;
                            break;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public Object m8060a(String str, String str2, Map map, d10 d10Var) throws vz2 {
                    e51 e51Var;
/* 3 */             if (d10Var instanceof e51) {
/* 6 */                 e51Var = (e51) d10Var;
/* 8 */                 int i = e51Var.f7514c;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    e51Var.f7514c = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    e51Var = new e51(this, d10Var);
                        }
                    } else {
/* 22 */                e51Var = new e51(this, d10Var);
                    }
/* 25 */            Object objM10031c = e51Var.f7512a;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = e51Var.f7514c;
/* 32 */            if (i2 == 0) {
/* 47 */                pg3.m7417A(objM10031c);
/* 85 */                String str3 = this.f15841b.m4149a() + "/settings/" + str + "/" + str2 + "/languages.json";
/* 89 */                e51Var.f7514c = 1;
/* 93 */                objM10031c = this.f15840a.m10031c(str3, map, e51Var);
/* 97 */                if (objM10031c == z10Var) {
/* 99 */                    return z10Var;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                pg3.m7417A(objM10031c);
                    }
/* 103 */           int i3 = ((zu0) objM10031c).f20333c;
/* 107 */           if (i3 == 403 || i3 == 404) {
/* 121 */               throw new vz2("Unable to initialise due to wrong configuration, please make sure your settingsID correct.");
                    }
/* 113 */           return objM10031c;
                }
            }
