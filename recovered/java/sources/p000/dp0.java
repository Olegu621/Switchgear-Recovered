            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.app.job.JobScheduler;
            import android.content.ClipData;
            import android.content.ClipboardManager;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.content.SharedPreferences;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.res.Resources;
            import android.graphics.Typeface;
            import android.location.Criteria;
            import android.location.Location;
            import android.location.LocationManager;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.view.View;
            import android.view.ViewPropertyAnimator;
            import android.webkit.WebView;
            import android.widget.AutoCompleteTextView;
            import android.widget.EditText;
            import androidx.appcompat.widget.C0062b;
            import androidx.recyclerview.widget.AbstractC0137o;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.api.internal.zact;
            import com.google.android.gms.common.internal.IAccountAccessor;
            import com.google.android.gms.common.internal.zav;
            import com.google.android.gms.common.internal.zzt;
            import com.google.android.gms.internal.measurement.zzcu;
            import com.google.android.gms.internal.measurement.zzdd;
            import com.google.android.gms.internal.measurement.zzin;
            import com.google.android.gms.internal.measurement.zzql;
            import com.google.android.gms.internal.play_billing.zzco;
            import com.google.android.gms.measurement.internal.zzw;
            import com.google.android.gms.signin.internal.zak;
            import com.google.android.material.R$string;
            import com.google.android.material.datepicker.AbstractC0350g;
            import com.google.android.material.textfield.TextInputLayout;
            import com.helpshift.views.HSWebView;
            import com.supercell.titan.C0800g;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.HelpshiftTitan;
            import com.supercell.titan.KeyboardDialog;
            import com.supercell.titan.LocationService;
            import com.supercell.titan.VirtualKeyboardHandler;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.C1268s;
            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.InputStream;
            import java.lang.ref.WeakReference;
            import java.security.SecureRandom;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.EnumMap;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Random;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.Unit;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            import org.json.JSONArray;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class dp0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7357a;

                /* JADX INFO: renamed from: b */
                public Object f7358b;

                /* JADX INFO: renamed from: c */
                public final Object f7359c;

                public dp0(sl3 sl3Var, zzcu zzcuVar) {
/* 3 */             this.f7357a = 28;
/* 8 */             this.f7358b = zzcuVar;
/* 10 */            Objects.requireNonNull(sl3Var);
/* 13 */            this.f7359c = sl3Var;
                }

                /* JADX WARN: Code duplicated, block: B:101:0x02c1  */
                /* JADX WARN: Code duplicated, block: B:102:0x02cc  */
                /* JADX WARN: Code duplicated, block: B:105:0x02d6  */
                /* JADX WARN: Code duplicated, block: B:108:0x02ea A[EDGE_INSN: B:108:0x02ea->B:109:0x02ec BREAK  A[LOOP:1: B:103:0x02d0->B:308:?]] */
                /* JADX WARN: Code duplicated, block: B:110:0x02ee  */
                /* JADX WARN: Code duplicated, block: B:111:0x02f5  */
                /* JADX WARN: Code duplicated, block: B:114:0x0312  */
                /* JADX WARN: Code duplicated, block: B:116:0x035c  */
                /* JADX WARN: Code duplicated, block: B:117:0x0365  */
                /* JADX WARN: Code duplicated, block: B:120:0x0387  */
                /* JADX WARN: Code duplicated, block: B:123:0x03c7  */
                /* JADX WARN: Code duplicated, block: B:124:0x03c9  */
                /* JADX WARN: Code duplicated, block: B:127:0x03ce  */
                /* JADX WARN: Code duplicated, block: B:130:0x03da A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:131:0x03dc  */
                /* JADX WARN: Code duplicated, block: B:132:0x03dd A[PHI: r8
  0x03dd: PHI (r8v15 boolean) = (r8v4 boolean), (r8v3 boolean) binds: [B:131:0x03dc, B:128:0x03d7] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:134:0x040e  */
                /* JADX WARN: Code duplicated, block: B:135:0x0426  */
                /* JADX WARN: Code duplicated, block: B:138:0x0451 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:141:0x0459  */
                /* JADX WARN: Code duplicated, block: B:143:0x0471  */
                /* JADX WARN: Code duplicated, block: B:144:0x0484 A[PHI: r28 r29
  0x0484: PHI (r28v2 up3) = (r28v0 up3), (r28v3 up3) binds: [B:142:0x046f, B:140:0x0454] A[DONT_GENERATE, DONT_INLINE]
  0x0484: PHI (r29v2 long) = (r29v0 long), (r29v3 long) binds: [B:142:0x046f, B:140:0x0454] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:146:0x0492 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:157:0x04b4  */
                /* JADX WARN: Code duplicated, block: B:158:0x04bc  */
                /* JADX WARN: Code duplicated, block: B:161:0x04e5  */
                /* JADX WARN: Code duplicated, block: B:164:0x04f5  */
                /* JADX WARN: Code duplicated, block: B:167:0x0514  */
                /* JADX WARN: Code duplicated, block: B:169:0x0522 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:173:0x0538  */
                /* JADX WARN: Code duplicated, block: B:175:0x0546 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:183:0x0568  */
                /* JADX WARN: Code duplicated, block: B:188:0x057f  */
                /* JADX WARN: Code duplicated, block: B:190:0x0585  */
                /* JADX WARN: Code duplicated, block: B:192:0x05a3  */
                /* JADX WARN: Code duplicated, block: B:196:0x05d2  */
                /* JADX WARN: Code duplicated, block: B:197:0x05e4  */
                /* JADX WARN: Code duplicated, block: B:200:0x05f1  */
                /* JADX WARN: Code duplicated, block: B:205:0x060a  */
                /* JADX WARN: Code duplicated, block: B:207:0x0610  */
                /* JADX WARN: Code duplicated, block: B:209:0x061a  */
                /* JADX WARN: Code duplicated, block: B:210:0x0625  */
                /* JADX WARN: Code duplicated, block: B:213:0x062f  */
                /* JADX WARN: Code duplicated, block: B:216:0x0645  */
                /* JADX WARN: Code duplicated, block: B:220:0x0651  */
                /* JADX WARN: Code duplicated, block: B:223:0x065f  */
                /* JADX WARN: Code duplicated, block: B:226:0x0673  */
                /* JADX WARN: Code duplicated, block: B:227:0x0678  */
                /* JADX WARN: Code duplicated, block: B:229:0x068a  */
                /* JADX WARN: Code duplicated, block: B:231:0x06aa A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:242:0x0720  */
                /* JADX WARN: Code duplicated, block: B:244:0x073c  */
                /* JADX WARN: Code duplicated, block: B:247:0x0748  */
                /* JADX WARN: Code duplicated, block: B:256:0x0792  */
                /* JADX WARN: Code duplicated, block: B:258:0x079a  */
                /* JADX WARN: Code duplicated, block: B:259:0x079c  */
                /* JADX WARN: Code duplicated, block: B:261:0x07a4  */
                /* JADX WARN: Code duplicated, block: B:265:0x07b1  */
                /* JADX WARN: Code duplicated, block: B:269:0x07e6  */
                /* JADX WARN: Code duplicated, block: B:271:0x07f1  */
                /* JADX WARN: Code duplicated, block: B:273:0x0822  */
                /* JADX WARN: Code duplicated, block: B:276:0x0838  */
                /* JADX WARN: Code duplicated, block: B:280:0x084c  */
                /* JADX WARN: Code duplicated, block: B:293:0x0293 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:304:0x0570 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:305:? A[LOOP:0: B:181:0x0562->B:305:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:306:0x02ea A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:37:0x0171 A[Catch: NameNotFoundException -> 0x018e, TryCatch #4 {NameNotFoundException -> 0x018e, blocks: (B:35:0x0166, B:37:0x0171, B:39:0x017d), top: B:297:0x0166 }] */
                /* JADX WARN: Code duplicated, block: B:39:0x017d A[Catch: NameNotFoundException -> 0x018e, TRY_LEAVE, TryCatch #4 {NameNotFoundException -> 0x018e, blocks: (B:35:0x0166, B:37:0x0171, B:39:0x017d), top: B:297:0x0166 }] */
                /* JADX WARN: Code duplicated, block: B:41:0x0182  */
                /* JADX WARN: Code duplicated, block: B:50:0x01b9  */
                /* JADX WARN: Code duplicated, block: B:52:0x01bc  */
                /* JADX WARN: Code duplicated, block: B:54:0x01bf  */
                /* JADX WARN: Code duplicated, block: B:56:0x01c2  */
                /* JADX WARN: Code duplicated, block: B:58:0x01c5  */
                /* JADX WARN: Code duplicated, block: B:60:0x01c8  */
                /* JADX WARN: Code duplicated, block: B:62:0x01cc  */
                /* JADX WARN: Code duplicated, block: B:63:0x01e1  */
                /* JADX WARN: Code duplicated, block: B:64:0x01ec  */
                /* JADX WARN: Code duplicated, block: B:65:0x01f7  */
                /* JADX WARN: Code duplicated, block: B:66:0x0202  */
                /* JADX WARN: Code duplicated, block: B:67:0x020d  */
                /* JADX WARN: Code duplicated, block: B:68:0x0218  */
                /* JADX WARN: Code duplicated, block: B:69:0x0223  */
                /* JADX WARN: Code duplicated, block: B:73:0x023b  */
                /* JADX WARN: Code duplicated, block: B:74:0x023c  */
                /* JADX WARN: Code duplicated, block: B:77:0x0241 A[Catch: IllegalStateException -> 0x0251, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x0251, blocks: (B:71:0x022f, B:75:0x023d, B:77:0x0241), top: B:291:0x022f }] */
                /* JADX WARN: Code duplicated, block: B:83:0x0274  */
                /* JADX WARN: Code duplicated, block: B:85:0x0282  */
                /* JADX WARN: Code duplicated, block: B:88:0x0289  */
                /* JADX WARN: Code duplicated, block: B:92:0x02a3  */
                /* JADX WARN: Code duplicated, block: B:93:0x02a5 A[Catch: NotFoundException -> 0x02aa, TRY_LEAVE, TryCatch #2 {NotFoundException -> 0x02aa, blocks: (B:90:0x0293, B:93:0x02a5), top: B:293:0x0293 }] */
                /* JADX WARN: Code duplicated, block: B:99:0x02bb  */
                /* JADX WARN: Type inference failed for: r0v46, types: [rl3] */
                /* JADX INFO: renamed from: a */
                private final void m3169a() {
                    ih3 ih3Var;
                    ij3 ij3Var;
                    String string;
                    int i;
                    String str;
                    PackageInfo packageInfo;
                    CharSequence applicationLabel;
                    int iM4563g;
                    ij3 ij3Var2;
                    Bundle bundleM7407K;
                    Integer numValueOf;
                    String[] stringArray;
                    List listAsList;
                    xl3 xl3Var;
                    sh3 sh3Var;
                    sh3 sh3Var2;
                    sh3 sh3Var3;
                    sh3 sh3Var4;
                    String strM4534F;
                    int i2;
                    AtomicInteger atomicInteger;
                    long j;
                    final sl3 sl3Var;
                    zzin zzinVarM9976E;
                    zzin zzinVar;
                    boolean zM7406J;
                    boolean z;
                    ij3 ij3Var3;
                    sh3 sh3Var5;
                    C2220tj c2220tj;
                    ok3 ok3VarM6116G;
                    lk3 lk3VarM7411O;
                    ij3 ij3Var4;
                    lk3 lk3VarM7411O2;
                    lk3 lk3Var;
                    nk3 nk3Var;
                    up3 up3Var;
                    long j2;
                    ok3 ok3Var;
                    ij3 ij3Var5;
                    lk3 lk3VarM7411O3;
                    lk3 lk3VarM7411O4;
                    Bundle bundle;
                    ce3 ce3VarM1647c;
                    Iterator it;
                    Boolean boolM7408L;
                    C1268s c1268s;
                    long j3;
                    oi3 oi3Var;
                    ij3 ij3Var6;
                    up3 up3Var2;
                    C2220tj c2220tj2;
                    uh3 uh3Var;
                    boolean zM4560d;
                    SharedPreferences sharedPreferences;
                    boolean zContains;
                    boolean zIsEmpty;
                    long jMax;
                    sh3 sh3Var6;
                    Context context;
                    boolean z2;
                    Iterator it2;
                    String str2;
                    up3 up3Var3;
                    String strM7886S;
/* 6 */             ij3 ij3Var7 = (ij3) this.f7359c;
/* 10 */            sk3 sk3Var = (sk3) this.f7358b;
/* 12 */            bj3 bj3Var = ij3Var7.f9659i;
/* 14 */            uh3 uh3Var2 = ij3Var7.f9655f;
/* 16 */            ki3 ki3Var = ij3Var7.f9653e;
/* 18 */            up3 up3Var4 = ij3Var7.f9668w;
/* 20 */            ij3.m4555l(bj3Var);
/* 23 */            bj3Var.mo1375y();
/* 26 */            pd3 pd3Var = ij3Var7.f9651d;
/* 32 */            ((ij3) pd3Var.f16749a).getClass();
/* 37 */            me3 me3Var = new me3(ij3Var7);
/* 40 */            me3Var.m4241C();
/* 43 */            ij3Var7.f9652d0 = me3Var;
/* 45 */            zzdd zzddVar = sk3Var.f16666d;
/* 60 */            ih3 ih3Var2 = new ih3(ij3Var7, sk3Var.f16665c, zzddVar == null ? 0L : zzddVar.zza);
/* 63 */            ih3Var2.m9577B();
/* 66 */            ij3Var7.f9654e0 = ih3Var2;
/* 70 */            lh3 lh3Var = new lh3(ij3Var7);
/* 73 */            lh3Var.m9577B();
/* 76 */            ij3Var7.f9648b0 = lh3Var;
/* 80 */            pn3 pn3Var = new pn3(ij3Var7);
/* 83 */            pn3Var.m9577B();
/* 86 */            ij3Var7.f9650c0 = pn3Var;
/* 88 */            boolean z3 = up3Var4.f9127b;
/* 92 */            ij3 ij3Var8 = (ij3) up3Var4.f16749a;
/* 96 */            if (z3) {
/* 2143 */              f42.m3656l("Can't initialize twice");
/* 2146 */              return;
                    }
/* 98 */            up3Var4.mo1375y();
/* 103 */           SecureRandom secureRandom = new SecureRandom();
/* 106 */           long jNextLong = secureRandom.nextLong();
/* 112 */           if (jNextLong == 0) {
/* 114 */               jNextLong = secureRandom.nextLong();
/* 120 */               if (jNextLong == 0) {
/* 126 */                   uh3 uh3Var3 = ((ij3) up3Var4.f16749a).f9655f;
/* 128 */                   ij3.m4555l(uh3Var3);
/* 135 */                   uh3Var3.f17541w.m8510a("Utils falling back to Random for random id");
                        }
                    }
/* 140 */           up3Var4.f17626d.set(jNextLong);
/* 145 */           ij3Var8.f9665n0.incrementAndGet();
/* 149 */           up3Var4.f9127b = true;
/* 153 */           if (ki3Var.f9127b) {
/* 2137 */              f42.m3656l("Can't initialize twice");
/* 2140 */              return;
                    }
/* 164 */           SharedPreferences sharedPreferences2 = ((ij3) ki3Var.f16749a).f9645a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
/* 168 */           ki3Var.f12803c = sharedPreferences2;
/* 172 */           boolean z4 = sharedPreferences2.getBoolean("has_been_opened", false);
/* 176 */           ki3Var.f12804c0 = z4;
/* 178 */           if (!z4) {
/* 182 */               SharedPreferences.Editor editorEdit = ki3Var.f12803c.edit();
/* 186 */               editorEdit.putBoolean("has_been_opened", true);
/* 189 */               editorEdit.apply();
                    }
/* 214 */           ki3Var.f12807e = new ji3(ki3Var, Math.max(0L, ((Long) vg3.f18124d.m9011a(null)).longValue()));
/* 222 */           ((ij3) ki3Var.f16749a).f9665n0.incrementAndGet();
/* 225 */           ki3Var.f9127b = true;
/* 227 */           ih3 ih3Var3 = ij3Var7.f9654e0;
/* 231 */           if (ih3Var3.f18620b) {
/* 2131 */              f42.m3656l("Can't initialize twice");
/* 2134 */              return;
                    }
/* 236 */           ij3 ij3Var9 = (ij3) ih3Var3.f16749a;
/* 238 */           uh3 uh3Var4 = ij3Var9.f9655f;
/* 240 */           uh3 uh3Var5 = ij3Var9.f9655f;
/* 242 */           ij3.m4555l(uh3Var4);
/* 264 */           uh3Var4.f17534Y.m8512c(Long.valueOf(ih3Var3.f9589U), "sdkVersion bundled with app, dynamiteVersion", Long.valueOf(ih3Var3.f9603w));
/* 267 */           Context context2 = ij3Var9.f9645a;
/* 269 */           String packageName = context2.getPackageName();
/* 273 */           PackageManager packageManager = context2.getPackageManager();
/* 277 */           String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 281 */           String str4 = "Unknown";
/* 283 */           String installerPackageName = "unknown";
                    try {
/* 285 */               if (packageManager != null) {
/* 316 */                   ih3Var = ih3Var2;
/* 318 */                   ij3Var = ij3Var8;
                            try {
/* 320 */                       installerPackageName = packageManager.getInstallerPackageName(packageName);
                            } catch (IllegalArgumentException unused) {
/* 327 */                       ij3.m4555l(uh3Var5);
/* 338 */                       uh3Var5.f17538f.m8511b(uh3.m9013H(packageName), "Error retrieving app installer package name. appId");
                            }
/* 324 */                   String str5 = installerPackageName;
                            try {
/* 342 */                       if (str5 != null) {
/* 355 */                           if ("com.android.vending".equals(str5)) {
/* 357 */                               installerPackageName = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 364 */                           packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
/* 368 */                           if (packageInfo != null) {
/* 372 */                               applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
/* 380 */                               if (TextUtils.isEmpty(applicationLabel)) {
/* 281 */                                   string = "Unknown";
                                        } else {
/* 382 */                                   string = applicationLabel.toString();
                                        }
                                        try {
/* 389 */                                   str = packageInfo.versionName;
                                            try {
/* 391 */                                       i = packageInfo.versionCode;
                                            } catch (PackageManager.NameNotFoundException unused2) {
/* 396 */                                       str4 = str;
/* 401 */                                       ij3.m4555l(uh3Var5);
/* 414 */                                       uh3Var5.f17538f.m8512c(uh3.m9013H(packageName), "Error retrieving package info. appId, appName", string);
/* 417 */                                       i = Integer.MIN_VALUE;
/* 419 */                                       str = str4;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused3) {
                                        }
                                    }
/* 312 */                           String str6 = installerPackageName;
/* 422 */                           ih3Var3.f9597c = packageName;
/* 424 */                           ih3Var3.f9600f = str6;
/* 426 */                           ih3Var3.f9598d = str;
/* 428 */                           ih3Var3.f9599e = i;
/* 430 */                           ih3Var3.f9601i = string;
/* 434 */                           ih3Var3.f9602v = 0L;
/* 436 */                           iM4563g = ij3Var9.m4563g();
/* 440 */                           if (iM4563g == 0) {
/* 548 */                               ij3.m4555l(uh3Var5);
/* 555 */                               uh3Var5.f17534Y.m8510a("App measurement collection enabled");
                                    } else if (iM4563g == 1) {
/* 537 */                               ij3.m4555l(uh3Var5);
/* 544 */                               uh3Var5.f17532W.m8510a("App measurement deactivated via the manifest");
                                    } else if (iM4563g == 3) {
/* 526 */                               ij3.m4555l(uh3Var5);
/* 533 */                               uh3Var5.f17532W.m8510a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                    } else if (iM4563g == 4) {
/* 515 */                               ij3.m4555l(uh3Var5);
/* 522 */                               uh3Var5.f17532W.m8510a("App measurement disabled via the manifest");
                                    } else if (iM4563g == 6) {
/* 504 */                               ij3.m4555l(uh3Var5);
/* 511 */                               uh3Var5.f17531V.m8510a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                    } else if (iM4563g == 7) {
/* 493 */                               ij3.m4555l(uh3Var5);
/* 500 */                               uh3Var5.f17532W.m8510a("App measurement disabled via the global data collection setting");
                                    } else if (iM4563g != 8) {
/* 461 */                               ij3.m4555l(uh3Var5);
/* 468 */                               uh3Var5.f17532W.m8510a("App measurement disabled");
/* 471 */                               ij3.m4555l(uh3Var5);
/* 478 */                               uh3Var5.f17539i.m8510a("Invalid scion state in identity");
                                    } else {
/* 482 */                               ij3.m4555l(uh3Var5);
/* 489 */                               uh3Var5.f17532W.m8510a("App measurement disabled due to denied storage consent");
                                    }
/* 558 */                           ih3Var3.f9593Y = HttpUrl.FRAGMENT_ENCODE_SET;
/* 562 */                           strM7886S = qj3.m7886S(context2, ij3Var9.f9646a0);
/* 570 */                           if (!TextUtils.isEmpty(strM7886S)) {
/* 573 */                               str3 = strM7886S;
                                    }
/* 574 */                           ih3Var3.f9593Y = str3;
/* 576 */                           if (iM4563g == 0) {
/* 578 */                               ij3.m4555l(uh3Var5);
/* 589 */                               uh3Var5.f17534Y.m8512c(ih3Var3.f9597c, "App measurement enabled for app package, google app id", ih3Var3.f9593Y);
                                    }
/* 610 */                           ih3Var3.f9590V = null;
/* 612 */                           pd3 pd3Var2 = ij3Var9.f9651d;
/* 616 */                           ij3Var2 = (ij3) pd3Var2.f16749a;
/* 620 */                           kb1.m6058k("analytics.safelisted_events");
/* 623 */                           bundleM7407K = pd3Var2.m7407K();
/* 627 */                           if (bundleM7407K != null) {
/* 647 */                               if (bundleM7407K.containsKey("analytics.safelisted_events")) {
/* 654 */                                   numValueOf = Integer.valueOf(bundleM7407K.getInt("analytics.safelisted_events"));
                                        }
/* 658 */                               if (numValueOf != null) {
                                            try {
/* 670 */                                       stringArray = ij3Var2.f9645a.getResources().getStringArray(numValueOf.intValue());
/* 674 */                                       if (stringArray == null) {
/* 676 */                                           listAsList = null;
                                                } else {
/* 678 */                                           listAsList = Arrays.asList(stringArray);
                                                }
                                            } catch (Resources.NotFoundException e) {
/* 684 */                                       uh3 uh3Var6 = ij3Var2.f9655f;
/* 686 */                                       ij3.m4555l(uh3Var6);
/* 693 */                                       uh3Var6.f17538f.m8511b(e, "Failed to load string array from metadata: resource not found");
                                            }
                                        } else {
/* 676 */                                   listAsList = null;
                                        }
/* 697 */                               if (listAsList != null) {
/* 747 */                                   ih3Var3.f9590V = listAsList;
                                            break;
                                        }
/* 704 */                               if (listAsList.isEmpty()) {
/* 717 */                                   it2 = listAsList.iterator();
/* 744 */                                   do {
/* 725 */                                       if (it2.hasNext()) {
/* 747 */                                           ih3Var3.f9590V = listAsList;
                                                    break;
                                                } else {
/* 731 */                                           str2 = (String) it2.next();
/* 733 */                                           up3Var3 = ij3Var9.f9668w;
/* 735 */                                           ij3.m4553j(up3Var3);
                                                }
/* 744 */                                   } while (up3Var3.m9075A0("safelisted event", str2));
                                        } else {
/* 706 */                                   ij3.m4555l(uh3Var5);
/* 713 */                                   uh3Var5.f17531V.m8510a("Safelisted event list is empty. Ignoring");
                                        }
/* 749 */                               if (packageManager != null) {
/* 755 */                                   ih3Var3.f9592X = py0.m7609p0(context2) ? 1 : 0;
                                        } else {
/* 759 */                                   ih3Var3.f9592X = 0;
                                        }
/* 767 */                               ((ij3) ih3Var3.f16749a).f9665n0.incrementAndGet();
/* 771 */                               ih3Var3.f18620b = true;
/* 775 */                               xl3Var = new xl3(ij3Var7);
/* 778 */                               xl3Var.m9577B();
/* 781 */                               ij3Var7.f9656f0 = xl3Var;
/* 785 */                               if (!xl3Var.f18620b) {
/* 2125 */                                  f42.m3656l("Can't initialize twice");
/* 2128 */                                  return;
                                        }
/* 801 */                               xl3Var.f19246c = (JobScheduler) ((ij3) xl3Var.f16749a).f9645a.getSystemService("jobscheduler");
/* 809 */                               ((ij3) xl3Var.f16749a).f9665n0.incrementAndGet();
/* 813 */                               xl3Var.f18620b = true;
/* 815 */                               ij3.m4555l(uh3Var2);
/* 818 */                               sh3Var = uh3Var2.f17533X;
/* 820 */                               sh3Var2 = uh3Var2.f17532W;
/* 822 */                               sh3Var3 = uh3Var2.f17534Y;
/* 824 */                               sh3Var4 = uh3Var2.f17538f;
/* 826 */                               pd3Var.m7401E();
/* 838 */                               sh3Var2.m8511b(130000L, "App measurement initialized, version");
/* 841 */                               ij3.m4555l(uh3Var2);
/* 846 */                               sh3Var2.m8510a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
/* 849 */                               strM4534F = ih3Var.m4534F();
/* 859 */                               if (up3Var4.m9098Z(strM4534F, pd3Var.f15074c)) {
/* 861 */                                   ij3.m4555l(uh3Var2);
/* 866 */                                   sh3Var2.m8510a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                        } else {
/* 870 */                                   ij3.m4555l(uh3Var2);
/* 883 */                                   sh3Var2.m8510a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM4534F)));
                                        }
/* 886 */                               ij3.m4555l(uh3Var2);
/* 891 */                               sh3Var.m8510a("Debug-level message logging enabled");
/* 894 */                               i2 = ij3Var7.f9663l0;
/* 896 */                               atomicInteger = ij3Var7.f9665n0;
/* 902 */                               if (i2 != atomicInteger.get()) {
/* 904 */                                   ij3.m4555l(uh3Var2);
/* 923 */                                   sh3Var4.m8512c(Integer.valueOf(ij3Var7.f9663l0), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                                        }
/* 927 */                               ij3Var7.f9657g0 = true;
/* 929 */                               j = ij3Var7.f9666o0;
/* 931 */                               sl3Var = ij3Var7.f9642X;
/* 933 */                               bj3 bj3Var2 = ij3Var7.f9659i;
/* 935 */                               ij3.m4555l(bj3Var2);
/* 938 */                               bj3Var2.mo1375y();
/* 943 */                               ij3.m4552i(ij3Var7.f9656f0);
/* 948 */                               zzinVarM9976E = ij3Var7.f9656f0.m9976E();
/* 952 */                               zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
/* 954 */                               zzql.zza();
/* 962 */                               zM7406J = pd3Var.m7406J(null, vg3.f18096Q0);
/* 966 */                               if (zzinVarM9976E == zzinVar) {
/* 968 */                                   z = true;
                                        } else {
/* 970 */                                   z = false;
                                        }
/* 973 */                               if (zM7406J) {
/* 975 */                                   up3Var4.mo1375y();
/* 984 */                                   if (up3Var4.m9096U() == 1) {
/* 990 */                                       up3Var4.mo1375y();
/* 995 */                                       IntentFilter intentFilter = new IntentFilter();
/* 1000 */                                      intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                                      intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                                      ij3Var3 = ij3Var;
/* 1015 */                                      z2 = z;
/* 1019 */                                      sh3Var5 = sh3Var2;
/* 1022 */                                      v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter, 2);
/* 1025 */                                      uh3 uh3Var7 = ij3Var3.f9655f;
/* 1027 */                                      ij3.m4555l(uh3Var7);
/* 1034 */                                      uh3Var7.f17533X.m8510a("Registered app receiver");
/* 1037 */                                      if (z2) {
/* 1041 */                                          ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                                          ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                                }
                                            } else if (z) {
/* 989 */                                       z = true;
/* 990 */                                       up3Var4.mo1375y();
/* 995 */                                       IntentFilter intentFilter2 = new IntentFilter();
/* 1000 */                                      intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                                      intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                                      ij3Var3 = ij3Var;
/* 1015 */                                      z2 = z;
/* 1019 */                                      sh3Var5 = sh3Var2;
/* 1022 */                                      v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter2, 2);
/* 1025 */                                      uh3 uh3Var8 = ij3Var3.f9655f;
/* 1027 */                                      ij3.m4555l(uh3Var8);
/* 1034 */                                      uh3Var8.f17533X.m8510a("Registered app receiver");
/* 1037 */                                      if (z2) {
/* 1041 */                                          ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                                          ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                                }
                                            } else {
/* 1063 */                                      ij3Var3 = ij3Var;
/* 1065 */                                      sh3Var5 = sh3Var2;
                                            }
                                        } else if (z) {
/* 989 */                                   z = true;
/* 990 */                                   up3Var4.mo1375y();
/* 995 */                                   IntentFilter intentFilter3 = new IntentFilter();
/* 1000 */                                  intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                                  intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                                  ij3Var3 = ij3Var;
/* 1015 */                                  z2 = z;
/* 1019 */                                  sh3Var5 = sh3Var2;
/* 1022 */                                  v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter3, 2);
/* 1025 */                                  uh3 uh3Var9 = ij3Var3.f9655f;
/* 1027 */                                  ij3.m4555l(uh3Var9);
/* 1034 */                                  uh3Var9.f17533X.m8510a("Registered app receiver");
/* 1037 */                                  if (z2) {
/* 1041 */                                      ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                                      ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                            }
                                        } else {
/* 1063 */                                  ij3Var3 = ij3Var;
/* 1065 */                                  sh3Var5 = sh3Var2;
                                        }
/* 1067 */                              c2220tj = ki3Var.f12813i;
/* 1069 */                              ok3VarM6116G = ki3Var.m6116G();
/* 1073 */                              int i3 = ok3VarM6116G.f14793b;
/* 1080 */                              lk3VarM7411O = pd3Var.m7411O("google_analytics_default_allow_ad_storage", false);
/* 1084 */                              ij3Var4 = ij3Var3;
/* 1088 */                              lk3VarM7411O2 = pd3Var.m7411O("google_analytics_default_allow_analytics_storage", false);
/* 1092 */                              lk3Var = lk3.UNINITIALIZED;
/* 1096 */                              nk3Var = nk3.ANALYTICS_STORAGE;
/* 1104 */                              if (lk3VarM7411O == lk3Var || lk3VarM7411O2 != lk3Var) {
/* 1118 */                                  up3Var = up3Var4;
/* 1122 */                                  j2 = j;
/* 1136 */                                  if (ok3.m7186l(-10, ki3Var.m6113D().getInt("consent_source", 100))) {
/* 1140 */                                      EnumMap enumMap = new EnumMap(nk3.class);
/* 1145 */                                      enumMap.put(nk3.AD_STORAGE, lk3VarM7411O);
/* 1148 */                                      enumMap.put(nk3Var, lk3VarM7411O2);
/* 1153 */                                      ok3Var = new ok3(enumMap, -10);
                                            }
/* 1203 */                                  if (ok3Var != null) {
/* 1205 */                                      ij3.m4554k(sl3Var);
/* 1209 */                                      sl3Var.m8570U(ok3Var, true);
                                            } else {
/* 1213 */                                      ok3Var = ok3VarM6116G;
                                            }
/* 1215 */                                  ij3.m4554k(sl3Var);
/* 1220 */                                  ij3Var5 = (ij3) sl3Var.f16749a;
/* 1222 */                                  sl3Var.m8553D(ok3Var);
/* 1225 */                                  ki3Var.mo1375y();
/* 1243 */                                  int i4 = ce3.m1646b(ki3Var.m6113D().getString("dma_consent_settings", null)).f2866a;
/* 1248 */                                  lk3VarM7411O3 = pd3Var.m7411O("google_analytics_default_allow_ad_personalization_signals", true);
/* 1252 */                                  if (lk3VarM7411O3 != lk3Var) {
/* 1254 */                                      ij3.m4555l(uh3Var2);
/* 1259 */                                      sh3Var3.m8511b(lk3VarM7411O3, "Default ad personalization consent from Manifest");
                                            }
/* 1264 */                                  lk3VarM7411O4 = pd3Var.m7411O("google_analytics_default_allow_ad_user_data", true);
/* 1268 */                                  if (lk3VarM7411O4 == lk3Var && ok3.m7186l(-10, i4)) {
/* 1278 */                                      ij3.m4554k(sl3Var);
/* 1283 */                                      EnumMap enumMap2 = new EnumMap(nk3.class);
/* 1288 */                                      enumMap2.put(nk3.AD_USER_DATA, lk3VarM7411O4);
/* 1297 */                                      sl3Var.m8569T(new ce3(enumMap2, -10, (Boolean) null, (String) null), true);
                                            } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G()) && (i4 == 0 || i4 == 30)) {
/* 1321 */                                      ij3.m4554k(sl3Var);
/* 1333 */                                      sl3Var.m8569T(new ce3((Boolean) null, -10, (Boolean) null, (String) null), true);
                                            } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G()) && zzddVar != null && (bundle = zzddVar.zzd) != null && ok3.m7186l(30, i4)) {
/* 1365 */                                      ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                                      it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                                      while (it.hasNext()) {
/* 1391 */                                          if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                              ij3.m4554k(sl3Var);
/* 1397 */                                              sl3Var.m8569T(ce3VarM1647c, true);
                                                        break;
                                                    }
                                                }
                                            }
/* 1402 */                                  boolM7408L = pd3Var.m7408L("google_analytics_tcf_data_enabled");
/* 1406 */                                  if (boolM7408L != null || boolM7408L.booleanValue()) {
/* 1414 */                                      ij3.m4555l(uh3Var2);
/* 1419 */                                      sh3Var.m8510a("TCF client enabled.");
/* 1422 */                                      ij3.m4554k(sl3Var);
/* 1425 */                                      sl3Var.mo1375y();
/* 1428 */                                      uh3 uh3Var10 = ij3Var5.f9655f;
/* 1430 */                                      ij3.m4555l(uh3Var10);
/* 1437 */                                      uh3Var10.f17533X.m8510a("Register tcfPrefChangeListener.");
/* 1442 */                                      if (sl3Var.f16691f0 == null) {
/* 1450 */                                          sl3Var.f16692g0 = new wk3(sl3Var, ij3Var5, 2);
/* 1457 */                                          sl3Var.f16691f0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rl3
                                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
/* 1 */                                                     sl3 sl3Var2 = sl3Var;
/* 5 */                                                     ij3 ij3Var10 = (ij3) sl3Var2.f16749a;
/* 7 */                                                     pd3 pd3Var3 = ij3Var10.f9651d;
/* 9 */                                                     uh3 uh3Var11 = ij3Var10.f9655f;
/* 24 */                                                    if (!pd3Var3.m7406J(null, vg3.f18114Z0)) {
/* 30 */                                                        if (Objects.equals(str7, "IABTCF_TCString")) {
/* 32 */                                                            ij3.m4555l(uh3Var11);
/* 37 */                                                            uh3Var11.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 40 */                                                            wk3 wk3Var = sl3Var2.f16692g0;
/* 42 */                                                            kb1.m6061n(wk3Var);
/* 45 */                                                            wk3Var.m1348b(500L);
/* 48 */                                                            return;
                                                                }
/* 72 */                                                        return;
                                                            }
/* 53 */                                                    if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
/* 73 */                                                        ij3.m4555l(uh3Var11);
/* 78 */                                                        uh3Var11.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 81 */                                                        wk3 wk3Var2 = sl3Var2.f16692g0;
/* 83 */                                                        kb1.m6061n(wk3Var2);
/* 86 */                                                        wk3Var2.m1348b(500L);
                                                            }
                                                        }
                                                    };
                                                }
/* 1459 */                                      ki3 ki3Var2 = ij3Var5.f9653e;
/* 1461 */                                      ij3.m4553j(ki3Var2);
/* 1470 */                                      ki3Var2.m6114E().registerOnSharedPreferenceChangeListener(sl3Var.f16691f0);
/* 1473 */                                      ij3.m4554k(sl3Var);
/* 1476 */                                      sl3Var.m8555F();
                                            }
/* 1479 */                                  c1268s = ki3Var.f12809f;
/* 1489 */                                  if (c1268s.m4932a() == 0) {
/* 1491 */                                      ij3.m4555l(uh3Var2);
/* 1500 */                                      sh3Var3.m8511b(Long.valueOf(j2), "Persisting first open");
/* 1503 */                                      j3 = j2;
/* 1505 */                                      c1268s.m4933b(j3);
                                            } else {
/* 1509 */                                      j3 = j2;
                                            }
/* 1511 */                                  ij3.m4554k(sl3Var);
/* 1514 */                                  oi3Var = sl3Var.f16685c0;
/* 1520 */                                  if (oi3Var.m7178d() && oi3Var.m7177c()) {
/* 1530 */                                      ki3 ki3Var3 = oi3Var.f14773b.f9653e;
/* 1532 */                                      ij3.m4553j(ki3Var3);
/* 1538 */                                      ki3Var3.f12812h0.m8806n(null);
                                            }
/* 1545 */                                  if (ij3Var7.m4564h()) {
/* 1657 */                                      ij3Var6 = ij3Var7;
/* 1659 */                                      up3Var2 = up3Var;
/* 1673 */                                      if (TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1853 */                                          c2220tj2 = c2220tj;
                                                } else {
/* 1679 */                                          String strM4535G = ij3Var6.m4569q().m4535G();
/* 1683 */                                          ki3Var.mo1375y();
/* 1693 */                                          String string2 = ki3Var.m6113D().getString("gmp_app_id", null);
/* 1697 */                                          zIsEmpty = TextUtils.isEmpty(strM4535G);
/* 1701 */                                          boolean zIsEmpty2 = TextUtils.isEmpty(string2);
/* 1705 */                                          if (!zIsEmpty || zIsEmpty2) {
/* 1825 */                                              c2220tj2 = c2220tj;
                                                    } else {
/* 1709 */                                              kb1.m6061n(strM4535G);
/* 1716 */                                              if (strM4535G.equals(string2)) {
/* 1825 */                                                  c2220tj2 = c2220tj;
                                                        } else {
/* 1718 */                                                  ij3.m4555l(uh3Var2);
/* 1725 */                                                  sh3Var5.m8510a("Rechecking which service to use due to a GMP App Id change");
/* 1728 */                                                  ki3Var.mo1375y();
/* 1731 */                                                  ki3Var.mo1375y();
/* 1760 */                                                  Boolean boolValueOf = ki3Var.m6113D().contains("measurement_enabled") ? Boolean.valueOf(ki3Var.m6113D().getBoolean("measurement_enabled", true)) : null;
/* 1765 */                                                  SharedPreferences.Editor editorEdit2 = ki3Var.m6113D().edit();
/* 1769 */                                                  editorEdit2.clear();
/* 1772 */                                                  editorEdit2.apply();
/* 1775 */                                                  if (boolValueOf != null) {
/* 1777 */                                                      ki3Var.mo1375y();
/* 1784 */                                                      SharedPreferences.Editor editorEdit3 = ki3Var.m6113D().edit();
/* 1792 */                                                      editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
/* 1795 */                                                      editorEdit3.apply();
                                                            }
/* 1802 */                                                  ij3Var6.m4566n().m6449D();
/* 1807 */                                                  ij3Var6.f9650c0.m7512H();
/* 1812 */                                                  ij3Var6.f9650c0.m7510F();
/* 1815 */                                                  c1268s.m4933b(j3);
/* 1818 */                                                  c2220tj2 = c2220tj;
/* 1821 */                                                  c2220tj2.m8806n(null);
                                                        }
                                                    }
/* 1831 */                                          String strM4535G2 = ij3Var6.m4569q().m4535G();
/* 1835 */                                          ki3Var.mo1375y();
/* 1842 */                                          SharedPreferences.Editor editorEdit4 = ki3Var.m6113D().edit();
/* 1846 */                                          editorEdit4.putString("gmp_app_id", strM4535G2);
/* 1849 */                                          editorEdit4.apply();
                                                }
/* 1863 */                                      if (!ki3Var.m6116G().m7189i(nk3Var)) {
/* 1866 */                                          c2220tj2.m8806n(null);
                                                }
/* 1869 */                                      ij3.m4554k(sl3Var);
/* 1878 */                                      sl3Var.f16694i.set(c2220tj2.m8805m());
                                                try {
/* 1891 */                                          ij3Var4.f9645a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                                } catch (ClassNotFoundException unused4) {
/* 1897 */                                          C2220tj c2220tj3 = ki3Var.f12811g0;
/* 1907 */                                          if (!TextUtils.isEmpty(c2220tj3.m8805m())) {
/* 1909 */                                              ij3.m4555l(uh3Var2);
/* 1912 */                                              uh3Var = uh3Var2;
/* 1918 */                                              uh3Var.f17541w.m8510a("Remote config removed with active feature rollouts");
/* 1922 */                                              c2220tj3.m8806n(null);
                                                    }
/* 1937 */                                          if (!TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1939 */                                              zM4560d = ij3Var6.m4560d();
/* 1943 */                                              sharedPreferences = ki3Var.f12803c;
/* 1945 */                                              if (sharedPreferences == null) {
/* 1947 */                                                  zContains = false;
                                                        } else {
/* 1951 */                                                  zContains = sharedPreferences.contains("deferred_analytics_collection");
                                                        }
/* 1955 */                                              if (!zContains) {
/* 1965 */                                                  ki3Var.m6118I(!zM4560d);
                                                        }
/* 1968 */                                              if (zM4560d) {
/* 1970 */                                                  ij3.m4554k(sl3Var);
/* 1973 */                                                  sl3Var.m8561L();
                                                        }
/* 1976 */                                              lo3 lo3Var = ij3Var6.f9667v;
/* 1978 */                                              ij3.m4554k(lo3Var);
/* 1983 */                                              lo3Var.f13437e.m7455a();
/* 1995 */                                              ij3Var6.m4567o().m7508D(new AtomicReference());
/* 2008 */                                              ij3Var6.m4567o().m7509E(ki3Var.f12815j0.m8119x());
                                                    }
/* 2011 */                                          zzql.zza();
/* 2021 */                                          if (pd3Var.m7406J(null, vg3.f18096Q0)) {
/* 2023 */                                              up3Var2.mo1375y();
/* 2032 */                                              if (up3Var2.m9096U() == 1) {
/* 2042 */                                                  long jIntValue = ((Integer) vg3.f18172x0.m9011a(null)).intValue();
/* 2054 */                                                  long jNextInt = new Random().nextInt(5000);
/* 2065 */                                                  ij3Var6.f9640V.getClass();
/* 2075 */                                                  jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
/* 2081 */                                                  if (jMax > 500) {
/* 2083 */                                                      ij3.m4555l(uh3Var);
/* 2092 */                                                      sh3Var3.m8511b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                            }
/* 2095 */                                                  ij3.m4554k(sl3Var);
/* 2098 */                                                  sl3Var.mo1375y();
/* 2103 */                                                  if (sl3Var.f16678W == null) {
/* 2111 */                                                      sl3Var.f16678W = new wk3(sl3Var, ij3Var5, 0);
                                                            }
/* 2115 */                                                  sl3Var.f16678W.m1348b(jMax);
                                                        }
                                                    }
/* 2121 */                                          ki3Var.f12800Z.m4239b(true);
                                                }
/* 1894 */                                      uh3Var = uh3Var2;
/* 1937 */                                      if (!TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1939 */                                          zM4560d = ij3Var6.m4560d();
/* 1943 */                                          sharedPreferences = ki3Var.f12803c;
/* 1945 */                                          if (sharedPreferences == null) {
/* 1947 */                                              zContains = false;
                                                    } else {
/* 1951 */                                              zContains = sharedPreferences.contains("deferred_analytics_collection");
                                                    }
/* 1955 */                                          if (!zContains && !pd3Var.m7409M()) {
/* 1965 */                                              ki3Var.m6118I(!zM4560d);
                                                    }
/* 1968 */                                          if (zM4560d) {
/* 1970 */                                              ij3.m4554k(sl3Var);
/* 1973 */                                              sl3Var.m8561L();
                                                    }
/* 1976 */                                          lo3 lo3Var2 = ij3Var6.f9667v;
/* 1978 */                                          ij3.m4554k(lo3Var2);
/* 1983 */                                          lo3Var2.f13437e.m7455a();
/* 1995 */                                          ij3Var6.m4567o().m7508D(new AtomicReference());
/* 2008 */                                          ij3Var6.m4567o().m7509E(ki3Var.f12815j0.m8119x());
                                                }
                                            } else {
/* 1551 */                                      if (ij3Var7.m4560d()) {
/* 1555 */                                          up3Var2 = up3Var;
/* 1561 */                                          if (up3Var2.m9097W("android.permission.INTERNET")) {
/* 1574 */                                              sh3Var6 = sh3Var4;
                                                    } else {
/* 1563 */                                              ij3.m4555l(uh3Var2);
/* 1568 */                                              sh3Var6 = sh3Var4;
/* 1570 */                                              sh3Var6.m8510a("App is missing INTERNET permission");
                                                    }
/* 1582 */                                          if (!up3Var2.m9097W("android.permission.ACCESS_NETWORK_STATE")) {
/* 1584 */                                              ij3.m4555l(uh3Var2);
/* 1589 */                                              sh3Var6.m8510a("App is missing ACCESS_NETWORK_STATE permission");
                                                    }
/* 1592 */                                          ij3Var6 = ij3Var7;
/* 1594 */                                          context = ij3Var6.f9645a;
/* 1604 */                                          if (!g93.m3898a(context).m9215d() && !pd3Var.m7399C()) {
/* 1616 */                                              if (!up3.m9071p0(context)) {
/* 1618 */                                                  ij3.m4555l(uh3Var2);
/* 1623 */                                                  sh3Var6.m8510a("AppMeasurementReceiver not registered/enabled");
                                                        }
/* 1630 */                                              if (!up3.m9065S(context)) {
/* 1632 */                                                  ij3.m4555l(uh3Var2);
/* 1637 */                                                  sh3Var6.m8510a("AppMeasurementService not registered/enabled");
                                                        }
                                                    }
/* 1640 */                                          ij3.m4555l(uh3Var2);
/* 1645 */                                          sh3Var6.m8510a("Uploading is not possible. App measurement disabled");
                                                } else {
/* 1652 */                                          ij3Var6 = ij3Var7;
/* 1654 */                                          up3Var2 = up3Var;
                                                }
/* 1648 */                                      uh3Var = uh3Var2;
                                            }
/* 2011 */                                  zzql.zza();
/* 2021 */                                  if (pd3Var.m7406J(null, vg3.f18096Q0)) {
/* 2023 */                                      up3Var2.mo1375y();
/* 2032 */                                      if (up3Var2.m9096U() == 1) {
/* 2042 */                                          long jIntValue2 = ((Integer) vg3.f18172x0.m9011a(null)).intValue();
/* 2054 */                                          long jNextInt2 = new Random().nextInt(5000);
/* 2065 */                                          ij3Var6.f9640V.getClass();
/* 2075 */                                          jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
/* 2081 */                                          if (jMax > 500) {
/* 2083 */                                              ij3.m4555l(uh3Var);
/* 2092 */                                              sh3Var3.m8511b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                    }
/* 2095 */                                          ij3.m4554k(sl3Var);
/* 2098 */                                          sl3Var.mo1375y();
/* 2103 */                                          if (sl3Var.f16678W == null) {
/* 2111 */                                              sl3Var.f16678W = new wk3(sl3Var, ij3Var5, 0);
                                                    }
/* 2115 */                                          sl3Var.f16678W.m1348b(jMax);
                                                }
                                            }
/* 2121 */                                  ki3Var.f12800Z.m4239b(true);
                                        }
/* 1109 */                              j2 = j;
/* 1111 */                              up3Var = up3Var4;
/* 1169 */                              if (!TextUtils.isEmpty(ij3Var7.m4569q().m4535G()) && (i3 == 0 || i3 == 30 || i3 == 10 || i3 == 40)) {
/* 1188 */                                  ij3.m4554k(sl3Var);
/* 1199 */                                  sl3Var.m8570U(new ok3(-10), false);
                                        }
/* 1186 */                              ok3Var = null;
/* 1203 */                              if (ok3Var != null) {
/* 1205 */                                  ij3.m4554k(sl3Var);
/* 1209 */                                  sl3Var.m8570U(ok3Var, true);
                                        } else {
/* 1213 */                                  ok3Var = ok3VarM6116G;
                                        }
/* 1215 */                              ij3.m4554k(sl3Var);
/* 1220 */                              ij3Var5 = (ij3) sl3Var.f16749a;
/* 1222 */                              sl3Var.m8553D(ok3Var);
/* 1225 */                              ki3Var.mo1375y();
/* 1243 */                              int i5 = ce3.m1646b(ki3Var.m6113D().getString("dma_consent_settings", null)).f2866a;
/* 1248 */                              lk3VarM7411O3 = pd3Var.m7411O("google_analytics_default_allow_ad_personalization_signals", true);
/* 1252 */                              if (lk3VarM7411O3 != lk3Var) {
/* 1254 */                                  ij3.m4555l(uh3Var2);
/* 1259 */                                  sh3Var3.m8511b(lk3VarM7411O3, "Default ad personalization consent from Manifest");
                                        }
/* 1264 */                              lk3VarM7411O4 = pd3Var.m7411O("google_analytics_default_allow_ad_user_data", true);
/* 1268 */                              if (lk3VarM7411O4 == lk3Var) {
/* 1313 */                                  if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1349 */                                      if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                                          ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                                          it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                                          while (it.hasNext()) {
/* 1391 */                                              if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                                  ij3.m4554k(sl3Var);
/* 1397 */                                                  sl3Var.m8569T(ce3VarM1647c, true);
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                                      ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                                      it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                                      while (it.hasNext()) {
/* 1391 */                                          if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                              ij3.m4554k(sl3Var);
/* 1397 */                                              sl3Var.m8569T(ce3VarM1647c, true);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1349 */                                  if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                                      ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                                      it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                                      while (it.hasNext()) {
/* 1391 */                                          if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                              ij3.m4554k(sl3Var);
/* 1397 */                                              sl3Var.m8569T(ce3VarM1647c, true);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                                  ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                                  it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                                  while (it.hasNext()) {
/* 1391 */                                      if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                          ij3.m4554k(sl3Var);
/* 1397 */                                          sl3Var.m8569T(ce3VarM1647c, true);
                                                    break;
                                                }
                                            }
                                        }
/* 1402 */                              boolM7408L = pd3Var.m7408L("google_analytics_tcf_data_enabled");
/* 1406 */                              if (boolM7408L != null) {
/* 1414 */                                  ij3.m4555l(uh3Var2);
/* 1419 */                                  sh3Var.m8510a("TCF client enabled.");
/* 1422 */                                  ij3.m4554k(sl3Var);
/* 1425 */                                  sl3Var.mo1375y();
/* 1428 */                                  uh3 uh3Var11 = ij3Var5.f9655f;
/* 1430 */                                  ij3.m4555l(uh3Var11);
/* 1437 */                                  uh3Var11.f17533X.m8510a("Register tcfPrefChangeListener.");
/* 1442 */                                  if (sl3Var.f16691f0 == null) {
/* 1450 */                                      sl3Var.f16692g0 = new wk3(sl3Var, ij3Var5, 2);
/* 1457 */                                      sl3Var.f16691f0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rl3
                                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
/* 1 */                                                 sl3 sl3Var2 = sl3Var;
/* 5 */                                                 ij3 ij3Var10 = (ij3) sl3Var2.f16749a;
/* 7 */                                                 pd3 pd3Var3 = ij3Var10.f9651d;
/* 9 */                                                 uh3 uh3Var12 = ij3Var10.f9655f;
/* 24 */                                                if (!pd3Var3.m7406J(null, vg3.f18114Z0)) {
/* 30 */                                                    if (Objects.equals(str7, "IABTCF_TCString")) {
/* 32 */                                                        ij3.m4555l(uh3Var12);
/* 37 */                                                        uh3Var12.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 40 */                                                        wk3 wk3Var = sl3Var2.f16692g0;
/* 42 */                                                        kb1.m6061n(wk3Var);
/* 45 */                                                        wk3Var.m1348b(500L);
/* 48 */                                                        return;
                                                            }
/* 72 */                                                    return;
                                                        }
/* 53 */                                                if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
/* 73 */                                                    ij3.m4555l(uh3Var12);
/* 78 */                                                    uh3Var12.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 81 */                                                    wk3 wk3Var2 = sl3Var2.f16692g0;
/* 83 */                                                    kb1.m6061n(wk3Var2);
/* 86 */                                                    wk3Var2.m1348b(500L);
                                                        }
                                                    }
                                                };
                                            }
/* 1459 */                                  ki3 ki3Var4 = ij3Var5.f9653e;
/* 1461 */                                  ij3.m4553j(ki3Var4);
/* 1470 */                                  ki3Var4.m6114E().registerOnSharedPreferenceChangeListener(sl3Var.f16691f0);
/* 1473 */                                  ij3.m4554k(sl3Var);
/* 1476 */                                  sl3Var.m8555F();
                                        } else {
/* 1414 */                                  ij3.m4555l(uh3Var2);
/* 1419 */                                  sh3Var.m8510a("TCF client enabled.");
/* 1422 */                                  ij3.m4554k(sl3Var);
/* 1425 */                                  sl3Var.mo1375y();
/* 1428 */                                  uh3 uh3Var12 = ij3Var5.f9655f;
/* 1430 */                                  ij3.m4555l(uh3Var12);
/* 1437 */                                  uh3Var12.f17533X.m8510a("Register tcfPrefChangeListener.");
/* 1442 */                                  if (sl3Var.f16691f0 == null) {
/* 1450 */                                      sl3Var.f16692g0 = new wk3(sl3Var, ij3Var5, 2);
/* 1457 */                                      sl3Var.f16691f0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rl3
                                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
/* 1 */                                                 sl3 sl3Var2 = sl3Var;
/* 5 */                                                 ij3 ij3Var10 = (ij3) sl3Var2.f16749a;
/* 7 */                                                 pd3 pd3Var3 = ij3Var10.f9651d;
/* 9 */                                                 uh3 uh3Var13 = ij3Var10.f9655f;
/* 24 */                                                if (!pd3Var3.m7406J(null, vg3.f18114Z0)) {
/* 30 */                                                    if (Objects.equals(str7, "IABTCF_TCString")) {
/* 32 */                                                        ij3.m4555l(uh3Var13);
/* 37 */                                                        uh3Var13.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 40 */                                                        wk3 wk3Var = sl3Var2.f16692g0;
/* 42 */                                                        kb1.m6061n(wk3Var);
/* 45 */                                                        wk3Var.m1348b(500L);
/* 48 */                                                        return;
                                                            }
/* 72 */                                                    return;
                                                        }
/* 53 */                                                if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
/* 73 */                                                    ij3.m4555l(uh3Var13);
/* 78 */                                                    uh3Var13.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 81 */                                                    wk3 wk3Var2 = sl3Var2.f16692g0;
/* 83 */                                                    kb1.m6061n(wk3Var2);
/* 86 */                                                    wk3Var2.m1348b(500L);
                                                        }
                                                    }
                                                };
                                            }
/* 1459 */                                  ki3 ki3Var5 = ij3Var5.f9653e;
/* 1461 */                                  ij3.m4553j(ki3Var5);
/* 1470 */                                  ki3Var5.m6114E().registerOnSharedPreferenceChangeListener(sl3Var.f16691f0);
/* 1473 */                                  ij3.m4554k(sl3Var);
/* 1476 */                                  sl3Var.m8555F();
                                        }
/* 1479 */                              c1268s = ki3Var.f12809f;
/* 1489 */                              if (c1268s.m4932a() == 0) {
/* 1491 */                                  ij3.m4555l(uh3Var2);
/* 1500 */                                  sh3Var3.m8511b(Long.valueOf(j2), "Persisting first open");
/* 1503 */                                  j3 = j2;
/* 1505 */                                  c1268s.m4933b(j3);
                                        } else {
/* 1509 */                                  j3 = j2;
                                        }
/* 1511 */                              ij3.m4554k(sl3Var);
/* 1514 */                              oi3Var = sl3Var.f16685c0;
/* 1520 */                              if (oi3Var.m7178d()) {
/* 1530 */                                  ki3 ki3Var6 = oi3Var.f14773b.f9653e;
/* 1532 */                                  ij3.m4553j(ki3Var6);
/* 1538 */                                  ki3Var6.f12812h0.m8806n(null);
                                        }
/* 1545 */                              if (ij3Var7.m4564h()) {
/* 1551 */                                  if (ij3Var7.m4560d()) {
/* 1555 */                                      up3Var2 = up3Var;
/* 1561 */                                      if (up3Var2.m9097W("android.permission.INTERNET")) {
/* 1563 */                                          ij3.m4555l(uh3Var2);
/* 1568 */                                          sh3Var6 = sh3Var4;
/* 1570 */                                          sh3Var6.m8510a("App is missing INTERNET permission");
                                                } else {
/* 1574 */                                          sh3Var6 = sh3Var4;
                                                }
/* 1582 */                                      if (!up3Var2.m9097W("android.permission.ACCESS_NETWORK_STATE")) {
/* 1584 */                                          ij3.m4555l(uh3Var2);
/* 1589 */                                          sh3Var6.m8510a("App is missing ACCESS_NETWORK_STATE permission");
                                                }
/* 1592 */                                      ij3Var6 = ij3Var7;
/* 1594 */                                      context = ij3Var6.f9645a;
/* 1604 */                                      if (!g93.m3898a(context).m9215d()) {
/* 1616 */                                          if (!up3.m9071p0(context)) {
/* 1618 */                                              ij3.m4555l(uh3Var2);
/* 1623 */                                              sh3Var6.m8510a("AppMeasurementReceiver not registered/enabled");
                                                    }
/* 1630 */                                          if (!up3.m9065S(context)) {
/* 1632 */                                              ij3.m4555l(uh3Var2);
/* 1637 */                                              sh3Var6.m8510a("AppMeasurementService not registered/enabled");
                                                    }
                                                }
/* 1640 */                                      ij3.m4555l(uh3Var2);
/* 1645 */                                      sh3Var6.m8510a("Uploading is not possible. App measurement disabled");
                                            } else {
/* 1652 */                                      ij3Var6 = ij3Var7;
/* 1654 */                                      up3Var2 = up3Var;
                                            }
/* 1648 */                                  uh3Var = uh3Var2;
                                        } else {
/* 1657 */                                  ij3Var6 = ij3Var7;
/* 1659 */                                  up3Var2 = up3Var;
/* 1673 */                                  if (TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1679 */                                      String strM4535G3 = ij3Var6.m4569q().m4535G();
/* 1683 */                                      ki3Var.mo1375y();
/* 1693 */                                      String string3 = ki3Var.m6113D().getString("gmp_app_id", null);
/* 1697 */                                      zIsEmpty = TextUtils.isEmpty(strM4535G3);
/* 1701 */                                      boolean zIsEmpty3 = TextUtils.isEmpty(string3);
/* 1705 */                                      if (zIsEmpty) {
/* 1825 */                                          c2220tj2 = c2220tj;
                                                } else {
/* 1825 */                                          c2220tj2 = c2220tj;
                                                }
/* 1831 */                                      String strM4535G4 = ij3Var6.m4569q().m4535G();
/* 1835 */                                      ki3Var.mo1375y();
/* 1842 */                                      SharedPreferences.Editor editorEdit5 = ki3Var.m6113D().edit();
/* 1846 */                                      editorEdit5.putString("gmp_app_id", strM4535G4);
/* 1849 */                                      editorEdit5.apply();
                                            } else {
/* 1853 */                                      c2220tj2 = c2220tj;
                                            }
/* 1863 */                                  if (!ki3Var.m6116G().m7189i(nk3Var)) {
/* 1866 */                                      c2220tj2.m8806n(null);
                                            }
/* 1869 */                                  ij3.m4554k(sl3Var);
/* 1878 */                                  sl3Var.f16694i.set(c2220tj2.m8805m());
/* 1891 */                                  ij3Var4.f9645a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
/* 1894 */                                  uh3Var = uh3Var2;
/* 1937 */                                  if (!TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1939 */                                      zM4560d = ij3Var6.m4560d();
/* 1943 */                                      sharedPreferences = ki3Var.f12803c;
/* 1945 */                                      if (sharedPreferences == null) {
/* 1947 */                                          zContains = false;
                                                } else {
/* 1951 */                                          zContains = sharedPreferences.contains("deferred_analytics_collection");
                                                }
/* 1955 */                                      if (!zContains) {
/* 1965 */                                          ki3Var.m6118I(!zM4560d);
                                                }
/* 1968 */                                      if (zM4560d) {
/* 1970 */                                          ij3.m4554k(sl3Var);
/* 1973 */                                          sl3Var.m8561L();
                                                }
/* 1976 */                                      lo3 lo3Var3 = ij3Var6.f9667v;
/* 1978 */                                      ij3.m4554k(lo3Var3);
/* 1983 */                                      lo3Var3.f13437e.m7455a();
/* 1995 */                                      ij3Var6.m4567o().m7508D(new AtomicReference());
/* 2008 */                                      ij3Var6.m4567o().m7509E(ki3Var.f12815j0.m8119x());
                                            }
                                        }
/* 2011 */                              zzql.zza();
/* 2021 */                              if (pd3Var.m7406J(null, vg3.f18096Q0)) {
/* 2023 */                                  up3Var2.mo1375y();
/* 2032 */                                  if (up3Var2.m9096U() == 1) {
/* 2042 */                                      long jIntValue3 = ((Integer) vg3.f18172x0.m9011a(null)).intValue();
/* 2054 */                                      long jNextInt3 = new Random().nextInt(5000);
/* 2065 */                                      ij3Var6.f9640V.getClass();
/* 2075 */                                      jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
/* 2081 */                                      if (jMax > 500) {
/* 2083 */                                          ij3.m4555l(uh3Var);
/* 2092 */                                          sh3Var3.m8511b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
/* 2095 */                                      ij3.m4554k(sl3Var);
/* 2098 */                                      sl3Var.mo1375y();
/* 2103 */                                      if (sl3Var.f16678W == null) {
/* 2111 */                                          sl3Var.f16678W = new wk3(sl3Var, ij3Var5, 0);
                                                }
/* 2115 */                                      sl3Var.f16678W.m1348b(jMax);
                                            }
                                        }
/* 2121 */                              ki3Var.f12800Z.m4239b(true);
                                    }
/* 629 */                           uh3 uh3Var13 = ij3Var2.f9655f;
/* 631 */                           ij3.m4555l(uh3Var13);
/* 638 */                           uh3Var13.f17538f.m8510a("Failed to load metadata: Metadata bundle is null");
/* 641 */                           numValueOf = null;
/* 658 */                           if (numValueOf != null) {
/* 670 */                               stringArray = ij3Var2.f9645a.getResources().getStringArray(numValueOf.intValue());
/* 674 */                               if (stringArray == null) {
/* 676 */                                   listAsList = null;
                                        } else {
/* 678 */                                   listAsList = Arrays.asList(stringArray);
                                        }
                                    } else {
/* 676 */                               listAsList = null;
                                    }
/* 697 */                           if (listAsList != null) {
/* 747 */                               ih3Var3.f9590V = listAsList;
                                        break;
                                    }
/* 704 */                           if (listAsList.isEmpty()) {
/* 717 */                               it2 = listAsList.iterator();
/* 744 */                               do {
/* 725 */                                   if (it2.hasNext()) {
/* 747 */                                       ih3Var3.f9590V = listAsList;
                                                break;
                                            } else {
/* 731 */                                       str2 = (String) it2.next();
/* 733 */                                       up3Var3 = ij3Var9.f9668w;
/* 735 */                                       ij3.m4553j(up3Var3);
                                            }
/* 744 */                               } while (up3Var3.m9075A0("safelisted event", str2));
                                    } else {
/* 706 */                               ij3.m4555l(uh3Var5);
/* 713 */                               uh3Var5.f17531V.m8510a("Safelisted event list is empty. Ignoring");
                                    }
/* 749 */                           if (packageManager != null) {
/* 755 */                               ih3Var3.f9592X = py0.m7609p0(context2) ? 1 : 0;
                                    } else {
/* 759 */                               ih3Var3.f9592X = 0;
                                    }
/* 767 */                           ((ij3) ih3Var3.f16749a).f9665n0.incrementAndGet();
/* 771 */                           ih3Var3.f18620b = true;
/* 775 */                           xl3Var = new xl3(ij3Var7);
/* 778 */                           xl3Var.m9577B();
/* 781 */                           ij3Var7.f9656f0 = xl3Var;
/* 785 */                           if (!xl3Var.f18620b) {
/* 2125 */                              f42.m3656l("Can't initialize twice");
/* 2128 */                              return;
                                    }
/* 801 */                           xl3Var.f19246c = (JobScheduler) ((ij3) xl3Var.f16749a).f9645a.getSystemService("jobscheduler");
/* 809 */                           ((ij3) xl3Var.f16749a).f9665n0.incrementAndGet();
/* 813 */                           xl3Var.f18620b = true;
/* 815 */                           ij3.m4555l(uh3Var2);
/* 818 */                           sh3Var = uh3Var2.f17533X;
/* 820 */                           sh3Var2 = uh3Var2.f17532W;
/* 822 */                           sh3Var3 = uh3Var2.f17534Y;
/* 824 */                           sh3Var4 = uh3Var2.f17538f;
/* 826 */                           pd3Var.m7401E();
/* 838 */                           sh3Var2.m8511b(130000L, "App measurement initialized, version");
/* 841 */                           ij3.m4555l(uh3Var2);
/* 846 */                           sh3Var2.m8510a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
/* 849 */                           strM4534F = ih3Var.m4534F();
/* 859 */                           if (up3Var4.m9098Z(strM4534F, pd3Var.f15074c)) {
/* 861 */                               ij3.m4555l(uh3Var2);
/* 866 */                               sh3Var2.m8510a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                    } else {
/* 870 */                               ij3.m4555l(uh3Var2);
/* 883 */                               sh3Var2.m8510a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM4534F)));
                                    }
/* 886 */                           ij3.m4555l(uh3Var2);
/* 891 */                           sh3Var.m8510a("Debug-level message logging enabled");
/* 894 */                           i2 = ij3Var7.f9663l0;
/* 896 */                           atomicInteger = ij3Var7.f9665n0;
/* 902 */                           if (i2 != atomicInteger.get()) {
/* 904 */                               ij3.m4555l(uh3Var2);
/* 923 */                               sh3Var4.m8512c(Integer.valueOf(ij3Var7.f9663l0), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                                    }
/* 927 */                           ij3Var7.f9657g0 = true;
/* 929 */                           j = ij3Var7.f9666o0;
/* 931 */                           sl3Var = ij3Var7.f9642X;
/* 933 */                           bj3 bj3Var3 = ij3Var7.f9659i;
/* 935 */                           ij3.m4555l(bj3Var3);
/* 938 */                           bj3Var3.mo1375y();
/* 943 */                           ij3.m4552i(ij3Var7.f9656f0);
/* 948 */                           zzinVarM9976E = ij3Var7.f9656f0.m9976E();
/* 952 */                           zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
/* 954 */                           zzql.zza();
/* 962 */                           zM7406J = pd3Var.m7406J(null, vg3.f18096Q0);
/* 966 */                           if (zzinVarM9976E == zzinVar) {
/* 968 */                               z = true;
                                    } else {
/* 970 */                               z = false;
                                    }
/* 973 */                           if (zM7406J) {
/* 975 */                               up3Var4.mo1375y();
/* 984 */                               if (up3Var4.m9096U() == 1) {
/* 990 */                                   up3Var4.mo1375y();
/* 995 */                                   IntentFilter intentFilter4 = new IntentFilter();
/* 1000 */                                  intentFilter4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                                  intentFilter4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                                  ij3Var3 = ij3Var;
/* 1015 */                                  z2 = z;
/* 1019 */                                  sh3Var5 = sh3Var2;
/* 1022 */                                  v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter4, 2);
/* 1025 */                                  uh3 uh3Var14 = ij3Var3.f9655f;
/* 1027 */                                  ij3.m4555l(uh3Var14);
/* 1034 */                                  uh3Var14.f17533X.m8510a("Registered app receiver");
/* 1037 */                                  if (z2) {
/* 1041 */                                      ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                                      ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                            }
                                        } else if (z) {
/* 989 */                                   z = true;
/* 990 */                                   up3Var4.mo1375y();
/* 995 */                                   IntentFilter intentFilter5 = new IntentFilter();
/* 1000 */                                  intentFilter5.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                                  intentFilter5.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                                  ij3Var3 = ij3Var;
/* 1015 */                                  z2 = z;
/* 1019 */                                  sh3Var5 = sh3Var2;
/* 1022 */                                  v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter5, 2);
/* 1025 */                                  uh3 uh3Var15 = ij3Var3.f9655f;
/* 1027 */                                  ij3.m4555l(uh3Var15);
/* 1034 */                                  uh3Var15.f17533X.m8510a("Registered app receiver");
/* 1037 */                                  if (z2) {
/* 1041 */                                      ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                                      ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                            }
                                        } else {
/* 1063 */                                  ij3Var3 = ij3Var;
/* 1065 */                                  sh3Var5 = sh3Var2;
                                        }
                                    } else if (z) {
/* 989 */                               z = true;
/* 990 */                               up3Var4.mo1375y();
/* 995 */                               IntentFilter intentFilter6 = new IntentFilter();
/* 1000 */                              intentFilter6.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                              intentFilter6.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                              ij3Var3 = ij3Var;
/* 1015 */                              z2 = z;
/* 1019 */                              sh3Var5 = sh3Var2;
/* 1022 */                              v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter6, 2);
/* 1025 */                              uh3 uh3Var16 = ij3Var3.f9655f;
/* 1027 */                              ij3.m4555l(uh3Var16);
/* 1034 */                              uh3Var16.f17533X.m8510a("Registered app receiver");
/* 1037 */                              if (z2) {
/* 1041 */                                  ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                                  ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                        }
                                    } else {
/* 1063 */                              ij3Var3 = ij3Var;
/* 1065 */                              sh3Var5 = sh3Var2;
                                    }
/* 1067 */                          c2220tj = ki3Var.f12813i;
/* 1069 */                          ok3VarM6116G = ki3Var.m6116G();
/* 1073 */                          int i6 = ok3VarM6116G.f14793b;
/* 1080 */                          lk3VarM7411O = pd3Var.m7411O("google_analytics_default_allow_ad_storage", false);
/* 1084 */                          ij3Var4 = ij3Var3;
/* 1088 */                          lk3VarM7411O2 = pd3Var.m7411O("google_analytics_default_allow_analytics_storage", false);
/* 1092 */                          lk3Var = lk3.UNINITIALIZED;
/* 1096 */                          nk3Var = nk3.ANALYTICS_STORAGE;
/* 1104 */                          if (lk3VarM7411O == lk3Var) {
/* 1118 */                              up3Var = up3Var4;
/* 1122 */                              j2 = j;
/* 1136 */                              if (ok3.m7186l(-10, ki3Var.m6113D().getInt("consent_source", 100))) {
/* 1140 */                                  EnumMap enumMap3 = new EnumMap(nk3.class);
/* 1145 */                                  enumMap3.put(nk3.AD_STORAGE, lk3VarM7411O);
/* 1148 */                                  enumMap3.put(nk3Var, lk3VarM7411O2);
/* 1153 */                                  ok3Var = new ok3(enumMap3, -10);
                                        } else {
/* 1169 */                                  if (!TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1188 */                                      ij3.m4554k(sl3Var);
/* 1199 */                                      sl3Var.m8570U(new ok3(-10), false);
                                            }
/* 1186 */                                  ok3Var = null;
                                        }
                                    } else {
/* 1118 */                              up3Var = up3Var4;
/* 1122 */                              j2 = j;
/* 1136 */                              if (ok3.m7186l(-10, ki3Var.m6113D().getInt("consent_source", 100))) {
/* 1140 */                                  EnumMap enumMap4 = new EnumMap(nk3.class);
/* 1145 */                                  enumMap4.put(nk3.AD_STORAGE, lk3VarM7411O);
/* 1148 */                                  enumMap4.put(nk3Var, lk3VarM7411O2);
/* 1153 */                                  ok3Var = new ok3(enumMap4, -10);
                                        } else {
/* 1169 */                                  if (!TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1188 */                                      ij3.m4554k(sl3Var);
/* 1199 */                                      sl3Var.m8570U(new ok3(-10), false);
                                            }
/* 1186 */                                  ok3Var = null;
                                        }
                                    }
/* 1203 */                          if (ok3Var != null) {
/* 1205 */                              ij3.m4554k(sl3Var);
/* 1209 */                              sl3Var.m8570U(ok3Var, true);
                                    } else {
/* 1213 */                              ok3Var = ok3VarM6116G;
                                    }
/* 1215 */                          ij3.m4554k(sl3Var);
/* 1220 */                          ij3Var5 = (ij3) sl3Var.f16749a;
/* 1222 */                          sl3Var.m8553D(ok3Var);
/* 1225 */                          ki3Var.mo1375y();
/* 1243 */                          int i7 = ce3.m1646b(ki3Var.m6113D().getString("dma_consent_settings", null)).f2866a;
/* 1248 */                          lk3VarM7411O3 = pd3Var.m7411O("google_analytics_default_allow_ad_personalization_signals", true);
/* 1252 */                          if (lk3VarM7411O3 != lk3Var) {
/* 1254 */                              ij3.m4555l(uh3Var2);
/* 1259 */                              sh3Var3.m8511b(lk3VarM7411O3, "Default ad personalization consent from Manifest");
                                    }
/* 1264 */                          lk3VarM7411O4 = pd3Var.m7411O("google_analytics_default_allow_ad_user_data", true);
/* 1268 */                          if (lk3VarM7411O4 == lk3Var) {
/* 1313 */                              if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1349 */                                  if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                                      ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                                      it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                                      while (it.hasNext()) {
/* 1391 */                                          if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                              ij3.m4554k(sl3Var);
/* 1397 */                                              sl3Var.m8569T(ce3VarM1647c, true);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                                  ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                                  it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                                  while (it.hasNext()) {
/* 1391 */                                      if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                          ij3.m4554k(sl3Var);
/* 1397 */                                          sl3Var.m8569T(ce3VarM1647c, true);
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1349 */                              if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                                  ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                                  it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                                  while (it.hasNext()) {
/* 1391 */                                      if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                          ij3.m4554k(sl3Var);
/* 1397 */                                          sl3Var.m8569T(ce3VarM1647c, true);
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                              ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                              it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                              while (it.hasNext()) {
/* 1391 */                                  if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                      ij3.m4554k(sl3Var);
/* 1397 */                                      sl3Var.m8569T(ce3VarM1647c, true);
                                                break;
                                            }
                                        }
                                    }
/* 1402 */                          boolM7408L = pd3Var.m7408L("google_analytics_tcf_data_enabled");
/* 1406 */                          if (boolM7408L != null) {
/* 1414 */                              ij3.m4555l(uh3Var2);
/* 1419 */                              sh3Var.m8510a("TCF client enabled.");
/* 1422 */                              ij3.m4554k(sl3Var);
/* 1425 */                              sl3Var.mo1375y();
/* 1428 */                              uh3 uh3Var17 = ij3Var5.f9655f;
/* 1430 */                              ij3.m4555l(uh3Var17);
/* 1437 */                              uh3Var17.f17533X.m8510a("Register tcfPrefChangeListener.");
/* 1442 */                              if (sl3Var.f16691f0 == null) {
/* 1450 */                                  sl3Var.f16692g0 = new wk3(sl3Var, ij3Var5, 2);
/* 1457 */                                  sl3Var.f16691f0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rl3
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
/* 1 */                                             sl3 sl3Var2 = sl3Var;
/* 5 */                                             ij3 ij3Var10 = (ij3) sl3Var2.f16749a;
/* 7 */                                             pd3 pd3Var3 = ij3Var10.f9651d;
/* 9 */                                             uh3 uh3Var18 = ij3Var10.f9655f;
/* 24 */                                            if (!pd3Var3.m7406J(null, vg3.f18114Z0)) {
/* 30 */                                                if (Objects.equals(str7, "IABTCF_TCString")) {
/* 32 */                                                    ij3.m4555l(uh3Var18);
/* 37 */                                                    uh3Var18.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 40 */                                                    wk3 wk3Var = sl3Var2.f16692g0;
/* 42 */                                                    kb1.m6061n(wk3Var);
/* 45 */                                                    wk3Var.m1348b(500L);
/* 48 */                                                    return;
                                                        }
/* 72 */                                                return;
                                                    }
/* 53 */                                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
/* 73 */                                                ij3.m4555l(uh3Var18);
/* 78 */                                                uh3Var18.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 81 */                                                wk3 wk3Var2 = sl3Var2.f16692g0;
/* 83 */                                                kb1.m6061n(wk3Var2);
/* 86 */                                                wk3Var2.m1348b(500L);
                                                    }
                                                }
                                            };
                                        }
/* 1459 */                              ki3 ki3Var7 = ij3Var5.f9653e;
/* 1461 */                              ij3.m4553j(ki3Var7);
/* 1470 */                              ki3Var7.m6114E().registerOnSharedPreferenceChangeListener(sl3Var.f16691f0);
/* 1473 */                              ij3.m4554k(sl3Var);
/* 1476 */                              sl3Var.m8555F();
                                    } else {
/* 1414 */                              ij3.m4555l(uh3Var2);
/* 1419 */                              sh3Var.m8510a("TCF client enabled.");
/* 1422 */                              ij3.m4554k(sl3Var);
/* 1425 */                              sl3Var.mo1375y();
/* 1428 */                              uh3 uh3Var18 = ij3Var5.f9655f;
/* 1430 */                              ij3.m4555l(uh3Var18);
/* 1437 */                              uh3Var18.f17533X.m8510a("Register tcfPrefChangeListener.");
/* 1442 */                              if (sl3Var.f16691f0 == null) {
/* 1450 */                                  sl3Var.f16692g0 = new wk3(sl3Var, ij3Var5, 2);
/* 1457 */                                  sl3Var.f16691f0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rl3
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
/* 1 */                                             sl3 sl3Var2 = sl3Var;
/* 5 */                                             ij3 ij3Var10 = (ij3) sl3Var2.f16749a;
/* 7 */                                             pd3 pd3Var3 = ij3Var10.f9651d;
/* 9 */                                             uh3 uh3Var19 = ij3Var10.f9655f;
/* 24 */                                            if (!pd3Var3.m7406J(null, vg3.f18114Z0)) {
/* 30 */                                                if (Objects.equals(str7, "IABTCF_TCString")) {
/* 32 */                                                    ij3.m4555l(uh3Var19);
/* 37 */                                                    uh3Var19.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 40 */                                                    wk3 wk3Var = sl3Var2.f16692g0;
/* 42 */                                                    kb1.m6061n(wk3Var);
/* 45 */                                                    wk3Var.m1348b(500L);
/* 48 */                                                    return;
                                                        }
/* 72 */                                                return;
                                                    }
/* 53 */                                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
/* 73 */                                                ij3.m4555l(uh3Var19);
/* 78 */                                                uh3Var19.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 81 */                                                wk3 wk3Var2 = sl3Var2.f16692g0;
/* 83 */                                                kb1.m6061n(wk3Var2);
/* 86 */                                                wk3Var2.m1348b(500L);
                                                    }
                                                }
                                            };
                                        }
/* 1459 */                              ki3 ki3Var8 = ij3Var5.f9653e;
/* 1461 */                              ij3.m4553j(ki3Var8);
/* 1470 */                              ki3Var8.m6114E().registerOnSharedPreferenceChangeListener(sl3Var.f16691f0);
/* 1473 */                              ij3.m4554k(sl3Var);
/* 1476 */                              sl3Var.m8555F();
                                    }
/* 1479 */                          c1268s = ki3Var.f12809f;
/* 1489 */                          if (c1268s.m4932a() == 0) {
/* 1491 */                              ij3.m4555l(uh3Var2);
/* 1500 */                              sh3Var3.m8511b(Long.valueOf(j2), "Persisting first open");
/* 1503 */                              j3 = j2;
/* 1505 */                              c1268s.m4933b(j3);
                                    } else {
/* 1509 */                              j3 = j2;
                                    }
/* 1511 */                          ij3.m4554k(sl3Var);
/* 1514 */                          oi3Var = sl3Var.f16685c0;
/* 1520 */                          if (oi3Var.m7178d()) {
/* 1530 */                              ki3 ki3Var9 = oi3Var.f14773b.f9653e;
/* 1532 */                              ij3.m4553j(ki3Var9);
/* 1538 */                              ki3Var9.f12812h0.m8806n(null);
                                    }
/* 1545 */                          if (ij3Var7.m4564h()) {
/* 1551 */                              if (ij3Var7.m4560d()) {
/* 1555 */                                  up3Var2 = up3Var;
/* 1561 */                                  if (up3Var2.m9097W("android.permission.INTERNET")) {
/* 1563 */                                      ij3.m4555l(uh3Var2);
/* 1568 */                                      sh3Var6 = sh3Var4;
/* 1570 */                                      sh3Var6.m8510a("App is missing INTERNET permission");
                                            } else {
/* 1574 */                                      sh3Var6 = sh3Var4;
                                            }
/* 1582 */                                  if (!up3Var2.m9097W("android.permission.ACCESS_NETWORK_STATE")) {
/* 1584 */                                      ij3.m4555l(uh3Var2);
/* 1589 */                                      sh3Var6.m8510a("App is missing ACCESS_NETWORK_STATE permission");
                                            }
/* 1592 */                                  ij3Var6 = ij3Var7;
/* 1594 */                                  context = ij3Var6.f9645a;
/* 1604 */                                  if (!g93.m3898a(context).m9215d()) {
/* 1616 */                                      if (!up3.m9071p0(context)) {
/* 1618 */                                          ij3.m4555l(uh3Var2);
/* 1623 */                                          sh3Var6.m8510a("AppMeasurementReceiver not registered/enabled");
                                                }
/* 1630 */                                      if (!up3.m9065S(context)) {
/* 1632 */                                          ij3.m4555l(uh3Var2);
/* 1637 */                                          sh3Var6.m8510a("AppMeasurementService not registered/enabled");
                                                }
                                            }
/* 1640 */                                  ij3.m4555l(uh3Var2);
/* 1645 */                                  sh3Var6.m8510a("Uploading is not possible. App measurement disabled");
                                        } else {
/* 1652 */                                  ij3Var6 = ij3Var7;
/* 1654 */                                  up3Var2 = up3Var;
                                        }
/* 1648 */                              uh3Var = uh3Var2;
                                    } else {
/* 1657 */                              ij3Var6 = ij3Var7;
/* 1659 */                              up3Var2 = up3Var;
/* 1673 */                              if (TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1679 */                                  String strM4535G5 = ij3Var6.m4569q().m4535G();
/* 1683 */                                  ki3Var.mo1375y();
/* 1693 */                                  String string4 = ki3Var.m6113D().getString("gmp_app_id", null);
/* 1697 */                                  zIsEmpty = TextUtils.isEmpty(strM4535G5);
/* 1701 */                                  boolean zIsEmpty4 = TextUtils.isEmpty(string4);
/* 1705 */                                  if (zIsEmpty) {
/* 1825 */                                      c2220tj2 = c2220tj;
                                            } else {
/* 1825 */                                      c2220tj2 = c2220tj;
                                            }
/* 1831 */                                  String strM4535G6 = ij3Var6.m4569q().m4535G();
/* 1835 */                                  ki3Var.mo1375y();
/* 1842 */                                  SharedPreferences.Editor editorEdit6 = ki3Var.m6113D().edit();
/* 1846 */                                  editorEdit6.putString("gmp_app_id", strM4535G6);
/* 1849 */                                  editorEdit6.apply();
                                        } else {
/* 1853 */                                  c2220tj2 = c2220tj;
                                        }
/* 1863 */                              if (!ki3Var.m6116G().m7189i(nk3Var)) {
/* 1866 */                                  c2220tj2.m8806n(null);
                                        }
/* 1869 */                              ij3.m4554k(sl3Var);
/* 1878 */                              sl3Var.f16694i.set(c2220tj2.m8805m());
/* 1891 */                              ij3Var4.f9645a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
/* 1894 */                              uh3Var = uh3Var2;
/* 1937 */                              if (!TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1939 */                                  zM4560d = ij3Var6.m4560d();
/* 1943 */                                  sharedPreferences = ki3Var.f12803c;
/* 1945 */                                  if (sharedPreferences == null) {
/* 1947 */                                      zContains = false;
                                            } else {
/* 1951 */                                      zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
/* 1955 */                                  if (!zContains) {
/* 1965 */                                      ki3Var.m6118I(!zM4560d);
                                            }
/* 1968 */                                  if (zM4560d) {
/* 1970 */                                      ij3.m4554k(sl3Var);
/* 1973 */                                      sl3Var.m8561L();
                                            }
/* 1976 */                                  lo3 lo3Var4 = ij3Var6.f9667v;
/* 1978 */                                  ij3.m4554k(lo3Var4);
/* 1983 */                                  lo3Var4.f13437e.m7455a();
/* 1995 */                                  ij3Var6.m4567o().m7508D(new AtomicReference());
/* 2008 */                                  ij3Var6.m4567o().m7509E(ki3Var.f12815j0.m8119x());
                                        }
                                    }
/* 2011 */                          zzql.zza();
/* 2021 */                          if (pd3Var.m7406J(null, vg3.f18096Q0)) {
/* 2023 */                              up3Var2.mo1375y();
/* 2032 */                              if (up3Var2.m9096U() == 1) {
/* 2042 */                                  long jIntValue4 = ((Integer) vg3.f18172x0.m9011a(null)).intValue();
/* 2054 */                                  long jNextInt4 = new Random().nextInt(5000);
/* 2065 */                                  ij3Var6.f9640V.getClass();
/* 2075 */                                  jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
/* 2081 */                                  if (jMax > 500) {
/* 2083 */                                      ij3.m4555l(uh3Var);
/* 2092 */                                      sh3Var3.m8511b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                            }
/* 2095 */                                  ij3.m4554k(sl3Var);
/* 2098 */                                  sl3Var.mo1375y();
/* 2103 */                                  if (sl3Var.f16678W == null) {
/* 2111 */                                      sl3Var.f16678W = new wk3(sl3Var, ij3Var5, 0);
                                            }
/* 2115 */                                  sl3Var.f16678W.m1348b(jMax);
                                        }
                                    }
/* 2121 */                          ki3Var.f12800Z.m4239b(true);
                                }
/* 344 */                       str5 = "manual_install";
/* 364 */                       packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
/* 368 */                       if (packageInfo != null) {
/* 372 */                           applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
/* 380 */                           if (TextUtils.isEmpty(applicationLabel)) {
/* 382 */                               string = applicationLabel.toString();
                                    } else {
/* 281 */                               string = "Unknown";
                                    }
/* 389 */                           str = packageInfo.versionName;
/* 391 */                           i = packageInfo.versionCode;
                                }
                            } catch (PackageManager.NameNotFoundException unused5) {
/* 281 */                       string = "Unknown";
                            }
/* 346 */                   installerPackageName = str5;
/* 312 */                   String str7 = installerPackageName;
/* 422 */                   ih3Var3.f9597c = packageName;
/* 424 */                   ih3Var3.f9600f = str7;
/* 426 */                   ih3Var3.f9598d = str;
/* 428 */                   ih3Var3.f9599e = i;
/* 430 */                   ih3Var3.f9601i = string;
/* 434 */                   ih3Var3.f9602v = 0L;
/* 436 */                   iM4563g = ij3Var9.m4563g();
/* 440 */                   if (iM4563g == 0) {
/* 548 */                       ij3.m4555l(uh3Var5);
/* 555 */                       uh3Var5.f17534Y.m8510a("App measurement collection enabled");
                            } else if (iM4563g == 1) {
/* 537 */                       ij3.m4555l(uh3Var5);
/* 544 */                       uh3Var5.f17532W.m8510a("App measurement deactivated via the manifest");
                            } else if (iM4563g == 3) {
/* 526 */                       ij3.m4555l(uh3Var5);
/* 533 */                       uh3Var5.f17532W.m8510a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                            } else if (iM4563g == 4) {
/* 515 */                       ij3.m4555l(uh3Var5);
/* 522 */                       uh3Var5.f17532W.m8510a("App measurement disabled via the manifest");
                            } else if (iM4563g == 6) {
/* 504 */                       ij3.m4555l(uh3Var5);
/* 511 */                       uh3Var5.f17531V.m8510a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                            } else if (iM4563g == 7) {
/* 493 */                       ij3.m4555l(uh3Var5);
/* 500 */                       uh3Var5.f17532W.m8510a("App measurement disabled via the global data collection setting");
                            } else if (iM4563g != 8) {
/* 461 */                       ij3.m4555l(uh3Var5);
/* 468 */                       uh3Var5.f17532W.m8510a("App measurement disabled");
/* 471 */                       ij3.m4555l(uh3Var5);
/* 478 */                       uh3Var5.f17539i.m8510a("Invalid scion state in identity");
                            } else {
/* 482 */                       ij3.m4555l(uh3Var5);
/* 489 */                       uh3Var5.f17532W.m8510a("App measurement disabled due to denied storage consent");
                            }
/* 558 */                   ih3Var3.f9593Y = HttpUrl.FRAGMENT_ENCODE_SET;
/* 562 */                   strM7886S = qj3.m7886S(context2, ij3Var9.f9646a0);
/* 570 */                   if (!TextUtils.isEmpty(strM7886S)) {
/* 573 */                       str3 = strM7886S;
                            }
/* 574 */                   ih3Var3.f9593Y = str3;
/* 576 */                   if (iM4563g == 0) {
/* 578 */                       ij3.m4555l(uh3Var5);
/* 589 */                       uh3Var5.f17534Y.m8512c(ih3Var3.f9597c, "App measurement enabled for app package, google app id", ih3Var3.f9593Y);
                            }
/* 610 */                   ih3Var3.f9590V = null;
/* 612 */                   pd3 pd3Var3 = ij3Var9.f9651d;
/* 616 */                   ij3Var2 = (ij3) pd3Var3.f16749a;
/* 620 */                   kb1.m6058k("analytics.safelisted_events");
/* 623 */                   bundleM7407K = pd3Var3.m7407K();
/* 627 */                   if (bundleM7407K != null) {
/* 647 */                       if (bundleM7407K.containsKey("analytics.safelisted_events")) {
/* 654 */                           numValueOf = Integer.valueOf(bundleM7407K.getInt("analytics.safelisted_events"));
                                }
/* 658 */                       if (numValueOf != null) {
/* 670 */                           stringArray = ij3Var2.f9645a.getResources().getStringArray(numValueOf.intValue());
/* 674 */                           if (stringArray == null) {
/* 676 */                               listAsList = null;
                                    } else {
/* 678 */                               listAsList = Arrays.asList(stringArray);
                                    }
                                } else {
/* 676 */                           listAsList = null;
                                }
/* 697 */                       if (listAsList != null) {
/* 747 */                           ih3Var3.f9590V = listAsList;
                                    break;
                                }
/* 704 */                       if (listAsList.isEmpty()) {
/* 717 */                           it2 = listAsList.iterator();
/* 744 */                           do {
/* 725 */                               if (it2.hasNext()) {
/* 747 */                                   ih3Var3.f9590V = listAsList;
                                            break;
                                        } else {
/* 731 */                                   str2 = (String) it2.next();
/* 733 */                                   up3Var3 = ij3Var9.f9668w;
/* 735 */                                   ij3.m4553j(up3Var3);
                                        }
/* 744 */                           } while (up3Var3.m9075A0("safelisted event", str2));
                                } else {
/* 706 */                           ij3.m4555l(uh3Var5);
/* 713 */                           uh3Var5.f17531V.m8510a("Safelisted event list is empty. Ignoring");
                                }
/* 749 */                       if (packageManager != null) {
/* 755 */                           ih3Var3.f9592X = py0.m7609p0(context2) ? 1 : 0;
                                } else {
/* 759 */                           ih3Var3.f9592X = 0;
                                }
/* 767 */                       ((ij3) ih3Var3.f16749a).f9665n0.incrementAndGet();
/* 771 */                       ih3Var3.f18620b = true;
/* 775 */                       xl3Var = new xl3(ij3Var7);
/* 778 */                       xl3Var.m9577B();
/* 781 */                       ij3Var7.f9656f0 = xl3Var;
/* 785 */                       if (!xl3Var.f18620b) {
/* 2125 */                          f42.m3656l("Can't initialize twice");
/* 2128 */                          return;
                                }
/* 801 */                       xl3Var.f19246c = (JobScheduler) ((ij3) xl3Var.f16749a).f9645a.getSystemService("jobscheduler");
/* 809 */                       ((ij3) xl3Var.f16749a).f9665n0.incrementAndGet();
/* 813 */                       xl3Var.f18620b = true;
/* 815 */                       ij3.m4555l(uh3Var2);
/* 818 */                       sh3Var = uh3Var2.f17533X;
/* 820 */                       sh3Var2 = uh3Var2.f17532W;
/* 822 */                       sh3Var3 = uh3Var2.f17534Y;
/* 824 */                       sh3Var4 = uh3Var2.f17538f;
/* 826 */                       pd3Var.m7401E();
/* 838 */                       sh3Var2.m8511b(130000L, "App measurement initialized, version");
/* 841 */                       ij3.m4555l(uh3Var2);
/* 846 */                       sh3Var2.m8510a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
/* 849 */                       strM4534F = ih3Var.m4534F();
/* 859 */                       if (up3Var4.m9098Z(strM4534F, pd3Var.f15074c)) {
/* 861 */                           ij3.m4555l(uh3Var2);
/* 866 */                           sh3Var2.m8510a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                } else {
/* 870 */                           ij3.m4555l(uh3Var2);
/* 883 */                           sh3Var2.m8510a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM4534F)));
                                }
/* 886 */                       ij3.m4555l(uh3Var2);
/* 891 */                       sh3Var.m8510a("Debug-level message logging enabled");
/* 894 */                       i2 = ij3Var7.f9663l0;
/* 896 */                       atomicInteger = ij3Var7.f9665n0;
/* 902 */                       if (i2 != atomicInteger.get()) {
/* 904 */                           ij3.m4555l(uh3Var2);
/* 923 */                           sh3Var4.m8512c(Integer.valueOf(ij3Var7.f9663l0), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                                }
/* 927 */                       ij3Var7.f9657g0 = true;
/* 929 */                       j = ij3Var7.f9666o0;
/* 931 */                       sl3Var = ij3Var7.f9642X;
/* 933 */                       bj3 bj3Var4 = ij3Var7.f9659i;
/* 935 */                       ij3.m4555l(bj3Var4);
/* 938 */                       bj3Var4.mo1375y();
/* 943 */                       ij3.m4552i(ij3Var7.f9656f0);
/* 948 */                       zzinVarM9976E = ij3Var7.f9656f0.m9976E();
/* 952 */                       zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
/* 954 */                       zzql.zza();
/* 962 */                       zM7406J = pd3Var.m7406J(null, vg3.f18096Q0);
/* 966 */                       if (zzinVarM9976E == zzinVar) {
/* 968 */                           z = true;
                                } else {
/* 970 */                           z = false;
                                }
/* 973 */                       if (zM7406J) {
/* 975 */                           up3Var4.mo1375y();
/* 984 */                           if (up3Var4.m9096U() == 1) {
/* 990 */                               up3Var4.mo1375y();
/* 995 */                               IntentFilter intentFilter7 = new IntentFilter();
/* 1000 */                              intentFilter7.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                              intentFilter7.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                              ij3Var3 = ij3Var;
/* 1015 */                              z2 = z;
/* 1019 */                              sh3Var5 = sh3Var2;
/* 1022 */                              v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter7, 2);
/* 1025 */                              uh3 uh3Var19 = ij3Var3.f9655f;
/* 1027 */                              ij3.m4555l(uh3Var19);
/* 1034 */                              uh3Var19.f17533X.m8510a("Registered app receiver");
/* 1037 */                              if (z2) {
/* 1041 */                                  ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                                  ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                        }
                                    } else if (z) {
/* 989 */                               z = true;
/* 990 */                               up3Var4.mo1375y();
/* 995 */                               IntentFilter intentFilter8 = new IntentFilter();
/* 1000 */                              intentFilter8.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                              intentFilter8.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                              ij3Var3 = ij3Var;
/* 1015 */                              z2 = z;
/* 1019 */                              sh3Var5 = sh3Var2;
/* 1022 */                              v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter8, 2);
/* 1025 */                              uh3 uh3Var110 = ij3Var3.f9655f;
/* 1027 */                              ij3.m4555l(uh3Var110);
/* 1034 */                              uh3Var110.f17533X.m8510a("Registered app receiver");
/* 1037 */                              if (z2) {
/* 1041 */                                  ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                                  ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                        }
                                    } else {
/* 1063 */                              ij3Var3 = ij3Var;
/* 1065 */                              sh3Var5 = sh3Var2;
                                    }
                                } else if (z) {
/* 989 */                           z = true;
/* 990 */                           up3Var4.mo1375y();
/* 995 */                           IntentFilter intentFilter9 = new IntentFilter();
/* 1000 */                          intentFilter9.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                          intentFilter9.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                          ij3Var3 = ij3Var;
/* 1015 */                          z2 = z;
/* 1019 */                          sh3Var5 = sh3Var2;
/* 1022 */                          v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter9, 2);
/* 1025 */                          uh3 uh3Var111 = ij3Var3.f9655f;
/* 1027 */                          ij3.m4555l(uh3Var111);
/* 1034 */                          uh3Var111.f17533X.m8510a("Registered app receiver");
/* 1037 */                          if (z2) {
/* 1041 */                              ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                              ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                    }
                                } else {
/* 1063 */                          ij3Var3 = ij3Var;
/* 1065 */                          sh3Var5 = sh3Var2;
                                }
/* 1067 */                      c2220tj = ki3Var.f12813i;
/* 1069 */                      ok3VarM6116G = ki3Var.m6116G();
/* 1073 */                      int i8 = ok3VarM6116G.f14793b;
/* 1080 */                      lk3VarM7411O = pd3Var.m7411O("google_analytics_default_allow_ad_storage", false);
/* 1084 */                      ij3Var4 = ij3Var3;
/* 1088 */                      lk3VarM7411O2 = pd3Var.m7411O("google_analytics_default_allow_analytics_storage", false);
/* 1092 */                      lk3Var = lk3.UNINITIALIZED;
/* 1096 */                      nk3Var = nk3.ANALYTICS_STORAGE;
/* 1104 */                      if (lk3VarM7411O == lk3Var) {
/* 1118 */                          up3Var = up3Var4;
/* 1122 */                          j2 = j;
/* 1136 */                          if (ok3.m7186l(-10, ki3Var.m6113D().getInt("consent_source", 100))) {
/* 1140 */                              EnumMap enumMap5 = new EnumMap(nk3.class);
/* 1145 */                              enumMap5.put(nk3.AD_STORAGE, lk3VarM7411O);
/* 1148 */                              enumMap5.put(nk3Var, lk3VarM7411O2);
/* 1153 */                              ok3Var = new ok3(enumMap5, -10);
                                    } else {
/* 1169 */                              if (!TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1188 */                                  ij3.m4554k(sl3Var);
/* 1199 */                                  sl3Var.m8570U(new ok3(-10), false);
                                        }
/* 1186 */                              ok3Var = null;
                                    }
                                } else {
/* 1118 */                          up3Var = up3Var4;
/* 1122 */                          j2 = j;
/* 1136 */                          if (ok3.m7186l(-10, ki3Var.m6113D().getInt("consent_source", 100))) {
/* 1140 */                              EnumMap enumMap6 = new EnumMap(nk3.class);
/* 1145 */                              enumMap6.put(nk3.AD_STORAGE, lk3VarM7411O);
/* 1148 */                              enumMap6.put(nk3Var, lk3VarM7411O2);
/* 1153 */                              ok3Var = new ok3(enumMap6, -10);
                                    } else {
/* 1169 */                              if (!TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1188 */                                  ij3.m4554k(sl3Var);
/* 1199 */                                  sl3Var.m8570U(new ok3(-10), false);
                                        }
/* 1186 */                              ok3Var = null;
                                    }
                                }
/* 1203 */                      if (ok3Var != null) {
/* 1205 */                          ij3.m4554k(sl3Var);
/* 1209 */                          sl3Var.m8570U(ok3Var, true);
                                } else {
/* 1213 */                          ok3Var = ok3VarM6116G;
                                }
/* 1215 */                      ij3.m4554k(sl3Var);
/* 1220 */                      ij3Var5 = (ij3) sl3Var.f16749a;
/* 1222 */                      sl3Var.m8553D(ok3Var);
/* 1225 */                      ki3Var.mo1375y();
/* 1243 */                      int i9 = ce3.m1646b(ki3Var.m6113D().getString("dma_consent_settings", null)).f2866a;
/* 1248 */                      lk3VarM7411O3 = pd3Var.m7411O("google_analytics_default_allow_ad_personalization_signals", true);
/* 1252 */                      if (lk3VarM7411O3 != lk3Var) {
/* 1254 */                          ij3.m4555l(uh3Var2);
/* 1259 */                          sh3Var3.m8511b(lk3VarM7411O3, "Default ad personalization consent from Manifest");
                                }
/* 1264 */                      lk3VarM7411O4 = pd3Var.m7411O("google_analytics_default_allow_ad_user_data", true);
/* 1268 */                      if (lk3VarM7411O4 == lk3Var) {
/* 1313 */                          if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1349 */                              if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                                  ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                                  it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                                  while (it.hasNext()) {
/* 1391 */                                      if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                          ij3.m4554k(sl3Var);
/* 1397 */                                          sl3Var.m8569T(ce3VarM1647c, true);
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                              ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                              it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                              while (it.hasNext()) {
/* 1391 */                                  if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                      ij3.m4554k(sl3Var);
/* 1397 */                                      sl3Var.m8569T(ce3VarM1647c, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1349 */                          if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                              ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                              it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                              while (it.hasNext()) {
/* 1391 */                                  if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                      ij3.m4554k(sl3Var);
/* 1397 */                                      sl3Var.m8569T(ce3VarM1647c, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                          ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                          it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                          while (it.hasNext()) {
/* 1391 */                              if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                  ij3.m4554k(sl3Var);
/* 1397 */                                  sl3Var.m8569T(ce3VarM1647c, true);
                                            break;
                                        }
                                    }
                                }
/* 1402 */                      boolM7408L = pd3Var.m7408L("google_analytics_tcf_data_enabled");
/* 1406 */                      if (boolM7408L != null) {
/* 1414 */                          ij3.m4555l(uh3Var2);
/* 1419 */                          sh3Var.m8510a("TCF client enabled.");
/* 1422 */                          ij3.m4554k(sl3Var);
/* 1425 */                          sl3Var.mo1375y();
/* 1428 */                          uh3 uh3Var112 = ij3Var5.f9655f;
/* 1430 */                          ij3.m4555l(uh3Var112);
/* 1437 */                          uh3Var112.f17533X.m8510a("Register tcfPrefChangeListener.");
/* 1442 */                          if (sl3Var.f16691f0 == null) {
/* 1450 */                              sl3Var.f16692g0 = new wk3(sl3Var, ij3Var5, 2);
/* 1457 */                              sl3Var.f16691f0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rl3
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
/* 1 */                                         sl3 sl3Var2 = sl3Var;
/* 5 */                                         ij3 ij3Var10 = (ij3) sl3Var2.f16749a;
/* 7 */                                         pd3 pd3Var4 = ij3Var10.f9651d;
/* 9 */                                         uh3 uh3Var113 = ij3Var10.f9655f;
/* 24 */                                        if (!pd3Var4.m7406J(null, vg3.f18114Z0)) {
/* 30 */                                            if (Objects.equals(str8, "IABTCF_TCString")) {
/* 32 */                                                ij3.m4555l(uh3Var113);
/* 37 */                                                uh3Var113.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 40 */                                                wk3 wk3Var = sl3Var2.f16692g0;
/* 42 */                                                kb1.m6061n(wk3Var);
/* 45 */                                                wk3Var.m1348b(500L);
/* 48 */                                                return;
                                                    }
/* 72 */                                            return;
                                                }
/* 53 */                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
/* 73 */                                            ij3.m4555l(uh3Var113);
/* 78 */                                            uh3Var113.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 81 */                                            wk3 wk3Var2 = sl3Var2.f16692g0;
/* 83 */                                            kb1.m6061n(wk3Var2);
/* 86 */                                            wk3Var2.m1348b(500L);
                                                }
                                            }
                                        };
                                    }
/* 1459 */                          ki3 ki3Var10 = ij3Var5.f9653e;
/* 1461 */                          ij3.m4553j(ki3Var10);
/* 1470 */                          ki3Var10.m6114E().registerOnSharedPreferenceChangeListener(sl3Var.f16691f0);
/* 1473 */                          ij3.m4554k(sl3Var);
/* 1476 */                          sl3Var.m8555F();
                                } else {
/* 1414 */                          ij3.m4555l(uh3Var2);
/* 1419 */                          sh3Var.m8510a("TCF client enabled.");
/* 1422 */                          ij3.m4554k(sl3Var);
/* 1425 */                          sl3Var.mo1375y();
/* 1428 */                          uh3 uh3Var113 = ij3Var5.f9655f;
/* 1430 */                          ij3.m4555l(uh3Var113);
/* 1437 */                          uh3Var113.f17533X.m8510a("Register tcfPrefChangeListener.");
/* 1442 */                          if (sl3Var.f16691f0 == null) {
/* 1450 */                              sl3Var.f16692g0 = new wk3(sl3Var, ij3Var5, 2);
/* 1457 */                              sl3Var.f16691f0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rl3
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
/* 1 */                                         sl3 sl3Var2 = sl3Var;
/* 5 */                                         ij3 ij3Var10 = (ij3) sl3Var2.f16749a;
/* 7 */                                         pd3 pd3Var4 = ij3Var10.f9651d;
/* 9 */                                         uh3 uh3Var114 = ij3Var10.f9655f;
/* 24 */                                        if (!pd3Var4.m7406J(null, vg3.f18114Z0)) {
/* 30 */                                            if (Objects.equals(str8, "IABTCF_TCString")) {
/* 32 */                                                ij3.m4555l(uh3Var114);
/* 37 */                                                uh3Var114.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 40 */                                                wk3 wk3Var = sl3Var2.f16692g0;
/* 42 */                                                kb1.m6061n(wk3Var);
/* 45 */                                                wk3Var.m1348b(500L);
/* 48 */                                                return;
                                                    }
/* 72 */                                            return;
                                                }
/* 53 */                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
/* 73 */                                            ij3.m4555l(uh3Var114);
/* 78 */                                            uh3Var114.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 81 */                                            wk3 wk3Var2 = sl3Var2.f16692g0;
/* 83 */                                            kb1.m6061n(wk3Var2);
/* 86 */                                            wk3Var2.m1348b(500L);
                                                }
                                            }
                                        };
                                    }
/* 1459 */                          ki3 ki3Var11 = ij3Var5.f9653e;
/* 1461 */                          ij3.m4553j(ki3Var11);
/* 1470 */                          ki3Var11.m6114E().registerOnSharedPreferenceChangeListener(sl3Var.f16691f0);
/* 1473 */                          ij3.m4554k(sl3Var);
/* 1476 */                          sl3Var.m8555F();
                                }
/* 1479 */                      c1268s = ki3Var.f12809f;
/* 1489 */                      if (c1268s.m4932a() == 0) {
/* 1491 */                          ij3.m4555l(uh3Var2);
/* 1500 */                          sh3Var3.m8511b(Long.valueOf(j2), "Persisting first open");
/* 1503 */                          j3 = j2;
/* 1505 */                          c1268s.m4933b(j3);
                                } else {
/* 1509 */                          j3 = j2;
                                }
/* 1511 */                      ij3.m4554k(sl3Var);
/* 1514 */                      oi3Var = sl3Var.f16685c0;
/* 1520 */                      if (oi3Var.m7178d()) {
/* 1530 */                          ki3 ki3Var12 = oi3Var.f14773b.f9653e;
/* 1532 */                          ij3.m4553j(ki3Var12);
/* 1538 */                          ki3Var12.f12812h0.m8806n(null);
                                }
/* 1545 */                      if (ij3Var7.m4564h()) {
/* 1551 */                          if (ij3Var7.m4560d()) {
/* 1555 */                              up3Var2 = up3Var;
/* 1561 */                              if (up3Var2.m9097W("android.permission.INTERNET")) {
/* 1563 */                                  ij3.m4555l(uh3Var2);
/* 1568 */                                  sh3Var6 = sh3Var4;
/* 1570 */                                  sh3Var6.m8510a("App is missing INTERNET permission");
                                        } else {
/* 1574 */                                  sh3Var6 = sh3Var4;
                                        }
/* 1582 */                              if (!up3Var2.m9097W("android.permission.ACCESS_NETWORK_STATE")) {
/* 1584 */                                  ij3.m4555l(uh3Var2);
/* 1589 */                                  sh3Var6.m8510a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
/* 1592 */                              ij3Var6 = ij3Var7;
/* 1594 */                              context = ij3Var6.f9645a;
/* 1604 */                              if (!g93.m3898a(context).m9215d()) {
/* 1616 */                                  if (!up3.m9071p0(context)) {
/* 1618 */                                      ij3.m4555l(uh3Var2);
/* 1623 */                                      sh3Var6.m8510a("AppMeasurementReceiver not registered/enabled");
                                            }
/* 1630 */                                  if (!up3.m9065S(context)) {
/* 1632 */                                      ij3.m4555l(uh3Var2);
/* 1637 */                                      sh3Var6.m8510a("AppMeasurementService not registered/enabled");
                                            }
                                        }
/* 1640 */                              ij3.m4555l(uh3Var2);
/* 1645 */                              sh3Var6.m8510a("Uploading is not possible. App measurement disabled");
                                    } else {
/* 1652 */                              ij3Var6 = ij3Var7;
/* 1654 */                              up3Var2 = up3Var;
                                    }
/* 1648 */                          uh3Var = uh3Var2;
                                } else {
/* 1657 */                          ij3Var6 = ij3Var7;
/* 1659 */                          up3Var2 = up3Var;
/* 1673 */                          if (TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1679 */                              String strM4535G7 = ij3Var6.m4569q().m4535G();
/* 1683 */                              ki3Var.mo1375y();
/* 1693 */                              String string5 = ki3Var.m6113D().getString("gmp_app_id", null);
/* 1697 */                              zIsEmpty = TextUtils.isEmpty(strM4535G7);
/* 1701 */                              boolean zIsEmpty5 = TextUtils.isEmpty(string5);
/* 1705 */                              if (zIsEmpty) {
/* 1825 */                                  c2220tj2 = c2220tj;
                                        } else {
/* 1825 */                                  c2220tj2 = c2220tj;
                                        }
/* 1831 */                              String strM4535G8 = ij3Var6.m4569q().m4535G();
/* 1835 */                              ki3Var.mo1375y();
/* 1842 */                              SharedPreferences.Editor editorEdit7 = ki3Var.m6113D().edit();
/* 1846 */                              editorEdit7.putString("gmp_app_id", strM4535G8);
/* 1849 */                              editorEdit7.apply();
                                    } else {
/* 1853 */                              c2220tj2 = c2220tj;
                                    }
/* 1863 */                          if (!ki3Var.m6116G().m7189i(nk3Var)) {
/* 1866 */                              c2220tj2.m8806n(null);
                                    }
/* 1869 */                          ij3.m4554k(sl3Var);
/* 1878 */                          sl3Var.f16694i.set(c2220tj2.m8805m());
/* 1891 */                          ij3Var4.f9645a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
/* 1894 */                          uh3Var = uh3Var2;
/* 1937 */                          if (!TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1939 */                              zM4560d = ij3Var6.m4560d();
/* 1943 */                              sharedPreferences = ki3Var.f12803c;
/* 1945 */                              if (sharedPreferences == null) {
/* 1947 */                                  zContains = false;
                                        } else {
/* 1951 */                                  zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
/* 1955 */                              if (!zContains) {
/* 1965 */                                  ki3Var.m6118I(!zM4560d);
                                        }
/* 1968 */                              if (zM4560d) {
/* 1970 */                                  ij3.m4554k(sl3Var);
/* 1973 */                                  sl3Var.m8561L();
                                        }
/* 1976 */                              lo3 lo3Var5 = ij3Var6.f9667v;
/* 1978 */                              ij3.m4554k(lo3Var5);
/* 1983 */                              lo3Var5.f13437e.m7455a();
/* 1995 */                              ij3Var6.m4567o().m7508D(new AtomicReference());
/* 2008 */                              ij3Var6.m4567o().m7509E(ki3Var.f12815j0.m8119x());
                                    }
                                }
/* 2011 */                      zzql.zza();
/* 2021 */                      if (pd3Var.m7406J(null, vg3.f18096Q0)) {
/* 2023 */                          up3Var2.mo1375y();
/* 2032 */                          if (up3Var2.m9096U() == 1) {
/* 2042 */                              long jIntValue5 = ((Integer) vg3.f18172x0.m9011a(null)).intValue();
/* 2054 */                              long jNextInt5 = new Random().nextInt(5000);
/* 2065 */                              ij3Var6.f9640V.getClass();
/* 2075 */                              jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
/* 2081 */                              if (jMax > 500) {
/* 2083 */                                  ij3.m4555l(uh3Var);
/* 2092 */                                  sh3Var3.m8511b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
/* 2095 */                              ij3.m4554k(sl3Var);
/* 2098 */                              sl3Var.mo1375y();
/* 2103 */                              if (sl3Var.f16678W == null) {
/* 2111 */                                  sl3Var.f16678W = new wk3(sl3Var, ij3Var5, 0);
                                        }
/* 2115 */                              sl3Var.f16678W.m1348b(jMax);
                                    }
                                }
/* 2121 */                      ki3Var.f12800Z.m4239b(true);
                            }
/* 629 */                   uh3 uh3Var114 = ij3Var2.f9655f;
/* 631 */                   ij3.m4555l(uh3Var114);
/* 638 */                   uh3Var114.f17538f.m8510a("Failed to load metadata: Metadata bundle is null");
/* 641 */                   numValueOf = null;
/* 658 */                   if (numValueOf != null) {
/* 670 */                       stringArray = ij3Var2.f9645a.getResources().getStringArray(numValueOf.intValue());
/* 674 */                       if (stringArray == null) {
/* 676 */                           listAsList = null;
                                } else {
/* 678 */                           listAsList = Arrays.asList(stringArray);
                                }
                            } else {
/* 676 */                       listAsList = null;
                            }
/* 697 */                   if (listAsList != null) {
/* 747 */                       ih3Var3.f9590V = listAsList;
                                break;
                            }
/* 704 */                   if (listAsList.isEmpty()) {
/* 717 */                       it2 = listAsList.iterator();
/* 744 */                       do {
/* 725 */                           if (it2.hasNext()) {
/* 747 */                               ih3Var3.f9590V = listAsList;
                                        break;
                                    } else {
/* 731 */                               str2 = (String) it2.next();
/* 733 */                               up3Var3 = ij3Var9.f9668w;
/* 735 */                               ij3.m4553j(up3Var3);
                                    }
/* 744 */                       } while (up3Var3.m9075A0("safelisted event", str2));
                            } else {
/* 706 */                       ij3.m4555l(uh3Var5);
/* 713 */                       uh3Var5.f17531V.m8510a("Safelisted event list is empty. Ignoring");
                            }
/* 749 */                   if (packageManager != null) {
/* 755 */                       ih3Var3.f9592X = py0.m7609p0(context2) ? 1 : 0;
                            } else {
/* 759 */                       ih3Var3.f9592X = 0;
                            }
/* 767 */                   ((ij3) ih3Var3.f16749a).f9665n0.incrementAndGet();
/* 771 */                   ih3Var3.f18620b = true;
/* 775 */                   xl3Var = new xl3(ij3Var7);
/* 778 */                   xl3Var.m9577B();
/* 781 */                   ij3Var7.f9656f0 = xl3Var;
/* 785 */                   if (!xl3Var.f18620b) {
/* 2125 */                      f42.m3656l("Can't initialize twice");
/* 2128 */                      return;
                            }
/* 801 */                   xl3Var.f19246c = (JobScheduler) ((ij3) xl3Var.f16749a).f9645a.getSystemService("jobscheduler");
/* 809 */                   ((ij3) xl3Var.f16749a).f9665n0.incrementAndGet();
/* 813 */                   xl3Var.f18620b = true;
/* 815 */                   ij3.m4555l(uh3Var2);
/* 818 */                   sh3Var = uh3Var2.f17533X;
/* 820 */                   sh3Var2 = uh3Var2.f17532W;
/* 822 */                   sh3Var3 = uh3Var2.f17534Y;
/* 824 */                   sh3Var4 = uh3Var2.f17538f;
/* 826 */                   pd3Var.m7401E();
/* 838 */                   sh3Var2.m8511b(130000L, "App measurement initialized, version");
/* 841 */                   ij3.m4555l(uh3Var2);
/* 846 */                   sh3Var2.m8510a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
/* 849 */                   strM4534F = ih3Var.m4534F();
/* 859 */                   if (up3Var4.m9098Z(strM4534F, pd3Var.f15074c)) {
/* 861 */                       ij3.m4555l(uh3Var2);
/* 866 */                       sh3Var2.m8510a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
/* 870 */                       ij3.m4555l(uh3Var2);
/* 883 */                       sh3Var2.m8510a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM4534F)));
                            }
/* 886 */                   ij3.m4555l(uh3Var2);
/* 891 */                   sh3Var.m8510a("Debug-level message logging enabled");
/* 894 */                   i2 = ij3Var7.f9663l0;
/* 896 */                   atomicInteger = ij3Var7.f9665n0;
/* 902 */                   if (i2 != atomicInteger.get()) {
/* 904 */                       ij3.m4555l(uh3Var2);
/* 923 */                       sh3Var4.m8512c(Integer.valueOf(ij3Var7.f9663l0), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                            }
/* 927 */                   ij3Var7.f9657g0 = true;
/* 929 */                   j = ij3Var7.f9666o0;
/* 931 */                   sl3Var = ij3Var7.f9642X;
/* 933 */                   bj3 bj3Var5 = ij3Var7.f9659i;
/* 935 */                   ij3.m4555l(bj3Var5);
/* 938 */                   bj3Var5.mo1375y();
/* 943 */                   ij3.m4552i(ij3Var7.f9656f0);
/* 948 */                   zzinVarM9976E = ij3Var7.f9656f0.m9976E();
/* 952 */                   zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
/* 954 */                   zzql.zza();
/* 962 */                   zM7406J = pd3Var.m7406J(null, vg3.f18096Q0);
/* 966 */                   if (zzinVarM9976E == zzinVar) {
/* 968 */                       z = true;
                            } else {
/* 970 */                       z = false;
                            }
/* 973 */                   if (zM7406J) {
/* 975 */                       up3Var4.mo1375y();
/* 984 */                       if (up3Var4.m9096U() == 1) {
/* 990 */                           up3Var4.mo1375y();
/* 995 */                           IntentFilter intentFilter10 = new IntentFilter();
/* 1000 */                          intentFilter10.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                          intentFilter10.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                          ij3Var3 = ij3Var;
/* 1015 */                          z2 = z;
/* 1019 */                          sh3Var5 = sh3Var2;
/* 1022 */                          v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter10, 2);
/* 1025 */                          uh3 uh3Var115 = ij3Var3.f9655f;
/* 1027 */                          ij3.m4555l(uh3Var115);
/* 1034 */                          uh3Var115.f17533X.m8510a("Registered app receiver");
/* 1037 */                          if (z2) {
/* 1041 */                              ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                              ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                    }
                                } else if (z) {
/* 989 */                           z = true;
/* 990 */                           up3Var4.mo1375y();
/* 995 */                           IntentFilter intentFilter11 = new IntentFilter();
/* 1000 */                          intentFilter11.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                          intentFilter11.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                          ij3Var3 = ij3Var;
/* 1015 */                          z2 = z;
/* 1019 */                          sh3Var5 = sh3Var2;
/* 1022 */                          v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter11, 2);
/* 1025 */                          uh3 uh3Var116 = ij3Var3.f9655f;
/* 1027 */                          ij3.m4555l(uh3Var116);
/* 1034 */                          uh3Var116.f17533X.m8510a("Registered app receiver");
/* 1037 */                          if (z2) {
/* 1041 */                              ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                              ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                    }
                                } else {
/* 1063 */                          ij3Var3 = ij3Var;
/* 1065 */                          sh3Var5 = sh3Var2;
                                }
                            } else if (z) {
/* 989 */                       z = true;
/* 990 */                       up3Var4.mo1375y();
/* 995 */                       IntentFilter intentFilter12 = new IntentFilter();
/* 1000 */                      intentFilter12.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                      intentFilter12.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                      ij3Var3 = ij3Var;
/* 1015 */                      z2 = z;
/* 1019 */                      sh3Var5 = sh3Var2;
/* 1022 */                      v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter12, 2);
/* 1025 */                      uh3 uh3Var117 = ij3Var3.f9655f;
/* 1027 */                      ij3.m4555l(uh3Var117);
/* 1034 */                      uh3Var117.f17533X.m8510a("Registered app receiver");
/* 1037 */                      if (z2) {
/* 1041 */                          ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                          ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                }
                            } else {
/* 1063 */                      ij3Var3 = ij3Var;
/* 1065 */                      sh3Var5 = sh3Var2;
                            }
/* 1067 */                  c2220tj = ki3Var.f12813i;
/* 1069 */                  ok3VarM6116G = ki3Var.m6116G();
/* 1073 */                  int i10 = ok3VarM6116G.f14793b;
/* 1080 */                  lk3VarM7411O = pd3Var.m7411O("google_analytics_default_allow_ad_storage", false);
/* 1084 */                  ij3Var4 = ij3Var3;
/* 1088 */                  lk3VarM7411O2 = pd3Var.m7411O("google_analytics_default_allow_analytics_storage", false);
/* 1092 */                  lk3Var = lk3.UNINITIALIZED;
/* 1096 */                  nk3Var = nk3.ANALYTICS_STORAGE;
/* 1104 */                  if (lk3VarM7411O == lk3Var) {
/* 1118 */                      up3Var = up3Var4;
/* 1122 */                      j2 = j;
/* 1136 */                      if (ok3.m7186l(-10, ki3Var.m6113D().getInt("consent_source", 100))) {
/* 1140 */                          EnumMap enumMap7 = new EnumMap(nk3.class);
/* 1145 */                          enumMap7.put(nk3.AD_STORAGE, lk3VarM7411O);
/* 1148 */                          enumMap7.put(nk3Var, lk3VarM7411O2);
/* 1153 */                          ok3Var = new ok3(enumMap7, -10);
                                } else {
/* 1169 */                          if (!TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1188 */                              ij3.m4554k(sl3Var);
/* 1199 */                              sl3Var.m8570U(new ok3(-10), false);
                                    }
/* 1186 */                          ok3Var = null;
                                }
                            } else {
/* 1118 */                      up3Var = up3Var4;
/* 1122 */                      j2 = j;
/* 1136 */                      if (ok3.m7186l(-10, ki3Var.m6113D().getInt("consent_source", 100))) {
/* 1140 */                          EnumMap enumMap8 = new EnumMap(nk3.class);
/* 1145 */                          enumMap8.put(nk3.AD_STORAGE, lk3VarM7411O);
/* 1148 */                          enumMap8.put(nk3Var, lk3VarM7411O2);
/* 1153 */                          ok3Var = new ok3(enumMap8, -10);
                                } else {
/* 1169 */                          if (!TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1188 */                              ij3.m4554k(sl3Var);
/* 1199 */                              sl3Var.m8570U(new ok3(-10), false);
                                    }
/* 1186 */                          ok3Var = null;
                                }
                            }
/* 1203 */                  if (ok3Var != null) {
/* 1205 */                      ij3.m4554k(sl3Var);
/* 1209 */                      sl3Var.m8570U(ok3Var, true);
                            } else {
/* 1213 */                      ok3Var = ok3VarM6116G;
                            }
/* 1215 */                  ij3.m4554k(sl3Var);
/* 1220 */                  ij3Var5 = (ij3) sl3Var.f16749a;
/* 1222 */                  sl3Var.m8553D(ok3Var);
/* 1225 */                  ki3Var.mo1375y();
/* 1243 */                  int i11 = ce3.m1646b(ki3Var.m6113D().getString("dma_consent_settings", null)).f2866a;
/* 1248 */                  lk3VarM7411O3 = pd3Var.m7411O("google_analytics_default_allow_ad_personalization_signals", true);
/* 1252 */                  if (lk3VarM7411O3 != lk3Var) {
/* 1254 */                      ij3.m4555l(uh3Var2);
/* 1259 */                      sh3Var3.m8511b(lk3VarM7411O3, "Default ad personalization consent from Manifest");
                            }
/* 1264 */                  lk3VarM7411O4 = pd3Var.m7411O("google_analytics_default_allow_ad_user_data", true);
/* 1268 */                  if (lk3VarM7411O4 == lk3Var) {
/* 1313 */                      if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1349 */                          if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                              ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                              it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                              while (it.hasNext()) {
/* 1391 */                                  if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                      ij3.m4554k(sl3Var);
/* 1397 */                                      sl3Var.m8569T(ce3VarM1647c, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                          ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                          it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                          while (it.hasNext()) {
/* 1391 */                              if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                  ij3.m4554k(sl3Var);
/* 1397 */                                  sl3Var.m8569T(ce3VarM1647c, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1349 */                      if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                          ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                          it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                          while (it.hasNext()) {
/* 1391 */                              if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                  ij3.m4554k(sl3Var);
/* 1397 */                                  sl3Var.m8569T(ce3VarM1647c, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                      ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                      it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                      while (it.hasNext()) {
/* 1391 */                          if (((lk3) it.next()) != lk3Var) {
/* 1393 */                              ij3.m4554k(sl3Var);
/* 1397 */                              sl3Var.m8569T(ce3VarM1647c, true);
                                        break;
                                    }
                                }
                            }
/* 1402 */                  boolM7408L = pd3Var.m7408L("google_analytics_tcf_data_enabled");
/* 1406 */                  if (boolM7408L != null) {
/* 1414 */                      ij3.m4555l(uh3Var2);
/* 1419 */                      sh3Var.m8510a("TCF client enabled.");
/* 1422 */                      ij3.m4554k(sl3Var);
/* 1425 */                      sl3Var.mo1375y();
/* 1428 */                      uh3 uh3Var118 = ij3Var5.f9655f;
/* 1430 */                      ij3.m4555l(uh3Var118);
/* 1437 */                      uh3Var118.f17533X.m8510a("Register tcfPrefChangeListener.");
/* 1442 */                      if (sl3Var.f16691f0 == null) {
/* 1450 */                          sl3Var.f16692g0 = new wk3(sl3Var, ij3Var5, 2);
/* 1457 */                          sl3Var.f16691f0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rl3
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
/* 1 */                                     sl3 sl3Var2 = sl3Var;
/* 5 */                                     ij3 ij3Var10 = (ij3) sl3Var2.f16749a;
/* 7 */                                     pd3 pd3Var4 = ij3Var10.f9651d;
/* 9 */                                     uh3 uh3Var119 = ij3Var10.f9655f;
/* 24 */                                    if (!pd3Var4.m7406J(null, vg3.f18114Z0)) {
/* 30 */                                        if (Objects.equals(str8, "IABTCF_TCString")) {
/* 32 */                                            ij3.m4555l(uh3Var119);
/* 37 */                                            uh3Var119.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 40 */                                            wk3 wk3Var = sl3Var2.f16692g0;
/* 42 */                                            kb1.m6061n(wk3Var);
/* 45 */                                            wk3Var.m1348b(500L);
/* 48 */                                            return;
                                                }
/* 72 */                                        return;
                                            }
/* 53 */                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
/* 73 */                                        ij3.m4555l(uh3Var119);
/* 78 */                                        uh3Var119.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 81 */                                        wk3 wk3Var2 = sl3Var2.f16692g0;
/* 83 */                                        kb1.m6061n(wk3Var2);
/* 86 */                                        wk3Var2.m1348b(500L);
                                            }
                                        }
                                    };
                                }
/* 1459 */                      ki3 ki3Var13 = ij3Var5.f9653e;
/* 1461 */                      ij3.m4553j(ki3Var13);
/* 1470 */                      ki3Var13.m6114E().registerOnSharedPreferenceChangeListener(sl3Var.f16691f0);
/* 1473 */                      ij3.m4554k(sl3Var);
/* 1476 */                      sl3Var.m8555F();
                            } else {
/* 1414 */                      ij3.m4555l(uh3Var2);
/* 1419 */                      sh3Var.m8510a("TCF client enabled.");
/* 1422 */                      ij3.m4554k(sl3Var);
/* 1425 */                      sl3Var.mo1375y();
/* 1428 */                      uh3 uh3Var119 = ij3Var5.f9655f;
/* 1430 */                      ij3.m4555l(uh3Var119);
/* 1437 */                      uh3Var119.f17533X.m8510a("Register tcfPrefChangeListener.");
/* 1442 */                      if (sl3Var.f16691f0 == null) {
/* 1450 */                          sl3Var.f16692g0 = new wk3(sl3Var, ij3Var5, 2);
/* 1457 */                          sl3Var.f16691f0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rl3
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
/* 1 */                                     sl3 sl3Var2 = sl3Var;
/* 5 */                                     ij3 ij3Var10 = (ij3) sl3Var2.f16749a;
/* 7 */                                     pd3 pd3Var4 = ij3Var10.f9651d;
/* 9 */                                     uh3 uh3Var1110 = ij3Var10.f9655f;
/* 24 */                                    if (!pd3Var4.m7406J(null, vg3.f18114Z0)) {
/* 30 */                                        if (Objects.equals(str8, "IABTCF_TCString")) {
/* 32 */                                            ij3.m4555l(uh3Var1110);
/* 37 */                                            uh3Var1110.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 40 */                                            wk3 wk3Var = sl3Var2.f16692g0;
/* 42 */                                            kb1.m6061n(wk3Var);
/* 45 */                                            wk3Var.m1348b(500L);
/* 48 */                                            return;
                                                }
/* 72 */                                        return;
                                            }
/* 53 */                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
/* 73 */                                        ij3.m4555l(uh3Var1110);
/* 78 */                                        uh3Var1110.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 81 */                                        wk3 wk3Var2 = sl3Var2.f16692g0;
/* 83 */                                        kb1.m6061n(wk3Var2);
/* 86 */                                        wk3Var2.m1348b(500L);
                                            }
                                        }
                                    };
                                }
/* 1459 */                      ki3 ki3Var14 = ij3Var5.f9653e;
/* 1461 */                      ij3.m4553j(ki3Var14);
/* 1470 */                      ki3Var14.m6114E().registerOnSharedPreferenceChangeListener(sl3Var.f16691f0);
/* 1473 */                      ij3.m4554k(sl3Var);
/* 1476 */                      sl3Var.m8555F();
                            }
/* 1479 */                  c1268s = ki3Var.f12809f;
/* 1489 */                  if (c1268s.m4932a() == 0) {
/* 1491 */                      ij3.m4555l(uh3Var2);
/* 1500 */                      sh3Var3.m8511b(Long.valueOf(j2), "Persisting first open");
/* 1503 */                      j3 = j2;
/* 1505 */                      c1268s.m4933b(j3);
                            } else {
/* 1509 */                      j3 = j2;
                            }
/* 1511 */                  ij3.m4554k(sl3Var);
/* 1514 */                  oi3Var = sl3Var.f16685c0;
/* 1520 */                  if (oi3Var.m7178d()) {
/* 1530 */                      ki3 ki3Var15 = oi3Var.f14773b.f9653e;
/* 1532 */                      ij3.m4553j(ki3Var15);
/* 1538 */                      ki3Var15.f12812h0.m8806n(null);
                            }
/* 1545 */                  if (ij3Var7.m4564h()) {
/* 1551 */                      if (ij3Var7.m4560d()) {
/* 1555 */                          up3Var2 = up3Var;
/* 1561 */                          if (up3Var2.m9097W("android.permission.INTERNET")) {
/* 1563 */                              ij3.m4555l(uh3Var2);
/* 1568 */                              sh3Var6 = sh3Var4;
/* 1570 */                              sh3Var6.m8510a("App is missing INTERNET permission");
                                    } else {
/* 1574 */                              sh3Var6 = sh3Var4;
                                    }
/* 1582 */                          if (!up3Var2.m9097W("android.permission.ACCESS_NETWORK_STATE")) {
/* 1584 */                              ij3.m4555l(uh3Var2);
/* 1589 */                              sh3Var6.m8510a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
/* 1592 */                          ij3Var6 = ij3Var7;
/* 1594 */                          context = ij3Var6.f9645a;
/* 1604 */                          if (!g93.m3898a(context).m9215d()) {
/* 1616 */                              if (!up3.m9071p0(context)) {
/* 1618 */                                  ij3.m4555l(uh3Var2);
/* 1623 */                                  sh3Var6.m8510a("AppMeasurementReceiver not registered/enabled");
                                        }
/* 1630 */                              if (!up3.m9065S(context)) {
/* 1632 */                                  ij3.m4555l(uh3Var2);
/* 1637 */                                  sh3Var6.m8510a("AppMeasurementService not registered/enabled");
                                        }
                                    }
/* 1640 */                          ij3.m4555l(uh3Var2);
/* 1645 */                          sh3Var6.m8510a("Uploading is not possible. App measurement disabled");
                                } else {
/* 1652 */                          ij3Var6 = ij3Var7;
/* 1654 */                          up3Var2 = up3Var;
                                }
/* 1648 */                      uh3Var = uh3Var2;
                            } else {
/* 1657 */                      ij3Var6 = ij3Var7;
/* 1659 */                      up3Var2 = up3Var;
/* 1673 */                      if (TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1679 */                          String strM4535G9 = ij3Var6.m4569q().m4535G();
/* 1683 */                          ki3Var.mo1375y();
/* 1693 */                          String string6 = ki3Var.m6113D().getString("gmp_app_id", null);
/* 1697 */                          zIsEmpty = TextUtils.isEmpty(strM4535G9);
/* 1701 */                          boolean zIsEmpty6 = TextUtils.isEmpty(string6);
/* 1705 */                          if (zIsEmpty) {
/* 1825 */                              c2220tj2 = c2220tj;
                                    } else {
/* 1825 */                              c2220tj2 = c2220tj;
                                    }
/* 1831 */                          String strM4535G10 = ij3Var6.m4569q().m4535G();
/* 1835 */                          ki3Var.mo1375y();
/* 1842 */                          SharedPreferences.Editor editorEdit8 = ki3Var.m6113D().edit();
/* 1846 */                          editorEdit8.putString("gmp_app_id", strM4535G10);
/* 1849 */                          editorEdit8.apply();
                                } else {
/* 1853 */                          c2220tj2 = c2220tj;
                                }
/* 1863 */                      if (!ki3Var.m6116G().m7189i(nk3Var)) {
/* 1866 */                          c2220tj2.m8806n(null);
                                }
/* 1869 */                      ij3.m4554k(sl3Var);
/* 1878 */                      sl3Var.f16694i.set(c2220tj2.m8805m());
/* 1891 */                      ij3Var4.f9645a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
/* 1894 */                      uh3Var = uh3Var2;
/* 1937 */                      if (!TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1939 */                          zM4560d = ij3Var6.m4560d();
/* 1943 */                          sharedPreferences = ki3Var.f12803c;
/* 1945 */                          if (sharedPreferences == null) {
/* 1947 */                              zContains = false;
                                    } else {
/* 1951 */                              zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
/* 1955 */                          if (!zContains) {
/* 1965 */                              ki3Var.m6118I(!zM4560d);
                                    }
/* 1968 */                          if (zM4560d) {
/* 1970 */                              ij3.m4554k(sl3Var);
/* 1973 */                              sl3Var.m8561L();
                                    }
/* 1976 */                          lo3 lo3Var6 = ij3Var6.f9667v;
/* 1978 */                          ij3.m4554k(lo3Var6);
/* 1983 */                          lo3Var6.f13437e.m7455a();
/* 1995 */                          ij3Var6.m4567o().m7508D(new AtomicReference());
/* 2008 */                          ij3Var6.m4567o().m7509E(ki3Var.f12815j0.m8119x());
                                }
                            }
/* 2011 */                  zzql.zza();
/* 2021 */                  if (pd3Var.m7406J(null, vg3.f18096Q0)) {
/* 2023 */                      up3Var2.mo1375y();
/* 2032 */                      if (up3Var2.m9096U() == 1) {
/* 2042 */                          long jIntValue6 = ((Integer) vg3.f18172x0.m9011a(null)).intValue();
/* 2054 */                          long jNextInt6 = new Random().nextInt(5000);
/* 2065 */                          ij3Var6.f9640V.getClass();
/* 2075 */                          jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
/* 2081 */                          if (jMax > 500) {
/* 2083 */                              ij3.m4555l(uh3Var);
/* 2092 */                              sh3Var3.m8511b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
/* 2095 */                          ij3.m4554k(sl3Var);
/* 2098 */                          sl3Var.mo1375y();
/* 2103 */                          if (sl3Var.f16678W == null) {
/* 2111 */                              sl3Var.f16678W = new wk3(sl3Var, ij3Var5, 0);
                                    }
/* 2115 */                          sl3Var.f16678W.m1348b(jMax);
                                }
                            }
/* 2121 */                  ki3Var.f12800Z.m4239b(true);
                        }
/* 287 */               ij3.m4555l(uh3Var5);
/* 292 */               ih3Var = ih3Var2;
/* 298 */               ij3Var = ij3Var8;
/* 302 */               uh3Var5.f17538f.m8511b(uh3.m9013H(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
/* 562 */               strM7886S = qj3.m7886S(context2, ij3Var9.f9646a0);
/* 570 */               if (!TextUtils.isEmpty(strM7886S)) {
/* 573 */                   str3 = strM7886S;
                        }
/* 574 */               ih3Var3.f9593Y = str3;
/* 576 */               if (iM4563g == 0) {
/* 578 */                   ij3.m4555l(uh3Var5);
/* 589 */                   uh3Var5.f17534Y.m8512c(ih3Var3.f9597c, "App measurement enabled for app package, google app id", ih3Var3.f9593Y);
                        }
                    } catch (IllegalStateException e2) {
/* 595 */               ij3.m4555l(uh3Var5);
/* 606 */               uh3Var5.f17538f.m8512c(uh3.m9013H(packageName), "Fetching Google App Id failed with exception. appId", e2);
                    }
/* 307 */           i = Integer.MIN_VALUE;
/* 281 */           string = "Unknown";
/* 311 */           str = string;
/* 312 */           String str8 = installerPackageName;
/* 422 */           ih3Var3.f9597c = packageName;
/* 424 */           ih3Var3.f9600f = str8;
/* 426 */           ih3Var3.f9598d = str;
/* 428 */           ih3Var3.f9599e = i;
/* 430 */           ih3Var3.f9601i = string;
/* 434 */           ih3Var3.f9602v = 0L;
/* 436 */           iM4563g = ij3Var9.m4563g();
/* 440 */           if (iM4563g == 0) {
/* 548 */               ij3.m4555l(uh3Var5);
/* 555 */               uh3Var5.f17534Y.m8510a("App measurement collection enabled");
                    } else if (iM4563g == 1) {
/* 537 */               ij3.m4555l(uh3Var5);
/* 544 */               uh3Var5.f17532W.m8510a("App measurement deactivated via the manifest");
                    } else if (iM4563g == 3) {
/* 526 */               ij3.m4555l(uh3Var5);
/* 533 */               uh3Var5.f17532W.m8510a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                    } else if (iM4563g == 4) {
/* 515 */               ij3.m4555l(uh3Var5);
/* 522 */               uh3Var5.f17532W.m8510a("App measurement disabled via the manifest");
                    } else if (iM4563g == 6) {
/* 504 */               ij3.m4555l(uh3Var5);
/* 511 */               uh3Var5.f17531V.m8510a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                    } else if (iM4563g == 7) {
/* 493 */               ij3.m4555l(uh3Var5);
/* 500 */               uh3Var5.f17532W.m8510a("App measurement disabled via the global data collection setting");
                    } else if (iM4563g != 8) {
/* 461 */               ij3.m4555l(uh3Var5);
/* 468 */               uh3Var5.f17532W.m8510a("App measurement disabled");
/* 471 */               ij3.m4555l(uh3Var5);
/* 478 */               uh3Var5.f17539i.m8510a("Invalid scion state in identity");
                    } else {
/* 482 */               ij3.m4555l(uh3Var5);
/* 489 */               uh3Var5.f17532W.m8510a("App measurement disabled due to denied storage consent");
                    }
/* 558 */           ih3Var3.f9593Y = HttpUrl.FRAGMENT_ENCODE_SET;
/* 610 */           ih3Var3.f9590V = null;
/* 612 */           pd3 pd3Var4 = ij3Var9.f9651d;
/* 616 */           ij3Var2 = (ij3) pd3Var4.f16749a;
/* 620 */           kb1.m6058k("analytics.safelisted_events");
/* 623 */           bundleM7407K = pd3Var4.m7407K();
/* 627 */           if (bundleM7407K != null) {
/* 647 */               if (bundleM7407K.containsKey("analytics.safelisted_events")) {
/* 654 */                   numValueOf = Integer.valueOf(bundleM7407K.getInt("analytics.safelisted_events"));
                        }
/* 658 */               if (numValueOf != null) {
/* 670 */                   stringArray = ij3Var2.f9645a.getResources().getStringArray(numValueOf.intValue());
/* 674 */                   if (stringArray == null) {
/* 676 */                       listAsList = null;
                            } else {
/* 678 */                       listAsList = Arrays.asList(stringArray);
                            }
                        } else {
/* 676 */                   listAsList = null;
                        }
/* 697 */               if (listAsList != null) {
/* 747 */                   ih3Var3.f9590V = listAsList;
                            break;
                        }
/* 704 */               if (listAsList.isEmpty()) {
/* 717 */                   it2 = listAsList.iterator();
/* 744 */                   do {
/* 725 */                       if (it2.hasNext()) {
/* 747 */                           ih3Var3.f9590V = listAsList;
                                    break;
                                } else {
/* 731 */                           str2 = (String) it2.next();
/* 733 */                           up3Var3 = ij3Var9.f9668w;
/* 735 */                           ij3.m4553j(up3Var3);
                                }
/* 744 */                   } while (up3Var3.m9075A0("safelisted event", str2));
                        } else {
/* 706 */                   ij3.m4555l(uh3Var5);
/* 713 */                   uh3Var5.f17531V.m8510a("Safelisted event list is empty. Ignoring");
                        }
/* 749 */               if (packageManager != null) {
/* 755 */                   ih3Var3.f9592X = py0.m7609p0(context2) ? 1 : 0;
                        } else {
/* 759 */                   ih3Var3.f9592X = 0;
                        }
/* 767 */               ((ij3) ih3Var3.f16749a).f9665n0.incrementAndGet();
/* 771 */               ih3Var3.f18620b = true;
/* 775 */               xl3Var = new xl3(ij3Var7);
/* 778 */               xl3Var.m9577B();
/* 781 */               ij3Var7.f9656f0 = xl3Var;
/* 785 */               if (!xl3Var.f18620b) {
/* 2125 */                  f42.m3656l("Can't initialize twice");
/* 2128 */                  return;
                        }
/* 801 */               xl3Var.f19246c = (JobScheduler) ((ij3) xl3Var.f16749a).f9645a.getSystemService("jobscheduler");
/* 809 */               ((ij3) xl3Var.f16749a).f9665n0.incrementAndGet();
/* 813 */               xl3Var.f18620b = true;
/* 815 */               ij3.m4555l(uh3Var2);
/* 818 */               sh3Var = uh3Var2.f17533X;
/* 820 */               sh3Var2 = uh3Var2.f17532W;
/* 822 */               sh3Var3 = uh3Var2.f17534Y;
/* 824 */               sh3Var4 = uh3Var2.f17538f;
/* 826 */               pd3Var.m7401E();
/* 838 */               sh3Var2.m8511b(130000L, "App measurement initialized, version");
/* 841 */               ij3.m4555l(uh3Var2);
/* 846 */               sh3Var2.m8510a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
/* 849 */               strM4534F = ih3Var.m4534F();
/* 859 */               if (up3Var4.m9098Z(strM4534F, pd3Var.f15074c)) {
/* 861 */                   ij3.m4555l(uh3Var2);
/* 866 */                   sh3Var2.m8510a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
/* 870 */                   ij3.m4555l(uh3Var2);
/* 883 */                   sh3Var2.m8510a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM4534F)));
                        }
/* 886 */               ij3.m4555l(uh3Var2);
/* 891 */               sh3Var.m8510a("Debug-level message logging enabled");
/* 894 */               i2 = ij3Var7.f9663l0;
/* 896 */               atomicInteger = ij3Var7.f9665n0;
/* 902 */               if (i2 != atomicInteger.get()) {
/* 904 */                   ij3.m4555l(uh3Var2);
/* 923 */                   sh3Var4.m8512c(Integer.valueOf(ij3Var7.f9663l0), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                        }
/* 927 */               ij3Var7.f9657g0 = true;
/* 929 */               j = ij3Var7.f9666o0;
/* 931 */               sl3Var = ij3Var7.f9642X;
/* 933 */               bj3 bj3Var6 = ij3Var7.f9659i;
/* 935 */               ij3.m4555l(bj3Var6);
/* 938 */               bj3Var6.mo1375y();
/* 943 */               ij3.m4552i(ij3Var7.f9656f0);
/* 948 */               zzinVarM9976E = ij3Var7.f9656f0.m9976E();
/* 952 */               zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
/* 954 */               zzql.zza();
/* 962 */               zM7406J = pd3Var.m7406J(null, vg3.f18096Q0);
/* 966 */               if (zzinVarM9976E == zzinVar) {
/* 968 */                   z = true;
                        } else {
/* 970 */                   z = false;
                        }
/* 973 */               if (zM7406J) {
/* 975 */                   up3Var4.mo1375y();
/* 984 */                   if (up3Var4.m9096U() == 1) {
/* 990 */                       up3Var4.mo1375y();
/* 995 */                       IntentFilter intentFilter13 = new IntentFilter();
/* 1000 */                      intentFilter13.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                      intentFilter13.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                      ij3Var3 = ij3Var;
/* 1015 */                      z2 = z;
/* 1019 */                      sh3Var5 = sh3Var2;
/* 1022 */                      v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter13, 2);
/* 1025 */                      uh3 uh3Var1110 = ij3Var3.f9655f;
/* 1027 */                      ij3.m4555l(uh3Var1110);
/* 1034 */                      uh3Var1110.f17533X.m8510a("Registered app receiver");
/* 1037 */                      if (z2) {
/* 1041 */                          ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                          ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                }
                            } else if (z) {
/* 989 */                       z = true;
/* 990 */                       up3Var4.mo1375y();
/* 995 */                       IntentFilter intentFilter14 = new IntentFilter();
/* 1000 */                      intentFilter14.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                      intentFilter14.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                      ij3Var3 = ij3Var;
/* 1015 */                      z2 = z;
/* 1019 */                      sh3Var5 = sh3Var2;
/* 1022 */                      v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter14, 2);
/* 1025 */                      uh3 uh3Var1111 = ij3Var3.f9655f;
/* 1027 */                      ij3.m4555l(uh3Var1111);
/* 1034 */                      uh3Var1111.f17533X.m8510a("Registered app receiver");
/* 1037 */                      if (z2) {
/* 1041 */                          ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                          ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                                }
                            } else {
/* 1063 */                      ij3Var3 = ij3Var;
/* 1065 */                      sh3Var5 = sh3Var2;
                            }
                        } else if (z) {
/* 989 */                   z = true;
/* 990 */                   up3Var4.mo1375y();
/* 995 */                   IntentFilter intentFilter15 = new IntentFilter();
/* 1000 */                  intentFilter15.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                  intentFilter15.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                  ij3Var3 = ij3Var;
/* 1015 */                  z2 = z;
/* 1019 */                  sh3Var5 = sh3Var2;
/* 1022 */                  v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter15, 2);
/* 1025 */                  uh3 uh3Var1112 = ij3Var3.f9655f;
/* 1027 */                  ij3.m4555l(uh3Var1112);
/* 1034 */                  uh3Var1112.f17533X.m8510a("Registered app receiver");
/* 1037 */                  if (z2) {
/* 1041 */                      ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                      ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                            }
                        } else {
/* 1063 */                  ij3Var3 = ij3Var;
/* 1065 */                  sh3Var5 = sh3Var2;
                        }
/* 1067 */              c2220tj = ki3Var.f12813i;
/* 1069 */              ok3VarM6116G = ki3Var.m6116G();
/* 1073 */              int i12 = ok3VarM6116G.f14793b;
/* 1080 */              lk3VarM7411O = pd3Var.m7411O("google_analytics_default_allow_ad_storage", false);
/* 1084 */              ij3Var4 = ij3Var3;
/* 1088 */              lk3VarM7411O2 = pd3Var.m7411O("google_analytics_default_allow_analytics_storage", false);
/* 1092 */              lk3Var = lk3.UNINITIALIZED;
/* 1096 */              nk3Var = nk3.ANALYTICS_STORAGE;
/* 1104 */              if (lk3VarM7411O == lk3Var) {
/* 1118 */                  up3Var = up3Var4;
/* 1122 */                  j2 = j;
/* 1136 */                  if (ok3.m7186l(-10, ki3Var.m6113D().getInt("consent_source", 100))) {
/* 1140 */                      EnumMap enumMap9 = new EnumMap(nk3.class);
/* 1145 */                      enumMap9.put(nk3.AD_STORAGE, lk3VarM7411O);
/* 1148 */                      enumMap9.put(nk3Var, lk3VarM7411O2);
/* 1153 */                      ok3Var = new ok3(enumMap9, -10);
                            } else {
/* 1169 */                      if (!TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1188 */                          ij3.m4554k(sl3Var);
/* 1199 */                          sl3Var.m8570U(new ok3(-10), false);
                                }
/* 1186 */                      ok3Var = null;
                            }
                        } else {
/* 1118 */                  up3Var = up3Var4;
/* 1122 */                  j2 = j;
/* 1136 */                  if (ok3.m7186l(-10, ki3Var.m6113D().getInt("consent_source", 100))) {
/* 1140 */                      EnumMap enumMap10 = new EnumMap(nk3.class);
/* 1145 */                      enumMap10.put(nk3.AD_STORAGE, lk3VarM7411O);
/* 1148 */                      enumMap10.put(nk3Var, lk3VarM7411O2);
/* 1153 */                      ok3Var = new ok3(enumMap10, -10);
                            } else {
/* 1169 */                      if (!TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1188 */                          ij3.m4554k(sl3Var);
/* 1199 */                          sl3Var.m8570U(new ok3(-10), false);
                                }
/* 1186 */                      ok3Var = null;
                            }
                        }
/* 1203 */              if (ok3Var != null) {
/* 1205 */                  ij3.m4554k(sl3Var);
/* 1209 */                  sl3Var.m8570U(ok3Var, true);
                        } else {
/* 1213 */                  ok3Var = ok3VarM6116G;
                        }
/* 1215 */              ij3.m4554k(sl3Var);
/* 1220 */              ij3Var5 = (ij3) sl3Var.f16749a;
/* 1222 */              sl3Var.m8553D(ok3Var);
/* 1225 */              ki3Var.mo1375y();
/* 1243 */              int i13 = ce3.m1646b(ki3Var.m6113D().getString("dma_consent_settings", null)).f2866a;
/* 1248 */              lk3VarM7411O3 = pd3Var.m7411O("google_analytics_default_allow_ad_personalization_signals", true);
/* 1252 */              if (lk3VarM7411O3 != lk3Var) {
/* 1254 */                  ij3.m4555l(uh3Var2);
/* 1259 */                  sh3Var3.m8511b(lk3VarM7411O3, "Default ad personalization consent from Manifest");
                        }
/* 1264 */              lk3VarM7411O4 = pd3Var.m7411O("google_analytics_default_allow_ad_user_data", true);
/* 1268 */              if (lk3VarM7411O4 == lk3Var) {
/* 1313 */                  if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1349 */                      if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                          ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                          it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                          while (it.hasNext()) {
/* 1391 */                              if (((lk3) it.next()) != lk3Var) {
/* 1393 */                                  ij3.m4554k(sl3Var);
/* 1397 */                                  sl3Var.m8569T(ce3VarM1647c, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                      ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                      it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                      while (it.hasNext()) {
/* 1391 */                          if (((lk3) it.next()) != lk3Var) {
/* 1393 */                              ij3.m4554k(sl3Var);
/* 1397 */                              sl3Var.m8569T(ce3VarM1647c, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1349 */                  if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                      ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                      it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                      while (it.hasNext()) {
/* 1391 */                          if (((lk3) it.next()) != lk3Var) {
/* 1393 */                              ij3.m4554k(sl3Var);
/* 1397 */                              sl3Var.m8569T(ce3VarM1647c, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                  ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                  it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                  while (it.hasNext()) {
/* 1391 */                      if (((lk3) it.next()) != lk3Var) {
/* 1393 */                          ij3.m4554k(sl3Var);
/* 1397 */                          sl3Var.m8569T(ce3VarM1647c, true);
                                    break;
                                }
                            }
                        }
/* 1402 */              boolM7408L = pd3Var.m7408L("google_analytics_tcf_data_enabled");
/* 1406 */              if (boolM7408L != null) {
/* 1414 */                  ij3.m4555l(uh3Var2);
/* 1419 */                  sh3Var.m8510a("TCF client enabled.");
/* 1422 */                  ij3.m4554k(sl3Var);
/* 1425 */                  sl3Var.mo1375y();
/* 1428 */                  uh3 uh3Var1113 = ij3Var5.f9655f;
/* 1430 */                  ij3.m4555l(uh3Var1113);
/* 1437 */                  uh3Var1113.f17533X.m8510a("Register tcfPrefChangeListener.");
/* 1442 */                  if (sl3Var.f16691f0 == null) {
/* 1450 */                      sl3Var.f16692g0 = new wk3(sl3Var, ij3Var5, 2);
/* 1457 */                      sl3Var.f16691f0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rl3
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
/* 1 */                                 sl3 sl3Var2 = sl3Var;
/* 5 */                                 ij3 ij3Var10 = (ij3) sl3Var2.f16749a;
/* 7 */                                 pd3 pd3Var5 = ij3Var10.f9651d;
/* 9 */                                 uh3 uh3Var1114 = ij3Var10.f9655f;
/* 24 */                                if (!pd3Var5.m7406J(null, vg3.f18114Z0)) {
/* 30 */                                    if (Objects.equals(str9, "IABTCF_TCString")) {
/* 32 */                                        ij3.m4555l(uh3Var1114);
/* 37 */                                        uh3Var1114.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 40 */                                        wk3 wk3Var = sl3Var2.f16692g0;
/* 42 */                                        kb1.m6061n(wk3Var);
/* 45 */                                        wk3Var.m1348b(500L);
/* 48 */                                        return;
                                            }
/* 72 */                                    return;
                                        }
/* 53 */                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
/* 73 */                                    ij3.m4555l(uh3Var1114);
/* 78 */                                    uh3Var1114.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 81 */                                    wk3 wk3Var2 = sl3Var2.f16692g0;
/* 83 */                                    kb1.m6061n(wk3Var2);
/* 86 */                                    wk3Var2.m1348b(500L);
                                        }
                                    }
                                };
                            }
/* 1459 */                  ki3 ki3Var16 = ij3Var5.f9653e;
/* 1461 */                  ij3.m4553j(ki3Var16);
/* 1470 */                  ki3Var16.m6114E().registerOnSharedPreferenceChangeListener(sl3Var.f16691f0);
/* 1473 */                  ij3.m4554k(sl3Var);
/* 1476 */                  sl3Var.m8555F();
                        } else {
/* 1414 */                  ij3.m4555l(uh3Var2);
/* 1419 */                  sh3Var.m8510a("TCF client enabled.");
/* 1422 */                  ij3.m4554k(sl3Var);
/* 1425 */                  sl3Var.mo1375y();
/* 1428 */                  uh3 uh3Var1114 = ij3Var5.f9655f;
/* 1430 */                  ij3.m4555l(uh3Var1114);
/* 1437 */                  uh3Var1114.f17533X.m8510a("Register tcfPrefChangeListener.");
/* 1442 */                  if (sl3Var.f16691f0 == null) {
/* 1450 */                      sl3Var.f16692g0 = new wk3(sl3Var, ij3Var5, 2);
/* 1457 */                      sl3Var.f16691f0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rl3
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
/* 1 */                                 sl3 sl3Var2 = sl3Var;
/* 5 */                                 ij3 ij3Var10 = (ij3) sl3Var2.f16749a;
/* 7 */                                 pd3 pd3Var5 = ij3Var10.f9651d;
/* 9 */                                 uh3 uh3Var1115 = ij3Var10.f9655f;
/* 24 */                                if (!pd3Var5.m7406J(null, vg3.f18114Z0)) {
/* 30 */                                    if (Objects.equals(str9, "IABTCF_TCString")) {
/* 32 */                                        ij3.m4555l(uh3Var1115);
/* 37 */                                        uh3Var1115.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 40 */                                        wk3 wk3Var = sl3Var2.f16692g0;
/* 42 */                                        kb1.m6061n(wk3Var);
/* 45 */                                        wk3Var.m1348b(500L);
/* 48 */                                        return;
                                            }
/* 72 */                                    return;
                                        }
/* 53 */                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
/* 73 */                                    ij3.m4555l(uh3Var1115);
/* 78 */                                    uh3Var1115.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 81 */                                    wk3 wk3Var2 = sl3Var2.f16692g0;
/* 83 */                                    kb1.m6061n(wk3Var2);
/* 86 */                                    wk3Var2.m1348b(500L);
                                        }
                                    }
                                };
                            }
/* 1459 */                  ki3 ki3Var17 = ij3Var5.f9653e;
/* 1461 */                  ij3.m4553j(ki3Var17);
/* 1470 */                  ki3Var17.m6114E().registerOnSharedPreferenceChangeListener(sl3Var.f16691f0);
/* 1473 */                  ij3.m4554k(sl3Var);
/* 1476 */                  sl3Var.m8555F();
                        }
/* 1479 */              c1268s = ki3Var.f12809f;
/* 1489 */              if (c1268s.m4932a() == 0) {
/* 1491 */                  ij3.m4555l(uh3Var2);
/* 1500 */                  sh3Var3.m8511b(Long.valueOf(j2), "Persisting first open");
/* 1503 */                  j3 = j2;
/* 1505 */                  c1268s.m4933b(j3);
                        } else {
/* 1509 */                  j3 = j2;
                        }
/* 1511 */              ij3.m4554k(sl3Var);
/* 1514 */              oi3Var = sl3Var.f16685c0;
/* 1520 */              if (oi3Var.m7178d()) {
/* 1530 */                  ki3 ki3Var18 = oi3Var.f14773b.f9653e;
/* 1532 */                  ij3.m4553j(ki3Var18);
/* 1538 */                  ki3Var18.f12812h0.m8806n(null);
                        }
/* 1545 */              if (ij3Var7.m4564h()) {
/* 1551 */                  if (ij3Var7.m4560d()) {
/* 1555 */                      up3Var2 = up3Var;
/* 1561 */                      if (up3Var2.m9097W("android.permission.INTERNET")) {
/* 1563 */                          ij3.m4555l(uh3Var2);
/* 1568 */                          sh3Var6 = sh3Var4;
/* 1570 */                          sh3Var6.m8510a("App is missing INTERNET permission");
                                } else {
/* 1574 */                          sh3Var6 = sh3Var4;
                                }
/* 1582 */                      if (!up3Var2.m9097W("android.permission.ACCESS_NETWORK_STATE")) {
/* 1584 */                          ij3.m4555l(uh3Var2);
/* 1589 */                          sh3Var6.m8510a("App is missing ACCESS_NETWORK_STATE permission");
                                }
/* 1592 */                      ij3Var6 = ij3Var7;
/* 1594 */                      context = ij3Var6.f9645a;
/* 1604 */                      if (!g93.m3898a(context).m9215d()) {
/* 1616 */                          if (!up3.m9071p0(context)) {
/* 1618 */                              ij3.m4555l(uh3Var2);
/* 1623 */                              sh3Var6.m8510a("AppMeasurementReceiver not registered/enabled");
                                    }
/* 1630 */                          if (!up3.m9065S(context)) {
/* 1632 */                              ij3.m4555l(uh3Var2);
/* 1637 */                              sh3Var6.m8510a("AppMeasurementService not registered/enabled");
                                    }
                                }
/* 1640 */                      ij3.m4555l(uh3Var2);
/* 1645 */                      sh3Var6.m8510a("Uploading is not possible. App measurement disabled");
                            } else {
/* 1652 */                      ij3Var6 = ij3Var7;
/* 1654 */                      up3Var2 = up3Var;
                            }
/* 1648 */                  uh3Var = uh3Var2;
                        } else {
/* 1657 */                  ij3Var6 = ij3Var7;
/* 1659 */                  up3Var2 = up3Var;
/* 1673 */                  if (TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1679 */                      String strM4535G11 = ij3Var6.m4569q().m4535G();
/* 1683 */                      ki3Var.mo1375y();
/* 1693 */                      String string7 = ki3Var.m6113D().getString("gmp_app_id", null);
/* 1697 */                      zIsEmpty = TextUtils.isEmpty(strM4535G11);
/* 1701 */                      boolean zIsEmpty7 = TextUtils.isEmpty(string7);
/* 1705 */                      if (zIsEmpty) {
/* 1825 */                          c2220tj2 = c2220tj;
                                } else {
/* 1825 */                          c2220tj2 = c2220tj;
                                }
/* 1831 */                      String strM4535G12 = ij3Var6.m4569q().m4535G();
/* 1835 */                      ki3Var.mo1375y();
/* 1842 */                      SharedPreferences.Editor editorEdit9 = ki3Var.m6113D().edit();
/* 1846 */                      editorEdit9.putString("gmp_app_id", strM4535G12);
/* 1849 */                      editorEdit9.apply();
                            } else {
/* 1853 */                      c2220tj2 = c2220tj;
                            }
/* 1863 */                  if (!ki3Var.m6116G().m7189i(nk3Var)) {
/* 1866 */                      c2220tj2.m8806n(null);
                            }
/* 1869 */                  ij3.m4554k(sl3Var);
/* 1878 */                  sl3Var.f16694i.set(c2220tj2.m8805m());
/* 1891 */                  ij3Var4.f9645a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
/* 1894 */                  uh3Var = uh3Var2;
/* 1937 */                  if (!TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1939 */                      zM4560d = ij3Var6.m4560d();
/* 1943 */                      sharedPreferences = ki3Var.f12803c;
/* 1945 */                      if (sharedPreferences == null) {
/* 1947 */                          zContains = false;
                                } else {
/* 1951 */                          zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
/* 1955 */                      if (!zContains) {
/* 1965 */                          ki3Var.m6118I(!zM4560d);
                                }
/* 1968 */                      if (zM4560d) {
/* 1970 */                          ij3.m4554k(sl3Var);
/* 1973 */                          sl3Var.m8561L();
                                }
/* 1976 */                      lo3 lo3Var7 = ij3Var6.f9667v;
/* 1978 */                      ij3.m4554k(lo3Var7);
/* 1983 */                      lo3Var7.f13437e.m7455a();
/* 1995 */                      ij3Var6.m4567o().m7508D(new AtomicReference());
/* 2008 */                      ij3Var6.m4567o().m7509E(ki3Var.f12815j0.m8119x());
                            }
                        }
/* 2011 */              zzql.zza();
/* 2021 */              if (pd3Var.m7406J(null, vg3.f18096Q0)) {
/* 2023 */                  up3Var2.mo1375y();
/* 2032 */                  if (up3Var2.m9096U() == 1) {
/* 2042 */                      long jIntValue7 = ((Integer) vg3.f18172x0.m9011a(null)).intValue();
/* 2054 */                      long jNextInt7 = new Random().nextInt(5000);
/* 2065 */                      ij3Var6.f9640V.getClass();
/* 2075 */                      jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
/* 2081 */                      if (jMax > 500) {
/* 2083 */                          ij3.m4555l(uh3Var);
/* 2092 */                          sh3Var3.m8511b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
/* 2095 */                      ij3.m4554k(sl3Var);
/* 2098 */                      sl3Var.mo1375y();
/* 2103 */                      if (sl3Var.f16678W == null) {
/* 2111 */                          sl3Var.f16678W = new wk3(sl3Var, ij3Var5, 0);
                                }
/* 2115 */                      sl3Var.f16678W.m1348b(jMax);
                            }
                        }
/* 2121 */              ki3Var.f12800Z.m4239b(true);
                    }
/* 629 */           uh3 uh3Var1115 = ij3Var2.f9655f;
/* 631 */           ij3.m4555l(uh3Var1115);
/* 638 */           uh3Var1115.f17538f.m8510a("Failed to load metadata: Metadata bundle is null");
/* 641 */           numValueOf = null;
/* 658 */           if (numValueOf != null) {
/* 670 */               stringArray = ij3Var2.f9645a.getResources().getStringArray(numValueOf.intValue());
/* 674 */               if (stringArray == null) {
/* 676 */                   listAsList = null;
                        } else {
/* 678 */                   listAsList = Arrays.asList(stringArray);
                        }
                    } else {
/* 676 */               listAsList = null;
                    }
/* 697 */           if (listAsList != null) {
/* 747 */               ih3Var3.f9590V = listAsList;
                        break;
                    }
/* 704 */           if (listAsList.isEmpty()) {
/* 717 */               it2 = listAsList.iterator();
/* 744 */               do {
/* 725 */                   if (it2.hasNext()) {
/* 747 */                       ih3Var3.f9590V = listAsList;
                                break;
                            } else {
/* 731 */                       str2 = (String) it2.next();
/* 733 */                       up3Var3 = ij3Var9.f9668w;
/* 735 */                       ij3.m4553j(up3Var3);
                            }
/* 744 */               } while (up3Var3.m9075A0("safelisted event", str2));
                    } else {
/* 706 */               ij3.m4555l(uh3Var5);
/* 713 */               uh3Var5.f17531V.m8510a("Safelisted event list is empty. Ignoring");
                    }
/* 749 */           if (packageManager != null) {
/* 755 */               ih3Var3.f9592X = py0.m7609p0(context2) ? 1 : 0;
                    } else {
/* 759 */               ih3Var3.f9592X = 0;
                    }
/* 767 */           ((ij3) ih3Var3.f16749a).f9665n0.incrementAndGet();
/* 771 */           ih3Var3.f18620b = true;
/* 775 */           xl3Var = new xl3(ij3Var7);
/* 778 */           xl3Var.m9577B();
/* 781 */           ij3Var7.f9656f0 = xl3Var;
/* 785 */           if (!xl3Var.f18620b) {
/* 2125 */              f42.m3656l("Can't initialize twice");
/* 2128 */              return;
                    }
/* 801 */           xl3Var.f19246c = (JobScheduler) ((ij3) xl3Var.f16749a).f9645a.getSystemService("jobscheduler");
/* 809 */           ((ij3) xl3Var.f16749a).f9665n0.incrementAndGet();
/* 813 */           xl3Var.f18620b = true;
/* 815 */           ij3.m4555l(uh3Var2);
/* 818 */           sh3Var = uh3Var2.f17533X;
/* 820 */           sh3Var2 = uh3Var2.f17532W;
/* 822 */           sh3Var3 = uh3Var2.f17534Y;
/* 824 */           sh3Var4 = uh3Var2.f17538f;
/* 826 */           pd3Var.m7401E();
/* 838 */           sh3Var2.m8511b(130000L, "App measurement initialized, version");
/* 841 */           ij3.m4555l(uh3Var2);
/* 846 */           sh3Var2.m8510a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
/* 849 */           strM4534F = ih3Var.m4534F();
/* 859 */           if (up3Var4.m9098Z(strM4534F, pd3Var.f15074c)) {
/* 861 */               ij3.m4555l(uh3Var2);
/* 866 */               sh3Var2.m8510a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
/* 870 */               ij3.m4555l(uh3Var2);
/* 883 */               sh3Var2.m8510a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM4534F)));
                    }
/* 886 */           ij3.m4555l(uh3Var2);
/* 891 */           sh3Var.m8510a("Debug-level message logging enabled");
/* 894 */           i2 = ij3Var7.f9663l0;
/* 896 */           atomicInteger = ij3Var7.f9665n0;
/* 902 */           if (i2 != atomicInteger.get()) {
/* 904 */               ij3.m4555l(uh3Var2);
/* 923 */               sh3Var4.m8512c(Integer.valueOf(ij3Var7.f9663l0), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                    }
/* 927 */           ij3Var7.f9657g0 = true;
/* 929 */           j = ij3Var7.f9666o0;
/* 931 */           sl3Var = ij3Var7.f9642X;
/* 933 */           bj3 bj3Var7 = ij3Var7.f9659i;
/* 935 */           ij3.m4555l(bj3Var7);
/* 938 */           bj3Var7.mo1375y();
/* 943 */           ij3.m4552i(ij3Var7.f9656f0);
/* 948 */           zzinVarM9976E = ij3Var7.f9656f0.m9976E();
/* 952 */           zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
/* 954 */           zzql.zza();
/* 962 */           zM7406J = pd3Var.m7406J(null, vg3.f18096Q0);
/* 966 */           if (zzinVarM9976E == zzinVar) {
/* 968 */               z = true;
                    } else {
/* 970 */               z = false;
                    }
/* 973 */           if (zM7406J) {
/* 975 */               up3Var4.mo1375y();
/* 984 */               if (up3Var4.m9096U() == 1) {
/* 990 */                   up3Var4.mo1375y();
/* 995 */                   IntentFilter intentFilter16 = new IntentFilter();
/* 1000 */                  intentFilter16.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                  intentFilter16.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                  ij3Var3 = ij3Var;
/* 1015 */                  z2 = z;
/* 1019 */                  sh3Var5 = sh3Var2;
/* 1022 */                  v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter16, 2);
/* 1025 */                  uh3 uh3Var1116 = ij3Var3.f9655f;
/* 1027 */                  ij3.m4555l(uh3Var1116);
/* 1034 */                  uh3Var1116.f17533X.m8510a("Registered app receiver");
/* 1037 */                  if (z2) {
/* 1041 */                      ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                      ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                            }
                        } else if (z) {
/* 989 */                   z = true;
/* 990 */                   up3Var4.mo1375y();
/* 995 */                   IntentFilter intentFilter17 = new IntentFilter();
/* 1000 */                  intentFilter17.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */                  intentFilter17.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */                  ij3Var3 = ij3Var;
/* 1015 */                  z2 = z;
/* 1019 */                  sh3Var5 = sh3Var2;
/* 1022 */                  v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter17, 2);
/* 1025 */                  uh3 uh3Var1117 = ij3Var3.f9655f;
/* 1027 */                  ij3.m4555l(uh3Var1117);
/* 1034 */                  uh3Var1117.f17533X.m8510a("Registered app receiver");
/* 1037 */                  if (z2) {
/* 1041 */                      ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                      ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                            }
                        } else {
/* 1063 */                  ij3Var3 = ij3Var;
/* 1065 */                  sh3Var5 = sh3Var2;
                        }
                    } else if (z) {
/* 989 */               z = true;
/* 990 */               up3Var4.mo1375y();
/* 995 */               IntentFilter intentFilter18 = new IntentFilter();
/* 1000 */              intentFilter18.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1005 */              intentFilter18.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1010 */              ij3Var3 = ij3Var;
/* 1015 */              z2 = z;
/* 1019 */              sh3Var5 = sh3Var2;
/* 1022 */              v00.registerReceiver(ij3Var3.f9645a, new zzw(ij3Var3), intentFilter18, 2);
/* 1025 */              uh3 uh3Var1118 = ij3Var3.f9655f;
/* 1027 */              ij3.m4555l(uh3Var1118);
/* 1034 */              uh3Var1118.f17533X.m8510a("Registered app receiver");
/* 1037 */              if (z2) {
/* 1041 */                  ij3.m4552i(ij3Var7.f9656f0);
/* 1059 */                  ij3Var7.f9656f0.m9975D(((Long) vg3.f18067C.m9011a(null)).longValue());
                        }
                    } else {
/* 1063 */              ij3Var3 = ij3Var;
/* 1065 */              sh3Var5 = sh3Var2;
                    }
/* 1067 */          c2220tj = ki3Var.f12813i;
/* 1069 */          ok3VarM6116G = ki3Var.m6116G();
/* 1073 */          int i14 = ok3VarM6116G.f14793b;
/* 1080 */          lk3VarM7411O = pd3Var.m7411O("google_analytics_default_allow_ad_storage", false);
/* 1084 */          ij3Var4 = ij3Var3;
/* 1088 */          lk3VarM7411O2 = pd3Var.m7411O("google_analytics_default_allow_analytics_storage", false);
/* 1092 */          lk3Var = lk3.UNINITIALIZED;
/* 1096 */          nk3Var = nk3.ANALYTICS_STORAGE;
/* 1104 */          if (lk3VarM7411O == lk3Var) {
/* 1118 */              up3Var = up3Var4;
/* 1122 */              j2 = j;
/* 1136 */              if (ok3.m7186l(-10, ki3Var.m6113D().getInt("consent_source", 100))) {
/* 1140 */                  EnumMap enumMap11 = new EnumMap(nk3.class);
/* 1145 */                  enumMap11.put(nk3.AD_STORAGE, lk3VarM7411O);
/* 1148 */                  enumMap11.put(nk3Var, lk3VarM7411O2);
/* 1153 */                  ok3Var = new ok3(enumMap11, -10);
                        } else {
/* 1169 */                  if (!TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1188 */                      ij3.m4554k(sl3Var);
/* 1199 */                      sl3Var.m8570U(new ok3(-10), false);
                            }
/* 1186 */                  ok3Var = null;
                        }
                    } else {
/* 1118 */              up3Var = up3Var4;
/* 1122 */              j2 = j;
/* 1136 */              if (ok3.m7186l(-10, ki3Var.m6113D().getInt("consent_source", 100))) {
/* 1140 */                  EnumMap enumMap12 = new EnumMap(nk3.class);
/* 1145 */                  enumMap12.put(nk3.AD_STORAGE, lk3VarM7411O);
/* 1148 */                  enumMap12.put(nk3Var, lk3VarM7411O2);
/* 1153 */                  ok3Var = new ok3(enumMap12, -10);
                        } else {
/* 1169 */                  if (!TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1188 */                      ij3.m4554k(sl3Var);
/* 1199 */                      sl3Var.m8570U(new ok3(-10), false);
                            }
/* 1186 */                  ok3Var = null;
                        }
                    }
/* 1203 */          if (ok3Var != null) {
/* 1205 */              ij3.m4554k(sl3Var);
/* 1209 */              sl3Var.m8570U(ok3Var, true);
                    } else {
/* 1213 */              ok3Var = ok3VarM6116G;
                    }
/* 1215 */          ij3.m4554k(sl3Var);
/* 1220 */          ij3Var5 = (ij3) sl3Var.f16749a;
/* 1222 */          sl3Var.m8553D(ok3Var);
/* 1225 */          ki3Var.mo1375y();
/* 1243 */          int i15 = ce3.m1646b(ki3Var.m6113D().getString("dma_consent_settings", null)).f2866a;
/* 1248 */          lk3VarM7411O3 = pd3Var.m7411O("google_analytics_default_allow_ad_personalization_signals", true);
/* 1252 */          if (lk3VarM7411O3 != lk3Var) {
/* 1254 */              ij3.m4555l(uh3Var2);
/* 1259 */              sh3Var3.m8511b(lk3VarM7411O3, "Default ad personalization consent from Manifest");
                    }
/* 1264 */          lk3VarM7411O4 = pd3Var.m7411O("google_analytics_default_allow_ad_user_data", true);
/* 1268 */          if (lk3VarM7411O4 == lk3Var) {
/* 1313 */              if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1349 */                  if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                      ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                      it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                      while (it.hasNext()) {
/* 1391 */                          if (((lk3) it.next()) != lk3Var) {
/* 1393 */                              ij3.m4554k(sl3Var);
/* 1397 */                              sl3Var.m8569T(ce3VarM1647c, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                  ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                  it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                  while (it.hasNext()) {
/* 1391 */                      if (((lk3) it.next()) != lk3Var) {
/* 1393 */                          ij3.m4554k(sl3Var);
/* 1397 */                          sl3Var.m8569T(ce3VarM1647c, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1349 */              if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */                  ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */                  it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */                  while (it.hasNext()) {
/* 1391 */                      if (((lk3) it.next()) != lk3Var) {
/* 1393 */                          ij3.m4554k(sl3Var);
/* 1397 */                          sl3Var.m8569T(ce3VarM1647c, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(ij3Var7.m4569q().m4535G())) {
/* 1365 */              ce3VarM1647c = ce3.m1647c(30, bundle);
/* 1375 */              it = ce3VarM1647c.f2870e.values().iterator();
/* 1383 */              while (it.hasNext()) {
/* 1391 */                  if (((lk3) it.next()) != lk3Var) {
/* 1393 */                      ij3.m4554k(sl3Var);
/* 1397 */                      sl3Var.m8569T(ce3VarM1647c, true);
                                break;
                            }
                        }
                    }
/* 1402 */          boolM7408L = pd3Var.m7408L("google_analytics_tcf_data_enabled");
/* 1406 */          if (boolM7408L != null) {
/* 1414 */              ij3.m4555l(uh3Var2);
/* 1419 */              sh3Var.m8510a("TCF client enabled.");
/* 1422 */              ij3.m4554k(sl3Var);
/* 1425 */              sl3Var.mo1375y();
/* 1428 */              uh3 uh3Var1119 = ij3Var5.f9655f;
/* 1430 */              ij3.m4555l(uh3Var1119);
/* 1437 */              uh3Var1119.f17533X.m8510a("Register tcfPrefChangeListener.");
/* 1442 */              if (sl3Var.f16691f0 == null) {
/* 1450 */                  sl3Var.f16692g0 = new wk3(sl3Var, ij3Var5, 2);
/* 1457 */                  sl3Var.f16691f0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rl3
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
/* 1 */                             sl3 sl3Var2 = sl3Var;
/* 5 */                             ij3 ij3Var10 = (ij3) sl3Var2.f16749a;
/* 7 */                             pd3 pd3Var5 = ij3Var10.f9651d;
/* 9 */                             uh3 uh3Var11110 = ij3Var10.f9655f;
/* 24 */                            if (!pd3Var5.m7406J(null, vg3.f18114Z0)) {
/* 30 */                                if (Objects.equals(str9, "IABTCF_TCString")) {
/* 32 */                                    ij3.m4555l(uh3Var11110);
/* 37 */                                    uh3Var11110.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 40 */                                    wk3 wk3Var = sl3Var2.f16692g0;
/* 42 */                                    kb1.m6061n(wk3Var);
/* 45 */                                    wk3Var.m1348b(500L);
/* 48 */                                    return;
                                        }
/* 72 */                                return;
                                    }
/* 53 */                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
/* 73 */                                ij3.m4555l(uh3Var11110);
/* 78 */                                uh3Var11110.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 81 */                                wk3 wk3Var2 = sl3Var2.f16692g0;
/* 83 */                                kb1.m6061n(wk3Var2);
/* 86 */                                wk3Var2.m1348b(500L);
                                    }
                                }
                            };
                        }
/* 1459 */              ki3 ki3Var19 = ij3Var5.f9653e;
/* 1461 */              ij3.m4553j(ki3Var19);
/* 1470 */              ki3Var19.m6114E().registerOnSharedPreferenceChangeListener(sl3Var.f16691f0);
/* 1473 */              ij3.m4554k(sl3Var);
/* 1476 */              sl3Var.m8555F();
                    } else {
/* 1414 */              ij3.m4555l(uh3Var2);
/* 1419 */              sh3Var.m8510a("TCF client enabled.");
/* 1422 */              ij3.m4554k(sl3Var);
/* 1425 */              sl3Var.mo1375y();
/* 1428 */              uh3 uh3Var11110 = ij3Var5.f9655f;
/* 1430 */              ij3.m4555l(uh3Var11110);
/* 1437 */              uh3Var11110.f17533X.m8510a("Register tcfPrefChangeListener.");
/* 1442 */              if (sl3Var.f16691f0 == null) {
/* 1450 */                  sl3Var.f16692g0 = new wk3(sl3Var, ij3Var5, 2);
/* 1457 */                  sl3Var.f16691f0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rl3
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
/* 1 */                             sl3 sl3Var2 = sl3Var;
/* 5 */                             ij3 ij3Var10 = (ij3) sl3Var2.f16749a;
/* 7 */                             pd3 pd3Var5 = ij3Var10.f9651d;
/* 9 */                             uh3 uh3Var11111 = ij3Var10.f9655f;
/* 24 */                            if (!pd3Var5.m7406J(null, vg3.f18114Z0)) {
/* 30 */                                if (Objects.equals(str9, "IABTCF_TCString")) {
/* 32 */                                    ij3.m4555l(uh3Var11111);
/* 37 */                                    uh3Var11111.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 40 */                                    wk3 wk3Var = sl3Var2.f16692g0;
/* 42 */                                    kb1.m6061n(wk3Var);
/* 45 */                                    wk3Var.m1348b(500L);
/* 48 */                                    return;
                                        }
/* 72 */                                return;
                                    }
/* 53 */                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
/* 73 */                                ij3.m4555l(uh3Var11111);
/* 78 */                                uh3Var11111.f17534Y.m8510a("IABTCF_TCString change picked up in listener.");
/* 81 */                                wk3 wk3Var2 = sl3Var2.f16692g0;
/* 83 */                                kb1.m6061n(wk3Var2);
/* 86 */                                wk3Var2.m1348b(500L);
                                    }
                                }
                            };
                        }
/* 1459 */              ki3 ki3Var110 = ij3Var5.f9653e;
/* 1461 */              ij3.m4553j(ki3Var110);
/* 1470 */              ki3Var110.m6114E().registerOnSharedPreferenceChangeListener(sl3Var.f16691f0);
/* 1473 */              ij3.m4554k(sl3Var);
/* 1476 */              sl3Var.m8555F();
                    }
/* 1479 */          c1268s = ki3Var.f12809f;
/* 1489 */          if (c1268s.m4932a() == 0) {
/* 1491 */              ij3.m4555l(uh3Var2);
/* 1500 */              sh3Var3.m8511b(Long.valueOf(j2), "Persisting first open");
/* 1503 */              j3 = j2;
/* 1505 */              c1268s.m4933b(j3);
                    } else {
/* 1509 */              j3 = j2;
                    }
/* 1511 */          ij3.m4554k(sl3Var);
/* 1514 */          oi3Var = sl3Var.f16685c0;
/* 1520 */          if (oi3Var.m7178d()) {
/* 1530 */              ki3 ki3Var111 = oi3Var.f14773b.f9653e;
/* 1532 */              ij3.m4553j(ki3Var111);
/* 1538 */              ki3Var111.f12812h0.m8806n(null);
                    }
/* 1545 */          if (ij3Var7.m4564h()) {
/* 1551 */              if (ij3Var7.m4560d()) {
/* 1555 */                  up3Var2 = up3Var;
/* 1561 */                  if (up3Var2.m9097W("android.permission.INTERNET")) {
/* 1563 */                      ij3.m4555l(uh3Var2);
/* 1568 */                      sh3Var6 = sh3Var4;
/* 1570 */                      sh3Var6.m8510a("App is missing INTERNET permission");
                            } else {
/* 1574 */                      sh3Var6 = sh3Var4;
                            }
/* 1582 */                  if (!up3Var2.m9097W("android.permission.ACCESS_NETWORK_STATE")) {
/* 1584 */                      ij3.m4555l(uh3Var2);
/* 1589 */                      sh3Var6.m8510a("App is missing ACCESS_NETWORK_STATE permission");
                            }
/* 1592 */                  ij3Var6 = ij3Var7;
/* 1594 */                  context = ij3Var6.f9645a;
/* 1604 */                  if (!g93.m3898a(context).m9215d()) {
/* 1616 */                      if (!up3.m9071p0(context)) {
/* 1618 */                          ij3.m4555l(uh3Var2);
/* 1623 */                          sh3Var6.m8510a("AppMeasurementReceiver not registered/enabled");
                                }
/* 1630 */                      if (!up3.m9065S(context)) {
/* 1632 */                          ij3.m4555l(uh3Var2);
/* 1637 */                          sh3Var6.m8510a("AppMeasurementService not registered/enabled");
                                }
                            }
/* 1640 */                  ij3.m4555l(uh3Var2);
/* 1645 */                  sh3Var6.m8510a("Uploading is not possible. App measurement disabled");
                        } else {
/* 1652 */                  ij3Var6 = ij3Var7;
/* 1654 */                  up3Var2 = up3Var;
                        }
/* 1648 */              uh3Var = uh3Var2;
                    } else {
/* 1657 */              ij3Var6 = ij3Var7;
/* 1659 */              up3Var2 = up3Var;
/* 1673 */              if (TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1679 */                  String strM4535G13 = ij3Var6.m4569q().m4535G();
/* 1683 */                  ki3Var.mo1375y();
/* 1693 */                  String string8 = ki3Var.m6113D().getString("gmp_app_id", null);
/* 1697 */                  zIsEmpty = TextUtils.isEmpty(strM4535G13);
/* 1701 */                  boolean zIsEmpty8 = TextUtils.isEmpty(string8);
/* 1705 */                  if (zIsEmpty) {
/* 1825 */                      c2220tj2 = c2220tj;
                            } else {
/* 1825 */                      c2220tj2 = c2220tj;
                            }
/* 1831 */                  String strM4535G14 = ij3Var6.m4569q().m4535G();
/* 1835 */                  ki3Var.mo1375y();
/* 1842 */                  SharedPreferences.Editor editorEdit10 = ki3Var.m6113D().edit();
/* 1846 */                  editorEdit10.putString("gmp_app_id", strM4535G14);
/* 1849 */                  editorEdit10.apply();
                        } else {
/* 1853 */                  c2220tj2 = c2220tj;
                        }
/* 1863 */              if (!ki3Var.m6116G().m7189i(nk3Var)) {
/* 1866 */                  c2220tj2.m8806n(null);
                        }
/* 1869 */              ij3.m4554k(sl3Var);
/* 1878 */              sl3Var.f16694i.set(c2220tj2.m8805m());
/* 1891 */              ij3Var4.f9645a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
/* 1894 */              uh3Var = uh3Var2;
/* 1937 */              if (!TextUtils.isEmpty(ij3Var6.m4569q().m4535G())) {
/* 1939 */                  zM4560d = ij3Var6.m4560d();
/* 1943 */                  sharedPreferences = ki3Var.f12803c;
/* 1945 */                  if (sharedPreferences == null) {
/* 1947 */                      zContains = false;
                            } else {
/* 1951 */                      zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
/* 1955 */                  if (!zContains) {
/* 1965 */                      ki3Var.m6118I(!zM4560d);
                            }
/* 1968 */                  if (zM4560d) {
/* 1970 */                      ij3.m4554k(sl3Var);
/* 1973 */                      sl3Var.m8561L();
                            }
/* 1976 */                  lo3 lo3Var8 = ij3Var6.f9667v;
/* 1978 */                  ij3.m4554k(lo3Var8);
/* 1983 */                  lo3Var8.f13437e.m7455a();
/* 1995 */                  ij3Var6.m4567o().m7508D(new AtomicReference());
/* 2008 */                  ij3Var6.m4567o().m7509E(ki3Var.f12815j0.m8119x());
                        }
                    }
/* 2011 */          zzql.zza();
/* 2021 */          if (pd3Var.m7406J(null, vg3.f18096Q0)) {
/* 2023 */              up3Var2.mo1375y();
/* 2032 */              if (up3Var2.m9096U() == 1) {
/* 2042 */                  long jIntValue8 = ((Integer) vg3.f18172x0.m9011a(null)).intValue();
/* 2054 */                  long jNextInt8 = new Random().nextInt(5000);
/* 2065 */                  ij3Var6.f9640V.getClass();
/* 2075 */                  jMax = Math.max(500L, ((jIntValue8 * 1000) + jNextInt8) - SystemClock.elapsedRealtime());
/* 2081 */                  if (jMax > 500) {
/* 2083 */                      ij3.m4555l(uh3Var);
/* 2092 */                      sh3Var3.m8511b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
/* 2095 */                  ij3.m4554k(sl3Var);
/* 2098 */                  sl3Var.mo1375y();
/* 2103 */                  if (sl3Var.f16678W == null) {
/* 2111 */                      sl3Var.f16678W = new wk3(sl3Var, ij3Var5, 0);
                            }
/* 2115 */                  sl3Var.f16678W.m1348b(jMax);
                        }
                    }
/* 2121 */          ki3Var.f12800Z.m4239b(true);
                }

                /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
                
                    if (r1 == false) goto L51;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
                
                    r1 = r1 | java.lang.Thread.interrupted();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
                
                    ((java.lang.Runnable) r10.f7358b).run();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
                
                    r3 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
                
                    p000.x92.f18998f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f7358b), (java.lang.Throwable) r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
                
                    r10.f7358b = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
                
                    throw r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
                
                    return;
                 */
                /* JADX INFO: renamed from: b */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void m3170b() {
                    Runnable runnable;
/* 1 */             boolean z = false;
/* 2 */             boolean zInterrupted = false;
                    while (true) {
                        try {
                            synchronized (((x92) this.f7359c).f19000b) {
/* 11 */                        if (z) {
/* 55 */                            runnable = (Runnable) ((x92) this.f7359c).f19000b.poll();
/* 57 */                            this.f7358b = runnable;
/* 59 */                            if (runnable == null) {
/* 65 */                                ((x92) this.f7359c).f19001c = 1;
                                    }
                                } else {
/* 15 */                            x92 x92Var = (x92) this.f7359c;
/* 20 */                            if (x92Var.f19001c != 4) {
/* 40 */                                x92Var.f19002d++;
/* 42 */                                x92Var.f19001c = 4;
/* 44 */                                z = true;
/* 55 */                                runnable = (Runnable) ((x92) this.f7359c).f19000b.poll();
/* 57 */                                this.f7358b = runnable;
/* 59 */                                if (runnable == null) {
/* 65 */                                    ((x92) this.f7359c).f19001c = 1;
                                        }
                                    }
                                }
                            }
/* 23 */                    if (zInterrupted) {
                                break;
                            } else {
/* 71 */                        return;
                            }
/* 86 */                    this.f7358b = null;
                        } catch (Throwable th) {
/* 128 */                   if (zInterrupted) {
/* 134 */                       Thread.currentThread().interrupt();
                            }
/* 137 */                   throw th;
                        }
                    }
/* 29 */            Thread.currentThread().interrupt();
                }

                /* JADX WARN: Code duplicated, block: B:242:0x0556  */
                /* JADX WARN: Code duplicated, block: B:25:0x0106  */
                /* JADX WARN: Code duplicated, block: B:302:0x066d  */
                /* JADX WARN: Code duplicated, block: B:305:0x0676  */
                /* JADX WARN: Code duplicated, block: B:311:0x06a0 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:314:0x06a6  */
                /* JADX WARN: Code duplicated, block: B:320:0x06b4  */
                /* JADX WARN: Code duplicated, block: B:447:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:463:0x06ae A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    hg1 hg1Var;
                    boolean zEquals;
                    boolean z;
                    ru1[] ru1VarArr;
                    int i;
                    int i2;
                    String str;
                    String str2;
                    String str3;
                    Typeface typeface;
                    IAccountAccessor iAccountAccessor;
                    IAccountAccessor zztVar;
                    Long lValueOf;
/* 1 */             dp0 dp0Var = this;
/* 8 */             int i3 = 0;
/* 10 */            int i4 = 1;
                    switch (dp0Var.f7357a) {
                        case 0:
/* 2236 */                  xo0 xo0Var = (xo0) dp0Var.f7359c;
                            try {
/* 2246 */                      xo0Var.onSuccess(w11.m9442n((Future) dp0Var.f7358b));
/* 2273 */                      return;
                            } catch (Error e) {
/* 2250 */                      e = e;
/* 2256 */                      xo0Var.onFailure(e);
/* 2273 */                      return;
                            } catch (RuntimeException e2) {
/* 2252 */                      e = e2;
/* 2256 */                      xo0Var.onFailure(e);
/* 2273 */                      return;
                            } catch (ExecutionException e3) {
/* 2260 */                      Throwable cause = e3.getCause();
/* 2264 */                      if (cause == null) {
/* 2266 */                          xo0Var.onFailure(e3);
/* 2273 */                          return;
                                } else {
/* 2270 */                          xo0Var.onFailure(cause);
/* 2273 */                          return;
                                }
                            }
                        case 1:
/* 2181 */                  C0829d2 c0829d2 = (C0829d2) dp0Var.f7358b;
/* 2185 */                  C0062b c0062b = (C0062b) dp0Var.f7359c;
/* 2187 */                  jg1 jg1Var = c0062b.f9606c;
/* 2189 */                  if (jg1Var != null && (hg1Var = jg1Var.f12260e) != null) {
/* 2195 */                      hg1Var.mo3407l(jg1Var);
                            }
/* 2200 */                  View view = (View) c0062b.f9611v;
/* 2202 */                  if (view != null && view.getWindowToken() != null) {
/* 2214 */                      if (c0829d2.m10351b()) {
/* 2227 */                          c0062b.f748e0 = c0829d2;
                                } else if (c0829d2.f20140e != null) {
/* 2224 */                          c0829d2.m10352d(0, 0, false, false);
/* 2227 */                          c0062b.f748e0 = c0829d2;
                                }
                            }
/* 2230 */                  c0062b.f750g0 = null;
/* 2232 */                  return;
                        case 2:
/* 2175 */                  ((Application) dp0Var.f7358b).unregisterActivityLifecycleCallbacks((C0005a3) dp0Var.f7359c);
/* 2178 */                  return;
                        case 3:
                            try {
/* 2158 */                      ((ClipboardManager) ((GameApp) dp0Var.f7358b).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", (String) dp0Var.f7359c));
/* 2166 */                      return;
                            } catch (Exception e4) {
/* 2163 */                      GameApp.debuggerException(e4);
/* 2166 */                      return;
                            }
                        case 4:
                            try {
                                try {
                                    try {
/* 2073 */                              RunnableC1901ls runnableC1901ls = (RunnableC1901ls) dp0Var.f7359c;
/* 2079 */                              Object objM9448r = w11.m9448r((s81) dp0Var.f7358b);
/* 2083 */                              C2260um c2260um = runnableC1901ls.f19731b;
/* 2085 */                              if (c2260um != null) {
/* 2087 */                                  c2260um.m9040a(objM9448r);
                                        }
                                    } finally {
/* 2133 */                              ((RunnableC1901ls) dp0Var.f7359c).f13470i = null;
                                    }
                                } catch (CancellationException unused) {
/* 2123 */                          ((RunnableC1901ls) dp0Var.f7359c).cancel(false);
                                }
                                break;
                            } catch (ExecutionException e5) {
/* 2103 */                      RunnableC1901ls runnableC1901ls2 = (RunnableC1901ls) dp0Var.f7359c;
/* 2105 */                      Throwable cause2 = e5.getCause();
/* 2109 */                      C2260um c2260um2 = runnableC1901ls2.f19731b;
/* 2111 */                      if (c2260um2 != null) {
/* 2113 */                          c2260um2.m9041b(cause2);
                                }
                            }
/* 2127 */                  return;
                        case 5:
/* 1971 */                  AbstractC0350g abstractC0350g = (AbstractC0350g) dp0Var.f7359c;
/* 1973 */                  TextInputLayout textInputLayout = abstractC0350g.f4641a;
/* 1975 */                  SimpleDateFormat simpleDateFormat = abstractC0350g.f4642b;
/* 1977 */                  Context context = textInputLayout.getContext();
/* 2062 */                  textInputLayout.setError(context.getString(R$string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R$string.mtrl_picker_invalid_format_use), (String) dp0Var.f7358b) + "\n" + String.format(context.getString(R$string.mtrl_picker_invalid_format_example), simpleDateFormat.format(new Date(h13.m4085e().getTimeInMillis()))));
/* 2065 */                  abstractC0350g.mo2307a();
/* 2068 */                  return;
                        case 6:
/* 1819 */                  j60 j60Var = (j60) dp0Var.f7359c;
/* 1823 */                  ArrayList<h60> arrayList = (ArrayList) dp0Var.f7358b;
/* 1833 */                  for (h60 h60Var : arrayList) {
/* 1842 */                      ArrayList arrayList2 = j60Var.f12094r;
/* 1844 */                      long j = j60Var.f14099f;
/* 1846 */                      AbstractC0137o abstractC0137o = h60Var.f8912a;
/* 1852 */                      View view2 = abstractC0137o == null ? null : abstractC0137o.f1778a;
/* 1855 */                      AbstractC0137o abstractC0137o2 = h60Var.f8913b;
/* 1863 */                      View view3 = abstractC0137o2 != null ? abstractC0137o2.f1778a : null;
/* 1865 */                      if (view2 != null) {
/* 1871 */                          ViewPropertyAnimator duration = view2.animate().setDuration(j);
/* 1877 */                          arrayList2.add(h60Var.f8912a);
/* 1886 */                          duration.translationX(h60Var.f8916e - h60Var.f8914c);
/* 1895 */                          duration.translationY(h60Var.f8917f - h60Var.f8915d);
/* 1912 */                          duration.alpha(0.0f).setListener(new g60(j60Var, h60Var, duration, view2, 0)).start();
                                }
/* 1915 */                      if (view3 != null) {
/* 1917 */                          ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
/* 1923 */                          arrayList2.add(h60Var.f8913b);
/* 1955 */                          viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new g60(j60Var, h60Var, viewPropertyAnimatorAnimate, view3, 1)).start();
                                }
                            }
/* 1960 */                  arrayList.clear();
/* 1965 */                  j60Var.f12090n.remove(arrayList);
/* 1968 */                  return;
                        case 7:
/* 1798 */                  boolean zIsPopupShowing = ((AutoCompleteTextView) dp0Var.f7358b).isPopupShowing();
/* 1808 */                  za0 za0Var = (za0) ((wa0) dp0Var.f7359c).f18542b;
/* 1810 */                  za0Var.m10298i(zIsPopupShowing);
/* 1813 */                  za0Var.f20026l = zIsPopupShowing;
/* 1815 */                  return;
                        case 8:
/* 1176 */                  rd0 rd0Var = (rd0) dp0Var.f7359c;
/* 1178 */                  Context context2 = rd0Var.f15995a;
/* 1180 */                  String str4 = Build.PRODUCT;
/* 1182 */                  String str5 = Build.MANUFACTURER;
/* 1184 */                  String str6 = Build.BRAND;
/* 1186 */                  String str7 = Build.DEVICE;
/* 1188 */                  String str8 = Build.MODEL;
/* 1190 */                  String str9 = Build.HARDWARE;
/* 1364 */                  boolean z2 = Build.FINGERPRINT.startsWith("generic") || str8.contains("google_sdk") || str8.toLowerCase().contains("droid4x") || str8.contains("Emulator") || str8.contains("Android SDK built for x86") || str5.contains("Genymotion") || str9.equals("goldfish") || str9.equals("vbox86") || str4.equals("sdk") || str4.equals("google_sdk") || str4.equals("sdk_x86") || str4.contains("sdk_gphone64_arm64") || str4.equals("vbox86p") || Build.BOARD.toLowerCase().contains("nox") || Build.BOOTLOADER.toLowerCase().contains("nox") || str9.toLowerCase().contains("nox") || str4.toLowerCase().contains("nox") || Build.SERIAL.toLowerCase().contains("nox");
/* 1365 */                  if (z2) {
/* 1367 */                      zEquals = true;
                            } else {
/* 1385 */                      boolean z3 = (str6.startsWith("generic") && str7.startsWith("generic")) | z2;
/* 1386 */                      if (z3) {
/* 1367 */                          zEquals = true;
                                } else {
/* 1393 */                          zEquals = "google_sdk".equals(str4) | z3;
                                }
                            }
/* 1394 */                  if (!zEquals) {
/* 1398 */                      v00.checkSelfPermission(context2, "android.permission.READ_PHONE_STATE");
/* 1407 */                      if (rd0.m8134a(rd0.f15986c) || rd0.m8134a(rd0.f15987d) || rd0.m8134a(rd0.f15991h) || rd0.m8134a(rd0.f15992i)) {
/* 1729 */                          zEquals = true;
                                } else {
/* 1447 */                          File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
/* 1451 */                          int i5 = 0;
                                    while (true) {
/* 1455 */                              if (i5 < 2) {
/* 1457 */                                  File file = fileArr[i5];
/* 1463 */                                  if (file.exists() && file.canRead()) {
/* 1471 */                                      byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                                                try {
/* 1478 */                                          FileInputStream fileInputStreamM5164b = AbstractC1417a.m5164b(file, new FileInputStream(file));
/* 1482 */                                          fileInputStreamM5164b.read(bArr);
/* 1485 */                                          fileInputStreamM5164b.close();
                                                } catch (Exception e6) {
/* 1490 */                                          e6.printStackTrace();
                                                }
/* 1506 */                                      if (new String(bArr).contains(rd0.f15988e[0])) {
                                                }
                                                break;
                                            }
/* 1510 */                                  i5++;
                                        } else if (!rd0.m8134a(rd0.f15989f)) {
/* 1527 */                                  if (v00.checkSelfPermission(context2, "android.permission.INTERNET") == 0) {
/* 1531 */                                      String[] strArr = {"/system/bin/netcfg"};
/* 1537 */                                      StringBuilder sb = new StringBuilder();
                                                try {
/* 1542 */                                          ProcessBuilder processBuilder = new ProcessBuilder(strArr);
/* 1552 */                                          processBuilder.directory(new File("/system/bin/"));
/* 1555 */                                          processBuilder.redirectErrorStream(true);
/* 1562 */                                          InputStream inputStream = processBuilder.start().getInputStream();
/* 1566 */                                          byte[] bArr2 = new byte[Segment.SHARE_MINIMUM];
/* 1573 */                                          while (inputStream.read(bArr2) != -1) {
/* 1580 */                                              sb.append(new String(bArr2));
                                                    }
/* 1584 */                                          inputStream.close();
                                                    break;
                                                } catch (Exception unused2) {
                                                }
/* 1587 */                                      String string = sb.toString();
/* 1595 */                                      if (TextUtils.isEmpty(string)) {
/* 1646 */                                          ru1VarArr = rd0.f15993j;
/* 1650 */                                          i2 = 0;
/* 1653 */                                          for (i = 0; i < 14; i++) {
/* 1655 */                                              ru1 ru1Var = ru1VarArr[i];
/* 1657 */                                              String str10 = ru1Var.f16297a;
/* 1665 */                                              Class<?> clsLoadClass = context2.getClassLoader().loadClass("android.os.SystemProperties");
/* 1689 */                                              str = (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, str10);
/* 1693 */                                              str2 = ru1Var.f16298b;
/* 1695 */                                              if (str2 == null) {
/* 1699 */                                                  i2++;
                                                        }
/* 1701 */                                              if (str2 == null) {
                                                        }
                                                    }
/* 1715 */                                          if (i2 >= 5) {
                                                    }
/* 1726 */                                          zEquals = false;
                                                } else {
/* 1599 */                                          String[] strArrSplit = string.split("\n");
/* 1603 */                                          int length = strArrSplit.length;
/* 1604 */                                          int i6 = 0;
                                                    while (true) {
/* 1606 */                                              if (i6 < length) {
/* 1608 */                                                  String str11 = strArrSplit[i6];
/* 1616 */                                                  if ((!str11.contains("wlan0") && !str11.contains("tunl0") && !str11.contains("eth0")) || !str11.contains("10.0.2.15")) {
/* 1643 */                                                      i6++;
                                                            }
                                                        } else {
/* 1646 */                                                  ru1VarArr = rd0.f15993j;
/* 1650 */                                                  i2 = 0;
/* 1653 */                                                  while (i < 14) {
/* 1655 */                                                      ru1 ru1Var2 = ru1VarArr[i];
/* 1657 */                                                      String str12 = ru1Var2.f16297a;
                                                                try {
/* 1665 */                                                          Class<?> clsLoadClass2 = context2.getClassLoader().loadClass("android.os.SystemProperties");
/* 1689 */                                                          str = (String) clsLoadClass2.getMethod("get", String.class).invoke(clsLoadClass2, str12);
                                                                } catch (Exception unused3) {
/* 1692 */                                                          str = null;
                                                                }
/* 1693 */                                                      str2 = ru1Var2.f16298b;
/* 1695 */                                                      if (str2 == null && str != null) {
/* 1699 */                                                          i2++;
                                                                }
/* 1701 */                                                      if (str2 == null && str.contains(str2)) {
/* 1709 */                                                          i2++;
                                                                }
                                                                break;
                                                            }
/* 1715 */                                                  if (i2 >= 5 || !rd0.m8134a(rd0.f15990g)) {
/* 1726 */                                                      zEquals = false;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
/* 1646 */                                      ru1VarArr = rd0.f15993j;
/* 1650 */                                      i2 = 0;
/* 1653 */                                      while (i < 14) {
/* 1655 */                                          ru1 ru1Var3 = ru1VarArr[i];
/* 1657 */                                          String str13 = ru1Var3.f16297a;
/* 1665 */                                          Class<?> clsLoadClass3 = context2.getClassLoader().loadClass("android.os.SystemProperties");
/* 1689 */                                          str = (String) clsLoadClass3.getMethod("get", String.class).invoke(clsLoadClass3, str13);
/* 1693 */                                          str2 = ru1Var3.f16298b;
/* 1695 */                                          if (str2 == null) {
/* 1699 */                                              i2++;
                                                    }
/* 1701 */                                          if (str2 == null) {
                                                    }
                                                }
/* 1715 */                                      if (i2 >= 5) {
                                                }
/* 1726 */                                      zEquals = false;
                                            }
                                        }
/* 1729 */                              zEquals = true;
                                    }
                                }
                            }
/* 1730 */                  if (!zEquals) {
/* 1732 */                      ArrayList arrayList3 = rd0Var.f15996b;
/* 1738 */                      if (arrayList3.isEmpty()) {
/* 1740 */                          z = false;
                                } else {
/* 1743 */                          PackageManager packageManager = context2.getPackageManager();
/* 1747 */                          Iterator it = arrayList3.iterator();
                                    while (true) {
/* 1755 */                              if (it.hasNext()) {
/* 1763 */                                  Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) it.next());
/* 1767 */                                  if (launchIntentForPackage != null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
/* 1781 */                                      z = true;
                                            }
                                        } else {
/* 1740 */                                  z = false;
                                        }
                                    }
                                }
/* 1782 */                      zEquals = z;
                            }
/* 1791 */                  ((GameApp) ((d52) dp0Var.f7358b).f7001a).f5760d = zEquals;
/* 1793 */                  return;
                        case 9:
/* 1133 */                  xy1 xy1Var = (xy1) dp0Var.f7359c;
                            try {
/* 1139 */                      int iM10036a = xy1.m10036a(xy1Var, (JSONArray) dp0Var.f7358b, true);
/* 1145 */                      if (iM10036a < 200 || iM10036a >= 300) {
/* 1172 */                          return;
                                }
/* 1160 */                      ((er0) xy1Var.f19395c).m3578A(new JSONArray());
/* 1172 */                      return;
                            } catch (gt0 e7) {
/* 1169 */                      xe2.m9777o("analyticsMngr", "Error trying to sync failed events", e7);
/* 1172 */                      return;
                            }
                        case 10:
/* 1063 */                  String str14 = (String) dp0Var.f7358b;
/* 1067 */                  wc0 wc0Var = (wc0) dp0Var.f7359c;
/* 1073 */                  if (((ec0) wc0Var.f18577b) == null) {
/* 1130 */                      return;
                            }
/* 1097 */                  Object[] objArr = "missing user auth token".equals(str14) ? (char) 1 : "invalid user auth token".equals(str14) ? (char) 2 : (char) 3;
/* 1102 */                  ((ec0) wc0Var.f18577b).getClass();
/* 1109 */                  AbstractC1245n0.m4889q("HelpshiftTitan", "authenticationFailed");
/* 1112 */                  if (objArr == 1) {
/* 1125 */                      str3 = "REASON_AUTH_TOKEN_NOT_PROVIDED";
                            } else if (objArr == 2) {
/* 1122 */                      str3 = "REASON_INVALID_AUTH_TOKEN";
                            } else {
/* 1116 */                      if (objArr != 3) {
/* 1121 */                          throw null;
                                }
/* 1118 */                      str3 = "UNKNOWN";
                            }
/* 1127 */                  AbstractC1245n0.m4889q("HelpshiftTitan", str3);
/* 1130 */                  return;
                        case 11:
/* 1047 */                  xs0 xs0Var = (xs0) ((WeakReference) ((ra2) dp0Var.f7359c).f15955a).get();
/* 1049 */                  if (xs0Var != null) {
/* 1057 */                      xs0Var.f19348d.addView((WebView) dp0Var.f7358b);
/* 1060 */                      return;
                            }
/* 1060 */                  return;
                        case 12:
/* 1022 */                  HSWebView hSWebView = ((xs0) dp0Var.f7359c).f19345a;
/* 1024 */                  if (hSWebView == null) {
/* 1034 */                      return;
                            }
/* 1031 */                  hSWebView.evaluateJavascript((String) dp0Var.f7358b, null);
/* 1034 */                  return;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 980 */                   Object obj = ((ra2) dp0Var.f7359c).f15957c;
/* 988 */                   f62 f62Var = new f62((Runnable) dp0Var.f7358b, 1);
/* 999 */                   if (Looper.myLooper() == Looper.getMainLooper()) {
/* 1001 */                      f62Var.run();
/* 1017 */                      return;
                            } else {
/* 1014 */                      new Handler(Looper.getMainLooper()).post(f62Var);
/* 1017 */                      return;
                            }
                        case 14:
/* 928 */                   rs0 rs0Var = (rs0) dp0Var.f7358b;
/* 932 */                   if (!rs0Var.f16256a) {
/* 934 */                       C1969nm c1969nm = rs0Var.f16261f;
/* 955 */                       c1969nm.m7011n(Integer.valueOf(((Integer) c1969nm.m7008k(0, "push_unread_count")).intValue() + 1), "push_unread_count");
                            }
/* 972 */                   rs0Var.f16263h.m1253H((String) ((Map) dp0Var.f7359c).get("alert"), true);
/* 975 */                   return;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                            try {
/* 897 */                       HelpshiftTitan.f5803j = true;
/* 911 */                       hu0.m4306A0(GameApp.getInstance(), (String) dp0Var.f7358b, (HashMap) dp0Var.f7359c);
/* 923 */                       return;
                            } catch (Exception e8) {
/* 920 */                       AbstractC1245n0.m4877e("HelpshiftTitan", "HelpshiftTitan.showFAQSection", e8);
/* 923 */                       return;
                            }
                        case 16:
/* 819 */                   KeyboardDialog keyboardDialog = (KeyboardDialog) dp0Var.f7359c;
/* 825 */                   String fontPath = VirtualKeyboardHandler.getFontPath((String) dp0Var.f7358b);
/* 829 */                   if (fontPath == null || fontPath.trim().length() <= 0) {
/* 893 */                       AbstractC1245n0.m4889q("KeyboardDialog", "Failed to find path for font");
/* 896 */                       return;
                            }
/* 841 */                   GameApp gameApp = keyboardDialog.f5813a;
/* 843 */                   HashMap map = jl0.f12345a;
/* 849 */                   if (map.containsKey(fontPath)) {
/* 855 */                       typeface = (Typeface) map.get(fontPath);
                            } else {
/* 862 */                       Typeface typefaceCreateFromAsset = Typeface.createFromAsset(gameApp.getAssets(), fontPath);
/* 866 */                       map.put(fontPath, typefaceCreateFromAsset);
/* 869 */                       typeface = typefaceCreateFromAsset;
                            }
/* 870 */                   if (typeface != null) {
/* 881 */                       keyboardDialog.f5813a.runOnUiThread(new cp0(dp0Var, typeface, 15, null == true ? 1 : 0));
/* 896 */                       return;
                            } else {
/* 887 */                       AbstractC1245n0.m4889q("KeyboardDialog", "Failed to load font from");
/* 896 */                       return;
                            }
                        case 17:
/* 725 */                   LocationService locationService = (LocationService) dp0Var.f7359c;
/* 727 */                   LocationManager locationManager = locationService.f5822b;
                            try {
/* 731 */                       Location lastKnownLocation = locationManager.getLastKnownLocation("network");
/* 737 */                       Location lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
/* 747 */                       if (LocationService.m2734a(lastKnownLocation2, LocationService.f5820e)) {
/* 749 */                           LocationService.f5820e = lastKnownLocation2;
                                }
/* 757 */                       if (LocationService.m2734a(lastKnownLocation, LocationService.f5820e)) {
/* 759 */                           LocationService.f5820e = lastKnownLocation;
                                }
/* 761 */                       Location location = LocationService.f5820e;
/* 763 */                       if (location != null) {
/* 765 */                           location.toString();
/* 768 */                           locationService.onLocationChanged(location);
                                }
/* 776 */                       Criteria criteria = new Criteria();
/* 779 */                       criteria.setAccuracy(1);
/* 782 */                       String bestProvider = locationManager.getBestProvider(criteria, true);
/* 786 */                       if (bestProvider == null) {
/* 790 */                           AbstractC1245n0.m4889q("LocationService", "LocationService.startLocationTracking.run mProvider = null");
/* 814 */                           return;
                                } else {
/* 805 */                           locationService.f5822b.requestLocationUpdates(bestProvider, 1000L, 10.0f, (LocationService) dp0Var.f7358b);
/* 814 */                           return;
                                }
                            } catch (SecurityException e9) {
/* 811 */                       AbstractC1245n0.m4891s("LocationService", "Security Exception while starting tracking location", e9);
/* 814 */                       return;
                            }
                        case 18:
/* 717 */                   ((EditText) dp0Var.f7358b).removeTextChangedListener(((or1) ((C1978nv) dp0Var.f7359c).f14463b).f14869e);
/* 720 */                   return;
                        case 19:
/* 699 */                   ((C0890er) dp0Var.f7359c).m3553E((of0) dp0Var.f7358b, Unit.f12910a);
/* 702 */                   return;
                        case 20:
                            try {
/* 666 */                       dp0Var.m3170b();
/* 669 */                       return;
                            } catch (Error e10) {
                                synchronized (((x92) dp0Var.f7359c).f19000b) {
/* 682 */                           ((x92) dp0Var.f7359c).f19001c = 1;
/* 685 */                           throw e10;
                                }
                            }
                        case io.flutter.Build.API_LEVELS.API_21 /* 21 */:
/* 571 */                   ConnectionResult connectionResult = (ConnectionResult) dp0Var.f7358b;
/* 575 */                   u93 u93Var = (u93) dp0Var.f7359c;
/* 579 */                   InterfaceC0836d9 interfaceC0836d9 = (InterfaceC0836d9) u93Var.f17429b;
/* 595 */                   cb3 cb3Var = (cb3) ((ur0) u93Var.f17433f).f17691j.get((C2323w9) u93Var.f17430c);
/* 597 */                   if (cb3Var == null) {
/* 665 */                       return;
                            }
/* 602 */                   if (connectionResult.f3416b != 0) {
/* 662 */                       cb3Var.m1625p(connectionResult, null);
/* 665 */                       return;
                            }
/* 604 */                   u93Var.f17428a = true;
/* 610 */                   if (interfaceC0836d9.requiresSignIn()) {
/* 614 */                       if (!u93Var.f17428a || (iAccountAccessor = (IAccountAccessor) u93Var.f17431d) == null) {
/* 665 */                           return;
                                }
/* 626 */                       interfaceC0836d9.getRemoteService(iAccountAccessor, (Set) u93Var.f17432e);
/* 665 */                       return;
                            }
                            try {
/* 634 */                       interfaceC0836d9.getRemoteService(null, interfaceC0836d9.getScopesForConnectionlessNonSignIn());
/* 665 */                       return;
                            } catch (SecurityException e11) {
/* 643 */                       AbstractC1245n0.m4877e("GoogleApiManager", "Failed to get service from broker. ", e11);
/* 648 */                       interfaceC0836d9.disconnect("Failed to get service from broker.");
/* 658 */                       cb3Var.m1625p(new ConnectionResult(10, null, null), null);
/* 665 */                       return;
                            }
                        case io.flutter.Build.API_LEVELS.API_22 /* 22 */:
/* 426 */                   zact zactVar = (zact) dp0Var.f7359c;
/* 430 */                   zak zakVar = (zak) dp0Var.f7358b;
/* 432 */                   va3 va3Var = zact.f3452j;
/* 434 */                   ConnectionResult connectionResult2 = zakVar.f4277b;
/* 438 */                   if (connectionResult2.f3416b == 0) {
/* 440 */                       zav zavVar = zakVar.f4278c;
/* 442 */                       kb1.m6061n(zavVar);
/* 445 */                       ConnectionResult connectionResult3 = zavVar.f3532c;
/* 449 */                       if (connectionResult3.f3416b != 0) {
/* 544 */                           AbstractC1245n0.m4893u("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult3)), new Exception());
/* 549 */                           zactVar.f3459i.m8983A(connectionResult3);
/* 554 */                           zactVar.f3458f.disconnect();
/* 568 */                           return;
                                }
/* 451 */                       u93 u93Var2 = zactVar.f3459i;
/* 453 */                       IBinder iBinder = zavVar.f3531b;
/* 455 */                       if (iBinder == null) {
/* 457 */                           zztVar = null;
                                } else {
/* 459 */                           int i7 = IAccountAccessor.Stub.f3503a;
/* 463 */                           IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
/* 476 */                           zztVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                                }
/* 479 */                       Set set = zactVar.f3456d;
/* 481 */                       u93Var2.getClass();
/* 484 */                       if (zztVar == null || set == null) {
/* 514 */                           AbstractC1245n0.m4893u("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
/* 523 */                           u93Var2.m8983A(new ConnectionResult(4, null, null));
                                } else {
/* 489 */                           u93Var2.f17431d = zztVar;
/* 491 */                           u93Var2.f17432e = set;
/* 495 */                           if (u93Var2.f17428a) {
/* 501 */                               ((InterfaceC0836d9) u93Var2.f17429b).getRemoteService(zztVar, set);
                                    }
                                }
                            } else {
/* 560 */                       zactVar.f3459i.m8983A(connectionResult2);
                            }
/* 565 */                   zactVar.f3458f.disconnect();
/* 568 */                   return;
                        case io.flutter.Build.API_LEVELS.API_23 /* 23 */:
/* 400 */                   C0882ej c0882ej = (C0882ej) dp0Var.f7358b;
/* 404 */                   C2357x6 c2357x6 = (C2357x6) dp0Var.f7359c;
/* 406 */                   c0882ej.getClass();
/* 409 */                   C1833kj c1833kj = kf3.f12733k;
/* 413 */                   c0882ej.m3470x(24, 9, c1833kj);
/* 420 */                   c2357x6.m9714g(c1833kj, zzco.zzl());
/* 423 */                   return;
                        case 24:
/* 377 */                   C0882ej c0882ej2 = (C0882ej) dp0Var.f7358b;
/* 381 */                   C0800g c0800g = (C0800g) dp0Var.f7359c;
/* 383 */                   C1833kj c1833kj2 = kf3.f12733k;
/* 386 */                   c0882ej2.m3470x(24, 7, c1833kj2);
/* 394 */                   c0800g.m2753a(c1833kj2, new ArrayList());
/* 397 */                   return;
                        case io.flutter.Build.API_LEVELS.API_25 /* 25 */:
/* 358 */                   bh3 bh3Var = (bh3) dp0Var.f7358b;
/* 362 */                   sd3 sd3Var = (sd3) dp0Var.f7359c;
/* 364 */                   Activity activityM1361a = bh3Var.m1361a();
/* 368 */                   if (activityM1361a == null) {
/* 374 */                       return;
                            }
/* 371 */                   sd3Var.m8482a(activityM1361a);
/* 374 */                   return;
                        case io.flutter.Build.API_LEVELS.API_26 /* 26 */:
/* 352 */                   dp0Var.m3169a();
/* 355 */                   return;
                        case io.flutter.Build.API_LEVELS.API_27 /* 27 */:
/* 297 */                   gp3 gp3Var = (gp3) dp0Var.f7358b;
/* 301 */                   IBinder iBinder2 = (IBinder) dp0Var.f7359c;
                            synchronized (gp3Var) {
/* 304 */                       if (iBinder2 == null) {
/* 308 */                           gp3Var.m3983a("Null service connection");
                                } else {
                                    try {
/* 320 */                               gp3Var.f8771c = new we2(iBinder2);
/* 322 */                               gp3Var.f8769a = 2;
/* 335 */                               ((ScheduledExecutorService) gp3Var.f8774f.f17705c).execute(new fk3(gp3Var, i3));
                                    } catch (RemoteException e12) {
/* 345 */                               gp3Var.m3983a(e12.getMessage());
                                    }
                                }
                            }
/* 349 */                   return;
                        case io.flutter.Build.API_LEVELS.API_28 /* 28 */:
/* 168 */                   zzcu zzcuVar = (zzcu) dp0Var.f7358b;
/* 172 */                   sl3 sl3Var = (sl3) dp0Var.f7359c;
/* 176 */                   ij3 ij3Var = (ij3) sl3Var.f16749a;
/* 180 */                   ij3 ij3Var2 = (ij3) sl3Var.f16749a;
/* 182 */                   lo3 lo3Var = ij3Var.f9667v;
/* 184 */                   ij3.m4554k(lo3Var);
/* 189 */                   ij3 ij3Var3 = (ij3) lo3Var.f16749a;
/* 191 */                   ki3 ki3Var = ij3Var3.f9653e;
/* 193 */                   ij3.m4553j(ki3Var);
/* 206 */                   if (ki3Var.m6116G().m7189i(nk3.ANALYTICS_STORAGE)) {
/* 222 */                       ij3.m4553j(ki3Var);
/* 225 */                       C1268s c1268s = ki3Var.f12802b0;
/* 229 */                       ij3Var3.f9640V.getClass();
/* 240 */                       if (!ki3Var.m6119J(System.currentTimeMillis()) && c1268s.m4932a() != 0) {
/* 257 */                           lValueOf = Long.valueOf(c1268s.m4932a());
                                }
/* 261 */                       if (lValueOf == null) {
/* 263 */                           up3 up3Var = ij3Var2.f9668w;
/* 265 */                           ij3.m4553j(up3Var);
/* 272 */                           up3Var.m9106i0(zzcuVar, lValueOf.longValue());
/* 293 */                           return;
                                } else {
                                    try {
/* 276 */                               zzcuVar.zzb(null);
/* 293 */                               return;
                                    } catch (RemoteException e13) {
/* 281 */                               uh3 uh3Var = ij3Var2.f9655f;
/* 283 */                               ij3.m4555l(uh3Var);
/* 290 */                               uh3Var.f17538f.m8511b(e13, "getSessionId failed with exception");
/* 293 */                               return;
                                    }
                                }
                            }
/* 208 */                   uh3 uh3Var2 = ij3Var3.f9655f;
/* 210 */                   ij3.m4555l(uh3Var2);
/* 217 */                   uh3Var2.f17531V.m8510a("Analytics storage consent denied; will not get session id");
/* 220 */                   lValueOf = null;
/* 261 */                   if (lValueOf == null) {
/* 276 */                       zzcuVar.zzb(null);
/* 293 */                       return;
                            }
/* 263 */                   up3 up3Var2 = ij3Var2.f9668w;
/* 265 */                   ij3.m4553j(up3Var2);
/* 272 */                   up3Var2.m9106i0(zzcuVar, lValueOf.longValue());
/* 293 */                   return;
                        default:
/* 16 */                    sl3 sl3Var2 = (sl3) dp0Var.f7359c;
/* 20 */                    ij3 ij3Var4 = (ij3) sl3Var2.f16749a;
/* 22 */                    ki3 ki3Var2 = ij3Var4.f9653e;
/* 24 */                    uh3 uh3Var3 = ij3Var4.f9655f;
/* 26 */                    ij3.m4553j(ki3Var2);
/* 29 */                    ki3Var2.mo1375y();
/* 32 */                    ki3Var2.mo1375y();
/* 45 */                    ce3 ce3VarM1646b = ce3.m1646b(ki3Var2.m6113D().getString("dma_consent_settings", null));
/* 51 */                    ce3 ce3Var = (ce3) dp0Var.f7358b;
/* 53 */                    int i8 = ce3Var.f2866a;
/* 61 */                    if (!ok3.m7186l(i8, ce3VarM1646b.f2866a)) {
/* 151 */                       ij3.m4555l(uh3Var3);
/* 162 */                       uh3Var3.f17532W.m8511b(Integer.valueOf(i8), "Lower precedence consent source ignored, proposed source");
/* 165 */                       return;
                            }
/* 67 */                    SharedPreferences.Editor editorEdit = ki3Var2.m6113D().edit();
/* 73 */                    editorEdit.putString("dma_consent_settings", ce3Var.f2867b);
/* 76 */                    editorEdit.apply();
/* 79 */                    ij3.m4555l(uh3Var3);
/* 86 */                    uh3Var3.f17534Y.m8511b(ce3Var, "Setting DMA consent(FE)");
/* 91 */                    ij3 ij3Var5 = (ij3) sl3Var2.f16749a;
/* 101 */                   if (ij3Var5.m4567o().m7514J()) {
/* 103 */                       pn3 pn3VarM4567o = ij3Var5.m4567o();
/* 107 */                       pn3VarM4567o.mo1375y();
/* 110 */                       pn3VarM4567o.m9576A();
/* 118 */                       pn3VarM4567o.m7518N(new ln3(pn3VarM4567o, i4));
/* 165 */                       return;
                            }
/* 122 */                   pn3 pn3VarM4567o2 = ij3Var5.m4567o();
/* 126 */                   pn3VarM4567o2.mo1375y();
/* 129 */                   pn3VarM4567o2.m9576A();
/* 136 */                   if (pn3VarM4567o2.m7513I()) {
/* 147 */                       pn3VarM4567o2.m7518N(new um3(pn3VarM4567o2, pn3VarM4567o2.m7520P(false), 1));
/* 165 */                       return;
                            }
/* 165 */                   return;
                    }
                }

                public String toString() {
                    String str;
/* 1 */             int i = this.f7357a;
/* 3 */             Object obj = this.f7359c;
                    switch (i) {
                        case 0:
/* 111 */                   return dp0.class.getSimpleName() + "," + ((xo0) obj);
                        case 20:
/* 15 */                    Runnable runnable = (Runnable) this.f7358b;
/* 19 */                    if (runnable != null) {
/* 34 */                        return "SequentialExecutorWorker{running=" + runnable + "}";
                            }
/* 43 */                    StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
/* 48 */                    int i2 = ((x92) obj).f19001c;
/* 51 */                    if (i2 == 1) {
/* 74 */                        str = "IDLE";
                            } else if (i2 == 2) {
/* 71 */                        str = "QUEUING";
                            } else if (i2 != 3) {
/* 65 */                        str = i2 != 4 ? "null" : "RUNNING";
                            } else {
/* 68 */                        str = "QUEUED";
                            }
/* 76 */                    sb.append(str);
/* 79 */                    sb.append("}");
/* 82 */                    return sb.toString();
                        default:
/* 8 */                     return super.toString();
                    }
                }

/* 15 */        public /* synthetic */ dp0(Object obj, Object obj2, int i, boolean z) {
/* 16 */            this.f7357a = i;
                    this.f7359c = obj;
                    this.f7358b = obj2;
                }

/* 16 */        public /* synthetic */ dp0(int i, Object obj, Object obj2) {
/* 17 */            this.f7357a = i;
                    this.f7358b = obj;
                    this.f7359c = obj2;
                }

/* 17 */        public dp0(x92 x92Var) {
                    this.f7357a = 20;
                    this.f7359c = x92Var;
                }
            }
