            package p000;

            import com.supercell.titan.C0800g;
            import com.supercell.titan.C0801h;
            import java.util.ArrayList;
            import java.util.function.Consumer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class ue3 implements Consumer {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17495a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f17496b;

                public /* synthetic */ ue3(Object obj, int i) {
/* 1 */             this.f17495a = i;
/* 3 */             this.f17496b = obj;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
/* 1 */             int i = this.f17495a;
/* 3 */             Object obj2 = this.f17496b;
                    switch (i) {
                        case 0:
/* 26 */                    ((C0800g) obj2).m2753a((C1833kj) obj, new ArrayList());
                            break;
                        default:
/* 13 */                    ((C0801h) obj2).m2754a((C1833kj) obj, null);
                            break;
                    }
                }
            }
