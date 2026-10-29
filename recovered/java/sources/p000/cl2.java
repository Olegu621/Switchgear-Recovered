            package p000;

            import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialPurpose;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFStack;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
            import java.util.ArrayList;
            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 80 */    public final class cl2 {

                /* JADX INFO: renamed from: a */
                public final String f2983a;

                /* JADX INFO: renamed from: b */
                public final int f2984b;

                /* JADX INFO: renamed from: c */
                public final String f2985c;

                /* JADX INFO: renamed from: d */
                public final boolean f2986d;

                /* JADX INFO: renamed from: e */
                public final boolean f2987e;

                /* JADX INFO: renamed from: f */
                public final boolean f2988f;

                /* JADX INFO: renamed from: g */
                public final vv1 f2989g;

                /* JADX INFO: renamed from: h */
                public final String f2990h;

                /* JADX INFO: renamed from: i */
                public final List f2991i;

                /* JADX INFO: renamed from: j */
                public final boolean f2992j;

                /* JADX INFO: renamed from: k */
                public final boolean f2993k;

                /* JADX INFO: renamed from: l */
                public final ArrayList f2994l;

                /* JADX INFO: renamed from: m */
                public final Integer f2995m;

                public cl2(uz1 uz1Var, boolean z, boolean z2) {
/* 1 */             uz1Var.getClass();
/* 7 */             TCFPurpose tCFPurpose = uz1Var.f17816c;
/* 15 */            this.f2983a = ya2.Companion.m2773id(tCFPurpose);
/* 19 */            this.f2984b = tCFPurpose.f6176c;
/* 23 */            this.f2985c = tCFPurpose.f6177d;
/* 27 */            this.f2986d = tCFPurpose.f6179f;
/* 29 */            boolean z3 = uz1Var.f17814a;
/* 31 */            this.f2987e = z3;
/* 35 */            this.f2988f = uz1Var.f17815b;
/* 37 */            boolean z4 = tCFPurpose.f6181h;
/* 39 */            this.f2992j = z4;
/* 51 */            this.f2993k = tCFPurpose.f6182i && !z2;
/* 65 */            this.f2989g = (z && z4) ? new vv1(false, z3) : null;
/* 69 */            this.f2990h = tCFPurpose.f6174a;
/* 73 */            this.f2991i = tCFPurpose.f6175b;
/* 75 */            this.f2994l = null;
/* 79 */            this.f2995m = tCFPurpose.f6184k;
                }

/* 81 */        public cl2(zf2 zf2Var) {
                    zf2Var.getClass();
/* 83 */            TCFSpecialPurpose tCFSpecialPurpose = zf2Var.f20131a;
/* 84 */            this.f2983a = ya2.Companion.m2775id(tCFSpecialPurpose);
/* 86 */            this.f2984b = tCFSpecialPurpose.f6197c;
/* 88 */            this.f2985c = tCFSpecialPurpose.f6198d;
/* 89 */            this.f2986d = false;
/* 90 */            this.f2987e = false;
/* 91 */            this.f2988f = true;
/* 92 */            this.f2992j = false;
/* 93 */            this.f2993k = false;
/* 94 */            this.f2989g = null;
/* 96 */            this.f2990h = tCFSpecialPurpose.f6195a;
/* 98 */            this.f2991i = tCFSpecialPurpose.f6196b;
/* 99 */            this.f2994l = null;
/* 100 */           this.f2995m = null;
                }

/* 100 */       public cl2(yf2 yf2Var, boolean z) {
                    yf2Var.getClass();
/* 102 */           TCFSpecialFeature tCFSpecialFeature = yf2Var.f19598b;
/* 103 */           this.f2983a = ya2.Companion.m2774id(tCFSpecialFeature);
/* 105 */           this.f2984b = tCFSpecialFeature.f6188c;
/* 107 */           this.f2985c = tCFSpecialFeature.f6189d;
/* 109 */           this.f2986d = tCFSpecialFeature.f6191f;
/* 110 */           boolean z2 = yf2Var.f19597a;
/* 111 */           this.f2987e = z2;
/* 112 */           this.f2988f = false;
/* 114 */           this.f2989g = z ? new vv1(false, z2) : null;
/* 116 */           this.f2990h = tCFSpecialFeature.f6186a;
/* 118 */           this.f2991i = tCFSpecialFeature.f6187b;
/* 119 */           this.f2992j = false;
/* 120 */           this.f2993k = false;
/* 121 */           this.f2994l = null;
/* 122 */           this.f2995m = null;
                }

/* 122 */       public cl2(eg2 eg2Var, boolean z, ArrayList arrayList) {
/* 124 */           TCFStack tCFStack = eg2Var.f7683b;
/* 125 */           this.f2983a = ya2.Companion.m2776id(tCFStack);
/* 127 */           this.f2984b = tCFStack.f6201b;
/* 129 */           this.f2985c = tCFStack.f6202c;
/* 130 */           this.f2986d = false;
/* 131 */           boolean z2 = eg2Var.f7682a;
/* 132 */           this.f2987e = z2;
/* 133 */           this.f2988f = false;
/* 135 */           this.f2989g = z ? new vv1(false, z2) : null;
/* 136 */           this.f2994l = arrayList;
/* 138 */           this.f2990h = tCFStack.f6200a;
/* 140 */           this.f2991i = nd0.f14189a;
/* 141 */           this.f2992j = false;
/* 142 */           this.f2993k = false;
/* 143 */           this.f2995m = null;
                }

/* 143 */       public cl2(b23 b23Var, boolean z) {
                    b23Var.getClass();
/* 145 */           TCFVendor tCFVendor = b23Var.f2184c;
/* 146 */           this.f2983a = ya2.Companion.m2777id(tCFVendor);
/* 148 */           this.f2984b = tCFVendor.f6209d;
/* 150 */           this.f2985c = tCFVendor.f6212g;
                    boolean z2 = false;
/* 151 */           this.f2986d = false;
/* 153 */           this.f2987e = b23Var.f2182a;
/* 155 */           this.f2988f = b23Var.f2183b;
/* 156 */           this.f2989g = null;
/* 157 */           this.f2990h = HttpUrl.FRAGMENT_ENCODE_SET;
/* 159 */           this.f2991i = nd0.f14189a;
/* 161 */           this.f2992j = tCFVendor.f6218m;
/* 162 */           if (tCFVendor.f6219n && !z) {
                        z2 = true;
                    }
/* 163 */           this.f2993k = z2;
/* 164 */           this.f2994l = null;
/* 165 */           this.f2995m = null;
                }
            }
