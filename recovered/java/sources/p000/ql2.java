            package p000;

            import java.util.LinkedHashMap;
            import java.util.Locale;
            import kotlin.collections.CollectionsKt;
            import kotlin.text.Regex;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ql2 {

                /* JADX INFO: renamed from: a */
                public final wp0 f15622a;

                /* JADX INFO: renamed from: b */
                public final wp0 f15623b;

                /* JADX INFO: renamed from: d */
                public boolean f15625d;

                /* JADX INFO: renamed from: e */
                public boolean f15626e;

                /* JADX INFO: renamed from: n */
                public int f15635n;

                /* JADX INFO: renamed from: o */
                public Long f15636o;

                /* JADX INFO: renamed from: p */
                public Long f15637p;

                /* JADX INFO: renamed from: c */
                public boolean f15624c = true;

                /* JADX INFO: renamed from: f */
                public String f15627f = "AA";

                /* JADX INFO: renamed from: g */
                public int f15628g = 2;

                /* JADX INFO: renamed from: h */
                public uh2 f15629h = new uh2(0);

                /* JADX INFO: renamed from: i */
                public uh2 f15630i = new uh2(5);

                /* JADX INFO: renamed from: j */
                public String f15631j = "EN";

                /* JADX INFO: renamed from: k */
                public uh2 f15632k = new uh2(0);

                /* JADX INFO: renamed from: l */
                public uh2 f15633l = new uh2(0);

                /* JADX INFO: renamed from: m */
                public uh2 f15634m = new uh2(0);

                /* JADX INFO: renamed from: q */
                public u13 f15638q = new u13();

                /* JADX INFO: renamed from: r */
                public u13 f15639r = new u13();

                /* JADX INFO: renamed from: s */
                public u13 f15640s = new u13();

                /* JADX INFO: renamed from: t */
                public u13 f15641t = new u13();

                /* JADX INFO: renamed from: u */
                public u13 f15642u = new u13();

                /* JADX INFO: renamed from: v */
                public u13 f15643v = new u13();

                /* JADX INFO: renamed from: w */
                public u13 f15644w = new u13();

                /* JADX INFO: renamed from: x */
                public final LinkedHashMap f15645x = new LinkedHashMap();

                /* JADX INFO: renamed from: y */
                public u13 f15646y = new u13();

                /* JADX INFO: renamed from: z */
                public u13 f15647z = new u13();

                /* JADX INFO: renamed from: A */
                public u13 f15619A = new u13();

                /* JADX INFO: renamed from: B */
                public u13 f15620B = new u13();

                /* JADX INFO: renamed from: C */
                public xz1 f15621C = new xz1();

                public ql2(wp0 wp0Var) {
/* 4 */             this.f15622a = wp0Var;
/* 6 */             this.f15623b = wp0Var;
/* 159 */           long jM4115c = new h50().m4114b().m4115c();
/* 167 */           this.f15637p = Long.valueOf(jM4115c);
/* 173 */           this.f15636o = Long.valueOf(jM4115c);
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX INFO: renamed from: a */
                public final b40 m7943a(String str) throws C0900f0 {
/* 1 */             str.getClass();
                    switch (str.hashCode()) {
                        case -2115730175:
/* 419 */                   if (str.equals("vendorConsents")) {
/* 425 */                       return new xl2(this.f15646y);
                            }
                            break;
                        case -2076485454:
/* 403 */                   if (str.equals("cmpVersion")) {
/* 409 */                       return new wl2(this.f15633l);
                            }
                            break;
                        case -2014745908:
/* 387 */                   if (str.equals("numCustomPurposes")) {
/* 393 */                       return new tl2(this.f15635n);
                            }
                            break;
                        case -1710804154:
/* 371 */                   if (str.equals("policyVersion")) {
/* 377 */                       return new wl2(this.f15630i);
                            }
                            break;
                        case -879778089:
/* 355 */                   if (str.equals("purposeConsents")) {
/* 361 */                       return new xl2(this.f15639r);
                            }
                            break;
                        case -740692217:
/* 339 */                   if (str.equals("publisherCountryCode")) {
/* 345 */                       return new vl2(this.f15627f);
                            }
                            break;
                        case -442009786:
/* 323 */                   if (str.equals("publisherCustomConsents")) {
/* 329 */                       return new xl2(this.f15643v);
                            }
                            break;
                        case -145526490:
/* 307 */                   if (str.equals("consentScreen")) {
/* 313 */                       return new wl2(this.f15629h);
                            }
                            break;
                        case -117505923:
/* 291 */                   if (str.equals("isServiceSpecific")) {
/* 297 */                       return new rl2(this.f15624c);
                            }
                            break;
                        case 94785793:
/* 275 */                   if (str.equals("cmpId")) {
/* 281 */                       return new wl2(this.f15632k);
                            }
                            break;
                        case 204489283:
/* 259 */                   if (str.equals("publisherRestrictions")) {
/* 265 */                       return new ul2(this.f15621C);
                            }
                            break;
                        case 351608024:
/* 243 */                   if (str.equals("version")) {
/* 249 */                       return new tl2(this.f15628g);
                            }
                            break;
                        case 439958894:
/* 227 */                   if (str.equals("useNonStandardStacks")) {
/* 233 */                       return new rl2(this.f15625d);
                            }
                            break;
                        case 501667126:
/* 211 */                   if (str.equals("purposeLegitimateInterests")) {
/* 217 */                       return new xl2(this.f15640s);
                            }
                            break;
                        case 544050613:
/* 195 */                   if (str.equals("publisherConsents")) {
/* 201 */                       return new xl2(this.f15641t);
                            }
                            break;
                        case 568283376:
/* 179 */                   if (str.equals("purposeOneTreatment")) {
/* 185 */                       return new rl2(this.f15626e);
                            }
                            break;
                        case 680983954:
/* 163 */                   if (str.equals("consentLanguage")) {
/* 169 */                       return new vl2(this.f15631j);
                            }
                            break;
                        case 1000364236:
/* 147 */                   if (str.equals("vendorLegitimateInterests")) {
/* 153 */                       return new xl2(this.f15647z);
                            }
                            break;
                        case 1028554472:
/* 131 */                   if (str.equals("created")) {
/* 137 */                       return new sl2(this.f15636o);
                            }
                            break;
                        case 1272166759:
/* 115 */                   if (str.equals("publisherCustomLegitimateInterests")) {
/* 121 */                       return new xl2(this.f15644w);
                            }
                            break;
                        case 1401591704:
/* 99 */                    if (str.equals("publisherLegitimateInterests")) {
/* 105 */                       return new xl2(this.f15642u);
                            }
                            break;
                        case 1649733957:
/* 83 */                    if (str.equals("lastUpdated")) {
/* 89 */                        return new sl2(this.f15637p);
                            }
                            break;
                        case 1722227698:
/* 67 */                    if (str.equals("vendorListVersion")) {
/* 73 */                        return new wl2(this.f15634m);
                            }
                            break;
                        case 1886388920:
/* 51 */                    if (str.equals("specialFeatureOptins")) {
/* 57 */                        return new xl2(this.f15638q);
                            }
                            break;
                        case 1982848911:
/* 35 */                    if (str.equals("vendorsDisclosed")) {
/* 41 */                        return new xl2(this.f15619A);
                            }
                            break;
                        case 1995874045:
/* 19 */                    if (str.equals("vendorsAllowed")) {
/* 25 */                        return new xl2(this.f15620B);
                            }
                            break;
                    }
/* 436 */           throw new C0900f0("Unable to get field from TCModel", str);
                }

                /* JADX INFO: renamed from: b */
                public final uh2 m7944b() {
/* 1 */             int i = this.f15635n;
/* 3 */             LinkedHashMap linkedHashMap = this.f15645x;
/* 9 */             if (!linkedHashMap.isEmpty()) {
/* 36 */                i = Integer.parseInt((String) CollectionsKt.m6204y(CollectionsKt.m6194M(CollectionsKt.m6186E(new wa3(12), linkedHashMap.keySet()))));
                    }
/* 42 */            return new uh2(i);
                }

                /* JADX INFO: renamed from: c */
                public final void m7945c(uh2 uh2Var) throws C0900f0 {
/* 4 */             if (uh2Var.f17529a <= 1) {
/* 16 */                throw new C0900f0("cmpId", uh2Var);
                    }
/* 6 */             this.f15632k = uh2Var;
                }

                /* JADX INFO: renamed from: d */
                public final void m7946d(uh2 uh2Var) throws C0900f0 {
/* 4 */             if (uh2Var.f17529a <= -1) {
/* 16 */                throw new C0900f0("cmpVersion", uh2Var);
                    }
/* 6 */             this.f15633l = uh2Var;
                }

                /* JADX INFO: renamed from: e */
                public final void m7947e(uh2 uh2Var) throws C0900f0 {
/* 4 */             if (uh2Var.f17529a <= -1) {
/* 16 */                throw new C0900f0("consentScreen", uh2Var);
                    }
/* 6 */             this.f15629h = uh2Var;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof ql2) && this.f15622a == ((ql2) obj).f15622a;
                }

                /* JADX INFO: renamed from: f */
                public final void m7948f(uh2 uh2Var) throws C0900f0 {
/* 1 */             int i = uh2Var.f17529a;
/* 3 */             if (i < 0) {
/* 20 */                throw new C0900f0("policyVersion", uh2Var);
                    }
/* 10 */            this.f15630i = new uh2(i);
                }

                /* JADX INFO: renamed from: g */
                public final void m7949g(String str) throws C0900f0 {
/* 1 */             str.getClass();
/* 15 */            if (!new Regex("^([A-z]){2}$").m6223b(str)) {
/* 36 */                throw new C0900f0("publisherCountryCode", str);
                    }
/* 19 */            String upperCase = str.toUpperCase(Locale.ROOT);
/* 23 */            upperCase.getClass();
/* 26 */            this.f15627f = upperCase;
                }

                /* JADX INFO: renamed from: h */
                public final void m7950h(uh2 uh2Var) throws C0900f0 {
/* 1 */             int i = uh2Var.f17529a;
/* 3 */             if (i < 0) {
/* 17 */                throw new C0900f0("vendorListVersion", uh2Var);
                    }
/* 5 */             if (i >= 0) {
/* 7 */                 this.f15634m = uh2Var;
                    }
                }

                public final int hashCode() {
/* 3 */             return this.f15622a.hashCode();
                }

                public final String toString() {
/* 18 */            return "TCModel(_gvl_=" + this.f15622a + ")";
                }
            }
