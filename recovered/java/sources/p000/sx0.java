            package p000;

            import com.usercentrics.ccpa.CCPAData;
            import com.usercentrics.sdk.p009v2.consent.data.DataTransferObject;
            import com.usercentrics.sdk.p009v2.location.data.UsercentricsLocation;
            import com.usercentrics.sdk.p009v2.settings.data.CCPASettings;
            import com.usercentrics.sdk.p009v2.settings.data.TCF2Settings;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageVendor;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import kotlin.text.StringsKt__StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sx0 {
                public static final qx0 Companion = new qx0();

                /* JADX INFO: renamed from: m */
                public static final EnumC0185bm f16838m = EnumC0185bm.f2532a;

                /* JADX INFO: renamed from: a */
                public final d40 f16839a;

                /* JADX INFO: renamed from: b */
                public final g80 f16840b;

                /* JADX INFO: renamed from: c */
                public final ac2 f16841c;

                /* JADX INFO: renamed from: d */
                public final p91 f16842d;

                /* JADX INFO: renamed from: e */
                public final il2 f16843e;

                /* JADX INFO: renamed from: f */
                public final C0875ec f16844f;

                /* JADX INFO: renamed from: g */
                public final kp0 f16845g;

                /* JADX INFO: renamed from: h */
                public final kp0 f16846h;

                /* JADX INFO: renamed from: i */
                public final jc2 f16847i;

                /* JADX INFO: renamed from: j */
                public final C2484y3 f16848j;

                /* JADX INFO: renamed from: k */
                public final i03 f16849k;

                /* JADX INFO: renamed from: l */
                public g13 f16850l;

                public sx0(d40 d40Var, g80 g80Var, ac2 ac2Var, p91 p91Var, il2 il2Var, C0875ec c0875ec, kp0 kp0Var, kp0 kp0Var2, jc2 jc2Var, C2484y3 c2484y3, i03 i03Var) {
/* 1 */             d40Var.getClass();
/* 4 */             g80Var.getClass();
/* 7 */             ac2Var.getClass();
/* 10 */            p91Var.getClass();
/* 13 */            il2Var.getClass();
/* 16 */            jc2Var.getClass();
/* 19 */            c2484y3.getClass();
/* 22 */            i03Var.getClass();
/* 28 */            this.f16839a = d40Var;
/* 30 */            this.f16840b = g80Var;
/* 32 */            this.f16841c = ac2Var;
/* 34 */            this.f16842d = p91Var;
/* 36 */            this.f16843e = il2Var;
/* 38 */            this.f16844f = c0875ec;
/* 40 */            this.f16845g = kp0Var;
/* 42 */            this.f16846h = kp0Var2;
/* 44 */            this.f16847i = jc2Var;
/* 46 */            this.f16848j = c2484y3;
/* 48 */            this.f16849k = i03Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m8646a(String str, List list) {
/* 1 */             Iterator it = list.iterator();
/* 10 */            while (it.hasNext()) {
/* 16 */                m61 m61Var = (m61) it.next();
/* 27 */                m61Var.f13590p = new i61(m61Var.f13590p.f9465a, true);
                    }
/* 36 */            this.f16839a.m2921b(str, list, kz2.NON_EU_REGION, mz2.f14077b);
/* 39 */            ac2 ac2Var = this.f16841c;
/* 43 */            boolean z = ac2Var.f182c.f12616g;
/* 45 */            String strM7909t = HttpUrl.FRAGMENT_ENCODE_SET;
/* 47 */            if (z) {
/* 53 */                ((qk2) this.f16843e).m7939x(HttpUrl.FRAGMENT_ENCODE_SET);
/* 60 */                if (ac2Var.m195b()) {
/* 64 */                    this.f16848j.m10093a();
                        }
                    }
/* 69 */            String str2 = ac2Var.f182c.f12621l;
/* 71 */            g13 g13Var = this.f16850l;
/* 83 */            int i = g13Var == null ? -1 : rx0.f16336a[g13Var.ordinal()];
/* 85 */            if (i == 1) {
/* 102 */               strM7909t = qj3.m7909t("##us_framework## | Accept all implicitly cause: It is the first initialization", str2);
                    } else if (i == 2) {
/* 97 */                strM7909t = "TCF | Accept all non-IAB services implicitly cause: The 'Apply GDPR only to EU users' option is enabled and it is the first initialization";
                    } else if (i == 3) {
/* 94 */                strM7909t = "GDPR | Accept all implicitly cause: It is the first initialization, the 'Display CMP only to EU users' option is enabled and the user is not in EU";
                    }
/* 109 */           this.f16849k.mo2906a(strM7909t, null);
                }

                /* JADX INFO: renamed from: b */
                public final Unit m8647b(String str, boolean z) {
                    g13 g13Var;
                    EnumC0185bm enumC0185bm;
/* 3 */             k61 k61Var = this.f16841c.f182c;
/* 7 */             UsercentricsLocation usercentricsLocation = this.f16842d.f15029b;
/* 9 */             CCPASettings cCPASettings = k61Var.f12613d;
/* 26 */            boolean z2 = (cCPASettings != null && cCPASettings.f6381h) || k61Var.f12621l != null;
/* 27 */            boolean z3 = k61Var.f12616g;
/* 29 */            if (z2) {
/* 31 */                if (cCPASettings == null || (enumC0185bm = cCPASettings.f6382i) == null) {
/* 37 */                    enumC0185bm = f16838m;
                        }
/* 39 */                int iOrdinal = enumC0185bm.ordinal();
/* 45 */                if (iOrdinal == 0) {
/* 74 */                    String str2 = usercentricsLocation.f6359b;
/* 101 */                   g13Var = (Intrinsics.m6216a(usercentricsLocation.f6358a, "US") && (Intrinsics.m6216a(str2, "CA") || C1852e.m6257g(str2, "CA", false))) ? g13.f8433b : g13.f8432a;
                        } else if (iOrdinal == 1) {
/* 71 */                    g13Var = Intrinsics.m6216a(usercentricsLocation.f6358a, "US") ? g13.f8433b : g13.f8432a;
                        } else {
/* 50 */                    if (iOrdinal != 2) {
/* 55 */                        ds0.m3187b();
/* 58 */                        return null;
                            }
/* 52 */                    g13Var = g13.f8433b;
                        }
                    } else {
/* 109 */               g13Var = z3 ? g13.f8434c : g13.f8432a;
                    }
/* 111 */           this.f16850l = g13Var;
/* 113 */           m8648c(str, z);
/* 116 */           return Unit.f12910a;
                }

                /* JADX WARN: Code duplicated, block: B:17:0x004f  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: c */
                public final void m8648c(String str, boolean z) {
                    jh1 jh1VarM2922c;
                    ArrayList arrayList;
                    ArrayList arrayListM2920a;
                    boolean z2;
/* 5 */             str.getClass();
/* 8 */             ac2 ac2Var = this.f16841c;
/* 10 */            k61 k61Var = ac2Var.f182c;
/* 14 */            UsercentricsLocation usercentricsLocation = this.f16842d.f15029b;
/* 16 */            g13 g13Var = this.f16850l;
/* 18 */            d40 d40Var = this.f16839a;
/* 20 */            int i = 1;
/* 21 */            Object[] objArr = 0;
/* 22 */            if (z) {
/* 24 */                g13Var.getClass();
/* 31 */                boolean zM8650e = m8650e(g13Var, k61Var, usercentricsLocation.m2819b());
/* 35 */                k61 k61Var2 = ac2Var.f182c;
/* 37 */                if (zM8650e) {
/* 41 */                    m8646a(str, k61Var2.f12611b);
                        } else {
/* 45 */                    List<m61> list = k61Var2.f12611b;
/* 55 */                    for (m61 m61Var : list) {
/* 65 */                        if (m61Var.f13591q) {
/* 80 */                            z2 = true;
                                } else {
/* 67 */                            Boolean bool = m61Var.f13600z;
/* 69 */                            z2 = false;
/* 78 */                            if (bool != null ? bool.booleanValue() : false) {
/* 80 */                                z2 = true;
                                    }
                                }
/* 90 */                        m61Var.f13590p = new i61(m61Var.f13590p.f9465a, z2);
                            }
/* 97 */                    d40Var.m2921b(str, list, kz2.INITIAL_PAGE_LOAD, mz2.f14077b);
/* 104 */                   if (ac2Var.f182c.f12616g) {
/* 112 */                       ((qk2) this.f16843e).m7939x(HttpUrl.FRAGMENT_ENCODE_SET);
/* 119 */                       if (ac2Var.m195b()) {
/* 121 */                           C2484y3 c2484y3 = this.f16848j;
/* 127 */                           if (c2484y3.m10094b()) {
/* 131 */                               c2484y3.m10098f(nd0.f14189a);
                                    }
                                }
                            }
                        }
/* 134 */               CCPASettings cCPASettings = k61Var.f12613d;
/* 136 */               if (cCPASettings == null || !cCPASettings.f6381h || this.f16850l == g13.f8433b) {
/* 341 */                   return;
                        }
/* 152 */               C2508yr c2508yr = (C2508yr) this.f16844f.f7615d;
/* 158 */               od2 od2Var = ((pz2) c2508yr.f19765a).f15354e;
/* 160 */               fh2[] fh2VarArr = fh2.f8216a;
/* 170 */               od2Var.m7138d("ccpa_timestamp_millis", String.valueOf(0L));
/* 180 */               c2508yr.f19768d.m2768a(new CCPAData(1, null, null, null));
/* 183 */               return;
                    }
/* 184 */           g13Var.getClass();
/* 191 */           boolean zM8650e2 = m8650e(g13Var, k61Var, usercentricsLocation.m2819b());
/* 195 */           ac2 ac2Var2 = d40Var.f6973b;
/* 199 */           kn1 kn1Var = d40Var.f6974c.f15067d;
/* 207 */           UsercentricsSettings usercentricsSettings = kn1Var != null ? kn1Var.f12892a : null;
/* 208 */           if (usercentricsSettings == null) {
/* 210 */               jh1VarM2922c = null;
                    } else {
/* 213 */               jh1VarM2922c = d40Var.m2922c();
/* 217 */               ArrayList arrayList2 = jh1VarM2922c.f12303a;
/* 219 */               k61 k61Var3 = jh1VarM2922c.f12304b;
/* 221 */               ArrayList arrayList3 = jh1VarM2922c.f12305c;
/* 223 */               ArrayList arrayList4 = jh1VarM2922c.f12306d;
/* 225 */               boolean zIsEmpty = arrayList3.isEmpty();
/* 229 */               if (zIsEmpty) {
/* 253 */                   arrayList = arrayList4;
/* 255 */                   arrayListM2920a = arrayList2;
                        } else {
/* 240 */                   arrayList = arrayList4;
/* 248 */                   arrayListM2920a = d40Var.m2920a(str, arrayList2, DataTransferObject.Companion.m2817a(DataTransferObject.Companion, usercentricsSettings, k61Var3.f12614e, arrayList3, kz2.ESSENTIAL_CHANGE, mz2.f14077b));
                        }
/* 260 */               if (!arrayList.isEmpty() && !zM8650e2) {
/* 278 */                   arrayListM2920a = d40Var.m2920a(str, arrayList2, DataTransferObject.Companion.m2817a(DataTransferObject.Companion, usercentricsSettings, k61Var3.f12614e, arrayList, kz2.INITIAL_PAGE_LOAD, mz2.f14077b));
                        }
/* 292 */               k61 k61VarM5996a = k61.m5996a(k61Var3, qj3.m7882O(ac2Var2.f182c.f12611b, arrayListM2920a), null, 16381);
/* 296 */               ac2Var2.f182c = k61VarM5996a;
/* 302 */               ((pz2) d40Var.f6975d).m7635g(k61VarM5996a, arrayListM2920a);
/* 305 */               if (!zIsEmpty) {
/* 311 */                   C1945mz c1945mz = (C1945mz) d40Var.f6972a;
/* 320 */                   c1945mz.f14069a.m9743b(new C2107qh(c1945mz, kz2.ESSENTIAL_CHANGE, objArr == true ? 1 : 0, i));
                        }
                    }
/* 325 */           ArrayList arrayList5 = jh1VarM2922c != null ? jh1VarM2922c.f12306d : null;
/* 327 */           if (arrayList5 == null || arrayList5.isEmpty() || !zM8650e2) {
/* 341 */               return;
                    }
/* 338 */           m8646a(str, arrayList5);
                }

                /* JADX WARN: Code duplicated, block: B:23:0x0060  */
                /* JADX WARN: Code duplicated, block: B:62:0x0102  */
                /* JADX WARN: Code duplicated, block: B:78:0x0164 A[EDGE_INSN: B:78:0x0164->B:79:0x0165 BREAK  A[LOOP:2: B:73:0x0142->B:230:?]] */
                /* JADX INFO: renamed from: d */
                public final tx0 m8649d() {
                    boolean z;
                    Integer num;
                    Long lValueOf;
                    boolean z2;
                    boolean z3;
                    Object objM6185D;
                    List list;
/* 3 */             kp0 kp0Var = this.f16846h;
/* 5 */             g80 g80Var = kp0Var.f12967b;
/* 11 */            if (this.f16847i.f12216f) {
/* 13 */                return tx0.f17300b;
                    }
/* 16 */            g13 g13Var = this.f16850l;
/* 19 */            if (g13Var == null) {
/* 977 */               f42.m3656l("No variant value");
/* 18 */                return null;
                    }
/* 27 */            hk2 hk2VarM8065b = r51.m8065b(new C0908f8(this, 2));
/* 33 */            k61 k61Var = this.f16841c.f182c;
/* 35 */            Long l = k61Var.f12622m;
/* 51 */            Long lValueOf2 = l != null ? Long.valueOf(l.longValue() * 1000) : null;
/* 54 */            pz2 pz2Var = (pz2) this.f16840b;
/* 56 */            Long lM7632d = pz2Var.m7632d();
/* 60 */            od2 od2Var = pz2Var.f15354e;
/* 62 */            fh2[] fh2VarArr = fh2.f8216a;
/* 64 */            od2Var.getClass();
/* 71 */            String string = od2Var.f14716a.getString("user_action_required", null);
/* 76 */            boolean z4 = false;
/* 94 */            boolean z5 = lM7632d != null && (string != null && Boolean.parseBoolean(string));
/* 95 */            if (lValueOf2 != null) {
/* 99 */                Long lM7632d2 = pz2Var.m7632d();
/* 110 */               long jLongValue = lM7632d2 != null ? lM7632d2.longValue() : 0L;
/* 131 */               boolean z6 = new h50().m4115c() > lValueOf2.longValue();
/* 142 */               boolean z7 = jLongValue < lValueOf2.longValue();
/* 143 */               if (z6 && z7) {
/* 147 */                   z = true;
                        } else {
/* 97 */                    z = false;
                        }
                    } else {
/* 97 */                z = false;
                    }
/* 148 */           int iOrdinal = g13Var.ordinal();
/* 156 */           if (iOrdinal == 0) {
/* 837 */               gp0 gp0Var = k61Var.f12612c;
/* 845 */               boolean zM2819b = ((UsercentricsLocation) hk2VarM8065b.getValue()).m2819b();
/* 849 */               i03 i03Var = kp0Var.f12966a;
/* 856 */               boolean z8 = gp0Var != null ? gp0Var.f8760a : false;
/* 868 */               int iIntValue = (gp0Var == null || (num = gp0Var.f8761b) == null) ? 0 : num.intValue();
/* 881 */               boolean z9 = ((pz2) g80Var).m7632d() == null;
/* 882 */               if (z) {
/* 885 */                   i03Var.mo2906a("SHOW_CMP cause: The 'Manual Resurface option' on Admin Interface was triggered", null);
/* 888 */                   return tx0.f17299a;
                        }
/* 892 */               if (z8 && !zM2819b) {
/* 896 */                   return tx0.f17300b;
                        }
/* 899 */               if (z9) {
/* 903 */                   i03Var.mo2906a("SHOW_CMP cause: [GDPR] This user has not yet provided consent", null);
/* 906 */                   return tx0.f17299a;
                        }
/* 911 */               Long lM7632d3 = ((pz2) g80Var).m7632d();
/* 915 */               if (iIntValue != 0 && lM7632d3 != null) {
/* 929 */                   h50 h50VarM4113a = new h50(lM7632d3.longValue()).m4113a(2, iIntValue);
/* 938 */                   long jM4115c = new h50().m4115c();
/* 942 */                   long jM4115c2 = h50VarM4113a.m4115c();
/* 948 */                   if (jM4115c >= jM4115c2 && jM4115c != jM4115c2) {
/* 958 */                       i03Var.mo2906a("SHOW_CMP cause: [GDPR] The 'Reshow GDPR CMP' option is enabled and the configured time has passed", null);
/* 961 */                       return tx0.f17299a;
                            }
                        }
/* 964 */               if (!z5) {
/* 972 */                   return tx0.f17300b;
                        }
/* 966 */               i03Var.mo2906a("SHOW_CMP cause: Settings version has changed", null);
/* 969 */               return tx0.f17299a;
                    }
/* 158 */           if (iOrdinal == 1) {
/* 647 */               CCPASettings cCPASettings = k61Var.f12613d;
/* 649 */               String str = k61Var.f12621l;
/* 651 */               C0875ec c0875ec = this.f16844f;
/* 655 */               i03 i03Var2 = (i03) c0875ec.f7613b;
/* 665 */               Boolean bool = ((C2508yr) c0875ec.f7615d).m10171a().f6018c;
/* 671 */               pz2 pz2Var2 = (pz2) ((g80) c0875ec.f7614c);
/* 673 */               pz2Var2.getClass();
                        try {
/* 676 */                   od2 od2Var2 = pz2Var2.f15354e;
/* 680 */                   od2Var2.getClass();
/* 686 */                   String string2 = od2Var2.f14716a.getString("ccpa_timestamp_millis", null);
/* 701 */                   lValueOf = string2 != null ? Long.valueOf(Long.parseLong(string2)) : null;
                        } catch (Throwable unused) {
                        }
/* 707 */               boolean z10 = lValueOf == null;
/* 710 */               z4 = cCPASettings != null ? cCPASettings.f6383j : false;
/* 712 */               if (z) {
/* 715 */                   i03Var2.mo2906a("SHOW_CMP cause: The 'Manual Resurface option' on Admin Interface was triggered", null);
/* 718 */                   return tx0.f17299a;
                        }
/* 723 */               if (z5) {
/* 725 */                   i03Var2.mo2906a("SHOW_CMP cause: Settings version has changed", null);
/* 728 */                   return tx0.f17299a;
                        }
/* 737 */               if (Intrinsics.m6216a(bool, Boolean.FALSE)) {
/* 739 */                   return tx0.f17300b;
                        }
/* 742 */               if (z10 && z4) {
/* 753 */                   i03Var2.mo2906a(qj3.m7909t("SHOW_CMP cause: [##us_framework##] The 'Show CMP on first time visit' option is enabled and it is the first initialization", str), null);
/* 756 */                   return tx0.f17299a;
                        }
/* 768 */               Integer numValueOf = cCPASettings != null ? Integer.valueOf(cCPASettings.f6384k) : null;
/* 769 */               if (numValueOf != null && lValueOf != null) {
/* 817 */                   if (((Number) new h50().f8898a.getValue()).intValue() - ((Number) new h50(lValueOf.longValue()).f8898a.getValue()).intValue() > numValueOf.intValue()) {
/* 826 */                       i03Var2.mo2906a(qj3.m7909t("SHOW_CMP cause: [##us_framework##] The 'Reshow ##us_framework## CMP' configured time has passed", str), null);
/* 829 */                       return tx0.f17299a;
                            }
                        }
/* 832 */               return tx0.f17300b;
                    }
/* 160 */           if (iOrdinal != 2) {
/* 641 */               ds0.m3187b();
/* 18 */                return null;
                    }
/* 162 */           il2 il2Var = this.f16843e;
/* 165 */           qk2 qk2Var = (qk2) il2Var;
/* 167 */           TCF2Settings tCF2SettingsM7928j = qk2Var.m7928j();
/* 171 */           tCF2SettingsM7928j.getClass();
/* 176 */           if (tCF2SettingsM7928j.f6494Y) {
/* 178 */               ArrayList arrayListM7924f = qk2Var.m7924f();
/* 186 */               if (arrayListM7924f.isEmpty()) {
/* 259 */                   z2 = false;
                        } else {
/* 189 */                   Iterator it = arrayListM7924f.iterator();
                            while (true) {
/* 197 */                       if (it.hasNext()) {
/* 203 */                           TCFVendor tCFVendor = (TCFVendor) it.next();
/* 217 */                           StorageVendor storageVendor = (StorageVendor) qk2Var.f15612o.get(Integer.valueOf(tCFVendor.f6209d));
/* 219 */                           if (storageVendor != null) {
/* 222 */                               StorageVendor storageVendorM6682F = mn0.m6682F(tCFVendor);
/* 234 */                               if (!storageVendor.f6149a.containsAll(storageVendorM6682F.f6149a) || !storageVendor.f6150b.containsAll(storageVendorM6682F.f6150b) || !storageVendor.f6151c.containsAll(storageVendorM6682F.f6151c)) {
                                        }
                                    }
/* 257 */                           z2 = true;
                                } else {
/* 259 */                           z2 = false;
                                }
                            }
                        }
                    } else {
/* 259 */               z2 = false;
                    }
/* 260 */           TCF2Settings tCF2SettingsM7928j2 = qk2Var.m7928j();
/* 264 */           tCF2SettingsM7928j2.getClass();
/* 269 */           if (!tCF2SettingsM7928j2.f6495Z) {
/* 357 */               z3 = false;
                        break;
                    }
/* 271 */           ArrayList arrayListM7924f2 = qk2Var.m7924f();
/* 283 */           ArrayList arrayList = new ArrayList(C2122qw.m8020h(arrayListM7924f2, 10));
/* 286 */           Iterator it2 = arrayListM7924f2.iterator();
/* 294 */           while (it2.hasNext()) {
/* 308 */               arrayList.add(Integer.valueOf(((TCFVendor) it2.next()).f6209d));
                    }
/* 316 */           if (!arrayList.isEmpty()) {
/* 319 */               Iterator it3 = arrayList.iterator();
                        while (true) {
/* 327 */                   if (!it3.hasNext()) {
/* 357 */                       z3 = false;
                                break;
                            }
/* 353 */                   if (!qk2Var.f15612o.keySet().contains(Integer.valueOf(((Number) it3.next()).intValue()))) {
/* 355 */                       z3 = true;
                                break;
                            }
                        }
                    } else {
/* 357 */               z3 = false;
                        break;
                    }
/* 368 */           boolean z11 = ((pz2) g80Var).m7632d() == null;
/* 369 */           TCF2Settings tCF2SettingsM7928j3 = qk2Var.m7928j();
/* 373 */           tCF2SettingsM7928j3.getClass();
/* 378 */           if (tCF2SettingsM7928j3.f6493X) {
/* 384 */               ((pz2) qk2Var.f15600c).m7632d();
                    }
/* 387 */           TCF2Settings tCF2SettingsM7928j4 = qk2Var.m7928j();
/* 391 */           tCF2SettingsM7928j4.getClass();
/* 394 */           boolean z12 = tCF2SettingsM7928j4.f6493X;
/* 396 */           il2Var.getClass();
/* 399 */           qk2 qk2Var2 = (qk2) il2Var;
/* 403 */           qk2Var2.f15610m.getClass();
/* 406 */           TCF2Settings tCF2SettingsM7928j5 = qk2Var2.m7928j();
/* 426 */           if (!Intrinsics.m6216a(tCF2SettingsM7928j5 != null ? Boolean.valueOf(tCF2SettingsM7928j5.f6513i0) : null, Boolean.FALSE)) {
/* 429 */               C2484y3 c2484y3 = qk2Var2.f15603f;
/* 431 */               TCF2Settings tCF2SettingsM7928j6 = qk2Var2.m7928j();
/* 435 */               if (tCF2SettingsM7928j6 == null || (list = tCF2SettingsM7928j6.f6511h0) == null || (objM6185D = CollectionsKt.m6185D(list)) == null) {
/* 447 */                   objM6185D = nd0.f14189a;
                        }
/* 449 */               c2484y3.getClass();
/* 452 */               objM6185D.getClass();
/* 455 */               String str2 = c2484y3.f19467e;
/* 457 */               if (str2 == null) {
/* 459 */                   str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 7 */                 List listSplit$default = StringsKt__StringsKt.split$default(str2, new String[]{"2~", "dv.", ".", "~"}, false, 0, 6, null);
/* 482 */               ArrayList arrayList2 = new ArrayList();
/* 485 */               Iterator it4 = listSplit$default.iterator();
/* 493 */               while (it4.hasNext()) {
/* 501 */                   Integer intOrNull = StringsKt.toIntOrNull((String) it4.next());
/* 505 */                   if (intOrNull != null) {
/* 507 */                       arrayList2.add(intOrNull);
                            }
                        }
/* 519 */               z4 = !objM6185D.equals(CollectionsKt.m6185D(arrayList2));
                    }
/* 521 */           kp0 kp0Var2 = this.f16845g;
/* 523 */           i03 i03Var3 = kp0Var2.f12966a;
/* 525 */           if (z) {
/* 528 */               i03Var3.mo2906a("SHOW_CMP cause: The 'Manual Resurface option' on Admin Interface was triggered", null);
/* 531 */               return tx0.f17299a;
                    }
/* 535 */           if (z5) {
/* 537 */               i03Var3.mo2906a("SHOW_CMP cause: Settings version has changed", null);
/* 540 */               return tx0.f17299a;
                    }
/* 543 */           if (z11) {
/* 547 */               i03Var3.mo2906a("SHOW_CMP cause: [TCF] This user has not yet provided consent (not even on GDPR services)", null);
/* 550 */               return tx0.f17299a;
                    }
/* 553 */           if (z2) {
/* 557 */               i03Var3.mo2906a("SHOW_CMP cause: [TCF] The 'Resurface UI' option is enabled and selected vendors include undisclosed or changes in their declared Legal Basis", null);
/* 560 */               return tx0.f17299a;
                    }
/* 563 */           if (z3) {
/* 567 */               i03Var3.mo2906a("SHOW_CMP cause: [TCF] The 'Resurface UI' option is enabled and a new vendor was added from the GVL", null);
/* 570 */               return tx0.f17299a;
                    }
/* 577 */           Long lM7632d4 = ((pz2) kp0Var2.f12967b).m7632d();
/* 581 */           if (z12 && lM7632d4 != null) {
/* 616 */               if (((int) ((new h50().m4115c() - new h50(lM7632d4.longValue()).m4115c()) / 86400000)) >= 390) {
/* 621 */                   i03Var3.mo2906a("SHOW_CMP cause: [TCF] The 'Resurface UI' option is enabled configured time has passed", null);
/* 624 */                   return tx0.f17299a;
                        }
                    }
/* 628 */           if (!z4) {
/* 638 */               return tx0.f17300b;
                    }
/* 632 */           i03Var3.mo2906a("SHOW_CMP cause: [TCF] The 'Resurface ATP list' option is enabled and Ad Technology Providers changed", null);
/* 635 */           return tx0.f17299a;
                }

                /* JADX INFO: renamed from: e */
                public final boolean m8650e(g13 g13Var, k61 k61Var, boolean z) {
/* 6 */             if (!this.f16847i.f12216f) {
/* 9 */                 int iOrdinal = g13Var.ordinal();
/* 14 */                if (iOrdinal != 0) {
/* 16 */                    if (iOrdinal == 1) {
/* 5 */                         return true;
                            }
/* 19 */                    if (iOrdinal == 2) {
/* 29 */                        return !((qk2) this.f16843e).m7922d();
                            }
/* 31 */                    ds0.m3187b();
/* 13 */                    return false;
                        }
/* 36 */                gp0 gp0Var = k61Var.f12612c;
/* 44 */                if (!(gp0Var != null ? gp0Var.f8760a : false) || z) {
/* 13 */                    return false;
                        }
                    }
/* 5 */             return true;
                }
            }
