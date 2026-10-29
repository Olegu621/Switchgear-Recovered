            package p000;

            import com.usercentrics.sdk.services.deviceStorage.models.StorageSessionEntry;
            import java.util.LinkedHashSet;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: renamed from: nj */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1966nj extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C2003oj f14294a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f14295b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f14296c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1966nj(C2003oj c2003oj, long j, String str, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.f14294a = c2003oj;
/* 3 */             this.f14295b = j;
/* 5 */             this.f14296c = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 10 */            return new C1966nj(this.f14294a, this.f14295b, this.f14296c, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((C1966nj) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 10 */            pz2 pz2Var = (pz2) this.f14294a.f14775b;
/* 12 */            pz2Var.getClass();
/* 15 */            String str = this.f14296c;
/* 17 */            str.getClass();
/* 20 */            List listM7634f = pz2Var.m7634f();
/* 24 */            listM7634f.getClass();
/* 29 */            LinkedHashSet linkedHashSet = new LinkedHashSet(listM7634f);
/* 39 */            linkedHashSet.add(new StorageSessionEntry(str, this.f14295b));
/* 42 */            pz2Var.m7637i(linkedHashSet);
/* 45 */            return Unit.f12910a;
                }
            }
