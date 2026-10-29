            package p000;

            import androidx.recyclerview.widget.RecyclerView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zg0 extends r12 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ah0 f20135a;

                public zg0(ah0 ah0Var) {
/* 4 */             this.f20135a = ah0Var;
                }

                @Override // p000.r12
                /* JADX INFO: renamed from: b */
                public final void mo2310b(RecyclerView recyclerView, int i, int i2) {
/* 1 */             int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
/* 5 */             int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
/* 9 */             ah0 ah0Var = this.f20135a;
/* 11 */            int i3 = ah0Var.f260a;
/* 15 */            int iComputeVerticalScrollRange = ah0Var.f278s.computeVerticalScrollRange();
/* 19 */            int i4 = ah0Var.f277r;
/* 32 */            ah0Var.f279t = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
/* 36 */            int iComputeHorizontalScrollRange = ah0Var.f278s.computeHorizontalScrollRange();
/* 40 */            int i5 = ah0Var.f276q;
/* 50 */            boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
/* 51 */            ah0Var.f280u = z;
/* 53 */            boolean z2 = ah0Var.f279t;
/* 55 */            if (!z2 && !z) {
/* 61 */                if (ah0Var.f281v != 0) {
/* 63 */                    ah0Var.m284g(0);
/* 66 */                    return;
                        }
/* 122 */               return;
                    }
/* 69 */            if (z2) {
                        float f = i4;
/* 80 */                ah0Var.f271l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
/* 89 */                ah0Var.f270k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
                    }
/* 93 */            if (ah0Var.f280u) {
                        float f2 = iComputeHorizontalScrollOffset;
                        float f3 = i5;
/* 104 */               ah0Var.f274o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
/* 113 */               ah0Var.f273n = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
                    }
/* 115 */           int i6 = ah0Var.f281v;
/* 117 */           if (i6 == 0 || i6 == 1) {
/* 123 */               ah0Var.m284g(1);
                    }
                }
            }
