            package androidx.appcompat.view.menu;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.AdapterView;
            import android.widget.ListView;
            import p000.ac1;
            import p000.hh1;
            import p000.ig1;
            import p000.jg1;
            import p000.sg1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 47 */    public final class ExpandedMenuView extends ListView implements ig1, hh1, AdapterView.OnItemClickListener {

                /* JADX INFO: renamed from: b */
                public static final int[] f377b = {R.attr.background, R.attr.divider};

                /* JADX INFO: renamed from: a */
                public jg1 f378a;

                public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet);
/* 4 */             setOnItemClickListener(this);
/* 9 */             ac1 ac1VarM156H = ac1.m156H(context, attributeSet, f377b, i);
/* 15 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 22 */            if (typedArray.hasValue(0)) {
/* 28 */                setBackgroundDrawable(ac1VarM156H.m184n(0));
                    }
/* 36 */            if (typedArray.hasValue(1)) {
/* 42 */                setDivider(ac1VarM156H.m184n(1));
                    }
/* 45 */            ac1VarM156H.m168J();
                }

                @Override // p000.ig1
                /* JADX INFO: renamed from: a */
                public final boolean mo330a(sg1 sg1Var) {
/* 5 */             return this.f378a.m5809q(sg1Var, null, 0);
                }

                @Override // p000.hh1
                /* JADX INFO: renamed from: b */
                public final void mo331b(jg1 jg1Var) {
/* 1 */             this.f378a = jg1Var;
                }

                public int getWindowAnimations() {
/* 1 */             return 0;
                }

                @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 5 */             setChildrenDrawingCacheEnabled(false);
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
/* 11 */            mo330a((sg1) getAdapter().getItem(i));
                }

/* 48 */        public ExpandedMenuView(Context context, AttributeSet attributeSet) {
/* 49 */            this(context, attributeSet, R.attr.listViewStyle);
                }
            }
