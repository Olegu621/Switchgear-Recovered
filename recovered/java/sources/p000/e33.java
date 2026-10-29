            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.os.Build;
            import android.util.AttributeSet;
            import android.util.Log;
            import android.util.SparseArray;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.ViewParent;
            import android.view.WindowInsets;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityManager;
            import androidx.appcompat.widget.AppCompatEditText;
            import androidx.core.R$id;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.Field;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Objects;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class e33 {

                /* JADX INFO: renamed from: a */
                public static WeakHashMap f7494a;

                /* JADX INFO: renamed from: b */
                public static Field f7495b;

                /* JADX INFO: renamed from: c */
                public static boolean f7496c;

                /* JADX INFO: renamed from: d */
                public static final int[] f7497d = {R$id.accessibility_custom_action_0, R$id.accessibility_custom_action_1, R$id.accessibility_custom_action_2, R$id.accessibility_custom_action_3, R$id.accessibility_custom_action_4, R$id.accessibility_custom_action_5, R$id.accessibility_custom_action_6, R$id.accessibility_custom_action_7, R$id.accessibility_custom_action_8, R$id.accessibility_custom_action_9, R$id.accessibility_custom_action_10, R$id.accessibility_custom_action_11, R$id.accessibility_custom_action_12, R$id.accessibility_custom_action_13, R$id.accessibility_custom_action_14, R$id.accessibility_custom_action_15, R$id.accessibility_custom_action_16, R$id.accessibility_custom_action_17, R$id.accessibility_custom_action_18, R$id.accessibility_custom_action_19, R$id.accessibility_custom_action_20, R$id.accessibility_custom_action_21, R$id.accessibility_custom_action_22, R$id.accessibility_custom_action_23, R$id.accessibility_custom_action_24, R$id.accessibility_custom_action_25, R$id.accessibility_custom_action_26, R$id.accessibility_custom_action_27, R$id.accessibility_custom_action_28, R$id.accessibility_custom_action_29, R$id.accessibility_custom_action_30, R$id.accessibility_custom_action_31};

                /* JADX INFO: renamed from: e */
                public static final n23 f7498e = new n23();

                /* JADX INFO: renamed from: f */
                public static final p23 f7499f = new p23();

                /* JADX INFO: renamed from: a */
                public static p43 m3305a(View view) {
/* 3 */             if (f7494a == null) {
/* 10 */                f7494a = new WeakHashMap();
                    }
/* 18 */            p43 p43Var = (p43) f7494a.get(view);
/* 20 */            if (p43Var != null) {
/* 32 */                return p43Var;
                    }
/* 24 */            p43 p43Var2 = new p43(view);
/* 29 */            f7494a.put(view, p43Var2);
/* 32 */            return p43Var2;
                }

                /* JADX INFO: renamed from: b */
                public static m83 m3306b(View view, m83 m83Var) {
/* 1 */             WindowInsets windowInsetsM6626g = m83Var.m6626g();
/* 5 */             if (windowInsetsM6626g != null) {
/* 7 */                 WindowInsets windowInsetsM7677a = q23.m7677a(view, windowInsetsM6626g);
/* 15 */                if (!windowInsetsM7677a.equals(windowInsetsM6626g)) {
/* 17 */                    return m83.m6620h(windowInsetsM7677a, view);
                        }
                    }
/* 22 */            return m83Var;
                }

                /* JADX INFO: renamed from: c */
                public static boolean m3307c(View view, KeyEvent keyEvent) {
/* 5 */             if (Build.VERSION.SDK_INT >= 28) {
/* 186 */               return false;
                    }
/* 9 */             ArrayList arrayList = d33.f6968d;
/* 17 */            d33 d33Var = (d33) view.getTag(R$id.tag_unhandled_key_event_manager);
/* 19 */            if (d33Var == null) {
/* 23 */                d33Var = new d33();
/* 27 */                d33Var.f6969a = null;
/* 29 */                d33Var.f6970b = null;
/* 31 */                d33Var.f6971c = null;
/* 35 */                view.setTag(R$id.tag_unhandled_key_event_manager, d33Var);
                    }
/* 43 */            if (keyEvent.getAction() == 0) {
/* 45 */                WeakHashMap weakHashMap = d33Var.f6969a;
/* 47 */                if (weakHashMap != null) {
/* 49 */                    weakHashMap.clear();
                        }
/* 52 */                ArrayList arrayList2 = d33.f6968d;
/* 58 */                if (!arrayList2.isEmpty()) {
                            synchronized (arrayList2) {
                                try {
/* 64 */                            if (d33Var.f6969a == null) {
/* 71 */                                d33Var.f6969a = new WeakHashMap();
                                    }
/* 81 */                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
/* 83 */                                ArrayList arrayList3 = d33.f6968d;
/* 95 */                                View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
/* 97 */                                if (view2 == null) {
/* 99 */                                    arrayList3.remove(size);
                                        } else {
/* 107 */                                   d33Var.f6969a.put(view2, Boolean.TRUE);
/* 116 */                                   for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
/* 125 */                                       d33Var.f6969a.put((View) parent, Boolean.TRUE);
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
/* 139 */                           throw th;
                                }
                            }
                        }
                    }
/* 140 */           View viewM2918a = d33Var.m2918a(view);
/* 148 */           if (keyEvent.getAction() == 0) {
/* 150 */               int keyCode = keyEvent.getKeyCode();
/* 154 */               if (viewM2918a != null && !KeyEvent.isModifierKey(keyCode)) {
/* 164 */                   if (d33Var.f6970b == null) {
/* 171 */                       d33Var.f6970b = new SparseArray();
                            }
/* 180 */                   d33Var.f6970b.put(keyCode, new WeakReference(viewM2918a));
                        }
                    }
                    return viewM2918a != null;
                }

                /* JADX INFO: renamed from: d */
                public static View.AccessibilityDelegate m3308d(View view) {
/* 5 */             if (Build.VERSION.SDK_INT >= 29) {
/* 7 */                 return y23.m10087a(view);
                    }
/* 14 */            if (f7496c) {
/* 54 */                return null;
                    }
/* 20 */            if (f7495b == null) {
                        try {
/* 26 */                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
/* 30 */                    f7495b = declaredField;
/* 32 */                    declaredField.setAccessible(true);
                        } catch (Throwable unused) {
/* 36 */                    f7496c = true;
/* 54 */                    return null;
                        }
                    }
                    try {
/* 41 */                Object obj = f7495b.get(view);
/* 47 */                if (obj instanceof View.AccessibilityDelegate) {
/* 49 */                    return (View.AccessibilityDelegate) obj;
                        }
/* 54 */                return null;
                    } catch (Throwable unused2) {
/* 52 */                f7496c = true;
/* 54 */                return null;
                    }
                }

                /* JADX INFO: renamed from: e */
                public static ArrayList m3309e(View view) {
/* 7 */             ArrayList arrayList = (ArrayList) view.getTag(R$id.tag_accessibility_actions);
/* 9 */             if (arrayList != null) {
/* 21 */                return arrayList;
                    }
/* 13 */            ArrayList arrayList2 = new ArrayList();
/* 18 */            view.setTag(R$id.tag_accessibility_actions, arrayList2);
/* 21 */            return arrayList2;
                }

                /* JADX INFO: renamed from: f */
                public static String[] m3310f(AppCompatEditText appCompatEditText) {
                    return Build.VERSION.SDK_INT >= 31 ? a33.m48a(appCompatEditText) : (String[]) appCompatEditText.getTag(R$id.tag_on_receive_content_mime_types);
                }

                /* JADX INFO: renamed from: g */
                public static void m3311g(int i, View view) {
                    Object tag;
/* 11 */            AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
/* 17 */            if (accessibilityManager.isEnabled()) {
/* 21 */                int i2 = R$id.tag_accessibility_pane_title;
/* 23 */                int i3 = Build.VERSION.SDK_INT;
/* 25 */                Object objM9686b = null;
/* 30 */                if (i3 >= 28) {
/* 32 */                    tag = x23.m9686b(view);
                        } else {
/* 37 */                    tag = view.getTag(i2);
/* 45 */                    if (!CharSequence.class.isInstance(tag)) {
/* 48 */                        tag = null;
                            }
                        }
/* 68 */                boolean z = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
/* 75 */                if (view.getAccessibilityLiveRegion() != 0 || z) {
/* 173 */                   AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
/* 182 */                   accessibilityEventObtain.setEventType(z ? 32 : 2048);
/* 185 */                   accessibilityEventObtain.setContentChangeTypes(i);
/* 188 */                   if (z) {
/* 190 */                       List<CharSequence> text = accessibilityEventObtain.getText();
/* 194 */                       int i4 = R$id.tag_accessibility_pane_title;
/* 196 */                       if (i3 >= 28) {
/* 198 */                           objM9686b = x23.m9686b(view);
                                } else {
/* 203 */                           Object tag2 = view.getTag(i4);
/* 211 */                           if (CharSequence.class.isInstance(tag2)) {
/* 213 */                               objM9686b = tag2;
                                    }
                                }
/* 216 */                       text.add((CharSequence) objM9686b);
/* 223 */                       if (view.getImportantForAccessibility() == 0) {
/* 225 */                           view.setImportantForAccessibility(1);
                                }
                            }
/* 228 */                   view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
/* 231 */                   return;
                        }
/* 80 */                if (i != 32) {
/* 138 */                   if (view.getParent() != null) {
                                try {
/* 144 */                           view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
/* 147 */                           return;
                                } catch (AbstractMethodError e) {
/* 169 */                           AbstractC1245n0.m4877e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
/* 172 */                           return;
                                }
                            }
/* 172 */                   return;
                        }
/* 82 */                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
/* 86 */                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
/* 89 */                accessibilityEventObtain2.setEventType(32);
/* 92 */                accessibilityEventObtain2.setContentChangeTypes(i);
/* 95 */                accessibilityEventObtain2.setSource(view);
/* 98 */                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
/* 101 */               List<CharSequence> text2 = accessibilityEventObtain2.getText();
/* 105 */               int i5 = R$id.tag_accessibility_pane_title;
/* 107 */               if (i3 >= 28) {
/* 109 */                   objM9686b = x23.m9686b(view);
                        } else {
/* 114 */                   Object tag3 = view.getTag(i5);
/* 122 */                   if (CharSequence.class.isInstance(tag3)) {
/* 124 */                       objM9686b = tag3;
                            }
                        }
/* 127 */               text2.add((CharSequence) objM9686b);
/* 130 */               accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                    }
                }

                /* JADX INFO: renamed from: h */
                public static m83 m3312h(View view, m83 m83Var) {
/* 1 */             WindowInsets windowInsetsM6626g = m83Var.m6626g();
/* 5 */             if (windowInsetsM6626g != null) {
/* 7 */                 WindowInsets windowInsetsM7678b = q23.m7678b(view, windowInsetsM6626g);
/* 15 */                if (!windowInsetsM7678b.equals(windowInsetsM6626g)) {
/* 17 */                    return m83.m6620h(windowInsetsM7678b, view);
                        }
                    }
/* 22 */            return m83Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: i */
                public static l00 m3313i(View view, l00 l00Var) {
/* 8 */             if (Log.isLoggable("ViewCompat", 3)) {
/* 10 */                Objects.toString(l00Var);
/* 13 */                view.getClass();
/* 16 */                view.getId();
                    }
/* 23 */            if (Build.VERSION.SDK_INT >= 31) {
/* 25 */                return a33.m49b(view, l00Var);
                    }
/* 36 */            cq1 cq1Var = (cq1) view.getTag(R$id.tag_on_receive_content_listener);
/* 38 */            dq1 dq1Var = f7498e;
/* 40 */            if (cq1Var == null) {
/* 66 */                if (view instanceof dq1) {
/* 69 */                    dq1Var = (dq1) view;
                        }
/* 71 */                return dq1Var.mo356a(l00Var);
                    }
/* 44 */            l00 l00VarM7507a = ((pn2) cq1Var).m7507a(view, l00Var);
/* 48 */            if (l00VarM7507a == null) {
/* 50 */                return null;
                    }
/* 54 */            if (view instanceof dq1) {
/* 57 */                dq1Var = (dq1) view;
                    }
/* 59 */            return dq1Var.mo356a(l00VarM7507a);
                }

                /* JADX INFO: renamed from: j */
                public static void m3314j(int i, View view) {
/* 1 */             m3315k(i, view);
/* 5 */             m3311g(0, view);
                }

                /* JADX INFO: renamed from: k */
                public static void m3315k(int i, View view) {
/* 1 */             ArrayList arrayListM3309e = m3309e(view);
/* 10 */            for (int i2 = 0; i2 < arrayListM3309e.size(); i2++) {
/* 22 */                if (((C2518z0) arrayListM3309e.get(i2)).m10230a() == i) {
/* 24 */                    arrayListM3309e.remove(i2);
/* 27 */                    return;
                        }
                    }
                }

                /* JADX INFO: renamed from: l */
                public static void m3316l(View view, C2518z0 c2518z0, InterfaceC2091q1 interfaceC2091q1) {
                    C2201t0 c2201t0;
/* 1 */             if (interfaceC2091q1 == null) {
/* 7 */                 m3314j(c2518z0.m10230a(), view);
/* 10 */                return;
                    }
/* 20 */            C2518z0 c2518z1 = new C2518z0(null, c2518z0.f19884b, null, interfaceC2091q1, c2518z0.f19885c);
/* 23 */            View.AccessibilityDelegate accessibilityDelegateM3308d = m3308d(view);
/* 27 */            if (accessibilityDelegateM3308d == null) {
/* 29 */                c2201t0 = null;
                    } else {
/* 42 */                c2201t0 = accessibilityDelegateM3308d instanceof C2164s0 ? ((C2164s0) accessibilityDelegateM3308d).f16369a : new C2201t0(accessibilityDelegateM3308d);
                    }
/* 46 */            if (c2201t0 == null) {
/* 50 */                c2201t0 = new C2201t0();
                    }
/* 53 */            m3318n(view, c2201t0);
/* 60 */            m3315k(c2518z1.m10230a(), view);
/* 67 */            m3309e(view).add(c2518z1);
/* 71 */            m3311g(0, view);
                }

                /* JADX INFO: renamed from: m */
                public static void m3317m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
/* 5 */             if (Build.VERSION.SDK_INT >= 29) {
/* 14 */                y23.m10090d(view, context, iArr, attributeSet, typedArray, i, 0);
                    }
                }

                /* JADX INFO: renamed from: n */
                public static void m3318n(View view, C2201t0 c2201t0) {
/* 1 */             if (c2201t0 == null && (m3308d(view) instanceof C2164s0)) {
/* 13 */                c2201t0 = new C2201t0();
                    }
/* 20 */            if (view.getImportantForAccessibility() == 0) {
/* 23 */                view.setImportantForAccessibility(1);
                    }
/* 32 */            view.setAccessibilityDelegate(c2201t0 == null ? null : c2201t0.f16887b);
                }

                /* JADX INFO: renamed from: o */
                public static void m3319o(View view, CharSequence charSequence) {
/* 15 */            new o23(R$id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m8129f(view, charSequence);
/* 18 */            p23 p23Var = f7499f;
/* 20 */            if (charSequence == null) {
/* 65 */                p23Var.f14950a.remove(view);
/* 68 */                view.removeOnAttachStateChangeListener(p23Var);
/* 75 */                view.getViewTreeObserver().removeOnGlobalLayoutListener(p23Var);
                    } else {
/* 43 */                p23Var.f14950a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
/* 46 */                view.addOnAttachStateChangeListener(p23Var);
/* 53 */                if (view.isAttachedToWindow()) {
/* 59 */                    view.getViewTreeObserver().addOnGlobalLayoutListener(p23Var);
                        }
                    }
                }
            }
