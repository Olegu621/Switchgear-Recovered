            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.DialogInterface;
            import android.graphics.drawable.ColorDrawable;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.view.WindowInsets;
            import android.view.WindowInsetsController;
            import android.view.WindowManager;
            import android.widget.FrameLayout;
            import androidx.core.app.NotificationCompat;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.R$style;
            import java.lang.ref.WeakReference;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rz2 {

                /* JADX INFO: renamed from: a */
                public final ew2 f16357a;

                /* JADX INFO: renamed from: b */
                public final C2001oh f16358b;

                /* JADX INFO: renamed from: c */
                public final ts0 f16359c;

                /* JADX INFO: renamed from: d */
                public final wu1 f16360d;

                /* JADX INFO: renamed from: e */
                public final WeakReference f16361e;

                /* JADX INFO: renamed from: f */
                public final hk2 f16362f;

                /* JADX INFO: renamed from: g */
                public ac1 f16363g;

                /* JADX INFO: renamed from: h */
                public DialogInterfaceC1991o7 f16364h;

                /* JADX INFO: renamed from: i */
                public ys2 f16365i;

                /* JADX INFO: renamed from: j */
                public bt2 f16366j;

                /* JADX INFO: renamed from: k */
                public final hk2 f16367k;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v4, types: [vt1] */
                public rz2(Context context, ew2 ew2Var, C2001oh c2001oh, Integer num, boolean z, ts0 ts0Var, wu1 wu1Var) {
                    Window window;
/* 1 */             wu1Var.getClass();
/* 7 */             this.f16357a = ew2Var;
/* 9 */             this.f16358b = c2001oh;
/* 11 */            this.f16359c = ts0Var;
/* 13 */            this.f16360d = wu1Var;
/* 20 */            this.f16361e = new WeakReference(context);
/* 22 */            Context contextM8339c = m8339c();
/* 34 */            Activity activity = contextM8339c instanceof Activity ? (Activity) contextM8339c : null;
/* 35 */            if (activity != null && (window = activity.getWindow()) != null) {
/* 43 */                window.getStatusBarColor();
                    }
/* 46 */            Context contextM8339c2 = m8339c();
/* 56 */            z00 z00Var = contextM8339c2 != null ? new z00(contextM8339c2, R$style.BaseTheme) : null;
/* 69 */            this.f16362f = r51.m8065b(new qz2(this, 1));
/* 71 */            Context contextM8339c3 = m8339c();
/* 75 */            if (contextM8339c3 != null) {
/* 82 */                this.f16363g = new ac1();
/* 97 */                int i = 0;
/* 97 */                Object[] objArr = 0;
/* 98 */                ys2 ys2Var = new ys2(contextM8339c3, ew2Var, z00Var == null ? new z00(contextM8339c3, R$style.BaseTheme) : z00Var, false);
/* 103 */               ys2Var.setId(R$id.ucBannerContainer);
/* 107 */               ys2Var.setVisibility(4);
/* 118 */               this.f16366j = new bt2(contextM8339c3, ew2Var, num, ys2Var, z);
/* 120 */               this.f16365i = ys2Var;
/* 128 */               z00Var = z00Var == null ? new z00(contextM8339c3, R$style.BaseTheme) : z00Var;
/* 131 */               bt2 bt2Var = this.f16366j;
/* 133 */               bt2Var.getClass();
/* 142 */               View view = (View) bt2Var.f2603g.getValue();
/* 146 */               final qz2 qz2Var = new qz2(this, i);
/* 149 */               view.getClass();
/* 156 */               C1954n7 c1954n7 = new C1954n7(z00Var, R$style.UsercentricsBanner);
/* 161 */               C1783j7 c1783j7 = (C1783j7) c1954n7.f14152c;
/* 163 */               c1783j7.f12115k = false;
/* 170 */               c1783j7.f12117m = new DialogInterface.OnDismissListener() { // from class: vt1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
/* 3 */                         qz2Var.invoke();
                            }
                        };
/* 172 */               c1783j7.f12121q = view;
/* 174 */               final DialogInterfaceC1991o7 dialogInterfaceC1991o7M6897b = c1954n7.m6897b();
                        final Object[] objArr2 = objArr == true ? 1 : 0;
/* 183 */               dialogInterfaceC1991o7M6897b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: wt1
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
/* 1 */                         int i2 = R$id.ucBannerContainer;
/* 3 */                         final DialogInterfaceC1991o7 dialogInterfaceC1991o7 = dialogInterfaceC1991o7M6897b;
/* 9 */                         ViewGroup viewGroup = (ViewGroup) dialogInterfaceC1991o7.findViewById(i2);
/* 19 */                        Object tag = viewGroup != null ? viewGroup.getTag() : null;
/* 27 */                        Integer num2 = tag instanceof Integer ? (Integer) tag : null;
/* 35 */                        final int iIntValue = num2 != null ? num2.intValue() : -1;
/* 36 */                        if (iIntValue < 0) {
/* 58 */                            return;
                                }
/* 42 */                        final View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
/* 46 */                        if (childAt != null) {
/* 50 */                            final boolean z2 = objArr2;
/* 55 */                            childAt.post(new Runnable() { // from class: xt1
                                        @Override // java.lang.Runnable
                                        public final void run() {
/* 1 */                                     boolean z3 = z2;
/* 3 */                                     DialogInterfaceC1991o7 dialogInterfaceC1991o8 = dialogInterfaceC1991o7;
/* 5 */                                     View view2 = childAt;
/* 7 */                                     int i3 = iIntValue;
/* 9 */                                     if (!z3) {
/* 118 */                                       int i4 = (int) (((double) dialogInterfaceC1991o8.getContext().getResources().getDisplayMetrics().heightPixels) / 1.25d);
/* 123 */                                       if (view2.getHeight() > i4) {
/* 125 */                                           ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
/* 129 */                                           layoutParams.getClass();
/* 132 */                                           FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
/* 134 */                                           layoutParams2.height = i4;
/* 136 */                                           layoutParams2.gravity = i3;
/* 138 */                                           view2.setLayoutParams(layoutParams2);
/* 141 */                                           return;
                                                }
/* 141 */                                       return;
                                            }
/* 11 */                                    Window window2 = dialogInterfaceC1991o8.getWindow();
/* 17 */                                    if (window2 != null) {
/* 21 */                                        window2.setFlags(NotificationCompat.FLAG_GROUP_SUMMARY, NotificationCompat.FLAG_GROUP_SUMMARY);
/* 24 */                                        int i5 = Build.VERSION.SDK_INT;
/* 26 */                                        if (i5 >= 28) {
/* 28 */                                            WindowManager.LayoutParams attributes = window2.getAttributes();
/* 2 */                                             attributes.layoutInDisplayCutoutMode = 1;
/* 35 */                                            window2.setAttributes(attributes);
                                                }
/* 40 */                                        if (i5 >= 30) {
/* 1 */                                             WindowInsetsController insetsController = window2.getInsetsController();
/* 46 */                                            if (insetsController != null) {
/* 1 */                                                 insetsController.hide(WindowInsets.Type.systemBars());
/* 2 */                                                 insetsController.setSystemBarsBehavior(2);
                                                    }
                                                } else {
/* 65 */                                            window2.getDecorView().setSystemUiVisibility(262);
                                                }
                                            }
/* 71 */                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
/* 74 */                                    layoutParams3.gravity = i3;
/* 76 */                                    view2.setLayoutParams(layoutParams3);
/* 81 */                                    if (Build.VERSION.SDK_INT >= 28) {
/* 88 */                                        view2.setOnApplyWindowInsetsListener(new yt1());
                                            } else {
/* 93 */                                        view2.setPadding(0, 0, 0, 0);
                                            }
/* 96 */                                    view2.requestApplyInsets();
                                        }
                                    });
                                }
                            }
                        });
/* 186 */               dialogInterfaceC1991o7M6897b.show();
/* 189 */               he3.m4193p(view);
/* 192 */               Window window2 = dialogInterfaceC1991o7M6897b.getWindow();
/* 196 */               if (window2 != null) {
/* 199 */                   window2.setLayout(-1, -1);
/* 207 */                   window2.setBackgroundDrawable(new ColorDrawable(0));
/* 211 */                   window2.setDimAmount(0.0f);
                        }
/* 214 */               this.f16364h = dialogInterfaceC1991o7M6897b;
/* 216 */               bt2 bt2Var2 = this.f16366j;
/* 218 */               if (bt2Var2 != null) {
/* 222 */                   if (bt2Var2.f2601e) {
/* 240 */                       new Handler(Looper.getMainLooper()).post(new f72(bt2Var2, 8));
                            } else {
/* 248 */                       bt2Var2.m1432a().setVisibility(0);
/* 253 */                       bt2Var2.f2600d.setVisibility(0);
                            }
                        }
                    }
/* 267 */           this.f16367k = r51.m8065b(new C2498yh(this, 26));
                }

                /* JADX INFO: renamed from: a */
                public final void m8337a() {
/* 1 */             ac1 ac1Var = this.f16363g;
/* 3 */             if (ac1Var != null) {
/* 7 */                 LinkedHashMap linkedHashMap = (LinkedHashMap) ac1Var.f179d;
/* 13 */                ((LinkedHashMap) ac1Var.f177b).clear();
/* 18 */                LinkedHashMap linkedHashMap2 = (LinkedHashMap) ac1Var.f178c;
/* 24 */                Iterator it = linkedHashMap2.values().iterator();
/* 32 */                while (it.hasNext()) {
/* 44 */                    Iterator it2 = ((Map) it.next()).values().iterator();
/* 52 */                    while (it2.hasNext()) {
/* 60 */                        ((yv1) it2.next()).dispose();
                            }
                        }
/* 68 */                Iterator it3 = linkedHashMap.values().iterator();
/* 76 */                while (it3.hasNext()) {
/* 88 */                    Iterator it4 = ((Map) it3.next()).values().iterator();
/* 96 */                    while (it4.hasNext()) {
/* 104 */                       ((yv1) it4.next()).dispose();
                            }
                        }
/* 108 */               linkedHashMap2.clear();
/* 111 */               linkedHashMap.clear();
                    }
/* 115 */           this.f16363g = null;
/* 117 */           this.f16364h = null;
/* 119 */           this.f16365i = null;
/* 121 */           this.f16366j = null;
                }

                /* JADX INFO: renamed from: b */
                public final void m8338b() {
                    DialogInterfaceC1991o7 dialogInterfaceC1991o7;
/* 1 */             Context contextM8339c = m8339c();
/* 6 */             if (contextM8339c != null && mn0.m6705u(contextM8339c)) {
/* 14 */                m8337a();
/* 17 */                return;
                    }
/* 18 */            DialogInterfaceC1991o7 dialogInterfaceC1991o8 = this.f16364h;
/* 20 */            if (dialogInterfaceC1991o8 != null && dialogInterfaceC1991o8.isShowing() && (dialogInterfaceC1991o7 = this.f16364h) != null) {
/* 32 */                dialogInterfaceC1991o7.dismiss();
                    }
/* 35 */            m8337a();
                }

                /* JADX INFO: renamed from: c */
                public final Context m8339c() {
/* 7 */             return (Context) this.f16361e.get();
                }
            }
