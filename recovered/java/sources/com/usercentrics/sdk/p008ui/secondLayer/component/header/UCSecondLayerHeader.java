            package com.usercentrics.sdk.p008ui.secondLayer.component.header;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.Typeface;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.text.method.LinkMovementMethod;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewStub;
            import android.widget.ProgressBar;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import androidx.viewpager.widget.ViewPager;
            import com.google.android.material.tabs.TabLayout;
            import com.usercentrics.sdk.p008ui.R$dimen;
            import com.usercentrics.sdk.p008ui.R$drawable;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.R$layout;
            import com.usercentrics.sdk.p008ui.components.UCImageView;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.C1983o;
            import p000.C2085pw;
            import p000.C2122qw;
            import p000.au1;
            import p000.cv1;
            import p000.ds0;
            import p000.ej0;
            import p000.ev1;
            import p000.ew2;
            import p000.h51;
            import p000.hk2;
            import p000.im2;
            import p000.mm2;
            import p000.mn0;
            import p000.n01;
            import p000.nd0;
            import p000.nk2;
            import p000.ov2;
            import p000.qv2;
            import p000.r51;
            import p000.rp2;
            import p000.uv2;
            import p000.wt2;
            import p000.wu2;
            import p000.xe2;
            import p000.yv2;
            import p000.yy1;
            import p000.yz2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001CB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fR#\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001d\u001a\n \u0013*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR#\u0010 \u001a\n \u0013*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u001cR#\u0010%\u001a\n \u0013*\u0004\u0018\u00010!0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010$R#\u0010(\u001a\n \u0013*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u001cR#\u0010+\u001a\n \u0013*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010\u001cR#\u00100\u001a\n \u0013*\u0004\u0018\u00010,0,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0015\u001a\u0004\b.\u0010/R#\u00103\u001a\n \u0013*\u0004\u0018\u00010,0,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0015\u001a\u0004\b2\u0010/R#\u00108\u001a\n \u0013*\u0004\u0018\u000104048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0015\u001a\u0004\b6\u00107R#\u0010=\u001a\n \u0013*\u0004\u0018\u000109098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u0015\u001a\u0004\b;\u0010<R#\u0010B\u001a\n \u0013*\u0004\u0018\u00010>0>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0015\u001a\u0004\b@\u0010A¨\u0006D"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", HttpUrl.FRAGMENT_ENCODE_SET, "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lew2;", "theme", HttpUrl.FRAGMENT_ENCODE_SET, "setupLanguage", "(Lew2;)V", "setupBackButton", "setupCloseButton", "Landroid/view/ViewStub;", "kotlin.jvm.PlatformType", "g0", "Lp51;", "getStubView", "()Landroid/view/ViewStub;", "stubView", "Lcom/usercentrics/sdk/ui/components/UCImageView;", "i0", "getUcHeaderLogo", "()Lcom/usercentrics/sdk/ui/components/UCImageView;", "ucHeaderLogo", "j0", "getUcHeaderLanguageIcon", "ucHeaderLanguageIcon", "Landroid/widget/ProgressBar;", "k0", "getUcHeaderLanguageLoading", "()Landroid/widget/ProgressBar;", "ucHeaderLanguageLoading", "l0", "getUcHeaderBackButton", "ucHeaderBackButton", "m0", "getUcHeaderCloseButton", "ucHeaderCloseButton", "Lcom/usercentrics/sdk/ui/components/UCTextView;", "n0", "getUcHeaderTitle", "()Lcom/usercentrics/sdk/ui/components/UCTextView;", "ucHeaderTitle", "o0", "getUcHeaderDescription", "ucHeaderDescription", "Landroid/view/ViewGroup;", "p0", "getUcHeaderLinks", "()Landroid/view/ViewGroup;", "ucHeaderLinks", "Lcom/google/android/material/tabs/TabLayout;", "q0", "getUcHeaderTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "ucHeaderTabLayout", "Landroid/view/View;", "r0", "getUcHeaderContentDivider", "()Landroid/view/View;", "ucHeaderContentDivider", "mm2", "usercentrics-ui_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
/* 196 */   public final class UCSecondLayerHeader extends ConstraintLayout {

                /* JADX INFO: renamed from: w0 */
                public static final /* synthetic */ int f6281w0 = 0;

                /* JADX INFO: renamed from: g0 */
                public final hk2 f6282g0;

                /* JADX INFO: renamed from: h0 */
                public View f6283h0;

                /* JADX INFO: renamed from: i0 */
                public final hk2 f6284i0;

                /* JADX INFO: renamed from: j0 */
                public final hk2 f6285j0;

                /* JADX INFO: renamed from: k0 */
                public final hk2 f6286k0;

                /* JADX INFO: renamed from: l0 */
                public final hk2 f6287l0;

                /* JADX INFO: renamed from: m0 */
                public final hk2 f6288m0;

                /* JADX INFO: renamed from: n0 */
                public final hk2 f6289n0;

                /* JADX INFO: renamed from: o0 */
                public final hk2 f6290o0;

                /* JADX INFO: renamed from: p0 */
                public final hk2 f6291p0;

                /* JADX INFO: renamed from: q0 */
                public final hk2 f6292q0;

                /* JADX INFO: renamed from: r0 */
                public final hk2 f6293r0;

                /* JADX INFO: renamed from: s0 */
                public qv2 f6294s0;

                /* JADX INFO: renamed from: t0 */
                public boolean f6295t0;

                /* JADX INFO: renamed from: u0 */
                public final int f6296u0;

                /* JADX INFO: renamed from: v0 */
                public final int f6297v0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UCSecondLayerHeader(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             context.getClass();
/* 17 */            this.f6282g0 = r51.m8065b(new ov2(this, 0));
/* 30 */            this.f6284i0 = r51.m8065b(new ov2(this, 8));
/* 42 */            this.f6285j0 = r51.m8065b(new ov2(this, 5));
/* 54 */            this.f6286k0 = r51.m8065b(new ov2(this, 6));
/* 66 */            this.f6287l0 = r51.m8065b(new ov2(this, 1));
/* 78 */            this.f6288m0 = r51.m8065b(new ov2(this, 2));
/* 91 */            this.f6289n0 = r51.m8065b(new ov2(this, 10));
/* 103 */           this.f6290o0 = r51.m8065b(new ov2(this, 4));
/* 115 */           this.f6291p0 = r51.m8065b(new ov2(this, 7));
/* 128 */           this.f6292q0 = r51.m8065b(new ov2(this, 9));
/* 140 */           this.f6293r0 = r51.m8065b(new ov2(this, 3));
/* 142 */           Context context2 = getContext();
/* 146 */           context2.getClass();
/* 156 */           this.f6296u0 = (int) yy1.m10219n(2.0f, context2);
/* 168 */           this.f6297v0 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerLinksHorizontalSpacing);
/* 176 */           LayoutInflater.from(context).inflate(R$layout.uc_header, this);
/* 183 */           getUcHeaderTabLayout().setTabIndicatorFullWidth(false);
/* 194 */           getUcHeaderDescription().setMovementMethod(LinkMovementMethod.getInstance());
                }

                private final ViewStub getStubView() {
/* 7 */             return (ViewStub) this.f6282g0.getValue();
                }

                private final UCImageView getUcHeaderBackButton() {
/* 7 */             return (UCImageView) this.f6287l0.getValue();
                }

                private final UCImageView getUcHeaderCloseButton() {
/* 7 */             return (UCImageView) this.f6288m0.getValue();
                }

                private final View getUcHeaderContentDivider() {
/* 7 */             return (View) this.f6293r0.getValue();
                }

                private final UCTextView getUcHeaderDescription() {
/* 7 */             return (UCTextView) this.f6290o0.getValue();
                }

                private final UCImageView getUcHeaderLanguageIcon() {
/* 7 */             return (UCImageView) this.f6285j0.getValue();
                }

                private final ProgressBar getUcHeaderLanguageLoading() {
/* 7 */             return (ProgressBar) this.f6286k0.getValue();
                }

                private final ViewGroup getUcHeaderLinks() {
/* 7 */             return (ViewGroup) this.f6291p0.getValue();
                }

                private final UCImageView getUcHeaderLogo() {
/* 7 */             return (UCImageView) this.f6284i0.getValue();
                }

                private final TabLayout getUcHeaderTabLayout() {
/* 7 */             return (TabLayout) this.f6292q0.getValue();
                }

                private final UCTextView getUcHeaderTitle() {
/* 7 */             return (UCTextView) this.f6289n0.getValue();
                }

                /* JADX INFO: renamed from: j */
                public static final void m2813j(UCSecondLayerHeader uCSecondLayerHeader, String str) {
/* 1 */             qv2 qv2Var = uCSecondLayerHeader.f6294s0;
/* 6 */             if (qv2Var == null) {
/* 76 */                Intrinsics.m6220e("viewModel");
/* 79 */                throw null;
                    }
/* 12 */            cv1 cv1Var = (cv1) qv2Var.f15781a.f15577f;
/* 14 */            if (cv1Var == null || Intrinsics.m6216a(str, cv1Var.f6918b.f2615a)) {
/* 27 */                return;
                    }
/* 33 */            uCSecondLayerHeader.getUcHeaderLanguageIcon().setVisibility(4);
/* 41 */            uCSecondLayerHeader.getUcHeaderLanguageLoading().setVisibility(0);
/* 44 */            qv2 qv2Var2 = uCSecondLayerHeader.f6294s0;
/* 46 */            if (qv2Var2 == null) {
/* 72 */                Intrinsics.m6220e("viewModel");
/* 75 */                throw null;
                    }
/* 48 */            str.getClass();
/* 51 */            yv2 yv2Var = qv2Var2.f15783c;
/* 68 */            ((uv2) yv2Var.f19825d.f7853b).mo4450a(str, new C1983o(yv2Var, 25), nk2.f14343f);
                }

                private final void setupBackButton(ew2 theme) {
/* 1 */             Context context = getContext();
/* 5 */             context.getClass();
/* 10 */            Drawable drawableM6700p = mn0.m6700p(context, R$drawable.uc_ic_arrow_back);
/* 14 */            if (drawableM6700p != null) {
/* 16 */                theme.getClass();
/* 21 */                Integer num = theme.f7907a.f18806b;
/* 23 */                if (num != null) {
/* 36 */                    drawableM6700p.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
                        }
                    } else {
/* 40 */                drawableM6700p = null;
                    }
/* 45 */            getUcHeaderBackButton().setImageDrawable(drawableM6700p);
/* 48 */            UCImageView ucHeaderBackButton = getUcHeaderBackButton();
/* 52 */            ucHeaderBackButton.getClass();
/* 55 */            xe2.m9765c(ucHeaderBackButton);
                }

                private final void setupCloseButton(ew2 theme) {
/* 1 */             Context context = getContext();
/* 5 */             context.getClass();
/* 10 */            Drawable drawableM6700p = mn0.m6700p(context, R$drawable.uc_ic_close);
/* 14 */            if (drawableM6700p != null) {
/* 16 */                theme.getClass();
/* 21 */                Integer num = theme.f7907a.f18806b;
/* 23 */                if (num != null) {
/* 36 */                    drawableM6700p.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
                        }
                    } else {
/* 40 */                drawableM6700p = null;
                    }
/* 41 */            UCImageView ucHeaderCloseButton = getUcHeaderCloseButton();
/* 45 */            ucHeaderCloseButton.setImageDrawable(drawableM6700p);
/* 54 */            ucHeaderCloseButton.setOnClickListener(new h51(this, 5));
                }

                private final void setupLanguage(ew2 theme) {
/* 1 */             UCImageView ucHeaderLanguageIcon = getUcHeaderLanguageIcon();
/* 5 */             ucHeaderLanguageIcon.getClass();
/* 8 */             theme.getClass();
/* 11 */            wt2 wt2Var = theme.f7907a;
/* 13 */            Integer num = wt2Var.f18806b;
/* 15 */            if (num != null) {
/* 23 */                ucHeaderLanguageIcon.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                    }
/* 26 */            ProgressBar ucHeaderLanguageLoading = getUcHeaderLanguageLoading();
/* 30 */            ucHeaderLanguageLoading.getClass();
/* 33 */            Integer num2 = wt2Var.f18805a;
/* 35 */            if (num2 != null) {
/* 37 */                int iIntValue = num2.intValue();
/* 41 */                Drawable indeterminateDrawable = ucHeaderLanguageLoading.getIndeterminateDrawable();
/* 45 */                if (indeterminateDrawable != null) {
/* 55 */                    indeterminateDrawable.setColorFilter(new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_IN));
                        }
                    }
/* 58 */            UCImageView ucHeaderLanguageIcon2 = getUcHeaderLanguageIcon();
/* 62 */            ucHeaderLanguageIcon2.getClass();
/* 65 */            xe2.m9765c(ucHeaderLanguageIcon2);
                }

                /* JADX INFO: renamed from: k */
                public final void m2814k(ew2 ew2Var, qv2 qv2Var) {
                    int i;
/* 7 */             ew2Var.getClass();
/* 10 */            qv2Var.getClass();
/* 13 */            this.f6294s0 = qv2Var;
/* 17 */            int i2 = 2;
/* 22 */            if (!this.f6295t0) {
/* 25 */                ViewStub stubView = getStubView();
/* 29 */                qv2 qv2Var2 = this.f6294s0;
/* 31 */                if (qv2Var2 == null) {
/* 513 */                   Intrinsics.m6220e("viewModel");
/* 516 */                   throw null;
                        }
/* 39 */                int iOrdinal = ((ej0) qv2Var2.f15781a.f15575d).ordinal();
/* 43 */                if (iOrdinal == 0) {
/* 59 */                    i = R$layout.uc_header_items_left;
                        } else if (iOrdinal == 1) {
/* 56 */                    i = R$layout.uc_header_items_center;
                        } else {
/* 47 */                    if (iOrdinal != 2) {
/* 52 */                        ds0.m3187b();
/* 55 */                        return;
                            }
/* 49 */                    i = R$layout.uc_header_items_right;
                        }
/* 61 */                stubView.setLayoutResource(i);
/* 68 */                View viewInflate = getStubView().inflate();
/* 72 */                viewInflate.getClass();
/* 75 */                this.f6283h0 = viewInflate;
/* 77 */                setupLanguage(ew2Var);
/* 80 */                setupBackButton(ew2Var);
/* 83 */                setupCloseButton(ew2Var);
/* 86 */                this.f6295t0 = true;
                    }
/* 88 */            qv2 qv2Var3 = this.f6294s0;
/* 90 */            if (qv2Var3 == null) {
/* 509 */               Intrinsics.m6220e("viewModel");
/* 512 */               throw null;
                    }
/* 98 */            yz2 yz2Var = (yz2) qv2Var3.f15785e.getValue();
/* 106 */           getUcHeaderBackButton().setVisibility(8);
/* 113 */           getUcHeaderBackButton().setOnClickListener(null);
/* 121 */           getUcHeaderLogo().setVisibility(0);
/* 124 */           if (yz2Var != null) {
/* 127 */               UCImageView ucHeaderLogo = getUcHeaderLogo();
/* 131 */               ucHeaderLogo.setImage(yz2Var);
/* 134 */               qv2 qv2Var4 = this.f6294s0;
/* 136 */               if (qv2Var4 == null) {
/* 505 */                   Intrinsics.m6220e("viewModel");
/* 508 */                   throw null;
                        }
/* 148 */               ucHeaderLogo.setContentDescription(((au1) qv2Var4.f15783c.f19831j.f15958d).f2101h);
                    }
/* 153 */           if (this.f6294s0 == null) {
/* 501 */               Intrinsics.m6220e("viewModel");
/* 504 */               throw null;
                    }
/* 155 */           UCImageView ucHeaderCloseButton = getUcHeaderCloseButton();
/* 159 */           ucHeaderCloseButton.setVisibility(8);
/* 162 */           qv2 qv2Var5 = this.f6294s0;
/* 164 */           if (qv2Var5 == null) {
/* 497 */               Intrinsics.m6220e("viewModel");
/* 500 */               throw null;
                    }
/* 176 */           ucHeaderCloseButton.setContentDescription(((au1) qv2Var5.f15783c.f19831j.f15958d).f2094a);
/* 179 */           xe2.m9765c(ucHeaderCloseButton);
/* 182 */           qv2 qv2Var6 = this.f6294s0;
/* 184 */           if (qv2Var6 == null) {
/* 493 */               Intrinsics.m6220e("viewModel");
/* 496 */               throw null;
                    }
/* 190 */           cv1 cv1Var = (cv1) qv2Var6.f15781a.f15577f;
/* 196 */           getUcHeaderLanguageLoading().setVisibility(8);
/* 199 */           int i3 = cv1Var == null ? 4 : 0;
/* 202 */           UCImageView ucHeaderLanguageIcon = getUcHeaderLanguageIcon();
/* 206 */           ucHeaderLanguageIcon.setVisibility(i3);
/* 209 */           qv2 qv2Var7 = this.f6294s0;
/* 211 */           if (qv2Var7 == null) {
/* 489 */               Intrinsics.m6220e("viewModel");
/* 492 */               throw null;
                    }
/* 223 */           ucHeaderLanguageIcon.setContentDescription(((au1) qv2Var7.f15783c.f19831j.f15958d).f2098e);
/* 232 */           ucHeaderLanguageIcon.setOnClickListener(new rp2(3, this, ew2Var));
/* 235 */           qv2 qv2Var8 = this.f6294s0;
/* 237 */           if (qv2Var8 == null) {
/* 485 */               Intrinsics.m6220e("viewModel");
/* 488 */               throw null;
                    }
/* 243 */           String str = (String) qv2Var8.f15781a.f15573b;
/* 245 */           UCTextView ucHeaderDescription = getUcHeaderDescription();
/* 249 */           ucHeaderDescription.getClass();
/* 254 */           qv2 qv2Var9 = this.f6294s0;
/* 256 */           if (qv2Var9 == null) {
/* 481 */               Intrinsics.m6220e("viewModel");
/* 484 */               throw null;
                    }
/* 272 */           ucHeaderDescription.m2796g(str, new n01(1, qv2Var9, qv2.class, "onPredefinedUIHtmlLinkClick", "onPredefinedUIHtmlLinkClick(Lcom/usercentrics/sdk/models/settings/PredefinedUIHtmlLinkType;)V", 0, 4));
/* 279 */           getUcHeaderLinks().removeAllViews();
/* 282 */           qv2 qv2Var10 = this.f6294s0;
/* 284 */           if (qv2Var10 == null) {
/* 477 */               Intrinsics.m6220e("viewModel");
/* 480 */               throw null;
                    }
/* 292 */           List<ev1> list = (List) qv2Var10.f15784d.getValue();
/* 294 */           if (list == null) {
/* 296 */               list = nd0.f14189a;
                    }
/* 302 */           if (list.isEmpty()) {
/* 308 */               getUcHeaderLinks().setVisibility(8);
                    } else {
/* 320 */               ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 331 */               for (ev1 ev1Var : list) {
/* 341 */                   Context context = getContext();
/* 345 */                   context.getClass();
/* 348 */                   UCTextView uCTextView = new UCTextView(context, null);
/* 353 */                   uCTextView.setText(ev1Var.f7892a);
/* 356 */                   int paddingLeft = uCTextView.getPaddingLeft();
/* 360 */                   int paddingRight = uCTextView.getPaddingRight();
/* 364 */                   int i4 = this.f6296u0;
/* 366 */                   uCTextView.setPaddingRelative(paddingLeft, i4, paddingRight, i4);
/* 369 */                   UCTextView.m2795i(uCTextView, ew2Var, 10);
/* 377 */                   uCTextView.setOnClickListener(new rp2(i2, this, ev1Var));
/* 380 */                   xe2.m9773k(uCTextView);
/* 383 */                   arrayList.add(uCTextView);
                        }
/* 387 */               Context context2 = getContext();
/* 391 */               context2.getClass();
/* 404 */               getUcHeaderLinks().addView(mn0.m6691g(context2, arrayList, this.f6297v0));
                    }
/* 417 */           getUcHeaderTitle().setText((String) qv2Var.f15781a.f15572a);
/* 424 */           if (Build.VERSION.SDK_INT >= 28) {
/* 2 */                 getUcHeaderTitle().setAccessibilityHeading(true);
                    } else {
/* 438 */               getUcHeaderTitle().setImportantForAccessibility(1);
                    }
/* 445 */           getUcHeaderLanguageIcon().setFocusable(true);
/* 452 */           getUcHeaderCloseButton().setFocusable(true);
/* 459 */           getUcHeaderTitle().setFocusable(true);
/* 466 */           getUcHeaderDescription().setFocusable(true);
/* 473 */           getUcHeaderLanguageIcon().requestFocus();
                }

                /* JADX INFO: renamed from: l */
                public final void m2815l(ew2 ew2Var, ViewPager viewPager, ArrayList arrayList, boolean z) {
                    im2 im2VarM2386g;
/* 1 */             ew2Var.getClass();
/* 4 */             viewPager.getClass();
/* 11 */            getUcHeaderTabLayout().setupWithViewPager(viewPager);
/* 14 */            if (!z) {
/* 204 */               getUcHeaderTabLayout().setVisibility(8);
/* 211 */               ViewGroup.LayoutParams layoutParams = getUcHeaderContentDivider().getLayoutParams();
/* 215 */               layoutParams.getClass();
/* 220 */               Context context = getContext();
/* 224 */               context.getClass();
/* 234 */               ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).topMargin = (int) yy1.m10219n(8.0f, context);
/* 236 */               return;
                    }
/* 16 */            int currentItem = viewPager.getCurrentItem();
/* 25 */            int i = 0;
/* 30 */            for (Object obj : arrayList) {
/* 36 */                int i2 = i + 1;
/* 39 */                if (i < 0) {
/* 171 */                   C2085pw.m7568g();
/* 174 */                   throw null;
                        }
/* 41 */                String str = (String) obj;
/* 43 */                TabLayout ucHeaderTabLayout = getUcHeaderTabLayout();
/* 47 */                if (ucHeaderTabLayout != null && (im2VarM2386g = ucHeaderTabLayout.m2386g(i)) != null) {
/* 57 */                    Context context2 = getContext();
/* 61 */                    context2.getClass();
/* 64 */                    UCTextView uCTextView = new UCTextView(context2, null);
/* 67 */                    uCTextView.setText(str);
/* 82 */                    uCTextView.setId(i != 0 ? i != 1 ? -1 : R$id.ucHeaderSecondTabView : R$id.ucHeaderFirstTabView);
/* 85 */                    wt2 wt2Var = ew2Var.f7907a;
/* 101 */                   int[][] iArr = {new int[]{R.attr.state_selected}, new int[]{-16842913}};
/* 105 */                   wu2 wu2Var = ew2Var.f7908b;
/* 107 */                   Integer num = wt2Var.f18811g;
/* 109 */                   Integer num2 = wt2Var.f18805a;
/* 111 */                   if (num != null && num2 != null) {
/* 132 */                       uCTextView.setTextColor(new ColorStateList(iArr, new int[]{num.intValue(), num2.intValue()}));
                            }
/* 135 */                   uCTextView.setAllCaps(false);
/* 138 */                   uCTextView.setGravity(1);
/* 141 */                   Typeface typeface = Typeface.DEFAULT;
/* 143 */                   uCTextView.setTypeface(typeface);
/* 151 */                   uCTextView.setTextSize(2, wu2Var.f18822a.f17726b);
/* 154 */                   im2VarM2386g.f9722e = uCTextView;
/* 156 */                   im2VarM2386g.m4582a();
/* 159 */                   if (currentItem == i) {
/* 161 */                       uCTextView.setTypeface(typeface, 1);
                            } else {
/* 165 */                       uCTextView.setTypeface(typeface);
                            }
                        }
/* 168 */               i = i2;
                    }
/* 179 */           getUcHeaderTabLayout().setVisibility(0);
/* 186 */           ViewGroup.LayoutParams layoutParams2 = getUcHeaderContentDivider().getLayoutParams();
/* 190 */           layoutParams2.getClass();
/* 195 */           ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams2)).topMargin = 0;
                }

                /* JADX INFO: renamed from: m */
                public final void m2816m(ew2 ew2Var) {
/* 1 */             ew2Var.getClass();
/* 8 */             getUcHeaderTitle().m2798k(ew2Var);
/* 11 */            UCTextView ucHeaderDescription = getUcHeaderDescription();
/* 15 */            ucHeaderDescription.getClass();
/* 20 */            UCTextView.m2794h(ucHeaderDescription, ew2Var, 14);
/* 23 */            TabLayout ucHeaderTabLayout = getUcHeaderTabLayout();
/* 27 */            ucHeaderTabLayout.getClass();
/* 30 */            wt2 wt2Var = ew2Var.f7907a;
/* 32 */            Integer num = wt2Var.f18811g;
/* 34 */            if (num != null) {
/* 40 */                ucHeaderTabLayout.setSelectedTabIndicatorColor(num.intValue());
                    }
/* 49 */            getUcHeaderContentDivider().setBackgroundColor(wt2Var.f18814j);
/* 52 */            Integer num2 = wt2Var.f18809e;
/* 54 */            if (num2 != null) {
/* 60 */                setBackgroundColor(num2.intValue());
                    }
/* 69 */            getUcHeaderTabLayout().f4990v0.clear();
/* 72 */            TabLayout ucHeaderTabLayout2 = getUcHeaderTabLayout();
/* 78 */            mm2 mm2Var = new mm2(ew2Var);
/* 81 */            ArrayList arrayList = ucHeaderTabLayout2.f4990v0;
/* 87 */            if (arrayList.contains(mm2Var)) {
/* 92 */                return;
                    }
/* 89 */            arrayList.add(mm2Var);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 197 */       public UCSecondLayerHeader(Context context, AttributeSet attributeSet) {
/* 198 */           this(context, attributeSet, 0);
                    context.getClass();
                }
            }
