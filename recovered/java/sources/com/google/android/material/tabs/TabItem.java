            package com.google.android.material.tabs;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.View;
            import com.google.android.material.R$styleable;
            import p000.ac1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class TabItem extends View {

                /* JADX INFO: renamed from: a */
                public final CharSequence f4948a;

                /* JADX INFO: renamed from: b */
                public final Drawable f4949b;

                /* JADX INFO: renamed from: c */
                public final int f4950c;

                public TabItem(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 6 */             ac1 ac1VarM155G = ac1.m155G(context, attributeSet, R$styleable.TabItem);
/* 10 */            int i = R$styleable.TabItem_android_text;
/* 14 */            TypedArray typedArray = (TypedArray) ac1VarM155G.f178c;
/* 20 */            this.f4948a = typedArray.getText(i);
/* 28 */            this.f4949b = ac1VarM155G.m184n(R$styleable.TabItem_android_icon);
/* 37 */            this.f4950c = typedArray.getResourceId(R$styleable.TabItem_android_layout, 0);
/* 39 */            ac1VarM155G.m168J();
                }
            }
