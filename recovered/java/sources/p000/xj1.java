            package p000;

            import android.graphics.Rect;
            import androidx.constraintlayout.widget.C0076c;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.core.app.NotificationCompat;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xj1 implements Comparable {

                /* JADX INFO: renamed from: c */
                public int f19222c;

                /* JADX INFO: renamed from: a */
                public float f19218a = 1.0f;

                /* JADX INFO: renamed from: b */
                public int f19220b = 0;

                /* JADX INFO: renamed from: d */
                public float f19223d = 0.0f;

                /* JADX INFO: renamed from: e */
                public float f19224e = 0.0f;

                /* JADX INFO: renamed from: f */
                public float f19225f = 0.0f;

                /* JADX INFO: renamed from: i */
                public float f19226i = 0.0f;

                /* JADX INFO: renamed from: v */
                public float f19227v = 1.0f;

                /* JADX INFO: renamed from: w */
                public float f19228w = 1.0f;

                /* JADX INFO: renamed from: U */
                public float f19212U = Float.NaN;

                /* JADX INFO: renamed from: V */
                public float f19213V = Float.NaN;

                /* JADX INFO: renamed from: W */
                public float f19214W = 0.0f;

                /* JADX INFO: renamed from: X */
                public float f19215X = 0.0f;

                /* JADX INFO: renamed from: Y */
                public float f19216Y = 0.0f;

                /* JADX INFO: renamed from: Z */
                public float f19217Z = Float.NaN;

                /* JADX INFO: renamed from: a0 */
                public float f19219a0 = Float.NaN;

                /* JADX INFO: renamed from: b0 */
                public final LinkedHashMap f19221b0 = new LinkedHashMap();

                /* JADX INFO: renamed from: b */
                public static boolean m9972b(float f, float f2) {
/* 5 */             if (Float.isNaN(f) || Float.isNaN(f2)) {
                        return Float.isNaN(f) != Float.isNaN(f2);
                    }
                    return Math.abs(f - f2) > 1.0E-6f;
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX INFO: renamed from: a */
                public final void m9973a(int i, HashMap map) {
/* 13 */            for (String str : map.keySet()) {
/* 25 */                w43 w43Var = (w43) map.get(str);
/* 27 */                str.getClass();
/* 35 */                byte b = -1;
                        switch (str.hashCode()) {
                            case -1249320806:
/* 208 */                       if (str.equals("rotationX")) {
/* 211 */                           b = 0;
                                }
                                break;
                            case -1249320805:
/* 197 */                       if (str.equals("rotationY")) {
/* 200 */                           b = 1;
                                }
                                break;
                            case -1225497657:
/* 186 */                       if (str.equals("translationX")) {
/* 189 */                           b = 2;
                                }
                                break;
                            case -1225497656:
/* 175 */                       if (str.equals("translationY")) {
/* 178 */                           b = 3;
                                }
                                break;
                            case -1225497655:
/* 164 */                       if (str.equals("translationZ")) {
/* 167 */                           b = 4;
                                }
                                break;
                            case -1001078227:
/* 153 */                       if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
/* 156 */                           b = 5;
                                }
                                break;
                            case -908189618:
/* 142 */                       if (str.equals("scaleX")) {
/* 145 */                           b = 6;
                                }
                                break;
                            case -908189617:
/* 131 */                       if (str.equals("scaleY")) {
/* 134 */                           b = 7;
                                }
                                break;
                            case -760884510:
/* 117 */                       if (str.equals("transformPivotX")) {
/* 121 */                           b = 8;
                                }
                                break;
                            case -760884509:
/* 103 */                       if (str.equals("transformPivotY")) {
/* 107 */                           b = 9;
                                }
                                break;
                            case -40300674:
/* 89 */                        if (str.equals("rotation")) {
/* 93 */                            b = 10;
                                }
                                break;
                            case -4379043:
/* 75 */                        if (str.equals("elevation")) {
/* 79 */                            b = 11;
                                }
                                break;
                            case 37232917:
/* 61 */                        if (str.equals("transitionPathRotate")) {
/* 65 */                            b = 12;
                                }
                                break;
                            case 92909918:
/* 47 */                        if (str.equals("alpha")) {
/* 51 */                            b = 13;
                                }
                                break;
                        }
                        switch (b) {
                            case 0:
/* 533 */                       w43Var.mo8687b(Float.isNaN(this.f19225f) ? 0.0f : this.f19225f, i);
                                break;
                            case 1:
/* 517 */                       w43Var.mo8687b(Float.isNaN(this.f19226i) ? 0.0f : this.f19226i, i);
                                break;
                            case 2:
/* 501 */                       w43Var.mo8687b(Float.isNaN(this.f19214W) ? 0.0f : this.f19214W, i);
                                break;
                            case 3:
/* 485 */                       w43Var.mo8687b(Float.isNaN(this.f19215X) ? 0.0f : this.f19215X, i);
                                break;
                            case 4:
/* 469 */                       w43Var.mo8687b(Float.isNaN(this.f19216Y) ? 0.0f : this.f19216Y, i);
                                break;
                            case 5:
/* 453 */                       w43Var.mo8687b(Float.isNaN(this.f19219a0) ? 0.0f : this.f19219a0, i);
                                break;
                            case 6:
/* 437 */                       w43Var.mo8687b(Float.isNaN(this.f19227v) ? 1.0f : this.f19227v, i);
                                break;
                            case 7:
/* 421 */                       w43Var.mo8687b(Float.isNaN(this.f19228w) ? 1.0f : this.f19228w, i);
                                break;
                            case 8:
/* 405 */                       w43Var.mo8687b(Float.isNaN(this.f19212U) ? 0.0f : this.f19212U, i);
                                break;
                            case 9:
/* 389 */                       w43Var.mo8687b(Float.isNaN(this.f19213V) ? 0.0f : this.f19213V, i);
                                break;
                            case 10:
/* 373 */                       w43Var.mo8687b(Float.isNaN(this.f19224e) ? 0.0f : this.f19224e, i);
                                break;
                            case 11:
/* 357 */                       w43Var.mo8687b(Float.isNaN(this.f19223d) ? 0.0f : this.f19223d, i);
                                break;
                            case 12:
/* 341 */                       w43Var.mo8687b(Float.isNaN(this.f19217Z) ? 0.0f : this.f19217Z, i);
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 325 */                       w43Var.mo8687b(Float.isNaN(this.f19218a) ? 1.0f : this.f19218a, i);
                                break;
                            default:
/* 226 */                       if (str.startsWith("CUSTOM")) {
/* 234 */                           String str2 = str.split(",")[1];
/* 236 */                           LinkedHashMap linkedHashMap = this.f19221b0;
/* 242 */                           if (linkedHashMap.containsKey(str2)) {
/* 248 */                               C2088pz c2088pz = (C2088pz) linkedHashMap.get(str2);
/* 252 */                               if (w43Var instanceof t43) {
/* 258 */                                   ((t43) w43Var).f16918f.append(i, c2088pz);
                                        } else {
/* 298 */                                   AbstractC1245n0.m4876d("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + c2088pz.m7618a() + w43Var);
                                        }
                                    }
                                } else {
/* 309 */                           AbstractC1245n0.m4876d("MotionPaths", "UNKNOWN spline ".concat(str));
                                }
                                break;
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m9974c(Rect rect, C0077d c0077d, int i, int i2) {
/* 1 */             rect.width();
/* 4 */             rect.height();
/* 7 */             C0076c c0076cM540h = c0077d.m540h(i2);
/* 11 */            C2349wz c2349wz = c0076cM540h.f1178c;
/* 13 */            C2312vz c2312vz = c0076cM540h.f1179d;
/* 15 */            int i3 = c2349wz.f18872c;
/* 17 */            this.f19220b = i3;
/* 19 */            int i4 = c2349wz.f18871b;
/* 21 */            this.f19222c = i4;
/* 31 */            this.f19218a = (i4 == 0 || i3 != 0) ? c2349wz.f18873d : 0.0f;
/* 33 */            C2479xz c2479xz = c0076cM540h.f1181f;
/* 35 */            boolean z = c2479xz.f19418m;
/* 39 */            this.f19223d = c2479xz.f19419n;
/* 43 */            this.f19224e = c2479xz.f19407b;
/* 47 */            this.f19225f = c2479xz.f19408c;
/* 51 */            this.f19226i = c2479xz.f19409d;
/* 55 */            this.f19227v = c2479xz.f19410e;
/* 59 */            this.f19228w = c2479xz.f19411f;
/* 63 */            this.f19212U = c2479xz.f19412g;
/* 67 */            this.f19213V = c2479xz.f19413h;
/* 71 */            this.f19214W = c2479xz.f19415j;
/* 75 */            this.f19215X = c2479xz.f19416k;
/* 79 */            this.f19216Y = c2479xz.f19417l;
/* 83 */            C2131r4.m8062c(c2312vz.f18392d);
/* 88 */            this.f19217Z = c2312vz.f18396h;
/* 94 */            this.f19219a0 = c0076cM540h.f1178c.f18874e;
/* 111 */           for (String str : c0076cM540h.f1182g.keySet()) {
/* 125 */               C2088pz c2088pz = (C2088pz) c0076cM540h.f1182g.get(str);
/* 129 */               int iM3520y = AbstractC0886en.m3520y(c2088pz.f15343c);
/* 133 */               if (iM3520y != 4 && iM3520y != 5 && iM3520y != 7) {
/* 143 */                   this.f19221b0.put(str, c2088pz);
                        }
                    }
/* 150 */           if (i != 1) {
/* 153 */               if (i != 2) {
/* 156 */                   if (i != 3) {
/* 158 */                       if (i != 4) {
/* 177 */                           return;
                                }
                            }
                        }
/* 163 */               float f = this.f19224e + 90.0f;
/* 164 */               this.f19224e = f;
/* 170 */               if (f > 180.0f) {
/* 175 */                   this.f19224e = f - 360.0f;
/* 177 */                   return;
                        }
/* 177 */               return;
                    }
/* 181 */           this.f19224e -= 90.0f;
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 3 */             ((xj1) obj).getClass();
/* 7 */             return Float.compare(0.0f, 0.0f);
                }
            }
