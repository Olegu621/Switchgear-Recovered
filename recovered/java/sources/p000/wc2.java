            package p000;

            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wc2 extends cd2 {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ArrayList f18581b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Matrix f18582c;

                public wc2(ArrayList arrayList, Matrix matrix) {
/* 4 */             this.f18581b = arrayList;
/* 6 */             this.f18582c = matrix;
                }

                @Override // p000.cd2
                /* JADX INFO: renamed from: a */
                public final void mo1635a(Matrix matrix, rc2 rc2Var, int i, Canvas canvas) {
/* 3 */             Iterator it = this.f18581b.iterator();
/* 11 */            while (it.hasNext()) {
/* 21 */                ((cd2) it.next()).mo1635a(this.f18582c, rc2Var, i, canvas);
                    }
                }
            }
