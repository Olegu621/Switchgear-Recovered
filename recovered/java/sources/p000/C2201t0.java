            package p000;

            import android.os.Bundle;
            import android.text.Spanned;
            import android.text.style.ClickableSpan;
            import android.util.SparseArray;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeProvider;
            import androidx.core.R$id;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.util.Collections;
            import java.util.List;
            
            /* JADX INFO: renamed from: t0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public class C2201t0 {

                /* JADX INFO: renamed from: c */
                public static final View.AccessibilityDelegate f16885c = new View.AccessibilityDelegate();

                /* JADX INFO: renamed from: a */
                public final View.AccessibilityDelegate f16886a;

                /* JADX INFO: renamed from: b */
                public final C2164s0 f16887b;

                public C2201t0(View.AccessibilityDelegate accessibilityDelegate) {
/* 4 */             this.f16886a = accessibilityDelegate;
/* 11 */            this.f16887b = new C2164s0(this);
                }

                /* JADX INFO: renamed from: a */
                public boolean mo1204a(View view, AccessibilityEvent accessibilityEvent) {
/* 3 */             return this.f16886a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                /* JADX INFO: renamed from: b */
                public qc3 mo1205b(View view) {
/* 3 */             AccessibilityNodeProvider accessibilityNodeProvider = this.f16886a.getAccessibilityNodeProvider(view);
/* 7 */             if (accessibilityNodeProvider != null) {
/* 12 */                return new qc3(accessibilityNodeProvider, 4);
                    }
/* 16 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public void mo127c(View view, AccessibilityEvent accessibilityEvent) {
/* 3 */             this.f16886a.onInitializeAccessibilityEvent(view, accessibilityEvent);
                }

                /* JADX INFO: renamed from: d */
                public void mo128d(View view, C0901f1 c0901f1) {
/* 5 */             this.f16886a.onInitializeAccessibilityNodeInfo(view, c0901f1.f7961a);
                }

                /* JADX INFO: renamed from: e */
                public void mo1206e(View view, AccessibilityEvent accessibilityEvent) {
/* 3 */             this.f16886a.onPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                /* JADX INFO: renamed from: f */
                public boolean mo1207f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
/* 3 */             return this.f16886a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                }

                /* JADX INFO: renamed from: g */
                public boolean mo129g(View view, int i, Bundle bundle) {
                    boolean zPerformAccessibilityAction;
                    WeakReference weakReference;
                    ClickableSpan clickableSpan;
/* 7 */             List list = (List) view.getTag(R$id.tag_accessibility_actions);
/* 9 */             if (list == null) {
/* 11 */                list = Collections.EMPTY_LIST;
                    }
/* 13 */            boolean z = false;
/* 14 */            int i2 = 0;
                    while (true) {
/* 20 */                if (i2 < list.size()) {
/* 26 */                    C2518z0 c2518z0 = (C2518z0) list.get(i2);
/* 32 */                    if (c2518z0.m10230a() == i) {
/* 34 */                        Class cls = c2518z0.f19885c;
/* 36 */                        InterfaceC2091q1 interfaceC2091q1 = c2518z0.f19886d;
/* 38 */                        if (interfaceC2091q1 != null) {
/* 40 */                            if (cls != null) {
                                        try {
/* 51 */                                    if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
/* 53 */                                        throw null;
                                            }
/* 61 */                                    throw new ClassCastException();
                                        } catch (Exception e) {
/* 74 */                                    AbstractC1245n0.m4877e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                                        }
                                    }
/* 77 */                            zPerformAccessibilityAction = interfaceC2091q1.mo2236j(view);
                                    break;
                                }
                            } else {
/* 82 */                        i2++;
                            }
                        }
/* 85 */                zPerformAccessibilityAction = false;
                        break;
                    }
/* 86 */            if (!zPerformAccessibilityAction) {
/* 90 */                zPerformAccessibilityAction = this.f16886a.performAccessibilityAction(view, i, bundle);
                    }
/* 94 */            if (zPerformAccessibilityAction || i != R$id.accessibility_action_clickable_span || bundle == null) {
/* 186 */               return zPerformAccessibilityAction;
                    }
/* 105 */           int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
/* 115 */           SparseArray sparseArray = (SparseArray) view.getTag(R$id.tag_accessibility_clickable_spans);
/* 117 */           if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
/* 139 */               CharSequence text = view.createAccessibilityNodeInfo().getText();
/* 161 */               ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
/* 164 */               for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
/* 175 */                   if (clickableSpan.equals(clickableSpanArr[i4])) {
/* 177 */                       clickableSpan.onClick(view);
/* 180 */                       z = true;
                                break;
                            }
                        }
                    }
/* 185 */           return z;
                }

                /* JADX INFO: renamed from: h */
                public void mo1208h(View view, int i) {
/* 3 */             this.f16886a.sendAccessibilityEvent(view, i);
                }

                /* JADX INFO: renamed from: i */
                public void mo1209i(View view, AccessibilityEvent accessibilityEvent) {
/* 3 */             this.f16886a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                }

/* 13 */        public C2201t0() {
/* 14 */            this(f16885c);
                }
            }
