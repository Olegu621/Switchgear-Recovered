            package com.usercentrics.sdk.p008ui.components;

            import android.content.Context;
            import android.graphics.Typeface;
            import android.text.SpannableString;
            import android.text.Spanned;
            import android.text.TextPaint;
            import android.text.style.URLSpan;
            import android.util.AttributeSet;
            import androidx.appcompat.widget.AppCompatTextView;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import kotlin.text.C1852e;
            import okhttp3.HttpUrl;
            import p000.bw2;
            import p000.cw2;
            import p000.ew2;
            import p000.vu0;
            import p000.wt2;
            import p000.wu2;
            import p000.xu1;
            import p000.yu1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0003\u0011\u0012\u0013B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/components/UCTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", HttpUrl.FRAGMENT_ENCODE_SET, "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", HttpUrl.FRAGMENT_ENCODE_SET, "htmlText", HttpUrl.FRAGMENT_ENCODE_SET, "setHtmlTextWithNoLinks", "(Ljava/lang/String;)V", "Companion", "bw2", "ExternalLinkSpan", "cw2", "usercentrics-ui_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
/* 7 */     public class UCTextView extends AppCompatTextView {
                public static final bw2 Companion = new bw2();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/components/UCTextView$ExternalLinkSpan;", "Landroid/text/style/URLSpan;", "usercentrics-ui_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class ExternalLinkSpan extends URLSpan {

                    /* JADX INFO: renamed from: a */
                    public final boolean f6251a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ExternalLinkSpan(String str, boolean z) {
/* 4 */                 super(str);
/* 1 */                 str.getClass();
/* 7 */                 this.f6251a = z;
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
/* 1 */                 textPaint.getClass();
/* 4 */                 super.updateDrawState(textPaint);
/* 9 */                 textPaint.setUnderlineText(this.f6251a);
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public UCTextView(Context context, AttributeSet attributeSet) {
/* 5 */             this(context, attributeSet, 0);
/* 1 */             context.getClass();
                }

                /* JADX INFO: renamed from: h */
                public static void m2794h(UCTextView uCTextView, ew2 ew2Var, int i) {
                    Integer num;
/* 9 */             boolean z = (i & 2) == 0;
/* 16 */            boolean z2 = (i & 4) == 0;
/* 19 */            boolean z3 = (i & 8) == 0;
/* 23 */            uCTextView.getClass();
/* 26 */            ew2Var.getClass();
/* 29 */            wu2 wu2Var = ew2Var.f7908b;
/* 31 */            wt2 wt2Var = ew2Var.f7907a;
/* 33 */            Integer num2 = wt2Var.f18812h;
/* 35 */            if (z) {
/* 39 */                uCTextView.setTypeface(Typeface.DEFAULT, 1);
                    } else {
/* 45 */                uCTextView.setTypeface(Typeface.DEFAULT);
                    }
/* 48 */            if (z2) {
/* 50 */                num = num2;
                    } else {
/* 57 */                num = z3 ? wt2Var.f18806b : wt2Var.f18805a;
                    }
/* 59 */            if (num != null) {
/* 65 */                uCTextView.setTextColor(num.intValue());
                    }
/* 68 */            if (num2 != null) {
/* 74 */                uCTextView.setLinkTextColor(num2.intValue());
                    }
/* 82 */            uCTextView.setTextSize(2, wu2Var.f18822a.f17726b);
/* 85 */            uCTextView.setPaintFlags(1);
                }

                /* JADX INFO: renamed from: i */
                public static void m2795i(UCTextView uCTextView, ew2 ew2Var, int i) {
                    Integer num;
/* 9 */             boolean z = (i & 2) == 0;
/* 16 */            boolean z2 = (i & 4) == 0;
/* 23 */            boolean z3 = (i & 8) == 0;
/* 26 */            boolean z4 = (i & 16) == 0;
/* 30 */            uCTextView.getClass();
/* 33 */            ew2Var.getClass();
/* 36 */            wu2 wu2Var = ew2Var.f7908b;
/* 38 */            if (z2) {
/* 42 */                uCTextView.setTypeface(Typeface.DEFAULT, 1);
                    } else {
/* 48 */                uCTextView.setTypeface(Typeface.DEFAULT);
                    }
/* 51 */            wt2 wt2Var = ew2Var.f7907a;
/* 58 */            uCTextView.setTextSize(2, wu2Var.f18822a.f17727c);
/* 61 */            if (z4) {
/* 63 */                num = wt2Var.f18812h;
                    } else {
/* 71 */                num = z3 ? wt2Var.f18806b : wt2Var.f18805a;
                    }
/* 73 */            if (num != null) {
/* 79 */                uCTextView.setTextColor(num.intValue());
                    }
/* 86 */            uCTextView.setPaintFlags(z ? 9 : 1);
                }

                /* JADX INFO: renamed from: g */
                public final void m2796g(String str, Function1 function1) {
                    yu1 yu1Var;
/* 1 */             str.getClass();
/* 5 */             Spanned spannedM9346a = vu0.m9346a(str, 0);
/* 9 */             spannedM9346a.getClass();
/* 14 */            SpannableString spannableString = new SpannableString(spannedM9346a);
/* 27 */            URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
/* 29 */            uRLSpanArr.getClass();
/* 34 */            for (URLSpan uRLSpan : uRLSpanArr) {
/* 38 */                xu1 xu1Var = yu1.Companion;
/* 40 */                String url = uRLSpan.getURL();
/* 44 */                url.getClass();
/* 47 */                xu1Var.getClass();
/* 50 */                yu1[] yu1VarArrValues = yu1.values();
/* 54 */                int length = yu1VarArrValues.length;
/* 55 */                int i = 0;
                        while (true) {
/* 56 */                    if (i >= length) {
/* 72 */                        yu1Var = null;
                                break;
                            }
/* 58 */                    yu1Var = yu1VarArrValues[i];
/* 66 */                    if (yu1Var.f19815a.equalsIgnoreCase(url)) {
                                break;
                            } else {
/* 69 */                        i++;
                            }
                        }
/* 76 */                if (yu1Var != null) {
/* 80 */                    cw2 cw2Var = new cw2(yu1Var, function1, true);
/* 83 */                    int spanStart = spannableString.getSpanStart(uRLSpan);
/* 87 */                    int spanEnd = spannableString.getSpanEnd(uRLSpan);
/* 91 */                    spannableString.removeSpan(uRLSpan);
/* 94 */                    spannableString.setSpan(cw2Var, spanStart, spanEnd, 33);
                        } else {
/* 98 */                    String url2 = uRLSpan.getURL();
/* 102 */                   url2.getClass();
/* 111 */                   if (C1852e.m6263m(url2, "javascript:UC_UI", false)) {
/* 113 */                       spannableString.removeSpan(uRLSpan);
                            } else {
/* 119 */                       String url3 = uRLSpan.getURL();
/* 123 */                       url3.getClass();
/* 126 */                       ExternalLinkSpan externalLinkSpan = new ExternalLinkSpan(url3, true);
/* 129 */                       int spanStart2 = spannableString.getSpanStart(uRLSpan);
/* 133 */                       int spanEnd2 = spannableString.getSpanEnd(uRLSpan);
/* 137 */                       spannableString.removeSpan(uRLSpan);
/* 140 */                       spannableString.setSpan(externalLinkSpan, spanStart2, spanEnd2, 33);
                            }
                        }
                    }
/* 146 */           setText(spannableString);
                }

                /* JADX INFO: renamed from: j */
                public final void m2797j(ew2 ew2Var) {
/* 1 */             ew2Var.getClass();
/* 6 */             setTypeface(Typeface.DEFAULT);
/* 11 */            Integer num = ew2Var.f7907a.f18806b;
/* 13 */            if (num != null) {
/* 19 */                setTextColor(num.intValue());
                    }
/* 29 */            setTextSize(2, ew2Var.f7908b.f18822a.f17728d);
/* 33 */            setPaintFlags(1);
                }

                /* JADX INFO: renamed from: k */
                public final void m2798k(ew2 ew2Var) {
/* 1 */             ew2Var.getClass();
/* 7 */             setTypeface(Typeface.DEFAULT, 1);
/* 12 */            Integer num = ew2Var.f7907a.f18805a;
/* 14 */            if (num != null) {
/* 20 */                setTextColor(num.intValue());
                    }
/* 30 */            setTextSize(2, ew2Var.f7908b.f18822a.f17725a);
/* 33 */            setPaintFlags(1);
                }

                public final void setHtmlTextWithNoLinks(String htmlText) {
/* 1 */             htmlText.getClass();
/* 5 */             Spanned spannedM9346a = vu0.m9346a(htmlText, 0);
/* 9 */             spannedM9346a.getClass();
/* 14 */            SpannableString spannableString = new SpannableString(spannedM9346a);
/* 27 */            URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
/* 29 */            uRLSpanArr.getClass();
/* 33 */            for (URLSpan uRLSpan : uRLSpanArr) {
/* 37 */                spannableString.removeSpan(uRLSpan);
                    }
/* 43 */            setText(spannableString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 8 */         public UCTextView(Context context, AttributeSet attributeSet, int i) {
/* 9 */             super(context, attributeSet, i);
                    context.getClass();
                }
            }
