            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorSet;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.pm.ServiceInfo;
            import android.graphics.SurfaceTexture;
            import android.os.Bundle;
            import android.os.RemoteException;
            import android.text.Spannable;
            import android.text.SpannableString;
            import android.util.SparseIntArray;
            import android.view.Surface;
            import android.view.View;
            import android.widget.EditText;
            import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.Fragment;
            import androidx.fragment.app.FragmentActivity;
            import com.android.installreferrer.api.InstallReferrerClient;
            import com.android.installreferrer.api.InstallReferrerStateListener;
            import com.android.installreferrer.api.ReferrerDetails;
            import com.google.android.datatransport.cct.CctBackendFactory;
            import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            import io.flutter.Build;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Date;
            import java.util.EnumMap;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.ExecutorService;
            import javax.inject.Provider;
            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 62 */    public class wc0 implements dd0, fk0, InstallReferrerStateListener, sg0, xo0, w02 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18576a;

                /* JADX INFO: renamed from: b */
                public Object f18577b;

                /* JADX INFO: renamed from: c */
                public Object f18578c;

                public wc0(EditText editText) {
/* 2 */             this.f18576a = 0;
/* 7 */             this.f18577b = editText;
/* 11 */            id0 id0Var = new id0(editText);
/* 14 */            this.f18578c = id0Var;
/* 16 */            editText.addTextChangedListener(id0Var);
/* 21 */            if (xc0.f19026b == null) {
                        synchronized (xc0.f19025a) {
                            try {
/* 28 */                        if (xc0.f19026b == null) {
/* 32 */                            xc0 xc0Var = new xc0();
                                    try {
/* 47 */                                xc0.f19027c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, xc0.class.getClassLoader());
                                    } catch (Throwable unused) {
                                    }
/* 49 */                            xc0.f19026b = xc0Var;
                                }
                            } catch (Throwable th) {
/* 57 */                        throw th;
                            }
                        }
                    }
/* 60 */            editText.setEditableFactory(xc0.f19026b);
                }

                /* JADX INFO: renamed from: x */
                public static int m9523x(int i, int i2) {
/* 3 */             int i3 = 0;
/* 4 */             int i4 = 0;
/* 6 */             for (int i5 = 0; i5 < i; i5++) {
/* 8 */                 i3++;
/* 10 */                if (i3 == i2) {
/* 12 */                    i4++;
/* 14 */                    i3 = 0;
                        } else if (i3 > i2) {
/* 18 */                    i4++;
/* 20 */                    i3 = 1;
                        }
                    }
                    return i3 + 1 > i2 ? i4 + 1 : i4;
                }

                /* JADX INFO: renamed from: A */
                public wc0 m9524A(int i) {
/* 3 */             int[] iArr = (int[]) this.f18578c;
/* 7 */             wq0 wq0Var = (wq0) this.f18577b;
/* 9 */             if (i == 0) {
/* 11 */                return wq0Var.f18735c;
                    }
/* 15 */            if (i == 1) {
/* 17 */                return this;
                    }
/* 18 */            int length = iArr.length;
/* 19 */            int[] iArr2 = new int[length];
/* 22 */            for (int i2 = 0; i2 < length; i2++) {
/* 30 */                iArr2[i2] = wq0Var.m9600b(iArr[i2], i);
                    }
/* 37 */            return new wc0(wq0Var, iArr2);
                }

                /* JADX INFO: renamed from: B */
                public void m9525B(r42 r42Var, Object obj) {
/* 5 */             if (((EnumMap) this.f18578c) == null) {
/* 14 */                this.f18578c = new EnumMap(r42.class);
                    }
/* 20 */            ((EnumMap) this.f18578c).put(r42Var, obj);
                }

                /* JADX INFO: renamed from: C */
                public void m9526C(String str) {
/* 10 */            xe2.m9775m("HSEvntPrxy", "Authentication failure, reason: ".concat(str), null);
/* 25 */            ((ra2) this.f18578c).m8115t(new dp0(this, str, 10, false));
                }

                /* JADX INFO: renamed from: D */
                public void m9527D(String str, HashMap map) {
/* 18 */            xe2.m9775m("HSEvntPrxy", "Event occurred: " + str, null);
/* 31 */            ((ra2) this.f18578c).m8115t(new js0(1, this, str, map));
                }

                /* JADX INFO: renamed from: E */
                public void m9528E(AbstractC1812k abstractC1812k, if1 if1Var, td1 td1Var) {
                    wd1 wd1Var;
                    y91 y91Var;
                    boolean z;
                    long jM6679C;
                    Double d;
/* 11 */            tf1 tf1Var = (tf1) this.f18578c;
/* 13 */            tf1Var.getClass();
/* 24 */            Date date = (Date) tf1Var.f17065a.invoke();
/* 26 */            Double d2 = if1Var.f9565a;
/* 35 */            double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
/* 37 */            Double d3 = if1Var.f9577m;
/* 46 */            double dDoubleValue2 = d3 != null ? d3.doubleValue() : 1.0d;
/* 48 */            Boolean bool = if1Var.f9574j;
/* 57 */            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
/* 58 */            Boolean bool2 = if1Var.f9573i;
/* 68 */            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
/* 69 */            wd1 wd1Var2 = wd1.f18585a;
/* 71 */            if (td1Var == null || (wd1Var = td1Var.f17048c) == null) {
/* 77 */                wd1Var = wd1Var2;
                    }
/* 78 */            boolean z2 = wd1Var == wd1Var2;
/* 83 */            double d4 = dDoubleValue;
/* 85 */            boolean z3 = zBooleanValue;
/* 87 */            y91 y91Var2 = new y91(date, d4, dDoubleValue2, z3, zBooleanValue2, z2);
/* 90 */            LinkedHashSet linkedHashSet = tf1Var.f17070f;
/* 94 */            if ((tf1Var.f17066b == null || !z2) && (y91Var = tf1Var.f17071g) != null) {
/* 109 */               long jM8786b = tf1.m8786b(y91Var.f19538a, date);
/* 115 */               if (y91Var.f19541d) {
/* 123 */                   tf1Var.f17075k = fb0.m3691g(tf1Var.f17075k, jM8786b);
/* 125 */                   z = true;
                        } else {
/* 135 */                   tf1Var.f17073i = fb0.m3691g(tf1Var.f17073i, jM8786b);
/* 137 */                   long j = tf1Var.f17069e;
/* 141 */                   z = true;
/* 143 */                   double d5 = y91Var.f19540c;
/* 149 */                   if (Double.isNaN(d5)) {
/* 257 */                       C1951n4.m6859j("Cannot round NaN value.");
/* 260 */                       return;
                            }
/* 177 */                   int iRound = d5 > 2.147483647E9d ? AbstractC0208c9.API_PRIORITY_OTHER : d5 < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(d5);
/* 181 */                   if (iRound == d5) {
/* 183 */                       jM6679C = fb0.m3692h(iRound, jM8786b);
                            } else {
/* 190 */                       ib0 ib0VarM3689e = fb0.m3689e(jM8786b);
/* 199 */                       jM6679C = mn0.m6679C(fb0.m3693i(jM8786b, ib0VarM3689e) * d5, ib0VarM3689e);
                            }
/* 208 */                   tf1Var.f17069e = fb0.m3691g(j, jM6679C);
/* 212 */                   if (y91Var.f19542e) {
/* 220 */                       tf1Var.f17074j = fb0.m3691g(tf1Var.f17074j, jM8786b);
                            }
/* 222 */                   if (!z3) {
/* 228 */                       if (d4 > y91Var.f19539b) {
/* 231 */                           int i = (int) d4;
/* 232 */                           for (int i2 = (int) r7; i2 < i; i2++) {
/* 238 */                               linkedHashSet.add(Integer.valueOf(i2));
                                    }
                                }
                            }
                        }
/* 244 */               if (!z3) {
/* 251 */                   linkedHashSet.add(Integer.valueOf((int) d4));
                        }
                    } else {
/* 99 */                z = true;
                    }
/* 263 */           if (abstractC1812k instanceof vd1) {
/* 269 */               tf1Var.f17077m++;
                    } else if (abstractC1812k instanceof he1) {
/* 280 */               tf1Var.f17078n++;
                    } else if (abstractC1812k instanceof ge1) {
/* 291 */               tf1Var.f17079o++;
                    } else if (abstractC1812k instanceof xd1) {
/* 302 */               tf1Var.f17080p++;
                    }
/* 314 */           if (!(abstractC1812k instanceof he1 ? z : abstractC1812k instanceof fe1)) {
/* 346 */               if (abstractC1812k instanceof xd1 ? z : abstractC1812k instanceof ce1 ? z : abstractC1812k instanceof de1 ? z : abstractC1812k instanceof ie1) {
/* 348 */                   Date date2 = tf1Var.f17066b;
/* 350 */                   if (date2 != null) {
/* 362 */                       tf1Var.f17072h = fb0.m3691g(tf1Var.f17072h, tf1.m8786b(date2, date));
                            }
/* 364 */                   tf1Var.f17066b = date;
                        } else if (abstractC1812k instanceof yd1 ? z : abstractC1812k instanceof ge1 ? z : abstractC1812k instanceof ee1) {
/* 385 */                   Date date3 = tf1Var.f17066b;
/* 387 */                   if (date3 != null) {
/* 399 */                       tf1Var.f17072h = fb0.m3691g(tf1Var.f17072h, tf1.m8786b(date3, date));
                            }
/* 401 */                   tf1Var.f17066b = null;
                        }
                    } else if (tf1Var.f17066b == null) {
/* 320 */               tf1Var.f17066b = date;
                    }
/* 405 */           if (abstractC1812k instanceof te1) {
/* 407 */               tf1Var.f17067c = date;
/* 413 */               tf1Var.f17068d = Double.valueOf(d4);
                    } else {
/* 416 */               Date date4 = tf1Var.f17067c;
/* 418 */               if (date4 != null && (d = tf1Var.f17068d) != null) {
/* 431 */                   if (!(d4 == d.doubleValue() || y91Var2.f19541d) || (abstractC1812k instanceof se1) || (abstractC1812k instanceof ff1)) {
/* 472 */                       tf1Var.f17076l = fb0.m3691g(tf1Var.f17076l, tf1.m8786b(date4, date));
/* 474 */                       tf1Var.f17067c = null;
/* 476 */                       tf1Var.f17068d = null;
                            } else {
/* 457 */                       tf1Var.f17076l = fb0.m3691g(tf1Var.f17076l, tf1.m8786b(date4, date));
/* 459 */                       tf1Var.f17067c = date;
                            }
                        }
                    }
/* 478 */           tf1Var.f17071g = y91Var2;
                }

                @Override // p000.w02
                /* JADX INFO: renamed from: a */
                public Object mo4392a(Object obj, u21 u21Var) {
/* 1 */             u21Var.getClass();
/* 6 */             return (Boolean) this.f18577b;
                }

                @Override // p000.dd0
                /* JADX INFO: renamed from: b */
                public Object mo2925b() {
/* 3 */             return (by2) this.f18577b;
                }

                @Override // p000.dd0
                /* JADX INFO: renamed from: c */
                public boolean mo2926c(CharSequence charSequence, int i, int i2, qs2 qs2Var) {
/* 6 */             if ((qs2Var.f15734c & 4) > 0) {
/* 5 */                 return true;
                    }
/* 13 */            if (((by2) this.f18577b) == null) {
/* 33 */                this.f18577b = new by2(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
                    }
/* 39 */            ((zb0) this.f18578c).getClass();
/* 53 */            ((by2) this.f18577b).setSpan(new rs2(qs2Var), i, i2, 33);
/* 5 */             return true;
                }

                /* JADX WARN: Code duplicated, block: B:14:0x0035  */
                /* JADX WARN: Code duplicated, block: B:34:0x0075  */
                /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x00ff, code lost:
                
                    if (r7.collect(r8, r0) == r2) goto L65;
                 */
                @Override // p000.fk0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object collect(hk0 hk0Var, c10 c10Var) throws Throwable {
                    mk0 mk0Var;
                    Throwable th;
                    w52 w52Var;
                    wc0 wc0Var;
                    pk0 pk0Var;
                    h90 h90Var;
                    switch (this.f18576a) {
                        case 4:
/* 151 */                   if (c10Var instanceof mk0) {
/* 154 */                       mk0Var = (mk0) c10Var;
/* 156 */                       int i = mk0Var.f13831b;
/* 160 */                       if ((i & Integer.MIN_VALUE) != 0) {
/* 163 */                           mk0Var.f13831b = i - Integer.MIN_VALUE;
                                } else {
/* 168 */                           mk0Var = new mk0(this, c10Var);
                                }
                            } else {
/* 168 */                       mk0Var = new mk0(this, c10Var);
                            }
/* 171 */                   Object obj = mk0Var.f13830a;
/* 173 */                   z10 z10Var = z10.f19902a;
/* 175 */                   int i2 = mk0Var.f13831b;
/* 178 */                   if (i2 != 0) {
/* 180 */                       if (i2 == 1) {
/* 192 */                           w52Var = mk0Var.f13835f;
/* 194 */                           hk0Var = mk0Var.f13834e;
/* 196 */                           wc0Var = mk0Var.f13833d;
                                    try {
/* 198 */                               pg3.m7417A(obj);
/* 237 */                               w52Var.releaseIntercepted();
/* 242 */                               fk0 fk0Var = (fk0) wc0Var.f18578c;
/* 244 */                               mk0Var.f13833d = null;
/* 246 */                               mk0Var.f13834e = null;
/* 248 */                               mk0Var.f13835f = null;
/* 250 */                               mk0Var.f13831b = 2;
                                    } catch (Throwable th2) {
/* 202 */                               th = th2;
/* 269 */                               w52Var.releaseIntercepted();
/* 272 */                               throw th;
                                    }
                                    break;
                                } else {
/* 182 */                           if (i2 != 2) {
/* 188 */                               f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 8 */                                 return null;
                                    }
/* 184 */                           pg3.m7417A(obj);
                                }
/* 260 */                       return Unit.f12910a;
                            }
/* 204 */                   pg3.m7417A(obj);
/* 213 */                   w52 w52Var2 = new w52(hk0Var, mk0Var.getContext());
                            try {
/* 218 */                       n40 n40Var = (n40) this.f18577b;
                                try {
/* 220 */                           mk0Var.f13833d = this;
/* 222 */                           mk0Var.f13834e = hk0Var;
/* 224 */                           mk0Var.f13835f = w52Var2;
/* 226 */                           mk0Var.f13831b = 1;
/* 232 */                           if (n40Var.invoke(w52Var2, mk0Var) != z10Var) {
/* 235 */                               wc0Var = this;
/* 236 */                               w52Var = w52Var2;
/* 237 */                               w52Var.releaseIntercepted();
/* 242 */                               fk0 fk0Var2 = (fk0) wc0Var.f18578c;
/* 244 */                               mk0Var.f13833d = null;
/* 246 */                               mk0Var.f13834e = null;
/* 248 */                               mk0Var.f13835f = null;
/* 250 */                               mk0Var.f13831b = 2;
                                        break;
                                    }
/* 258 */                           return z10Var;
                                } catch (Throwable th3) {
/* 263 */                           th = th3;
/* 264 */                           w52Var = w52Var2;
/* 269 */                           w52Var.releaseIntercepted();
/* 272 */                           throw th;
                                }
                            } catch (Throwable th4) {
/* 267 */                       th = th4;
                            }
                            break;
                        case 5:
/* 137 */                   Object objCollect = ((wc0) this.f18577b).collect(new ok0(new e22(), hk0Var, (C2107qh) this.f18578c), c10Var);
                            return objCollect == z10.f19902a ? objCollect : Unit.f12910a;
                        case 6:
/* 39 */                    if (c10Var instanceof pk0) {
/* 42 */                        pk0Var = (pk0) c10Var;
/* 44 */                        int i3 = pk0Var.f15156b;
/* 48 */                        if ((i3 & Integer.MIN_VALUE) != 0) {
/* 51 */                            pk0Var.f15156b = i3 - Integer.MIN_VALUE;
                                } else {
/* 56 */                            pk0Var = new pk0(this, c10Var);
                                }
                            } else {
/* 56 */                        pk0Var = new pk0(this, c10Var);
                            }
/* 59 */                    Object obj2 = pk0Var.f15155a;
/* 61 */                    z10 z10Var2 = z10.f19902a;
/* 63 */                    int i4 = pk0Var.f15156b;
/* 65 */                    if (i4 != 0) {
/* 67 */                        if (i4 != 1) {
/* 77 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 69 */                        h90Var = pk0Var.f15158d;
                                try {
/* 71 */                            pg3.m7417A(obj2);
                                } catch (C0000a e) {
/* 75 */                            e = e;
/* 113 */                           if (e.f0a != h90Var) {
/* 118 */                               throw e;
                                    }
                                }
                                break;
                            } else {
/* 81 */                        pg3.m7417A(obj2);
/* 86 */                        wc0 wc0Var2 = (wc0) this.f18577b;
/* 94 */                        h90 h90Var2 = new h90((C1929mj) this.f18578c, hk0Var);
                                try {
/* 97 */                            pk0Var.f15158d = h90Var2;
/* 99 */                            pk0Var.f15156b = 1;
/* 105 */                           if (wc0Var2.collect(h90Var2, pk0Var) == z10Var2) {
/* 107 */                               return z10Var2;
                                    }
                                } catch (C0000a e2) {
/* 109 */                           e = e2;
/* 110 */                           h90Var = h90Var2;
/* 113 */                           if (e.f0a != h90Var) {
/* 118 */                               throw e;
                                    }
                                }
                            }
/* 115 */                   return Unit.f12910a;
                        default:
/* 25 */                    Object objCollect2 = ((fk0) this.f18577b).collect(new h90(hk0Var, (il0) this.f18578c), c10Var);
                            return objCollect2 == z10.f19902a ? objCollect2 : Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: d */
                public void m9529d(Object obj, String str) {
/* 1 */             int length = str.length();
/* 5 */             String strValueOf = String.valueOf(obj);
/* 31 */            ((ArrayList) this.f18577b).add(fm0.m3790p(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
                }

                /* JADX INFO: renamed from: e */
                public wc0 m9530e(wc0 wc0Var) {
/* 3 */             wq0 wq0Var = (wq0) this.f18577b;
/* 13 */            if (!wq0Var.equals((wq0) wc0Var.f18577b)) {
/* 79 */                C1951n4.m6859j("GenericGFPolys do not have same GenericGF field");
/* 82 */                return null;
                    }
/* 19 */            if (m9550z()) {
/* 21 */                return wc0Var;
                    }
/* 26 */            if (wc0Var.m9550z()) {
/* 28 */                return this;
                    }
/* 31 */            int[] iArr = (int[]) this.f18578c;
/* 35 */            int[] iArr2 = (int[]) wc0Var.f18578c;
/* 39 */            if (iArr.length <= iArr2.length) {
/* 43 */                iArr2 = iArr;
/* 44 */                iArr = iArr2;
                    }
/* 46 */            int[] iArr3 = new int[iArr.length];
/* 50 */            int length = iArr.length - iArr2.length;
/* 52 */            System.arraycopy(iArr, 0, iArr3, 0, length);
/* 57 */            for (int i = length; i < iArr.length; i++) {
/* 66 */                iArr3[i] = iArr2[i - length] ^ iArr[i];
                    }
/* 73 */            return new wc0(wq0Var, iArr3);
                }

                /* JADX INFO: renamed from: f */
                public void m9531f(Fragment fragment, boolean z) {
/* 1 */             fragment.getClass();
/* 8 */             Fragment fragment2 = ((AbstractC0111w) this.f18577b).f1514x;
/* 10 */            if (fragment2 != null) {
/* 12 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 16 */                parentFragmentManager.getClass();
/* 22 */                parentFragmentManager.f1504n.m9531f(fragment, true);
                    }
/* 29 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 37 */            if (it.hasNext()) {
/* 43 */                if (it.next() != null) {
/* 50 */                    C1697u2.m5431g();
                        } else {
/* 46 */                    if (!z) {
/* 49 */                        throw null;
                            }
/* 48 */                    throw null;
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public void m9532g(Fragment fragment, boolean z) {
/* 1 */             fragment.getClass();
/* 6 */             AbstractC0111w abstractC0111w = (AbstractC0111w) this.f18577b;
/* 10 */            FragmentActivity fragmentActivity = abstractC0111w.f1512v.f14817b;
/* 12 */            Fragment fragment2 = abstractC0111w.f1514x;
/* 14 */            if (fragment2 != null) {
/* 16 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 20 */                parentFragmentManager.getClass();
/* 26 */                parentFragmentManager.f1504n.m9532g(fragment, true);
                    }
/* 33 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 41 */            if (it.hasNext()) {
/* 47 */                if (it.next() != null) {
/* 54 */                    C1697u2.m5431g();
                        } else {
/* 50 */                    if (!z) {
/* 53 */                        throw null;
                            }
/* 52 */                    throw null;
                        }
                    }
                }

                @Override // javax.inject.Provider
                public Object get() {
                    switch (this.f18576a) {
                        case 18:
/* 64 */                    return new ei1((Context) ((C0828d1) this.f18577b).f6954a, (C0875ec) ((d52) this.f18578c).get());
                        default:
/* 10 */                    q62 q62Var = new q62(9);
/* 17 */                    p62 p62Var = new p62(8);
/* 24 */                    Object obj = ((Provider) this.f18577b).get();
/* 31 */                    Provider provider = (Provider) this.f18578c;
/* 40 */                    return new s52(q62Var, p62Var, C2179sf.f16553f, (k72) obj, provider);
                    }
                }

                /* JADX INFO: renamed from: h */
                public void m9533h(Fragment fragment, boolean z) {
/* 1 */             fragment.getClass();
/* 8 */             Fragment fragment2 = ((AbstractC0111w) this.f18577b).f1514x;
/* 10 */            if (fragment2 != null) {
/* 12 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 16 */                parentFragmentManager.getClass();
/* 22 */                parentFragmentManager.f1504n.m9533h(fragment, true);
                    }
/* 29 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 37 */            if (it.hasNext()) {
/* 43 */                if (it.next() != null) {
/* 50 */                    C1697u2.m5431g();
                        } else {
/* 46 */                    if (!z) {
/* 49 */                        throw null;
                            }
/* 48 */                    throw null;
                        }
                    }
                }

                /* JADX INFO: renamed from: i */
                public void m9534i(Fragment fragment, boolean z) {
/* 1 */             fragment.getClass();
/* 8 */             Fragment fragment2 = ((AbstractC0111w) this.f18577b).f1514x;
/* 10 */            if (fragment2 != null) {
/* 12 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 16 */                parentFragmentManager.getClass();
/* 22 */                parentFragmentManager.f1504n.m9534i(fragment, true);
                    }
/* 29 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 37 */            if (it.hasNext()) {
/* 43 */                if (it.next() != null) {
/* 50 */                    C1697u2.m5431g();
                        } else {
/* 46 */                    if (!z) {
/* 49 */                        throw null;
                            }
/* 48 */                    throw null;
                        }
                    }
                }

                /* JADX INFO: renamed from: j */
                public void m9535j(Fragment fragment, boolean z) {
/* 1 */             fragment.getClass();
/* 8 */             Fragment fragment2 = ((AbstractC0111w) this.f18577b).f1514x;
/* 10 */            if (fragment2 != null) {
/* 12 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 16 */                parentFragmentManager.getClass();
/* 22 */                parentFragmentManager.f1504n.m9535j(fragment, true);
                    }
/* 29 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 37 */            if (it.hasNext()) {
/* 43 */                if (it.next() != null) {
/* 50 */                    C1697u2.m5431g();
                        } else {
/* 46 */                    if (!z) {
/* 49 */                        throw null;
                            }
/* 48 */                    throw null;
                        }
                    }
                }

                /* JADX INFO: renamed from: k */
                public void m9536k(Fragment fragment, boolean z) {
/* 1 */             fragment.getClass();
/* 8 */             Fragment fragment2 = ((AbstractC0111w) this.f18577b).f1514x;
/* 10 */            if (fragment2 != null) {
/* 12 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 16 */                parentFragmentManager.getClass();
/* 22 */                parentFragmentManager.f1504n.m9536k(fragment, true);
                    }
/* 29 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 37 */            if (it.hasNext()) {
/* 43 */                if (it.next() != null) {
/* 50 */                    C1697u2.m5431g();
                        } else {
/* 46 */                    if (!z) {
/* 49 */                        throw null;
                            }
/* 48 */                    throw null;
                        }
                    }
                }

                /* JADX INFO: renamed from: l */
                public void m9537l(Fragment fragment, boolean z) {
/* 1 */             fragment.getClass();
/* 6 */             AbstractC0111w abstractC0111w = (AbstractC0111w) this.f18577b;
/* 10 */            FragmentActivity fragmentActivity = abstractC0111w.f1512v.f14817b;
/* 12 */            Fragment fragment2 = abstractC0111w.f1514x;
/* 14 */            if (fragment2 != null) {
/* 16 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 20 */                parentFragmentManager.getClass();
/* 26 */                parentFragmentManager.f1504n.m9537l(fragment, true);
                    }
/* 33 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 41 */            if (it.hasNext()) {
/* 47 */                if (it.next() != null) {
/* 54 */                    C1697u2.m5431g();
                        } else {
/* 50 */                    if (!z) {
/* 53 */                        throw null;
                            }
/* 52 */                    throw null;
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public void m9538m(Fragment fragment, boolean z) {
/* 1 */             fragment.getClass();
/* 8 */             Fragment fragment2 = ((AbstractC0111w) this.f18577b).f1514x;
/* 10 */            if (fragment2 != null) {
/* 12 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 16 */                parentFragmentManager.getClass();
/* 22 */                parentFragmentManager.f1504n.m9538m(fragment, true);
                    }
/* 29 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 37 */            if (it.hasNext()) {
/* 43 */                if (it.next() != null) {
/* 50 */                    C1697u2.m5431g();
                        } else {
/* 46 */                    if (!z) {
/* 49 */                        throw null;
                            }
/* 48 */                    throw null;
                        }
                    }
                }

                /* JADX INFO: renamed from: n */
                public void m9539n(Fragment fragment, boolean z) {
/* 1 */             fragment.getClass();
/* 8 */             Fragment fragment2 = ((AbstractC0111w) this.f18577b).f1514x;
/* 10 */            if (fragment2 != null) {
/* 12 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 16 */                parentFragmentManager.getClass();
/* 22 */                parentFragmentManager.f1504n.m9539n(fragment, true);
                    }
/* 29 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 37 */            if (it.hasNext()) {
/* 43 */                if (it.next() != null) {
/* 50 */                    C1697u2.m5431g();
                        } else {
/* 46 */                    if (!z) {
/* 49 */                        throw null;
                            }
/* 48 */                    throw null;
                        }
                    }
                }

                /* JADX INFO: renamed from: o */
                public void m9540o(Fragment fragment, Bundle bundle, boolean z) {
/* 1 */             fragment.getClass();
/* 8 */             Fragment fragment2 = ((AbstractC0111w) this.f18577b).f1514x;
/* 10 */            if (fragment2 != null) {
/* 12 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 16 */                parentFragmentManager.getClass();
/* 22 */                parentFragmentManager.f1504n.m9540o(fragment, bundle, true);
                    }
/* 29 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 37 */            if (it.hasNext()) {
/* 43 */                if (it.next() != null) {
/* 50 */                    C1697u2.m5431g();
                        } else {
/* 46 */                    if (!z) {
/* 49 */                        throw null;
                            }
/* 48 */                    throw null;
                        }
                    }
                }

                @Override // p000.xo0
                public void onFailure(Throwable th) {
                    switch (this.f18576a) {
                        case 19:
/* 21 */                    throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
                        default:
/* 10 */                    ((C2260um) this.f18577b).m9041b(th);
/* 13 */                    return;
                    }
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int i) {
/* 3 */             C1996oc c1996oc = (C1996oc) this.f18578c;
/* 9 */             if (i != 0) {
/* 12 */                if (i == 1) {
/* 33 */                    k50.m5968e("oy0", "Install referrer API connection couldn't be established.", new Object[0]);
/* 36 */                    c1996oc.invoke(null);
/* 39 */                    return;
                        } else {
/* 15 */                    if (i != 2) {
/* 100 */                       return;
                            }
/* 22 */                    k50.m5968e("oy0", "Install referrer API not available on the current Play Store app.", new Object[0]);
/* 25 */                    c1996oc.invoke(null);
/* 28 */                    return;
                        }
                    }
                    try {
/* 44 */                ReferrerDetails installReferrer = ((InstallReferrerClient) this.f18577b).getInstallReferrer();
/* 48 */                installReferrer.getClass();
/* 53 */                String installReferrer2 = installReferrer.getInstallReferrer();
/* 57 */                installReferrer2.getClass();
/* 75 */                c1996oc.invoke(new oy0(installReferrer.getGooglePlayInstantParam(), installReferrer2, installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds()));
                    } catch (RemoteException unused) {
/* 94 */                k50.m5968e("oy0", "Install referrer API remote exception.", new Object[0]);
/* 97 */                c1996oc.invoke(null);
                    } catch (NoSuchMethodError unused2) {
/* 83 */                k50.m5968e("oy0", "Upgrade InstallReferrer package to v1.1 or higher to add the install referrer details entity.", new Object[0]);
/* 86 */                c1996oc.invoke(null);
                    }
                }

                @Override // p000.xo0
                public void onSuccess(Object obj) {
                    switch (this.f18576a) {
                        case 19:
/* 26 */                    ((Surface) this.f18577b).release();
/* 33 */                    ((SurfaceTexture) this.f18578c).release();
                            break;
                        default:
/* 16 */                    ((C2260um) this.f18577b).m9040a((C2303vq) this.f18578c);
                            break;
                    }
                }

                /* JADX INFO: renamed from: p */
                public void m9541p(Fragment fragment, boolean z) {
/* 1 */             fragment.getClass();
/* 8 */             Fragment fragment2 = ((AbstractC0111w) this.f18577b).f1514x;
/* 10 */            if (fragment2 != null) {
/* 12 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 16 */                parentFragmentManager.getClass();
/* 22 */                parentFragmentManager.f1504n.m9541p(fragment, true);
                    }
/* 29 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 37 */            if (it.hasNext()) {
/* 43 */                if (it.next() != null) {
/* 50 */                    C1697u2.m5431g();
                        } else {
/* 46 */                    if (!z) {
/* 49 */                        throw null;
                            }
/* 48 */                    throw null;
                        }
                    }
                }

                /* JADX INFO: renamed from: q */
                public void m9542q(Fragment fragment, boolean z) {
/* 1 */             fragment.getClass();
/* 8 */             Fragment fragment2 = ((AbstractC0111w) this.f18577b).f1514x;
/* 10 */            if (fragment2 != null) {
/* 12 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 16 */                parentFragmentManager.getClass();
/* 22 */                parentFragmentManager.f1504n.m9542q(fragment, true);
                    }
/* 29 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 37 */            if (it.hasNext()) {
/* 43 */                if (it.next() != null) {
/* 50 */                    C1697u2.m5431g();
                        } else {
/* 46 */                    if (!z) {
/* 49 */                        throw null;
                            }
/* 48 */                    throw null;
                        }
                    }
                }

                /* JADX INFO: renamed from: r */
                public void m9543r(Fragment fragment, View view, boolean z) {
/* 1 */             fragment.getClass();
/* 4 */             view.getClass();
/* 11 */            Fragment fragment2 = ((AbstractC0111w) this.f18577b).f1514x;
/* 13 */            if (fragment2 != null) {
/* 15 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 19 */                parentFragmentManager.getClass();
/* 25 */                parentFragmentManager.f1504n.m9543r(fragment, view, true);
                    }
/* 32 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 40 */            if (it.hasNext()) {
/* 46 */                if (it.next() != null) {
/* 53 */                    C1697u2.m5431g();
                        } else {
/* 49 */                    if (!z) {
/* 52 */                        throw null;
                            }
/* 51 */                    throw null;
                        }
                    }
                }

                /* JADX INFO: renamed from: s */
                public void m9544s(Fragment fragment, boolean z) {
/* 1 */             fragment.getClass();
/* 8 */             Fragment fragment2 = ((AbstractC0111w) this.f18577b).f1514x;
/* 10 */            if (fragment2 != null) {
/* 12 */                AbstractC0111w parentFragmentManager = fragment2.getParentFragmentManager();
/* 16 */                parentFragmentManager.getClass();
/* 22 */                parentFragmentManager.f1504n.m9544s(fragment, true);
                    }
/* 29 */            Iterator it = ((CopyOnWriteArrayList) this.f18578c).iterator();
/* 37 */            if (it.hasNext()) {
/* 43 */                if (it.next() != null) {
/* 50 */                    C1697u2.m5431g();
                        } else {
/* 46 */                    if (!z) {
/* 49 */                        throw null;
                            }
/* 48 */                    throw null;
                        }
                    }
                }

                /* JADX INFO: renamed from: t */
                public int m9545t(int i) {
/* 3 */             int[] iArr = (int[]) this.f18578c;
/* 6 */             if (i == 0) {
/* 8 */                 return m9547v(0);
                    }
/* 14 */            if (i != 1) {
/* 29 */                int iM9600b = iArr[0];
/* 31 */                int length = iArr.length;
/* 32 */                for (int i2 = 1; i2 < length; i2++) {
/* 44 */                    iM9600b = ((wq0) this.f18577b).m9600b(i, iM9600b) ^ iArr[i2];
                        }
/* 48 */                return iM9600b;
                    }
/* 17 */            int i3 = 0;
/* 18 */            for (int i4 : iArr) {
/* 22 */                wq0 wq0Var = wq0.f18732h;
/* 24 */                i3 ^= i4;
                    }
/* 28 */            return i3;
                }

                public String toString() {
/* 3 */             int i = 0;
                    switch (this.f18576a) {
                        case 10:
/* 172 */                   StringBuilder sb = new StringBuilder(m9548w() * 8);
/* 179 */                   for (int iM9548w = m9548w(); iM9548w >= 0; iM9548w--) {
/* 181 */                       int iM9547v = m9547v(iM9548w);
/* 185 */                       if (iM9547v != 0) {
/* 187 */                           if (iM9547v < 0) {
/* 191 */                               sb.append(" - ");
/* 194 */                               iM9547v = -iM9547v;
                                    } else if (sb.length() > 0) {
/* 204 */                               sb.append(" + ");
                                    }
/* 208 */                           if (iM9548w == 0 || iM9547v != 1) {
/* 214 */                               wq0 wq0Var = (wq0) this.f18577b;
/* 216 */                               if (iM9547v == 0) {
/* 265 */                                   wq0Var.getClass();
/* 268 */                                   f42.m3649e();
/* 271 */                                   return null;
                                        }
/* 220 */                               int i2 = wq0Var.f18734b[iM9547v];
/* 222 */                               if (i2 == 0) {
/* 226 */                                   sb.append('1');
                                        } else if (i2 == 1) {
/* 234 */                                   sb.append('a');
                                        } else {
/* 240 */                                   sb.append("a^");
/* 243 */                                   sb.append(i2);
                                        }
                                    }
/* 246 */                           if (iM9548w != 0) {
/* 248 */                               if (iM9548w == 1) {
/* 252 */                                   sb.append('x');
                                        } else {
/* 258 */                                   sb.append("x^");
/* 261 */                                   sb.append(iM9548w);
                                        }
                                    }
                                }
                            }
/* 276 */                   return sb.toString();
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 102 */                   StringBuilder sb2 = new StringBuilder(100);
/* 115 */                   sb2.append(this.f18578c.getClass().getSimpleName());
/* 120 */                   sb2.append('{');
/* 125 */                   ArrayList arrayList = (ArrayList) this.f18577b;
/* 127 */                   int size = arrayList.size();
/* 131 */                   while (i < size) {
/* 139 */                       sb2.append((String) arrayList.get(i));
/* 144 */                       if (i < size - 1) {
/* 148 */                           sb2.append(", ");
                                }
/* 151 */                       i++;
                            }
/* 156 */                   sb2.append('}');
/* 159 */                   return sb2.toString();
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 93 */                    return "ObservableProperty(value=" + ((Boolean) this.f18577b) + ')';
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 21 */                    String string = "[ ";
/* 23 */                    if (((qf2) this.f18577b) != null) {
/* 27 */                        while (i < 9) {
/* 29 */                            StringBuilder sbM3512p = AbstractC0886en.m3512p(string);
/* 41 */                            sbM3512p.append(((qf2) this.f18577b).f15521v[i]);
/* 46 */                            sbM3512p.append(" ");
/* 49 */                            string = sbM3512p.toString();
/* 53 */                            i++;
                                }
                            }
/* 58 */                    StringBuilder sbM3794t = fm0.m3794t(string, "] ");
/* 66 */                    sbM3794t.append((qf2) this.f18577b);
/* 69 */                    return sbM3794t.toString();
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 14 */                    return (String) this.f18577b;
                        default:
/* 7 */                     return super.toString();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:16:0x003e  */
                /* JADX WARN: Code duplicated, block: B:17:0x0046  */
                /* JADX WARN: Code duplicated, block: B:20:0x0059  */
                /* JADX INFO: renamed from: u */
                public CctBackendFactory m9546u(String str) {
                    Bundle bundle;
                    Map map;
                    Object obj;
/* 12 */            if (((Map) this.f18578c) == null) {
/* 16 */                Context context = (Context) this.f18577b;
                        try {
/* 18 */                    PackageManager packageManager = context.getPackageManager();
/* 22 */                    if (packageManager == null) {
/* 26 */                        AbstractC1245n0.m4889q("BackendRegistry", "Context has no PackageManager.");
                            } else {
/* 40 */                        ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
/* 44 */                        if (serviceInfo == null) {
/* 48 */                            AbstractC1245n0.m4889q("BackendRegistry", "TransportBackendDiscovery has no service info.");
                                } else {
/* 52 */                            bundle = serviceInfo.metaData;
                                }
/* 61 */                        if (bundle == null) {
/* 65 */                            AbstractC1245n0.m4889q("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
/* 68 */                            map = Collections.EMPTY_MAP;
                                } else {
/* 73 */                            HashMap map2 = new HashMap();
/* 88 */                            for (String str2 : bundle.keySet()) {
/* 96 */                                obj = bundle.get(str2);
/* 102 */                               if (!(obj instanceof String) && str2.startsWith("backend:")) {
/* 123 */                                   for (String str3 : ((String) obj).split(",", -1)) {
/* 127 */                                       String strTrim = str3.trim();
/* 135 */                                       if (!strTrim.isEmpty()) {
/* 144 */                                           map2.put(strTrim, str2.substring(8));
                                                }
                                            }
                                        }
                                    }
/* 150 */                           map = map2;
                                }
/* 151 */                       this.f18578c = map;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
/* 57 */                    AbstractC1245n0.m4889q("BackendRegistry", "Application info not found.");
                        }
/* 29 */                bundle = null;
/* 61 */                if (bundle == null) {
/* 65 */                    AbstractC1245n0.m4889q("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
/* 68 */                    map = Collections.EMPTY_MAP;
                        } else {
/* 73 */                    HashMap map3 = new HashMap();
/* 88 */                    while (r6.hasNext()) {
/* 96 */                        obj = bundle.get(str2);
/* 102 */                       if (!(obj instanceof String)) {
                                }
                            }
/* 150 */                   map = map3;
                        }
/* 151 */               this.f18578c = map;
                    }
/* 161 */           String str4 = (String) ((Map) this.f18578c).get(str);
/* 163 */           if (str4 != null) {
                        try {
/* 185 */                   return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
                        } catch (ClassNotFoundException e) {
/* 271 */                   AbstractC1245n0.m4891s("BackendRegistry", "Class " + str4 + " is not found.", e);
                        } catch (IllegalAccessException e2) {
/* 248 */                   AbstractC1245n0.m4891s("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
                        } catch (InstantiationException e3) {
/* 229 */                   AbstractC1245n0.m4891s("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
                        } catch (NoSuchMethodException e4) {
/* 210 */                   AbstractC1245n0.m4891s("BackendRegistry", "Could not instantiate ".concat(str4), e4);
                        } catch (InvocationTargetException e5) {
/* 202 */                   AbstractC1245n0.m4891s("BackendRegistry", "Could not instantiate ".concat(str4), e5);
                        }
                    }
/* 9 */             return null;
                }

                /* JADX INFO: renamed from: v */
                public int m9547v(int i) {
/* 3 */             int[] iArr = (int[]) this.f18578c;
/* 9 */             return iArr[(iArr.length - 1) - i];
                }

                /* JADX INFO: renamed from: w */
                public int m9548w() {
/* 6 */             return ((int[]) this.f18578c).length - 1;
                }

                /* JADX INFO: renamed from: y */
                public void m9549y() {
/* 5 */             ((SparseIntArray) this.f18577b).clear();
                }

                /* JADX INFO: renamed from: z */
                public boolean m9550z() {
                    return ((int[]) this.f18578c)[0] == 0;
                }

/* 63 */        public /* synthetic */ wc0(int i, Object obj, boolean z) {
/* 64 */            this.f18576a = i;
                    this.f18578c = obj;
                }

/* 64 */        public /* synthetic */ wc0(int i, boolean z) {
/* 65 */            this.f18576a = i;
                }

/* 65 */        public /* synthetic */ wc0(Object obj, int i) {
/* 66 */            this.f18576a = i;
                    this.f18577b = obj;
                    this.f18578c = null;
                }

/* 66 */        public /* synthetic */ wc0(Object obj) {
                    this.f18576a = 21;
                    kb1.m6061n(obj);
                    this.f18578c = obj;
/* 68 */            this.f18577b = new ArrayList();
                }

/* 68 */        public wc0(AbstractC0111w abstractC0111w) {
                    this.f18576a = 9;
                    this.f18577b = abstractC0111w;
/* 70 */            this.f18578c = new CopyOnWriteArrayList();
                }

/* 70 */        public wc0(ExecutorService executorService) {
                    this.f18576a = 27;
/* 74 */            this.f18578c = new C1024id();
/* 75 */            this.f18577b = executorService;
                }

/* 75 */        public wc0(wq0 wq0Var, int[] iArr) {
                    this.f18576a = 10;
/* 77 */            if (iArr.length != 0) {
/* 78 */                this.f18577b = wq0Var;
/* 79 */                int length = iArr.length;
                        int i = 1;
/* 80 */                if (length > 1 && iArr[0] == 0) {
/* 81 */                    while (i < length && iArr[i] == 0) {
                                i++;
                            }
                            if (i == length) {
/* 82 */                        this.f18578c = new int[]{0};
                                return;
                            }
                            int i2 = length - i;
/* 83 */                    int[] iArr2 = new int[i2];
                            this.f18578c = iArr2;
/* 84 */                    System.arraycopy(iArr, i, iArr2, 0, i2);
                            return;
                        }
/* 85 */                this.f18578c = iArr;
                        return;
                    }
/* 86 */            f42.m3649e();
                    throw null;
                }

/* 86 */        public wc0(jx1 jx1Var) {
                    this.f18576a = 24;
/* 90 */            this.f18577b = new HashMap(jx1Var.f12533a);
/* 93 */            this.f18578c = new HashMap(jx1Var.f12534b);
                }

/* 93 */        public wc0(String str, int i) {
                    this.f18576a = i;
                    switch (i) {
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 99 */                    System.currentTimeMillis();
/* 101 */                   this.f18577b = str;
/* 102 */                   this.f18578c = null;
                            break;
                        default:
/* 97 */                    this.f18577b = (ExtraSupportedOutputSizeQuirk) f80.f8038a.m3582h(ExtraSupportedOutputSizeQuirk.class);
/* 98 */                    this.f18578c = new C2131r4(str, 6);
                            break;
                    }
                }

/* 102 */       public wc0(Animator animator) {
                    this.f18576a = 8;
/* 104 */           this.f18577b = null;
/* 105 */           AnimatorSet animatorSet = new AnimatorSet();
                    this.f18578c = animatorSet;
/* 106 */           animatorSet.play(animator);
                }

/* 106 */       public /* synthetic */ wc0(int i, Object obj, Object obj2) {
/* 107 */           this.f18576a = i;
                    this.f18577b = obj;
                    this.f18578c = obj2;
                }

/* 107 */       public wc0(FloatingActionButton floatingActionButton, he3 he3Var) {
                    this.f18576a = 3;
                    this.f18578c = floatingActionButton;
                    this.f18577b = he3Var;
                }

/* 108 */       public wc0(int i) {
                    this.f18576a = i;
                    switch (i) {
                        case 24:
/* 113 */                   this.f18577b = new HashMap();
/* 114 */                   this.f18578c = new HashMap();
                            break;
                        default:
/* 110 */                   this.f18577b = new SparseIntArray();
/* 111 */                   this.f18578c = new SparseIntArray();
                            break;
                    }
                }
            }
