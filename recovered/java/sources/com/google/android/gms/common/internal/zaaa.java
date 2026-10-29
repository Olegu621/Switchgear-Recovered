            package com.google.android.gms.common.internal;

            import android.R;
            import android.content.Context;
            import android.util.AttributeSet;
            import android.widget.Button;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zaaa extends Button {
                public zaaa(Context context, AttributeSet attributeSet) {
/* 5 */             super(context, null, R.attr.buttonStyle);
                }

                /* JADX INFO: renamed from: a */
                public static final int m2022a(int i, int i2, int i3, int i4) {
/* 1 */             if (i == 0) {
/* 22 */                return i2;
                    }
/* 4 */             if (i == 1) {
/* 21 */                return i3;
                    }
/* 7 */             if (i == 2) {
/* 9 */                 return i4;
                    }
/* 16 */            f42.m3656l(fm0.m3781g(i, "Unknown color scheme: "));
/* 19 */            return 0;
                }
            }
