            package p000;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.ClipData;
            import android.content.Context;
            import android.content.IntentSender;
            import android.graphics.Typeface;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.params.DynamicRangeProfiles;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.util.Log;
            import android.view.ContentInfo;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.webkit.WebView;
            import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
            import androidx.coordinatorlayout.widget.C0080c;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
            import com.google.android.gms.tasks.OnSuccessListener;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.gms.tasks.Tasks;
            import com.google.android.material.appbar.AppBarLayout;
            import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
            import com.supercell.titan.AppUpdater;
            import com.supercell.titan.GameApp;
            import io.flutter.embedding.android.ExclusiveAppComponent;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.InvocationHandler;
            import java.nio.charset.Charset;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Objects;
            import java.util.Set;
            import java.util.WeakHashMap;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.concurrent.locks.ReentrantLock;
            import java.util.logging.Level;
            import javax.inject.Provider;
            import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
            import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;
            import org.json.JSONException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 121 */   public class qc3 implements WebViewRendererClientBoundaryInterface, jp1, dh1, OnSuccessListener, rg1, InterfaceC1806ju, InterfaceC0153ar, k00, ge0, sg0, zf0, ExclusiveAppComponent, xo0 {

                /* JADX INFO: renamed from: c */
                public static qc3 f15487c;

                /* JADX INFO: renamed from: d */
                public static final mq0 f15488d = new mq0(1);

                /* JADX INFO: renamed from: e */
                public static final String[] f15489e = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

                /* JADX INFO: renamed from: f */
                public static final tg3 f15490f = new tg3();

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15491a;

                /* JADX INFO: renamed from: b */
                public Object f15492b;

                public qc3(int i) {
                    lh1 lh1Var;
/* 1 */             this.f15491a = i;
                    switch (i) {
                        case 4:
/* 105 */                   if (Build.VERSION.SDK_INT < 26) {
/* 120 */                       this.f15492b = new C0938g1(this);
                            } else {
/* 112 */                       this.f15492b = new C0975h1(this);
                            }
                            break;
                        case 10:
/* 95 */                    this.f15492b = new AtomicInteger(0);
                            break;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                            break;
                        case 20:
/* 80 */                    this.f15492b = new ts0(wq0.f18732h);
                            break;
                        case io.flutter.Build.API_LEVELS.API_21 /* 21 */:
/* 67 */                    this.f15492b = (SmallDisplaySizeQuirk) f80.f8038a.m3582h(SmallDisplaySizeQuirk.class);
                            break;
                        default:
                            try {
/* 26 */                        lh1Var = (lh1) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                            } catch (Exception unused) {
/* 29 */                        lh1Var = f15488d;
                            }
/* 32 */                    lh1[] lh1VarArr = {mq0.f13939b, lh1Var};
/* 41 */                    lb1 lb1Var = new lb1();
/* 44 */                    lb1Var.f13171a = lh1VarArr;
/* 49 */                    Charset charset = ez0.f7923a;
/* 51 */                    this.f15492b = lb1Var;
                            break;
                    }
                }

                /* JADX INFO: renamed from: j */
                public static qc3 m7762j(C0962gp c0962gp) {
                    DynamicRangeProfiles dynamicRangeProfilesM10061g;
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 3 */             qc3 qc3Var = null;
/* 6 */             if (i >= 33 && (dynamicRangeProfilesM10061g = AbstractC2481y0.m10061g(c0962gp.m3981a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
/* 30 */                de3.m3028j("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
/* 42 */                qc3Var = new qc3(new qb0(dynamicRangeProfilesM10061g), 22);
                    }
                    return qc3Var == null ? rb0.f15960a : qc3Var;
                }

                /* JADX INFO: renamed from: m */
                public static synchronized qc3 m7763m(Context context) {
                    qc3 qc3Var;
/* 4 */             Context applicationContext = context.getApplicationContext();
                    synchronized (qc3.class) {
/* 11 */                qc3Var = f15487c;
/* 13 */                if (qc3Var == null) {
/* 19 */                    qc3Var = new qc3(applicationContext);
/* 22 */                    f15487c = qc3Var;
                        }
                    }
/* 26 */            return qc3Var;
/* 26 */            return qc3Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: q */
                public static qc3 m7764q(String str) {
                    Object yj3Var;
/* 5 */             Set set = null;
/* 5 */             Object[] objArr = 0;
/* 5 */             Object[] objArr2 = 0;
/* 5 */             Object[] objArr3 = 0;
/* 6 */             if (str.isEmpty()) {
/* 210 */               C1951n4.m6859j("injected class name is empty");
/* 5 */                 return null;
                    }
/* 14 */            String strReplace = str.replace('/', '.');
/* 22 */            ((rj3) jj3.f12333a).getClass();
/* 25 */            AtomicReference atomicReference = uj3.f17563c;
/* 31 */            if (atomicReference.get() != null) {
/* 39 */                ((wj3) atomicReference.get()).getClass();
/* 46 */                yj3Var = new yj3(strReplace, Level.OFF, set, objArr3 == true ? 1 : 0);
                    } else {
/* 55 */                String strReplace2 = strReplace.replace('$', '.');
/* 59 */                uj3 uj3Var = new uj3(strReplace2);
/* 62 */                String str2 = Build.FINGERPRINT;
/* 64 */                boolean z = true;
/* 78 */                Object[] objArr4 = str2 == null || "robolectric".equals(str2);
/* 79 */                String str3 = Build.HARDWARE;
/* 99 */                Object[] objArr5 = "goldfish".equals(str3) || "ranchu".equals(str3);
/* 100 */               String str4 = Build.TYPE;
/* 108 */               if (!"eng".equals(str4) && !"userdebug".equals(str4)) {
/* 119 */                   z = false;
                        }
/* 120 */               if (objArr4 == true || objArr5 == true) {
/* 151 */                   uj3Var.f17566b = new xj3(strReplace2);
                        } else if (z) {
/* 127 */                   Set set2 = yj3.f19661f;
/* 129 */                   ti3 ti3Var = yj3.f19662i;
/* 131 */                   Level level = Level.ALL;
/* 140 */                   uj3Var.f17566b = new yj3(strReplace2, Level.OFF, set2, ti3Var);
                        } else {
/* 143 */                   uj3Var.f17566b = null;
                        }
/* 155 */               sj3.f16660a.offer(uj3Var);
/* 162 */               if (atomicReference.get() != null) {
                            while (true) {
/* 170 */                       uj3 uj3Var2 = (uj3) sj3.f16660a.poll();
/* 172 */                       if (uj3Var2 == null) {
                                    break;
                                }
/* 180 */                       wj3 wj3Var = (wj3) uj3.f17563c.get();
/* 184 */                       String str5 = (String) uj3Var2.f16749a;
/* 186 */                       wj3Var.getClass();
/* 196 */                       uj3Var2.f17566b = new yj3(str5, Level.OFF, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
                            }
/* 199 */                   uj3.m9032A();
                        }
/* 202 */               yj3Var = uj3Var;
                    }
/* 204 */           return new qc3(yj3Var, 3);
                }

                /* JADX INFO: renamed from: s */
                public static void m7765s(String str, sg3 sg3Var) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 28 */            sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(sg3Var.f16611b / 1000000)));
/* 33 */            sb.append(": logging error [");
/* 36 */            hh3 hh3Var = sg3Var.f16613d;
/* 38 */            if (hh3Var == null) {
/* 96 */                f42.m3656l("cannot request log site information prior to postProcess()");
/* 99 */                return;
                    }
/* 42 */            if (hh3Var != hh3.f9085a) {
/* 48 */                sb.append(hh3Var.mo3764a());
/* 53 */                sb.append('.');
/* 60 */                sb.append(hh3Var.mo3765b());
/* 65 */                sb.append(':');
/* 72 */                sb.append(hh3Var.mo3766c());
                    }
/* 77 */            sb.append("]: ");
/* 80 */            sb.append(str);
/* 85 */            System.err.println(sb);
/* 90 */            System.err.flush();
                }

                @Override // p000.k00
                /* JADX INFO: renamed from: a */
                public ClipData mo5628a() {
/* 1 */             return ((ContentInfo) this.f15492b).getClip();
                }

                @Override // p000.k00
                /* JADX INFO: renamed from: b */
                public ContentInfo mo5629b() {
/* 3 */             return (ContentInfo) this.f15492b;
                }

                @Override // p000.rg1
                /* JADX INFO: renamed from: c */
                public void mo429c(jg1 jg1Var, MenuItem menuItem) {
/* 7 */             ((ViewOnKeyListenerC2341wr) this.f15492b).f18773f.removeCallbacksAndMessages(jg1Var);
                }

                @Override // p000.dh1
                /* JADX INFO: renamed from: d */
                public void mo2938d(jg1 jg1Var, boolean z) {
/* 5 */             ((LayoutInflaterFactory2C2324wa) this.f15492b).m9503r(jg1Var);
                }

                @Override // io.flutter.embedding.android.ExclusiveAppComponent
                public void detachFromFlutterEngine() {
                }

                @Override // p000.k00
                /* JADX INFO: renamed from: e */
                public int mo5630e() {
/* 1 */             return ((ContentInfo) this.f15492b).getSource();
                }

                /* JADX INFO: renamed from: f */
                public C0901f1 mo7766f(int i) {
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: g */
                public l50 m7767g(C2220tj c2220tj) throws C2473xt, yl0 {
                    nj1 nj1Var;
                    int iM9024c;
                    nj1 nj1Var2;
                    char c;
                    String str;
                    int iM9024c2;
/* 1 */             f23 f23VarM8803k = c2220tj.m8803k();
/* 9 */             int i = c2220tj.m8802j().f20234a;
/* 11 */            zl0 zl0VarM8802j = c2220tj.m8802j();
/* 15 */            f23 f23VarM8803k2 = c2220tj.m8803k();
/* 27 */            int i2 = AbstractC0886en.m3496E(8)[zl0VarM8802j.f20235b];
/* 33 */            C2183sj c2183sj = (C2183sj) c2220tj.f17121a;
/* 35 */            int i3 = c2183sj.f16652b;
/* 37 */            int i4 = 0;
/* 39 */            for (int i5 = 0; i5 < i3; i5++) {
/* 42 */                for (int i6 = 0; i6 < i3; i6++) {
/* 48 */                    if (AbstractC0886en.m3497a(i2, i5, i6)) {
/* 50 */                        c2183sj.m8515a(i6, i5);
                            }
                        }
                    }
/* 62 */            int i7 = f23VarM8803k2.f7979a * 4;
/* 63 */            int i8 = i7 + 17;
/* 65 */            int i9 = f23VarM8803k2.f7982d;
/* 69 */            C2183sj c2183sj2 = new C2183sj(i8, i8);
/* 74 */            c2183sj2.m8518d(0, 0, 9, 9);
/* 77 */            int i10 = i7 + 9;
/* 79 */            c2183sj2.m8518d(i10, 0, 8, 9);
/* 82 */            c2183sj2.m8518d(0, i10, 9, 8);
/* 85 */            int[] iArr = f23VarM8803k2.f7980b;
/* 87 */            int length = iArr.length;
/* 88 */            int i11 = 0;
/* 91 */            while (i11 < length) {
/* 95 */                int i12 = iArr[i11] - 2;
/* 100 */               for (int i13 = i4; i13 < length; i13++) {
/* 102 */                   if ((i11 != 0 || (i13 != 0 && i13 != length - 1)) && (i11 != length - 1 || i13 != 0)) {
/* 120 */                       c2183sj2.m8518d(iArr[i13] - 2, i12, 5, 5);
                            }
                        }
/* 127 */               i11++;
/* 131 */               i4 = 0;
                    }
/* 134 */           int i14 = 2;
/* 136 */           int i15 = 6;
/* 137 */           int i16 = 1;
/* 138 */           c2183sj2.m8518d(6, 9, 1, i7);
/* 141 */           c2183sj2.m8518d(9, 6, i7, 1);
/* 147 */           if (f23VarM8803k2.f7979a > 6) {
/* 149 */               int i17 = i7 + 6;
/* 151 */               c2183sj2.m8518d(i17, 0, 3, 6);
/* 154 */               c2183sj2.m8518d(0, i17, 6, 3);
                    }
/* 157 */           byte[] bArr = new byte[i9];
/* 159 */           int i18 = i3 - 1;
/* 161 */           int i19 = i18;
/* 162 */           boolean z = true;
/* 164 */           int i20 = 0;
/* 165 */           int i21 = 0;
/* 166 */           int i22 = 0;
/* 167 */           while (i19 > 0) {
/* 169 */               if (i19 == i15) {
/* 171 */                   i19--;
                        }
/* 173 */               int i23 = 0;
/* 174 */               while (i23 < i3) {
/* 183 */                   int i24 = z ? i18 - i23 : i23;
/* 184 */                   int i25 = i16;
/* 188 */                   int i26 = 0;
/* 189 */                   for (int i27 = i14; i26 < i27; i27 = 2) {
/* 191 */                       int i28 = i19 - i26;
/* 197 */                       if (!c2183sj2.m8516b(i28, i24)) {
/* 199 */                           i21++;
/* 201 */                           i22 <<= 1;
/* 207 */                           if (c2183sj.m8516b(i28, i24)) {
/* 209 */                               i22 |= 1;
                                    }
/* 214 */                           if (i21 == 8) {
/* 219 */                               bArr[i20] = (byte) i22;
/* 216 */                               i20++;
/* 222 */                               i21 = 0;
/* 223 */                               i22 = 0;
                                    }
                                }
/* 224 */                       i26++;
                            }
/* 228 */                   i23++;
/* 230 */                   i16 = i25;
/* 234 */                   i14 = 2;
                        }
/* 239 */               z = !z;
/* 241 */               i19 -= 2;
/* 243 */               i15 = 6;
/* 246 */               i14 = 2;
                    }
/* 249 */           int i29 = i16;
/* 251 */           if (i20 != i9) {
/* 953 */               throw yl0.m10156a();
                    }
/* 253 */           int i30 = f23VarM8803k.f7982d;
/* 255 */           int i31 = f23VarM8803k.f7979a;
/* 257 */           if (i9 != i30) {
/* 945 */               f42.m3649e();
/* 943 */               return null;
                    }
/* 265 */           C1954n7 c1954n7 = f23VarM8803k.f7981c[AbstractC0886en.m3520y(i)];
/* 269 */           m12[] m12VarArr = (m12[]) c1954n7.f14152c;
/* 271 */           int i32 = c1954n7.f14151b;
/* 274 */           int i33 = 0;
/* 276 */           for (m12 m12Var : m12VarArr) {
/* 282 */               i33 += m12Var.f13545a;
                    }
/* 286 */           C1954n7[] c1954n7Arr = new C1954n7[i33];
/* 289 */           int i34 = 0;
/* 291 */           for (m12 m12Var2 : m12VarArr) {
/* 295 */               int i35 = 0;
/* 298 */               while (i35 < m12Var2.f13545a) {
/* 300 */                   int i36 = m12Var2.f13546b;
/* 318 */                   c1954n7Arr[i34] = new C1954n7(i36, new byte[i32 + i36], 2);
/* 320 */                   i35++;
/* 304 */                   i34++;
/* 323 */                   i32 = i32;
                        }
                    }
/* 333 */           int i37 = i32;
/* 345 */           int length2 = ((byte[]) c1954n7Arr[0].f14152c).length;
/* 346 */           int i38 = i33 - 1;
/* 348 */           while (i38 >= 0 && ((byte[]) c1954n7Arr[i38].f14152c).length != length2) {
/* 359 */               i38--;
                    }
/* 362 */           int i39 = i38 + 1;
/* 364 */           int i40 = length2 - i37;
/* 367 */           int i41 = 0;
/* 368 */           for (int i42 = 0; i42 < i40; i42++) {
/* 370 */               int i43 = 0;
/* 371 */               while (i43 < i34) {
/* 383 */                   ((byte[]) c1954n7Arr[i43].f14152c)[i42] = bArr[i41];
/* 385 */                   i43++;
/* 379 */                   i41++;
                        }
                    }
/* 392 */           int i44 = i39;
/* 393 */           while (i44 < i34) {
/* 405 */               ((byte[]) c1954n7Arr[i44].f14152c)[i40] = bArr[i41];
/* 407 */               i44++;
/* 401 */               i41++;
                    }
/* 419 */           int length3 = ((byte[]) c1954n7Arr[0].f14152c).length;
/* 420 */           while (i40 < length3) {
/* 422 */               int i45 = i41;
/* 423 */               int i46 = 0;
/* 424 */               while (i46 < i34) {
/* 442 */                   ((byte[]) c1954n7Arr[i46].f14152c)[i46 < i39 ? i40 : i40 + 1] = bArr[i45];
/* 444 */                   i46++;
/* 438 */                   i45++;
                        }
/* 448 */               i40++;
/* 450 */               i41 = i45;
                    }
/* 452 */           int i47 = 0;
/* 454 */           for (int i48 = 0; i48 < i33; i48++) {
/* 460 */               i47 += c1954n7Arr[i48].f14151b;
                    }
/* 464 */           byte[] bArr2 = new byte[i47];
/* 466 */           int i49 = 0;
/* 468 */           for (int i50 = 0; i50 < i33; i50++) {
/* 470 */               C1954n7 c1954n8 = c1954n7Arr[i50];
/* 474 */               byte[] bArr3 = (byte[]) c1954n8.f14152c;
/* 476 */               int i51 = c1954n8.f14151b;
/* 478 */               int length4 = bArr3.length;
/* 479 */               int[] iArr2 = new int[length4];
/* 482 */               for (int i52 = 0; i52 < length4; i52++) {
/* 488 */                   iArr2[i52] = bArr3[i52] & 255;
                        }
                        try {
/* 501 */                   ((ts0) this.f15492b).m8896d(iArr2, bArr3.length - i51);
/* 505 */                   for (int i53 = 0; i53 < i51; i53++) {
/* 510 */                       bArr3[i53] = (byte) iArr2[i53];
                            }
/* 515 */                   int i54 = 0;
/* 516 */                   while (i54 < i51) {
/* 522 */                       bArr2[i49] = bArr3[i54];
/* 524 */                       i54++;
/* 518 */                       i49++;
                            }
                        } catch (d22 unused) {
/* 531 */                   C2473xt c2473xt = C2473xt.f19355c;
/* 535 */                   if (y02.f19429a) {
/* 545 */                       throw new C2473xt();
                            }
/* 545 */                   throw C2473xt.f19355c;
                        }
                    }
/* 549 */           C2257uj c2257uj = new C2257uj(bArr2, 0);
/* 556 */           StringBuilder sb = new StringBuilder(50);
/* 563 */           ArrayList arrayList = new ArrayList(i29);
/* 567 */           int iM9024c3 = -1;
/* 568 */           int iM9024c4 = -1;
/* 569 */           EnumC2230tt enumC2230tt = null;
/* 571 */           boolean z2 = false;
/* 881 */           do {
                        try {
/* 572 */                   int iM9023a = c2257uj.m9023a();
/* 577 */                   nj1Var = nj1.TERMINATOR;
/* 580 */                   if (iM9023a < 4 || (iM9024c = c2257uj.m9024c(4)) == 0) {
/* 582 */                       nj1Var2 = nj1Var;
                            } else if (iM9024c == 1) {
/* 648 */                       nj1Var2 = nj1.NUMERIC;
                            } else if (iM9024c == 2) {
/* 645 */                       nj1Var2 = nj1.ALPHANUMERIC;
                            } else if (iM9024c == 3) {
/* 642 */                       nj1Var2 = nj1.STRUCTURED_APPEND;
                            } else if (iM9024c == 4) {
/* 639 */                       nj1Var2 = nj1.BYTE;
                            } else if (iM9024c == 5) {
/* 636 */                       nj1Var2 = nj1.FNC1_FIRST_POSITION;
                            } else if (iM9024c == 7) {
/* 633 */                       nj1Var2 = nj1.ECI;
                            } else if (iM9024c == 8) {
/* 630 */                       nj1Var2 = nj1.KANJI;
                            } else if (iM9024c == 9) {
/* 627 */                       nj1Var2 = nj1.FNC1_SECOND_POSITION;
                            } else {
/* 616 */                       if (iM9024c != 13) {
/* 626 */                           throw new IllegalArgumentException();
                                }
/* 618 */                       nj1Var2 = nj1.HANZI;
                            }
/* 650 */                   int[] iArr3 = nj1Var2.f14317a;
/* 652 */                   int iOrdinal = nj1Var2.ordinal();
/* 656 */                   if (iOrdinal == 0) {
/* 765 */                       c = '\b';
                            } else if (iOrdinal != 3) {
/* 662 */                       if (iOrdinal == 5) {
/* 773 */                           int iM9024c5 = c2257uj.m9024c(8);
/* 779 */                           if ((iM9024c5 & 128) == 0) {
/* 781 */                               iM9024c2 = iM9024c5 & 127;
                                    } else if ((iM9024c5 & 192) == 128) {
/* 799 */                               iM9024c2 = ((iM9024c5 & 63) << 8) | c2257uj.m9024c(8);
                                    } else {
/* 805 */                               if ((iM9024c5 & 224) != 192) {
/* 854 */                                   throw yl0.m10156a();
                                        }
/* 816 */                               iM9024c2 = ((iM9024c5 & 31) << 16) | c2257uj.m9024c(16);
                                    }
/* 817 */                           HashMap map = EnumC2230tt.f17253c;
/* 819 */                           if (iM9024c2 < 0 || iM9024c2 >= 900) {
/* 849 */                               throw yl0.m10156a();
                                    }
/* 835 */                           enumC2230tt = (EnumC2230tt) EnumC2230tt.f17253c.get(Integer.valueOf(iM9024c2));
/* 837 */                           if (enumC2230tt == null) {
/* 844 */                               throw yl0.m10156a();
                                    }
                                } else if (iOrdinal == 7 || iOrdinal == 8) {
/* 764 */                           z2 = true;
                                } else if (iOrdinal != 9) {
/* 687 */                           int iM9024c6 = c2257uj.m9024c(iArr3[i31 <= 9 ? (char) 0 : i31 <= 26 ? (char) 1 : (char) 2]);
/* 691 */                           int iOrdinal2 = nj1Var2.ordinal();
/* 696 */                           if (iOrdinal2 == 1) {
/* 729 */                               kb1.m6071x(c2257uj, sb, iM9024c6);
                                    } else if (iOrdinal2 == 2) {
/* 724 */                               kb1.m6067t(c2257uj, sb, iM9024c6, z2);
                                    } else if (iOrdinal2 == 4) {
/* 719 */                               kb1.m6068u(c2257uj, sb, iM9024c6, enumC2230tt, arrayList);
                                    } else {
/* 705 */                               if (iOrdinal2 != 6) {
/* 717 */                                   throw yl0.m10156a();
                                        }
/* 707 */                               kb1.m6070w(c2257uj, sb, iM9024c6);
                                    }
                                } else {
/* 734 */                           int iM9024c7 = c2257uj.m9024c(4);
/* 751 */                           int iM9024c8 = c2257uj.m9024c(iArr3[i31 <= 9 ? (char) 0 : i31 <= 26 ? (char) 1 : (char) 2]);
/* 756 */                           if (iM9024c7 == 1) {
/* 758 */                               kb1.m6069v(c2257uj, sb, iM9024c8);
                                    }
                                }
/* 765 */                       c = '\b';
                            } else {
/* 863 */                       if (c2257uj.m9023a() < 16) {
/* 880 */                           throw yl0.m10156a();
                                }
/* 865 */                       c = '\b';
/* 867 */                       iM9024c3 = c2257uj.m9024c(8);
/* 871 */                       iM9024c4 = c2257uj.m9024c(8);
                            }
                        } catch (IllegalArgumentException unused2) {
/* 942 */                   throw yl0.m10156a();
                        }
/* 881 */           } while (nj1Var2 != nj1Var);
/* 883 */           int i55 = iM9024c4;
/* 886 */           String string = sb.toString();
/* 900 */           ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
/* 902 */           if (i == 1) {
/* 925 */               str = "L";
                    } else if (i == 2) {
/* 922 */               str = "M";
                    } else if (i == 3) {
/* 919 */               str = "Q";
                    } else {
/* 911 */               if (i != 4) {
/* 918 */                   throw null;
                        }
/* 913 */               str = "H";
                    }
/* 928 */           return new l50(bArr2, string, arrayList2, str, iM9024c3, i55);
                }

                @Override // javax.inject.Provider
                public Object get() {
/* 11 */            String packageName = ((Context) ((Provider) this.f15492b).get()).getPackageName();
/* 15 */            if (packageName != null) {
/* 17 */                return packageName;
                    }
/* 20 */            C1951n4.m6868s("Cannot return null from a non-@Nullable @Provides method");
/* 23 */            return null;
                }

                @Override // io.flutter.embedding.android.ExclusiveAppComponent
                public Object getAppComponent() {
/* 3 */             return (Activity) this.f15492b;
                }

                @Override // p000.k00
                public int getFlags() {
/* 1 */             return ((ContentInfo) this.f15492b).getFlags();
                }

                @Override // p000.zf0
                public int getHeight() {
/* 5 */             return ((ExtendedFloatingActionButton) this.f15492b).getMeasuredHeight();
                }

                @Override // p000.zf0
                public int getPaddingEnd() {
/* 5 */             return ((ExtendedFloatingActionButton) this.f15492b).f4733o0;
                }

                @Override // p000.zf0
                public int getPaddingStart() {
/* 5 */             return ((ExtendedFloatingActionButton) this.f15492b).f4732n0;
                }

                @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
                public String[] getSupportedFeatures() {
/* 1 */             return f15489e;
                }

                @Override // p000.zf0
                public int getWidth() {
/* 3 */             ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f15492b;
/* 21 */            return (extendedFloatingActionButton.getMeasuredWidth() - (extendedFloatingActionButton.getCollapsedPadding() * 2)) + extendedFloatingActionButton.f4732n0 + extendedFloatingActionButton.f4733o0;
                }

                /* JADX INFO: renamed from: h */
                public C0901f1 mo7768h(int i) {
/* 1 */             return null;
                }

                @Override // p000.rg1
                /* JADX INFO: renamed from: i */
                public void mo430i(jg1 jg1Var, sg1 sg1Var) {
/* 3 */             ViewOnKeyListenerC2341wr viewOnKeyListenerC2341wr = (ViewOnKeyListenerC2341wr) this.f15492b;
/* 5 */             Handler handler = viewOnKeyListenerC2341wr.f18773f;
/* 8 */             handler.removeCallbacksAndMessages(null);
/* 11 */            ArrayList arrayList = viewOnKeyListenerC2341wr.f18781v;
/* 13 */            int size = arrayList.size();
/* 17 */            int i = 0;
                    while (true) {
/* 19 */                if (i >= size) {
/* 35 */                    i = -1;
                            break;
                        } else if (jg1Var == ((C2304vr) arrayList.get(i)).f18324b) {
                            break;
                        } else {
/* 32 */                    i++;
                        }
                    }
/* 36 */            if (i == -1) {
/* 38 */                return;
                    }
/* 39 */            int i2 = i + 1;
/* 71 */            handler.postAtTime(new RunnableC2265ur(this, i2 < arrayList.size() ? (C2304vr) arrayList.get(i2) : null, sg1Var, jg1Var, 0), jg1Var, SystemClock.uptimeMillis() + 200);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p000.jp1
                /* JADX INFO: renamed from: k */
                public m83 mo1634k(View view, m83 m83Var) {
/* 4 */             int i = 0;
                    switch (this.f15491a) {
                        case 7:
/* 99 */                    AppBarLayout appBarLayout = (AppBarLayout) this.f15492b;
/* 101 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 111 */                   m83 m83Var2 = appBarLayout.getFitsSystemWindows() ? m83Var : null;
/* 118 */                   if (!Objects.equals(appBarLayout.f4335i, m83Var2)) {
/* 120 */                       appBarLayout.f4335i = m83Var2;
/* 124 */                       if (appBarLayout.f4333f0 != null && appBarLayout.getTopInset() > 0) {
/* 132 */                           i = 1;
                                }
/* 135 */                       appBarLayout.setWillNotDraw(i ^ 1);
/* 138 */                       appBarLayout.requestLayout();
                            }
                            break;
                        default:
/* 8 */                     j83 j83Var = m83Var.f13660a;
/* 12 */                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f15492b;
/* 20 */                    if (!Objects.equals(coordinatorLayout.f1204b0, m83Var)) {
/* 22 */                        coordinatorLayout.f1204b0 = m83Var;
/* 32 */                        boolean z = m83Var.m6624d() > 0;
/* 33 */                        coordinatorLayout.f1206c0 = z;
/* 45 */                        coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
/* 52 */                        if (!j83Var.mo3342m()) {
/* 55 */                            int childCount = coordinatorLayout.getChildCount();
/* 59 */                            while (i < childCount) {
/* 61 */                                View childAt = coordinatorLayout.getChildAt(i);
/* 65 */                                WeakHashMap weakHashMap2 = e33.f7494a;
/* 71 */                                if (!childAt.getFitsSystemWindows() || ((C0080c) childAt.getLayoutParams()).f1218a == null || !j83Var.mo3342m()) {
/* 90 */                                    i++;
                                        }
                                    }
                                }
/* 93 */                        coordinatorLayout.requestLayout();
                            }
                            break;
                    }
/* 96 */            return m83Var;
                }

                /* JADX INFO: renamed from: l */
                public boolean mo7769l(int i, int i2, Bundle bundle) {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: n */
                public synchronized void m7770n() {
/* 4 */             eh2 eh2Var = (eh2) this.f15492b;
/* 6 */             ReentrantLock reentrantLock = eh2Var.f7691a;
/* 8 */             reentrantLock.lock();
                    try {
/* 21 */                eh2Var.f7692b.edit().clear().apply();
/* 24 */                reentrantLock.unlock();
                    } catch (Throwable th) {
/* 30 */                reentrantLock.unlock();
/* 33 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: o */
                public rg3 m7771o() {
/* 1 */             Level level = Level.WARNING;
/* 5 */             sq3 sq3Var = (sq3) this.f15492b;
/* 7 */             boolean zMo8628r = sq3Var.mo8628r(level);
/* 13 */            String str = (String) sq3Var.f16749a;
/* 19 */            ((rj3) jj3.f12333a).getClass();
/* 24 */            vj3.f18227b.mo300a(str, zMo8628r);
                    return !zMo8628r ? f15490f : new sg3(this);
                }

                @Override // p000.xo0
                public void onFailure(Throwable th) {
/* 5 */             ((C2260um) this.f15492b).m9041b(th);
                }

                @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
                public void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
/* 1 */             WeakHashMap weakHashMap = i73.f9490c;
/* 9 */             WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) j13.m5642b(WebViewRendererBoundaryInterface.class, invocationHandler);
/* 27 */            ((g73) this.f15492b).onRenderProcessResponsive(webView, (i73) webViewRendererBoundaryInterface.getOrCreatePeer(new CallableC2139rc(webViewRendererBoundaryInterface, 5)));
                }

                @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
                public void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
/* 1 */             WeakHashMap weakHashMap = i73.f9490c;
/* 9 */             WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) j13.m5642b(WebViewRendererBoundaryInterface.class, invocationHandler);
/* 27 */            ((g73) this.f15492b).onRenderProcessUnresponsive(webView, (i73) webViewRendererBoundaryInterface.getOrCreatePeer(new CallableC2139rc(webViewRendererBoundaryInterface, 5)));
                }

                /* JADX WARN: Code duplicated, block: B:36:0x007e  */
                /* JADX WARN: Code duplicated, block: B:38:0x0084  */
                /* JADX WARN: Code duplicated, block: B:44:0x009a A[Catch: all -> 0x010b, TRY_LEAVE, TryCatch #2 {, blocks: (B:42:0x008c, B:44:0x009a, B:57:0x010d, B:58:0x0112), top: B:85:0x008c, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
                /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
                /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
                /* JADX WARN: Code duplicated, block: B:54:0x00df  */
                /* JADX WARN: Code duplicated, block: B:57:0x010d A[Catch: all -> 0x010b, TRY_ENTER, TryCatch #2 {, blocks: (B:42:0x008c, B:44:0x009a, B:57:0x010d, B:58:0x0112), top: B:85:0x008c, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:84:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:85:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(Object obj) {
                    yg3 yg3Var;
                    C1922mc c1922mc;
                    df3 df3Var;
                    wq3 wq3Var;
                    String packageName;
                    yr3 yr3Var;
                    C0204c5 c0204c5;
                    Object[] objArr;
                    switch (this.f15491a) {
                        case 9:
/* 24 */                    C1885lc c1885lc = (C1885lc) obj;
/* 31 */                    if (c1885lc.f13175a == 2) {
/* 33 */                        PendingIntent pendingIntent = c1885lc.f13177c;
/* 35 */                        if (pendingIntent == null) {
/* 38 */                            pendingIntent = null;
                                }
/* 39 */                        if (pendingIntent != null) {
                                    try {
/* 45 */                                if (AppUpdater.m2720a()) {
/* 51 */                                    AppUpdater.f5707a.m10148a(AppUpdater.f5708b);
/* 54 */                                    yg3 yg3Var2 = AppUpdater.f5707a;
/* 59 */                                    GameApp gameApp = (GameApp) this.f15492b;
/* 61 */                                    yg3Var2.getClass();
/* 64 */                                    PendingIntent pendingIntent2 = c1885lc.f13177c;
/* 71 */                                    if ((pendingIntent2 != null ? pendingIntent2 : null) != null && !c1885lc.f13178d) {
/* 78 */                                        c1885lc.f13178d = true;
/* 80 */                                        if (pendingIntent2 == null) {
/* 83 */                                            pendingIntent2 = null;
                                                }
/* 95 */                                        gameApp.startIntentSenderForResult(pendingIntent2.getIntentSender(), 18481, null, 0, 0, 0, null);
                                            }
/* 112 */                                   ((GameApp) this.f15492b).storeKeyValue("LAST_APPUPDATE_REQUESTED", Long.toString(System.currentTimeMillis()));
                                        }
                                    } catch (Exception e) {
/* 122 */                               AbstractC1245n0.m4877e("AppUpdater", "Error starting update", e);
                                    }
                                    break;
                                } else if (c1885lc.f13176b == 11) {
/* 133 */                           yg3Var = AppUpdater.f5707a;
/* 135 */                           c1922mc = AppUpdater.f5708b;
                                    synchronized (yg3Var) {
/* 138 */                               df3Var = yg3Var.f19606b;
                                        synchronized (df3Var) {
/* 148 */                                   df3Var.f7166a.m1530c("unregisterListener", new Object[0]);
/* 153 */                                   if (c1922mc != null) {
/* 275 */                                       throw new NullPointerException("Unregistered Play Core listener should not be null.");
                                            }
/* 157 */                                   df3Var.f7169d.remove(c1922mc);
/* 160 */                                   df3Var.m3055a();
/* 165 */                                   yg3 yg3Var3 = AppUpdater.f5707a;
/* 167 */                                   wq3Var = yg3Var3.f19605a;
/* 171 */                                   packageName = yg3Var3.f19607c.getPackageName();
/* 175 */                                   yr3Var = wq3Var.f18753a;
/* 177 */                                   if (yr3Var == null) {
/* 179 */                                       c0204c5 = wq3.f18751e;
/* 187 */                                       objArr = new Object[]{-9};
/* 200 */                                       if (Log.isLoggable("PlayCore", 6)) {
/* 208 */                                           AbstractC1245n0.m4876d("PlayCore", C0204c5.m1527d(c0204c5.f2720b, "onError(%d)", objArr));
                                                } else {
/* 212 */                                           c0204c5.getClass();
                                                }
/* 220 */                                       Tasks.forException(new my0(-9));
                                            } else {
/* 232 */                                       wq3.f18751e.m1530c("completeUpdate(%s)", packageName);
/* 237 */                                       TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 261 */                                       yr3Var.m10177a().post(new hm3(yr3Var, taskCompletionSource, taskCompletionSource, new hm3(wq3Var, taskCompletionSource, taskCompletionSource, packageName, 1), 2));
/* 264 */                                       taskCompletionSource.getTask();
                                            }
                                        }
                                    }
                                }
                            } else if (c1885lc.f13176b == 11) {
/* 133 */                       yg3Var = AppUpdater.f5707a;
/* 135 */                       c1922mc = AppUpdater.f5708b;
                                synchronized (yg3Var) {
/* 138 */                           df3Var = yg3Var.f19606b;
                                    synchronized (df3Var) {
/* 148 */                               df3Var.f7166a.m1530c("unregisterListener", new Object[0]);
/* 153 */                               if (c1922mc != null) {
/* 275 */                                   throw new NullPointerException("Unregistered Play Core listener should not be null.");
                                        }
/* 157 */                               df3Var.f7169d.remove(c1922mc);
/* 160 */                               df3Var.m3055a();
                                    }
                                }
/* 165 */                       yg3 yg3Var4 = AppUpdater.f5707a;
/* 167 */                       wq3Var = yg3Var4.f19605a;
/* 171 */                       packageName = yg3Var4.f19607c.getPackageName();
/* 175 */                       yr3Var = wq3Var.f18753a;
/* 177 */                       if (yr3Var == null) {
/* 179 */                           c0204c5 = wq3.f18751e;
/* 187 */                           objArr = new Object[]{-9};
/* 200 */                           if (Log.isLoggable("PlayCore", 6)) {
/* 208 */                               AbstractC1245n0.m4876d("PlayCore", C0204c5.m1527d(c0204c5.f2720b, "onError(%d)", objArr));
                                    } else {
/* 212 */                               c0204c5.getClass();
                                    }
/* 220 */                           Tasks.forException(new my0(-9));
                                } else {
/* 232 */                           wq3.f18751e.m1530c("completeUpdate(%s)", packageName);
/* 237 */                           TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
/* 261 */                           yr3Var.m10177a().post(new hm3(yr3Var, taskCompletionSource2, taskCompletionSource2, new hm3(wq3Var, taskCompletionSource2, taskCompletionSource2, packageName, 1), 2));
/* 264 */                           taskCompletionSource2.getTask();
                                }
                            }
/* 284 */                   if (c1885lc.f13175a == 3) {
                                try {
/* 290 */                           AppUpdater.f5707a.m10148a(AppUpdater.f5708b);
/* 293 */                           yg3 yg3Var5 = AppUpdater.f5707a;
/* 298 */                           GameApp gameApp2 = (GameApp) this.f15492b;
/* 300 */                           yg3Var5.getClass();
/* 303 */                           PendingIntent pendingIntent3 = c1885lc.f13177c;
/* 310 */                           if ((pendingIntent3 != null ? pendingIntent3 : null) != null && !c1885lc.f13178d) {
/* 317 */                               c1885lc.f13178d = true;
/* 333 */                               gameApp2.startIntentSenderForResult((pendingIntent3 != null ? pendingIntent3 : null).getIntentSender(), 18481, null, 0, 0, 0, null);
/* 345 */                               return;
                                    }
/* 345 */                           return;
                                } catch (IntentSender.SendIntentException e2) {
/* 342 */                           AbstractC1245n0.m4877e("AppUpdater", "Error resuming update", e2);
/* 345 */                           return;
                                }
                            }
/* 345 */                   return;
                        default:
/* 12 */                    C2260um c2260um = (C2260um) this.f15492b;
                            try {
/* 14 */                        c2260um.m9040a(obj);
/* 22 */                        return;
                            } catch (Throwable th) {
/* 19 */                        c2260um.m9041b(th);
/* 22 */                        return;
                            }
                    }
                }

                @Override // p000.zf0
                /* JADX INFO: renamed from: p */
                public ViewGroup.LayoutParams mo2940p() {
/* 4 */             return new ViewGroup.LayoutParams(-2, -2);
                }

                @Override // p000.InterfaceC0153ar
                /* JADX INFO: renamed from: r */
                public void mo1150r(Typeface typeface) {
/* 3 */             C1979nw c1979nw = (C1979nw) this.f15492b;
/* 9 */             if (c1979nw.m7058n(typeface)) {
/* 12 */                c1979nw.m7054j(false);
                    }
                }

                public String toString() {
                    switch (this.f15491a) {
                        case 18:
/* 30 */                    return "ContentInfoCompat{" + ((ContentInfo) this.f15492b) + "}";
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override // p000.ge0
                /* JADX INFO: renamed from: x */
                public Object mo2941x(String str) {
/* 6 */             return ((ie0) this.f15492b).mo3402a(str, null);
                }

                @Override // p000.dh1
                /* JADX INFO: renamed from: z */
                public boolean mo2942z(jg1 jg1Var) {
/* 7 */             Window.Callback callback = ((LayoutInflaterFactory2C2324wa) this.f15492b).f18511W.getCallback();
/* 11 */            if (callback == null) {
/* 18 */                return true;
                    }
/* 15 */            callback.onMenuOpened(108, jg1Var);
/* 18 */            return true;
                }

/* 122 */       public qc3(Context context) {
                    String strM3436d;
                    this.f15491a = 0;
                    eh2 eh2VarM3432a = eh2.m3432a(context);
                    this.f15492b = eh2VarM3432a;
/* 124 */           eh2VarM3432a.m3434b();
/* 125 */           String strM3436d2 = eh2VarM3432a.m3436d("defaultGoogleSignInAccount");
/* 126 */           if (TextUtils.isEmpty(strM3436d2) || (strM3436d = eh2VarM3432a.m3436d(eh2.m3433f("googleSignInOptions", strM3436d2))) == null) {
                        return;
                    }
                    try {
/* 128 */               GoogleSignInOptions.m1994D1(strM3436d);
                    } catch (JSONException unused) {
                    }
                }

/* 128 */       public qc3(od2 od2Var) {
                    this.f15491a = 12;
                    od2Var.getClass();
                    this.f15492b = od2Var;
                }

/* 129 */       public /* synthetic */ qc3(Object obj, int i) {
/* 130 */           this.f15491a = i;
                    this.f15492b = obj;
                }

/* 130 */       public qc3(ContentInfo contentInfo) {
                    this.f15491a = 18;
/* 132 */           contentInfo.getClass();
/* 133 */           this.f15492b = h00.m4077w(contentInfo);
                }
            }
