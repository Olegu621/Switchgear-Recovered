            package p000;

            import androidx.recyclerview.widget.LinearLayoutManager;
            import androidx.recyclerview.widget.RecyclerView;
            import com.google.android.material.datepicker.C0355l;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wc1 extends LinearLayoutManager {

                /* JADX INFO: renamed from: p0 */
                public final /* synthetic */ int f18579p0;

                /* JADX INFO: renamed from: q0 */
                public final /* synthetic */ C0355l f18580q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public wc1(C0355l c0355l, int i, int i2) {
/* 5 */             super(i);
/* 1 */             this.f18580q0 = c0355l;
/* 3 */             this.f18579p0 = i2;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: I0 */
                public final void mo801I0(RecyclerView recyclerView, int i) {
/* 7 */             if2 if2Var = new if2(recyclerView.getContext());
/* 10 */            if2Var.f18902a = i;
/* 12 */            m988J0(if2Var);
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager
                /* JADX INFO: renamed from: L0 */
                public final void mo802L0(y12 y12Var, int[] iArr) {
/* 1 */             C0355l c0355l = this.f18580q0;
/* 3 */             RecyclerView recyclerView = c0355l.f4666w;
/* 9 */             if (this.f18579p0 == 0) {
/* 15 */                iArr[0] = recyclerView.getWidth();
/* 23 */                iArr[1] = c0355l.f4666w.getWidth();
                    } else {
/* 30 */                iArr[0] = recyclerView.getHeight();
/* 38 */                iArr[1] = c0355l.f4666w.getHeight();
                    }
                }
            }
