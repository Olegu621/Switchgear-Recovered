            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class y12 {

                /* JADX INFO: renamed from: a */
                public int f19437a;

                /* JADX INFO: renamed from: b */
                public int f19438b;

                /* JADX INFO: renamed from: c */
                public int f19439c;

                /* JADX INFO: renamed from: d */
                public int f19440d;

                /* JADX INFO: renamed from: e */
                public int f19441e;

                /* JADX INFO: renamed from: f */
                public boolean f19442f;

                /* JADX INFO: renamed from: g */
                public boolean f19443g;

                /* JADX INFO: renamed from: h */
                public boolean f19444h;

                /* JADX INFO: renamed from: i */
                public boolean f19445i;

                /* JADX INFO: renamed from: j */
                public boolean f19446j;

                /* JADX INFO: renamed from: k */
                public boolean f19447k;

                /* JADX INFO: renamed from: l */
                public int f19448l;

                /* JADX INFO: renamed from: m */
                public long f19449m;

                /* JADX INFO: renamed from: n */
                public int f19450n;

                /* JADX INFO: renamed from: a */
                public final void m10081a(int i) {
/* 4 */             if ((this.f19440d & i) != 0) {
/* 6 */                 return;
                    }
/* 44 */            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f19440d));
                }

                /* JADX INFO: renamed from: b */
                public final int m10082b() {
                    return this.f19443g ? this.f19438b - this.f19439c : this.f19441e;
                }

                public final String toString() {
/* 98 */            return "State{mTargetPosition=" + this.f19437a + ", mData=null, mItemCount=" + this.f19441e + ", mIsMeasuring=" + this.f19445i + ", mPreviousLayoutItemCount=" + this.f19438b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f19439c + ", mStructureChanged=" + this.f19442f + ", mInPreLayout=" + this.f19443g + ", mRunSimpleAnimations=" + this.f19446j + ", mRunPredictiveAnimations=" + this.f19447k + '}';
                }
            }
