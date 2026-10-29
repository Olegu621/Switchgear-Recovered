            package p000;

            import android.os.Build;
            import android.text.Editable;
            import android.text.SpanWatcher;
            import android.text.Spannable;
            import android.text.TextWatcher;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tf2 implements TextWatcher, SpanWatcher {

                /* JADX INFO: renamed from: a */
                public final Object f17081a;

                /* JADX INFO: renamed from: b */
                public final AtomicInteger f17082b = new AtomicInteger(0);

                public tf2(Object obj) {
/* 12 */            this.f17081a = obj;
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
/* 5 */             ((TextWatcher) this.f17081a).afterTextChanged(editable);
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
/* 5 */             ((TextWatcher) this.f17081a).beforeTextChanged(charSequence, i, i2, i3);
                }

                @Override // android.text.SpanWatcher
                public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
/* 7 */             if (this.f17082b.get() <= 0 || !(obj instanceof rs2)) {
/* 18 */                ((SpanWatcher) this.f17081a).onSpanAdded(spannable, obj, i, i2);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
  0x001c: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // android.text.SpanWatcher
                public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
                    int i5;
                    int i6;
/* 7 */             if (this.f17082b.get() <= 0 || !(obj instanceof rs2)) {
/* 18 */                if (Build.VERSION.SDK_INT >= 28) {
/* 29 */                    i5 = i;
/* 30 */                    i6 = i3;
                        } else {
/* 21 */                    if (i > i2) {
/* 23 */                        i = 0;
                            }
/* 24 */                    if (i3 > i4) {
/* 26 */                        i5 = i;
/* 27 */                        i6 = 0;
                            } else {
/* 29 */                        i5 = i;
/* 30 */                        i6 = i3;
                            }
                        }
/* 40 */                ((SpanWatcher) this.f17081a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                    }
                }

                @Override // android.text.SpanWatcher
                public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
/* 7 */             if (this.f17082b.get() <= 0 || !(obj instanceof rs2)) {
/* 18 */                ((SpanWatcher) this.f17081a).onSpanRemoved(spannable, obj, i, i2);
                    }
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
/* 5 */             ((TextWatcher) this.f17081a).onTextChanged(charSequence, i, i2, i3);
                }
            }
