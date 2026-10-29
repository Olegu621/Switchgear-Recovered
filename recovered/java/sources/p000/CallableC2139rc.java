            package p000;

            import android.content.ClipboardManager;
            import android.content.Intent;
            import android.os.Binder;
            import android.os.Bundle;
            import android.os.DeadObjectException;
            import android.os.Process;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import com.google.android.gms.internal.measurement.zzt;
            import com.google.android.gms.internal.play_billing.zzan;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.internal.play_billing.zzke;
            import com.google.android.gms.internal.play_billing.zzki;
            import com.google.android.gms.internal.play_billing.zzlo;
            import com.google.android.gms.internal.play_billing.zzlq;
            import com.google.android.gms.measurement.internal.zzbg;
            import com.google.android.gms.measurement.internal.zzjc;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.LocationService;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.UnsupportedEncodingException;
            import java.util.concurrent.Callable;
            import okhttp3.HttpUrl;
            import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
            import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
            
            /* JADX INFO: renamed from: rc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class CallableC2139rc implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15969a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f15970b;

                public CallableC2139rc(zzjc zzjcVar, zzbg zzbgVar, String str) {
/* 3 */             this.f15969a = 8;
/* 8 */             this.f15970b = zzjcVar;
                }

                /* JADX WARN: Code duplicated, block: B:100:0x0171  */
                /* JADX WARN: Code duplicated, block: B:103:0x0176 A[Catch: Exception -> 0x008e, TryCatch #1 {Exception -> 0x008e, blocks: (B:23:0x006f, B:24:0x0073, B:29:0x007d, B:32:0x0091, B:35:0x009e, B:38:0x00ad, B:41:0x00c8, B:45:0x00cf, B:47:0x00d5, B:52:0x00e6, B:55:0x00f5, B:56:0x0110, B:53:0x00ed, B:57:0x0113, B:61:0x011e, B:65:0x0127, B:69:0x0130, B:73:0x0139, B:77:0x0142, B:81:0x014b, B:85:0x0154, B:89:0x015d, B:93:0x0164, B:97:0x016b, B:101:0x0172, B:103:0x0176, B:105:0x0181, B:106:0x0185, B:122:0x01ab, B:125:0x01b5, B:129:0x01bb, B:39:0x00c4, B:36:0x00a5, B:133:0x01c3, B:25:0x0074, B:26:0x0078, B:107:0x0186, B:109:0x018c, B:116:0x0196, B:118:0x01a2, B:120:0x01a8), top: B:211:0x006f, inners: #0, #9 }] */
                /* JADX WARN: Code duplicated, block: B:105:0x0181 A[Catch: Exception -> 0x008e, TryCatch #1 {Exception -> 0x008e, blocks: (B:23:0x006f, B:24:0x0073, B:29:0x007d, B:32:0x0091, B:35:0x009e, B:38:0x00ad, B:41:0x00c8, B:45:0x00cf, B:47:0x00d5, B:52:0x00e6, B:55:0x00f5, B:56:0x0110, B:53:0x00ed, B:57:0x0113, B:61:0x011e, B:65:0x0127, B:69:0x0130, B:73:0x0139, B:77:0x0142, B:81:0x014b, B:85:0x0154, B:89:0x015d, B:93:0x0164, B:97:0x016b, B:101:0x0172, B:103:0x0176, B:105:0x0181, B:106:0x0185, B:122:0x01ab, B:125:0x01b5, B:129:0x01bb, B:39:0x00c4, B:36:0x00a5, B:133:0x01c3, B:25:0x0074, B:26:0x0078, B:107:0x0186, B:109:0x018c, B:116:0x0196, B:118:0x01a2, B:120:0x01a8), top: B:211:0x006f, inners: #0, #9 }] */
                /* JADX WARN: Code duplicated, block: B:109:0x018c A[Catch: all -> 0x018f, DONT_GENERATE, TryCatch #9 {all -> 0x018f, blocks: (B:107:0x0186, B:109:0x018c, B:116:0x0196, B:118:0x01a2, B:120:0x01a8), top: B:225:0x0186, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:113:0x0191 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:114:0x0193  */
                /* JADX WARN: Code duplicated, block: B:115:0x0195  */
                /* JADX WARN: Code duplicated, block: B:118:0x01a2 A[Catch: all -> 0x018f, TryCatch #9 {all -> 0x018f, blocks: (B:107:0x0186, B:109:0x018c, B:116:0x0196, B:118:0x01a2, B:120:0x01a8), top: B:225:0x0186, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:119:0x01a7  */
                /* JADX WARN: Code duplicated, block: B:122:0x01ab A[Catch: Exception -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x008e, blocks: (B:23:0x006f, B:24:0x0073, B:29:0x007d, B:32:0x0091, B:35:0x009e, B:38:0x00ad, B:41:0x00c8, B:45:0x00cf, B:47:0x00d5, B:52:0x00e6, B:55:0x00f5, B:56:0x0110, B:53:0x00ed, B:57:0x0113, B:61:0x011e, B:65:0x0127, B:69:0x0130, B:73:0x0139, B:77:0x0142, B:81:0x014b, B:85:0x0154, B:89:0x015d, B:93:0x0164, B:97:0x016b, B:101:0x0172, B:103:0x0176, B:105:0x0181, B:106:0x0185, B:122:0x01ab, B:125:0x01b5, B:129:0x01bb, B:39:0x00c4, B:36:0x00a5, B:133:0x01c3, B:25:0x0074, B:26:0x0078, B:107:0x0186, B:109:0x018c, B:116:0x0196, B:118:0x01a2, B:120:0x01a8), top: B:211:0x006f, inners: #0, #9 }] */
                /* JADX WARN: Code duplicated, block: B:126:0x01b6 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:127:0x01b8  */
                /* JADX WARN: Code duplicated, block: B:128:0x01ba  */
                /* JADX WARN: Code duplicated, block: B:149:0x01eb  */
                /* JADX WARN: Code duplicated, block: B:150:0x01f0  */
                /* JADX WARN: Code duplicated, block: B:153:0x01fc  */
                /* JADX WARN: Code duplicated, block: B:155:0x0200 A[Catch: all -> 0x0204, TRY_ENTER, TryCatch #3 {all -> 0x0204, blocks: (B:155:0x0200, B:158:0x0206), top: B:215:0x01fe }] */
                /* JADX WARN: Code duplicated, block: B:158:0x0206 A[Catch: all -> 0x0204, TRY_LEAVE, TryCatch #3 {all -> 0x0204, blocks: (B:155:0x0200, B:158:0x0206), top: B:215:0x01fe }] */
                /* JADX WARN: Code duplicated, block: B:162:0x022d  */
                /* JADX WARN: Code duplicated, block: B:164:0x0231 A[Catch: all -> 0x0237, TRY_ENTER, TryCatch #5 {all -> 0x0237, blocks: (B:164:0x0231, B:167:0x0239, B:169:0x024c, B:170:0x024f), top: B:219:0x022f }] */
                /* JADX WARN: Code duplicated, block: B:167:0x0239 A[Catch: all -> 0x0237, TryCatch #5 {all -> 0x0237, blocks: (B:164:0x0231, B:167:0x0239, B:169:0x024c, B:170:0x024f), top: B:219:0x022f }] */
                /* JADX WARN: Code duplicated, block: B:169:0x024c A[Catch: all -> 0x0237, TryCatch #5 {all -> 0x0237, blocks: (B:164:0x0231, B:167:0x0239, B:169:0x024c, B:170:0x024f), top: B:219:0x022f }] */
                /* JADX WARN: Code duplicated, block: B:225:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:59:0x011b  */
                /* JADX WARN: Code duplicated, block: B:60:0x011d  */
                /* JADX WARN: Code duplicated, block: B:63:0x0124  */
                /* JADX WARN: Code duplicated, block: B:64:0x0126  */
                /* JADX WARN: Code duplicated, block: B:67:0x012d  */
                /* JADX WARN: Code duplicated, block: B:68:0x012f  */
                /* JADX WARN: Code duplicated, block: B:71:0x0136  */
                /* JADX WARN: Code duplicated, block: B:72:0x0138  */
                /* JADX WARN: Code duplicated, block: B:75:0x013f  */
                /* JADX WARN: Code duplicated, block: B:76:0x0141  */
                /* JADX WARN: Code duplicated, block: B:79:0x0148  */
                /* JADX WARN: Code duplicated, block: B:80:0x014a  */
                /* JADX WARN: Code duplicated, block: B:83:0x0151  */
                /* JADX WARN: Code duplicated, block: B:84:0x0153  */
                /* JADX WARN: Code duplicated, block: B:87:0x015a  */
                /* JADX WARN: Code duplicated, block: B:88:0x015c  */
                /* JADX WARN: Code duplicated, block: B:91:0x0161  */
                /* JADX WARN: Code duplicated, block: B:92:0x0163  */
                /* JADX WARN: Code duplicated, block: B:95:0x0168  */
                /* JADX WARN: Code duplicated, block: B:96:0x016a  */
                /* JADX WARN: Code duplicated, block: B:99:0x016f  */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    int i;
                    int i2;
                    String strM4523a;
                    String str;
                    boolean z;
                    int iZzy;
                    C1833kj c1833kj;
                    zzke zzkeVarZzc;
                    C0882ej c0882ej;
                    zzan zzanVar;
                    int i3;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    boolean z5;
                    boolean z6;
                    boolean z7;
                    boolean z8;
                    boolean z9;
                    boolean z10;
                    boolean z11;
                    boolean z12;
                    u93 u93Var;
                    switch (this.f15969a) {
                        case 0:
                            try {
/* 732 */                       ClipboardManager clipboardManager = (ClipboardManager) ((GameApp) this.f15970b).getSystemService("clipboard");
/* 738 */                       if (!clipboardManager.hasPrimaryClip() || clipboardManager.getPrimaryClip().getItemCount() <= 0) {
/* 720 */                           return HttpUrl.FRAGMENT_ENCODE_SET;
                                }
/* 762 */                       String string = clipboardManager.getPrimaryClip().getItemAt(0).getText().toString();
                                try {
/* 768 */                           string.getBytes("UTF-8");
/* 771 */                           return string;
                                } catch (UnsupportedEncodingException unused) {
/* 779 */                           AbstractC1245n0.m4876d("ApplicationUtil", "UTF-8 encoding not found.");
/* 720 */                           return HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                            } catch (Exception e) {
/* 783 */                       GameApp.debuggerException(e);
/* 720 */                       return HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                        case 1:
/* 716 */                   ((Runnable) this.f15970b).run();
/* 9 */                     return null;
                        case 2:
/* 704 */                   JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) this.f15970b;
/* 706 */                   e01 e01Var = new e01();
/* 709 */                   e01Var.f7465a = jsReplyProxyBoundaryInterface;
/* 711 */                   return e01Var;
                        case 3:
/* 694 */                   ((LocationService) this.f15970b).f5823c.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
/* 697 */                   return Boolean.TRUE;
                        case 4:
/* 649 */                   RunnableC2289vd runnableC2289vd = (RunnableC2289vd) this.f15970b;
/* 653 */                   runnableC2289vd.f18008e.set(true);
                            try {
/* 656 */                       Process.setThreadPriority(10);
/* 659 */                       runnableC2289vd.m9253a();
/* 662 */                       Binder.flushPendingCommands();
/* 665 */                       runnableC2289vd.m9254b(null);
/* 9 */                         return null;
                            } catch (Throwable th) {
                                try {
/* 672 */                           runnableC2289vd.f18007d.set(true);
/* 675 */                           throw th;
                                } catch (Throwable th2) {
/* 677 */                           runnableC2289vd.m9254b(null);
/* 680 */                           throw th2;
                                }
                            }
                        case 5:
/* 638 */                   WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) this.f15970b;
/* 640 */                   i73 i73Var = new i73();
/* 643 */                   i73Var.f9491a = webViewRendererBoundaryInterface;
/* 645 */                   return i73Var;
                        case 6:
/* 55 */                    ne3 ne3Var = (ne3) this.f15970b;
                            synchronized (ne3Var.f14215b.f7705a) {
                                try {
/* 67 */                            if (ne3Var.f14215b.f7706b != 3) {
/* 77 */                                int i4 = ne3Var.f14215b.f7706b;
/* 84 */                                if (TextUtils.isEmpty(null)) {
/* 110 */                                   bundle = null;
                                        } else {
/* 88 */                                    bundle = new Bundle();
/* 93 */                                    bundle.putString("accountName", null);
/* 96 */                                    C0882ej c0882ej2 = ne3Var.f14215b;
/* 106 */                                   zze.zzc(bundle, c0882ej2.f7707c, c0882ej2.f7704A.longValue());
                                        }
                                        try {
                                            synchronized (ne3Var.f14215b.f7705a) {
/* 119 */                                       zzanVar = ne3Var.f14215b.f7712h;
                                                break;
                                            }
/* 122 */                                   C0882ej c0882ej3 = ne3Var.f14215b;
/* 124 */                                   if (zzanVar == null) {
/* 126 */                                       c0882ej3.m3461o(0);
/* 129 */                                       C0882ej c0882ej4 = ne3Var.f14215b;
/* 131 */                                       C1833kj c1833kj2 = kf3.f12732j;
/* 135 */                                       c0882ej4.m3470x(119, 6, c1833kj2);
/* 138 */                                       ne3Var.m6973a(c1833kj2);
                                            } else {
/* 148 */                                       String packageName = c0882ej3.f7710f.getPackageName();
/* 152 */                                       int iZzy2 = 3;
/* 153 */                                       int i5 = 23;
                                                while (true) {
/* 155 */                                           if (i5 >= 3) {
/* 168 */                                               iZzy2 = bundle == null ? zzanVar.zzy(i5, packageName, "subs") : zzanVar.zzc(i5, packageName, "subs", bundle);
/* 172 */                                               if (iZzy2 == 0) {
/* 193 */                                                   zze.zzk("BillingClient", "highestLevelSupportedForSubs: " + i5);
                                                        } else {
/* 197 */                                                   i5--;
                                                        }
                                                    } else {
/* 200 */                                               i5 = 0;
                                                    }
                                                }
/* 208 */                                       ne3Var.f14215b.f7714j = i5 >= 3;
/* 212 */                                       if (i5 < 3) {
/* 218 */                                           zze.zzk("BillingClient", "In-app billing API does not support subscription on this device.");
/* 221 */                                           i = 9;
                                                } else {
/* 223 */                                           i = 1;
                                                }
/* 224 */                                       iZzy = iZzy2;
/* 227 */                                       for (int i6 = 23; i6 >= 3; i6--) {
/* 240 */                                           iZzy = bundle == null ? zzanVar.zzy(i6, packageName, "inapp") : zzanVar.zzc(i6, packageName, "inapp", bundle);
/* 244 */                                           if (iZzy == 0) {
/* 248 */                                               ne3Var.f14215b.f7715k = i6;
/* 269 */                                               zze.zzk("BillingClient", "mHighestLevelSupportedForInApp: " + i6);
/* 276 */                                               C0882ej c0882ej5 = ne3Var.f14215b;
/* 278 */                                               i3 = c0882ej5.f7715k;
/* 282 */                                               if (i3 >= 21) {
/* 284 */                                                   z2 = true;
                                                        } else {
/* 286 */                                                   z2 = false;
                                                        }
/* 287 */                                               c0882ej5.f7726v = z2;
/* 291 */                                               if (i3 >= 20) {
/* 293 */                                                   z3 = true;
                                                        } else {
/* 295 */                                                   z3 = false;
                                                        }
/* 296 */                                               c0882ej5.f7725u = z3;
/* 300 */                                               if (i3 >= 19) {
/* 302 */                                                   z4 = true;
                                                        } else {
/* 304 */                                                   z4 = false;
                                                        }
/* 305 */                                               c0882ej5.f7724t = z4;
/* 309 */                                               if (i3 >= 18) {
/* 311 */                                                   z5 = true;
                                                        } else {
/* 313 */                                                   z5 = false;
                                                        }
/* 314 */                                               c0882ej5.f7723s = z5;
/* 318 */                                               if (i3 >= 17) {
/* 320 */                                                   z6 = true;
                                                        } else {
/* 322 */                                                   z6 = false;
                                                        }
/* 323 */                                               c0882ej5.f7722r = z6;
/* 327 */                                               if (i3 >= 16) {
/* 329 */                                                   z7 = true;
                                                        } else {
/* 331 */                                                   z7 = false;
                                                        }
/* 332 */                                               c0882ej5.f7721q = z7;
/* 336 */                                               if (i3 >= 15) {
/* 338 */                                                   z8 = true;
                                                        } else {
/* 340 */                                                   z8 = false;
                                                        }
/* 341 */                                               c0882ej5.f7720p = z8;
/* 345 */                                               if (i3 >= 14) {
/* 347 */                                                   z9 = true;
                                                        } else {
/* 349 */                                                   z9 = false;
                                                        }
/* 350 */                                               c0882ej5.f7719o = z9;
/* 352 */                                               if (i3 >= 10) {
/* 354 */                                                   z10 = true;
                                                        } else {
/* 356 */                                                   z10 = false;
                                                        }
/* 357 */                                               c0882ej5.f7718n = z10;
/* 359 */                                               if (i3 >= 9) {
/* 361 */                                                   z11 = true;
                                                        } else {
/* 363 */                                                   z11 = false;
                                                        }
/* 364 */                                               c0882ej5.f7717m = z11;
/* 366 */                                               if (i3 >= 6) {
/* 368 */                                                   z12 = true;
                                                        } else {
/* 370 */                                                   z12 = false;
                                                        }
/* 371 */                                               c0882ej5.f7716l = z12;
/* 373 */                                               if (i3 < 3) {
/* 379 */                                                   zze.zzl("BillingClient", "In-app billing API version 3 is not supported on this device.");
/* 382 */                                                   i = 36;
                                                        }
/* 384 */                                               if (iZzy == 0) {
                                                            synchronized (ne3Var.f14215b.f7705a) {
                                                                try {
/* 395 */                                                           if (ne3Var.f14215b.f7706b == 3) {
/* 402 */                                                               if (i4 == 1) {
/* 404 */                                                                   z = false;
                                                                        } else {
/* 406 */                                                                   z = true;
                                                                        }
/* 410 */                                                               ne3Var.f14215b.m3461o(2);
/* 417 */                                                               if (ne3Var.f14215b.f7709e != null) {
/* 421 */                                                                   u93Var = ne3Var.f14215b.f7709e;
                                                                        } else {
/* 424 */                                                                   u93Var = null;
                                                                        }
/* 426 */                                                               if (u93Var != null) {
/* 432 */                                                                   u93Var.m8984B(ne3Var.f14215b.f7726v);
                                                                        }
                                                                    }
                                                                } catch (Throwable th3) {
/* 438 */                                                           throw th3;
                                                                }
                                                            }
                                                        } else {
/* 439 */                                                   if (i4 == 1) {
/* 441 */                                                       z = false;
                                                            } else {
/* 443 */                                                       z = true;
                                                            }
/* 446 */                                                   ne3Var.f14215b.m3461o(0);
                                                        }
/* 435 */                                               str = null;
/* 507 */                                               if (iZzy == 0) {
/* 509 */                                                   c0882ej = ne3Var.f14215b;
                                                            try {
/* 511 */                                                       if (true != z) {
/* 513 */                                                           c0882ej.m3472z(6);
                                                                } else {
/* 519 */                                                           we2 we2Var = c0882ej.f7711g;
/* 521 */                                                           zzlo zzloVarZzc = zzlq.zzc();
/* 525 */                                                           zzke zzkeVarZzc2 = zzki.zzc();
/* 529 */                                                           zzkeVarZzc2.zzn(0);
/* 532 */                                                           zzloVarZzc.zza(zzkeVarZzc2);
/* 541 */                                                           we2Var.m9572w((zzlq) zzloVarZzc.zzf());
                                                                }
                                                            } catch (Throwable th4) {
/* 549 */                                                       zze.zzm("BillingClient", "Unable to log.", th4);
                                                            }
/* 554 */                                                   ne3Var.m6973a(kf3.f12731i);
                                                        } else {
/* 558 */                                                   c1833kj = kf3.f12723a;
                                                            try {
/* 560 */                                                       if (true != z) {
/* 564 */                                                           ne3Var.f14215b.m3471y(i, 6, c1833kj, str);
                                                                } else {
/* 570 */                                                           zzkeVarZzc = zzki.zzc();
/* 576 */                                                           zzkeVarZzc.zzn(c1833kj.f12818a);
/* 581 */                                                           zzkeVarZzc.zzm(c1833kj.f12819b);
/* 584 */                                                           zzkeVarZzc.zzo(i);
/* 587 */                                                           if (str != null) {
/* 589 */                                                               zzkeVarZzc.zza(str);
                                                                    }
/* 594 */                                                           we2 we2Var2 = ne3Var.f14215b.f7711g;
/* 596 */                                                           zzlo zzloVarZzc2 = zzlq.zzc();
/* 606 */                                                           zzloVarZzc2.zzm((zzki) zzkeVarZzc.zzf());
/* 615 */                                                           we2Var2.m9572w((zzlq) zzloVarZzc2.zzf());
                                                                }
                                                            } catch (Throwable th5) {
/* 623 */                                                       zze.zzm("BillingClient", "Unable to log.", th5);
                                                            }
/* 628 */                                                   ne3Var.m6973a(kf3.f12723a);
                                                        }
                                                    }
                                                    break;
                                                }
/* 276 */                                       C0882ej c0882ej6 = ne3Var.f14215b;
/* 278 */                                       i3 = c0882ej6.f7715k;
/* 282 */                                       if (i3 >= 21) {
/* 284 */                                           z2 = true;
                                                } else {
/* 286 */                                           z2 = false;
                                                }
/* 287 */                                       c0882ej6.f7726v = z2;
/* 291 */                                       if (i3 >= 20) {
/* 293 */                                           z3 = true;
                                                } else {
/* 295 */                                           z3 = false;
                                                }
/* 296 */                                       c0882ej6.f7725u = z3;
/* 300 */                                       if (i3 >= 19) {
/* 302 */                                           z4 = true;
                                                } else {
/* 304 */                                           z4 = false;
                                                }
/* 305 */                                       c0882ej6.f7724t = z4;
/* 309 */                                       if (i3 >= 18) {
/* 311 */                                           z5 = true;
                                                } else {
/* 313 */                                           z5 = false;
                                                }
/* 314 */                                       c0882ej6.f7723s = z5;
/* 318 */                                       if (i3 >= 17) {
/* 320 */                                           z6 = true;
                                                } else {
/* 322 */                                           z6 = false;
                                                }
/* 323 */                                       c0882ej6.f7722r = z6;
/* 327 */                                       if (i3 >= 16) {
/* 329 */                                           z7 = true;
                                                } else {
/* 331 */                                           z7 = false;
                                                }
/* 332 */                                       c0882ej6.f7721q = z7;
/* 336 */                                       if (i3 >= 15) {
/* 338 */                                           z8 = true;
                                                } else {
/* 340 */                                           z8 = false;
                                                }
/* 341 */                                       c0882ej6.f7720p = z8;
/* 345 */                                       if (i3 >= 14) {
/* 347 */                                           z9 = true;
                                                } else {
/* 349 */                                           z9 = false;
                                                }
/* 350 */                                       c0882ej6.f7719o = z9;
/* 352 */                                       if (i3 >= 10) {
/* 354 */                                           z10 = true;
                                                } else {
/* 356 */                                           z10 = false;
                                                }
/* 357 */                                       c0882ej6.f7718n = z10;
/* 359 */                                       if (i3 >= 9) {
/* 361 */                                           z11 = true;
                                                } else {
/* 363 */                                           z11 = false;
                                                }
/* 364 */                                       c0882ej6.f7717m = z11;
/* 366 */                                       if (i3 >= 6) {
/* 368 */                                           z12 = true;
                                                } else {
/* 370 */                                           z12 = false;
                                                }
/* 371 */                                       c0882ej6.f7716l = z12;
/* 373 */                                       if (i3 < 3) {
/* 379 */                                           zze.zzl("BillingClient", "In-app billing API version 3 is not supported on this device.");
/* 382 */                                           i = 36;
                                                }
/* 384 */                                       if (iZzy == 0) {
                                                    synchronized (ne3Var.f14215b.f7705a) {
/* 395 */                                               if (ne3Var.f14215b.f7706b == 3) {
/* 402 */                                                   if (i4 == 1) {
/* 404 */                                                       z = false;
                                                            } else {
/* 406 */                                                       z = true;
                                                            }
/* 410 */                                                   ne3Var.f14215b.m3461o(2);
/* 417 */                                                   if (ne3Var.f14215b.f7709e != null) {
/* 421 */                                                       u93Var = ne3Var.f14215b.f7709e;
                                                            } else {
/* 424 */                                                       u93Var = null;
                                                            }
/* 426 */                                                   if (u93Var != null) {
/* 432 */                                                       u93Var.m8984B(ne3Var.f14215b.f7726v);
                                                            }
                                                        }
                                                    }
                                                } else {
/* 439 */                                           if (i4 == 1) {
/* 441 */                                               z = false;
                                                    } else {
/* 443 */                                               z = true;
                                                    }
/* 446 */                                           ne3Var.f14215b.m3461o(0);
                                                }
/* 435 */                                       str = null;
/* 507 */                                       if (iZzy == 0) {
/* 509 */                                           c0882ej = ne3Var.f14215b;
/* 511 */                                           if (true != z) {
/* 513 */                                               c0882ej.m3472z(6);
                                                    } else {
/* 519 */                                               we2 we2Var3 = c0882ej.f7711g;
/* 521 */                                               zzlo zzloVarZzc3 = zzlq.zzc();
/* 525 */                                               zzke zzkeVarZzc3 = zzki.zzc();
/* 529 */                                               zzkeVarZzc3.zzn(0);
/* 532 */                                               zzloVarZzc3.zza(zzkeVarZzc3);
/* 541 */                                               we2Var3.m9572w((zzlq) zzloVarZzc3.zzf());
                                                    }
/* 554 */                                           ne3Var.m6973a(kf3.f12731i);
                                                } else {
/* 558 */                                           c1833kj = kf3.f12723a;
/* 560 */                                           if (true != z) {
/* 564 */                                               ne3Var.f14215b.m3471y(i, 6, c1833kj, str);
                                                    } else {
/* 570 */                                               zzkeVarZzc = zzki.zzc();
/* 576 */                                               zzkeVarZzc.zzn(c1833kj.f12818a);
/* 581 */                                               zzkeVarZzc.zzm(c1833kj.f12819b);
/* 584 */                                               zzkeVarZzc.zzo(i);
/* 587 */                                               if (str != null) {
/* 589 */                                                   zzkeVarZzc.zza(str);
                                                        }
/* 594 */                                               we2 we2Var4 = ne3Var.f14215b.f7711g;
/* 596 */                                               zzlo zzloVarZzc4 = zzlq.zzc();
/* 606 */                                               zzloVarZzc4.zzm((zzki) zzkeVarZzc.zzf());
/* 615 */                                               we2Var4.m9572w((zzlq) zzloVarZzc4.zzf());
                                                    }
/* 628 */                                           ne3Var.m6973a(kf3.f12723a);
                                                }
                                            }
                                        } catch (Exception e2) {
/* 457 */                                   boolean z13 = i4 != 1;
/* 462 */                                   zze.zzm("BillingClient", "Exception while checking if billing is supported; try to reconnect", e2);
/* 469 */                                   if (e2 instanceof DeadObjectException) {
/* 471 */                                       i2 = ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
                                            } else if (e2 instanceof RemoteException) {
/* 479 */                                       i2 = 100;
                                            } else {
/* 484 */                                       if (e2 instanceof SecurityException) {
/* 486 */                                           i2 = 102;
                                                } else {
/* 489 */                                           i = 42;
                                                }
/* 490 */                                       if (i == 42) {
/* 492 */                                           strM4523a = if3.m4523a(e2);
                                                } else {
/* 497 */                                           strM4523a = null;
                                                }
/* 500 */                                       ne3Var.f14215b.m3461o(0);
/* 503 */                                       boolean z14 = z13;
/* 504 */                                       str = strM4523a;
/* 505 */                                       z = z14;
/* 506 */                                       iZzy = 6;
                                            }
/* 473 */                                   i = i2;
/* 490 */                                   if (i == 42) {
/* 492 */                                       strM4523a = if3.m4523a(e2);
                                            } else {
/* 497 */                                       strM4523a = null;
                                            }
/* 500 */                                   ne3Var.f14215b.m3461o(0);
/* 503 */                                   boolean z15 = z13;
/* 504 */                                   str = strM4523a;
/* 505 */                                   z = z15;
/* 506 */                                   iZzy = 6;
                                        }
                                    }
                                } catch (Throwable th6) {
/* 633 */                           throw th6;
                                }
                            }
/* 9 */                     return null;
                        case 7:
/* 48 */                    return new zzt(((vi3) this.f15970b).f18207V);
                        default:
/* 15 */                    zzjc zzjcVar = (zzjc) this.f15970b;
/* 19 */                    zzjcVar.f4212a.m6731A();
/* 24 */                    ci3 ci3Var = zzjcVar.f4212a.f13937v;
/* 26 */                    mp3.m6728S(ci3Var);
/* 29 */                    ci3Var.mo1375y();
/* 39 */                    throw new IllegalStateException("Unexpected call on client side");
                    }
                }

/* 10 */        public /* synthetic */ CallableC2139rc(Object obj, int i) {
/* 11 */            this.f15969a = i;
                    this.f15970b = obj;
                }
            }
