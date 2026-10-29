            package p000;

            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsCategory;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.collections.CollectionsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class m03 {
                /* JADX INFO: renamed from: a */
                public static ArrayList m6585a(List list, List list2) {
/* 1 */             list.getClass();
/* 4 */             list2.getClass();
/* 9 */             ArrayList<UsercentricsCategory> arrayList = new ArrayList();
/* 20 */            for (Object obj : list) {
/* 31 */                if (!((UsercentricsCategory) obj).f6537e) {
/* 33 */                    arrayList.add(obj);
                        }
                    }
/* 45 */            ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 56 */            for (UsercentricsCategory usercentricsCategory : arrayList) {
/* 66 */                ArrayList arrayList3 = new ArrayList();
/* 77 */                for (Object obj2 : list2) {
/* 94 */                    if (((m61) obj2).f13588n.equals(usercentricsCategory.f6533a)) {
/* 96 */                        arrayList3.add(obj2);
                            }
                        }
/* 102 */               n03.Companion.getClass();
/* 107 */               boolean z = true;
/* 108 */               if (!usercentricsCategory.f6536d) {
/* 116 */                   if (arrayList3.isEmpty()) {
/* 118 */                       z = false;
                                break;
                            }
/* 120 */                   Iterator it = arrayList3.iterator();
/* 140 */                   do {
/* 128 */                       if (!it.hasNext()) {
/* 118 */                           z = false;
                                    break;
                                    break;
                                }
/* 140 */                   } while (!((m61) it.next()).f13590p.f9466b);
                        }
/* 147 */               arrayList2.add(new C2471xr(usercentricsCategory, z, arrayList3));
                    }
/* 153 */           ArrayList arrayList4 = new ArrayList();
/* 164 */           for (Object obj3 : arrayList2) {
/* 179 */               if (!((C2471xr) obj3).f19330c.isEmpty()) {
/* 181 */                   arrayList4.add(obj3);
                        }
                    }
/* 185 */           return arrayList4;
                }

                /* JADX INFO: renamed from: b */
                public static List m6586b(TCFData tCFData) {
/* 1 */             tCFData.getClass();
/* 13 */            List<TCFPurpose> listM6186E = CollectionsKt.m6186E(new wa3(14), tCFData.f6161b);
/* 19 */            ArrayList arrayList = new ArrayList();
/* 30 */            for (TCFPurpose tCFPurpose : listM6186E) {
/* 40 */                Boolean bool = tCFPurpose.f6178e;
/* 49 */                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
/* 50 */                Boolean bool2 = tCFPurpose.f6180g;
/* 63 */                arrayList.add(new uz1(zBooleanValue, bool2 != null ? bool2.booleanValue() : true, tCFPurpose));
                    }
/* 67 */            return CollectionsKt.m6192K(arrayList);
                }

                /* JADX INFO: renamed from: c */
                public static List m6587c(TCFData tCFData) {
/* 1 */             tCFData.getClass();
/* 13 */            List<TCFSpecialFeature> listM6186E = CollectionsKt.m6186E(new wa3(15), tCFData.f6162c);
/* 19 */            ArrayList arrayList = new ArrayList();
/* 30 */            for (TCFSpecialFeature tCFSpecialFeature : listM6186E) {
/* 40 */                Boolean bool = tCFSpecialFeature.f6190e;
/* 53 */                arrayList.add(new yf2(bool != null ? bool.booleanValue() : false, tCFSpecialFeature));
                    }
/* 57 */            return CollectionsKt.m6192K(arrayList);
                }
            }
