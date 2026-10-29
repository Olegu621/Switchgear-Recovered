            package p000;

            import com.usercentrics.sdk.p009v2.location.data.UsercentricsLocation;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Locale;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class n51 {
                public static final l51 Companion = new l51();

                /* JADX INFO: renamed from: a */
                public final k51 f14121a;

                /* JADX INFO: renamed from: b */
                public final g80 f14122b;

                /* JADX INFO: renamed from: c */
                public final i03 f14123c;

                /* JADX INFO: renamed from: d */
                public String f14124d;

                /* JADX INFO: renamed from: e */
                public UsercentricsLocation f14125e;

                /* JADX INFO: renamed from: f */
                public boolean f14126f;

                public n51(k51 k51Var, g80 g80Var, i03 i03Var) {
/* 1 */             g80Var.getClass();
/* 4 */             i03Var.getClass();
/* 10 */            this.f14121a = k51Var;
/* 12 */            this.f14122b = g80Var;
/* 14 */            this.f14123c = i03Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public final Object m6887a(String str, String str2, String str3, boolean z, d10 d10Var) {
                    m51 m51Var;
                    Object next;
                    Object next2;
/* 3 */             if (d10Var instanceof m51) {
/* 6 */                 m51Var = (m51) d10Var;
/* 8 */                 int i = m51Var.f13565e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    m51Var.f13565e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    m51Var = new m51(this, d10Var);
                        }
                    } else {
/* 22 */                m51Var = new m51(this, d10Var);
                    }
/* 25 */            Object objM5993i = m51Var.f13563c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = m51Var.f13565e;
/* 33 */            if (i2 == 0) {
/* 51 */                pg3.m7417A(objM5993i);
/* 54 */                m51Var.f13561a = this;
/* 56 */                m51Var.f13562b = str3;
/* 58 */                m51Var.f13565e = 1;
/* 62 */                objM5993i = this.f14121a.m5993i(str, str2, z, m51Var);
/* 66 */                if (objM5993i == z10Var) {
/* 68 */                    return z10Var;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 47 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                str3 = m51Var.f13562b;
/* 39 */                this = m51Var.f13561a;
/* 41 */                pg3.m7417A(objM5993i);
                    }
/* 69 */            k91 k91Var = (k91) objM5993i;
/* 73 */            this.f14125e = k91Var.f12657b;
/* 77 */            this.f14126f = k91Var.f12658c;
/* 81 */            Iterable iterable = (Iterable) k91Var.f12656a;
/* 91 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(iterable, 10));
/* 94 */            Iterator it = iterable.iterator();
/* 102 */           while (it.hasNext()) {
/* 112 */               String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
/* 116 */               lowerCase.getClass();
/* 119 */               arrayList.add(lowerCase);
                    }
/* 123 */           i03 i03Var = this.f14123c;
/* 131 */           String str4 = ((pz2) this.f14122b).f15355f.f6141c;
/* 137 */           if (!StringsKt.m6228D(str4) && arrayList.contains(str4)) {
/* 145 */               str3 = str4;
                    } else if (StringsKt.m6228D(str3) || !arrayList.contains(str3)) {
/* 162 */               Locale locale = Locale.getDefault();
/* 166 */               locale.getClass();
/* 169 */               Iterator it2 = arrayList.iterator();
                        while (true) {
/* 177 */                   if (!it2.hasNext()) {
/* 219 */                       next = null;
                                break;
                            }
/* 179 */                   next = it2.next();
/* 186 */                   Locale localeM10026a = xt0.m10026a((String) next);
/* 202 */                   if (Intrinsics.m6216a(locale.getLanguage(), localeM10026a.getLanguage()) && Intrinsics.m6216a(locale.getCountry(), localeM10026a.getCountry())) {
                                break;
                            }
                        }
/* 220 */               String str5 = (String) next;
/* 222 */               if (str5 == null) {
/* 226 */                   Iterator it3 = arrayList.iterator();
/* 259 */                   do {
/* 234 */                       if (!it3.hasNext()) {
/* 262 */                           next2 = null;
                                    break;
                                }
/* 236 */                       next2 = it3.next();
/* 259 */                   } while (!Intrinsics.m6216a(locale.getLanguage(), xt0.m10026a((String) next2).getLanguage()));
/* 263 */                   str5 = (String) next2;
                        }
/* 224 */               str3 = str5;
/* 266 */               if (str3 == null || !(!StringsKt.m6228D(str3))) {
/* 286 */                   str3 = (String) CollectionsKt.firstOrNull(arrayList);
/* 288 */                   if (str3 == null || StringsKt.m6228D(str3)) {
/* 327 */                       i03Var.mo2906a("The language has been set to the default one, English.", null);
/* 330 */                       str3 = "en";
                            } else {
/* 299 */                       Companion.getClass();
/* 321 */                       i03Var.mo2906a("The language has been set to the first of those available, " + str3 + ".", null);
                            }
                        } else {
/* 277 */                   i03Var.mo2906a("The language has been set to the device language.", null);
                        }
                    }
/* 332 */           this.f14124d = str3;
/* 334 */           return Unit.f12910a;
                }
            }
