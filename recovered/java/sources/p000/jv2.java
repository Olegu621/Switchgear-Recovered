            package p000;

            import androidx.recyclerview.widget.AbstractC0137o;
            import androidx.recyclerview.widget.RecyclerView;
            import java.util.LinkedHashSet;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class jv2 extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12507a = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f12508b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f12509c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f12510d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public jv2(kv2 kv2Var, int i, AbstractC0137o abstractC0137o) {
/* 11 */            super(1);
/* 4 */             this.f12509c = kv2Var;
/* 6 */             this.f12508b = i;
/* 8 */             this.f12510d = abstractC0137o;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             int i = this.f12507a;
/* 5 */             int i2 = this.f12508b;
/* 7 */             Object obj2 = this.f12510d;
/* 9 */             Object obj3 = this.f12509c;
                    switch (i) {
                        case 0:
/* 48 */                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 52 */                    kv2 kv2Var = (kv2) obj3;
/* 54 */                    LinkedHashSet linkedHashSet = kv2Var.f13026h;
/* 56 */                    Integer numValueOf = Integer.valueOf(i2);
/* 60 */                    linkedHashSet.getClass();
/* 63 */                    if (zBooleanValue) {
/* 65 */                        linkedHashSet.add(numValueOf);
                            } else {
/* 69 */                        linkedHashSet.remove(numValueOf);
                            }
/* 72 */                    if (zBooleanValue) {
/* 74 */                        int[] iArr = {0, 0};
/* 82 */                        ((AbstractC0137o) obj2).f1778a.getLocationOnScreen(iArr);
/* 93 */                        kv2Var.f13024f.invoke(Integer.valueOf(iArr[1]));
                            }
/* 98 */                    kv2Var.f1748a.m4418c(i2);
                            break;
                        default:
/* 16 */                    int iIntValue = ((Number) obj).intValue();
/* 24 */                    ((rv2) obj3).f16325c.invoke();
/* 27 */                    RecyclerView recyclerView = (RecyclerView) obj2;
/* 29 */                    int[] iArr2 = {0, 0};
/* 33 */                    recyclerView.getLocationOnScreen(iArr2);
/* 40 */                    recyclerView.m876d0(0, (iIntValue - iArr2[1]) - i2, false);
                            break;
                    }
/* 43 */            return Unit.f12910a;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public jv2(rv2 rv2Var, RecyclerView recyclerView, int i) {
                    super(1);
/* 15 */            this.f12509c = rv2Var;
                    this.f12510d = recyclerView;
                    this.f12508b = i;
                }
            }
