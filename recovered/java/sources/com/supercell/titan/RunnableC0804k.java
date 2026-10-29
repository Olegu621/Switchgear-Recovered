            package com.supercell.titan;

            import android.animation.ObjectAnimator;
            import android.app.Activity;
            import android.util.Property;
            import android.util.TypedValue;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.Button;
            import android.widget.LinearLayout;
            import android.widget.TextView;
            import androidx.coordinatorlayout.widget.C0080c;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import com.google.android.material.behavior.SwipeDismissBehavior;
            import p000.C2315w1;
            import p000.ViewOnClickListenerC2239u1;
            import p000.fs0;
            
            /* JADX INFO: renamed from: com.supercell.titan.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC0804k implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Activity f6010a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ScInfoBox f6011b;

                public RunnableC0804k(ScInfoBox scInfoBox, GameApp gameApp) {
/* 4 */             this.f6011b = scInfoBox;
/* 6 */             this.f6010a = gameApp;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             ScInfoBox scInfoBox = this.f6011b;
/* 3 */             String str = scInfoBox.f5910b;
/* 5 */             String str2 = scInfoBox.f5909a;
/* 7 */             int i = ScInfoBox.f5908f;
/* 9 */             Activity activity = this.f6010a;
/* 15 */            ViewGroup coordinatorLayout = (CoordinatorLayout) activity.findViewById(i);
/* 18 */            if (coordinatorLayout == null) {
/* 27 */                coordinatorLayout = new CoordinatorLayout(activity.getBaseContext(), null);
/* 32 */                coordinatorLayout.setId(ScInfoBox.f5908f);
/* 35 */                coordinatorLayout.setBackgroundColor(0);
/* 44 */                activity.addContentView(coordinatorLayout, new C0080c(-1, -1));
                    }
/* 49 */            if (scInfoBox.f5913e == null) {
/* 63 */                scInfoBox.f5913e = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.sc_info_box, coordinatorLayout, false);
                    }
/* 71 */            scInfoBox.f5913e.setId(View.generateViewId());
/* 82 */            TextView textView = (TextView) scInfoBox.f5913e.findViewById(R.id.infoBoxText);
/* 90 */            if (str2.isEmpty()) {
/* 92 */                textView.setVisibility(8);
                    } else {
/* 96 */                textView.setVisibility(0);
/* 99 */                textView.setText(str2);
                    }
/* 110 */           Button button = (Button) scInfoBox.f5913e.findViewById(R.id.infoBoxButton);
/* 116 */           if (str.isEmpty()) {
/* 118 */               button.setVisibility(8);
                    } else {
/* 122 */               button.setVisibility(0);
/* 125 */               button.setText(str);
/* 135 */               button.setOnClickListener(new ViewOnClickListenerC2239u1(this, 9));
                    }
/* 153 */           int iApplyDimension = (int) TypedValue.applyDimension(1, 8.0f, activity.getResources().getDisplayMetrics());
/* 157 */           C0080c c0080c = new C0080c(-2, -2);
/* 162 */           c0080c.f1220c = 81;
/* 164 */           c0080c.setMargins(iApplyDimension, iApplyDimension, iApplyDimension, iApplyDimension);
/* 169 */           SwipeDismissBehavior swipeDismissBehavior = new SwipeDismissBehavior();
/* 173 */           swipeDismissBehavior.f4444d = 2;
/* 189 */           swipeDismissBehavior.f4447g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
/* 199 */           swipeDismissBehavior.f4445e = Math.min(Math.max(0.0f, 0.6f), 1.0f);
/* 208 */           swipeDismissBehavior.f4442b = new fs0(this, 11);
/* 210 */           c0080c.m582b(swipeDismissBehavior);
/* 213 */           LinearLayout linearLayout = scInfoBox.f5913e;
/* 215 */           Property property = View.ALPHA;
/* 222 */           ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, 0.0f, 1.0f);
/* 228 */           objectAnimatorOfFloat.setDuration(300L);
/* 239 */           if (((CoordinatorLayout) scInfoBox.f5913e.getParent()) != null) {
/* 241 */               return;
                    }
/* 244 */           scInfoBox.f5913e.setAlpha(0.0f);
/* 249 */           coordinatorLayout.addView(scInfoBox.f5913e, c0080c);
/* 252 */           objectAnimatorOfFloat.start();
/* 262 */           ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(scInfoBox.f5913e, (Property<LinearLayout, Float>) property, 1.0f, 0.0f);
/* 266 */           objectAnimatorOfFloat2.setDuration(300L);
/* 272 */           objectAnimatorOfFloat2.setStartDelay(scInfoBox.f5911c);
/* 275 */           objectAnimatorOfFloat2.start();
/* 284 */           objectAnimatorOfFloat2.addListener(new C2315w1(this, 7));
                }
            }
