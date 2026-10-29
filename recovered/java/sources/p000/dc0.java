            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ApplicationInfo;
            import android.media.CamcorderProfile;
            import android.os.Bundle;
            import android.webkit.WebView;
            import com.google.android.gms.cloudmessaging.CloudMessage;
            import com.google.android.gms.tasks.Continuation;
            import com.google.android.gms.tasks.Task;
            import com.google.firebase.components.ComponentRegistrar;
            import io.flutter.Build;
            import java.io.Closeable;
            import java.io.File;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Enumeration;
            import java.util.HashSet;
            import java.util.List;
            import java.util.concurrent.Executor;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import java.util.zip.ZipEntry;
            import java.util.zip.ZipFile;
            import kotlin.coroutines.InterfaceC1845f;
            import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
            import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
            import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
            import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
            import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
            import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class dc0 implements InterfaceC1845f, InterfaceC0934fy, e73, Continuation, dh1 {

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ int f7102d = 0;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7108a;

                /* JADX INFO: renamed from: b */
                public static final dc0 f7100b = new dc0(1);

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ dc0 f7101c = new dc0(2);

                /* JADX INFO: renamed from: e */
                public static final dc0 f7103e = new dc0(4);

                /* JADX INFO: renamed from: f */
                public static final dc0 f7104f = new dc0(5);

                /* JADX INFO: renamed from: i */
                public static final dc0 f7105i = new dc0(6);

                /* JADX INFO: renamed from: v */
                public static final dc0 f7106v = new dc0(7);

                /* JADX INFO: renamed from: w */
                public static final String[] f7107w = new String[0];

                /* JADX INFO: renamed from: U */
                public static final dc0 f7094U = new dc0(9);

                /* JADX INFO: renamed from: V */
                public static final dc0 f7095V = new dc0(10);

                /* JADX INFO: renamed from: W */
                public static final dc0 f7096W = new dc0(11);

                /* JADX INFO: renamed from: X */
                public static final dc0 f7097X = new dc0(12);

                /* JADX INFO: renamed from: Y */
                public static final /* synthetic */ dc0 f7098Y = new dc0(13);

                /* JADX INFO: renamed from: Z */
                public static final /* synthetic */ dc0 f7099Z = new dc0(14);

                public /* synthetic */ dc0(int i) {
/* 1 */             this.f7108a = i;
                }

                /* JADX INFO: renamed from: b */
                public static final Object m2985b(Object obj, String str, Object... objArr) {
/* 1 */             Class<?> cls = obj.getClass();
/* 6 */             Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
/* 20 */            return cls.getMethod(str, null).invoke(obj, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                }

                /* JADX INFO: renamed from: c */
                public static void m2986c(Closeable closeable) {
/* 1 */             if (closeable != null) {
                        try {
/* 3 */                     closeable.close();
                        } catch (IOException unused) {
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public static C0210cb m2987e(Context context, String[] strArr, String str, ra2 ra2Var) {
/* 1 */             String[] strArrM2989l = m2989l(context);
/* 5 */             int length = strArrM2989l.length;
/* 6 */             boolean z = false;
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 ZipFile zipFile = null;
/* 9 */                 if (i >= length) {
/* 8 */                     return null;
                        }
/* 11 */                String str2 = strArrM2989l[i];
/* 13 */                int i2 = 0;
                        while (true) {
/* 14 */                    int i3 = i2 + 1;
/* 17 */                    if (i2 >= 5) {
                                break;
                            }
                            try {
/* 27 */                        zipFile = new ZipFile(new File(str2), 1);
                                break;
                            } catch (IOException unused) {
/* 32 */                        i2 = i3;
                            }
                        }
/* 34 */                if (zipFile != null) {
/* 37 */                    int i4 = 0;
                            while (true) {
/* 38 */                        int i5 = i4 + 1;
/* 40 */                        if (i4 < 5) {
/* 44 */                            for (String str3 : strArr) {
/* 52 */                                StringBuilder sb = new StringBuilder("lib");
/* 55 */                                char c = File.separatorChar;
/* 57 */                                sb.append(c);
/* 60 */                                sb.append(str3);
/* 63 */                                sb.append(c);
/* 66 */                                sb.append(str);
/* 69 */                                String string = sb.toString();
/* 79 */                                ra2Var.m8113r("Looking for %s in APK %s...", string, str2);
/* 82 */                                ZipEntry entry = zipFile.getEntry(string);
/* 86 */                                if (entry != null) {
/* 91 */                                    C0210cb c0210cb = new C0210cb(3, z);
/* 94 */                                    c0210cb.f2804b = zipFile;
/* 96 */                                    c0210cb.f2805c = entry;
/* 98 */                                    return c0210cb;
                                        }
                                    }
/* 102 */                           i4 = i5;
                                } else {
                                    try {
/* 104 */                               zipFile.close();
                                        break;
                                    } catch (IOException unused2) {
                                    }
                                }
                            }
                        }
/* 107 */               i++;
                    }
                }

                /* JADX INFO: renamed from: i */
                public static String[] m2988i(Context context, String str) {
/* 5 */             StringBuilder sb = new StringBuilder("lib");
/* 8 */             char c = File.separatorChar;
/* 10 */            sb.append(c);
/* 15 */            sb.append("([^\\");
/* 18 */            sb.append(c);
/* 23 */            sb.append("]*)");
/* 26 */            sb.append(c);
/* 29 */            sb.append(str);
/* 36 */            Pattern patternCompile = Pattern.compile(sb.toString());
/* 42 */            HashSet hashSet = new HashSet();
/* 51 */            for (String str2 : m2989l(context)) {
                        try {
/* 66 */                    Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
/* 74 */                    while (enumerationEntries.hasMoreElements()) {
/* 86 */                        Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
/* 94 */                        if (matcher.matches()) {
/* 100 */                           hashSet.add(matcher.group(1));
                                }
                            }
                        } catch (IOException unused) {
                        }
                    }
/* 117 */           return (String[]) hashSet.toArray(new String[hashSet.size()]);
                }

                /* JADX INFO: renamed from: l */
                public static String[] m2989l(Context context) {
/* 1 */             ApplicationInfo applicationInfo = context.getApplicationInfo();
/* 5 */             String[] strArr = applicationInfo.splitSourceDirs;
/* 7 */             if (strArr == null || strArr.length == 0) {
/* 29 */                return new String[]{applicationInfo.sourceDir};
                    }
/* 15 */            String[] strArr2 = new String[strArr.length + 1];
/* 20 */            strArr2[0] = applicationInfo.sourceDir;
/* 23 */            System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
/* 26 */            return strArr2;
                }

                @Override // p000.e73
                /* JADX INFO: renamed from: a */
                public String[] mo2990a() {
/* 1 */             return f7107w;
                }

                @Override // p000.InterfaceC0934fy
                public Object create(InterfaceC0824cy interfaceC0824cy) {
                    switch (this.f7108a) {
                        case 4:
/* 89 */                    Object objMo1261e = ((C0168b5) interfaceC0824cy).mo1261e(new f02(InterfaceC1027ih.class, Executor.class));
/* 93 */                    objMo1261e.getClass();
/* 100 */                   return new of0((Executor) objMo1261e);
                        case 5:
/* 65 */                    Object objMo1261e2 = ((C0168b5) interfaceC0824cy).mo1261e(new f02(l71.class, Executor.class));
/* 69 */                    objMo1261e2.getClass();
/* 76 */                    return new of0((Executor) objMo1261e2);
                        case 6:
/* 41 */                    Object objMo1261e3 = ((C0168b5) interfaceC0824cy).mo1261e(new f02(InterfaceC2296vj.class, Executor.class));
/* 45 */                    objMo1261e3.getClass();
/* 52 */                    return new of0((Executor) objMo1261e3);
                        default:
/* 17 */                    Object objMo1261e4 = ((C0168b5) interfaceC0824cy).mo1261e(new f02(gx2.class, Executor.class));
/* 21 */                    objMo1261e4.getClass();
/* 28 */                    return new of0((Executor) objMo1261e4);
                    }
                }

                @Override // p000.e73
                public WebViewProviderBoundaryInterface createWebView(WebView webView) {
/* 8 */             throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
                }

                @Override // p000.dh1
                /* JADX INFO: renamed from: d */
                public void mo2938d(jg1 jg1Var, boolean z) {
                }

                /* JADX INFO: renamed from: f */
                public boolean mo2991f() {
/* 1 */             return this instanceof pc1;
                }

                /* JADX INFO: renamed from: g */
                public CamcorderProfile m2992g(int i, int i2) {
                    switch (this.f7108a) {
                        case Build.API_LEVELS.API_23 /* 23 */:
                            break;
                    }
/* 6 */             return CamcorderProfile.get(i, i2);
                }

                @Override // p000.e73
                public DropDataContentProviderBoundaryInterface getDropDataProvider() {
/* 8 */             throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
                }

                @Override // p000.e73
                public ProxyControllerBoundaryInterface getProxyController() {
/* 8 */             throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
                }

                @Override // p000.e73
                public StaticsBoundaryInterface getStatics() {
/* 8 */             throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
                }

                @Override // p000.e73
                public TracingControllerBoundaryInterface getTracingController() {
/* 8 */             throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
                }

                @Override // p000.e73
                public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
/* 8 */             throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
                }

                /* JADX INFO: renamed from: h */
                public void mo2993h(float f, float f2, float f3, dd2 dd2Var) {
/* 2 */             dd2Var.m3008d(f, 0.0f);
                }

                /* JADX INFO: renamed from: j */
                public boolean m2994j(int i, int i2) {
                    switch (this.f7108a) {
                        case Build.API_LEVELS.API_23 /* 23 */:
                            break;
                    }
/* 6 */             return CamcorderProfile.hasProfile(i, i2);
                }

                /* JADX INFO: renamed from: k */
                public List m2995k(ComponentRegistrar componentRegistrar) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 18 */            for (C2197sx c2197sx : componentRegistrar.getComponents()) {
/* 26 */                String str = c2197sx.f16831a;
/* 28 */                if (str != null) {
/* 48 */                    c2197sx = new C2197sx(str, c2197sx.f16832b, c2197sx.f16833c, c2197sx.f16834d, c2197sx.f16835e, new C2076pn(2, str, c2197sx), c2197sx.f16837g);
                        }
/* 52 */                arrayList.add(c2197sx);
                    }
/* 56 */            return arrayList;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public Object then(Task task) {
/* 13 */            Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
/* 15 */            if (intent != null) {
/* 19 */                return new CloudMessage(intent);
                    }
/* 23 */            return null;
                }

                @Override // p000.dh1
                /* JADX INFO: renamed from: z */
                public boolean mo2942z(jg1 jg1Var) {
/* 1 */             return false;
                }
            }
