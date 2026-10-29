            package p000;

            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function0;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pv2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15298a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qv2 f15299b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ pv2(qv2 qv2Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f15298a = i;
/* 3 */             this.f15299b = qv2Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f15298a;
/* 3 */             boolean z = true;
/* 4 */             qv2 qv2Var = this.f15299b;
                    switch (i) {
                        case 0:
/* 38 */                    o61 o61Var = qv2Var.f15782b;
/* 42 */                    if (o61Var != o61.f14643a && o61Var != o61.f14646d) {
/* 49 */                        z = false;
                            }
/* 54 */                    List list = (List) qv2Var.f15781a.f15574c;
/* 58 */                    ArrayList arrayList = new ArrayList();
/* 69 */                    for (Object obj : list) {
/* 76 */                        ev1 ev1Var = (ev1) obj;
/* 78 */                        if (!z || ev1Var.f7894c != fv1.URL) {
/* 87 */                            arrayList.add(obj);
                                }
                            }
/* 95 */                    return (List) yy1.m10221p(arrayList);
                        default:
/* 11 */                    yz2 yz2Var = qv2Var.f15783c.f19830i;
/* 13 */                    if (yz2Var != null) {
/* 37 */                        return yz2Var;
                            }
/* 19 */                    String str = (String) qv2Var.f15781a.f15576e;
/* 21 */                    if (str == null || !(!StringsKt.m6228D(str))) {
/* 36 */                        return null;
                            }
/* 32 */                    return new xz2(str);
                    }
                }
            }
