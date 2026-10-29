            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c23 extends b51 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ h22 f2666a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ e22 f2667b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ u13 f2668c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ f22 f2669d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f2670e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ h22 f2671f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ ArrayList f2672i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c23(h22 h22Var, e22 e22Var, u13 u13Var, f22 f22Var, int i, h22 h22Var2, ArrayList arrayList) {
/* 16 */            super(2);
/* 1 */             this.f2666a = h22Var;
/* 3 */             this.f2667b = e22Var;
/* 5 */             this.f2668c = u13Var;
/* 7 */             this.f2669d = f22Var;
/* 9 */             this.f2670e = i;
/* 11 */            this.f2671f = h22Var2;
/* 13 */            this.f2672i = arrayList;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 9 */             int iIntValue = ((Number) obj2).intValue();
/* 13 */            h22 h22Var = this.f2666a;
/* 15 */            Object obj3 = h22Var.f8873a;
/* 19 */            AbstractC0883ek.Companion.getClass();
/* 41 */            h22Var.f8873a = obj3 + C0847dk.m3142a(zBooleanValue);
/* 43 */            u13 u13Var = this.f2668c;
/* 45 */            int i = u13Var.f17331b;
/* 49 */            f22 f22Var = this.f2669d;
/* 61 */            boolean z = i > 45 && f22Var.f7976a < this.f2670e;
/* 64 */            this.f2667b.f7490a = z;
/* 66 */            if (z && zBooleanValue) {
/* 72 */                boolean zM8934a = u13Var.m8934a(iIntValue + 1);
/* 76 */                h22 h22Var2 = this.f2671f;
/* 78 */                Object obj4 = h22Var2.f8873a;
/* 80 */                if (!zM8934a) {
/* 88 */                    ((List) obj4).add(Integer.valueOf(iIntValue));
/* 91 */                    int i2 = f22Var.f7976a;
/* 93 */                    C2109qj c2109qj = EnumC2146rj.Companion;
/* 97 */                    f22Var.f7976a = i2 + 16;
/* 109 */                   this.f2672i.add(CollectionsKt.m6194M((Collection) h22Var2.f8873a));
/* 116 */                   ((List) h22Var2.f8873a).clear();
/* 124 */                   h22Var2.f8873a = new ArrayList();
                        } else if (((List) obj4).size() == 0) {
/* 143 */                   ((List) h22Var2.f8873a).add(Integer.valueOf(iIntValue));
/* 146 */                   int i3 = f22Var.f7976a;
/* 148 */                   C2109qj c2109qj2 = EnumC2146rj.Companion;
/* 152 */                   f22Var.f7976a = i3 + 17;
                        }
                    }
/* 154 */           return Unit.f12910a;
                }
            }
