            package com.google.android.flexbox;

            import android.view.View;
            import java.util.ArrayList;
            import p000.AbstractC0208c9;
            
            /* JADX INFO: renamed from: com.google.android.flexbox.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0312a {

                /* JADX INFO: renamed from: e */
                public int f3194e;

                /* JADX INFO: renamed from: f */
                public int f3195f;

                /* JADX INFO: renamed from: g */
                public int f3196g;

                /* JADX INFO: renamed from: h */
                public int f3197h;

                /* JADX INFO: renamed from: i */
                public int f3198i;

                /* JADX INFO: renamed from: j */
                public float f3199j;

                /* JADX INFO: renamed from: k */
                public float f3200k;

                /* JADX INFO: renamed from: l */
                public int f3201l;

                /* JADX INFO: renamed from: m */
                public int f3202m;

                /* JADX INFO: renamed from: o */
                public int f3204o;

                /* JADX INFO: renamed from: p */
                public int f3205p;

                /* JADX INFO: renamed from: q */
                public boolean f3206q;

                /* JADX INFO: renamed from: r */
                public boolean f3207r;

                /* JADX INFO: renamed from: a */
                public int f3190a = AbstractC0208c9.API_PRIORITY_OTHER;

                /* JADX INFO: renamed from: b */
                public int f3191b = AbstractC0208c9.API_PRIORITY_OTHER;

                /* JADX INFO: renamed from: c */
                public int f3192c = Integer.MIN_VALUE;

                /* JADX INFO: renamed from: d */
                public int f3193d = Integer.MIN_VALUE;

                /* JADX INFO: renamed from: n */
                public final ArrayList f3203n = new ArrayList();

                /* JADX INFO: renamed from: a */
                public final int m1961a() {
/* 5 */             return this.f3197h - this.f3198i;
                }

                /* JADX INFO: renamed from: b */
                public final void m1962b(View view, int i, int i2, int i3, int i4) {
/* 5 */             FlexItem flexItem = (FlexItem) view.getLayoutParams();
/* 23 */            this.f3190a = Math.min(this.f3190a, (view.getLeft() - flexItem.mo1912e0()) - i);
/* 41 */            this.f3191b = Math.min(this.f3191b, (view.getTop() - flexItem.mo1914m0()) - i2);
/* 59 */            this.f3192c = Math.max(this.f3192c, view.getRight() + flexItem.mo1908Y0() + i3);
/* 77 */            this.f3193d = Math.max(this.f3193d, view.getBottom() + flexItem.mo1909Z() + i4);
                }
            }
