            package io.sentry;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import android.os.SystemClock;
            import androidx.core.app.FrameMetricsAggregator;
            import com.google.android.gms.internal.play_billing.zzhr;
            import com.google.android.recaptcha.internal.zzdm;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1198i1;
            import io.sentry.android.core.C1195h1;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.clientreport.C1413c;
            import io.sentry.clientreport.EnumC1414d;
            import io.sentry.protocol.C1626w;
            import io.sentry.transport.InterfaceC1680f;
            import io.sentry.util.C1702a;
            import io.sentry.util.InterfaceC1707f;
            import java.util.Collections;
            import java.util.Timer;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicLong;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: io.sentry.u2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C1697u2 implements InterfaceC1707f, InterfaceC1761z3, InterfaceC1680f, InterfaceC1537l4, InterfaceC1427d4 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11719a;

                public /* synthetic */ C1697u2(int i) {
/* 1 */             this.f11719a = i;
                }

                /* JADX INFO: renamed from: g */
                public static /* synthetic */ void m5431g() {
/* 6 */             throw new ClassCastException();
                }

                /* JADX INFO: renamed from: h */
                public static /* synthetic */ void m5432h(int i, int i2) {
/* 23 */            throw new IllegalArgumentException("Length too large: " + i + i2);
                }

                /* JADX INFO: renamed from: i */
                public static /* synthetic */ void m5433i(int i, int i2, Throwable th) throws zzdm {
/* 6 */             throw new zzdm(i, i2, th);
                }

                /* JADX INFO: renamed from: j */
                public static /* synthetic */ void m5434j(int i, Object obj, Object obj2, Object obj3) {
/* 3 */             StringBuilder sb = new StringBuilder(i);
/* 6 */             sb.append(obj);
/* 9 */             sb.append(obj2);
/* 12 */            sb.append(obj3);
/* 24 */            throw new IllegalStateException(sb.toString());
                }

                /* JADX INFO: renamed from: k */
                public static /* synthetic */ void m5435k(Object obj, String str, Object obj2) {
/* 21 */            throw new IllegalArgumentException(str + obj + obj2);
                }

                /* JADX INFO: renamed from: l */
                public static /* synthetic */ void m5436l(String str) throws zzhr {
/* 6 */             throw new zzhr(str);
                }

                /* JADX INFO: renamed from: m */
                public static /* synthetic */ void m5437m(String str, Object[] objArr) {
/* 10 */            throw new IllegalArgumentException(String.format(str, objArr));
                }

                /* JADX INFO: renamed from: n */
                public static /* synthetic */ void m5438n(StringBuilder sb, Object obj) {
/* 1 */             sb.append(obj);
/* 13 */            throw new RuntimeException(sb.toString());
                }

                /* JADX INFO: renamed from: o */
                public static /* synthetic */ void m5439o(Throwable th) {
/* 6 */             throw new IllegalStateException(th);
                }

                /* JADX INFO: renamed from: p */
                public static /* synthetic */ void m5440p(String str, Object[] objArr) {
/* 10 */            throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
                }

                @Override // io.sentry.InterfaceC1761z3
                /* JADX INFO: renamed from: a */
                public void mo5441a(C1764z6 c1764z6) {
                }

                @Override // io.sentry.util.InterfaceC1707f
                /* JADX INFO: renamed from: b */
                public Object mo4803b() {
                    switch (this.f11719a) {
                        case 0:
/* 106 */                   return C1554m6.empty();
                        case 1:
/* 101 */                   return C1554m6.empty();
                        case 5:
/* 97 */                    return new C1582p4();
                        case 8:
/* 91 */                    return new FrameMetricsAggregator();
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                            try {
/* 82 */                        return Build.MODEL.split(" ", -1)[0];
                            } catch (Throwable unused) {
/* 85 */                        EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 87 */                        return null;
                            }
                        case 16:
/* 69 */                    return new Timer(true);
                        default:
/* 9 */                     ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
/* 18 */                    for (EnumC1414d enumC1414d : EnumC1414d.values()) {
/* 28 */                        for (EnumC1560n enumC1560n : EnumC1560n.values()) {
/* 52 */                            concurrentHashMap.put(new C1413c(enumC1414d.getReason(), enumC1560n.getCategory()), new AtomicLong(0L));
                                }
                            }
/* 61 */                    return Collections.unmodifiableMap(concurrentHashMap);
                    }
                }

                @Override // io.sentry.transport.InterfaceC1680f
                /* JADX INFO: renamed from: c */
                public long mo4838c() {
/* 1 */             return SystemClock.uptimeMillis();
                }

                @Override // io.sentry.InterfaceC1537l4
                /* JADX INFO: renamed from: d */
                public void mo3668d(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             C1702a c1702a = AbstractC1198i1.f10068b;
                }

                @Override // io.sentry.InterfaceC1427d4
                /* JADX INFO: renamed from: e */
                public void mo4804e(InterfaceC1156a1 interfaceC1156a1) {
                    switch (this.f11719a) {
                        case 20:
/* 17 */                    interfaceC1156a1.getClass();
/* 22 */                    interfaceC1156a1.mo4698k(C1626w.f11478b);
                            break;
                        default:
/* 13 */                    interfaceC1156a1.mo4681E(new C1195h1(interfaceC1156a1, 9));
                            break;
                    }
                }

                /* JADX INFO: renamed from: f */
                public Object m5442f(Context context) {
/* 3 */             String string = null;
                    switch (this.f11719a) {
                        case 10:
                            try {
/* 1 */                         return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                            } catch (Throwable unused) {
/* 3 */                         return null;
                            }
                        case 11:
                            try {
/* 83 */                        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            } catch (Throwable unused2) {
/* 3 */                         return null;
                            }
                        case 12:
                            try {
/* 39 */                        ApplicationInfo applicationInfo = context.getApplicationInfo();
/* 43 */                        int i = applicationInfo.labelRes;
/* 45 */                        if (i == 0) {
/* 47 */                            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
/* 64 */                            string = charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                                } else {
/* 69 */                            string = context.getString(i);
                                }
                                break;
                            } catch (Throwable unused3) {
                            }
/* 73 */                    return string;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                            try {
/* 1 */                         return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
                            } catch (Throwable unused4) {
/* 3 */                         return null;
                            }
                        default:
                            try {
/* 17 */                        return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                            } catch (Throwable unused5) {
/* 3 */                         return null;
                            }
                    }
                }
            }
