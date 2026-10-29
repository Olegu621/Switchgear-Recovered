            package p000;

            import android.content.Context;
            import android.graphics.drawable.GradientDrawable;
            import android.view.View;
            import androidx.recyclerview.widget.AbstractC0137o;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class h10 extends AbstractC0137o {

                /* JADX INFO: renamed from: u */
                public final hk2 f8863u;

                /* JADX INFO: renamed from: v */
                public final hk2 f8864v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h10(ew2 ew2Var, View view) {
/* 4 */             super(view);
/* 1 */             ew2Var.getClass();
/* 13 */            hk2 hk2VarM8065b = r51.m8065b(new g10(view, 1));
/* 17 */            this.f8863u = hk2VarM8065b;
/* 25 */            hk2 hk2VarM8065b2 = r51.m8065b(new g10(view, 2));
/* 35 */            hk2 hk2VarM8065b3 = r51.m8065b(new g10(view, 0));
/* 39 */            this.f8864v = hk2VarM8065b3;
/* 41 */            Object value = hk2VarM8065b.getValue();
/* 45 */            value.getClass();
/* 52 */            UCTextView.m2795i((UCTextView) value, ew2Var, 30);
/* 55 */            Object value2 = hk2VarM8065b3.getValue();
/* 59 */            value2.getClass();
/* 64 */            UCTextView.m2795i((UCTextView) value2, ew2Var, 30);
/* 67 */            wt2 wt2Var = ew2Var.f7907a;
/* 69 */            int i = wt2Var.f18814j;
/* 71 */            Integer num = wt2Var.f18809e;
/* 73 */            if (num != null) {
/* 75 */                int iIntValue = num.intValue();
/* 79 */                Object value3 = hk2VarM8065b.getValue();
/* 83 */                value3.getClass();
/* 88 */                ((UCTextView) value3).setBackgroundColor(iIntValue);
                    }
/* 93 */            GradientDrawable gradientDrawable = new GradientDrawable();
/* 96 */            gradientDrawable.setShape(0);
/* 107 */           gradientDrawable.setColor(num != null ? num.intValue() : -1);
/* 110 */           Context context = view.getContext();
/* 114 */           context.getClass();
/* 124 */           gradientDrawable.setStroke((int) yy1.m10219n(1.0f, context), i);
/* 127 */           view.setBackground(gradientDrawable);
/* 130 */           Object value4 = hk2VarM8065b2.getValue();
/* 134 */           value4.getClass();
/* 139 */           ((View) value4).setBackgroundColor(i);
                }
            }
