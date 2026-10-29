            package p000;

            import java.io.File;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.collections.CollectionsKt;
            import kotlin.text.StringsKt;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.C1859c;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dj1 extends ui1 {

                /* JADX INFO: renamed from: c */
                public final ev0 f7271c;

                /* JADX INFO: renamed from: d */
                public final List f7272d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public dj1(we2 we2Var, a21 a21Var, ev0 ev0Var) {
/* 9 */             super(we2Var, 8);
/* 1 */             a21Var.getClass();
/* 4 */             ev0Var.getClass();
/* 12 */            this.f7271c = ev0Var;
/* 30 */            this.f7272d = C2085pw.m7566e("settings", "aggregator", "translations", "tcf-declarations");
                }

                /* JADX INFO: renamed from: b */
                public static String m3136b() {
/* 20 */            return pm2.m7488k("@#$", new h50().m4113a(13, 1800).m4115c());
                }

                @Override // p000.ui1
                /* JADX INFO: renamed from: a */
                public final void mo294a() {
                    List listM2959c;
                    String str;
                    List<String> listM2959c2;
/* 1 */             ev0 ev0Var = this.f7271c;
                    try {
/* 9 */                 LinkedHashMap linkedHashMapM7137c = ((od2) this.f17544a.f18595b).m7137c();
/* 17 */                if (linkedHashMapM7137c.isEmpty()) {
/* 204 */                   return;
                        }
/* 35 */                String str2 = (String) ((Map.Entry) CollectionsKt.m6199t(linkedHashMapM7137c.entrySet())).getValue();
/* 41 */                if (StringsKt.m6228D(str2)) {
/* 204 */                   return;
                        }
/* 45 */                r11 r11Var = b21.f2178a;
/* 71 */                AbstractC1858b abstractC1858b = (AbstractC1858b) ((C1859c) r11Var.m1198a(str2, jb1.m5766z(r11Var.f2163b, j22.m5668b(C1859c.class)))).get("language");
/* 84 */                String strMo6271a = abstractC1858b != null ? py0.m7602b0(abstractC1858b).mo6271a() : null;
/* 85 */                if (strMo6271a != null && !StringsKt.m6228D(strMo6271a) && (listM2959c = ((C0835d8) ev0Var).m2959c(HttpUrl.FRAGMENT_ENCODE_SET)) != null && !listM2959c.isEmpty() && (listM2959c2 = ((C0835d8) ev0Var).m2959c((str = (String) CollectionsKt.m6200u(listM2959c)))) != null && !listM2959c2.isEmpty()) {
/* 142 */                   for (String str3 : listM2959c2) {
/* 158 */                       if (this.f7272d.contains(str3)) {
/* 178 */                           m3138d(str + "/" + str3, strMo6271a);
                                } else {
/* 200 */                           m3137c(str + "/" + str3);
                                }
                            }
                        }
                    } catch (Exception unused) {
/* 211 */               ji0.m5827f(((C0835d8) ev0Var).m2958b());
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m3137c(String str) {
                    String str2;
/* 3 */             C0835d8 c0835d8 = (C0835d8) this.f7271c;
/* 5 */             List listM2959c = c0835d8.m2959c(str);
/* 9 */             if (listM2959c == null || (str2 = (String) CollectionsKt.firstOrNull(listM2959c)) == null) {
/* 52 */                return;
                    }
/* 22 */            String strM3508l = AbstractC0886en.m3508l(str, "/", str2);
/* 34 */            c0835d8.m2957a(strM3508l, pm2.m7489l(str, "/", str2, m3136b()));
/* 37 */            c0835d8.getClass();
/* 49 */            new File(c0835d8.m2958b(), strM3508l).delete();
                }

                /* JADX INFO: renamed from: d */
                public final void m3138d(String str, String str2) {
                    String str3;
/* 3 */             C0835d8 c0835d8 = (C0835d8) this.f7271c;
/* 5 */             List listM2959c = c0835d8.m2959c(str);
/* 9 */             if (listM2959c == null || (str3 = (String) CollectionsKt.firstOrNull(listM2959c)) == null) {
/* 78 */                return;
                    }
/* 22 */            String strM3508l = AbstractC0886en.m3508l(str, "-", str2);
/* 28 */            String strM3508l2 = AbstractC0886en.m3508l(str, "/", str3);
/* 53 */            String str4 = strM3508l + "/" + str3 + m3136b();
/* 57 */            c0835d8.getClass();
/* 69 */            new File(c0835d8.m2958b(), strM3508l).mkdirs();
/* 72 */            c0835d8.m2957a(strM3508l2, str4);
/* 75 */            c0835d8.m2960d(str);
                }
            }
