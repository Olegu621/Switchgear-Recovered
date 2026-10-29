            package p000;

            import android.R;
            import android.app.Activity;
            import android.app.Dialog;
            import android.app.UiModeManager;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.pm.ActivityInfo;
            import android.content.pm.PackageManager;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.location.LocationManager;
            import android.media.AudioManager;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.text.TextUtils;
            import android.util.AndroidRuntimeException;
            import android.util.AttributeSet;
            import android.util.LongSparseArray;
            import android.util.TypedValue;
            import android.view.KeyCharacterMap;
            import android.view.KeyEvent;
            import android.view.LayoutInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.Window;
            import android.view.WindowManager;
            import android.widget.FrameLayout;
            import android.widget.ListAdapter;
            import android.widget.PopupWindow;
            import android.widget.TextView;
            import android.window.OnBackInvokedCallback;
            import android.window.OnBackInvokedDispatcher;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$id;
            import androidx.appcompat.R$layout;
            import androidx.appcompat.R$style;
            import androidx.appcompat.R$styleable;
            import androidx.appcompat.app.AppCompatActivity;
            import androidx.appcompat.view.menu.ExpandedMenuView;
            import androidx.appcompat.widget.ActionBarContextView;
            import androidx.appcompat.widget.ActionBarOverlayLayout;
            import androidx.appcompat.widget.ActionMenuView;
            import androidx.appcompat.widget.AppCompatCheckedTextView;
            import androidx.appcompat.widget.AppCompatEditText;
            import androidx.appcompat.widget.AppCompatImageButton;
            import androidx.appcompat.widget.AppCompatImageView;
            import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
            import androidx.appcompat.widget.AppCompatRatingBar;
            import androidx.appcompat.widget.AppCompatSeekBar;
            import androidx.appcompat.widget.AppCompatSpinner;
            import androidx.appcompat.widget.AppCompatToggleButton;
            import androidx.appcompat.widget.C0062b;
            import androidx.appcompat.widget.C0073m;
            import androidx.appcompat.widget.ContentFrameLayout;
            import androidx.appcompat.widget.Toolbar;
            import androidx.appcompat.widget.ViewStubCompat;
            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.Field;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.LinkedHashSet;
            import java.util.Locale;
            import java.util.WeakHashMap;
            import okio.Segment;
            
            /* JADX INFO: renamed from: wa */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 597 */   public final class LayoutInflaterFactory2C2324wa extends AbstractC1021ia implements hg1, LayoutInflater.Factory2 {

                /* JADX INFO: renamed from: S0 */
                public static final le2 f18488S0 = new le2();

                /* JADX INFO: renamed from: T0 */
                public static final int[] f18489T0 = {R.attr.windowBackground};

                /* JADX INFO: renamed from: U0 */
                public static final boolean f18490U0 = !"robolectric".equals(Build.FINGERPRINT);

                /* JADX INFO: renamed from: A0 */
                public boolean f18491A0;

                /* JADX INFO: renamed from: B0 */
                public boolean f18492B0;

                /* JADX INFO: renamed from: C0 */
                public Configuration f18493C0;

                /* JADX INFO: renamed from: D0 */
                public final int f18494D0;

                /* JADX INFO: renamed from: E0 */
                public int f18495E0;

                /* JADX INFO: renamed from: F0 */
                public int f18496F0;

                /* JADX INFO: renamed from: G0 */
                public boolean f18497G0;

                /* JADX INFO: renamed from: H0 */
                public C2137ra f18498H0;

                /* JADX INFO: renamed from: I0 */
                public C2137ra f18499I0;

                /* JADX INFO: renamed from: J0 */
                public boolean f18500J0;

                /* JADX INFO: renamed from: K0 */
                public int f18501K0;

                /* JADX INFO: renamed from: M0 */
                public boolean f18503M0;

                /* JADX INFO: renamed from: N0 */
                public Rect f18504N0;

                /* JADX INFO: renamed from: O0 */
                public Rect f18505O0;

                /* JADX INFO: renamed from: P0 */
                public C0839dc f18506P0;

                /* JADX INFO: renamed from: Q0 */
                public OnBackInvokedDispatcher f18507Q0;

                /* JADX INFO: renamed from: R0 */
                public OnBackInvokedCallback f18508R0;

                /* JADX INFO: renamed from: U */
                public final Object f18509U;

                /* JADX INFO: renamed from: V */
                public final Context f18510V;

                /* JADX INFO: renamed from: W */
                public Window f18511W;

                /* JADX INFO: renamed from: X */
                public WindowCallbackC2100qa f18512X;

                /* JADX INFO: renamed from: Y */
                public final InterfaceC0209ca f18513Y;

                /* JADX INFO: renamed from: Z */
                public AbstractC2165s1 f18514Z;

                /* JADX INFO: renamed from: a0 */
                public yi2 f18515a0;

                /* JADX INFO: renamed from: b0 */
                public CharSequence f18516b0;

                /* JADX INFO: renamed from: c0 */
                public m50 f18517c0;

                /* JADX INFO: renamed from: d0 */
                public qc3 f18518d0;

                /* JADX INFO: renamed from: e0 */
                public C1824ka f18519e0;

                /* JADX INFO: renamed from: f0 */
                public AbstractC1778j2 f18520f0;

                /* JADX INFO: renamed from: g0 */
                public ActionBarContextView f18521g0;

                /* JADX INFO: renamed from: h0 */
                public PopupWindow f18522h0;

                /* JADX INFO: renamed from: i0 */
                public RunnableC1786ja f18523i0;

                /* JADX INFO: renamed from: k0 */
                public boolean f18525k0;

                /* JADX INFO: renamed from: l0 */
                public ViewGroup f18526l0;

                /* JADX INFO: renamed from: m0 */
                public TextView f18527m0;

                /* JADX INFO: renamed from: n0 */
                public View f18528n0;

                /* JADX INFO: renamed from: o0 */
                public boolean f18529o0;

                /* JADX INFO: renamed from: p0 */
                public boolean f18530p0;

                /* JADX INFO: renamed from: q0 */
                public boolean f18531q0;

                /* JADX INFO: renamed from: r0 */
                public boolean f18532r0;

                /* JADX INFO: renamed from: s0 */
                public boolean f18533s0;

                /* JADX INFO: renamed from: t0 */
                public boolean f18534t0;

                /* JADX INFO: renamed from: u0 */
                public boolean f18535u0;

                /* JADX INFO: renamed from: v0 */
                public boolean f18536v0;

                /* JADX INFO: renamed from: w0 */
                public C2286va[] f18537w0;

                /* JADX INFO: renamed from: x0 */
                public C2286va f18538x0;

                /* JADX INFO: renamed from: y0 */
                public boolean f18539y0;

                /* JADX INFO: renamed from: z0 */
                public boolean f18540z0;

                /* JADX INFO: renamed from: j0 */
                public p43 f18524j0 = null;

                /* JADX INFO: renamed from: L0 */
                public final RunnableC1786ja f18502L0 = new RunnableC1786ja(this, 0);

                public LayoutInflaterFactory2C2324wa(Context context, Window window, InterfaceC0209ca interfaceC0209ca, Object obj) {
                    AppCompatActivity appCompatActivity;
/* 9 */             this.f18494D0 = -100;
/* 19 */            this.f18510V = context;
/* 21 */            this.f18513Y = interfaceC0209ca;
/* 23 */            this.f18509U = obj;
/* 27 */            if (obj instanceof Dialog) {
                        while (true) {
/* 29 */                    if (context != null) {
/* 33 */                        if (context instanceof AppCompatActivity) {
/* 35 */                            appCompatActivity = (AppCompatActivity) context;
                                    break;
                                } else if (context instanceof ContextWrapper) {
/* 44 */                            context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
/* 49 */                    appCompatActivity = null;
                            break;
                        }
/* 50 */                if (appCompatActivity != null) {
/* 60 */                    this.f18494D0 = ((LayoutInflaterFactory2C2324wa) appCompatActivity.getDelegate()).f18494D0;
                        }
                    }
/* 64 */            if (this.f18494D0 == -100) {
/* 72 */                String name = this.f18509U.getClass().getName();
/* 76 */                le2 le2Var = f18488S0;
/* 82 */                Integer num = (Integer) le2Var.getOrDefault(name, null);
/* 84 */                if (num != null) {
/* 90 */                    this.f18494D0 = num.intValue();
/* 102 */                   le2Var.remove(this.f18509U.getClass().getName());
                        }
                    }
/* 105 */           if (window != null) {
/* 107 */               m9501o(window);
                    }
/* 110 */           C2491ya.m10134d();
                }

                /* JADX INFO: renamed from: p */
                public static h91 m9489p(Context context) {
                    h91 h91Var;
                    h91 h91Var2;
/* 5 */             if (Build.VERSION.SDK_INT >= 33 || (h91Var = AbstractC1021ia.f9504c) == null) {
/* 12 */                return null;
                    }
/* 14 */            i91 i91Var = h91Var.f8973a;
/* 28 */            h91 h91VarM6952b = AbstractC1957na.m6952b(context.getApplicationContext().getResources().getConfiguration());
/* 38 */            if (i91Var.f9500a.isEmpty()) {
/* 40 */                h91Var2 = h91.f8972b;
                    } else {
/* 45 */                LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 48 */                int i = 0;
/* 64 */                while (i < h91VarM6952b.f8973a.f9500a.size() + i91Var.f9500a.size()) {
/* 93 */                    Locale locale = i < i91Var.f9500a.size() ? i91Var.f9500a.get(i) : h91VarM6952b.f8973a.f9500a.get(i - i91Var.f9500a.size());
/* 97 */                    if (locale != null) {
/* 99 */                        linkedHashSet.add(locale);
                            }
/* 102 */                   i++;
                        }
/* 128 */               h91Var2 = new h91(new i91(g91.m3895a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
                    }
                    return h91Var2.f8973a.f9500a.isEmpty() ? h91VarM6952b : h91Var2;
                }

                /* JADX INFO: renamed from: t */
                public static Configuration m9490t(Context context, int i, h91 h91Var, Configuration configuration, boolean z) {
                    int i2;
/* 2 */             if (i == 1) {
/* 31 */                i2 = 16;
                    } else if (i != 2) {
/* 25 */                i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                    } else {
/* 28 */                i2 = 32;
                    }
/* 35 */            Configuration configuration2 = new Configuration();
/* 39 */            configuration2.fontScale = 0.0f;
/* 41 */            if (configuration != null) {
/* 43 */                configuration2.setTo(configuration);
                    }
/* 51 */            configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
/* 53 */            if (h91Var != null) {
/* 55 */                AbstractC1957na.m6954d(configuration2, h91Var);
                    }
/* 58 */            return configuration2;
                }

                /* JADX INFO: renamed from: A */
                public final void m9491A() {
/* 1 */             m9507w();
/* 6 */             if (this.f18531q0 && this.f18514Z == null) {
/* 13 */                Object obj = this.f18509U;
/* 17 */                if (obj instanceof Activity) {
/* 28 */                    this.f18514Z = new t73((Activity) obj, this.f18532r0);
                        } else if (obj instanceof Dialog) {
/* 42 */                    this.f18514Z = new t73((Dialog) obj);
                        }
/* 44 */                AbstractC2165s1 abstractC2165s1 = this.f18514Z;
/* 46 */                if (abstractC2165s1 != null) {
/* 50 */                    abstractC2165s1.mo8355o(this.f18503M0);
                        }
                    }
                }

                /* JADX INFO: renamed from: B */
                public final void m9492B(int i) {
/* 7 */             this.f18501K0 = (1 << i) | this.f18501K0;
/* 11 */            if (this.f18500J0) {
/* 28 */                return;
                    }
/* 15 */            View decorView = this.f18511W.getDecorView();
/* 19 */            WeakHashMap weakHashMap = e33.f7494a;
/* 23 */            decorView.postOnAnimation(this.f18502L0);
/* 26 */            this.f18500J0 = true;
                }

                /* JADX INFO: renamed from: C */
                public final int m9493C(Context context, int i) {
/* 4 */             if (i != -100) {
/* 6 */                 if (i != -1) {
/* 8 */                     if (i != 0) {
/* 11 */                        if (i != 1 && i != 2) {
/* 17 */                            if (i != 3) {
/* 39 */                                f42.m3656l("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
/* 42 */                                return 0;
                                    }
/* 21 */                            if (this.f18499I0 == null) {
/* 28 */                                this.f18499I0 = new C2137ra(this, context);
                                    }
/* 32 */                            return this.f18499I0.mo8096h();
                                }
                            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
/* 67 */                        return m9509y(context).mo8096h();
                            }
                        }
/* 72 */                return i;
                    }
/* 3 */             return -1;
                }

                /* JADX INFO: renamed from: D */
                public final boolean m9494D() {
/* 1 */             boolean z = this.f18539y0;
/* 4 */             this.f18539y0 = false;
/* 6 */             C2286va c2286vaM9510z = m9510z(0);
/* 13 */            if (!c2286vaM9510z.f17942m) {
/* 21 */                AbstractC1778j2 abstractC1778j2 = this.f18520f0;
/* 23 */                if (abstractC1778j2 != null) {
/* 25 */                    abstractC1778j2.mo4210a();
/* 12 */                    return true;
                        }
/* 29 */                m9491A();
/* 32 */                AbstractC2165s1 abstractC2165s1 = this.f18514Z;
/* 34 */                if (abstractC2165s1 == null || !abstractC2165s1.mo8342b()) {
/* 3 */                     return false;
                        }
                    } else if (!z) {
/* 17 */                m9504s(c2286vaM9510z, true);
/* 12 */                return true;
                    }
/* 12 */            return true;
                }

                /* JADX WARN: Code duplicated, block: B:100:0x01d2  */
                /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
                
                    if (r2.f12653i.getCount() > 0) goto L88;
                 */
                /* JADX INFO: renamed from: E */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void m9495E(C2286va c2286va, KeyEvent keyEvent) {
                    int i;
                    ViewGroup.LayoutParams layoutParams;
/* 5 */             boolean z = c2286va.f17942m;
/* 7 */             int i2 = c2286va.f17930a;
/* 9 */             if (z || this.f18492B0) {
/* 473 */               return;
                    }
/* 17 */            Context context = this.f18510V;
/* 19 */            if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
/* 473 */               return;
                    }
/* 40 */            Window.Callback callback = this.f18511W.getCallback();
/* 45 */            if (callback != null && !callback.onMenuOpened(i2, c2286va.f17937h)) {
/* 55 */                m9504s(c2286va, true);
/* 58 */                return;
                    }
/* 65 */            WindowManager windowManager = (WindowManager) context.getSystemService("window");
/* 67 */            if (windowManager != null && m9497G(c2286va, keyEvent)) {
/* 79 */                C2248ua c2248ua = c2286va.f17934e;
/* 83 */                if (c2248ua != null && !c2286va.f17943n) {
/* 90 */                    View view = c2286va.f17936g;
/* 92 */                    if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
/* 105 */                       i = -1;
                            }
/* 434 */                   c2286va.f17941l = false;
/* 447 */                   WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
/* 452 */                   layoutParams2.gravity = c2286va.f17932c;
/* 456 */                   layoutParams2.windowAnimations = c2286va.f17933d;
/* 460 */                   windowManager.addView(c2286va.f17934e, layoutParams2);
/* 463 */                   c2286va.f17942m = true;
/* 465 */                   if (i2 == 0) {
/* 467 */                       m9499I();
                            }
                        }
/* 108 */               if (c2248ua == null) {
/* 110 */                   m9491A();
/* 113 */                   AbstractC2165s1 abstractC2165s1 = this.f18514Z;
/* 122 */                   Context contextMo8345e = abstractC2165s1 != null ? abstractC2165s1.mo8345e() : null;
/* 123 */                   if (contextMo8345e != null) {
/* 126 */                       context = contextMo8345e;
                            }
/* 129 */                   TypedValue typedValue = new TypedValue();
/* 136 */                   Resources.Theme themeNewTheme = context.getResources().newTheme();
/* 144 */                   themeNewTheme.setTo(context.getTheme());
/* 149 */                   themeNewTheme.resolveAttribute(R$attr.actionBarPopupTheme, typedValue, true);
/* 152 */                   int i3 = typedValue.resourceId;
/* 154 */                   if (i3 != 0) {
/* 156 */                       themeNewTheme.applyStyle(i3, true);
                            }
/* 161 */                   themeNewTheme.resolveAttribute(R$attr.panelMenuListTheme, typedValue, true);
/* 164 */                   int i4 = typedValue.resourceId;
/* 166 */                   if (i4 != 0) {
/* 168 */                       themeNewTheme.applyStyle(i4, true);
                            } else {
/* 174 */                       themeNewTheme.applyStyle(R$style.Theme_AppCompat_CompactMenu, true);
                            }
/* 179 */                   z00 z00Var = new z00(context, 0);
/* 186 */                   z00Var.getTheme().setTo(themeNewTheme);
/* 189 */                   c2286va.f17939j = z00Var;
/* 193 */                   TypedArray typedArrayObtainStyledAttributes = z00Var.obtainStyledAttributes(R$styleable.AppCompatTheme);
/* 203 */                   c2286va.f17931b = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AppCompatTheme_panelBackground, 0);
/* 211 */                   c2286va.f17933d = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AppCompatTheme_android_windowAnimationStyle, 0);
/* 213 */                   typedArrayObtainStyledAttributes.recycle();
/* 223 */                   c2286va.f17934e = new C2248ua(this, c2286va.f17939j);
/* 227 */                   c2286va.f17932c = 81;
                        } else if (c2286va.f17943n && c2248ua.getChildCount() > 0) {
/* 242 */                   c2286va.f17934e.removeAllViews();
                        }
/* 245 */               View view2 = c2286va.f17936g;
/* 247 */               if (view2 == null) {
/* 254 */                   if (c2286va.f17937h != null) {
/* 260 */                       if (this.f18519e0 == null) {
/* 267 */                           this.f18519e0 = new C1824ka(this);
                                }
/* 269 */                       C1824ka c1824ka = this.f18519e0;
/* 273 */                       if (c2286va.f17938i == null) {
/* 281 */                           k81 k81Var = new k81(c2286va.f17939j, R$layout.abc_list_menu_item_layout);
/* 284 */                           c2286va.f17938i = k81Var;
/* 286 */                           k81Var.f12652f = c1824ka;
/* 288 */                           jg1 jg1Var = c2286va.f17937h;
/* 292 */                           jg1Var.m5802b(k81Var, jg1Var.f12256a);
                                }
/* 295 */                       k81 k81Var2 = c2286va.f17938i;
/* 297 */                       C2248ua c2248ua2 = c2286va.f17934e;
/* 301 */                       if (k81Var2.f12650d == null) {
/* 313 */                           k81Var2.f12650d = (ExpandedMenuView) k81Var2.f12648b.inflate(R$layout.abc_expanded_menu_layout, (ViewGroup) c2248ua2, false);
/* 317 */                           if (k81Var2.f12653i == null) {
/* 324 */                               k81Var2.f12653i = new j81(k81Var2);
                                    }
/* 330 */                           k81Var2.f12650d.setAdapter((ListAdapter) k81Var2.f12653i);
/* 335 */                           k81Var2.f12650d.setOnItemClickListener(k81Var2);
                                }
/* 338 */                       ExpandedMenuView expandedMenuView = k81Var2.f12650d;
/* 340 */                       c2286va.f17935f = expandedMenuView;
/* 342 */                       if (expandedMenuView != null) {
                                }
                            }
/* 471 */                   c2286va.f17943n = true;
/* 473 */                   return;
                        }
/* 249 */               c2286va.f17935f = view2;
/* 346 */               if (c2286va.f17935f != null) {
/* 352 */                   if (c2286va.f17936g == null) {
/* 355 */                       k81 k81Var3 = c2286va.f17938i;
/* 359 */                       if (k81Var3.f12653i == null) {
/* 366 */                           k81Var3.f12653i = new j81(k81Var3);
                                }
                            }
/* 378 */                   ViewGroup.LayoutParams layoutParams3 = c2286va.f17935f.getLayoutParams();
/* 382 */                   if (layoutParams3 == null) {
/* 386 */                       layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                            }
/* 393 */                   c2286va.f17934e.setBackgroundResource(c2286va.f17931b);
/* 398 */                   ViewParent parent = c2286va.f17935f.getParent();
/* 404 */                   if (parent instanceof ViewGroup) {
/* 410 */                       ((ViewGroup) parent).removeView(c2286va.f17935f);
                            }
/* 417 */                   c2286va.f17934e.addView(c2286va.f17935f, layoutParams3);
/* 426 */                   if (!c2286va.f17935f.hasFocus()) {
/* 430 */                       c2286va.f17935f.requestFocus();
                            }
                        }
/* 471 */               c2286va.f17943n = true;
/* 473 */               return;
/* 433 */               i = -2;
/* 434 */               c2286va.f17941l = false;
/* 447 */               WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
/* 452 */               layoutParams4.gravity = c2286va.f17932c;
/* 456 */               layoutParams4.windowAnimations = c2286va.f17933d;
/* 460 */               windowManager.addView(c2286va.f17934e, layoutParams4);
/* 463 */               c2286va.f17942m = true;
/* 465 */               if (i2 == 0) {
/* 467 */                   m9499I();
                        }
                    }
                }

                /* JADX INFO: renamed from: F */
                public final boolean m9496F(C2286va c2286va, int i, KeyEvent keyEvent) {
                    jg1 jg1Var;
/* 6 */             if (keyEvent.isSystem()) {
/* 5 */                 return false;
                    }
/* 11 */            if ((c2286va.f17940k || m9497G(c2286va, keyEvent)) && (jg1Var = c2286va.f17937h) != null) {
/* 24 */                return jg1Var.performShortcut(i, keyEvent, 1);
                    }
/* 5 */             return false;
                }

                /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
                /* JADX WARN: Code duplicated, block: B:67:0x00e2  */
                /* JADX WARN: Code duplicated, block: B:71:0x0101  */
                /* JADX WARN: Code duplicated, block: B:74:0x0106 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:75:0x0108  */
                /* JADX WARN: Code duplicated, block: B:82:0x011d  */
                /* JADX INFO: renamed from: G */
                public final boolean m9497G(C2286va c2286va, KeyEvent keyEvent) {
                    jg1 jg1Var;
                    m50 m50Var;
                    m50 m50Var2;
                    Resources.Theme themeNewTheme;
                    m50 m50Var3;
                    m50 m50Var4;
/* 4 */             if (!this.f18492B0) {
/* 8 */                 boolean z = c2286va.f17940k;
/* 10 */                int i = c2286va.f17930a;
/* 13 */                if (z) {
/* 12 */                    return true;
                        }
/* 16 */                C2286va c2286va2 = this.f18538x0;
/* 18 */                if (c2286va2 != null && c2286va2 != c2286va) {
/* 22 */                    m9504s(c2286va2, false);
                        }
/* 27 */                Window.Callback callback = this.f18511W.getCallback();
/* 31 */                if (callback != null) {
/* 37 */                    c2286va.f17936g = callback.onCreatePanelView(i);
                        }
/* 48 */                boolean z2 = i == 0 || i == 108;
/* 49 */                if (z2 && (m50Var4 = this.f18517c0) != null) {
/* 55 */                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) m50Var4;
/* 57 */                    actionBarOverlayLayout.m345e();
/* 64 */                    ((C0073m) actionBarOverlayLayout.f439e).f773l = true;
                        }
/* 68 */                if (c2286va.f17936g == null && (!z2 || !(this.f18514Z instanceof xp2))) {
/* 78 */                    jg1 jg1Var2 = c2286va.f17937h;
/* 81 */                    if (jg1Var2 == null || c2286va.f17944o) {
/* 87 */                        if (jg1Var2 == null) {
/* 89 */                            Context context = this.f18510V;
/* 91 */                            if ((i == 0 || i == 108) && this.f18517c0 != null) {
/* 101 */                               TypedValue typedValue = new TypedValue();
/* 104 */                               Resources.Theme theme = context.getTheme();
/* 110 */                               theme.resolveAttribute(R$attr.actionBarTheme, typedValue, true);
/* 115 */                               if (typedValue.resourceId != 0) {
/* 121 */                                   themeNewTheme = context.getResources().newTheme();
/* 125 */                                   themeNewTheme.setTo(theme);
/* 130 */                                   themeNewTheme.applyStyle(typedValue.resourceId, true);
/* 135 */                                   themeNewTheme.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
                                        } else {
/* 141 */                                   theme.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
/* 144 */                                   themeNewTheme = null;
                                        }
/* 147 */                               if (typedValue.resourceId != 0) {
/* 149 */                                   if (themeNewTheme == null) {
/* 155 */                                       themeNewTheme = context.getResources().newTheme();
/* 159 */                                       themeNewTheme.setTo(theme);
                                            }
/* 164 */                                   themeNewTheme.applyStyle(typedValue.resourceId, true);
                                        }
/* 167 */                               if (themeNewTheme != null) {
/* 171 */                                   z00 z00Var = new z00(context, 0);
/* 178 */                                   z00Var.getTheme().setTo(themeNewTheme);
/* 181 */                                   context = z00Var;
                                        }
                                    }
/* 184 */                           jg1 jg1Var3 = new jg1(context);
/* 187 */                           jg1Var3.f12260e = this;
/* 189 */                           jg1 jg1Var4 = c2286va.f17937h;
/* 191 */                           if (jg1Var3 != jg1Var4) {
/* 194 */                               if (jg1Var4 != null) {
/* 198 */                                   jg1Var4.m5810r(c2286va.f17938i);
                                        }
/* 201 */                               c2286va.f17937h = jg1Var3;
/* 203 */                               k81 k81Var = c2286va.f17938i;
/* 205 */                               if (k81Var != null) {
/* 209 */                                   jg1Var3.m5802b(k81Var, jg1Var3.f12256a);
                                        }
                                    }
/* 214 */                           if (c2286va.f17937h != null) {
/* 217 */                               if (z2 && (m50Var2 = this.f18517c0) != null) {
/* 225 */                                   if (this.f18518d0 == null) {
/* 234 */                                       this.f18518d0 = new qc3(this, 8);
                                            }
/* 242 */                                   ((ActionBarOverlayLayout) m50Var2).m346f(c2286va.f17937h, this.f18518d0);
                                        }
/* 247 */                               c2286va.f17937h.m5817y();
/* 256 */                               if (callback.onCreatePanelMenu(i, c2286va.f17937h)) {
/* 286 */                                   c2286va.f17944o = false;
                                        } else {
/* 258 */                                   jg1Var = c2286va.f17937h;
/* 260 */                                   if (jg1Var != null) {
/* 263 */                                       if (jg1Var != null) {
/* 267 */                                           jg1Var.m5810r(c2286va.f17938i);
                                                }
/* 270 */                                       c2286va.f17937h = null;
                                            }
/* 272 */                                   if (z2 && (m50Var = this.f18517c0) != null) {
/* 282 */                                       ((ActionBarOverlayLayout) m50Var).m346f(null, this.f18518d0);
                                            }
                                        }
                                    }
                                } else {
/* 217 */                           if (z2) {
/* 225 */                               if (this.f18518d0 == null) {
/* 234 */                                   this.f18518d0 = new qc3(this, 8);
                                        }
/* 242 */                               ((ActionBarOverlayLayout) m50Var2).m346f(c2286va.f17937h, this.f18518d0);
                                    }
/* 247 */                           c2286va.f17937h.m5817y();
/* 256 */                           if (callback.onCreatePanelMenu(i, c2286va.f17937h)) {
/* 258 */                               jg1Var = c2286va.f17937h;
/* 260 */                               if (jg1Var != null) {
/* 263 */                                   if (jg1Var != null) {
/* 267 */                                       jg1Var.m5810r(c2286va.f17938i);
                                            }
/* 270 */                                   c2286va.f17937h = null;
                                        }
/* 272 */                               if (z2) {
/* 282 */                                   ((ActionBarOverlayLayout) m50Var).m346f(null, this.f18518d0);
                                        }
                                    } else {
/* 286 */                               c2286va.f17944o = false;
                                    }
                                }
                            }
/* 290 */                   c2286va.f17937h.m5817y();
/* 293 */                   Bundle bundle = c2286va.f17945p;
/* 295 */                   if (bundle != null) {
/* 299 */                       c2286va.f17937h.m5811s(bundle);
/* 302 */                       c2286va.f17945p = null;
                            }
/* 312 */                   if (!callback.onPreparePanel(0, c2286va.f17936g, c2286va.f17937h)) {
/* 314 */                       if (z2 && (m50Var3 = this.f18517c0) != null) {
/* 324 */                           ((ActionBarOverlayLayout) m50Var3).m346f(null, this.f18518d0);
                                }
/* 329 */                       c2286va.f17937h.m5816x();
/* 3 */                         return false;
                            }
/* 356 */                   c2286va.f17937h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
/* 361 */                   c2286va.f17937h.m5816x();
                        }
/* 364 */               c2286va.f17940k = true;
/* 366 */               c2286va.f17941l = false;
/* 368 */               this.f18538x0 = c2286va;
/* 12 */                return true;
                    }
/* 3 */             return false;
                }

                /* JADX INFO: renamed from: H */
                public final void m9498H() {
/* 3 */             if (this.f18525k0) {
/* 13 */                throw new AndroidRuntimeException("Window feature must be requested before adding content");
                    }
                }

                /* JADX INFO: renamed from: I */
                public final void m9499I() {
                    OnBackInvokedCallback onBackInvokedCallback;
/* 5 */             if (Build.VERSION.SDK_INT >= 33) {
/* 9 */                 boolean z = false;
/* 10 */                if (this.f18507Q0 != null && (m9510z(0).f17942m || this.f18520f0 != null)) {
/* 22 */                    z = true;
                        }
/* 29 */                if (z && this.f18508R0 == null) {
/* 41 */                    this.f18508R0 = AbstractC2063pa.m7374b(this.f18507Q0, this);
                        } else {
/* 44 */                    if (z || (onBackInvokedCallback = this.f18508R0) == null) {
/* 58 */                        return;
                            }
/* 52 */                    AbstractC2063pa.m7375c(this.f18507Q0, onBackInvokedCallback);
/* 56 */                    this.f18508R0 = null;
                        }
                    }
                }

                @Override // p000.AbstractC1021ia
                /* JADX INFO: renamed from: a */
                public final void mo4501a() {
/* 3 */             if (this.f18514Z != null) {
/* 5 */                 m9491A();
/* 14 */                if (this.f18514Z.mo8347g()) {
/* 21 */                    return;
                        }
/* 18 */                m9492B(0);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:20:0x002a  */
                @Override // p000.hg1
                /* JADX INFO: renamed from: c */
                public final boolean mo3404c(jg1 jg1Var, MenuItem menuItem) {
                    C2286va c2286va;
/* 3 */             Window.Callback callback = this.f18511W.getCallback();
/* 8 */             if (callback != null && !this.f18492B0) {
/* 14 */                jg1 jg1VarMo4234k = jg1Var.mo4234k();
/* 18 */                C2286va[] c2286vaArr = this.f18537w0;
/* 24 */                int length = c2286vaArr != null ? c2286vaArr.length : 0;
/* 26 */                for (int i = 0; i < length; i++) {
/* 28 */                    c2286va = c2286vaArr[i];
/* 30 */                    if (c2286va != null && c2286va.f17937h == jg1VarMo4234k) {
/* 41 */                        if (c2286va != null) {
/* 45 */                            return callback.onMenuItemSelected(c2286va.f17930a, menuItem);
                                }
                            }
                        }
/* 40 */                c2286va = null;
/* 41 */                if (c2286va != null) {
/* 45 */                    return callback.onMenuItemSelected(c2286va.f17930a, menuItem);
                        }
                    }
/* 7 */             return false;
                }

                @Override // p000.AbstractC1021ia
                /* JADX INFO: renamed from: d */
                public final void mo4502d() throws IllegalAccessException {
                    String strM7605e0;
/* 2 */             this.f18540z0 = true;
/* 5 */             m9500n(false, true);
/* 8 */             m9508x();
/* 11 */            Object obj = this.f18509U;
/* 15 */            if (obj instanceof Activity) {
                        try {
/* 17 */                    Activity activity = (Activity) obj;
                            try {
/* 23 */                        strM7605e0 = py0.m7605e0(activity, activity.getComponentName());
                            } catch (PackageManager.NameNotFoundException e) {
/* 34 */                        throw new IllegalArgumentException(e);
                            }
                        } catch (IllegalArgumentException unused) {
/* 35 */                    strM7605e0 = null;
                        }
/* 36 */                if (strM7605e0 != null) {
/* 38 */                    AbstractC2165s1 abstractC2165s1 = this.f18514Z;
/* 40 */                    if (abstractC2165s1 == null) {
/* 42 */                        this.f18503M0 = true;
                            } else {
/* 45 */                        abstractC2165s1.mo8355o(true);
                            }
                        }
                        synchronized (AbstractC1021ia.f9509v) {
/* 51 */                    AbstractC1021ia.m4500f(this);
/* 61 */                    AbstractC1021ia.f9508i.add(new WeakReference(this));
                        }
                    }
/* 84 */            this.f18493C0 = new Configuration(this.f18510V.getResources().getConfiguration());
/* 86 */            this.f18491A0 = true;
                }

                /* JADX WARN: Code duplicated, block: B:22:0x004d  */
                @Override // p000.AbstractC1021ia
                /* JADX INFO: renamed from: e */
                public final void mo4503e() {
/* 5 */             if (this.f18509U instanceof Activity) {
                        synchronized (AbstractC1021ia.f9509v) {
/* 10 */                    AbstractC1021ia.m4500f(this);
                        }
                    }
/* 20 */            if (this.f18500J0) {
/* 30 */                this.f18511W.getDecorView().removeCallbacks(this.f18502L0);
                    }
/* 34 */            this.f18492B0 = true;
/* 40 */            if (this.f18494D0 != -100) {
/* 42 */                Object obj = this.f18509U;
/* 46 */                if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
/* 74 */                    f18488S0.put(this.f18509U.getClass().getName(), Integer.valueOf(this.f18494D0));
                        } else {
/* 90 */                    f18488S0.remove(this.f18509U.getClass().getName());
                        }
                    } else {
/* 90 */                f18488S0.remove(this.f18509U.getClass().getName());
                    }
/* 93 */            AbstractC2165s1 abstractC2165s1 = this.f18514Z;
/* 95 */            if (abstractC2165s1 != null) {
/* 97 */                abstractC2165s1.mo8350j();
                    }
/* 100 */           C2137ra c2137ra = this.f18498H0;
/* 102 */           if (c2137ra != null) {
/* 104 */               c2137ra.m8746d();
                    }
/* 107 */           C2137ra c2137ra2 = this.f18499I0;
/* 109 */           if (c2137ra2 != null) {
/* 111 */               c2137ra2.m8746d();
                    }
                }

                @Override // p000.AbstractC1021ia
                /* JADX INFO: renamed from: g */
                public final boolean mo4504g(int i) {
/* 7 */             if (i == 8) {
/* 9 */                 i = 108;
                    } else if (i == 9) {
/* 15 */                i = 109;
                    }
/* 19 */            if (this.f18535u0 && i == 108) {
/* 18 */                return false;
                    }
/* 27 */            if (this.f18531q0 && i == 1) {
/* 31 */                this.f18531q0 = false;
                    }
/* 33 */            if (i == 1) {
/* 86 */                m9498H();
/* 89 */                this.f18535u0 = true;
/* 26 */                return true;
                    }
/* 36 */            if (i == 2) {
/* 80 */                m9498H();
/* 83 */                this.f18529o0 = true;
/* 26 */                return true;
                    }
/* 39 */            if (i == 5) {
/* 74 */                m9498H();
/* 77 */                this.f18530p0 = true;
/* 26 */                return true;
                    }
/* 43 */            if (i == 10) {
/* 68 */                m9498H();
/* 71 */                this.f18533s0 = true;
/* 26 */                return true;
                    }
/* 45 */            if (i == 108) {
/* 62 */                m9498H();
/* 65 */                this.f18531q0 = true;
/* 26 */                return true;
                    }
/* 47 */            if (i != 109) {
/* 51 */                return this.f18511W.requestFeature(i);
                    }
/* 56 */            m9498H();
/* 59 */            this.f18532r0 = true;
/* 26 */            return true;
                }

                @Override // p000.AbstractC1021ia
                /* JADX INFO: renamed from: h */
                public final void mo4505h(int i) {
/* 1 */             m9507w();
/* 13 */            ViewGroup viewGroup = (ViewGroup) this.f18526l0.findViewById(R.id.content);
/* 15 */            viewGroup.removeAllViews();
/* 24 */            LayoutInflater.from(this.f18510V).inflate(i, viewGroup);
/* 35 */            this.f18512X.m7743a(this.f18511W.getCallback());
                }

                @Override // p000.AbstractC1021ia
                /* JADX INFO: renamed from: i */
                public final void mo4506i(View view) {
/* 1 */             m9507w();
/* 13 */            ViewGroup viewGroup = (ViewGroup) this.f18526l0.findViewById(R.id.content);
/* 15 */            viewGroup.removeAllViews();
/* 18 */            viewGroup.addView(view);
/* 29 */            this.f18512X.m7743a(this.f18511W.getCallback());
                }

                @Override // p000.AbstractC1021ia
                /* JADX INFO: renamed from: j */
                public final void mo4507j(View view, ViewGroup.LayoutParams layoutParams) {
/* 1 */             m9507w();
/* 13 */            ViewGroup viewGroup = (ViewGroup) this.f18526l0.findViewById(R.id.content);
/* 15 */            viewGroup.removeAllViews();
/* 18 */            viewGroup.addView(view, layoutParams);
/* 29 */            this.f18512X.m7743a(this.f18511W.getCallback());
                }

                @Override // p000.AbstractC1021ia
                /* JADX INFO: renamed from: k */
                public final void mo4508k(CharSequence charSequence) {
/* 1 */             this.f18516b0 = charSequence;
/* 3 */             m50 m50Var = this.f18517c0;
/* 5 */             if (m50Var != null) {
/* 7 */                 m50Var.setWindowTitle(charSequence);
/* 10 */                return;
                    }
/* 11 */            AbstractC2165s1 abstractC2165s1 = this.f18514Z;
/* 13 */            if (abstractC2165s1 != null) {
/* 15 */                abstractC2165s1.mo8359s(charSequence);
/* 18 */                return;
                    }
/* 19 */            TextView textView = this.f18527m0;
/* 21 */            if (textView != null) {
/* 23 */                textView.setText(charSequence);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
                
                    if (r6.m427m() != false) goto L20;
                 */
                @Override // p000.hg1
                /* JADX INFO: renamed from: l */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void mo3407l(jg1 jg1Var) {
                    ActionMenuView actionMenuView;
                    C0062b c0062b;
/* 1 */             m50 m50Var = this.f18517c0;
/* 5 */             if (m50Var != null) {
/* 7 */                 ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) m50Var;
/* 9 */                 actionBarOverlayLayout.m345e();
/* 16 */                Toolbar toolbar = ((C0073m) actionBarOverlayLayout.f439e).f762a;
/* 22 */                if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f696a) != null && actionMenuView.f460g0) {
/* 42 */                    if (ViewConfiguration.get(this.f18510V).hasPermanentMenuKey()) {
/* 46 */                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f18517c0;
/* 48 */                        actionBarOverlayLayout2.m345e();
/* 57 */                        ActionMenuView actionMenuView2 = ((C0073m) actionBarOverlayLayout2.f439e).f762a.f696a;
/* 59 */                        if (actionMenuView2 != null) {
/* 61 */                            C0062b c0062b2 = actionMenuView2.f461h0;
/* 63 */                            if (c0062b2 != null) {
/* 67 */                                if (c0062b2.f750g0 == null) {
                                        }
                                    }
                                }
                            }
/* 77 */                    Window.Callback callback = this.f18511W.getCallback();
/* 83 */                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f18517c0;
/* 85 */                    actionBarOverlayLayout3.m345e();
/* 100 */                   if (((C0073m) actionBarOverlayLayout3.f439e).f762a.m409o()) {
/* 104 */                       ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f18517c0;
/* 106 */                       actionBarOverlayLayout4.m345e();
/* 115 */                       ActionMenuView actionMenuView3 = ((C0073m) actionBarOverlayLayout4.f439e).f762a.f696a;
/* 117 */                       if (actionMenuView3 != null && (c0062b = actionMenuView3.f461h0) != null) {
/* 123 */                           c0062b.m424j();
                                }
/* 129 */                       if (this.f18492B0) {
/* 211 */                           return;
                                }
/* 137 */                       callback.onPanelClosed(108, m9510z(0).f17937h);
/* 140 */                       return;
                            }
/* 141 */                   if (callback == null || this.f18492B0) {
/* 211 */                       return;
                            }
/* 149 */                   if (this.f18500J0 && (1 & this.f18501K0) != 0) {
/* 158 */                       View decorView = this.f18511W.getDecorView();
/* 162 */                       RunnableC1786ja runnableC1786ja = this.f18502L0;
/* 164 */                       decorView.removeCallbacks(runnableC1786ja);
/* 167 */                       runnableC1786ja.run();
                            }
/* 170 */                   C2286va c2286vaM9510z = m9510z(0);
/* 174 */                   jg1 jg1Var2 = c2286vaM9510z.f17937h;
/* 176 */                   if (jg1Var2 == null || c2286vaM9510z.f17944o || !callback.onPreparePanel(0, c2286vaM9510z.f17936g, jg1Var2)) {
/* 211 */                       return;
                            }
/* 192 */                   callback.onMenuOpened(108, c2286vaM9510z.f17937h);
/* 197 */                   ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f18517c0;
/* 199 */                   actionBarOverlayLayout5.m345e();
/* 208 */                   ((C0073m) actionBarOverlayLayout5.f439e).f762a.m415u();
/* 211 */                   return;
                        }
                    }
/* 212 */           C2286va c2286vaM9510z2 = m9510z(0);
/* 216 */           c2286vaM9510z2.f17943n = true;
/* 218 */           m9504s(c2286vaM9510z2, false);
/* 222 */           m9495E(c2286vaM9510z2, null);
                }

                @Override // p000.AbstractC1021ia
                /* JADX INFO: renamed from: m */
                public final AbstractC1778j2 mo4509m(InterfaceC1013i2 interfaceC1013i2) {
                    AbstractC1778j2 abstractC1778j2OnWindowStartingSupportActionMode;
                    ViewGroup viewGroup;
/* 2 */             if (interfaceC1013i2 == null) {
/* 437 */               C1951n4.m6859j("ActionMode callback can not be null.");
/* 1 */                 return null;
                    }
/* 4 */             AbstractC1778j2 abstractC1778j2 = this.f18520f0;
/* 6 */             if (abstractC1778j2 != null) {
/* 8 */                 abstractC1778j2.mo4210a();
                    }
/* 15 */            C0210cb c0210cb = new C0210cb(this, interfaceC1013i2, 5, false);
/* 18 */            m9491A();
/* 21 */            AbstractC2165s1 abstractC2165s1 = this.f18514Z;
/* 23 */            InterfaceC0209ca interfaceC0209ca = this.f18513Y;
/* 25 */            if (abstractC2165s1 != null) {
/* 27 */                AbstractC1778j2 abstractC1778j2Mo8361u = abstractC2165s1.mo8361u(c0210cb);
/* 31 */                this.f18520f0 = abstractC1778j2Mo8361u;
/* 33 */                if (abstractC1778j2Mo8361u != null) {
/* 35 */                    interfaceC0209ca.onSupportActionModeStarted(abstractC1778j2Mo8361u);
                        }
                    }
/* 40 */            if (this.f18520f0 == null) {
/* 42 */                p43 p43Var = this.f18524j0;
/* 44 */                if (p43Var != null) {
/* 46 */                    p43Var.m7336b();
                        }
/* 49 */                AbstractC1778j2 abstractC1778j3 = this.f18520f0;
/* 51 */                if (abstractC1778j3 != null) {
/* 53 */                    abstractC1778j3.mo4210a();
                        }
/* 58 */                if (this.f18492B0) {
/* 65 */                    abstractC1778j2OnWindowStartingSupportActionMode = null;
                        } else {
                            try {
/* 60 */                        abstractC1778j2OnWindowStartingSupportActionMode = interfaceC0209ca.onWindowStartingSupportActionMode(c0210cb);
                            } catch (AbstractMethodError unused) {
/* 65 */                        abstractC1778j2OnWindowStartingSupportActionMode = null;
                            }
                        }
/* 66 */                if (abstractC1778j2OnWindowStartingSupportActionMode != null) {
/* 68 */                    this.f18520f0 = abstractC1778j2OnWindowStartingSupportActionMode;
                        } else {
/* 74 */                    int i = 1;
/* 75 */                    if (this.f18521g0 == null) {
/* 77 */                        boolean z = this.f18534t0;
/* 79 */                        Context context = this.f18510V;
/* 81 */                        if (z) {
/* 85 */                            TypedValue typedValue = new TypedValue();
/* 88 */                            Resources.Theme theme = context.getTheme();
/* 94 */                            theme.resolveAttribute(R$attr.actionBarTheme, typedValue, true);
/* 99 */                            if (typedValue.resourceId != 0) {
/* 105 */                               Resources.Theme themeNewTheme = context.getResources().newTheme();
/* 109 */                               themeNewTheme.setTo(theme);
/* 114 */                               themeNewTheme.applyStyle(typedValue.resourceId, true);
/* 119 */                               z00 z00Var = new z00(context, 0);
/* 126 */                               z00Var.getTheme().setTo(themeNewTheme);
/* 129 */                               context = z00Var;
                                    }
/* 135 */                           this.f18521g0 = new ActionBarContextView(context, null);
/* 141 */                           PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R$attr.actionModePopupWindowStyle);
/* 144 */                           this.f18522h0 = popupWindow;
/* 147 */                           qt1.m8014d(popupWindow, 2);
/* 154 */                           this.f18522h0.setContentView(this.f18521g0);
/* 160 */                           this.f18522h0.setWidth(-1);
/* 169 */                           context.getTheme().resolveAttribute(R$attr.actionBarSize, typedValue, true);
/* 188 */                           this.f18521g0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
/* 194 */                           this.f18522h0.setHeight(-2);
/* 202 */                           this.f18523i0 = new RunnableC1786ja(this, i);
                                } else {
/* 213 */                           ViewStubCompat viewStubCompat = (ViewStubCompat) this.f18526l0.findViewById(R$id.action_mode_bar_stub);
/* 215 */                           if (viewStubCompat != null) {
/* 217 */                               m9491A();
/* 220 */                               AbstractC2165s1 abstractC2165s2 = this.f18514Z;
/* 229 */                               Context contextMo8345e = abstractC2165s2 != null ? abstractC2165s2.mo8345e() : null;
/* 230 */                               if (contextMo8345e != null) {
/* 233 */                                   context = contextMo8345e;
                                        }
/* 238 */                               viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
/* 247 */                               this.f18521g0 = (ActionBarContextView) viewStubCompat.m417a();
                                    }
                                }
                            }
/* 251 */                   if (this.f18521g0 != null) {
/* 253 */                       p43 p43Var2 = this.f18524j0;
/* 255 */                       if (p43Var2 != null) {
/* 257 */                           p43Var2.m7336b();
                                }
/* 262 */                       this.f18521g0.m338e();
/* 269 */                       Context context2 = this.f18521g0.getContext();
/* 273 */                       ActionBarContextView actionBarContextView = this.f18521g0;
/* 275 */                       hg2 hg2Var = new hg2();
/* 278 */                       hg2Var.f9068c = context2;
/* 280 */                       hg2Var.f9069d = actionBarContextView;
/* 282 */                       hg2Var.f9070e = c0210cb;
/* 290 */                       jg1 jg1Var = new jg1(actionBarContextView.getContext());
/* 293 */                       jg1Var.f12267l = 1;
/* 295 */                       hg2Var.f9073v = jg1Var;
/* 297 */                       jg1Var.f12260e = hg2Var;
/* 307 */                       if (((InterfaceC1013i2) c0210cb.f2804b).mo1585f(hg2Var, jg1Var)) {
/* 309 */                           hg2Var.mo4216h();
/* 314 */                           this.f18521g0.m336c(hg2Var);
/* 317 */                           this.f18520f0 = hg2Var;
/* 335 */                           boolean z2 = this.f18525k0 && (viewGroup = this.f18526l0) != null && viewGroup.isLaidOut();
/* 336 */                           ActionBarContextView actionBarContextView2 = this.f18521g0;
/* 340 */                           if (z2) {
/* 343 */                               actionBarContextView2.setAlpha(0.0f);
/* 348 */                               p43 p43VarM3305a = e33.m3305a(this.f18521g0);
/* 352 */                               p43VarM3305a.m7335a(1.0f);
/* 355 */                               this.f18524j0 = p43VarM3305a;
/* 362 */                               p43VarM3305a.m7338d(new C1883la(this, i));
                                    } else {
/* 366 */                               actionBarContextView2.setAlpha(1.0f);
/* 371 */                               this.f18521g0.setVisibility(0);
/* 382 */                               if (this.f18521g0.getParent() instanceof View) {
/* 390 */                                   View view = (View) this.f18521g0.getParent();
/* 392 */                                   WeakHashMap weakHashMap = e33.f7494a;
/* 394 */                                   q23.m7679c(view);
                                        }
                                    }
/* 399 */                           if (this.f18522h0 != null) {
/* 409 */                               this.f18511W.getDecorView().post(this.f18523i0);
                                    }
                                } else {
/* 413 */                           this.f18520f0 = null;
                                }
                            }
                        }
/* 415 */               AbstractC1778j2 abstractC1778j4 = this.f18520f0;
/* 417 */               if (abstractC1778j4 != null) {
/* 419 */                   interfaceC0209ca.onSupportActionModeStarted(abstractC1778j4);
                        }
/* 422 */               m9499I();
/* 427 */               this.f18520f0 = this.f18520f0;
                    }
/* 429 */           m9499I();
/* 432 */           return this.f18520f0;
                }

                /* JADX WARN: Code duplicated, block: B:69:0x00f1  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: n */
                public final boolean m9500n(boolean z, boolean z2) throws IllegalAccessException {
                    int i;
                    boolean z3;
                    boolean z4;
                    boolean z5;
                    Object obj;
                    Object obj2;
                    LongSparseArray longSparseArray;
/* 5 */             int i2 = 0;
/* 6 */             if (this.f18492B0) {
/* 5 */                 return false;
                    }
/* 11 */            int i3 = this.f18494D0;
/* 13 */            if (i3 == -100) {
/* 16 */                i3 = AbstractC1021ia.f9503b;
                    }
/* 18 */            Context context = this.f18510V;
/* 20 */            int iM9493C = m9493C(context, i3);
/* 24 */            int i4 = Build.VERSION.SDK_INT;
/* 36 */            h91 h91VarM9489p = i4 < 33 ? m9489p(context) : null;
/* 37 */            if (!z2 && h91VarM9489p != null) {
/* 49 */                h91VarM9489p = AbstractC1957na.m6952b(context.getResources().getConfiguration());
                    }
/* 53 */            Configuration configurationM9490t = m9490t(context, iM9493C, h91VarM9489p, null, false);
/* 57 */            boolean z6 = this.f18497G0;
/* 60 */            Object obj3 = this.f18509U;
/* 62 */            if (z6 || !(obj3 instanceof Activity)) {
/* 107 */               this.f18497G0 = true;
/* 109 */               i = this.f18496F0;
                    } else {
/* 68 */                PackageManager packageManager = context.getPackageManager();
/* 72 */                if (packageManager == null) {
/* 74 */                    i = 0;
                        } else {
                            try {
/* 94 */                        ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i4 >= 29 ? 269221888 : 786432);
/* 98 */                        if (activityInfo != null) {
/* 102 */                           this.f18496F0 = activityInfo.configChanges;
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
/* 105 */                       this.f18496F0 = 0;
                            }
/* 107 */                   this.f18497G0 = true;
/* 109 */                   i = this.f18496F0;
                        }
                    }
/* 111 */           Configuration configuration = this.f18493C0;
/* 113 */           if (configuration == null) {
/* 119 */               configuration = context.getResources().getConfiguration();
                    }
/* 125 */           int i5 = configuration.uiMode & 48;
/* 129 */           int i6 = configurationM9490t.uiMode & 48;
/* 131 */           h91 h91VarM6952b = AbstractC1957na.m6952b(configuration);
/* 139 */           h91 h91VarM6952b2 = h91VarM9489p == null ? null : AbstractC1957na.m6952b(configurationM9490t);
/* 148 */           int i7 = i5 != i6 ? NotificationCompat.FLAG_GROUP_SUMMARY : 0;
/* 149 */           if (h91VarM6952b2 != null && !h91VarM6952b.equals(h91VarM6952b2)) {
/* 157 */               i7 |= 8196;
                    }
/* 163 */           if (((~i) & i7) != 0 && z && this.f18540z0 && ((f18490U0 || this.f18491A0) && (obj3 instanceof Activity))) {
/* 184 */               Activity activity = (Activity) obj3;
/* 190 */               if (activity.isChild()) {
/* 242 */                   z3 = false;
                        } else {
/* 192 */                   int i8 = Build.VERSION.SDK_INT;
/* 196 */                   if (i8 >= 31 && (i7 & Segment.SIZE) != 0) {
/* 214 */                       activity.getWindow().getDecorView().setLayoutDirection(configurationM9490t.getLayoutDirection());
                            }
/* 217 */                   if (i8 >= 28) {
/* 219 */                       activity.recreate();
                            } else {
/* 237 */                       new Handler(activity.getMainLooper()).post(new RunnableC2166s2(activity, i2));
                            }
/* 240 */                   z3 = true;
                        }
                    } else {
/* 242 */               z3 = false;
                    }
/* 243 */           if (z3 || i7 == 0) {
/* 546 */               z4 = z3;
                    } else {
/* 248 */               i2 = (i & i7) == i7 ? 1 : 0;
/* 251 */               Resources resources = context.getResources();
/* 261 */               Configuration configuration2 = new Configuration(resources.getConfiguration());
/* 273 */               configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
/* 275 */               if (h91VarM6952b2 != null) {
/* 277 */                   AbstractC1957na.m6954d(configuration2, h91VarM6952b2);
                        }
/* 281 */               resources.updateConfiguration(configuration2, null);
/* 284 */               int i9 = Build.VERSION.SDK_INT;
/* 288 */               if (i9 < 26 && i9 < 28) {
/* 298 */                   if (!he3.f9049q) {
                                try {
/* 304 */                           Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
/* 308 */                           he3.f9048p = declaredField;
/* 311 */                           declaredField.setAccessible(true);
                                } catch (NoSuchFieldException e) {
/* 319 */                           AbstractC1245n0.m4877e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                                }
/* 323 */                       he3.f9049q = true;
                            }
/* 325 */                   Field field = he3.f9048p;
/* 327 */                   if (field != null) {
                                try {
/* 331 */                           obj = field.get(resources);
                                } catch (IllegalAccessException e2) {
/* 340 */                           AbstractC1245n0.m4877e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
/* 343 */                           obj = null;
                                }
/* 344 */                       if (obj != null) {
/* 350 */                           if (!he3.f9043k) {
                                        try {
/* 358 */                                   Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
/* 362 */                                   he3.f9042j = declaredField2;
/* 365 */                                   declaredField2.setAccessible(true);
                                        } catch (NoSuchFieldException e3) {
/* 373 */                                   AbstractC1245n0.m4877e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                                        }
/* 377 */                               he3.f9043k = true;
                                    }
/* 379 */                           Field field2 = he3.f9042j;
/* 381 */                           if (field2 != null) {
                                        try {
/* 383 */                                   obj2 = field2.get(obj);
                                        } catch (IllegalAccessException e4) {
/* 392 */                                   AbstractC1245n0.m4877e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
/* 395 */                                   obj2 = null;
                                        }
                                    } else {
/* 395 */                               obj2 = null;
                                    }
/* 396 */                           if (obj2 != null) {
/* 400 */                               if (!he3.f9045m) {
                                            try {
/* 408 */                                       he3.f9044l = Class.forName("android.content.res.ThemedResourceCache");
                                            } catch (ClassNotFoundException e5) {
/* 415 */                                       AbstractC1245n0.m4877e("ResourcesFlusher", "Could not find ThemedResourceCache class", e5);
                                            }
/* 419 */                                   he3.f9045m = true;
                                        }
/* 421 */                               Class cls = he3.f9044l;
/* 423 */                               if (cls != null) {
/* 428 */                                   if (!he3.f9047o) {
                                                try {
/* 432 */                                           Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
/* 436 */                                           he3.f9046n = declaredField3;
/* 439 */                                           declaredField3.setAccessible(true);
                                                } catch (NoSuchFieldException e6) {
/* 447 */                                           AbstractC1245n0.m4877e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e6);
                                                }
/* 451 */                                       he3.f9047o = true;
                                            }
/* 453 */                                   Field field3 = he3.f9046n;
/* 455 */                                   if (field3 != null) {
                                                try {
/* 462 */                                           longSparseArray = (LongSparseArray) field3.get(obj2);
                                                } catch (IllegalAccessException e7) {
/* 469 */                                           AbstractC1245n0.m4877e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e7);
/* 472 */                                           longSparseArray = null;
                                                }
/* 473 */                                       if (longSparseArray != null) {
/* 475 */                                           longSparseArray.clear();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
/* 478 */               int i10 = this.f18495E0;
/* 480 */               if (i10 != 0) {
/* 482 */                   context.setTheme(i10);
/* 491 */                   z5 = true;
/* 492 */                   context.getTheme().applyStyle(this.f18495E0, true);
                        } else {
/* 496 */                   z5 = true;
                        }
/* 497 */               if (i2 != 0 && (obj3 instanceof Activity)) {
/* 504 */                   Activity activity2 = (Activity) obj3;
/* 508 */                   if (activity2 instanceof g71) {
/* 527 */                       if (((i71) ((g71) activity2).getLifecycle()).f9483c.compareTo(u61.f17376c) >= 0) {
/* 529 */                           activity2.onConfigurationChanged(configuration2);
                                }
                            } else if (this.f18491A0 && !this.f18492B0) {
/* 541 */                       activity2.onConfigurationChanged(configuration2);
                            }
                        }
/* 544 */               z4 = z5;
                    }
/* 547 */           if (z4 && (obj3 instanceof AppCompatActivity)) {
/* 555 */               if ((i7 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0) {
/* 560 */                   ((AppCompatActivity) obj3).onNightModeChanged(iM9493C);
                        }
/* 565 */               if ((i7 & 4) != 0) {
/* 569 */                   ((AppCompatActivity) obj3).onLocalesChanged(h91VarM9489p);
                        }
                    }
/* 572 */           if (h91VarM6952b2 != null) {
/* 586 */               AbstractC1957na.m6953c(AbstractC1957na.m6952b(context.getResources().getConfiguration()));
                    }
/* 589 */           if (i3 == 0) {
/* 595 */               m9509y(context).m8751q();
                    } else {
/* 599 */               C2137ra c2137ra = this.f18498H0;
/* 601 */               if (c2137ra != null) {
/* 603 */                   c2137ra.m8746d();
                        }
                    }
/* 606 */           C2137ra c2137ra2 = this.f18499I0;
/* 609 */           if (i3 == 3) {
/* 611 */               if (c2137ra2 == null) {
/* 618 */                   this.f18499I0 = new C2137ra(this, context);
                        }
/* 622 */               this.f18499I0.m8751q();
                    } else if (c2137ra2 != null) {
/* 628 */               c2137ra2.m8746d();
                    }
/* 631 */           return z4;
                }

                /* JADX WARN: Code duplicated, block: B:22:0x005a  */
                /* JADX INFO: renamed from: o */
                public final void m9501o(Window window) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher;
                    OnBackInvokedCallback onBackInvokedCallback;
/* 5 */             if (this.f18511W != null) {
/* 101 */               f42.m3656l("AppCompat has already installed itself into the Window");
/* 104 */               return;
                    }
/* 7 */             Window.Callback callback = window.getCallback();
/* 13 */            if (callback instanceof WindowCallbackC2100qa) {
/* 97 */                f42.m3656l("AppCompat has already installed itself into the Window");
/* 100 */               return;
                    }
/* 17 */            WindowCallbackC2100qa windowCallbackC2100qa = new WindowCallbackC2100qa(this, callback);
/* 20 */            this.f18512X = windowCallbackC2100qa;
/* 22 */            window.setCallback(windowCallbackC2100qa);
/* 30 */            ac1 ac1VarM155G = ac1.m155G(this.f18510V, null, f18489T0);
/* 35 */            Drawable drawableM185o = ac1VarM155G.m185o(0);
/* 39 */            if (drawableM185o != null) {
/* 41 */                window.setBackgroundDrawable(drawableM185o);
                    }
/* 44 */            ac1VarM155G.m168J();
/* 47 */            this.f18511W = window;
/* 53 */            if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f18507Q0) != null) {
/* 96 */                return;
                    }
/* 59 */            if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f18508R0) != null) {
/* 65 */                AbstractC2063pa.m7375c(onBackInvokedDispatcher, onBackInvokedCallback);
/* 68 */                this.f18508R0 = null;
                    }
/* 70 */            Object obj = this.f18509U;
/* 74 */            if (obj instanceof Activity) {
/* 76 */                Activity activity = (Activity) obj;
/* 82 */                if (activity.getWindow() != null) {
/* 88 */                    this.f18507Q0 = AbstractC2063pa.m7373a(activity);
                        } else {
/* 91 */                    this.f18507Q0 = null;
                        }
                    } else {
/* 91 */                this.f18507Q0 = null;
                    }
/* 93 */            m9499I();
                }

                @Override // android.view.LayoutInflater.Factory2
                public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
                    View appCompatRatingBar;
/* 3 */             View view2 = null;
/* 4 */             if (this.f18506P0 == null) {
/* 6 */                 int[] iArr = R$styleable.AppCompatTheme;
/* 8 */                 Context context2 = this.f18510V;
/* 10 */                TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
/* 16 */                String string = typedArrayObtainStyledAttributes.getString(R$styleable.AppCompatTheme_viewInflaterClass);
/* 20 */                typedArrayObtainStyledAttributes.recycle();
/* 23 */                if (string == null) {
/* 30 */                    this.f18506P0 = new C0839dc();
                        } else {
                            try {
/* 51 */                        this.f18506P0 = (C0839dc) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                            } catch (Throwable unused) {
/* 59 */                        this.f18506P0 = new C0839dc();
                            }
                        }
                    }
/* 61 */            C0839dc c0839dc = this.f18506P0;
/* 63 */            int i = v13.f17842a;
/* 65 */            c0839dc.getClass();
/* 71 */            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.View, 0, 0);
/* 77 */            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(R$styleable.View_theme, 0);
/* 81 */            typedArrayObtainStyledAttributes2.recycle();
/* 103 */           Context z00Var = (resourceId == 0 || ((context instanceof z00) && ((z00) context).f19888a == resourceId)) ? context : new z00(context, resourceId);
/* 104 */           str.getClass();
                    switch (str) {
                        case "RatingBar":
/* 369 */                   appCompatRatingBar = new AppCompatRatingBar(z00Var, attributeSet);
                            break;
                        case "CheckedTextView":
/* 363 */                   appCompatRatingBar = new AppCompatCheckedTextView(z00Var, attributeSet);
                            break;
                        case "MultiAutoCompleteTextView":
/* 357 */                   appCompatRatingBar = new AppCompatMultiAutoCompleteTextView(z00Var, attributeSet);
                            break;
                        case "TextView":
/* 350 */                   appCompatRatingBar = c0839dc.mo2425e(z00Var, attributeSet);
                            break;
                        case "ImageButton":
/* 346 */                   appCompatRatingBar = new AppCompatImageButton(z00Var, attributeSet);
                            break;
                        case "SeekBar":
/* 340 */                   appCompatRatingBar = new AppCompatSeekBar(z00Var, attributeSet);
                            break;
                        case "Spinner":
/* 334 */                   appCompatRatingBar = new AppCompatSpinner(z00Var, attributeSet);
                            break;
                        case "RadioButton":
/* 327 */                   appCompatRatingBar = c0839dc.mo2424d(z00Var, attributeSet);
                            break;
                        case "ToggleButton":
/* 323 */                   appCompatRatingBar = new AppCompatToggleButton(z00Var, attributeSet);
                            break;
                        case "ImageView":
/* 317 */                   appCompatRatingBar = new AppCompatImageView(z00Var, attributeSet);
                            break;
                        case "AutoCompleteTextView":
/* 310 */                   appCompatRatingBar = c0839dc.mo2421a(z00Var, attributeSet);
                            break;
                        case "CheckBox":
/* 305 */                   appCompatRatingBar = c0839dc.mo2423c(z00Var, attributeSet);
                            break;
                        case "EditText":
/* 301 */                   appCompatRatingBar = new AppCompatEditText(z00Var, attributeSet);
                            break;
                        case "Button":
/* 294 */                   appCompatRatingBar = c0839dc.mo2422b(z00Var, attributeSet);
                            break;
                        default:
/* 292 */                   appCompatRatingBar = null;
                            break;
                    }
/* 372 */           if (appCompatRatingBar == null && context != z00Var) {
/* 376 */               Object[] objArr = c0839dc.f7093a;
/* 384 */               if (str.equals("view")) {
/* 388 */                   str = attributeSet.getAttributeValue(null, "class");
                        }
                        try {
/* 392 */                   objArr[0] = z00Var;
/* 394 */                   objArr[1] = attributeSet;
/* 402 */                   if (-1 == str.indexOf(46)) {
/* 404 */                       int i2 = 0;
                                while (true) {
/* 405 */                           String[] strArr = C0839dc.f7091g;
/* 407 */                           if (i2 < 3) {
/* 411 */                               View viewM2984f = c0839dc.m2984f(z00Var, str, strArr[i2]);
/* 415 */                               if (viewM2984f != null) {
/* 417 */                                   objArr[0] = null;
/* 419 */                                   objArr[1] = null;
/* 421 */                                   view2 = viewM2984f;
                                        } else {
/* 423 */                                   i2++;
                                        }
                                    } else {
/* 429 */                               objArr[0] = null;
/* 431 */                               objArr[1] = null;
                                    }
                                }
                            } else {
/* 434 */                       View viewM2984f2 = c0839dc.m2984f(z00Var, str, null);
/* 438 */                       objArr[0] = null;
/* 440 */                       objArr[1] = null;
/* 442 */                       view2 = viewM2984f2;
                            }
                        } catch (Exception unused2) {
/* 449 */                   objArr[0] = null;
/* 451 */                   objArr[1] = null;
                        } catch (Throwable th) {
/* 444 */                   objArr[0] = null;
/* 446 */                   objArr[1] = null;
/* 448 */                   throw th;
                        }
/* 453 */               appCompatRatingBar = view2;
                    }
/* 454 */           if (appCompatRatingBar != null) {
/* 456 */               Context context3 = appCompatRatingBar.getContext();
/* 462 */               if ((context3 instanceof ContextWrapper) && appCompatRatingBar.hasOnClickListeners()) {
/* 473 */                   TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0839dc.f7087c);
/* 477 */                   String string2 = typedArrayObtainStyledAttributes3.getString(0);
/* 481 */                   if (string2 != null) {
/* 488 */                       appCompatRatingBar.setOnClickListener(new ViewOnClickListenerC0211cc(appCompatRatingBar, string2));
                            }
/* 491 */                   typedArrayObtainStyledAttributes3.recycle();
                        }
/* 498 */               if (Build.VERSION.SDK_INT <= 28) {
/* 503 */                   TypedArray typedArrayObtainStyledAttributes4 = z00Var.obtainStyledAttributes(attributeSet, C0839dc.f7088d);
/* 513 */                   if (typedArrayObtainStyledAttributes4.hasValue(0)) {
/* 515 */                       boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
/* 519 */                       WeakHashMap weakHashMap = e33.f7494a;
/* 533 */                       new o23(androidx.core.R$id.tag_accessibility_heading, Boolean.class, 0, 28, 3).m8129f(appCompatRatingBar, Boolean.valueOf(z));
                            }
/* 536 */                   typedArrayObtainStyledAttributes4.recycle();
/* 541 */                   TypedArray typedArrayObtainStyledAttributes5 = z00Var.obtainStyledAttributes(attributeSet, C0839dc.f7089e);
/* 549 */                   if (typedArrayObtainStyledAttributes5.hasValue(0)) {
/* 555 */                       e33.m3319o(appCompatRatingBar, typedArrayObtainStyledAttributes5.getString(0));
                            }
/* 558 */                   typedArrayObtainStyledAttributes5.recycle();
/* 563 */                   TypedArray typedArrayObtainStyledAttributes6 = z00Var.obtainStyledAttributes(attributeSet, C0839dc.f7090f);
/* 571 */                   if (typedArrayObtainStyledAttributes6.hasValue(0)) {
/* 573 */                       boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
/* 577 */                       WeakHashMap weakHashMap2 = e33.f7494a;
/* 591 */                       new o23(androidx.core.R$id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).m8129f(appCompatRatingBar, Boolean.valueOf(z2));
                            }
/* 594 */                   typedArrayObtainStyledAttributes6.recycle();
                        }
                    }
/* 597 */           return appCompatRatingBar;
                }

                /* JADX INFO: renamed from: q */
                public final void m9502q(int i, C2286va c2286va, jg1 jg1Var) {
/* 1 */             if (jg1Var == null) {
/* 3 */                 if (c2286va == null && i >= 0) {
/* 7 */                     C2286va[] c2286vaArr = this.f18537w0;
/* 10 */                    if (i < c2286vaArr.length) {
/* 12 */                        c2286va = c2286vaArr[i];
                            }
                        }
/* 14 */                if (c2286va != null) {
/* 16 */                    jg1Var = c2286va.f17937h;
                        }
                    }
/* 18 */            if ((c2286va == null || c2286va.f17942m) && !this.f18492B0) {
/* 29 */                WindowCallbackC2100qa windowCallbackC2100qa = this.f18512X;
/* 33 */                Window.Callback callback = this.f18511W.getCallback();
/* 37 */                windowCallbackC2100qa.getClass();
                        try {
/* 42 */                    windowCallbackC2100qa.f15458e = true;
/* 44 */                    callback.onPanelClosed(i, jg1Var);
                        } finally {
/* 51 */                    windowCallbackC2100qa.f15458e = false;
                        }
                    }
                }

                /* JADX INFO: renamed from: r */
                public final void m9503r(jg1 jg1Var) {
                    C0062b c0062b;
/* 3 */             if (this.f18536v0) {
/* 5 */                 return;
                    }
/* 7 */             this.f18536v0 = true;
/* 11 */            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f18517c0;
/* 13 */            actionBarOverlayLayout.m345e();
/* 22 */            ActionMenuView actionMenuView = ((C0073m) actionBarOverlayLayout.f439e).f762a.f696a;
/* 24 */            if (actionMenuView != null && (c0062b = actionMenuView.f461h0) != null) {
/* 30 */                c0062b.m424j();
/* 33 */                C0829d2 c0829d2 = c0062b.f749f0;
/* 35 */                if (c0829d2 != null && c0829d2.m10351b()) {
/* 45 */                    c0829d2.f20144i.dismiss();
                        }
                    }
/* 50 */            Window.Callback callback = this.f18511W.getCallback();
/* 54 */            if (callback != null && !this.f18492B0) {
/* 62 */                callback.onPanelClosed(108, jg1Var);
                    }
/* 66 */            this.f18536v0 = false;
                }

                /* JADX INFO: renamed from: s */
                public final void m9504s(C2286va c2286va, boolean z) {
                    C2248ua c2248ua;
                    m50 m50Var;
/* 1 */             if (z && c2286va.f17930a == 0 && (m50Var = this.f18517c0) != null) {
/* 11 */                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) m50Var;
/* 13 */                actionBarOverlayLayout.m345e();
/* 26 */                if (((C0073m) actionBarOverlayLayout.f439e).f762a.m409o()) {
/* 30 */                    m9503r(c2286va.f17937h);
/* 33 */                    return;
                        }
                    }
/* 42 */            WindowManager windowManager = (WindowManager) this.f18510V.getSystemService("window");
/* 45 */            if (windowManager != null && c2286va.f17942m && (c2248ua = c2286va.f17934e) != null) {
/* 55 */                windowManager.removeView(c2248ua);
/* 58 */                if (z) {
/* 62 */                    m9502q(c2286va.f17930a, c2286va, null);
                        }
                    }
/* 66 */            c2286va.f17940k = false;
/* 68 */            c2286va.f17941l = false;
/* 70 */            c2286va.f17942m = false;
/* 72 */            c2286va.f17935f = null;
/* 75 */            c2286va.f17943n = true;
/* 79 */            if (this.f18538x0 == c2286va) {
/* 81 */                this.f18538x0 = null;
                    }
/* 85 */            if (c2286va.f17930a == 0) {
/* 87 */                m9499I();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:21:0x003f  */
                /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:26:0x0050  */
                /* JADX WARN: Code duplicated, block: B:28:0x0056  */
                /* JADX WARN: Code duplicated, block: B:30:0x005e  */
                /* JADX WARN: Code duplicated, block: B:32:0x0062  */
                /* JADX WARN: Code duplicated, block: B:35:0x006b  */
                /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:41:0x0075  */
                /* JADX WARN: Code duplicated, block: B:44:0x007b  */
                /* JADX WARN: Code duplicated, block: B:46:0x0085  */
                /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
                /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
                /* JADX WARN: Code duplicated, block: B:85:0x011b  */
                /* JADX WARN: Code duplicated, block: B:87:0x0129  */
                /* JADX WARN: Code duplicated, block: B:89:0x012d  */
                /* JADX WARN: Code duplicated, block: B:91:0x0135  */
                /* JADX WARN: Code duplicated, block: B:94:0x013c A[RETURN] */
                /* JADX INFO: renamed from: u */
                public final boolean m9505u(KeyEvent keyEvent) {
                    View decorView;
                    int keyCode;
                    C2286va c2286vaM9510z;
                    m50 m50Var;
                    Context context;
                    boolean z;
                    boolean zM415u;
                    boolean zM9497G;
                    AudioManager audioManager;
                    Toolbar toolbar;
                    ActionMenuView actionMenuView;
                    C0062b c0062b;
                    C2286va c2286vaM9510z2;
/* 1 */             Object obj = this.f18509U;
/* 6 */             if ((!(obj instanceof l31) && !(obj instanceof DialogInterfaceC1991o7)) || (decorView = this.f18511W.getDecorView()) == null || !he3.m4184e(decorView, keyEvent)) {
/* 35 */                if (keyEvent.getKeyCode() == 82) {
/* 37 */                    WindowCallbackC2100qa windowCallbackC2100qa = this.f18512X;
/* 41 */                    Window.Callback callback = this.f18511W.getCallback();
/* 45 */                    windowCallbackC2100qa.getClass();
                            try {
/* 48 */                        windowCallbackC2100qa.f15457d = true;
/* 50 */                        boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
/* 54 */                        windowCallbackC2100qa.f15457d = false;
/* 56 */                        if (!zDispatchKeyEvent) {
/* 64 */                            keyCode = keyEvent.getKeyCode();
/* 73 */                            if (keyEvent.getAction() == 0) {
/* 75 */                                if (keyCode != 4) {
/* 109 */                                   this.f18539y0 = (keyEvent.getFlags() & 128) != 0;
/* 32 */                                    return false;
                                        }
/* 77 */                                if (keyCode == 82) {
/* 85 */                                    if (keyEvent.getRepeatCount() == 0) {
/* 87 */                                        c2286vaM9510z2 = m9510z(0);
/* 93 */                                        if (!c2286vaM9510z2.f17942m) {
/* 95 */                                            m9497G(c2286vaM9510z2, keyEvent);
/* 5 */                                             return true;
                                                }
                                            }
                                        }
/* 32 */                                return false;
                                    }
/* 112 */                           if (keyCode != 4) {
/* 114 */                               if (keyCode == 82) {
/* 120 */                                   if (this.f18520f0 == null) {
/* 124 */                                       c2286vaM9510z = m9510z(0);
/* 128 */                                       m50Var = this.f18517c0;
/* 130 */                                       context = this.f18510V;
/* 132 */                                       if (m50Var != null) {
/* 134 */                                           ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) m50Var;
/* 136 */                                           actionBarOverlayLayout.m345e();
/* 143 */                                           toolbar = ((C0073m) actionBarOverlayLayout.f439e).f762a;
/* 149 */                                           if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f696a) == null || !actionMenuView.f460g0 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
/* 244 */                                               z = c2286vaM9510z.f17942m;
/* 246 */                                               if (!z || c2286vaM9510z.f17941l) {
/* 278 */                                                   m9504s(c2286vaM9510z, true);
/* 281 */                                                   zM415u = z;
                                                        } else {
/* 255 */                                                   if (c2286vaM9510z.f17940k) {
/* 259 */                                                       if (c2286vaM9510z.f17944o) {
/* 261 */                                                           c2286vaM9510z.f17940k = false;
/* 263 */                                                           zM9497G = m9497G(c2286vaM9510z, keyEvent);
                                                                } else {
/* 268 */                                                           zM9497G = true;
                                                                }
/* 269 */                                                       if (zM9497G) {
/* 271 */                                                           m9495E(c2286vaM9510z, keyEvent);
/* 274 */                                                           zM415u = true;
                                                                }
                                                            }
/* 276 */                                                   zM415u = false;
                                                        }
                                                    } else {
/* 171 */                                               ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f18517c0;
/* 173 */                                               actionBarOverlayLayout2.m345e();
/* 186 */                                               if (((C0073m) actionBarOverlayLayout2.f439e).f762a.m409o()) {
/* 218 */                                                   ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f18517c0;
/* 220 */                                                   actionBarOverlayLayout3.m345e();
/* 229 */                                                   ActionMenuView actionMenuView2 = ((C0073m) actionBarOverlayLayout3.f439e).f762a.f696a;
/* 231 */                                                   if (actionMenuView2 != null && (c0062b = actionMenuView2.f461h0) != null && c0062b.m424j()) {
/* 274 */                                                       zM415u = true;
                                                            }
                                                        } else if (!this.f18492B0 && m9497G(c2286vaM9510z, keyEvent)) {
/* 200 */                                                   ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f18517c0;
/* 202 */                                                   actionBarOverlayLayout4.m345e();
/* 211 */                                                   zM415u = ((C0073m) actionBarOverlayLayout4.f439e).f762a.m415u();
                                                        }
/* 276 */                                               zM415u = false;
                                                    }
                                                } else {
/* 244 */                                           z = c2286vaM9510z.f17942m;
/* 246 */                                           if (z) {
                                                    }
/* 278 */                                           m9504s(c2286vaM9510z, true);
/* 281 */                                           zM415u = z;
                                                }
/* 282 */                                       if (zM415u) {
/* 294 */                                           audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
/* 296 */                                           if (audioManager != null) {
/* 298 */                                               audioManager.playSoundEffect(0);
/* 5 */                                                 return true;
                                                    }
/* 306 */                                           AbstractC1245n0.m4889q("AppCompatDelegate", "Couldn't get audio manager");
/* 5 */                                             return true;
                                                }
                                            }
                                        }
/* 32 */                                return false;
                                    }
/* 314 */                           if (m9494D()) {
/* 32 */                                return false;
                                    }
                                }
                            } catch (Throwable th) {
/* 61 */                        windowCallbackC2100qa.f15457d = false;
/* 63 */                        throw th;
                            }
                        } else {
/* 64 */                    keyCode = keyEvent.getKeyCode();
/* 73 */                    if (keyEvent.getAction() == 0) {
/* 75 */                        if (keyCode != 4) {
/* 109 */                           this.f18539y0 = (keyEvent.getFlags() & 128) != 0;
/* 32 */                            return false;
                                }
/* 77 */                        if (keyCode == 82) {
/* 85 */                            if (keyEvent.getRepeatCount() == 0) {
/* 87 */                                c2286vaM9510z2 = m9510z(0);
/* 93 */                                if (!c2286vaM9510z2.f17942m) {
/* 95 */                                    m9497G(c2286vaM9510z2, keyEvent);
/* 5 */                                     return true;
                                        }
                                    }
                                }
/* 32 */                        return false;
                            }
/* 112 */                   if (keyCode != 4) {
/* 114 */                       if (keyCode == 82) {
/* 120 */                           if (this.f18520f0 == null) {
/* 124 */                               c2286vaM9510z = m9510z(0);
/* 128 */                               m50Var = this.f18517c0;
/* 130 */                               context = this.f18510V;
/* 132 */                               if (m50Var != null) {
/* 134 */                                   ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) m50Var;
/* 136 */                                   actionBarOverlayLayout5.m345e();
/* 143 */                                   toolbar = ((C0073m) actionBarOverlayLayout5.f439e).f762a;
/* 149 */                                   if (toolbar.getVisibility() == 0) {
/* 244 */                                       z = c2286vaM9510z.f17942m;
/* 246 */                                       if (z) {
                                                }
/* 278 */                                       m9504s(c2286vaM9510z, true);
/* 281 */                                       zM415u = z;
                                            } else {
/* 244 */                                       z = c2286vaM9510z.f17942m;
/* 246 */                                       if (z) {
                                                }
/* 278 */                                       m9504s(c2286vaM9510z, true);
/* 281 */                                       zM415u = z;
                                            }
                                        } else {
/* 244 */                                   z = c2286vaM9510z.f17942m;
/* 246 */                                   if (z) {
                                            }
/* 278 */                                   m9504s(c2286vaM9510z, true);
/* 281 */                                   zM415u = z;
                                        }
/* 282 */                               if (zM415u) {
/* 294 */                                   audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
/* 296 */                                   if (audioManager != null) {
/* 298 */                                       audioManager.playSoundEffect(0);
/* 5 */                                         return true;
                                            }
/* 306 */                                   AbstractC1245n0.m4889q("AppCompatDelegate", "Couldn't get audio manager");
/* 5 */                                     return true;
                                        }
                                    }
                                }
/* 32 */                        return false;
                            }
/* 314 */                   if (m9494D()) {
/* 32 */                        return false;
                            }
                        }
                    }
/* 5 */             return true;
                }

                /* JADX INFO: renamed from: v */
                public final void m9506v(int i) {
/* 1 */             C2286va c2286vaM9510z = m9510z(i);
/* 7 */             if (c2286vaM9510z.f17937h != null) {
/* 11 */                Bundle bundle = new Bundle();
/* 16 */                c2286vaM9510z.f17937h.m5813u(bundle);
/* 23 */                if (bundle.size() > 0) {
/* 25 */                    c2286vaM9510z.f17945p = bundle;
                        }
/* 29 */                c2286vaM9510z.f17937h.m5817y();
/* 34 */                c2286vaM9510z.f17937h.clear();
                    }
/* 38 */            c2286vaM9510z.f17944o = true;
/* 40 */            c2286vaM9510z.f17943n = true;
/* 44 */            if ((i == 108 || i == 0) && this.f18517c0 != null) {
/* 53 */                C2286va c2286vaM9510z2 = m9510z(0);
/* 57 */                c2286vaM9510z2.f17940k = false;
/* 60 */                m9497G(c2286vaM9510z2, null);
                    }
                }

                /* JADX INFO: renamed from: w */
                public final void m9507w() {
                    ViewGroup viewGroup;
/* 3 */             if (this.f18525k0) {
/* 631 */               return;
                    }
/* 5 */             int[] iArr = R$styleable.AppCompatTheme;
/* 7 */             Context context = this.f18510V;
/* 9 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
/* 19 */            if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowActionBar)) {
/* 623 */               typedArrayObtainStyledAttributes.recycle();
/* 628 */               f42.m3656l("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
/* 631 */               return;
                    }
/* 31 */            if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowNoTitle, false)) {
/* 33 */                mo4504g(1);
                    } else if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionBar, false)) {
/* 45 */                mo4504g(108);
                    }
/* 56 */            if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionBarOverlay, false)) {
/* 58 */                mo4504g(109);
                    }
/* 67 */            if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionModeOverlay, false)) {
/* 71 */                mo4504g(10);
                    }
/* 80 */            this.f18534t0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_android_windowIsFloating, false);
/* 82 */            typedArrayObtainStyledAttributes.recycle();
/* 85 */            m9508x();
/* 90 */            this.f18511W.getDecorView();
/* 93 */            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
/* 100 */           if (this.f18535u0) {
/* 239 */               viewGroup = this.f18533s0 ? (ViewGroup) layoutInflaterFrom.inflate(R$layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(R$layout.abc_screen_simple, (ViewGroup) null);
                    } else if (this.f18534t0) {
/* 112 */               viewGroup = (ViewGroup) layoutInflaterFrom.inflate(R$layout.abc_dialog_title_material, (ViewGroup) null);
/* 114 */               this.f18532r0 = false;
/* 116 */               this.f18531q0 = false;
                    } else if (this.f18531q0) {
/* 126 */               TypedValue typedValue = new TypedValue();
/* 135 */               context.getTheme().resolveAttribute(R$attr.actionBarTheme, typedValue, true);
/* 161 */               viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new z00(context, typedValue.resourceId) : context).inflate(R$layout.abc_screen_toolbar, (ViewGroup) null);
/* 169 */               m50 m50Var = (m50) viewGroup.findViewById(R$id.decor_content_parent);
/* 171 */               this.f18517c0 = m50Var;
/* 179 */               m50Var.setWindowCallback(this.f18511W.getCallback());
/* 184 */               if (this.f18532r0) {
/* 190 */                   ((ActionBarOverlayLayout) this.f18517c0).m344d(109);
                        }
/* 195 */               if (this.f18529o0) {
/* 202 */                   ((ActionBarOverlayLayout) this.f18517c0).m344d(2);
                        }
/* 207 */               if (this.f18530p0) {
/* 214 */                   ((ActionBarOverlayLayout) this.f18517c0).m344d(5);
                        }
                    } else {
/* 218 */               viewGroup = null;
                    }
/* 241 */           if (viewGroup == null) {
/* 568 */               StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
/* 573 */               sb.append(this.f18531q0);
/* 578 */               sb.append(", windowActionBarOverlay: ");
/* 583 */               sb.append(this.f18532r0);
/* 588 */               sb.append(", android:windowIsFloating: ");
/* 593 */               sb.append(this.f18534t0);
/* 598 */               sb.append(", windowActionModeOverlay: ");
/* 603 */               sb.append(this.f18533s0);
/* 608 */               sb.append(", windowNoTitle: ");
/* 619 */               C1951n4.m6859j(AbstractC0886en.m3511o(sb, this.f18535u0, " }"));
/* 622 */               return;
                    }
/* 245 */           C1824ka c1824ka = new C1824ka(this);
/* 248 */           WeakHashMap weakHashMap = e33.f7494a;
/* 250 */           s23.m8383u(viewGroup, c1824ka);
/* 255 */           if (this.f18517c0 == null) {
/* 265 */               this.f18527m0 = (TextView) viewGroup.findViewById(R$id.title);
                    }
/* 267 */           boolean z = m53.f13568a;
                    try {
/* 275 */               Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
/* 283 */               if (!method.isAccessible()) {
/* 285 */                   method.setAccessible(true);
                        }
/* 288 */               method.invoke(viewGroup, null);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
/* 297 */           ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R$id.action_bar_activity_content);
/* 308 */           ViewGroup viewGroup2 = (ViewGroup) this.f18511W.findViewById(R.id.content);
/* 310 */           if (viewGroup2 != null) {
/* 316 */               while (viewGroup2.getChildCount() > 0) {
/* 318 */                   View childAt = viewGroup2.getChildAt(0);
/* 322 */                   viewGroup2.removeViewAt(0);
/* 325 */                   contentFrameLayout.addView(childAt);
                        }
/* 330 */               viewGroup2.setId(-1);
/* 333 */               contentFrameLayout.setId(R.id.content);
/* 338 */               if (viewGroup2 instanceof FrameLayout) {
/* 342 */                   ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
/* 347 */           this.f18511W.setContentView(viewGroup);
/* 355 */           contentFrameLayout.setAttachListener(new gr0(this));
/* 358 */           this.f18526l0 = viewGroup;
/* 360 */           Object obj = this.f18509U;
/* 373 */           CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f18516b0;
/* 379 */           if (!TextUtils.isEmpty(title)) {
/* 381 */               m50 m50Var2 = this.f18517c0;
/* 383 */               if (m50Var2 != null) {
/* 385 */                   m50Var2.setWindowTitle(title);
                        } else {
/* 389 */                   AbstractC2165s1 abstractC2165s1 = this.f18514Z;
/* 391 */                   if (abstractC2165s1 != null) {
/* 393 */                       abstractC2165s1.mo8359s(title);
                            } else {
/* 397 */                       TextView textView = this.f18527m0;
/* 399 */                       if (textView != null) {
/* 401 */                           textView.setText(title);
                                }
                            }
                        }
                    }
/* 410 */           ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f18526l0.findViewById(R.id.content);
/* 414 */           View decorView = this.f18511W.getDecorView();
/* 436 */           contentFrameLayout2.f550i.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
/* 443 */           if (contentFrameLayout2.isLaidOut()) {
/* 445 */               contentFrameLayout2.requestLayout();
                    }
/* 450 */           TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R$styleable.AppCompatTheme);
/* 460 */           typedArrayObtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
/* 469 */           typedArrayObtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
/* 478 */           if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.AppCompatTheme_windowFixedWidthMajor)) {
/* 486 */               typedArrayObtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
                    }
/* 495 */           if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.AppCompatTheme_windowFixedWidthMinor)) {
/* 503 */               typedArrayObtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
                    }
/* 512 */           if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.AppCompatTheme_windowFixedHeightMajor)) {
/* 520 */               typedArrayObtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
                    }
/* 529 */           if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.AppCompatTheme_windowFixedHeightMinor)) {
/* 537 */               typedArrayObtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
                    }
/* 540 */           typedArrayObtainStyledAttributes2.recycle();
/* 543 */           contentFrameLayout2.requestLayout();
/* 546 */           this.f18525k0 = true;
/* 548 */           C2286va c2286vaM9510z = m9510z(0);
/* 554 */           if (this.f18492B0 || c2286vaM9510z.f17937h != null) {
/* 631 */               return;
                    }
/* 560 */           m9492B(108);
                }

                /* JADX INFO: renamed from: x */
                public final void m9508x() {
/* 3 */             if (this.f18511W == null) {
/* 5 */                 Object obj = this.f18509U;
/* 9 */                 if (obj instanceof Activity) {
/* 17 */                    m9501o(((Activity) obj).getWindow());
                        }
                    }
/* 22 */            if (this.f18511W != null) {
/* 24 */                return;
                    }
/* 27 */            f42.m3656l("We have not been given a Window");
                }

                /* JADX INFO: renamed from: y */
                public final AbstractC2211ta m9509y(Context context) {
/* 3 */             if (this.f18498H0 == null) {
/* 9 */                 if (ac1.f174e == null) {
/* 11 */                    Context applicationContext = context.getApplicationContext();
/* 28 */                    ac1.f174e = new ac1(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
                        }
/* 35 */                this.f18498H0 = new C2137ra(this, ac1.f174e);
                    }
/* 37 */            return this.f18498H0;
                }

                /* JADX INFO: renamed from: z */
                public final C2286va m9510z(int i) {
/* 1 */             C2286va[] c2286vaArr = this.f18537w0;
/* 4 */             if (c2286vaArr == null || c2286vaArr.length <= i) {
/* 11 */                C2286va[] c2286vaArr2 = new C2286va[i + 1];
/* 13 */                if (c2286vaArr != null) {
/* 16 */                    System.arraycopy(c2286vaArr, 0, c2286vaArr2, 0, c2286vaArr.length);
                        }
/* 19 */                this.f18537w0 = c2286vaArr2;
/* 21 */                c2286vaArr = c2286vaArr2;
                    }
/* 22 */            C2286va c2286va = c2286vaArr[i];
/* 24 */            if (c2286va != null) {
/* 37 */                return c2286va;
                    }
/* 28 */            C2286va c2286va2 = new C2286va();
/* 31 */            c2286va2.f17930a = i;
/* 33 */            c2286va2.f17943n = false;
/* 35 */            c2286vaArr[i] = c2286va2;
/* 37 */            return c2286va2;
                }

                @Override // android.view.LayoutInflater.Factory
/* 598 */       public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
/* 599 */           return onCreateView(null, str, context, attributeSet);
                }
            }
