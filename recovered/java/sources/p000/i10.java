            package p000;

            import android.content.Context;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.recyclerview.widget.AbstractC0129g;
            import androidx.recyclerview.widget.AbstractC0137o;
            import com.usercentrics.sdk.p008ui.R$layout;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import java.util.List;
            import kotlin.collections.CollectionsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i10 extends AbstractC0129g {

                /* JADX INFO: renamed from: d */
                public final ew2 f9389d;

                /* JADX INFO: renamed from: e */
                public final List f9390e;

                public i10(ew2 ew2Var, List list) {
/* 1 */             ew2Var.getClass();
/* 4 */             list.getClass();
/* 10 */            this.f9389d = ew2Var;
/* 12 */            this.f9390e = list;
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: a */
                public final int mo955a() {
/* 3 */             return this.f9390e.size();
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: e */
                public final void mo959e(AbstractC0137o abstractC0137o, int i) {
/* 1 */             h10 h10Var = (h10) abstractC0137o;
/* 9 */             su1 su1Var = (su1) this.f9390e.get(i);
/* 11 */            su1Var.getClass();
/* 16 */            Object value = h10Var.f8863u.getValue();
/* 20 */            value.getClass();
/* 27 */            ((UCTextView) value).setText(su1Var.f16801a);
/* 32 */            Object value2 = h10Var.f8864v.getValue();
/* 36 */            value2.getClass();
/* 54 */            ((UCTextView) value2).setText(CollectionsKt.m6203x(su1Var.f16802b, "\n", null, null, null, 62));
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: f */
                public final AbstractC0137o mo960f(ViewGroup viewGroup, int i) {
/* 3 */             int i2 = R$layout.uc_cookie_card;
/* 5 */             Context context = viewGroup.getContext();
/* 9 */             context.getClass();
/* 12 */            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
/* 16 */            layoutInflaterFrom.getClass();
/* 20 */            View viewInflate = layoutInflaterFrom.inflate(i2, viewGroup, false);
/* 24 */            viewInflate.getClass();
/* 29 */            return new h10(this.f9389d, viewInflate);
                }
            }
