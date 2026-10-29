            package p000;

            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlinx.serialization.KSerializer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ma2 extends b51 implements Function2 {

                /* JADX INFO: renamed from: b */
                public static final ma2 f13666b;

                /* JADX INFO: renamed from: c */
                public static final ma2 f13667c;

                /* JADX INFO: renamed from: d */
                public static final ma2 f13668d;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13669a;

                static {
/* 3 */             int i = 2;
/* 8 */             f13666b = new ma2(i, 0);
/* 16 */            f13667c = new ma2(i, 1);
/* 24 */            f13668d = new ma2(i, 2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ma2(int i, int i2) {
/* 3 */             super(i);
/* 1 */             this.f13669a = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f13669a) {
                        case 0:
/* 52 */                    o21 o21Var = (o21) obj;
/* 54 */                    List list = (List) obj2;
/* 56 */                    o21Var.getClass();
/* 59 */                    list.getClass();
/* 64 */                    ArrayList arrayListM5735A = jb1.m5735A(oa2.f14694a, list, true);
/* 68 */                    arrayListM5735A.getClass();
/* 71 */                    return jb1.m5761u(o21Var, list, arrayListM5735A);
                        case 1:
/* 20 */                    o21 o21Var2 = (o21) obj;
/* 22 */                    List list2 = (List) obj2;
/* 24 */                    o21Var2.getClass();
/* 27 */                    list2.getClass();
/* 32 */                    ArrayList arrayListM5735A2 = jb1.m5735A(oa2.f14694a, list2, true);
/* 36 */                    arrayListM5735A2.getClass();
/* 39 */                    KSerializer kSerializerM5761u = jb1.m5761u(o21Var2, list2, arrayListM5735A2);
/* 43 */                    if (kSerializerM5761u != null) {
/* 45 */                        return j13.m5647i(kSerializerM5761u);
                            }
/* 50 */                    return null;
                        default:
/* 9 */                     ((Number) obj).intValue();
/* 14 */                    ((Number) obj2).intValue();
/* 17 */                    return Unit.f12910a;
                    }
                }
            }
