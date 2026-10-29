            package p000;

            import android.content.Context;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.recyclerview.widget.AbstractC0129g;
            import androidx.recyclerview.widget.AbstractC0137o;
            import com.usercentrics.sdk.p008ui.R$dimen;
            import com.usercentrics.sdk.p008ui.components.UCControllerId;
            import com.usercentrics.sdk.p008ui.components.UCSectionTitle;
            import com.usercentrics.sdk.p008ui.components.cards.UCCard;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kv2 extends AbstractC0129g {
                public static final iv2 Companion = new iv2();

                /* JADX INFO: renamed from: d */
                public final ew2 f13022d;

                /* JADX INFO: renamed from: e */
                public final n01 f13023e;

                /* JADX INFO: renamed from: f */
                public final jv2 f13024f;

                /* JADX INFO: renamed from: g */
                public List f13025g;

                /* JADX INFO: renamed from: h */
                public final LinkedHashSet f13026h;

                public kv2(ew2 ew2Var, n01 n01Var, jv2 jv2Var) {
/* 1 */             ew2Var.getClass();
/* 7 */             this.f13022d = ew2Var;
/* 9 */             this.f13023e = n01Var;
/* 11 */            this.f13024f = jv2Var;
/* 15 */            this.f13025g = nd0.f14189a;
/* 22 */            this.f13026h = new LinkedHashSet();
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: a */
                public final int mo955a() {
/* 3 */             return this.f13025g.size();
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: c */
                public final int mo957c(int i) {
/* 7 */             qt2 qt2Var = (qt2) this.f13025g.get(i);
/* 11 */            if (qt2Var instanceof zv2) {
/* 13 */                return 842;
                    }
/* 18 */            if (qt2Var instanceof st2) {
/* 20 */                return 843;
                    }
/* 25 */            if (qt2Var instanceof du2) {
/* 27 */                return 841;
                    }
/* 30 */            ds0.m3187b();
/* 33 */            return 0;
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: e */
                public final void mo959e(AbstractC0137o abstractC0137o, int i) {
/* 7 */             qt2 qt2Var = (qt2) this.f13025g.get(i);
/* 11 */            if (abstractC0137o instanceof aw2) {
/* 15 */                qt2Var.getClass();
/* 24 */                ((aw2) abstractC0137o).f2130u.setText(((zv2) qt2Var).f20356a);
/* 27 */                return;
                    }
/* 31 */            if (!(abstractC0137o instanceof tt2)) {
/* 109 */               if (abstractC0137o instanceof eu2) {
/* 111 */                   eu2 eu2Var = (eu2) abstractC0137o;
/* 113 */                   qt2Var.getClass();
/* 118 */                   UCControllerId uCControllerId = eu2Var.f7885u;
/* 120 */                   uCControllerId.m2786k((du2) qt2Var);
/* 123 */                   View view = eu2Var.f1778a;
/* 147 */                   k33.m5944a(uCControllerId, (int) view.getResources().getDimension(R$dimen.ucCardHorizontalMargin), (int) view.getResources().getDimension(R$dimen.ucCardVerticalMargin), true);
/* 150 */                   return;
                        }
/* 150 */               return;
                    }
/* 34 */            tt2 tt2Var = (tt2) abstractC0137o;
/* 36 */            qt2Var.getClass();
/* 40 */            st2 st2Var = (st2) qt2Var;
/* 48 */            boolean zContains = this.f13026h.contains(Integer.valueOf(i));
/* 59 */            boolean z = i == this.f13025g.size() - 1;
/* 74 */            tt2Var.f17260v.m2802b(tt2Var.f17259u, st2Var, zContains, new jv2(this, i, abstractC0137o), this.f13023e);
/* 77 */            UCCard uCCard = tt2Var.f17260v;
/* 79 */            View view2 = tt2Var.f1778a;
/* 103 */           k33.m5944a(uCCard, (int) view2.getResources().getDimension(R$dimen.ucCardHorizontalMargin), (int) view2.getResources().getDimension(R$dimen.ucCardVerticalMargin), z);
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: f */
                public final AbstractC0137o mo960f(ViewGroup viewGroup, int i) {
/* 2 */             ew2 ew2Var = this.f13022d;
                    switch (i) {
                        case 841:
/* 53 */                    Context context = viewGroup.getContext();
/* 57 */                    context.getClass();
/* 63 */                    return new eu2(ew2Var, new UCControllerId(context, null));
                        case 842:
/* 35 */                    Context context2 = viewGroup.getContext();
/* 39 */                    context2.getClass();
/* 45 */                    return new aw2(ew2Var, new UCSectionTitle(context2, null));
                        case 843:
/* 17 */                    Context context3 = viewGroup.getContext();
/* 21 */                    context3.getClass();
/* 27 */                    return new tt2(ew2Var, new UCCard(context3, null));
                        default:
/* 9 */                     f42.m3663s("not implemented");
/* 1 */                     return null;
                    }
                }
            }
