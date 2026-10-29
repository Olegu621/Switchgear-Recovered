            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.Xml;
            import android.view.View;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import androidx.constraintlayout.widget.R$styleable;
            import androidx.core.app.NotificationCompat;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jk1 implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final kk1 f12337a;

                /* JADX INFO: renamed from: b */
                public final int f12338b;

                /* JADX INFO: renamed from: c */
                public final int f12339c;

                public jk1(Context context, kk1 kk1Var, XmlResourceParser xmlResourceParser) {
/* 5 */             this.f12338b = -1;
/* 9 */             this.f12339c = 17;
/* 11 */            this.f12337a = kk1Var;
/* 19 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.OnClick);
/* 23 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 28 */            for (int i = 0; i < indexCount; i++) {
/* 30 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 36 */                if (index == R$styleable.OnClick_targetId) {
/* 44 */                    this.f12338b = typedArrayObtainStyledAttributes.getResourceId(index, this.f12338b);
                        } else if (index == R$styleable.OnClick_clickAction) {
/* 57 */                    this.f12339c = typedArrayObtainStyledAttributes.getInt(index, this.f12339c);
                        }
                    }
/* 62 */            typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: a */
                public final void m5842a(MotionLayout motionLayout, int i, kk1 kk1Var) {
                    boolean z;
                    View viewFindViewById;
/* 1 */             int i2 = this.f12338b;
                    View view = motionLayout;
/* 4 */             if (i2 != -1) {
/* 7 */                 viewFindViewById = motionLayout.findViewById(i2);
                    }
/* 11 */            if (view == null) {
                        view = viewFindViewById;
/* 29 */                AbstractC1245n0.m4876d("MotionScene", "OnClick could not find id " + i2);
/* 32 */                return;
                    }
/* 33 */            int i3 = kk1Var.f12842d;
/* 35 */            int i4 = kk1Var.f12841c;
/* 37 */            if (i3 == -1) {
                        view = viewFindViewById;
/* 39 */                view.setOnClickListener(this);
/* 42 */                return;
                    }
/* 43 */            int i5 = this.f12339c;
/* 45 */            int i6 = i5 & 1;
/* 47 */            boolean z2 = false;
/* 49 */            if (i6 == 0 || i != i3) {
                        view = viewFindViewById;
/* 55 */                z = false;
                    } else {
/* 53 */                z = true;
                    }
/* 83 */            boolean z3 = (i6 != 0 && i == i3) | z | ((i5 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
/* 86 */            if ((i5 & 4096) != 0 && i == i4) {
/* 90 */                z2 = true;
                    }
/* 93 */            if (z3 || z2) {
/* 95 */                view.setOnClickListener(this);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m5843b(MotionLayout motionLayout) {
/* 2 */             int i = this.f12338b;
/* 4 */             if (i == -1) {
/* 6 */                 return;
                    }
/* 7 */             View viewFindViewById = motionLayout.findViewById(i);
/* 11 */            if (viewFindViewById != null) {
/* 34 */                viewFindViewById.setOnClickListener(null);
/* 37 */                return;
                    }
/* 29 */            AbstractC1245n0.m4876d("MotionScene", " (*)  could not find id " + i);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
/* 1 */             kk1 kk1Var = this.f12337a;
/* 3 */             lk1 lk1Var = kk1Var.f12848j;
/* 5 */             MotionLayout motionLayout = lk1Var.f13341a;
/* 9 */             if (motionLayout.f926p0) {
/* 19 */                if (kk1Var.f12842d == -1) {
/* 21 */                    int currentState = motionLayout.getCurrentState();
/* 25 */                    if (currentState == -1) {
/* 29 */                        motionLayout.m470A(kk1Var.f12841c);
/* 32 */                        return;
                            }
/* 35 */                    kk1 kk1Var2 = new kk1(lk1Var, kk1Var);
/* 38 */                    kk1Var2.f12842d = currentState;
/* 42 */                    kk1Var2.f12841c = kk1Var.f12841c;
/* 44 */                    motionLayout.setTransition(kk1Var2);
/* 47 */                    motionLayout.m473k(1.0f);
/* 50 */                    motionLayout.f913i1 = null;
/* 52 */                    return;
                        }
/* 53 */                kk1 kk1Var3 = lk1Var.f13343c;
/* 55 */                int i = this.f12339c;
/* 57 */                int i2 = i & 1;
/* 59 */                boolean z = false;
/* 60 */                boolean z2 = true;
/* 70 */                boolean z3 = (i2 == 0 && (i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) ? false : true;
/* 71 */                int i3 = i & 16;
/* 73 */                if (i3 == 0 && (i & 4096) == 0) {
/* 80 */                    z2 = false;
                        }
/* 81 */                if (z3 && z2) {
/* 85 */                    if (kk1Var3 != kk1Var) {
/* 87 */                        motionLayout.setTransition(kk1Var);
                            }
/* 98 */                    if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
/* 111 */                       z2 = false;
/* 112 */                       z = z3;
                            }
                        } else {
/* 112 */                   z = z3;
                        }
/* 113 */               if (kk1Var != kk1Var3) {
/* 116 */                   int i4 = kk1Var.f12841c;
/* 118 */                   int i5 = kk1Var.f12842d;
/* 120 */                   int i6 = motionLayout.f918l0;
/* 122 */                   if (i5 == -1) {
/* 124 */                       if (i6 == i4) {
/* 181 */                           return;
                                }
                            } else if (i6 != i5 && i6 != i4) {
/* 181 */                       return;
                            }
                        }
/* 131 */               if (z && i2 != 0) {
/* 135 */                   motionLayout.setTransition(kk1Var);
/* 138 */                   motionLayout.m473k(1.0f);
/* 141 */                   motionLayout.f913i1 = null;
/* 143 */                   return;
                        }
/* 145 */               if (z2 && i3 != 0) {
/* 149 */                   motionLayout.setTransition(kk1Var);
/* 152 */                   motionLayout.m473k(0.0f);
                        } else if (z && (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
/* 162 */                   motionLayout.setTransition(kk1Var);
/* 165 */                   motionLayout.setProgress(1.0f);
                        } else {
/* 169 */                   if (!z2 || (i & 4096) == 0) {
/* 181 */                       return;
                            }
/* 175 */                   motionLayout.setTransition(kk1Var);
/* 178 */                   motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }
