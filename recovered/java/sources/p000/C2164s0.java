            package p000;

            import android.os.Build;
            import android.os.Bundle;
            import android.text.Spanned;
            import android.text.style.ClickableSpan;
            import android.util.SparseArray;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.view.accessibility.AccessibilityNodeProvider;
            import androidx.core.R$id;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: s0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2164s0 extends View.AccessibilityDelegate {

                /* JADX INFO: renamed from: a */
                public final C2201t0 f16369a;

                public C2164s0(C2201t0 c2201t0) {
/* 4 */             this.f16369a = c2201t0;
                }

                @Override // android.view.View.AccessibilityDelegate
                public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
/* 3 */             return this.f16369a.mo1204a(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
/* 3 */             qc3 qc3VarMo1205b = this.f16369a.mo1205b(view);
/* 7 */             if (qc3VarMo1205b != null) {
/* 11 */                return (AccessibilityNodeProvider) qc3VarMo1205b.f15492b;
                    }
/* 14 */            return null;
                }

                @Override // android.view.View.AccessibilityDelegate
                public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
/* 3 */             this.f16369a.mo127c(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    Object tag;
                    Object tag2;
                    Object tag3;
                    Object tag4;
                    int iKeyAt;
/* 3 */             C0901f1 c0901f1 = new C0901f1(accessibilityNodeInfo);
/* 6 */             WeakHashMap weakHashMap = e33.f7494a;
/* 8 */             int i = R$id.tag_screen_reader_focusable;
/* 17 */            if (Build.VERSION.SDK_INT >= 28) {
/* 23 */                tag = Boolean.valueOf(x23.m9688d(view));
                    } else {
/* 28 */                tag = view.getTag(i);
/* 36 */                if (!Boolean.class.isInstance(tag)) {
/* 39 */                    tag = null;
                        }
                    }
/* 40 */            Boolean bool = (Boolean) tag;
/* 54 */            boolean z = bool != null && bool.booleanValue();
/* 55 */            int i2 = Build.VERSION.SDK_INT;
/* 57 */            if (i2 >= 28) {
/* 1 */                 accessibilityNodeInfo.setScreenReaderFocusable(z);
                    } else {
/* 63 */                c0901f1.m3627h(1, z);
                    }
/* 66 */            int i3 = R$id.tag_accessibility_heading;
/* 70 */            if (Build.VERSION.SDK_INT >= 28) {
/* 76 */                tag2 = Boolean.valueOf(x23.m9687c(view));
                    } else {
/* 81 */                tag2 = view.getTag(i3);
/* 89 */                if (!Boolean.class.isInstance(tag2)) {
/* 92 */                    tag2 = null;
                        }
                    }
/* 93 */            Boolean bool2 = (Boolean) tag2;
/* 95 */            boolean z2 = bool2 != null && bool2.booleanValue();
/* 105 */           if (i2 >= 28) {
/* 1 */                 accessibilityNodeInfo.setHeading(z2);
                    } else {
/* 112 */               c0901f1.m3627h(2, z2);
                    }
/* 115 */           int i4 = R$id.tag_accessibility_pane_title;
/* 119 */           if (i2 >= 28) {
/* 121 */               tag3 = x23.m9686b(view);
                    } else {
/* 126 */               tag3 = view.getTag(i4);
/* 134 */               if (!CharSequence.class.isInstance(tag3)) {
/* 137 */                   tag3 = null;
                        }
                    }
/* 138 */           CharSequence charSequence = (CharSequence) tag3;
/* 140 */           if (i2 >= 28) {
/* 1 */                 accessibilityNodeInfo.setPaneTitle(charSequence);
                    } else {
/* 152 */               accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                    }
/* 155 */           int i5 = R$id.tag_state_description;
/* 161 */           if (Build.VERSION.SDK_INT >= 30) {
/* 163 */               tag4 = z23.m10262b(view);
                    } else {
/* 168 */               tag4 = view.getTag(i5);
/* 176 */               if (!CharSequence.class.isInstance(tag4)) {
/* 179 */                   tag4 = null;
                        }
                    }
/* 180 */           CharSequence charSequence2 = (CharSequence) tag4;
/* 182 */           if (i2 >= 30) {
/* 184 */               AbstractC0003a1.m16c(accessibilityNodeInfo, charSequence2);
                    } else {
/* 194 */               accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
                    }
/* 199 */           this.f16369a.mo128d(view, c0901f1);
/* 202 */           CharSequence text = accessibilityNodeInfo.getText();
/* 208 */           if (i2 < 26) {
/* 216 */               accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
/* 225 */               accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
/* 234 */               accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
/* 243 */               accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
/* 252 */               SparseArray sparseArray = (SparseArray) view.getTag(R$id.tag_accessibility_clickable_spans);
/* 254 */               if (sparseArray != null) {
/* 258 */                   ArrayList arrayList = new ArrayList();
/* 266 */                   for (int i6 = 0; i6 < sparseArray.size(); i6++) {
/* 278 */                       if (((WeakReference) sparseArray.valueAt(i6)).get() == null) {
/* 284 */                           arrayList.add(Integer.valueOf(i6));
                                }
                            }
/* 295 */                   for (int i7 = 0; i7 < arrayList.size(); i7++) {
/* 307 */                       sparseArray.remove(((Integer) arrayList.get(i7)).intValue());
                            }
                        }
/* 331 */               ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
/* 333 */               if (clickableSpanArr != null && clickableSpanArr.length > 0) {
/* 346 */                   accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R$id.accessibility_action_clickable_span);
/* 355 */                   SparseArray sparseArray2 = (SparseArray) view.getTag(R$id.tag_accessibility_clickable_spans);
/* 357 */                   if (sparseArray2 == null) {
/* 361 */                       sparseArray2 = new SparseArray();
/* 366 */                       view.setTag(R$id.tag_accessibility_clickable_spans, sparseArray2);
                            }
/* 371 */                   for (int i8 = 0; i8 < clickableSpanArr.length; i8++) {
/* 373 */                       ClickableSpan clickableSpan = clickableSpanArr[i8];
/* 375 */                       int i9 = 0;
                                while (true) {
/* 380 */                           if (i9 >= sparseArray2.size()) {
/* 408 */                               iKeyAt = C0901f1.f7960c;
/* 412 */                               C0901f1.f7960c = iKeyAt + 1;
                                        break;
                                    } else {
/* 398 */                               if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i9)).get())) {
/* 400 */                                   iKeyAt = sparseArray2.keyAt(i9);
                                            break;
                                        }
/* 405 */                               i9++;
                                    }
                                }
/* 421 */                       sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i8]));
/* 424 */                       ClickableSpan clickableSpan2 = clickableSpanArr[i8];
/* 427 */                       Spanned spanned = (Spanned) text;
/* 441 */                       c0901f1.m3623c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
/* 456 */                       c0901f1.m3623c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
/* 471 */                       c0901f1.m3623c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
/* 482 */                       c0901f1.m3623c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                            }
                        }
                    }
/* 494 */           List list = (List) view.getTag(R$id.tag_accessibility_actions);
/* 496 */           if (list == null) {
/* 498 */               list = Collections.EMPTY_LIST;
                    }
/* 504 */           for (int i10 = 0; i10 < list.size(); i10++) {
/* 512 */               c0901f1.m3622b((C2518z0) list.get(i10));
                    }
                }

                @Override // android.view.View.AccessibilityDelegate
                public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
/* 3 */             this.f16369a.mo1206e(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
/* 3 */             return this.f16369a.mo1207f(viewGroup, view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
/* 3 */             return this.f16369a.mo129g(view, i, bundle);
                }

                @Override // android.view.View.AccessibilityDelegate
                public final void sendAccessibilityEvent(View view, int i) {
/* 3 */             this.f16369a.mo1208h(view, i);
                }

                @Override // android.view.View.AccessibilityDelegate
                public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
/* 3 */             this.f16369a.mo1209i(view, accessibilityEvent);
                }
            }
