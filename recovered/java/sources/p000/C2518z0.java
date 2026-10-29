            package p000;

            import android.R;
            import android.os.Build;
            import android.view.accessibility.AccessibilityNodeInfo;
            import androidx.core.app.NotificationCompat;
            import okhttp3.internal.http2.Http2;
            import okio.Segment;
            
            /* JADX INFO: renamed from: z0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 21 */    public final class C2518z0 {

                /* JADX INFO: renamed from: e */
                public static final C2518z0 f19872e = new C2518z0(1);

                /* JADX INFO: renamed from: f */
                public static final C2518z0 f19873f = new C2518z0(2);

                /* JADX INFO: renamed from: g */
                public static final C2518z0 f19874g;

                /* JADX INFO: renamed from: h */
                public static final C2518z0 f19875h;

                /* JADX INFO: renamed from: i */
                public static final C2518z0 f19876i;

                /* JADX INFO: renamed from: j */
                public static final C2518z0 f19877j;

                /* JADX INFO: renamed from: k */
                public static final C2518z0 f19878k;

                /* JADX INFO: renamed from: l */
                public static final C2518z0 f19879l;

                /* JADX INFO: renamed from: m */
                public static final C2518z0 f19880m;

                /* JADX INFO: renamed from: n */
                public static final C2518z0 f19881n;

                /* JADX INFO: renamed from: o */
                public static final C2518z0 f19882o;

                /* JADX INFO: renamed from: a */
                public final Object f19883a;

                /* JADX INFO: renamed from: b */
                public final int f19884b;

                /* JADX INFO: renamed from: c */
                public final Class f19885c;

                /* JADX INFO: renamed from: d */
                public final InterfaceC2091q1 f19886d;

                static {
/* 20 */            new C2518z0(4);
/* 27 */            new C2518z0(8);
/* 37 */            f19874g = new C2518z0(16);
/* 43 */            new C2518z0(32);
/* 50 */            new C2518z0(64);
/* 57 */            new C2518z0(128);
/* 66 */            new C2518z0(NotificationCompat.FLAG_LOCAL_ONLY, AbstractC1777j1.class);
/* 73 */            new C2518z0(NotificationCompat.FLAG_GROUP_SUMMARY, AbstractC1777j1.class);
/* 82 */            new C2518z0(Segment.SHARE_MINIMUM, AbstractC1814k1.class);
/* 89 */            new C2518z0(2048, AbstractC1814k1.class);
/* 99 */            f19875h = new C2518z0(4096);
/* 108 */           f19876i = new C2518z0(Segment.SIZE);
/* 114 */           new C2518z0(Http2.INITIAL_MAX_FRAME_SIZE);
/* 122 */           new C2518z0(32768);
/* 129 */           new C2518z0(65536);
/* 138 */           new C2518z0(131072, AbstractC1985o1.class);
/* 148 */           f19877j = new C2518z0(262144);
/* 157 */           f19878k = new C2518z0(524288);
/* 166 */           f19879l = new C2518z0(1048576);
/* 174 */           new C2518z0(2097152, AbstractC2054p1.class);
/* 187 */           new C2518z0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
/* 201 */           new C2518z0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC1911m1.class);
/* 216 */           f19880m = new C2518z0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
/* 225 */           new C2518z0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
/* 239 */           f19881n = new C2518z0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
/* 249 */           new C2518z0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
/* 254 */           int i = Build.VERSION.SDK_INT;
/* 274 */           new C2518z0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
/* 297 */           new C2518z0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
/* 316 */           new C2518z0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
/* 336 */           new C2518z0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
/* 349 */           new C2518z0(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
/* 365 */           f19882o = new C2518z0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC1948n1.class);
/* 386 */           new C2518z0(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AbstractC1874l1.class);
/* 408 */           new C2518z0(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
/* 433 */           new C2518z0(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
/* 454 */           new C2518z0(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
/* 474 */           new C2518z0(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
/* 493 */           new C2518z0(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
/* 513 */           new C2518z0(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
/* 533 */           new C2518z0(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
/* 555 */           new C2518z0(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
/* 575 */           new C2518z0(i >= 34 ? AbstractC0200c1.m1472a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
                }

                public C2518z0(Object obj, int i, String str, InterfaceC2091q1 interfaceC2091q1, Class cls) {
/* 4 */             this.f19884b = i;
/* 6 */             this.f19886d = interfaceC2091q1;
/* 8 */             if (obj == null) {
/* 15 */                this.f19883a = new AccessibilityNodeInfo.AccessibilityAction(i, str);
                    } else {
/* 18 */                this.f19883a = obj;
                    }
/* 20 */            this.f19885c = cls;
                }

                /* JADX INFO: renamed from: a */
                public final int m10230a() {
/* 5 */             return ((AccessibilityNodeInfo.AccessibilityAction) this.f19883a).getId();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == null || !(obj instanceof C2518z0)) {
/* 1 */                 return false;
                    }
/* 12 */            Object obj2 = ((C2518z0) obj).f19883a;
/* 14 */            Object obj3 = this.f19883a;
/* 16 */            if (obj3 == null) {
                        return obj2 == null;
                    }
                    return obj3.equals(obj2);
                }

                public final int hashCode() {
/* 1 */             Object obj = this.f19883a;
/* 3 */             if (obj != null) {
/* 5 */                 return obj.hashCode();
                    }
/* 10 */            return 0;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
/* 10 */            String strM3620d = C0901f1.m3620d(this.f19884b);
/* 20 */            if (strM3620d.equals("ACTION_UNKNOWN")) {
/* 22 */                Object obj = this.f19883a;
/* 31 */                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
/* 39 */                    strM3620d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                        }
                    }
/* 43 */            sb.append(strM3620d);
/* 46 */            return sb.toString();
                }

/* 22 */        public C2518z0(int i, Class cls) {
/* 23 */            this(null, i, null, null, cls);
                }

/* 23 */        public C2518z0(int i) {
/* 24 */            this(null, i, null, null, null);
                }
            }
