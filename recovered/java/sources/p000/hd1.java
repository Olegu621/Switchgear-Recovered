            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import com.google.android.material.R$attr;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class hd1 {

                /* JADX INFO: renamed from: a */
                public static final int[] f9018a = {R.attr.theme, R$attr.theme};

                /* JADX INFO: renamed from: b */
                public static final int[] f9019b = {R$attr.materialThemeOverlay};

                /* JADX INFO: renamed from: a */
                public static Context m4176a(Context context, AttributeSet attributeSet, int i, int i2) {
/* 3 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9019b, i, i2);
/* 8 */             int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
/* 12 */            typedArrayObtainStyledAttributes.recycle();
/* 29 */            boolean z = (context instanceof z00) && ((z00) context).f19888a == resourceId;
/* 30 */            if (resourceId == 0 || z) {
/* 71 */                return context;
                    }
/* 37 */            z00 z00Var = new z00(context, resourceId);
/* 42 */            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f9018a);
/* 46 */            int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
/* 50 */            int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
/* 54 */            typedArrayObtainStyledAttributes2.recycle();
/* 57 */            if (resourceId2 == 0) {
/* 60 */                resourceId2 = resourceId3;
                    }
/* 61 */            if (resourceId2 != 0) {
/* 67 */                z00Var.getTheme().applyStyle(resourceId2, true);
                    }
/* 70 */            return z00Var;
                }
            }
