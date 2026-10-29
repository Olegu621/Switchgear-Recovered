            package com.google.android.material.timepicker;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.GestureDetector;
            import android.view.LayoutInflater;
            import android.view.View;
            import androidx.constraintlayout.widget.C0076c;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import com.google.android.material.R$id;
            import com.google.android.material.R$layout;
            import com.google.android.material.button.MaterialButtonToggleGroup;
            import com.google.android.material.chip.Chip;
            import java.util.HashMap;
            import java.util.WeakHashMap;
            import p000.C1951n4;
            import p000.C2274uz;
            import p000.e33;
            import p000.q81;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 131 */   class TimePickerView extends ConstraintLayout {

                /* JADX INFO: renamed from: h0 */
                public static final /* synthetic */ int f5124h0 = 0;

                /* JADX INFO: renamed from: g0 */
                public final MaterialButtonToggleGroup f5125g0;

                public TimePickerView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 6 */             ViewOnClickListenerC0384f viewOnClickListenerC0384f = new ViewOnClickListenerC0384f();
/* 15 */            LayoutInflater.from(context).inflate(R$layout.material_timepicker, this);
/* 32 */            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R$id.material_clock_period_toggle);
/* 34 */            this.f5125g0 = materialButtonToggleGroup;
/* 43 */            materialButtonToggleGroup.f4556c.add(new C0385g());
/* 52 */            Chip chip = (Chip) findViewById(R$id.material_minute_tv);
/* 60 */            Chip chip2 = (Chip) findViewById(R$id.material_hour_tv);
/* 87 */            q81 q81Var = new q81(new GestureDetector(getContext(), new C0386h()), 1);
/* 90 */            chip.setOnTouchListener(q81Var);
/* 93 */            chip2.setOnTouchListener(q81Var);
/* 104 */           chip.setTag(R$id.selection_type, 12);
/* 115 */           chip2.setTag(R$id.selection_type, 10);
/* 118 */           chip.setOnClickListener(viewOnClickListenerC0384f);
/* 121 */           chip2.setOnClickListener(viewOnClickListenerC0384f);
/* 126 */           chip.setAccessibilityClassName("android.view.View");
/* 129 */           chip2.setAccessibilityClassName("android.view.View");
                }

                /* JADX INFO: renamed from: j */
                public final void m2429j() {
                    C0076c c0076c;
/* 7 */             if (this.f5125g0.getVisibility() == 0) {
/* 11 */                C0077d c0077d = new C0077d();
/* 14 */                c0077d.m539e(this);
/* 17 */                WeakHashMap weakHashMap = e33.f7494a;
/* 27 */                char c = getLayoutDirection() == 0 ? (char) 2 : (char) 1;
/* 28 */                int i = R$id.material_clock_display;
/* 30 */                Integer numValueOf = Integer.valueOf(i);
/* 34 */                HashMap map = c0077d.f1192f;
/* 40 */                if (map.containsKey(numValueOf) && (c0076c = (C0076c) map.get(Integer.valueOf(i))) != null) {
/* 55 */                    C2274uz c2274uz = c0076c.f1180e;
                            switch (c) {
                                case 1:
/* 135 */                           c2274uz.f17789j = -1;
/* 137 */                           c2274uz.f17787i = -1;
/* 139 */                           c2274uz.f17751G = -1;
/* 141 */                           c2274uz.f17758N = Integer.MIN_VALUE;
                                    break;
                                case 2:
/* 126 */                           c2274uz.f17793l = -1;
/* 128 */                           c2274uz.f17791k = -1;
/* 130 */                           c2274uz.f17752H = -1;
/* 132 */                           c2274uz.f17760P = Integer.MIN_VALUE;
                                    break;
                                case 3:
/* 117 */                           c2274uz.f17797n = -1;
/* 119 */                           c2274uz.f17795m = -1;
/* 121 */                           c2274uz.f17753I = 0;
/* 123 */                           c2274uz.f17759O = Integer.MIN_VALUE;
                                    break;
                                case 4:
/* 108 */                           c2274uz.f17799o = -1;
/* 110 */                           c2274uz.f17801p = -1;
/* 112 */                           c2274uz.f17754J = 0;
/* 114 */                           c2274uz.f17761Q = Integer.MIN_VALUE;
                                    break;
                                case 5:
/* 97 */                            c2274uz.f17803q = -1;
/* 99 */                            c2274uz.f17804r = -1;
/* 101 */                           c2274uz.f17805s = -1;
/* 103 */                           c2274uz.f17757M = 0;
/* 105 */                           c2274uz.f17764T = Integer.MIN_VALUE;
                                    break;
                                case 6:
/* 88 */                            c2274uz.f17806t = -1;
/* 90 */                            c2274uz.f17807u = -1;
/* 92 */                            c2274uz.f17756L = 0;
/* 94 */                            c2274uz.f17763S = Integer.MIN_VALUE;
                                    break;
                                case 7:
/* 79 */                            c2274uz.f17808v = -1;
/* 81 */                            c2274uz.f17809w = -1;
/* 83 */                            c2274uz.f17755K = 0;
/* 85 */                            c2274uz.f17762R = Integer.MIN_VALUE;
                                    break;
                                case '\b':
/* 72 */                            c2274uz.f17747C = -1.0f;
/* 74 */                            c2274uz.f17746B = -1;
/* 76 */                            c2274uz.f17745A = -1;
                                    break;
                                default:
/* 66 */                            C1951n4.m6859j("unknown constraint");
/* 69 */                            return;
                            }
                        }
/* 143 */               c0077d.m537b(this);
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             m2429j();
                }

                @Override // android.view.View
                public final void onVisibilityChanged(View view, int i) {
/* 1 */             super.onVisibilityChanged(view, i);
/* 4 */             if (view == this && i == 0) {
/* 8 */                 m2429j();
                    }
                }

/* 132 */       public TimePickerView(Context context, AttributeSet attributeSet) {
/* 133 */           this(context, attributeSet, 0);
                }
            }
