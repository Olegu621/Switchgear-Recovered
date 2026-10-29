            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.util.TypedValue;
            import android.util.Xml;
            import android.view.View;
            import androidx.constraintlayout.widget.R$styleable;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: pz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2088pz {

                /* JADX INFO: renamed from: a */
                public boolean f15341a = false;

                /* JADX INFO: renamed from: b */
                public String f15342b;

                /* JADX INFO: renamed from: c */
                public int f15343c;

                /* JADX INFO: renamed from: d */
                public int f15344d;

                /* JADX INFO: renamed from: e */
                public float f15345e;

                /* JADX INFO: renamed from: f */
                public String f15346f;

                /* JADX INFO: renamed from: g */
                public boolean f15347g;

                /* JADX INFO: renamed from: h */
                public int f15348h;

                public C2088pz(C2088pz c2088pz, Object obj) {
/* 9 */             this.f15342b = c2088pz.f15342b;
/* 13 */            this.f15343c = c2088pz.f15343c;
/* 15 */            m7621f(obj);
                }

                /* JADX INFO: renamed from: d */
                public static void m7616d(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
/* 7 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.CustomAttribute);
/* 11 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 16 */            String string = null;
/* 18 */            int i = 0;
/* 19 */            boolean z = false;
/* 20 */            Object objValueOf = null;
/* 21 */            for (int i2 = 0; i2 < indexCount; i2++) {
/* 23 */                int index = typedArrayObtainStyledAttributes.getIndex(i2);
/* 30 */                if (index == R$styleable.CustomAttribute_attributeName) {
/* 32 */                    string = typedArrayObtainStyledAttributes.getString(index);
/* 36 */                    if (string != null && string.length() > 0) {
/* 67 */                        string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                            }
                        } else if (index == R$styleable.CustomAttribute_methodName) {
/* 77 */                    string = typedArrayObtainStyledAttributes.getString(index);
/* 81 */                    z = true;
                        } else if (index == R$styleable.CustomAttribute_customBoolean) {
/* 92 */                    objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
/* 96 */                    i = 6;
                        } else if (index == R$styleable.CustomAttribute_customColorValue) {
/* 107 */                   objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
/* 111 */                   i = 3;
                        } else if (index == R$styleable.CustomAttribute_customColorDrawableValue) {
/* 122 */                   objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
/* 126 */                   i = 4;
                        } else {
/* 132 */                   if (index == R$styleable.CustomAttribute_customPixelDimension) {
/* 150 */                       objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                            } else if (index == R$styleable.CustomAttribute_customDimension) {
/* 164 */                       objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                            } else if (index == R$styleable.CustomAttribute_customFloatValue) {
/* 179 */                       objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
/* 183 */                       i = 2;
                            } else if (index == R$styleable.CustomAttribute_customIntegerValue) {
/* 194 */                       objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
/* 198 */                       i = 1;
                            } else if (index == R$styleable.CustomAttribute_customStringValue) {
/* 204 */                       objValueOf = typedArrayObtainStyledAttributes.getString(index);
/* 208 */                       i = 5;
                            } else if (index == R$styleable.CustomAttribute_customReference) {
/* 214 */                       int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
/* 218 */                       if (resourceId == -1) {
/* 220 */                           resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
/* 224 */                       objValueOf = Integer.valueOf(resourceId);
/* 228 */                       i = 8;
                            }
/* 154 */                   i = 7;
                        }
                    }
/* 234 */           if (string != null && objValueOf != null) {
/* 240 */               C2088pz c2088pz = new C2088pz();
/* 243 */               c2088pz.f15342b = string;
/* 245 */               c2088pz.f15343c = i;
/* 247 */               c2088pz.f15341a = z;
/* 249 */               c2088pz.m7621f(objValueOf);
/* 252 */               map.put(string, c2088pz);
                    }
/* 255 */           typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: e */
                public static void m7617e(View view, HashMap map) {
/* 7 */             Class<?> cls = view.getClass();
/* 23 */            for (String str : map.keySet()) {
/* 35 */                C2088pz c2088pz = (C2088pz) map.get(str);
/* 48 */                String strM3507k = !c2088pz.f15341a ? AbstractC0886en.m3507k("set", str) : str;
                        try {
/* 51 */                    int iM3520y = AbstractC0886en.m3520y(c2088pz.f15343c);
/* 55 */                    Class cls2 = Float.TYPE;
/* 57 */                    Class cls3 = Integer.TYPE;
                            switch (iM3520y) {
                                case 0:
/* 254 */                           cls.getMethod(strM3507k, cls3).invoke(view, Integer.valueOf(c2088pz.f15344d));
                                    break;
                                case 1:
/* 231 */                           cls.getMethod(strM3507k, cls2).invoke(view, Float.valueOf(c2088pz.f15345e));
                                    break;
                                case 2:
/* 208 */                           cls.getMethod(strM3507k, cls3).invoke(view, Integer.valueOf(c2088pz.f15348h));
                                    break;
                                case 3:
/* 167 */                           Method method = cls.getMethod(strM3507k, Drawable.class);
/* 173 */                           ColorDrawable colorDrawable = new ColorDrawable();
/* 178 */                           colorDrawable.setColor(c2088pz.f15348h);
/* 185 */                           method.invoke(view, colorDrawable);
                                    break;
                                case 4:
/* 156 */                           cls.getMethod(strM3507k, CharSequence.class).invoke(view, c2088pz.f15346f);
                                    break;
                                case 5:
/* 136 */                           cls.getMethod(strM3507k, Boolean.TYPE).invoke(view, Boolean.valueOf(c2088pz.f15347g));
                                    break;
                                case 6:
/* 112 */                           cls.getMethod(strM3507k, cls2).invoke(view, Float.valueOf(c2088pz.f15345e));
                                    break;
                                case 7:
/* 81 */                            cls.getMethod(strM3507k, cls3).invoke(view, Integer.valueOf(c2088pz.f15344d));
                                    break;
                            }
                        } catch (IllegalAccessException e) {
/* 282 */                   StringBuilder sbM3513q = AbstractC0886en.m3513q(" Custom Attribute \"", str, "\" not found on ");
/* 290 */                   sbM3513q.append(cls.getName());
/* 297 */                   AbstractC1245n0.m4876d("TransitionLayout", sbM3513q.toString());
/* 300 */                   e.printStackTrace();
                        } catch (NoSuchMethodException e2) {
/* 309 */                   AbstractC1245n0.m4876d("TransitionLayout", e2.getMessage());
/* 334 */                   AbstractC1245n0.m4876d("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
/* 361 */                   AbstractC1245n0.m4876d("TransitionLayout", cls.getName() + " must have a method " + strM3507k);
                        } catch (InvocationTargetException e3) {
/* 259 */                   StringBuilder sbM3513q2 = AbstractC0886en.m3513q(" Custom Attribute \"", str, "\" not found on ");
/* 267 */                   sbM3513q2.append(cls.getName());
/* 274 */                   AbstractC1245n0.m4876d("TransitionLayout", sbM3513q2.toString());
/* 277 */                   e3.printStackTrace();
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final float m7618a() {
                    switch (AbstractC0886en.m3520y(this.f15343c)) {
                        case 0:
/* 44 */                    return this.f15344d;
                        case 1:
/* 39 */                    return this.f15345e;
                        case 2:
                        case 3:
/* 34 */                    f42.m3663s("Color does not have a single color to interpolate");
/* 37 */                    return 0.0f;
                        case 4:
/* 27 */                    f42.m3663s("Cannot interpolate String");
/* 30 */                    return 0.0f;
                        case 5:
                            return this.f15347g ? 1.0f : 0.0f;
                        case 6:
/* 13 */                    return this.f15345e;
                        default:
/* 10 */                    return Float.NaN;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m7619b(float[] fArr) {
                    switch (AbstractC0886en.m3520y(this.f15343c)) {
                        case 0:
/* 103 */                   fArr[0] = this.f15344d;
                            break;
                        case 1:
/* 97 */                    fArr[0] = this.f15345e;
                            break;
                        case 2:
                        case 3:
/* 34 */                    int i = this.f15348h;
/* 38 */                    int i2 = (i >> 24) & 255;
/* 64 */                    float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
/* 72 */                    float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
/* 80 */                    float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
/* 81 */                    fArr[0] = fPow;
/* 84 */                    fArr[1] = fPow2;
/* 87 */                    fArr[2] = fPow3;
/* 92 */                    fArr[3] = i2 / 255.0f;
                            break;
                        case 4:
/* 30 */                    f42.m3663s("Color does not have a single color to interpolate");
                            break;
                        case 5:
/* 25 */                    fArr[0] = this.f15347g ? 1.0f : 0.0f;
                            break;
                        case 6:
/* 14 */                    fArr[0] = this.f15345e;
                            break;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final int m7620c() {
/* 3 */             int iM3520y = AbstractC0886en.m3520y(this.f15343c);
                    return (iM3520y == 2 || iM3520y == 3) ? 4 : 1;
                }

                /* JADX INFO: renamed from: f */
                public final void m7621f(Object obj) {
                    switch (AbstractC0886en.m3520y(this.f15343c)) {
                        case 0:
                        case 7:
/* 58 */                    this.f15344d = ((Integer) obj).intValue();
                            break;
                        case 1:
/* 49 */                    this.f15345e = ((Float) obj).floatValue();
                            break;
                        case 2:
                        case 3:
/* 40 */                    this.f15348h = ((Integer) obj).intValue();
                            break;
                        case 4:
/* 31 */                    this.f15346f = (String) obj;
                            break;
                        case 5:
/* 26 */                    this.f15347g = ((Boolean) obj).booleanValue();
                            break;
                        case 6:
/* 17 */                    this.f15345e = ((Float) obj).floatValue();
                            break;
                    }
                }
            }
