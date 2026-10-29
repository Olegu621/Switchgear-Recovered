            package p000;

            import android.view.View;
            import java.text.DecimalFormat;
            import java.util.Arrays;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class c53 {

                /* JADX INFO: renamed from: a */
                public py0 f2726a;

                /* JADX INFO: renamed from: b */
                public String f2727b;

                /* JADX INFO: renamed from: c */
                public float[] f2728c;

                /* JADX INFO: renamed from: d */
                public boolean f2729d;

                /* JADX INFO: renamed from: e */
                public long f2730e;

                /* JADX INFO: renamed from: f */
                public float f2731f;

                public c53() {
/* 26 */            this.f2728c = new float[3];
/* 28 */            this.f2729d = false;
/* 32 */            this.f2731f = Float.NaN;
                }

                /* JADX INFO: renamed from: a */
                public final float m1537a(float f, long j, d31 d31Var, View view) {
/* 14 */            float[] fArr = this.f2728c;
/* 16 */            this.f2726a.mo6913h0(f, fArr);
/* 19 */            boolean z = true;
/* 20 */            float f2 = fArr[1];
/* 27 */            if (f2 == 0.0f) {
/* 29 */                this.f2729d = false;
/* 31 */                return fArr[2];
                    }
/* 40 */            if (Float.isNaN(this.f2731f)) {
/* 44 */                float fM2916a = d31Var.m2916a(view, this.f2727b);
/* 48 */                this.f2731f = fM2916a;
/* 54 */                if (Float.isNaN(fM2916a)) {
/* 56 */                    this.f2731f = 0.0f;
                        }
                    }
/* 83 */            float f3 = (float) (((((j - this.f2730e) * 1.0E-9d) * ((double) f2)) + ((double) this.f2731f)) % 1.0d);
/* 84 */            this.f2731f = f3;
/* 86 */            String str = this.f2727b;
/* 88 */            HashMap map = d31Var.f6967a;
/* 94 */            if (map.containsKey(view)) {
/* 116 */               HashMap map2 = (HashMap) map.get(view);
/* 118 */               if (map2 == null) {
/* 122 */                   map2 = new HashMap();
                        }
/* 129 */               if (map2.containsKey(str)) {
/* 146 */                   float[] fArrCopyOf = (float[]) map2.get(str);
/* 148 */                   if (fArrCopyOf == null) {
/* 150 */                       fArrCopyOf = new float[0];
                            }
/* 153 */                   if (fArrCopyOf.length <= 0) {
/* 155 */                       fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                            }
/* 159 */                   fArrCopyOf[0] = f3;
/* 161 */                   map2.put(str, fArrCopyOf);
                        } else {
/* 135 */                   map2.put(str, new float[]{f3});
/* 138 */                   map.put(view, map2);
                        }
                    } else {
/* 98 */                HashMap map3 = new HashMap();
/* 105 */               map3.put(str, new float[]{f3});
/* 108 */               map.put(view, map3);
                    }
/* 164 */           this.f2730e = j;
/* 166 */           float f4 = fArr[0];
/* 183 */           float fSin = (((float) Math.sin(this.f2731f * 6.2831855f)) * f4) + fArr[2];
/* 186 */           if (f4 == 0.0f && f2 == 0.0f) {
/* 191 */               z = false;
                    }
/* 192 */           this.f2729d = z;
/* 194 */           return fSin;
                }

                /* JADX INFO: renamed from: b */
                public abstract boolean mo67b(float f, long j, d31 d31Var, View view);

                /* JADX INFO: renamed from: c */
                public void mo1538c(int i) {
/* 19 */            System.err.println("Error no points added to " + this.f2727b);
                }

                public final String toString() {
/* 1 */             String str = this.f2727b;
/* 7 */             new DecimalFormat("##.##");
/* 10 */            return str;
                }
            }
