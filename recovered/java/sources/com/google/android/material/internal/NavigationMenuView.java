            package com.google.android.material.internal;

            import android.content.Context;
            import android.util.AttributeSet;
            import androidx.recyclerview.widget.LinearLayoutManager;
            import androidx.recyclerview.widget.RecyclerView;
            import p000.hh1;
            import p000.jg1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public class NavigationMenuView extends RecyclerView implements hh1 {
                public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 10 */            setLayoutManager(new LinearLayoutManager(1));
                }

                @Override // p000.hh1
                /* JADX INFO: renamed from: b */
                public final void mo331b(jg1 jg1Var) {
                }

                public int getWindowAnimations() {
/* 1 */             return 0;
                }

/* 13 */        public NavigationMenuView(Context context, AttributeSet attributeSet) {
/* 14 */            this(context, attributeSet, 0);
                }
            }
