            package p000;

            import android.content.Context;
            import android.graphics.Typeface;
            import android.graphics.drawable.GradientDrawable;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.LinearLayout;
            import android.widget.PopupWindow;
            import android.widget.ScrollView;
            import com.usercentrics.sdk.p008ui.R$color;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import com.usercentrics.sdk.p008ui.secondLayer.component.header.UCSecondLayerHeader;
            import java.lang.ref.WeakReference;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class rp2 implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16221a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f16222b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f16223c;

                public /* synthetic */ rp2(int i, Object obj, Object obj2) {
/* 1 */             this.f16221a = i;
/* 3 */             this.f16222b = obj;
/* 5 */             this.f16223c = obj2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
/* 3 */             int i = this.f16221a;
/* 7 */             String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 12 */            AttributeSet attributeSet = null;
/* 13 */            Object obj = this.f16223c;
/* 15 */            Object obj2 = this.f16222b;
                    switch (i) {
                        case 0:
/* 497 */                   Function1 function1 = (Function1) obj2;
/* 499 */                   kw2 kw2Var = (kw2) obj;
/* 501 */                   if (function1 != null) {
/* 505 */                       function1.invoke(kw2Var.f13030a);
/* 508 */                       return;
                            }
/* 508 */                   return;
                        case 1:
/* 427 */                   su2 su2Var = (su2) obj2;
/* 429 */                   ev1 ev1Var = (ev1) obj;
/* 431 */                   fv1 fv1Var = ev1Var.f7894c;
/* 433 */                   int iOrdinal = fv1Var.ordinal();
/* 437 */                   Integer num = fv1Var.f8365a;
/* 439 */                   if (iOrdinal != 0) {
/* 441 */                       if (iOrdinal == 1) {
/* 451 */                           su2Var.m8642c(num);
/* 496 */                           return;
                                } else {
/* 444 */                           if (iOrdinal != 2) {
/* 496 */                               return;
                                    }
/* 447 */                           su2Var.m8642c(num);
/* 496 */                           return;
                                }
                            }
/* 455 */                   ts0 ts0Var = su2Var.f16809g;
/* 457 */                   String str2 = ev1Var.f7893b;
/* 471 */                   Context context = (Context) ((WeakReference) ((ra2) ts0Var.f17248a).f15958d).get();
/* 473 */                   if (context != null) {
/* 475 */                       if (str2 != null) {
/* 478 */                           str = str2;
                                }
/* 479 */                       mn0.m6707x(context, str);
                            }
/* 482 */                   ez2 ez2Var = ev1Var.f7895d;
/* 484 */                   fz2 ec0Var = qu1.f15757c;
/* 486 */                   if (ec0Var == null) {
/* 490 */                       ec0Var = new ec0(22);
                            }
/* 493 */                   ec0Var.mo3403b(ez2Var);
/* 496 */                   return;
                        case 2:
/* 362 */                   ev1 ev1Var2 = (ev1) obj;
/* 364 */                   int i2 = UCSecondLayerHeader.f6281w0;
/* 366 */                   qv2 qv2Var = ((UCSecondLayerHeader) obj2).f6294s0;
/* 368 */                   if (qv2Var == null) {
/* 423 */                       Intrinsics.m6220e("viewModel");
/* 426 */                       throw null;
                            }
/* 370 */                   yv2 yv2Var = qv2Var.f15783c;
/* 378 */                   if (ev1Var2.f7894c.ordinal() != 0) {
/* 422 */                       return;
                            }
/* 381 */                   ts0 ts0Var2 = yv2Var.f19834m;
/* 383 */                   String str3 = ev1Var2.f7893b;
/* 385 */                   if (str3 != null) {
/* 388 */                       str = str3;
                            }
/* 401 */                   Context context2 = (Context) ((WeakReference) ((ra2) ts0Var2.f17248a).f15958d).get();
/* 403 */                   if (context2 != null) {
/* 405 */                       mn0.m6707x(context2, str);
                            }
/* 408 */                   ez2 ez2Var2 = ev1Var2.f7895d;
/* 410 */                   fz2 ec0Var2 = qu1.f15757c;
/* 412 */                   if (ec0Var2 == null) {
/* 416 */                       ec0Var2 = new ec0(22);
                            }
/* 419 */                   ec0Var2.mo3403b(ez2Var2);
/* 422 */                   return;
                        default:
/* 21 */                    UCSecondLayerHeader uCSecondLayerHeader = (UCSecondLayerHeader) obj2;
/* 23 */                    ew2 ew2Var = (ew2) obj;
/* 25 */                    int i3 = UCSecondLayerHeader.f6281w0;
/* 27 */                    ew2Var.getClass();
/* 30 */                    qv2 qv2Var2 = uCSecondLayerHeader.f6294s0;
/* 32 */                    if (qv2Var2 == null) {
/* 354 */                       Intrinsics.m6220e("viewModel");
/* 357 */                       throw null;
                            }
/* 38 */                    cv1 cv1Var = (cv1) qv2Var2.f15781a.f15577f;
/* 40 */                    if (cv1Var == null) {
/* 345 */                       return;
                            }
/* 44 */                    List list = cv1Var.f6917a;
/* 50 */                    if (list.isEmpty()) {
/* 345 */                       return;
                            }
/* 56 */                    String str4 = cv1Var.f6918b.f2615a;
/* 60 */                    Context context3 = uCSecondLayerHeader.getContext();
/* 64 */                    context3.getClass();
/* 67 */                    i51 i51Var = new i51(context3, ew2Var);
/* 84 */                    i51Var.f9451c = new n01(1, uCSecondLayerHeader, UCSecondLayerHeader.class, "onLanguageSelected", "onLanguageSelected(Ljava/lang/String;)V", 0, 5);
/* 86 */                    view.getClass();
/* 89 */                    str4.getClass();
/* 94 */                    ScrollView scrollView = new ScrollView(context3);
/* 103 */                   LinearLayout linearLayout = new LinearLayout(scrollView.getContext());
/* 108 */                   linearLayout.setId(R$id.ucLanguagesAvailable);
/* 111 */                   linearLayout.setOrientation(1);
/* 132 */                   linearLayout.setPaddingRelative(i51Var.m4473a(), yy1.m10220o(context3, 16), i51Var.m4473a(), yy1.m10220o(context3, 16));
/* 135 */                   Iterator it = list.iterator();
                            while (true) {
/* 143 */                       bv1 bv1Var = (bv1) it.next();
/* 145 */                       boolean zHasNext = it.hasNext();
/* 158 */                       int iM10220o = zHasNext ? yy1.m10220o(i51Var.f9449a, 16) : i51Var.m4473a();
/* 164 */                       boolean zEquals = str4.equals(bv1Var.f2615a);
/* 170 */                       UCTextView uCTextView = new UCTextView(context3, attributeSet);
/* 175 */                       uCTextView.setTextSize(16.0f);
/* 180 */                       uCTextView.setText(bv1Var.f2616b);
/* 185 */                       uCTextView.setTag(bv1Var.f2615a);
/* 196 */                       AttributeSet attributeSet2 = attributeSet;
/* 202 */                       uCTextView.setPaddingRelative(i51Var.m4473a(), i51Var.m4473a(), i51Var.m4473a(), iM10220o);
/* 205 */                       wt2 wt2Var = ew2Var.f7907a;
/* 207 */                       Integer num2 = wt2Var.f18805a;
/* 226 */                       uCTextView.setTextColor(num2 != null ? num2.intValue() : v00.getColor(uCTextView.getContext(), R$color.ucDarkGray));
/* 235 */                       uCTextView.setOnClickListener(new h51(i51Var, 0));
/* 240 */                       uCTextView.setTypeface(Typeface.DEFAULT, zEquals ? 1 : 0);
/* 243 */                       linearLayout.addView(uCTextView);
/* 246 */                       if (!zHasNext) {
/* 248 */                           scrollView.addView(linearLayout);
/* 251 */                           PopupWindow popupWindow = i51Var.f9450b;
/* 253 */                           popupWindow.setContentView(scrollView);
/* 263 */                           popupWindow.setWidth((int) yy1.m10219n(200.0f, context3));
/* 267 */                           popupWindow.setHeight(-2);
/* 270 */                           popupWindow.setInputMethodMode(0);
/* 273 */                           popupWindow.setSoftInputMode(1);
/* 276 */                           popupWindow.setFocusable(true);
/* 279 */                           popupWindow.setOutsideTouchable(true);
/* 282 */                           popupWindow.setOnDismissListener(i51Var);
/* 291 */                           popupWindow.setElevation(yy1.m10219n(12.0f, context3));
/* 296 */                           GradientDrawable gradientDrawable = new GradientDrawable();
/* 305 */                           gradientDrawable.setCornerRadius(yy1.m10219n(4.0f, context3));
/* 308 */                           Integer num3 = wt2Var.f18809e;
/* 318 */                           gradientDrawable.setColor(num3 != null ? num3.intValue() : -1);
/* 330 */                           gradientDrawable.setStroke((int) yy1.m10219n(1.0f, context3), wt2Var.f18814j);
/* 333 */                           popupWindow.setBackgroundDrawable(gradientDrawable);
/* 342 */                           popupWindow.showAsDropDown(view, view.getWidth(), 0, 0);
/* 345 */                           return;
                                }
/* 348 */                       attributeSet = attributeSet2;
                            }
                            break;
                    }
                }
            }
