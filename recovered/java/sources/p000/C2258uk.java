            package p000;

            import android.view.View;
            import com.google.android.material.bottomsheet.BottomSheetBehavior;
            import java.lang.ref.WeakReference;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: uk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2258uk {

                /* JADX INFO: renamed from: a */
                public int f17567a;

                /* JADX INFO: renamed from: b */
                public boolean f17568b;

                /* JADX INFO: renamed from: c */
                public final RunnableC2495ye f17569c = new RunnableC2495ye(this, 1);

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ BottomSheetBehavior f17570d;

                public C2258uk(BottomSheetBehavior bottomSheetBehavior) {
/* 4 */             this.f17570d = bottomSheetBehavior;
                }

                /* JADX INFO: renamed from: a */
                public final void m9033a(int i) {
/* 1 */             BottomSheetBehavior bottomSheetBehavior = this.f17570d;
/* 3 */             WeakReference weakReference = bottomSheetBehavior.f4494R;
/* 5 */             if (weakReference == null || weakReference.get() == null) {
/* 38 */                return;
                    }
/* 14 */            this.f17567a = i;
/* 18 */            if (this.f17568b) {
/* 38 */                return;
                    }
/* 26 */            View view = (View) bottomSheetBehavior.f4494R.get();
/* 28 */            WeakHashMap weakHashMap = e33.f7494a;
/* 32 */            view.postOnAnimation(this.f17569c);
/* 36 */            this.f17568b = true;
                }
            }
