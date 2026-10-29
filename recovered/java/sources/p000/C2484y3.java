            package p000;

            import com.usercentrics.sdk.AdTechProvider;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.text.StringsKt;
            import kotlin.text.StringsKt__StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: y3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2484y3 {
                public static final C2317w3 Companion = new C2317w3();

                /* JADX INFO: renamed from: a */
                public final C2279v3 f19463a;

                /* JADX INFO: renamed from: b */
                public final g80 f19464b;

                /* JADX INFO: renamed from: c */
                public final i03 f19465c;

                /* JADX INFO: renamed from: d */
                public List f19466d;

                /* JADX INFO: renamed from: e */
                public String f19467e;

                public C2484y3(C2279v3 c2279v3, g80 g80Var, i03 i03Var) {
/* 1 */             g80Var.getClass();
/* 4 */             i03Var.getClass();
/* 10 */            this.f19463a = c2279v3;
/* 12 */            this.f19464b = g80Var;
/* 14 */            this.f19465c = i03Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m10093a() {
/* 5 */             if (m10094b()) {
/* 7 */                 List list = this.f19466d;
/* 9 */                 list.getClass();
/* 20 */                ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 23 */                Iterator it = list.iterator();
/* 31 */                while (it.hasNext()) {
/* 45 */                    arrayList.add(Integer.valueOf(((AdTechProvider) it.next()).f6022a));
                        }
/* 49 */                m10098f(arrayList);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final boolean m10094b() {
/* 1 */             List list = this.f19466d;
/* 3 */             if (list != null && (!list.isEmpty())) {
/* 9 */                 return true;
                    }
/* 19 */            this.f19465c.mo2907b("Error when saving user consents for Google Additional Consent Mode. Cause: missing Ad Tech Provider list.", null);
/* 22 */            return false;
                }

                /* JADX INFO: renamed from: c */
                public final String m10095c() {
/* 1 */             List<AdTechProvider> list = this.f19466d;
/* 3 */             if (list == null || list.isEmpty()) {
/* 85 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 14 */            StringBuilder sb = new StringBuilder();
/* 19 */            StringBuilder sb2 = new StringBuilder();
/* 30 */            for (AdTechProvider adTechProvider : list) {
/* 44 */                StringBuilder sb3 = adTechProvider.f6025d ? sb : sb2;
/* 49 */                if (sb3.length() > 0) {
/* 53 */                    sb3.append(".");
                        }
/* 58 */                sb3.append(adTechProvider.f6022a);
                    }
/* 80 */            return "2~" + ((Object) sb) + "~dv." + ((Object) sb2);
                }

                /* JADX INFO: renamed from: d */
                public final List m10096d() {
/* 1 */             String str = this.f19467e;
/* 18 */            List listSplit$default = str != null ? StringsKt__StringsKt.split$default(str, new String[]{"~"}, false, 0, 6, null) : null;
/* 19 */            if (listSplit$default == null || listSplit$default.size() != 3) {
/* 81 */                return nd0.f14189a;
                    }
/* 45 */            List listM6192K = CollectionsKt.m6192K(StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(1), new String[]{"."}, false, 0, 6, null));
/* 51 */            ArrayList arrayList = new ArrayList();
/* 54 */            Iterator it = listM6192K.iterator();
/* 62 */            while (it.hasNext()) {
/* 70 */                Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
/* 74 */                if (intOrNull != null) {
/* 76 */                    arrayList.add(intOrNull);
                        }
                    }
/* 80 */            return arrayList;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: e */
                public final Object m10097e(List list, d10 d10Var) {
                    C2354x3 c2354x3;
/* 3 */             if (d10Var instanceof C2354x3) {
/* 6 */                 c2354x3 = (C2354x3) d10Var;
/* 8 */                 int i = c2354x3.f18923d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    c2354x3.f18923d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    c2354x3 = new C2354x3(this, d10Var);
                        }
                    } else {
/* 22 */                c2354x3 = new C2354x3(this, d10Var);
                    }
/* 25 */            Object objM9211l = c2354x3.f18921b;
/* 27 */            Object obj = z10.f19902a;
/* 29 */            int i2 = c2354x3.f18923d;
/* 33 */            if (i2 == 0) {
/* 49 */                pg3.m7417A(objM9211l);
/* 52 */                boolean zIsEmpty = list.isEmpty();
/* 56 */                i03 i03Var = this.f19465c;
/* 58 */                if (zIsEmpty) {
/* 62 */                    i03Var.mo2907b("Error: cannot load Google Additional Consent Mode without selecting any vendor on Admin Interface", null);
/* 65 */                    return Unit.f12910a;
                        }
/* 82 */                i03Var.mo2906a("Loading Google Additional Consent Mode Providers " + list, null);
/* 89 */                od2 od2Var = ((pz2) this.f19464b).f15353d;
/* 91 */                av0 av0Var = bv0.Companion;
/* 93 */                od2Var.getClass();
/* 100 */               String string = od2Var.f14716a.getString("IABTCF_AddtlConsent", null);
/* 104 */               if (string == null) {
/* 106 */                   string = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 108 */               this.f19467e = string;
/* 110 */               List listM10096d = m10096d();
/* 114 */               c2354x3.f18920a = this;
/* 116 */               c2354x3.f18923d = 1;
/* 120 */               objM9211l = this.f19463a.m9211l(list, listM10096d, c2354x3);
/* 124 */               if (objM9211l == obj) {
/* 126 */                   return obj;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 45 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                this = c2354x3.f18920a;
/* 39 */                pg3.m7417A(objM9211l);
                    }
/* 129 */           this.f19466d = (List) objM9211l;
/* 131 */           return Unit.f12910a;
                }

                /* JADX INFO: renamed from: f */
                public final void m10098f(List list) {
/* 1 */             list.getClass();
/* 8 */             if (m10094b()) {
/* 10 */                m10099g(list);
/* 13 */                String strM10095c = m10095c();
/* 17 */                this.f19467e = strM10095c;
/* 21 */                pz2 pz2Var = (pz2) this.f19464b;
/* 23 */                pz2Var.getClass();
/* 26 */                od2 od2Var = pz2Var.f15353d;
/* 28 */                av0 av0Var = bv0.Companion;
/* 32 */                od2Var.m7138d("IABTCF_AddtlConsent", strM10095c);
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m10099g(List list) {
                    ArrayList arrayList;
/* 1 */             List<AdTechProvider> list2 = this.f19466d;
/* 3 */             if (list2 != null) {
/* 13 */                arrayList = new ArrayList(C2122qw.m8020h(list2, 10));
/* 24 */                for (AdTechProvider adTechProvider : list2) {
/* 46 */                    arrayList.add(AdTechProvider.m2769a(adTechProvider, list.contains(Integer.valueOf(adTechProvider.f6022a))));
                        }
                    } else {
/* 50 */                arrayList = null;
                    }
/* 51 */            this.f19466d = arrayList;
                }
            }
