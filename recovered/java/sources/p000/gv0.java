            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.Icon;
            import android.net.Uri;
            import android.os.Build;
            import android.text.TextUtils;
            import androidx.core.graphics.drawable.IconCompat;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.InputStream;
            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class gv0 {
                /* JADX INFO: renamed from: a */
                public static IconCompat m4017a(Icon icon) {
/* 1 */             icon.getClass();
/* 4 */             int iM4020d = m4020d(icon);
/* 9 */             if (iM4020d == 2) {
/* 82 */                return IconCompat.m586b(m4018b(icon), m4019c(icon));
                    }
/* 12 */            if (iM4020d == 4) {
/* 50 */                Uri uriM4021e = m4021e(icon);
/* 54 */                PorterDuff.Mode mode = IconCompat.f1245k;
/* 56 */                uriM4021e.getClass();
/* 59 */                String string = uriM4021e.toString();
/* 63 */                string.getClass();
/* 68 */                IconCompat iconCompat = new IconCompat(4);
/* 71 */                iconCompat.f1247b = string;
/* 73 */                return iconCompat;
                    }
/* 15 */            if (iM4020d != 6) {
/* 20 */                IconCompat iconCompat2 = new IconCompat(-1);
/* 23 */                iconCompat2.f1247b = icon;
/* 25 */                return iconCompat2;
                    }
/* 26 */            Uri uriM4021e2 = m4021e(icon);
/* 30 */            PorterDuff.Mode mode2 = IconCompat.f1245k;
/* 32 */            uriM4021e2.getClass();
/* 35 */            String string2 = uriM4021e2.toString();
/* 39 */            string2.getClass();
/* 44 */            IconCompat iconCompat3 = new IconCompat(6);
/* 47 */            iconCompat3.f1247b = string2;
/* 49 */            return iconCompat3;
                }

                /* JADX INFO: renamed from: b */
                public static int m4018b(Object obj) {
/* 9 */             if (Build.VERSION.SDK_INT >= 28) {
/* 11 */                return iv0.m5558a(obj);
                    }
                    try {
/* 34 */                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                    } catch (IllegalAccessException e) {
/* 53 */                AbstractC1245n0.m4877e("IconCompat", "Unable to get icon resource", e);
/* 16 */                return 0;
                    } catch (NoSuchMethodException e2) {
/* 45 */                AbstractC1245n0.m4877e("IconCompat", "Unable to get icon resource", e2);
/* 16 */                return 0;
                    } catch (InvocationTargetException e3) {
/* 49 */                AbstractC1245n0.m4877e("IconCompat", "Unable to get icon resource", e3);
/* 16 */                return 0;
                    }
                }

                /* JADX INFO: renamed from: c */
                public static String m4019c(Object obj) {
/* 9 */             if (Build.VERSION.SDK_INT >= 28) {
/* 11 */                return iv0.m5559b(obj);
                    }
                    try {
/* 31 */                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                    } catch (IllegalAccessException e) {
/* 48 */                AbstractC1245n0.m4877e("IconCompat", "Unable to get icon package", e);
/* 16 */                return null;
                    } catch (NoSuchMethodException e2) {
/* 40 */                AbstractC1245n0.m4877e("IconCompat", "Unable to get icon package", e2);
/* 16 */                return null;
                    } catch (InvocationTargetException e3) {
/* 44 */                AbstractC1245n0.m4877e("IconCompat", "Unable to get icon package", e3);
/* 16 */                return null;
                    }
                }

                /* JADX INFO: renamed from: d */
                public static int m4020d(Object obj) {
/* 9 */             if (Build.VERSION.SDK_INT >= 28) {
/* 11 */                return iv0.m5560c(obj);
                    }
                    try {
/* 34 */                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                    } catch (IllegalAccessException e) {
/* 89 */                AbstractC1245n0.m4877e("IconCompat", "Unable to get icon type " + obj, e);
/* 16 */                return -1;
                    } catch (NoSuchMethodException e2) {
/* 57 */                AbstractC1245n0.m4877e("IconCompat", "Unable to get icon type " + obj, e2);
/* 16 */                return -1;
                    } catch (InvocationTargetException e3) {
/* 73 */                AbstractC1245n0.m4877e("IconCompat", "Unable to get icon type " + obj, e3);
/* 16 */                return -1;
                    }
                }

                /* JADX INFO: renamed from: e */
                public static Uri m4021e(Object obj) {
/* 9 */             if (Build.VERSION.SDK_INT >= 28) {
/* 11 */                return iv0.m5561d(obj);
                    }
                    try {
/* 31 */                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
                    } catch (IllegalAccessException e) {
/* 48 */                AbstractC1245n0.m4877e("IconCompat", "Unable to get icon uri", e);
/* 16 */                return null;
                    } catch (NoSuchMethodException e2) {
/* 40 */                AbstractC1245n0.m4877e("IconCompat", "Unable to get icon uri", e2);
/* 16 */                return null;
                    } catch (InvocationTargetException e3) {
/* 44 */                AbstractC1245n0.m4877e("IconCompat", "Unable to get icon uri", e3);
/* 16 */                return null;
                    }
                }

                /* JADX INFO: renamed from: f */
                public static Drawable m4022f(Icon icon, Context context) {
/* 1 */             return icon.loadDrawable(context);
                }

                /* JADX INFO: renamed from: g */
                public static Icon m4023g(IconCompat iconCompat, Context context) {
                    Icon iconCreateWithBitmap;
                    String strM4019c;
                    InputStream inputStreamOpenInputStream;
/* 1 */             int i = iconCompat.f1246a;
                    switch (i) {
                        case -1:
/* 302 */                   return (Icon) iconCompat.f1247b;
                        case 0:
                        default:
/* 12 */                    C1951n4.m6859j("Unknown type");
/* 3 */                     return null;
                        case 1:
/* 279 */                   iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f1247b);
                            break;
                        case 2:
/* 224 */                   if (i == -1) {
/* 228 */                       strM4019c = m4019c(iconCompat.f1247b);
                            } else {
/* 234 */                       if (i != 2) {
/* 271 */                           ds0.m3204u(iconCompat, "called getResPackage() on ");
/* 3 */                             return null;
                                }
/* 236 */                       String str = iconCompat.f1255j;
/* 260 */                       strM4019c = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f1247b).split(":", -1)[0] : iconCompat.f1255j;
                            }
/* 264 */                   iconCreateWithBitmap = Icon.createWithResource(strM4019c, iconCompat.f1250e);
                            break;
                        case 3:
/* 218 */                   iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f1247b, iconCompat.f1250e, iconCompat.f1251f);
                            break;
                        case 4:
/* 205 */                   iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f1247b);
                            break;
                        case 5:
/* 177 */                   int i2 = Build.VERSION.SDK_INT;
/* 179 */                   Object obj = iconCompat.f1247b;
/* 196 */                   iconCreateWithBitmap = i2 < 26 ? Icon.createWithBitmap(IconCompat.m585a((Bitmap) obj, false)) : hv0.m4383b((Bitmap) obj);
                            break;
                        case 6:
/* 20 */                    if (Build.VERSION.SDK_INT >= 30) {
/* 26 */                        iconCreateWithBitmap = jv0.m5900a(iconCompat.m588d());
                            } else {
/* 32 */                        if (context == null) {
/* 173 */                           C1951n4.m6865p(iconCompat.m588d(), "Context is required to resolve the file uri of the icon: ");
/* 3 */                             return null;
                                }
/* 34 */                        Uri uriM588d = iconCompat.m588d();
/* 38 */                        String scheme = uriM588d.getScheme();
/* 50 */                        if ("content".equals(scheme) || "file".equals(scheme)) {
                                    try {
/* 103 */                               inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriM588d);
                                    } catch (Exception e) {
/* 123 */                               AbstractC1245n0.m4891s("IconCompat", "Unable to load image from URI: " + uriM588d, e);
/* 126 */                               inputStreamOpenInputStream = null;
                                    }
                                } else {
                                    try {
/* 69 */                                File file = new File((String) iconCompat.f1247b);
/* 75 */                                inputStreamOpenInputStream = AbstractC1417a.m5164b(file, new FileInputStream(file));
                                    } catch (FileNotFoundException e2) {
/* 95 */                                AbstractC1245n0.m4891s("IconCompat", "Unable to load image from path: " + uriM588d, e2);
/* 126 */                               inputStreamOpenInputStream = null;
                                    }
                                }
/* 127 */                       if (inputStreamOpenInputStream == null) {
/* 163 */                           ds0.m3206w(iconCompat.m588d(), "Cannot load adaptive icon from uri: ");
/* 3 */                             return null;
                                }
/* 131 */                       if (Build.VERSION.SDK_INT < 26) {
/* 151 */                           iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.m585a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                                } else {
/* 137 */                           iconCreateWithBitmap = hv0.m4383b(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                                }
                            }
                            break;
                    }
/* 283 */           ColorStateList colorStateList = iconCompat.f1252g;
/* 285 */           if (colorStateList != null) {
/* 287 */               iconCreateWithBitmap.setTintList(colorStateList);
                    }
/* 290 */           PorterDuff.Mode mode = iconCompat.f1253h;
/* 294 */           if (mode != IconCompat.f1245k) {
/* 296 */               iconCreateWithBitmap.setTintMode(mode);
                    }
/* 299 */           return iconCreateWithBitmap;
                }
            }
