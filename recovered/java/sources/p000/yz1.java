            package p000;

            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.collections.CollectionsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yz1 {
                /* JADX INFO: renamed from: a */
                public static String m10229a(xz1 xz1Var) throws Throwable {
                    Iterator it;
/* 3 */             xz1Var.getClass();
/* 6 */             uy0 uy0Var = vy0.Companion;
/* 10 */            Map map = xz1Var.f19423b;
/* 16 */            uh2 uh2Var = new uh2(map.size());
/* 19 */            C2109qj c2109qj = EnumC2146rj.Companion;
/* 21 */            uy0Var.getClass();
/* 26 */            String strM9147b = uy0.m9147b(uh2Var, 12);
/* 30 */            wp0 wp0Var = xz1Var.f19425d;
/* 36 */            if (!map.isEmpty() && wp0Var != null) {
/* 47 */                Iterator it2 = xz1Var.m10050b(null).iterator();
/* 55 */                while (it2.hasNext()) {
/* 61 */                    wz1 wz1Var = (wz1) it2.next();
/* 63 */                    uy0 uy0Var2 = vy0.Companion;
/* 67 */                    Integer num = wz1Var.f18878a;
/* 69 */                    num.getClass();
/* 76 */                    uh2 uh2Var2 = new uh2(num.intValue());
/* 79 */                    C2109qj c2109qj2 = EnumC2146rj.Companion;
/* 81 */                    uy0Var2.getClass();
/* 100 */                   String str = ((Object) strM9147b) + uy0.m9147b(uh2Var2, 6);
/* 131 */                   String str2 = ((Object) str) + uy0.m9147b(new uh2(wz1Var.m9670b().f13106a), 2);
/* 135 */                   List listM6192K = nd0.f14189a;
/* 137 */                   String strM9669a = wz1Var.m9669a();
/* 145 */                   if (map.containsKey(strM9669a)) {
/* 147 */                       Object obj = map.get(strM9669a);
/* 151 */                       obj.getClass();
/* 158 */                       listM6192K = CollectionsKt.m6192K(((rf2) obj).f16038a);
                            }
/* 162 */                   int size = listM6192K.size();
/* 166 */                   String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 168 */                   int i = 0;
/* 169 */                   int i2 = 0;
/* 170 */                   int i3 = 0;
/* 171 */                   while (i < size) {
/* 179 */                       int iIntValue = ((Number) listM6192K.get(i)).intValue();
/* 183 */                       if (i3 == 0) {
/* 185 */                           i2++;
/* 187 */                           i3 = iIntValue;
                                }
/* 188 */                       int i4 = size - 1;
/* 191 */                       if (i != i4) {
/* 201 */                           int iIntValue2 = ((Number) listM6192K.get(i + 1)).intValue();
/* 211 */                           int iIntValue3 = ((Number) listM6192K.get(i4)).intValue();
/* 215 */                           int i5 = iIntValue + 1;
                                    while (true) {
/* 219 */                               if (i5 > iIntValue3) {
/* 245 */                                   it = it2;
/* 247 */                                   i5 = iIntValue;
                                            break;
                                        }
/* 221 */                               List list = wp0Var.f18720c;
/* 223 */                               it = it2;
/* 225 */                               if (list != null && list.contains(Integer.valueOf(i5))) {
                                            break;
                                        }
/* 238 */                               i5++;
/* 240 */                               it2 = it;
                                    }
/* 248 */                           if (iIntValue2 > i5) {
                                    }
/* 309 */                           i++;
/* 311 */                           it2 = it;
                                } else {
/* 251 */                           it = it2;
                                }
/* 253 */                       boolean z = iIntValue != i3;
/* 259 */                       AbstractC0883ek.Companion.getClass();
/* 266 */                       String strConcat = str3.concat(C0847dk.m3142a(z));
/* 270 */                       uy0 uy0Var3 = vy0.Companion;
/* 274 */                       uh2 uh2Var3 = new uh2(i3);
/* 277 */                       C2109qj c2109qj3 = EnumC2146rj.Companion;
/* 279 */                       uy0Var3.getClass();
/* 288 */                       String strConcat2 = strConcat.concat(uy0.m9147b(uh2Var3, 16));
/* 292 */                       if (z) {
/* 303 */                           strConcat2 = strConcat2.concat(uy0.m9147b(new uh2(iIntValue), 16));
                                }
/* 307 */                       str3 = strConcat2;
/* 308 */                       i3 = 0;
/* 309 */                       i++;
/* 311 */                       it2 = it;
                            }
/* 317 */                   Iterator it3 = it2;
/* 319 */                   uy0 uy0Var4 = vy0.Companion;
/* 323 */                   uh2 uh2Var4 = new uh2(i2);
/* 326 */                   C2109qj c2109qj4 = EnumC2146rj.Companion;
/* 328 */                   uy0Var4.getClass();
/* 363 */                   strM9147b = ((Object) (((Object) str2) + uy0.m9147b(uh2Var4, 12))) + str3;
/* 368 */                   it2 = it3;
                        }
                    }
/* 372 */           return strM9147b;
                }
            }
