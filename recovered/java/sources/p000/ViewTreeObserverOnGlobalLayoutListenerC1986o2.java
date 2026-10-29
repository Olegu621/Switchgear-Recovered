            package p000;

            import android.R;
            import android.app.Activity;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.graphics.Color;
            import android.graphics.Rect;
            import android.view.View;
            import android.view.ViewTreeObserver;
            import androidx.appcompat.widget.ActivityChooserView;
            import androidx.appcompat.widget.AppCompatSpinner;
            import androidx.appcompat.widget.C0062b;
            import androidx.appcompat.widget.C0064d;
            import com.google.android.material.internal.NavigationMenuView;
            import com.google.android.material.navigation.NavigationView;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: o2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewTreeObserverOnGlobalLayoutListenerC1986o2 implements ViewTreeObserver.OnGlobalLayoutListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14592a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f14593b;

                public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1986o2(Object obj, int i) {
/* 1 */             this.f14592a = i;
/* 3 */             this.f14593b = obj;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    C0062b c0062b;
                    dh1 dh1Var;
                    Activity activity;
/* 1 */             int i = this.f14592a;
/* 5 */             Object obj = this.f14593b;
                    switch (i) {
                        case 0:
/* 362 */                   ActivityChooserView activityChooserView = (ActivityChooserView) obj;
/* 368 */                   if (activityChooserView.m354b()) {
/* 374 */                       if (!activityChooserView.isShown()) {
/* 380 */                           activityChooserView.getListPopupWindow().dismiss();
                                    break;
                                } else {
/* 388 */                           activityChooserView.getListPopupWindow().show();
/* 391 */                           AbstractC1815k2 abstractC1815k2 = activityChooserView.f483i;
/* 393 */                           if (abstractC1815k2 != null && (c0062b = abstractC1815k2.f12562a) != null && (dh1Var = c0062b.f9608e) != null) {
/* 405 */                               dh1Var.mo2942z(c0062b.f9606c);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
/* 327 */                   AppCompatSpinner appCompatSpinner = (AppCompatSpinner) obj;
/* 337 */                   if (!appCompatSpinner.getInternalPopup().mo4138a()) {
/* 349 */                       appCompatSpinner.f527f.mo4147m(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                            }
/* 352 */                   ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
/* 356 */                   if (viewTreeObserver != null) {
/* 358 */                       viewTreeObserver.removeOnGlobalLayoutListener(this);
                            }
                            break;
                        case 2:
/* 298 */                   C1884lb c1884lb = (C1884lb) obj;
/* 300 */                   AppCompatSpinner appCompatSpinner2 = c1884lb.f13168q0;
/* 306 */                   if (appCompatSpinner2.isAttachedToWindow() && appCompatSpinner2.getGlobalVisibleRect(c1884lb.f13166o0)) {
/* 316 */                       c1884lb.m6413r();
/* 319 */                       c1884lb.show();
                            } else {
/* 323 */                       c1884lb.dismiss();
                            }
                            break;
                        case 3:
/* 233 */                   ViewOnKeyListenerC2341wr viewOnKeyListenerC2341wr = (ViewOnKeyListenerC2341wr) obj;
/* 235 */                   ArrayList arrayList = viewOnKeyListenerC2341wr.f18781v;
/* 241 */                   if (viewOnKeyListenerC2341wr.mo365a() && arrayList.size() > 0 && !((C2304vr) arrayList.get(0)).f18323a.f590i0) {
/* 261 */                       View view = viewOnKeyListenerC2341wr.f18763Z;
/* 263 */                       if (view != null && view.isShown()) {
/* 272 */                           Iterator it = arrayList.iterator();
/* 280 */                           while (it.hasNext()) {
/* 290 */                               ((C2304vr) it.next()).f18323a.show();
                                    }
                                } else {
/* 294 */                           viewOnKeyListenerC2341wr.dismiss();
                                }
                                break;
                            }
                            break;
                        case 4:
/* 178 */                   ls0 ls0Var = (ls0) obj;
/* 182 */                   if (ls0Var.f13478c != null) {
/* 187 */                       Rect rect = new Rect();
/* 192 */                       ls0Var.f13478c.getWindowVisibleDisplayFrame(rect);
/* 201 */                       int height = ls0Var.f13478c.getRootView().getHeight();
/* 219 */                       boolean z = ((double) (height - rect.bottom)) > ((double) height) * 0.15d;
/* 225 */                       if (z != ls0Var.f13472V) {
/* 227 */                           ls0Var.m6530h(z);
                                }
/* 230 */                       ls0Var.f13472V = z;
                                break;
                            }
                            break;
                        case 5:
/* 43 */                    NavigationView navigationView = (NavigationView) obj;
/* 45 */                    int[] iArr = navigationView.f4829w;
/* 47 */                    navigationView.getLocationOnScreen(iArr);
/* 56 */                    boolean z2 = iArr[1] == 0;
/* 57 */                    gm1 gm1Var = navigationView.f4827i;
/* 61 */                    if (gm1Var.f8731g0 != z2) {
/* 63 */                        gm1Var.f8731g0 = z2;
/* 80 */                        int i2 = (gm1Var.f8721b.getChildCount() == 0 && gm1Var.f8731g0) ? gm1Var.f8734i0 : 0;
/* 81 */                        NavigationMenuView navigationMenuView = gm1Var.f8719a;
/* 87 */                        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
                            }
/* 99 */                    navigationView.setDrawTopInsetForeground(z2 && navigationView.f4820W);
/* 102 */                   Context context = navigationView.getContext();
                            while (true) {
/* 108 */                       if (!(context instanceof ContextWrapper)) {
/* 124 */                           activity = null;
                                } else if (context instanceof Activity) {
/* 114 */                           activity = (Activity) context;
                                } else {
/* 119 */                           context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
/* 125 */                   if (activity != null) {
/* 174 */                       navigationView.setDrawBottomInsetForeground((activity.findViewById(R.id.content).getHeight() == navigationView.getHeight()) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.f4821a0);
                            }
                            break;
                        default:
/* 10 */                    jg2 jg2Var = (jg2) obj;
/* 12 */                    C0064d c0064d = jg2Var.f12299v;
/* 18 */                    if (jg2Var.mo365a() && !c0064d.f590i0) {
/* 24 */                        View view2 = jg2Var.f12285X;
/* 26 */                        if (view2 != null && view2.isShown()) {
/* 35 */                            c0064d.show();
                                } else {
/* 39 */                            jg2Var.dismiss();
                                }
                                break;
                            }
                            break;
                    }
                }
            }
