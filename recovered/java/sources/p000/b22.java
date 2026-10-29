            package p000;

            import android.graphics.Rect;
            import android.os.Bundle;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import androidx.recyclerview.widget.C0134l;
            import androidx.recyclerview.widget.RecyclerView;
            import androidx.slidingpanelayout.widget.SlidingPaneLayout;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class b22 extends C2201t0 {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f2179d;

                /* JADX INFO: renamed from: e */
                public final Object f2180e;

                /* JADX INFO: renamed from: f */
                public final Object f2181f;

                public b22(c22 c22Var) {
/* 2 */             this.f2179d = 0;
/* 12 */            this.f2181f = new WeakHashMap();
/* 14 */            this.f2180e = c22Var;
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: a */
                public boolean mo1204a(View view, AccessibilityEvent accessibilityEvent) {
                    switch (this.f2179d) {
                        case 0:
/* 19 */                    C2201t0 c2201t0 = (C2201t0) ((WeakHashMap) this.f2181f).get(view);
                            return c2201t0 != null ? c2201t0.mo1204a(view, accessibilityEvent) : this.f16886a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                        default:
/* 6 */                     return super.mo1204a(view, accessibilityEvent);
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: b */
                public qc3 mo1205b(View view) {
                    switch (this.f2179d) {
                        case 0:
/* 19 */                    C2201t0 c2201t0 = (C2201t0) ((WeakHashMap) this.f2181f).get(view);
                            return c2201t0 != null ? c2201t0.mo1205b(view) : super.mo1205b(view);
                        default:
/* 6 */                     return super.mo1205b(view);
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: c */
                public final void mo127c(View view, AccessibilityEvent accessibilityEvent) {
                    switch (this.f2179d) {
                        case 0:
/* 23 */                    C2201t0 c2201t0 = (C2201t0) ((WeakHashMap) this.f2181f).get(view);
/* 25 */                    if (c2201t0 == null) {
/* 31 */                        super.mo127c(view, accessibilityEvent);
                            } else {
/* 27 */                        c2201t0.mo127c(view, accessibilityEvent);
                            }
                            break;
                        default:
/* 6 */                     super.mo127c(view, accessibilityEvent);
/* 11 */                    accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
                            break;
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: d */
                public final void mo128d(View view, C0901f1 c0901f1) {
/* 1 */             int i = this.f2179d;
/* 3 */             Object obj = this.f2180e;
/* 5 */             View.AccessibilityDelegate accessibilityDelegate = this.f16886a;
/* 7 */             Object obj2 = this.f2181f;
                    switch (i) {
                        case 0:
/* 182 */                   AccessibilityNodeInfo accessibilityNodeInfo = c0901f1.f7961a;
/* 184 */                   c22 c22Var = (c22) obj;
/* 186 */                   RecyclerView recyclerView = c22Var.f2664d;
/* 188 */                   RecyclerView recyclerView2 = c22Var.f2664d;
/* 194 */                   if (recyclerView.m859M() || recyclerView2.getLayoutManager() == null) {
/* 227 */                       accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                            } else {
/* 206 */                       recyclerView2.getLayoutManager().m993d0(view, c0901f1);
/* 215 */                       C2201t0 c2201t0 = (C2201t0) ((WeakHashMap) obj2).get(view);
/* 217 */                       if (c2201t0 != null) {
/* 219 */                           c2201t0.mo128d(view, c0901f1);
                                } else {
/* 223 */                           accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                                }
                            }
                            break;
                        default:
/* 12 */                    SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) obj2;
/* 14 */                    AccessibilityNodeInfo accessibilityNodeInfo2 = c0901f1.f7961a;
/* 16 */                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo2);
/* 20 */                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
/* 23 */                    Rect rect = (Rect) obj;
/* 25 */                    accessibilityNodeInfoObtain.getBoundsInScreen(rect);
/* 28 */                    accessibilityNodeInfo2.setBoundsInScreen(rect);
/* 35 */                    accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
/* 42 */                    accessibilityNodeInfo2.setPackageName(accessibilityNodeInfoObtain.getPackageName());
/* 49 */                    c0901f1.m3628i(accessibilityNodeInfoObtain.getClassName());
/* 56 */                    accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfoObtain.getContentDescription());
/* 63 */                    accessibilityNodeInfo2.setEnabled(accessibilityNodeInfoObtain.isEnabled());
/* 70 */                    accessibilityNodeInfo2.setClickable(accessibilityNodeInfoObtain.isClickable());
/* 77 */                    accessibilityNodeInfo2.setFocusable(accessibilityNodeInfoObtain.isFocusable());
/* 84 */                    accessibilityNodeInfo2.setFocused(accessibilityNodeInfoObtain.isFocused());
/* 91 */                    accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
/* 98 */                    accessibilityNodeInfo2.setSelected(accessibilityNodeInfoObtain.isSelected());
/* 105 */                   accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfoObtain.isLongClickable());
/* 112 */                   c0901f1.m3621a(accessibilityNodeInfoObtain.getActions());
/* 119 */                   accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities());
/* 124 */                   c0901f1.m3628i("androidx.slidingpanelayout.widget.SlidingPaneLayout");
/* 128 */                   c0901f1.f7962b = -1;
/* 130 */                   accessibilityNodeInfo2.setSource(view);
/* 133 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 135 */                   Object parentForAccessibility = view.getParentForAccessibility();
/* 141 */                   if (parentForAccessibility instanceof View) {
/* 145 */                       accessibilityNodeInfo2.setParent((View) parentForAccessibility);
                            }
/* 148 */                   int childCount = slidingPaneLayout.getChildCount();
/* 153 */                   for (int i2 = 0; i2 < childCount; i2++) {
/* 155 */                       View childAt = slidingPaneLayout.getChildAt(i2);
/* 163 */                       if (!slidingPaneLayout.m1045a(childAt) && childAt.getVisibility() == 0) {
/* 172 */                           childAt.setImportantForAccessibility(1);
/* 175 */                           accessibilityNodeInfo2.addChild(childAt);
                                }
                            }
                            break;
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: e */
                public void mo1206e(View view, AccessibilityEvent accessibilityEvent) {
                    switch (this.f2179d) {
                        case 0:
/* 18 */                    C2201t0 c2201t0 = (C2201t0) ((WeakHashMap) this.f2181f).get(view);
/* 20 */                    if (c2201t0 == null) {
/* 26 */                        super.mo1206e(view, accessibilityEvent);
                            } else {
/* 22 */                        c2201t0.mo1206e(view, accessibilityEvent);
                            }
                            break;
                        default:
/* 6 */                     super.mo1206e(view, accessibilityEvent);
                            break;
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: f */
                public final boolean mo1207f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
/* 1 */             int i = this.f2179d;
/* 3 */             View.AccessibilityDelegate accessibilityDelegate = this.f16886a;
/* 5 */             Object obj = this.f2181f;
                    switch (i) {
                        case 0:
/* 31 */                    C2201t0 c2201t0 = (C2201t0) ((WeakHashMap) obj).get(viewGroup);
                            return c2201t0 != null ? c2201t0.mo1207f(viewGroup, view, accessibilityEvent) : accessibilityDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                        default:
/* 16 */                    if (((SlidingPaneLayout) obj).m1045a(view)) {
/* 23 */                        return false;
                            }
/* 18 */                    return accessibilityDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: g */
                public boolean mo129g(View view, int i, Bundle bundle) {
                    switch (this.f2179d) {
                        case 0:
/* 13 */                    c22 c22Var = (c22) this.f2180e;
/* 15 */                    RecyclerView recyclerView = c22Var.f2664d;
/* 17 */                    RecyclerView recyclerView2 = c22Var.f2664d;
/* 23 */                    if (recyclerView.m859M() || recyclerView2.getLayoutManager() == null) {
/* 68 */                        return super.mo129g(view, i, bundle);
                            }
/* 39 */                    C2201t0 c2201t0 = (C2201t0) ((WeakHashMap) this.f2181f).get(view);
/* 41 */                    if (c2201t0 == null ? super.mo129g(view, i, bundle) : c2201t0.mo129g(view, i, bundle)) {
/* 56 */                        return true;
                            }
/* 64 */                    C0134l c0134l = recyclerView2.getLayoutManager().f1760b.f1639b;
/* 66 */                    return false;
                        default:
/* 6 */                     return super.mo129g(view, i, bundle);
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: h */
                public void mo1208h(View view, int i) {
                    switch (this.f2179d) {
                        case 0:
/* 18 */                    C2201t0 c2201t0 = (C2201t0) ((WeakHashMap) this.f2181f).get(view);
/* 20 */                    if (c2201t0 == null) {
/* 26 */                        super.mo1208h(view, i);
                            } else {
/* 22 */                        c2201t0.mo1208h(view, i);
                            }
                            break;
                        default:
/* 6 */                     super.mo1208h(view, i);
                            break;
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: i */
                public void mo1209i(View view, AccessibilityEvent accessibilityEvent) {
                    switch (this.f2179d) {
                        case 0:
/* 18 */                    C2201t0 c2201t0 = (C2201t0) ((WeakHashMap) this.f2181f).get(view);
/* 20 */                    if (c2201t0 == null) {
/* 26 */                        super.mo1209i(view, accessibilityEvent);
                            } else {
/* 22 */                        c2201t0.mo1209i(view, accessibilityEvent);
                            }
                            break;
                        default:
/* 6 */                     super.mo1209i(view, accessibilityEvent);
                            break;
                    }
                }

/* 16 */        public b22(SlidingPaneLayout slidingPaneLayout) {
                    this.f2179d = 1;
/* 17 */            this.f2181f = slidingPaneLayout;
/* 18 */            this.f2180e = new Rect();
                }
            }
