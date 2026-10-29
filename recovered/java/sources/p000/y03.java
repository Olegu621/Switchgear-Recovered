            package p000;

            import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class y03 extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19431a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ a13 f19432b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ArrayList f19433c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ y03(a13 a13Var, ArrayList arrayList, int i) {
/* 8 */             super(1);
/* 1 */             this.f19431a = i;
/* 3 */             this.f19432b = a13Var;
/* 5 */             this.f19433c = arrayList;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C2167s3 c2167s3;
                    List list;
/* 1 */             int i = this.f19431a;
/* 3 */             ArrayList arrayList = this.f19433c;
/* 5 */             a13 a13Var = this.f19432b;
                    switch (i) {
                        case 0:
/* 46 */                    TCFData tCFData = (TCFData) obj;
/* 48 */                    tCFData.getClass();
/* 53 */                    fb1 fb1Var = a13Var.f30a;
/* 76 */                    a13Var.m25f(arrayList, new tk2(((p91) fb1Var.f8065C.getValue()).f15029b.m2819b(), tCFData.f6161b, tCFData.f6165f));
/* 79 */                    String str = tCFData.f6166g;
/* 87 */                    C2484y3 c2484y3 = (C2484y3) fb1Var.f8086X.getValue();
/* 89 */                    String str2 = c2484y3.f19467e;
/* 93 */                    if (str2 == null || StringsKt.m6228D(str2) || (list = c2484y3.f19466d) == null || list.isEmpty()) {
/* 123 */                       C2167s3 c2167s4 = new C2167s3(HttpUrl.FRAGMENT_ENCODE_SET, nd0.f14189a);
/* 126 */                       c2167s3 = c2167s4;
                            } else {
/* 115 */                       c2167s3 = new C2167s3(str2, list);
                            }
/* 138 */                   a13Var.m27h(str, c2167s3.f16394a, arrayList);
                            break;
                        default:
/* 10 */                    TCFData tCFData2 = (TCFData) obj;
/* 12 */                    tCFData2.getClass();
/* 40 */                    a13Var.m25f(arrayList, new tk2(((p91) a13Var.f30a.f8065C.getValue()).f15029b.m2819b(), tCFData2.f6161b, tCFData2.f6165f));
                            break;
                    }
/* 43 */            return Unit.f12910a;
                }
            }
