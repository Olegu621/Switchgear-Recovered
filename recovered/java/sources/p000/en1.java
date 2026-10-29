            package p000;

            import java.util.Iterator;
            import java.util.Map;
            import java.util.regex.Matcher;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.Regex;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class en1 extends ve0 {

                /* JADX INFO: renamed from: c */
                public final fn1 f7807c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public en1(i03 i03Var, se0 se0Var, fn1 fn1Var) {
/* 10 */            super(i03Var, se0Var);
/* 1 */             i03Var.getClass();
/* 4 */             se0Var.getClass();
/* 7 */             fn1Var.getClass();
/* 13 */            this.f7807c = fn1Var;
                }

                /* JADX WARN: Code duplicated, block: B:14:0x0041  */
                /* JADX INFO: renamed from: f */
                public final zu0 m3523f(zu0 zu0Var) throws vz2 {
                    ra2 ra2Var;
                    Object next;
                    String str;
                    String strM9257d;
/* 1 */             int i = zu0Var.f20333c;
/* 3 */             Map map = zu0Var.f20331a;
/* 9 */             if (i == 200) {
/* 33 */                String str2 = (String) map.get("cache-control");
/* 35 */                int iIntValue = 0;
/* 37 */                if (str2 != null) {
/* 39 */                    Regex regex = zu0.f20330d;
/* 41 */                    regex.getClass();
/* 46 */                    Matcher matcher = regex.f12938a.matcher(str2);
/* 50 */                    matcher.getClass();
/* 57 */                    if (matcher.find(0)) {
/* 62 */                        ra2Var = new ra2(matcher, str2);
                            } else {
/* 66 */                        ra2Var = null;
                            }
                        } else {
/* 66 */                    ra2Var = null;
                        }
/* 67 */                if (ra2Var != null) {
/* 73 */                    if (((rc1) ra2Var.f15958d) == null) {
/* 80 */                        ra2Var.f15958d = new rc1(ra2Var);
                            }
/* 84 */                    rc1 rc1Var = (rc1) ra2Var.f15958d;
/* 86 */                    rc1Var.getClass();
/* 96 */                    Integer intOrNull = StringsKt.toIntOrNull((String) rc1Var.get(1));
/* 100 */                   if (intOrNull != null) {
/* 102 */                       iIntValue = intOrNull.intValue();
                            }
                        }
/* 106 */               String str3 = zu0Var.f20332b;
/* 112 */               Iterator it = map.entrySet().iterator();
/* 139 */               do {
/* 120 */                   if (!it.hasNext()) {
/* 142 */                       next = null;
                                break;
                            }
/* 122 */                   next = it.next();
/* 139 */               } while (!Intrinsics.m6216a(((Map.Entry) next).getKey(), "etag"));
/* 143 */               Map.Entry entry = (Map.Entry) next;
/* 145 */               if (entry == null || (str = (String) entry.getValue()) == null) {
/* 155 */                   str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 157 */               se0 se0Var = this.f18021b;
/* 159 */               if (i == 304) {
/* 173 */                   this.f18020a.mo2906a("Valid ETAG cache: key=".concat(mo5992a()), null);
/* 184 */                   if (m9256c() == 0) {
/* 195 */                       se0Var.m8489d(new te0(mo5992a(), iIntValue, str, str3));
                            }
/* 198 */                   strM9257d = m9257d();
                        } else {
/* 207 */                   if (StringsKt.m6228D(str) || iIntValue == 0) {
/* 212 */                       str = "xxx";
                            }
/* 223 */                   se0Var.m8489d(new te0(mo5992a(), iIntValue, str, str3));
/* 226 */                   strM9257d = str3;
                        }
                    } else {
/* 11 */                if (i != 304) {
/* 26 */                    throw new vz2("Invalid Network Response");
                        }
/* 13 */                strM9257d = m9257d();
                    }
/* 229 */           return new zu0(i, strM9257d, map);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
                
                    if (r11 == r1) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
                
                    if (r11 == r1) goto L32;
                 */
                /* JADX INFO: renamed from: g */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object m3524g(boolean z, Function1 function1, d10 d10Var) {
                    cn1 cn1Var;
/* 3 */             if (d10Var instanceof cn1) {
/* 6 */                 cn1Var = (cn1) d10Var;
/* 8 */                 int i = cn1Var.f3014d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    cn1Var.f3014d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    cn1Var = new cn1(this, d10Var);
                        }
                    } else {
/* 22 */                cn1Var = new cn1(this, d10Var);
                    }
/* 25 */            Object objInvoke = cn1Var.f3012b;
/* 27 */            Object obj = z10.f19902a;
/* 29 */            int i2 = cn1Var.f3014d;
/* 33 */            if (i2 != 0) {
/* 35 */                if (i2 == 1) {
/* 52 */                    this = cn1Var.f3011a;
/* 54 */                    pg3.m7417A(objInvoke);
/* 76 */                    return this.m3523f((zu0) objInvoke);
                        }
/* 37 */                if (i2 != 2) {
/* 47 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 50 */                    return null;
                        }
/* 39 */                this = cn1Var.f3011a;
/* 41 */                pg3.m7417A(objInvoke);
/* 135 */               return this.m3523f((zu0) objInvoke);
                    }
/* 58 */            pg3.m7417A(objInvoke);
/* 61 */            if (z) {
/* 63 */                cn1Var.f3011a = this;
/* 65 */                cn1Var.f3014d = 1;
/* 67 */                objInvoke = function1.invoke(cn1Var);
                    } else {
/* 85 */                if (this.f7807c.f8291a || m9256c() > new h50().m4115c()) {
/* 107 */                   od0 od0Var = od0.f14715a;
/* 109 */                   od0Var.getClass();
/* 118 */                   return new zu0(304, m9257d(), od0Var);
                        }
/* 122 */               cn1Var.f3011a = this;
/* 124 */               cn1Var.f3014d = 2;
/* 126 */               objInvoke = function1.invoke(cn1Var);
                    }
/* 132 */           return obj;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: h */
                public final Object m3525h(boolean z, Function1 function1, d10 d10Var) {
                    dn1 dn1Var;
/* 3 */             if (d10Var instanceof dn1) {
/* 6 */                 dn1Var = (dn1) d10Var;
/* 8 */                 int i = dn1Var.f7336c;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    dn1Var.f7336c = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    dn1Var = new dn1(this, d10Var);
                        }
                    } else {
/* 22 */                dn1Var = new dn1(this, d10Var);
                    }
/* 25 */            Object objM3524g = dn1Var.f7334a;
/* 27 */            Object obj = z10.f19902a;
/* 29 */            int i2 = dn1Var.f7336c;
/* 32 */            if (i2 == 0) {
/* 47 */                pg3.m7417A(objM3524g);
/* 50 */                dn1Var.f7336c = 1;
/* 52 */                objM3524g = m3524g(z, function1, dn1Var);
/* 56 */                if (objM3524g == obj) {
/* 58 */                    return obj;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                pg3.m7417A(objM3524g);
                    }
/* 61 */            return ((zu0) objM3524g).f20332b;
                }
            }
