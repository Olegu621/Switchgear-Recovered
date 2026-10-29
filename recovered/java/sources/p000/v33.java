            package p000;

            import android.view.View;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v33 {

                /* JADX INFO: renamed from: a */
                public final View f17851a;

                /* JADX INFO: renamed from: b */
                public int f17852b;

                /* JADX INFO: renamed from: c */
                public int f17853c;

                /* JADX INFO: renamed from: d */
                public int f17854d;

                public v33(View view) {
/* 4 */             this.f17851a = view;
                }

                /* JADX INFO: renamed from: a */
                public final void m9216a() {
/* 1 */             int i = this.f17854d;
/* 3 */             View view = this.f17851a;
/* 12 */            int top = i - (view.getTop() - this.f17852b);
/* 13 */            WeakHashMap weakHashMap = e33.f7494a;
/* 15 */            view.offsetTopAndBottom(top);
/* 27 */            view.offsetLeftAndRight(0 - (view.getLeft() - this.f17853c));
                }

                /* JADX INFO: renamed from: b */
                public final boolean m9217b(int i) {
/* 3 */             if (this.f17854d == i) {
/* 12 */                return false;
                    }
/* 5 */             this.f17854d = i;
/* 7 */             m9216a();
/* 10 */            return true;
                }
            }
