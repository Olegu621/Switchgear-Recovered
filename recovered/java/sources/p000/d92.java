            package p000;

            import com.usercentrics.tcf.core.model.gvl.Vendor;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class d92 extends vo0 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7068a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ d92(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
/* 3 */             super(i, obj, cls, str, str2, i2);
/* 1 */             this.f7068a = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    List listM6192K;
                    switch (this.f7068a) {
                        case 0:
/* 242 */                   ql2 ql2Var = (ql2) obj;
/* 246 */                   ql2Var.getClass();
/* 249 */                   ((wp0) obj2).getClass();
/* 256 */                   ((f92) this.receiver).getClass();
/* 259 */                   return ql2Var;
                        case 1:
/* 29 */                    ql2 ql2Var2 = (ql2) obj;
/* 32 */                    wp0 wp0Var = (wp0) obj2;
/* 34 */                    ql2Var2.getClass();
/* 37 */                    wp0Var.getClass();
/* 44 */                    ((f92) this.receiver).getClass();
/* 47 */                    xz1 xz1Var = ql2Var2.f15621C;
/* 49 */                    xz1Var.getClass();
/* 54 */                    if (xz1Var.f19425d == null) {
/* 57 */                        xz1Var.f19425d = wp0Var;
                            }
/* 94 */                    ql2Var2.f15640s.m8938e(C2085pw.m7566e(1, 3, 4, 5, 6));
/* 99 */                    LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 106 */                   linkedHashMap.put("legIntPurposes", ql2Var2.f15647z);
/* 113 */                   linkedHashMap.put("purposes", ql2Var2.f15646y);
/* 128 */                   for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 141 */                       String str = (String) entry.getKey();
/* 148 */                       u13 u13Var = (u13) entry.getValue();
/* 152 */                       e92 e92Var = new e92(wp0Var, u13Var, str, xz1Var, ql2Var2);
/* 158 */                       for (int i = 1; i <= u13Var.f17331b; i++) {
/* 172 */                           e92Var.invoke(Boolean.valueOf(u13Var.m8934a(i)), Integer.valueOf(i));
                                }
                            }
/* 178 */                   u13 u13Var2 = ql2Var2.f15619A;
/* 180 */                   Map map = wp0Var.f18719b;
/* 182 */                   if (map != null) {
/* 190 */                       ArrayList arrayList = new ArrayList(map.size());
/* 197 */                       Iterator it = map.entrySet().iterator();
/* 205 */                       while (it.hasNext()) {
/* 225 */                           arrayList.add(Integer.valueOf(((Vendor) ((Map.Entry) it.next()).getValue()).f6846o));
                                }
/* 229 */                       listM6192K = CollectionsKt.m6192K(arrayList);
                            } else {
/* 234 */                       listM6192K = null;
                            }
/* 235 */                   listM6192K.getClass();
/* 238 */                   u13Var2.m8936c(listM6192K);
/* 241 */                   return ql2Var2;
                        default:
/* 22 */                    qu2.m8017j((qu2) this.receiver, ((Number) obj).intValue(), ((Number) obj2).intValue());
/* 25 */                    return Unit.f12910a;
                    }
                }
            }
