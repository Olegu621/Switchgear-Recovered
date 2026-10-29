            package p000;

            import android.content.Context;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.GradientDrawable;
            import android.util.SparseArray;
            import android.view.LayoutInflater;
            import android.widget.LinearLayout;
            import androidx.constraintlayout.widget.C0075b;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import androidx.recyclerview.widget.LinearLayoutManager;
            import androidx.recyclerview.widget.RecyclerView;
            import com.usercentrics.sdk.p008ui.R$drawable;
            import com.usercentrics.sdk.p008ui.R$layout;
            import com.usercentrics.sdk.p008ui.components.UCImageView;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class iu2 extends ConstraintLayout {

                /* JADX INFO: renamed from: g0 */
                public final ew2 f11930g0;

                /* JADX INFO: renamed from: h0 */
                public final ra2 f11931h0;

                /* JADX INFO: renamed from: i0 */
                public final hk2 f11932i0;

                /* JADX INFO: renamed from: j0 */
                public final hk2 f11933j0;

                /* JADX INFO: renamed from: k0 */
                public final hk2 f11934k0;

                /* JADX INFO: renamed from: l0 */
                public final hk2 f11935l0;

                /* JADX INFO: renamed from: m0 */
                public final hk2 f11936m0;

                /* JADX INFO: renamed from: n0 */
                public final hk2 f11937n0;

                /* JADX INFO: renamed from: o0 */
                public final hk2 f11938o0;

                /* JADX INFO: renamed from: p0 */
                public final hk2 f11939p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iu2(z00 z00Var, ew2 ew2Var, ra2 ra2Var) throws Exception {
                    String str;
                    String str2;
                    String str3;
                    String str4;
/* 7 */             super(z00Var);
/* 1 */             wt2 wt2Var = ew2Var.f7907a;
/* 5 */             hk2 hk2Var = (hk2) ra2Var.f15958d;
/* 15 */            this.f1056a = new SparseArray();
/* 23 */            this.f1058b = new ArrayList(4);
/* 30 */            this.f1060c = new a00();
/* 32 */            int i = 0;
/* 33 */            this.f1062d = 0;
/* 35 */            this.f1064e = 0;
/* 40 */            this.f1066f = AbstractC0208c9.API_PRIORITY_OTHER;
/* 42 */            this.f1067i = AbstractC0208c9.API_PRIORITY_OTHER;
/* 45 */            this.f1068v = true;
/* 49 */            this.f1069w = 257;
/* 51 */            Drawable drawable = null;
/* 52 */            this.f1053U = null;
/* 54 */            this.f1054V = null;
/* 57 */            this.f1055W = -1;
/* 64 */            this.f1057a0 = new HashMap();
/* 71 */            this.f1059b0 = new SparseArray();
/* 78 */            this.f1061c0 = new C0075b(this, this);
/* 80 */            this.f1063d0 = 0;
/* 82 */            this.f1065e0 = 0;
/* 84 */            m515d(null, 0);
/* 87 */            this.f11930g0 = ew2Var;
/* 89 */            this.f11931h0 = ra2Var;
/* 101 */           this.f11932i0 = r51.m8065b(new hu2(this, 3));
/* 113 */           this.f11933j0 = r51.m8065b(new hu2(this, 5));
/* 126 */           this.f11934k0 = r51.m8065b(new hu2(this, 8));
/* 138 */           this.f11935l0 = r51.m8065b(new hu2(this, 7));
/* 149 */           this.f11936m0 = r51.m8065b(new hu2(this, 4));
/* 161 */           this.f11937n0 = r51.m8065b(new hu2(this, 6));
/* 173 */           this.f11938o0 = r51.m8065b(new hu2(this, 2));
/* 184 */           this.f11939p0 = r51.m8065b(new hu2(this, 1));
/* 186 */           Context context = getContext();
/* 190 */           context.getClass();
/* 199 */           int iM10219n = (int) yy1.m10219n(12.0f, context);
/* 200 */           setPaddingRelative(iM10219n, iM10219n, iM10219n, iM10219n);
/* 203 */           Context context2 = getContext();
/* 207 */           context2.getClass();
/* 210 */           LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
/* 214 */           layoutInflaterFrom.getClass();
/* 219 */           layoutInflaterFrom.inflate(R$layout.uc_cookie_dialog, this);
/* 228 */           UCTextView.m2794h(getUcCookieDialogTitle(), ew2Var, 12);
/* 237 */           UCTextView.m2794h(getUcCookieLoadingText(), ew2Var, 14);
/* 246 */           UCTextView.m2794h(getUcCookieTryAgainBtn(), ew2Var, 10);
/* 253 */           UCTextView.m2794h(getUcCookieRetryMessage(), ew2Var, 14);
/* 256 */           Context context3 = getContext();
/* 260 */           context3.getClass();
/* 265 */           Drawable drawableM6700p = mn0.m6700p(context3, R$drawable.uc_ic_close);
/* 269 */           if (drawableM6700p != null) {
/* 271 */               Integer num = wt2Var.f18806b;
/* 273 */               if (num != null) {
/* 286 */                   drawableM6700p.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
                        }
/* 289 */               drawable = drawableM6700p;
                    }
/* 294 */           getUcCookieDialogClose().setImageDrawable(drawable);
/* 297 */           Integer num2 = wt2Var.f18810f;
/* 299 */           if (num2 != null) {
/* 305 */               setBackgroundColor(num2.intValue());
                    }
/* 316 */           getUcCookieRetryBox().setBackground(m5556l());
/* 327 */           getUcCookieLoadingBox().setBackground(m5556l());
/* 330 */           UCTextView ucCookieDialogTitle = getUcCookieDialogTitle();
/* 338 */           hu1 hu1Var = (hu1) hk2Var.getValue();
/* 340 */           String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 349 */           ucCookieDialogTitle.setText((hu1Var == null || (str4 = hu1Var.f9325w) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : str4);
/* 352 */           UCTextView ucCookieLoadingText = getUcCookieLoadingText();
/* 360 */           hu1 hu1Var2 = (hu1) hk2Var.getValue();
/* 369 */           ucCookieLoadingText.setText((hu1Var2 == null || (str3 = hu1Var2.f9312j) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : str3);
/* 372 */           UCTextView ucCookieRetryMessage = getUcCookieRetryMessage();
/* 380 */           hu1 hu1Var3 = (hu1) hk2Var.getValue();
/* 389 */           ucCookieRetryMessage.setText((hu1Var3 == null || (str2 = hu1Var3.f9308f) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : str2);
/* 392 */           UCTextView ucCookieTryAgainBtn = getUcCookieTryAgainBtn();
/* 400 */           hu1 hu1Var4 = (hu1) hk2Var.getValue();
/* 402 */           if (hu1Var4 != null && (str = hu1Var4.f9326x) != null) {
/* 409 */               str5 = str;
                    }
/* 410 */           ucCookieTryAgainBtn.setText(str5);
/* 422 */           getUcCookieDialogClose().setOnClickListener(new gu2(this, i));
/* 425 */           m5557m();
                }

                private final UCImageView getUcCookieDialogClose() {
/* 3 */             Object value = this.f11939p0.getValue();
/* 7 */             value.getClass();
/* 10 */            return (UCImageView) value;
                }

                private final RecyclerView getUcCookieDialogList() {
/* 3 */             Object value = this.f11938o0.getValue();
/* 7 */             value.getClass();
/* 10 */            return (RecyclerView) value;
                }

                private final UCTextView getUcCookieDialogTitle() {
/* 3 */             Object value = this.f11932i0.getValue();
/* 7 */             value.getClass();
/* 10 */            return (UCTextView) value;
                }

                private final LinearLayout getUcCookieLoadingBox() {
/* 3 */             Object value = this.f11936m0.getValue();
/* 7 */             value.getClass();
/* 10 */            return (LinearLayout) value;
                }

                private final UCTextView getUcCookieLoadingText() {
/* 3 */             Object value = this.f11933j0.getValue();
/* 7 */             value.getClass();
/* 10 */            return (UCTextView) value;
                }

                private final LinearLayout getUcCookieRetryBox() {
/* 3 */             Object value = this.f11937n0.getValue();
/* 7 */             value.getClass();
/* 10 */            return (LinearLayout) value;
                }

                private final UCTextView getUcCookieRetryMessage() {
/* 3 */             Object value = this.f11935l0.getValue();
/* 7 */             value.getClass();
/* 10 */            return (UCTextView) value;
                }

                private final UCTextView getUcCookieTryAgainBtn() {
/* 3 */             Object value = this.f11934k0.getValue();
/* 7 */             value.getClass();
/* 10 */            return (UCTextView) value;
                }

                /* JADX INFO: renamed from: j */
                public static final void m5554j(iu2 iu2Var, List list) {
/* 7 */             iu2Var.getUcCookieLoadingBox().setVisibility(8);
/* 14 */            iu2Var.getUcCookieRetryBox().setVisibility(8);
/* 22 */            iu2Var.getUcCookieDialogList().setVisibility(0);
/* 36 */            iu2Var.getUcCookieDialogList().setAdapter(new i10(iu2Var.f11930g0, list));
/* 39 */            RecyclerView ucCookieDialogList = iu2Var.getUcCookieDialogList();
/* 45 */            iu2Var.getContext();
/* 52 */            ucCookieDialogList.setLayoutManager(new LinearLayoutManager(1));
                }

                /* JADX INFO: renamed from: k */
                public static final void m5555k(iu2 iu2Var) {
/* 7 */             iu2Var.getUcCookieLoadingBox().setVisibility(8);
/* 14 */            iu2Var.getUcCookieDialogList().setVisibility(8);
/* 22 */            iu2Var.getUcCookieRetryBox().setVisibility(0);
/* 35 */            iu2Var.getUcCookieTryAgainBtn().setOnClickListener(new gu2(iu2Var, 1));
                }

                /* JADX INFO: renamed from: l */
                public final GradientDrawable m5556l() {
/* 3 */             GradientDrawable gradientDrawable = new GradientDrawable();
/* 7 */             gradientDrawable.setShape(0);
/* 10 */            ew2 ew2Var = this.f11930g0;
/* 14 */            Integer num = ew2Var.f7907a.f18810f;
/* 24 */            gradientDrawable.setColor(num != null ? num.intValue() : -1);
/* 27 */            Context context = getContext();
/* 31 */            context.getClass();
/* 45 */            gradientDrawable.setStroke((int) yy1.m10219n(1.0f, context), ew2Var.f7907a.f18814j);
/* 48 */            return gradientDrawable;
                }

                /* JADX INFO: renamed from: m */
                public final void m5557m() throws Exception {
/* 6 */             getUcCookieLoadingBox().setVisibility(0);
/* 15 */            getUcCookieRetryBox().setVisibility(8);
/* 22 */            getUcCookieDialogList().setVisibility(8);
/* 29 */            C1983o c1983o = new C1983o(this, 21);
/* 34 */            hu2 hu2Var = new hu2(this, 0);
/* 37 */            ra2 ra2Var = this.f11931h0;
/* 39 */            ra2Var.getClass();
/* 44 */            tv1 tv1Var = (tv1) ra2Var.f15955a;
/* 46 */            List list = tv1Var.f17290c;
/* 48 */            String str = tv1Var.f17289b;
/* 50 */            if (str != null && str.length() != 0) {
/* 83 */                ((oz2) ((hk2) ra2Var.f15957c).getValue()).mo5632a(str, new C1983o(c1983o, 22), new C0908f8(hu2Var, 14));
                    } else {
/* 87 */                if (list == null || list.isEmpty()) {
/* 99 */                    return;
                        }
/* 96 */                c1983o.invoke(list);
                    }
                }
            }
