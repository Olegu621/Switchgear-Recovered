            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pt2 {
                /* JADX INFO: renamed from: a */
                public static ArrayList m7552a(List list) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Iterator it = list.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                ut2 ut2Var = (ut2) it.next();
/* 22 */                String str = ut2Var.f17719a;
/* 24 */                if (str != null && !StringsKt.m6228D(str)) {
/* 38 */                    arrayList.add(new zv2(str));
                        }
/* 43 */                arrayList.addAll(ut2Var.f17720b);
/* 46 */                du2 du2Var = ut2Var.f17721c;
/* 48 */                if (du2Var != null) {
/* 50 */                    arrayList.add(du2Var);
                        }
                    }
/* 54 */            return arrayList;
                }
            }
