            package p000;

            import android.content.Context;
            import android.view.MotionEvent;
            import android.view.accessibility.AccessibilityEvent;
            import androidx.recyclerview.widget.RecyclerView;
            import androidx.viewpager2.widget.ViewPager2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class m43 extends RecyclerView {

                /* JADX INFO: renamed from: n1 */
                public final /* synthetic */ ViewPager2 f13560n1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public m43(ViewPager2 viewPager2, Context context) {
/* 4 */             super(context, null);
/* 1 */             this.f13560n1 = viewPager2;
                }

                @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
                public final CharSequence getAccessibilityClassName() {
/* 5 */             this.f13560n1.f2023h0.getClass();
/* 8 */             return super.getAccessibilityClassName();
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             super.onInitializeAccessibilityEvent(accessibilityEvent);
/* 4 */             ViewPager2 viewPager2 = this.f13560n1;
/* 8 */             accessibilityEvent.setFromIndex(viewPager2.f2016d);
/* 13 */            accessibilityEvent.setToIndex(viewPager2.f2016d);
/* 22 */            accessibilityEvent.setSource((ViewPager2) viewPager2.f2023h0.f15958d);
/* 27 */            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
                }

                @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    return this.f13560n1.f2021f0 && super.onInterceptTouchEvent(motionEvent);
                }

                @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    return this.f13560n1.f2021f0 && super.onTouchEvent(motionEvent);
                }
            }
