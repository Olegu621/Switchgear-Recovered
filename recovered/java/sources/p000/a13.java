            package p000;

            import com.usercentrics.ccpa.CCPAData;
            import com.usercentrics.sdk.GeolocationRuleset;
            import com.usercentrics.sdk.UpdatedConsentPayload;
            import com.usercentrics.sdk.UserDecision;
            import com.usercentrics.sdk.UsercentricsConsentHistoryEntry;
            import com.usercentrics.sdk.UsercentricsOptions;
            import com.usercentrics.sdk.UsercentricsReadyStatus;
            import com.usercentrics.sdk.UsercentricsServiceConsent;
            import com.usercentrics.sdk.p009v2.settings.data.CCPASettings;
            import com.usercentrics.sdk.p009v2.settings.data.TCF2Settings;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsService;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.p009v2.settings.data.VariantsSettings;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Unit;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a13 extends u03 {
                public static final v03 Companion = new v03();

                /* JADX INFO: renamed from: a */
                public final fb1 f30a;

                /* JADX INFO: renamed from: b */
                public final UsercentricsOptions f31b;

                /* JADX INFO: renamed from: c */
                public String f32c = HttpUrl.FRAGMENT_ENCODE_SET;

                public a13(fb1 fb1Var, UsercentricsOptions usercentricsOptions) {
/* 4 */             this.f30a = fb1Var;
/* 6 */             this.f31b = usercentricsOptions;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0015  */
                /* JADX INFO: renamed from: e */
                public static final Object m20e(a13 a13Var, String str, d10 d10Var) {
                    x03 x03Var;
                    Object objM7920a;
/* 1 */             fb1 fb1Var = a13Var.f30a;
/* 5 */             if (d10Var instanceof x03) {
/* 8 */                 x03Var = (x03) d10Var;
/* 10 */                int i = x03Var.f18886c;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    x03Var.f18886c = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    x03Var = new x03(a13Var, d10Var);
                        }
                    } else {
/* 24 */                x03Var = new x03(a13Var, d10Var);
                    }
/* 27 */            Object obj = x03Var.f18884a;
/* 29 */            z10 z10Var = z10.f19902a;
/* 31 */            int i2 = x03Var.f18886c;
/* 35 */            if (i2 == 0) {
/* 53 */                pg3.m7417A(obj);
/* 56 */                d40 d40VarM3695a = fb1Var.m3695a();
/* 60 */                hk2 hk2Var = fb1Var.f8068F;
/* 62 */                jh1 jh1VarM2922c = d40VarM3695a.m2922c();
/* 66 */                k61 k61Var = jh1VarM2922c.f12304b;
/* 68 */                ArrayList arrayList = jh1VarM2922c.f12303a;
/* 74 */                ac2 ac2Var = (ac2) hk2Var.getValue();
/* 92 */                k61 k61VarM5996a = k61.m5996a(k61Var, qj3.m7882O(((ac2) hk2Var.getValue()).f182c.f12611b, arrayList), null, 16381);
/* 96 */                ac2Var.getClass();
/* 99 */                ac2Var.f182c = k61VarM5996a;
/* 111 */               ((pz2) ((g80) fb1Var.f8112z.getValue())).m7635g(k61Var, arrayList);
/* 118 */               if (!a13Var.m34o()) {
/* 120 */                   m42 m42Var = o42.f14612b;
/* 122 */                   return Unit.f12910a;
                        }
/* 125 */               il2 il2VarM32m = a13Var.m32m();
/* 129 */               x03Var.f18886c = 1;
/* 133 */               objM7920a = ((qk2) il2VarM32m).m7920a(str, x03Var);
/* 137 */               if (objM7920a == z10Var) {
/* 139 */                   return z10Var;
                        }
                    } else {
/* 37 */                if (i2 != 1) {
/* 49 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 33 */                    return null;
                        }
/* 39 */                pg3.m7417A(obj);
/* 44 */                objM7920a = ((o42) obj).f14613a;
                    }
/* 140 */           Throwable thM7099a = o42.m7099a(objM7920a);
                    return thM7099a != null ? new n42(thM7099a) : Unit.f12910a;
                }

                @Override // p000.u03
                /* JADX INFO: renamed from: a */
                public final void mo21a(Function1 function1) {
/* 25 */            this.f30a.m3696b().m9743b(new w03(this, null, 1)).m3370H(new C1996oc(15, this, function1));
                }

                @Override // p000.u03
                /* JADX INFO: renamed from: b */
                public final UsercentricsReadyStatus mo22b() {
                    Object n42Var;
/* 1 */             fb1 fb1Var = this.f30a;
/* 9 */             jc2 jc2Var = (jc2) fb1Var.f8083U.getValue();
/* 20 */            boolean z = true;
/* 34 */            GeolocationRuleset geolocationRuleset = !StringsKt.m6228D(this.f31b.f6053f) ? new GeolocationRuleset(jc2Var.f12214d, !jc2Var.f12216f) : null;
                    try {
/* 38 */                m42 m42Var = o42.f14612b;
/* 54 */                if (((sx0) fb1Var.f8106t.getValue()).m8649d() == tx0.f17300b) {
/* 57 */                    z = false;
                        }
/* 58 */                n42Var = Boolean.valueOf(z);
                    } catch (Throwable th) {
/* 64 */                m42 m42Var2 = o42.f14612b;
/* 68 */                n42Var = new n42(th);
                    }
/* 79 */            Boolean bool = (Boolean) (n42Var instanceof n42 ? null : n42Var);
/* 101 */           return new UsercentricsReadyStatus(bool != null ? bool.booleanValue() : false, m30k(), geolocationRuleset, ((p91) fb1Var.f8065C.getValue()).f15029b);
                }

                @Override // p000.u03
                /* JADX INFO: renamed from: c */
                public final void mo23c(ez2 ez2Var) {
/* 1 */             fb1 fb1Var = this.f30a;
/* 11 */            String str = ((jc2) fb1Var.f8083U.getValue()).f12214d;
/* 20 */            C2321w7 c2321w7 = (C2321w7) fb1Var.f8079Q.getValue();
/* 22 */            String strM29j = m29j();
/* 26 */            c2321w7.getClass();
/* 29 */            str.getClass();
/* 51 */            c2321w7.f18461c.m9743b(new C2283v7(c2321w7, ez2Var, str, strM29j, (c10) null)).m3369G(new C1983o(c2321w7, 1));
                }

                /* JADX INFO: renamed from: d */
                public final ArrayList m24d() {
/* 1 */             mz2 mz2Var = mz2.f14076a;
/* 3 */             fb1 fb1Var = this.f30a;
/* 15 */            List<m61> list = ((ac2) fb1Var.f8068F.getValue()).f182c.f12611b;
/* 25 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 36 */            for (m61 m61Var : list) {
/* 58 */                arrayList.add(m61.m6609a(m61Var, new i61(m61Var.f13590p.f9465a, true)));
                    }
/* 70 */            fb1Var.m3695a().m2921b(this.f32c, arrayList, kz2.ACCEPT_ALL_SERVICES, mz2Var);
/* 73 */            return m31l();
                }

                /* JADX INFO: renamed from: f */
                public final void m25f(ArrayList arrayList, tk2 tk2Var) {
/* 5 */             if (this.f31b.f6054g) {
/* 35 */                this.f30a.m3696b().m9743b(new C0871e8(this, arrayList, tk2Var, null, 2)).m3370H(new C1983o(this, 26));
                    }
                }

                /* JADX INFO: renamed from: g */
                public final ArrayList m26g() {
/* 1 */             mz2 mz2Var = mz2.f14076a;
/* 3 */             fb1 fb1Var = this.f30a;
/* 15 */            List<m61> list = ((ac2) fb1Var.f8068F.getValue()).f182c.f12611b;
/* 25 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 36 */            for (m61 m61Var : list) {
/* 59 */                arrayList.add(m61.m6609a(m61Var, new i61(m61Var.f13590p.f9465a, m61Var.f13591q)));
                    }
/* 71 */            fb1Var.m3695a().m2921b(this.f32c, arrayList, kz2.DENY_ALL_SERVICES, mz2Var);
/* 74 */            return m31l();
                }

                /* JADX INFO: renamed from: h */
                public final void m27h(String str, String str2, ArrayList arrayList) {
/* 3 */             String str3 = this.f32c;
/* 5 */             boolean zM6228D = StringsKt.m6228D(str3);
/* 9 */             fb1 fb1Var = this.f30a;
/* 11 */            if (zM6228D) {
/* 23 */                str3 = ((ac2) fb1Var.f8068F.getValue()).f182c.f12614e;
                    }
/* 25 */            String str4 = str3;
/* 36 */            CCPASettings cCPASettings = ((ac2) fb1Var.f8068F.getValue()).f182c.f12613d;
/* 84 */            fb1Var.m3696b().m9744c(new C2498yh(new UpdatedConsentPayload(arrayList, str4, str, cCPASettings != null ? cCPASettings.f6381h : false ? ((C2508yr) fb1Var.f8071I.getValue()).m10171a().m2767a() : HttpUrl.FRAGMENT_ENCODE_SET, str2), 28));
                }

                /* JADX INFO: renamed from: i */
                public final Object m28i(o42 o42Var) {
                    List listM2826a;
                    List listM2826a2;
                    UsercentricsSettings usercentricsSettings;
                    UsercentricsSettings usercentricsSettings2;
/* 12 */            if ((o42Var != null ? o42.m7099a(o42Var.f14613a) : null) != null) {
/* 14 */                return o42Var.f14613a;
                    }
/* 21 */            if (m34o()) {
/* 29 */                ((qk2) m32m()).m7927i();
                    }
/* 32 */            UsercentricsOptions usercentricsOptions = this.f31b;
/* 34 */            boolean z = usercentricsOptions.f6054g;
/* 36 */            String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 38 */            fb1 fb1Var = this.f30a;
/* 40 */            if (z) {
/* 48 */                bg1 bg1Var = (bg1) fb1Var.f8085W.getValue();
/* 54 */                kn1 kn1Var = fb1Var.m3700f().f15067d;
/* 56 */                kn1Var.getClass();
/* 59 */                List<UsercentricsService> list = kn1Var.f12893b;
/* 61 */                bg1Var.getClass();
/* 64 */                list.getClass();
/* 67 */                i03 i03Var = bg1Var.f2410b;
/* 71 */                i03Var.mo2906a("Consent Mediation is Enabled", null);
/* 76 */                ArrayList arrayList = new ArrayList();
/* 87 */                for (UsercentricsService usercentricsService : list) {
/* 95 */                    String str2 = usercentricsService.f6666a;
/* 97 */                    if (str2 != null) {
/* 100 */                       ac1 ac1Var = bg1Var.f2409a;
/* 110 */                       if (((Map) ac1Var.f177b).containsKey(str2) || Intrinsics.m6216a((String) ((C0875ec) ac1Var.f179d).f7615d, str2)) {
/* 126 */                           String str3 = usercentricsService.f6670e;
/* 128 */                           if (str3 == null) {
/* 130 */                               str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 131 */                           arrayList.add(str3);
                                }
                            }
                        }
/* 184 */               i03Var.mo2906a("[Mediation] " + arrayList.size() + "/" + list.size() + " Services are supported: " + CollectionsKt.m6203x(arrayList, " | ", null, null, null, 62), null);
                    }
/* 189 */           int i = 1;
/* 190 */           if (usercentricsOptions.f6054g) {
/* 193 */               ArrayList arrayListM30k = m30k();
/* 201 */               if (m34o()) {
/* 208 */                   mo21a(new y03(this, arrayListM30k, i));
                        } else {
/* 212 */                   m25f(arrayListM30k, null);
                        }
                    }
/* 215 */           String strM29j = m29j();
/* 219 */           if (strM29j == null || StringsKt.m6228D(strM29j)) {
/* 260 */               kn1 kn1Var2 = fb1Var.m3700f().f15067d;
/* 271 */               VariantsSettings variantsSettings = (kn1Var2 == null || (usercentricsSettings2 = kn1Var2.f12892a) == null) ? null : usercentricsSettings2.f6693A;
/* 273 */               i = (variantsSettings == null || !variantsSettings.f6752a) ? 0 : 1;
/* 289 */               boolean zM6216a = Intrinsics.m6216a(variantsSettings != null ? variantsSettings.f6754c : null, "UC");
/* 293 */               if (i != 0 && zM6216a) {
/* 303 */                   fb1Var.m3699e().mo2906a("AB Testing 'Activate with Usercentrics' option triggered the variant selection.", null);
/* 306 */                   if (variantsSettings == null || (listM2826a = variantsSettings.m2826a(fb1Var.m3698d())) == null) {
/* 318 */                       listM2826a = nd0.f14189a;
                            }
/* 328 */                   String str4 = (String) CollectionsKt.firstOrNull(C1839a.m6211c(listM2826a));
/* 330 */                   if (str4 != null) {
/* 333 */                       str = str4;
                            }
/* 338 */                   if (!StringsKt.m6228D(str) && !str.equals(m29j())) {
/* 355 */                       kn1 kn1Var3 = fb1Var.m3700f().f15067d;
/* 366 */                       VariantsSettings variantsSettings2 = (kn1Var3 == null || (usercentricsSettings = kn1Var3.f12892a) == null) ? null : usercentricsSettings.f6693A;
/* 367 */                       if (variantsSettings2 == null || (listM2826a2 = variantsSettings2.m2826a(fb1Var.m3698d())) == null) {
/* 379 */                           listM2826a2 = nd0.f14189a;
                                }
/* 412 */                       fb1Var.m3699e().mo2906a("Select AB Testing Variant '" + str + "'. Admin Interface list: " + listM2826a2 + ".", null);
/* 415 */                       listM2826a2.contains(str);
/* 426 */                       pz2 pz2Var = (pz2) ((g80) fb1Var.f8112z.getValue());
/* 428 */                       pz2Var.getClass();
/* 431 */                       od2 od2Var = pz2Var.f15354e;
/* 433 */                       fh2[] fh2VarArr = fh2.f8216a;
/* 437 */                       od2Var.m7138d("ab_testing_variant", str);
                            }
                        }
                    } else {
/* 251 */               fb1Var.m3699e().mo2906a("AB Testing Variant was already selected '" + strM29j + "'.", null);
                    }
/* 440 */           m42 m42Var = o42.f14612b;
/* 442 */           return Unit.f12910a;
                }

                /* JADX INFO: renamed from: j */
                public final String m29j() {
/* 13 */            od2 od2Var = ((pz2) ((g80) this.f30a.f8112z.getValue())).f15354e;
/* 15 */            fh2[] fh2VarArr = fh2.f8216a;
/* 17 */            od2Var.getClass();
/* 25 */            return od2Var.f14716a.getString("ab_testing_variant", null);
                }

                /* JADX INFO: renamed from: k */
                public final ArrayList m30k() {
/* 13 */            List<m61> list = ((ac2) this.f30a.f8068F.getValue()).f182c.f12611b;
/* 23 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 34 */            for (m61 m61Var : list) {
/* 42 */                m61Var.getClass();
/* 45 */                String str = m61Var.f13580f;
/* 47 */                i61 i61Var = m61Var.f13590p;
/* 49 */                boolean z = i61Var.f9466b;
/* 51 */                List<j61> list2 = i61Var.f9465a;
/* 59 */                ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(list2, 10));
/* 70 */                for (j61 j61Var : list2) {
/* 78 */                    j61Var.getClass();
/* 92 */                    arrayList2.add(new UsercentricsConsentHistoryEntry(j61Var.f12096b, j61Var.f12097c, j61Var.f12099e));
                        }
/* 104 */               j61 j61Var2 = (j61) CollectionsKt.m6205z(m61Var.f13590p.f9465a);
/* 127 */               arrayList.add(new UsercentricsServiceConsent(str, z, arrayList2, j61Var2 != null ? j61Var2.f12097c : null, m61Var.f13582h, m61Var.f13587m, m61Var.f13591q, m61Var.f13588n));
                    }
/* 131 */           return arrayList;
                }

                /* JADX INFO: renamed from: l */
                public final ArrayList m31l() {
/* 1 */             ArrayList arrayListM30k = m30k();
/* 9 */             if (m34o()) {
/* 27 */                mo21a(new y03(this, arrayListM30k, 0));
/* 30 */                return arrayListM30k;
                    }
/* 12 */            m25f(arrayListM30k, null);
/* 17 */            m27h(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, arrayListM30k);
/* 20 */            return arrayListM30k;
                }

                /* JADX INFO: renamed from: m */
                public final il2 m32m() {
/* 9 */             return (il2) this.f30a.f8073K.getValue();
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
                
                    if (r8 == r1) goto L29;
                 */
                /* JADX INFO: renamed from: n */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object m33n(boolean z, d10 d10Var) {
                    z03 z03Var;
                    jc2 jc2Var;
                    Object objM5777c;
/* 3 */             if (d10Var instanceof z03) {
/* 6 */                 z03Var = (z03) d10Var;
/* 8 */                 int i = z03Var.f19901e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    z03Var.f19901e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    z03Var = new z03(this, d10Var);
                        }
                    } else {
/* 22 */                z03Var = new z03(this, d10Var);
                    }
/* 25 */            Object obj = z03Var.f19899c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = z03Var.f19901e;
                    try {
                        try {
/* 34 */                    if (i2 == 0) {
/* 67 */                        pg3.m7417A(obj);
/* 70 */                        fb1 fb1Var = this.f30a;
/* 80 */                        ((fn1) fb1Var.f8090d.getValue()).f8291a = z;
/* 88 */                        jc2Var = (jc2) fb1Var.f8083U.getValue();
/* 90 */                        UsercentricsOptions usercentricsOptions = this.f31b;
/* 92 */                        z03Var.f19897a = this;
/* 94 */                        z03Var.f19898b = jc2Var;
/* 96 */                        z03Var.f19901e = 1;
/* 102 */                       if (jc2Var.m5775a(usercentricsOptions, z03Var) != z10Var) {
                                }
/* 143 */                       return z10Var;
                            }
/* 36 */                    if (i2 == 1) {
/* 56 */                        jc2 jc2Var2 = z03Var.f19898b;
/* 58 */                        a13 a13Var = z03Var.f19897a;
/* 60 */                        pg3.m7417A(obj);
/* 64 */                        jc2Var = jc2Var2;
/* 65 */                        this = a13Var;
                            } else {
/* 38 */                        if (i2 != 2) {
/* 52 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 33 */                            return null;
                                }
/* 40 */                        this = z03Var.f19897a;
/* 42 */                        pg3.m7417A(obj);
/* 47 */                        objM5777c = ((o42) obj).f14613a;
                            }
/* 149 */                   return this.m28i(new o42(objM5777c));
/* 119 */                   String str = ((pz2) ((g80) this.f30a.f8112z.getValue())).f15355f.f6139a;
/* 125 */                   if (!StringsKt.m6228D(str)) {
/* 127 */                       this.f32c = str;
                            }
/* 129 */                   String str2 = this.f32c;
/* 131 */                   z03Var.f19897a = this;
/* 133 */                   z03Var.f19898b = null;
/* 135 */                   z03Var.f19901e = 2;
/* 137 */                   objM5777c = jc2Var.m5777c(str2, z03Var);
                        } catch (vz2 e) {
/* 160 */                   m42 m42Var = o42.f14612b;
/* 164 */                   return new n42(e);
                        }
                    } catch (Throwable unused) {
/* 154 */               return this.m28i(null);
                    }
                }

                /* JADX INFO: renamed from: o */
                public final boolean m34o() {
/* 13 */            return ((ac2) this.f30a.f8068F.getValue()).f182c.f12616g;
                }

                /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
                /* JADX INFO: renamed from: p */
                public final ArrayList m35p(List list) {
                    boolean z;
/* 1 */             mz2 mz2Var = mz2.f14076a;
/* 3 */             list.getClass();
/* 6 */             fb1 fb1Var = this.f30a;
/* 18 */            List list2 = ((ac2) fb1Var.f8068F.getValue()).f182c.f12611b;
/* 26 */            TCF2Settings tCF2SettingsM7928j = ((qk2) m32m()).m7928j();
/* 36 */            boolean z2 = tCF2SettingsM7928j != null ? tCF2SettingsM7928j.f6492W : false;
/* 44 */            if (m34o() && list.isEmpty() && z2) {
/* 64 */                boolean z3 = !((qk2) m32m()).m7922d();
/* 71 */                ArrayList arrayList = new ArrayList(C2122qw.m8020h(list2, 10));
/* 74 */                Iterator it = list2.iterator();
/* 82 */                while (it.hasNext()) {
/* 97 */                    arrayList.add(new UserDecision(((m61) it.next()).f13580f, z3));
                        }
/* 101 */               list = arrayList;
                    }
/* 106 */           int iM6962c = nc1.m6962c(C2122qw.m8020h(list, 10));
/* 112 */           if (iM6962c < 16) {
/* 114 */               iM6962c = 16;
                    }
/* 117 */           LinkedHashMap linkedHashMap = new LinkedHashMap(iM6962c);
/* 128 */           for (UserDecision userDecision : list) {
/* 144 */               linkedHashMap.put(userDecision.f6034a, Boolean.valueOf(userDecision.f6035b));
                    }
/* 150 */           ArrayList<m61> arrayList2 = new ArrayList();
/* 161 */           for (Object obj : list2) {
/* 176 */               if (linkedHashMap.containsKey(((m61) obj).f13580f)) {
/* 178 */                   arrayList2.add(obj);
                        }
                    }
/* 188 */           ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(arrayList2, 10));
/* 199 */           for (m61 m61Var : arrayList2) {
/* 209 */               if (m61Var.f13591q) {
/* 235 */                   z = true;
                        } else {
/* 217 */                   Boolean bool = (Boolean) linkedHashMap.get(m61Var.f13580f);
/* 230 */                   if (bool != null ? bool.booleanValue() : m61Var.f13590p.f9466b) {
/* 235 */                       z = true;
                            } else {
/* 233 */                       z = false;
                            }
                        }
/* 249 */               arrayList3.add(m61.m6609a(m61Var, new i61(m61Var.f13590p.f9465a, z)));
                    }
/* 257 */           if (!arrayList3.isEmpty()) {
/* 267 */               fb1Var.m3695a().m2921b(this.f32c, arrayList3, kz2.UPDATE_SERVICES, mz2Var);
                    }
/* 270 */           return m31l();
                }

                /* JADX INFO: renamed from: q */
                public final ArrayList m36q(boolean z) {
/* 1 */             mz2 mz2Var = mz2.f14076a;
/* 3 */             fb1 fb1Var = this.f30a;
/* 15 */            CCPASettings cCPASettings = ((ac2) fb1Var.f8068F.getValue()).f182c.f12613d;
/* 24 */            if (!(cCPASettings != null ? cCPASettings.f6381h : false)) {
/* 33 */                fb1Var.m3699e().mo2907b("CCPA was not configured", null);
                        return z ? m26g() : m24d();
                    }
/* 54 */            C2508yr c2508yr = (C2508yr) fb1Var.f8071I.getValue();
/* 56 */            Boolean bool = Boolean.TRUE;
/* 58 */            g80 g80Var = c2508yr.f19765a;
/* 65 */            long jM4115c = new h50().m4115c();
/* 71 */            od2 od2Var = ((pz2) g80Var).f15354e;
/* 73 */            fh2[] fh2VarArr = fh2.f8216a;
/* 81 */            od2Var.m7138d("ccpa_timestamp_millis", String.valueOf(jM4115c));
/* 98 */            c2508yr.f19768d.m2768a(new CCPAData(1, bool, Boolean.valueOf(z), c2508yr.f19767c));
/* 106 */           kz2 kz2Var = z ? kz2.DENY_ALL_SERVICES : kz2.ACCEPT_ALL_SERVICES;
/* 118 */           List<m61> list = ((ac2) fb1Var.f8068F.getValue()).f182c.f12611b;
/* 128 */           ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 139 */           for (m61 m61Var : list) {
/* 170 */               arrayList.add(m61.m6609a(m61Var, new i61(m61Var.f13590p.f9465a, m61Var.f13591q || !z)));
                    }
/* 180 */           fb1Var.m3695a().m2921b(this.f32c, arrayList, kz2Var, mz2Var);
/* 183 */           return m31l();
                }
            }
