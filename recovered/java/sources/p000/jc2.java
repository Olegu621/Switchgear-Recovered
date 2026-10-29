            package p000;

            import com.usercentrics.sdk.UsercentricsOptions;
            import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
            import com.usercentrics.sdk.p009v2.ruleset.data.SessionGeoRule;
            import com.usercentrics.sdk.p009v2.settings.data.CCPASettings;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageSettings;
            import java.util.Collections;
            import java.util.List;
            import java.util.Set;
            import kotlin.Unit;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jc2 {

                /* JADX INFO: renamed from: a */
                public final fb1 f12211a;

                /* JADX INFO: renamed from: f */
                public boolean f12216f;

                /* JADX INFO: renamed from: h */
                public boolean f12218h;

                /* JADX INFO: renamed from: b */
                public String f12212b = HttpUrl.FRAGMENT_ENCODE_SET;

                /* JADX INFO: renamed from: c */
                public final as0 f12213c = new as0();

                /* JADX INFO: renamed from: d */
                public String f12214d = HttpUrl.FRAGMENT_ENCODE_SET;

                /* JADX INFO: renamed from: e */
                public String f12215e = HttpUrl.FRAGMENT_ENCODE_SET;

                /* JADX INFO: renamed from: g */
                public Set f12217g = qd0.f15493a;

                public jc2(fb1 fb1Var) {
/* 4 */             this.f12211a = fb1Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public final Object m5775a(UsercentricsOptions usercentricsOptions, d10 d10Var) {
                    bc2 bc2Var;
/* 3 */             if (d10Var instanceof bc2) {
/* 6 */                 bc2Var = (bc2) d10Var;
/* 8 */                 int i = bc2Var.f2368d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    bc2Var.f2368d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    bc2Var = new bc2(this, d10Var);
                        }
                    } else {
/* 22 */                bc2Var = new bc2(this, d10Var);
                    }
/* 25 */            Object objM6608a = bc2Var.f2366b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = bc2Var.f2368d;
/* 32 */            if (i2 == 0) {
/* 49 */                pg3.m7417A(objM6608a);
/* 52 */                String str = usercentricsOptions.f6049b;
/* 54 */                str.getClass();
/* 57 */                this.f12215e = str;
/* 59 */                String str2 = usercentricsOptions.f6050c;
/* 65 */                if (StringsKt.m6228D(str2)) {
/* 67 */                    str2 = "latest";
                        }
/* 69 */                this.f12212b = str2;
/* 71 */                String str3 = usercentricsOptions.f6048a;
/* 77 */                if (!StringsKt.m6228D(str3)) {
/* 79 */                    Set setSingleton = Collections.singleton(str3);
/* 83 */                    setSingleton.getClass();
/* 86 */                    m5784j(str3, setSingleton);
/* 89 */                    return Unit.f12910a;
                        }
/* 100 */               m52 m52Var = (m52) this.f12211a.f8084V.getValue();
/* 102 */               String str4 = usercentricsOptions.f6053f;
/* 104 */               bc2Var.f2365a = this;
/* 106 */               bc2Var.f2368d = 1;
/* 108 */               objM6608a = m52Var.m6608a(str4, bc2Var);
/* 112 */               if (objM6608a == z10Var) {
/* 114 */                   return z10Var;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                this = bc2Var.f2365a;
/* 38 */                pg3.m7417A(objM6608a);
                    }
/* 115 */           SessionGeoRule sessionGeoRule = (SessionGeoRule) objM6608a;
/* 121 */           this.m5784j(sessionGeoRule.f6369a, sessionGeoRule.f6372d);
/* 126 */           this.f12216f = sessionGeoRule.f6370b;
/* 140 */           ((p91) this.f12211a.f8065C.getValue()).m7372b(sessionGeoRule.f6371c);
/* 143 */           return Unit.f12910a;
                }

                /* JADX INFO: renamed from: b */
                public final void m5776b() {
/* 1 */             fb1 fb1Var = this.f12211a;
/* 17 */            if (((p91) fb1Var.f8065C.getValue()).f15029b.m2818a()) {
/* 40 */                f42.m3656l("Location cannot be empty");
                    } else {
/* 29 */                if (((sx0) fb1Var.f8106t.getValue()).f16850l != null) {
/* 31 */                    return;
                        }
/* 34 */                f42.m3656l("No variant value");
                    }
                }

                /* JADX WARN: Code duplicated, block: B:8:0x0014  */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
                
                    if (r9 == r0) goto L33;
                 */
                /* JADX INFO: renamed from: c */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object m5777c(String str, d10 d10Var) throws Throwable {
                    cc2 cc2Var;
                    Object objM3874a;
                    Object objM5783i;
/* 3 */             if (d10Var instanceof cc2) {
/* 6 */                 cc2Var = (cc2) d10Var;
/* 8 */                 int i = cc2Var.f2843e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    cc2Var.f2843e = i - Integer.MIN_VALUE;
                        } else {
/* 23 */                    cc2Var = new cc2(this, d10Var);
                        }
                    } else {
/* 23 */                cc2Var = new cc2(this, d10Var);
                    }
/* 19 */            cc2 cc2Var2 = cc2Var;
/* 27 */            Object obj = cc2Var2.f2841c;
/* 29 */            z10 z10Var = z10.f19902a;
/* 31 */            int i2 = cc2Var2.f2843e;
/* 36 */            if (i2 != 0) {
/* 38 */                if (i2 == 1) {
/* 57 */                    str = cc2Var2.f2840b;
/* 59 */                    this = cc2Var2.f2839a;
/* 61 */                    pg3.m7417A(obj);
/* 66 */                    objM3874a = ((o42) obj).f14613a;
                        } else {
/* 40 */                    if (i2 != 2) {
/* 53 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 35 */                        return null;
                            }
/* 42 */                    pg3.m7417A(obj);
/* 47 */                    objM5783i = ((o42) obj).f14613a;
                        }
/* 200 */               Throwable thM7099a = o42.m7099a(objM5783i);
                        return thM7099a != null ? new n42(thM7099a) : Unit.f12910a;
                    }
/* 69 */            pg3.m7417A(obj);
/* 72 */            fb1 fb1Var = this.f12211a;
/* 80 */            g80 g80Var = (g80) fb1Var.f8112z.getValue();
/* 82 */            Set set = this.f12217g;
/* 84 */            pz2 pz2Var = (pz2) g80Var;
/* 86 */            pz2Var.getClass();
/* 89 */            set.getClass();
/* 92 */            od2 od2Var = pz2Var.f15354e;
/* 94 */            fh2[] fh2VarArr = fh2.f8216a;
/* 98 */            od2Var.m7136b("tcf-", set);
/* 103 */           od2Var.m7136b("settings-", set);
/* 114 */           boolean zM7371a = ((p91) fb1Var.f8065C.getValue()).m7371a();
/* 136 */           cc2Var2.f2839a = this;
/* 138 */           cc2Var2.f2840b = str;
/* 140 */           cc2Var2.f2843e = 1;
/* 144 */           objM3874a = ((g51) fb1Var.f8064B.getValue()).m3874a(this.f12214d, this.f12212b, this.f12215e, !zM7371a, cc2Var2);
/* 148 */           if (objM3874a != z10Var) {
                    }
/* 199 */           return z10Var;
/* 151 */           m42 m42Var = o42.f14612b;
/* 160 */           k91 k91Var = (k91) (objM3874a instanceof n42 ? null : objM3874a);
/* 162 */           if (k91Var == null) {
/* 164 */               Throwable thM7099a2 = o42.m7099a(objM3874a);
/* 168 */               if (thM7099a2 == null) {
/* 174 */                   thM7099a2 = new vz2("Unable to initialise due to poor or no network connection while fetching the available languages.");
                        }
/* 179 */               return new n42(thM7099a2);
                    }
/* 185 */           this.f12218h = k91Var.f12658c;
/* 187 */           cc2Var2.f2839a = null;
/* 189 */           cc2Var2.f2840b = null;
/* 191 */           cc2Var2.f2843e = 2;
/* 193 */           objM5783i = this.m5783i(str, k91Var, cc2Var2);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: d */
                public final Object m5778d(String str, d10 d10Var) throws Throwable {
                    dc2 dc2Var;
                    boolean zM6228D;
                    Throwable th;
                    jc2 jc2Var;
                    boolean z;
                    Exception e;
/* 3 */             if (d10Var instanceof dc2) {
/* 6 */                 dc2Var = (dc2) d10Var;
/* 8 */                 int i = dc2Var.f7116e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    dc2Var.f7116e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    dc2Var = new dc2(this, d10Var);
                        }
                    } else {
/* 22 */                dc2Var = new dc2(this, d10Var);
                    }
/* 25 */            Object obj = dc2Var.f7114c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = dc2Var.f7116e;
/* 32 */            if (i2 == 0) {
/* 62 */                pg3.m7417A(obj);
/* 65 */                zM6228D = StringsKt.m6228D(str);
                        try {
                            try {
/* 77 */                        sx0 sx0Var = (sx0) this.f12211a.f8106t.getValue();
/* 79 */                        dc2Var.f7112a = this;
/* 81 */                        dc2Var.f7113b = zM6228D;
/* 83 */                        dc2Var.f7116e = 1;
/* 89 */                        if (sx0Var.m8647b(str, zM6228D) == z10Var) {
/* 91 */                            return z10Var;
                                }
                            } catch (Exception e2) {
/* 125 */                       e = e2;
/* 126 */                       m42 m42Var = o42.f14612b;
/* 137 */                       n42 n42Var = new n42(new vz2("There was a failure during the initialization", e));
/* 152 */                       if (hu0.m4335d0(dc2Var.getContext()).isCancelled() && zM6228D) {
/* 156 */                           this.m5786l();
                                }
/* 159 */                       return n42Var;
                            }
                        } catch (Throwable th2) {
/* 121 */                   jc2Var = this;
/* 122 */                   z = zM6228D;
/* 123 */                   th = th2;
/* 172 */                   if (hu0.m4335d0(dc2Var.getContext()).isCancelled() && z) {
/* 176 */                       jc2Var.m5786l();
                            }
/* 179 */                   throw th;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 57 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 60 */                    return null;
                        }
/* 36 */                z = dc2Var.f7113b;
/* 38 */                jc2Var = dc2Var.f7112a;
                        try {
/* 40 */                    pg3.m7417A(obj);
/* 43 */                    zM6228D = z;
/* 44 */                    this = jc2Var;
                        } catch (Exception e3) {
/* 51 */                    zM6228D = z;
/* 52 */                    this = jc2Var;
/* 53 */                    e = e3;
/* 126 */                   m42 m42Var2 = o42.f14612b;
/* 137 */                   n42 n42Var2 = new n42(new vz2("There was a failure during the initialization", e));
/* 152 */                   if (hu0.m4335d0(dc2Var.getContext()).isCancelled()) {
/* 156 */                       this.m5786l();
                            }
/* 159 */                   return n42Var2;
                        } catch (Throwable th3) {
/* 46 */                    th = th3;
/* 172 */                   if (hu0.m4335d0(dc2Var.getContext()).isCancelled()) {
/* 176 */                       jc2Var.m5786l();
                            }
/* 179 */                   throw th;
                        }
                    }
/* 92 */            this.m5776b();
/* 95 */            m42 m42Var3 = o42.f14612b;
/* 97 */            Unit unit = Unit.f12910a;
/* 111 */           if (hu0.m4335d0(dc2Var.getContext()).isCancelled() && zM6228D) {
/* 115 */               this.m5786l();
                    }
/* 118 */           return unit;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0015  */
                /* JADX INFO: renamed from: e */
                public final Object m5779e(d10 d10Var) {
                    ec2 ec2Var;
                    List list;
/* 1 */             fb1 fb1Var = this.f12211a;
/* 5 */             if (d10Var instanceof ec2) {
/* 8 */                 ec2Var = (ec2) d10Var;
/* 10 */                int i = ec2Var.f7624c;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    ec2Var.f7624c = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    ec2Var = new ec2(this, d10Var);
                        }
                    } else {
/* 24 */                ec2Var = new ec2(this, d10Var);
                    }
/* 27 */            Object obj = ec2Var.f7622a;
/* 29 */            z10 z10Var = z10.f19902a;
/* 31 */            int i2 = ec2Var.f7624c;
                    try {
/* 34 */                if (i2 == 0) {
/* 49 */                    pg3.m7417A(obj);
/* 62 */                    C1029ij c1029ij = ((ac2) fb1Var.f8068F.getValue()).f182c.f12618i;
/* 64 */                    if (c1029ij == null || (list = c1029ij.f9629b) == null) {
/* 70 */                        list = nd0.f14189a;
                            }
/* 78 */                    C2484y3 c2484y3 = (C2484y3) fb1Var.f8086X.getValue();
/* 80 */                    ec2Var.f7624c = 1;
/* 86 */                    if (c2484y3.m10097e(list, ec2Var) == z10Var) {
/* 88 */                        return z10Var;
                            }
                        } else {
/* 36 */                    if (i2 != 1) {
/* 44 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 47 */                        return null;
                            }
/* 38 */                    pg3.m7417A(obj);
                        }
/* 89 */                m42 m42Var = o42.f14612b;
/* 91 */                return Unit.f12910a;
                    } catch (Exception e) {
/* 95 */                m42 m42Var2 = o42.f14612b;
/* 106 */               return new n42(new vz2("Unable to initialise due to poor or no network connection while fetching the TCF data.", e));
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v0, types: [jc2] */
                /* JADX WARN: Type inference failed for: r7v1 */
                /* JADX WARN: Type inference failed for: r7v11 */
                /* JADX WARN: Type inference failed for: r7v12 */
                /* JADX WARN: Type inference failed for: r7v4 */
                /* JADX WARN: Type inference failed for: r8v1 */
                /* JADX WARN: Type inference failed for: r8v2 */
                /* JADX WARN: Type inference failed for: r8v3, types: [jc2] */
                /* JADX WARN: Type inference failed for: r8v4, types: [jc2] */
                /* JADX WARN: Type inference failed for: r8v5, types: [jc2] */
                /* JADX WARN: Type inference failed for: r8v6 */
                /* JADX INFO: renamed from: f */
                public final Object m5780f(String str, d10 d10Var) throws Throwable {
                    fc2 fc2Var;
                    ?? r8;
                    boolean z;
                    Object objM5781g;
                    ?? r9;
/* 3 */             if (d10Var instanceof fc2) {
/* 6 */                 fc2Var = (fc2) d10Var;
/* 8 */                 int i = fc2Var.f8128e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    fc2Var.f8128e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    fc2Var = new fc2(this, d10Var);
                        }
                    } else {
/* 22 */                fc2Var = new fc2(this, d10Var);
                    }
/* 25 */            Object obj = fc2Var.f8126c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = fc2Var.f8128e;
/* 34 */            if (i2 != 0) {
/* 36 */                if (i2 != 1) {
/* 38 */                    if (i2 == 2) {
/* 40 */                        pg3.m7417A(obj);
/* 45 */                        return ((o42) obj).f14613a;
                            }
/* 50 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 54 */                z = fc2Var.f8125b;
/* 56 */                r8 = fc2Var.f8124a;
                        try {
/* 58 */                    pg3.m7417A(obj);
/* 63 */                    objM5781g = ((o42) obj).f14613a;
                            r9 = r8;
/* 115 */                   if (hu0.m4335d0(fc2Var.getContext()).isCancelled() && !z) {
/* 119 */                       r9.m5785k();
                            }
/* 122 */                   return objM5781g;
                        } catch (Throwable th) {
/* 66 */                    th = th;
/* 208 */                   if (hu0.m4335d0(fc2Var.getContext()).isCancelled() && !z) {
/* 212 */                       r8.m5785k();
                            }
/* 215 */                   throw th;
                        }
                    }
/* 69 */            pg3.m7417A(obj);
/* 72 */            fb1 fb1Var = this.f12211a;
/* 80 */            ac2 ac2Var = (ac2) fb1Var.f8068F.getValue();
/* 84 */            boolean z2 = ac2Var.f182c.f12616g;
                    try {
/* 86 */                if (z2) {
/* 88 */                    fc2Var.f8124a = this;
/* 90 */                    fc2Var.f8125b = z2;
/* 92 */                    fc2Var.f8128e = 1;
/* 94 */                    objM5781g = m5781g(ac2Var, str, fc2Var);
/* 98 */                    if (objM5781g != z10Var) {
                                this = this;
/* 101 */                       r9 = this;
/* 102 */                       z = z2;
/* 115 */                       if (hu0.m4335d0(fc2Var.getContext()).isCancelled()) {
/* 119 */                           r9.m5785k();
                                }
/* 122 */                       return objM5781g;
                            }
                        } else {
/* 127 */                   m5785k();
/* 142 */                   if (hu0.m4335d0(fc2Var.getContext()).isCancelled() && !z2) {
/* 146 */                       m5785k();
                            }
/* 151 */                   CCPASettings cCPASettings = ac2Var.f182c.f12613d;
/* 159 */                   if (cCPASettings != null ? cCPASettings.f6381h : false) {
/* 167 */                       C2508yr c2508yr = (C2508yr) fb1Var.f8071I.getValue();
/* 171 */                       CCPASettings cCPASettings2 = ac2Var.f182c.f12613d;
/* 181 */                       c2508yr.f19767c = cCPASettings2 != null ? Boolean.valueOf(cCPASettings2.f6385l) : null;
/* 183 */                       c2508yr.m10171a();
                            }
/* 186 */                   fc2Var.f8128e = 2;
/* 188 */                   Object objM5778d = m5778d(str, fc2Var);
                            this = objM5778d;
/* 192 */                   if (objM5778d != z10Var) {
/* 195 */                       return objM5778d;
                            }
                        }
                        this = this;
/* 194 */               return z10Var;
                    } catch (Throwable th2) {
/* 123 */               th = th2;
/* 124 */               r8 = this;
/* 125 */               z = z2;
/* 208 */               if (hu0.m4335d0(fc2Var.getContext()).isCancelled()) {
/* 212 */                   r8.m5785k();
                        }
/* 215 */               throw th;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
                /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
                /* JADX WARN: Code duplicated, block: B:40:0x00b9 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: g */
                public final Object m5781g(ac2 ac2Var, String str, d10 d10Var) throws Throwable {
                    gc2 gc2Var;
                    Object objM7932o;
                    jc2 jc2Var;
                    String str2;
                    Object obj;
                    Object objM5778d;
                    Throwable thM7099a;
/* 3 */             if (d10Var instanceof gc2) {
/* 6 */                 gc2Var = (gc2) d10Var;
/* 8 */                 int i = gc2Var.f8544f;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    gc2Var.f8544f = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    gc2Var = new gc2(this, d10Var);
                        }
                    } else {
/* 22 */                gc2Var = new gc2(this, d10Var);
                    }
/* 25 */            Object obj2 = gc2Var.f8542d;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = gc2Var.f8544f;
/* 35 */            if (i2 == 0) {
/* 88 */                pg3.m7417A(obj2);
/* 99 */                il2 il2Var = (il2) this.f12211a.f8073K.getValue();
/* 101 */               String str3 = this.f12214d;
/* 103 */               gc2Var.f8539a = this;
/* 105 */               gc2Var.f8540b = ac2Var;
/* 107 */               gc2Var.f8541c = str;
/* 109 */               gc2Var.f8544f = 1;
/* 113 */               objM7932o = ((qk2) il2Var).m7932o(str3, gc2Var);
/* 117 */               if (objM7932o != z10Var) {
                        }
/* 185 */               return z10Var;
                    }
/* 37 */            if (i2 == 1) {
/* 71 */                str = gc2Var.f8541c;
/* 76 */                ac2Var = (ac2) gc2Var.f8540b;
/* 78 */                this = gc2Var.f8539a;
/* 80 */                pg3.m7417A(obj2);
/* 85 */                objM7932o = ((o42) obj2).f14613a;
                    } else {
/* 39 */                if (i2 != 2) {
/* 41 */                    if (i2 == 3) {
/* 43 */                        pg3.m7417A(obj2);
/* 48 */                        return ((o42) obj2).f14613a;
                            }
/* 53 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 34 */                    return null;
                        }
/* 59 */                str2 = (String) gc2Var.f8540b;
/* 61 */                jc2Var = gc2Var.f8539a;
/* 63 */                pg3.m7417A(obj2);
/* 68 */                obj = ((o42) obj2).f14613a;
                    }
/* 157 */           thM7099a = o42.m7099a(obj);
/* 161 */           if (thM7099a != null) {
/* 165 */               return new n42(thM7099a);
                    }
/* 169 */           str = str2;
/* 170 */           this = jc2Var;
/* 171 */           gc2Var.f8539a = null;
/* 173 */           gc2Var.f8540b = null;
/* 175 */           gc2Var.f8541c = null;
/* 177 */           gc2Var.f8544f = 3;
/* 179 */           objM5778d = this.m5778d(str, gc2Var);
/* 183 */           if (objM5778d == z10Var) {
/* 185 */               return z10Var;
                    }
/* 186 */           return objM5778d;
/* 120 */           Throwable thM7099a2 = o42.m7099a(objM7932o);
/* 124 */           if (thM7099a2 != null) {
/* 128 */               return new n42(thM7099a2);
                    }
/* 136 */           if (ac2Var.m195b()) {
/* 138 */               gc2Var.f8539a = this;
/* 140 */               gc2Var.f8540b = str;
/* 142 */               gc2Var.f8541c = null;
/* 144 */               gc2Var.f8544f = 2;
/* 146 */               Object objM5779e = this.m5779e(gc2Var);
/* 150 */               if (objM5779e != z10Var) {
/* 154 */                   jc2Var = this;
/* 155 */                   str2 = str;
/* 156 */                   obj = objM5779e;
/* 157 */                   thM7099a = o42.m7099a(obj);
/* 161 */                   if (thM7099a != null) {
/* 165 */                       return new n42(thM7099a);
                            }
/* 169 */                   str = str2;
/* 170 */                   this = jc2Var;
/* 171 */                   gc2Var.f8539a = null;
/* 173 */                   gc2Var.f8540b = null;
/* 175 */                   gc2Var.f8541c = null;
/* 177 */                   gc2Var.f8544f = 3;
/* 179 */                   objM5778d = this.m5778d(str, gc2Var);
/* 183 */                   if (objM5778d == z10Var) {
/* 186 */                       return objM5778d;
                            }
                        }
                    } else {
/* 171 */               gc2Var.f8539a = null;
/* 173 */               gc2Var.f8540b = null;
/* 175 */               gc2Var.f8541c = null;
/* 177 */               gc2Var.f8544f = 3;
/* 179 */               objM5778d = this.m5778d(str, gc2Var);
/* 183 */               if (objM5778d == z10Var) {
/* 186 */                   return objM5778d;
                        }
                    }
/* 185 */           return z10Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: h */
                public final Object m5782h(String str, String str2, d10 d10Var) {
                    hc2 hc2Var;
                    Object objM194a;
/* 3 */             if (d10Var instanceof hc2) {
/* 6 */                 hc2Var = (hc2) d10Var;
/* 8 */                 int i = hc2Var.f9010e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    hc2Var.f9010e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    hc2Var = new hc2(this, d10Var);
                        }
                    } else {
/* 22 */                hc2Var = new hc2(this, d10Var);
                    }
/* 25 */            Object obj = hc2Var.f9008c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = hc2Var.f9010e;
/* 32 */            if (i2 == 0) {
/* 55 */                pg3.m7417A(obj);
/* 74 */                SettingsInitializationParameters settingsInitializationParameters = new SettingsInitializationParameters(this.f12218h, this.f12214d, this.f12212b, str2 == null ? this.f12215e : str2, str);
/* 85 */                ac2 ac2Var = (ac2) this.f12211a.f8068F.getValue();
/* 87 */                hc2Var.f9006a = this;
/* 89 */                hc2Var.f9007b = str2;
/* 91 */                hc2Var.f9010e = 1;
/* 93 */                objM194a = ac2Var.m194a(settingsInitializationParameters, hc2Var);
/* 97 */                if (objM194a == z10Var) {
/* 99 */                    return z10Var;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 50 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 53 */                    return null;
                        }
/* 36 */                str2 = hc2Var.f9007b;
/* 38 */                this = hc2Var.f9006a;
/* 40 */                pg3.m7417A(obj);
/* 45 */                objM194a = ((o42) obj).f14613a;
                    }
/* 100 */           Throwable thM7099a = o42.m7099a(objM194a);
/* 104 */           if (thM7099a != null) {
/* 108 */               return new n42(thM7099a);
                    }
/* 112 */           if (str2 != null) {
/* 114 */               this.getClass();
/* 117 */               this.f12215e = str2;
                    }
/* 119 */           return objM194a;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
                
                    if (r7 == r1) goto L28;
                 */
                /* JADX INFO: renamed from: i */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object m5783i(String str, k91 k91Var, d10 d10Var) throws Throwable {
                    ic2 ic2Var;
                    Object objM5782h;
                    Object objM5780f;
/* 3 */             if (d10Var instanceof ic2) {
/* 6 */                 ic2Var = (ic2) d10Var;
/* 8 */                 int i = ic2Var.f9548e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ic2Var.f9548e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ic2Var = new ic2(this, d10Var);
                        }
                    } else {
/* 22 */                ic2Var = new ic2(this, d10Var);
                    }
/* 25 */            Object obj = ic2Var.f9546c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = ic2Var.f9548e;
/* 34 */            if (i2 != 0) {
/* 36 */                if (i2 == 1) {
/* 54 */                    str = ic2Var.f9545b;
/* 56 */                    this = ic2Var.f9544a;
/* 58 */                    pg3.m7417A(obj);
/* 63 */                    objM5782h = ((o42) obj).f14613a;
                        } else {
/* 38 */                    if (i2 != 2) {
/* 50 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 33 */                        return null;
                            }
/* 40 */                    pg3.m7417A(obj);
/* 45 */                    objM5780f = ((o42) obj).f14613a;
                        }
/* 155 */               Throwable thM7099a = o42.m7099a(objM5780f);
                        return thM7099a != null ? new n42(thM7099a) : Unit.f12910a;
                    }
/* 66 */            pg3.m7417A(obj);
/* 69 */            fb1 fb1Var = this.f12211a;
/* 77 */            p91 p91Var = (p91) fb1Var.f8065C.getValue();
/* 79 */            p91Var.m7371a();
/* 88 */            if (!k91Var.f12657b.m2818a()) {
/* 92 */                p91Var.m7372b(k91Var.f12657b);
                    }
/* 97 */            String str2 = (String) k91Var.f12656a;
/* 99 */            str2.getClass();
/* 102 */           this.f12215e = str2;
/* 114 */           fb1Var.m3699e().mo2906a("Language: ".concat(str2), null);
/* 117 */           ic2Var.f9544a = this;
/* 119 */           ic2Var.f9545b = str;
/* 121 */           ic2Var.f9548e = 1;
/* 123 */           objM5782h = m5782h(str, null, ic2Var);
/* 127 */           if (objM5782h != z10Var) {
                    }
/* 154 */           return z10Var;
/* 130 */           Throwable thM7099a2 = o42.m7099a(objM5782h);
/* 134 */           if (thM7099a2 != null) {
/* 138 */               return new n42(thM7099a2);
                    }
/* 142 */           ic2Var.f9544a = null;
/* 144 */           ic2Var.f9545b = null;
/* 146 */           ic2Var.f9548e = 2;
/* 148 */           objM5780f = this.m5780f(str, ic2Var);
                }

                /* JADX INFO: renamed from: j */
                public final void m5784j(String str, Set set) {
/* 1 */             str.getClass();
/* 4 */             this.f12214d = str;
/* 6 */             this.f12217g = set;
/* 16 */            g80 g80Var = (g80) this.f12211a.f8112z.getValue();
/* 18 */            String str2 = this.f12214d;
/* 20 */            pz2 pz2Var = (pz2) g80Var;
/* 22 */            pz2Var.getClass();
/* 25 */            str2.getClass();
/* 28 */            od2 od2Var = pz2Var.f15354e;
/* 30 */            fh2[] fh2VarArr = fh2.f8216a;
/* 34 */            String strConcat = "settings-".concat(str2);
/* 38 */            od2Var.getClass();
/* 43 */            StorageSettings storageSettings = null;
/* 44 */            String string = od2Var.f14716a.getString(strConcat, null);
/* 48 */            if (string != null && !StringsKt.m6228D(string)) {
/* 72 */                storageSettings = (StorageSettings) b21.m1203a(b21.f2178a, StorageSettings.Companion.serializer(), string, pz2Var.f15351b);
                    }
/* 74 */            if (storageSettings == null) {
/* 78 */                storageSettings = new StorageSettings();
                    }
/* 81 */            pz2Var.f15355f = storageSettings;
/* 85 */            this.f12213c.m1156a(str);
                }

                /* JADX INFO: renamed from: k */
                public final void m5785k() {
/* 11 */            pz2 pz2Var = (pz2) ((g80) this.f12211a.f8112z.getValue());
/* 13 */            pz2Var.getClass();
/* 16 */            od2 od2Var = pz2Var.f15354e;
/* 18 */            fh2[] fh2VarArr = fh2.f8216a;
/* 24 */            od2Var.m7138d("actual_tcf", HttpUrl.FRAGMENT_ENCODE_SET);
/* 27 */            pz2Var.m7630b();
                }

                /* JADX INFO: renamed from: l */
                public final void m5786l() {
/* 1 */             fb1 fb1Var = this.f12211a;
/* 10 */            fb1Var.m3699e().mo2906a("Storage wiped out, given failed initialization and 1st interaction with SDK", null);
/* 23 */            ((pz2) ((g80) fb1Var.f8112z.getValue())).m7629a();
                }
            }
