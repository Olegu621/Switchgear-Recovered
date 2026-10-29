            package p000;

            import android.graphics.Rect;
            import android.os.Bundle;
            import android.view.Gravity;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import androidx.drawerlayout.widget.DrawerLayout;
            import androidx.viewpager.widget.PagerAdapter;
            import androidx.viewpager.widget.ViewPager;
            import com.google.android.material.R$string;
            import com.google.android.material.button.MaterialButton;
            import com.google.android.material.button.MaterialButtonToggleGroup;
            import com.google.android.material.datepicker.C0355l;
            import com.google.android.material.internal.CheckableImageButton;
            import com.google.android.material.internal.NavigationMenuItemView;
            import java.util.WeakHashMap;
            import okio.Segment;
            
            /* JADX INFO: renamed from: wt */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class C2343wt extends C2201t0 {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f18801d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f18802e;

                public C2343wt(DrawerLayout drawerLayout) {
/* 2 */             this.f18801d = 1;
/* 4 */             this.f18802e = drawerLayout;
/* 11 */            new Rect();
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: a */
                public boolean mo1204a(View view, AccessibilityEvent accessibilityEvent) {
                    switch (this.f18801d) {
                        case 1:
/* 13 */                    DrawerLayout drawerLayout = (DrawerLayout) this.f18802e;
/* 21 */                    if (accessibilityEvent.getEventType() != 32) {
/* 49 */                        return this.f16886a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                            }
/* 23 */                    accessibilityEvent.getText();
/* 26 */                    View viewM613e = drawerLayout.m613e();
/* 30 */                    if (viewM613e != null) {
/* 32 */                        int iM615g = drawerLayout.m615g(viewM613e);
/* 36 */                        WeakHashMap weakHashMap = e33.f7494a;
/* 42 */                        Gravity.getAbsoluteGravity(iM615g, drawerLayout.getLayoutDirection());
                            }
/* 45 */                    return true;
                        default:
/* 6 */                     return super.mo1204a(view, accessibilityEvent);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0025  */
                @Override // p000.C2201t0
                /* JADX INFO: renamed from: c */
                public void mo127c(View view, AccessibilityEvent accessibilityEvent) {
                    boolean z;
                    PagerAdapter pagerAdapter;
/* 1 */             int i = this.f18801d;
/* 3 */             Object obj = this.f18802e;
                    switch (i) {
                        case 0:
/* 81 */                    super.mo127c(view, accessibilityEvent);
/* 88 */                    accessibilityEvent.setChecked(((CheckableImageButton) obj).f4781d);
                            break;
                        case 1:
/* 72 */                    super.mo127c(view, accessibilityEvent);
/* 77 */                    accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                            break;
                        case 5:
/* 12 */                    ViewPager viewPager = (ViewPager) obj;
/* 14 */                    super.mo127c(view, accessibilityEvent);
/* 23 */                    accessibilityEvent.setClassName(ViewPager.class.getName());
/* 26 */                    PagerAdapter pagerAdapter2 = viewPager.f1973e;
/* 28 */                    if (pagerAdapter2 != null) {
/* 35 */                        z = pagerAdapter2.getCount() > 1;
                            }
/* 39 */                    accessibilityEvent.setScrollable(z);
/* 48 */                    if (accessibilityEvent.getEventType() == 4096 && (pagerAdapter = viewPager.f1973e) != null) {
/* 58 */                        accessibilityEvent.setItemCount(pagerAdapter.getCount());
/* 63 */                        accessibilityEvent.setFromIndex(viewPager.f1975f);
/* 68 */                        accessibilityEvent.setToIndex(viewPager.f1975f);
                                break;
                            }
                            break;
                        default:
/* 8 */                     super.mo127c(view, accessibilityEvent);
                            break;
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: d */
                public final void mo128d(View view, C0901f1 c0901f1) {
/* 1 */             int i = this.f18801d;
/* 3 */             int i2 = -1;
/* 5 */             boolean z = false;
/* 6 */             Object obj = this.f18802e;
/* 8 */             View.AccessibilityDelegate accessibilityDelegate = this.f16886a;
                    switch (i) {
                        case 0:
/* 209 */                   AccessibilityNodeInfo accessibilityNodeInfo = c0901f1.f7961a;
/* 211 */                   accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
/* 214 */                   CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
/* 218 */                   accessibilityNodeInfo.setCheckable(checkableImageButton.f4782e);
/* 223 */                   accessibilityNodeInfo.setChecked(checkableImageButton.f4781d);
                            break;
                        case 1:
/* 172 */                   int[] iArr = DrawerLayout.f1293p0;
/* 174 */                   AccessibilityNodeInfo accessibilityNodeInfo2 = c0901f1.f7961a;
/* 176 */                   accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
/* 181 */                   c0901f1.m3628i("androidx.drawerlayout.widget.DrawerLayout");
/* 184 */                   accessibilityNodeInfo2.setFocusable(false);
/* 187 */                   accessibilityNodeInfo2.setFocused(false);
/* 196 */                   accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) C2518z0.f19872e.f19883a);
/* 205 */                   accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) C2518z0.f19873f.f19883a);
                            break;
                        case 2:
/* 113 */                   accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0901f1.f7961a);
/* 116 */                   MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
/* 118 */                   int i3 = MaterialButtonToggleGroup.f4552V;
/* 122 */                   if (view instanceof MaterialButton) {
/* 126 */                       int i4 = 0;
/* 131 */                       for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
/* 137 */                           if (materialButtonToggleGroup.getChildAt(i5) == view) {
/* 139 */                               i2 = i4;
                                    } else {
/* 147 */                               if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.m2274c(i5)) {
/* 155 */                                   i4++;
                                        }
                                    }
                                }
                            }
/* 168 */                   c0901f1.m3629j(C0864e1.m3291a(0, 1, i2, 1, ((MaterialButton) view).f4542b0));
                            break;
                        case 3:
/* 81 */                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0901f1.f7961a);
/* 84 */                    C0355l c0355l = (C0355l) obj;
/* 107 */                   c0901f1.m3630k(c0355l.f4658V.getVisibility() == 0 ? c0355l.getString(R$string.mtrl_picker_toggle_to_year_selection) : c0355l.getString(R$string.mtrl_picker_toggle_to_day_selection));
                            break;
                        case 4:
/* 66 */                    AccessibilityNodeInfo accessibilityNodeInfo3 = c0901f1.f7961a;
/* 68 */                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
/* 75 */                    accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f4798l0);
                            break;
                        default:
/* 15 */                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0901f1.f7961a);
/* 24 */                    c0901f1.m3628i(ViewPager.class.getName());
/* 27 */                    ViewPager viewPager = (ViewPager) obj;
/* 29 */                    PagerAdapter pagerAdapter = viewPager.f1973e;
/* 31 */                    if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
/* 39 */                        z = true;
                            }
/* 40 */                    c0901f1.m3631l(z);
/* 47 */                    if (viewPager.canScrollHorizontally(1)) {
/* 51 */                        c0901f1.m3621a(4096);
                            }
/* 58 */                    if (viewPager.canScrollHorizontally(-1)) {
/* 62 */                        c0901f1.m3621a(Segment.SIZE);
                            }
                            break;
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: f */
                public boolean mo1207f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    switch (this.f18801d) {
                        case 1:
/* 11 */                    int[] iArr = DrawerLayout.f1293p0;
/* 15 */                    return this.f16886a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                        default:
/* 6 */                     return super.mo1207f(viewGroup, view, accessibilityEvent);
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: g */
                public boolean mo129g(View view, int i, Bundle bundle) {
                    switch (this.f18801d) {
                        case 5:
/* 13 */                    ViewPager viewPager = (ViewPager) this.f18802e;
/* 20 */                    if (super.mo129g(view, i, bundle)) {
/* 19 */                        return true;
                            }
/* 25 */                    if (i != 4096) {
/* 29 */                        if (i == 8192 && viewPager.canScrollHorizontally(-1)) {
/* 42 */                            viewPager.setCurrentItem(viewPager.f1975f - 1);
/* 19 */                            return true;
                                }
                            } else if (viewPager.canScrollHorizontally(1)) {
/* 55 */                        viewPager.setCurrentItem(viewPager.f1975f + 1);
/* 19 */                        return true;
                            }
/* 59 */                    return false;
                        default:
/* 6 */                     return super.mo129g(view, i, bundle);
                    }
                }

/* 14 */        public /* synthetic */ C2343wt(Object obj, int i) {
/* 15 */            this.f18801d = i;
                    this.f18802e = obj;
                }
            }
