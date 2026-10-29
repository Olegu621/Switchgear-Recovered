            package p000;

            import android.graphics.Rect;
            import android.view.ViewGroup;
            import androidx.transition.Transition;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wd2 extends kb1 {

                /* JADX INFO: renamed from: e */
                public int f18589e;

                /* JADX WARN: Code duplicated, block: B:21:0x0037  */
                /* JADX WARN: Code duplicated, block: B:31:0x0093  */
                /* JADX WARN: Code duplicated, block: B:32:0x0095  */
                @Override // p000.kb1
                /* JADX INFO: renamed from: H */
                public final long mo6074H(ViewGroup viewGroup, Transition transition, or2 or2Var, or2 or2Var2) {
                    int i;
                    int iCenterX;
                    int iCenterY;
                    int iAbs;
                    Integer num;
/* 5 */             or2 or2Var3 = or2Var;
/* 9 */             if (or2Var3 == null && or2Var2 == null) {
/* 7 */                 return 0L;
                    }
/* 14 */            mn0 mn0Var = transition.f1902e0;
/* 20 */            Rect rectM6710w = mn0Var == null ? null : mn0Var.m6710w();
/* 25 */            if (or2Var2 == null) {
/* 56 */                i = -1;
                    } else {
/* 49 */                if (((or2Var3 == null || (num = (Integer) or2Var3.f14872a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) == 0) {
/* 56 */                    i = -1;
                        } else {
/* 52 */                    or2Var3 = or2Var2;
/* 54 */                    i = 1;
                        }
                    }
/* 58 */            int iM6035I = kb1.m6035I(or2Var3, 0);
/* 62 */            int iM6035I2 = kb1.m6035I(or2Var3, 1);
/* 67 */            int[] iArr = new int[2];
/* 71 */            viewGroup.getLocationOnScreen(iArr);
/* 84 */            int iRound = Math.round(viewGroup.getTranslationX()) + iArr[0];
/* 95 */            int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
/* 100 */           int width = viewGroup.getWidth() + iRound;
/* 105 */           int height = viewGroup.getHeight() + iRound2;
/* 106 */           if (rectM6710w != null) {
/* 108 */               iCenterX = rectM6710w.centerX();
/* 112 */               iCenterY = rectM6710w.centerY();
                    } else {
/* 121 */               iCenterX = (iRound + width) / 2;
/* 124 */               iCenterY = (iRound2 + height) / 2;
                    }
/* 132 */           int i2 = this.f18589e;
/* 138 */           if (i2 == 8388611) {
/* 140 */               WeakHashMap weakHashMap = e33.f7494a;
/* 146 */               if (viewGroup.getLayoutDirection() == 1) {
/* 148 */                   i2 = 5;
                        } else {
/* 150 */                   i2 = 3;
                        }
                    } else if (i2 == 8388613) {
/* 157 */               WeakHashMap weakHashMap2 = e33.f7494a;
/* 163 */               if (viewGroup.getLayoutDirection() == 1) {
/* 150 */                   i2 = 3;
                        } else {
/* 148 */                   i2 = 5;
                        }
                    }
/* 166 */           if (i2 == 3) {
/* 214 */               iAbs = Math.abs(iCenterY - iM6035I2) + (width - iM6035I);
                    } else if (i2 == 5) {
/* 205 */               iAbs = Math.abs(iCenterY - iM6035I2) + (iM6035I - iRound);
                    } else if (i2 != 48) {
/* 187 */               iAbs = i2 != 80 ? 0 : Math.abs(iCenterX - iM6035I) + (iM6035I2 - iRound2);
                    } else {
/* 196 */               iAbs = Math.abs(iCenterX - iM6035I) + (height - iM6035I2);
                    }
                    float f = iAbs;
/* 217 */           int i3 = this.f18589e;
/* 244 */           float width2 = f / ((i3 == 3 || i3 == 5 || i3 == 8388611 || i3 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
/* 245 */           long j = transition.f1897c;
/* 249 */           if (j < 0) {
/* 251 */               j = 300;
                    }
/* 264 */           return Math.round(((j * ((long) i)) / 3.0f) * width2);
                }
            }
