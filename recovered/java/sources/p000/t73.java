            package p000;

            import android.R;
            import android.animation.ValueAnimator;
            import android.app.Activity;
            import android.app.Dialog;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.drawable.ColorDrawable;
            import android.util.TypedValue;
            import android.view.ContextThemeWrapper;
            import android.view.KeyCharacterMap;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.animation.AccelerateInterpolator;
            import android.view.animation.DecelerateInterpolator;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$bool;
            import androidx.appcompat.R$id;
            import androidx.appcompat.R$styleable;
            import androidx.appcompat.widget.ActionBarContainer;
            import androidx.appcompat.widget.ActionBarContextView;
            import androidx.appcompat.widget.ActionBarOverlayLayout;
            import androidx.appcompat.widget.C0071k;
            import androidx.appcompat.widget.C0073m;
            import androidx.appcompat.widget.Toolbar;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 68 */    public final class t73 extends AbstractC2165s1 implements InterfaceC2482y1 {

                /* JADX INFO: renamed from: a */
                public Context f16956a;

                /* JADX INFO: renamed from: b */
                public Context f16957b;

                /* JADX INFO: renamed from: c */
                public ActionBarOverlayLayout f16958c;

                /* JADX INFO: renamed from: d */
                public ActionBarContainer f16959d;

                /* JADX INFO: renamed from: e */
                public n50 f16960e;

                /* JADX INFO: renamed from: f */
                public ActionBarContextView f16961f;

                /* JADX INFO: renamed from: g */
                public final View f16962g;

                /* JADX INFO: renamed from: h */
                public boolean f16963h;

                /* JADX INFO: renamed from: i */
                public s73 f16964i;

                /* JADX INFO: renamed from: j */
                public s73 f16965j;

                /* JADX INFO: renamed from: k */
                public C0210cb f16966k;

                /* JADX INFO: renamed from: l */
                public boolean f16967l;

                /* JADX INFO: renamed from: m */
                public final ArrayList f16968m;

                /* JADX INFO: renamed from: n */
                public int f16969n;

                /* JADX INFO: renamed from: o */
                public boolean f16970o;

                /* JADX INFO: renamed from: p */
                public boolean f16971p;

                /* JADX INFO: renamed from: q */
                public boolean f16972q;

                /* JADX INFO: renamed from: r */
                public boolean f16973r;

                /* JADX INFO: renamed from: s */
                public boolean f16974s;

                /* JADX INFO: renamed from: t */
                public q43 f16975t;

                /* JADX INFO: renamed from: u */
                public boolean f16976u;

                /* JADX INFO: renamed from: v */
                public boolean f16977v;

                /* JADX INFO: renamed from: w */
                public final r73 f16978w;

                /* JADX INFO: renamed from: x */
                public final r73 f16979x;

                /* JADX INFO: renamed from: y */
                public final fs0 f16980y;

                /* JADX INFO: renamed from: z */
                public static final AccelerateInterpolator f16955z = new AccelerateInterpolator();

                /* JADX INFO: renamed from: A */
                public static final DecelerateInterpolator f16954A = new DecelerateInterpolator();

                public t73(Activity activity, boolean z) {
/* 6 */             new ArrayList();
/* 14 */            this.f16968m = new ArrayList();
/* 17 */            this.f16969n = 0;
/* 20 */            this.f16970o = true;
/* 22 */            this.f16974s = true;
/* 29 */            this.f16978w = new r73(this, 0);
/* 36 */            this.f16979x = new r73(this, 1);
/* 45 */            this.f16980y = new fs0(this, 24);
/* 51 */            View decorView = activity.getWindow().getDecorView();
/* 55 */            m8726w(decorView);
/* 58 */            if (z) {
/* 69 */                return;
                    }
/* 67 */            this.f16962g = decorView.findViewById(R.id.content);
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: b */
                public final boolean mo8342b() {
                    C0071k c0071k;
/* 1 */             n50 n50Var = this.f16960e;
/* 3 */             if (n50Var == null || (c0071k = ((C0073m) n50Var).f762a.f685A0) == null || c0071k.f760b == null) {
/* 37 */                return false;
                    }
/* 22 */            C0071k c0071k2 = ((C0073m) n50Var).f762a.f685A0;
/* 28 */            sg1 sg1Var = c0071k2 == null ? null : c0071k2.f760b;
/* 30 */            if (sg1Var == null) {
/* 35 */                return true;
                    }
/* 32 */            sg1Var.collapseActionView();
/* 35 */            return true;
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: c */
                public final void mo8343c(boolean z) {
/* 3 */             if (z == this.f16967l) {
/* 16 */                return;
                    }
/* 6 */             this.f16967l = z;
/* 8 */             ArrayList arrayList = this.f16968m;
/* 14 */            if (arrayList.size() > 0) {
/* 22 */                throw pm2.m7486i(0, arrayList);
                    }
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: d */
                public final int mo8344d() {
/* 5 */             return ((C0073m) this.f16960e).f763b;
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: e */
                public final Context mo8345e() {
/* 3 */             if (this.f16957b == null) {
/* 7 */                 TypedValue typedValue = new TypedValue();
/* 19 */                this.f16956a.getTheme().resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
/* 22 */                int i = typedValue.resourceId;
/* 24 */                if (i != 0) {
/* 33 */                    this.f16957b = new ContextThemeWrapper(this.f16956a, i);
                        } else {
/* 38 */                    this.f16957b = this.f16956a;
                        }
                    }
/* 40 */            return this.f16957b;
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: f */
                public final void mo8346f() {
/* 3 */             if (this.f16971p) {
/* 12 */                return;
                    }
/* 6 */             this.f16971p = true;
/* 9 */             m8728y(false);
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: h */
                public final boolean mo8348h() {
/* 3 */             int height = this.f16959d.getHeight();
/* 9 */             if (this.f16974s) {
                        return height == 0 || this.f16958c.getActionBarHideOffset() < height;
                    }
/* 23 */            return false;
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: i */
                public final void mo8349i() {
/* 13 */            m8727x(this.f16956a.getResources().getBoolean(R$bool.abc_action_bar_embed_tabs));
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: k */
                public final boolean mo8351k(int i, KeyEvent keyEvent) {
                    jg1 jg1Var;
/* 1 */             s73 s73Var = this.f16964i;
/* 4 */             if (s73Var == null || (jg1Var = s73Var.f16466d) == null) {
/* 3 */                 return false;
                    }
/* 28 */            jg1Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
/* 31 */            return jg1Var.performShortcut(i, keyEvent, 0);
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: n */
                public final void mo8354n(ColorDrawable colorDrawable) {
/* 3 */             this.f16959d.setPrimaryBackground(colorDrawable);
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: o */
                public final void mo8355o(boolean z) {
/* 3 */             if (this.f16963h) {
/* 28 */                return;
                    }
/* 10 */            int i = z ? 4 : 0;
/* 13 */            C0073m c0073m = (C0073m) this.f16960e;
/* 15 */            int i2 = c0073m.f763b;
/* 18 */            this.f16963h = true;
/* 25 */            c0073m.m435a((i & 4) | (i2 & (-5)));
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: p */
                public final void mo8356p(boolean z) {
/* 7 */             int i = z ? 8 : 0;
/* 10 */            C0073m c0073m = (C0073m) this.f16960e;
/* 18 */            c0073m.m435a((i & 8) | (c0073m.f763b & (-9)));
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: q */
                public final void mo8357q(boolean z) {
                    q43 q43Var;
/* 1 */             this.f16976u = z;
/* 3 */             if (z || (q43Var = this.f16975t) == null) {
/* 12 */                return;
                    }
/* 9 */             q43Var.m7705a();
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: r */
                public final void mo8358r(CharSequence charSequence) {
/* 3 */             C0073m c0073m = (C0073m) this.f16960e;
/* 6 */             c0073m.f768g = true;
/* 8 */             Toolbar toolbar = c0073m.f762a;
/* 10 */            c0073m.f769h = charSequence;
/* 16 */            if ((c0073m.f763b & 8) != 0) {
/* 18 */                toolbar.setTitle(charSequence);
/* 23 */                if (c0073m.f768g) {
/* 29 */                    e33.m3319o(toolbar.getRootView(), charSequence);
                        }
                    }
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: s */
                public final void mo8359s(CharSequence charSequence) {
/* 3 */             C0073m c0073m = (C0073m) this.f16960e;
/* 7 */             if (c0073m.f768g) {
/* 33 */                return;
                    }
/* 9 */             Toolbar toolbar = c0073m.f762a;
/* 11 */            c0073m.f769h = charSequence;
/* 17 */            if ((c0073m.f763b & 8) != 0) {
/* 19 */                toolbar.setTitle(charSequence);
/* 24 */                if (c0073m.f768g) {
/* 30 */                    e33.m3319o(toolbar.getRootView(), charSequence);
                        }
                    }
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: t */
                public final void mo8360t() {
/* 3 */             if (this.f16971p) {
/* 6 */                 this.f16971p = false;
/* 8 */                 m8728y(false);
                    }
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: u */
                public final AbstractC1778j2 mo8361u(C0210cb c0210cb) {
/* 1 */             s73 s73Var = this.f16964i;
/* 3 */             if (s73Var != null) {
/* 5 */                 s73Var.mo4210a();
                    }
/* 11 */            this.f16958c.setHideOnContentScrollEnabled(false);
/* 16 */            this.f16961f.m338e();
/* 27 */            s73 s73Var2 = new s73(this, this.f16961f.getContext(), c0210cb);
/* 30 */            jg1 jg1Var = s73Var2.f16466d;
/* 32 */            jg1Var.m5817y();
                    try {
/* 41 */                boolean zMo1585f = ((InterfaceC1013i2) s73Var2.f16467e.f2804b).mo1585f(s73Var2, jg1Var);
/* 45 */                jg1Var.m5816x();
/* 48 */                if (!zMo1585f) {
/* 65 */                    return null;
                        }
/* 50 */                this.f16964i = s73Var2;
/* 52 */                s73Var2.mo4216h();
/* 57 */                this.f16961f.m336c(s73Var2);
/* 61 */                m8725v(true);
/* 64 */                return s73Var2;
                    } catch (Throwable th) {
/* 68 */                jg1Var.m5816x();
/* 71 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: v */
                public final void m8725v(boolean z) {
                    p43 p43VarM340i;
                    p43 p43VarM340i2;
/* 1 */             boolean z2 = this.f16973r;
/* 4 */             if (z) {
/* 6 */                 if (!z2) {
/* 9 */                     this.f16973r = true;
/* 11 */                    ActionBarOverlayLayout actionBarOverlayLayout = this.f16958c;
/* 13 */                    if (actionBarOverlayLayout != null) {
/* 15 */                        actionBarOverlayLayout.setShowingForActionMode(true);
                            }
/* 18 */                    m8728y(false);
                        }
                    } else if (z2) {
/* 24 */                this.f16973r = false;
/* 26 */                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f16958c;
/* 28 */                if (actionBarOverlayLayout2 != null) {
/* 30 */                    actionBarOverlayLayout2.setShowingForActionMode(false);
                        }
/* 33 */                m8728y(false);
                    }
/* 38 */            boolean zIsLaidOut = this.f16959d.isLaidOut();
/* 42 */            n50 n50Var = this.f16960e;
/* 47 */            if (!zIsLaidOut) {
/* 173 */               if (z) {
/* 179 */                   ((C0073m) n50Var).f762a.setVisibility(4);
/* 184 */                   this.f16961f.setVisibility(0);
/* 187 */                   return;
                        } else {
/* 192 */                   ((C0073m) n50Var).f762a.setVisibility(0);
/* 197 */                   this.f16961f.setVisibility(8);
/* 200 */                   return;
                        }
                    }
/* 53 */            if (z) {
/* 55 */                C0073m c0073m = (C0073m) n50Var;
/* 59 */                p43VarM340i = e33.m3305a(c0073m.f762a);
/* 64 */                p43VarM340i.m7335a(0.0f);
/* 67 */                p43VarM340i.m7337c(100L);
/* 75 */                p43VarM340i.m7338d(new zp2(c0073m, 4));
/* 80 */                p43VarM340i2 = this.f16961f.m340i(0, 200L);
                    } else {
/* 85 */                C0073m c0073m2 = (C0073m) n50Var;
/* 89 */                p43 p43VarM3305a = e33.m3305a(c0073m2.f762a);
/* 95 */                p43VarM3305a.m7335a(1.0f);
/* 98 */                p43VarM3305a.m7337c(200L);
/* 106 */               p43VarM3305a.m7338d(new zp2(c0073m2, 0));
/* 111 */               p43VarM340i = this.f16961f.m340i(8, 100L);
/* 117 */               p43VarM340i2 = p43VarM3305a;
                    }
/* 120 */           q43 q43Var = new q43();
/* 123 */           ArrayList arrayList = q43Var.f15393a;
/* 125 */           arrayList.add(p43VarM340i);
/* 134 */           View view = (View) p43VarM340i.f14964a.get();
/* 147 */           long duration = view != null ? view.animate().getDuration() : 0L;
/* 155 */           View view2 = (View) p43VarM340i2.f14964a.get();
/* 157 */           if (view2 != null) {
/* 163 */               view2.animate().setStartDelay(duration);
                    }
/* 166 */           arrayList.add(p43VarM340i2);
/* 169 */           q43Var.m7706b();
                }

                /* JADX INFO: renamed from: w */
                public final void m8726w(View view) {
                    n50 wrapper;
/* 7 */             ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R$id.decor_content_parent);
/* 9 */             this.f16958c = actionBarOverlayLayout;
/* 11 */            if (actionBarOverlayLayout != null) {
/* 13 */                actionBarOverlayLayout.setActionBarVisibilityCallback(this);
                    }
/* 18 */            KeyEvent.Callback callbackFindViewById = view.findViewById(R$id.action_bar);
/* 24 */            if (callbackFindViewById instanceof n50) {
/* 26 */                wrapper = (n50) callbackFindViewById;
                    } else {
/* 31 */                if (!(callbackFindViewById instanceof Toolbar)) {
/* 223 */                   throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
                        }
/* 35 */                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
                    }
/* 39 */            this.f16960e = wrapper;
/* 49 */            this.f16961f = (ActionBarContextView) view.findViewById(R$id.action_context_bar);
/* 57 */            ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R$id.action_bar_container);
/* 59 */            this.f16959d = actionBarContainer;
/* 61 */            n50 n50Var = this.f16960e;
/* 63 */            if (n50Var == null || this.f16961f == null || actionBarContainer == null) {
/* 195 */               f42.m3656l(t73.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
/* 198 */               return;
                    }
/* 75 */            Context context = ((C0073m) n50Var).f762a.getContext();
/* 79 */            this.f16956a = context;
/* 96 */            if ((((C0073m) this.f16960e).f763b & 4) != 0) {
/* 98 */                this.f16963h = true;
                    }
/* 104 */           int i = context.getApplicationInfo().targetSdkVersion;
/* 110 */           this.f16960e.getClass();
/* 123 */           m8727x(context.getResources().getBoolean(R$bool.abc_action_bar_embed_tabs));
/* 133 */           TypedArray typedArrayObtainStyledAttributes = this.f16956a.obtainStyledAttributes(null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
/* 143 */           if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.ActionBar_hideOnContentScroll, false)) {
/* 145 */               ActionBarOverlayLayout actionBarOverlayLayout2 = this.f16958c;
/* 149 */               if (!actionBarOverlayLayout2.f445i) {
/* 159 */                   f42.m3656l("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
/* 162 */                   return;
                        } else {
/* 151 */                   this.f16977v = true;
/* 153 */                   actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                        }
                    }
/* 165 */           int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_elevation, 0);
/* 169 */           if (dimensionPixelSize != 0) {
/* 172 */               ActionBarContainer actionBarContainer2 = this.f16959d;
/* 174 */               WeakHashMap weakHashMap = e33.f7494a;
/* 176 */               s23.m8381s(actionBarContainer2, dimensionPixelSize);
                    }
/* 179 */           typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: x */
                public final void m8727x(boolean z) {
/* 2 */             if (z) {
/* 19 */                this.f16959d.setTabContainer(null);
/* 26 */                ((C0073m) this.f16960e).getClass();
                    } else {
/* 8 */                 ((C0073m) this.f16960e).getClass();
/* 13 */                this.f16959d.setTabContainer(null);
                    }
/* 31 */            this.f16960e.getClass();
/* 41 */            ((C0073m) this.f16960e).f762a.setCollapsible(false);
/* 46 */            this.f16958c.setHasNonEmbeddedTabs(false);
                }

                /* JADX INFO: renamed from: y */
                public final void m8728y(boolean z) {
/* 19 */            boolean z2 = this.f16973r || !(this.f16971p || this.f16972q);
/* 20 */            boolean z3 = this.f16974s;
/* 27 */            final fs0 fs0Var = this.f16980y;
/* 29 */            View view = this.f16962g;
/* 31 */            if (!z2) {
/* 219 */               if (z3) {
/* 221 */                   this.f16974s = false;
/* 223 */                   q43 q43Var = this.f16975t;
/* 225 */                   if (q43Var != null) {
/* 227 */                       q43Var.m7705a();
                            }
/* 230 */                   int i = this.f16969n;
/* 232 */                   r73 r73Var = this.f16978w;
/* 234 */                   if (i != 0 || (!this.f16976u && !z)) {
/* 364 */                       r73Var.mo1186c();
/* 367 */                       return;
                            }
/* 244 */                   this.f16959d.setAlpha(1.0f);
/* 249 */                   this.f16959d.setTransitioning(true);
/* 254 */                   q43 q43Var2 = new q43();
/* 263 */                   float f = -this.f16959d.getHeight();
/* 265 */                   if (z) {
/* 267 */                       int[] iArr = {0, 0};
/* 273 */                       this.f16959d.getLocationInWindow(iArr);
/* 279 */                       f -= iArr[1];
                            }
/* 282 */                   p43 p43VarM3305a = e33.m3305a(this.f16959d);
/* 286 */                   p43VarM3305a.m7339e(f);
/* 295 */                   final View view2 = (View) p43VarM3305a.f14964a.get();
/* 297 */                   if (view2 != null) {
/* 310 */                       view2.animate().setUpdateListener(fs0Var != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: o43
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
/* 15 */                                ((View) ((t73) this.f14614a.f8339b).f16959d.getParent()).invalidate();
                                    }
                                } : null);
                            }
/* 313 */                   boolean z4 = q43Var2.f15397e;
/* 315 */                   ArrayList arrayList = q43Var2.f15393a;
/* 317 */                   if (!z4) {
/* 319 */                       arrayList.add(p43VarM3305a);
                            }
/* 324 */                   if (this.f16970o && view != null) {
/* 328 */                       p43 p43VarM3305a2 = e33.m3305a(view);
/* 332 */                       p43VarM3305a2.m7339e(f);
/* 337 */                       if (!q43Var2.f15397e) {
/* 339 */                           arrayList.add(p43VarM3305a2);
                                }
                            }
/* 342 */                   boolean z5 = q43Var2.f15397e;
/* 344 */                   if (!z5) {
/* 348 */                       q43Var2.f15395c = f16955z;
                            }
/* 350 */                   if (!z5) {
/* 352 */                       q43Var2.f15394b = 250L;
                            }
/* 354 */                   if (!z5) {
/* 356 */                       q43Var2.f15396d = r73Var;
                            }
/* 358 */                   this.f16975t = q43Var2;
/* 360 */                   q43Var2.m7706b();
/* 363 */                   return;
                        }
/* 367 */               return;
                    }
/* 33 */            if (z3) {
/* 367 */               return;
                    }
/* 35 */            this.f16974s = true;
/* 37 */            q43 q43Var3 = this.f16975t;
/* 39 */            if (q43Var3 != null) {
/* 41 */                q43Var3.m7705a();
                    }
/* 46 */            this.f16959d.setVisibility(0);
/* 49 */            int i2 = this.f16969n;
/* 51 */            r73 r73Var2 = this.f16979x;
/* 54 */            if (i2 == 0 && (this.f16976u || z)) {
/* 64 */                this.f16959d.setTranslationY(0.0f);
/* 73 */                float f2 = -this.f16959d.getHeight();
/* 75 */                if (z) {
/* 77 */                    int[] iArr2 = {0, 0};
/* 83 */                    this.f16959d.getLocationInWindow(iArr2);
/* 89 */                    f2 -= iArr2[1];
                        }
/* 92 */                this.f16959d.setTranslationY(f2);
/* 97 */                q43 q43Var4 = new q43();
/* 102 */               p43 p43VarM3305a3 = e33.m3305a(this.f16959d);
/* 106 */               p43VarM3305a3.m7339e(0.0f);
/* 115 */               final View view3 = (View) p43VarM3305a3.f14964a.get();
/* 117 */               if (view3 != null) {
/* 130 */                   view3.animate().setUpdateListener(fs0Var != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: o43
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
/* 15 */                            ((View) ((t73) this.f14614a.f8339b).f16959d.getParent()).invalidate();
                                }
                            } : null);
                        }
/* 133 */               boolean z6 = q43Var4.f15397e;
/* 135 */               ArrayList arrayList2 = q43Var4.f15393a;
/* 137 */               if (!z6) {
/* 139 */                   arrayList2.add(p43VarM3305a3);
                        }
/* 144 */               if (this.f16970o && view != null) {
/* 148 */                   view.setTranslationY(f2);
/* 151 */                   p43 p43VarM3305a4 = e33.m3305a(view);
/* 155 */                   p43VarM3305a4.m7339e(0.0f);
/* 160 */                   if (!q43Var4.f15397e) {
/* 162 */                       arrayList2.add(p43VarM3305a4);
                            }
                        }
/* 165 */               boolean z7 = q43Var4.f15397e;
/* 167 */               if (!z7) {
/* 171 */                   q43Var4.f15395c = f16954A;
                        }
/* 173 */               if (!z7) {
/* 175 */                   q43Var4.f15394b = 250L;
                        }
/* 177 */               if (!z7) {
/* 179 */                   q43Var4.f15396d = r73Var2;
                        }
/* 181 */               this.f16975t = q43Var4;
/* 183 */               q43Var4.m7706b();
                    } else {
/* 189 */               this.f16959d.setAlpha(1.0f);
/* 194 */               this.f16959d.setTranslationY(0.0f);
/* 199 */               if (this.f16970o && view != null) {
/* 203 */                   view.setTranslationY(0.0f);
                        }
/* 206 */               r73Var2.mo1186c();
                    }
/* 209 */           ActionBarOverlayLayout actionBarOverlayLayout = this.f16958c;
/* 211 */           if (actionBarOverlayLayout != null) {
/* 213 */               WeakHashMap weakHashMap = e33.f7494a;
/* 215 */               q23.m7679c(actionBarOverlayLayout);
                    }
                }

/* 69 */        public t73(Dialog dialog) {
/* 71 */            new ArrayList();
/* 72 */            this.f16968m = new ArrayList();
/* 73 */            this.f16969n = 0;
/* 74 */            this.f16970o = true;
/* 75 */            this.f16974s = true;
/* 76 */            this.f16978w = new r73(this, 0);
/* 77 */            this.f16979x = new r73(this, 1);
/* 78 */            this.f16980y = new fs0(this, 24);
/* 79 */            m8726w(dialog.getWindow().getDecorView());
                }
            }
