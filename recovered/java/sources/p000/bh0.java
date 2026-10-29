            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ResolveInfo;
            import android.content.pm.ServiceInfo;
            import android.database.sqlite.SQLiteDatabase;
            import android.graphics.Bitmap;
            import android.net.TrafficStats;
            import androidx.core.app.NotificationCompat;
            import io.sentry.AbstractC1635q4;
            import io.sentry.C1160a5;
            import io.sentry.C1583p5;
            import io.sentry.C1673t5;
            import io.sentry.C1764z6;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1487i1;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.C1263q0;
            import io.sentry.android.core.C1272t0;
            import io.sentry.android.core.ScreenshotEventProcessor;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.clientreport.C1412b;
            import java.io.BufferedWriter;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.OutputStreamWriter;
            import java.util.ArrayDeque;
            import java.util.HashMap;
            import java.util.concurrent.Callable;
            import kotlin.text.Regex;
            import okhttp3.Call;
            import okhttp3.OkHttpClient;
            import okhttp3.Request;
            import okhttp3.Response;
            import okhttp3.ResponseBody;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final /* synthetic */ class bh0 implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2423a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f2424b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f2425c;

                public /* synthetic */ bh0(C0168b5 c0168b5, Context context) {
/* 2 */             this.f2423a = 2;
/* 7 */             this.f2425c = c0168b5;
/* 9 */             this.f2424b = context;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    ServiceInfo serviceInfo;
                    String str;
                    int i;
                    Call callNewCall;
                    hf0 hf0Var;
/* 3 */             int iCode = -1;
/* 6 */             String str2 = null;
/* 6 */             bArr = null;
/* 6 */             bArr = null;
/* 6 */             bArr = null;
/* 6 */             bArr = null;
/* 6 */             byte[] bArr = null;
/* 6 */             responseExecute = null;
/* 6 */             Response responseExecute = null;
/* 6 */             str2 = null;
                    switch (this.f2423a) {
                        case 0:
/* 635 */                   Context context = (Context) this.f2424b;
/* 639 */                   Intent intent = (Intent) this.f2425c;
/* 641 */                   ra2 ra2VarM8100l = ra2.m8100l();
/* 649 */                   ((ArrayDeque) ra2VarM8100l.f15958d).offer(intent);
/* 656 */                   Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
/* 663 */                   intent2.setPackage(context.getPackageName());
                            synchronized (ra2VarM8100l) {
                                try {
/* 671 */                           String str3 = (String) ra2VarM8100l.f15955a;
/* 673 */                           if (str3 != null) {
/* 676 */                               str2 = str3;
                                    } else {
/* 683 */                               ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
/* 687 */                               if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
/* 792 */                                   AbstractC1245n0.m4876d("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                                        } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
/* 783 */                                   AbstractC1245n0.m4876d("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                                        } else {
/* 717 */                                   if (str.startsWith(".")) {
/* 740 */                                       ra2VarM8100l.f15955a = context.getPackageName() + serviceInfo.name;
                                            } else {
/* 748 */                                       ra2VarM8100l.f15955a = serviceInfo.name;
                                            }
/* 753 */                                   str2 = (String) ra2VarM8100l.f15955a;
                                        }
                                    }
                                } catch (Throwable th) {
/* 873 */                           throw th;
                                }
                            }
/* 796 */                   if (str2 != null) {
/* 802 */                       intent2.setClassName(context.getPackageName(), str2);
                            }
                            try {
/* 820 */                       if ((ra2VarM8100l.m8112q(context) ? yy1.m10204K(context, intent2) : context.startService(intent2)) == null) {
/* 826 */                           AbstractC1245n0.m4876d("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
/* 829 */                           iCode = 404;
                                }
                            } catch (IllegalStateException e) {
/* 849 */                       AbstractC1245n0.m4876d("FirebaseMessaging", "Failed to start service while in background: " + e);
/* 852 */                       i = 402;
/* 854 */                       iCode = i;
                            } catch (SecurityException e2) {
/* 861 */                       AbstractC1245n0.m4877e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
/* 864 */                       i = 401;
/* 854 */                       iCode = i;
                            }
/* 867 */                   return Integer.valueOf(iCode);
                        case 1:
/* 556 */                   ip1 ip1Var = (ip1) this.f2424b;
/* 560 */                   Request request = (Request) this.f2425c;
/* 562 */                   ip1Var.getClass();
/* 565 */                   request.getClass();
/* 568 */                   String str4 = ip1Var.f11883a;
                            try {
/* 576 */                       k50.m5958L(str4, "Sending request: %s", request);
/* 579 */                       TrafficStats.setThreadStatsTag(1);
/* 582 */                       OkHttpClient okHttpClient = ip1Var.f11889g;
/* 584 */                       if (okHttpClient != null && (callNewCall = okHttpClient.newCall(request)) != null) {
/* 592 */                           responseExecute = callNewCall.execute();
                                }
/* 599 */                       if (responseExecute != null) {
/* 601 */                           ResponseBody responseBodyBody = responseExecute.body();
/* 605 */                           if (responseBodyBody != null) {
/* 607 */                               responseBodyBody.close();
                                    }
/* 610 */                           iCode = responseExecute.code();
                                }
                                break;
                            } catch (IOException e3) {
/* 625 */                       k50.m5980q(str4, "Request sending failed: %s", e3.toString());
                            }
/* 628 */                   return Integer.valueOf(iCode);
                        case 2:
/* 412 */                   C0168b5 c0168b5 = (C0168b5) this.f2425c;
/* 416 */                   Context context2 = (Context) this.f2424b;
/* 418 */                   context2.getClass();
/* 421 */                   zb0 zb0Var = hf0.f9052a;
/* 425 */                   String str5 = (String) c0168b5.f2211b;
                            synchronized (zb0Var) {
/* 430 */                       HashMap map = hf0.f9053b;
/* 436 */                       if (map.containsKey(str5)) {
/* 438 */                           Object obj = map.get(str5);
/* 442 */                           obj.getClass();
/* 445 */                           hf0Var = (hf0) obj;
                                } else {
/* 477 */                           String str6 = "snowplowEvents-" + new Regex("[^a-zA-Z0-9_]+").replace(str5, "-") + ".sqlite";
/* 481 */                           zb0.m10323h(context2, str6);
/* 486 */                           Context applicationContext = context2.getApplicationContext();
/* 490 */                           applicationContext.getClass();
/* 493 */                           hf0 hf0Var2 = new hf0(applicationContext, str6, null, 1);
/* 496 */                           map.put(str5, hf0Var2);
/* 500 */                           hf0Var = hf0Var2;
                                }
                            }
/* 501 */                   c0168b5.f2214e = hf0Var;
/* 507 */                   if (!c0168b5.m1270p()) {
/* 511 */                       hf0 hf0Var3 = (hf0) c0168b5.f2214e;
/* 520 */                       SQLiteDatabase writableDatabase = hf0Var3 != null ? hf0Var3.getWritableDatabase() : null;
/* 521 */                       c0168b5.f2213d = writableDatabase;
/* 523 */                       if (writableDatabase != null) {
/* 525 */                           writableDatabase.enableWriteAheadLogging();
                                }
                            }
/* 534 */                   SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) c0168b5.f2213d;
/* 548 */                   k50.m5968e("b5", "DB Path: %s", sQLiteDatabase != null ? sQLiteDatabase.getPath() : null);
/* 6 */                     return null;
                        case 3:
/* 352 */                   InterfaceC1487i1 interfaceC1487i1 = (InterfaceC1487i1) this.f2424b;
/* 356 */                   C1673t5 c1673t5 = (C1673t5) this.f2425c;
/* 360 */                   ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
/* 372 */                       BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C1160a5.f9798d), NotificationCompat.FLAG_GROUP_SUMMARY);
                                try {
/* 375 */                           interfaceC1487i1.mo5063a(bufferedWriter, c1673t5);
/* 378 */                           byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 382 */                           bufferedWriter.close();
/* 385 */                           byteArrayOutputStream.close();
/* 388 */                           return byteArray;
                                } catch (Throwable th2) {
                                    try {
/* 392 */                               bufferedWriter.close();
                                        break;
                                    } catch (Throwable th3) {
/* 397 */                               th2.addSuppressed(th3);
                                    }
/* 400 */                           throw th2;
                                }
                            } catch (Throwable th4) {
                                try {
/* 401 */                           byteArrayOutputStream.close();
                                    break;
                                } catch (Throwable th5) {
/* 406 */                           th4.addSuppressed(th5);
                                }
/* 409 */                       throw th4;
                            }
                        case 4:
/* 292 */                   InterfaceC1487i1 interfaceC1487i2 = (InterfaceC1487i1) this.f2424b;
/* 296 */                   C1764z6 c1764z6 = (C1764z6) this.f2425c;
/* 300 */                   ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
/* 312 */                       BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, C1160a5.f9798d), NotificationCompat.FLAG_GROUP_SUMMARY);
                                try {
/* 315 */                           interfaceC1487i2.mo5063a(bufferedWriter2, c1764z6);
/* 318 */                           byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
/* 322 */                           bufferedWriter2.close();
/* 325 */                           byteArrayOutputStream2.close();
/* 328 */                           return byteArray2;
                                } catch (Throwable th6) {
                                    try {
/* 332 */                               bufferedWriter2.close();
                                        break;
                                    } catch (Throwable th7) {
/* 337 */                               th6.addSuppressed(th7);
                                    }
/* 340 */                           throw th6;
                                }
                            } catch (Throwable th8) {
                                try {
/* 341 */                           byteArrayOutputStream2.close();
                                    break;
                                } catch (Throwable th9) {
/* 346 */                           th8.addSuppressed(th9);
                                }
/* 349 */                       throw th8;
                            }
                        case 5:
/* 232 */                   InterfaceC1487i1 interfaceC1487i3 = (InterfaceC1487i1) this.f2424b;
/* 236 */                   AbstractC1635q4 abstractC1635q4 = (AbstractC1635q4) this.f2425c;
/* 240 */                   ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                            try {
/* 252 */                       BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, C1160a5.f9798d), NotificationCompat.FLAG_GROUP_SUMMARY);
                                try {
/* 255 */                           interfaceC1487i3.mo5063a(bufferedWriter3, abstractC1635q4);
/* 258 */                           byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
/* 262 */                           bufferedWriter3.close();
/* 265 */                           byteArrayOutputStream3.close();
/* 268 */                           return byteArray3;
                                } catch (Throwable th10) {
                                    try {
/* 272 */                               bufferedWriter3.close();
                                        break;
                                    } catch (Throwable th11) {
/* 277 */                               th10.addSuppressed(th11);
                                    }
/* 280 */                           throw th10;
                                }
                            } catch (Throwable th12) {
                                try {
/* 281 */                           byteArrayOutputStream3.close();
                                    break;
                                } catch (Throwable th13) {
/* 286 */                           th12.addSuppressed(th13);
                                }
/* 289 */                       throw th12;
                            }
                        case 6:
/* 172 */                   InterfaceC1487i1 interfaceC1487i4 = (InterfaceC1487i1) this.f2424b;
/* 176 */                   C1583p5 c1583p5 = (C1583p5) this.f2425c;
/* 180 */                   ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                            try {
/* 192 */                       BufferedWriter bufferedWriter4 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream4, C1160a5.f9798d), NotificationCompat.FLAG_GROUP_SUMMARY);
                                try {
/* 195 */                           interfaceC1487i4.mo5063a(bufferedWriter4, c1583p5);
/* 198 */                           byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
/* 202 */                           bufferedWriter4.close();
/* 205 */                           byteArrayOutputStream4.close();
/* 208 */                           return byteArray4;
                                } catch (Throwable th14) {
                                    try {
/* 212 */                               bufferedWriter4.close();
                                        break;
                                    } catch (Throwable th15) {
/* 217 */                               th14.addSuppressed(th15);
                                    }
/* 220 */                           throw th14;
                                }
                            } catch (Throwable th16) {
                                try {
/* 221 */                           byteArrayOutputStream4.close();
                                    break;
                                } catch (Throwable th17) {
/* 226 */                           th16.addSuppressed(th17);
                                }
/* 229 */                       throw th16;
                            }
                        case 7:
/* 112 */                   InterfaceC1487i1 interfaceC1487i5 = (InterfaceC1487i1) this.f2424b;
/* 116 */                   C1412b c1412b = (C1412b) this.f2425c;
/* 120 */                   ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                            try {
/* 132 */                       BufferedWriter bufferedWriter5 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream5, C1160a5.f9798d), NotificationCompat.FLAG_GROUP_SUMMARY);
                                try {
/* 135 */                           interfaceC1487i5.mo5063a(bufferedWriter5, c1412b);
/* 138 */                           byte[] byteArray5 = byteArrayOutputStream5.toByteArray();
/* 142 */                           bufferedWriter5.close();
/* 145 */                           byteArrayOutputStream5.close();
/* 148 */                           return byteArray5;
                                } catch (Throwable th18) {
                                    try {
/* 152 */                               bufferedWriter5.close();
                                        break;
                                    } catch (Throwable th19) {
/* 157 */                               th18.addSuppressed(th19);
                                    }
/* 160 */                           throw th18;
                                }
                            } catch (Throwable th20) {
                                try {
/* 161 */                           byteArrayOutputStream5.close();
                                    break;
                                } catch (Throwable th21) {
/* 166 */                           th20.addSuppressed(th21);
                                }
/* 169 */                       throw th20;
                            }
                        case 8:
/* 105 */                   return C1272t0.m4938c(((C1263q0) this.f2424b).f10286a, (SentryAndroidOptions) this.f2425c);
                        default:
/* 14 */                    ScreenshotEventProcessor screenshotEventProcessor = (ScreenshotEventProcessor) this.f2424b;
/* 18 */                    Bitmap bitmap = (Bitmap) this.f2425c;
/* 22 */                    ILogger logger = screenshotEventProcessor.f9872a.getLogger();
/* 30 */                    if (!bitmap.isRecycled()) {
                                try {
/* 35 */                            ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                                    try {
/* 40 */                                bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream6);
/* 43 */                                bitmap.recycle();
/* 50 */                                if (byteArrayOutputStream6.size() <= 0) {
/* 58 */                                    logger.mo4672k(EnumC1553m5.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
/* 61 */                                    byteArrayOutputStream6.close();
                                        } else {
/* 69 */                                    byte[] byteArray6 = byteArrayOutputStream6.toByteArray();
/* 73 */                                    byteArrayOutputStream6.close();
/* 76 */                                    bArr = byteArray6;
                                        }
                                    } catch (Throwable th22) {
                                        try {
/* 78 */                                    byteArrayOutputStream6.close();
                                            break;
                                        } catch (Throwable th23) {
/* 83 */                                    th22.addSuppressed(th23);
                                        }
/* 86 */                                throw th22;
                                    }
                                } catch (Throwable th24) {
/* 91 */                            logger.mo4671d(EnumC1553m5.ERROR, "Compressing bitmap failed.", th24);
                                }
                                break;
                            }
/* 94 */                    return bArr;
                    }
                }

/* 11 */        public /* synthetic */ bh0(int i, Object obj, Object obj2) {
/* 12 */            this.f2423a = i;
                    this.f2424b = obj;
                    this.f2425c = obj2;
                }
            }
