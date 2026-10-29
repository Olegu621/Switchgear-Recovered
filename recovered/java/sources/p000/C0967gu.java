            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.view.View;
            import android.view.accessibility.AccessibilityNodeInfo;
            import com.google.android.material.R$string;
            import com.google.android.material.chip.Chip;
            import java.util.ArrayList;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: gu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0967gu extends sf0 {

                /* JADX INFO: renamed from: q */
                public final /* synthetic */ Chip f8816q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0967gu(Chip chip, Chip chip2) {
/* 3 */             super(chip2);
/* 1 */             this.f8816q = chip;
                }

                @Override // p000.sf0
                /* JADX INFO: renamed from: n */
                public final int mo2375n(float f, float f2) {
/* 1 */             int i = Chip.f4576l0;
/* 3 */             Chip chip = this.f8816q;
                    return (chip.m2281d() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
                }

                @Override // p000.sf0
                /* JADX INFO: renamed from: o */
                public final void mo2376o(ArrayList arrayList) {
                    C1004hu c1004hu;
/* 6 */             arrayList.add(0);
/* 9 */             int i = Chip.f4576l0;
/* 11 */            Chip chip = this.f8816q;
/* 17 */            if (!chip.m2281d() || (c1004hu = chip.f4587e) == null || !c1004hu.f9288v0 || chip.f4597v == null) {
/* 39 */                return;
                    }
/* 36 */            arrayList.add(1);
                }

                @Override // p000.sf0
                /* JADX INFO: renamed from: s */
                public final boolean mo2377s(int i, int i2, Bundle bundle) {
/* 3 */             boolean z = false;
/* 4 */             if (i2 == 16) {
/* 6 */                 Chip chip = this.f8816q;
/* 8 */                 if (i == 0) {
/* 10 */                    return chip.performClick();
                        }
/* 16 */                if (i == 1) {
/* 18 */                    chip.playSoundEffect(0);
/* 21 */                    View.OnClickListener onClickListener = chip.f4597v;
/* 23 */                    if (onClickListener != null) {
/* 25 */                        onClickListener.onClick(chip);
/* 28 */                        z = true;
                            }
/* 31 */                    if (chip.f4592h0) {
/* 35 */                        chip.f4591g0.m8499x(1, 1);
                            }
                        }
                    }
/* 38 */            return z;
                }

                @Override // p000.sf0
                /* JADX INFO: renamed from: t */
                public final void mo4015t(C0901f1 c0901f1) {
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfo = c0901f1.f7961a;
/* 3 */             Chip chip = this.f8816q;
/* 5 */             C1004hu c1004hu = chip.f4587e;
/* 16 */            accessibilityNodeInfo.setCheckable(c1004hu != null && c1004hu.f9234B0);
/* 23 */            accessibilityNodeInfo.setClickable(chip.isClickable());
/* 30 */            c0901f1.m3628i(chip.getAccessibilityClassName());
/* 37 */            c0901f1.m3632m(chip.getText());
                }

                @Override // p000.sf0
                /* JADX INFO: renamed from: u */
                public final void mo2378u(int i, C0901f1 c0901f1) {
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfo = c0901f1.f7961a;
/* 4 */             CharSequence charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
/* 6 */             if (i != 1) {
/* 72 */                accessibilityNodeInfo.setContentDescription(HttpUrl.FRAGMENT_ENCODE_SET);
/* 77 */                accessibilityNodeInfo.setBoundsInParent(Chip.f4577m0);
/* 80 */                return;
                    }
/* 8 */             Chip chip = this.f8816q;
/* 10 */            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
/* 14 */            if (closeIconContentDescription != null) {
/* 16 */                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
                    } else {
/* 20 */                CharSequence text = chip.getText();
/* 24 */                Context context = chip.getContext();
/* 28 */                int i2 = R$string.mtrl_chip_close_icon_content_description;
/* 34 */                if (!TextUtils.isEmpty(text)) {
/* 36 */                    charSequence = text;
                        }
/* 49 */                accessibilityNodeInfo.setContentDescription(context.getString(i2, charSequence).trim());
                    }
/* 56 */            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
/* 61 */            c0901f1.m3622b(C2518z0.f19874g);
/* 68 */            accessibilityNodeInfo.setEnabled(chip.isEnabled());
                }

                @Override // p000.sf0
                /* JADX INFO: renamed from: v */
                public final void mo4016v(int i, boolean z) {
/* 2 */             if (i == 1) {
/* 4 */                 Chip chip = this.f8816q;
/* 6 */                 chip.f4584b0 = z;
/* 8 */                 chip.refreshDrawableState();
                    }
                }
            }
