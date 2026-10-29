            package androidx.appcompat.app;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.ViewGroup;
            import androidx.appcompat.R$styleable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public class ActionBar$LayoutParams extends ViewGroup.MarginLayoutParams {

                /* JADX INFO: renamed from: a */
                public int f359a;

                public ActionBar$LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f359a = 0;
/* 9 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionBarLayout);
/* 19 */            this.f359a = typedArrayObtainStyledAttributes.getInt(R$styleable.ActionBarLayout_android_layout_gravity, 0);
/* 21 */            typedArrayObtainStyledAttributes.recycle();
                }

/* 24 */        public ActionBar$LayoutParams(ActionBar$LayoutParams actionBar$LayoutParams) {
/* 25 */            super((ViewGroup.MarginLayoutParams) actionBar$LayoutParams);
/* 26 */            this.f359a = 0;
/* 27 */            this.f359a = actionBar$LayoutParams.f359a;
                }

/* 27 */        public ActionBar$LayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 28 */            super(layoutParams);
/* 29 */            this.f359a = 0;
                }
            }
