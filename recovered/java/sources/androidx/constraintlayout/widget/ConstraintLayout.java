            package androidx.constraintlayout.widget;

            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import android.util.SparseIntArray;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.core.app.NotificationCompat;
            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Iterator;
            import okhttp3.internal.http2.Http2Connection;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.AbstractC0208c9;
            import p000.C0875ec;
            import p000.C1864ks;
            import p000.C2199sz;
            import p000.C2294vh;
            import p000.C2569zz;
            import p000.EnumC2516yz;
            import p000.InterfaceC2462xi;
            import p000.a00;
            import p000.b00;
            import p000.bs0;
            import p000.cs0;
            import p000.cu0;
            import p000.k23;
            import p000.kb1;
            import p000.l73;
            import p000.qd2;
            import p000.t71;
            import p000.u70;
            import p000.uu0;
            import p000.y53;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public class ConstraintLayout extends ViewGroup {

                /* JADX INFO: renamed from: f0 */
                public static qd2 f1052f0;

                /* JADX INFO: renamed from: U */
                public C0077d f1053U;

                /* JADX INFO: renamed from: V */
                public C2199sz f1054V;

                /* JADX INFO: renamed from: W */
                public int f1055W;

                /* JADX INFO: renamed from: a */
                public SparseArray f1056a;

                /* JADX INFO: renamed from: a0 */
                public HashMap f1057a0;

                /* JADX INFO: renamed from: b */
                public ArrayList f1058b;

                /* JADX INFO: renamed from: b0 */
                public SparseArray f1059b0;

                /* JADX INFO: renamed from: c */
                public a00 f1060c;

                /* JADX INFO: renamed from: c0 */
                public C0075b f1061c0;

                /* JADX INFO: renamed from: d */
                public int f1062d;

                /* JADX INFO: renamed from: d0 */
                public int f1063d0;

                /* JADX INFO: renamed from: e */
                public int f1064e;

                /* JADX INFO: renamed from: e0 */
                public int f1065e0;

                /* JADX INFO: renamed from: f */
                public int f1066f;

                /* JADX INFO: renamed from: i */
                public int f1067i;

                /* JADX INFO: renamed from: v */
                public boolean f1068v;

                /* JADX INFO: renamed from: w */
                public int f1069w;

                public ConstraintLayout(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 9 */             this.f1056a = new SparseArray();
/* 17 */            this.f1058b = new ArrayList(4);
/* 24 */            this.f1060c = new a00();
/* 27 */            this.f1062d = 0;
/* 29 */            this.f1064e = 0;
/* 34 */            this.f1066f = AbstractC0208c9.API_PRIORITY_OTHER;
/* 36 */            this.f1067i = AbstractC0208c9.API_PRIORITY_OTHER;
/* 39 */            this.f1068v = true;
/* 43 */            this.f1069w = 257;
/* 46 */            this.f1053U = null;
/* 48 */            this.f1054V = null;
/* 51 */            this.f1055W = -1;
/* 58 */            this.f1057a0 = new HashMap();
/* 65 */            this.f1059b0 = new SparseArray();
/* 72 */            this.f1061c0 = new C0075b(this, this);
/* 74 */            this.f1063d0 = 0;
/* 76 */            this.f1065e0 = 0;
/* 78 */            m515d(attributeSet, 0);
                }

                private int getPaddingWidth() {
/* 18 */            int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
/* 35 */            int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
                    return iMax2 > 0 ? iMax2 : iMax;
                }

                public static qd2 getSharedValues() {
/* 3 */             if (f1052f0 == null) {
/* 7 */                 qd2 qd2Var = new qd2();
/* 12 */                new SparseIntArray();
/* 20 */                qd2Var.f15494a = new HashMap();
/* 22 */                f1052f0 = qd2Var;
                    }
/* 24 */            return f1052f0;
                }

                /* JADX WARN: Code duplicated, block: B:163:0x02cf  */
                /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
                /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
                /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
                /* JADX WARN: Code duplicated, block: B:56:0x010e  */
                /* JADX WARN: Code duplicated, block: B:58:0x0117  */
                /* JADX WARN: Code duplicated, block: B:59:0x0125  */
                /* JADX WARN: Code duplicated, block: B:61:0x012b  */
                /* JADX WARN: Code duplicated, block: B:68:0x014e  */
                /* JADX WARN: Code duplicated, block: B:70:0x0157  */
                /* JADX WARN: Code duplicated, block: B:73:0x0164  */
                /* JADX WARN: Code duplicated, block: B:75:0x0169  */
                /* JADX WARN: Code duplicated, block: B:80:0x0181  */
                /* JADX WARN: Code duplicated, block: B:82:0x018f  */
                /* JADX WARN: Code duplicated, block: B:84:0x0194  */
                /* JADX WARN: Code duplicated, block: B:85:0x019f  */
                /* JADX WARN: Code duplicated, block: B:87:0x01a3  */
                /* JADX WARN: Code duplicated, block: B:90:0x01b4  */
                /* JADX WARN: Code duplicated, block: B:93:0x01bc  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x02cf -> B:164:0x02d0). Please report as a decompilation issue!!! */
                /* JADX INFO: renamed from: a */
                public final void m512a(boolean z, View view, C2569zz c2569zz, LayoutParams layoutParams, SparseArray sparseArray) {
                    ConstraintLayout constraintLayout;
                    float f;
                    int i;
                    C2569zz c2569zz2;
                    int i2;
                    int i3;
                    int i4;
                    C2569zz c2569zz3;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    C2569zz c2569zz4;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    C2569zz c2569zz5;
                    int i14;
                    int i15;
                    LayoutParams layoutParams2;
                    int i16;
                    int i17;
                    C2569zz c2569zz6;
                    int i18;
                    float f2;
                    C2569zz c2569zz7;
                    C2569zz c2569zz8;
                    C2569zz c2569zz9;
                    int i19;
                    float fAbs;
                    int i20;
                    float f3;
/* 3 */             C2569zz c2569zz10 = c2569zz;
/* 9 */             layoutParams.m520a();
/* 16 */            c2569zz10.f20438i0 = view.getVisibility();
/* 21 */            if (layoutParams.f1107f0) {
/* 23 */                c2569zz10.f20400F = true;
/* 27 */                c2569zz10.f20438i0 = 8;
                    }
/* 29 */            c2569zz10.f20436h0 = view;
/* 33 */            if (view instanceof ConstraintHelper) {
/* 37 */                constraintLayout = this;
/* 43 */                ((ConstraintHelper) view).mo458m(c2569zz10, constraintLayout.f1060c.f22z0);
                    } else {
/* 47 */                constraintLayout = this;
                    }
/* 51 */            int i21 = -1;
/* 52 */            if (layoutParams.f1103d0) {
/* 55 */                bs0 bs0Var = (bs0) c2569zz10;
/* 57 */                int i22 = layoutParams.f1123n0;
/* 59 */                int i23 = layoutParams.f1125o0;
/* 61 */                float f4 = layoutParams.f1127p0;
/* 67 */                if (f4 != -1.0f) {
/* 69 */                    if (f4 > -1.0f) {
/* 71 */                        bs0Var.f2586u0 = f4;
/* 73 */                        bs0Var.f2587v0 = -1;
/* 75 */                        bs0Var.f2588w0 = -1;
/* 77 */                        return;
                            }
/* 828 */                   return;
                        }
/* 78 */                if (i22 != -1) {
/* 80 */                    if (i22 > -1) {
/* 82 */                        bs0Var.f2586u0 = -1.0f;
/* 84 */                        bs0Var.f2587v0 = i22;
/* 86 */                        bs0Var.f2588w0 = -1;
/* 88 */                        return;
                            }
/* 828 */                   return;
                        }
/* 89 */                if (i23 == -1 || i23 <= -1) {
/* 828 */                   return;
                        }
/* 93 */                bs0Var.f2586u0 = -1.0f;
/* 95 */                bs0Var.f2587v0 = -1;
/* 97 */                bs0Var.f2588w0 = i23;
/* 99 */                return;
                    }
/* 100 */           int i24 = layoutParams.f1109g0;
/* 102 */           int i25 = layoutParams.f1111h0;
/* 104 */           int i26 = layoutParams.f1113i0;
/* 106 */           int i27 = layoutParams.f1115j0;
/* 108 */           int i28 = layoutParams.f1117k0;
/* 110 */           int i29 = layoutParams.f1119l0;
/* 112 */           float f5 = layoutParams.f1121m0;
/* 114 */           int i30 = layoutParams.f1126p;
/* 123 */           if (i30 != -1) {
/* 130 */               C2569zz c2569zz11 = (C2569zz) sparseArray.get(i30);
/* 132 */               if (c2569zz11 != null) {
/* 134 */                   float f6 = layoutParams.f1130r;
/* 142 */                   f3 = 0.0f;
/* 145 */                   c2569zz.m10480w(7, c2569zz11, 7, layoutParams.f1128q, 0);
/* 148 */                   c2569zz10 = c2569zz;
/* 149 */                   c2569zz10.f20398D = f6;
                        } else {
/* 152 */                   f3 = 0.0f;
                        }
/* 153 */               c2569zz6 = c2569zz10;
/* 154 */               layoutParams2 = layoutParams;
/* 155 */               f = f3;
/* 156 */               i4 = 2;
/* 158 */               i18 = 5;
/* 160 */               i12 = 3;
/* 162 */               i5 = 4;
                    } else {
/* 166 */               if (i24 != -1) {
/* 173 */                   C2569zz c2569zz12 = (C2569zz) sparseArray.get(i24);
/* 175 */                   if (c2569zz12 != null) {
/* 182 */                       f = 0.0f;
/* 184 */                       i = 2;
/* 186 */                       c2569zz10.m10480w(2, c2569zz12, 2, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i28);
                            } else {
/* 190 */                       f = 0.0f;
/* 191 */                       i = 2;
                            }
                        } else {
/* 196 */                   f = 0.0f;
/* 197 */                   i = 2;
/* 199 */                   if (i25 != -1 && (c2569zz2 = (C2569zz) sparseArray.get(i25)) != null) {
/* 215 */                       c2569zz.m10480w(2, c2569zz2, 4, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i28);
/* 220 */                       i2 = 2;
/* 221 */                       i3 = 4;
                            }
/* 223 */                   if (i26 != -1) {
/* 230 */                       c2569zz9 = (C2569zz) sparseArray.get(i26);
/* 232 */                       if (c2569zz9 != null) {
/* 239 */                           c2569zz.m10480w(i3, c2569zz9, i2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i29);
                                }
/* 242 */                       i4 = i2;
                            } else {
/* 245 */                       i4 = i2;
/* 247 */                       if (i27 != -1 && (c2569zz3 = (C2569zz) sparseArray.get(i27)) != null) {
/* 263 */                           c2569zz.m10480w(i3, c2569zz3, i3, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i29);
                                }
                            }
/* 243 */                   i5 = i3;
/* 267 */                   i6 = layoutParams.f1112i;
/* 269 */                   if (i6 != -1) {
/* 276 */                       c2569zz8 = (C2569zz) sparseArray.get(i6);
/* 278 */                       if (c2569zz8 != null) {
/* 288 */                           i7 = 3;
/* 290 */                           c2569zz.m10480w(3, c2569zz8, 3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f1136x);
                                } else {
/* 294 */                           i7 = 3;
                                }
                            } else {
/* 300 */                       i7 = 3;
/* 302 */                       i8 = layoutParams.f1114j;
/* 304 */                       if (i8 == -1 && (c2569zz4 = (C2569zz) sparseArray.get(i8)) != null) {
/* 323 */                           c2569zz.m10480w(3, c2569zz4, 5, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f1136x);
/* 328 */                           i9 = 3;
/* 329 */                           i10 = 5;
                                }
/* 331 */                       i11 = layoutParams.f1116k;
/* 333 */                       if (i11 != -1) {
/* 340 */                           c2569zz7 = (C2569zz) sparseArray.get(i11);
/* 342 */                           if (c2569zz7 != null) {
/* 350 */                               c2569zz.m10480w(i10, c2569zz7, i9, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1138z);
                                    }
/* 353 */                           i12 = i9;
                                } else {
/* 357 */                           i12 = i9;
/* 358 */                           i13 = layoutParams.f1118l;
/* 360 */                           if (i13 != -1 && (c2569zz5 = (C2569zz) sparseArray.get(i13)) != null) {
/* 378 */                               c2569zz.m10480w(i10, c2569zz5, i10, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1138z);
                                    }
                                }
/* 354 */                       i14 = i10;
/* 382 */                       i15 = layoutParams.f1120m;
/* 384 */                       if (i15 != -1) {
/* 389 */                           layoutParams2 = layoutParams;
/* 392 */                           constraintLayout.m519i(c2569zz, layoutParams2, sparseArray, i15, 6);
                                } else {
/* 400 */                           layoutParams2 = layoutParams;
/* 401 */                           i16 = layoutParams2.f1122n;
/* 403 */                           if (i16 != -1) {
/* 412 */                               m519i(c2569zz, layoutParams2, sparseArray, i16, i12);
                                    } else {
/* 416 */                               i17 = layoutParams2.f1124o;
/* 418 */                               if (i17 != -1) {
/* 428 */                                   m519i(c2569zz, layoutParams2, sparseArray, i17, i14);
/* 431 */                                   c2569zz6 = c2569zz;
/* 432 */                                   i18 = i14;
                                        }
/* 435 */                               if (f5 >= f) {
/* 437 */                                   c2569zz6.f20432f0 = f5;
                                        }
/* 439 */                               f2 = layoutParams2.f1075F;
/* 443 */                               if (f2 >= f) {
/* 445 */                                   c2569zz6.f20434g0 = f2;
                                        }
                                    }
                                }
/* 395 */                       c2569zz6 = c2569zz;
/* 397 */                       i18 = i14;
/* 435 */                       if (f5 >= f) {
/* 437 */                           c2569zz6.f20432f0 = f5;
                                }
/* 439 */                       f2 = layoutParams2.f1075F;
/* 443 */                       if (f2 >= f) {
/* 445 */                           c2569zz6.f20434g0 = f2;
                                }
                            }
/* 296 */                   i9 = i7;
/* 297 */                   i10 = 5;
/* 331 */                   i11 = layoutParams.f1116k;
/* 333 */                   if (i11 != -1) {
/* 340 */                       c2569zz7 = (C2569zz) sparseArray.get(i11);
/* 342 */                       if (c2569zz7 != null) {
/* 350 */                           c2569zz.m10480w(i10, c2569zz7, i9, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1138z);
                                }
/* 353 */                       i12 = i9;
                            } else {
/* 357 */                       i12 = i9;
/* 358 */                       i13 = layoutParams.f1118l;
/* 360 */                       if (i13 != -1) {
/* 378 */                           c2569zz.m10480w(i10, c2569zz5, i10, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1138z);
                                }
                            }
/* 354 */                   i14 = i10;
/* 382 */                   i15 = layoutParams.f1120m;
/* 384 */                   if (i15 != -1) {
/* 389 */                       layoutParams2 = layoutParams;
/* 392 */                       constraintLayout.m519i(c2569zz, layoutParams2, sparseArray, i15, 6);
                            } else {
/* 400 */                       layoutParams2 = layoutParams;
/* 401 */                       i16 = layoutParams2.f1122n;
/* 403 */                       if (i16 != -1) {
/* 412 */                           m519i(c2569zz, layoutParams2, sparseArray, i16, i12);
                                } else {
/* 416 */                           i17 = layoutParams2.f1124o;
/* 418 */                           if (i17 != -1) {
/* 428 */                               m519i(c2569zz, layoutParams2, sparseArray, i17, i14);
/* 431 */                               c2569zz6 = c2569zz;
/* 432 */                               i18 = i14;
                                    }
/* 435 */                           if (f5 >= f) {
/* 437 */                               c2569zz6.f20432f0 = f5;
                                    }
/* 439 */                           f2 = layoutParams2.f1075F;
/* 443 */                           if (f2 >= f) {
/* 445 */                               c2569zz6.f20434g0 = f2;
                                    }
                                }
                            }
/* 395 */                   c2569zz6 = c2569zz;
/* 397 */                   i18 = i14;
/* 435 */                   if (f5 >= f) {
/* 437 */                       c2569zz6.f20432f0 = f5;
                            }
/* 439 */                   f2 = layoutParams2.f1075F;
/* 443 */                   if (f2 >= f) {
/* 445 */                       c2569zz6.f20434g0 = f2;
                            }
                        }
/* 193 */               i2 = i;
/* 194 */               i3 = 4;
/* 223 */               if (i26 != -1) {
/* 230 */                   c2569zz9 = (C2569zz) sparseArray.get(i26);
/* 232 */                   if (c2569zz9 != null) {
/* 239 */                       c2569zz.m10480w(i3, c2569zz9, i2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i29);
                            }
/* 242 */                   i4 = i2;
                        } else {
/* 245 */                   i4 = i2;
/* 247 */                   if (i27 != -1) {
/* 263 */                       c2569zz.m10480w(i3, c2569zz3, i3, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i29);
                            }
                        }
/* 243 */               i5 = i3;
/* 267 */               i6 = layoutParams.f1112i;
/* 269 */               if (i6 != -1) {
/* 276 */                   c2569zz8 = (C2569zz) sparseArray.get(i6);
/* 278 */                   if (c2569zz8 != null) {
/* 288 */                       i7 = 3;
/* 290 */                       c2569zz.m10480w(3, c2569zz8, 3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f1136x);
                            } else {
/* 294 */                       i7 = 3;
                            }
                        } else {
/* 300 */                   i7 = 3;
/* 302 */                   i8 = layoutParams.f1114j;
/* 304 */                   if (i8 == -1) {
                            }
/* 331 */                   i11 = layoutParams.f1116k;
/* 333 */                   if (i11 != -1) {
/* 340 */                       c2569zz7 = (C2569zz) sparseArray.get(i11);
/* 342 */                       if (c2569zz7 != null) {
/* 350 */                           c2569zz.m10480w(i10, c2569zz7, i9, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1138z);
                                }
/* 353 */                       i12 = i9;
                            } else {
/* 357 */                       i12 = i9;
/* 358 */                       i13 = layoutParams.f1118l;
/* 360 */                       if (i13 != -1) {
/* 378 */                           c2569zz.m10480w(i10, c2569zz5, i10, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1138z);
                                }
                            }
/* 354 */                   i14 = i10;
/* 382 */                   i15 = layoutParams.f1120m;
/* 384 */                   if (i15 != -1) {
/* 389 */                       layoutParams2 = layoutParams;
/* 392 */                       constraintLayout.m519i(c2569zz, layoutParams2, sparseArray, i15, 6);
                            } else {
/* 400 */                       layoutParams2 = layoutParams;
/* 401 */                       i16 = layoutParams2.f1122n;
/* 403 */                       if (i16 != -1) {
/* 412 */                           m519i(c2569zz, layoutParams2, sparseArray, i16, i12);
                                } else {
/* 416 */                           i17 = layoutParams2.f1124o;
/* 418 */                           if (i17 != -1) {
/* 428 */                               m519i(c2569zz, layoutParams2, sparseArray, i17, i14);
/* 431 */                               c2569zz6 = c2569zz;
/* 432 */                               i18 = i14;
                                    }
/* 435 */                           if (f5 >= f) {
/* 437 */                               c2569zz6.f20432f0 = f5;
                                    }
/* 439 */                           f2 = layoutParams2.f1075F;
/* 443 */                           if (f2 >= f) {
/* 445 */                               c2569zz6.f20434g0 = f2;
                                    }
                                }
                            }
/* 395 */                   c2569zz6 = c2569zz;
/* 397 */                   i18 = i14;
/* 435 */                   if (f5 >= f) {
/* 437 */                       c2569zz6.f20432f0 = f5;
                            }
/* 439 */                   f2 = layoutParams2.f1075F;
/* 443 */                   if (f2 >= f) {
/* 445 */                       c2569zz6.f20434g0 = f2;
                            }
                        }
/* 296 */               i9 = i7;
/* 297 */               i10 = 5;
/* 331 */               i11 = layoutParams.f1116k;
/* 333 */               if (i11 != -1) {
/* 340 */                   c2569zz7 = (C2569zz) sparseArray.get(i11);
/* 342 */                   if (c2569zz7 != null) {
/* 350 */                       c2569zz.m10480w(i10, c2569zz7, i9, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1138z);
                            }
/* 353 */                   i12 = i9;
                        } else {
/* 357 */                   i12 = i9;
/* 358 */                   i13 = layoutParams.f1118l;
/* 360 */                   if (i13 != -1) {
/* 378 */                       c2569zz.m10480w(i10, c2569zz5, i10, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1138z);
                            }
                        }
/* 354 */               i14 = i10;
/* 382 */               i15 = layoutParams.f1120m;
/* 384 */               if (i15 != -1) {
/* 389 */                   layoutParams2 = layoutParams;
/* 392 */                   constraintLayout.m519i(c2569zz, layoutParams2, sparseArray, i15, 6);
                        } else {
/* 400 */                   layoutParams2 = layoutParams;
/* 401 */                   i16 = layoutParams2.f1122n;
/* 403 */                   if (i16 != -1) {
/* 412 */                       m519i(c2569zz, layoutParams2, sparseArray, i16, i12);
                            } else {
/* 416 */                       i17 = layoutParams2.f1124o;
/* 418 */                       if (i17 != -1) {
/* 428 */                           m519i(c2569zz, layoutParams2, sparseArray, i17, i14);
/* 431 */                           c2569zz6 = c2569zz;
/* 432 */                           i18 = i14;
                                }
/* 435 */                       if (f5 >= f) {
/* 437 */                           c2569zz6.f20432f0 = f5;
                                }
/* 439 */                       f2 = layoutParams2.f1075F;
/* 443 */                       if (f2 >= f) {
/* 445 */                           c2569zz6.f20434g0 = f2;
                                }
                            }
                        }
/* 395 */               c2569zz6 = c2569zz;
/* 397 */               i18 = i14;
/* 435 */               if (f5 >= f) {
/* 437 */                   c2569zz6.f20432f0 = f5;
                        }
/* 439 */               f2 = layoutParams2.f1075F;
/* 443 */               if (f2 >= f) {
/* 445 */                   c2569zz6.f20434g0 = f2;
                        }
                    }
/* 447 */           if (z && ((i20 = layoutParams2.f1089T) != -1 || layoutParams2.f1090U != -1)) {
/* 457 */               int i31 = layoutParams2.f1090U;
/* 459 */               c2569zz6.f20422a0 = i20;
/* 461 */               c2569zz6.f20424b0 = i31;
                    }
/* 463 */           boolean z2 = layoutParams2.f1097a0;
/* 465 */           EnumC2516yz enumC2516yz = EnumC2516yz.f19866b;
/* 468 */           EnumC2516yz enumC2516yz2 = EnumC2516yz.f19865a;
/* 470 */           EnumC2516yz enumC2516yz3 = EnumC2516yz.f19868d;
/* 472 */           EnumC2516yz enumC2516yz4 = EnumC2516yz.f19867c;
/* 475 */           if (z2) {
/* 516 */               c2569zz6.m10462N(enumC2516yz2);
/* 521 */               c2569zz6.m10464P(((ViewGroup.MarginLayoutParams) layoutParams2).width);
/* 526 */               if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -2) {
/* 528 */                   c2569zz6.m10462N(enumC2516yz);
                        }
                    } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -1) {
/* 483 */               if (layoutParams2.f1092W) {
/* 485 */                   c2569zz6.m10462N(enumC2516yz4);
                        } else {
/* 489 */                   c2569zz6.m10462N(enumC2516yz3);
                        }
/* 498 */               c2569zz6.mo1430j(i4).f14930g = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
/* 506 */               c2569zz6.mo1430j(i5).f14930g = ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    } else {
/* 509 */               c2569zz6.m10462N(enumC2516yz4);
/* 512 */               c2569zz6.m10464P(0);
                    }
/* 533 */           if (layoutParams2.f1099b0) {
/* 574 */               c2569zz6.m10463O(enumC2516yz2);
/* 579 */               c2569zz6.m10461M(((ViewGroup.MarginLayoutParams) layoutParams2).height);
/* 584 */               if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -2) {
/* 586 */                   c2569zz6.m10463O(enumC2516yz);
                        }
                    } else if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -1) {
/* 541 */               if (layoutParams2.f1093X) {
/* 543 */                   c2569zz6.m10463O(enumC2516yz4);
                        } else {
/* 547 */                   c2569zz6.m10463O(enumC2516yz3);
                        }
/* 556 */               c2569zz6.mo1430j(i12).f14930g = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
/* 564 */               c2569zz6.mo1430j(i18).f14930g = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    } else {
/* 567 */               c2569zz6.m10463O(enumC2516yz4);
/* 570 */               c2569zz6.m10461M(0);
                    }
/* 589 */           String str = layoutParams2.f1076G;
/* 591 */           if (str == null || str.length() == 0) {
/* 730 */               c2569zz6.f20419Y = f;
                    } else {
/* 601 */               int length = str.length();
/* 607 */               int iIndexOf = str.indexOf(44);
/* 611 */               if (iIndexOf <= 0 || iIndexOf >= length - 1) {
/* 642 */                   i19 = 0;
                        } else {
/* 617 */                   String strSubstring = str.substring(0, iIndexOf);
/* 627 */                   if (strSubstring.equalsIgnoreCase("W")) {
/* 629 */                       i21 = 0;
                            } else if (strSubstring.equalsIgnoreCase("H")) {
/* 639 */                       i21 = 1;
                            }
/* 640 */                   i19 = iIndexOf + 1;
                        }
/* 645 */               int iIndexOf2 = str.indexOf(58);
                        try {
/* 649 */                   if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
/* 705 */                       String strSubstring2 = str.substring(i19);
/* 713 */                       if (strSubstring2.length() > 0) {
/* 715 */                           fAbs = Float.parseFloat(strSubstring2);
                                } else {
/* 720 */                           fAbs = f;
                                }
                            } else {
/* 654 */                       String strSubstring3 = str.substring(i19, iIndexOf2);
/* 659 */                       String strSubstring4 = str.substring(iIndexOf2 + 1);
/* 667 */                       if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
/* 720 */                           fAbs = f;
                                } else {
/* 675 */                           float f7 = Float.parseFloat(strSubstring3);
/* 679 */                           float f8 = Float.parseFloat(strSubstring4);
/* 685 */                           if (f7 <= f || f8 <= f) {
/* 720 */                               fAbs = f;
                                    } else {
/* 700 */                               fAbs = i21 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                                    }
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
/* 723 */               if (fAbs > f) {
/* 725 */                   c2569zz6.f20419Y = fAbs;
/* 727 */                   c2569zz6.f20420Z = i21;
                        }
                    }
/* 732 */           float f9 = layoutParams2.f1077H;
/* 734 */           float[] fArr = c2569zz6.f20448n0;
/* 736 */           fArr[0] = f9;
/* 740 */           fArr[1] = layoutParams2.f1078I;
/* 744 */           c2569zz6.f20444l0 = layoutParams2.f1079J;
/* 748 */           c2569zz6.f20446m0 = layoutParams2.f1080K;
/* 750 */           int i32 = layoutParams2.f1095Z;
/* 752 */           if (i32 >= 0 && i32 <= 3) {
/* 757 */               c2569zz6.f20453q = i32;
                    }
/* 759 */           int i33 = layoutParams2.f1081L;
/* 761 */           int i34 = layoutParams2.f1083N;
/* 763 */           int i35 = layoutParams2.f1085P;
/* 765 */           float f10 = layoutParams2.f1087R;
/* 767 */           c2569zz6.f20455r = i33;
/* 769 */           c2569zz6.f20461u = i34;
/* 774 */           if (i35 == Integer.MAX_VALUE) {
/* 776 */               i35 = 0;
                    }
/* 777 */           c2569zz6.f20462v = i35;
/* 779 */           c2569zz6.f20463w = f10;
/* 786 */           if (f10 > f && f10 < 1.0f && i33 == 0) {
/* 794 */               c2569zz6.f20455r = 2;
                    }
/* 796 */           int i36 = layoutParams2.f1082M;
/* 798 */           int i37 = layoutParams2.f1084O;
/* 800 */           int i38 = layoutParams2.f1086Q;
/* 802 */           float f11 = layoutParams2.f1088S;
/* 804 */           c2569zz6.f20457s = i36;
/* 806 */           c2569zz6.f20464x = i37;
/* 812 */           c2569zz6.f20465y = i38 != Integer.MAX_VALUE ? i38 : 0;
/* 814 */           c2569zz6.f20466z = f11;
/* 818 */           if (f11 <= f || f11 >= 1.0f || i36 != 0) {
/* 828 */               return;
                    }
/* 826 */           c2569zz6.f20457s = 2;
                }

                /* JADX INFO: renamed from: b */
                public final View m513b(int i) {
/* 7 */             return (View) this.f1056a.get(i);
                }

                /* JADX INFO: renamed from: c */
                public final C2569zz m514c(View view) {
/* 1 */             if (view == this) {
/* 3 */                 return this.f1060c;
                    }
/* 6 */             if (view == null) {
/* 54 */                return null;
                    }
/* 14 */            if (view.getLayoutParams() instanceof LayoutParams) {
/* 22 */                return ((LayoutParams) view.getLayoutParams()).f1129q0;
                    }
/* 34 */            view.setLayoutParams(new LayoutParams(view.getLayoutParams()));
/* 43 */            if (view.getLayoutParams() instanceof LayoutParams) {
/* 51 */                return ((LayoutParams) view.getLayoutParams()).f1129q0;
                    }
/* 54 */            return null;
                }

                @Override // android.view.ViewGroup
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             return layoutParams instanceof LayoutParams;
                }

                /* JADX INFO: renamed from: d */
                public final void m515d(AttributeSet attributeSet, int i) {
/* 1 */             a00 a00Var = this.f1060c;
/* 3 */             a00Var.f20436h0 = this;
/* 5 */             C0075b c0075b = this.f1061c0;
/* 7 */             a00Var.f21y0 = c0075b;
/* 11 */            a00Var.f19w0.f17390f = c0075b;
/* 19 */            this.f1056a.put(getId(), this);
/* 23 */            this.f1053U = null;
/* 25 */            if (attributeSet != null) {
/* 34 */                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout, i, 0);
/* 38 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 43 */                for (int i2 = 0; i2 < indexCount; i2++) {
/* 45 */                    int index = typedArrayObtainStyledAttributes.getIndex(i2);
/* 51 */                    if (index == R$styleable.ConstraintLayout_Layout_android_minWidth) {
/* 59 */                        this.f1062d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1062d);
                            } else if (index == R$styleable.ConstraintLayout_Layout_android_minHeight) {
/* 72 */                        this.f1064e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1064e);
                            } else if (index == R$styleable.ConstraintLayout_Layout_android_maxWidth) {
/* 85 */                        this.f1066f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1066f);
                            } else if (index == R$styleable.ConstraintLayout_Layout_android_maxHeight) {
/* 98 */                        this.f1067i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1067i);
                            } else if (index == R$styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
/* 111 */                       this.f1069w = typedArrayObtainStyledAttributes.getInt(index, this.f1069w);
                            } else if (index == R$styleable.ConstraintLayout_Layout_layoutDescription) {
/* 118 */                       int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
/* 122 */                       if (resourceId != 0) {
                                    try {
/* 124 */                               mo472f(resourceId);
                                    } catch (Resources.NotFoundException unused) {
/* 128 */                               this.f1054V = null;
                                    }
                                }
                            } else if (index == R$styleable.ConstraintLayout_Layout_constraintSet) {
/* 135 */                       int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                                try {
/* 141 */                           C0077d c0077d = new C0077d();
/* 144 */                           this.f1053U = c0077d;
/* 150 */                           c0077d.m542j(getContext(), resourceId2);
                                } catch (Resources.NotFoundException unused2) {
/* 154 */                           this.f1053U = null;
                                }
/* 156 */                       this.f1055W = resourceId2;
                            }
                        }
/* 161 */               typedArrayObtainStyledAttributes.recycle();
                    }
/* 166 */           a00Var.f8H0 = this.f1069w;
/* 174 */           t71.f16931p = a00Var.m10X(NotificationCompat.FLAG_GROUP_SUMMARY);
                }

                @Override // android.view.ViewGroup, android.view.View
                public void dispatchDraw(Canvas canvas) {
                    Object tag;
                    int size;
/* 3 */             ArrayList arrayList = this.f1058b;
/* 6 */             if (arrayList != null && (size = arrayList.size()) > 0) {
/* 15 */                for (int i = 0; i < size; i++) {
/* 23 */                    ((ConstraintHelper) arrayList.get(i)).mo462o(this);
                        }
                    }
/* 29 */            super.dispatchDraw(canvas);
/* 36 */            if (isInEditMode()) {
/* 38 */                float width = getWidth();
/* 43 */                float height = getHeight();
/* 48 */                int childCount = getChildCount();
/* 53 */                for (int i2 = 0; i2 < childCount; i2++) {
/* 55 */                    View childAt = getChildAt(i2);
/* 65 */                    if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
/* 83 */                        String[] strArrSplit = ((String) tag).split(",");
/* 89 */                        if (strArrSplit.length == 4) {
/* 93 */                            int i3 = Integer.parseInt(strArrSplit[0]);
/* 100 */                           int i4 = Integer.parseInt(strArrSplit[1]);
/* 107 */                           int i5 = Integer.parseInt(strArrSplit[2]);
/* 123 */                           int i6 = (int) ((i3 / 1080.0f) * width);
/* 129 */                           int i7 = (int) ((i4 / 1920.0f) * height);
/* 137 */                           int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
/* 140 */                           Paint paint = new Paint();
/* 145 */                           paint.setColor(-65536);
                                    float f = i6;
                                    float f2 = i7;
/* 150 */                           float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
/* 155 */                           canvas.drawLine(f, f2, f3, f2, paint);
/* 159 */                           float f4 = i7 + i8;
/* 162 */                           canvas.drawLine(f3, f2, f3, f4, paint);
/* 168 */                           canvas.drawLine(f3, f4, f, f4, paint);
/* 174 */                           canvas.drawLine(f, f4, f, f2, paint);
/* 185 */                           paint.setColor(-16711936);
/* 189 */                           canvas.drawLine(f, f2, f3, f4, paint);
/* 197 */                           canvas.drawLine(f, f4, f3, f2, paint);
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public final boolean m516e() {
                    return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
                }

                /* JADX INFO: renamed from: f */
                public void mo472f(int i) {
/* 10 */            this.f1054V = new C2199sz(getContext(), this, i);
                }

                @Override // android.view.View
                public final void forceLayout() {
/* 2 */             this.f1068v = true;
/* 4 */             super.forceLayout();
                }

                /* JADX INFO: renamed from: g */
                public final void m517g(int i, int i2, int i3, int i4, boolean z, boolean z2) {
/* 1 */             C0075b c0075b = this.f1061c0;
/* 3 */             int i5 = c0075b.f1172e;
/* 10 */            int iResolveSizeAndState = View.resolveSizeAndState(i3 + c0075b.f1171d, i, 0);
/* 22 */            int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
/* 25 */            int iMin = Math.min(this.f1066f, iResolveSizeAndState & 16777215);
/* 31 */            int iMin2 = Math.min(this.f1067i, iResolveSizeAndState2);
/* 37 */            if (z) {
/* 39 */                iMin |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                    }
/* 40 */            if (z2) {
/* 42 */                iMin2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                    }
/* 43 */            setMeasuredDimension(iMin, iMin2);
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 3 */             return new LayoutParams();
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new LayoutParams(getContext(), attributeSet);
                }

                public int getMaxHeight() {
/* 1 */             return this.f1067i;
                }

                public int getMaxWidth() {
/* 1 */             return this.f1066f;
                }

                public int getMinHeight() {
/* 1 */             return this.f1064e;
                }

                public int getMinWidth() {
/* 1 */             return this.f1062d;
                }

                public int getOptimizationLevel() {
/* 3 */             return this.f1060c.f8H0;
                }

                public String getSceneString() {
                    int id;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             a00 a00Var = this.f1060c;
/* 11 */            if (a00Var.f20439j == null) {
/* 13 */                int id2 = getId();
/* 17 */                if (id2 != -1) {
/* 31 */                    a00Var.f20439j = getContext().getResources().getResourceEntryName(id2);
                        } else {
/* 36 */                    a00Var.f20439j = "parent";
                        }
                    }
/* 40 */            if (a00Var.f20442k0 == null) {
/* 44 */                a00Var.f20442k0 = a00Var.f20439j;
                    }
/* 56 */            for (C2569zz c2569zz : a00Var.f17u0) {
/* 64 */                View view = c2569zz.f20436h0;
/* 66 */                if (view != null) {
/* 70 */                    if (c2569zz.f20439j == null && (id = view.getId()) != -1) {
/* 90 */                        c2569zz.f20439j = getContext().getResources().getResourceEntryName(id);
                            }
/* 94 */                    if (c2569zz.f20442k0 == null) {
/* 98 */                        c2569zz.f20442k0 = c2569zz.f20439j;
                            }
                        }
                    }
/* 101 */           a00Var.mo11o(sb);
/* 104 */           return sb.toString();
                }

                /* JADX WARN: Code duplicated, block: B:102:0x01e2 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:103:0x01e4 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:108:0x01ed  */
                /* JADX WARN: Code duplicated, block: B:110:0x0203  */
                /* JADX WARN: Code duplicated, block: B:112:0x0209  */
                /* JADX WARN: Code duplicated, block: B:114:0x0213  */
                /* JADX WARN: Code duplicated, block: B:115:0x0216  */
                /* JADX WARN: Code duplicated, block: B:117:0x021a  */
                /* JADX WARN: Code duplicated, block: B:119:0x0220  */
                /* JADX WARN: Code duplicated, block: B:122:0x0229 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:200:0x03d6  */
                /* JADX WARN: Code duplicated, block: B:202:0x03e8  */
                /* JADX WARN: Code duplicated, block: B:205:0x03f4 A[LOOP:11: B:203:0x03ee->B:205:0x03f4, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:207:0x043b  */
                /* JADX WARN: Code duplicated, block: B:210:0x0457  */
                /* JADX WARN: Code duplicated, block: B:211:0x045e  */
                /* JADX WARN: Code duplicated, block: B:213:0x0462  */
                /* JADX WARN: Code duplicated, block: B:215:0x046c A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:216:0x046e  */
                /* JADX WARN: Code duplicated, block: B:217:0x0470  */
                /* JADX WARN: Code duplicated, block: B:219:0x0473  */
                /* JADX WARN: Code duplicated, block: B:220:0x0475  */
                /* JADX WARN: Code duplicated, block: B:222:0x047a  */
                /* JADX WARN: Code duplicated, block: B:224:0x048a  */
                /* JADX WARN: Code duplicated, block: B:230:0x0493  */
                /* JADX WARN: Code duplicated, block: B:232:0x04a4  */
                /* JADX WARN: Code duplicated, block: B:234:0x04b0  */
                /* JADX WARN: Code duplicated, block: B:235:0x04b4  */
                /* JADX WARN: Code duplicated, block: B:253:0x04e3  */
                /* JADX WARN: Code duplicated, block: B:259:0x04ef  */
                /* JADX WARN: Code duplicated, block: B:261:0x04f2  */
                /* JADX WARN: Code duplicated, block: B:266:0x04fe  */
                /* JADX WARN: Code duplicated, block: B:273:0x050d  */
                /* JADX WARN: Code duplicated, block: B:27:0x00b1 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:280:0x051c A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:281:0x051e  */
                /* JADX WARN: Code duplicated, block: B:286:0x0528  */
                /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
                /* JADX WARN: Code duplicated, block: B:290:0x053f  */
                /* JADX WARN: Code duplicated, block: B:292:0x0547  */
                /* JADX WARN: Code duplicated, block: B:295:0x054e  */
                /* JADX WARN: Code duplicated, block: B:297:0x056b  */
                /* JADX WARN: Code duplicated, block: B:300:0x057c  */
                /* JADX WARN: Code duplicated, block: B:305:0x0594  */
                /* JADX WARN: Code duplicated, block: B:307:0x0597 A[LOOP:5: B:306:0x0595->B:307:0x0597, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
                /* JADX WARN: Code duplicated, block: B:310:0x05ad  */
                /* JADX WARN: Code duplicated, block: B:312:0x05b2  */
                /* JADX WARN: Code duplicated, block: B:314:0x05b8  */
                /* JADX WARN: Code duplicated, block: B:316:0x05bc  */
                /* JADX WARN: Code duplicated, block: B:319:0x05c2  */
                /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
                /* JADX WARN: Code duplicated, block: B:320:0x05c4  */
                /* JADX WARN: Code duplicated, block: B:323:0x05df  */
                /* JADX WARN: Code duplicated, block: B:325:0x05ed  */
                /* JADX WARN: Code duplicated, block: B:326:0x05f5  */
                /* JADX WARN: Code duplicated, block: B:328:0x0616  */
                /* JADX WARN: Code duplicated, block: B:32:0x00c9 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:330:0x061b  */
                /* JADX WARN: Code duplicated, block: B:334:0x063c  */
                /* JADX WARN: Code duplicated, block: B:336:0x0641  */
                /* JADX WARN: Code duplicated, block: B:338:0x0646  */
                /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
                /* JADX WARN: Code duplicated, block: B:347:0x0686  */
                /* JADX WARN: Code duplicated, block: B:349:0x068d  */
                /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
                /* JADX WARN: Code duplicated, block: B:351:0x0697  */
                /* JADX WARN: Code duplicated, block: B:355:0x06a1  */
                /* JADX WARN: Code duplicated, block: B:361:0x06af A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:369:0x06c6 A[PHI: r18
  0x06c6: PHI (r18v4 int) = (r18v2 int), (r18v2 int), (r18v2 int), (r18v5 int) binds: [B:359:0x06ac, B:368:0x06c4, B:365:0x06bf, B:354:0x069c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
                /* JADX WARN: Code duplicated, block: B:372:0x06df  */
                /* JADX WARN: Code duplicated, block: B:375:0x06f4  */
                /* JADX WARN: Code duplicated, block: B:377:0x06f9  */
                /* JADX WARN: Code duplicated, block: B:380:0x0719  */
                /* JADX WARN: Code duplicated, block: B:382:0x071d  */
                /* JADX WARN: Code duplicated, block: B:384:0x0720  */
                /* JADX WARN: Code duplicated, block: B:386:0x0725  */
                /* JADX WARN: Code duplicated, block: B:389:0x0744  */
                /* JADX WARN: Code duplicated, block: B:38:0x00e0  */
                /* JADX WARN: Code duplicated, block: B:391:0x0748  */
                /* JADX WARN: Code duplicated, block: B:394:0x074d  */
                /* JADX WARN: Code duplicated, block: B:397:0x0753  */
                /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
                /* JADX WARN: Code duplicated, block: B:401:0x076c A[LOOP:7: B:345:0x0681->B:401:0x076c, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:404:0x01dd A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:42:0x00f6  */
                /* JADX WARN: Code duplicated, block: B:432:0x052c A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:435:0x058b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:436:0x058b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:441:0x077a A[EDGE_INSN: B:441:0x077a->B:402:0x077a BREAK  A[LOOP:7: B:345:0x0681->B:401:0x076c], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:442:0x077a A[EDGE_INSN: B:442:0x077a->B:402:0x077a BREAK  A[LOOP:7: B:345:0x0681->B:401:0x076c], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
                /* JADX WARN: Code duplicated, block: B:49:0x0130  */
                /* JADX WARN: Code duplicated, block: B:50:0x0133  */
                /* JADX WARN: Code duplicated, block: B:53:0x013b  */
                /* JADX WARN: Code duplicated, block: B:54:0x013e  */
                /* JADX WARN: Code duplicated, block: B:57:0x0168  */
                /* JADX WARN: Code duplicated, block: B:61:0x0171  */
                /* JADX WARN: Code duplicated, block: B:64:0x017b  */
                /* JADX WARN: Code duplicated, block: B:67:0x0180  */
                /* JADX WARN: Code duplicated, block: B:69:0x0194  */
                /* JADX WARN: Code duplicated, block: B:70:0x0197  */
                /* JADX WARN: Code duplicated, block: B:73:0x019d  */
                /* JADX WARN: Code duplicated, block: B:74:0x01a0  */
                /* JADX WARN: Code duplicated, block: B:76:0x01a3 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:80:0x01ae  */
                /* JADX WARN: Code duplicated, block: B:83:0x01b5 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:86:0x01bb  */
                /* JADX WARN: Code duplicated, block: B:99:0x01db  */
                /* JADX INFO: renamed from: h */
                public final void m518h(a00 a00Var, int i, int i2, int i3) {
                    int iMax;
                    int i4;
                    int iMax2;
                    EnumC2516yz enumC2516yz;
                    int iM10475r;
                    u70 u70Var;
                    int i5;
                    int i6;
                    C0875ec c0875ec;
                    a00 a00Var2;
                    ArrayList arrayList;
                    InterfaceC2462xi interfaceC2462xi;
                    int size;
                    int iM10475r2;
                    int iM10472l;
                    boolean zM6029B;
                    boolean z;
                    EnumC2516yz enumC2516yz2;
                    int i7;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    ArrayList arrayList2;
                    InterfaceC2462xi interfaceC2462xi2;
                    EnumC2516yz enumC2516yz3;
                    EnumC2516yz enumC2516yz4;
                    int i8;
                    boolean zM8U;
                    int size2;
                    EnumC2516yz[] enumC2516yzArr;
                    boolean z5;
                    boolean z6;
                    int iMax3;
                    int iMax4;
                    int i9;
                    boolean z7;
                    boolean z8;
                    ArrayList arrayList3;
                    int i10;
                    boolean z9;
                    int i11;
                    InterfaceC2462xi interfaceC2462xi3;
                    int iMax5;
                    boolean z10;
                    int iMax6;
                    int i12;
                    int i13;
                    boolean z11;
                    C2569zz c2569zz;
                    int i14;
                    int iM10475r3;
                    int iM10472l2;
                    boolean z12;
                    InterfaceC2462xi interfaceC2462xi4;
                    int iM10475r4;
                    boolean z13;
                    int iM10472l3;
                    C2569zz c2569zz2;
                    int iM10475r5;
                    int iM10472l4;
                    boolean z14;
                    InterfaceC2462xi interfaceC2462xi5;
                    boolean zM3368F;
                    int iM10475r6;
                    int iM10472l5;
                    int i15;
                    boolean z15;
                    int size3;
                    InterfaceC2462xi interfaceC2462xi6;
                    int i16;
                    ConstraintLayout constraintLayout;
                    int childCount;
                    ArrayList arrayList4;
                    int i17;
                    int size4;
                    int i18;
                    View childAt;
                    Placeholder placeholder;
                    LayoutParams layoutParams;
                    C2569zz c2569zz3;
                    C2569zz c2569zz4;
                    C2569zz c2569zz5;
                    C2569zz c2569zz6;
                    EnumC2516yz enumC2516yzM10471k;
                    EnumC2516yz enumC2516yzM10471k2;
                    int i19;
                    boolean z16;
                    uu0 uu0Var;
                    k23 k23Var;
                    int iMin;
                    int iMin2;
                    int i20;
                    boolean z17;
                    a00 a00Var3;
                    int i21;
                    int i22;
                    Iterator it;
                    boolean z18;
                    boolean z19;
                    ArrayList<l73> arrayList5;
                    int i23;
                    boolean z20;
                    boolean z21;
                    int i24;
                    C2569zz c2569zz7;
                    int i25;
                    EnumC2516yz[] enumC2516yzArr2;
                    boolean z22;
                    boolean z23;
                    boolean z24;
/* 1 */             int mode = View.MeasureSpec.getMode(i2);
/* 2 */             int size5 = View.MeasureSpec.getSize(i2);
/* 3 */             int mode2 = View.MeasureSpec.getMode(i3);
/* 4 */             int size6 = View.MeasureSpec.getSize(i3);
/* 5 */             int iMax7 = Math.max(0, getPaddingTop());
/* 6 */             int iMax8 = Math.max(0, getPaddingBottom());
                    int i26 = iMax7 + iMax8;
/* 7 */             int paddingWidth = getPaddingWidth();
/* 8 */             C0075b c0075b = this.f1061c0;
/* 9 */             c0075b.f1169b = iMax7;
/* 10 */            c0075b.f1170c = iMax8;
/* 11 */            c0075b.f1171d = paddingWidth;
/* 12 */            c0075b.f1172e = i26;
/* 13 */            c0075b.f1173f = i2;
/* 14 */            c0075b.f1174g = i3;
/* 15 */            int iMax9 = Math.max(0, getPaddingStart());
/* 16 */            int iMax10 = Math.max(0, getPaddingEnd());
                    if (iMax9 <= 0 && iMax10 <= 0) {
/* 17 */                iMax9 = Math.max(0, getPaddingLeft());
                    } else if (m516e()) {
                        iMax9 = iMax10;
                    }
                    int i27 = size5 - paddingWidth;
                    int i28 = size6 - i26;
/* 19 */            int i29 = c0075b.f1172e;
/* 20 */            int i30 = c0075b.f1171d;
/* 21 */            int childCount2 = getChildCount();
/* 22 */            EnumC2516yz enumC2516yz5 = EnumC2516yz.f19866b;
                    EnumC2516yz enumC2516yz6 = EnumC2516yz.f19865a;
                    if (mode != Integer.MIN_VALUE) {
                        if (mode != 0) {
/* 23 */                    iMax = mode != 1073741824 ? 0 : Math.min(this.f1066f - i30, i27);
                            i4 = Integer.MIN_VALUE;
                            enumC2516yz5 = enumC2516yz6;
                        } else {
                            if (childCount2 == 0) {
/* 24 */                        iMax = Math.max(0, this.f1062d);
                            } else {
                                iMax = 0;
                            }
                            i4 = Integer.MIN_VALUE;
                        }
                        if (mode2 != i4) {
                            if (mode2 != 0) {
                                if (mode2 != 1073741824) {
                                    enumC2516yz = enumC2516yz6;
                                    iMax2 = 0;
                                } else {
/* 26 */                            iMax2 = Math.min(this.f1067i - i29, i28);
                                    enumC2516yz = enumC2516yz6;
                                }
                            } else if (childCount2 == 0) {
                                enumC2516yz = enumC2516yz5;
/* 27 */                        iMax2 = Math.max(0, this.f1064e);
                            } else {
                                iMax2 = 0;
                            }
/* 29 */                    iM10475r = a00Var.m10475r();
                            u70Var = a00Var.f19w0;
                            if (iMax == iM10475r || iMax2 != a00Var.m10472l()) {
/* 30 */                        u70Var.f17387c = true;
                            }
/* 31 */                    a00Var.f20422a0 = 0;
/* 32 */                    a00Var.f20424b0 = 0;
/* 33 */                    int i31 = this.f1066f - i30;
/* 34 */                    int[] iArr = a00Var.f20397C;
                            iArr[0] = i31;
/* 36 */                    iArr[1] = this.f1067i - i29;
/* 37 */                    a00Var.f20428d0 = 0;
/* 38 */                    a00Var.f20430e0 = 0;
/* 39 */                    a00Var.m10462N(enumC2516yz5);
/* 40 */                    a00Var.m10464P(iMax);
/* 41 */                    a00Var.m10463O(enumC2516yz);
/* 42 */                    a00Var.m10461M(iMax2);
/* 43 */                    i5 = this.f1062d - i30;
                            if (i5 < 0) {
/* 44 */                        a00Var.f20428d0 = 0;
                            } else {
/* 45 */                        a00Var.f20428d0 = i5;
                            }
/* 46 */                    i6 = this.f1064e - i29;
                            if (i6 < 0) {
/* 47 */                        a00Var.f20430e0 = 0;
                            } else {
/* 48 */                        a00Var.f20430e0 = i6;
                            }
/* 49 */                    a00Var.f2B0 = iMax9;
/* 50 */                    a00Var.f3C0 = iMax7;
/* 51 */                    c0875ec = a00Var.f18v0;
/* 52 */                    a00Var2 = (a00) c0875ec.f7615d;
/* 53 */                    arrayList = (ArrayList) c0875ec.f7613b;
/* 54 */                    interfaceC2462xi = a00Var.f21y0;
/* 55 */                    size = a00Var.f17u0.size();
/* 56 */                    iM10475r2 = a00Var.m10475r();
/* 57 */                    iM10472l = a00Var.m10472l();
/* 58 */                    zM6029B = kb1.m6029B(i, 128);
/* 59 */                    if (!zM6029B || kb1.m6029B(i, 64)) {
                                z = true;
                            } else {
                                z = false;
                            }
/* 60 */                    enumC2516yz2 = EnumC2516yz.f19867c;
                            boolean z25 = z;
                            if (z) {
                                i24 = 0;
                                while (true) {
                                    i7 = size;
                                    if (i24 < size) {
/* 61 */                                c2569zz7 = (C2569zz) a00Var.f17u0.get(i24);
                                        i25 = i24;
/* 62 */                                enumC2516yzArr2 = c2569zz7.f20415U;
/* 63 */                                if (enumC2516yzArr2[0] == enumC2516yz2) {
                                            z22 = true;
                                        } else {
                                            z22 = false;
                                        }
/* 64 */                                if (enumC2516yzArr2[1] == enumC2516yz2) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                        if (z22 || !z23 || c2569zz7.f20419Y <= 0.0f) {
                                            z24 = false;
                                        } else {
                                            z24 = true;
                                        }
/* 66 */                                if ((c2569zz7.m10482y() || !z24) && !((c2569zz7.m10483z() && z24) || (c2569zz7 instanceof y53) || c2569zz7.m10482y() || c2569zz7.m10483z())) {
                                            i24 = i25 + 1;
                                            size = i7;
                                        } else {
                                            z2 = false;
                                        }
                                    }
                                    z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zM6029B);
                                    if (z3) {
/* 72 */                                iMin = Math.min(a00Var.f20397C[0], i27);
/* 74 */                                iMin2 = Math.min(a00Var.f20397C[1], i28);
                                        i20 = 1073741824;
                                        if (mode == 1073741824) {
/* 75 */                                    if (a00Var.m10475r() != iMin) {
/* 76 */                                        a00Var.m10464P(iMin);
                                                z17 = true;
/* 77 */                                        u70Var.f17386b = true;
                                            } else {
                                                z17 = true;
                                            }
                                            i20 = 1073741824;
                                        } else {
                                            z17 = true;
                                        }
                                        if (mode2 == i20) {
/* 78 */                                    if (a00Var.m10472l() != iMin2) {
/* 79 */                                        a00Var.m10461M(iMin2);
/* 80 */                                        u70Var.f17386b = z17;
                                            }
                                            i20 = 1073741824;
                                        }
                                        if (mode == i20 || mode2 != i20) {
                                            z4 = z3;
                                            a00Var2 = a00Var2;
                                            arrayList2 = arrayList;
                                            interfaceC2462xi2 = interfaceC2462xi;
                                            enumC2516yz3 = enumC2516yz6;
                                            enumC2516yz4 = enumC2516yz5;
/* 134 */                                   a00Var3 = u70Var.f17385a;
/* 135 */                                   if (u70Var.f17386b) {
/* 136 */                                       it = a00Var3.f17u0.iterator();
                                                while (it.hasNext()) {
                                                    C2569zz c2569zz8 = (C2569zz) it.next();
/* 137 */                                           c2569zz8.m10470i();
/* 138 */                                           c2569zz8.f20421a = false;
/* 139 */                                           uu0 uu0Var2 = c2569zz8.f20427d;
                                                    Iterator it2 = it;
                                                    uu0Var2.f13139e.f17890j = false;
/* 140 */                                           uu0Var2.f13141g = false;
/* 141 */                                           uu0Var2.m9139n();
/* 142 */                                           k23 k23Var2 = c2569zz8.f20429e;
                                                    k23Var2.f13139e.f17890j = false;
/* 143 */                                           k23Var2.f13141g = false;
/* 144 */                                           k23Var2.m5936m();
                                                    it = it2;
                                                }
                                                i21 = 0;
/* 145 */                                       a00Var3.m10470i();
/* 146 */                                       a00Var3.f20421a = false;
/* 147 */                                       uu0 uu0Var3 = a00Var3.f20427d;
                                                uu0Var3.f13139e.f17890j = false;
/* 148 */                                       uu0Var3.f13141g = false;
/* 149 */                                       uu0Var3.m9139n();
/* 150 */                                       k23 k23Var3 = a00Var3.f20429e;
                                                k23Var3.f13139e.f17890j = false;
/* 151 */                                       k23Var3.f13141g = false;
/* 152 */                                       k23Var3.m5936m();
/* 153 */                                       u70Var.m8965c();
                                            } else {
                                                i21 = 0;
                                            }
/* 154 */                                   u70Var.m8964b(u70Var.f17388d);
/* 155 */                                   a00Var3.f20422a0 = i21;
/* 156 */                                   a00Var3.f20424b0 = i21;
/* 157 */                                   a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                                   a00Var3.f20429e.f13142h.mo6945d(i21);
                                            i22 = 1073741824;
                                            if (mode == 1073741824) {
/* 159 */                                       zM8U = a00Var.m8U(i21, zM6029B);
                                                i8 = 1;
                                            } else {
                                                i8 = 0;
                                                zM8U = true;
                                            }
                                            if (mode2 == 1073741824) {
/* 160 */                                       zM8U &= a00Var.m8U(1, zM6029B);
                                                i8++;
                                            }
                                        } else {
/* 81 */                                    ArrayList arrayList6 = u70Var.f17389e;
/* 82 */                                    a00 a00Var4 = u70Var.f17385a;
/* 83 */                                    if (u70Var.f17386b || u70Var.f17387c) {
                                                for (C2569zz c2569zz9 : a00Var4.f17u0) {
                                                    boolean z26 = z3;
/* 85 */                                            c2569zz9.m10470i();
/* 86 */                                            c2569zz9.f20421a = false;
/* 87 */                                            c2569zz9.f20427d.m9139n();
/* 88 */                                            c2569zz9.f20429e.m5936m();
                                                    arrayList6 = arrayList6;
                                                    z3 = z26;
                                                }
                                                z4 = z3;
                                                arrayList5 = arrayList6;
/* 89 */                                        a00Var4.m10470i();
                                                i23 = 0;
/* 90 */                                        a00Var4.f20421a = false;
/* 91 */                                        a00Var4.f20427d.m9139n();
/* 92 */                                        a00Var4.f20429e.m5936m();
/* 93 */                                        u70Var.f17387c = false;
                                            } else {
                                                z4 = z3;
                                                arrayList5 = arrayList6;
                                                i23 = 0;
                                            }
/* 94 */                                    u70Var.m8964b(u70Var.f17388d);
/* 95 */                                    a00Var4.f20422a0 = i23;
/* 96 */                                    a00Var4.f20424b0 = i23;
/* 97 */                                    EnumC2516yz enumC2516yzM10471k3 = a00Var4.m10471k(i23);
/* 98 */                                    EnumC2516yz enumC2516yzM10471k4 = a00Var4.m10471k(1);
/* 99 */                                    if (u70Var.f17386b) {
/* 100 */                                       u70Var.m8965c();
                                            }
/* 101 */                                   int iM10476s = a00Var4.m10476s();
                                            interfaceC2462xi2 = interfaceC2462xi;
/* 102 */                                   int iM10477t = a00Var4.m10477t();
                                            arrayList2 = arrayList;
/* 103 */                                   a00Var4.f20427d.f13142h.mo6945d(iM10476s);
/* 104 */                                   a00Var4.f20429e.f13142h.mo6945d(iM10477t);
/* 105 */                                   u70Var.m8969g();
                                            enumC2516yz4 = enumC2516yz5;
                                            if (enumC2516yzM10471k3 == enumC2516yz4 || enumC2516yzM10471k4 == enumC2516yz4) {
                                                if (zM6029B) {
/* 106 */                                           Iterator it3 = arrayList5.iterator();
                                                    while (it3.hasNext()) {
/* 107 */                                               if (!((l73) it3.next()).mo1445k()) {
                                                            zM6029B = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                                if (zM6029B && enumC2516yzM10471k3 == enumC2516yz4) {
                                                    enumC2516yz3 = enumC2516yz6;
/* 108 */                                           a00Var4.m10462N(enumC2516yz3);
/* 109 */                                           a00Var4.m10464P(u70Var.m8966d(a00Var4, 0));
/* 110 */                                           a00Var4.f20427d.f13139e.mo6945d(a00Var4.m10475r());
                                                } else {
                                                    enumC2516yz3 = enumC2516yz6;
                                                }
                                                if (zM6029B && enumC2516yzM10471k4 == enumC2516yz4) {
/* 111 */                                           a00Var4.m10463O(enumC2516yz3);
/* 112 */                                           a00Var4.m10461M(u70Var.m8966d(a00Var4, 1));
/* 113 */                                           a00Var4.f20429e.f13139e.mo6945d(a00Var4.m10472l());
                                                }
                                            } else {
                                                iM10476s = iM10476s;
                                                enumC2516yz3 = enumC2516yz6;
                                                iM10477t = iM10477t;
                                            }
/* 114 */                                   EnumC2516yz enumC2516yz7 = a00Var4.f20415U[0];
                                            EnumC2516yz enumC2516yz8 = EnumC2516yz.f19868d;
                                            if (enumC2516yz7 == enumC2516yz3 || enumC2516yz7 == enumC2516yz8) {
/* 115 */                                       int iM10475r7 = a00Var4.m10475r() + iM10476s;
/* 116 */                                       a00Var4.f20427d.f13143i.mo6945d(iM10475r7);
/* 117 */                                       a00Var4.f20427d.f13139e.mo6945d(iM10475r7 - iM10476s);
/* 118 */                                       u70Var.m8969g();
/* 119 */                                       EnumC2516yz enumC2516yz9 = a00Var4.f20415U[1];
                                                if (enumC2516yz9 == enumC2516yz3 || enumC2516yz9 == enumC2516yz8) {
/* 120 */                                           int iM10472l6 = a00Var4.m10472l() + iM10477t;
/* 121 */                                           a00Var4.f20429e.f13143i.mo6945d(iM10472l6);
/* 122 */                                           a00Var4.f20429e.f13139e.mo6945d(iM10472l6 - iM10477t);
                                                }
/* 123 */                                       u70Var.m8969g();
                                                z20 = true;
                                            } else {
                                                z20 = false;
                                            }
                                            for (l73 l73Var : arrayList5) {
/* 125 */                                       if (l73Var.f13136b != a00Var4 || l73Var.f13141g) {
/* 126 */                                           l73Var.mo1443e();
                                                }
                                            }
/* 127 */                                   Iterator it4 = arrayList5.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    z21 = true;
                                                    break;
                                                }
                                                l73 l73Var2 = (l73) it4.next();
/* 128 */                                       if (z20 || l73Var2.f13136b != a00Var4) {
/* 129 */                                           if (!l73Var2.f13142h.f17890j || ((!l73Var2.f13143i.f17890j && !(l73Var2 instanceof cs0)) || (!l73Var2.f13139e.f17890j && !(l73Var2 instanceof C1864ks) && !(l73Var2 instanceof cs0)))) {
                                                        z21 = false;
                                                        break;
                                                    }
                                                }
                                            }
/* 132 */                                   a00Var4.m10462N(enumC2516yzM10471k3);
/* 133 */                                   a00Var4.m10463O(enumC2516yzM10471k4);
                                            zM8U = z21;
                                            i8 = 2;
                                            i22 = 1073741824;
                                        }
                                        if (zM8U) {
                                            if (mode == i22) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            if (mode2 == i22) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
/* 161 */                                   a00Var.mo5Q(z18, z19);
                                        }
                                    } else {
                                        z4 = z3;
                                        a00Var2 = a00Var2;
                                        arrayList2 = arrayList;
                                        interfaceC2462xi2 = interfaceC2462xi;
                                        enumC2516yz3 = enumC2516yz6;
                                        enumC2516yz4 = enumC2516yz5;
                                        i8 = 0;
                                        zM8U = false;
                                    }
                                    if (zM8U || i8 != 2) {
/* 162 */                               int i32 = a00Var.f8H0;
                                        if (i7 > 0) {
/* 163 */                                   size3 = a00Var.f17u0.size();
/* 164 */                                   boolean zM10X = a00Var.m10X(64);
/* 165 */                                   interfaceC2462xi6 = a00Var.f21y0;
                                            i16 = 0;
                                            while (i16 < size3) {
/* 166 */                                       c2569zz6 = (C2569zz) a00Var.f17u0.get(i16);
/* 167 */                                       if (!(c2569zz6 instanceof bs0) || (c2569zz6 instanceof C2294vh) || c2569zz6.f20401G || (zM10X && (uu0Var = c2569zz6.f20427d) != null && (k23Var = c2569zz6.f20429e) != null && uu0Var.f13139e.f17890j && k23Var.f13139e.f17890j)) {
                                                    i19 = size3;
                                                } else {
/* 171 */                                           enumC2516yzM10471k = c2569zz6.m10471k(0);
/* 172 */                                           enumC2516yzM10471k2 = c2569zz6.m10471k(1);
                                                    i19 = size3;
/* 173 */                                           if (enumC2516yzM10471k == enumC2516yz2 || c2569zz6.f20455r == 1 || enumC2516yzM10471k2 != enumC2516yz2 || c2569zz6.f20457s == 1) {
                                                        z16 = false;
                                                    } else {
                                                        z16 = true;
                                                    }
/* 174 */                                           if (!z16 && a00Var.m10X(1) && !(c2569zz6 instanceof y53)) {
/* 175 */                                               if (enumC2516yzM10471k == enumC2516yz2 && c2569zz6.f20455r == 0 && enumC2516yzM10471k2 != enumC2516yz2 && !c2569zz6.m10482y()) {
                                                            z16 = true;
                                                        }
/* 177 */                                               if (enumC2516yzM10471k2 == enumC2516yz2 && c2569zz6.f20457s == 0 && enumC2516yzM10471k != enumC2516yz2 && !c2569zz6.m10482y()) {
                                                            z16 = true;
                                                        }
                                                        if ((enumC2516yzM10471k != enumC2516yz2 || enumC2516yzM10471k2 == enumC2516yz2) && c2569zz6.f20419Y > 0.0f) {
                                                        }
                                                    }
                                                    if (z16) {
/* 180 */                                               c0875ec.m3368F(0, interfaceC2462xi6, c2569zz6);
                                                    }
                                                }
                                                i16++;
                                                size3 = i19;
                                            }
/* 182 */                                   constraintLayout = ((C0075b) interfaceC2462xi6).f1168a;
/* 183 */                                   childCount = constraintLayout.getChildCount();
                                            arrayList4 = constraintLayout.f1058b;
                                            for (i17 = 0; i17 < childCount; i17++) {
/* 184 */                                       childAt = constraintLayout.getChildAt(i17);
/* 185 */                                       if (childAt instanceof Placeholder) {
/* 186 */                                           placeholder = (Placeholder) childAt;
/* 187 */                                           if (placeholder.f1155b == null) {
/* 188 */                                               LayoutParams layoutParams2 = (LayoutParams) placeholder.getLayoutParams();
/* 190 */                                               layoutParams = (LayoutParams) placeholder.f1155b.getLayoutParams();
/* 191 */                                               c2569zz3 = layoutParams.f1129q0;
/* 192 */                                               c2569zz3.f20438i0 = 0;
/* 193 */                                               c2569zz4 = layoutParams2.f1129q0;
/* 195 */                                               if (c2569zz4.f20415U[0] != enumC2516yz3) {
/* 196 */                                                   c2569zz4.m10464P(c2569zz3.m10475r());
                                                        }
/* 197 */                                               c2569zz5 = layoutParams2.f1129q0;
/* 199 */                                               if (c2569zz5.f20415U[1] != enumC2516yz3) {
/* 200 */                                                   c2569zz5.m10461M(layoutParams.f1129q0.m10472l());
                                                        }
/* 202 */                                               layoutParams.f1129q0.f20438i0 = 8;
                                                    }
                                                }
                                            }
/* 203 */                                   size4 = arrayList4.size();
                                            if (size4 > 0) {
                                                for (i18 = 0; i18 < size4; i18++) {
/* 205 */                                           ((ConstraintHelper) arrayList4.get(i18)).getClass();
                                                }
                                            }
                                        }
/* 206 */                               c0875ec.m3377P(a00Var);
/* 207 */                               size2 = arrayList2.size();
                                        if (i7 > 0) {
/* 208 */                                   c0875ec.m3375N(a00Var, 0, iM10475r2, iM10472l);
                                        }
                                        if (size2 > 0) {
/* 209 */                                   enumC2516yzArr = a00Var.f20415U;
                                            if (enumC2516yzArr[0] == enumC2516yz4) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
/* 210 */                                   if (enumC2516yzArr[1] == enumC2516yz4) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            a00 a00Var5 = a00Var2;
/* 213 */                                   iMax3 = Math.max(a00Var.m10475r(), a00Var5.f20428d0);
/* 216 */                                   iMax4 = Math.max(a00Var.m10472l(), a00Var5.f20430e0);
                                            i9 = 0;
                                            z7 = false;
                                            while (i9 < size2) {
                                                ArrayList arrayList7 = arrayList2;
/* 217 */                                       c2569zz2 = (C2569zz) arrayList7.get(i9);
/* 218 */                                       if (c2569zz2 instanceof y53) {
/* 219 */                                           iM10475r5 = c2569zz2.m10475r();
/* 220 */                                           iM10472l4 = c2569zz2.m10472l();
                                                    z14 = z5;
                                                    interfaceC2462xi5 = interfaceC2462xi2;
/* 221 */                                           zM3368F = z7 | c0875ec.m3368F(1, interfaceC2462xi5, c2569zz2);
/* 222 */                                           iM10475r6 = c2569zz2.m10475r();
/* 223 */                                           iM10472l5 = c2569zz2.m10472l();
                                                    if (iM10475r6 != iM10475r5) {
/* 224 */                                               c2569zz2.m10464P(iM10475r6);
/* 225 */                                               if (z14 && c2569zz2.m10476s() + c2569zz2.f20417W > iMax3) {
/* 228 */                                                   iMax3 = Math.max(iMax3, c2569zz2.mo1430j(4).m7247e() + c2569zz2.m10476s() + c2569zz2.f20417W);
                                                        }
                                                        i15 = iMax3;
                                                        z15 = true;
                                                    } else {
                                                        i15 = iMax3;
                                                        z15 = zM3368F;
                                                    }
                                                    if (iM10472l5 != iM10472l4) {
/* 229 */                                               c2569zz2.m10461M(iM10472l5);
/* 230 */                                               if (z6 && c2569zz2.m10477t() + c2569zz2.f20418X > iMax4) {
/* 233 */                                                   iMax4 = Math.max(iMax4, c2569zz2.mo1430j(5).m7247e() + c2569zz2.m10477t() + c2569zz2.f20418X);
                                                        }
                                                        z15 = true;
                                                    }
                                                    int i33 = i15;
/* 235 */                                           z7 = z15 | ((y53) c2569zz2).f19492C0;
                                                    iMax3 = i33;
                                                } else {
                                                    z14 = z5;
                                                    interfaceC2462xi5 = interfaceC2462xi2;
                                                }
                                                i9++;
                                                interfaceC2462xi2 = interfaceC2462xi5;
                                                arrayList2 = arrayList7;
                                                z5 = z14;
                                            }
                                            z8 = z5;
                                            arrayList3 = arrayList2;
                                            i10 = iMax4;
                                            z9 = z7;
                                            i11 = 0;
                                            while (true) {
                                                interfaceC2462xi3 = interfaceC2462xi2;
                                                if (i11 < 2) {
                                                    break;
                                                }
                                                int i34 = i10;
                                                iMax5 = iMax3;
                                                z10 = z9;
                                                iMax6 = i34;
                                                i12 = 0;
                                                while (i12 < size2) {
/* 236 */                                           c2569zz = (C2569zz) arrayList3.get(i12);
/* 237 */                                           if (((c2569zz instanceof cu0) || (c2569zz instanceof y53)) && !(c2569zz instanceof bs0)) {
                                                        i14 = size2;
/* 238 */                                               if (c2569zz.f20438i0 == 8 && ((!z4 || !c2569zz.f20427d.f13139e.f17890j || !c2569zz.f20429e.f13139e.f17890j) && !(c2569zz instanceof y53))) {
/* 241 */                                                   iM10475r3 = c2569zz.m10475r();
/* 242 */                                                   iM10472l2 = c2569zz.m10472l();
                                                            boolean z27 = z10;
/* 243 */                                                   int i35 = c2569zz.f20426c0;
                                                            z12 = z6;
/* 244 */                                                   boolean zM3368F2 = z27 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                                            interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                                                   iM10475r4 = c2569zz.m10475r();
                                                            z13 = zM3368F2;
/* 246 */                                                   iM10472l3 = c2569zz.m10472l();
                                                            if (iM10475r4 != iM10475r3) {
/* 247 */                                                       c2569zz.m10464P(iM10475r4);
/* 248 */                                                       if (!z8 && c2569zz.m10476s() + c2569zz.f20417W > iMax5) {
/* 251 */                                                           iMax5 = Math.max(iMax5, c2569zz.mo1430j(4).m7247e() + c2569zz.m10476s() + c2569zz.f20417W);
                                                                }
                                                                z13 = true;
                                                            }
                                                            if (iM10472l3 != iM10472l2) {
/* 252 */                                                       c2569zz.m10461M(iM10472l3);
/* 253 */                                                       if (!z12 && c2569zz.m10477t() + c2569zz.f20418X > iMax6) {
/* 256 */                                                           iMax6 = Math.max(iMax6, c2569zz.mo1430j(5).m7247e() + c2569zz.m10477t() + c2569zz.f20418X);
                                                                }
                                                                z13 = true;
                                                            }
/* 257 */                                                   if (c2569zz.f20399E || i35 == c2569zz.f20426c0) {
                                                                z10 = z13;
                                                            } else {
                                                                z10 = true;
                                                            }
                                                        }
                                                        i12++;
                                                        size2 = i14;
                                                        z6 = z12;
                                                        interfaceC2462xi3 = interfaceC2462xi4;
                                                    } else {
                                                        i14 = size2;
                                                    }
                                                    interfaceC2462xi4 = interfaceC2462xi3;
                                                    z12 = z6;
                                                    i12++;
                                                    size2 = i14;
                                                    z6 = z12;
                                                    interfaceC2462xi3 = interfaceC2462xi4;
                                                }
                                                i13 = size2;
                                                interfaceC2462xi2 = interfaceC2462xi3;
                                                z11 = z6;
                                                if (z10) {
                                                    break;
                                                }
                                                i11++;
/* 259 */                                       c0875ec.m3375N(a00Var, i11, iM10475r2, iM10472l);
                                                iMax3 = iMax5;
                                                i10 = iMax6;
                                                size2 = i13;
                                                z6 = z11;
                                                z9 = false;
                                            }
                                        }
/* 260 */                               a00Var.f8H0 = i32;
/* 261 */                               t71.f16931p = a00Var.m10X(NotificationCompat.FLAG_GROUP_SUMMARY);
                                    }
                                    return;
                                }
                            }
                            i7 = size;
                            z2 = z25;
                            z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zM6029B);
                            if (z3) {
/* 72 */                        iMin = Math.min(a00Var.f20397C[0], i27);
/* 74 */                        iMin2 = Math.min(a00Var.f20397C[1], i28);
                                i20 = 1073741824;
                                if (mode == 1073741824) {
/* 75 */                            if (a00Var.m10475r() != iMin) {
/* 76 */                                a00Var.m10464P(iMin);
                                        z17 = true;
/* 77 */                                u70Var.f17386b = true;
                                    } else {
                                        z17 = true;
                                    }
                                    i20 = 1073741824;
                                } else {
                                    z17 = true;
                                }
                                if (mode2 == i20) {
/* 78 */                            if (a00Var.m10472l() != iMin2) {
/* 79 */                                a00Var.m10461M(iMin2);
/* 80 */                                u70Var.f17386b = z17;
                                    }
                                    i20 = 1073741824;
                                }
                                if (mode == i20) {
                                    z4 = z3;
                                    a00Var2 = a00Var2;
                                    arrayList2 = arrayList;
                                    interfaceC2462xi2 = interfaceC2462xi;
                                    enumC2516yz3 = enumC2516yz6;
                                    enumC2516yz4 = enumC2516yz5;
/* 134 */                           a00Var3 = u70Var.f17385a;
/* 135 */                           if (u70Var.f17386b) {
/* 136 */                               it = a00Var3.f17u0.iterator();
                                        while (it.hasNext()) {
                                            C2569zz c2569zz10 = (C2569zz) it.next();
/* 137 */                                   c2569zz10.m10470i();
/* 138 */                                   c2569zz10.f20421a = false;
/* 139 */                                   uu0 uu0Var4 = c2569zz10.f20427d;
                                            Iterator it5 = it;
                                            uu0Var4.f13139e.f17890j = false;
/* 140 */                                   uu0Var4.f13141g = false;
/* 141 */                                   uu0Var4.m9139n();
/* 142 */                                   k23 k23Var4 = c2569zz10.f20429e;
                                            k23Var4.f13139e.f17890j = false;
/* 143 */                                   k23Var4.f13141g = false;
/* 144 */                                   k23Var4.m5936m();
                                            it = it5;
                                        }
                                        i21 = 0;
/* 145 */                               a00Var3.m10470i();
/* 146 */                               a00Var3.f20421a = false;
/* 147 */                               uu0 uu0Var5 = a00Var3.f20427d;
                                        uu0Var5.f13139e.f17890j = false;
/* 148 */                               uu0Var5.f13141g = false;
/* 149 */                               uu0Var5.m9139n();
/* 150 */                               k23 k23Var5 = a00Var3.f20429e;
                                        k23Var5.f13139e.f17890j = false;
/* 151 */                               k23Var5.f13141g = false;
/* 152 */                               k23Var5.m5936m();
/* 153 */                               u70Var.m8965c();
                                    } else {
                                        i21 = 0;
                                    }
/* 154 */                           u70Var.m8964b(u70Var.f17388d);
/* 155 */                           a00Var3.f20422a0 = i21;
/* 156 */                           a00Var3.f20424b0 = i21;
/* 157 */                           a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                           a00Var3.f20429e.f13142h.mo6945d(i21);
                                    i22 = 1073741824;
                                    if (mode == 1073741824) {
/* 159 */                               zM8U = a00Var.m8U(i21, zM6029B);
                                        i8 = 1;
                                    } else {
                                        i8 = 0;
                                        zM8U = true;
                                    }
                                    if (mode2 == 1073741824) {
/* 160 */                               zM8U &= a00Var.m8U(1, zM6029B);
                                        i8++;
                                    }
                                } else {
                                    z4 = z3;
                                    a00Var2 = a00Var2;
                                    arrayList2 = arrayList;
                                    interfaceC2462xi2 = interfaceC2462xi;
                                    enumC2516yz3 = enumC2516yz6;
                                    enumC2516yz4 = enumC2516yz5;
/* 134 */                           a00Var3 = u70Var.f17385a;
/* 135 */                           if (u70Var.f17386b) {
/* 136 */                               it = a00Var3.f17u0.iterator();
                                        while (it.hasNext()) {
                                            C2569zz c2569zz11 = (C2569zz) it.next();
/* 137 */                                   c2569zz11.m10470i();
/* 138 */                                   c2569zz11.f20421a = false;
/* 139 */                                   uu0 uu0Var6 = c2569zz11.f20427d;
                                            Iterator it6 = it;
                                            uu0Var6.f13139e.f17890j = false;
/* 140 */                                   uu0Var6.f13141g = false;
/* 141 */                                   uu0Var6.m9139n();
/* 142 */                                   k23 k23Var6 = c2569zz11.f20429e;
                                            k23Var6.f13139e.f17890j = false;
/* 143 */                                   k23Var6.f13141g = false;
/* 144 */                                   k23Var6.m5936m();
                                            it = it6;
                                        }
                                        i21 = 0;
/* 145 */                               a00Var3.m10470i();
/* 146 */                               a00Var3.f20421a = false;
/* 147 */                               uu0 uu0Var7 = a00Var3.f20427d;
                                        uu0Var7.f13139e.f17890j = false;
/* 148 */                               uu0Var7.f13141g = false;
/* 149 */                               uu0Var7.m9139n();
/* 150 */                               k23 k23Var7 = a00Var3.f20429e;
                                        k23Var7.f13139e.f17890j = false;
/* 151 */                               k23Var7.f13141g = false;
/* 152 */                               k23Var7.m5936m();
/* 153 */                               u70Var.m8965c();
                                    } else {
                                        i21 = 0;
                                    }
/* 154 */                           u70Var.m8964b(u70Var.f17388d);
/* 155 */                           a00Var3.f20422a0 = i21;
/* 156 */                           a00Var3.f20424b0 = i21;
/* 157 */                           a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                           a00Var3.f20429e.f13142h.mo6945d(i21);
                                    i22 = 1073741824;
                                    if (mode == 1073741824) {
/* 159 */                               zM8U = a00Var.m8U(i21, zM6029B);
                                        i8 = 1;
                                    } else {
                                        i8 = 0;
                                        zM8U = true;
                                    }
                                    if (mode2 == 1073741824) {
/* 160 */                               zM8U &= a00Var.m8U(1, zM6029B);
                                        i8++;
                                    }
                                }
                                if (zM8U) {
                                    if (mode == i22) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    if (mode2 == i22) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
/* 161 */                           a00Var.mo5Q(z18, z19);
                                }
                            } else {
                                z4 = z3;
                                a00Var2 = a00Var2;
                                arrayList2 = arrayList;
                                interfaceC2462xi2 = interfaceC2462xi;
                                enumC2516yz3 = enumC2516yz6;
                                enumC2516yz4 = enumC2516yz5;
                                i8 = 0;
                                zM8U = false;
                            }
                            if (zM8U) {
                            }
/* 162 */                   int i36 = a00Var.f8H0;
                            if (i7 > 0) {
/* 163 */                       size3 = a00Var.f17u0.size();
/* 164 */                       boolean zM10X2 = a00Var.m10X(64);
/* 165 */                       interfaceC2462xi6 = a00Var.f21y0;
                                i16 = 0;
                                while (i16 < size3) {
/* 166 */                           c2569zz6 = (C2569zz) a00Var.f17u0.get(i16);
/* 167 */                           if (!(c2569zz6 instanceof bs0)) {
                                        i19 = size3;
                                    } else {
/* 171 */                               enumC2516yzM10471k = c2569zz6.m10471k(0);
/* 172 */                               enumC2516yzM10471k2 = c2569zz6.m10471k(1);
                                        i19 = size3;
                                        if (enumC2516yzM10471k == enumC2516yz2) {
                                            z16 = false;
                                        } else {
                                            z16 = false;
                                        }
                                        if (!z16) {
                                            if (enumC2516yzM10471k == enumC2516yz2) {
                                                z16 = true;
                                            }
                                            if (enumC2516yzM10471k2 == enumC2516yz2) {
                                                z16 = true;
                                            }
                                            z16 = enumC2516yzM10471k != enumC2516yz2 ? true : true;
                                        }
                                        if (z16) {
/* 180 */                                   c0875ec.m3368F(0, interfaceC2462xi6, c2569zz6);
                                        }
                                    }
                                    i16++;
                                    size3 = i19;
                                }
/* 182 */                       constraintLayout = ((C0075b) interfaceC2462xi6).f1168a;
/* 183 */                       childCount = constraintLayout.getChildCount();
                                arrayList4 = constraintLayout.f1058b;
                                while (i17 < childCount) {
/* 184 */                           childAt = constraintLayout.getChildAt(i17);
/* 185 */                           if (childAt instanceof Placeholder) {
/* 186 */                               placeholder = (Placeholder) childAt;
/* 187 */                               if (placeholder.f1155b == null) {
/* 188 */                                   LayoutParams layoutParams3 = (LayoutParams) placeholder.getLayoutParams();
/* 190 */                                   layoutParams = (LayoutParams) placeholder.f1155b.getLayoutParams();
/* 191 */                                   c2569zz3 = layoutParams.f1129q0;
/* 192 */                                   c2569zz3.f20438i0 = 0;
/* 193 */                                   c2569zz4 = layoutParams3.f1129q0;
/* 195 */                                   if (c2569zz4.f20415U[0] != enumC2516yz3) {
/* 196 */                                       c2569zz4.m10464P(c2569zz3.m10475r());
                                            }
/* 197 */                                   c2569zz5 = layoutParams3.f1129q0;
/* 199 */                                   if (c2569zz5.f20415U[1] != enumC2516yz3) {
/* 200 */                                       c2569zz5.m10461M(layoutParams.f1129q0.m10472l());
                                            }
/* 202 */                                   layoutParams.f1129q0.f20438i0 = 8;
                                        }
                                    }
                                }
/* 203 */                       size4 = arrayList4.size();
                                if (size4 > 0) {
                                    while (i18 < size4) {
/* 205 */                               ((ConstraintHelper) arrayList4.get(i18)).getClass();
                                    }
                                }
                            }
/* 206 */                   c0875ec.m3377P(a00Var);
/* 207 */                   size2 = arrayList2.size();
                            if (i7 > 0) {
/* 208 */                       c0875ec.m3375N(a00Var, 0, iM10475r2, iM10472l);
                            }
                            if (size2 > 0) {
/* 209 */                       enumC2516yzArr = a00Var.f20415U;
                                if (enumC2516yzArr[0] == enumC2516yz4) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
/* 210 */                       if (enumC2516yzArr[1] == enumC2516yz4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                a00 a00Var6 = a00Var2;
/* 213 */                       iMax3 = Math.max(a00Var.m10475r(), a00Var6.f20428d0);
/* 216 */                       iMax4 = Math.max(a00Var.m10472l(), a00Var6.f20430e0);
                                i9 = 0;
                                z7 = false;
                                while (i9 < size2) {
                                    ArrayList arrayList8 = arrayList2;
/* 217 */                           c2569zz2 = (C2569zz) arrayList8.get(i9);
/* 218 */                           if (c2569zz2 instanceof y53) {
                                        z14 = z5;
                                        interfaceC2462xi5 = interfaceC2462xi2;
                                    } else {
/* 219 */                               iM10475r5 = c2569zz2.m10475r();
/* 220 */                               iM10472l4 = c2569zz2.m10472l();
                                        z14 = z5;
                                        interfaceC2462xi5 = interfaceC2462xi2;
/* 221 */                               zM3368F = z7 | c0875ec.m3368F(1, interfaceC2462xi5, c2569zz2);
/* 222 */                               iM10475r6 = c2569zz2.m10475r();
/* 223 */                               iM10472l5 = c2569zz2.m10472l();
                                        if (iM10475r6 != iM10475r5) {
/* 224 */                                   c2569zz2.m10464P(iM10475r6);
                                            if (z14) {
/* 228 */                                       iMax3 = Math.max(iMax3, c2569zz2.mo1430j(4).m7247e() + c2569zz2.m10476s() + c2569zz2.f20417W);
                                            }
                                            i15 = iMax3;
                                            z15 = true;
                                        } else {
                                            i15 = iMax3;
                                            z15 = zM3368F;
                                        }
                                        if (iM10472l5 != iM10472l4) {
/* 229 */                                   c2569zz2.m10461M(iM10472l5);
                                            if (z6) {
/* 233 */                                       iMax4 = Math.max(iMax4, c2569zz2.mo1430j(5).m7247e() + c2569zz2.m10477t() + c2569zz2.f20418X);
                                            }
                                            z15 = true;
                                        }
                                        int i37 = i15;
/* 235 */                               z7 = z15 | ((y53) c2569zz2).f19492C0;
                                        iMax3 = i37;
                                    }
                                    i9++;
                                    interfaceC2462xi2 = interfaceC2462xi5;
                                    arrayList2 = arrayList8;
                                    z5 = z14;
                                }
                                z8 = z5;
                                arrayList3 = arrayList2;
                                i10 = iMax4;
                                z9 = z7;
                                i11 = 0;
                                while (true) {
                                    interfaceC2462xi3 = interfaceC2462xi2;
                                    if (i11 < 2) {
                                        break;
                                        break;
                                    }
                                    int i38 = i10;
                                    iMax5 = iMax3;
                                    z10 = z9;
                                    iMax6 = i38;
                                    i12 = 0;
                                    while (i12 < size2) {
/* 236 */                               c2569zz = (C2569zz) arrayList3.get(i12);
/* 237 */                               if (c2569zz instanceof cu0) {
                                            i14 = size2;
/* 238 */                                   if (c2569zz.f20438i0 == 8) {
                                                interfaceC2462xi4 = interfaceC2462xi3;
                                                z12 = z6;
                                            } else {
/* 241 */                                       iM10475r3 = c2569zz.m10475r();
/* 242 */                                       iM10472l2 = c2569zz.m10472l();
                                                boolean z28 = z10;
/* 243 */                                       int i39 = c2569zz.f20426c0;
                                                z12 = z6;
/* 244 */                                       boolean zM3368F3 = z28 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                                interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                                       iM10475r4 = c2569zz.m10475r();
                                                z13 = zM3368F3;
/* 246 */                                       iM10472l3 = c2569zz.m10472l();
                                                if (iM10475r4 != iM10475r3) {
/* 247 */                                           c2569zz.m10464P(iM10475r4);
                                                    if (!z8) {
                                                    }
                                                    z13 = true;
                                                }
                                                if (iM10472l3 != iM10472l2) {
/* 252 */                                           c2569zz.m10461M(iM10472l3);
                                                    if (!z12) {
                                                    }
                                                    z13 = true;
                                                }
/* 257 */                                       if (c2569zz.f20399E) {
                                                    z10 = z13;
                                                } else {
                                                    z10 = z13;
                                                }
                                            }
                                        } else {
                                            i14 = size2;
/* 238 */                                   if (c2569zz.f20438i0 == 8) {
                                                interfaceC2462xi4 = interfaceC2462xi3;
                                                z12 = z6;
                                            } else {
/* 241 */                                       iM10475r3 = c2569zz.m10475r();
/* 242 */                                       iM10472l2 = c2569zz.m10472l();
                                                boolean z29 = z10;
/* 243 */                                       int i310 = c2569zz.f20426c0;
                                                z12 = z6;
/* 244 */                                       boolean zM3368F4 = z29 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                                interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                                       iM10475r4 = c2569zz.m10475r();
                                                z13 = zM3368F4;
/* 246 */                                       iM10472l3 = c2569zz.m10472l();
                                                if (iM10475r4 != iM10475r3) {
/* 247 */                                           c2569zz.m10464P(iM10475r4);
                                                    if (!z8) {
                                                    }
                                                    z13 = true;
                                                }
                                                if (iM10472l3 != iM10472l2) {
/* 252 */                                           c2569zz.m10461M(iM10472l3);
                                                    if (!z12) {
                                                    }
                                                    z13 = true;
                                                }
/* 257 */                                       if (c2569zz.f20399E) {
                                                    z10 = z13;
                                                } else {
                                                    z10 = z13;
                                                }
                                            }
                                        }
                                        i12++;
                                        size2 = i14;
                                        z6 = z12;
                                        interfaceC2462xi3 = interfaceC2462xi4;
                                    }
                                    i13 = size2;
                                    interfaceC2462xi2 = interfaceC2462xi3;
                                    z11 = z6;
                                    if (z10) {
                                        break;
                                        break;
                                    }
                                    i11++;
/* 259 */                           c0875ec.m3375N(a00Var, i11, iM10475r2, iM10472l);
                                    iMax3 = iMax5;
                                    i10 = iMax6;
                                    size2 = i13;
                                    z6 = z11;
                                    z9 = false;
                                }
                            }
/* 260 */                   a00Var.f8H0 = i36;
/* 261 */                   t71.f16931p = a00Var.m10X(NotificationCompat.FLAG_GROUP_SUMMARY);
                        }
                        if (childCount2 == 0) {
/* 28 */                    iMax2 = Math.max(0, this.f1064e);
                        } else {
                            iMax2 = i28;
                        }
                        enumC2516yz = enumC2516yz5;
/* 29 */                iM10475r = a00Var.m10475r();
                        u70Var = a00Var.f19w0;
                        if (iMax == iM10475r) {
/* 30 */                    u70Var.f17387c = true;
                        } else {
/* 30 */                    u70Var.f17387c = true;
                        }
/* 31 */                a00Var.f20422a0 = 0;
/* 32 */                a00Var.f20424b0 = 0;
/* 33 */                int i311 = this.f1066f - i30;
/* 34 */                int[] iArr2 = a00Var.f20397C;
                        iArr2[0] = i311;
/* 36 */                iArr2[1] = this.f1067i - i29;
/* 37 */                a00Var.f20428d0 = 0;
/* 38 */                a00Var.f20430e0 = 0;
/* 39 */                a00Var.m10462N(enumC2516yz5);
/* 40 */                a00Var.m10464P(iMax);
/* 41 */                a00Var.m10463O(enumC2516yz);
/* 42 */                a00Var.m10461M(iMax2);
/* 43 */                i5 = this.f1062d - i30;
                        if (i5 < 0) {
/* 44 */                    a00Var.f20428d0 = 0;
                        } else {
/* 45 */                    a00Var.f20428d0 = i5;
                        }
/* 46 */                i6 = this.f1064e - i29;
                        if (i6 < 0) {
/* 47 */                    a00Var.f20430e0 = 0;
                        } else {
/* 48 */                    a00Var.f20430e0 = i6;
                        }
/* 49 */                a00Var.f2B0 = iMax9;
/* 50 */                a00Var.f3C0 = iMax7;
/* 51 */                c0875ec = a00Var.f18v0;
/* 52 */                a00Var2 = (a00) c0875ec.f7615d;
/* 53 */                arrayList = (ArrayList) c0875ec.f7613b;
/* 54 */                interfaceC2462xi = a00Var.f21y0;
/* 55 */                size = a00Var.f17u0.size();
/* 56 */                iM10475r2 = a00Var.m10475r();
/* 57 */                iM10472l = a00Var.m10472l();
/* 58 */                zM6029B = kb1.m6029B(i, 128);
                        if (zM6029B) {
                            z = true;
                        } else {
                            z = true;
                        }
/* 60 */                enumC2516yz2 = EnumC2516yz.f19867c;
                        boolean z210 = z;
                        if (z) {
                            i24 = 0;
                            while (true) {
                                i7 = size;
                                if (i24 < size) {
/* 61 */                            c2569zz7 = (C2569zz) a00Var.f17u0.get(i24);
                                    i25 = i24;
/* 62 */                            enumC2516yzArr2 = c2569zz7.f20415U;
/* 63 */                            if (enumC2516yzArr2[0] == enumC2516yz2) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
/* 64 */                            if (enumC2516yzArr2[1] == enumC2516yz2) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                    if (z22) {
                                        z24 = false;
                                    } else {
                                        z24 = false;
                                    }
/* 66 */                            if (c2569zz7.m10482y()) {
                                        i24 = i25 + 1;
                                        size = i7;
                                    } else {
                                        i24 = i25 + 1;
                                        size = i7;
                                    }
                                    z2 = false;
                                }
                                z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zM6029B);
                                if (z3) {
/* 72 */                            iMin = Math.min(a00Var.f20397C[0], i27);
/* 74 */                            iMin2 = Math.min(a00Var.f20397C[1], i28);
                                    i20 = 1073741824;
                                    if (mode == 1073741824) {
/* 75 */                                if (a00Var.m10475r() != iMin) {
/* 76 */                                    a00Var.m10464P(iMin);
                                            z17 = true;
/* 77 */                                    u70Var.f17386b = true;
                                        } else {
                                            z17 = true;
                                        }
                                        i20 = 1073741824;
                                    } else {
                                        z17 = true;
                                    }
                                    if (mode2 == i20) {
/* 78 */                                if (a00Var.m10472l() != iMin2) {
/* 79 */                                    a00Var.m10461M(iMin2);
/* 80 */                                    u70Var.f17386b = z17;
                                        }
                                        i20 = 1073741824;
                                    }
                                    if (mode == i20) {
                                        z4 = z3;
                                        a00Var2 = a00Var2;
                                        arrayList2 = arrayList;
                                        interfaceC2462xi2 = interfaceC2462xi;
                                        enumC2516yz3 = enumC2516yz6;
                                        enumC2516yz4 = enumC2516yz5;
/* 134 */                               a00Var3 = u70Var.f17385a;
/* 135 */                               if (u70Var.f17386b) {
/* 136 */                                   it = a00Var3.f17u0.iterator();
                                            while (it.hasNext()) {
                                                C2569zz c2569zz12 = (C2569zz) it.next();
/* 137 */                                       c2569zz12.m10470i();
/* 138 */                                       c2569zz12.f20421a = false;
/* 139 */                                       uu0 uu0Var8 = c2569zz12.f20427d;
                                                Iterator it7 = it;
                                                uu0Var8.f13139e.f17890j = false;
/* 140 */                                       uu0Var8.f13141g = false;
/* 141 */                                       uu0Var8.m9139n();
/* 142 */                                       k23 k23Var8 = c2569zz12.f20429e;
                                                k23Var8.f13139e.f17890j = false;
/* 143 */                                       k23Var8.f13141g = false;
/* 144 */                                       k23Var8.m5936m();
                                                it = it7;
                                            }
                                            i21 = 0;
/* 145 */                                   a00Var3.m10470i();
/* 146 */                                   a00Var3.f20421a = false;
/* 147 */                                   uu0 uu0Var9 = a00Var3.f20427d;
                                            uu0Var9.f13139e.f17890j = false;
/* 148 */                                   uu0Var9.f13141g = false;
/* 149 */                                   uu0Var9.m9139n();
/* 150 */                                   k23 k23Var9 = a00Var3.f20429e;
                                            k23Var9.f13139e.f17890j = false;
/* 151 */                                   k23Var9.f13141g = false;
/* 152 */                                   k23Var9.m5936m();
/* 153 */                                   u70Var.m8965c();
                                        } else {
                                            i21 = 0;
                                        }
/* 154 */                               u70Var.m8964b(u70Var.f17388d);
/* 155 */                               a00Var3.f20422a0 = i21;
/* 156 */                               a00Var3.f20424b0 = i21;
/* 157 */                               a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                               a00Var3.f20429e.f13142h.mo6945d(i21);
                                        i22 = 1073741824;
                                        if (mode == 1073741824) {
/* 159 */                                   zM8U = a00Var.m8U(i21, zM6029B);
                                            i8 = 1;
                                        } else {
                                            i8 = 0;
                                            zM8U = true;
                                        }
                                        if (mode2 == 1073741824) {
/* 160 */                                   zM8U &= a00Var.m8U(1, zM6029B);
                                            i8++;
                                        }
                                    } else {
                                        z4 = z3;
                                        a00Var2 = a00Var2;
                                        arrayList2 = arrayList;
                                        interfaceC2462xi2 = interfaceC2462xi;
                                        enumC2516yz3 = enumC2516yz6;
                                        enumC2516yz4 = enumC2516yz5;
/* 134 */                               a00Var3 = u70Var.f17385a;
/* 135 */                               if (u70Var.f17386b) {
/* 136 */                                   it = a00Var3.f17u0.iterator();
                                            while (it.hasNext()) {
                                                C2569zz c2569zz13 = (C2569zz) it.next();
/* 137 */                                       c2569zz13.m10470i();
/* 138 */                                       c2569zz13.f20421a = false;
/* 139 */                                       uu0 uu0Var10 = c2569zz13.f20427d;
                                                Iterator it8 = it;
                                                uu0Var10.f13139e.f17890j = false;
/* 140 */                                       uu0Var10.f13141g = false;
/* 141 */                                       uu0Var10.m9139n();
/* 142 */                                       k23 k23Var10 = c2569zz13.f20429e;
                                                k23Var10.f13139e.f17890j = false;
/* 143 */                                       k23Var10.f13141g = false;
/* 144 */                                       k23Var10.m5936m();
                                                it = it8;
                                            }
                                            i21 = 0;
/* 145 */                                   a00Var3.m10470i();
/* 146 */                                   a00Var3.f20421a = false;
/* 147 */                                   uu0 uu0Var11 = a00Var3.f20427d;
                                            uu0Var11.f13139e.f17890j = false;
/* 148 */                                   uu0Var11.f13141g = false;
/* 149 */                                   uu0Var11.m9139n();
/* 150 */                                   k23 k23Var11 = a00Var3.f20429e;
                                            k23Var11.f13139e.f17890j = false;
/* 151 */                                   k23Var11.f13141g = false;
/* 152 */                                   k23Var11.m5936m();
/* 153 */                                   u70Var.m8965c();
                                        } else {
                                            i21 = 0;
                                        }
/* 154 */                               u70Var.m8964b(u70Var.f17388d);
/* 155 */                               a00Var3.f20422a0 = i21;
/* 156 */                               a00Var3.f20424b0 = i21;
/* 157 */                               a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                               a00Var3.f20429e.f13142h.mo6945d(i21);
                                        i22 = 1073741824;
                                        if (mode == 1073741824) {
/* 159 */                                   zM8U = a00Var.m8U(i21, zM6029B);
                                            i8 = 1;
                                        } else {
                                            i8 = 0;
                                            zM8U = true;
                                        }
                                        if (mode2 == 1073741824) {
/* 160 */                                   zM8U &= a00Var.m8U(1, zM6029B);
                                            i8++;
                                        }
                                    }
                                    if (zM8U) {
                                        if (mode == i22) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        if (mode2 == i22) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
/* 161 */                               a00Var.mo5Q(z18, z19);
                                    }
                                } else {
                                    z4 = z3;
                                    a00Var2 = a00Var2;
                                    arrayList2 = arrayList;
                                    interfaceC2462xi2 = interfaceC2462xi;
                                    enumC2516yz3 = enumC2516yz6;
                                    enumC2516yz4 = enumC2516yz5;
                                    i8 = 0;
                                    zM8U = false;
                                }
                                if (zM8U) {
                                }
/* 162 */                       int i312 = a00Var.f8H0;
                                if (i7 > 0) {
/* 163 */                           size3 = a00Var.f17u0.size();
/* 164 */                           boolean zM10X3 = a00Var.m10X(64);
/* 165 */                           interfaceC2462xi6 = a00Var.f21y0;
                                    i16 = 0;
                                    while (i16 < size3) {
/* 166 */                               c2569zz6 = (C2569zz) a00Var.f17u0.get(i16);
/* 167 */                               if (!(c2569zz6 instanceof bs0)) {
                                            i19 = size3;
                                        } else {
/* 171 */                                   enumC2516yzM10471k = c2569zz6.m10471k(0);
/* 172 */                                   enumC2516yzM10471k2 = c2569zz6.m10471k(1);
                                            i19 = size3;
                                            if (enumC2516yzM10471k == enumC2516yz2) {
                                                z16 = false;
                                            } else {
                                                z16 = false;
                                            }
                                            if (!z16) {
                                                if (enumC2516yzM10471k == enumC2516yz2) {
                                                    z16 = true;
                                                }
                                                if (enumC2516yzM10471k2 == enumC2516yz2) {
                                                    z16 = true;
                                                }
                                                if (enumC2516yzM10471k != enumC2516yz2) {
                                                }
                                            }
                                            if (z16) {
/* 180 */                                       c0875ec.m3368F(0, interfaceC2462xi6, c2569zz6);
                                            }
                                        }
                                        i16++;
                                        size3 = i19;
                                    }
/* 182 */                           constraintLayout = ((C0075b) interfaceC2462xi6).f1168a;
/* 183 */                           childCount = constraintLayout.getChildCount();
                                    arrayList4 = constraintLayout.f1058b;
                                    while (i17 < childCount) {
/* 184 */                               childAt = constraintLayout.getChildAt(i17);
/* 185 */                               if (childAt instanceof Placeholder) {
/* 186 */                                   placeholder = (Placeholder) childAt;
/* 187 */                                   if (placeholder.f1155b == null) {
/* 188 */                                       LayoutParams layoutParams4 = (LayoutParams) placeholder.getLayoutParams();
/* 190 */                                       layoutParams = (LayoutParams) placeholder.f1155b.getLayoutParams();
/* 191 */                                       c2569zz3 = layoutParams.f1129q0;
/* 192 */                                       c2569zz3.f20438i0 = 0;
/* 193 */                                       c2569zz4 = layoutParams4.f1129q0;
/* 195 */                                       if (c2569zz4.f20415U[0] != enumC2516yz3) {
/* 196 */                                           c2569zz4.m10464P(c2569zz3.m10475r());
                                                }
/* 197 */                                       c2569zz5 = layoutParams4.f1129q0;
/* 199 */                                       if (c2569zz5.f20415U[1] != enumC2516yz3) {
/* 200 */                                           c2569zz5.m10461M(layoutParams.f1129q0.m10472l());
                                                }
/* 202 */                                       layoutParams.f1129q0.f20438i0 = 8;
                                            }
                                        }
                                    }
/* 203 */                           size4 = arrayList4.size();
                                    if (size4 > 0) {
                                        while (i18 < size4) {
/* 205 */                                   ((ConstraintHelper) arrayList4.get(i18)).getClass();
                                        }
                                    }
                                }
/* 206 */                       c0875ec.m3377P(a00Var);
/* 207 */                       size2 = arrayList2.size();
                                if (i7 > 0) {
/* 208 */                           c0875ec.m3375N(a00Var, 0, iM10475r2, iM10472l);
                                }
                                if (size2 > 0) {
/* 209 */                           enumC2516yzArr = a00Var.f20415U;
                                    if (enumC2516yzArr[0] == enumC2516yz4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
/* 210 */                           if (enumC2516yzArr[1] == enumC2516yz4) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    a00 a00Var7 = a00Var2;
/* 213 */                           iMax3 = Math.max(a00Var.m10475r(), a00Var7.f20428d0);
/* 216 */                           iMax4 = Math.max(a00Var.m10472l(), a00Var7.f20430e0);
                                    i9 = 0;
                                    z7 = false;
                                    while (i9 < size2) {
                                        ArrayList arrayList9 = arrayList2;
/* 217 */                               c2569zz2 = (C2569zz) arrayList9.get(i9);
/* 218 */                               if (c2569zz2 instanceof y53) {
                                            z14 = z5;
                                            interfaceC2462xi5 = interfaceC2462xi2;
                                        } else {
/* 219 */                                   iM10475r5 = c2569zz2.m10475r();
/* 220 */                                   iM10472l4 = c2569zz2.m10472l();
                                            z14 = z5;
                                            interfaceC2462xi5 = interfaceC2462xi2;
/* 221 */                                   zM3368F = z7 | c0875ec.m3368F(1, interfaceC2462xi5, c2569zz2);
/* 222 */                                   iM10475r6 = c2569zz2.m10475r();
/* 223 */                                   iM10472l5 = c2569zz2.m10472l();
                                            if (iM10475r6 != iM10475r5) {
/* 224 */                                       c2569zz2.m10464P(iM10475r6);
                                                if (z14) {
/* 228 */                                           iMax3 = Math.max(iMax3, c2569zz2.mo1430j(4).m7247e() + c2569zz2.m10476s() + c2569zz2.f20417W);
                                                }
                                                i15 = iMax3;
                                                z15 = true;
                                            } else {
                                                i15 = iMax3;
                                                z15 = zM3368F;
                                            }
                                            if (iM10472l5 != iM10472l4) {
/* 229 */                                       c2569zz2.m10461M(iM10472l5);
                                                if (z6) {
/* 233 */                                           iMax4 = Math.max(iMax4, c2569zz2.mo1430j(5).m7247e() + c2569zz2.m10477t() + c2569zz2.f20418X);
                                                }
                                                z15 = true;
                                            }
                                            int i313 = i15;
/* 235 */                                   z7 = z15 | ((y53) c2569zz2).f19492C0;
                                            iMax3 = i313;
                                        }
                                        i9++;
                                        interfaceC2462xi2 = interfaceC2462xi5;
                                        arrayList2 = arrayList9;
                                        z5 = z14;
                                    }
                                    z8 = z5;
                                    arrayList3 = arrayList2;
                                    i10 = iMax4;
                                    z9 = z7;
                                    i11 = 0;
                                    while (true) {
                                        interfaceC2462xi3 = interfaceC2462xi2;
                                        if (i11 < 2) {
                                            break;
                                            break;
                                        }
                                        int i314 = i10;
                                        iMax5 = iMax3;
                                        z10 = z9;
                                        iMax6 = i314;
                                        i12 = 0;
                                        while (i12 < size2) {
/* 236 */                                   c2569zz = (C2569zz) arrayList3.get(i12);
/* 237 */                                   if (c2569zz instanceof cu0) {
                                                i14 = size2;
/* 238 */                                       if (c2569zz.f20438i0 == 8) {
                                                    interfaceC2462xi4 = interfaceC2462xi3;
                                                    z12 = z6;
                                                } else {
/* 241 */                                           iM10475r3 = c2569zz.m10475r();
/* 242 */                                           iM10472l2 = c2569zz.m10472l();
                                                    boolean z211 = z10;
/* 243 */                                           int i315 = c2569zz.f20426c0;
                                                    z12 = z6;
/* 244 */                                           boolean zM3368F5 = z211 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                                    interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                                           iM10475r4 = c2569zz.m10475r();
                                                    z13 = zM3368F5;
/* 246 */                                           iM10472l3 = c2569zz.m10472l();
                                                    if (iM10475r4 != iM10475r3) {
/* 247 */                                               c2569zz.m10464P(iM10475r4);
                                                        if (!z8) {
                                                        }
                                                        z13 = true;
                                                    }
                                                    if (iM10472l3 != iM10472l2) {
/* 252 */                                               c2569zz.m10461M(iM10472l3);
                                                        if (!z12) {
                                                        }
                                                        z13 = true;
                                                    }
/* 257 */                                           if (c2569zz.f20399E) {
                                                        z10 = z13;
                                                    } else {
                                                        z10 = z13;
                                                    }
                                                }
                                            } else {
                                                i14 = size2;
/* 238 */                                       if (c2569zz.f20438i0 == 8) {
                                                    interfaceC2462xi4 = interfaceC2462xi3;
                                                    z12 = z6;
                                                } else {
/* 241 */                                           iM10475r3 = c2569zz.m10475r();
/* 242 */                                           iM10472l2 = c2569zz.m10472l();
                                                    boolean z212 = z10;
/* 243 */                                           int i316 = c2569zz.f20426c0;
                                                    z12 = z6;
/* 244 */                                           boolean zM3368F6 = z212 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                                    interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                                           iM10475r4 = c2569zz.m10475r();
                                                    z13 = zM3368F6;
/* 246 */                                           iM10472l3 = c2569zz.m10472l();
                                                    if (iM10475r4 != iM10475r3) {
/* 247 */                                               c2569zz.m10464P(iM10475r4);
                                                        if (!z8) {
                                                        }
                                                        z13 = true;
                                                    }
                                                    if (iM10472l3 != iM10472l2) {
/* 252 */                                               c2569zz.m10461M(iM10472l3);
                                                        if (!z12) {
                                                        }
                                                        z13 = true;
                                                    }
/* 257 */                                           if (c2569zz.f20399E) {
                                                        z10 = z13;
                                                    } else {
                                                        z10 = z13;
                                                    }
                                                }
                                            }
                                            i12++;
                                            size2 = i14;
                                            z6 = z12;
                                            interfaceC2462xi3 = interfaceC2462xi4;
                                        }
                                        i13 = size2;
                                        interfaceC2462xi2 = interfaceC2462xi3;
                                        z11 = z6;
                                        if (z10) {
                                            break;
                                            break;
                                        }
                                        i11++;
/* 259 */                               c0875ec.m3375N(a00Var, i11, iM10475r2, iM10472l);
                                        iMax3 = iMax5;
                                        i10 = iMax6;
                                        size2 = i13;
                                        z6 = z11;
                                        z9 = false;
                                    }
                                }
/* 260 */                       a00Var.f8H0 = i312;
/* 261 */                       t71.f16931p = a00Var.m10X(NotificationCompat.FLAG_GROUP_SUMMARY);
                            }
                        }
                        i7 = size;
                        z2 = z210;
                        z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zM6029B);
                        if (z3) {
/* 72 */                    iMin = Math.min(a00Var.f20397C[0], i27);
/* 74 */                    iMin2 = Math.min(a00Var.f20397C[1], i28);
                            i20 = 1073741824;
                            if (mode == 1073741824) {
/* 75 */                        if (a00Var.m10475r() != iMin) {
/* 76 */                            a00Var.m10464P(iMin);
                                    z17 = true;
/* 77 */                            u70Var.f17386b = true;
                                } else {
                                    z17 = true;
                                }
                                i20 = 1073741824;
                            } else {
                                z17 = true;
                            }
                            if (mode2 == i20) {
/* 78 */                        if (a00Var.m10472l() != iMin2) {
/* 79 */                            a00Var.m10461M(iMin2);
/* 80 */                            u70Var.f17386b = z17;
                                }
                                i20 = 1073741824;
                            }
                            if (mode == i20) {
                                z4 = z3;
                                a00Var2 = a00Var2;
                                arrayList2 = arrayList;
                                interfaceC2462xi2 = interfaceC2462xi;
                                enumC2516yz3 = enumC2516yz6;
                                enumC2516yz4 = enumC2516yz5;
/* 134 */                       a00Var3 = u70Var.f17385a;
/* 135 */                       if (u70Var.f17386b) {
/* 136 */                           it = a00Var3.f17u0.iterator();
                                    while (it.hasNext()) {
                                        C2569zz c2569zz14 = (C2569zz) it.next();
/* 137 */                               c2569zz14.m10470i();
/* 138 */                               c2569zz14.f20421a = false;
/* 139 */                               uu0 uu0Var12 = c2569zz14.f20427d;
                                        Iterator it9 = it;
                                        uu0Var12.f13139e.f17890j = false;
/* 140 */                               uu0Var12.f13141g = false;
/* 141 */                               uu0Var12.m9139n();
/* 142 */                               k23 k23Var12 = c2569zz14.f20429e;
                                        k23Var12.f13139e.f17890j = false;
/* 143 */                               k23Var12.f13141g = false;
/* 144 */                               k23Var12.m5936m();
                                        it = it9;
                                    }
                                    i21 = 0;
/* 145 */                           a00Var3.m10470i();
/* 146 */                           a00Var3.f20421a = false;
/* 147 */                           uu0 uu0Var13 = a00Var3.f20427d;
                                    uu0Var13.f13139e.f17890j = false;
/* 148 */                           uu0Var13.f13141g = false;
/* 149 */                           uu0Var13.m9139n();
/* 150 */                           k23 k23Var13 = a00Var3.f20429e;
                                    k23Var13.f13139e.f17890j = false;
/* 151 */                           k23Var13.f13141g = false;
/* 152 */                           k23Var13.m5936m();
/* 153 */                           u70Var.m8965c();
                                } else {
                                    i21 = 0;
                                }
/* 154 */                       u70Var.m8964b(u70Var.f17388d);
/* 155 */                       a00Var3.f20422a0 = i21;
/* 156 */                       a00Var3.f20424b0 = i21;
/* 157 */                       a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                       a00Var3.f20429e.f13142h.mo6945d(i21);
                                i22 = 1073741824;
                                if (mode == 1073741824) {
/* 159 */                           zM8U = a00Var.m8U(i21, zM6029B);
                                    i8 = 1;
                                } else {
                                    i8 = 0;
                                    zM8U = true;
                                }
                                if (mode2 == 1073741824) {
/* 160 */                           zM8U &= a00Var.m8U(1, zM6029B);
                                    i8++;
                                }
                            } else {
                                z4 = z3;
                                a00Var2 = a00Var2;
                                arrayList2 = arrayList;
                                interfaceC2462xi2 = interfaceC2462xi;
                                enumC2516yz3 = enumC2516yz6;
                                enumC2516yz4 = enumC2516yz5;
/* 134 */                       a00Var3 = u70Var.f17385a;
/* 135 */                       if (u70Var.f17386b) {
/* 136 */                           it = a00Var3.f17u0.iterator();
                                    while (it.hasNext()) {
                                        C2569zz c2569zz15 = (C2569zz) it.next();
/* 137 */                               c2569zz15.m10470i();
/* 138 */                               c2569zz15.f20421a = false;
/* 139 */                               uu0 uu0Var14 = c2569zz15.f20427d;
                                        Iterator it10 = it;
                                        uu0Var14.f13139e.f17890j = false;
/* 140 */                               uu0Var14.f13141g = false;
/* 141 */                               uu0Var14.m9139n();
/* 142 */                               k23 k23Var14 = c2569zz15.f20429e;
                                        k23Var14.f13139e.f17890j = false;
/* 143 */                               k23Var14.f13141g = false;
/* 144 */                               k23Var14.m5936m();
                                        it = it10;
                                    }
                                    i21 = 0;
/* 145 */                           a00Var3.m10470i();
/* 146 */                           a00Var3.f20421a = false;
/* 147 */                           uu0 uu0Var15 = a00Var3.f20427d;
                                    uu0Var15.f13139e.f17890j = false;
/* 148 */                           uu0Var15.f13141g = false;
/* 149 */                           uu0Var15.m9139n();
/* 150 */                           k23 k23Var15 = a00Var3.f20429e;
                                    k23Var15.f13139e.f17890j = false;
/* 151 */                           k23Var15.f13141g = false;
/* 152 */                           k23Var15.m5936m();
/* 153 */                           u70Var.m8965c();
                                } else {
                                    i21 = 0;
                                }
/* 154 */                       u70Var.m8964b(u70Var.f17388d);
/* 155 */                       a00Var3.f20422a0 = i21;
/* 156 */                       a00Var3.f20424b0 = i21;
/* 157 */                       a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                       a00Var3.f20429e.f13142h.mo6945d(i21);
                                i22 = 1073741824;
                                if (mode == 1073741824) {
/* 159 */                           zM8U = a00Var.m8U(i21, zM6029B);
                                    i8 = 1;
                                } else {
                                    i8 = 0;
                                    zM8U = true;
                                }
                                if (mode2 == 1073741824) {
/* 160 */                           zM8U &= a00Var.m8U(1, zM6029B);
                                    i8++;
                                }
                            }
                            if (zM8U) {
                                if (mode == i22) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if (mode2 == i22) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
/* 161 */                       a00Var.mo5Q(z18, z19);
                            }
                        } else {
                            z4 = z3;
                            a00Var2 = a00Var2;
                            arrayList2 = arrayList;
                            interfaceC2462xi2 = interfaceC2462xi;
                            enumC2516yz3 = enumC2516yz6;
                            enumC2516yz4 = enumC2516yz5;
                            i8 = 0;
                            zM8U = false;
                        }
                        if (zM8U) {
                        }
/* 162 */               int i317 = a00Var.f8H0;
                        if (i7 > 0) {
/* 163 */                   size3 = a00Var.f17u0.size();
/* 164 */                   boolean zM10X4 = a00Var.m10X(64);
/* 165 */                   interfaceC2462xi6 = a00Var.f21y0;
                            i16 = 0;
                            while (i16 < size3) {
/* 166 */                       c2569zz6 = (C2569zz) a00Var.f17u0.get(i16);
/* 167 */                       if (!(c2569zz6 instanceof bs0)) {
                                    i19 = size3;
                                } else {
/* 171 */                           enumC2516yzM10471k = c2569zz6.m10471k(0);
/* 172 */                           enumC2516yzM10471k2 = c2569zz6.m10471k(1);
                                    i19 = size3;
                                    if (enumC2516yzM10471k == enumC2516yz2) {
                                        z16 = false;
                                    } else {
                                        z16 = false;
                                    }
                                    if (!z16) {
                                        if (enumC2516yzM10471k == enumC2516yz2) {
                                            z16 = true;
                                        }
                                        if (enumC2516yzM10471k2 == enumC2516yz2) {
                                            z16 = true;
                                        }
                                        if (enumC2516yzM10471k != enumC2516yz2) {
                                        }
                                    }
                                    if (z16) {
/* 180 */                               c0875ec.m3368F(0, interfaceC2462xi6, c2569zz6);
                                    }
                                }
                                i16++;
                                size3 = i19;
                            }
/* 182 */                   constraintLayout = ((C0075b) interfaceC2462xi6).f1168a;
/* 183 */                   childCount = constraintLayout.getChildCount();
                            arrayList4 = constraintLayout.f1058b;
                            while (i17 < childCount) {
/* 184 */                       childAt = constraintLayout.getChildAt(i17);
/* 185 */                       if (childAt instanceof Placeholder) {
/* 186 */                           placeholder = (Placeholder) childAt;
/* 187 */                           if (placeholder.f1155b == null) {
/* 188 */                               LayoutParams layoutParams5 = (LayoutParams) placeholder.getLayoutParams();
/* 190 */                               layoutParams = (LayoutParams) placeholder.f1155b.getLayoutParams();
/* 191 */                               c2569zz3 = layoutParams.f1129q0;
/* 192 */                               c2569zz3.f20438i0 = 0;
/* 193 */                               c2569zz4 = layoutParams5.f1129q0;
/* 195 */                               if (c2569zz4.f20415U[0] != enumC2516yz3) {
/* 196 */                                   c2569zz4.m10464P(c2569zz3.m10475r());
                                        }
/* 197 */                               c2569zz5 = layoutParams5.f1129q0;
/* 199 */                               if (c2569zz5.f20415U[1] != enumC2516yz3) {
/* 200 */                                   c2569zz5.m10461M(layoutParams.f1129q0.m10472l());
                                        }
/* 202 */                               layoutParams.f1129q0.f20438i0 = 8;
                                    }
                                }
                            }
/* 203 */                   size4 = arrayList4.size();
                            if (size4 > 0) {
                                while (i18 < size4) {
/* 205 */                           ((ConstraintHelper) arrayList4.get(i18)).getClass();
                                }
                            }
                        }
/* 206 */               c0875ec.m3377P(a00Var);
/* 207 */               size2 = arrayList2.size();
                        if (i7 > 0) {
/* 208 */                   c0875ec.m3375N(a00Var, 0, iM10475r2, iM10472l);
                        }
                        if (size2 > 0) {
/* 209 */                   enumC2516yzArr = a00Var.f20415U;
                            if (enumC2516yzArr[0] == enumC2516yz4) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
/* 210 */                   if (enumC2516yzArr[1] == enumC2516yz4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            a00 a00Var8 = a00Var2;
/* 213 */                   iMax3 = Math.max(a00Var.m10475r(), a00Var8.f20428d0);
/* 216 */                   iMax4 = Math.max(a00Var.m10472l(), a00Var8.f20430e0);
                            i9 = 0;
                            z7 = false;
                            while (i9 < size2) {
                                ArrayList arrayList10 = arrayList2;
/* 217 */                       c2569zz2 = (C2569zz) arrayList10.get(i9);
/* 218 */                       if (c2569zz2 instanceof y53) {
                                    z14 = z5;
                                    interfaceC2462xi5 = interfaceC2462xi2;
                                } else {
/* 219 */                           iM10475r5 = c2569zz2.m10475r();
/* 220 */                           iM10472l4 = c2569zz2.m10472l();
                                    z14 = z5;
                                    interfaceC2462xi5 = interfaceC2462xi2;
/* 221 */                           zM3368F = z7 | c0875ec.m3368F(1, interfaceC2462xi5, c2569zz2);
/* 222 */                           iM10475r6 = c2569zz2.m10475r();
/* 223 */                           iM10472l5 = c2569zz2.m10472l();
                                    if (iM10475r6 != iM10475r5) {
/* 224 */                               c2569zz2.m10464P(iM10475r6);
                                        if (z14) {
/* 228 */                                   iMax3 = Math.max(iMax3, c2569zz2.mo1430j(4).m7247e() + c2569zz2.m10476s() + c2569zz2.f20417W);
                                        }
                                        i15 = iMax3;
                                        z15 = true;
                                    } else {
                                        i15 = iMax3;
                                        z15 = zM3368F;
                                    }
                                    if (iM10472l5 != iM10472l4) {
/* 229 */                               c2569zz2.m10461M(iM10472l5);
                                        if (z6) {
/* 233 */                                   iMax4 = Math.max(iMax4, c2569zz2.mo1430j(5).m7247e() + c2569zz2.m10477t() + c2569zz2.f20418X);
                                        }
                                        z15 = true;
                                    }
                                    int i318 = i15;
/* 235 */                           z7 = z15 | ((y53) c2569zz2).f19492C0;
                                    iMax3 = i318;
                                }
                                i9++;
                                interfaceC2462xi2 = interfaceC2462xi5;
                                arrayList2 = arrayList10;
                                z5 = z14;
                            }
                            z8 = z5;
                            arrayList3 = arrayList2;
                            i10 = iMax4;
                            z9 = z7;
                            i11 = 0;
                            while (true) {
                                interfaceC2462xi3 = interfaceC2462xi2;
                                if (i11 < 2) {
                                    break;
                                    break;
                                }
                                int i319 = i10;
                                iMax5 = iMax3;
                                z10 = z9;
                                iMax6 = i319;
                                i12 = 0;
                                while (i12 < size2) {
/* 236 */                           c2569zz = (C2569zz) arrayList3.get(i12);
/* 237 */                           if (c2569zz instanceof cu0) {
                                        i14 = size2;
/* 238 */                               if (c2569zz.f20438i0 == 8) {
                                            interfaceC2462xi4 = interfaceC2462xi3;
                                            z12 = z6;
                                        } else {
/* 241 */                                   iM10475r3 = c2569zz.m10475r();
/* 242 */                                   iM10472l2 = c2569zz.m10472l();
                                            boolean z213 = z10;
/* 243 */                                   int i3110 = c2569zz.f20426c0;
                                            z12 = z6;
/* 244 */                                   boolean zM3368F7 = z213 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                            interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                                   iM10475r4 = c2569zz.m10475r();
                                            z13 = zM3368F7;
/* 246 */                                   iM10472l3 = c2569zz.m10472l();
                                            if (iM10475r4 != iM10475r3) {
/* 247 */                                       c2569zz.m10464P(iM10475r4);
                                                if (!z8) {
                                                }
                                                z13 = true;
                                            }
                                            if (iM10472l3 != iM10472l2) {
/* 252 */                                       c2569zz.m10461M(iM10472l3);
                                                if (!z12) {
                                                }
                                                z13 = true;
                                            }
/* 257 */                                   if (c2569zz.f20399E) {
                                                z10 = z13;
                                            } else {
                                                z10 = z13;
                                            }
                                        }
                                    } else {
                                        i14 = size2;
/* 238 */                               if (c2569zz.f20438i0 == 8) {
                                            interfaceC2462xi4 = interfaceC2462xi3;
                                            z12 = z6;
                                        } else {
/* 241 */                                   iM10475r3 = c2569zz.m10475r();
/* 242 */                                   iM10472l2 = c2569zz.m10472l();
                                            boolean z214 = z10;
/* 243 */                                   int i3111 = c2569zz.f20426c0;
                                            z12 = z6;
/* 244 */                                   boolean zM3368F8 = z214 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                            interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                                   iM10475r4 = c2569zz.m10475r();
                                            z13 = zM3368F8;
/* 246 */                                   iM10472l3 = c2569zz.m10472l();
                                            if (iM10475r4 != iM10475r3) {
/* 247 */                                       c2569zz.m10464P(iM10475r4);
                                                if (!z8) {
                                                }
                                                z13 = true;
                                            }
                                            if (iM10472l3 != iM10472l2) {
/* 252 */                                       c2569zz.m10461M(iM10472l3);
                                                if (!z12) {
                                                }
                                                z13 = true;
                                            }
/* 257 */                                   if (c2569zz.f20399E) {
                                                z10 = z13;
                                            } else {
                                                z10 = z13;
                                            }
                                        }
                                    }
                                    i12++;
                                    size2 = i14;
                                    z6 = z12;
                                    interfaceC2462xi3 = interfaceC2462xi4;
                                }
                                i13 = size2;
                                interfaceC2462xi2 = interfaceC2462xi3;
                                z11 = z6;
                                if (z10) {
                                    break;
                                    break;
                                }
                                i11++;
/* 259 */                       c0875ec.m3375N(a00Var, i11, iM10475r2, iM10472l);
                                iMax3 = iMax5;
                                i10 = iMax6;
                                size2 = i13;
                                z6 = z11;
                                z9 = false;
                            }
                        }
/* 260 */               a00Var.f8H0 = i317;
/* 261 */               t71.f16931p = a00Var.m10X(NotificationCompat.FLAG_GROUP_SUMMARY);
                    }
/* 25 */            iMax = childCount2 == 0 ? Math.max(0, this.f1062d) : i27;
                    i4 = Integer.MIN_VALUE;
                    if (mode2 != i4) {
                        if (mode2 != 0) {
                            if (mode2 != 1073741824) {
                                enumC2516yz = enumC2516yz6;
                                iMax2 = 0;
                            } else {
/* 26 */                        iMax2 = Math.min(this.f1067i - i29, i28);
                                enumC2516yz = enumC2516yz6;
                            }
                        } else if (childCount2 == 0) {
                            enumC2516yz = enumC2516yz5;
/* 27 */                    iMax2 = Math.max(0, this.f1064e);
                        } else {
                            iMax2 = 0;
                        }
/* 29 */                iM10475r = a00Var.m10475r();
                        u70Var = a00Var.f19w0;
                        if (iMax == iM10475r) {
/* 30 */                    u70Var.f17387c = true;
                        } else {
/* 30 */                    u70Var.f17387c = true;
                        }
/* 31 */                a00Var.f20422a0 = 0;
/* 32 */                a00Var.f20424b0 = 0;
/* 33 */                int i3112 = this.f1066f - i30;
/* 34 */                int[] iArr3 = a00Var.f20397C;
                        iArr3[0] = i3112;
/* 36 */                iArr3[1] = this.f1067i - i29;
/* 37 */                a00Var.f20428d0 = 0;
/* 38 */                a00Var.f20430e0 = 0;
/* 39 */                a00Var.m10462N(enumC2516yz5);
/* 40 */                a00Var.m10464P(iMax);
/* 41 */                a00Var.m10463O(enumC2516yz);
/* 42 */                a00Var.m10461M(iMax2);
/* 43 */                i5 = this.f1062d - i30;
                        if (i5 < 0) {
/* 44 */                    a00Var.f20428d0 = 0;
                        } else {
/* 45 */                    a00Var.f20428d0 = i5;
                        }
/* 46 */                i6 = this.f1064e - i29;
                        if (i6 < 0) {
/* 47 */                    a00Var.f20430e0 = 0;
                        } else {
/* 48 */                    a00Var.f20430e0 = i6;
                        }
/* 49 */                a00Var.f2B0 = iMax9;
/* 50 */                a00Var.f3C0 = iMax7;
/* 51 */                c0875ec = a00Var.f18v0;
/* 52 */                a00Var2 = (a00) c0875ec.f7615d;
/* 53 */                arrayList = (ArrayList) c0875ec.f7613b;
/* 54 */                interfaceC2462xi = a00Var.f21y0;
/* 55 */                size = a00Var.f17u0.size();
/* 56 */                iM10475r2 = a00Var.m10475r();
/* 57 */                iM10472l = a00Var.m10472l();
/* 58 */                zM6029B = kb1.m6029B(i, 128);
                        if (zM6029B) {
                            z = true;
                        } else {
                            z = true;
                        }
/* 60 */                enumC2516yz2 = EnumC2516yz.f19867c;
                        boolean z215 = z;
                        if (z) {
                            i24 = 0;
                            while (true) {
                                i7 = size;
                                if (i24 < size) {
/* 61 */                            c2569zz7 = (C2569zz) a00Var.f17u0.get(i24);
                                    i25 = i24;
/* 62 */                            enumC2516yzArr2 = c2569zz7.f20415U;
/* 63 */                            if (enumC2516yzArr2[0] == enumC2516yz2) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
/* 64 */                            if (enumC2516yzArr2[1] == enumC2516yz2) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                    if (z22) {
                                        z24 = false;
                                    } else {
                                        z24 = false;
                                    }
/* 66 */                            if (c2569zz7.m10482y()) {
                                        i24 = i25 + 1;
                                        size = i7;
                                    } else {
                                        i24 = i25 + 1;
                                        size = i7;
                                    }
                                    z2 = false;
                                }
                                z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zM6029B);
                                if (z3) {
/* 72 */                            iMin = Math.min(a00Var.f20397C[0], i27);
/* 74 */                            iMin2 = Math.min(a00Var.f20397C[1], i28);
                                    i20 = 1073741824;
                                    if (mode == 1073741824) {
/* 75 */                                if (a00Var.m10475r() != iMin) {
/* 76 */                                    a00Var.m10464P(iMin);
                                            z17 = true;
/* 77 */                                    u70Var.f17386b = true;
                                        } else {
                                            z17 = true;
                                        }
                                        i20 = 1073741824;
                                    } else {
                                        z17 = true;
                                    }
                                    if (mode2 == i20) {
/* 78 */                                if (a00Var.m10472l() != iMin2) {
/* 79 */                                    a00Var.m10461M(iMin2);
/* 80 */                                    u70Var.f17386b = z17;
                                        }
                                        i20 = 1073741824;
                                    }
                                    if (mode == i20) {
                                        z4 = z3;
                                        a00Var2 = a00Var2;
                                        arrayList2 = arrayList;
                                        interfaceC2462xi2 = interfaceC2462xi;
                                        enumC2516yz3 = enumC2516yz6;
                                        enumC2516yz4 = enumC2516yz5;
/* 134 */                               a00Var3 = u70Var.f17385a;
/* 135 */                               if (u70Var.f17386b) {
/* 136 */                                   it = a00Var3.f17u0.iterator();
                                            while (it.hasNext()) {
                                                C2569zz c2569zz16 = (C2569zz) it.next();
/* 137 */                                       c2569zz16.m10470i();
/* 138 */                                       c2569zz16.f20421a = false;
/* 139 */                                       uu0 uu0Var16 = c2569zz16.f20427d;
                                                Iterator it11 = it;
                                                uu0Var16.f13139e.f17890j = false;
/* 140 */                                       uu0Var16.f13141g = false;
/* 141 */                                       uu0Var16.m9139n();
/* 142 */                                       k23 k23Var16 = c2569zz16.f20429e;
                                                k23Var16.f13139e.f17890j = false;
/* 143 */                                       k23Var16.f13141g = false;
/* 144 */                                       k23Var16.m5936m();
                                                it = it11;
                                            }
                                            i21 = 0;
/* 145 */                                   a00Var3.m10470i();
/* 146 */                                   a00Var3.f20421a = false;
/* 147 */                                   uu0 uu0Var17 = a00Var3.f20427d;
                                            uu0Var17.f13139e.f17890j = false;
/* 148 */                                   uu0Var17.f13141g = false;
/* 149 */                                   uu0Var17.m9139n();
/* 150 */                                   k23 k23Var17 = a00Var3.f20429e;
                                            k23Var17.f13139e.f17890j = false;
/* 151 */                                   k23Var17.f13141g = false;
/* 152 */                                   k23Var17.m5936m();
/* 153 */                                   u70Var.m8965c();
                                        } else {
                                            i21 = 0;
                                        }
/* 154 */                               u70Var.m8964b(u70Var.f17388d);
/* 155 */                               a00Var3.f20422a0 = i21;
/* 156 */                               a00Var3.f20424b0 = i21;
/* 157 */                               a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                               a00Var3.f20429e.f13142h.mo6945d(i21);
                                        i22 = 1073741824;
                                        if (mode == 1073741824) {
/* 159 */                                   zM8U = a00Var.m8U(i21, zM6029B);
                                            i8 = 1;
                                        } else {
                                            i8 = 0;
                                            zM8U = true;
                                        }
                                        if (mode2 == 1073741824) {
/* 160 */                                   zM8U &= a00Var.m8U(1, zM6029B);
                                            i8++;
                                        }
                                    } else {
                                        z4 = z3;
                                        a00Var2 = a00Var2;
                                        arrayList2 = arrayList;
                                        interfaceC2462xi2 = interfaceC2462xi;
                                        enumC2516yz3 = enumC2516yz6;
                                        enumC2516yz4 = enumC2516yz5;
/* 134 */                               a00Var3 = u70Var.f17385a;
/* 135 */                               if (u70Var.f17386b) {
/* 136 */                                   it = a00Var3.f17u0.iterator();
                                            while (it.hasNext()) {
                                                C2569zz c2569zz17 = (C2569zz) it.next();
/* 137 */                                       c2569zz17.m10470i();
/* 138 */                                       c2569zz17.f20421a = false;
/* 139 */                                       uu0 uu0Var18 = c2569zz17.f20427d;
                                                Iterator it12 = it;
                                                uu0Var18.f13139e.f17890j = false;
/* 140 */                                       uu0Var18.f13141g = false;
/* 141 */                                       uu0Var18.m9139n();
/* 142 */                                       k23 k23Var18 = c2569zz17.f20429e;
                                                k23Var18.f13139e.f17890j = false;
/* 143 */                                       k23Var18.f13141g = false;
/* 144 */                                       k23Var18.m5936m();
                                                it = it12;
                                            }
                                            i21 = 0;
/* 145 */                                   a00Var3.m10470i();
/* 146 */                                   a00Var3.f20421a = false;
/* 147 */                                   uu0 uu0Var19 = a00Var3.f20427d;
                                            uu0Var19.f13139e.f17890j = false;
/* 148 */                                   uu0Var19.f13141g = false;
/* 149 */                                   uu0Var19.m9139n();
/* 150 */                                   k23 k23Var19 = a00Var3.f20429e;
                                            k23Var19.f13139e.f17890j = false;
/* 151 */                                   k23Var19.f13141g = false;
/* 152 */                                   k23Var19.m5936m();
/* 153 */                                   u70Var.m8965c();
                                        } else {
                                            i21 = 0;
                                        }
/* 154 */                               u70Var.m8964b(u70Var.f17388d);
/* 155 */                               a00Var3.f20422a0 = i21;
/* 156 */                               a00Var3.f20424b0 = i21;
/* 157 */                               a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                               a00Var3.f20429e.f13142h.mo6945d(i21);
                                        i22 = 1073741824;
                                        if (mode == 1073741824) {
/* 159 */                                   zM8U = a00Var.m8U(i21, zM6029B);
                                            i8 = 1;
                                        } else {
                                            i8 = 0;
                                            zM8U = true;
                                        }
                                        if (mode2 == 1073741824) {
/* 160 */                                   zM8U &= a00Var.m8U(1, zM6029B);
                                            i8++;
                                        }
                                    }
                                    if (zM8U) {
                                        if (mode == i22) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        if (mode2 == i22) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
/* 161 */                               a00Var.mo5Q(z18, z19);
                                    }
                                } else {
                                    z4 = z3;
                                    a00Var2 = a00Var2;
                                    arrayList2 = arrayList;
                                    interfaceC2462xi2 = interfaceC2462xi;
                                    enumC2516yz3 = enumC2516yz6;
                                    enumC2516yz4 = enumC2516yz5;
                                    i8 = 0;
                                    zM8U = false;
                                }
                                if (zM8U) {
                                }
/* 162 */                       int i3113 = a00Var.f8H0;
                                if (i7 > 0) {
/* 163 */                           size3 = a00Var.f17u0.size();
/* 164 */                           boolean zM10X5 = a00Var.m10X(64);
/* 165 */                           interfaceC2462xi6 = a00Var.f21y0;
                                    i16 = 0;
                                    while (i16 < size3) {
/* 166 */                               c2569zz6 = (C2569zz) a00Var.f17u0.get(i16);
/* 167 */                               if (!(c2569zz6 instanceof bs0)) {
                                            i19 = size3;
                                        } else {
/* 171 */                                   enumC2516yzM10471k = c2569zz6.m10471k(0);
/* 172 */                                   enumC2516yzM10471k2 = c2569zz6.m10471k(1);
                                            i19 = size3;
                                            if (enumC2516yzM10471k == enumC2516yz2) {
                                                z16 = false;
                                            } else {
                                                z16 = false;
                                            }
                                            if (!z16) {
                                                if (enumC2516yzM10471k == enumC2516yz2) {
                                                    z16 = true;
                                                }
                                                if (enumC2516yzM10471k2 == enumC2516yz2) {
                                                    z16 = true;
                                                }
                                                if (enumC2516yzM10471k != enumC2516yz2) {
                                                }
                                            }
                                            if (z16) {
/* 180 */                                       c0875ec.m3368F(0, interfaceC2462xi6, c2569zz6);
                                            }
                                        }
                                        i16++;
                                        size3 = i19;
                                    }
/* 182 */                           constraintLayout = ((C0075b) interfaceC2462xi6).f1168a;
/* 183 */                           childCount = constraintLayout.getChildCount();
                                    arrayList4 = constraintLayout.f1058b;
                                    while (i17 < childCount) {
/* 184 */                               childAt = constraintLayout.getChildAt(i17);
/* 185 */                               if (childAt instanceof Placeholder) {
/* 186 */                                   placeholder = (Placeholder) childAt;
/* 187 */                                   if (placeholder.f1155b == null) {
/* 188 */                                       LayoutParams layoutParams6 = (LayoutParams) placeholder.getLayoutParams();
/* 190 */                                       layoutParams = (LayoutParams) placeholder.f1155b.getLayoutParams();
/* 191 */                                       c2569zz3 = layoutParams.f1129q0;
/* 192 */                                       c2569zz3.f20438i0 = 0;
/* 193 */                                       c2569zz4 = layoutParams6.f1129q0;
/* 195 */                                       if (c2569zz4.f20415U[0] != enumC2516yz3) {
/* 196 */                                           c2569zz4.m10464P(c2569zz3.m10475r());
                                                }
/* 197 */                                       c2569zz5 = layoutParams6.f1129q0;
/* 199 */                                       if (c2569zz5.f20415U[1] != enumC2516yz3) {
/* 200 */                                           c2569zz5.m10461M(layoutParams.f1129q0.m10472l());
                                                }
/* 202 */                                       layoutParams.f1129q0.f20438i0 = 8;
                                            }
                                        }
                                    }
/* 203 */                           size4 = arrayList4.size();
                                    if (size4 > 0) {
                                        while (i18 < size4) {
/* 205 */                                   ((ConstraintHelper) arrayList4.get(i18)).getClass();
                                        }
                                    }
                                }
/* 206 */                       c0875ec.m3377P(a00Var);
/* 207 */                       size2 = arrayList2.size();
                                if (i7 > 0) {
/* 208 */                           c0875ec.m3375N(a00Var, 0, iM10475r2, iM10472l);
                                }
                                if (size2 > 0) {
/* 209 */                           enumC2516yzArr = a00Var.f20415U;
                                    if (enumC2516yzArr[0] == enumC2516yz4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
/* 210 */                           if (enumC2516yzArr[1] == enumC2516yz4) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    a00 a00Var9 = a00Var2;
/* 213 */                           iMax3 = Math.max(a00Var.m10475r(), a00Var9.f20428d0);
/* 216 */                           iMax4 = Math.max(a00Var.m10472l(), a00Var9.f20430e0);
                                    i9 = 0;
                                    z7 = false;
                                    while (i9 < size2) {
                                        ArrayList arrayList11 = arrayList2;
/* 217 */                               c2569zz2 = (C2569zz) arrayList11.get(i9);
/* 218 */                               if (c2569zz2 instanceof y53) {
                                            z14 = z5;
                                            interfaceC2462xi5 = interfaceC2462xi2;
                                        } else {
/* 219 */                                   iM10475r5 = c2569zz2.m10475r();
/* 220 */                                   iM10472l4 = c2569zz2.m10472l();
                                            z14 = z5;
                                            interfaceC2462xi5 = interfaceC2462xi2;
/* 221 */                                   zM3368F = z7 | c0875ec.m3368F(1, interfaceC2462xi5, c2569zz2);
/* 222 */                                   iM10475r6 = c2569zz2.m10475r();
/* 223 */                                   iM10472l5 = c2569zz2.m10472l();
                                            if (iM10475r6 != iM10475r5) {
/* 224 */                                       c2569zz2.m10464P(iM10475r6);
                                                if (z14) {
/* 228 */                                           iMax3 = Math.max(iMax3, c2569zz2.mo1430j(4).m7247e() + c2569zz2.m10476s() + c2569zz2.f20417W);
                                                }
                                                i15 = iMax3;
                                                z15 = true;
                                            } else {
                                                i15 = iMax3;
                                                z15 = zM3368F;
                                            }
                                            if (iM10472l5 != iM10472l4) {
/* 229 */                                       c2569zz2.m10461M(iM10472l5);
                                                if (z6) {
/* 233 */                                           iMax4 = Math.max(iMax4, c2569zz2.mo1430j(5).m7247e() + c2569zz2.m10477t() + c2569zz2.f20418X);
                                                }
                                                z15 = true;
                                            }
                                            int i3114 = i15;
/* 235 */                                   z7 = z15 | ((y53) c2569zz2).f19492C0;
                                            iMax3 = i3114;
                                        }
                                        i9++;
                                        interfaceC2462xi2 = interfaceC2462xi5;
                                        arrayList2 = arrayList11;
                                        z5 = z14;
                                    }
                                    z8 = z5;
                                    arrayList3 = arrayList2;
                                    i10 = iMax4;
                                    z9 = z7;
                                    i11 = 0;
                                    while (true) {
                                        interfaceC2462xi3 = interfaceC2462xi2;
                                        if (i11 < 2) {
                                            break;
                                            break;
                                        }
                                        int i3115 = i10;
                                        iMax5 = iMax3;
                                        z10 = z9;
                                        iMax6 = i3115;
                                        i12 = 0;
                                        while (i12 < size2) {
/* 236 */                                   c2569zz = (C2569zz) arrayList3.get(i12);
/* 237 */                                   if (c2569zz instanceof cu0) {
                                                i14 = size2;
/* 238 */                                       if (c2569zz.f20438i0 == 8) {
                                                    interfaceC2462xi4 = interfaceC2462xi3;
                                                    z12 = z6;
                                                } else {
/* 241 */                                           iM10475r3 = c2569zz.m10475r();
/* 242 */                                           iM10472l2 = c2569zz.m10472l();
                                                    boolean z216 = z10;
/* 243 */                                           int i3116 = c2569zz.f20426c0;
                                                    z12 = z6;
/* 244 */                                           boolean zM3368F9 = z216 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                                    interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                                           iM10475r4 = c2569zz.m10475r();
                                                    z13 = zM3368F9;
/* 246 */                                           iM10472l3 = c2569zz.m10472l();
                                                    if (iM10475r4 != iM10475r3) {
/* 247 */                                               c2569zz.m10464P(iM10475r4);
                                                        if (!z8) {
                                                        }
                                                        z13 = true;
                                                    }
                                                    if (iM10472l3 != iM10472l2) {
/* 252 */                                               c2569zz.m10461M(iM10472l3);
                                                        if (!z12) {
                                                        }
                                                        z13 = true;
                                                    }
/* 257 */                                           if (c2569zz.f20399E) {
                                                        z10 = z13;
                                                    } else {
                                                        z10 = z13;
                                                    }
                                                }
                                            } else {
                                                i14 = size2;
/* 238 */                                       if (c2569zz.f20438i0 == 8) {
                                                    interfaceC2462xi4 = interfaceC2462xi3;
                                                    z12 = z6;
                                                } else {
/* 241 */                                           iM10475r3 = c2569zz.m10475r();
/* 242 */                                           iM10472l2 = c2569zz.m10472l();
                                                    boolean z217 = z10;
/* 243 */                                           int i3117 = c2569zz.f20426c0;
                                                    z12 = z6;
/* 244 */                                           boolean zM3368F10 = z217 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                                    interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                                           iM10475r4 = c2569zz.m10475r();
                                                    z13 = zM3368F10;
/* 246 */                                           iM10472l3 = c2569zz.m10472l();
                                                    if (iM10475r4 != iM10475r3) {
/* 247 */                                               c2569zz.m10464P(iM10475r4);
                                                        if (!z8) {
                                                        }
                                                        z13 = true;
                                                    }
                                                    if (iM10472l3 != iM10472l2) {
/* 252 */                                               c2569zz.m10461M(iM10472l3);
                                                        if (!z12) {
                                                        }
                                                        z13 = true;
                                                    }
/* 257 */                                           if (c2569zz.f20399E) {
                                                        z10 = z13;
                                                    } else {
                                                        z10 = z13;
                                                    }
                                                }
                                            }
                                            i12++;
                                            size2 = i14;
                                            z6 = z12;
                                            interfaceC2462xi3 = interfaceC2462xi4;
                                        }
                                        i13 = size2;
                                        interfaceC2462xi2 = interfaceC2462xi3;
                                        z11 = z6;
                                        if (z10) {
                                            break;
                                            break;
                                        }
                                        i11++;
/* 259 */                               c0875ec.m3375N(a00Var, i11, iM10475r2, iM10472l);
                                        iMax3 = iMax5;
                                        i10 = iMax6;
                                        size2 = i13;
                                        z6 = z11;
                                        z9 = false;
                                    }
                                }
/* 260 */                       a00Var.f8H0 = i3113;
/* 261 */                       t71.f16931p = a00Var.m10X(NotificationCompat.FLAG_GROUP_SUMMARY);
                            }
                        }
                        i7 = size;
                        z2 = z215;
                        z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zM6029B);
                        if (z3) {
/* 72 */                    iMin = Math.min(a00Var.f20397C[0], i27);
/* 74 */                    iMin2 = Math.min(a00Var.f20397C[1], i28);
                            i20 = 1073741824;
                            if (mode == 1073741824) {
/* 75 */                        if (a00Var.m10475r() != iMin) {
/* 76 */                            a00Var.m10464P(iMin);
                                    z17 = true;
/* 77 */                            u70Var.f17386b = true;
                                } else {
                                    z17 = true;
                                }
                                i20 = 1073741824;
                            } else {
                                z17 = true;
                            }
                            if (mode2 == i20) {
/* 78 */                        if (a00Var.m10472l() != iMin2) {
/* 79 */                            a00Var.m10461M(iMin2);
/* 80 */                            u70Var.f17386b = z17;
                                }
                                i20 = 1073741824;
                            }
                            if (mode == i20) {
                                z4 = z3;
                                a00Var2 = a00Var2;
                                arrayList2 = arrayList;
                                interfaceC2462xi2 = interfaceC2462xi;
                                enumC2516yz3 = enumC2516yz6;
                                enumC2516yz4 = enumC2516yz5;
/* 134 */                       a00Var3 = u70Var.f17385a;
/* 135 */                       if (u70Var.f17386b) {
/* 136 */                           it = a00Var3.f17u0.iterator();
                                    while (it.hasNext()) {
                                        C2569zz c2569zz18 = (C2569zz) it.next();
/* 137 */                               c2569zz18.m10470i();
/* 138 */                               c2569zz18.f20421a = false;
/* 139 */                               uu0 uu0Var110 = c2569zz18.f20427d;
                                        Iterator it13 = it;
                                        uu0Var110.f13139e.f17890j = false;
/* 140 */                               uu0Var110.f13141g = false;
/* 141 */                               uu0Var110.m9139n();
/* 142 */                               k23 k23Var110 = c2569zz18.f20429e;
                                        k23Var110.f13139e.f17890j = false;
/* 143 */                               k23Var110.f13141g = false;
/* 144 */                               k23Var110.m5936m();
                                        it = it13;
                                    }
                                    i21 = 0;
/* 145 */                           a00Var3.m10470i();
/* 146 */                           a00Var3.f20421a = false;
/* 147 */                           uu0 uu0Var111 = a00Var3.f20427d;
                                    uu0Var111.f13139e.f17890j = false;
/* 148 */                           uu0Var111.f13141g = false;
/* 149 */                           uu0Var111.m9139n();
/* 150 */                           k23 k23Var111 = a00Var3.f20429e;
                                    k23Var111.f13139e.f17890j = false;
/* 151 */                           k23Var111.f13141g = false;
/* 152 */                           k23Var111.m5936m();
/* 153 */                           u70Var.m8965c();
                                } else {
                                    i21 = 0;
                                }
/* 154 */                       u70Var.m8964b(u70Var.f17388d);
/* 155 */                       a00Var3.f20422a0 = i21;
/* 156 */                       a00Var3.f20424b0 = i21;
/* 157 */                       a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                       a00Var3.f20429e.f13142h.mo6945d(i21);
                                i22 = 1073741824;
                                if (mode == 1073741824) {
/* 159 */                           zM8U = a00Var.m8U(i21, zM6029B);
                                    i8 = 1;
                                } else {
                                    i8 = 0;
                                    zM8U = true;
                                }
                                if (mode2 == 1073741824) {
/* 160 */                           zM8U &= a00Var.m8U(1, zM6029B);
                                    i8++;
                                }
                            } else {
                                z4 = z3;
                                a00Var2 = a00Var2;
                                arrayList2 = arrayList;
                                interfaceC2462xi2 = interfaceC2462xi;
                                enumC2516yz3 = enumC2516yz6;
                                enumC2516yz4 = enumC2516yz5;
/* 134 */                       a00Var3 = u70Var.f17385a;
/* 135 */                       if (u70Var.f17386b) {
/* 136 */                           it = a00Var3.f17u0.iterator();
                                    while (it.hasNext()) {
                                        C2569zz c2569zz19 = (C2569zz) it.next();
/* 137 */                               c2569zz19.m10470i();
/* 138 */                               c2569zz19.f20421a = false;
/* 139 */                               uu0 uu0Var112 = c2569zz19.f20427d;
                                        Iterator it14 = it;
                                        uu0Var112.f13139e.f17890j = false;
/* 140 */                               uu0Var112.f13141g = false;
/* 141 */                               uu0Var112.m9139n();
/* 142 */                               k23 k23Var112 = c2569zz19.f20429e;
                                        k23Var112.f13139e.f17890j = false;
/* 143 */                               k23Var112.f13141g = false;
/* 144 */                               k23Var112.m5936m();
                                        it = it14;
                                    }
                                    i21 = 0;
/* 145 */                           a00Var3.m10470i();
/* 146 */                           a00Var3.f20421a = false;
/* 147 */                           uu0 uu0Var113 = a00Var3.f20427d;
                                    uu0Var113.f13139e.f17890j = false;
/* 148 */                           uu0Var113.f13141g = false;
/* 149 */                           uu0Var113.m9139n();
/* 150 */                           k23 k23Var113 = a00Var3.f20429e;
                                    k23Var113.f13139e.f17890j = false;
/* 151 */                           k23Var113.f13141g = false;
/* 152 */                           k23Var113.m5936m();
/* 153 */                           u70Var.m8965c();
                                } else {
                                    i21 = 0;
                                }
/* 154 */                       u70Var.m8964b(u70Var.f17388d);
/* 155 */                       a00Var3.f20422a0 = i21;
/* 156 */                       a00Var3.f20424b0 = i21;
/* 157 */                       a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                       a00Var3.f20429e.f13142h.mo6945d(i21);
                                i22 = 1073741824;
                                if (mode == 1073741824) {
/* 159 */                           zM8U = a00Var.m8U(i21, zM6029B);
                                    i8 = 1;
                                } else {
                                    i8 = 0;
                                    zM8U = true;
                                }
                                if (mode2 == 1073741824) {
/* 160 */                           zM8U &= a00Var.m8U(1, zM6029B);
                                    i8++;
                                }
                            }
                            if (zM8U) {
                                if (mode == i22) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if (mode2 == i22) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
/* 161 */                       a00Var.mo5Q(z18, z19);
                            }
                        } else {
                            z4 = z3;
                            a00Var2 = a00Var2;
                            arrayList2 = arrayList;
                            interfaceC2462xi2 = interfaceC2462xi;
                            enumC2516yz3 = enumC2516yz6;
                            enumC2516yz4 = enumC2516yz5;
                            i8 = 0;
                            zM8U = false;
                        }
                        if (zM8U) {
                        }
/* 162 */               int i3118 = a00Var.f8H0;
                        if (i7 > 0) {
/* 163 */                   size3 = a00Var.f17u0.size();
/* 164 */                   boolean zM10X6 = a00Var.m10X(64);
/* 165 */                   interfaceC2462xi6 = a00Var.f21y0;
                            i16 = 0;
                            while (i16 < size3) {
/* 166 */                       c2569zz6 = (C2569zz) a00Var.f17u0.get(i16);
/* 167 */                       if (!(c2569zz6 instanceof bs0)) {
                                    i19 = size3;
                                } else {
/* 171 */                           enumC2516yzM10471k = c2569zz6.m10471k(0);
/* 172 */                           enumC2516yzM10471k2 = c2569zz6.m10471k(1);
                                    i19 = size3;
                                    if (enumC2516yzM10471k == enumC2516yz2) {
                                        z16 = false;
                                    } else {
                                        z16 = false;
                                    }
                                    if (!z16) {
                                        if (enumC2516yzM10471k == enumC2516yz2) {
                                            z16 = true;
                                        }
                                        if (enumC2516yzM10471k2 == enumC2516yz2) {
                                            z16 = true;
                                        }
                                        if (enumC2516yzM10471k != enumC2516yz2) {
                                        }
                                    }
                                    if (z16) {
/* 180 */                               c0875ec.m3368F(0, interfaceC2462xi6, c2569zz6);
                                    }
                                }
                                i16++;
                                size3 = i19;
                            }
/* 182 */                   constraintLayout = ((C0075b) interfaceC2462xi6).f1168a;
/* 183 */                   childCount = constraintLayout.getChildCount();
                            arrayList4 = constraintLayout.f1058b;
                            while (i17 < childCount) {
/* 184 */                       childAt = constraintLayout.getChildAt(i17);
/* 185 */                       if (childAt instanceof Placeholder) {
/* 186 */                           placeholder = (Placeholder) childAt;
/* 187 */                           if (placeholder.f1155b == null) {
/* 188 */                               LayoutParams layoutParams7 = (LayoutParams) placeholder.getLayoutParams();
/* 190 */                               layoutParams = (LayoutParams) placeholder.f1155b.getLayoutParams();
/* 191 */                               c2569zz3 = layoutParams.f1129q0;
/* 192 */                               c2569zz3.f20438i0 = 0;
/* 193 */                               c2569zz4 = layoutParams7.f1129q0;
/* 195 */                               if (c2569zz4.f20415U[0] != enumC2516yz3) {
/* 196 */                                   c2569zz4.m10464P(c2569zz3.m10475r());
                                        }
/* 197 */                               c2569zz5 = layoutParams7.f1129q0;
/* 199 */                               if (c2569zz5.f20415U[1] != enumC2516yz3) {
/* 200 */                                   c2569zz5.m10461M(layoutParams.f1129q0.m10472l());
                                        }
/* 202 */                               layoutParams.f1129q0.f20438i0 = 8;
                                    }
                                }
                            }
/* 203 */                   size4 = arrayList4.size();
                            if (size4 > 0) {
                                while (i18 < size4) {
/* 205 */                           ((ConstraintHelper) arrayList4.get(i18)).getClass();
                                }
                            }
                        }
/* 206 */               c0875ec.m3377P(a00Var);
/* 207 */               size2 = arrayList2.size();
                        if (i7 > 0) {
/* 208 */                   c0875ec.m3375N(a00Var, 0, iM10475r2, iM10472l);
                        }
                        if (size2 > 0) {
/* 209 */                   enumC2516yzArr = a00Var.f20415U;
                            if (enumC2516yzArr[0] == enumC2516yz4) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
/* 210 */                   if (enumC2516yzArr[1] == enumC2516yz4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            a00 a00Var10 = a00Var2;
/* 213 */                   iMax3 = Math.max(a00Var.m10475r(), a00Var10.f20428d0);
/* 216 */                   iMax4 = Math.max(a00Var.m10472l(), a00Var10.f20430e0);
                            i9 = 0;
                            z7 = false;
                            while (i9 < size2) {
                                ArrayList arrayList12 = arrayList2;
/* 217 */                       c2569zz2 = (C2569zz) arrayList12.get(i9);
/* 218 */                       if (c2569zz2 instanceof y53) {
                                    z14 = z5;
                                    interfaceC2462xi5 = interfaceC2462xi2;
                                } else {
/* 219 */                           iM10475r5 = c2569zz2.m10475r();
/* 220 */                           iM10472l4 = c2569zz2.m10472l();
                                    z14 = z5;
                                    interfaceC2462xi5 = interfaceC2462xi2;
/* 221 */                           zM3368F = z7 | c0875ec.m3368F(1, interfaceC2462xi5, c2569zz2);
/* 222 */                           iM10475r6 = c2569zz2.m10475r();
/* 223 */                           iM10472l5 = c2569zz2.m10472l();
                                    if (iM10475r6 != iM10475r5) {
/* 224 */                               c2569zz2.m10464P(iM10475r6);
                                        if (z14) {
/* 228 */                                   iMax3 = Math.max(iMax3, c2569zz2.mo1430j(4).m7247e() + c2569zz2.m10476s() + c2569zz2.f20417W);
                                        }
                                        i15 = iMax3;
                                        z15 = true;
                                    } else {
                                        i15 = iMax3;
                                        z15 = zM3368F;
                                    }
                                    if (iM10472l5 != iM10472l4) {
/* 229 */                               c2569zz2.m10461M(iM10472l5);
                                        if (z6) {
/* 233 */                                   iMax4 = Math.max(iMax4, c2569zz2.mo1430j(5).m7247e() + c2569zz2.m10477t() + c2569zz2.f20418X);
                                        }
                                        z15 = true;
                                    }
                                    int i3119 = i15;
/* 235 */                           z7 = z15 | ((y53) c2569zz2).f19492C0;
                                    iMax3 = i3119;
                                }
                                i9++;
                                interfaceC2462xi2 = interfaceC2462xi5;
                                arrayList2 = arrayList12;
                                z5 = z14;
                            }
                            z8 = z5;
                            arrayList3 = arrayList2;
                            i10 = iMax4;
                            z9 = z7;
                            i11 = 0;
                            while (true) {
                                interfaceC2462xi3 = interfaceC2462xi2;
                                if (i11 < 2) {
                                    break;
                                    break;
                                }
                                int i31110 = i10;
                                iMax5 = iMax3;
                                z10 = z9;
                                iMax6 = i31110;
                                i12 = 0;
                                while (i12 < size2) {
/* 236 */                           c2569zz = (C2569zz) arrayList3.get(i12);
/* 237 */                           if (c2569zz instanceof cu0) {
                                        i14 = size2;
/* 238 */                               if (c2569zz.f20438i0 == 8) {
                                            interfaceC2462xi4 = interfaceC2462xi3;
                                            z12 = z6;
                                        } else {
/* 241 */                                   iM10475r3 = c2569zz.m10475r();
/* 242 */                                   iM10472l2 = c2569zz.m10472l();
                                            boolean z218 = z10;
/* 243 */                                   int i31111 = c2569zz.f20426c0;
                                            z12 = z6;
/* 244 */                                   boolean zM3368F11 = z218 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                            interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                                   iM10475r4 = c2569zz.m10475r();
                                            z13 = zM3368F11;
/* 246 */                                   iM10472l3 = c2569zz.m10472l();
                                            if (iM10475r4 != iM10475r3) {
/* 247 */                                       c2569zz.m10464P(iM10475r4);
                                                if (!z8) {
                                                }
                                                z13 = true;
                                            }
                                            if (iM10472l3 != iM10472l2) {
/* 252 */                                       c2569zz.m10461M(iM10472l3);
                                                if (!z12) {
                                                }
                                                z13 = true;
                                            }
/* 257 */                                   if (c2569zz.f20399E) {
                                                z10 = z13;
                                            } else {
                                                z10 = z13;
                                            }
                                        }
                                    } else {
                                        i14 = size2;
/* 238 */                               if (c2569zz.f20438i0 == 8) {
                                            interfaceC2462xi4 = interfaceC2462xi3;
                                            z12 = z6;
                                        } else {
/* 241 */                                   iM10475r3 = c2569zz.m10475r();
/* 242 */                                   iM10472l2 = c2569zz.m10472l();
                                            boolean z219 = z10;
/* 243 */                                   int i31112 = c2569zz.f20426c0;
                                            z12 = z6;
/* 244 */                                   boolean zM3368F12 = z219 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                            interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                                   iM10475r4 = c2569zz.m10475r();
                                            z13 = zM3368F12;
/* 246 */                                   iM10472l3 = c2569zz.m10472l();
                                            if (iM10475r4 != iM10475r3) {
/* 247 */                                       c2569zz.m10464P(iM10475r4);
                                                if (!z8) {
                                                }
                                                z13 = true;
                                            }
                                            if (iM10472l3 != iM10472l2) {
/* 252 */                                       c2569zz.m10461M(iM10472l3);
                                                if (!z12) {
                                                }
                                                z13 = true;
                                            }
/* 257 */                                   if (c2569zz.f20399E) {
                                                z10 = z13;
                                            } else {
                                                z10 = z13;
                                            }
                                        }
                                    }
                                    i12++;
                                    size2 = i14;
                                    z6 = z12;
                                    interfaceC2462xi3 = interfaceC2462xi4;
                                }
                                i13 = size2;
                                interfaceC2462xi2 = interfaceC2462xi3;
                                z11 = z6;
                                if (z10) {
                                    break;
                                    break;
                                }
                                i11++;
/* 259 */                       c0875ec.m3375N(a00Var, i11, iM10475r2, iM10472l);
                                iMax3 = iMax5;
                                i10 = iMax6;
                                size2 = i13;
                                z6 = z11;
                                z9 = false;
                            }
                        }
/* 260 */               a00Var.f8H0 = i3118;
/* 261 */               t71.f16931p = a00Var.m10X(NotificationCompat.FLAG_GROUP_SUMMARY);
                    }
                    if (childCount2 == 0) {
/* 28 */                iMax2 = Math.max(0, this.f1064e);
                    } else {
                        iMax2 = i28;
                    }
                    enumC2516yz = enumC2516yz5;
/* 29 */            iM10475r = a00Var.m10475r();
                    u70Var = a00Var.f19w0;
                    if (iMax == iM10475r) {
/* 30 */                u70Var.f17387c = true;
                    } else {
/* 30 */                u70Var.f17387c = true;
                    }
/* 31 */            a00Var.f20422a0 = 0;
/* 32 */            a00Var.f20424b0 = 0;
/* 33 */            int i31113 = this.f1066f - i30;
/* 34 */            int[] iArr4 = a00Var.f20397C;
                    iArr4[0] = i31113;
/* 36 */            iArr4[1] = this.f1067i - i29;
/* 37 */            a00Var.f20428d0 = 0;
/* 38 */            a00Var.f20430e0 = 0;
/* 39 */            a00Var.m10462N(enumC2516yz5);
/* 40 */            a00Var.m10464P(iMax);
/* 41 */            a00Var.m10463O(enumC2516yz);
/* 42 */            a00Var.m10461M(iMax2);
/* 43 */            i5 = this.f1062d - i30;
                    if (i5 < 0) {
/* 44 */                a00Var.f20428d0 = 0;
                    } else {
/* 45 */                a00Var.f20428d0 = i5;
                    }
/* 46 */            i6 = this.f1064e - i29;
                    if (i6 < 0) {
/* 47 */                a00Var.f20430e0 = 0;
                    } else {
/* 48 */                a00Var.f20430e0 = i6;
                    }
/* 49 */            a00Var.f2B0 = iMax9;
/* 50 */            a00Var.f3C0 = iMax7;
/* 51 */            c0875ec = a00Var.f18v0;
/* 52 */            a00Var2 = (a00) c0875ec.f7615d;
/* 53 */            arrayList = (ArrayList) c0875ec.f7613b;
/* 54 */            interfaceC2462xi = a00Var.f21y0;
/* 55 */            size = a00Var.f17u0.size();
/* 56 */            iM10475r2 = a00Var.m10475r();
/* 57 */            iM10472l = a00Var.m10472l();
/* 58 */            zM6029B = kb1.m6029B(i, 128);
                    if (zM6029B) {
                        z = true;
                    } else {
                        z = true;
                    }
/* 60 */            enumC2516yz2 = EnumC2516yz.f19867c;
                    boolean z2110 = z;
                    if (z) {
                        i24 = 0;
                        while (true) {
                            i7 = size;
                            if (i24 < size) {
/* 61 */                        c2569zz7 = (C2569zz) a00Var.f17u0.get(i24);
                                i25 = i24;
/* 62 */                        enumC2516yzArr2 = c2569zz7.f20415U;
/* 63 */                        if (enumC2516yzArr2[0] == enumC2516yz2) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
/* 64 */                        if (enumC2516yzArr2[1] == enumC2516yz2) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                if (z22) {
                                    z24 = false;
                                } else {
                                    z24 = false;
                                }
/* 66 */                        if (c2569zz7.m10482y()) {
                                    i24 = i25 + 1;
                                    size = i7;
                                } else {
                                    i24 = i25 + 1;
                                    size = i7;
                                }
                                z2 = false;
                            }
                            z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zM6029B);
                            if (z3) {
/* 72 */                        iMin = Math.min(a00Var.f20397C[0], i27);
/* 74 */                        iMin2 = Math.min(a00Var.f20397C[1], i28);
                                i20 = 1073741824;
                                if (mode == 1073741824) {
/* 75 */                            if (a00Var.m10475r() != iMin) {
/* 76 */                                a00Var.m10464P(iMin);
                                        z17 = true;
/* 77 */                                u70Var.f17386b = true;
                                    } else {
                                        z17 = true;
                                    }
                                    i20 = 1073741824;
                                } else {
                                    z17 = true;
                                }
                                if (mode2 == i20) {
/* 78 */                            if (a00Var.m10472l() != iMin2) {
/* 79 */                                a00Var.m10461M(iMin2);
/* 80 */                                u70Var.f17386b = z17;
                                    }
                                    i20 = 1073741824;
                                }
                                if (mode == i20) {
                                    z4 = z3;
                                    a00Var2 = a00Var2;
                                    arrayList2 = arrayList;
                                    interfaceC2462xi2 = interfaceC2462xi;
                                    enumC2516yz3 = enumC2516yz6;
                                    enumC2516yz4 = enumC2516yz5;
/* 134 */                           a00Var3 = u70Var.f17385a;
/* 135 */                           if (u70Var.f17386b) {
/* 136 */                               it = a00Var3.f17u0.iterator();
                                        while (it.hasNext()) {
                                            C2569zz c2569zz110 = (C2569zz) it.next();
/* 137 */                                   c2569zz110.m10470i();
/* 138 */                                   c2569zz110.f20421a = false;
/* 139 */                                   uu0 uu0Var114 = c2569zz110.f20427d;
                                            Iterator it15 = it;
                                            uu0Var114.f13139e.f17890j = false;
/* 140 */                                   uu0Var114.f13141g = false;
/* 141 */                                   uu0Var114.m9139n();
/* 142 */                                   k23 k23Var114 = c2569zz110.f20429e;
                                            k23Var114.f13139e.f17890j = false;
/* 143 */                                   k23Var114.f13141g = false;
/* 144 */                                   k23Var114.m5936m();
                                            it = it15;
                                        }
                                        i21 = 0;
/* 145 */                               a00Var3.m10470i();
/* 146 */                               a00Var3.f20421a = false;
/* 147 */                               uu0 uu0Var115 = a00Var3.f20427d;
                                        uu0Var115.f13139e.f17890j = false;
/* 148 */                               uu0Var115.f13141g = false;
/* 149 */                               uu0Var115.m9139n();
/* 150 */                               k23 k23Var115 = a00Var3.f20429e;
                                        k23Var115.f13139e.f17890j = false;
/* 151 */                               k23Var115.f13141g = false;
/* 152 */                               k23Var115.m5936m();
/* 153 */                               u70Var.m8965c();
                                    } else {
                                        i21 = 0;
                                    }
/* 154 */                           u70Var.m8964b(u70Var.f17388d);
/* 155 */                           a00Var3.f20422a0 = i21;
/* 156 */                           a00Var3.f20424b0 = i21;
/* 157 */                           a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                           a00Var3.f20429e.f13142h.mo6945d(i21);
                                    i22 = 1073741824;
                                    if (mode == 1073741824) {
/* 159 */                               zM8U = a00Var.m8U(i21, zM6029B);
                                        i8 = 1;
                                    } else {
                                        i8 = 0;
                                        zM8U = true;
                                    }
                                    if (mode2 == 1073741824) {
/* 160 */                               zM8U &= a00Var.m8U(1, zM6029B);
                                        i8++;
                                    }
                                } else {
                                    z4 = z3;
                                    a00Var2 = a00Var2;
                                    arrayList2 = arrayList;
                                    interfaceC2462xi2 = interfaceC2462xi;
                                    enumC2516yz3 = enumC2516yz6;
                                    enumC2516yz4 = enumC2516yz5;
/* 134 */                           a00Var3 = u70Var.f17385a;
/* 135 */                           if (u70Var.f17386b) {
/* 136 */                               it = a00Var3.f17u0.iterator();
                                        while (it.hasNext()) {
                                            C2569zz c2569zz111 = (C2569zz) it.next();
/* 137 */                                   c2569zz111.m10470i();
/* 138 */                                   c2569zz111.f20421a = false;
/* 139 */                                   uu0 uu0Var116 = c2569zz111.f20427d;
                                            Iterator it16 = it;
                                            uu0Var116.f13139e.f17890j = false;
/* 140 */                                   uu0Var116.f13141g = false;
/* 141 */                                   uu0Var116.m9139n();
/* 142 */                                   k23 k23Var116 = c2569zz111.f20429e;
                                            k23Var116.f13139e.f17890j = false;
/* 143 */                                   k23Var116.f13141g = false;
/* 144 */                                   k23Var116.m5936m();
                                            it = it16;
                                        }
                                        i21 = 0;
/* 145 */                               a00Var3.m10470i();
/* 146 */                               a00Var3.f20421a = false;
/* 147 */                               uu0 uu0Var117 = a00Var3.f20427d;
                                        uu0Var117.f13139e.f17890j = false;
/* 148 */                               uu0Var117.f13141g = false;
/* 149 */                               uu0Var117.m9139n();
/* 150 */                               k23 k23Var117 = a00Var3.f20429e;
                                        k23Var117.f13139e.f17890j = false;
/* 151 */                               k23Var117.f13141g = false;
/* 152 */                               k23Var117.m5936m();
/* 153 */                               u70Var.m8965c();
                                    } else {
                                        i21 = 0;
                                    }
/* 154 */                           u70Var.m8964b(u70Var.f17388d);
/* 155 */                           a00Var3.f20422a0 = i21;
/* 156 */                           a00Var3.f20424b0 = i21;
/* 157 */                           a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                           a00Var3.f20429e.f13142h.mo6945d(i21);
                                    i22 = 1073741824;
                                    if (mode == 1073741824) {
/* 159 */                               zM8U = a00Var.m8U(i21, zM6029B);
                                        i8 = 1;
                                    } else {
                                        i8 = 0;
                                        zM8U = true;
                                    }
                                    if (mode2 == 1073741824) {
/* 160 */                               zM8U &= a00Var.m8U(1, zM6029B);
                                        i8++;
                                    }
                                }
                                if (zM8U) {
                                    if (mode == i22) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    if (mode2 == i22) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
/* 161 */                           a00Var.mo5Q(z18, z19);
                                }
                            } else {
                                z4 = z3;
                                a00Var2 = a00Var2;
                                arrayList2 = arrayList;
                                interfaceC2462xi2 = interfaceC2462xi;
                                enumC2516yz3 = enumC2516yz6;
                                enumC2516yz4 = enumC2516yz5;
                                i8 = 0;
                                zM8U = false;
                            }
                            if (zM8U) {
                            }
/* 162 */                   int i31114 = a00Var.f8H0;
                            if (i7 > 0) {
/* 163 */                       size3 = a00Var.f17u0.size();
/* 164 */                       boolean zM10X7 = a00Var.m10X(64);
/* 165 */                       interfaceC2462xi6 = a00Var.f21y0;
                                i16 = 0;
                                while (i16 < size3) {
/* 166 */                           c2569zz6 = (C2569zz) a00Var.f17u0.get(i16);
/* 167 */                           if (!(c2569zz6 instanceof bs0)) {
                                        i19 = size3;
                                    } else {
/* 171 */                               enumC2516yzM10471k = c2569zz6.m10471k(0);
/* 172 */                               enumC2516yzM10471k2 = c2569zz6.m10471k(1);
                                        i19 = size3;
                                        if (enumC2516yzM10471k == enumC2516yz2) {
                                            z16 = false;
                                        } else {
                                            z16 = false;
                                        }
                                        if (!z16) {
                                            if (enumC2516yzM10471k == enumC2516yz2) {
                                                z16 = true;
                                            }
                                            if (enumC2516yzM10471k2 == enumC2516yz2) {
                                                z16 = true;
                                            }
                                            if (enumC2516yzM10471k != enumC2516yz2) {
                                            }
                                        }
                                        if (z16) {
/* 180 */                                   c0875ec.m3368F(0, interfaceC2462xi6, c2569zz6);
                                        }
                                    }
                                    i16++;
                                    size3 = i19;
                                }
/* 182 */                       constraintLayout = ((C0075b) interfaceC2462xi6).f1168a;
/* 183 */                       childCount = constraintLayout.getChildCount();
                                arrayList4 = constraintLayout.f1058b;
                                while (i17 < childCount) {
/* 184 */                           childAt = constraintLayout.getChildAt(i17);
/* 185 */                           if (childAt instanceof Placeholder) {
/* 186 */                               placeholder = (Placeholder) childAt;
/* 187 */                               if (placeholder.f1155b == null) {
/* 188 */                                   LayoutParams layoutParams8 = (LayoutParams) placeholder.getLayoutParams();
/* 190 */                                   layoutParams = (LayoutParams) placeholder.f1155b.getLayoutParams();
/* 191 */                                   c2569zz3 = layoutParams.f1129q0;
/* 192 */                                   c2569zz3.f20438i0 = 0;
/* 193 */                                   c2569zz4 = layoutParams8.f1129q0;
/* 195 */                                   if (c2569zz4.f20415U[0] != enumC2516yz3) {
/* 196 */                                       c2569zz4.m10464P(c2569zz3.m10475r());
                                            }
/* 197 */                                   c2569zz5 = layoutParams8.f1129q0;
/* 199 */                                   if (c2569zz5.f20415U[1] != enumC2516yz3) {
/* 200 */                                       c2569zz5.m10461M(layoutParams.f1129q0.m10472l());
                                            }
/* 202 */                                   layoutParams.f1129q0.f20438i0 = 8;
                                        }
                                    }
                                }
/* 203 */                       size4 = arrayList4.size();
                                if (size4 > 0) {
                                    while (i18 < size4) {
/* 205 */                               ((ConstraintHelper) arrayList4.get(i18)).getClass();
                                    }
                                }
                            }
/* 206 */                   c0875ec.m3377P(a00Var);
/* 207 */                   size2 = arrayList2.size();
                            if (i7 > 0) {
/* 208 */                       c0875ec.m3375N(a00Var, 0, iM10475r2, iM10472l);
                            }
                            if (size2 > 0) {
/* 209 */                       enumC2516yzArr = a00Var.f20415U;
                                if (enumC2516yzArr[0] == enumC2516yz4) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
/* 210 */                       if (enumC2516yzArr[1] == enumC2516yz4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                a00 a00Var11 = a00Var2;
/* 213 */                       iMax3 = Math.max(a00Var.m10475r(), a00Var11.f20428d0);
/* 216 */                       iMax4 = Math.max(a00Var.m10472l(), a00Var11.f20430e0);
                                i9 = 0;
                                z7 = false;
                                while (i9 < size2) {
                                    ArrayList arrayList13 = arrayList2;
/* 217 */                           c2569zz2 = (C2569zz) arrayList13.get(i9);
/* 218 */                           if (c2569zz2 instanceof y53) {
                                        z14 = z5;
                                        interfaceC2462xi5 = interfaceC2462xi2;
                                    } else {
/* 219 */                               iM10475r5 = c2569zz2.m10475r();
/* 220 */                               iM10472l4 = c2569zz2.m10472l();
                                        z14 = z5;
                                        interfaceC2462xi5 = interfaceC2462xi2;
/* 221 */                               zM3368F = z7 | c0875ec.m3368F(1, interfaceC2462xi5, c2569zz2);
/* 222 */                               iM10475r6 = c2569zz2.m10475r();
/* 223 */                               iM10472l5 = c2569zz2.m10472l();
                                        if (iM10475r6 != iM10475r5) {
/* 224 */                                   c2569zz2.m10464P(iM10475r6);
                                            if (z14) {
/* 228 */                                       iMax3 = Math.max(iMax3, c2569zz2.mo1430j(4).m7247e() + c2569zz2.m10476s() + c2569zz2.f20417W);
                                            }
                                            i15 = iMax3;
                                            z15 = true;
                                        } else {
                                            i15 = iMax3;
                                            z15 = zM3368F;
                                        }
                                        if (iM10472l5 != iM10472l4) {
/* 229 */                                   c2569zz2.m10461M(iM10472l5);
                                            if (z6) {
/* 233 */                                       iMax4 = Math.max(iMax4, c2569zz2.mo1430j(5).m7247e() + c2569zz2.m10477t() + c2569zz2.f20418X);
                                            }
                                            z15 = true;
                                        }
                                        int i31115 = i15;
/* 235 */                               z7 = z15 | ((y53) c2569zz2).f19492C0;
                                        iMax3 = i31115;
                                    }
                                    i9++;
                                    interfaceC2462xi2 = interfaceC2462xi5;
                                    arrayList2 = arrayList13;
                                    z5 = z14;
                                }
                                z8 = z5;
                                arrayList3 = arrayList2;
                                i10 = iMax4;
                                z9 = z7;
                                i11 = 0;
                                while (true) {
                                    interfaceC2462xi3 = interfaceC2462xi2;
                                    if (i11 < 2) {
                                        break;
                                        break;
                                    }
                                    int i31116 = i10;
                                    iMax5 = iMax3;
                                    z10 = z9;
                                    iMax6 = i31116;
                                    i12 = 0;
                                    while (i12 < size2) {
/* 236 */                               c2569zz = (C2569zz) arrayList3.get(i12);
/* 237 */                               if (c2569zz instanceof cu0) {
                                            i14 = size2;
/* 238 */                                   if (c2569zz.f20438i0 == 8) {
                                                interfaceC2462xi4 = interfaceC2462xi3;
                                                z12 = z6;
                                            } else {
/* 241 */                                       iM10475r3 = c2569zz.m10475r();
/* 242 */                                       iM10472l2 = c2569zz.m10472l();
                                                boolean z2111 = z10;
/* 243 */                                       int i31117 = c2569zz.f20426c0;
                                                z12 = z6;
/* 244 */                                       boolean zM3368F13 = z2111 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                                interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                                       iM10475r4 = c2569zz.m10475r();
                                                z13 = zM3368F13;
/* 246 */                                       iM10472l3 = c2569zz.m10472l();
                                                if (iM10475r4 != iM10475r3) {
/* 247 */                                           c2569zz.m10464P(iM10475r4);
                                                    if (!z8) {
                                                    }
                                                    z13 = true;
                                                }
                                                if (iM10472l3 != iM10472l2) {
/* 252 */                                           c2569zz.m10461M(iM10472l3);
                                                    if (!z12) {
                                                    }
                                                    z13 = true;
                                                }
/* 257 */                                       if (c2569zz.f20399E) {
                                                    z10 = z13;
                                                } else {
                                                    z10 = z13;
                                                }
                                            }
                                        } else {
                                            i14 = size2;
/* 238 */                                   if (c2569zz.f20438i0 == 8) {
                                                interfaceC2462xi4 = interfaceC2462xi3;
                                                z12 = z6;
                                            } else {
/* 241 */                                       iM10475r3 = c2569zz.m10475r();
/* 242 */                                       iM10472l2 = c2569zz.m10472l();
                                                boolean z2112 = z10;
/* 243 */                                       int i31118 = c2569zz.f20426c0;
                                                z12 = z6;
/* 244 */                                       boolean zM3368F14 = z2112 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                                interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                                       iM10475r4 = c2569zz.m10475r();
                                                z13 = zM3368F14;
/* 246 */                                       iM10472l3 = c2569zz.m10472l();
                                                if (iM10475r4 != iM10475r3) {
/* 247 */                                           c2569zz.m10464P(iM10475r4);
                                                    if (!z8) {
                                                    }
                                                    z13 = true;
                                                }
                                                if (iM10472l3 != iM10472l2) {
/* 252 */                                           c2569zz.m10461M(iM10472l3);
                                                    if (!z12) {
                                                    }
                                                    z13 = true;
                                                }
/* 257 */                                       if (c2569zz.f20399E) {
                                                    z10 = z13;
                                                } else {
                                                    z10 = z13;
                                                }
                                            }
                                        }
                                        i12++;
                                        size2 = i14;
                                        z6 = z12;
                                        interfaceC2462xi3 = interfaceC2462xi4;
                                    }
                                    i13 = size2;
                                    interfaceC2462xi2 = interfaceC2462xi3;
                                    z11 = z6;
                                    if (z10) {
                                        break;
                                        break;
                                    }
                                    i11++;
/* 259 */                           c0875ec.m3375N(a00Var, i11, iM10475r2, iM10472l);
                                    iMax3 = iMax5;
                                    i10 = iMax6;
                                    size2 = i13;
                                    z6 = z11;
                                    z9 = false;
                                }
                            }
/* 260 */                   a00Var.f8H0 = i31114;
/* 261 */                   t71.f16931p = a00Var.m10X(NotificationCompat.FLAG_GROUP_SUMMARY);
                        }
                    }
                    i7 = size;
                    z2 = z2110;
                    z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zM6029B);
                    if (z3) {
/* 72 */                iMin = Math.min(a00Var.f20397C[0], i27);
/* 74 */                iMin2 = Math.min(a00Var.f20397C[1], i28);
                        i20 = 1073741824;
                        if (mode == 1073741824) {
/* 75 */                    if (a00Var.m10475r() != iMin) {
/* 76 */                        a00Var.m10464P(iMin);
                                z17 = true;
/* 77 */                        u70Var.f17386b = true;
                            } else {
                                z17 = true;
                            }
                            i20 = 1073741824;
                        } else {
                            z17 = true;
                        }
                        if (mode2 == i20) {
/* 78 */                    if (a00Var.m10472l() != iMin2) {
/* 79 */                        a00Var.m10461M(iMin2);
/* 80 */                        u70Var.f17386b = z17;
                            }
                            i20 = 1073741824;
                        }
                        if (mode == i20) {
                            z4 = z3;
                            a00Var2 = a00Var2;
                            arrayList2 = arrayList;
                            interfaceC2462xi2 = interfaceC2462xi;
                            enumC2516yz3 = enumC2516yz6;
                            enumC2516yz4 = enumC2516yz5;
/* 134 */                   a00Var3 = u70Var.f17385a;
/* 135 */                   if (u70Var.f17386b) {
/* 136 */                       it = a00Var3.f17u0.iterator();
                                while (it.hasNext()) {
                                    C2569zz c2569zz112 = (C2569zz) it.next();
/* 137 */                           c2569zz112.m10470i();
/* 138 */                           c2569zz112.f20421a = false;
/* 139 */                           uu0 uu0Var118 = c2569zz112.f20427d;
                                    Iterator it17 = it;
                                    uu0Var118.f13139e.f17890j = false;
/* 140 */                           uu0Var118.f13141g = false;
/* 141 */                           uu0Var118.m9139n();
/* 142 */                           k23 k23Var118 = c2569zz112.f20429e;
                                    k23Var118.f13139e.f17890j = false;
/* 143 */                           k23Var118.f13141g = false;
/* 144 */                           k23Var118.m5936m();
                                    it = it17;
                                }
                                i21 = 0;
/* 145 */                       a00Var3.m10470i();
/* 146 */                       a00Var3.f20421a = false;
/* 147 */                       uu0 uu0Var119 = a00Var3.f20427d;
                                uu0Var119.f13139e.f17890j = false;
/* 148 */                       uu0Var119.f13141g = false;
/* 149 */                       uu0Var119.m9139n();
/* 150 */                       k23 k23Var119 = a00Var3.f20429e;
                                k23Var119.f13139e.f17890j = false;
/* 151 */                       k23Var119.f13141g = false;
/* 152 */                       k23Var119.m5936m();
/* 153 */                       u70Var.m8965c();
                            } else {
                                i21 = 0;
                            }
/* 154 */                   u70Var.m8964b(u70Var.f17388d);
/* 155 */                   a00Var3.f20422a0 = i21;
/* 156 */                   a00Var3.f20424b0 = i21;
/* 157 */                   a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                   a00Var3.f20429e.f13142h.mo6945d(i21);
                            i22 = 1073741824;
                            if (mode == 1073741824) {
/* 159 */                       zM8U = a00Var.m8U(i21, zM6029B);
                                i8 = 1;
                            } else {
                                i8 = 0;
                                zM8U = true;
                            }
                            if (mode2 == 1073741824) {
/* 160 */                       zM8U &= a00Var.m8U(1, zM6029B);
                                i8++;
                            }
                        } else {
                            z4 = z3;
                            a00Var2 = a00Var2;
                            arrayList2 = arrayList;
                            interfaceC2462xi2 = interfaceC2462xi;
                            enumC2516yz3 = enumC2516yz6;
                            enumC2516yz4 = enumC2516yz5;
/* 134 */                   a00Var3 = u70Var.f17385a;
/* 135 */                   if (u70Var.f17386b) {
/* 136 */                       it = a00Var3.f17u0.iterator();
                                while (it.hasNext()) {
                                    C2569zz c2569zz113 = (C2569zz) it.next();
/* 137 */                           c2569zz113.m10470i();
/* 138 */                           c2569zz113.f20421a = false;
/* 139 */                           uu0 uu0Var1110 = c2569zz113.f20427d;
                                    Iterator it18 = it;
                                    uu0Var1110.f13139e.f17890j = false;
/* 140 */                           uu0Var1110.f13141g = false;
/* 141 */                           uu0Var1110.m9139n();
/* 142 */                           k23 k23Var1110 = c2569zz113.f20429e;
                                    k23Var1110.f13139e.f17890j = false;
/* 143 */                           k23Var1110.f13141g = false;
/* 144 */                           k23Var1110.m5936m();
                                    it = it18;
                                }
                                i21 = 0;
/* 145 */                       a00Var3.m10470i();
/* 146 */                       a00Var3.f20421a = false;
/* 147 */                       uu0 uu0Var1111 = a00Var3.f20427d;
                                uu0Var1111.f13139e.f17890j = false;
/* 148 */                       uu0Var1111.f13141g = false;
/* 149 */                       uu0Var1111.m9139n();
/* 150 */                       k23 k23Var1111 = a00Var3.f20429e;
                                k23Var1111.f13139e.f17890j = false;
/* 151 */                       k23Var1111.f13141g = false;
/* 152 */                       k23Var1111.m5936m();
/* 153 */                       u70Var.m8965c();
                            } else {
                                i21 = 0;
                            }
/* 154 */                   u70Var.m8964b(u70Var.f17388d);
/* 155 */                   a00Var3.f20422a0 = i21;
/* 156 */                   a00Var3.f20424b0 = i21;
/* 157 */                   a00Var3.f20427d.f13142h.mo6945d(i21);
/* 158 */                   a00Var3.f20429e.f13142h.mo6945d(i21);
                            i22 = 1073741824;
                            if (mode == 1073741824) {
/* 159 */                       zM8U = a00Var.m8U(i21, zM6029B);
                                i8 = 1;
                            } else {
                                i8 = 0;
                                zM8U = true;
                            }
                            if (mode2 == 1073741824) {
/* 160 */                       zM8U &= a00Var.m8U(1, zM6029B);
                                i8++;
                            }
                        }
                        if (zM8U) {
                            if (mode == i22) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (mode2 == i22) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
/* 161 */                   a00Var.mo5Q(z18, z19);
                        }
                    } else {
                        z4 = z3;
                        a00Var2 = a00Var2;
                        arrayList2 = arrayList;
                        interfaceC2462xi2 = interfaceC2462xi;
                        enumC2516yz3 = enumC2516yz6;
                        enumC2516yz4 = enumC2516yz5;
                        i8 = 0;
                        zM8U = false;
                    }
                    if (zM8U) {
                    }
/* 162 */           int i31119 = a00Var.f8H0;
                    if (i7 > 0) {
/* 163 */               size3 = a00Var.f17u0.size();
/* 164 */               boolean zM10X8 = a00Var.m10X(64);
/* 165 */               interfaceC2462xi6 = a00Var.f21y0;
                        i16 = 0;
                        while (i16 < size3) {
/* 166 */                   c2569zz6 = (C2569zz) a00Var.f17u0.get(i16);
/* 167 */                   if (!(c2569zz6 instanceof bs0)) {
                                i19 = size3;
                            } else {
/* 171 */                       enumC2516yzM10471k = c2569zz6.m10471k(0);
/* 172 */                       enumC2516yzM10471k2 = c2569zz6.m10471k(1);
                                i19 = size3;
                                if (enumC2516yzM10471k == enumC2516yz2) {
                                    z16 = false;
                                } else {
                                    z16 = false;
                                }
                                if (!z16) {
                                    if (enumC2516yzM10471k == enumC2516yz2) {
                                        z16 = true;
                                    }
                                    if (enumC2516yzM10471k2 == enumC2516yz2) {
                                        z16 = true;
                                    }
                                    if (enumC2516yzM10471k != enumC2516yz2) {
                                    }
                                }
                                if (z16) {
/* 180 */                           c0875ec.m3368F(0, interfaceC2462xi6, c2569zz6);
                                }
                            }
                            i16++;
                            size3 = i19;
                        }
/* 182 */               constraintLayout = ((C0075b) interfaceC2462xi6).f1168a;
/* 183 */               childCount = constraintLayout.getChildCount();
                        arrayList4 = constraintLayout.f1058b;
                        while (i17 < childCount) {
/* 184 */                   childAt = constraintLayout.getChildAt(i17);
/* 185 */                   if (childAt instanceof Placeholder) {
/* 186 */                       placeholder = (Placeholder) childAt;
/* 187 */                       if (placeholder.f1155b == null) {
/* 188 */                           LayoutParams layoutParams9 = (LayoutParams) placeholder.getLayoutParams();
/* 190 */                           layoutParams = (LayoutParams) placeholder.f1155b.getLayoutParams();
/* 191 */                           c2569zz3 = layoutParams.f1129q0;
/* 192 */                           c2569zz3.f20438i0 = 0;
/* 193 */                           c2569zz4 = layoutParams9.f1129q0;
/* 195 */                           if (c2569zz4.f20415U[0] != enumC2516yz3) {
/* 196 */                               c2569zz4.m10464P(c2569zz3.m10475r());
                                    }
/* 197 */                           c2569zz5 = layoutParams9.f1129q0;
/* 199 */                           if (c2569zz5.f20415U[1] != enumC2516yz3) {
/* 200 */                               c2569zz5.m10461M(layoutParams.f1129q0.m10472l());
                                    }
/* 202 */                           layoutParams.f1129q0.f20438i0 = 8;
                                }
                            }
                        }
/* 203 */               size4 = arrayList4.size();
                        if (size4 > 0) {
                            while (i18 < size4) {
/* 205 */                       ((ConstraintHelper) arrayList4.get(i18)).getClass();
                            }
                        }
                    }
/* 206 */           c0875ec.m3377P(a00Var);
/* 207 */           size2 = arrayList2.size();
                    if (i7 > 0) {
/* 208 */               c0875ec.m3375N(a00Var, 0, iM10475r2, iM10472l);
                    }
                    if (size2 > 0) {
/* 209 */               enumC2516yzArr = a00Var.f20415U;
                        if (enumC2516yzArr[0] == enumC2516yz4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
/* 210 */               if (enumC2516yzArr[1] == enumC2516yz4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        a00 a00Var12 = a00Var2;
/* 213 */               iMax3 = Math.max(a00Var.m10475r(), a00Var12.f20428d0);
/* 216 */               iMax4 = Math.max(a00Var.m10472l(), a00Var12.f20430e0);
                        i9 = 0;
                        z7 = false;
                        while (i9 < size2) {
                            ArrayList arrayList14 = arrayList2;
/* 217 */                   c2569zz2 = (C2569zz) arrayList14.get(i9);
/* 218 */                   if (c2569zz2 instanceof y53) {
                                z14 = z5;
                                interfaceC2462xi5 = interfaceC2462xi2;
                            } else {
/* 219 */                       iM10475r5 = c2569zz2.m10475r();
/* 220 */                       iM10472l4 = c2569zz2.m10472l();
                                z14 = z5;
                                interfaceC2462xi5 = interfaceC2462xi2;
/* 221 */                       zM3368F = z7 | c0875ec.m3368F(1, interfaceC2462xi5, c2569zz2);
/* 222 */                       iM10475r6 = c2569zz2.m10475r();
/* 223 */                       iM10472l5 = c2569zz2.m10472l();
                                if (iM10475r6 != iM10475r5) {
/* 224 */                           c2569zz2.m10464P(iM10475r6);
                                    if (z14) {
/* 228 */                               iMax3 = Math.max(iMax3, c2569zz2.mo1430j(4).m7247e() + c2569zz2.m10476s() + c2569zz2.f20417W);
                                    }
                                    i15 = iMax3;
                                    z15 = true;
                                } else {
                                    i15 = iMax3;
                                    z15 = zM3368F;
                                }
                                if (iM10472l5 != iM10472l4) {
/* 229 */                           c2569zz2.m10461M(iM10472l5);
                                    if (z6) {
/* 233 */                               iMax4 = Math.max(iMax4, c2569zz2.mo1430j(5).m7247e() + c2569zz2.m10477t() + c2569zz2.f20418X);
                                    }
                                    z15 = true;
                                }
                                int i311110 = i15;
/* 235 */                       z7 = z15 | ((y53) c2569zz2).f19492C0;
                                iMax3 = i311110;
                            }
                            i9++;
                            interfaceC2462xi2 = interfaceC2462xi5;
                            arrayList2 = arrayList14;
                            z5 = z14;
                        }
                        z8 = z5;
                        arrayList3 = arrayList2;
                        i10 = iMax4;
                        z9 = z7;
                        i11 = 0;
                        while (true) {
                            interfaceC2462xi3 = interfaceC2462xi2;
                            if (i11 < 2) {
                                break;
                                break;
                            }
                            int i311111 = i10;
                            iMax5 = iMax3;
                            z10 = z9;
                            iMax6 = i311111;
                            i12 = 0;
                            while (i12 < size2) {
/* 236 */                       c2569zz = (C2569zz) arrayList3.get(i12);
/* 237 */                       if (c2569zz instanceof cu0) {
                                    i14 = size2;
/* 238 */                           if (c2569zz.f20438i0 == 8) {
                                        interfaceC2462xi4 = interfaceC2462xi3;
                                        z12 = z6;
                                    } else {
/* 241 */                               iM10475r3 = c2569zz.m10475r();
/* 242 */                               iM10472l2 = c2569zz.m10472l();
                                        boolean z2113 = z10;
/* 243 */                               int i311112 = c2569zz.f20426c0;
                                        z12 = z6;
/* 244 */                               boolean zM3368F15 = z2113 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                        interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                               iM10475r4 = c2569zz.m10475r();
                                        z13 = zM3368F15;
/* 246 */                               iM10472l3 = c2569zz.m10472l();
                                        if (iM10475r4 != iM10475r3) {
/* 247 */                                   c2569zz.m10464P(iM10475r4);
                                            if (!z8) {
                                            }
                                            z13 = true;
                                        }
                                        if (iM10472l3 != iM10472l2) {
/* 252 */                                   c2569zz.m10461M(iM10472l3);
                                            if (!z12) {
                                            }
                                            z13 = true;
                                        }
/* 257 */                               if (c2569zz.f20399E) {
                                            z10 = z13;
                                        } else {
                                            z10 = z13;
                                        }
                                    }
                                } else {
                                    i14 = size2;
/* 238 */                           if (c2569zz.f20438i0 == 8) {
                                        interfaceC2462xi4 = interfaceC2462xi3;
                                        z12 = z6;
                                    } else {
/* 241 */                               iM10475r3 = c2569zz.m10475r();
/* 242 */                               iM10472l2 = c2569zz.m10472l();
                                        boolean z2114 = z10;
/* 243 */                               int i311113 = c2569zz.f20426c0;
                                        z12 = z6;
/* 244 */                               boolean zM3368F16 = z2114 | c0875ec.m3368F(i11 == 1 ? 2 : 1, interfaceC2462xi3, c2569zz);
                                        interfaceC2462xi4 = interfaceC2462xi3;
/* 245 */                               iM10475r4 = c2569zz.m10475r();
                                        z13 = zM3368F16;
/* 246 */                               iM10472l3 = c2569zz.m10472l();
                                        if (iM10475r4 != iM10475r3) {
/* 247 */                                   c2569zz.m10464P(iM10475r4);
                                            if (!z8) {
                                            }
                                            z13 = true;
                                        }
                                        if (iM10472l3 != iM10472l2) {
/* 252 */                                   c2569zz.m10461M(iM10472l3);
                                            if (!z12) {
                                            }
                                            z13 = true;
                                        }
/* 257 */                               if (c2569zz.f20399E) {
                                            z10 = z13;
                                        } else {
                                            z10 = z13;
                                        }
                                    }
                                }
                                i12++;
                                size2 = i14;
                                z6 = z12;
                                interfaceC2462xi3 = interfaceC2462xi4;
                            }
                            i13 = size2;
                            interfaceC2462xi2 = interfaceC2462xi3;
                            z11 = z6;
                            if (z10) {
                                break;
                                break;
                            }
                            i11++;
/* 259 */                   c0875ec.m3375N(a00Var, i11, iM10475r2, iM10472l);
                            iMax3 = iMax5;
                            i10 = iMax6;
                            size2 = i13;
                            z6 = z11;
                            z9 = false;
                        }
                    }
/* 260 */           a00Var.f8H0 = i31119;
/* 261 */           t71.f16931p = a00Var.m10X(NotificationCompat.FLAG_GROUP_SUMMARY);
                }

                /* JADX INFO: renamed from: i */
                public final void m519i(C2569zz c2569zz, LayoutParams layoutParams, SparseArray sparseArray, int i, int i2) {
/* 7 */             View view = (View) this.f1056a.get(i);
/* 13 */            C2569zz c2569zz2 = (C2569zz) sparseArray.get(i);
/* 15 */            if (c2569zz2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
/* 78 */                return;
                    }
/* 28 */            layoutParams.f1101c0 = true;
/* 31 */            if (i2 == 6) {
/* 37 */                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
/* 39 */                layoutParams2.f1101c0 = true;
/* 43 */                layoutParams2.f1129q0.f20399E = true;
                    }
/* 57 */            c2569zz.mo1430j(6).m7244b(c2569zz2.mo1430j(i2), layoutParams.f1073D, layoutParams.f1072C, true);
/* 60 */            c2569zz.f20399E = true;
/* 67 */            c2569zz.mo1430j(3).m7252j();
/* 75 */            c2569zz.mo1430j(5).m7252j();
                }

                @Override // android.view.ViewGroup, android.view.View
                public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    View content;
/* 1 */             ArrayList arrayList = this.f1058b;
/* 3 */             int childCount = getChildCount();
/* 7 */             boolean zIsInEditMode = isInEditMode();
/* 13 */            for (int i5 = 0; i5 < childCount; i5++) {
/* 15 */                View childAt = getChildAt(i5);
/* 23 */                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 25 */                C2569zz c2569zz = layoutParams.f1129q0;
/* 33 */                if ((childAt.getVisibility() != 8 || layoutParams.f1103d0 || layoutParams.f1105e0 || zIsInEditMode) && !layoutParams.f1107f0) {
/* 51 */                    int iM10476s = c2569zz.m10476s();
/* 55 */                    int iM10477t = c2569zz.m10477t();
/* 63 */                    int iM10475r = c2569zz.m10475r() + iM10476s;
/* 68 */                    int iM10472l = c2569zz.m10472l() + iM10477t;
/* 69 */                    childAt.layout(iM10476s, iM10477t, iM10475r, iM10472l);
/* 74 */                    if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
/* 84 */                        content.setVisibility(0);
/* 87 */                        content.layout(iM10476s, iM10477t, iM10475r, iM10472l);
                            }
                        }
                    }
/* 93 */            int size = arrayList.size();
/* 97 */            if (size > 0) {
/* 99 */                for (int i6 = 0; i6 < size; i6++) {
/* 107 */                   ((ConstraintHelper) arrayList.get(i6)).mo461n();
                        }
                    }
                }

                @Override // android.view.View
                public void onMeasure(int i, int i2) {
                    boolean z;
                    boolean z2;
                    ArrayList arrayList;
                    String str;
                    int iM508h;
                    C2569zz c2569zz;
/* 7 */             SparseArray sparseArray = this.f1059b0;
/* 9 */             a00 a00Var = this.f1060c;
/* 13 */            if (this.f1063d0 == i) {
/* 15 */                int i3 = this.f1065e0;
                    }
/* 21 */            if (!this.f1068v) {
/* 23 */                int childCount = getChildCount();
/* 28 */                for (int i4 = 0; i4 < childCount; i4++) {
/* 38 */                    if (getChildAt(i4).isLayoutRequested()) {
/* 40 */                        this.f1068v = true;
                                break;
                            }
                        }
                    }
/* 46 */            this.f1063d0 = i;
/* 48 */            this.f1065e0 = i2;
/* 54 */            a00Var.f22z0 = m516e();
/* 58 */            if (this.f1068v) {
/* 60 */                this.f1068v = false;
/* 62 */                int childCount2 = getChildCount();
/* 66 */                int i5 = 0;
                        while (true) {
/* 67 */                    if (i5 >= childCount2) {
/* 84 */                        z = false;
                                break;
                            } else {
/* 77 */                        if (getChildAt(i5).isLayoutRequested()) {
/* 79 */                            z = true;
                                    break;
                                }
/* 81 */                        i5++;
                            }
                        }
/* 85 */                if (z) {
/* 87 */                    ArrayList arrayList2 = this.f1058b;
/* 89 */                    boolean zIsInEditMode = isInEditMode();
/* 93 */                    int childCount3 = getChildCount();
/* 98 */                    for (int i6 = 0; i6 < childCount3; i6++) {
/* 104 */                       C2569zz c2569zzM514c = m514c(getChildAt(i6));
/* 108 */                       if (c2569zzM514c != null) {
/* 111 */                           c2569zzM514c.mo3D();
                                }
                            }
/* 118 */                   if (zIsInEditMode) {
/* 121 */                       for (int i7 = 0; i7 < childCount3; i7++) {
/* 123 */                           View childAt = getChildAt(i7);
                                    try {
/* 135 */                               String resourceName = getResources().getResourceName(childAt.getId());
/* 143 */                               Integer numValueOf = Integer.valueOf(childAt.getId());
/* 147 */                               if (resourceName != null) {
/* 151 */                                   if (this.f1057a0 == null) {
/* 158 */                                       this.f1057a0 = new HashMap();
                                            }
/* 162 */                                   int iIndexOf = resourceName.indexOf("/");
/* 178 */                                   this.f1057a0.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                        }
/* 183 */                               int iIndexOf2 = resourceName.indexOf(47);
/* 187 */                               if (iIndexOf2 != -1) {
/* 191 */                                   resourceName = resourceName.substring(iIndexOf2 + 1);
                                        }
/* 195 */                               int id = childAt.getId();
/* 199 */                               if (id != 0) {
/* 209 */                                   View viewFindViewById = (View) this.f1056a.get(id);
/* 211 */                                   if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
/* 227 */                                       onViewAdded(viewFindViewById);
                                            }
/* 243 */                                   c2569zz = viewFindViewById == this ? a00Var : viewFindViewById == null ? null : ((LayoutParams) viewFindViewById.getLayoutParams()).f1129q0;
                                        }
/* 245 */                               c2569zz.f20442k0 = resourceName;
                                    } catch (Resources.NotFoundException unused) {
                                    }
                                }
                            }
/* 255 */                   if (this.f1055W != -1) {
/* 258 */                       for (int i8 = 0; i8 < childCount3; i8++) {
/* 260 */                           View childAt2 = getChildAt(i8);
/* 270 */                           if (childAt2.getId() == this.f1055W && (childAt2 instanceof Constraints)) {
/* 282 */                               this.f1053U = ((Constraints) childAt2).getConstraintSet();
                                    }
                                }
                            }
/* 287 */                   C0077d c0077d = this.f1053U;
/* 289 */                   if (c0077d != null) {
/* 291 */                       c0077d.m538c(this);
                            }
/* 296 */                   a00Var.f17u0.clear();
/* 299 */                   int size = arrayList2.size();
/* 303 */                   if (size > 0) {
/* 305 */                       int i9 = 0;
/* 306 */                       while (i9 < size) {
/* 312 */                           ConstraintHelper constraintHelper = (ConstraintHelper) arrayList2.get(i9);
/* 314 */                           HashMap map = constraintHelper.f1051v;
/* 320 */                           if (constraintHelper.isInEditMode()) {
/* 324 */                               constraintHelper.setIds(constraintHelper.f1048e);
                                    }
/* 327 */                           cu0 cu0Var = constraintHelper.f1047d;
/* 329 */                           if (cu0Var == null) {
/* 331 */                               arrayList = arrayList2;
                                    } else {
/* 335 */                               cu0Var.f6907v0 = 0;
/* 340 */                               Arrays.fill(cu0Var.f6906u0, (Object) null);
/* 343 */                               int i10 = 0;
/* 346 */                               while (i10 < constraintHelper.f1045b) {
/* 350 */                                   int i11 = constraintHelper.f1044a[i10];
/* 352 */                                   View viewM513b = m513b(i11);
/* 356 */                                   if (viewM513b == null && (iM508h = constraintHelper.m508h(this, (str = (String) map.get(Integer.valueOf(i11))))) != 0) {
/* 378 */                                       constraintHelper.f1044a[i10] = iM508h;
/* 384 */                                       map.put(Integer.valueOf(iM508h), str);
/* 387 */                                       viewM513b = m513b(iM508h);
                                            }
/* 391 */                                   View view = viewM513b;
/* 397 */                                   if (view != null) {
/* 405 */                                       constraintHelper.f1047d.m2888S(m514c(view));
                                            }
/* 408 */                                   i10++;
/* 410 */                                   arrayList2 = arrayList2;
                                        }
/* 414 */                               arrayList = arrayList2;
/* 418 */                               constraintHelper.f1047d.mo2890U();
                                    }
/* 421 */                           i9++;
/* 423 */                           arrayList2 = arrayList;
                                }
                            }
/* 428 */                   for (int i12 = 0; i12 < childCount3; i12++) {
/* 430 */                       View childAt3 = getChildAt(i12);
/* 436 */                       if (childAt3 instanceof Placeholder) {
/* 438 */                           Placeholder placeholder = (Placeholder) childAt3;
/* 443 */                           if (placeholder.f1154a == -1 && !placeholder.isInEditMode()) {
/* 453 */                               placeholder.setVisibility(placeholder.f1156c);
                                    }
/* 458 */                           View viewFindViewById2 = findViewById(placeholder.f1154a);
/* 462 */                           placeholder.f1155b = viewFindViewById2;
/* 464 */                           if (viewFindViewById2 != null) {
/* 473 */                               ((LayoutParams) viewFindViewById2.getLayoutParams()).f1107f0 = true;
/* 478 */                               placeholder.f1155b.setVisibility(0);
/* 481 */                               placeholder.setVisibility(0);
                                    }
                                }
                            }
/* 491 */                   int i13 = 0;
/* 492 */                   sparseArray.clear();
/* 495 */                   sparseArray.put(0, a00Var);
/* 502 */                   sparseArray.put(getId(), a00Var);
/* 506 */                   for (int i14 = 0; i14 < childCount3; i14++) {
/* 508 */                       View childAt4 = getChildAt(i14);
/* 520 */                       sparseArray.put(childAt4.getId(), m514c(childAt4));
                            }
/* 526 */                   while (i13 < childCount3) {
/* 528 */                       View childAt5 = getChildAt(i13);
/* 532 */                       C2569zz c2569zzM514c2 = m514c(childAt5);
/* 536 */                       if (c2569zzM514c2 == null) {
/* 538 */                           z2 = zIsInEditMode;
                                } else {
/* 544 */                           LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
/* 548 */                           a00Var.f17u0.add(c2569zzM514c2);
/* 551 */                           C2569zz c2569zz2 = c2569zzM514c2.f20416V;
/* 553 */                           if (c2569zz2 != null) {
/* 559 */                               ((a00) c2569zz2).f17u0.remove(c2569zzM514c2);
/* 562 */                               c2569zzM514c2.mo3D();
                                    }
/* 565 */                           c2569zzM514c2.f20416V = a00Var;
/* 570 */                           z2 = zIsInEditMode;
/* 572 */                           m512a(z2, childAt5, c2569zzM514c2, layoutParams, sparseArray);
                                }
/* 575 */                       i13++;
/* 577 */                       zIsInEditMode = z2;
                            }
                        }
/* 579 */               if (z) {
/* 583 */                   a00Var.f18v0.m3377P(a00Var);
                        }
                    }
/* 588 */           m518h(a00Var, this.f1069w, i, i2);
/* 607 */           m517g(i, i2, a00Var.m10475r(), a00Var.m10472l(), a00Var.f9I0, a00Var.f10J0);
                }

                @Override // android.view.ViewGroup
                public void onViewAdded(View view) {
/* 1 */             ArrayList arrayList = this.f1058b;
/* 3 */             super.onViewAdded(view);
/* 6 */             C2569zz c2569zzM514c = m514c(view);
/* 13 */            if ((view instanceof Guideline) && !(c2569zzM514c instanceof bs0)) {
/* 23 */                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 27 */                bs0 bs0Var = new bs0();
/* 30 */                layoutParams.f1129q0 = bs0Var;
/* 32 */                layoutParams.f1103d0 = true;
/* 36 */                bs0Var.m1426T(layoutParams.f1091V);
                    }
/* 41 */            if (view instanceof ConstraintHelper) {
/* 44 */                ConstraintHelper constraintHelper = (ConstraintHelper) view;
/* 46 */                constraintHelper.m511q();
/* 55 */                ((LayoutParams) view.getLayoutParams()).f1105e0 = true;
/* 61 */                if (!arrayList.contains(constraintHelper)) {
/* 63 */                    arrayList.add(constraintHelper);
                        }
                    }
/* 72 */            this.f1056a.put(view.getId(), view);
/* 75 */            this.f1068v = true;
                }

                @Override // android.view.ViewGroup
                public void onViewRemoved(View view) {
/* 1 */             super.onViewRemoved(view);
/* 10 */            this.f1056a.remove(view.getId());
/* 13 */            C2569zz c2569zzM514c = m514c(view);
/* 21 */            this.f1060c.f17u0.remove(c2569zzM514c);
/* 24 */            c2569zzM514c.mo3D();
/* 29 */            this.f1058b.remove(view);
/* 33 */            this.f1068v = true;
                }

                @Override // android.view.View, android.view.ViewParent
                public void requestLayout() {
/* 2 */             this.f1068v = true;
/* 4 */             super.requestLayout();
                }

                public void setConstraintSet(C0077d c0077d) {
/* 1 */             this.f1053U = c0077d;
                }

                @Override // android.view.View
                public void setId(int i) {
/* 1 */             SparseArray sparseArray = this.f1056a;
/* 7 */             sparseArray.remove(getId());
/* 10 */            super.setId(i);
/* 17 */            sparseArray.put(getId(), this);
                }

                public void setMaxHeight(int i) {
/* 3 */             if (i == this.f1067i) {
/* 5 */                 return;
                    }
/* 6 */             this.f1067i = i;
/* 8 */             requestLayout();
                }

                public void setMaxWidth(int i) {
/* 3 */             if (i == this.f1066f) {
/* 5 */                 return;
                    }
/* 6 */             this.f1066f = i;
/* 8 */             requestLayout();
                }

                public void setMinHeight(int i) {
/* 3 */             if (i == this.f1064e) {
/* 5 */                 return;
                    }
/* 6 */             this.f1064e = i;
/* 8 */             requestLayout();
                }

                public void setMinWidth(int i) {
/* 3 */             if (i == this.f1062d) {
/* 5 */                 return;
                    }
/* 6 */             this.f1062d = i;
/* 8 */             requestLayout();
                }

                public void setOnConstraintsChanged(b00 b00Var) {
/* 1 */             C2199sz c2199sz = this.f1054V;
/* 3 */             if (c2199sz != null) {
/* 5 */                 c2199sz.getClass();
                    }
                }

                public void setOptimizationLevel(int i) {
/* 1 */             this.f1069w = i;
/* 3 */             a00 a00Var = this.f1060c;
/* 5 */             a00Var.f8H0 = i;
/* 13 */            t71.f16931p = a00Var.m10X(NotificationCompat.FLAG_GROUP_SUMMARY);
                }

                @Override // android.view.ViewGroup
                public final boolean shouldDelayChildPressedState() {
/* 1 */             return false;
                }

                @Override // android.view.ViewGroup
/* 10 */        public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 11 */            return new LayoutParams(layoutParams);
                }

/* 81 */        public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
/* 82 */            super(context, attributeSet, i);
/* 83 */            this.f1056a = new SparseArray();
/* 84 */            this.f1058b = new ArrayList(4);
/* 85 */            this.f1060c = new a00();
/* 86 */            this.f1062d = 0;
/* 87 */            this.f1064e = 0;
/* 88 */            this.f1066f = AbstractC0208c9.API_PRIORITY_OTHER;
/* 89 */            this.f1067i = AbstractC0208c9.API_PRIORITY_OTHER;
/* 90 */            this.f1068v = true;
/* 91 */            this.f1069w = 257;
/* 92 */            this.f1053U = null;
/* 93 */            this.f1054V = null;
/* 94 */            this.f1055W = -1;
/* 95 */            this.f1057a0 = new HashMap();
/* 96 */            this.f1059b0 = new SparseArray();
/* 97 */            this.f1061c0 = new C0075b(this, this);
/* 98 */            this.f1063d0 = 0;
/* 99 */            this.f1065e0 = 0;
/* 100 */           m515d(attributeSet, i);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 925 */       public static class LayoutParams extends ViewGroup.MarginLayoutParams {

                    /* JADX INFO: renamed from: A */
                    public int f1070A;

                    /* JADX INFO: renamed from: B */
                    public int f1071B;

                    /* JADX INFO: renamed from: C */
                    public final int f1072C;

                    /* JADX INFO: renamed from: D */
                    public final int f1073D;

                    /* JADX INFO: renamed from: E */
                    public float f1074E;

                    /* JADX INFO: renamed from: F */
                    public float f1075F;

                    /* JADX INFO: renamed from: G */
                    public String f1076G;

                    /* JADX INFO: renamed from: H */
                    public float f1077H;

                    /* JADX INFO: renamed from: I */
                    public float f1078I;

                    /* JADX INFO: renamed from: J */
                    public int f1079J;

                    /* JADX INFO: renamed from: K */
                    public int f1080K;

                    /* JADX INFO: renamed from: L */
                    public int f1081L;

                    /* JADX INFO: renamed from: M */
                    public int f1082M;

                    /* JADX INFO: renamed from: N */
                    public int f1083N;

                    /* JADX INFO: renamed from: O */
                    public int f1084O;

                    /* JADX INFO: renamed from: P */
                    public int f1085P;

                    /* JADX INFO: renamed from: Q */
                    public int f1086Q;

                    /* JADX INFO: renamed from: R */
                    public float f1087R;

                    /* JADX INFO: renamed from: S */
                    public float f1088S;

                    /* JADX INFO: renamed from: T */
                    public int f1089T;

                    /* JADX INFO: renamed from: U */
                    public int f1090U;

                    /* JADX INFO: renamed from: V */
                    public int f1091V;

                    /* JADX INFO: renamed from: W */
                    public boolean f1092W;

                    /* JADX INFO: renamed from: X */
                    public boolean f1093X;

                    /* JADX INFO: renamed from: Y */
                    public String f1094Y;

                    /* JADX INFO: renamed from: Z */
                    public int f1095Z;

                    /* JADX INFO: renamed from: a */
                    public int f1096a;

                    /* JADX INFO: renamed from: a0 */
                    public boolean f1097a0;

                    /* JADX INFO: renamed from: b */
                    public int f1098b;

                    /* JADX INFO: renamed from: b0 */
                    public boolean f1099b0;

                    /* JADX INFO: renamed from: c */
                    public float f1100c;

                    /* JADX INFO: renamed from: c0 */
                    public boolean f1101c0;

                    /* JADX INFO: renamed from: d */
                    public final boolean f1102d;

                    /* JADX INFO: renamed from: d0 */
                    public boolean f1103d0;

                    /* JADX INFO: renamed from: e */
                    public int f1104e;

                    /* JADX INFO: renamed from: e0 */
                    public boolean f1105e0;

                    /* JADX INFO: renamed from: f */
                    public int f1106f;

                    /* JADX INFO: renamed from: f0 */
                    public boolean f1107f0;

                    /* JADX INFO: renamed from: g */
                    public int f1108g;

                    /* JADX INFO: renamed from: g0 */
                    public int f1109g0;

                    /* JADX INFO: renamed from: h */
                    public int f1110h;

                    /* JADX INFO: renamed from: h0 */
                    public int f1111h0;

                    /* JADX INFO: renamed from: i */
                    public int f1112i;

                    /* JADX INFO: renamed from: i0 */
                    public int f1113i0;

                    /* JADX INFO: renamed from: j */
                    public int f1114j;

                    /* JADX INFO: renamed from: j0 */
                    public int f1115j0;

                    /* JADX INFO: renamed from: k */
                    public int f1116k;

                    /* JADX INFO: renamed from: k0 */
                    public int f1117k0;

                    /* JADX INFO: renamed from: l */
                    public int f1118l;

                    /* JADX INFO: renamed from: l0 */
                    public int f1119l0;

                    /* JADX INFO: renamed from: m */
                    public int f1120m;

                    /* JADX INFO: renamed from: m0 */
                    public float f1121m0;

                    /* JADX INFO: renamed from: n */
                    public int f1122n;

                    /* JADX INFO: renamed from: n0 */
                    public int f1123n0;

                    /* JADX INFO: renamed from: o */
                    public int f1124o;

                    /* JADX INFO: renamed from: o0 */
                    public int f1125o0;

                    /* JADX INFO: renamed from: p */
                    public int f1126p;

                    /* JADX INFO: renamed from: p0 */
                    public float f1127p0;

                    /* JADX INFO: renamed from: q */
                    public int f1128q;

                    /* JADX INFO: renamed from: q0 */
                    public C2569zz f1129q0;

                    /* JADX INFO: renamed from: r */
                    public float f1130r;

                    /* JADX INFO: renamed from: s */
                    public int f1131s;

                    /* JADX INFO: renamed from: t */
                    public int f1132t;

                    /* JADX INFO: renamed from: u */
                    public int f1133u;

                    /* JADX INFO: renamed from: v */
                    public int f1134v;

                    /* JADX INFO: renamed from: w */
                    public final int f1135w;

                    /* JADX INFO: renamed from: x */
                    public int f1136x;

                    /* JADX INFO: renamed from: y */
                    public final int f1137y;

                    /* JADX INFO: renamed from: z */
                    public int f1138z;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 5 */                 this.f1096a = -1;
/* 7 */                 this.f1098b = -1;
/* 11 */                this.f1100c = -1.0f;
/* 14 */                this.f1102d = true;
/* 16 */                this.f1104e = -1;
/* 18 */                this.f1106f = -1;
/* 20 */                this.f1108g = -1;
/* 22 */                this.f1110h = -1;
/* 24 */                this.f1112i = -1;
/* 26 */                this.f1114j = -1;
/* 28 */                this.f1116k = -1;
/* 30 */                this.f1118l = -1;
/* 32 */                this.f1120m = -1;
/* 34 */                this.f1122n = -1;
/* 36 */                this.f1124o = -1;
/* 38 */                this.f1126p = -1;
/* 41 */                this.f1128q = 0;
/* 44 */                this.f1130r = 0.0f;
/* 46 */                this.f1131s = -1;
/* 48 */                this.f1132t = -1;
/* 50 */                this.f1133u = -1;
/* 52 */                this.f1134v = -1;
/* 56 */                this.f1135w = Integer.MIN_VALUE;
/* 58 */                this.f1136x = Integer.MIN_VALUE;
/* 60 */                this.f1137y = Integer.MIN_VALUE;
/* 62 */                this.f1138z = Integer.MIN_VALUE;
/* 64 */                this.f1070A = Integer.MIN_VALUE;
/* 66 */                this.f1071B = Integer.MIN_VALUE;
/* 68 */                this.f1072C = Integer.MIN_VALUE;
/* 70 */                this.f1073D = 0;
/* 74 */                this.f1074E = 0.5f;
/* 76 */                this.f1075F = 0.5f;
/* 79 */                this.f1076G = null;
/* 81 */                this.f1077H = -1.0f;
/* 83 */                this.f1078I = -1.0f;
/* 85 */                this.f1079J = 0;
/* 87 */                this.f1080K = 0;
/* 89 */                this.f1081L = 0;
/* 91 */                this.f1082M = 0;
/* 93 */                this.f1083N = 0;
/* 95 */                this.f1084O = 0;
/* 97 */                this.f1085P = 0;
/* 99 */                this.f1086Q = 0;
/* 103 */               this.f1087R = 1.0f;
/* 105 */               this.f1088S = 1.0f;
/* 107 */               this.f1089T = -1;
/* 109 */               this.f1090U = -1;
/* 111 */               this.f1091V = -1;
/* 113 */               this.f1092W = false;
/* 115 */               this.f1093X = false;
/* 117 */               this.f1094Y = null;
/* 119 */               this.f1095Z = 0;
/* 121 */               this.f1097a0 = true;
/* 123 */               this.f1099b0 = true;
/* 125 */               this.f1101c0 = false;
/* 127 */               this.f1103d0 = false;
/* 129 */               this.f1105e0 = false;
/* 131 */               this.f1107f0 = false;
/* 133 */               this.f1109g0 = -1;
/* 135 */               this.f1111h0 = -1;
/* 137 */               this.f1113i0 = -1;
/* 139 */               this.f1115j0 = -1;
/* 141 */               this.f1117k0 = Integer.MIN_VALUE;
/* 143 */               this.f1119l0 = Integer.MIN_VALUE;
/* 145 */               this.f1121m0 = 0.5f;
/* 152 */               this.f1129q0 = new C2569zz();
/* 156 */               TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
/* 160 */               int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 165 */               for (int i = 0; i < indexCount; i++) {
/* 167 */                   int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 173 */                   int i2 = AbstractC0074a.f1167a.get(index);
                            switch (i2) {
                                case 1:
/* 913 */                           this.f1091V = typedArrayObtainStyledAttributes.getInt(index, this.f1091V);
                                    break;
                                case 2:
/* 892 */                           int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1126p);
/* 896 */                           this.f1126p = resourceId;
/* 898 */                           if (resourceId == -1) {
/* 904 */                               this.f1126p = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case 3:
/* 887 */                           this.f1128q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1128q);
                                    break;
                                case 4:
/* 868 */                           float f = typedArrayObtainStyledAttributes.getFloat(index, this.f1130r) % 360.0f;
/* 869 */                           this.f1130r = f;
/* 873 */                           if (f < 0.0f) {
/* 878 */                               this.f1130r = (360.0f - f) % 360.0f;
                                    }
                                    break;
                                case 5:
/* 857 */                           this.f1096a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1096a);
                                    break;
                                case 6:
/* 848 */                           this.f1098b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1098b);
                                    break;
                                case 7:
/* 839 */                           this.f1100c = typedArrayObtainStyledAttributes.getFloat(index, this.f1100c);
                                    break;
                                case 8:
/* 818 */                           int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1104e);
/* 822 */                           this.f1104e = resourceId2;
/* 824 */                           if (resourceId2 == -1) {
/* 830 */                               this.f1104e = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case 9:
/* 801 */                           int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1106f);
/* 805 */                           this.f1106f = resourceId3;
/* 807 */                           if (resourceId3 == -1) {
/* 813 */                               this.f1106f = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case 10:
/* 783 */                           int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1108g);
/* 787 */                           this.f1108g = resourceId4;
/* 789 */                           if (resourceId4 == -1) {
/* 795 */                               this.f1108g = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case 11:
/* 765 */                           int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1110h);
/* 769 */                           this.f1110h = resourceId5;
/* 771 */                           if (resourceId5 == -1) {
/* 777 */                               this.f1110h = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case 12:
/* 747 */                           int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1112i);
/* 751 */                           this.f1112i = resourceId6;
/* 753 */                           if (resourceId6 == -1) {
/* 759 */                               this.f1112i = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 729 */                           int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1114j);
/* 733 */                           this.f1114j = resourceId7;
/* 735 */                           if (resourceId7 == -1) {
/* 741 */                               this.f1114j = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case 14:
/* 711 */                           int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1116k);
/* 715 */                           this.f1116k = resourceId8;
/* 717 */                           if (resourceId8 == -1) {
/* 723 */                               this.f1116k = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 693 */                           int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1118l);
/* 697 */                           this.f1118l = resourceId9;
/* 699 */                           if (resourceId9 == -1) {
/* 705 */                               this.f1118l = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case 16:
/* 675 */                           int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1120m);
/* 679 */                           this.f1120m = resourceId10;
/* 681 */                           if (resourceId10 == -1) {
/* 687 */                               this.f1120m = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case 17:
/* 657 */                           int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1131s);
/* 661 */                           this.f1131s = resourceId11;
/* 663 */                           if (resourceId11 == -1) {
/* 669 */                               this.f1131s = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case 18:
/* 639 */                           int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1132t);
/* 643 */                           this.f1132t = resourceId12;
/* 645 */                           if (resourceId12 == -1) {
/* 651 */                               this.f1132t = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case 19:
/* 621 */                           int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1133u);
/* 625 */                           this.f1133u = resourceId13;
/* 627 */                           if (resourceId13 == -1) {
/* 633 */                               this.f1133u = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case 20:
/* 603 */                           int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1134v);
/* 607 */                           this.f1134v = resourceId14;
/* 609 */                           if (resourceId14 == -1) {
/* 615 */                               this.f1134v = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    }
                                    break;
                                case Build.API_LEVELS.API_21 /* 21 */:
/* 597 */                           this.f1135w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1135w);
                                    break;
                                case Build.API_LEVELS.API_22 /* 22 */:
/* 587 */                           this.f1136x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1136x);
                                    break;
                                case Build.API_LEVELS.API_23 /* 23 */:
/* 577 */                           this.f1137y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1137y);
                                    break;
                                case 24:
/* 567 */                           this.f1138z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1138z);
                                    break;
                                case Build.API_LEVELS.API_25 /* 25 */:
/* 557 */                           this.f1070A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1070A);
                                    break;
                                case Build.API_LEVELS.API_26 /* 26 */:
/* 547 */                           this.f1071B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1071B);
                                    break;
                                case Build.API_LEVELS.API_27 /* 27 */:
/* 537 */                           this.f1092W = typedArrayObtainStyledAttributes.getBoolean(index, this.f1092W);
                                    break;
                                case Build.API_LEVELS.API_28 /* 28 */:
/* 527 */                           this.f1093X = typedArrayObtainStyledAttributes.getBoolean(index, this.f1093X);
                                    break;
                                case Build.API_LEVELS.API_29 /* 29 */:
/* 517 */                           this.f1074E = typedArrayObtainStyledAttributes.getFloat(index, this.f1074E);
                                    break;
                                case Build.API_LEVELS.API_30 /* 30 */:
/* 507 */                           this.f1075F = typedArrayObtainStyledAttributes.getFloat(index, this.f1075F);
                                    break;
                                case Build.API_LEVELS.API_31 /* 31 */:
/* 486 */                           int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
/* 490 */                           this.f1081L = i3;
/* 492 */                           if (i3 == 1) {
/* 496 */                               AbstractC1245n0.m4876d("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                                    }
                                    break;
                                case 32:
/* 471 */                           int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
/* 475 */                           this.f1082M = i4;
/* 477 */                           if (i4 == 1) {
/* 481 */                               AbstractC1245n0.m4876d("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                                    }
                                    break;
                                case Build.API_LEVELS.API_33 /* 33 */:
                                    try {
/* 455 */                               this.f1083N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1083N);
                                    } catch (Exception unused) {
/* 465 */                               if (typedArrayObtainStyledAttributes.getInt(index, this.f1083N) == -2) {
/* 467 */                                   this.f1083N = -2;
                                        }
                                    }
                                    break;
                                case Build.API_LEVELS.API_34 /* 34 */:
                                    try {
/* 433 */                               this.f1085P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1085P);
                                    } catch (Exception unused2) {
/* 443 */                               if (typedArrayObtainStyledAttributes.getInt(index, this.f1085P) == -2) {
/* 445 */                                   this.f1085P = -2;
                                        }
                                    }
                                    break;
                                case Build.API_LEVELS.API_35 /* 35 */:
/* 421 */                           this.f1087R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f1087R));
/* 423 */                           this.f1081L = 2;
                                    break;
                                case Build.API_LEVELS.API_36 /* 36 */:
                                    try {
/* 395 */                               this.f1084O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1084O);
                                    } catch (Exception unused3) {
/* 405 */                               if (typedArrayObtainStyledAttributes.getInt(index, this.f1084O) == -2) {
/* 407 */                                   this.f1084O = -2;
                                        }
                                    }
                                    break;
                                case 37:
                                    try {
/* 373 */                               this.f1086Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1086Q);
                                    } catch (Exception unused4) {
/* 383 */                               if (typedArrayObtainStyledAttributes.getInt(index, this.f1086Q) == -2) {
/* 385 */                                   this.f1086Q = -2;
                                        }
                                    }
                                    break;
                                case 38:
/* 361 */                           this.f1088S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f1088S));
/* 363 */                           this.f1082M = 2;
                                    break;
                                default:
                                    switch (i2) {
                                        case 44:
/* 346 */                                   C0077d.m534n(this, typedArrayObtainStyledAttributes.getString(index));
                                            break;
                                        case 45:
/* 338 */                                   this.f1077H = typedArrayObtainStyledAttributes.getFloat(index, this.f1077H);
                                            break;
                                        case 46:
/* 328 */                                   this.f1078I = typedArrayObtainStyledAttributes.getFloat(index, this.f1078I);
                                            break;
                                        case 47:
/* 318 */                                   this.f1079J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                            break;
                                        case 48:
/* 310 */                                   this.f1080K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                            break;
                                        case 49:
/* 302 */                                   this.f1089T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1089T);
                                            break;
                                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 292 */                                   this.f1090U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1090U);
                                            break;
                                        case 51:
/* 282 */                                   this.f1094Y = typedArrayObtainStyledAttributes.getString(index);
                                            break;
                                        case 52:
/* 262 */                                   int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1122n);
/* 266 */                                   this.f1122n = resourceId15;
/* 268 */                                   if (resourceId15 == -1) {
/* 274 */                                       this.f1122n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                            }
                                            break;
                                        case 53:
/* 244 */                                   int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1124o);
/* 248 */                                   this.f1124o = resourceId16;
/* 250 */                                   if (resourceId16 == -1) {
/* 256 */                                       this.f1124o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                            }
                                            break;
                                        case 54:
/* 238 */                                   this.f1073D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1073D);
                                            break;
                                        case 55:
/* 228 */                                   this.f1072C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1072C);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 64:
/* 217 */                                           C0077d.m533m(this, typedArrayObtainStyledAttributes, index, 0);
                                                    break;
                                                case 65:
/* 212 */                                           C0077d.m533m(this, typedArrayObtainStyledAttributes, index, 1);
                                                    break;
                                                case 66:
/* 208 */                                           this.f1095Z = typedArrayObtainStyledAttributes.getInt(index, this.f1095Z);
                                                    break;
                                                case 67:
/* 198 */                                           this.f1102d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1102d);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
/* 919 */               typedArrayObtainStyledAttributes.recycle();
/* 922 */               m520a();
                    }

                    /* JADX INFO: renamed from: a */
                    public final void m520a() {
/* 2 */                 this.f1103d0 = false;
/* 5 */                 this.f1097a0 = true;
/* 7 */                 this.f1099b0 = true;
/* 9 */                 int i = ((ViewGroup.MarginLayoutParams) this).width;
/* 12 */                if (i == -2 && this.f1092W) {
/* 18 */                    this.f1097a0 = false;
/* 22 */                    if (this.f1081L == 0) {
/* 24 */                        this.f1081L = 1;
                            }
                        }
/* 26 */                int i2 = ((ViewGroup.MarginLayoutParams) this).height;
/* 28 */                if (i2 == -2 && this.f1093X) {
/* 34 */                    this.f1099b0 = false;
/* 38 */                    if (this.f1082M == 0) {
/* 40 */                        this.f1082M = 1;
                            }
                        }
/* 43 */                if (i == 0 || i == -1) {
/* 47 */                    this.f1097a0 = false;
/* 49 */                    if (i == 0 && this.f1081L == 1) {
/* 55 */                        ((ViewGroup.MarginLayoutParams) this).width = -2;
/* 57 */                        this.f1092W = true;
                            }
                        }
/* 59 */                if (i2 == 0 || i2 == -1) {
/* 63 */                    this.f1099b0 = false;
/* 65 */                    if (i2 == 0 && this.f1082M == 1) {
/* 71 */                        ((ViewGroup.MarginLayoutParams) this).height = -2;
/* 73 */                        this.f1093X = true;
                            }
                        }
/* 81 */                if (this.f1100c == -1.0f && this.f1096a == -1 && this.f1098b == -1) {
/* 92 */                    return;
                        }
/* 93 */                this.f1103d0 = true;
/* 95 */                this.f1097a0 = true;
/* 97 */                this.f1099b0 = true;
/* 103 */               if (!(this.f1129q0 instanceof bs0)) {
/* 110 */                   this.f1129q0 = new bs0();
                        }
/* 118 */               ((bs0) this.f1129q0).m1426T(this.f1091V);
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
                    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
                    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
                    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
                    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
                    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
                    /* JADX WARN: Code duplicated, block: B:40:0x008b A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
                    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
                    public final void resolveLayoutDirection(int i) {
                        int i2;
                        int i3;
                        int i4;
                        int i5;
/* 1 */                 int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
/* 3 */                 int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
/* 5 */                 super.resolveLayoutDirection(i);
/* 12 */                boolean z = false;
/* 18 */                boolean z2 = 1 == getLayoutDirection();
/* 20 */                this.f1113i0 = -1;
/* 22 */                this.f1115j0 = -1;
/* 24 */                this.f1109g0 = -1;
/* 26 */                this.f1111h0 = -1;
/* 30 */                this.f1117k0 = this.f1135w;
/* 34 */                this.f1119l0 = this.f1137y;
/* 36 */                float f = this.f1074E;
/* 38 */                this.f1121m0 = f;
/* 40 */                int i8 = this.f1096a;
/* 42 */                this.f1123n0 = i8;
/* 44 */                int i9 = this.f1098b;
/* 46 */                this.f1125o0 = i9;
/* 48 */                float f2 = this.f1100c;
/* 50 */                this.f1127p0 = f2;
/* 52 */                int i10 = this.f1131s;
/* 56 */                if (z2) {
/* 58 */                    if (i10 != -1) {
/* 60 */                        this.f1113i0 = i10;
                            } else {
/* 64 */                        int i11 = this.f1132t;
/* 66 */                        if (i11 != -1) {
/* 68 */                            this.f1115j0 = i11;
                                } else {
/* 71 */                            i2 = this.f1133u;
/* 73 */                            if (i2 != -1) {
/* 75 */                                this.f1111h0 = i2;
/* 77 */                                z = true;
                                    }
/* 78 */                            i3 = this.f1134v;
/* 80 */                            if (i3 != -1) {
/* 82 */                                this.f1109g0 = i3;
/* 84 */                                z = true;
                                    }
/* 85 */                            i4 = this.f1070A;
/* 87 */                            if (i4 != Integer.MIN_VALUE) {
/* 89 */                                this.f1119l0 = i4;
                                    }
/* 91 */                            i5 = this.f1071B;
/* 93 */                            if (i5 != Integer.MIN_VALUE) {
/* 95 */                                this.f1117k0 = i5;
                                    }
/* 99 */                            if (z) {
/* 103 */                               this.f1121m0 = 1.0f - f;
                                    }
/* 107 */                           if (this.f1103d0 && this.f1091V == 1 && this.f1102d) {
/* 121 */                               if (f2 != -1.0f) {
/* 124 */                                   this.f1127p0 = 1.0f - f2;
/* 126 */                                   this.f1123n0 = -1;
/* 128 */                                   this.f1125o0 = -1;
                                        } else if (i8 != -1) {
/* 133 */                                   this.f1125o0 = i8;
/* 135 */                                   this.f1123n0 = -1;
/* 137 */                                   this.f1127p0 = -1.0f;
                                        } else if (i9 != -1) {
/* 142 */                                   this.f1123n0 = i9;
/* 144 */                                   this.f1125o0 = -1;
/* 146 */                                   this.f1127p0 = -1.0f;
                                        }
                                    }
                                }
                            }
/* 62 */                    z = true;
/* 71 */                    i2 = this.f1133u;
/* 73 */                    if (i2 != -1) {
/* 75 */                        this.f1111h0 = i2;
/* 77 */                        z = true;
                            }
/* 78 */                    i3 = this.f1134v;
/* 80 */                    if (i3 != -1) {
/* 82 */                        this.f1109g0 = i3;
/* 84 */                        z = true;
                            }
/* 85 */                    i4 = this.f1070A;
/* 87 */                    if (i4 != Integer.MIN_VALUE) {
/* 89 */                        this.f1119l0 = i4;
                            }
/* 91 */                    i5 = this.f1071B;
/* 93 */                    if (i5 != Integer.MIN_VALUE) {
/* 95 */                        this.f1117k0 = i5;
                            }
/* 99 */                    if (z) {
/* 103 */                       this.f1121m0 = 1.0f - f;
                            }
/* 107 */                   if (this.f1103d0) {
/* 121 */                       if (f2 != -1.0f) {
/* 124 */                           this.f1127p0 = 1.0f - f2;
/* 126 */                           this.f1123n0 = -1;
/* 128 */                           this.f1125o0 = -1;
                                } else if (i8 != -1) {
/* 133 */                           this.f1125o0 = i8;
/* 135 */                           this.f1123n0 = -1;
/* 137 */                           this.f1127p0 = -1.0f;
                                } else if (i9 != -1) {
/* 142 */                           this.f1123n0 = i9;
/* 144 */                           this.f1125o0 = -1;
/* 146 */                           this.f1127p0 = -1.0f;
                                }
                            }
                        } else {
/* 149 */                   if (i10 != -1) {
/* 151 */                       this.f1111h0 = i10;
                            }
/* 153 */                   int i12 = this.f1132t;
/* 155 */                   if (i12 != -1) {
/* 157 */                       this.f1109g0 = i12;
                            }
/* 159 */                   int i13 = this.f1133u;
/* 161 */                   if (i13 != -1) {
/* 163 */                       this.f1113i0 = i13;
                            }
/* 165 */                   int i14 = this.f1134v;
/* 167 */                   if (i14 != -1) {
/* 169 */                       this.f1115j0 = i14;
                            }
/* 171 */                   int i15 = this.f1070A;
/* 173 */                   if (i15 != Integer.MIN_VALUE) {
/* 175 */                       this.f1117k0 = i15;
                            }
/* 177 */                   int i16 = this.f1071B;
/* 179 */                   if (i16 != Integer.MIN_VALUE) {
/* 181 */                       this.f1119l0 = i16;
                            }
                        }
/* 185 */               if (this.f1133u == -1 && this.f1134v == -1 && this.f1132t == -1 && i10 == -1) {
/* 197 */                   int i17 = this.f1108g;
/* 199 */                   if (i17 != -1) {
/* 201 */                       this.f1113i0 = i17;
/* 205 */                       if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
/* 209 */                           ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                                }
                            } else {
/* 212 */                       int i18 = this.f1110h;
/* 214 */                       if (i18 != -1) {
/* 216 */                           this.f1115j0 = i18;
/* 220 */                           if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
/* 224 */                               ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                                    }
                                }
                            }
/* 226 */                   int i19 = this.f1104e;
/* 228 */                   if (i19 != -1) {
/* 230 */                       this.f1109g0 = i19;
/* 234 */                       if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
/* 255 */                           return;
                                }
/* 238 */                       ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
/* 240 */                       return;
                            }
/* 241 */                   int i20 = this.f1106f;
/* 243 */                   if (i20 != -1) {
/* 245 */                       this.f1111h0 = i20;
/* 249 */                       if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
/* 255 */                           return;
                                }
/* 253 */                       ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                            }
                        }
                    }

/* 926 */           public LayoutParams() {
/* 927 */               super(-2, -2);
/* 928 */               this.f1096a = -1;
/* 929 */               this.f1098b = -1;
/* 930 */               this.f1100c = -1.0f;
/* 931 */               this.f1102d = true;
/* 932 */               this.f1104e = -1;
/* 933 */               this.f1106f = -1;
/* 934 */               this.f1108g = -1;
/* 935 */               this.f1110h = -1;
/* 936 */               this.f1112i = -1;
/* 937 */               this.f1114j = -1;
/* 938 */               this.f1116k = -1;
/* 939 */               this.f1118l = -1;
/* 940 */               this.f1120m = -1;
/* 941 */               this.f1122n = -1;
/* 942 */               this.f1124o = -1;
/* 943 */               this.f1126p = -1;
/* 944 */               this.f1128q = 0;
/* 945 */               this.f1130r = 0.0f;
/* 946 */               this.f1131s = -1;
/* 947 */               this.f1132t = -1;
/* 948 */               this.f1133u = -1;
/* 949 */               this.f1134v = -1;
/* 950 */               this.f1135w = Integer.MIN_VALUE;
/* 951 */               this.f1136x = Integer.MIN_VALUE;
/* 952 */               this.f1137y = Integer.MIN_VALUE;
/* 953 */               this.f1138z = Integer.MIN_VALUE;
/* 954 */               this.f1070A = Integer.MIN_VALUE;
/* 955 */               this.f1071B = Integer.MIN_VALUE;
/* 956 */               this.f1072C = Integer.MIN_VALUE;
/* 957 */               this.f1073D = 0;
/* 958 */               this.f1074E = 0.5f;
/* 959 */               this.f1075F = 0.5f;
/* 960 */               this.f1076G = null;
/* 961 */               this.f1077H = -1.0f;
/* 962 */               this.f1078I = -1.0f;
/* 963 */               this.f1079J = 0;
/* 964 */               this.f1080K = 0;
/* 965 */               this.f1081L = 0;
/* 966 */               this.f1082M = 0;
/* 967 */               this.f1083N = 0;
/* 968 */               this.f1084O = 0;
/* 969 */               this.f1085P = 0;
/* 970 */               this.f1086Q = 0;
/* 971 */               this.f1087R = 1.0f;
/* 972 */               this.f1088S = 1.0f;
/* 973 */               this.f1089T = -1;
/* 974 */               this.f1090U = -1;
/* 975 */               this.f1091V = -1;
/* 976 */               this.f1092W = false;
/* 977 */               this.f1093X = false;
/* 978 */               this.f1094Y = null;
/* 979 */               this.f1095Z = 0;
/* 980 */               this.f1097a0 = true;
/* 981 */               this.f1099b0 = true;
/* 982 */               this.f1101c0 = false;
/* 983 */               this.f1103d0 = false;
/* 984 */               this.f1105e0 = false;
/* 985 */               this.f1107f0 = false;
/* 986 */               this.f1109g0 = -1;
/* 987 */               this.f1111h0 = -1;
/* 988 */               this.f1113i0 = -1;
/* 989 */               this.f1115j0 = -1;
/* 990 */               this.f1117k0 = Integer.MIN_VALUE;
/* 991 */               this.f1119l0 = Integer.MIN_VALUE;
/* 992 */               this.f1121m0 = 0.5f;
/* 993 */               this.f1129q0 = new C2569zz();
                    }

/* 993 */           public LayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 994 */               super(layoutParams);
/* 995 */               this.f1096a = -1;
/* 996 */               this.f1098b = -1;
/* 997 */               this.f1100c = -1.0f;
/* 998 */               this.f1102d = true;
/* 999 */               this.f1104e = -1;
/* 1000 */              this.f1106f = -1;
/* 1001 */              this.f1108g = -1;
/* 1002 */              this.f1110h = -1;
/* 1003 */              this.f1112i = -1;
/* 1004 */              this.f1114j = -1;
/* 1005 */              this.f1116k = -1;
/* 1006 */              this.f1118l = -1;
/* 1007 */              this.f1120m = -1;
/* 1008 */              this.f1122n = -1;
/* 1009 */              this.f1124o = -1;
/* 1010 */              this.f1126p = -1;
/* 1011 */              this.f1128q = 0;
/* 1012 */              this.f1130r = 0.0f;
/* 1013 */              this.f1131s = -1;
/* 1014 */              this.f1132t = -1;
/* 1015 */              this.f1133u = -1;
/* 1016 */              this.f1134v = -1;
/* 1017 */              this.f1135w = Integer.MIN_VALUE;
/* 1018 */              this.f1136x = Integer.MIN_VALUE;
/* 1019 */              this.f1137y = Integer.MIN_VALUE;
/* 1020 */              this.f1138z = Integer.MIN_VALUE;
/* 1021 */              this.f1070A = Integer.MIN_VALUE;
/* 1022 */              this.f1071B = Integer.MIN_VALUE;
/* 1023 */              this.f1072C = Integer.MIN_VALUE;
/* 1024 */              this.f1073D = 0;
/* 1025 */              this.f1074E = 0.5f;
/* 1026 */              this.f1075F = 0.5f;
/* 1027 */              this.f1076G = null;
/* 1028 */              this.f1077H = -1.0f;
/* 1029 */              this.f1078I = -1.0f;
/* 1030 */              this.f1079J = 0;
/* 1031 */              this.f1080K = 0;
/* 1032 */              this.f1081L = 0;
/* 1033 */              this.f1082M = 0;
/* 1034 */              this.f1083N = 0;
/* 1035 */              this.f1084O = 0;
/* 1036 */              this.f1085P = 0;
/* 1037 */              this.f1086Q = 0;
/* 1038 */              this.f1087R = 1.0f;
/* 1039 */              this.f1088S = 1.0f;
/* 1040 */              this.f1089T = -1;
/* 1041 */              this.f1090U = -1;
/* 1042 */              this.f1091V = -1;
/* 1043 */              this.f1092W = false;
/* 1044 */              this.f1093X = false;
/* 1045 */              this.f1094Y = null;
/* 1046 */              this.f1095Z = 0;
/* 1047 */              this.f1097a0 = true;
/* 1048 */              this.f1099b0 = true;
/* 1049 */              this.f1101c0 = false;
/* 1050 */              this.f1103d0 = false;
/* 1051 */              this.f1105e0 = false;
/* 1052 */              this.f1107f0 = false;
/* 1053 */              this.f1109g0 = -1;
/* 1054 */              this.f1111h0 = -1;
/* 1055 */              this.f1113i0 = -1;
/* 1056 */              this.f1115j0 = -1;
/* 1057 */              this.f1117k0 = Integer.MIN_VALUE;
/* 1058 */              this.f1119l0 = Integer.MIN_VALUE;
/* 1059 */              this.f1121m0 = 0.5f;
/* 1060 */              this.f1129q0 = new C2569zz();
                    }
                }
            }
