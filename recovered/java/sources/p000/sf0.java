            package p000;

            import android.graphics.Rect;
            import android.os.Bundle;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewParent;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityManager;
            import android.view.accessibility.AccessibilityNodeInfo;
            import androidx.core.app.NotificationCompat;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class sf0 extends C2201t0 {

                /* JADX INFO: renamed from: n */
                public static final Rect f16559n = new Rect(AbstractC0208c9.API_PRIORITY_OTHER, AbstractC0208c9.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

                /* JADX INFO: renamed from: o */
                public static final zb0 f16560o = new zb0(7);

                /* JADX INFO: renamed from: p */
                public static final ec0 f16561p = new ec0(7);

                /* JADX INFO: renamed from: h */
                public final AccessibilityManager f16566h;

                /* JADX INFO: renamed from: i */
                public final View f16567i;

                /* JADX INFO: renamed from: j */
                public rf0 f16568j;

                /* JADX INFO: renamed from: d */
                public final Rect f16562d = new Rect();

                /* JADX INFO: renamed from: e */
                public final Rect f16563e = new Rect();

                /* JADX INFO: renamed from: f */
                public final Rect f16564f = new Rect();

                /* JADX INFO: renamed from: g */
                public final int[] f16565g = new int[2];

                /* JADX INFO: renamed from: k */
                public int f16569k = Integer.MIN_VALUE;

                /* JADX INFO: renamed from: l */
                public int f16570l = Integer.MIN_VALUE;

                /* JADX INFO: renamed from: m */
                public int f16571m = Integer.MIN_VALUE;

                public sf0(View view) {
/* 38 */            this.f16567i = view;
/* 52 */            this.f16566h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
/* 55 */            view.setFocusable(true);
/* 58 */            WeakHashMap weakHashMap = e33.f7494a;
/* 64 */            if (view.getImportantForAccessibility() == 0) {
/* 66 */                view.setImportantForAccessibility(1);
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: b */
                public final qc3 mo1205b(View view) {
/* 3 */             if (this.f16568j == null) {
/* 10 */                this.f16568j = new rf0(this);
                    }
/* 12 */            return this.f16568j;
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: d */
                public final void mo128d(View view, C0901f1 c0901f1) {
/* 5 */             this.f16886a.onInitializeAccessibilityNodeInfo(view, c0901f1.f7961a);
/* 8 */             mo4015t(c0901f1);
                }

                /* JADX INFO: renamed from: j */
                public final boolean m8491j(int i) {
/* 4 */             if (this.f16570l != i) {
/* 3 */                 return false;
                    }
/* 9 */             this.f16570l = Integer.MIN_VALUE;
/* 11 */            mo4016v(i, false);
/* 16 */            m8499x(i, 8);
/* 19 */            return true;
                }

                /* JADX INFO: renamed from: k */
                public final AccessibilityEvent m8492k(int i, int i2) {
/* 2 */             View view = this.f16567i;
/* 4 */             if (i == -1) {
/* 108 */               AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
/* 112 */               view.onInitializeAccessibilityEvent(accessibilityEventObtain);
/* 115 */               return accessibilityEventObtain;
                    }
/* 6 */             AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
/* 10 */            C0901f1 c0901f1M8497r = m8497r(i);
/* 22 */            accessibilityEventObtain2.getText().add(c0901f1M8497r.m3626g());
/* 25 */            AccessibilityNodeInfo accessibilityNodeInfo = c0901f1M8497r.f7961a;
/* 31 */            accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
/* 38 */            accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
/* 45 */            accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
/* 52 */            accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
/* 59 */            accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
/* 70 */            if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
/* 81 */                f42.m3663s("Callbacks must add text or a content description in populateEventForVirtualViewId()");
/* 84 */                return null;
                    }
/* 90 */            accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
/* 93 */            accessibilityEventObtain2.setSource(view, i);
/* 104 */           accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
/* 107 */           return accessibilityEventObtain2;
                }

                /* JADX INFO: renamed from: l */
                public final C0901f1 m8493l(int i) {
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
/* 7 */             C0901f1 c0901f1 = new C0901f1(accessibilityNodeInfoObtain);
/* 11 */            accessibilityNodeInfoObtain.setEnabled(true);
/* 14 */            accessibilityNodeInfoObtain.setFocusable(true);
/* 19 */            c0901f1.m3628i("android.view.View");
/* 22 */            Rect rect = f16559n;
/* 24 */            accessibilityNodeInfoObtain.setBoundsInParent(rect);
/* 27 */            accessibilityNodeInfoObtain.setBoundsInScreen(rect);
/* 30 */            View view = this.f16567i;
/* 32 */            accessibilityNodeInfoObtain.setParent(view);
/* 35 */            mo2378u(i, c0901f1);
/* 43 */            if (c0901f1.m3626g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
/* 54 */                f42.m3663s("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
/* 42 */                return null;
                    }
/* 58 */            Rect rect2 = this.f16563e;
/* 60 */            c0901f1.m3625f(rect2);
/* 67 */            if (rect2.equals(rect)) {
/* 281 */               f42.m3663s("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
/* 42 */                return null;
                    }
/* 69 */            int actions = accessibilityNodeInfoObtain.getActions();
/* 75 */            if ((actions & 64) != 0) {
/* 275 */               f42.m3663s("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
/* 42 */                return null;
                    }
/* 80 */            if ((actions & 128) != 0) {
/* 269 */               f42.m3663s("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
/* 42 */                return null;
                    }
/* 90 */            accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
/* 93 */            c0901f1.f7962b = i;
/* 95 */            accessibilityNodeInfoObtain.setSource(view, i);
/* 101 */           if (this.f16569k == i) {
/* 103 */               accessibilityNodeInfoObtain.setAccessibilityFocused(true);
/* 106 */               c0901f1.m3621a(128);
                    } else {
/* 110 */               accessibilityNodeInfoObtain.setAccessibilityFocused(false);
/* 115 */               c0901f1.m3621a(64);
                    }
/* 124 */           boolean z = this.f16570l == i;
/* 125 */           if (z) {
/* 128 */               c0901f1.m3621a(2);
                    } else if (accessibilityNodeInfoObtain.isFocusable()) {
/* 138 */               c0901f1.m3621a(1);
                    }
/* 141 */           accessibilityNodeInfoObtain.setFocused(z);
/* 144 */           int[] iArr = this.f16565g;
/* 146 */           view.getLocationOnScreen(iArr);
/* 149 */           Rect rect3 = this.f16562d;
/* 151 */           accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
/* 158 */           if (rect3.equals(rect)) {
/* 160 */               c0901f1.m3625f(rect3);
/* 177 */               rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
/* 180 */           Rect rect4 = this.f16564f;
/* 186 */           if (view.getLocalVisibleRect(rect4)) {
/* 202 */               rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
/* 209 */               if (rect3.intersect(rect4)) {
/* 211 */                   accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
/* 218 */                   if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
/* 228 */                       Object parent = view.getParent();
/* 234 */                       while (parent instanceof View) {
/* 236 */                           View view2 = (View) parent;
/* 245 */                           if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
/* 254 */                               parent = view2.getParent();
                                    }
                                }
/* 259 */                       if (parent != null) {
/* 263 */                           c0901f1.f7961a.setVisibleToUser(true);
                                }
                            }
                        }
                    }
/* 266 */           return c0901f1;
                }

                /* JADX INFO: renamed from: m */
                public final boolean m8494m(MotionEvent motionEvent) {
                    int i;
/* 1 */             AccessibilityManager accessibilityManager = this.f16566h;
/* 7 */             if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
/* 83 */                return false;
                    }
/* 16 */            int action = motionEvent.getAction();
/* 28 */            if (action == 7 || action == 9) {
/* 63 */                int iMo2375n = mo2375n(motionEvent.getX(), motionEvent.getY());
/* 67 */                int i2 = this.f16571m;
/* 69 */                if (i2 != iMo2375n) {
/* 72 */                    this.f16571m = iMo2375n;
/* 74 */                    m8499x(iMo2375n, 128);
/* 77 */                    m8499x(i2, NotificationCompat.FLAG_LOCAL_ONLY);
                        }
/* 80 */                if (iMo2375n == Integer.MIN_VALUE) {
/* 83 */                    return false;
                        }
                    } else {
/* 36 */                if (action != 10 || (i = this.f16571m) == Integer.MIN_VALUE) {
/* 83 */                    return false;
                        }
/* 43 */                if (i != Integer.MIN_VALUE) {
/* 46 */                    this.f16571m = Integer.MIN_VALUE;
/* 48 */                    m8499x(Integer.MIN_VALUE, 128);
/* 51 */                    m8499x(i, NotificationCompat.FLAG_LOCAL_ONLY);
/* 25 */                    return true;
                        }
                    }
/* 25 */            return true;
                }

                /* JADX INFO: renamed from: n */
                public abstract int mo2375n(float f, float f2);

                /* JADX INFO: renamed from: o */
                public abstract void mo2376o(ArrayList arrayList);

                /* JADX INFO: renamed from: p */
                public final void m8495p(int i) {
                    View view;
                    ViewParent parent;
/* 3 */             if (i == Integer.MIN_VALUE || !this.f16566h.isEnabled() || (parent = (view = this.f16567i).getParent()) == null) {
/* 34 */                return;
                    }
/* 23 */            AccessibilityEvent accessibilityEventM8492k = m8492k(i, 2048);
/* 28 */            accessibilityEventM8492k.setContentChangeTypes(0);
/* 31 */            parent.requestSendAccessibilityEvent(view, accessibilityEventM8492k);
                }

                /* JADX WARN: Code duplicated, block: B:67:0x0145  */
                /* JADX INFO: renamed from: q */
                public final boolean m8496q(int i, Rect rect) {
                    int i2;
                    Object obj;
                    C0901f1 c0901f1;
/* 9 */             ArrayList arrayList = new ArrayList();
/* 12 */            mo2376o(arrayList);
/* 17 */            vf2 vf2Var = new vf2();
/* 26 */            for (int i3 = 0; i3 < arrayList.size(); i3++) {
/* 52 */                vf2Var.m9266c(((Integer) arrayList.get(i3)).intValue(), m8493l(((Integer) arrayList.get(i3)).intValue()));
                    }
/* 58 */            int i4 = this.f16570l;
/* 60 */            int i5 = Integer.MIN_VALUE;
/* 70 */            C0901f1 c0901f2 = i4 == Integer.MIN_VALUE ? null : (C0901f1) vf2Var.m9265b(i4);
/* 72 */            zb0 zb0Var = f16560o;
/* 74 */            ec0 ec0Var = f16561p;
/* 76 */            View view = this.f16567i;
/* 79 */            int i6 = -1;
/* 81 */            if (i == 1 || i == 2) {
/* 342 */               WeakHashMap weakHashMap = e33.f7494a;
/* 354 */               boolean z = view.getLayoutDirection() == 1;
/* 355 */               ec0Var.getClass();
/* 358 */               int i7 = vf2Var.f18042c;
/* 362 */               ArrayList arrayList2 = new ArrayList(i7);
/* 366 */               for (int i8 = 0; i8 < i7; i8++) {
/* 374 */                   arrayList2.add((C0901f1) vf2Var.f18041b[i8]);
                        }
/* 385 */               Collections.sort(arrayList2, new gl0(z, zb0Var));
/* 389 */               if (i == 1) {
/* 425 */                   i2 = 0;
/* 427 */                   int size = arrayList2.size();
/* 431 */                   if (c0901f2 != null) {
/* 436 */                       size = arrayList2.indexOf(c0901f2);
                            }
/* 441 */                   int i9 = size - 1;
/* 450 */                   obj = i9 >= 0 ? arrayList2.get(i9) : null;
                        } else {
/* 391 */                   if (i != 2) {
/* 419 */                       C1951n4.m6859j("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
/* 422 */                       return false;
                            }
/* 393 */                   int size2 = arrayList2.size();
/* 405 */                   int iLastIndexOf = (c0901f2 == null ? -1 : arrayList2.lastIndexOf(c0901f2)) + 1;
/* 415 */                   obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
/* 412 */                   i2 = 0;
                        }
/* 453 */               c0901f1 = (C0901f1) obj;
                    } else {
/* 93 */                if (i != 17 && i != 33 && i != 66 && i != 130) {
/* 106 */                   C1951n4.m6859j("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
/* 20 */                    return false;
                        }
/* 112 */               Rect rect2 = new Rect();
/* 115 */               int i10 = this.f16570l;
/* 119 */               if (i10 != Integer.MIN_VALUE) {
/* 125 */                   m8497r(i10).m3625f(rect2);
                        } else if (rect != null) {
/* 131 */                   rect2.set(rect);
                        } else {
/* 135 */                   int width = view.getWidth();
/* 139 */                   int height = view.getHeight();
/* 143 */                   if (i == 17) {
/* 172 */                       rect2.set(width, 0, width, height);
                            } else if (i == 33) {
/* 167 */                       rect2.set(0, height, width, height);
                            } else if (i == 66) {
/* 162 */                       rect2.set(-1, 0, -1, height);
                            } else {
/* 149 */                       if (i != 130) {
/* 157 */                           C1951n4.m6859j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
/* 156 */                           return false;
                                }
/* 152 */                       rect2.set(0, -1, width, -1);
                            }
                        }
/* 177 */               Rect rect3 = new Rect(rect2);
/* 180 */               if (i == 17) {
/* 235 */                   rect3.offset(rect2.width() + 1, 0);
                        } else if (i == 33) {
/* 224 */                   rect3.offset(0, rect2.height() + 1);
                        } else if (i == 66) {
/* 213 */                   rect3.offset(-(rect2.width() + 1), 0);
                        } else {
/* 186 */                   if (i != 130) {
/* 201 */                       C1951n4.m6859j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
/* 200 */                       return false;
                            }
/* 196 */                   rect3.offset(0, -(rect2.height() + 1));
                        }
/* 238 */               ec0Var.getClass();
/* 241 */               int i11 = vf2Var.f18042c;
/* 245 */               Rect rect4 = new Rect();
/* 249 */               c0901f1 = null;
/* 251 */               for (int i12 = 0; i12 < i11; i12++) {
/* 257 */                   C0901f1 c0901f3 = (C0901f1) vf2Var.f18041b[i12];
/* 259 */                   if (c0901f3 != c0901f2) {
/* 262 */                       zb0Var.getClass();
/* 265 */                       c0901f3.m3625f(rect4);
/* 272 */                       if (i13.m4440s(i, rect2, rect4)) {
/* 279 */                           if (!i13.m4440s(i, rect2, rect3) || i13.m4428e(i, rect2, rect4, rect3)) {
/* 326 */                               rect3.set(rect4);
/* 329 */                               c0901f1 = c0901f3;
                                    } else if (!i13.m4428e(i, rect2, rect3, rect4)) {
/* 296 */                               int iM4445y = i13.m4445y(i, rect2, rect4);
/* 300 */                               int iM4446z = i13.m4446z(i, rect2, rect4);
/* 308 */                               int i13 = (iM4446z * iM4446z) + (iM4445y * 13 * iM4445y);
/* 309 */                               int iM4445y2 = i13.m4445y(i, rect2, rect3);
/* 313 */                               int iM4446z2 = i13.m4446z(i, rect2, rect3);
/* 324 */                               if (i13 < (iM4446z2 * iM4446z2) + (iM4445y2 * 13 * iM4445y2)) {
/* 326 */                                   rect3.set(rect4);
/* 329 */                                   c0901f1 = c0901f3;
                                        }
                                    }
                                }
                            }
                        }
/* 334 */               i2 = 0;
                    }
/* 336 */           C0901f1 c0901f4 = c0901f1;
/* 456 */           if (c0901f4 != null) {
/* 463 */               for (int i14 = i2; i14 < vf2Var.f18042c; i14++) {
/* 469 */                   if (vf2Var.f18041b[i14] == c0901f4) {
/* 471 */                       i6 = i14;
                                break;
                            }
                        }
/* 478 */               i5 = vf2Var.f18040a[i6];
                    }
/* 480 */           return m8498w(i5);
                }

                /* JADX INFO: renamed from: r */
                public final C0901f1 m8497r(int i) {
/* 2 */             if (i != -1) {
/* 74 */                return m8493l(i);
                    }
/* 4 */             View view = this.f16567i;
/* 6 */             AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
/* 12 */            C0901f1 c0901f1 = new C0901f1(accessibilityNodeInfoObtain);
/* 15 */            WeakHashMap weakHashMap = e33.f7494a;
/* 17 */            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
/* 22 */            ArrayList arrayList = new ArrayList();
/* 25 */            mo2376o(arrayList);
/* 32 */            if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
/* 43 */                f42.m3663s("Views cannot have both real and virtual children");
/* 46 */                return null;
                    }
/* 48 */            int size = arrayList.size();
/* 53 */            for (int i2 = 0; i2 < size; i2++) {
/* 67 */                c0901f1.f7961a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
                    }
/* 73 */            return c0901f1;
                }

                /* JADX INFO: renamed from: s */
                public abstract boolean mo2377s(int i, int i2, Bundle bundle);

                /* JADX INFO: renamed from: t */
                public void mo4015t(C0901f1 c0901f1) {
                }

                /* JADX INFO: renamed from: u */
                public abstract void mo2378u(int i, C0901f1 c0901f1);

                /* JADX INFO: renamed from: v */
                public void mo4016v(int i, boolean z) {
                }

                /* JADX INFO: renamed from: w */
                public final boolean m8498w(int i) {
                    int i2;
/* 1 */             View view = this.f16567i;
/* 7 */             if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.f16570l) == i) {
/* 30 */                return false;
                    }
/* 23 */            if (i2 != Integer.MIN_VALUE) {
/* 25 */                m8491j(i2);
                    }
/* 28 */            if (i == Integer.MIN_VALUE) {
/* 30 */                return false;
                    }
/* 32 */            this.f16570l = i;
/* 35 */            mo4016v(i, true);
/* 40 */            m8499x(i, 8);
/* 34 */            return true;
                }

                /* JADX INFO: renamed from: x */
                public final void m8499x(int i, int i2) {
                    View view;
                    ViewParent parent;
/* 3 */             if (i == Integer.MIN_VALUE || !this.f16566h.isEnabled() || (parent = (view = this.f16567i).getParent()) == null) {
/* 30 */                return;
                    }
/* 27 */            parent.requestSendAccessibilityEvent(view, m8492k(i, i2));
                }
            }
