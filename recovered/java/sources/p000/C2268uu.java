            package p000;

            import android.graphics.Rect;
            import android.view.ViewGroup;
            import androidx.transition.Transition;
            
            /* JADX INFO: renamed from: uu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2268uu extends kb1 {
                /* JADX WARN: Code duplicated, block: B:17:0x0026  */
                @Override // p000.kb1
                /* JADX INFO: renamed from: H */
                public final long mo6074H(ViewGroup viewGroup, Transition transition, or2 or2Var, or2 or2Var2) {
                    int i;
                    int iRound;
                    int iCenterX;
                    Integer num;
/* 3 */             if (or2Var == null && or2Var2 == null) {
/* 1 */                 return 0L;
                    }
/* 9 */             if (or2Var2 == null) {
/* 39 */                i = -1;
                    } else {
/* 33 */                if (((or2Var == null || (num = (Integer) or2Var.f14872a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) == 0) {
/* 39 */                    i = -1;
                        } else {
/* 36 */                    or2Var = or2Var2;
/* 37 */                    i = 1;
                        }
                    }
/* 41 */            int iM6035I = kb1.m6035I(or2Var, 0);
/* 45 */            int iM6035I2 = kb1.m6035I(or2Var, 1);
/* 49 */            mn0 mn0Var = transition.f1902e0;
/* 55 */            Rect rectM6710w = mn0Var == null ? null : mn0Var.m6710w();
/* 59 */            if (rectM6710w != null) {
/* 61 */                iCenterX = rectM6710w.centerX();
/* 65 */                iRound = rectM6710w.centerY();
                    } else {
/* 71 */                int[] iArr = new int[2];
/* 73 */                viewGroup.getLocationOnScreen(iArr);
/* 90 */                int iRound2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + iArr[0]);
/* 108 */               iRound = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + iArr[1]);
/* 114 */               iCenterX = iRound2;
                    }
/* 119 */           float f = iCenterX - iM6035I;
/* 120 */           float f2 = iRound - iM6035I2;
/* 129 */           float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
/* 141 */           float width = viewGroup.getWidth() - 0.0f;
/* 142 */           float height = viewGroup.getHeight() - 0.0f;
/* 152 */           float fSqrt2 = fSqrt / ((float) Math.sqrt((height * height) + (width * width)));
/* 153 */           long j = transition.f1897c;
/* 157 */           if (j < 0) {
/* 159 */               j = 300;
                    }
/* 172 */           return Math.round(((j * ((long) i)) / 3.0f) * fSqrt2);
                }
            }
