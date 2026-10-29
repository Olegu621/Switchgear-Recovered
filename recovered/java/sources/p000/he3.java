            package p000;

            import android.app.ActionBar;
            import android.app.Activity;
            import android.app.Dialog;
            import android.content.Context;
            import android.content.DialogInterface;
            import android.content.Intent;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.res.AssetManager;
            import android.graphics.Paint;
            import android.graphics.drawable.Drawable;
            import android.hardware.camera2.CameraCharacteristics;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.text.TextDirectionHeuristic;
            import android.text.TextDirectionHeuristics;
            import android.text.TextPaint;
            import android.text.method.PasswordTransformationMethod;
            import android.util.SparseArray;
            import android.view.ActionMode;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.Window;
            import android.webkit.ConsoleMessage;
            import android.widget.FrameLayout;
            import android.widget.LinearLayout;
            import android.widget.TextView;
            import androidx.appcompat.widget.AppCompatTextView;
            import androidx.core.R$id;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.common.Feature;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.helpshift.activities.HSMainActivity;
            import com.usercentrics.sdk.p008ui.PredefinedUIResponse;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.config.AbstractC1417a;
            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.DataInputStream;
            import java.io.DataOutputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.Field;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Map;
            import java.util.WeakHashMap;
            import java.util.concurrent.Executor;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class he3 {

                /* JADX INFO: renamed from: a */
                public static pi3 f9033a;

                /* JADX INFO: renamed from: b */
                public static final C2131r4 f9034b;

                /* JADX INFO: renamed from: c */
                public static final C2131r4 f9035c;

                /* JADX INFO: renamed from: d */
                public static final ec0 f9036d = new ec0(26);

                /* JADX INFO: renamed from: e */
                public static final Feature[] f9037e = {new Feature("games_load_player_force_reload", 1)};

                /* JADX INFO: renamed from: f */
                public static boolean f9038f;

                /* JADX INFO: renamed from: g */
                public static Method f9039g;

                /* JADX INFO: renamed from: h */
                public static boolean f9040h;

                /* JADX INFO: renamed from: i */
                public static Field f9041i;

                /* JADX INFO: renamed from: j */
                public static Field f9042j;

                /* JADX INFO: renamed from: k */
                public static boolean f9043k;

                /* JADX INFO: renamed from: l */
                public static Class f9044l;

                /* JADX INFO: renamed from: m */
                public static boolean f9045m;

                /* JADX INFO: renamed from: n */
                public static Field f9046n;

                /* JADX INFO: renamed from: o */
                public static boolean f9047o;

                /* JADX INFO: renamed from: p */
                public static Field f9048p;

                /* JADX INFO: renamed from: q */
                public static boolean f9049q;

                static {
/* 5 */             int i = 8;
/* 10 */            f9034b = new C2131r4("REMOVED_TASK", i);
/* 19 */            f9035c = new C2131r4("CLOSED_EMPTY", i);
                }

                /* JADX INFO: renamed from: A */
                public static Object m4179A(Bundle bundle, String str, Class cls, Object obj) {
/* 1 */             Object obj2 = bundle.get(str);
/* 5 */             if (obj2 == null) {
/* 7 */                 return obj;
                    }
/* 16 */            if (cls.isAssignableFrom(obj2.getClass())) {
/* 18 */                return obj2;
                    }
/* 19 */            String canonicalName = cls.getCanonicalName();
/* 47 */            f42.m3656l(fm0.m3789o(AbstractC0886en.m3514r("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
/* 50 */            return null;
                }

                /* JADX INFO: renamed from: a */
                public static void m4180a(StringBuilder sb, Object obj) {
                    int iLastIndexOf;
/* 1 */             if (obj == null) {
/* 5 */                 sb.append("null");
/* 8 */                 return;
                    }
/* 13 */            String simpleName = obj.getClass().getSimpleName();
/* 21 */            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
/* 41 */                simpleName = simpleName.substring(iLastIndexOf + 1);
                    }
/* 45 */            sb.append(simpleName);
/* 50 */            sb.append('{');
/* 61 */            sb.append(Integer.toHexString(System.identityHashCode(obj)));
                }

                /* JADX INFO: renamed from: b */
                public static Handler m4181b(Looper looper) {
/* 5 */             if (Build.VERSION.SDK_INT >= 28) {
/* 7 */                 return y60.m10108b(looper);
                    }
                    try {
/* 39 */                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e) {
/* 48 */                e = e;
/* 76 */                AbstractC1245n0.m4891s("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
/* 81 */                return new Handler(looper);
                    } catch (InstantiationException e2) {
/* 46 */                e = e2;
/* 76 */                AbstractC1245n0.m4891s("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
/* 81 */                return new Handler(looper);
                    } catch (NoSuchMethodException e3) {
/* 44 */                e = e3;
/* 76 */                AbstractC1245n0.m4891s("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
/* 81 */                return new Handler(looper);
                    } catch (InvocationTargetException e4) {
/* 50 */                Throwable cause = e4.getCause();
/* 56 */                if (cause instanceof RuntimeException) {
/* 71 */                    throw ((RuntimeException) cause);
                        }
/* 60 */                if (cause instanceof Error) {
/* 68 */                    throw ((Error) cause);
                        }
/* 62 */                ds0.m3199p(cause);
/* 12 */                return null;
                    }
                }

                /* JADX INFO: renamed from: c */
                public static w11 m4182c(int i) {
/* 1 */             if (i != 0) {
                        return i != 1 ? new g52() : new r30();
                    }
/* 20 */            return new g52();
                }

                /* JADX INFO: renamed from: d */
                public static String m4183d(C0816cq c0816cq, Integer num, List list) {
/* 2 */             if (num != null && list.contains("0") && list.contains("1")) {
/* 27 */                if (num.intValue() == 1) {
/* 45 */                    if (((Integer) c0816cq.m2831b("0").m3981a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
/* 13 */                        return "1";
                            }
                        } else if (num.intValue() == 0 && ((Integer) c0816cq.m2831b("1").m3981a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
/* 5 */                     return "0";
                        }
                    }
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: e */
                public static boolean m4184e(View view, KeyEvent keyEvent) {
                    ArrayList arrayList;
                    int size;
                    int iIndexOfKey;
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 7 */             if (Build.VERSION.SDK_INT >= 28) {
/* 150 */               return false;
                    }
/* 11 */            ArrayList arrayList2 = d33.f6968d;
/* 19 */            d33 d33Var = (d33) view.getTag(R$id.tag_unhandled_key_event_manager);
/* 21 */            WeakReference weakReference = null;
/* 22 */            if (d33Var == null) {
/* 26 */                d33Var = new d33();
/* 29 */                d33Var.f6969a = null;
/* 31 */                d33Var.f6970b = null;
/* 33 */                d33Var.f6971c = null;
/* 37 */                view.setTag(R$id.tag_unhandled_key_event_manager, d33Var);
                    }
/* 40 */            WeakReference weakReference2 = d33Var.f6971c;
/* 42 */            if (weakReference2 != null && weakReference2.get() == keyEvent) {
/* 150 */               return false;
                    }
/* 56 */            d33Var.f6971c = new WeakReference(keyEvent);
/* 60 */            if (d33Var.f6970b == null) {
/* 67 */                d33Var.f6970b = new SparseArray();
                    }
/* 69 */            SparseArray sparseArray = d33Var.f6970b;
/* 76 */            if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
/* 92 */                weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
/* 94 */                sparseArray.removeAt(iIndexOfKey);
                    }
/* 97 */            if (weakReference == null) {
/* 108 */               weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                    }
/* 110 */           if (weakReference == null) {
/* 150 */               return false;
                    }
/* 116 */           View view2 = (View) weakReference.get();
/* 118 */           if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R$id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
/* 75 */                return true;
                    }
/* 148 */           throw pm2.m7486i(size, arrayList);
                }

                /* JADX INFO: renamed from: f */
                public static boolean m4185f(l31 l31Var, View view, Window.Callback callback, KeyEvent keyEvent) {
                    DialogInterface.OnKeyListener onKeyListener;
/* 1 */             boolean zBooleanValue = false;
/* 2 */             if (l31Var != null) {
/* 10 */                if (Build.VERSION.SDK_INT >= 28) {
/* 12 */                    return l31Var.superDispatchKeyEvent(keyEvent);
                        }
/* 21 */                if (callback instanceof Activity) {
/* 23 */                    Activity activity = (Activity) callback;
/* 25 */                    activity.onUserInteraction();
/* 28 */                    Window window = activity.getWindow();
/* 38 */                    if (window.hasFeature(8)) {
/* 40 */                        ActionBar actionBar = activity.getActionBar();
/* 50 */                        if (keyEvent.getKeyCode() == 82 && actionBar != null) {
/* 56 */                            if (!f9038f) {
                                        try {
/* 74 */                                    f9039g = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                                        } catch (NoSuchMethodException unused) {
                                        }
/* 76 */                                f9038f = true;
                                    }
/* 78 */                            Method method = f9039g;
/* 80 */                            if (method != null) {
                                        try {
/* 86 */                                    Object objInvoke = method.invoke(actionBar, keyEvent);
/* 90 */                                    if (objInvoke != null) {
/* 95 */                                        zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                            }
                                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        }
                                    }
/* 99 */                            if (zBooleanValue) {
/* 20 */                                return true;
                                    }
                                }
                            }
/* 106 */                   if (window.superDispatchKeyEvent(keyEvent)) {
/* 20 */                        return true;
                            }
/* 109 */                   View decorView = window.getDecorView();
/* 117 */                   if (e33.m3307c(decorView, keyEvent)) {
/* 20 */                        return true;
                            }
/* 126 */                   return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
                        }
/* 133 */               if (callback instanceof Dialog) {
/* 135 */                   Dialog dialog = (Dialog) callback;
/* 139 */                   if (!f9040h) {
                                try {
/* 145 */                           Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
/* 149 */                           f9041i = declaredField;
/* 151 */                           declaredField.setAccessible(true);
                                } catch (NoSuchFieldException unused3) {
                                }
/* 154 */                       f9040h = true;
                            }
/* 156 */                   Field field = f9041i;
/* 158 */                   if (field != null) {
                                try {
/* 164 */                           onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                                } catch (IllegalAccessException unused4) {
/* 167 */                           onKeyListener = null;
                                }
                            } else {
/* 167 */                       onKeyListener = null;
                            }
/* 168 */                   if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
/* 20 */                        return true;
                            }
/* 181 */                   Window window2 = dialog.getWindow();
/* 189 */                   if (window2.superDispatchKeyEvent(keyEvent)) {
/* 20 */                        return true;
                            }
/* 192 */                   View decorView2 = window2.getDecorView();
/* 200 */                   if (e33.m3307c(decorView2, keyEvent)) {
/* 20 */                        return true;
                            }
/* 209 */                   return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                        }
/* 214 */               if ((view != null && e33.m3307c(view, keyEvent)) || l31Var.superDispatchKeyEvent(keyEvent)) {
/* 20 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: g */
                public static final o21 m4186g(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 6 */             if (serialDescriptor instanceof x00) {
/* 10 */                return ((x00) serialDescriptor).f18881b;
                    }
/* 15 */            if (serialDescriptor instanceof z92) {
/* 21 */                return m4186g(((z92) serialDescriptor).f20000a);
                    }
/* 26 */            return null;
                }

                /* JADX INFO: renamed from: h */
                public static st1 m4187h(AppCompatTextView appCompatTextView) {
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 5 */             if (i >= 28) {
/* 13 */                return new st1(mn2.m6713c(appCompatTextView));
                    }
/* 23 */            TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
/* 26 */            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
/* 28 */            int iM6144a = kn2.m6144a(appCompatTextView);
/* 32 */            int iM6147d = kn2.m6147d(appCompatTextView);
/* 42 */            if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
/* 44 */                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    } else if (i < 28 || (appCompatTextView.getInputType() & 15) != 3) {
/* 98 */                boolean z = appCompatTextView.getLayoutDirection() == 1;
                        switch (appCompatTextView.getTextDirection()) {
                            case 2:
/* 126 */                       textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                                break;
                            case 3:
/* 123 */                       textDirectionHeuristic = TextDirectionHeuristics.LTR;
                                break;
                            case 4:
/* 120 */                       textDirectionHeuristic = TextDirectionHeuristics.RTL;
                                break;
                            case 5:
/* 117 */                       textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                                break;
                            case 6:
                                break;
                            case 7:
/* 114 */                       textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                                break;
                            default:
/* 109 */                       if (z) {
/* 111 */                           textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                                }
                                break;
                        }
                    } else {
/* 78 */                byte directionality = Character.getDirectionality(mn2.m6712b(ln2.m6513a(appCompatTextView.getTextLocale()))[0].codePointAt(0));
/* 91 */                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                    }
/* 130 */           return new st1(textPaint, textDirectionHeuristic, iM6144a, iM6147d);
                }

                /* JADX INFO: renamed from: i */
                public static void m4188i(ConsoleMessage.MessageLevel messageLevel, String str, String str2) {
/* 2 */             if (messageLevel == null) {
/* 4 */                 xe2.m9775m(str, str2, null);
/* 7 */                 return;
                    }
/* 14 */            int i = j73.f12133a[messageLevel.ordinal()];
/* 17 */            if (i == 1) {
/* 35 */                xe2.m9777o(str, str2, null);
/* 38 */                return;
                    }
/* 20 */            if (i != 2) {
/* 22 */                xe2.m9775m(str, str2, null);
/* 25 */                return;
                    }
/* 26 */            zr3 zr3Var = xe2.f19065h;
/* 28 */            if (zr3Var == null) {
/* 30 */                return;
                    }
/* 31 */            zr3Var.m10434j(2, str, str2, null);
                }

                /* JADX INFO: renamed from: j */
                public static void m4189j(PackageInfo packageInfo, File file) {
/* 5 */             File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                    try {
/* 19 */                DataOutputStream dataOutputStream = new DataOutputStream(AbstractC1417a.m5167e(new FileOutputStream(file2), file2));
                        try {
/* 24 */                    dataOutputStream.writeLong(packageInfo.lastUpdateTime);
/* 27 */                    dataOutputStream.close();
                        } catch (Throwable th) {
                            try {
/* 32 */                        dataOutputStream.close();
                            } catch (Throwable th2) {
/* 37 */                        th.addSuppressed(th2);
                            }
/* 40 */                    throw th;
                        }
                    } catch (IOException unused) {
                    }
                }

                /* JADX INFO: renamed from: m */
                public static void m4190m(ViewGroup viewGroup, float f) {
/* 1 */             Drawable background = viewGroup.getBackground();
/* 7 */             if (background instanceof fd1) {
/* 11 */                ((fd1) background).m3741m(f);
                    }
                }

                /* JADX INFO: renamed from: n */
                public static void m4191n(TextView textView, int i) {
/* 1 */             de3.m3026h(i);
/* 8 */             if (Build.VERSION.SDK_INT >= 28) {
/* 10 */                mn2.m6714d(textView, i);
/* 13 */                return;
                    }
/* 18 */            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
/* 31 */            int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
/* 37 */            if (i > Math.abs(i2)) {
/* 52 */                textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
                    }
                }

                /* JADX INFO: renamed from: o */
                public static void m4192o(TextView textView, int i) {
/* 1 */             de3.m3026h(i);
/* 8 */             Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
/* 21 */            int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
/* 27 */            if (i > Math.abs(i2)) {
/* 42 */                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
                    }
                }

                /* JADX INFO: renamed from: p */
                public static void m4193p(View view) {
/* 1 */             if (view == null) {
/* 3 */                 return;
                    }
/* 4 */             ViewParent parent = view.getParent();
/* 11 */            if (parent instanceof FrameLayout) {
/* 18 */                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    } else if (parent instanceof LinearLayout) {
/* 31 */                view.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    }
/* 34 */            Object parent2 = view.getParent();
/* 46 */            m4193p(parent2 instanceof View ? (View) parent2 : null);
                }

                /* JADX INFO: renamed from: q */
                public static void m4194q(TextView textView, int i) {
/* 1 */             de3.m3026h(i);
/* 9 */             int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
/* 13 */            if (i != fontMetricsInt) {
/* 19 */                textView.setLineSpacing(i - fontMetricsInt, 1.0f);
                    }
                }

                /* JADX INFO: renamed from: r */
                public static void m4195r(View view, fd1 fd1Var) {
/* 3 */             ic0 ic0Var = fd1Var.f8151a.f7636b;
/* 5 */             if (ic0Var == null || !ic0Var.f9539a) {
/* 48 */                return;
                    }
/* 15 */            float fM8371i = 0.0f;
/* 18 */            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
/* 23 */                WeakHashMap weakHashMap = e33.f7494a;
/* 29 */                fM8371i += s23.m8371i((View) parent);
                    }
/* 35 */            ed1 ed1Var = fd1Var.f8151a;
/* 41 */            if (ed1Var.f7646l != fM8371i) {
/* 43 */                ed1Var.f7646l = fM8371i;
/* 45 */                fd1Var.m3750v();
                    }
                }

                /* JADX INFO: renamed from: s */
                public static void m4196s(ViewGroup viewGroup) {
/* 1 */             Drawable background = viewGroup.getBackground();
/* 7 */             if (background instanceof fd1) {
/* 11 */                m4195r(viewGroup, (fd1) background);
                    }
                }

                /* JADX INFO: renamed from: t */
                public static void m4197t(HSMainActivity hSMainActivity) {
                    Intent launchIntentForPackage;
/* 1 */             String packageName = hSMainActivity.getPackageName();
                    try {
/* 9 */                 launchIntentForPackage = hSMainActivity.getPackageManager().getLaunchIntentForPackage(packageName);
                    } catch (Exception e) {
/* 31 */                xe2.m9777o("AppUtil", "Error getting launch activity for package : " + packageName, e);
/* 34 */                launchIntentForPackage = null;
                    }
/* 35 */            if (launchIntentForPackage != null) {
/* 37 */                hSMainActivity.startActivity(launchIntentForPackage);
                    }
/* 40 */            hSMainActivity.finish();
                }

                /* JADX INFO: renamed from: u */
                public static final nz2 m4198u(PredefinedUIResponse predefinedUIResponse) {
                    f13 f13Var;
/* 3 */             av1 av1Var = predefinedUIResponse.f6233a;
/* 5 */             av1Var.getClass();
/* 8 */             int iOrdinal = av1Var.ordinal();
/* 12 */            if (iOrdinal == 0) {
/* 37 */                f13Var = f13.f7967a;
                    } else if (iOrdinal == 1) {
/* 34 */                f13Var = f13.f7968b;
                    } else if (iOrdinal == 2) {
/* 31 */                f13Var = f13.f7969c;
                    } else {
/* 21 */                if (iOrdinal != 3) {
/* 26 */                    ds0.m3187b();
/* 29 */                    return null;
                        }
/* 23 */                f13Var = f13.f7970d;
                    }
/* 43 */            return new nz2(f13Var, predefinedUIResponse.f6234b, predefinedUIResponse.f6235c);
                }

                /* JADX INFO: renamed from: v */
                public static void m4199v(AbstractC1812k abstractC1812k, gf0 gf0Var) {
                    ve1 ve1Var;
/* 1 */             Map map = gf0Var.f8577a;
/* 3 */             u21[] u21VarArr = gf0.f8576g;
/* 18 */            ht1 ht1VarM6974a = nf2.m6974a((String) mc1.m6638a(map, u21VarArr[0].getName()));
/* 35 */            String str = (String) mc1.m6638a(gf0Var.f8578b, u21VarArr[3].getName());
/* 37 */            if (str == null) {
/* 39 */                if (ht1VarM6974a != null) {
/* 43 */                    qa2 qa2Var = (qa2) ht1VarM6974a.f16749a;
/* 47 */                    if (qa2Var.f15463c == null) {
/* 50 */                        int i = k50.f12587b;
/* 56 */                        AbstractC1245n0.m4876d("ht1", "Recreating tracker instance after it was removed. This will not be supported in future versions.");
                            }
/* 63 */                    qa2Var.m7750d().m9121c(abstractC1812k);
/* 66 */                    return;
                        }
/* 145 */               return;
                    }
/* 93 */            vf1 vf1Var = (ht1VarM6974a == null || (ve1Var = (ve1) ((qa2) ht1VarM6974a.f16749a).f15469i.getValue()) == null) ? null : (vf1) ve1Var.f18022b.get(str);
/* 94 */            if (vf1Var != null) {
/* 102 */               jf1 jf1Var = (jf1) gf0Var.f8580d.getValue();
/* 111 */               if1 if1VarM5800a = jf1Var != null ? jf1Var.m5800a() : null;
/* 118 */               ae1 ae1Var = (ae1) gf0Var.f8581e.getValue();
/* 127 */               zd1 zd1VarM210a = ae1Var != null ? ae1Var.m210a() : null;
/* 134 */               ud1 ud1Var = (ud1) gf0Var.f8582f.getValue();
/* 142 */               vf1Var.m9263c(abstractC1812k, if1VarM5800a, zd1VarM210a, ud1Var != null ? ud1Var.m9004a() : null);
                    }
                }

                /* JADX INFO: renamed from: w */
                public static ActionMode.Callback m4200w(ActionMode.Callback callback) {
                    return (!(callback instanceof on2) || Build.VERSION.SDK_INT < 26) ? callback : ((on2) callback).f14842a;
                }

                /* JADX INFO: renamed from: x */
                public static ActionMode.Callback m4201x(ActionMode.Callback callback, TextView textView) {
/* 1 */             int i = Build.VERSION.SDK_INT;
                    return (i < 26 || i > 27 || (callback instanceof on2) || callback == null) ? callback : new on2(callback, textView);
                }

                /* JADX WARN: Code duplicated, block: B:105:0x0169 A[Catch: all -> 0x0166, TRY_ENTER, TryCatch #1 {all -> 0x0166, blocks: (B:92:0x0145, B:94:0x0151, B:105:0x0169, B:106:0x016e), top: B:221:0x0145 }] */
                /* JADX WARN: Code duplicated, block: B:112:0x0178 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:113:0x017a A[Catch: IllegalStateException -> 0x0160, IOException -> 0x0162, FileNotFoundException -> 0x0164, TRY_LEAVE, TryCatch #27 {FileNotFoundException -> 0x0164, IOException -> 0x0162, IllegalStateException -> 0x0160, blocks: (B:90:0x013d, B:95:0x015b, B:113:0x017a, B:111:0x0177, B:110:0x0174), top: B:260:0x013d }] */
                /* JADX WARN: Code duplicated, block: B:120:0x0190  */
                /* JADX WARN: Code duplicated, block: B:130:0x01ba A[Catch: all -> 0x01c8, TRY_LEAVE, TryCatch #22 {all -> 0x01c8, blocks: (B:128:0x01ae, B:130:0x01ba, B:139:0x01cb), top: B:243:0x01ae }] */
                /* JADX WARN: Code duplicated, block: B:139:0x01cb A[Catch: all -> 0x01c8, TRY_ENTER, TRY_LEAVE, TryCatch #22 {all -> 0x01c8, blocks: (B:128:0x01ae, B:130:0x01ba, B:139:0x01cb), top: B:243:0x01ae }] */
                /* JADX WARN: Code duplicated, block: B:150:0x01e8  */
                /* JADX WARN: Code duplicated, block: B:154:0x01f2  */
                /* JADX WARN: Code duplicated, block: B:155:0x01f6  */
                /* JADX WARN: Code duplicated, block: B:163:0x0216 A[Catch: all -> 0x0238, TRY_LEAVE, TryCatch #16 {all -> 0x0238, blocks: (B:160:0x020e, B:161:0x0210, B:163:0x0216), top: B:231:0x020e }] */
                /* JADX WARN: Code duplicated, block: B:204:0x0265  */
                /* JADX WARN: Code duplicated, block: B:207:0x026e  */
                /* JADX WARN: Code duplicated, block: B:212:0x0279 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:214:0x027d  */
                /* JADX WARN: Code duplicated, block: B:221:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:254:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:258:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:260:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:261:0x021b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:94:0x0151 A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #1 {all -> 0x0166, blocks: (B:92:0x0145, B:94:0x0151, B:105:0x0169, B:106:0x016e), top: B:221:0x0145 }] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: y */
                public static void m4202y(Context context, Executor executor, ay1 ay1Var, boolean z) {
                    char c;
                    FileInputStream fileInputStreamM3773b;
                    h80[] h80VarArrM7441t;
                    ay1 ay1Var2;
                    h80[] h80VarArr;
                    byte[] bArr;
                    byte[] bArr2;
                    boolean z2;
                    ByteArrayInputStream byteArrayInputStream;
                    FileOutputStream fileOutputStreamM5167e;
                    Throwable th;
                    byte[] bArr3;
                    int i;
                    ByteArrayOutputStream byteArrayOutputStream;
                    int i2;
                    C0922fm c0922fm;
                    FileInputStream fileInputStreamM3773b2;
                    boolean z3;
                    boolean z4;
/* 5 */             Context applicationContext = context.getApplicationContext();
/* 9 */             String packageName = applicationContext.getPackageName();
/* 13 */            ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
/* 17 */            AssetManager assets = applicationContext.getAssets();
/* 28 */            String name = new File(applicationInfo.sourceDir).getName();
                    try {
/* 38 */                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
/* 42 */                File filesDir = context.getFilesDir();
/* 47 */                if (!z) {
/* 53 */                    File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
/* 60 */                    if (file.exists()) {
                                try {
/* 75 */                            DataInputStream dataInputStream = new DataInputStream(AbstractC1417a.m5164b(file, new FileInputStream(file)));
                                    try {
/* 78 */                                long j = dataInputStream.readLong();
/* 82 */                                dataInputStream.close();
/* 95 */                                z4 = j == packageInfo.lastUpdateTime;
/* 96 */                                if (z4) {
/* 99 */                                    ay1Var.mo1180f(2, null);
                                        }
                                    } catch (Throwable th2) {
                                        try {
/* 105 */                                   dataInputStream.close();
/* 113 */                                   throw th2;
                                        } catch (Throwable th3) {
/* 110 */                                   th2.addSuppressed(th3);
/* 113 */                                   throw th2;
                                        }
                                    }
                                } catch (IOException unused) {
/* 62 */                            z4 = false;
                                }
                            } else {
/* 62 */                        z4 = false;
                            }
/* 114 */                   if (z4) {
/* 117 */                       context.getPackageName();
/* 120 */                       gy1.m4042c(context, false);
/* 642 */                       return;
                            }
                        }
/* 125 */               context.getPackageName();
/* 128 */               byte[] bArr4 = pg3.f15115b;
/* 141 */               File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
/* 151 */               C0922fm c0922fm2 = new C0922fm(assets, executor, ay1Var, name, file2);
/* 156 */               byte[] bArr5 = (byte[]) c0922fm2.f8277e;
/* 158 */               if (bArr5 == null) {
/* 167 */                   c0922fm2.m3774c(3, Integer.valueOf(Build.VERSION.SDK_INT));
                        } else {
                            try {
                                try {
/* 178 */                           if (file2.exists()) {
/* 184 */                               if (!file2.canWrite()) {
/* 186 */                                   c0922fm2.m3774c(4, null);
                                        }
/* 632 */                               if (z2 || !z) {
/* 638 */                                   z3 = 0;
                                        } else {
/* 636 */                                   z3 = c;
                                        }
/* 639 */                               gy1.m4042c(context, z3);
                                    }
                                    try {
/* 192 */                               file2.createNewFile();
                                    } catch (IOException unused2) {
/* 627 */                               c = 1;
/* 628 */                               c0922fm2.m3774c(4, null);
/* 631 */                               z2 = false;
                                    }
/* 199 */                           fileInputStreamM3773b = c0922fm2.m3773b(assets, "dexopt/baseline.prof");
                                } catch (FileNotFoundException e) {
/* 211 */                           ay1Var.mo1180f(6, e);
/* 214 */                           fileInputStreamM3773b = null;
                                } catch (IOException e2) {
/* 206 */                           ay1Var.mo1180f(7, e2);
/* 214 */                           fileInputStreamM3773b = null;
                                }
/* 219 */                       if (fileInputStreamM3773b != null) {
                                    try {
/* 229 */                               if (!Arrays.equals(bArr4, jb1.m5763w(fileInputStreamM3773b, 4))) {
/* 262 */                                   throw new IllegalStateException("Invalid magic");
                                        }
/* 237 */                               h80VarArrM7441t = pg3.m7441t(fileInputStreamM3773b, jb1.m5763w(fileInputStreamM3773b, 4), c0922fm2.f8273a);
                                        try {
/* 241 */                                   fileInputStreamM3773b.close();
                                        } catch (IOException e3) {
/* 246 */                                   ay1Var.mo1180f(7, e3);
                                        }
/* 280 */                               c0922fm2.f8279g = h80VarArrM7441t;
                                    } catch (IOException e4) {
/* 275 */                               ay1Var.mo1180f(7, e4);
                                        try {
/* 266 */                                   fileInputStreamM3773b.close();
                                        } catch (IOException e5) {
/* 271 */                                   ay1Var.mo1180f(7, e5);
                                        }
/* 279 */                               h80VarArrM7441t = null;
                                    } catch (IllegalStateException e6) {
/* 263 */                               ay1Var.mo1180f(8, e6);
/* 266 */                               fileInputStreamM3773b.close();
/* 279 */                               h80VarArrM7441t = null;
                                    }
                                }
/* 294 */                       h80[] h80VarArr2 = (h80[]) c0922fm2.f8279g;
/* 296 */                       if (h80VarArr2 != null && (i2 = Build.VERSION.SDK_INT) <= 34) {
/* 308 */                           if (i2 == 24 || i2 == 25) {
                                        try {
/* 320 */                                   fileInputStreamM3773b2 = c0922fm2.m3773b(assets, "dexopt/baseline.profm");
/* 324 */                                   if (fileInputStreamM3773b2 == null) {
                                                try {
/* 336 */                                           if (Arrays.equals(pg3.f15116c, jb1.m5763w(fileInputStreamM3773b2, 4))) {
/* 367 */                                               throw new IllegalStateException("Invalid magic");
                                                    }
/* 346 */                                           c0922fm2.f8279g = pg3.m7438q(fileInputStreamM3773b2, jb1.m5763w(fileInputStreamM3773b2, 4), bArr5, h80VarArr2);
/* 348 */                                           fileInputStreamM3773b2.close();
/* 351 */                                           c0922fm = c0922fm2;
                                                } catch (Throwable th4) {
                                                    try {
/* 368 */                                               fileInputStreamM3773b2.close();
/* 376 */                                               throw th4;
                                                    } catch (Throwable th5) {
/* 373 */                                               th4.addSuppressed(th5);
/* 376 */                                               throw th4;
                                                    }
                                                }
                                            } else {
/* 377 */                                       if (fileInputStreamM3773b2 != null) {
/* 379 */                                           fileInputStreamM3773b2.close();
                                                }
/* 398 */                                       c0922fm = null;
                                            }
                                        } catch (FileNotFoundException e7) {
/* 395 */                                   ay1Var.mo1180f(9, e7);
                                        } catch (IOException e8) {
/* 389 */                                   ay1Var.mo1180f(7, e8);
                                        } catch (IllegalStateException e9) {
/* 383 */                                   c0922fm2.f8279g = null;
/* 385 */                                   ay1Var.mo1180f(8, e9);
                                        }
/* 399 */                               if (c0922fm != null) {
/* 401 */                                   c0922fm2 = c0922fm;
                                        }
                                    } else {
                                        switch (i2) {
                                            case io.flutter.Build.API_LEVELS.API_31 /* 31 */:
                                            case 32:
                                            case io.flutter.Build.API_LEVELS.API_33 /* 33 */:
                                            case io.flutter.Build.API_LEVELS.API_34 /* 34 */:
/* 320 */                                       fileInputStreamM3773b2 = c0922fm2.m3773b(assets, "dexopt/baseline.profm");
/* 324 */                                       if (fileInputStreamM3773b2 == null) {
/* 377 */                                           if (fileInputStreamM3773b2 != null) {
/* 379 */                                               fileInputStreamM3773b2.close();
                                                    }
/* 398 */                                           c0922fm = null;
                                                } else {
/* 336 */                                           if (Arrays.equals(pg3.f15116c, jb1.m5763w(fileInputStreamM3773b2, 4))) {
/* 367 */                                               throw new IllegalStateException("Invalid magic");
                                                    }
/* 346 */                                           c0922fm2.f8279g = pg3.m7438q(fileInputStreamM3773b2, jb1.m5763w(fileInputStreamM3773b2, 4), bArr5, h80VarArr2);
/* 348 */                                           fileInputStreamM3773b2.close();
/* 351 */                                           c0922fm = c0922fm2;
                                                }
/* 399 */                                       if (c0922fm != null) {
/* 401 */                                           c0922fm2 = c0922fm;
                                                    break;
                                                }
                                            default:
/* 405 */                                       ay1Var2 = (ay1) c0922fm2.f8276d;
/* 409 */                                       h80VarArr = (h80[]) c0922fm2.f8279g;
/* 413 */                                       bArr = (byte[]) c0922fm2.f8277e;
/* 417 */                                       if (h80VarArr != null && bArr != null) {
/* 424 */                                           if (c0922fm2.f8274b) {
/* 489 */                                               f42.m3656l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
/* 492 */                                               return;
                                                    }
                                                    try {
/* 428 */                                               byteArrayOutputStream = new ByteArrayOutputStream();
                                                        try {
/* 431 */                                                   byteArrayOutputStream.write(bArr4);
/* 434 */                                                   byteArrayOutputStream.write(bArr);
/* 441 */                                                   if (pg3.m7418B(byteArrayOutputStream, bArr, h80VarArr)) {
/* 464 */                                                       c0922fm2.f8280h = byteArrayOutputStream.toByteArray();
/* 466 */                                                       byteArrayOutputStream.close();
/* 486 */                                                       c0922fm2.f8279g = null;
                                                            } else {
/* 444 */                                                       ay1Var2.mo1180f(5, null);
/* 447 */                                                       c0922fm2.f8279g = null;
/* 449 */                                                       byteArrayOutputStream.close();
                                                            }
                                                        } catch (Throwable th6) {
                                                            try {
/* 470 */                                                       byteArrayOutputStream.close();
/* 478 */                                                       throw th6;
                                                            } catch (Throwable th7) {
/* 475 */                                                       th6.addSuppressed(th7);
/* 478 */                                                       throw th6;
                                                            }
                                                        }
                                                    } catch (IOException e10) {
/* 483 */                                               ay1Var2.mo1180f(7, e10);
                                                    } catch (IllegalStateException e11) {
/* 479 */                                               ay1Var2.mo1180f(8, e11);
                                                    }
                                                }
/* 495 */                                       bArr2 = (byte[]) c0922fm2.f8280h;
/* 497 */                                       if (bArr2 != null) {
/* 499 */                                           z2 = false;
/* 500 */                                           c = 1;
                                                } else {
                                                    try {
/* 505 */                                               if (c0922fm2.f8274b) {
/* 623 */                                                   f42.m3656l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
/* 626 */                                                   return;
                                                        }
                                                        try {
                                                            try {
/* 509 */                                                       byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                                try {
/* 516 */                                                           File file3 = (File) c0922fm2.f8278f;
/* 521 */                                                           fileOutputStreamM5167e = AbstractC1417a.m5167e(new FileOutputStream(file3), file3);
                                                                    try {
                                                                        try {
/* 527 */                                                                   bArr3 = new byte[NotificationCompat.FLAG_GROUP_SUMMARY];
                                                                            while (true) {
/* 529 */                                                                       i = byteArrayInputStream.read(bArr3);
/* 533 */                                                                       if (i > 0) {
/* 536 */                                                                           fileOutputStreamM5167e.write(bArr3, 0, i);
                                                                                } else {
/* 540 */                                                                           c = 1;
                                                                                    try {
/* 541 */                                                                               c0922fm2.m3774c(1, null);
/* 544 */                                                                               fileOutputStreamM5167e.close();
/* 547 */                                                                               byteArrayInputStream.close();
/* 550 */                                                                               c0922fm2.f8280h = null;
/* 552 */                                                                               c0922fm2.f8279g = null;
/* 554 */                                                                               z2 = true;
                                                                                    } catch (Throwable th8) {
/* 566 */                                                                               th = th8;
                                                                                    }
                                                                                }
/* 567 */                                                                       th = th;
                                                                                try {
/* 572 */                                                                           fileOutputStreamM5167e.close();
/* 580 */                                                                           throw th;
                                                                                } catch (Throwable th9) {
/* 577 */                                                                           th.addSuppressed(th9);
/* 580 */                                                                           throw th;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th10) {
/* 563 */                                                                   th = th10;
/* 564 */                                                                   Throwable th11 = th;
                                                                            try {
/* 584 */                                                                       byteArrayInputStream.close();
/* 592 */                                                                       throw th11;
                                                                            } catch (Throwable th12) {
/* 589 */                                                                       th11.addSuppressed(th12);
/* 592 */                                                                       throw th11;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th13) {
/* 569 */                                                               th = th13;
                                                                    }
                                                                } catch (Throwable th14) {
/* 581 */                                                           th = th14;
                                                                }
                                                            } catch (FileNotFoundException e12) {
/* 560 */                                                       e = e12;
/* 607 */                                                       c0922fm2.m3774c(6, e);
/* 602 */                                                       c0922fm2.f8280h = null;
/* 604 */                                                       c0922fm2.f8279g = null;
/* 611 */                                                       z2 = false;
                                                            } catch (IOException e13) {
/* 558 */                                                       e = e13;
/* 599 */                                                       c0922fm2.m3774c(7, e);
/* 602 */                                                       c0922fm2.f8280h = null;
/* 604 */                                                       c0922fm2.f8279g = null;
/* 611 */                                                       z2 = false;
                                                            }
                                                        } catch (FileNotFoundException e14) {
/* 596 */                                                   e = e14;
/* 597 */                                                   c = 1;
/* 607 */                                                   c0922fm2.m3774c(6, e);
/* 602 */                                                   c0922fm2.f8280h = null;
/* 604 */                                                   c0922fm2.f8279g = null;
/* 611 */                                                   z2 = false;
                                                        } catch (IOException e15) {
/* 593 */                                                   e = e15;
/* 594 */                                                   c = 1;
/* 599 */                                                   c0922fm2.m3774c(7, e);
/* 602 */                                                   c0922fm2.f8280h = null;
/* 604 */                                                   c0922fm2.f8279g = null;
/* 611 */                                                   z2 = false;
                                                        }
                                                    } catch (Throwable th15) {
/* 618 */                                               c0922fm2.f8280h = null;
/* 620 */                                               c0922fm2.f8279g = null;
/* 622 */                                               throw th15;
                                                    }
                                                }
/* 612 */                                       if (z2) {
/* 614 */                                           m4189j(packageInfo, filesDir);
                                                }
/* 632 */                                       if (z2) {
/* 638 */                                           z3 = 0;
                                                } else {
/* 638 */                                           z3 = 0;
                                                }
/* 639 */                                       gy1.m4042c(context, z3);
                                        }
                                    }
                                }
/* 405 */                       ay1Var2 = (ay1) c0922fm2.f8276d;
/* 409 */                       h80VarArr = (h80[]) c0922fm2.f8279g;
/* 413 */                       bArr = (byte[]) c0922fm2.f8277e;
/* 417 */                       if (h80VarArr != null) {
/* 424 */                           if (c0922fm2.f8274b) {
/* 489 */                               f42.m3656l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
/* 492 */                               return;
                                    }
/* 428 */                           byteArrayOutputStream = new ByteArrayOutputStream();
/* 431 */                           byteArrayOutputStream.write(bArr4);
/* 434 */                           byteArrayOutputStream.write(bArr);
/* 441 */                           if (pg3.m7418B(byteArrayOutputStream, bArr, h80VarArr)) {
/* 444 */                               ay1Var2.mo1180f(5, null);
/* 447 */                               c0922fm2.f8279g = null;
/* 449 */                               byteArrayOutputStream.close();
                                    } else {
/* 464 */                               c0922fm2.f8280h = byteArrayOutputStream.toByteArray();
/* 466 */                               byteArrayOutputStream.close();
/* 486 */                               c0922fm2.f8279g = null;
                                    }
                                }
/* 495 */                       bArr2 = (byte[]) c0922fm2.f8280h;
/* 497 */                       if (bArr2 != null) {
/* 505 */                           if (c0922fm2.f8274b) {
/* 623 */                               f42.m3656l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
/* 626 */                               return;
                                    }
/* 509 */                           byteArrayInputStream = new ByteArrayInputStream(bArr2);
/* 516 */                           File file4 = (File) c0922fm2.f8278f;
/* 521 */                           fileOutputStreamM5167e = AbstractC1417a.m5167e(new FileOutputStream(file4), file4);
/* 527 */                           bArr3 = new byte[NotificationCompat.FLAG_GROUP_SUMMARY];
                                    while (true) {
/* 529 */                               i = byteArrayInputStream.read(bArr3);
/* 533 */                               if (i > 0) {
/* 536 */                                   fileOutputStreamM5167e.write(bArr3, 0, i);
                                        } else {
/* 540 */                                   c = 1;
/* 541 */                                   c0922fm2.m3774c(1, null);
/* 544 */                                   fileOutputStreamM5167e.close();
/* 547 */                                   byteArrayInputStream.close();
/* 550 */                                   c0922fm2.f8280h = null;
/* 552 */                                   c0922fm2.f8279g = null;
/* 554 */                                   z2 = true;
                                        }
/* 567 */                               th = th;
/* 572 */                               fileOutputStreamM5167e.close();
/* 580 */                               throw th;
                                    }
                                }
/* 499 */                       z2 = false;
/* 500 */                       c = 1;
/* 612 */                       if (z2) {
/* 614 */                           m4189j(packageInfo, filesDir);
                                }
/* 632 */                       if (z2) {
/* 638 */                           z3 = 0;
                                } else {
/* 638 */                           z3 = 0;
                                }
/* 639 */                       gy1.m4042c(context, z3);
                            } catch (Throwable th16) {
                                try {
/* 283 */                           fileInputStreamM3773b.close();
/* 291 */                           throw th16;
                                } catch (IOException e16) {
/* 288 */                           ay1Var.mo1180f(7, e16);
/* 291 */                           throw th16;
                                }
                            }
/* 196 */                   c0922fm2.f8274b = true;
/* 217 */                   c = '\b';
                        }
/* 170 */               c = 1;
/* 631 */               z2 = false;
/* 632 */               if (z2) {
/* 638 */                   z3 = 0;
                        } else {
/* 638 */                   z3 = 0;
                        }
/* 639 */               gy1.m4042c(context, z3);
                    } catch (PackageManager.NameNotFoundException e17) {
/* 644 */               ay1Var.mo1180f(7, e17);
/* 648 */               gy1.m4042c(context, false);
                    }
                }

                /* JADX INFO: renamed from: z */
                public static void m4203z(Bundle bundle, Object obj) {
/* 5 */             if (obj instanceof Double) {
/* 13 */                bundle.putDouble(FirebaseAnalytics.Param.VALUE, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
/* 27 */                bundle.putLong(FirebaseAnalytics.Param.VALUE, ((Long) obj).longValue());
                    } else {
/* 35 */                bundle.putString(FirebaseAnalytics.Param.VALUE, obj.toString());
                    }
                }

                /* JADX INFO: renamed from: k */
                public void mo4204k(FloatingActionButton floatingActionButton) {
                }

                /* JADX INFO: renamed from: l */
                public void mo4205l() {
                }
            }
