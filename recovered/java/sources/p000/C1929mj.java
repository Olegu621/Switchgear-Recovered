            package p000;

            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import com.supercell.p007id.scid_plugin.EncryptedStorage;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataWhitelist;
            import com.usercentrics.sdk.services.deviceStorage.models.ConsentsBufferEntry;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageSessionEntry;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageTCF;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.Unit;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.CharsKt;
            import kotlin.text.Regex;
            import okhttp3.HttpUrl;
            import org.json.JSONObject;
            
            /* JADX INFO: renamed from: mj */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final class C1929mj extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13798a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f13799b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1929mj(Object obj, c10 c10Var, int i) {
/* 6 */             super(2, c10Var);
/* 1 */             this.f13798a = i;
/* 3 */             this.f13799b = obj;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
                    switch (this.f13798a) {
                        case 0:
/* 100 */                   return new C1929mj((C2003oj) this.f13799b, c10Var, 0);
                        case 1:
/* 89 */                    return new C1929mj((C1945mz) this.f13799b, c10Var, 1);
                        case 2:
/* 76 */                    C1929mj c1929mj = new C1929mj(2, c10Var);
/* 79 */                    c1929mj.f13799b = obj;
/* 81 */                    return c1929mj;
                        case 3:
/* 69 */                    return new C1929mj((se0) this.f13799b, c10Var, 3);
                        case 4:
/* 58 */                    return new C1929mj((wb2) this.f13799b, c10Var, 4);
                        case 5:
/* 47 */                    return new C1929mj((mw0) this.f13799b, c10Var, 5);
                        case 6:
/* 36 */                    return new C1929mj((SharedDataWhitelist) this.f13799b, c10Var, 6);
                        case 7:
/* 25 */                    return new C1929mj((qk2) this.f13799b, c10Var, 7);
                        default:
/* 14 */                    return new C1929mj((byte[]) this.f13799b, c10Var, 8);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f13798a) {
                        case 0:
/* 154 */                   return ((C1929mj) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 1:
/* 137 */                   return ((C1929mj) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 2:
/* 120 */                   return ((C1929mj) create((og2) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 3:
/* 103 */                   return ((C1929mj) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 4:
/* 86 */                    return ((C1929mj) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 5:
/* 69 */                    return ((C1929mj) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 6:
/* 52 */                    return ((C1929mj) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 7:
/* 35 */                    return ((C1929mj) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        default:
/* 18 */                    return ((C1929mj) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                    }
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws Exception {
                    String str;
                    t82 t82Var;
                    String strM3783i;
                    String str2;
                    String str3;
                    b40 b40VarM7943a;
                    int i;
                    String str4;
                    String str5;
                    switch (this.f13798a) {
                        case 0:
/* 1567 */                  z10 z10Var = z10.f19902a;
/* 1569 */                  pg3.m7417A(obj);
/* 1574 */                  C2003oj c2003oj = (C2003oj) this.f13799b;
/* 1578 */                  pz2 pz2Var = (pz2) c2003oj.f14775b;
/* 1580 */                  List<StorageSessionEntry> listM7634f = pz2Var.m7634f();
/* 1586 */                  pz2Var.m7637i(qd0.f15493a);
/* 1597 */                  for (StorageSessionEntry storageSessionEntry : listM7634f) {
/* 1609 */                      c2003oj.m7179a(storageSessionEntry.f6136a, storageSessionEntry.f6137b);
                            }
/* 1613 */                  return Unit.f12910a;
                        case 1:
/* 1513 */                  z10 z10Var2 = z10.f19902a;
/* 1515 */                  pg3.m7417A(obj);
/* 1520 */                  C1945mz c1945mz = (C1945mz) this.f13799b;
/* 1542 */                  Iterator it = CollectionsKt.m6186E(new wa3(3), ((pz2) c1945mz.f14072d).m7631c().f6109a).iterator();
/* 1550 */                  while (it.hasNext()) {
/* 1560 */                      C1945mz.m6831a(c1945mz, ((ConsentsBufferEntry) it.next()).f6111b);
                            }
/* 1564 */                  return Unit.f12910a;
                        case 2:
/* 1495 */                  z10 z10Var3 = z10.f19902a;
/* 1497 */                  pg3.m7417A(obj);
/* 1508 */                  return Boolean.valueOf(!(((og2) this.f13799b) instanceof mi0));
                        case 3:
/* 1410 */                  z10 z10Var4 = z10.f19902a;
/* 1412 */                  pg3.m7417A(obj);
/* 1417 */                  se0 se0Var = (se0) this.f13799b;
/* 1419 */                  ev0 ev0Var = se0Var.f16548a;
/* 1424 */                  List listM2959c = ((C0835d8) ev0Var).m2959c(HttpUrl.FRAGMENT_ENCODE_SET);
/* 1428 */                  if (listM2959c == null) {
/* 1408 */                      return null;
                            }
/* 1432 */                  ArrayList arrayList = new ArrayList();
/* 1443 */                  for (Object obj2 : listM2959c) {
/* 1460 */                      if (!Intrinsics.m6216a((String) obj2, se0Var.m8486a())) {
/* 1462 */                          arrayList.add(obj2);
                                }
                            }
/* 1466 */                  Iterator it2 = arrayList.iterator();
/* 1474 */                  while (it2.hasNext()) {
/* 1485 */                      ((C0835d8) ev0Var).m2960d((String) it2.next());
                            }
/* 1489 */                  return Unit.f12910a;
                        case 4:
/* 1393 */                  z10 z10Var5 = z10.f19902a;
/* 1395 */                  pg3.m7417A(obj);
/* 1402 */                  ((wb2) this.f13799b).close();
/* 1405 */                  return Unit.f12910a;
                        case 5:
/* 1378 */                  z10 z10Var6 = z10.f19902a;
/* 1380 */                  pg3.m7417A(obj);
/* 1387 */                  ((mw0) this.f13799b).close();
/* 1390 */                  return Unit.f12910a;
                        case 6:
/* 1345 */                  z10 z10Var7 = z10.f19902a;
/* 1347 */                  pg3.m7417A(obj);
                            try {
/* 1 */                         EncryptedStorage encryptedStorage = ((SharedDataWhitelist) this.f13799b).encryptedStorage;
/* 1358 */                      if (encryptedStorage != null && (str = encryptedStorage.get("whitelist")) != null) {
/* 1370 */                          return new JSONObject(str);
                                }
                            } catch (Exception unused) {
                            }
/* 1343 */                  return null;
                        case 7:
/* 36 */                    z10 z10Var8 = z10.f19902a;
/* 38 */                    pg3.m7417A(obj);
/* 43 */                    qk2 qk2Var = (qk2) this.f13799b;
/* 47 */                    qk2Var.f15606i.m4510a();
/* 50 */                    ql2 ql2Var = qk2Var.f15610m;
/* 52 */                    ql2Var.getClass();
/* 60 */                    if (ql2Var.f15630i.f17529a != 5) {
/* 62 */                        ql2 ql2Var2 = qk2Var.f15610m;
/* 64 */                        ql2Var2.getClass();
/* 72 */                        ql2Var2.m7948f(new uh2(5));
                            }
/* 75 */                    yl2 yl2Var = zl2.Companion;
/* 77 */                    ql2 ql2Var3 = qk2Var.f15610m;
/* 79 */                    ql2Var3.getClass();
/* 82 */                    yl2Var.getClass();
/* 87 */                    g92.Companion.getClass();
/* 90 */                    ql2 ql2VarM3682a = f92.m3682a(ql2Var3);
/* 94 */                    int i2 = ql2VarM3682a.f15628g;
/* 98 */                    int i3 = 2;
/* 99 */                    if (i2 != 2) {
/* 1342 */                      throw new C0900f0(fm0.m3781g(i2, "Unsupported TCF version: "), 3);
                            }
/* 103 */                   List listM6210b = C1839a.m6210b(t82.CORE);
/* 107 */                   listM6210b.getClass();
/* 112 */                   ArrayList arrayList2 = new ArrayList(listM6210b);
/* 117 */                   arrayList2.add(t82.VENDORS_DISCLOSED);
/* 122 */                   if (ql2VarM3682a.f15624c) {
/* 126 */                       arrayList2.add(t82.PUBLISHER_TC);
                            }
/* 129 */                   List listM6192K = CollectionsKt.m6192K(arrayList2);
/* 133 */                   listM6192K.getClass();
/* 136 */                   Iterator it3 = listM6192K.iterator();
/* 140 */                   String str6 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 141 */                   int i4 = 0;
                            while (true) {
/* 146 */                       if (!it3.hasNext()) {
/* 1266 */                          qk2Var.m7939x(str6);
/* 1269 */                          g80 g80Var = qk2Var.f15600c;
/* 1279 */                          StorageTCF storageTCF = new StorageTCF(str6, qk2Var.f15603f.f19467e, qk2Var.f15612o);
/* 1282 */                          pz2 pz2Var2 = (pz2) g80Var;
/* 1284 */                          pz2Var2.getClass();
/* 1287 */                          od2 od2Var = pz2Var2.f15354e;
/* 1289 */                          pz2Var2.f15356g = storageTCF;
/* 1293 */                          String str7 = pz2Var2.f15355f.f6140b;
/* 1295 */                          fh2[] fh2VarArr = fh2.f8216a;
/* 1315 */                          od2Var.m7138d(AbstractC0886en.m3507k("tcf-", str7), b21.f2178a.m1199b(StorageTCF.Companion.serializer(), storageTCF));
/* 1318 */                          str7.getClass();
/* 1323 */                          od2Var.m7138d("actual_tcf", str7);
/* 1326 */                          qk2Var.m7938w();
/* 1329 */                          return Unit.f12910a;
                                }
/* 148 */                       Object next = it3.next();
/* 152 */                       int i5 = i4 + 1;
/* 154 */                       if (i4 < 0) {
/* 1262 */                          C2085pw.m7568g();
/* 1265 */                          throw null;
                                }
/* 156 */                       t82Var = (t82) next;
/* 169 */                       String str8 = i4 < listM6192K.size() + (-1) ? "." : HttpUrl.FRAGMENT_ENCODE_SET;
/* 172 */                       v82.Companion.getClass();
/* 179 */                       t82Var.getClass();
/* 184 */                       int i6 = ql2VarM3682a.f15628g;
/* 186 */                       if (i6 != i3) {
/* 1259 */                          throw new C0900f0(fm0.m3781g(i6, "Unsupported TCF version: "), 3);
                                }
/* 188 */                       int i7 = i3;
                                try {
/* 194 */                           fs0 fs0Var = (fs0) v82.f17917a.f7001a;
/* 196 */                           fs0Var.getClass();
/* 207 */                           List list = (List) ((Map) fs0Var.f8339b).get(t82Var);
/* 211 */                           String str9 = "segmentType";
/* 213 */                           if (t82Var != t82.CORE) {
/* 217 */                               x82.Companion.getClass();
/* 226 */                               Integer num = (Integer) x82.f18991b.get(t82Var);
/* 228 */                               if (num == null) {
/* 296 */                                   throw new C0900f0("Unable to find segment key for " + t82Var, 3);
                                        }
/* 230 */                               uy0 uy0Var = vy0.Companion;
/* 238 */                               uh2 uh2Var = new uh2(num.intValue());
/* 243 */                               EnumC2146rj.Companion.getClass();
/* 246 */                               EnumC2146rj enumC2146rjM7866a = C2109qj.m7866a("segmentType");
/* 259 */                               Integer numValueOf = enumC2146rjM7866a != null ? Integer.valueOf(enumC2146rjM7866a.f16116a) : null;
/* 261 */                               numValueOf.getClass();
/* 264 */                               int iIntValue = numValueOf.intValue();
/* 268 */                               uy0Var.getClass();
/* 271 */                               strM3783i = uy0.m9147b(uh2Var, iIntValue);
                                    } else {
/* 297 */                               strM3783i = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 298 */                           if (list != null) {
/* 300 */                               Iterator it4 = list.iterator();
                                        while (true) {
/* 308 */                                   if (it4.hasNext()) {
/* 314 */                                       str3 = (String) it4.next();
/* 316 */                                       Iterator it5 = it4;
/* 318 */                                       b40VarM7943a = ql2VarM3682a.m7943a(str3);
/* 324 */                                       EnumC2146rj.Companion.getClass();
/* 327 */                                       ql2 ql2Var4 = ql2VarM3682a;
/* 329 */                                       EnumC2146rj enumC2146rjM7866a2 = C2109qj.m7866a(str3);
/* 333 */                                       if (enumC2146rjM7866a2 == null) {
/* 337 */                                           v82.Companion.getClass();
/* 353 */                                           i = u82.m8973a(str3) ? ql2Var4.m7944b().f17529a : 0;
                                                } else {
/* 355 */                                           i = enumC2146rjM7866a2.f16116a;
                                                }
                                                try {
                                                    switch (str3.hashCode()) {
                                                        case -2115730175:
/* 968 */                                                   if (!str3.equals("vendorConsents")) {
                                                            }
/* 973 */                                                   d23 d23Var = e23.Companion;
/* 977 */                                                   u13 u13Var = ((xl2) b40VarM7943a).f19245g;
/* 979 */                                                   d23Var.getClass();
/* 997 */                                                   str5 = ((Object) strM3783i) + d23.m2912b(u13Var);
/* 905 */                                                   strM3783i = str5;
/* 1002 */                                                  it4 = it5;
/* 1004 */                                                  ql2VarM3682a = ql2Var4;
/* 1006 */                                                  listM6192K = listM6192K;
/* 1008 */                                                  str9 = str9;
                                                            break;
                                                        case -2076485454:
/* 909 */                                                   listM6192K = listM6192K;
/* 917 */                                                   if (!str3.equals("cmpVersion")) {
                                                            }
/* 924 */                                                   uh2 uh2Var2 = ((wl2) b40VarM7943a).f18683g;
/* 926 */                                                   uy0 uy0Var2 = vy0.Companion;
/* 932 */                                                   uh2 uh2Var3 = new uh2(uh2Var2.f17529a);
/* 935 */                                                   uy0Var2.getClass();
/* 953 */                                                   str5 = ((Object) strM3783i) + uy0.m9147b(uh2Var3, i);
/* 905 */                                                   strM3783i = str5;
/* 1002 */                                                  it4 = it5;
/* 1004 */                                                  ql2VarM3682a = ql2Var4;
/* 1006 */                                                  listM6192K = listM6192K;
/* 1008 */                                                  str9 = str9;
                                                            break;
                                                        case -2014745908:
/* 865 */                                                   if (!str3.equals("numCustomPurposes")) {
                                                            }
/* 870 */                                                   uy0 uy0Var3 = vy0.Companion;
/* 872 */                                                   str9 = str9;
/* 880 */                                                   uh2 uh2Var4 = new uh2(((tl2) b40VarM7943a).f17177g);
/* 883 */                                                   uy0Var3.getClass();
/* 901 */                                                   str5 = ((Object) strM3783i) + uy0.m9147b(uh2Var4, i);
/* 905 */                                                   strM3783i = str5;
/* 1002 */                                                  it4 = it5;
/* 1004 */                                                  ql2VarM3682a = ql2Var4;
/* 1006 */                                                  listM6192K = listM6192K;
/* 1008 */                                                  str9 = str9;
                                                            break;
                                                        case -1710804154:
/* 853 */                                                   if (str3.equals("policyVersion")) {
/* 924 */                                                       uh2 uh2Var5 = ((wl2) b40VarM7943a).f18683g;
/* 926 */                                                       uy0 uy0Var4 = vy0.Companion;
/* 932 */                                                       uh2 uh2Var6 = new uh2(uh2Var5.f17529a);
/* 935 */                                                       uy0Var4.getClass();
/* 953 */                                                       str5 = ((Object) strM3783i) + uy0.m9147b(uh2Var6, i);
/* 905 */                                                       strM3783i = str5;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case -952905459:
/* 804 */                                                   listM6192K = listM6192K;
/* 810 */                                                   if (str3.equals(str9)) {
/* 815 */                                                       uy0 uy0Var5 = vy0.Companion;
/* 819 */                                                       uh2 uh2Var7 = ((wl2) b40VarM7943a).f18683g;
/* 821 */                                                       uy0Var5.getClass();
/* 839 */                                                       str4 = ((Object) strM3783i) + uy0.m9147b(uh2Var7, i);
/* 503 */                                                       strM3783i = str4;
/* 504 */                                                       str9 = str9;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case -879778089:
/* 765 */                                                   if (!str3.equals("purposeConsents")) {
                                                            }
/* 770 */                                                   ij0 ij0Var = jj0.Companion;
/* 774 */                                                   u13 u13Var2 = ((xl2) b40VarM7943a).f19245g;
/* 776 */                                                   Integer numValueOf2 = Integer.valueOf(i);
/* 780 */                                                   ij0Var.getClass();
/* 798 */                                                   str4 = ((Object) strM3783i) + ij0.m4551b(u13Var2, numValueOf2);
/* 503 */                                                   strM3783i = str4;
/* 504 */                                                   str9 = str9;
/* 1002 */                                                  it4 = it5;
/* 1004 */                                                  ql2VarM3682a = ql2Var4;
/* 1006 */                                                  listM6192K = listM6192K;
/* 1008 */                                                  str9 = str9;
                                                            break;
                                                        case -740692217:
/* 722 */                                                   if (!str3.equals("publisherCountryCode")) {
                                                            }
/* 727 */                                                   c51 c51Var = d51.Companion;
/* 731 */                                                   String str10 = ((vl2) b40VarM7943a).f18242g;
/* 733 */                                                   c51Var.getClass();
/* 751 */                                                   str4 = ((Object) strM3783i) + c51.m1533b(i, str10);
/* 503 */                                                   strM3783i = str4;
/* 504 */                                                   str9 = str9;
/* 1002 */                                                  it4 = it5;
/* 1004 */                                                  ql2VarM3682a = ql2Var4;
/* 1006 */                                                  listM6192K = listM6192K;
/* 1008 */                                                  str9 = str9;
                                                            break;
                                                        case -442009786:
/* 711 */                                                   if (str3.equals("publisherCustomConsents")) {
/* 770 */                                                       ij0 ij0Var2 = jj0.Companion;
/* 774 */                                                       u13 u13Var3 = ((xl2) b40VarM7943a).f19245g;
/* 776 */                                                       Integer numValueOf3 = Integer.valueOf(i);
/* 780 */                                                       ij0Var2.getClass();
/* 798 */                                                       str4 = ((Object) strM3783i) + ij0.m4551b(u13Var3, numValueOf3);
/* 503 */                                                       strM3783i = str4;
/* 504 */                                                       str9 = str9;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case -145526490:
/* 699 */                                                   if (str3.equals("consentScreen")) {
/* 924 */                                                       uh2 uh2Var8 = ((wl2) b40VarM7943a).f18683g;
/* 926 */                                                       uy0 uy0Var6 = vy0.Companion;
/* 932 */                                                       uh2 uh2Var9 = new uh2(uh2Var8.f17529a);
/* 935 */                                                       uy0Var6.getClass();
/* 953 */                                                       str5 = ((Object) strM3783i) + uy0.m9147b(uh2Var9, i);
/* 905 */                                                       strM3783i = str5;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case -117505923:
/* 656 */                                                   if (!str3.equals("isServiceSpecific")) {
                                                            }
/* 661 */                                                   C0847dk c0847dk = AbstractC0883ek.Companion;
/* 665 */                                                   boolean z = ((rl2) b40VarM7943a).f16175g;
/* 667 */                                                   c0847dk.getClass();
/* 685 */                                                   str4 = ((Object) strM3783i) + C0847dk.m3142a(z);
/* 503 */                                                   strM3783i = str4;
/* 504 */                                                   str9 = str9;
/* 1002 */                                                  it4 = it5;
/* 1004 */                                                  ql2VarM3682a = ql2Var4;
/* 1006 */                                                  listM6192K = listM6192K;
/* 1008 */                                                  str9 = str9;
                                                            break;
                                                        case 94785793:
/* 644 */                                                   if (str3.equals("cmpId")) {
/* 924 */                                                       uh2 uh2Var10 = ((wl2) b40VarM7943a).f18683g;
/* 926 */                                                       uy0 uy0Var7 = vy0.Companion;
/* 932 */                                                       uh2 uh2Var11 = new uh2(uh2Var10.f17529a);
/* 935 */                                                       uy0Var7.getClass();
/* 953 */                                                       str5 = ((Object) strM3783i) + uy0.m9147b(uh2Var11, i);
/* 905 */                                                       strM3783i = str5;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 204489283:
/* 593 */                                                   listM6192K = listM6192K;
/* 601 */                                                   if (str3.equals("publisherRestrictions")) {
/* 606 */                                                       yz1 yz1Var = zz1.Companion;
/* 610 */                                                       xz1 xz1Var = ((ul2) b40VarM7943a).f17589g;
/* 612 */                                                       yz1Var.getClass();
/* 630 */                                                       str4 = ((Object) strM3783i) + yz1.m10229a(xz1Var);
/* 503 */                                                       strM3783i = str4;
/* 504 */                                                       str9 = str9;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 351608024:
/* 589 */                                                   if (str3.equals("version")) {
/* 870 */                                                       uy0 uy0Var8 = vy0.Companion;
/* 872 */                                                       str9 = str9;
/* 880 */                                                       uh2 uh2Var12 = new uh2(((tl2) b40VarM7943a).f17177g);
/* 883 */                                                       uy0Var8.getClass();
/* 901 */                                                       str5 = ((Object) strM3783i) + uy0.m9147b(uh2Var12, i);
/* 905 */                                                       strM3783i = str5;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 439958894:
/* 578 */                                                   if (str3.equals("useNonStandardStacks")) {
/* 661 */                                                       C0847dk c0847dk2 = AbstractC0883ek.Companion;
/* 665 */                                                       boolean z2 = ((rl2) b40VarM7943a).f16175g;
/* 667 */                                                       c0847dk2.getClass();
/* 685 */                                                       str4 = ((Object) strM3783i) + C0847dk.m3142a(z2);
/* 503 */                                                       strM3783i = str4;
/* 504 */                                                       str9 = str9;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 501667126:
/* 566 */                                                   if (str3.equals("purposeLegitimateInterests")) {
/* 770 */                                                       ij0 ij0Var3 = jj0.Companion;
/* 774 */                                                       u13 u13Var4 = ((xl2) b40VarM7943a).f19245g;
/* 776 */                                                       Integer numValueOf4 = Integer.valueOf(i);
/* 780 */                                                       ij0Var3.getClass();
/* 798 */                                                       str4 = ((Object) strM3783i) + ij0.m4551b(u13Var4, numValueOf4);
/* 503 */                                                       strM3783i = str4;
/* 504 */                                                       str9 = str9;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 544050613:
/* 554 */                                                   if (str3.equals("publisherConsents")) {
/* 770 */                                                       ij0 ij0Var4 = jj0.Companion;
/* 774 */                                                       u13 u13Var5 = ((xl2) b40VarM7943a).f19245g;
/* 776 */                                                       Integer numValueOf5 = Integer.valueOf(i);
/* 780 */                                                       ij0Var4.getClass();
/* 798 */                                                       str4 = ((Object) strM3783i) + ij0.m4551b(u13Var5, numValueOf5);
/* 503 */                                                       strM3783i = str4;
/* 504 */                                                       str9 = str9;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 568283376:
/* 542 */                                                   if (str3.equals("purposeOneTreatment")) {
/* 661 */                                                       C0847dk c0847dk3 = AbstractC0883ek.Companion;
/* 665 */                                                       boolean z3 = ((rl2) b40VarM7943a).f16175g;
/* 667 */                                                       c0847dk3.getClass();
/* 685 */                                                       str4 = ((Object) strM3783i) + C0847dk.m3142a(z3);
/* 503 */                                                       strM3783i = str4;
/* 504 */                                                       str9 = str9;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 680983954:
/* 530 */                                                   if (str3.equals("consentLanguage")) {
/* 727 */                                                       c51 c51Var2 = d51.Companion;
/* 731 */                                                       String str11 = ((vl2) b40VarM7943a).f18242g;
/* 733 */                                                       c51Var2.getClass();
/* 751 */                                                       str4 = ((Object) strM3783i) + c51.m1533b(i, str11);
/* 503 */                                                       strM3783i = str4;
/* 504 */                                                       str9 = str9;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 1000364236:
/* 516 */                                                   if (str3.equals("vendorLegitimateInterests")) {
/* 973 */                                                       d23 d23Var2 = e23.Companion;
/* 977 */                                                       u13 u13Var6 = ((xl2) b40VarM7943a).f19245g;
/* 979 */                                                       d23Var2.getClass();
/* 997 */                                                       str5 = ((Object) strM3783i) + d23.m2912b(u13Var6);
/* 905 */                                                       strM3783i = str5;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 1028554472:
/* 461 */                                                   if (!str3.equals("created")) {
                                                            }
/* 466 */                                                   c50 c50Var = d50.Companion;
/* 470 */                                                   Long l = ((sl2) b40VarM7943a).f16675g;
/* 472 */                                                   l.getClass();
/* 477 */                                                   long jLongValue = l.longValue();
/* 481 */                                                   c50Var.getClass();
/* 499 */                                                   str4 = ((Object) strM3783i) + c50.m1531a(i, jLongValue);
/* 503 */                                                   strM3783i = str4;
/* 504 */                                                   str9 = str9;
/* 1002 */                                                  it4 = it5;
/* 1004 */                                                  ql2VarM3682a = ql2Var4;
/* 1006 */                                                  listM6192K = listM6192K;
/* 1008 */                                                  str9 = str9;
                                                            break;
                                                        case 1272166759:
/* 449 */                                                   if (str3.equals("publisherCustomLegitimateInterests")) {
/* 770 */                                                       ij0 ij0Var5 = jj0.Companion;
/* 774 */                                                       u13 u13Var7 = ((xl2) b40VarM7943a).f19245g;
/* 776 */                                                       Integer numValueOf6 = Integer.valueOf(i);
/* 780 */                                                       ij0Var5.getClass();
/* 798 */                                                       str4 = ((Object) strM3783i) + ij0.m4551b(u13Var7, numValueOf6);
/* 503 */                                                       strM3783i = str4;
/* 504 */                                                       str9 = str9;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 1401591704:
/* 437 */                                                   if (str3.equals("publisherLegitimateInterests")) {
/* 770 */                                                       ij0 ij0Var6 = jj0.Companion;
/* 774 */                                                       u13 u13Var8 = ((xl2) b40VarM7943a).f19245g;
/* 776 */                                                       Integer numValueOf7 = Integer.valueOf(i);
/* 780 */                                                       ij0Var6.getClass();
/* 798 */                                                       str4 = ((Object) strM3783i) + ij0.m4551b(u13Var8, numValueOf7);
/* 503 */                                                       strM3783i = str4;
/* 504 */                                                       str9 = str9;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 1649733957:
/* 426 */                                                   if (str3.equals("lastUpdated")) {
/* 466 */                                                       c50 c50Var2 = d50.Companion;
/* 470 */                                                       Long l2 = ((sl2) b40VarM7943a).f16675g;
/* 472 */                                                       l2.getClass();
/* 477 */                                                       long jLongValue2 = l2.longValue();
/* 481 */                                                       c50Var2.getClass();
/* 499 */                                                       str4 = ((Object) strM3783i) + c50.m1531a(i, jLongValue2);
/* 503 */                                                       strM3783i = str4;
/* 504 */                                                       str9 = str9;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 1722227698:
/* 412 */                                                   if (!str3.equals("vendorListVersion")) {
                                                            }
/* 924 */                                                   uh2 uh2Var13 = ((wl2) b40VarM7943a).f18683g;
/* 926 */                                                   uy0 uy0Var9 = vy0.Companion;
/* 932 */                                                   uh2 uh2Var14 = new uh2(uh2Var13.f17529a);
/* 935 */                                                   uy0Var9.getClass();
/* 953 */                                                   str5 = ((Object) strM3783i) + uy0.m9147b(uh2Var14, i);
/* 905 */                                                   strM3783i = str5;
/* 1002 */                                                  it4 = it5;
/* 1004 */                                                  ql2VarM3682a = ql2Var4;
/* 1006 */                                                  listM6192K = listM6192K;
/* 1008 */                                                  str9 = str9;
                                                            break;
                                                        case 1886388920:
/* 400 */                                                   if (str3.equals("specialFeatureOptins")) {
/* 770 */                                                       ij0 ij0Var7 = jj0.Companion;
/* 774 */                                                       u13 u13Var9 = ((xl2) b40VarM7943a).f19245g;
/* 776 */                                                       Integer numValueOf8 = Integer.valueOf(i);
/* 780 */                                                       ij0Var7.getClass();
/* 798 */                                                       str4 = ((Object) strM3783i) + ij0.m4551b(u13Var9, numValueOf8);
/* 503 */                                                       strM3783i = str4;
/* 504 */                                                       str9 = str9;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 1982848911:
/* 389 */                                                   if (str3.equals("vendorsDisclosed")) {
/* 973 */                                                       d23 d23Var3 = e23.Companion;
/* 977 */                                                       u13 u13Var10 = ((xl2) b40VarM7943a).f19245g;
/* 979 */                                                       d23Var3.getClass();
/* 997 */                                                       str5 = ((Object) strM3783i) + d23.m2912b(u13Var10);
/* 905 */                                                       strM3783i = str5;
/* 1002 */                                                      it4 = it5;
/* 1004 */                                                      ql2VarM3682a = ql2Var4;
/* 1006 */                                                      listM6192K = listM6192K;
/* 1008 */                                                      str9 = str9;
                                                            }
                                                            break;
                                                        case 1995874045:
/* 372 */                                                   if (!str3.equals("vendorsAllowed")) {
                                                            }
/* 973 */                                                   d23 d23Var4 = e23.Companion;
/* 977 */                                                   u13 u13Var11 = ((xl2) b40VarM7943a).f19245g;
/* 979 */                                                   d23Var4.getClass();
/* 997 */                                                   str5 = ((Object) strM3783i) + d23.m2912b(u13Var11);
/* 905 */                                                   strM3783i = str5;
/* 1002 */                                                  it4 = it5;
/* 1004 */                                                  ql2VarM3682a = ql2Var4;
/* 1006 */                                                  listM6192K = listM6192K;
/* 1008 */                                                  str9 = str9;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                } catch (Throwable th) {
/* 1084 */                                          throw new C0900f0("Error encoding " + t82Var + "->" + str3 + ": " + th.getMessage(), 3);
                                                }
                                            }
                                        }
                                    }
/* 1085 */                          ql2 ql2Var5 = ql2VarM3682a;
/* 1087 */                          List list2 = listM6192K;
/* 1091 */                          AbstractC0020ai.Companion.getClass();
/* 1098 */                          Regex regex = new Regex("[0-1]+");
/* 1105 */                          int length = strM3783i.length() % 24;
/* 1107 */                          if (length > 0) {
/* 1117 */                              strM3783i = fm0.m3783i(strM3783i, C1852e.m6260j(24 - length, "0"));
                                    }
/* 1129 */                          int iM5985v = k50.m5985v(0, strM3783i.length() - 1, 6);
/* 1133 */                          if (iM5985v >= 0) {
/* 1135 */                              str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 1136 */                              int i8 = 0;
                                        while (true) {
/* 1137 */                                  int i9 = i8 + 6;
/* 1139 */                                  String strSubstring = strM3783i.substring(i8, i9);
/* 1147 */                                  if (!regex.m6223b(strSubstring)) {
/* 1190 */                                      throw new C0900f0("Invalid bitField", 3);
                                            }
/* 1174 */                                  str2 = str2 + "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(Integer.parseInt(strSubstring, CharsKt.checkRadix(i7)));
/* 1178 */                                  if (i8 == iM5985v) {
                                            }
/* 1180 */                                  i8 = i9;
                                        }
                                    } else {
/* 1191 */                              str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 1206 */                          str6 = ((Object) str6) + str2 + str8;
/* 1210 */                          i3 = i7;
/* 1213 */                          i4 = i5;
/* 1214 */                          ql2VarM3682a = ql2Var5;
/* 1216 */                          listM6192K = list2;
                                } catch (Throwable unused2) {
/* 1248 */                          throw new C0900f0("Unable to encode version " + i6 + ", segment: " + t82Var, 3);
                                }
                                break;
                            }
/* 1047 */                  throw new C0900f0("Error encoding " + t82Var + "->" + str3 + ", value: " + b40VarM7943a, 3);
                            break;
                        default:
/* 11 */                    z10 z10Var9 = z10.f19902a;
/* 13 */                    pg3.m7417A(obj);
/* 18 */                    byte[] bArr = (byte[]) this.f13799b;
/* 21 */                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
/* 25 */                    if (bitmapDecodeByteArray != null) {
/* 27 */                        return bitmapDecodeByteArray;
                            }
/* 31 */                    f42.m3656l("Cannot decode the image byte array as a Bitmap");
/* 34 */                    return null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public /* synthetic */ C1929mj(int i, c10 c10Var) {
                    super(i, c10Var);
/* 10 */            this.f13798a = 2;
                }
            }
