            package p000;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Typeface;
            import android.graphics.fonts.Font;
            import android.graphics.fonts.FontFamily;
            import android.graphics.fonts.FontStyle;
            import android.os.ParcelFileDescriptor;
            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ps2 extends hu0 {
                /* JADX INFO: renamed from: M0 */
                public static Font m7550M0(FontFamily fontFamily, int i) {
/* 21 */            FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
/* 24 */            Font font = fontFamily.getFont(0);
/* 32 */            int iM7551N0 = m7551N0(fontStyle, font.getStyle());
/* 40 */            for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
/* 42 */                Font font2 = fontFamily.getFont(i2);
/* 50 */                int iM7551N1 = m7551N0(fontStyle, font2.getStyle());
/* 54 */                if (iM7551N1 < iM7551N0) {
/* 56 */                    font = font2;
/* 57 */                    iM7551N0 = iM7551N1;
                        }
                    }
/* 61 */            return font;
                }

                /* JADX INFO: renamed from: N0 */
                public static int m7551N0(FontStyle fontStyle, FontStyle fontStyle2) {
/* 29 */            return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: P */
                public final Typeface mo4355P(Context context, sl0 sl0Var, Resources resources, int i) {
                    try {
/* 6 */                 FontFamily.Builder builder = null;
/* 7 */                 for (tl0 tl0Var : sl0Var.f16672a) {
                            try {
/* 42 */                        Font fontBuild = new Font.Builder(resources, tl0Var.f17146f).setWeight(tl0Var.f17142b).setSlant(tl0Var.f17143c ? 1 : 0).setTtcIndex(tl0Var.f17145e).setFontVariationSettings(tl0Var.f17144d).build();
/* 46 */                        if (builder == null) {
/* 50 */                            builder = new FontFamily.Builder(fontBuild);
                                } else {
/* 55 */                            builder.addFont(fontBuild);
                                }
                            } catch (IOException unused) {
                            }
                        }
/* 61 */                if (builder == null) {
/* 1 */                     return null;
                        }
/* 64 */                FontFamily fontFamilyBuild = builder.build();
/* 85 */                return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m7550M0(fontFamilyBuild, i).getStyle()).build();
                    } catch (Exception unused2) {
/* 1 */                 return null;
                    }
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: Q */
                public final Typeface mo4356Q(Context context, vl0[] vl0VarArr, int i) {
/* 1 */             ContentResolver contentResolver = context.getContentResolver();
                    try {
/* 8 */                 FontFamily.Builder builder = null;
/* 9 */                 for (vl0 vl0Var : vl0VarArr) {
                            try {
/* 17 */                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(vl0Var.f18237a, "r", null);
/* 21 */                        if (parcelFileDescriptorOpenFileDescriptor == null) {
/* 23 */                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                    }
                                } else {
                                    try {
/* 52 */                                Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(vl0Var.f18239c).setSlant(vl0Var.f18240d ? 1 : 0).setTtcIndex(vl0Var.f18238b).build();
/* 56 */                                if (builder == null) {
/* 60 */                                    builder = new FontFamily.Builder(fontBuild);
                                        } else {
/* 67 */                                    builder.addFont(fontBuild);
                                        }
                                    } catch (Throwable th) {
                                        try {
/* 71 */                                    parcelFileDescriptorOpenFileDescriptor.close();
                                        } catch (Throwable th2) {
/* 76 */                                    th.addSuppressed(th2);
                                        }
/* 79 */                                throw th;
                                    }
                                }
/* 25 */                        parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (IOException unused) {
                            }
                        }
/* 83 */                if (builder != null) {
/* 86 */                    FontFamily fontFamilyBuild = builder.build();
/* 107 */                   return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m7550M0(fontFamilyBuild, i).getStyle()).build();
                        }
                    } catch (Exception unused2) {
                    }
/* 5 */             return null;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: R */
                public final Typeface mo4357R(Context context, Resources resources, int i, String str, int i2) {
                    try {
/* 6 */                 Font fontBuild = new Font.Builder(resources, i).build();
/* 32 */                return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
                    } catch (Exception unused) {
/* 37 */                return null;
                    }
                }
            }
