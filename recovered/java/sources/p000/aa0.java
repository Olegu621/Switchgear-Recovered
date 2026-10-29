            package p000;

            import android.graphics.Rect;
            import android.os.Bundle;
            import android.view.View;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.ScrollView;
            import androidx.core.widget.NestedScrollView;
            import androidx.drawerlayout.widget.DrawerLayout;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class aa0 extends C2201t0 {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f136d;

                public /* synthetic */ aa0(int i) {
/* 1 */             this.f136d = i;
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: c */
                public void mo127c(View view, AccessibilityEvent accessibilityEvent) {
                    switch (this.f136d) {
                        case 3:
/* 10 */                    super.mo127c(view, accessibilityEvent);
/* 13 */                    NestedScrollView nestedScrollView = (NestedScrollView) view;
/* 21 */                    accessibilityEvent.setClassName(ScrollView.class.getName());
/* 33 */                    accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
/* 40 */                    accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
/* 47 */                    accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
/* 54 */                    accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
/* 61 */                    accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                            break;
                        default:
/* 6 */                     super.mo127c(view, accessibilityEvent);
                            break;
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: d */
                public final void mo128d(View view, C0901f1 c0901f1) {
                    int scrollRange;
/* 1 */             int i = this.f136d;
/* 4 */             View.AccessibilityDelegate accessibilityDelegate = this.f16886a;
                    switch (i) {
                        case 0:
/* 92 */                    AccessibilityNodeInfo accessibilityNodeInfo = c0901f1.f7961a;
/* 94 */                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
/* 97 */                    int[] iArr = DrawerLayout.f1293p0;
/* 99 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 106 */                   if (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) {
/* 116 */                       accessibilityNodeInfo.setParent(null);
                            }
                            break;
                        case 1:
/* 83 */                    AccessibilityNodeInfo accessibilityNodeInfo2 = c0901f1.f7961a;
/* 85 */                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
/* 88 */                    accessibilityNodeInfo2.setCollectionInfo(null);
                            break;
                        case 2:
/* 74 */                    AccessibilityNodeInfo accessibilityNodeInfo3 = c0901f1.f7961a;
/* 76 */                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
/* 79 */                    accessibilityNodeInfo3.setCollectionInfo(null);
                            break;
                        default:
/* 11 */                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0901f1.f7961a);
/* 14 */                    NestedScrollView nestedScrollView = (NestedScrollView) view;
/* 22 */                    c0901f1.m3628i(ScrollView.class.getName());
/* 29 */                    if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
/* 38 */                        c0901f1.m3631l(true);
/* 45 */                        if (nestedScrollView.getScrollY() > 0) {
/* 49 */                            c0901f1.m3622b(C2518z0.f19876i);
/* 54 */                            c0901f1.m3622b(C2518z0.f19880m);
                                }
/* 61 */                        if (nestedScrollView.getScrollY() < scrollRange) {
/* 65 */                            c0901f1.m3622b(C2518z0.f19875h);
/* 70 */                            c0901f1.m3622b(C2518z0.f19881n);
                                }
                                break;
                            }
                            break;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:29:0x0075  */
                /* JADX WARN: Code duplicated, block: B:31:0x0092  */
                @Override // p000.C2201t0
                /* JADX INFO: renamed from: g */
                public boolean mo129g(View view, int i, Bundle bundle) {
                    int iMin;
                    switch (this.f136d) {
                        case 3:
/* 16 */                    if (super.mo129g(view, i, bundle)) {
/* 15 */                        return true;
                            }
/* 20 */                    NestedScrollView nestedScrollView = (NestedScrollView) view;
/* 27 */                    if (nestedScrollView.isEnabled()) {
/* 31 */                        int height = nestedScrollView.getHeight();
/* 37 */                        Rect rect = new Rect();
/* 48 */                        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
/* 56 */                            height = rect.height();
                                }
/* 62 */                        if (i == 4096) {
/* 137 */                           iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
/* 145 */                           if (iMin != nestedScrollView.getScrollY()) {
/* 157 */                               nestedScrollView.m603o(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
/* 15 */                                return true;
                                    }
                                } else if (i == 8192 || i == 16908344) {
/* 94 */                            int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
/* 102 */                           if (iMax != nestedScrollView.getScrollY()) {
/* 114 */                               nestedScrollView.m603o(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
/* 15 */                                return true;
                                    }
                                } else if (i == 16908346) {
/* 137 */                           iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
/* 145 */                           if (iMin != nestedScrollView.getScrollY()) {
/* 157 */                               nestedScrollView.m603o(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
/* 15 */                                return true;
                                    }
                                }
                            }
/* 26 */                    return false;
                        default:
/* 6 */                     return super.mo129g(view, i, bundle);
                    }
                }
            }
