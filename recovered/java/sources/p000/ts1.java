            package p000;

            import com.supercell.p007id.scid_plugin.IdAccount;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ts1 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ MethodChannel.Result f17249a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ List f17250b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ts1(MethodChannel.Result result, List list, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.f17249a = result;
/* 3 */             this.f17250b = list;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new ts1(this.f17249a, this.f17250b, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((ts1) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 10 */            List list = this.f17250b;
/* 16 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 19 */            Iterator it = list.iterator();
/* 27 */            while (it.hasNext()) {
/* 39 */                arrayList.add(((IdAccount) it.next()).jsonMap());
                    }
/* 45 */            this.f17249a.success(arrayList);
/* 48 */            return Unit.f12910a;
                }
            }
