            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.RectF;
            import android.os.Build;
            import android.text.Layout;
            import android.text.StaticLayout;
            import android.text.TextPaint;
            import android.text.method.TransformationMethod;
            import android.util.TypedValue;
            import android.widget.TextView;
            import androidx.appcompat.widget.AppCompatEditText;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: bc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0175bc {

                /* JADX INFO: renamed from: l */
                public static final RectF f2351l = new RectF();

                /* JADX INFO: renamed from: m */
                public static final ConcurrentHashMap f2352m = new ConcurrentHashMap();

                /* JADX INFO: renamed from: a */
                public int f2353a = 0;

                /* JADX INFO: renamed from: b */
                public boolean f2354b = false;

                /* JADX INFO: renamed from: c */
                public float f2355c = -1.0f;

                /* JADX INFO: renamed from: d */
                public float f2356d = -1.0f;

                /* JADX INFO: renamed from: e */
                public float f2357e = -1.0f;

                /* JADX INFO: renamed from: f */
                public int[] f2358f = new int[0];

                /* JADX INFO: renamed from: g */
                public boolean f2359g = false;

                /* JADX INFO: renamed from: h */
                public TextPaint f2360h;

                /* JADX INFO: renamed from: i */
                public final TextView f2361i;

                /* JADX INFO: renamed from: j */
                public final Context f2362j;

                /* JADX INFO: renamed from: k */
                public final C2492yb f2363k;

                public C0175bc(TextView textView) {
/* 23 */            this.f2361i = textView;
/* 29 */            this.f2362j = textView.getContext();
/* 35 */            if (Build.VERSION.SDK_INT >= 29) {
/* 42 */                this.f2363k = new C2545zb();
                    } else {
/* 50 */                this.f2363k = new C2492yb();
                    }
                }

                /* JADX INFO: renamed from: b */
                public static int[] m1319b(int[] iArr) {
/* 1 */             int length = iArr.length;
/* 2 */             if (length != 0) {
/* 5 */                 Arrays.sort(iArr);
/* 10 */                ArrayList arrayList = new ArrayList();
/* 15 */                for (int i : iArr) {
/* 19 */                    if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
/* 35 */                        arrayList.add(Integer.valueOf(i));
                            }
                        }
/* 45 */                if (length != arrayList.size()) {
/* 48 */                    int size = arrayList.size();
/* 52 */                    int[] iArr2 = new int[size];
/* 54 */                    for (int i2 = 0; i2 < size; i2++) {
/* 66 */                        iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                            }
/* 71 */                    return iArr2;
                        }
                    }
/* 47 */            return iArr;
                }

                /* JADX INFO: renamed from: d */
                public static Method m1320d(String str) {
                    try {
/* 2 */                 ConcurrentHashMap concurrentHashMap = f2352m;
/* 8 */                 Method declaredMethod = (Method) concurrentHashMap.get(str);
/* 10 */                if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
/* 30 */                    return declaredMethod;
                        }
/* 21 */                declaredMethod.setAccessible(true);
/* 24 */                concurrentHashMap.put(str, declaredMethod);
/* 27 */                return declaredMethod;
                    } catch (Exception e) {
/* 52 */                AbstractC1245n0.m4891s("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
/* 1 */                 return null;
                    }
                }

                /* JADX INFO: renamed from: e */
                public static Object m1321e(Object obj, String str, Object obj2) {
                    try {
/* 6 */                 return m1320d(str).invoke(obj, null);
                    } catch (Exception e) {
/* 36 */                AbstractC1245n0.m4891s("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
/* 39 */                return obj2;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m1322a() {
/* 5 */             if (m1324f()) {
/* 11 */                if (this.f2354b) {
/* 19 */                    if (this.f2361i.getMeasuredHeight() <= 0 || this.f2361i.getMeasuredWidth() <= 0) {
/* 126 */                       return;
                            }
/* 62 */                    int measuredWidth = this.f2363k.mo151b(this.f2361i) ? 1048576 : (this.f2361i.getMeasuredWidth() - this.f2361i.getTotalPaddingLeft()) - this.f2361i.getTotalPaddingRight();
/* 82 */                    int height = (this.f2361i.getHeight() - this.f2361i.getCompoundPaddingBottom()) - this.f2361i.getCompoundPaddingTop();
/* 83 */                    if (measuredWidth <= 0 || height <= 0) {
/* 126 */                       return;
                            }
/* 88 */                    RectF rectF = f2351l;
                            synchronized (rectF) {
                                try {
/* 91 */                            rectF.setEmpty();
/* 95 */                            rectF.right = measuredWidth;
/* 98 */                            rectF.bottom = height;
/* 100 */                           float fM1323c = m1323c(rectF);
/* 113 */                           if (fM1323c != this.f2361i.getTextSize()) {
/* 116 */                               m1325g(fM1323c, 0);
                                    }
                                } catch (Throwable th) {
/* 125 */                           throw th;
                                }
                            }
                        }
/* 128 */               this.f2354b = true;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final int m1323c(RectF rectF) {
                    CharSequence transformation;
/* 3 */             int length = this.f2358f.length;
/* 5 */             if (length == 0) {
/* 151 */               f42.m3656l("No available text sizes to choose from.");
/* 4 */                 return 0;
                    }
/* 8 */             int i = length - 1;
/* 9 */             int i2 = 0;
/* 10 */            int i3 = 1;
                    while (true) {
/* 11 */                int[] iArr = this.f2358f;
/* 13 */                if (i3 > i) {
/* 146 */                   return iArr[i2];
                        }
/* 17 */                int i4 = (i3 + i) / 2;
/* 19 */                int i5 = iArr[i4];
/* 21 */                TextView textView = this.f2361i;
/* 23 */                CharSequence text = textView.getText();
/* 27 */                TransformationMethod transformationMethod = textView.getTransformationMethod();
/* 31 */                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
/* 39 */                    text = transformation;
                        }
/* 40 */                int maxLines = textView.getMaxLines();
/* 44 */                TextPaint textPaint = this.f2360h;
/* 46 */                if (textPaint == null) {
/* 53 */                    this.f2360h = new TextPaint();
                        } else {
/* 56 */                    textPaint.reset();
                        }
/* 65 */                this.f2360h.set(textView.getPaint());
/* 71 */                this.f2360h.setTextSize(i5);
/* 95 */                StaticLayout staticLayoutM9747a = AbstractC2362xb.m9747a(text, (Layout.Alignment) m1321e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, textView, this.f2360h, this.f2363k);
/* 100 */               if ((maxLines == -1 || (staticLayoutM9747a.getLineCount() <= maxLines && staticLayoutM9747a.getLineEnd(staticLayoutM9747a.getLineCount() - 1) == text.length())) && staticLayoutM9747a.getHeight() <= rectF.bottom) {
/* 139 */                   int i6 = i4 + 1;
/* 142 */                   i2 = i3;
/* 143 */                   i3 = i6;
                        } else {
/* 135 */                   i2 = i4 - 1;
/* 137 */                   i = i2;
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public final boolean m1324f() {
                    return m1328j() && this.f2353a != 0;
                }

                /* JADX INFO: renamed from: g */
                public final void m1325g(float f, int i) {
/* 1 */             Context context = this.f2362j;
/* 18 */            float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
/* 22 */            TextView textView = this.f2361i;
/* 34 */            if (fApplyDimension != textView.getPaint().getTextSize()) {
/* 40 */                textView.getPaint().setTextSize(fApplyDimension);
/* 43 */                boolean zIsInLayout = textView.isInLayout();
/* 51 */                if (textView.getLayout() != null) {
/* 54 */                    this.f2354b = false;
                            try {
/* 58 */                        Method methodM1320d = m1320d("nullLayouts");
/* 62 */                        if (methodM1320d != null) {
/* 65 */                            methodM1320d.invoke(textView, null);
                                }
                            } catch (Exception e) {
/* 74 */                        AbstractC1245n0.m4891s("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                            }
/* 77 */                    if (zIsInLayout) {
/* 83 */                        textView.forceLayout();
                            } else {
/* 79 */                        textView.requestLayout();
                            }
/* 86 */                    textView.invalidate();
                        }
                    }
                }

                /* JADX INFO: renamed from: h */
                public final boolean m1326h() {
/* 6 */             if (m1328j() && this.f2353a == 1) {
/* 15 */                if (!this.f2359g || this.f2358f.length == 0) {
/* 36 */                    int iFloor = ((int) Math.floor((this.f2357e - this.f2356d) / this.f2355c)) + 1;
/* 37 */                    int[] iArr = new int[iFloor];
/* 39 */                    for (int i = 0; i < iFloor; i++) {
/* 52 */                        iArr[i] = Math.round((i * this.f2355c) + this.f2356d);
                            }
/* 61 */                    this.f2358f = m1319b(iArr);
                        }
/* 63 */                this.f2354b = true;
                    } else {
/* 66 */                this.f2354b = false;
                    }
/* 68 */            return this.f2354b;
                }

                /* JADX INFO: renamed from: i */
                public final boolean m1327i() {
/* 1 */             int[] iArr = this.f2358f;
/* 3 */             int length = iArr.length;
/* 10 */            boolean z = length > 0;
/* 11 */            this.f2359g = z;
/* 13 */            if (z) {
/* 15 */                this.f2353a = 1;
/* 20 */                this.f2356d = iArr[0];
/* 26 */                this.f2357e = iArr[length - 1];
/* 30 */                this.f2355c = -1.0f;
                    }
/* 32 */            return z;
                }

                /* JADX INFO: renamed from: j */
                public final boolean m1328j() {
/* 5 */             return !(this.f2361i instanceof AppCompatEditText);
                }

                /* JADX INFO: renamed from: k */
                public final void m1329k(float f, float f2, float f3) {
/* 6 */             if (f <= 0.0f) {
/* 107 */               throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
                    }
/* 10 */            if (f2 <= f) {
/* 84 */                throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
                    }
/* 14 */            if (f3 <= 0.0f) {
/* 51 */                throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
                    }
/* 17 */            this.f2353a = 1;
/* 19 */            this.f2356d = f;
/* 21 */            this.f2357e = f2;
/* 23 */            this.f2355c = f3;
/* 26 */            this.f2359g = false;
                }
            }
