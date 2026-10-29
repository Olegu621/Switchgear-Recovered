            package com.quago.mobile.sdk;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.g1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public final class C0732g1 extends AbstractC0739j {

                /* JADX INFO: renamed from: b */
                public int f5437b;

                /* JADX INFO: renamed from: c */
                public int f5438c;

                /* JADX INFO: renamed from: d */
                public int f5439d;

                /* JADX INFO: renamed from: e */
                public int f5440e;

                /* JADX INFO: renamed from: f */
                public float f5441f;

                /* JADX INFO: renamed from: g */
                public float f5442g;

                public C0732g1(long j, int i, int i2, int i3, int i4, float f, float f2) {
/* 4 */             this.f5494a = j;
/* 6 */             this.f5437b = i;
/* 8 */             this.f5438c = i2;
/* 10 */            this.f5439d = i3;
/* 12 */            this.f5440e = i4;
/* 14 */            this.f5441f = f;
/* 16 */            this.f5442g = f2;
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
                public final void mo2578a(AbstractC0739j abstractC0739j) {
/* 3 */             if (abstractC0739j instanceof C0732g1) {
/* 6 */                 C0732g1 c0732g1 = (C0732g1) abstractC0739j;
/* 10 */                c0732g1.f5494a = this.f5494a;
/* 14 */                c0732g1.f5437b = this.f5437b;
/* 18 */                c0732g1.f5438c = this.f5438c;
/* 22 */                c0732g1.f5439d = this.f5439d;
/* 26 */                c0732g1.f5440e = this.f5440e;
/* 30 */                c0732g1.f5441f = this.f5441f;
/* 34 */                c0732g1.f5442g = this.f5442g;
                    }
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
                public final Double[] mo2580b() {
/* 99 */            return new Double[]{Double.valueOf(Long.valueOf(this.f5494a).doubleValue()), Double.valueOf(Integer.valueOf(this.f5437b).doubleValue()), Double.valueOf(Integer.valueOf(this.f5438c).doubleValue()), Double.valueOf(Integer.valueOf(this.f5439d).doubleValue()), Double.valueOf(Integer.valueOf(this.f5440e).doubleValue()), Double.valueOf(Float.valueOf(this.f5441f).doubleValue()), Double.valueOf(Float.valueOf(this.f5442g).doubleValue())};
                }

                public final Object clone() {
/* 3 */             C0732g1 c0732g1 = new C0732g1();
/* 6 */             mo2578a(c0732g1);
/* 9 */             return c0732g1;
                }

                public final String toString() {
/* 78 */            return "{timestamp=" + this.f5494a + ", screenWidth=" + this.f5437b + ", screenHeight=" + this.f5438c + ", appWidth=" + this.f5439d + ", appHeight=" + this.f5440e + ", xdpi=" + this.f5441f + ", ydpi=" + this.f5442g + "}";
                }

/* 18 */        public C0732g1(C0732g1 c0732g1) {
                    if (c0732g1 == null) {
                        return;
                    }
/* 20 */            c0732g1.mo2578a(this);
                }

/* 20 */        public C0732g1() {
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
/* 36 */        public final AbstractC0739j mo2577a() {
/* 37 */            C0732g1 c0732g1 = new C0732g1();
/* 38 */            mo2578a(c0732g1);
                    return c0732g1;
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
/* 103 */       public final boolean mo2579b(AbstractC0739j abstractC0739j) {
/* 104 */           if (!(abstractC0739j instanceof C0732g1)) {
                        return false;
                    }
/* 105 */           C0732g1 c0732g1 = (C0732g1) abstractC0739j;
                    return this.f5437b == c0732g1.f5437b && this.f5438c == c0732g1.f5438c && this.f5439d == c0732g1.f5439d && this.f5440e == c0732g1.f5440e && this.f5441f == c0732g1.f5441f && this.f5442g == c0732g1.f5442g;
                }
            }
