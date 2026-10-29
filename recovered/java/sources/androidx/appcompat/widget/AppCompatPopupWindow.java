            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.widget.PopupWindow;
            import androidx.appcompat.R$styleable;
            import p000.ac1;
            import p000.qt1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class AppCompatPopupWindow extends PopupWindow {
                public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 4 */             m357a(context, attributeSet, i);
                }

                /* JADX INFO: renamed from: a */
                public final void m357a(Context context, AttributeSet attributeSet, int i) {
/* 3 */             ac1 ac1VarM156H = ac1.m156H(context, attributeSet, R$styleable.PopupWindow, i);
/* 7 */             int i2 = R$styleable.PopupWindow_overlapAnchor;
/* 11 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 17 */            if (typedArray.hasValue(i2)) {
/* 26 */                qt1.m8013c(this, typedArray.getBoolean(R$styleable.PopupWindow_overlapAnchor, false));
                    }
/* 35 */            setBackgroundDrawable(ac1VarM156H.m184n(R$styleable.PopupWindow_android_popupBackground));
/* 38 */            ac1VarM156H.m168J();
                }
            }
