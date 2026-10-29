            package p000;

            import android.R;
            import android.graphics.Rect;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.SpannableString;
            import android.text.TextUtils;
            import android.view.accessibility.AccessibilityNodeInfo;
            import androidx.core.app.NotificationCompat;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import okhttp3.internal.http2.Http2;
            import okio.Segment;
            
            /* JADX INFO: renamed from: f1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class C0901f1 {

                /* JADX INFO: renamed from: c */
                public static int f7960c;

                /* JADX INFO: renamed from: a */
                public final AccessibilityNodeInfo f7961a;

                /* JADX INFO: renamed from: b */
                public int f7962b = -1;

                public C0901f1(Object obj) {
/* 9 */             this.f7961a = (AccessibilityNodeInfo) obj;
                }

                /* JADX INFO: renamed from: d */
                public static String m3620d(int i) {
/* 2 */             if (i == 1) {
/* 145 */               return "ACTION_FOCUS";
                    }
/* 5 */             if (i == 2) {
/* 142 */               return "ACTION_CLEAR_FOCUS";
                    }
                    switch (i) {
                        case 4:
/* 139 */                   return "ACTION_SELECT";
                        case 8:
/* 136 */                   return "ACTION_CLEAR_SELECTION";
                        case 16:
/* 133 */                   return "ACTION_CLICK";
                        case 32:
/* 130 */                   return "ACTION_LONG_CLICK";
                        case 64:
/* 127 */                   return "ACTION_ACCESSIBILITY_FOCUS";
                        case 128:
/* 124 */                   return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
/* 121 */                   return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        case NotificationCompat.FLAG_GROUP_SUMMARY /* 512 */:
/* 118 */                   return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        case Segment.SHARE_MINIMUM /* 1024 */:
/* 115 */                   return "ACTION_NEXT_HTML_ELEMENT";
                        case 2048:
/* 112 */                   return "ACTION_PREVIOUS_HTML_ELEMENT";
                        case 4096:
/* 109 */                   return "ACTION_SCROLL_FORWARD";
                        case Segment.SIZE /* 8192 */:
/* 106 */                   return "ACTION_SCROLL_BACKWARD";
                        case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
/* 103 */                   return "ACTION_COPY";
                        case 32768:
/* 100 */                   return "ACTION_PASTE";
                        case 65536:
/* 97 */                    return "ACTION_CUT";
                        case 131072:
/* 94 */                    return "ACTION_SET_SELECTION";
                        case 262144:
/* 91 */                    return "ACTION_EXPAND";
                        case 524288:
/* 88 */                    return "ACTION_COLLAPSE";
                        case 2097152:
/* 85 */                    return "ACTION_SET_TEXT";
                        case R.id.accessibilityActionMoveWindow:
/* 82 */                    return "ACTION_MOVE_WINDOW";
                        case R.id.accessibilityActionScrollInDirection:
/* 79 */                    return "ACTION_SCROLL_IN_DIRECTION";
                        default:
                            switch (i) {
                                case R.id.accessibilityActionShowOnScreen:
/* 76 */                            return "ACTION_SHOW_ON_SCREEN";
                                case R.id.accessibilityActionScrollToPosition:
/* 73 */                            return "ACTION_SCROLL_TO_POSITION";
                                case R.id.accessibilityActionScrollUp:
/* 70 */                            return "ACTION_SCROLL_UP";
                                case R.id.accessibilityActionScrollLeft:
/* 67 */                            return "ACTION_SCROLL_LEFT";
                                case R.id.accessibilityActionScrollDown:
/* 64 */                            return "ACTION_SCROLL_DOWN";
                                case R.id.accessibilityActionScrollRight:
/* 61 */                            return "ACTION_SCROLL_RIGHT";
                                case R.id.accessibilityActionContextClick:
/* 58 */                            return "ACTION_CONTEXT_CLICK";
                                case R.id.accessibilityActionSetProgress:
/* 55 */                            return "ACTION_SET_PROGRESS";
                                default:
                                    switch (i) {
                                        case R.id.accessibilityActionShowTooltip:
/* 52 */                                    return "ACTION_SHOW_TOOLTIP";
                                        case R.id.accessibilityActionHideTooltip:
/* 49 */                                    return "ACTION_HIDE_TOOLTIP";
                                        case R.id.accessibilityActionPageUp:
/* 46 */                                    return "ACTION_PAGE_UP";
                                        case R.id.accessibilityActionPageDown:
/* 43 */                                    return "ACTION_PAGE_DOWN";
                                        case R.id.accessibilityActionPageLeft:
/* 40 */                                    return "ACTION_PAGE_LEFT";
                                        case R.id.accessibilityActionPageRight:
/* 37 */                                    return "ACTION_PAGE_RIGHT";
                                        case R.id.accessibilityActionPressAndHold:
/* 34 */                                    return "ACTION_PRESS_AND_HOLD";
                                        default:
                                            switch (i) {
                                                case R.id.accessibilityActionImeEnter:
/* 31 */                                            return "ACTION_IME_ENTER";
                                                case R.id.accessibilityActionDragStart:
/* 28 */                                            return "ACTION_DRAG_START";
                                                case R.id.accessibilityActionDragDrop:
/* 25 */                                            return "ACTION_DRAG_DROP";
                                                case R.id.accessibilityActionDragCancel:
/* 22 */                                            return "ACTION_DRAG_CANCEL";
                                                default:
/* 19 */                                            return "ACTION_UNKNOWN";
                                            }
                                    }
                            }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m3621a(int i) {
/* 3 */             this.f7961a.addAction(i);
                }

                /* JADX INFO: renamed from: b */
                public final void m3622b(C2518z0 c2518z0) {
/* 7 */             this.f7961a.addAction((AccessibilityNodeInfo.AccessibilityAction) c2518z0.f19883a);
                }

                /* JADX INFO: renamed from: c */
                public final ArrayList m3623c(String str) {
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfo = this.f7961a;
/* 7 */             ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
/* 11 */            if (integerArrayList != null) {
/* 25 */                return integerArrayList;
                    }
/* 15 */            ArrayList<Integer> arrayList = new ArrayList<>();
/* 22 */            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
/* 25 */            return arrayList;
                }

                /* JADX INFO: renamed from: e */
                public final boolean m3624e(int i) {
/* 3 */             Bundle extras = this.f7961a.getExtras();
                    return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 5 */             if (obj == null || !(obj instanceof C0901f1)) {
/* 37 */                return false;
                    }
/* 13 */            C0901f1 c0901f1 = (C0901f1) obj;
/* 15 */            AccessibilityNodeInfo accessibilityNodeInfo = c0901f1.f7961a;
/* 17 */            AccessibilityNodeInfo accessibilityNodeInfo2 = this.f7961a;
/* 19 */            if (accessibilityNodeInfo2 == null) {
/* 21 */                if (accessibilityNodeInfo != null) {
/* 37 */                    return false;
                        }
                    } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
/* 37 */                return false;
                    }
                    return this.f7962b == c0901f1.f7962b;
                }

                /* JADX INFO: renamed from: f */
                public final void m3625f(Rect rect) {
/* 3 */             this.f7961a.getBoundsInParent(rect);
                }

                /* JADX INFO: renamed from: g */
                public final CharSequence m3626g() {
/* 7 */             boolean zIsEmpty = m3623c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
/* 11 */            AccessibilityNodeInfo accessibilityNodeInfo = this.f7961a;
/* 13 */            if (zIsEmpty) {
/* 127 */               return accessibilityNodeInfo.getText();
                    }
/* 15 */            ArrayList arrayListM3623c = m3623c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
/* 21 */            ArrayList arrayListM3623c2 = m3623c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
/* 27 */            ArrayList arrayListM3623c3 = m3623c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
/* 33 */            ArrayList arrayListM3623c4 = m3623c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
/* 56 */            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
/* 63 */            for (int i = 0; i < arrayListM3623c.size(); i++) {
/* 120 */               spannableString.setSpan(new C2127r0(((Integer) arrayListM3623c4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListM3623c.get(i)).intValue(), ((Integer) arrayListM3623c2.get(i)).intValue(), ((Integer) arrayListM3623c3.get(i)).intValue());
                    }
/* 126 */           return spannableString;
                }

                /* JADX INFO: renamed from: h */
                public final void m3627h(int i, boolean z) {
/* 3 */             Bundle extras = this.f7961a.getExtras();
/* 7 */             if (extras != null) {
/* 17 */                int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
/* 18 */                if (!z) {
/* 21 */                    i = 0;
                        }
/* 23 */                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
                    }
                }

                public final int hashCode() {
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfo = this.f7961a;
/* 3 */             if (accessibilityNodeInfo == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return accessibilityNodeInfo.hashCode();
                }

                /* JADX INFO: renamed from: i */
                public final void m3628i(CharSequence charSequence) {
/* 3 */             this.f7961a.setClassName(charSequence);
                }

                /* JADX INFO: renamed from: j */
                public final void m3629j(C0864e1 c0864e1) {
/* 7 */             this.f7961a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c0864e1.f7471a);
                }

                /* JADX INFO: renamed from: k */
                public final void m3630k(String str) {
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 5 */             AccessibilityNodeInfo accessibilityNodeInfo = this.f7961a;
/* 7 */             if (i >= 26) {
/* 1 */                 accessibilityNodeInfo.setHintText(str);
                    } else {
/* 19 */                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m3631l(boolean z) {
/* 3 */             this.f7961a.setScrollable(z);
                }

                /* JADX INFO: renamed from: m */
                public final void m3632m(CharSequence charSequence) {
/* 3 */             this.f7961a.setText(charSequence);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
                public final String toString() {
                    ?? arrayList;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 15 */            Rect rect = new Rect();
/* 18 */            m3625f(rect);
/* 35 */            sb.append("; boundsInParent: " + rect);
/* 38 */            AccessibilityNodeInfo accessibilityNodeInfo = this.f7961a;
/* 40 */            accessibilityNodeInfo.getBoundsInScreen(rect);
/* 57 */            sb.append("; boundsInScreen: " + rect);
/* 60 */            int i = Build.VERSION.SDK_INT;
/* 64 */            if (i >= 34) {
/* 66 */                AbstractC0200c1.m1473b(accessibilityNodeInfo, rect);
                    } else {
/* 80 */                Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
/* 82 */                if (rect2 != null) {
/* 92 */                    rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
                        }
                    }
/* 109 */           sb.append("; boundsInWindow: " + rect);
/* 114 */           sb.append("; packageName: ");
/* 121 */           sb.append(accessibilityNodeInfo.getPackageName());
/* 126 */           sb.append("; className: ");
/* 133 */           sb.append(accessibilityNodeInfo.getClassName());
/* 138 */           sb.append("; text: ");
/* 145 */           sb.append(m3626g());
/* 150 */           sb.append("; error: ");
/* 157 */           sb.append(accessibilityNodeInfo.getError());
/* 162 */           sb.append("; maxTextLength: ");
/* 169 */           sb.append(accessibilityNodeInfo.getMaxTextLength());
/* 174 */           sb.append("; stateDescription: ");
/* 196 */           sb.append(i >= 30 ? AbstractC0003a1.m15b(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
/* 201 */           sb.append("; contentDescription: ");
/* 208 */           sb.append(accessibilityNodeInfo.getContentDescription());
/* 213 */           sb.append("; tooltipText: ");
/* 235 */           sb.append(i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
/* 240 */           sb.append("; viewIdResName: ");
/* 247 */           sb.append(accessibilityNodeInfo.getViewIdResourceName());
/* 252 */           sb.append("; uniqueId: ");
/* 274 */           sb.append(i >= 33 ? AbstractC0164b1.m1194g(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
/* 279 */           sb.append("; checkable: ");
/* 286 */           sb.append(accessibilityNodeInfo.isCheckable());
/* 291 */           sb.append("; checked: ");
/* 298 */           sb.append(accessibilityNodeInfo.isChecked());
/* 303 */           sb.append("; focusable: ");
/* 310 */           sb.append(accessibilityNodeInfo.isFocusable());
/* 315 */           sb.append("; focused: ");
/* 322 */           sb.append(accessibilityNodeInfo.isFocused());
/* 327 */           sb.append("; selected: ");
/* 334 */           sb.append(accessibilityNodeInfo.isSelected());
/* 339 */           sb.append("; clickable: ");
/* 346 */           sb.append(accessibilityNodeInfo.isClickable());
/* 351 */           sb.append("; longClickable: ");
/* 358 */           sb.append(accessibilityNodeInfo.isLongClickable());
/* 363 */           sb.append("; contextClickable: ");
/* 370 */           sb.append(accessibilityNodeInfo.isContextClickable());
/* 375 */           sb.append("; enabled: ");
/* 382 */           sb.append(accessibilityNodeInfo.isEnabled());
/* 387 */           sb.append("; password: ");
/* 394 */           sb.append(accessibilityNodeInfo.isPassword());
/* 415 */           sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
/* 420 */           sb.append("; containerTitle: ");
/* 440 */           sb.append(i >= 34 ? AbstractC0200c1.m1474c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
/* 445 */           sb.append("; granularScrollingSupported: ");
/* 454 */           sb.append(m3624e(67108864));
/* 459 */           sb.append("; importantForAccessibility: ");
/* 466 */           sb.append(accessibilityNodeInfo.isImportantForAccessibility());
/* 471 */           sb.append("; visible: ");
/* 478 */           sb.append(accessibilityNodeInfo.isVisibleToUser());
/* 483 */           sb.append("; isTextSelectable: ");
/* 499 */           sb.append(i >= 33 ? AbstractC0164b1.m1195h(accessibilityNodeInfo) : m3624e(8388608));
/* 504 */           sb.append("; accessibilityDataSensitive: ");
/* 520 */           sb.append(i >= 34 ? AbstractC0200c1.m1477f(accessibilityNodeInfo) : m3624e(64));
/* 525 */           sb.append("; [");
/* 528 */           List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
/* 533 */           if (actionList != null) {
/* 537 */               arrayList = new ArrayList();
/* 540 */               int size = actionList.size();
/* 545 */               for (int i2 = 0; i2 < size; i2++) {
/* 560 */                   arrayList.add(new C2518z0(actionList.get(i2), 0, null, null, null));
                        }
                    } else {
/* 566 */               arrayList = Collections.EMPTY_LIST;
                    }
/* 572 */           for (int i3 = 0; i3 < arrayList.size(); i3++) {
/* 578 */               C2518z0 c2518z0 = (C2518z0) arrayList.get(i3);
/* 580 */               int iM10230a = c2518z0.m10230a();
/* 584 */               Object obj = c2518z0.f19883a;
/* 586 */               String strM3620d = m3620d(iM10230a);
/* 596 */               if (strM3620d.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
/* 613 */                   strM3620d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                        }
/* 617 */               sb.append(strM3620d);
/* 626 */               if (i3 != arrayList.size() - 1) {
/* 630 */                   sb.append(", ");
                        }
                    }
/* 638 */           sb.append("]");
/* 641 */           return sb.toString();
                }

/* 11 */        public C0901f1(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 14 */            this.f7961a = accessibilityNodeInfo;
                }
            }
