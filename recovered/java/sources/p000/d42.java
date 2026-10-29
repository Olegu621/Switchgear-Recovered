            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Typeface;
            import android.os.Handler;
            import android.os.Looper;
            import android.util.TypedValue;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.util.WeakHashMap;
            import org.xmlpull.v1.XmlPullParserException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class d42 {

                /* JADX INFO: renamed from: a */
                public static final ThreadLocal f6978a = new ThreadLocal();

                /* JADX INFO: renamed from: b */
                public static final WeakHashMap f6979b = new WeakHashMap(0);

                /* JADX INFO: renamed from: c */
                public static final Object f6980c = new Object();

                /* JADX INFO: renamed from: a */
                public static Typeface m2923a(Context context, int i) {
/* 5 */             if (context.isRestricted()) {
/* 7 */                 return null;
                    }
/* 20 */            return m2924b(context, i, new TypedValue(), 0, null, false, false);
                }

                /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
                /* JADX INFO: renamed from: b */
                public static Typeface m2924b(Context context, int i, TypedValue typedValue, int i2, de3 de3Var, boolean z, boolean z2) {
/* 3 */             Resources resources = context.getResources();
/* 8 */             resources.getValue(i, typedValue, true);
/* 13 */            CharSequence charSequence = typedValue.string;
/* 15 */            if (charSequence == null) {
/* 283 */               throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
                    }
/* 17 */            String string = charSequence.toString();
/* 27 */            Typeface typefaceM6279a = null;
/* 29 */            if (string.startsWith("res/")) {
/* 38 */                int i3 = typedValue.assetCookie;
/* 40 */                ua1 ua1Var = ks2.f12998b;
/* 50 */                Typeface typeface = (Typeface) ua1Var.get(ks2.m6280b(resources, i, string, i3, i2));
/* 52 */                int i4 = 4;
/* 53 */                if (typeface != null) {
/* 55 */                    if (de3Var != null) {
/* 71 */                        new Handler(Looper.getMainLooper()).post(new ji1(i4, de3Var, typeface));
                            }
/* 74 */                    typefaceM6279a = typeface;
                        } else if (!z2) {
                            try {
/* 91 */                        if (string.toLowerCase().endsWith(".xml")) {
/* 97 */                            rl0 rl0VarM5655q = j13.m5655q(resources.getXml(i), resources);
/* 101 */                           if (rl0VarM5655q == null) {
/* 105 */                               AbstractC1245n0.m4876d("ResourcesCompat", "Failed to find font-family tag");
/* 108 */                               if (de3Var != null) {
/* 110 */                                   de3Var.m3046d(-3);
                                        }
                                    } else {
/* 127 */                               typefaceM6279a = ks2.m6279a(context, rl0VarM5655q, resources, i, string, typedValue.assetCookie, i2, de3Var, z);
                                    }
                                } else {
/* 132 */                           int i5 = typedValue.assetCookie;
/* 139 */                           Typeface typefaceMo4357R = ks2.f12997a.mo4357R(context, resources, i, string, i2);
/* 143 */                           if (typefaceMo4357R != null) {
/* 149 */                               ua1Var.put(ks2.m6280b(resources, i, string, i5, i2), typefaceMo4357R);
                                    }
/* 152 */                           if (de3Var != null) {
/* 154 */                               if (typefaceMo4357R != null) {
/* 170 */                                   new Handler(Looper.getMainLooper()).post(new ji1(i4, de3Var, typefaceMo4357R));
                                        } else {
/* 175 */                                   de3Var.m3046d(-3);
                                        }
                                    }
/* 173 */                           typefaceM6279a = typefaceMo4357R;
                                }
                            } catch (IOException e) {
/* 185 */                       AbstractC1245n0.m4877e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
/* 198 */                       if (de3Var != null) {
/* 200 */                           de3Var.m3046d(-3);
                                }
                            } catch (XmlPullParserException e2) {
/* 195 */                       AbstractC1245n0.m4877e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
/* 198 */                       if (de3Var != null) {
/* 200 */                           de3Var.m3046d(-3);
                                }
                            }
                        }
                    } else if (de3Var != null) {
/* 33 */                de3Var.m3046d(-3);
                    }
/* 203 */           if (typefaceM6279a != null || de3Var != null || z2) {
/* 239 */               return typefaceM6279a;
                    }
/* 238 */           throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
                }
            }
