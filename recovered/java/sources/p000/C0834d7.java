            package p000;

            import com.usercentrics.sdk.UsercentricsDomains;
            import java.util.List;
            import java.util.Map;
            import kotlin.collections.CollectionsKt;
            
            /* JADX INFO: renamed from: d7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0834d7 {

                /* JADX INFO: renamed from: a */
                public final i03 f7019a;

                /* JADX INFO: renamed from: b */
                public final hb1 f7020b;

                /* JADX INFO: renamed from: c */
                public final xu0 f7021c;

                public C0834d7(i03 i03Var, hb1 hb1Var, xu0 xu0Var, int i) {
/* 1 */             i03Var.getClass();
/* 4 */             hb1Var.getClass();
/* 7 */             xu0Var.getClass();
                    switch (i) {
                        case 1:
/* 26 */                    this.f7019a = i03Var;
/* 28 */                    this.f7020b = hb1Var;
/* 30 */                    this.f7021c = xu0Var;
                            break;
                        default:
/* 16 */                    this.f7019a = i03Var;
/* 18 */                    this.f7020b = hb1Var;
/* 20 */                    this.f7021c = xu0Var;
                            break;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public Object m2949a(String str, Map map, d10 d10Var) throws vz2 {
                    j52 j52Var;
/* 3 */             if (d10Var instanceof j52) {
/* 6 */                 j52Var = (j52) d10Var;
/* 8 */                 int i = j52Var.f12081e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    j52Var.f12081e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    j52Var = new j52(this, d10Var);
                        }
                    } else {
/* 22 */                j52Var = new j52(this, d10Var);
                    }
/* 25 */            Object objM10031c = j52Var.f12079c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = j52Var.f12081e;
                    try {
/* 33 */                if (i2 == 0) {
/* 53 */                    pg3.m7417A(objM10031c);
/* 83 */                    String str2 = this.f7020b.m4149a() + "/ruleSet/" + str + ".json";
/* 87 */                    xu0 xu0Var = this.f7021c;
/* 89 */                    j52Var.f12077a = this;
/* 91 */                    j52Var.f12078b = str;
/* 93 */                    j52Var.f12081e = 1;
/* 95 */                    objM10031c = xu0Var.m10031c(str2, map, j52Var);
/* 99 */                    if (objM10031c == z10Var) {
/* 101 */                       return z10Var;
                            }
                        } else {
/* 35 */                    if (i2 != 1) {
/* 49 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 32 */                        return null;
                            }
/* 37 */                    str = j52Var.f12078b;
/* 39 */                    this = j52Var.f12077a;
/* 41 */                    pg3.m7417A(objM10031c);
                        }
/* 105 */               int i3 = ((zu0) objM10031c).f20333c;
/* 109 */               if (i3 == 403 || i3 == 404) {
/* 123 */                   throw new vz2("Unable to initialise due to wrong configuration, please make sure your settingsID/ruleSetID is correct.");
                        }
/* 115 */               return objM10031c;
                    } catch (Exception e) {
/* 140 */               this.f7019a.mo2907b("Failed while fetching ruleSet using id: " + str, e);
/* 148 */               vz2 vz2Var = e instanceof vz2 ? (vz2) e : null;
/* 150 */               if (vz2Var != null) {
/* 160 */                   throw vz2Var;
                        }
/* 160 */               throw new vz2("Unable to initialise due to poor or no network connection while fetching the rule Set.", e);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: b */
                public Object m2950b(String str, List list, Map map, d10 d10Var) throws vz2 {
                    C0206c7 c0206c7;
                    String str2;
/* 3 */             if (d10Var instanceof C0206c7) {
/* 6 */                 c0206c7 = (C0206c7) d10Var;
/* 8 */                 int i = c0206c7.f2752d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    c0206c7.f2752d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    c0206c7 = new C0206c7(this, d10Var);
                        }
                    } else {
/* 22 */                c0206c7 = new C0206c7(this, d10Var);
                    }
/* 25 */            Object obj = c0206c7.f2750b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = c0206c7.f2752d;
                    try {
/* 33 */                if (i2 != 0) {
/* 35 */                    if (i2 != 1) {
/* 48 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 37 */                    C0834d7 c0834d7 = c0206c7.f2749a;
/* 39 */                    pg3.m7417A(obj);
/* 42 */                    return obj;
                        }
/* 52 */                pg3.m7417A(obj);
/* 64 */                String strM6203x = CollectionsKt.m6203x(list, ",", null, null, C0170b7.f2256b, 30);
/* 68 */                hb1 hb1Var = this.f7020b;
/* 70 */                UsercentricsDomains usercentricsDomains = hb1Var.f8999b;
/* 76 */                if (usercentricsDomains.m2770a()) {
/* 78 */                    str2 = usercentricsDomains.f6042a;
                        } else {
/* 83 */                    int iOrdinal = hb1Var.f8998a.ordinal();
/* 87 */                    if (iOrdinal == 0) {
/* 98 */                        str2 = "https://aggregator.service.usercentrics.eu";
                            } else {
/* 89 */                        if (iOrdinal != 1) {
/* 94 */                            ds0.m3187b();
/* 31 */                            return null;
                                }
/* 91 */                        str2 = "https://aggregator.eu.usercentrics.eu";
                            }
                        }
/* 124 */               String str3 = str2 + "/aggregate/" + str + "?templates=" + strM6203x;
/* 128 */               xu0 xu0Var = this.f7021c;
/* 130 */               c0206c7.f2749a = this;
/* 132 */               c0206c7.f2752d = 1;
/* 134 */               Object objM10031c = xu0Var.m10031c(str3, map, c0206c7);
                        return objM10031c == z10Var ? z10Var : objM10031c;
                    } catch (Exception e) {
/* 146 */               this.f7019a.mo2907b("Failed while fetching services", e);
/* 156 */               throw new vz2("Unable to initialise due to poor or no network connection while fetching the processing services.", e);
                    }
                }
            }
