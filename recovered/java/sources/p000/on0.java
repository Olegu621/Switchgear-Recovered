            package p000;

            import androidx.transition.Transition;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class on0 extends jr2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Object f14837a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ArrayList f14838b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f14839c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ArrayList f14840d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ qn0 f14841e;

                public on0(qn0 qn0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
/* 4 */             this.f14841e = qn0Var;
/* 6 */             this.f14837a = obj;
/* 8 */             this.f14838b = arrayList;
/* 10 */            this.f14839c = obj2;
/* 12 */            this.f14840d = arrayList2;
                }

                @Override // p000.jr2, p000.ir2
                /* JADX INFO: renamed from: a */
                public final void mo86a(Transition transition) {
/* 2 */             qn0 qn0Var = this.f14841e;
/* 4 */             Object obj = this.f14837a;
/* 6 */             if (obj != null) {
/* 10 */                qn0Var.m7954s(obj, this.f14838b, null);
                    }
/* 13 */            Object obj2 = this.f14839c;
/* 15 */            if (obj2 != null) {
/* 19 */                qn0Var.m7954s(obj2, this.f14840d, null);
                    }
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: c */
                public final void mo88c(Transition transition) {
/* 1 */             transition.m1104v(this);
                }
            }
