            package p000;

            import android.os.Build;
            import android.text.Spannable;
            import android.text.SpannableString;
            import java.util.stream.IntStream;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class by2 implements Spannable {

                /* JADX INFO: renamed from: a */
                public boolean f2636a = false;

                /* JADX INFO: renamed from: b */
                public Spannable f2637b;

                public by2(Spannable spannable) {
/* 7 */             this.f2637b = spannable;
                }

                /* JADX INFO: renamed from: a */
                public final void m1469a() {
/* 1 */             Spannable spannable = this.f2637b;
/* 5 */             if (!this.f2636a) {
/* 30 */                if ((Build.VERSION.SDK_INT < 28 ? new q62(7) : new ay2(7)).mo1181c(spannable)) {
/* 37 */                    this.f2637b = new SpannableString(spannable);
                        }
                    }
/* 40 */            this.f2636a = true;
                }

                @Override // java.lang.CharSequence
                public final char charAt(int i) {
/* 3 */             return this.f2637b.charAt(i);
                }

                @Override // java.lang.CharSequence
                public final IntStream chars() {
/* 3 */             return this.f2637b.chars();
                }

                @Override // java.lang.CharSequence
                public final IntStream codePoints() {
/* 3 */             return this.f2637b.codePoints();
                }

                @Override // android.text.Spanned
                public final int getSpanEnd(Object obj) {
/* 3 */             return this.f2637b.getSpanEnd(obj);
                }

                @Override // android.text.Spanned
                public final int getSpanFlags(Object obj) {
/* 3 */             return this.f2637b.getSpanFlags(obj);
                }

                @Override // android.text.Spanned
                public final int getSpanStart(Object obj) {
/* 3 */             return this.f2637b.getSpanStart(obj);
                }

                @Override // android.text.Spanned
                public final Object[] getSpans(int i, int i2, Class cls) {
/* 3 */             return this.f2637b.getSpans(i, i2, cls);
                }

                @Override // java.lang.CharSequence
                public final int length() {
/* 3 */             return this.f2637b.length();
                }

                @Override // android.text.Spanned
                public final int nextSpanTransition(int i, int i2, Class cls) {
/* 3 */             return this.f2637b.nextSpanTransition(i, i2, cls);
                }

                @Override // android.text.Spannable
                public final void removeSpan(Object obj) {
/* 1 */             m1469a();
/* 6 */             this.f2637b.removeSpan(obj);
                }

                @Override // android.text.Spannable
                public final void setSpan(Object obj, int i, int i2, int i3) {
/* 1 */             m1469a();
/* 6 */             this.f2637b.setSpan(obj, i, i2, i3);
                }

                @Override // java.lang.CharSequence
                public final CharSequence subSequence(int i, int i2) {
/* 3 */             return this.f2637b.subSequence(i, i2);
                }

                @Override // java.lang.CharSequence
                public final String toString() {
/* 3 */             return this.f2637b.toString();
                }
            }
