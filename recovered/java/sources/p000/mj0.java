            package p000;

            import com.google.android.flexbox.FlexboxLayoutManager;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mj0 {

                /* JADX INFO: renamed from: a */
                public int f13800a;

                /* JADX INFO: renamed from: b */
                public int f13801b;

                /* JADX INFO: renamed from: c */
                public int f13802c;

                /* JADX INFO: renamed from: d */
                public int f13803d = 0;

                /* JADX INFO: renamed from: e */
                public boolean f13804e;

                /* JADX INFO: renamed from: f */
                public boolean f13805f;

                /* JADX INFO: renamed from: g */
                public boolean f13806g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ FlexboxLayoutManager f13807h;

                public mj0(FlexboxLayoutManager flexboxLayoutManager) {
/* 4 */             this.f13807h = flexboxLayoutManager;
                }

                /* JADX INFO: renamed from: a */
                public static void m6662a(mj0 mj0Var) {
/* 1 */             FlexboxLayoutManager flexboxLayoutManager = mj0Var.f13807h;
/* 7 */             if (!flexboxLayoutManager.mo1927j() && flexboxLayoutManager.f3159e0) {
/* 34 */                mj0Var.f13802c = mj0Var.f13804e ? flexboxLayoutManager.f3167m0.mo946g() : flexboxLayoutManager.f1757Y - flexboxLayoutManager.f3167m0.mo950k();
/* 36 */                return;
                    }
/* 37 */            boolean z = mj0Var.f13804e;
/* 39 */            pc0 pc0Var = flexboxLayoutManager.f3167m0;
/* 52 */            mj0Var.f13802c = z ? pc0Var.mo946g() : pc0Var.mo950k();
                }

                /* JADX INFO: renamed from: b */
                public static void m6663b(mj0 mj0Var) {
/* 2 */             mj0Var.f13800a = -1;
/* 4 */             mj0Var.f13801b = -1;
/* 8 */             mj0Var.f13802c = Integer.MIN_VALUE;
/* 11 */            mj0Var.f13805f = false;
/* 13 */            mj0Var.f13806g = false;
/* 15 */            FlexboxLayoutManager flexboxLayoutManager = mj0Var.f13807h;
/* 17 */            boolean zMo1927j = flexboxLayoutManager.mo1927j();
/* 21 */            int i = flexboxLayoutManager.f3156b0;
/* 25 */            if (zMo1927j) {
/* 27 */                if (i == 0) {
/* 34 */                    mj0Var.f13804e = flexboxLayoutManager.f3155a0 == 1;
/* 36 */                    return;
                        } else {
/* 40 */                    mj0Var.f13804e = i == 2;
/* 42 */                    return;
                        }
                    }
/* 43 */            if (i == 0) {
/* 51 */                mj0Var.f13804e = flexboxLayoutManager.f3155a0 == 3;
                    } else {
/* 57 */                mj0Var.f13804e = i == 2;
                    }
                }

                public final String toString() {
/* 78 */            return "AnchorInfo{mPosition=" + this.f13800a + ", mFlexLinePosition=" + this.f13801b + ", mCoordinate=" + this.f13802c + ", mPerpendicularCoordinate=" + this.f13803d + ", mLayoutFromEnd=" + this.f13804e + ", mValid=" + this.f13805f + ", mAssignedFromSavedState=" + this.f13806g + '}';
                }
            }
