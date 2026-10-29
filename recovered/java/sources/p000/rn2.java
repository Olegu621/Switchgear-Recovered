            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$styleable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class rn2 {

                /* JADX INFO: renamed from: a */
                public static final int[] f16199a = {R$attr.colorPrimary};

                /* JADX INFO: renamed from: b */
                public static final int[] f16200b = {R$attr.colorPrimaryVariant};

                /* JADX INFO: renamed from: a */
                public static void m8210a(Context context, AttributeSet attributeSet, int i, int i2) {
/* 3 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ThemeEnforcement, i, i2);
/* 10 */            boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ThemeEnforcement_enforceMaterialTheme, false);
/* 14 */            typedArrayObtainStyledAttributes.recycle();
/* 17 */            if (z) {
/* 21 */                TypedValue typedValue = new TypedValue();
/* 35 */                if (!context.getTheme().resolveAttribute(R$attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
/* 51 */                    m8212c(context, f16200b, "Theme.MaterialComponents");
                        }
                    }
/* 58 */            m8212c(context, f16199a, "Theme.AppCompat");
                }

                /* JADX INFO: renamed from: b */
                public static void m8211b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
/* 3 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ThemeEnforcement, i, i2);
/* 9 */             boolean z = false;
/* 14 */            if (!typedArrayObtainStyledAttributes.getBoolean(R$styleable.ThemeEnforcement_enforceTextAppearance, false)) {
/* 16 */                typedArrayObtainStyledAttributes.recycle();
/* 19 */                return;
                    }
/* 23 */            if (iArr2.length != 0) {
/* 35 */                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
/* 39 */                int length = iArr2.length;
/* 40 */                int i3 = 0;
                        while (true) {
/* 41 */                    if (i3 >= length) {
/* 58 */                        typedArrayObtainStyledAttributes2.recycle();
/* 33 */                        z = true;
                                break;
                            } else {
/* 49 */                        if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
/* 51 */                            typedArrayObtainStyledAttributes2.recycle();
                                    break;
                                }
/* 55 */                        i3++;
                            }
                        }
                    } else if (typedArrayObtainStyledAttributes.getResourceId(R$styleable.ThemeEnforcement_android_textAppearance, -1) != -1) {
/* 33 */                z = true;
                        break;
                    }
/* 62 */            typedArrayObtainStyledAttributes.recycle();
/* 65 */            if (z) {
/* 67 */                return;
                    }
/* 70 */            C1951n4.m6859j("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
                }

                /* JADX INFO: renamed from: c */
                public static void m8212c(Context context, int[] iArr, String str) {
/* 1 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
/* 7 */             for (int i = 0; i < iArr.length; i++) {
/* 13 */                if (!typedArrayObtainStyledAttributes.hasValue(i)) {
/* 18 */                    typedArrayObtainStyledAttributes.recycle();
/* 29 */                    C1951n4.m6859j(fm0.m3784j("The style on this component requires your app theme to be ", str, " (or a descendant)."));
/* 32 */                    return;
                        }
                    }
/* 33 */            typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: d */
                public static TypedArray m8213d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
/* 1 */             m8210a(context, attributeSet, i, i2);
/* 4 */             m8211b(context, attributeSet, iArr, i, i2, iArr2);
/* 7 */             return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
                }

                /* JADX INFO: renamed from: e */
                public static ac1 m8214e(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
/* 1 */             m8210a(context, attributeSet, i, i2);
/* 4 */             m8211b(context, attributeSet, iArr, i, i2, iArr2);
/* 13 */            return new ac1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
                }
            }
