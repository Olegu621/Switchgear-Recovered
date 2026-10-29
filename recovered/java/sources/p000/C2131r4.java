            package p000;

            import java.lang.reflect.Array;
            import java.util.Arrays;
            
            /* JADX INFO: renamed from: r4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public class C2131r4 {

                /* JADX INFO: renamed from: c */
                public static final C2131r4 f15848c;

                /* JADX INFO: renamed from: d */
                public static final C2131r4 f15849d;

                /* JADX INFO: renamed from: e */
                public static final C2131r4 f15850e;

                /* JADX INFO: renamed from: f */
                public static final C2131r4 f15851f;

                /* JADX INFO: renamed from: g */
                public static final C2131r4 f15852g;

                /* JADX INFO: renamed from: h */
                public static final C2131r4 f15853h;

                /* JADX INFO: renamed from: i */
                public static final C2131r4 f15854i;

                /* JADX INFO: renamed from: j */
                public static final C2131r4 f15855j = new C2131r4();

                /* JADX INFO: renamed from: k */
                public static final String[] f15856k = {"standard", "accelerate", "decelerate", "linear"};

                /* JADX INFO: renamed from: l */
                public static final C2131r4 f15857l;

                /* JADX INFO: renamed from: m */
                public static final C2131r4 f15858m;

                /* JADX INFO: renamed from: n */
                public static final C2131r4 f15859n;

                /* JADX INFO: renamed from: o */
                public static final C2131r4 f15860o;

                /* JADX INFO: renamed from: p */
                public static final C2131r4 f15861p;

                /* JADX INFO: renamed from: q */
                public static final C2131r4 f15862q;

                /* JADX INFO: renamed from: r */
                public static final C2131r4 f15863r;

                /* JADX INFO: renamed from: s */
                public static final C2131r4 f15864s;

                /* JADX INFO: renamed from: t */
                public static final C2131r4 f15865t;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15866a;

                /* JADX INFO: renamed from: b */
                public String f15867b;

                static {
/* 5 */             int i = 0;
/* 9 */             f15848c = new C2131r4("TINK", i);
/* 18 */            f15849d = new C2131r4("CRUNCHY", i);
/* 27 */            f15850e = new C2131r4("LEGACY", i);
/* 36 */            f15851f = new C2131r4("NO_PREFIX", i);
/* 42 */            int i2 = 1;
/* 46 */            f15852g = new C2131r4("TINK", i2);
/* 55 */            f15853h = new C2131r4("CRUNCHY", i2);
/* 64 */            f15854i = new C2131r4("NO_PREFIX", i2);
/* 91 */            int i3 = 3;
/* 95 */            f15857l = new C2131r4("FLAT", i3);
/* 104 */           f15858m = new C2131r4("HALF_OPENED", i3);
/* 110 */           int i4 = 4;
/* 114 */           f15859n = new C2131r4("TINK", i4);
/* 123 */           f15860o = new C2131r4("CRUNCHY", i4);
/* 132 */           f15861p = new C2131r4("LEGACY", i4);
/* 141 */           f15862q = new C2131r4("NO_PREFIX", i4);
/* 147 */           int i5 = 5;
/* 151 */           f15863r = new C2131r4("TINK", i5);
/* 160 */           f15864s = new C2131r4("CRUNCHY", i5);
/* 169 */           f15865t = new C2131r4("NO_PREFIX", i5);
                }

                public C2131r4(String str) {
/* 2 */             this.f15866a = 7;
/* 4 */             str.getClass();
/* 10 */            this.f15867b = str;
                }

                /* JADX INFO: renamed from: c */
                public static C2131r4 m8062c(String str) {
/* 3 */             if (str == null) {
/* 5 */                 return null;
                    }
/* 13 */            if (str.startsWith("cubic")) {
/* 17 */                return new yb0(str);
                    }
/* 36 */            if (str.startsWith("spline")) {
/* 40 */                ah2 ah2Var = new ah2();
/* 43 */                ah2Var.f15867b = str;
/* 50 */                double[] dArr = new double[str.length() / 2];
/* 56 */                int iIndexOf = str.indexOf(40) + 1;
/* 57 */                int iIndexOf2 = str.indexOf(44, iIndexOf);
/* 61 */                int i = 0;
/* 62 */                while (iIndexOf2 != -1) {
/* 78 */                    dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
/* 80 */                    iIndexOf = iIndexOf2 + 1;
/* 82 */                    iIndexOf2 = str.indexOf(44, iIndexOf);
/* 72 */                    i++;
                        }
/* 108 */               dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
/* 110 */               double[] dArrCopyOf = Arrays.copyOf(dArr, i + 1);
/* 116 */               int length = (dArrCopyOf.length * 3) - 2;
/* 118 */               int length2 = dArrCopyOf.length - 1;
/* 122 */               double d = 1.0d / ((double) length2);
/* 136 */               double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
/* 138 */               double[] dArr3 = new double[length];
/* 142 */               for (int i2 = 0; i2 < dArrCopyOf.length; i2++) {
/* 144 */                   double d2 = dArrCopyOf[i2];
/* 146 */                   int i3 = i2 + length2;
/* 150 */                   dArr2[i3][0] = d2;
/* 153 */                   double d3 = ((double) i2) * d;
/* 154 */                   dArr3[i3] = d3;
/* 156 */                   if (i2 > 0) {
/* 160 */                       int i4 = (length2 * 2) + i2;
/* 165 */                       dArr2[i4][0] = d2 + 1.0d;
/* 169 */                       dArr3[i4] = d3 + 1.0d;
/* 171 */                       int i5 = i2 - 1;
/* 177 */                       dArr2[i5][0] = (d2 - 1.0d) - d;
/* 183 */                       dArr3[i5] = (d3 - 1.0d) - d;
                            }
                        }
/* 190 */               vj1 vj1Var = new vj1(dArr3, dArr2);
/* 215 */               System.out.println(" 0 " + vj1Var.mo6911f0(0.0d));
/* 238 */               System.out.println(" 1 " + vj1Var.mo6911f0(1.0d));
/* 241 */               ah2Var.f286u = vj1Var;
/* 243 */               return ah2Var;
                    }
/* 250 */           if (str.startsWith("Schlick")) {
/* 254 */               o72 o72Var = new o72();
/* 257 */               o72Var.f15867b = str;
/* 259 */               int iIndexOf3 = str.indexOf(40);
/* 263 */               int iIndexOf4 = str.indexOf(44, iIndexOf3);
/* 280 */               o72Var.f14660u = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
/* 282 */               int i6 = iIndexOf4 + 1;
/* 299 */               o72Var.f14661v = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
/* 301 */               return o72Var;
                    }
                    switch (str) {
                        case "accelerate":
/* 449 */                   return new yb0("cubic(0.4, 0.05, 0.8, 0.7)");
                        case "decelerate":
/* 441 */                   return new yb0("cubic(0.0, 0.0, 0.2, 0.95)");
                        case "anticipate":
/* 433 */                   return new yb0("cubic(0.36, 0, 0.66, -0.56)");
                        case "linear":
/* 425 */                   return new yb0("cubic(1, 1, 0, 0)");
                        case "overshoot":
/* 417 */                   return new yb0("cubic(0.34, 1.56, 0.64, 1)");
                        case "standard":
/* 409 */                   return new yb0("cubic(0.4, 0.0, 0.2, 1)");
                        default:
/* 399 */                   System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f15856k));
/* 402 */                   return f15855j;
                    }
                }

                /* JADX INFO: renamed from: a */
                public double mo288a(double d) {
/* 1 */             return d;
                }

                /* JADX INFO: renamed from: b */
                public double mo289b(double d) {
/* 1 */             return 1.0d;
                }

                public String toString() {
                    switch (this.f15866a) {
                        case 0:
/* 48 */                    return this.f15867b;
                        case 1:
/* 45 */                    return this.f15867b;
                        case 2:
/* 42 */                    return this.f15867b;
                        case 3:
/* 39 */                    return this.f15867b;
                        case 4:
/* 36 */                    return this.f15867b;
                        case 5:
/* 33 */                    return this.f15867b;
                        case 6:
                        case 7:
                        default:
/* 6 */                     return super.toString();
                        case 8:
/* 28 */                    return "<" + this.f15867b + '>';
                    }
                }

/* 12 */        public C2131r4() {
                    this.f15866a = 2;
/* 14 */            this.f15867b = "identity";
                }

/* 14 */        public /* synthetic */ C2131r4(String str, int i) {
/* 15 */            this.f15866a = i;
                    this.f15867b = str;
                }
            }
