            package p000;

            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewTreeObserver;
            import androidx.appcompat.widget.LinearLayoutCompat;
            import androidx.appcompat.widget.Toolbar;
            import androidx.viewpager.widget.ViewPager;
            import com.google.android.material.appbar.AppBarLayout;
            import com.google.android.material.tabs.TabLayout;
            import com.usercentrics.sdk.p008ui.R$dimen;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.R$layout;
            import com.usercentrics.sdk.p008ui.components.UCButton;
            import com.usercentrics.sdk.p008ui.secondLayer.component.footer.UCSecondLayerFooter;
            import com.usercentrics.sdk.p008ui.secondLayer.component.header.UCSecondLayerHeader;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Map;
            import kotlin.collections.CollectionsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wv2 extends LinearLayoutCompat {

                /* JADX INFO: renamed from: d0 */
                public final ew2 f18835d0;

                /* JADX INFO: renamed from: e0 */
                public final hk2 f18836e0;

                /* JADX INFO: renamed from: f0 */
                public final hk2 f18837f0;

                /* JADX INFO: renamed from: g0 */
                public final hk2 f18838g0;

                /* JADX INFO: renamed from: h0 */
                public final hk2 f18839h0;

                /* JADX INFO: renamed from: i0 */
                public final hk2 f18840i0;

                /* JADX INFO: renamed from: j0 */
                public final rv2 f18841j0;

                /* JADX INFO: renamed from: k0 */
                public Integer f18842k0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public wv2(z00 z00Var, ew2 ew2Var) {
/* 9 */             super(z00Var, null, 0);
/* 1 */             z00Var.getClass();
/* 4 */             ew2Var.getClass();
/* 12 */            this.f18835d0 = ew2Var;
/* 24 */            this.f18836e0 = r51.m8065b(new vv2(this, 2));
/* 36 */            this.f18837f0 = r51.m8065b(new vv2(this, 3));
/* 48 */            this.f18838g0 = r51.m8065b(new vv2(this, 4));
/* 60 */            this.f18839h0 = r51.m8065b(new vv2(this, 1));
/* 71 */            this.f18840i0 = r51.m8065b(new vv2(this, 0));
/* 77 */            int i = 0;
/* 104 */           rv2 rv2Var = new rv2(ew2Var, new n01(1, this, wv2.class, "navigateToTab", "navigateToTab(I)V", i, 7), new v11(0, this, wv2.class, "collapseHeader", "collapseHeader()V", i, 5));
/* 107 */           this.f18841j0 = rv2Var;
/* 119 */           LayoutInflater.from(getContext()).inflate(R$layout.uc_layer, this);
/* 122 */           setOrientation(1);
/* 126 */           setBackgroundColor(-1);
/* 133 */           getUcContentViewPager().setAdapter(rv2Var);
/* 136 */           ViewPager ucContentViewPager = getUcContentViewPager();
/* 142 */           tv2 tv2Var = new tv2(this);
/* 147 */           if (ucContentViewPager.f1956F0 == null) {
/* 154 */               ucContentViewPager.f1956F0 = new ArrayList();
                    }
/* 158 */           ucContentViewPager.f1956F0.add(tv2Var);
/* 165 */           getUcHeader().m2816m(ew2Var);
/* 172 */           getUcFooter().m2812l(ew2Var);
/* 182 */           post(new f72(this, 11));
                }

                private final AppBarLayout getUcAppBar() {
/* 7 */             return (AppBarLayout) this.f18840i0.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final ViewPager getUcContentViewPager() {
/* 7 */             return (ViewPager) this.f18839h0.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final UCSecondLayerFooter getUcFooter() {
/* 7 */             return (UCSecondLayerFooter) this.f18836e0.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final UCSecondLayerHeader getUcHeader() {
/* 7 */             return (UCSecondLayerHeader) this.f18837f0.getValue();
                }

                private final Toolbar getUcToolbar() {
/* 7 */             return (Toolbar) this.f18838g0.getValue();
                }

                /* JADX INFO: renamed from: k */
                public static void m9643k(wv2 wv2Var, View view, View view2) {
                    View childAt;
                    View viewFindViewById;
/* 1 */             if (view == null || view2 == null) {
/* 203 */               return;
                    }
/* 13 */            if (view.getId() == R$id.ucHeader && view2.getId() == R$id.ucHeader) {
/* 49 */                View viewFindViewWithTag = wv2Var.getUcContentViewPager().findViewWithTag("page_" + wv2Var.getUcContentViewPager().getCurrentItem());
/* 53 */                if (viewFindViewWithTag == null || (viewFindViewById = viewFindViewWithTag.findViewById(R$id.ucCardTitle)) == null) {
/* 203 */                   return;
                        }
/* 63 */                viewFindViewById.requestFocus();
/* 66 */                return;
                    }
/* 70 */            if ((view instanceof UCButton) && view2.getId() == R$id.ucHeader) {
/* 86 */                View viewFindViewById2 = wv2Var.getUcHeader().findViewById(R$id.ucHeaderLanguageIcon);
/* 90 */                viewFindViewById2.getClass();
/* 97 */                if (viewFindViewById2.getVisibility() == 0) {
/* 105 */                   View viewFindViewById3 = wv2Var.getUcHeader().findViewById(R$id.ucHeaderLanguageIcon);
/* 109 */                   if (viewFindViewById3 != null) {
/* 111 */                       viewFindViewById3.requestFocus();
                            }
                        } else {
/* 121 */                   View viewFindViewById4 = wv2Var.getUcHeader().findViewById(R$id.ucHeaderCloseButton);
/* 125 */                   if (viewFindViewById4 != null) {
/* 127 */                       viewFindViewById4.requestFocus();
                            }
                        }
/* 134 */               wv2Var.getUcAppBar().m2206d(true, true, true);
/* 137 */               return;
                    }
/* 144 */           if (view2.getId() == R$id.ucHeader) {
/* 159 */               View childAt2 = ((TabLayout) wv2Var.getUcHeader().findViewById(R$id.ucHeaderTabLayout)).getChildAt(0);
/* 170 */               ViewGroup viewGroup = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
/* 171 */               if (viewGroup == null || (childAt = viewGroup.getChildAt(wv2Var.getUcContentViewPager().getCurrentItem())) == null) {
/* 203 */                   return;
                        }
/* 187 */               childAt.setFocusable(true);
/* 190 */               childAt.setFocusableInTouchMode(true);
/* 193 */               childAt.requestFocus();
/* 200 */               wv2Var.getUcAppBar().m2206d(true, true, true);
                    }
                }

                /* JADX INFO: renamed from: l */
                public static final void m9644l(wv2 wv2Var, cv2 cv2Var) {
/* 1 */             rv2 rv2Var = wv2Var.f18841j0;
/* 3 */             ArrayList arrayList = cv2Var.f6920b;
/* 5 */             rv2Var.getClass();
/* 8 */             rv2Var.f16326d = arrayList;
/* 24 */            for (Map.Entry entry : rv2Var.f16328f.entrySet()) {
/* 36 */                kv2 kv2Var = (kv2) entry.getKey();
/* 52 */                dv2 dv2Var = (dv2) CollectionsKt.m6201v(((Number) entry.getValue()).intValue(), arrayList);
/* 54 */                if (dv2Var != null) {
/* 56 */                    ArrayList arrayList2 = dv2Var.f7422b;
/* 60 */                    qt2.Companion.getClass();
/* 63 */                    ArrayList arrayListM7552a = pt2.m7552a(arrayList2);
/* 67 */                    kv2Var.getClass();
/* 70 */                    kv2Var.f13025g = arrayListM7552a;
/* 72 */                    kv2Var.m958d();
                        }
                    }
/* 76 */            rv2Var.notifyDataSetChanged();
/* 85 */            boolean z = arrayList.size() > 1;
/* 89 */            UCSecondLayerHeader ucHeader = wv2Var.getUcHeader();
/* 93 */            ew2 ew2Var = wv2Var.f18835d0;
/* 95 */            ViewPager ucContentViewPager = wv2Var.getUcContentViewPager();
/* 99 */            ucContentViewPager.getClass();
/* 110 */           ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 113 */           Iterator it = arrayList.iterator();
/* 121 */           while (it.hasNext()) {
/* 131 */               arrayList3.add(((dv2) it.next()).f7421a);
                    }
/* 135 */           ucHeader.m2815l(ew2Var, ucContentViewPager, arrayList3, z);
/* 138 */           Toolbar ucToolbar = wv2Var.getUcToolbar();
/* 146 */           ViewGroup.LayoutParams layoutParams = wv2Var.getUcToolbar().getLayoutParams();
/* 165 */           layoutParams.height = z ? (int) wv2Var.getResources().getDimension(R$dimen.ucTabLayoutHeight) : 0;
/* 167 */           ucToolbar.setLayoutParams(layoutParams);
/* 170 */           Integer num = wv2Var.f18842k0;
/* 179 */           int iIntValue = num != null ? num.intValue() : cv2Var.f6919a;
/* 181 */           if (iIntValue <= 0 || iIntValue >= arrayList.size()) {
/* 198 */               return;
                    }
/* 189 */           ViewPager ucContentViewPager2 = wv2Var.getUcContentViewPager();
/* 193 */           ucContentViewPager2.f1981j0 = false;
/* 195 */           ucContentViewPager2.m1139u(iIntValue, 0, false, false);
                }

                /* JADX INFO: renamed from: m */
                public static final void m9645m(wv2 wv2Var) {
/* 7 */             wv2Var.getUcAppBar().m2206d(false, true, true);
                }

                /* JADX INFO: renamed from: q */
                public static final void m9649q(wv2 wv2Var, int i) {
/* 5 */             wv2Var.getUcContentViewPager().setCurrentItem(i);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void setupView$lambda$0(final wv2 wv2Var) {
/* 1 */             wv2Var.getClass();
/* 8 */             wv2Var.getUcAppBar().bringToFront();
/* 16 */            wv2Var.getUcAppBar().m2206d(true, true, true);
/* 23 */            wv2Var.getUcHeader().requestFocus();
/* 35 */            wv2Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: sv2
                        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
                        public final void onGlobalFocusChanged(View view, View view2) {
/* 3 */                     wv2.m9643k(this.f16827a, view, view2);
                        }
                    });
                }
            }
